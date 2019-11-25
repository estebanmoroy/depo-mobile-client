package uy.com.depo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListProductos_Activity extends AppCompatActivity {
    ListView listView;


    String [] nombreProd = {"Coca-Cola","Agua Salus", "Agua Tónica","Fideos", "Arroz", "Salsa de tomate", "Huevos", "Jane",
    "Cif vidrios", "Detergente", "Papas Noisette", "Hamburguesa Shneck", "Ravioles"};

    int [] imagenProd = {R.drawable.cocacola,R.drawable.aguasalus,R.drawable.tonica, R.drawable.fideos, R.drawable.arroz,
            R.drawable.salsatomate, R.drawable.huevos, R.drawable.jane, R.drawable.cif, R.drawable.deter, R.drawable.papasn,
            R.drawable.hamburgesa, R.drawable.ravioles};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_productos_);

        listView = findViewById(R.id.list_view);
        MainAdapter adapter = new MainAdapter (ListProductos_Activity.this, nombreProd,imagenProd);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListProductos_Activity.this, ListProductos_Activity2.class);
                intent.putExtra("imagen",imagenProd[position]);
                intent.putExtra("producto",nombreProd[position]);
                startActivity(intent);

            }
        });
    }
}
