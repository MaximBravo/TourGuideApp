package maximbravo.com.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by wendy on 7/2/2016.
 */
public class FunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("A fun activity", "Rating: 3"));
        attractions.add(new Attraction("B fun activity", "Rating: 5"));
        attractions.add(new Attraction("C fun activity", "Rating: 4"));
        attractions.add(new Attraction("D fun activity", "Rating: 2"));
        attractions.add(new Attraction("E fun activity", "Rating: 2"));
        attractions.add(new Attraction("F fun activity", "Rating: 4"));
        attractions.add(new Attraction("G fun activity", "Rating: 5"));
        attractions.add(new Attraction("H fun activity", "Rating: 1"));
        attractions.add(new Attraction("J fun activity", "Rating: 5"));
        attractions.add(new Attraction("K fun activity", "Rating: 5"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.drawable.fun, R.color.fun_category);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}
