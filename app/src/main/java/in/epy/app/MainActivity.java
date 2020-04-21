package in.epy.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton productImagebutton;
    ImageButton serviceImagebutton;
    TextView products;
    TextView services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productImagebutton = findViewById(R.id.image_Button_project);
        productImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Page2Activity.class));
            }
        });
        serviceImagebutton = findViewById(R.id.image_Button_service);
        serviceImagebutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Page3Activity.class));
            }
        }));
        products = findViewById(R.id.products);
        TextView products = findViewById(R.id.products);
        products.setEnabled(false);
        services = findViewById(R.id.services);
        TextView services = findViewById(R.id.services);
        services.setEnabled(false);


    }

    }


