package com.example.practical24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practical24.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //val tv :TextView = findviewbyId(R.id.tvName)

        //': Student' put or not put also can
        val s: Student = Student("W123", "John")

        binding.myData = s
        //binding.tvID.text = s.studentID
        binding.btnUpdate.setOnClickListener(){
            s.studentName = "Alex"

            binding.apply {
                invalidateAll()
            }
        }

    }
}