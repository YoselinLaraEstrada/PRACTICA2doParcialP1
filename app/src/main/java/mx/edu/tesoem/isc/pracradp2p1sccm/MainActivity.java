package mx.edu.tesoem.isc.pracradp2p1sccm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioButton visc, vitics, vambiental, vgastro;
CheckBox vcasa, vescuela, vtrabajo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visc=(RadioButton) findViewById(R.id.rbisc);
        vitics=(RadioButton) findViewById(R.id.rbitics);
        vambiental=(RadioButton) findViewById(R.id.rbambiental);
        vgastro=(RadioButton) findViewById(R.id.rbgastro);
        vcasa=(CheckBox) findViewById(R.id.chcasa);
        vescuela=(CheckBox) findViewById(R.id.chescuela);
        vtrabajo=(CheckBox) findViewById(R.id.chtrabajo);
    }

    public void seleccionar(View view){
        if(visc.isChecked()) Toast.makeText(this,"Ingenieria en Sistemas Computacionales", Toast.LENGTH_SHORT).show();
        if(vitics.isChecked()) Toast.makeText(this,"Ingenieria en Tecnologias de la Informacion y Comunicacion", Toast.LENGTH_SHORT).show();
        if(vambiental.isChecked()) Toast.makeText(this,"Ingenieria Ambiental", Toast.LENGTH_SHORT).show();
        if(vgastro.isChecked()) Toast.makeText(this,"Licenciatura en Gastronimia", Toast.LENGTH_SHORT).show();
        if(vcasa.isChecked()) Toast.makeText(this,"Seleccionaste Casa", Toast.LENGTH_SHORT).show();
        if(vescuela.isChecked()) Toast.makeText(this,"Seleccionaste Escuela", Toast.LENGTH_SHORT).show();
        if(vtrabajo.isChecked()) Toast.makeText(this,"Seleccionaste Trabajo", Toast.LENGTH_SHORT).show();

    }
}
