package com.dannextech.apps.hivaidsguideandtester;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class History extends Fragment {

    PageNo pageNo = new PageNo();
    public History() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        pageNo.setPageNo("1");
        Log.i("Page Number: ",pageNo.getPageNo());
        return inflater.inflate(R.layout.history, container, false);
    }

}
