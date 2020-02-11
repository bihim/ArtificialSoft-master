package com.example.artificialsoft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class BalanceAdapter extends RecyclerView.Adapter<BalanceAdapter.BalanceViewHolder>
{
    private Context context;
    private ArrayList<InternetBalanceDetails> internetBalanceDetails;
    private OnItemClickListner listner;




    public interface OnItemClickListner
    {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListner mylistener)
    {
        listner = mylistener;
    }

    //constructor
    public BalanceAdapter(Context myContext, ArrayList<InternetBalanceDetails> internetBalanceDetails)
    {
        context = myContext;
        this.internetBalanceDetails = internetBalanceDetails;
    }


    //creating viewholder to get the layout
    @NonNull
    @Override
    public BalanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.balance_show, parent, false);
        return new BalanceViewHolder(view);
    }


    //setting all the data
    @Override
    public void onBindViewHolder(@NonNull BalanceViewHolder holder, int position)
    {
        InternetBalanceDetails selectedItem = internetBalanceDetails.get(position);



        /*String imageUrl = selectedItem.getImageURL();
        String id = selectedItem.getId();
        String user = selectedItem.getUser();
        String name = selectedItem.getName();
        String designation = selectedItem.getDesignation();

        holder.textViewId.setText("ID: "+id);
        holder.textViewUser.setText("User: "+user);
        holder.textViewName.setText("Name: "+name);
        holder.textViewWho.setText("Designation: "+designation);
        holder.carrierName.setText(selectedItem.getOperatorName());

        holder.circleImageView.setImageResource(selectedItem.getImageID());*/

        String datasizee = selectedItem.getDatasize();
        String balancee = selectedItem.getBalance();

        holder.datasize.setText(datasizee);
        holder.balance.setText(balancee);

        //Glide.with(context).load(imageUrl).into(holder.circleImageView);
    }

    //item size
    @Override
    public int getItemCount()
    {
        return internetBalanceDetails.size();
    }


    //calling all the references of items of layout
    public class BalanceViewHolder extends RecyclerView.ViewHolder
    {

        TextView datasize, balance;

        public BalanceViewHolder(@NonNull View itemView)
        {
            super(itemView);

            datasize = itemView.findViewById(R.id.details_data_adapter);
            balance = itemView.findViewById(R.id.balance_adapter);

            /*circleImageView = itemView.findViewById(R.id.example_image);
            textViewId = itemView.findViewById(R.id.example_id);
            textViewUser = itemView.findViewById(R.id.example_user);
            textViewName = itemView.findViewById(R.id.example_name);
            textViewWho = itemView.findViewById(R.id.example_who);
            carrierName = itemView.findViewById(R.id.carrier_name);*/


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    if (listner!= null) //checks if it has listener
                    {
                        int position = getAdapterPosition(); //storing position
                        if (position != RecyclerView.NO_POSITION) //if position is listed
                        {
                            listner.onItemClick(position); //interface created
                        }
                    }
                }
            });
        }
    }
}
