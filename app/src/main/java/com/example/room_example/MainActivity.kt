package com.example.room_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import androidx.room.Room
import com.example.room_example.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.lifecycleOwner = this //LiveData를 사용하기 위함.

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel

        //화면 바인딩을 대체
//        viewModel.getAll().observe(this, Observer {
//            result_text.text = it.toString()
//        })

        //View화면으로 이동 시킴
//        add_button.setOnClickListener {
//            //Dispatchers.IO : background thread
//            //비동기 사용
//            lifecycleScope.launch(Dispatchers.IO) {
//                viewModel.insert(Todo(todo_edit.text.toString()))
//            }
//        }
    }
}
