package com.codemakers.architecture.ui.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.codemakers.architecture.R
import com.codemakers.architecture.data.model.User
import com.codemakers.architecture.databinding.TemplateUserItemBinding
import com.codemakers.architecture.util.inflate

/**
 * Created by RicardoAndrés on 05/10/2017.
 */
class UserAdapter: RecyclerView.Adapter<UserAdapter.UserHolder>() {

    var data:List<User> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.binding.user = data[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder
            = UserHolder(parent.inflate(R.layout.template_user_item))

    override fun getItemCount(): Int
            = data.size

    class UserHolder(view: View): RecyclerView.ViewHolder(view){
        val binding: TemplateUserItemBinding = DataBindingUtil.bind(view)
    }
}