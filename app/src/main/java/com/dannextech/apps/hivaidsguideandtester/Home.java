package com.dannextech.apps.hivaidsguideandtester;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {

    Button btnGetStarted;
    PageNo pageNo = new PageNo();
    String TAG = "Page Number: ";

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.home, container, false);
        btnGetStarted = (Button) rootView.findViewById(R.id.btnGetStarted);

        final NavigationDrawer drawer = new NavigationDrawer();
        Log.i(TAG,pageNo.getPageNo());
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pageNo.setPageNo("0");
                Fragment fragment = new HivAids();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.myFragment,fragment);
                fragmentTransaction.commitAllowingStateLoss();

            }
        });
        return rootView;
    }



}
