package com.webserveis.app.testmasterdetail

import android.content.Context
import android.content.res.Resources

fun Context.hasTwoPanels(): Boolean {
    val res: Resources = resources
    return res.getBoolean(R.bool.two_panels)
}