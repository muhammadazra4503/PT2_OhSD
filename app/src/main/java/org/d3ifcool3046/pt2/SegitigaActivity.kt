package org.d3ifcool3046.pt2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class SegitigaActivity : AppCompatActivity() {
    private lateinit var youtubePlayerView: YouTubePlayerView
    private lateinit var buttonTextView: TextView
    private lateinit var displayTextView: TextView
    private lateinit var shapeTextView2: TextView
    private lateinit var buttonTextView2: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)
        youtubePlayerView = findViewById(R.id.youtubePlayerViewSegitiga)
        lifecycle.addObserver(youtubePlayerView)

        buttonTextView = findViewById<TextView>(R.id.tvRumus)
        displayTextView = findViewById<TextView>(R.id.tvIsiRumus)
        buttonTextView2 = findViewById<TextView>(R.id.tvVideo)

        buttonTextView.setOnClickListener {
            if (displayTextView.visibility == View.GONE) {
                displayTextView.visibility = View.VISIBLE
            } else {
                displayTextView.visibility = View.GONE
            }
        }
        buttonTextView2.setOnClickListener {
            if (youtubePlayerView.visibility == View.GONE) {
                youtubePlayerView.visibility = View.VISIBLE
            } else {
                youtubePlayerView.visibility = View.GONE
            }
            youtubePlayerView.getYouTubePlayerWhenReady(object : YouTubePlayerCallback {
                override fun onYouTubePlayer(youTubePlayer: YouTubePlayer) {
                    youTubePlayer.cueVideo("IM7T_3BFsos", 0f)
                    youTubePlayer.play()
                }
            })
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        youtubePlayerView.release()
    }
}
