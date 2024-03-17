package codeflies.com.saalimmvvm.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import codeflies.com.saalimmvvm.Cart.CartActivity
import codeflies.com.saalimmvvm.R
import codeflies.com.saalimmvvm.databinding.ItemChildBinding
import codeflies.com.saalimmvvm.databinding.ItemParentBinding
import codeflies.com.saalimmvvm.model.responseClass.home.HomeItem
import codeflies.com.saalimmvvm.model.responseClass.home.HomeResponse
import codeflies.com.saalimmvvm.model.responseClass.maintenance.Arraydata
import codeflies.com.saalimmvvm.model.responseClass.maintenance.MaintenanceResponse
import codeflies.com.saalimmvvm.model.responseClass.maintenance.MaintenanceResponseItem
import codeflies.com.saalimmvvm.util.ImageLoader
import java.lang.reflect.ParameterizedType

class MaintainenceAdapter(
    private val data: ArrayList<MaintenanceResponseItem>,
    private val context: Context
) :
    RecyclerView.Adapter<MaintainenceAdapter.ParentViewHolder>() {

    init {
        if (data.isNotEmpty()) {
            data.removeAt(0)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val view = ItemParentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ParentViewHolder(view)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ParentViewHolder(private val binding: ItemParentBinding) : RecyclerView.ViewHolder(
        binding.root
    ) {

        fun bind(maintenanceResponseItem: MaintenanceResponseItem) {
            // Set title
            binding.parentTitleTextView.text = maintenanceResponseItem.name
            binding.childRecyclerView.adapter = ChildAdapter(maintenanceResponseItem.arraydata)
        }

    }

    inner class ChildAdapter(private val arraydata: List<Arraydata>) :
        RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
            val view = ItemChildBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ChildViewHolder(view)
        }

        override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
            holder.bind(arraydata[position])
        }

        override fun getItemCount(): Int {
            return arraydata.size
        }

        inner class ChildViewHolder(private val binding: ItemChildBinding) :
            RecyclerView.ViewHolder(binding.root) {

            fun bind(arraydata: Arraydata) {
                // Set data for each Arraydata item
                binding.textView.text = arraydata.name
                ImageLoader.loadImage(context, arraydata.image, binding.imageView)
                // Load image using ImageLoader utility
                binding.cardClick.setOnClickListener {
                    // Toast.makeText(context, arraydata.toString(), Toast.LENGTH_SHORT).show()
//                    CartActivity.itemarray=arraydata
//                    context.startActivity( Intent(context, CartActivity::class.java))
                    val intent = Intent(context, CartActivity::class.java)
                    intent.putExtra("arrayData", arraydata)
                    context.startActivity(intent)

                }
            }
        }
    }
}


/*inner class ChildAdapter(private val data: List<MaintenanceResponseItem>) :
    RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val view =
            ItemChildBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChildViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val currentItem = data[position]
        Log.d("ParentAdapter", "Binding Item: ${currentItem.name}")
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ChildViewHolder(private val binding: ItemChildBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(homeItem: HomeItem) {
            binding.textView.text = homeItem.name
            ImageLoader.loadImage(context, homeItem.image, binding.imageView)
        }
    }
}*/




