package com.mj.cloudsfromocean.learnclass.presenter.compl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mj.cloudsfromocean.learnclass.model.info.info.UserInfo;
import com.mj.cloudsfromocean.learnclass.model.info.utils.Utils;
import com.mj.cloudsfromocean.learnclass.presenter.ipresenter.ILearnMVPPresenter;

import java.util.List;


/**
 * Created by Administrator on 2017/7/1 0001.
 */
public class LearnMVPPersenterCompl implements ILearnMVPPresenter {
    @Override
    public void submirData(final Context context,final List<EditText> editText,final ProgressBar progressBar) {
        progressBar.setVisibility(View.VISIBLE);
        final Handler handler = new Handler(Looper.getMainLooper());
        new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                UserInfo userInfo = new UserInfo();
                if (Utils.JudgeIfNum(editText.get(0).getText().toString())) {
                    userInfo.setAge(Integer.parseInt(editText.get(0).getText().toString()));
                    userInfo.setSex(editText.get(1).getText().toString());
                    userInfo.setHobby(editText.get(2).getText().toString());
                    userInfo.setName(editText.get(3).getText().toString());

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setVisibility(View.INVISIBLE);
                            Toast.makeText(context, "提交成功", Toast.LENGTH_SHORT).show();
                            initData(editText);
                        }
                    });
                }else{
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setVisibility(View.INVISIBLE);
                            Toast.makeText(context, "年龄请正确填写（1-180）", Toast.LENGTH_SHORT).show();
                            initData(editText,0);
                        }
                    });
                }
            }
        }.start();
    }

    @Override
    public void initData(List<EditText> editText) {
        for (EditText ed:
             editText) {
            ed.setText("");
        }
    }

    /**
     * 选取填写错误的一栏重置
     * @param editText
     * @param position
     */
    public void initData(List<EditText> editText,int position){
        EditText ed = editText.get(position);
        ed.setText("");
    }
}
