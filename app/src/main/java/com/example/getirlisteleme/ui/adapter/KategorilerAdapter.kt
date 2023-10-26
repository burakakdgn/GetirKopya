package com.example.getirlisteleme.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.getirlisteleme.data.entity.Kategoriler
import com.example.getirlisteleme.databinding.CardTasarimBinding
import com.example.getirlisteleme.databinding.FragmentAnasayfaBinding
import com.example.getirlisteleme.ui.fragment.AnasayfaFragmentDirections

class KategorilerAdapter(var mContext:Context,var kategorilerListesi:List<Kategoriler>)
    : RecyclerView.Adapter<KategorilerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }
    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kategori = kategorilerListesi.get(position)
        val t = holder.tasarim

        t.imageViewKategori.setImageResource(
            mContext.resources.getIdentifier(kategori.resim, "drawable",mContext.packageName))
        t.tvKategori.text = "${kategori.ad}"

        t.imageViewKategori.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(kategori = kategori)
            Navigation.findNavController(it).navigate(gecis)
        }


    }

    override fun getItemCount(): Int {
        return kategorilerListesi.size
    }
}