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
        attractions.add(new Attraction("Restaurant Gary Danko", "Rating: 4.5"));
        attractions.add(new Attraction("Kokkari Estiatorio", "Rating: 4.5"));
        attractions.add(new Attraction("Frances", "Rating: 4.5"));
        attractions.add(new Attraction("Wayfare Tavern", "Rating: 4.4"));
        attractions.add(new Attraction("Acquerello", "Rating: 4.5"));
        attractions.add(new Attraction("SPQR", "Rating: 4.1"));
        attractions.add(new Attraction("Cotogna", "Rating: 4.3"));
        attractions.add(new Attraction("The Slanted Door", "Rating: 4.2"));
        attractions.add(new Attraction("Benu", "Rating: 4.6"));
        attractions.add(new Attraction("La Folie", "Rating: 4.3"));

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
