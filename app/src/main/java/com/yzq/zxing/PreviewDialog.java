package com.yzq.zxing;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.ImageView;

public class PreviewDialog extends Dialog {

    private ImageView mImageView;
    private Bitmap mBitmap;

    public PreviewDialog(@NonNull Context context, Bitmap bitmap) {
        super(context);
        mBitmap = bitmap;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_preview);
        mImageView = findViewById(R.id.preview_image);
        mImageView.setImageBitmap(mBitmap);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        mBitmap = null;
    }
}
