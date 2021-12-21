package com.zeeshan.toasterlibrary

import android.content.Context
import android.widget.Toast
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat


public class ToasterMessage {

    companion object {

        fun showToast(context : Context  , message : String){
            val toast = Toast(context)
            toast.duration = Toast.LENGTH_SHORT
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View = inflater.inflate(R.layout.toast_view, null)
            var rlMain : RelativeLayout = view.findViewById(R.id.rlMain)
            var tvText : TextView = view.findViewById(R.id.tvText)
            tvText.text = message
            toast.view = view
            toast.show()
        }

        fun showSuccessToast(context : Context  , message : String){
            val toast = Toast(context)
            toast.duration = Toast.LENGTH_SHORT
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View = inflater.inflate(R.layout.toast_view, null)
            var rlMain : RelativeLayout = view.findViewById(R.id.rlMain)
            var tvText : TextView = view.findViewById(R.id.tvText)
            rlMain.backgroundTintList = ContextCompat.getColorStateList(context , R.color.green)
            tvText.text = message
            toast.view = view
            toast.show()
        }

        fun showErrorToast(context : Context  , message : String){
            val toast = Toast(context)
            toast.duration = Toast.LENGTH_SHORT
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View = inflater.inflate(R.layout.toast_view, null)
            var rlMain : RelativeLayout = view.findViewById(R.id.rlMain)
            var tvText : TextView = view.findViewById(R.id.tvText)
            rlMain.backgroundTintList = ContextCompat.getColorStateList(context , R.color.red)
            tvText.text = message
            toast.view = view
            toast.show()
        }

        fun showWarningToast(context : Context  , message : String){
            val toast = Toast(context)
            toast.duration = Toast.LENGTH_SHORT
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View = inflater.inflate(R.layout.toast_view, null)
            var rlMain : RelativeLayout = view.findViewById(R.id.rlMain)
            var tvText : TextView = view.findViewById(R.id.tvText)
            rlMain.backgroundTintList = ContextCompat.getColorStateList(context , R.color.yellow)
            tvText.text = message
            toast.view = view
            toast.show()
        }



    }
}