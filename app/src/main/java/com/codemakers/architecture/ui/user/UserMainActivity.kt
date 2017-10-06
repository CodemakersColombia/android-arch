package com.codemakers.architecture.ui.user

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.codemakers.architecture.R
import com.codemakers.architecture.databinding.ActivityUserMainBinding
import com.codemakers.architecture.ui.adapter.UserAdapter
import kotlinx.android.synthetic.main.activity_user_main.*
import org.jetbrains.anko.startActivity

class UserMainActivity : AppCompatActivity() {

    lateinit var binding: ActivityUserMainBinding
    lateinit var adapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_main)

        adapter = UserAdapter()
        userRecyclerView.layoutManager = LinearLayoutManager(this)
        userRecyclerView.adapter = adapter



        addUserButton.setOnClickListener{
            startActivity<UserAddActivity>()
        }
    }
}
