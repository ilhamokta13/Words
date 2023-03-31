package com.example.words

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.words.databinding.FragmentAlphabetBinding
import com.example.words.databinding.FragmentKalimatBinding

class AlphabetFragment: Fragment() {
    lateinit var binding: FragmentAlphabetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentAlphabetBinding.inflate(layoutInflater,container,false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listLetter = arrayListOf(
            DataList("A"),
            DataList("B"),
            DataList("C"),
            DataList("D"),
            DataList("E"),
            DataList("F"),
            DataList("G"),
            DataList("H"),
            DataList("I"),
            DataList("J"),
            DataList("K"),
        )
        val alphabetadapter = AlphabetAdapter(listLetter)
        val Manager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewLetter.layoutManager = Manager
        binding.recyclerViewLetter.adapter= alphabetadapter
        alphabetadapter.onClick = {
            var bundle = Bundle()
            bundle.putString("key", it.key)
            Navigation.findNavController(view).navigate(R.id.action_alphabetFragment_to_kalimatFragment,bundle)
        }
    }






}