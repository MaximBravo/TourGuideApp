package maximbravo.com.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by wendy on 7/2/2016.
 */
public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.beach_1), getString(R.string.beach_description_1)));
        attractions.add(new Attraction(getString(R.string.beach_2), getString(R.string.beach_description_2)));
        attractions.add(new Attraction(getString(R.string.beach_3), getString(R.string.beach_description_3)));
        attractions.add(new Attraction(getString(R.string.beach_4), getString(R.string.beach_description_4)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        int[] attractionPics = {R.drawable.ocean_beach, R.drawable.baker_beach, R.drawable.china_beach, R.drawable.rockaway_beach};
        AttractionAdapter adapter = new AttractionAdapter(this, attractions, attractionPics, R.color.beach_category);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }

}
