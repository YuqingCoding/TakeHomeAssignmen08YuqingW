package com.example.takehomeassignmen08_yuqingw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_View);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // setting Adapter to the QuestionsAdapter that needs two bits of information
        //1. List of questions
        //2. The context to put them in
        recyclerView.setAdapter(new QuestionsAdapter(questions, this));
    }

    public void initialData() {
        questions = new ArrayList<>();
        questions.add(new Question(R.string.muller, R.string.question_muller, R.mipmap.muller, true));
        questions.add(new Question(R.string.neuer, R.string.question_neuer, R.mipmap.neuer, true));
        questions.add(new Question(R.string.ozil, R.string.question_ozil, R.mipmap.ozil, true));
        questions.add(new Question(R.string.schweinsteiger, R.string.question_schweinsteiger, R.mipmap.schweinsteiger, true));
        questions.add(new Question(R.string.reus, R.string.question_reus, R.mipmap.reus, true));
        questions.add(new Question(R.string.goetze, R.string.question_goetze, R.mipmap.goetze, true));
    }
}