package com.example.tugas_foto

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    private val photos = listOf(
        Pair(R.drawable.vivov40, Pair(" Vivo V40","RAM & ROM 12GB + 256GB, Resolusi 2800 x 1260")),
        Pair(R.drawable.vivox100,Pair("Vivo X100","RAM 12 GB,Kapasitas 256 GB,Ukuran Layar 6.78 inch,Tipe Layar AMOLED, 120Hz,Resolusi Layar 1260 x 2800 pixels")),
        Pair(R.drawable.vivoy28,Pair("Vivo Y28","ROM,128 GB, 256GB,RAM 6GB, 8GB,Ukuran Layar 6,68 inch,Resolusi Layar 1608 × 720 (HD+),")),
        Pair(R.drawable.vivoy17s,Pair("Vivo Y17s"," 4GB+4GB/64GB,50MP Main Camera,6,56\" HD+ Sunlight Screen,5000mAh + 15W FastCharge,IP54 Splash Waterproof")),
        Pair(R.drawable.vivox200,Pair("Vivo X200","Layar Amoled 6,67inc, 120hz 1.07 miliar warna, HDR 10+ tingkat kecerahan 4500nit, Chipset MediaTek Dimensity, 9400 Ram 12GB internal 256GB")),

    )

    private var currentIndex = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lyout)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val textView = findViewById<TextView>(R.id.textView)
        val prevButton = findViewById<Button>(R.id.prevButton)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val textViewo = findViewById<TextView>(R.id.textViewo)

        fun updatePhoto() {
            imageView.setImageResource(photos[currentIndex].first)
            textView.text = photos[currentIndex].second.second
            textViewo.text = photos[currentIndex].second.first

        }
        updatePhoto()

        nextButton.setOnClickListener {
            if (currentIndex < photos.size - 1) {
                currentIndex++
                updatePhoto()
            }
        }

        prevButton.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                updatePhoto()
            }
        }
    }
}