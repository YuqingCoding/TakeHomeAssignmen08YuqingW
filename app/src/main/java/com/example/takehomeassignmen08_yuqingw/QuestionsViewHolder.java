package com.example.takehomeassignmen08_yuqingw;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView questionPlayer;
    public TextView playerQuestion;
    public ImageView playerImage;
    public TextView isTrue;

    public QuestionsViewHolder(View itemView, final Context context){
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.card_view);
        questionPlayer=(TextView) itemView.findViewById(R.id.question_player);
        playerQuestion=(TextView)itemView.findViewById(R.id.player_question);
        playerImage=(ImageView) itemView.findViewById(R.id.player_image);
        isTrue=(TextView) itemView.findViewById(R.id.question_isTrue);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String isTrue1=isTrue.getText().toString();


                Toast.makeText(context,isTrue1,Toast.LENGTH_SHORT).show();
            }
        });

    }


}