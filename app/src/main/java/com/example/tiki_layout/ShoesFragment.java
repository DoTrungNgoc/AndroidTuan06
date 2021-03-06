package com.example.tiki_layout;

import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShoesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShoesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShoesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShoesFragment newInstance(String param1, String param2) {
        ShoesFragment fragment = new ShoesFragment();
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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private ListView lvShoes;
    private List<Shoes> list;
    private ShoesAdapter adapter;
    private ImageView img;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shoes, container, false);
        lvShoes = view.findViewById(R.id.lvShoes);
        list = new ArrayList<>();
        list.add(new Shoes(R.drawable.shoes_rm_preview_b,"Nike shoes-discount 50%"));
        list.add(new Shoes(R.drawable.shoes_rm_preview_a,"Nike shoes-discount 50%"));
        list.add(new Shoes(R.drawable.shoes_rm_purple,"Nike shoes-discount 50%"));
        list.add(new Shoes(R.drawable.shoes_rm_preview,"Nike shoes-discount 50%"));
        list.add(new Shoes(R.drawable.shoes_white_removebg_preview,"Nike shoes-discount 50%"));
        list.add(new Shoes(R.drawable.shoes_rm_yellow,"Nike shoes-discount 50%"));

        adapter = new ShoesAdapter(getActivity(),R.layout.shoes_item,list);
        lvShoes.setAdapter(adapter);



        lvShoes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                img = getActivity().findViewById(R.id.imageViewDetail);
                img.setImageResource(list.get(position).getImg());
            }
        });

        return view;
    }
}