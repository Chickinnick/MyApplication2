package com.example.nick.myapplication.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.nick.myapplication.Adapters.ShopAdapter;
import com.example.nick.myapplication.R;
import com.example.nick.myapplication.Shop;

import java.util.ArrayList;

public class ShopFragment extends Fragment  {



    private OnFragmentInteractionListener mListener;

    private GridView gridView;

    private ShopAdapter shopAdapter;
  //  Context context = getActivity();

    public static ShopFragment newInstance(String param1, String param2) {
        ShopFragment fragment = new ShopFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }


    ArrayList<Shop> shops = new ArrayList<>();

    {
        shops.add(new Shop("name1", 3234, R.mipmap.ic_launcher));

        shops.add(new Shop("name2", 1234, R.mipmap.ic_launcher));
        shops.add(new Shop("name3", 34334, R.mipmap.ic_launcher));
        shops.add(new Shop("name4", 32323234, R.mipmap.ic_launcher));
    }

    public ShopFragment() {
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

        shopAdapter = new ShopAdapter( view.getContext() , R.layout.shop_item, shops );

        gridView.setAdapter(shopAdapter);

        return view;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(String id);
    }

}
