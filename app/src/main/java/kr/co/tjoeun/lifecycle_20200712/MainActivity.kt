package kr.co.tjoeun.lifecycle_20200712

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setupValues()
    }

    override fun setupEvents() {

    }

    override fun setupValues() {

    }
}