package com.raionstudio.listviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String[] favoriteTVShow={
//                "Teletubbies",
//                "Let's go",
//                "Beyblade",
//                "Ultraman gaia",
//                "Digimon Tamers",
//                "Crush Gear",
//                "Power Ranger",
//                "Dragon Ball",
//                "Law of Ueki",
//                "Kinikuman",
//                "Crayon Shinchan"
//        };

        //final ListAdapter theAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,favoriteTVShow);
//        final ListAdapter theAdapter=new ArrayAdapter<String>(this,R.layout.row_layout,favoriteTVShow);
//        final ListAdapter theAdapter=new ArrayAdapter<String>(this,R.layout.row_layout,favoriteTVShow);
        MyAdapter theAdapter = new MyAdapter(this, generateData());
        final ListView theListView=(ListView)findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Item objek=(Item)adapterView.getItemAtPosition(position);
                Object objek=theListView.getAdapter().getItem(position);
                Item aduh=(Item)objek;
                String tvShowPicked="You pilih "+aduh.getDescription();

                Toast.makeText(MainActivity.this,tvShowPicked,Toast.LENGTH_SHORT).show();
            }
        });


    }


    private ArrayList<Item> generateData(){
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Item 1","First Item on the list"));
        items.add(new Item("Item 2","Second Item on the list"));
        items.add(new Item("Item 3","Third Item on the list"));

        return items;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
