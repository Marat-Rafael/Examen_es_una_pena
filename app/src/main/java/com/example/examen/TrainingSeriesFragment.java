package com.example.examen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrainingSeriesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrainingSeriesFragment extends Fragment {

    LinearLayout linearLayout;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TrainingSeriesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TrainingSeriesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TrainingSeriesFragment newInstance(String param1, String param2) {
        TrainingSeriesFragment fragment = new TrainingSeriesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_training_series, container, false);

//        for (int i = 0; i < Entrenament.entrenaments.length; i++) {
//
//            linearLayout = getView().findViewById(R.id.layoutConImagenes);
//
//            //ImageView imageView = (ImageView) getView().findViewById(R.id.foo);
//
//        }



        return view;
    }
}