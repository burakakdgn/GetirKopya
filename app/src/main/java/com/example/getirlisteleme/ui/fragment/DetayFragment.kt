package com.example.getirlisteleme.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.getirlisteleme.R
import com.example.getirlisteleme.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        // veriyi alıyoruz
        val bundle: DetayFragmentArgs by navArgs()
        val kategori = bundle.kategori

        // binding.toolbarDetay.title = kategori.ad

        binding.imageViewDetay.setImageResource(
            resources.getIdentifier(kategori.resim, "drawable",requireContext().packageName))

        binding.tvDetay.text = "${kategori.ad}"




        return binding.root

    }
}