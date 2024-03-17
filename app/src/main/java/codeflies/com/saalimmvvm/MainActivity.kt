package codeflies.com.saalimmvvm

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import codeflies.com.saalimmvvm.databinding.ActivityMainBinding
import com.jakewharton.rxbinding4.view.clicks
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val disposables = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener for the button
        disposables.add(
            binding.button.clicks()
                .buffer(300, TimeUnit.MILLISECONDS) // Buffer clicks within 300 milliseconds
                .filter { it.size >= 2 } // Filter for at least two clicks
                .subscribe {
                    handleDoubleClick()
                }
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        disposables.dispose()
    }

    private fun handleDoubleClick() {
        binding.textView.text = "Double Click Detected"

       // Toast.makeText(this@MainActivity, "saaalim", Toast.LENGTH_SHORT).show()

        runOnUiThread {
            Toast.makeText(this@MainActivity, "Double Click Detected", Toast.LENGTH_SHORT).show()
        }

        val isAnyFieldEmpty = binding.editName.text.isNullOrBlank() ||
                binding.editEmail.text.isNullOrBlank() ||
                binding.editPhone.text.isNullOrBlank() ||
                binding.editPassword.text.isNullOrBlank()

        if (isAnyFieldEmpty) {
            // Display message if any field is empty
            binding.textView.text = "Please fill all fields"
            updateEditTextColors()
        } else {
            // Your other logic when all fields are filled
            // For example, trigger some action
        }
    }

    private fun updateEditTextColors() {
        val editTexts = listOf(
            binding.editName,
            binding.editEmail,
            binding.editPhone,
            binding.editPassword
        )

        editTexts.forEach { editText ->
            if (editText.text.isNullOrBlank()) {
                editText.backgroundTintList = ColorStateList.valueOf(Color.RED)
            } else {
                editText.backgroundTintList = ColorStateList.valueOf(Color.GREEN)
            }
        }
    }
}
