package com.example.wheatherapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wheatherapp.dataClasses.Hourly_Weather_Data
import com.example.wheatherapp.databinding.HourlyWeatherBinding

class HourlyWeather_Adapter(var hourlyWeathers:MutableList<Hourly_Weather_Data>):RecyclerView.Adapter<HourlyWeather_Adapter.HourlyWeatherHolder>(){
    class HourlyWeatherHolder(binding: HourlyWeatherBinding) : RecyclerView.ViewHolder(binding.root) {
        var hourly_img = binding.hourlyImg
        var hourly_degree = binding.hourlyDegree
        var hourly_time = binding.hourlyTime
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyWeatherHolder {
        return HourlyWeatherHolder(HourlyWeatherBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: HourlyWeatherHolder, position: Int) {
        var hourlyWeather = hourlyWeathers[position]
        holder.hourly_img.setImageResource(hourlyWeather.hourly_img)
        holder.hourly_degree.text = hourlyWeather.hourly_weather
        holder.hourly_time.text = hourlyWeather.hourly_time
    }

    override fun getItemCount(): Int {
        return hourlyWeathers.size
    }
}