package com.example.image_search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.image_search.adapters.LikeAdapter
import com.example.image_search.data.Document
import com.example.image_search.databinding.FragmentMyBoxBinding


class MyBox : Fragment() {

    private var _binding : FragmentMyBoxBinding? = null
    private val binding get() = _binding!!
    val likeList = mutableListOf<Document>()
    private lateinit var adapter: LikeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        _binding = FragmentMyBoxBinding.inflate(inflater,container,false)

        arguments?.getParcelableArrayList<Document>("likeList")?.let {
            likeList.addAll(it)
        }
        adapter = LikeAdapter(likeList)
        binding.rvMyBox.adapter = adapter
        binding.rvMyBox.layoutManager = GridLayoutManager(context,2)

        adapter.cancel = object : LikeAdapter.cancelClick {
            override fun cancleClick(position: Int) {
                likeList.removeAt(position)
                adapter.notifyItemRemoved(position)
            }

        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
