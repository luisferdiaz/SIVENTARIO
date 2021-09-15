package hernandez.gewy.siventario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void moverA (View view){
        TextView textView=(TextView) view;
        Intent intent= null;
        switch (textView.getId()){
            case R.id.textV_reg:
                intent=new Intent(MainActivity.this, Registro.class);
                break;
            case R.id.textV_rec:
                intent=new Intent(MainActivity.this, RecuperarContrasena.class);
                break;
        }
        startActivity(intent);
    }
}