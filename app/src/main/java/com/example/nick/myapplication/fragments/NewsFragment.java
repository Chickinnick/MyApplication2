package com.example.nick.myapplication.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.nick.myapplication.Adapters.NewsAdapter;
import com.example.nick.myapplication.Adapters.ShopAdapter;
import com.example.nick.myapplication.Event;
import com.example.nick.myapplication.R;
import com.example.nick.myapplication.Shop;

import java.util.ArrayList;


public class NewsFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    private GridView gridView;

    private NewsAdapter newsAdapter;

    public static NewsFragment newInstance(String param1, String param2) {
        NewsFragment fragment = new NewsFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }


    ArrayList<Event>  events = new ArrayList<>();

    {
        events.add(new Event("name1", R.mipmap.ic_launcher));
        events.add(new Event("name2", R.mipmap.ic_launcher));
        events.add(new Event("name3", R.mipmap.ic_launcher));
        events.add(new Event("name4", R.mipmap.ic_launcher));

    }

    public NewsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop_grid, container, false);


        gridView = (GridView) view.findViewById(R.id.shops_gridview);

        newsAdapter = new NewsAdapter( view.getContext() , R.layout.event_item, events);

        gridView.setAdapter(newsAdapter);

        return view;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(String id);
    }


}
