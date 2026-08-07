package com.reactlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.facebook.react.uimanager.w;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes6.dex */
public class k extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f48403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48405c;

    public k(@NonNull Context context) {
        this(context, null);
    }

    private void b() {
        removeAllViews();
        PayButton payButton = new PayButton(this.f48403a);
        payButton.initialize(ButtonOptions.newBuilder().setAllowedPaymentMethods(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI).setButtonType(8).setButtonTheme(this.f48404b).setCornerRadius(this.f48405c).build());
        payButton.setOnClickListener(new View.OnClickListener() { // from class: com.reactlibrary.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48402a.c(view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(payButton, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        View view2 = (View) getParent();
        if (view2 != null) {
            view2.performClick();
        }
    }

    public void setCornerRadius(float f11) {
        this.f48405c = (int) w.h(f11);
        b();
    }

    public void setTheme(int i11) {
        this.f48404b = i11;
        b();
    }

    public k(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f48404b = 1;
        this.f48405c = 0;
        this.f48403a = context;
        b();
    }
}
