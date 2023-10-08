package com.example.wheatherapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wheatherapp.R
import com.example.wheatherapp.adapters.DailyWeather_Adapter
import com.example.wheatherapp.adapters.HourlyWeather_Adapter
import com.example.wheatherapp.dataClasses.Daily_Weather_Data
import com.example.wheatherapp.dataClasses.Hourly_Weather_Data
import com.example.wheatherapp.databinding.DailyWeatherBinding
import com.example.wheatherapp.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentHomeBinding

    private lateinit var daily_adapterr: DailyWeather_Adapter
    private lateinit var hourly_adapter: HourlyWeather_Adapter

    private lateinit var dailies: MutableList<Daily_Weather_Data>
    private lateinit var hourlies: MutableList<Hourly_Weather_Data>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)


        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}