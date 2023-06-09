package com.example.projekt_unfallbericht;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<Patient> list = new ArrayList<>();
    private int layoutID;
    private LayoutInflater inflater;


    public MyAdapter(Context ctx, List<Patient> list, int layoutID) {
        this.list = list;
        this.layoutID = layoutID;
        this.inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Patient patient = list.get(position);
        View listItem = (convertView == null) ? inflater.inflate(this.layoutID, null) : convertView;
        ((TextView) listItem.findViewById(R.id.listViewOrt)).setText(patient.getPlz() + " " + patient.getOrt());
        ((TextView) listItem.findViewById(R.id.listViewStrasse)).setText(patient.getStrasse() + " " + patient.getNr());
        return listItem;
    }
}
