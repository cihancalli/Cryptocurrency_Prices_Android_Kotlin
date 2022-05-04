package com.zerdasoftware.cryptocurrencyprices.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.zerdasoftware.cryptocurrencyprices.R
import com.zerdasoftware.cryptocurrencyprices.model.CyrptoModel
import kotlinx.android.synthetic.main.row_layout.view.*

class RecyclerViewAdapter(private val cyrptoList : ArrayList<CyrptoModel>, private var listener : Listener) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {

    interface Listener {
        fun onItemClick(cyrptoModel : CyrptoModel)
    }

    private var colors: Array<String> = arrayOf("#752a20","#ff7bc7","#ff6432","#b4323d","#32b4a9","#6da9df","#806600","#df4e4f","#626997","#ecce5b")

    class RowHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(cyrptoModel : CyrptoModel, colors : Array<String>, position : Int, listener : Listener)
        {
            Picasso.get().load(cyrptoModel.logo_url).into(itemView.imageView_logo)
            itemView.cv_row.setBackgroundColor(Color.parseColor(colors[position % 10]))
            itemView.textView_price.text = cyrptoModel.price
            itemView.textView_currency.text = cyrptoModel.currency
            itemView.setOnClickListener {
                listener.onItemClick(cyrptoModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return RowHolder(view)
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.bind(cyrptoList[position],colors,position,listener)
    }

    override fun getItemCount(): Int {
        return cyrptoList.size
    }
}