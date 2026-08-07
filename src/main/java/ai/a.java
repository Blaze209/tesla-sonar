package ai;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adyen.checkout.components.core.Address;
import di.g;
import di.l;
import di.p;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f1118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1120j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1121k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1122l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ActivityInfo f1123m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hh.b f1124n;

    /* JADX INFO: renamed from: ai.a$a, reason: collision with other inner class name */
    public static final class C0043a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<UUID, a> f1125a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final HashMap<String, a> f1126b = new HashMap<>();

        public static a a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
            if (serializableExtra instanceof UUID) {
                return f1125a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return f1126b.remove(str);
        }

        public static void c(a aVar, Intent intent) {
            if (aVar == null || intent == null) {
                return;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            f1125a.put(uuidRandomUUID, aVar);
            intent.putExtra("i_uuid_b_c", uuidRandomUUID);
        }

        public static void d(a aVar, String str) {
            if (aVar == null || TextUtils.isEmpty(str)) {
                return;
            }
            f1126b.put(str, aVar);
        }
    }

    public a(Context context, String str, String str2) {
        String str3;
        this.f1111a = "";
        this.f1112b = "";
        this.f1113c = null;
        this.f1118h = null;
        this.f1119i = null;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        this.f1124n = new hh.b(context, zIsEmpty);
        String strJ = j(str, this.f1112b);
        this.f1114d = strJ;
        this.f1115e = SystemClock.elapsedRealtime();
        this.f1116f = p.V();
        ActivityInfo activityInfoD = p.d(context);
        this.f1123m = activityInfoD;
        this.f1117g = str2;
        if (!zIsEmpty) {
            hh.a.b(this, "biz", "eptyp", str2 + "|" + strJ);
            if (activityInfoD != null) {
                str3 = activityInfoD.name + "|" + activityInfoD.launchMode;
            } else {
                str3 = Address.ADDRESS_NULL_PLACEHOLDER;
            }
            hh.a.b(this, "biz", "actInfo", str3);
            hh.a.b(this, "biz", "sys", p.k(this));
            hh.a.b(this, "biz", "sdkv", "7a055d1-dirty");
            hh.a.b(this, "biz", "registerApp", kg.a.f86045b + "");
        }
        try {
            this.f1113c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f1111a = packageInfo.versionName;
            this.f1112b = packageInfo.packageName;
        } catch (Exception e11) {
            g.d(e11);
        }
        if (!zIsEmpty) {
            hh.a.a(this, "biz", "u" + p.V());
            hh.a.b(this, "biz", "PgApiInvoke", "" + SystemClock.elapsedRealtime());
            hh.a.f(context, this, str, this.f1114d);
        }
        if (!zIsEmpty && lh.b.E().S()) {
            lh.b.E().h(this, this.f1113c, true, 2);
        }
        if (lh.b.E().o(null)) {
            return;
        }
        this.f1118h = l.a(this, h(), "sp_preheatUserToken", "");
        this.f1119i = o(str, this.f1112b);
    }

    public static HashMap<String, String> e(a aVar) {
        HashMap<String, String> map = new HashMap<>();
        if (aVar != null) {
            map.put("sdk_ver", "15.8.42");
            map.put("app_name", aVar.f1112b);
            map.put("token", aVar.f1114d);
            map.put("call_type", aVar.f1117g);
            map.put("ts_api_invoke", String.valueOf(aVar.f1115e));
            di.a.d(aVar, map);
        }
        return map;
    }

    public static String j(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return String.format("EP%s%s_%s", "1", p.X(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString())), Long.valueOf(System.currentTimeMillis()));
        } catch (Throwable unused) {
            return "-";
        }
    }

    public static String o(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return p.X(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString()));
        } catch (Throwable th2) {
            g.g("mspl", "generatePreheatTokenError");
            g.d(th2);
            return "";
        }
    }

    public static a u() {
        return null;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith("new_external_info==")) {
            return r(str);
        }
        return v(str) ? n(str) : s(str);
    }

    public final String b(String str, String str2) {
        return str + d(new JSONObject()) + str2;
    }

    public final String c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(str2);
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            if (!TextUtils.isEmpty(strArrSplit[i11]) && strArrSplit[i11].startsWith(str3)) {
                return strArrSplit[i11];
            }
        }
        return null;
    }

    public String d(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", "2014052600006128");
            }
            if (!jSONObject.has("ty")) {
                jSONObject.put("ty", "and_lite");
            }
            if (!jSONObject.has("sv")) {
                jSONObject.put("sv", "h.a.3.8.42");
            }
            if (!jSONObject.has("an")) {
                jSONObject.put("an", this.f1112b);
            }
            if (!jSONObject.has("av")) {
                jSONObject.put("av", this.f1111a);
            }
            if (!jSONObject.has("sdk_start_time")) {
                jSONObject.put("sdk_start_time", System.currentTimeMillis());
            }
            if (!jSONObject.has("extInfo")) {
                jSONObject.put("extInfo", t());
            }
            if (!jSONObject.has("act_info")) {
                if (this.f1123m != null) {
                    str = this.f1123m.name + "|" + this.f1123m.launchMode;
                } else {
                    str = Address.ADDRESS_NULL_PLACEHOLDER;
                }
                jSONObject.put("act_info", str);
            }
            return jSONObject.toString();
        } catch (Throwable th2) {
            hh.a.d(this, "biz", "fmt3", th2, String.valueOf(jSONObject));
            g.d(th2);
            return jSONObject != null ? jSONObject.toString() : "{}";
        }
    }

    public void f(boolean z11) {
        this.f1121k = z11;
    }

    public boolean g() {
        return !TextUtils.isEmpty(this.f1118h);
    }

    public Context h() {
        return this.f1113c;
    }

    public final String i(String str) {
        return d(new JSONObject(str));
    }

    public final String k(String str, String str2, String str3) {
        JSONObject jSONObject;
        String strSubstring = str.substring(str2.length());
        boolean z11 = false;
        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - str3.length());
        if (strSubstring2.length() >= 2 && strSubstring2.startsWith("\"") && strSubstring2.endsWith("\"")) {
            jSONObject = new JSONObject(strSubstring2.substring(1, strSubstring2.length() - 1));
            z11 = true;
        } else {
            jSONObject = new JSONObject(strSubstring2);
        }
        String strD = d(jSONObject);
        if (z11) {
            strD = "\"" + strD + "\"";
        }
        return str2 + strD + str3;
    }

    public void l(boolean z11) {
        this.f1120j = z11;
    }

    public String m() {
        return this.f1112b;
    }

    public final String n(String str) {
        try {
            String strC = c(str, "&", "bizcontext=");
            if (TextUtils.isEmpty(strC)) {
                return str + "&" + b("bizcontext=", "");
            }
            int iIndexOf = str.indexOf(strC);
            return str.substring(0, iIndexOf) + k(strC, "bizcontext=", "") + str.substring(iIndexOf + strC.length());
        } catch (Throwable th2) {
            hh.a.d(this, "biz", "fmt1", th2, str);
            return str;
        }
    }

    public void p(boolean z11) {
        this.f1122l = z11;
    }

    public String q() {
        return this.f1111a;
    }

    public final String r(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", i(jSONObject.optString("bizcontext")));
            return "new_external_info==" + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public final String s(String str) {
        try {
            String strC = c(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(strC)) {
                return str + "&" + b("bizcontext=\"", "\"");
            }
            if (!strC.endsWith("\"")) {
                strC = strC + "\"";
            }
            int iIndexOf = str.indexOf(strC);
            return str.substring(0, iIndexOf) + k(strC, "bizcontext=\"", "\"") + str.substring(iIndexOf + strC.length());
        } catch (Throwable th2) {
            hh.a.d(this, "biz", "fmt2", th2, str);
            return str;
        }
    }

    public final JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ap_link_token", this.f1114d);
            if (g() && lh.b.E().H(null)) {
                jSONObject.put("preheatUserToken", this.f1118h);
                jSONObject.put("preheatToken", this.f1119i);
                jSONObject.put("preheatTime", System.currentTimeMillis() + "");
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final boolean v(String str) {
        return !str.contains("\"&");
    }

    public String w() {
        return this.f1119i;
    }

    public boolean x() {
        return this.f1121k;
    }

    public boolean y() {
        return this.f1120j;
    }

    public boolean z() {
        return this.f1122l;
    }
}
