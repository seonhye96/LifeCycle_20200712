package kr.co.tjoeun.lifecycle_20200712

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_other)

                Log.d("e다른화면", "onCreate 실행")
    }
}