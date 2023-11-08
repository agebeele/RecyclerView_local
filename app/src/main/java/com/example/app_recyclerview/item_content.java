package com.example.app_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class item_content extends AppCompatActivity {

    TextView txtNombre, txtEmail, txtTelefono, txtDireccion;
    ImageView imgIcono;
    String llamar, ubicacion, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_content);

        txtNombre = findViewById(R.id.nameComplet);
        txtEmail = findViewById(R.id.emailAddress);
        txtTelefono = findViewById(R.id.phonenUmber);
        txtDireccion = findViewById(R.id.directionLocation);
        imgIcono = findViewById(R.id.imageIcon);

        Bundle recibirInfo = getIntent().getExtras();

        String info0 = recibirInfo.getString("Imagen");
        String info1 = recibirInfo.getString("Nombre Completo");
        String info2 = recibirInfo.getString("Correo Electronico");
        String info3 = recibirInfo.getString("Numero de Telefono");
        String info4 = recibirInfo.getString("Direccion");

        imgIcono.setImageResource(Integer.valueOf(info0));
        txtNombre.setText(info1);
        txtEmail.setText(info2);
        txtTelefono.setText(info3);
        txtDireccion.setText(info4);

        llamar= info3;
        correo = info2;
        ubicacion = info4;
    }
    public void regresarLista(View view){
        Intent registrar = new Intent(item_content.this, MainActivity.class);

        startActivity(registrar);
    }
    public void llamar (View view){
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(llamar));
            startActivity(intent);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},0001);
        }
    }
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 0001){
            if (grantResults.length == 1 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(llamar));
                startActivity(intent);
            } else {
                Toast.makeText(this, "Sin permiso", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void streetview(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(ubicacion));
        startActivity(intent);
    }
    public void Correo(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Buenas tardes Ingeniero Brandon");
        intent.putExtra(Intent.EXTRA_TEXT, "Su calificacion es: E");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {correo});
        startActivity(intent);
    }
}