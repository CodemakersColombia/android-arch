package com.codemakers.architecture.util

import android.support.annotation.LayoutRes
import android.support.design.widget.TextInputLayout
import android.view.LayoutInflater
import android.view.ViewGroup

fun ViewGroup.inflate(@LayoutRes layout: Int) = LayoutInflater.from(context).inflate(layout, this, false)

fun TextInputLayout.sText(): String = editText?.text.toString()