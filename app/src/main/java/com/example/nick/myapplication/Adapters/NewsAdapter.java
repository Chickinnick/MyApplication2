package com.example.nick.myapplication.Adapters;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nick.myapplication.Event;
import com.example.nick.myapplication.R;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<Event> {

    Context context ;

    public NewsAdapter(Context context, int resourceId,
                       List<Event> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        TextView txtTitle;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        Event event = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.event_item, null);
            holder = new ViewHolder();
            holder.txtTitle = (TextView) convertView.findViewById(R.id.event_name);
            holder.imageView = (ImageView) convertView.findViewById(R.id.event_imageview);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.txtTitle.setText(event.getName());
        holder.imageView.setImageResource(event.getImageId());

        return convertView;
    }

}
