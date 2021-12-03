package com.example.street_fighter;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<Personagem> listarPerso = new ArrayList<Personagem>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView RecyclerView = findViewById(R.id.id_recyclerView);

        criarPersonagem();

        Adapter adapter = new Adapter(listarPerso);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),
                LinearLayout.VERTICAL));

        recyclerView.setAdapter(adapter);
    }

    private void criarPersonagem() {
        Personagem personagens = new Personagem("Ryu", "52", R.drawable.Ryu, 5);
        this.listarPerso.add(personagens);
        personagens = new Personagem("Akuma", "45", R.drawable.Akuma, 5);
        this.listarPerso.add(personagens);
        personagens = new Personagem("Dhalsim", "64", R.drawable.Dhalsim, 4);
        this.listarPerso.add(personagens);
        personagens = new Personagem("Ken", "52", R.drawable.Ken, 5);
        this.listarPerso.add(personagens);
        personagens = new Personagem("Chun-Li", "48", R.drawable.Chunli, 5);
        this.listarPerso.add(personagens);
        personagens = new Personagem("Blanka", "51", R.drawable.Blanka, 5);
        this.listarPerso.add(personagens);
        personagens = new Personagem("E. Honda", "56", R.drawable.EHonda, 4);
        this.listarPerso.add(personagens);
        personagens = new Personagem("Sagat", "61", R.drawable.Sagat, 5);
        this.listarPerso.add(personagens);
        personagens = new Personagem("Vega", "50", R.drawable.Vega, 3);
        this.listarPerso.add(personagens);
        personagens = new Personagem("Zangief", "60", R.drawable.Zangief, 5);
        this.listarPerso.add(personagens);

    }
}