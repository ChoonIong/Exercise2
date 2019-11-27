package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
btnCal.setOnClickListener {



    if(txtHeight.text.toString()!=null && txtWeight.text.toString()!=null)
    {
    val a:String = txtHeight.text.toString()
    val b:String = txtWeight.text.toString()
    val aa:Double  = a.toDouble()
    val bb:Double  = b.toDouble()

    val r:Double = cal(aa,bb)
        val c:String
    lblBMI.text = "%.2f".format(cal(aa,bb))


    if(   r <= 18.5)
    {
        c="Under"
     img1.setImageResource(R.drawable.under)
    }
    else if(r >= 18.5 && r <= 24.9){

        img1.setImageResource(R.drawable.normal)

    }
    else
    {
        img1.setImageResource(R.drawable.over)
    }



    }
    else
    {
        val str:String ="Empty"
        txtHeight.setText(str)

        txtWeight.setText (str)
    }




}
        btnReset.setOnClickListener {
           /* txtHeight.text = null
            txtWeight.text = null*/
            val str:String ="Empty"
            txtHeight.setText(str)

            txtWeight.setText (str)
            lblBMI.text = null
            img1.setImageResource(R.drawable.empty)
            txtWeight.requestFocus()






        }




    }


    private fun  cal(a:Double ,b:Double):Double
    {

        val result:Double =(b / ((a/100)*(a/100)))

     //   val result:Double =(b / ((a/100)*(a/100)))

       return result


    }
}
