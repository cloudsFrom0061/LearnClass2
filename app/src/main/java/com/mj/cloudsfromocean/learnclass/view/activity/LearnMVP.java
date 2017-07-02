package com.mj.cloudsfromocean.learnclass.view.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.mj.cloudsfromocean.learnclass.R;
import com.mj.cloudsfromocean.learnclass.presenter.compl.LearnMVPPersenterCompl;
import com.mj.cloudsfromocean.learnclass.presenter.ipresenter.ILearnMVPPresenter;
import com.mj.cloudsfromocean.learnclass.view.interfaceview.ILearnMVPView;

import java.util.ArrayList;
import java.util.List;

public class LearnMVP extends Activity implements ILearnMVPView,View.OnClickListener{

    private LearnMVPPersenterCompl learnMVPPersenterCompl;
    private List<EditText> editTextList;
    private ProgressBar progressBar;
    private Button buttonSubmit;
    private Button buttonClean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_mvp);
        init();
        initView();
    }

    @Override
    public void initView() {
        editTextList.add((EditText) findViewById(R.id.age));
        editTextList.add((EditText) findViewById(R.id.gender));
        editTextList.add((EditText) findViewById(R.id.hobby));
        editTextList.add((EditText) findViewById(R.id.name));
        progressBar = (ProgressBar) findViewById(R.id.submit_pro);
        buttonClean = (Button) findViewById(R.id.clean);
        buttonSubmit = (Button) findViewById(R.id.submit);
        buttonSubmit.setOnClickListener(this);
        buttonClean.setOnClickListener(this);
//        progressBar.setBackgroundColor(getResources().getColor(R.style.));
    }

    @Override
    public void initData() {
        learnMVPPersenterCompl.initData(editTextList);
    }

    @Override
    public void submitData() {
        learnMVPPersenterCompl.submirData(getApplicationContext(),editTextList,progressBar);
    }

    @Override
    public void init() {
        learnMVPPersenterCompl = new LearnMVPPersenterCompl();
        editTextList = new ArrayList<EditText>();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.clean:
                initData();
                break;
            case R.id.submit:
                submitData();
                break;

        }
    }
}
