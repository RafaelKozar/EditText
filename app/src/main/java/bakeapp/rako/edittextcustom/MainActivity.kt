package bakeapp.rako.edittextcustom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.TypedValue
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.floor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edtNome.addTextChangedListener(diminuir())
    }


    fun diminuir(): TextWatcher {
        return object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable) {
                val ss = Integer.toString(edtNome.text.length)
                //                Toast.makeText(getApplicationContext(), ss, Toast.LENGTH_SHORT).show();
                val quantidadeCaracter = edtNome.text.toString().length

                val diminui = (quantidadeCaracter - 27).toFloat()
                edtNome.setTextSize(TypedValue.COMPLEX_UNIT_PX, 59.toFloat())

                if (diminui > 0) {
                    edtNome.setTextSize(TypedValue.COMPLEX_UNIT_PX, edtNome.getTextSize() - diminui)
                }
                val dd = java.lang.Float.toString(edtNome.textSize)
                Toast.makeText(applicationContext, dd, Toast.LENGTH_SHORT).show()
            }
        }
    }

}
