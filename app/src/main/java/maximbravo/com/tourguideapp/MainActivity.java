package maximbravo.com.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView beaches = (TextView) findViewById(R.id.beaches);

        // Set a click listener on that View
        beaches.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent beachesIntent = new Intent(MainActivity.this, BeachesActivity.class);

                // Start the new activity
                startActivity(beachesIntent);
            }
        });

        TextView trails = (TextView) findViewById(R.id.trails);

        // Set a click listener on that View
        trails.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent trailsIntent = new Intent(MainActivity.this, TrailsActivity.class);

                // Start the new activity
                startActivity(trailsIntent);
            }
        });

        TextView fun = (TextView) findViewById(R.id.fun);

        // Set a click listener on that View
        fun.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent funIntent = new Intent(MainActivity.this, FunActivity.class);

                // Start the new activity
                startActivity(funIntent);
            }
        });

        TextView food = (TextView) findViewById(R.id.food);

        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);

                // Start the new activity
                startActivity(foodIntent);
            }
        });
    }
}
