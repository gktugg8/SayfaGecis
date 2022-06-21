package com.example.sayfagecis

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sayfagecis.databinding.FragmentXsayfasiBinding


class XsayfasiFragment : Fragment() {

    private lateinit var gecis:FragmentXsayfasiBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        gecis = FragmentXsayfasiBinding.inflate(inflater, container, false)

        gecis.buttonYgit.setOnClickListener {
         Navigation.findNavController(it).navigate(R.id.ySayfasinaGecis)
        }
        return gecis.root
    }

}