package com.example.wheatherapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wheatherapp.dataClasses.Daily_Weather_Data
import com.example.wheatherapp.databinding.DailyWeatherBinding

class DailyWeather_Adapter(var dailyWeathers: MutableList<Daily_Weather_Data>):RecyclerView.Adapter<DailyWeather_Adapter.DailyWeatherHolder>() {
    class DailyWeatherHolder(binding: DailyWeatherBinding):RecyclerView.ViewHolder(binding.root) {
        var daily_img = binding.dailyImg
        var daily_dayN= binding.dayName
        var daily_dayWN= binding.dayWeatherName
        var daily_degree = binding.dayDegree
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyWeatherHolder {
        return DailyWeatherHolder(DailyWeatherBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: DailyWeatherHolder, position: Int) {
        var dailyWeather = dailyWeathers[position]
        holder.daily_dayN.text = dailyWeather.dailyWeather_weekDayName
        holder.daily_dayWN.text = dailyWeather.dailyWeather_name
        holder.daily_degree.text = dailyWeather.dailyWeather_degree
        holder.daily_img.setImageResource(dailyWeather.dailyWeather_img)
    }

    override fun getItemCount(): Int {
        return dailyWeathers.size
    }
}