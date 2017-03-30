package com.wlt.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.wlt.retrofit.bean.MenuBean;
import com.wlt.retrofit.bean.Verification;
import com.wlt.retrofit.network.NetWorks;

import rx.Observer;

public class MainActivity extends AppCompatActivity {

    private TextView mTv,mTv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv =(TextView) findViewById(R.id.main_tv);
        mTv2 =(TextView) findViewById(R.id.main_tv2);

        NetWorks.verfacationCodePost("15910435235", "123456", new Observer<Verification>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                mTv.setText(e.getLocalizedMessage());
                Log.e("MAIN2",e.getLocalizedMessage()+"--"+e.getMessage());
            }

            @Override
            public void onNext(Verification verification) {
                mTv.setText(verification.getUser().toString());
            }
        });






 NetWorks.Getcache(new Observer<MenuBean>() {
     @Override
     public void onCompleted() {
        //完成
     }

     @Override
     public void onError(Throwable e) {
         //异常
         mTv2.setText(e.getLocalizedMessage());
         Log.e("MAIN2",e.getLocalizedMessage()+"--"+e.getMessage());
     }

     @Override
     public void onNext(MenuBean baseBean) {
         //成功
         mTv2.setText(baseBean.toString());
     }
 });
    }
}
