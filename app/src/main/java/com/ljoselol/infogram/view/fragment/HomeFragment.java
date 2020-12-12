package com.ljoselol.infogram.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ljoselol.infogram.Adapter.CardViewAdapter;
import com.ljoselol.infogram.R;
import com.ljoselol.infogram.model.Image;

import java.util.ArrayList;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home,container,false);
        // Inflate the layout for this fragment
        //tolbar
            showToolBar(getString(R.string.title_home_fragment),false,view);
            //recyclerview

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        //layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //adaptere
        CardViewAdapter cardViewAdapter = new CardViewAdapter(buildImages(),R.layout.cardview_image,getActivity());
        recyclerView.setAdapter(cardViewAdapter);


        return view;

    }

    public void showToolBar(String titulo,boolean botonSubir,View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) Objects.requireNonNull(getActivity())).setSupportActionBar(toolbar);

        Objects.requireNonNull(((AppCompatActivity) getActivity()).getSupportActionBar()).setTitle(titulo);
        Objects.requireNonNull(((AppCompatActivity) getActivity()).getSupportActionBar()).setDisplayHomeAsUpEnabled(botonSubir);

    }

    //crear la lista de imagenes
    public ArrayList<Image> buildImages(){
        ArrayList<Image> images = new ArrayList<>();
        images.add(new Image("https://www.opinion.com.bo/media/opinion/images/2020/09/16/2020091612445683884.jpg","pedro Valdivia","2 dias.","1 me gusta" ));
        images.add(new Image("https://tipsparatuviaje.com/wp-content/uploads/2019/07/salar-de-uyuni.jpg","jose mendez","5 dias.","5 me gusta" ));
        images.add(new Image("https://www.energiabolivia.com/images/digital/ed-60-digital/energia-bolivia-60-medio-ambiente.jpg","oscar vergara","7 dias.","4 me gusta" ));
        images.add(new Image("https://www.infodiez.com/wp-content/uploads/2017/02/6maravillasdebolivia_infodiez.jpg","aquiles bailo","8 dias.","8 me gusta" ));
        images.add(new Image("https://campechebolivia.com/wp-content/uploads/2017/10/tours3.jpg","armando paredes","3 dias.","9 me gusta" ));
        images.add(new Image("https://www.opinion.com.bo/media/opinion/images/2020/10/30/2020103023175356766.jpg","Zacarias Flores","4 dias.","3 me gusta" ));
        images.add(new Image("https://www.laregion.bo/wp-content/uploads/2018/11/METROPOLITANA-COCHABAMBA-10-1024x682.jpg","analisa melano","6 dias.","2 me gusta" ));
        images.add(new Image("https://www.mmaya.gob.bo/wp-content/uploads/2020/02/Rrurre-destino-1.jpg","jose alcon","5 dias.","4 me gusta" ));
        images.add(new Image("https://thumbs.dreamstime.com/z/monta%C3%B1as-tur%C3%ADsticas-que-caminan-bolivia-de-la-nieve-del-selfie-del-monta%C3%B1%C3%A9s-71015255.jpg","beymar rojas","8 dias.","7 me gusta" ));
        images.add(new Image("https://i.imgur.com/qC9XjKn.jpg","diego bustillo","9 dias.","5 me gusta" ));
        return images;

    }

}