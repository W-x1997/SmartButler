package com.wx.smartbutler.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import com.imooc.smartbutler.R;
import com.xys.libzxing.zxing.encoding.EncodingUtils;

/**
 *  项目名：  SmartButler
 *  创建者:   wx
 *  创建时间:  3/19
 */
public class QrCodeActivity extends BaseActivity {

    //我的二维码
    private ImageView iv_qr_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);

        initView();
    }

    private void initView() {

        iv_qr_code = (ImageView) findViewById(R.id.iv_qr_code);
        //屏幕的宽
        int width = getResources().getDisplayMetrics().widthPixels;

       Bitmap qrCodeBitmap = EncodingUtils.createQRCode("我是智能管家", width / 2, width / 2,
               BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
       iv_qr_code.setImageBitmap(qrCodeBitmap);
    }
}
