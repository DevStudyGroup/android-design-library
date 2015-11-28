package com.example.android.materialdesigncodelab.presentation.fragments;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.android.materialdesigncodelab.R;

/**
 * Created by Armando on 11/25/2015.
 */
public class CardContentFragment extends BaseFragment {

    RecyclerView recyclerView;

    @Override
    protected void onCreateVew(View view) {
        super.onCreateVew(view);
        recyclerView = (RecyclerView) view;
        ContentAdapter adapter = new ContentAdapter();
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

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.item_card, parent, false));

            Button button = (Button) itemView.findViewById(R.id.action_button);
            button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Snackbar.make(v, "Action is pressed", Snackbar.LENGTH_LONG).show();
                }
            });

            ImageButton favoriteImageButton = (ImageButton) itemView.findViewById(R.id.favorite_button);
            favoriteImageButton.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Snackbar.make(v, "Image is pressed", Snackbar.LENGTH_LONG).show();
                }
            });

            ImageButton shareImageButton = (ImageButton) itemView.findViewById(R.id.share_button);
            shareImageButton.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Snackbar.make(v, "ShareImage is pressed", Snackbar.LENGTH_LONG).show();
                }
            });

        }


    }

    public static class ContentAdapter extends RecyclerView.Adapter<ViewHolder> {
        // Set numbers of List in RecyclerView.
        private static final int LENGTH = 18;

        public ContentAdapter() {
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            // no-op
        }

        @Override
        public int getItemCount() {
            return LENGTH;
        }
    }

}
