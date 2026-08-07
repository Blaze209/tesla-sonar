package kg;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.adyen.checkout.components.core.action.SdkAction;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.alipay.sdk.app.H5OpenAuthActivity;
import com.google.android.gms.common.internal.ImagesContract;
import di.g;
import di.p;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, b> f86049e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f86050f = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f86052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f86053c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f86051a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f86054d = new Handler(Looper.getMainLooper());

    public enum a {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");

        private String appId;

        a(String str) {
            this.appId = str;
        }
    }

    public interface b {
        void a(int i11, String str, Bundle bundle);
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86055a;

        static {
            int[] iArr = new int[a.values().length];
            f86055a = iArr;
            try {
                iArr[a.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86055a[a.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86055a[a.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: kg.d$d, reason: collision with other inner class name */
    public final class RunnableC1837d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f86058c;

        public /* synthetic */ RunnableC1837d(d dVar, int i11, String str, Bundle bundle, c cVar) {
            this(i11, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f86053c != null) {
                d.this.f86053c.a(this.f86056a, this.f86057b, this.f86058c);
            }
        }

        public RunnableC1837d(int i11, String str, Bundle bundle) {
            this.f86056a = i11;
            this.f86057b = str;
            this.f86058c = bundle;
        }
    }

    public d(Activity activity) {
        this.f86052b = activity;
        ai.b.d().b(activity);
    }

    public static void d(String str, int i11, String str2, Bundle bundle) {
        b bVarRemove = f86049e.remove(str);
        if (bVarRemove != null) {
            try {
                bVarRemove.a(i11, str2, bundle);
            } catch (Throwable th2) {
                g.d(th2);
            }
        }
    }

    public final String a(long j11, String str, a aVar, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", String.valueOf(j11));
        jSONObject.put("session", str);
        jSONObject.put("package", this.f86052b.getPackageName());
        if (aVar != null) {
            jSONObject.put("appId", aVar.appId);
        }
        jSONObject.put("sdkVersion", "h.a.3.8.42");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(Charset.forName("UTF-8")), 2);
    }

    public final String b(a aVar, Map<String, String> map) {
        if (aVar == null) {
            throw new RuntimeException("missing bizType");
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", aVar.appId);
        if (c.f86055a[aVar.ordinal()] == 1) {
            builderAppendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", "YES");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderAppendQueryParameter.build().toString();
    }

    public final boolean e(ai.a aVar, String str, a aVar2, Map<String, String> map, boolean z11) {
        PackageInfo packageInfo;
        String strA;
        if (this.f86051a) {
            this.f86054d.post(new RunnableC1837d(this, 4000, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.f86051a = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f86050f <= 3000) {
            this.f86054d.post(new RunnableC1837d(this, 5000, "3s 内重复支付", null, null));
            return true;
        }
        f86050f = jElapsedRealtime;
        fh.a.b("");
        String strJ = p.j(32);
        HashMap map2 = new HashMap(map);
        map2.put("mqpPkgName", this.f86052b.getPackageName());
        map2.put("mqpScene", SdkAction.ACTION_TYPE);
        List<lh.b.C1902b> listL = lh.b.E().L();
        if (!lh.b.E().f89995g || listL == null) {
            listL = fh.a.f65949d;
        }
        p.c cVarG = p.g(aVar, this.f86052b, listL);
        if (cVarG == null || cVarG.b(aVar) || cVarG.a() || (packageInfo = cVarG.f60679a) == null || packageInfo.versionCode < 122) {
            if (!z11) {
                this.f86054d.post(new RunnableC1837d(this, 4001, "支付宝未安装或签名错误", null, null));
                return true;
            }
            map2.put("mqpScheme", String.valueOf(str));
            map2.put("mqpNotifyName", strJ);
            map2.put("mqpScene", "landing");
            String strB = b(aVar2, map2);
            Intent intent = new Intent(this.f86052b, (Class<?>) H5OpenAuthActivity.class);
            intent.putExtra(ImagesContract.URL, String.format("https://render.alipay.com/p/s/i?scheme=%s", Uri.encode(strB)));
            ai.a.C0043a.c(aVar, intent);
            this.f86052b.startActivity(intent);
            return false;
        }
        try {
            try {
                HashMap<String, String> mapE = ai.a.e(aVar);
                mapE.put("ts_scheme", String.valueOf(SystemClock.elapsedRealtime()));
                map2.put("mqpLoc", new JSONObject(mapE).toString());
            } catch (Throwable th2) {
                hh.a.c(aVar, "biz", "OpenAuthLocEx", th2);
            }
            String strB2 = b(aVar2, map2);
            f86049e.put(strJ, this.f86053c);
            try {
                strA = a(jElapsedRealtime, strJ, aVar2, strB2);
            } catch (JSONException e11) {
                hh.a.c(aVar, "biz", "JSONEx", e11);
                strA = null;
            }
            if (TextUtils.isEmpty(strA)) {
                this.f86054d.post(new RunnableC1837d(this, 4000, "参数错误", null, null));
                return true;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("alipays").authority("platformapi").path("startapp").appendQueryParameter("appId", "20001129").appendQueryParameter(StatusResponse.PAYLOAD, strA).build());
            intent2.addFlags(268435456);
            intent2.setPackage(cVarG.f60679a.packageName);
            try {
                hh.a.b(aVar, "biz", "PgOpenStarting", "" + jElapsedRealtime);
                ai.a.C0043a.d(aVar, strJ);
                this.f86052b.startActivity(intent2);
            } catch (Throwable th3) {
                hh.a.c(aVar, "biz", "StartWalletEx", th3);
            }
            return false;
        } catch (Throwable unused) {
            this.f86054d.post(new RunnableC1837d(this, 4000, "业务参数错误", null, null));
            return true;
        }
    }

    public void f(String str, a aVar, Map<String, String> map, b bVar, boolean z11) {
        ai.a aVar2 = new ai.a(this.f86052b, String.valueOf(map), "oa-" + aVar);
        this.f86053c = bVar;
        if (e(aVar2, str, aVar, map, z11)) {
            hh.a.h(this.f86052b, aVar2, "", aVar2.f1114d);
        }
    }
}
