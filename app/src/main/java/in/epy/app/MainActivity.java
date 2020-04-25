package in.epy.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    ImageButton product;
    ImageButton service;
    Toolbar tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar tb=findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        tb.inflateMenu(R.menu.menu);

        product = findViewById((R.id.imageButtonProduct));
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Page2Activity.class));
            }
        });

        service = findViewById(R.id.imageButtonService);
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Page3Activity.class));
            }
        });


            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    }
}
