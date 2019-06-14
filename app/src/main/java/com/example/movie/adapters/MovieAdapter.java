package com.example.movie.adapters;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movie.R;
import com.example.movie.activities.MovieSearchListActivity;
import com.example.movie.data.entities.MovieEntityList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.NumberViewHolder>  {


    private  static  int viewHolderCount;
    private int numberItems;
    private Context context;
    private List<MovieEntityList> movieEntities;

    public MovieAdapter(List<MovieEntityList> movieEntities1, Context context) {
        this.context = context;
        if (movieEntities1.isEmpty()) {
            numberItems = 0;
        }
        else {
            numberItems = movieEntities1.size();
        }
        movieEntities = movieEntities1;
        viewHolderCount = 0;
    }

    public void func (List<MovieEntityList> movieEntities1) {
        movieEntities = movieEntities1;
        notifyDataSetChanged();
    }

    // создаем новые вьюхолдеры
    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.movie_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForListItem,parent,false);
        NumberViewHolder viewHolder = new NumberViewHolder(view);
        viewHolderCount++;
        return viewHolder;
    }

    // у созданных холдеров меняем их значения, во время прокрутки списка
    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MovieSearchListActivity) context).saveToPreferences(movieEntities.get(position));
            }
        });
        holder.bind(movieEntities,position);
    }

    // вернуть общее кол-во элементов в списке
    @Override
    public int getItemCount() {
        return movieEntities.size();
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView type;
        private TextView year;
        private View view;

        public NumberViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            type = itemView.findViewById(R.id.type);
            year = itemView.findViewById(R.id.year);
            this.view = itemView;
        }

        void bind(final List<MovieEntityList> movieEntities, final int listIndex) {
            title.setText(movieEntities.get(listIndex).Title);
            type.setText(movieEntities.get(listIndex).Type);
            year.setText(movieEntities.get(listIndex).Year);
        }

    }
}
