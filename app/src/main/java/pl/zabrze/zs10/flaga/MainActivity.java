package pl.zabrze.zs10.flaga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int licznikllych = 0;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewPolecenie);
    }

    public void zlaodpowiedz(View view) {
        Toast.makeText(this, R.string.bledme, Toast.LENGTH_SHORT).show();
    }

    public void dobraOdpowiedz(View view) {
        view.setVisibility(View.INVISIBLE);
        licznikllych++;
        if (licznikllych == 4){
            //TODO: zmienna wartości textview
            textView.setText(R.string.podsumowanie);

        }
    }
}