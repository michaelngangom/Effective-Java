package effectivejava.effectivejava;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by michaelngangom on 8/21/17.
 */

public class CAndD extends ListActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = getListView();
        ArrayAdapter listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                AllTopics.topicsCAndD);
        listView.setAdapter(listAdapter);


    }
}
