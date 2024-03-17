package codeflies.com.saalimmvvm.Cart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import codeflies.com.saalimmvvm.databinding.ActivityCartBinding
import codeflies.com.saalimmvvm.model.responseClass.home.HomeItem
import codeflies.com.saalimmvvm.model.responseClass.maintenance.Arraydata
import codeflies.com.saalimmvvm.util.ImageLoader
import com.example.interviewtask.db.DatabaseHelper
import com.jakewharton.rxbinding4.view.clicks
import com.jakewharton.rxbinding4.widget.textChanges
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers // Import RxJava Schedulers class

class CartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCartBinding
    private var item: HomeItem? = null
    private var itemArray: Arraydata? = null
    private val disposables = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve the data from intent
        item = intent.getSerializableExtra("homeItem") as? HomeItem
        itemArray = intent.getSerializableExtra("arrayData") as? Arraydata

        // Check which type of data is available and set the appropriate fields
        if (item != null) {
            binding.productName.text = item!!.name
            ImageLoader.loadImage(this, item!!.image, binding.productImage)
        } else if (itemArray != null) {
            val firstItem = itemArray!!
            if (firstItem != null) {
                ImageLoader.loadImage(this, firstItem.image, binding.productImage)
                binding.productName.text = firstItem.name
            }
        }

        // Observe button clicks using RxBinding
        disposables.add(binding.processPaymentButton.clicks()
            .subscribe {
                Toast.makeText(this, "Payment Done successfully", Toast.LENGTH_SHORT).show()

                // Save data into the database
                val name = item?.name ?: itemArray?.name ?: ""
                val image = item?.image ?: itemArray?.image ?: ""
                val databaseHelper = DatabaseHelper(this)
                databaseHelper.insertData(name, image, "A product is any item or service you sell to serve a customers need or want.", 10.50)

                // Start ShowDataActivity
                startActivity(Intent(this, ShowDataActivity::class.java))
                finish()
            })
    }


    override fun onDestroy() {
        super.onDestroy()
        disposables.dispose() // Dispose disposables to avoid memory leaks
    }

    fun onBackPressed(view: android.view.View) {
        onBackPressed()
    }
}
