package com.fanxiaoyudemo.myapplication.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.fanxiaoyudemo.myapplication.JavaBean.Goods;
import com.fanxiaoyudemo.myapplication.R;
import com.fanxiaoyudemo.myapplication.UserInterface.DetailActivity;

import java.util.ArrayList;
import java.util.List;

public class GoodsAdapter extends BaseAdapter {
    private List<Goods> myGoods;
    private Context myContext;
    public GoodsAdapter(List<Goods> myGoods,Context myContext){
        this.myGoods=myGoods;
        this.myContext=myContext;
        myGoods=new ArrayList<Goods>();
        myGoods.add(0,new Goods("goods_name","车辆",100,"","","","","2020-5-31",null,""));
    }

    public int getCount() {
        return myGoods.size();
    }

    public Object getItem(int position) {
        return myGoods.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(myContext).inflate(R.layout.item_list_goods, parent, false);
            holder = new ViewHolder();
            holder.PHOTO = (ImageView) convertView.findViewById(R.id.photo);
            holder.GOODS_NAME = (TextView) convertView.findViewById(R.id.goods_name);
            holder.PRICE = (TextView) convertView.findViewById(R.id.price);

            holder.RELEASE_TIME = (TextView) convertView.findViewById(R.id.release_time);

            holder.DETAILS = (Button) convertView.findViewById(R.id.details);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
//        PHOTO.setImageDrawable(myGoods.get(position).getPhoto());
        holder.GOODS_NAME.setText((myGoods.get(position)).getGoods_name());
        holder.PRICE.setText(myGoods.get(position).getPriceString());

        holder.RELEASE_TIME.setText(myGoods.get(position).getRelease_time());

        holder.DETAILS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("position",String.valueOf(position));//设置参数,""
                intent.setClass(((Activity) myContext), DetailActivity.class);//从哪里跳到哪里
                ((Activity) myContext).startActivity(intent);
            }
        });
        return convertView;
    }
    class ViewHolder{
        ImageView PHOTO;
        TextView GOODS_NAME;
        TextView PRICE;
        TextView RELEASE_TIME;
        Button DETAILS;
    }
}
