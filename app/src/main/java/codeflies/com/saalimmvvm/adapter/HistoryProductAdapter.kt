package codeflies.com.saalimmvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import codeflies.com.saalimmvvm.databinding.ItemHistoryProductBinding
import codeflies.com.saalimmvvm.model.Item
import codeflies.com.saalimmvvm.util.ImageLoader

class HistoryProductAdapter(private var items: List<Item>, private val requireActivity: Context) :
    RecyclerView.Adapter<HistoryProductAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(private val binding: ItemHistoryProductBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Item) {
            binding.apply {
                titleTextView.text = item.title
                descriptionTextView.text = item.description
                amountTextView.text = item.amount.toString()
                ImageLoader.loadImage(requireActivity , item.image, productImage)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemHistoryProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setItems(items: List<Item>) {
        this.items = items
        notifyDataSetChanged()
    }
}
