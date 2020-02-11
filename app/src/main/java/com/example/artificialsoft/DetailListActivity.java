package com.example.artificialsoft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


public class DetailListActivity extends AppCompatActivity {

    RecyclerView recyclerVieww;
    BalanceAdapter balanceAdapter;
    ArrayList<InternetBalanceDetails> internetBalanceDetails;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);

        Intent intent = getIntent();

        TextView textView = findViewById(R.id.carrier_namee);

        String datasize = intent.getStringExtra("datasize");

        recyclerVieww= findViewById(R.id.recycler_view_list);
        recyclerVieww.setHasFixedSize(true);
        recyclerVieww.setLayoutManager(new GridLayoutManager(this, 2));

        internetBalanceDetails = new ArrayList<>();

        if (datasize.equals("airtel"))
        {
            textView.setText(datasize);
            internetBalanceDetails.add(new InternetBalanceDetails("100GB","80tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("13GB","345tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("142GB","435tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("3GB","234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("12GB","1234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1100GB","35tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1060GB","82tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1007GB","807tk"));
        }

        else if (datasize.equals("banglalink"))
        {
            textView.setText(datasize);
            internetBalanceDetails.add(new InternetBalanceDetails("10GB","80tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1GB","345tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("12GB","435tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1GB","234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1GB","1234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("100GB","35tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("160GB","82tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("107GB","807tk"));
        }
        else if (datasize.equals("grameenphone"))
        {
            textView.setText(datasize);
            internetBalanceDetails.add(new InternetBalanceDetails("10GB","80tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1GB","345tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("12GB","435tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1GB","234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1GB","1234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("100GB","35tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("160GB","82tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("107GB","807tk"));
        }

        else if (datasize.equals("robi"))
        {
            textView.setText(datasize);
            internetBalanceDetails.add(new InternetBalanceDetails("100GB","80tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("13GB","345tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("142GB","435tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("3GB","234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("12GB","1234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1100GB","35tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1060GB","82tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1007GB","807tk"));
        }

        else if (datasize.equals("teletalk"))
        {
            textView.setText(datasize);
            internetBalanceDetails.add(new InternetBalanceDetails("10GB","80tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1GB","345tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("12GB","435tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1GB","234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("1GB","1234tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("100GB","35tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("160GB","82tk"));
            internetBalanceDetails.add(new InternetBalanceDetails("107GB","807tk"));
        }


        balanceAdapter = new BalanceAdapter(DetailListActivity.this, internetBalanceDetails);
        recyclerVieww.setAdapter(balanceAdapter);




    }
}
