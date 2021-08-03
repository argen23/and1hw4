package com.example.and1hw4.SecondFragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and1hw4.MainActivity;
import com.example.and1hw4.MainActivity2;
import com.example.and1hw4.Models.User;
import com.example.and1hw4.R;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private RecyclerView rv;
    private Adapter adapter;
    private ArrayList<User> list= new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRv(view);
    }
    private void initRv( View view) {
        rv  = view.findViewById(R.id.rv);
        adapter = new Adapter();
        rv.setAdapter(adapter);

        adapter.setList(createList());
        adapter.setOnClickListener(new Adapter.OnClickListener() {
            @Override
            public void onClick() {
                Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(in);
            }
        });
    }

    private ArrayList<User> createList() {
        list = new ArrayList<>();
        list.add(new User("1","Молчат дома","Волны","4:21"));
        list.add(new User("2","Молчат дома","Клетка","4:41"));
        list.add(new User("3","Молчат дома","Люди надоели","2:58"));
        list.add(new User("4","Молчат дома","Танцевать","3:23"));
        list.add(new User("5","Молчат дома","На дне","4:07"));
        list.add(new User("6","Молчат дома","Судно (Борис Рыжий)","2:21"));
        list.add(new User("7","Молчат дома","Тоска","3:09"));

        return list;
    }
}