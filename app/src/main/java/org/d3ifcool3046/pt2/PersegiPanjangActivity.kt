package org.d3ifcool3046.pt2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class PersegiPanjangActivity : AppCompatActivity() {
    private lateinit var youtubePlayerView: YouTubePlayerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)
        youtubePlayerView = findViewById(R.id.youtubePlayerViewPersegi)

        lifecycle.addObserver(youtubePlayerView)

        youtubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.cueVideo("qvJoMVF9i1M", 0f)
                youTubePlayer.pause()
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        youtubePlayerView.release()
    }
}
