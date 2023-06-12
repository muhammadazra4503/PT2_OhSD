package org.d3ifcool3046.pt2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerCallback
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class KotakActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var youtubePlayerView: YouTubePlayerView
    private lateinit var buttonTextView: TextView
    private lateinit var displayTextView: TextView
    private lateinit var shapeTextView2: TextView
    private lateinit var buttonTextView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotak)
        youtubePlayerView = findViewById(R.id.youtubePlayerViewKotak)
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
                    youTubePlayer.cueVideo("ScR8h2hIuMQ", 0f)
                    youTubePlayer.play()
                }
            })
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        youtubePlayerView.release()
    }
    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}
