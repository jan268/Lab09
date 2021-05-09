package pollub.ism.lab09;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AktywnoscGlowna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktywnosc_glowna);

        DostawcaDanych dostawca = new DostawcaDanych(getResources());
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        NaszAdapter adapter = new NaszAdapter(this, dostawca);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}