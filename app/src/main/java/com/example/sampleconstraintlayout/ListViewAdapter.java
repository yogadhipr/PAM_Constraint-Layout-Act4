package com.example.sampleconstraintlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ListViewAdapter extends BaseAdapter {

    //deklarasi variabel dengan jenis data context
    Context mContext;
    //deklarasi variabel dngn jenis data layout inflater
    LayoutInflater inflater;
    // deklarasi variabel dengan jenis data arraylist
    private ArrayList<ClassNama> arraylist;

    //membuat konstruktor ListViewAdapter
    public ListViewAdapter(Context context){
        mContext = context;

        inflater = LayoutInflater.from(mContext);

        this.arraylist = new ArrayList<ClassNama>();

        this.arraylist.addAll(home.classNamaArrayList);
    }
    public class  ViewHolder{
        TextView name;
    }

    @Override
    public int getCount() {

        return home.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {

        return home.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;

        if (view == null){
            holder = new ViewHolder();

            view = inflater.inflate(R.layout.activity_home, null);

            holder.name =(TextView) view.findViewById(R.id.datakontak);

            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(home.classNamaArrayList.get(i).getNama());

        return view;
    }
}
