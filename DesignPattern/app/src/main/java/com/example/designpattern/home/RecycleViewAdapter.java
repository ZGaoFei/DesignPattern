package com.example.designpattern.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designpattern.R;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyHolder> {
    private Context mContext;
    private List<ItemModel> mList = new ArrayList<>();

    public RecycleViewAdapter(Context context, List<ItemModel> list) {
        this.mContext = context;
        if (list != null && !list.isEmpty()) {
            mList.addAll(list);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getType();
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (viewType == DataHelper.ITEM_TYPE_TITLE) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_title_layout, parent, false);
        } else {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        }
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, final int position) {
        holder.textView.setText(mList.get(position).getTitle());
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WebViewActivity.start(mContext, mList.get(position).getUrl());
            }
        });
        if (holder.tvGitView != null) {
            holder.tvGitView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    WebViewActivity.start(mContext, mList.get(position).getGitUrl());
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class MyHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private TextView tvGitView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title_item);
            tvGitView = itemView.findViewById(R.id.tv_git_item);
        }
    }
}
