package bakeapp.rako.edittextcustom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.TypedValue
import android.widget.Toast
import bakeapp.rako.edittextcustom.DiminuiFonte.diminui
import bakeapp.rako.edittextcustom.DiminuiFonte.diminuir
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.floor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNome.addTextChangedListener(diminuir(edtNome, 23, 27))
        //edtNome.addTextChangedListener(diminuir(edtNome, 23, 27))
    }

}
