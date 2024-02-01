package com.example.image_search

import android.content.Context

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.image_search.adapters.RVAdapter
import com.example.image_search.data.Const
import com.example.image_search.data.Document
import com.example.image_search.data.SearchRespone
import com.example.image_search.data.dataListener
import com.example.image_search.databinding.FragmentImageSearchBinding
import com.example.image_search.retrofit.NetWorkClient
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class ImageSearch : Fragment() {
    private lateinit var dataPassListener : dataListener
    private var _binding : FragmentImageSearchBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter : RVAdapter
    private val dataList = mutableListOf<Document>()

    override fun onAttach(context: Context) {
        super.onAttach(context)
//        if (context is dataListener) {
//            dataPassListener = context
//        } else {
//            throw RuntimeException("$context must implement DataPassListener")
//        }
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentImageSearchBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadSearchKey()

        binding.btnSearch.setOnClickListener {
            val searchKey = binding.etSearch.text.toString()

            goSearch(searchKey)
            hideKeyBoard()

            saveSearchKey(searchKey)
        }

        adapter = RVAdapter(dataList)
        binding.rvSearchResult.adapter = adapter

        binding.rvSearchResult.layoutManager = GridLayoutManager(context,2)

        adapter.likeClickListener = object : RVAdapter.LikeClick{
            override fun onLikeClicked(data: Document) {
 //               Toast.makeText(requireContext(),"${data}",Toast.LENGTH_SHORT).show()
                setFragmentResult(Const.REQUEST_KEY ,
                    bundleOf(Const.FAVORITE_DATA to data))

//                val sharedPrefer = requireActivity().getSharedPreferences("${Const.myBox_Key}", Context.MODE_PRIVATE)
//                val editor = sharedPrefer.edit()
//                editor.putString("URL" , data.thumbnail_url)
//                editor.putString("Date",data.datetime)
//                editor.putString("siteName",data.collection)
//                editor.apply()
            }

        }



//        adapter.itemClick = object : RVAdapter.ItemClick {
//            override fun onClick(position: Int) {
//                dataList[position].isLiked = true
//                Log.d("로그디","data변경 됐나")
//                adapter.notifyItemChanged(position)
//            }
//
//        }
    }
    fun saveSearchKey(searchKey: String) {
        val spf = requireActivity().getSharedPreferences("searchKey", Context.MODE_PRIVATE)
        val editor = spf.edit()
        editor.putString("searchKey", searchKey)
        editor.apply()
    }

    fun loadSearchKey(){
        val spf = requireActivity().getSharedPreferences("searchKey", Context.MODE_PRIVATE)
        val savedSearchKey = spf.getString("searchKey", "")
        binding.etSearch.setText(savedSearchKey)
    }


    fun goSearch(searchKey : String) = lifecycleScope.launch() {
        NetWorkClient.api.searchResult(query = searchKey).enqueue(object : Callback<SearchRespone>{
                override fun onResponse(call: Call<SearchRespone>, response: Response<SearchRespone>) {
                    val searchRespone = response.body()

                    searchRespone?.let {
//                        dataList.removeAll(it.documents)
//                        adapter.notifyDataSetChanged()
                        dataList.addAll(it.documents)
                    }
                    adapter.notifyDataSetChanged()

                }

            override fun onFailure(call: Call<SearchRespone>, t: Throwable) {
            }
        })
    }

    private fun hideKeyBoard() {
        val imm = requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(requireActivity().currentFocus?.windowToken, 0)
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}