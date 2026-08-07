package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import di.g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class PayResultActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Object> f20120b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ai.a f20121a = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f20122a;

        public a(Activity activity) {
            this.f20122a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20122a.finish();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static volatile String f20123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static volatile String f20124b;
    }

    public static void a(Activity activity, int i11) {
        new Handler().postDelayed(new a(activity), i11);
    }

    public static void b(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e11) {
            g.d(e11);
        }
        if (activity != null) {
            try {
                activity.startActivity(intent);
            } catch (Throwable unused) {
                activity.finish();
            }
        }
    }

    public static void c(String str) {
        b.f20124b = fh.b.a();
        e(f20120b, str);
    }

    public static void d(String str, String str2) {
        b.f20124b = str;
        e(f20120b, str2);
    }

    public static boolean e(HashMap<String, Object> map, String str) {
        Object obj;
        if (map == null || str == null || (obj = map.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra("orderSuffix"))) {
                b.f20123a = intent.getStringExtra("phonecashier.pay.hash");
                String stringExtra = intent.getStringExtra("orderSuffix");
                String stringExtra2 = intent.getStringExtra("externalPkgName");
                ai.a aVarA = ai.a.C0043a.a(intent);
                this.f20121a = aVarA;
                if (aVarA == null) {
                    finish();
                }
                b(this, b.f20123a, stringExtra, stringExtra2);
                a(this, 300);
                return;
            }
            if (this.f20121a == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra("phonecashier.pay.result");
            int intExtra = intent.getIntExtra("phonecashier.pay.resultOrderHash", 0);
            if (intExtra != 0 && TextUtils.equals(b.f20123a, String.valueOf(intExtra))) {
                if (TextUtils.isEmpty(stringExtra3)) {
                    c(b.f20123a);
                } else {
                    d(stringExtra3, b.f20123a);
                }
                b.f20123a = "";
                a(this, 300);
                return;
            }
            hh.a.g(this.f20121a, "biz", "SchemePayWrongHashEx", "Expected " + b.f20123a + ", got " + intExtra);
            c(b.f20123a);
            a(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }
}
