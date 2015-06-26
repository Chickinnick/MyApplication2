package com.example.nick.myapplication.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nick.myapplication.R;
import com.example.nick.myapplication.Shop;

import java.util.List;

public class ShopAdapter extends ArrayAdapter<Shop>{

    Context context ;

    public ShopAdapter(Context context, int resourceId,
                                 List<Shop> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        TextView txtTitle;
        TextView txtDisc;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        Shop shop = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.shop_item, null);
            holder = new ViewHolder();
            holder.txtDisc= (TextView) convertView.findViewById(R.id.shop_discount);
            holder.txtTitle = (TextView) convertView.findViewById(R.id.shop_name);
            holder.imageView = (ImageView) convertView.findViewById(R.id.shop_picture);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        String discount = String.valueOf(shop.getDiscount());
        holder.txtDisc.setText(discount);
        holder.txtTitle.setText(shop.getName());
        holder.imageView.setImageResource(shop.getImageId());

        return convertView;
    }

}

