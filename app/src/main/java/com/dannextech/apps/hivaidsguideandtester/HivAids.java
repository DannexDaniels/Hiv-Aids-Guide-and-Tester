package com.dannextech.apps.hivaidsguideandtester;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HivAids extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    String[] hivItems = {"History","Mode of Transmission","Signs & Symptoms","Stages of HIV","Treatment"};


    public HivAids() {
        // Required empty public constructor
    }

    PageNo pageNo = new PageNo();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.hiv_aids, container, false);
        pageNo.setPageNo("0");
        recyclerView = (RecyclerView) rootView.findViewById(R.id.hivList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        RecylerViewAdapter adapter = new RecylerViewAdapter(hivItems,getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Log.i("Page Number: ",pageNo.getPageNo());
        return rootView;
    }

}
