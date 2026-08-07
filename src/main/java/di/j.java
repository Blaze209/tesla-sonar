package di;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.adyen.checkout.components.core.Address;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f60656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile IAlixPay f60657b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f60660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ai.a f60661f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f60658c = IAlixPay.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f60662g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f60663h = null;

    public class a implements APayEntranceActivity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f60664a;

        public a(Object obj) {
            this.f60664a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public void a(String str) {
            j.this.f60663h = str;
            synchronized (this.f60664a) {
                try {
                    this.f60664a.notify();
                } catch (Throwable th2) {
                    hh.a.c(j.this.f60661f, "biz", "BSAResultEx", th2);
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ APayEntranceActivity.a f60666a;

        public b(APayEntranceActivity.a aVar) {
            this.f60666a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (j.this.f60661f == null || j.this.f60661f.x()) {
                return;
            }
            hh.a.g(j.this.f60661f, "biz", "ErrActNotCreated", "");
            if (lh.b.E().a()) {
                j.this.f60661f.l(true);
                this.f60666a.a(fh.b.a());
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f60668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f60669b;

        public c(Intent intent, Object obj) {
            this.f60668a = intent;
            this.f60669b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (j.this.f60656a != null) {
                    j.this.f60656a.startActivity(this.f60668a);
                    return;
                }
                hh.a.g(j.this.f60661f, "biz", "ErrActNull2", "");
                Context contextH = j.this.f60661f.h();
                if (contextH != null) {
                    contextH.startActivity(this.f60668a);
                }
            } catch (Throwable th2) {
                hh.a.c(j.this.f60661f, "biz", "ErrActEx2", th2);
                p.u("alipaySdk", "startActivityEx", j.this.f60656a, j.this.f60661f);
                synchronized (this.f60669b) {
                    try {
                        j.this.f60663h = "scheme_failed";
                        this.f60669b.notify();
                    } catch (Throwable th3) {
                        hh.a.c(j.this.f60661f, "biz", "BSAResultEx", th3);
                    }
                }
            }
        }
    }

    public class d extends IRemoteServiceCallback.Stub {
        public d() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) {
            hh.a.b(j.this.f60661f, "wlt", str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (j.this.f60660e != null) {
                    j.this.f60660e.a();
                }
                if (j.this.f60661f != null) {
                    j.this.f60661f.p(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i11, Bundle bundle) {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i11);
                intent.putExtras(bundle);
            } catch (Exception e11) {
                hh.a.c(j.this.f60661f, "biz", "ErrIntentEx", e11);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                hh.a.b(j.this.f60661f, "biz", "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (j.this.f60656a == null) {
                    hh.a.g(j.this.f60661f, "biz", "ErrActNull", "");
                    Context contextH = j.this.f60661f.h();
                    if (contextH != null) {
                        contextH.startActivity(intent);
                        return;
                    }
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                j.this.f60656a.startActivity(intent);
                hh.a.b(j.this.f60661f, "biz", "stAct2", "" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            } catch (Throwable th2) {
                hh.a.c(j.this.f60661f, "biz", "ErrActEx", th2);
                throw th2;
            }
        }

        public /* synthetic */ d(j jVar, a aVar) {
            this();
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z11, String str) {
        }
    }

    public class e implements ServiceConnection {
        public e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            hh.a.a(j.this.f60661f, "biz", "srvCon");
            synchronized (j.this.f60658c) {
                j.this.f60657b = IAlixPay.Stub.asInterface(iBinder);
                j.this.f60658c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            hh.a.a(j.this.f60661f, "biz", "srvDis");
            j.this.f60657b = null;
        }

        public /* synthetic */ e(j jVar, a aVar) {
            this();
        }
    }

    public interface f {
        void a();

        void b();
    }

    public j(Activity activity, ai.a aVar, f fVar) {
        this.f60656a = activity;
        this.f60661f = aVar;
        this.f60660e = fVar;
        g.h("mspl", "alipaySdk");
    }

    public static boolean k(String str, Context context, ai.a aVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            hh.a.a(aVar, "biz", "BSADetectFail");
            return false;
        } catch (Throwable th2) {
            hh.a.c(aVar, "biz", "BSADetectFail", th2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String, Boolean> b(String str, String str2, ai.a aVar) {
        int i11;
        IRemoteServiceCallback dVar;
        Activity activity;
        int version;
        String strA;
        Activity activity2;
        Activity activity3;
        Activity activity4;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(p.J(str2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(jElapsedRealtime);
        sb2.append("|");
        sb2.append(str != null ? str.length() : 0);
        hh.a.b(aVar, "biz", "PgBindStarting", sb2.toString());
        hh.a.f(this.f60656a, aVar, str, aVar.f1114d);
        try {
            try {
                if (lh.b.E().C()) {
                    hh.a.b(aVar, "biz", "stSrv", "skipped");
                } else {
                    ComponentName componentNameStartService = this.f60656a.getApplication().startService(intent);
                    hh.a.b(aVar, "biz", "stSrv", componentNameStartService != null ? componentNameStartService.getPackageName() : Address.ADDRESS_NULL_PLACEHOLDER);
                }
            } catch (Throwable th2) {
                hh.a.c(aVar, "biz", "TryStartServiceEx", th2);
            }
            if (lh.b.E().s()) {
                hh.a.b(aVar, "biz", "bindFlg", "imp");
                i11 = 65;
            } else {
                i11 = 1;
            }
            boolean zQ = lh.b.E().q();
            if (Build.VERSION.SDK_INT >= 34 && zQ) {
                i11 |= 512;
                hh.a.b(aVar, "biz", "bindFlg", "allow");
            }
            a aVar2 = null;
            e eVar = new e(this, aVar2);
            if (!this.f60656a.getApplicationContext().bindService(intent, eVar, i11)) {
                throw new Throwable("bindService fail");
            }
            synchronized (this.f60658c) {
                if (this.f60657b == null) {
                    try {
                        this.f60658c.wait(lh.b.E().K());
                    } catch (InterruptedException e11) {
                        hh.a.c(aVar, "biz", "BindWaitTimeoutEx", e11);
                    }
                }
            }
            IAlixPay iAlixPay = this.f60657b;
            try {
                if (iAlixPay == null) {
                    hh.a.g(aVar, "biz", "ClientBindFailed", "");
                    p.u("alipaySdk", "bindServiceTimeout", this.f60656a, this.f60661f);
                    Pair<String, Boolean> pair = new Pair<>("failed", Boolean.TRUE);
                    try {
                        this.f60656a.getApplicationContext().unbindService(eVar);
                    } catch (Throwable th3) {
                        g.d(th3);
                    }
                    hh.a.b(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                    hh.a.f(this.f60656a, aVar, str, aVar.f1114d);
                    this.f60657b = null;
                    if (this.f60659d && (activity4 = this.f60656a) != null) {
                        activity4.setRequestedOrientation(0);
                        this.f60659d = false;
                    }
                    return pair;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                hh.a.b(aVar, "biz", "PgBinded", "" + jElapsedRealtime2);
                f fVar = this.f60660e;
                if (fVar != null) {
                    fVar.b();
                }
                if (this.f60656a.getRequestedOrientation() == 0) {
                    this.f60656a.setRequestedOrientation(1);
                    this.f60659d = true;
                }
                try {
                    version = iAlixPay.getVersion();
                } catch (Throwable th4) {
                    g.d(th4);
                    version = 0;
                }
                dVar = new d(this, aVar2);
                try {
                    if (version >= 3) {
                        iAlixPay.registerCallback03(dVar, str, null);
                    } else {
                        iAlixPay.registerCallback(dVar);
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    hh.a.b(aVar, "biz", "PgBindPay", "" + jElapsedRealtime3);
                    if (version >= 3) {
                        iAlixPay.r03("biz", "bind_pay", null);
                    }
                    try {
                        if (version >= 2) {
                            Map mapE = ai.a.e(aVar);
                            mapE.put("ts_bind", String.valueOf(jElapsedRealtime));
                            mapE.put("ts_bend", String.valueOf(jElapsedRealtime2));
                            mapE.put("ts_pay", String.valueOf(jElapsedRealtime3));
                            strA = iAlixPay.pay02(str, mapE);
                        } else {
                            strA = iAlixPay.Pay(str);
                        }
                    } catch (Throwable th5) {
                        ai.a aVar3 = this.f60661f;
                        if (aVar3 != null && !aVar3.z()) {
                            hh.a.c(aVar, "biz", "ClientBindException", th5);
                            p.u("alipaySdk", "bindServiceEx", this.f60656a, this.f60661f);
                            if (lh.b.E().V()) {
                                Pair<String, Boolean> pair2 = new Pair<>("failed", Boolean.FALSE);
                                try {
                                    iAlixPay.unregisterCallback(dVar);
                                } catch (Throwable th6) {
                                    g.d(th6);
                                }
                                try {
                                    this.f60656a.getApplicationContext().unbindService(eVar);
                                } catch (Throwable th7) {
                                    g.d(th7);
                                }
                                hh.a.b(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                                hh.a.f(this.f60656a, aVar, str, aVar.f1114d);
                                this.f60657b = null;
                                if (this.f60659d && (activity2 = this.f60656a) != null) {
                                    activity2.setRequestedOrientation(0);
                                    this.f60659d = false;
                                }
                                return pair2;
                            }
                        }
                        strA = fh.b.a();
                    }
                    String str3 = strA;
                    try {
                        iAlixPay.unregisterCallback(dVar);
                    } catch (Throwable th8) {
                        g.d(th8);
                    }
                    try {
                        this.f60656a.getApplicationContext().unbindService(eVar);
                    } catch (Throwable th9) {
                        g.d(th9);
                    }
                    hh.a.b(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                    hh.a.f(this.f60656a, aVar, str, aVar.f1114d);
                    this.f60657b = null;
                    if (this.f60659d && (activity3 = this.f60656a) != null) {
                        activity3.setRequestedOrientation(0);
                        this.f60659d = false;
                    }
                    return new Pair<>(str3, Boolean.FALSE);
                } catch (Throwable th10) {
                    th = th10;
                }
            } catch (Throwable th11) {
                th = th11;
                dVar = null;
            }
            try {
                hh.a.d(aVar, "biz", "ClientBindFailed", th, "in_bind");
                return new Pair<>("failed", Boolean.TRUE);
            } finally {
                if (dVar != null) {
                    try {
                        iAlixPay.unregisterCallback(dVar);
                    } catch (Throwable th12) {
                        g.d(th12);
                    }
                }
                try {
                    this.f60656a.getApplicationContext().unbindService(eVar);
                } catch (Throwable th13) {
                    g.d(th13);
                }
                hh.a.b(aVar, "biz", "PgBindEnd", "" + SystemClock.elapsedRealtime());
                hh.a.f(this.f60656a, aVar, str, aVar.f1114d);
                this.f60657b = null;
                if (this.f60659d && (activity = this.f60656a) != null) {
                    activity.setRequestedOrientation(0);
                    this.f60659d = 0 == true ? 1 : 0;
                }
            }
        } catch (Throwable th14) {
            hh.a.c(aVar, "biz", "ClientBindServiceFailed", th14);
            p.u("alipaySdk", "bindServiceFail", this.f60656a, this.f60661f);
            return new Pair<>("failed", Boolean.TRUE);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String e(String str, String str2) {
        JSONObject jSONObject;
        String str3;
        Object obj = new Object();
        String strJ = p.j(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        hh.a.b(this.f60661f, "biz", "BSAStart", strJ + "|" + jElapsedRealtime);
        ai.a.C0043a.d(this.f60661f, strJ);
        a aVar = new a(obj);
        APayEntranceActivity.f20101d.put(strJ, aVar);
        try {
            HashMap<String, String> mapE = ai.a.e(this.f60661f);
            mapE.put("ts_intent", String.valueOf(jElapsedRealtime));
            jSONObject = new JSONObject(mapE);
        } catch (Throwable th2) {
            try {
                hh.a.c(this.f60661f, "biz", "BSALocEx", th2);
                jSONObject = null;
            } catch (InterruptedException e11) {
                hh.a.c(this.f60661f, "biz", "BSAWaiting", e11);
                fh.c cVar = fh.c.PAY_WAITTING;
                return fh.b.b(cVar.c(), cVar.b(), "");
            } catch (Throwable th3) {
                hh.a.c(this.f60661f, "biz", "BSAEx", th3);
                p.u("alipaySdk", "startActivityEx", this.f60656a, this.f60661f);
                return "scheme_failed";
            }
        }
        Intent intent = new Intent(this.f60656a, (Class<?>) APayEntranceActivity.class);
        intent.putExtra("ap_order_info", str);
        intent.putExtra("ap_target_packagename", str2);
        intent.putExtra("ap_session", strJ);
        if (jSONObject != null) {
            intent.putExtra("ap_local_info", jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(aVar), lh.b.E().K());
        Activity activity = this.f60656a;
        ai.a aVar2 = this.f60661f;
        hh.a.f(activity, aVar2, str, aVar2.f1114d);
        if (lh.b.E().d()) {
            new Handler(Looper.getMainLooper()).post(new c(intent, obj));
        } else {
            try {
                Activity activity2 = this.f60656a;
                if (activity2 != null) {
                    activity2.startActivity(intent);
                } else {
                    hh.a.g(this.f60661f, "biz", "ErrActNull", "");
                    Context contextH = this.f60661f.h();
                    if (contextH != null) {
                        contextH.startActivity(intent);
                    }
                }
            } catch (Throwable th4) {
                hh.a.c(this.f60661f, "biz", "ErrActEx", th4);
                throw th4;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str4 = this.f60663h;
        try {
            str3 = n.c(this.f60661f, str4).get("resultStatus");
            if (str3 == null) {
                str3 = Address.ADDRESS_NULL_PLACEHOLDER;
            }
        } catch (Throwable th5) {
            str3 = "unknown";
            hh.a.c(this.f60661f, "biz", "BSAStatEx", th5);
        }
        hh.a.a(this.f60661f, "biz", "BSADone-" + str3);
        if (!TextUtils.isEmpty(str4)) {
            return str4;
        }
        hh.a.a(this.f60661f, "biz", "BSAEmpty");
        return "scheme_failed";
    }

    public final String f(String str, String str2, PackageInfo packageInfo) {
        String str3 = packageInfo != null ? packageInfo.versionName : "";
        g.h("mspl", "pay payInvokeAct");
        hh.a.b(this.f60661f, "biz", "PgWltVer", str2 + "|" + str3);
        Activity activity = this.f60656a;
        ai.a aVar = this.f60661f;
        hh.a.f(activity, aVar, str, aVar.f1114d);
        return e(str, str2);
    }

    public final String g(String str, String str2, PackageInfo packageInfo, p.c cVar) {
        String str3;
        Activity activity;
        boolean zContains = false;
        int i11 = packageInfo != null ? packageInfo.versionCode : 0;
        g.h("mspl", "pay bind or scheme");
        ai.a aVar = this.f60661f;
        if (aVar != null && !TextUtils.isEmpty(aVar.f1117g)) {
            zContains = this.f60661f.f1117g.toLowerCase().contains("auth");
        }
        if (zContains || !p.N(this.f60661f, str2)) {
            if (cVar != null) {
                try {
                    if (!lh.b.E().P()) {
                        j(cVar);
                    }
                } catch (Throwable unused) {
                }
            }
            Pair<String, Boolean> pairB = b(str, str2, this.f60661f);
            str3 = (String) pairB.first;
            try {
                if ("failed".equals(str3) && ((Boolean) pairB.second).booleanValue() && lh.b.E().N()) {
                    hh.a.a(this.f60661f, "biz", "BindRetry");
                    str3 = (String) b(str, str2, this.f60661f).first;
                }
            } catch (Throwable th2) {
                hh.a.c(this.f60661f, "biz", "BindRetryEx", th2);
            }
        } else {
            if (cVar != null) {
                try {
                    if (lh.b.E().e()) {
                        j(cVar);
                    }
                } catch (Throwable unused2) {
                }
            }
            hh.a.a(this.f60661f, "biz", "BindSkipByL");
            str3 = "failed";
        }
        g.h("mspl", "pay bind result: " + str3);
        Activity activity2 = this.f60656a;
        ai.a aVar2 = this.f60661f;
        hh.a.f(activity2, aVar2, str, aVar2.f1114d);
        if ("failed".equals(str3)) {
            if (!lh.b.E().r(this.f60661f)) {
                g.h("mspl", "save SP_BIND_FAILED: true");
                ai.a aVar3 = this.f60661f;
                l.c(aVar3, aVar3.h(), "sp_bind_failed", "true");
            }
            if (!"com.eg.android.AlipayGphone".equals(str2)) {
                hh.a.b(this.f60661f, "biz", "BSPNotStartByAlipay", str2 + "|" + i11);
                return str3;
            }
            if (i11 >= 460 && !zContains && (activity = this.f60656a) != null && k(str2, activity, this.f60661f)) {
                return f(str, str2, packageInfo);
            }
        }
        return str3;
    }

    public String h(String str, boolean z11) {
        p.c cVarG;
        String strB = "";
        PackageInfo packageInfo = null;
        try {
            List<lh.b.C1902b> listL = lh.b.E().L();
            if (!lh.b.E().f89995g || listL == null) {
                listL = fh.a.f65949d;
            }
            cVarG = p.g(this.f60661f, this.f60656a, listL);
            if (cVarG != null) {
                try {
                    if (cVarG.b(this.f60661f) || cVarG.a() || p.A(cVarG.f60679a)) {
                        return "failed";
                    }
                    PackageInfo packageInfo2 = cVarG.f60679a;
                    strB = (packageInfo2 == null || "com.eg.android.AlipayGphone".equals(packageInfo2.packageName)) ? p.B() : cVarG.f60679a.packageName;
                    PackageInfo packageInfo3 = cVarG.f60679a;
                    packageInfo = packageInfo3 != null ? packageInfo3 : null;
                    String strU = lh.b.E().u();
                    if (strU != null && strU.length() > 0) {
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(strU).optJSONObject(strB);
                            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    int i11 = Integer.parseInt(next);
                                    if (packageInfo != null && packageInfo.versionCode >= i11) {
                                        try {
                                            boolean zP = lh.b.E().p(this.f60656a, Integer.parseInt(jSONObjectOptJSONObject.getString(next)));
                                            this.f60662g = zP;
                                            if (zP) {
                                                break;
                                            }
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    hh.a.c(this.f60661f, "biz", "CheckClientSignEx", th);
                }
                return ((z11 || this.f60662g) && !p.G(this.f60661f) && k(strB, this.f60656a, this.f60661f)) ? f(str, strB, packageInfo) : g(str, strB, packageInfo, cVarG);
            }
            return "failed";
        } catch (Throwable th3) {
            th = th3;
            cVarG = null;
        }
    }

    public void i() {
        this.f60656a = null;
        this.f60660e = null;
    }

    public final void j(p.c cVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.f60679a) == null) {
            return;
        }
        if (!lh.b.E().r(this.f60661f)) {
            ai.a aVar = this.f60661f;
            String strA = l.a(aVar, aVar.h(), "sp_bind_failed", "false");
            g.h("mspl", "get SP_BIND_FAILED: " + strA);
            if (TextUtils.isEmpty(strA) || TextUtils.equals(strA, "false")) {
                return;
            }
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.f60656a.startActivity(intent);
        } catch (Throwable th2) {
            hh.a.c(this.f60661f, "biz", "StartLaunchAppTransEx", th2);
        }
        Thread.sleep(lh.b.E().R());
    }
}
