package jajodia.aditya.com.lab4q1;


import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;


public class ListFrag extends ListFragment {


    public ListFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String fruits[]={"Kitkat","Lollipop","Marshmallow"};
        int a[]={R.drawable.k,R.drawable.l,R.drawable.m};
        ArrayAdapter arrayAdapter=new CustomAdapter(getActivity(),R.layout.single_row,fruits,a);
        setListAdapter(arrayAdapter);
    }
}
