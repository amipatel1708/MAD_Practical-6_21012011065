package com.amipatel.mad_practical_6_21012011065

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MyService : Service() {
    companion object{
        val PLAYERCONSTANT="play/pause"
    }
    lateinit var player: MediaPlayer
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (!this::player.isInitialized)
        {
            player=MediaPlayer.create(this,R.raw.song)
        }
        if (intent != null) {
            val str = intent.getStringExtra(PLAYERCONSTANT)
            if (str == PLAYERCONSTANT) {
                if (player.isPlaying) {
                    player.pause()
                } else {
                    player.start()
                }
            }
        }
        else
        {
            player.start()
        }
        return START_STICKY
    }

    override fun onDestroy() {
        player.stop()
        super.onDestroy()
    }
}