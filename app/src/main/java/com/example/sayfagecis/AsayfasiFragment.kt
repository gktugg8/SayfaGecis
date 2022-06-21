package com.example.sayfagecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecis.databinding.FragmentAsayfasiBinding


class AsayfasiFragment : Fragment() {
    private lateinit var gecis:FragmentAsayfasiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        gecis = FragmentAsayfasiBinding.inflate(inflater, container, false)

        gecis.buttonBgit.setOnClickListener {
        Navigation.findNavController(it).navigate(R.id.bSayfasinaGecis)
        }

        return gecis.root
    }

}