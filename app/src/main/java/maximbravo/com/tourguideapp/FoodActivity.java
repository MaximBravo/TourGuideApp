package maximbravo.com.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by wendy on 7/2/2016.
 */
public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.restaurant_1), getString(R.string.r_rating_1)));
        attractions.add(new Attraction(getString(R.string.restaurant_2), getString(R.string.r_rating_2)));
        attractions.add(new Attraction(getString(R.string.restaurant_3), getString(R.string.r_rating_3)));
        attractions.add(new Attraction(getString(R.string.restaurant_4), getString(R.string.r_rating_4)));
        attractions.add(new Attraction(getString(R.string.restaurant_5), getString(R.string.r_rating_5)));
        attractions.add(new Attraction(getString(R.string.restaurant_6), getString(R.string.r_rating_6)));
        attractions.add(new Attraction(getString(R.string.restaurant_7), getString(R.string.r_rating_7)));
        attractions.add(new Attraction(getString(R.string.restaurant_8), getString(R.string.r_rating_8)));
        attractions.add(new Attraction(getString(R.string.restaurant_9), getString(R.string.r_rating_9)));
        attractions.add(new Attraction(getString(R.string.restaurant_10), getString(R.string.r_rating_10)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.drawable.food, R.color.food_category);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }

}
