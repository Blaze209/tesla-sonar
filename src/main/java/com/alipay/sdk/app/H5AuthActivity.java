package com.alipay.sdk.app;

/* JADX INFO: loaded from: classes3.dex */
public class H5AuthActivity extends H5PayActivity {
    @Override // com.alipay.sdk.app.H5PayActivity
    public void b() {
        Object obj = AuthTask.f20106c;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }
}
