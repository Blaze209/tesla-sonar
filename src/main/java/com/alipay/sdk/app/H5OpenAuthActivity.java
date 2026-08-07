package com.alipay.sdk.app;

import ai.a;
import android.content.Intent;
import android.net.Uri;
import com.adyen.checkout.components.core.Address;

/* JADX INFO: loaded from: classes3.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20110j = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public void b() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.f20110j) {
            try {
                a aVarA = a.C0043a.a(getIntent());
                if (aVarA != null) {
                    hh.a.h(this, aVarA, "", aVarA.f1114d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            a aVarA = a.C0043a.a(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th2) {
                String string = (intent == null || intent.getData() == null) ? Address.ADDRESS_NULL_PLACEHOLDER : intent.getData().toString();
                if (aVarA != null) {
                    hh.a.d(aVarA, "biz", "StartActivityEx", th2, string);
                }
                this.f20110j = true;
                throw th2;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
