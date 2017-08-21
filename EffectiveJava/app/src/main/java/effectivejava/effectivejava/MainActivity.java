package effectivejava.effectivejava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //crete an onItemClickListener

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView ListView, View v,int position,long id){
                if(position ==0){
                    Intent intent = new Intent(MainActivity.this,CAndD.class);
                    startActivity(intent);
                }
            }
        };

        //Add the lsitener to the lsit view
        ListView listView = (ListView) findViewById(R.id.MainList);
        listView.setOnItemClickListener(itemClickListener);


    }
    //make this a listView
}
