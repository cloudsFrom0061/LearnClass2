package com.mj.cloudsfromocean.learnclass.presenter.ipresenter;

import android.content.Context;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.List;

/**
 * persent的接口
 * Created by Administrator on 2017/7/1 0001.
 */
public interface ILearnMVPPresenter {
    void submirData(Context context,List<EditText> editText,ProgressBar progressBar);
    void initData(List<EditText> editText);
}
