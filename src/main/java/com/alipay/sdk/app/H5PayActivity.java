package com.alipay.sdk.app;

import ai.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import com.alipay.sdk.app.H5PayActivity;
import com.google.android.gms.common.internal.ImagesContract;
import di.b;
import di.g;
import di.p;
import fh.d;
import java.lang.ref.WeakReference;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import qg.c;

/* JADX INFO: loaded from: classes3.dex */
public class H5PayActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f20111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f20117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f20118h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeakReference<a> f20119i;

    public final void a(final View view) {
        Context context = view.getContext();
        if (context != null && b.d(context)) {
            try {
                ViewCompat.E0(view, new a0() { // from class: kg.c
                    @Override // androidx.core.view.a0
                    public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                        return H5PayActivity.a(view, view2, windowInsetsCompat);
                    }
                });
            } catch (Throwable unused) {
                view.setPadding(0, b.b(context), 0, b.a(context));
            }
        }
    }

    public void b() {
        Object obj = PayTask.f20125j;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    public final void c() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(PKIFailureInfo.certRevoked);
        } catch (Throwable th2) {
            g.d(th2);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        b();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1010) {
            d.a((a) p.i(this.f20119i), i11, i12, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c cVar = this.f20111a;
        if (cVar == null) {
            finish();
            return;
        }
        if (cVar.m()) {
            cVar.n();
            return;
        }
        if (!cVar.n()) {
            super.onBackPressed();
        }
        fh.b.c(fh.b.a());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        c();
        super.onCreate(bundle);
        try {
            a aVarA = a.C0043a.a(getIntent());
            if (aVarA == null) {
                finish();
                return;
            }
            this.f20119i = new WeakReference<>(aVarA);
            if (lh.b.E().c()) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString(ImagesContract.URL, null);
                this.f20112b = string;
                if (!p.U(string)) {
                    finish();
                    return;
                }
                this.f20114d = extras.getString("cookie", null);
                this.f20113c = extras.getString("method", null);
                this.f20115e = extras.getString("title", null);
                this.f20117g = extras.getString("version", "v1");
                this.f20116f = extras.getBoolean("backisexit", false);
                this.f20118h = extras.getString("cashierBizData", "");
                try {
                    qg.d dVar = new qg.d(this, aVarA, this.f20117g);
                    setContentView(dVar);
                    a(dVar);
                    dVar.s(this.f20115e, this.f20113c, this.f20116f);
                    dVar.setCashierBizData(this.f20118h);
                    dVar.l(this.f20112b, this.f20114d);
                    dVar.q(this.f20112b);
                    this.f20111a = dVar;
                } catch (Throwable th2) {
                    hh.a.c(aVarA, "biz", "GetInstalledAppEx", th2);
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.f20111a;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i11) {
        try {
            super.setRequestedOrientation(i11);
        } catch (Throwable th2) {
            try {
                hh.a.c((a) p.i(this.f20119i), "biz", "H5PayDataAnalysisError", th2);
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ WindowInsetsCompat a(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(0, windowInsetsCompat.m(), 0, windowInsetsCompat.j());
        return windowInsetsCompat;
    }
}
