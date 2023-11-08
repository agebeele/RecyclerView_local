package com.example.app_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    //Nuestro modelo "dataList".
    //El Array es nuestra lista, en este caso esta vacia.
    private List<String> dataCorreo = new ArrayList<>();
    private  List<String> dataNombre = new ArrayList<>();
    private  List<String> dataImagen = new ArrayList<>();
    private  List<String> dataTelefono = new ArrayList<>();
    private  List<String> dataUbicacion = new ArrayList<>();
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mapeamos nuestro RecyclerVie para poder manipularlo.
        recyclerView = findViewById(R.id.recyclerView_list);
        //Ayuda para poder acomodar nuestro contenedor.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Creo un objeto de adaptadoral que le voy a pasar los datos "dataList".
        myAdapter = new MyAdapter(dataCorreo, dataNombre, dataImagen, dataTelefono, dataUbicacion);

        //Muestra la lista.
        recyclerView.setAdapter(myAdapter);

        //Se agregan los datos.
        //Nombre
        dataNombre.add("Brandon Adrian Lopez Garcia");
        dataNombre.add("Marco Antonio Bedolla Agreda");
        dataNombre.add("Ociel Josue Tabal Velasco");
        dataNombre.add("Eduardo Sebastian Piña Chavarria");
        dataNombre.add("Jacciel Josafat Juarez Hernandez");
        dataNombre.add("David Aaron Herrera del Castillo");

        dataNombre.add("Brandon Adrian Lopez Garcia");
        dataNombre.add("Marco Antonio Bedolla Agreda");
        dataNombre.add("Ociel Josue Tabal Velasco");
        dataNombre.add("Eduardo Sebastian Piña Chavarria");
        dataNombre.add("Jacciel Josafat Juarez Hernandez");
        dataNombre.add("David Aaron Herrera del Castillo");

        //Descripcion
        dataCorreo.add("brandon_adrian.itic@tesco.edu.mx");
        dataCorreo.add("marco_antonio.itic@tesco.edu.mx");
        dataCorreo.add("ociel_josue.itic@tesco.edu.mx");
        dataCorreo.add("eduardo_sebastian.itic@tesco.edu.mx");
        dataCorreo.add("jacciel_josafat.itic@tesco.edu.mx");
        dataCorreo.add("david_aaron.itic@tesco.edu.mx");

        dataCorreo.add("brandon_adrian.itic@tesco.edu.mx");
        dataCorreo.add("marco_antonio.itic@tesco.edu.mx");
        dataCorreo.add("ociel_josue.itic@tesco.edu.mx");
        dataCorreo.add("eduardo_sebastian.itic@tesco.edu.mx");
        dataCorreo.add("jacciel_josafat.itic@tesco.edu.mx");
        dataCorreo.add("david_aaron.itic@tesco.edu.mx");

        //Telefono
        dataTelefono.add("tel: 313 706 5253");
        dataTelefono.add("tel: 55 8448 0045");
        dataTelefono.add("tel: 55 4358 2014");
        dataTelefono.add("tel: 55 7881 2636");
        dataTelefono.add("tel: 55 6077 0442");
        dataTelefono.add("tel: 442 837 2849");

        dataTelefono.add("tel: 313 706 5253");
        dataTelefono.add("tel: 55 8448 0045");
        dataTelefono.add("tel: 55 4358 2014");
        dataTelefono.add("tel: 55 7881 2636");
        dataTelefono.add("tel: 55 6077 0442");
        dataTelefono.add("tel: 442 837 2849");


        //Ubicacion
        dataUbicacion.add("https://www.google.com/maps/place/Fuente+de+Neptuno+10,+Fuentes+del+Valle,+54910+Fuentes+del+Valle,+Méx./@19.6374343,-99.1396474,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f430e34f9f07:0xec768c73266f173e!8m2!3d19.6374293!4d-99.1370725!16s%2Fg%2F11c2bvvb04");
        dataUbicacion.add("https://www.google.com/maps/place/TecNM+-+Tecnológico+de+Estudios+Superiores+de+Coacalco+-+TESCo/@19.6305083,-99.1168774,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f41b204bbead:0x174544a53d86fb50!8m2!3d19.6305033!4d-99.1143025!16s%2Fg%2F1tm0thgr");
        dataUbicacion.add("https://www.google.com/maps/place/Av.+José+López+Portillo+1,+SECCION+HACIENDA,+Bosques+del+Valle,+55712+San+Francisco+Coacalco,+Méx./@19.6319072,-99.1272886,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f4225c6d93bd:0x5c915155e8d9a93!8m2!3d19.6319022!4d-99.1247137!16s%2Fg%2F11h28w6dj0");
        dataUbicacion.add("https://www.google.com/maps/place/CECyTEM+Plantel+Coacalco/@19.6215302,-99.1034886,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f155328c3bcb:0xff807e7e5824b155!8m2!3d19.6215252!4d-99.1009137!16s%2Fg%2F1tdqtwkm");
        dataUbicacion.add("https://www.google.com/maps/place/CECyTEM+Plantel+Tultitlán/@19.6729161,-99.0897485,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f37649923ee9:0xa6717c32c9d02943!8m2!3d19.6729111!4d-99.0871736!16s%2Fg%2F1tddsjph");
        dataUbicacion.add("https://www.google.com/maps/place/Plaza+Coacalco/@19.6269184,-99.0843324,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f3e3efed695d:0xc7615c1d98f0d468!8m2!3d19.6269134!4d-99.0817575!16s%2Fg%2F1hm382s2n");

        dataUbicacion.add("https://www.google.com/maps/place/Fuente+de+Neptuno+10,+Fuentes+del+Valle,+54910+Fuentes+del+Valle,+Méx./@19.6374343,-99.1396474,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f430e34f9f07:0xec768c73266f173e!8m2!3d19.6374293!4d-99.1370725!16s%2Fg%2F11c2bvvb04");
        dataUbicacion.add("https://www.google.com/maps/place/TecNM+-+Tecnológico+de+Estudios+Superiores+de+Coacalco+-+TESCo/@19.6305083,-99.1168774,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f41b204bbead:0x174544a53d86fb50!8m2!3d19.6305033!4d-99.1143025!16s%2Fg%2F1tm0thgr");
        dataUbicacion.add("https://www.google.com/maps/place/Av.+José+López+Portillo+1,+SECCION+HACIENDA,+Bosques+del+Valle,+55712+San+Francisco+Coacalco,+Méx./@19.6319072,-99.1272886,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f4225c6d93bd:0x5c915155e8d9a93!8m2!3d19.6319022!4d-99.1247137!16s%2Fg%2F11h28w6dj0");
        dataUbicacion.add("https://www.google.com/maps/place/CECyTEM+Plantel+Coacalco/@19.6215302,-99.1034886,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f155328c3bcb:0xff807e7e5824b155!8m2!3d19.6215252!4d-99.1009137!16s%2Fg%2F1tdqtwkm");
        dataUbicacion.add("https://www.google.com/maps/place/CECyTEM+Plantel+Tultitlán/@19.6729161,-99.0897485,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f37649923ee9:0xa6717c32c9d02943!8m2!3d19.6729111!4d-99.0871736!16s%2Fg%2F1tddsjph");
        dataUbicacion.add("https://www.google.com/maps/place/Plaza+Coacalco/@19.6269184,-99.0843324,17z/data=!3m1!4b1!4m6!3m5!1s0x85d1f3e3efed695d:0xc7615c1d98f0d468!8m2!3d19.6269134!4d-99.0817575!16s%2Fg%2F1hm382s2n");

        //Imagen
        dataImagen.add(String.valueOf(R.drawable.iconbloodhound));
        dataImagen.add(String.valueOf(R.drawable.iconwraith));
        dataImagen.add(String.valueOf(R.drawable.iconloba));
        dataImagen.add(String.valueOf(R.drawable.iconoctane));
        dataImagen.add(String.valueOf(R.drawable.iconrevenant));
        dataImagen.add(String.valueOf(R.drawable.iconvalkyrie));

        dataImagen.add(String.valueOf(R.drawable.iconbloodhound));
        dataImagen.add(String.valueOf(R.drawable.iconwraith));
        dataImagen.add(String.valueOf(R.drawable.iconloba));
        dataImagen.add(String.valueOf(R.drawable.iconoctane));
        dataImagen.add(String.valueOf(R.drawable.iconrevenant));
        dataImagen.add(String.valueOf(R.drawable.iconvalkyrie));


        //Invoco el metodo sobre el adaptador para asi actualizarlo.
        myAdapter.notifyDataSetChanged();

        myAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getApplicationContext(),"presionaste item :"+position,Toast.LENGTH_LONG).show();

                Intent i = new Intent (getApplicationContext(), item_content.class);
                i.putExtra("Imagen", dataImagen.get(position));
                i.putExtra("Nombre Completo", dataNombre.get(position));
                i.putExtra("Correo Electronico", dataCorreo.get(position));
                i.putExtra("Numero de Telefono", dataTelefono.get(position));
                i.putExtra("Direccion", dataUbicacion.get(position));
                startActivity(i);
            }
        });
    }
}