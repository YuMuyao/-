package com.fanxiaoyudemo.myapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.fanxiaoyudemo.myapplication.JavaBean.Goods;
import com.fanxiaoyudemo.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class RecordsAdapter extends BaseAdapter {
    private List<Goods> myRecords;
    private Context myContext;
    public RecordsAdapter(List<Goods> myRecords, Context myContext){
        this.myRecords=myRecords;
        this.myContext=myContext;
        myRecords=new ArrayList<Goods>();
        myRecords.add(0,new Goods("goods_name","车辆",100,"","","","","2020-5-31",null,""));

    }

    public int getCount() {
        return myRecords.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(myContext).inflate(R.layout.item_list_records,parent,false);
        TextView GOODS_NAME=(TextView)convertView.findViewById(R.id.goods_name);
        TextView PRICE=(TextView)convertView.findViewById(R.id.price);
        TextView SELLER_NAME=(TextView)convertView.findViewById(R.id.seller_name);
        TextView BUYER_NAME=(TextView)convertView.findViewById(R.id.buyer_name);
        GOODS_NAME.setText(myRecords.get(position).getGoods_name());
        PRICE.setText(myRecords.get(position).getPriceString());
        SELLER_NAME.setText(myRecords.get(position).getSeller_name());
        BUYER_NAME.setText(myRecords.get(position).getBuyer_name());
        return convertView;
    }
}
