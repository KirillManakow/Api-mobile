package com.example.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMask  extends BaseAdapter {
    private Context mContext;
    List<Mask> maskList;

    public AdapterMask(Context mContext, List<Mask> listProduct) {
        this.mContext = mContext;
        this.maskList = listProduct;
    }

    @Override
    public int getCount() {
        return maskList.size();
    }

    @Override
    public Object getItem(int i) {
        return maskList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return maskList.get(i).getId_zakaz();
    }

    private Bitmap getUserImage(String encodedImg)
    {
            byte[] bytes;
        if(encodedImg!=null&& !encodedImg.equals("null")) {
            bytes = Base64.decode(encodedImg, Base64.DEFAULT);
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        }
        else
        {
            return null;
         //   return BitmapFactory.decodeResource(nContext.getResources(), R.drawable.zaglushka);
        }
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View v = View.inflate(mContext,R.layout.item_layuot,null);
        TextView Title = v.findViewById(R.id.Name_device);
        TextView User = v.findViewById(R.id.User_name);
        TextView Price = v.findViewById(R.id.Price);
        ImageView imageView = v.findViewById(R.id.Image_device);
        Mask mask = maskList.get(i);
        Title.setText(mask.getNazvanie());
        User.setText(mask.getUsers());
        Price.setText(mask.getZena());

        //  imageView.setImageBitmap(getUserImage(mask.get()));


        return v;
    }
}

