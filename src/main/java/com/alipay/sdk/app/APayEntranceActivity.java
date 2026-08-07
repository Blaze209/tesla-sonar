package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import fh.b;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class APayEntranceActivity extends Activity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f20101d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ai.a f20104c;

    public interface a {
        void a(String str);
    }

    @Override // android.app.Activity
    public void finish() {
        String str = this.f20103b;
        hh.a.b(this.f20104c, "biz", "BSAFinish", str + "|" + TextUtils.isEmpty(this.f20102a));
        if (TextUtils.isEmpty(this.f20102a)) {
            this.f20102a = b.a();
            ai.a aVar = this.f20104c;
            if (aVar != null) {
                aVar.l(true);
            }
        }
        if (str != null) {
            a aVarRemove = f20101d.remove(str);
            if (aVarRemove != null) {
                aVarRemove.a(this.f20102a);
            } else {
                hh.a.g(this.f20104c, "wr", "refNull", "session=" + str);
            }
        }
        try {
            super.finish();
        } catch (Throwable th2) {
            hh.a.c(this.f20104c, "wr", "APStartFinish", th2);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        hh.a.b(this.f20104c, "biz", "BSAOnAR", this.f20103b + "|" + i11 + "," + i12);
        if (i11 == 1000) {
            if (intent != null) {
                try {
                    this.f20102a = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString("ap_order_info");
            String string2 = extras.getString("ap_target_packagename");
            this.f20103b = extras.getString("ap_session");
            String string3 = extras.getString("ap_local_info", "{}");
            if (!TextUtils.isEmpty(this.f20103b)) {
                ai.a aVarB = ai.a.C0043a.b(this.f20103b);
                this.f20104c = aVarB;
                hh.a.b(aVarB, "biz", "BSAEntryCreate", this.f20103b + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th2) {
                hh.a.c(this.f20104c, "wr", "APStartEx", th2);
                finish();
            }
            if (this.f20104c != null) {
                Context applicationContext = getApplicationContext();
                ai.a aVar = this.f20104c;
                hh.a.f(applicationContext, aVar, string, aVar.f1114d);
                this.f20104c.f(true);
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
