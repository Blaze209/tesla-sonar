package com.alipay.sdk.app;

import ai.b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import di.g;
import di.j;
import di.n;
import di.p;
import fh.c;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AuthTask {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f20106c = j.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f20107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qg.a f20108b;

    public class a implements j.f {
        public a() {
        }

        @Override // di.j.f
        public void a() {
            AuthTask.this.a();
        }

        @Override // di.j.f
        public void b() {
        }
    }

    public AuthTask(Activity activity) {
        this.f20107a = activity;
        b.d().b(this.f20107a);
        this.f20108b = new qg.a(activity, this.f20107a.getString(jg.a.f83694b));
    }

    public synchronized String auth(String str, boolean z11) {
        return innerAuth(new ai.a(this.f20107a, str, "auth"), str, z11);
    }

    public synchronized Map<String, String> authV2(String str, boolean z11) {
        ai.a aVar;
        aVar = new ai.a(this.f20107a, str, "authV2");
        return n.c(aVar, innerAuth(aVar, str, z11));
    }

    public final j.f b() {
        return new a();
    }

    public final void c() {
        qg.a aVar = this.f20108b;
        if (aVar != null) {
            aVar.f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c5 A[Catch: all -> 0x0007, DONT_GENERATE, PHI: r9
      0x00c5: PHI (r9v11 java.lang.String) = (r9v2 java.lang.String), (r9v13 java.lang.String) binds: [B:18:0x00c3, B:11:0x006f] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0007, blocks: (B:4:0x0003, B:7:0x000a, B:10:0x0024, B:20:0x00ce, B:19:0x00c5, B:23:0x00da, B:25:0x0127, B:26:0x0130, B:27:0x013a, B:17:0x0078, B:9:0x001e, B:16:0x0075), top: B:32:0x0003, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.app.Activity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public synchronized String innerAuth(ai.a aVar, String str, boolean z11) {
        String strA;
        if (z11) {
            try {
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b.d().b(this.f20107a);
        strA = fh.b.a();
        fh.a.b("");
        int i11 = 1;
        i11 = 1;
        boolean z12 = 0;
        z12 = 0;
        try {
            strA = a(this.f20107a, str, aVar);
        } catch (Exception e11) {
            g.d(e11);
        } finally {
            hh.a.b(aVar, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
            hh.a.b(aVar, "biz", "PgReturnV", n.a(strA, "resultStatus") + "|" + n.a(strA, "memo"));
            if (!lh.b.E().S()) {
                lh.b.E().h(aVar, this.f20107a, z12, i11);
            }
            a();
            hh.a.h(this.f20107a, aVar, str, aVar.f1114d);
        }
        return strA;
    }

    public final void a() {
        qg.a aVar = this.f20108b;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final String b(Activity activity, String str, ai.a aVar) {
        c();
        c cVarA = null;
        try {
            try {
                List<yh.b> listA = yh.b.a(new wh.a().i(aVar, activity, str).c().optJSONObject("form").optJSONObject("onload"));
                a();
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    if (listA.get(i11).b() == yh.a.WapPay) {
                        String strA = a(aVar, listA.get(i11));
                        a();
                        return strA;
                    }
                }
                a();
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        } catch (IOException e11) {
            cVarA = c.a(c.NETWORK_ERROR.c());
            hh.a.e(aVar, "net", e11);
            a();
        } catch (Throwable th3) {
            hh.a.c(aVar, "biz", "H5AuthDataAnalysisError", th3);
            a();
        }
        if (cVarA == null) {
            cVarA = c.a(c.FAILED.c());
        }
        return fh.b.b(cVarA.c(), cVarA.b(), "");
    }

    public final String a(Activity activity, String str, ai.a aVar) {
        String strA = aVar.a(str);
        List<lh.b.C1902b> listL = lh.b.E().L();
        if (!lh.b.E().f89995g || listL == null) {
            listL = fh.a.f65949d;
        }
        if (p.w(aVar, this.f20107a, listL, true)) {
            j jVar = new j(activity, aVar, b());
            String strH = jVar.h(strA, false);
            jVar.i();
            if (!TextUtils.equals(strH, "failed") && !TextUtils.equals(strH, "scheme_failed")) {
                return TextUtils.isEmpty(strH) ? fh.b.a() : strH;
            }
            hh.a.a(aVar, "biz", "LogBindCalledH5");
            return b(activity, strA, aVar);
        }
        hh.a.a(aVar, "biz", "LogCalledH5");
        return b(activity, strA, aVar);
    }

    public final String a(ai.a aVar, yh.b bVar) {
        String[] strArrF = bVar.f();
        Bundle bundle = new Bundle();
        bundle.putString(ImagesContract.URL, strArrF[0]);
        Intent intent = new Intent(this.f20107a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        ai.a.C0043a.c(aVar, intent);
        this.f20107a.startActivity(intent);
        Object obj = f20106c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return fh.b.a();
            }
        }
        String strG = fh.b.g();
        return TextUtils.isEmpty(strG) ? fh.b.a() : strG;
    }
}
