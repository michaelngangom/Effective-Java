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

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView ListView, View v, int position, long id) {
//                if(position ==0){
//                    Intent intent = new Intent(MainActivity.this,CAndD.class);
//                    startActivity(intent);
//                }
                switch (position) {
                    case 0: {
//                        TextView textView= (TextView) findViewById(R.id.textTest);
//                        textView.setText("It works!");

                        Intent intent = new Intent(MainActivity.this, CAndD.class);
                        startActivity(intent);
                        break;

                    }
                    case 1: {
                        Intent intent = new Intent(MainActivity.this, MCAO.class);
                        startActivity(intent);
                        break;

                    }
                    case 2: {
                        Intent intent = new Intent(MainActivity.this, ClassAndInterfaces.class);
                        startActivity(intent);
                        break;

                    }
                    case 3: {
                        Intent intent = new Intent(MainActivity.this, Generics.class);
                        startActivity(intent);
                        break;

                    }
                    case 4: {
                        Intent intent = new Intent(MainActivity.this, EnumsAndAnnotation.class);
                        startActivity(intent);
                        break;

                    }
                    case 5: {
                        Intent intent = new Intent(MainActivity.this, Methods.class);
                        startActivity(intent);
                        break;

                    }
                    case 6: {
                        Intent intent = new Intent(MainActivity.this, GeneralProgramming.class);
                        startActivity(intent);
                        break;

                    }
                    case 7: {
                        Intent intent = new Intent(MainActivity.this, Exceptions.class);
                        startActivity(intent);
                        break;

                    }
                    case 8: {
                        Intent intent = new Intent(MainActivity.this, Concurrency.class);
                        startActivity(intent);
                        break;

                    }
                    case 9: {
                        Intent intent = new Intent(MainActivity.this, Serializations.class);
                        startActivity(intent);
                        break;

                    }
                    default:

                }
            }
        };

        //Add the lsitener to the lsit view
        ListView listView = (ListView) findViewById(R.id.MainList);
        listView.setOnItemClickListener(itemClickListener);


    }
    //make this a listView
}
