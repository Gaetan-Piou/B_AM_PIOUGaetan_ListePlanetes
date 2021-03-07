package com.example.b_am_piougaetan_listeplanetes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView monRecyclerView;
    private RecyclerView.Adapter monAdapter;
    private RecyclerView.LayoutManager monLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_planetelist);
        monRecyclerView.setHasFixedSize(true); //Taille fixe des éléments de la liste = optimisation du recyclerView

        monLayoutManager = new LinearLayoutManager(this);
        monRecyclerView.setLayoutManager(monLayoutManager);

        ArrayList<Planete> planeteList = new ArrayList<Planete>();
        initList(planeteList);

        monAdapter = new rec_adapter(planeteList); //cf. rec_adapter.java, classe de l’adaptateur
        monRecyclerView.setAdapter(monAdapter);
    }

    private void initList(ArrayList<Planete> planeteList) {
        Planete planete = new Planete();
        planete.setPlaneteName("Mercure");
        planete.setPlaneteDesc("La planète la plus proche du soleil");
        planete.setplaneteId(getResources().getIdentifier("mercure" , "drawable", getPackageName()));
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Vénus");
        planete.setPlaneteDesc("Une planète similaire à la Terre, mais inhabitable");
        planete.setplaneteId(getResources().getIdentifier("venus" , "drawable", getPackageName()));
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Terre");
        planete.setPlaneteDesc("Notre planète bleue");
        planete.setplaneteId(getResources().getIdentifier("terre" , "drawable", getPackageName()));
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Mars");
        planete.setPlaneteDesc("Aussi appelée la planète rouge");
        planete.setplaneteId(getResources().getIdentifier("mars" , "drawable", getPackageName()));
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Jupiter");
        planete.setPlaneteDesc("La plus grande planète du système solaire");
        planete.setplaneteId(getResources().getIdentifier("jupiter" , "drawable", getPackageName()));
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Saturne");
        planete.setPlaneteDesc("Connue pour ses anneaux");
        planete.setplaneteId(getResources().getIdentifier("saturne" , "drawable", getPackageName()));
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Uranus");
        planete.setPlaneteDesc("Cette planète est très éloignée de la Terre");
        planete.setplaneteId(getResources().getIdentifier("uranus" , "drawable", getPackageName()));
        planeteList.add(planete);

        planete = new Planete();
        planete.setPlaneteName("Neptune");
        planete.setPlaneteDesc("La dernière planète du système solaire (car Pluton n'est pas une planète)");
        planete.setplaneteId(getResources().getIdentifier("neptune" , "drawable", getPackageName()));
        planeteList.add(planete);
    }
}