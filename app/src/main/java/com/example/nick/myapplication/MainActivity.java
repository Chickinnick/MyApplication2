package com.example.nick.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;

import com.example.nick.myapplication.fragments.ContactsFragment;
import com.example.nick.myapplication.fragments.EntertainmentFragment;
import com.example.nick.myapplication.fragments.MainFragment;
import com.example.nick.myapplication.fragments.NewsFragment;
import com.example.nick.myapplication.fragments.ShopFragment;
import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.Drawer.OnDrawerItemClickListener;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.SectionDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

;


public class MainActivity extends ActionBarActivity implements OnDrawerItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MainFragment()).commit();

        new Drawer()
                .withActivity(this)
                .withToolbar(toolbar)
                .withActionBarDrawerToggle(true)
                .withHeader(R.layout.drawer_header)
                .withDrawerWidthRes(R.dimen.drawer_width)
                .withOnDrawerItemClickListener(this)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName(R.string.drawer_item_home).withIcon(FontAwesome.Icon.faw_home).withIdentifier(1),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_news).withIcon(FontAwesome.Icon.faw_tablet).withIdentifier(2),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_shops).withIcon(FontAwesome.Icon.faw_shopping_cart).withIdentifier(3),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_entertainment).withIcon(FontAwesome.Icon.faw_smile_o).withIdentifier(4),
                        new PrimaryDrawerItem().withName(R.string.drawer_item_contact).withIcon(FontAwesome.Icon.faw_info_circle).withIdentifier(5),
                        new SectionDrawerItem().withName(R.string.drawer_item_account),
                        new SecondaryDrawerItem().withName(R.string.drawer_item_code).withIcon(FontAwesome.Icon.faw_cog).withIdentifier(4)
                )
                .build();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem iDrawerItem) {
        switch (i) {
            case 1:
                this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new MainFragment()).commit();
                break;

            case 2:
                this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new NewsFragment()).commit();
                break;

            case 3:
                this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new ShopFragment()).commit();
                break;

            case 4:
                this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new EntertainmentFragment()).commit();
                break;

            case 5:
                this.getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new ContactsFragment()).commit();
                break;
        }
    }


}
