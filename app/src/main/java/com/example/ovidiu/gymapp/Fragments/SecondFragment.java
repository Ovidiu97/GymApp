package com.example.ovidiu.gymapp.Fragments;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ovidiu.gymapp.AdaptorMuschi;
import com.example.ovidiu.gymapp.R;
import com.example.ovidiu.gymapp.muschi;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment {


    private View view;
    private ListView lista;
    private List<muschi> list = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment2,container,false);

        lista = (ListView)view.findViewById(R.id.listaMuschi);
        AdaptorMuschi adaptor = new AdaptorMuschi(view.getContext(),R.layout.adaptorlistamuschi,list);

        muschi obiect1 = new muschi("CHEST",getResources().getDrawable(R.drawable.chest));
        muschi obiect2 = new muschi("BACK",getResources().getDrawable(R.drawable.back));
        muschi obiect3 = new muschi("BICEPS",getResources().getDrawable(R.drawable.biceps));
        muschi obiect4 = new muschi("TRICEPS",getResources().getDrawable(R.drawable.triceps));
        muschi obiect5 = new muschi("FOREARMS",getResources().getDrawable(R.drawable.forearms));
        muschi obiect6 = new muschi("SHOULDERS",getResources().getDrawable(R.drawable.shoulders));
        muschi obiect7 = new muschi("TRAPS",getResources().getDrawable(R.drawable.traps));
        muschi obiect8 = new muschi("QUADS",getResources().getDrawable(R.drawable.quads));
        muschi obiect9 = new muschi("FEMURAL",getResources().getDrawable(R.drawable.femural));
        muschi obiect10 = new muschi("CALFS",getResources().getDrawable(R.drawable.calfs));
        muschi obiect11 = new muschi("ABS",getResources().getDrawable(R.drawable.abs));
        list.add(obiect1);
        list.add(obiect2);
        list.add(obiect3);
        list.add(obiect4);
        list.add(obiect5);list.add(obiect6);list.add(obiect7);list.add(obiect8);list.add(obiect9);list.add(obiect10);
        list.add(obiect11);
        lista.setAdapter(adaptor);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                getFragmentManager().beginTransaction().replace(R.id.container,FragmentDetalii.newInstance(list.get(position).a)).addToBackStack("").commit();
            }
        });

        return view;

    }
}