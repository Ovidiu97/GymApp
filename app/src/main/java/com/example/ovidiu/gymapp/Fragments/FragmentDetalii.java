package com.example.ovidiu.gymapp.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ovidiu.gymapp.AdaptorMuschi;
import com.example.ovidiu.gymapp.R;
import com.example.ovidiu.gymapp.muschi;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;


public class FragmentDetalii extends Fragment {
    private static FragmentDetalii fragment;
    private static String muschi;
    private View view;
    private ListView lista;
    private List<muschi> listt = new ArrayList<>();


    public static FragmentDetalii newInstance(String mobiect) {
        if (fragment == null)
            fragment = new FragmentDetalii();
        muschi = mobiect;
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_detalii, container, false);
       // Toast.makeText(view.getContext(), muschi, Toast.LENGTH_SHORT).show();

        lista = (ListView) view.findViewById(R.id.listaExercitii);
        AdaptorMuschi adaptor1 = new AdaptorMuschi(view.getContext(), R.layout.adaptorlistamuschi, listt);

        listt.clear();
        if (muschi == "CHEST") {
            muschi obiect1 = new muschi("BENCH DUMBBELL", getResources().getDrawable(R.drawable.benchdumbbell));
            listt.add(obiect1);
            muschi obiect2 = new muschi("CABLLE CROSSOVER", getResources().getDrawable(R.drawable.cabllecrossover));
            listt.add(obiect2);
            muschi obiect3 = new muschi("BARBELLBENCHPRESS", getResources().getDrawable(R.drawable.barbellbenchpress));
            listt.add(obiect3);
            muschi obiect4 = new muschi("DUMBBELL FLY", getResources().getDrawable(R.drawable.fly));
            listt.add(obiect4);
            muschi obiect5 = new muschi("INCLINE FLY", getResources().getDrawable(R.drawable.inclinefly));
            listt.add(obiect5);
            muschi obiect6 = new muschi("INCLINE PRESSES", getResources().getDrawable(R.drawable.inclinepresses));
            listt.add(obiect6);
            muschi obiect7 = new muschi("INCLINE DUMBBELL PRESSES", getResources().getDrawable(R.drawable.inclinedumbbellpresses));
            listt.add(obiect7);
            muschi obiect8 = new muschi("BENCH DUMBBELL", getResources().getDrawable(R.drawable.benchdumbbell));
            listt.add(obiect8);

        } else if (muschi == "BACK") {


        } else if (muschi == "BICEPS") {



        } else if (muschi == "TRICEPS") {


        } else if (muschi == "FOREARMS") {

        } else if (muschi == "SHOULDERS") {


        } else if (muschi == "TRAPS") {

        } else if (muschi == "QUADS") {


        } else if (muschi == "FEMURAL") {

        } else if (muschi == "CALFS") {


        } else if (muschi == "ABS") {

        }
        lista.setAdapter(adaptor1);

        return view;
    }


}
