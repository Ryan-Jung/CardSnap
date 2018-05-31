package cardsnap.com.cardsnap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Date;

import cardsnap.com.cardsnap.model.Card;
import cardsnap.com.cardsnap.recycler.CardRecyclerAdapter;

public class MainActivity extends AppCompatActivity implements  CardRecyclerAdapter.ItemClickListener {
    CardRecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Card> cards = new ArrayList<>();
        for(int i = 0; i < 36; i++){
            cards.add(new Card("Hey",new Date(), 1));
        }

        RecyclerView recyclerView = findViewById(R.id.rvCards);
        int numberOfCols = 7;
        recyclerView.setLayoutManager(new GridLayoutManager(this,numberOfCols));
        adapter = new CardRecyclerAdapter(this,cards);
        adapter.setOnClickListner(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Log.i("tag", "You clicked " + position);
    }
}
