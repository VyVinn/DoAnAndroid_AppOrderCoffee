package com.example.android_appordercoffee.DAL;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.android_appordercoffee.DTO.MenuDTO;
import com.example.android_appordercoffee.R;
import java.util.ArrayList;
import java.util.List;

public class MenuAdapterDAL extends ArrayAdapter<MenuDTO> {
    private Context ct;
    private ArrayList<MenuDTO> arr;
    public MenuAdapterDAL(@NonNull Context context, int resource, @NonNull List<MenuDTO> objects) {
        super(context, resource, objects);
        this.ct = context;
        this.arr = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if(convertView == null) {
            LayoutInflater i = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = i.inflate(R.layout.background_menu, null);
        }
        if(arr.size() > 0)
        {
            MenuDTO m = arr.get(position);
        }
        return convertView;
    }
}
