package com.codemakers.architecture.ui.user

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.codemakers.architecture.R
import com.codemakers.architecture.databinding.ActivityUserAddBinding
import kotlinx.android.synthetic.main.activity_user_add.*
import org.jetbrains.anko.toast

class UserAddActivity : AppCompatActivity() {

    lateinit var binding: ActivityUserAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_add)

        addButton.setOnClickListener{
            toast("Usuario agregado")
            finish()
        }
    }
}
