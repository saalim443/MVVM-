package codeflies.com.saalimmvvm.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import codeflies.com.saalimmvvm.Cart.CartActivity
import codeflies.com.saalimmvvm.R
import codeflies.com.saalimmvvm.databinding.ItemAllcateBinding
import codeflies.com.saalimmvvm.model.responseClass.home.HomeItem
import codeflies.com.saalimmvvm.util.ImageLoader
import com.bumptech.glide.Glide

class AllCateAdapter(private val list: List<HomeItem>, private val context: Context):  RecyclerView.Adapter<AllCateAdapter.ViewHolder>() {
    class ViewHolder(private val binding: ItemAllcateBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: HomeItem, context: Context) {
            binding.cardClick.setOnClickListener {
              //  Toast.makeText(context, item.toString(), Toast.LENGTH_SHORT).show()
//                CartActivity.item=item
//                context.startActivity( Intent(context, CartActivity::class.java))

                val intent = Intent(context, CartActivity::class.java)
                intent.putExtra("homeItem", item)
                context.startActivity(intent)

            }
            ImageLoader.loadImage(context, item.image, binding.imgallCate)
            binding.tvallCate.text=item.name
            if (position==3)
            {
                Glide.with(context)
                    .load(R.drawable.baseline_arrow_right_alt_24)
                    .into(binding.imgallCate)
            }
//            binding.textView.text = item.title
//            binding.textView.setOnClickListener {
//              //  ShowDataActivity.data=item
//                context.startActivity( Intent(context, ShowDataActivity::class.java))
//            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllCateAdapter.ViewHolder {
        val laybinding = ItemAllcateBinding.inflate(LayoutInflater.from(parent.context), parent, false)


        return ViewHolder(laybinding)
    }


    override fun onBindViewHolder(holder: AllCateAdapter.ViewHolder, position: Int) {
        holder.bind(list[position],context)
    }


    override fun getItemCount(): Int {
        return list.size
    }
}