package com.dannextech.apps.hivaidsguideandtester;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by amoh on 11/13/2017.
 */

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.ViewHolder> {
    String[] viewItems;
    Context context;
    PageNo pageNo = new PageNo();

    public RecylerViewAdapter(String[] viewItems, Context context){
        this.viewItems = viewItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.hiv_aids_list_details,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final RecylerViewAdapter.ViewHolder holder, final int position) {
        String item = viewItems[position];
        holder.hivSubTitle.setText(item);

        holder.lvSubTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.lvSubTitle.setBackgroundColor(R.color.colorAccent);

                switch (position){
                    case 0:
                        Fragment fragment = new History();
                        FragmentTransaction fragmentTransaction = ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out);
                        fragmentTransaction.replace(R.id.myFragment,fragment);
                        fragmentTransaction.commitAllowingStateLoss();
                        break;
                    case 2:
                        Fragment fragmentSign = new SignSymptoms();
                        FragmentTransaction fragmentTransactionSign = ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction();
                        fragmentTransactionSign.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out);
                        fragmentTransactionSign.replace(R.id.myFragment,fragmentSign);
                        fragmentTransactionSign.commitAllowingStateLoss();
                        break;
                    case 3:
                        Fragment fragmentStages = new Stages();
                        FragmentTransaction fragmentTransactionStages = ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction();
                        fragmentTransactionStages.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out);
                        fragmentTransactionStages.replace(R.id.myFragment,fragmentStages);
                        fragmentTransactionStages.commitAllowingStateLoss();
                        break;
                    case 4:
                        Fragment fragmentTreatment = new Treatment();
                        FragmentTransaction fragmentTransactionTreatment = ((AppCompatActivity) context).getSupportFragmentManager().beginTransaction();
                        fragmentTransactionTreatment.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out);
                        fragmentTransactionTreatment.replace(R.id.myFragment,fragmentTreatment);
                        fragmentTransactionTreatment.commitAllowingStateLoss();
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return viewItems.length;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView hivSubTitle;
        LinearLayout lvSubTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            hivSubTitle = itemView.findViewById(R.id.tvHivSubTitle);
            lvSubTitle = itemView.findViewById(R.id.lvSubtitle);
        }
    }
}
