package com.example.menudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt_01;
    TextView txt_02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_01=findViewById(R.id.txt_01);
        txt_02=findViewById(R.id.txt_02);
        registerForContextMenu(txt_01);
        registerForContextMenu(txt_02);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.cerrar_sesion:
                finish();
                break;
            case R.id.create_new:
                Toast.makeText(MainActivity.this,"hola MARCIA",Toast.LENGTH_SHORT).show();
                break;
            case R.id.open:
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_demo,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.cerrar_sesion:
                finish();
                break;
            case R.id.create_new:
                Toast.makeText(MainActivity.this,"hola MARCIA",Toast.LENGTH_SHORT).show();
                break;
            case R.id.open:
                break;
        }
        return super.onContextItemSelected(item);
    }
}
