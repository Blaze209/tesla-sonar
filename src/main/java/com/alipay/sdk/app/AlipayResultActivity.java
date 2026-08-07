package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kg.d;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AlipayResultActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f20105a = new ConcurrentHashMap<>();

    public interface a {
        void a(int i11, String str, String str2);
    }

    public final void a(String str, Bundle bundle) {
        a aVarRemove = f20105a.remove(str);
        if (aVarRemove == null) {
            finish();
            return;
        }
        try {
            aVarRemove.a(bundle.getInt("endCode"), bundle.getString("memo"), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Throwable th2;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                String stringExtra = intent.getStringExtra("session");
                Bundle bundleExtra = intent.getBundleExtra("result");
                String stringExtra2 = intent.getStringExtra("scene");
                ai.a aVarB = ai.a.C0043a.b(stringExtra);
                if (aVarB == null) {
                    finish();
                    return;
                }
                hh.a.b(aVarB, "biz", "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                        stringExtra = jSONObject.getString("session");
                        hh.a.b(aVarB, "biz", "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th3) {
                            th2 = th3;
                            bundleExtra = bundle2;
                            hh.a.c(aVarB, "biz", "BSPResEx", th2);
                            hh.a.c(aVarB, "biz", "ParseSchemeQueryError", th2);
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    hh.a.h(this, aVarB, "", aVarB.f1114d);
                    finish();
                    return;
                }
                try {
                    hh.a.b(aVarB, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
                    hh.a.b(aVarB, "biz", "PgReturnV", bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString("memo", "-"));
                    d.d(stringExtra, 9000, "OK", bundleExtra);
                } finally {
                    hh.a.h(this, aVarB, "", aVarB.f1114d);
                    finish();
                }
            } catch (Throwable th5) {
                hh.a.c(null, "biz", "BSPSerError", th5);
                hh.a.c(null, "biz", "ParseBundleSerializableError", th5);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
