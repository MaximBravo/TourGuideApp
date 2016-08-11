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
        attractions.add(new Attraction("Ocean Beach", "Picture a 3.5 mile stretch of white beach with few tourists and no highrises. It's just \n" +
                "you and the waves and the seabirds at Ocean Beach, on the western most ..."));
        attractions.add(new Attraction("Baker Beach", "Gaze in wonder towards the Bridge and Marin Headlands from outside the \n" +
                "Golden Gate at mile-long Baker Beach. It's nestled at the foot of rugged cliffs on \n" +
                "the ..."));
        attractions.add(new Attraction("China Beach", "Locals consider China Beach a civic secret, tucked between Lands End and \n" +
                "Baker Beach in the Sea Cliff neighborhood west of the Golden Gate. This pristine\n" +
                " ..."));
        attractions.add(new Attraction("Rockaway Beach", "From surfers to swimmers to the Ramones, everyone wants to \"hitch a ride to \n" +
                "Rockaway Beach.\" Rockaway Beach is a year-round resource for residents all ..."));

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
