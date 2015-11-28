package com.example.android.materialdesigncodelab.presentation.fragments;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.materialdesigncodelab.R;

/**
 * Created by Armando on 11/25/2015.
 */
public class ListContentFragment extends BaseFragment {

    RecyclerView recyclerView;

    @Override
    protected void onCreateVew(View view) {
        super.onCreateVew(view);

        ContentAdapter adapter = new ContentAdapter();
        recyclerView = (RecyclerView) view;
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    @Override
    protected void onCreateVew() {

    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.recycler_view;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.item_list, parent, false));
        }
    }

    public static class ContentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        // Set numbers of List in RecyclerView.
        private static final int LENGTH = 18;

        public ContentAdapter() {
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            // no-op
        }

        @Override
        public int getItemCount() {
            return LENGTH;
        }
    }


}
