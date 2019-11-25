package uy.com.depo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListProductos_Activity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_productos2);

        imageView = findViewById(R.id.image_view);
        textView = findViewById(R.id.text_view);

        Intent intent = getIntent();
        int imagenProd = intent.getIntExtra("Imagen", 0);
        String nombreProd = intent.getStringExtra("Producto");

        imageView.setImageResource(imagenProd);
        imageView.setImageResource(Integer.parseInt(nombreProd));



    }
}
