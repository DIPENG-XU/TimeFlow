package com.aseane.timeflow

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.aseane.timeflow.viewmodel.MainViewModel

class TimeBroadcast(private val viewModel: MainViewModel) : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent) {
        viewModel.updateTime()
    }
}