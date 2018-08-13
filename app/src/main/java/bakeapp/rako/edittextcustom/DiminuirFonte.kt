package bakeapp.rako.edittextcustom

import android.text.Editable
import android.text.TextWatcher
import android.util.TypedValue
import android.widget.EditText

object DiminuiFonte {

    private val tamanhoMinimo = 18f
    fun diminuir(editText: EditText, iniciar: Int, parar: Int): TextWatcher {
        val tamPadrao = editText.textSize
        return object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable) {
                val size = editText.text.length
                var decremente = (size - iniciar).toFloat()
                if (decremente > parar) {
                    decremente = parar.toFloat()
                }
                if (decremente > 0) {
                    var tamanho = tamPadrao - decremente
                    if (tamanho < tamanhoMinimo) tamanho = tamanhoMinimo
                    editText.setTextSize(TypedValue.COMPLEX_UNIT_PX, tamanho)
                }
            }
        }
    }

    fun diminui(editText: EditText, iniciar: Int, parar: Int, multiplicador: Float, tamPadrao: Float) {
        editText.setTextSize(TypedValue.COMPLEX_UNIT_PX, tamPadrao)
        val size = editText.text.length
        var decremente = (size - iniciar) * multiplicador
        if (decremente > parar) {
            decremente = parar.toFloat()
        }
        if (decremente > 0) {
            var tamanho = tamPadrao - decremente
            if (tamanho < tamanhoMinimo) tamanho = tamanhoMinimo
            editText.setTextSize(TypedValue.COMPLEX_UNIT_PX, tamanho)
        }
    }
}