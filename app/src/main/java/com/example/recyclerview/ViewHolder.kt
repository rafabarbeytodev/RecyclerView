package com.example.recyclerview

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemSuperheroListBinding
import com.squareup.picasso.Picasso

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var binding = ItemSuperheroListBinding.bind(view)
    fun bind(superhero: Superhero, context: Context) {
        binding.tvSuperhero.text = superhero.superhero
        binding.tvRealName.text = superhero.realName
        binding.tvPublisher.text = superhero.publisher
        binding.ivAvatar.loadUrl(superhero.photo)
        itemView.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                context,
                superhero.superhero,
                Toast.LENGTH_SHORT
            ).show()
        })
    }

    private fun ImageView.loadUrl(url: String) {
        Picasso.get().load(url).into(this)
    }
}