package com.example.getirlisteleme.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirlisteleme.R
import com.example.getirlisteleme.data.entity.Kategoriler
import com.example.getirlisteleme.databinding.FragmentAnasayfaBinding
import com.example.getirlisteleme.ui.adapter.KategorilerAdapter

class AnasayfaFragment : Fragment() {

private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.kategoriRv.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        val kategorilerListesi = ArrayList<Kategoriler>()
        val k1 = Kategoriler(1,"Kişisel Bakım","bakim")
        val k2 = Kategoriler(2,"Atıştırmalık","cips")
        val k3 = Kategoriler(3,"Dondurma","dondurma")
        val k4 = Kategoriler(4,"Ev Bakım","ev")
        val k5 = Kategoriler(5,"Evcil Hayvan","evcil")
        val k6 = Kategoriler(6,"Fırından","firindan")
        val k7 = Kategoriler(7,"Kahvaltılık","kahvalti")
        val k8 = Kategoriler(8,"Meyve & Sebze","meyve_sebze")
        val k9 = Kategoriler(9,"Su & İçeçek","su")
        val k10 = Kategoriler(10,"Teknoloji","teknoloji")
        val k11 = Kategoriler(11,"Temel Gıda","temel_gida")
        val k12 = Kategoriler(12,"Yiyecek","yiyecek")

        kategorilerListesi.add(k1)
        kategorilerListesi.add(k2)
        kategorilerListesi.add(k3)
        kategorilerListesi.add(k4)
        kategorilerListesi.add(k5)
        kategorilerListesi.add(k6)
        kategorilerListesi.add(k7)
        kategorilerListesi.add(k8)
        kategorilerListesi.add(k9)
        kategorilerListesi.add(k10)
        kategorilerListesi.add(k11)
        kategorilerListesi.add(k12)

        val kategorilerAdapter = KategorilerAdapter(requireContext(),kategorilerListesi)

        binding.kategoriRv.adapter = kategorilerAdapter

        return binding.root
    }
}