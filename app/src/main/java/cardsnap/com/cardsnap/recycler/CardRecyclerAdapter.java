package cardsnap.com.cardsnap.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import cardsnap.com.cardsnap.R;
import cardsnap.com.cardsnap.model.Card;

public class CardRecyclerAdapter extends RecyclerView.Adapter<CardRecyclerAdapter.ViewHolder>  {

    private LayoutInflater mInflater;
    private ArrayList<Card> mCards;
    private ItemClickListener mItemClickListener;

    public CardRecyclerAdapter(Context context, ArrayList<Card> cards) {
        this.mInflater = LayoutInflater.from(context);
        mCards = cards;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =  mInflater.inflate(R.layout.cardview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if(mItemClickListener != null){
                mItemClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnClickListner(ItemClickListener itemClickListener){
        mItemClickListener = itemClickListener;
    }


}



