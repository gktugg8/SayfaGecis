package com.example.sayfagecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecis.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var gecis:FragmentAnaSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
           gecis = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        gecis.buttonAgit.setOnClickListener {

           Navigation.findNavController(it).navigate(R.id.aSayfasinaGecis)
        }

        gecis.buttonXgit.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.xSayfasinaGecis)

        }


        return gecis.root
    }
}