package com.cvag.myfirstlib

import android.content.Context
import android.widget.Toast

/**
 * Created by Siva G Gurusamy on 30/Apr/2022
 * email : siva@paxel.co
 */
object proToast {
    fun show(context: Context) {
        Toast.makeText(context, "Hello from library", Toast.LENGTH_SHORT).show()
    }
}