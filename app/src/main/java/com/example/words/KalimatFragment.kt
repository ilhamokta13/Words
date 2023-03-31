package com.example.words

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.words.databinding.FragmentKalimatBinding

class KalimatFragment : Fragment() {
    lateinit var binding: FragmentKalimatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentKalimatBinding.inflate(layoutInflater,container,false)
        return (binding.root)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getKey = arguments?.getString("key")
        when(getKey) {
            "A" -> {
                var word = arrayListOf(
                    ListKalimat("Alpha"),
                    ListKalimat("Anggur"),
                    ListKalimat("Adzan")
                )

                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "B" -> {
                var word = arrayListOf(
                    ListKalimat("Binar"),
                    ListKalimat("Badak"),
                    ListKalimat("Bulan")
                )
                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "C" -> {
                var word = arrayListOf(
                    ListKalimat("Cantik"),
                    ListKalimat("Cina"),
                    ListKalimat("Cat")
                )
                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "D" -> {
                var word = arrayListOf(
                    ListKalimat("Delman"),
                    ListKalimat("Delta"),
                    ListKalimat("Dokter")
                )
                val adapterKata = WordAdapter(word)
               binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "E" -> {
                var word = arrayListOf(
                    ListKalimat("Elok"),
                    ListKalimat("Eyang"),
                    ListKalimat("Eror")
                )
                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "F" -> {
                var word = arrayListOf(
                    ListKalimat("Frame"),
                    ListKalimat("Function"),
                    ListKalimat("Forkopimda")
                )
                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "G" -> {
                var word = arrayListOf(
                    ListKalimat("Gajah"),
                    ListKalimat("Gubuk"),
                    ListKalimat("Github")
                )
                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "H" -> {
                var word = arrayListOf(
                    ListKalimat("Hilir"),
                    ListKalimat("Hijau"),
                    ListKalimat("Hutan")
                )
                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "I" -> {
                var word = arrayListOf(
                    ListKalimat("Itik"),
                    ListKalimat("Interaksi"),
                    ListKalimat("Imsak")
                )
                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "J" -> {
                var word = arrayListOf(
                    ListKalimat("Jartel"),
                    ListKalimat("Jus"),
                    ListKalimat("Janji")
                )
                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter= adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
            "K" -> {
                var word = arrayListOf(
                    ListKalimat("Kalimat"),
                    ListKalimat("Kubah"),
                    ListKalimat("Kura-Kura")
                )
                val adapterKata = WordAdapter(word)
                binding.recyclerView.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.kalimat)
                }
            }
        }

        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.layoutManager = layoutManager
    }

}