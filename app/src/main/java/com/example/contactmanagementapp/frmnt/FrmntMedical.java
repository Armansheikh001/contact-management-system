package com.example.contactmanagementapp.frmnt;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.contactmanagementapp.R;
import com.example.contactmanagementapp.adapters.RecycleViewAdapter;
import com.example.contactmanagementapp.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class FrmntMedical extends Fragment {


    RecyclerView recyclerView;
    View v;
    List<Contact> listCont;
    public FrmntMedical(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = (ViewGroup) inflater.inflate(R.layout.medical_fragment, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.medical_recycleView);
        RecycleViewAdapter viewAdapter = new RecycleViewAdapter(getContext(), listCont);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(viewAdapter);
        return v;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listCont = new ArrayList<>();
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
    }
}
