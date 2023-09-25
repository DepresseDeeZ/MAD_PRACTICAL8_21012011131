package com.example.mad_practical8_21012011131

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class AlarmService : Service() {
    lateinit var mediaPlayer: MediaPlayer;
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")

    }
    override fun onDestroy() {
        mediaPlayer.stop()

        super.onDestroy()


    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if(intent!=null)
        {
        mediaPlayer = MediaPlayer.create(this,R.raw.alarm_song)
        }
        mediaPlayer.start()
        return START_STICKY
    }
}