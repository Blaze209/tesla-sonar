package ci;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import di.g;
import java.util.Random;
import nh.e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f19358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f19359h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f19364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19365f = false;

    /* JADX INFO: renamed from: ci.a$a, reason: collision with other inner class name */
    public static class C0395a {
        public static String a() {
            String packageName;
            try {
                packageName = a.f19358g.getApplicationContext().getPackageName();
            } catch (Throwable th2) {
                g.d(th2);
                packageName = "";
            }
            return (packageName + "0000000000000000000000000000").substring(0, 24);
        }

        public static String b(String str, String str2, boolean z11) {
            if (a.f19358g == null) {
                return null;
            }
            String string = a.f19358g.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z11) {
                string = e.a(a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    g.f("mspl", "tid_str: pref failed");
                }
            }
            g.f("mspl", "tid_str: from local");
            return string;
        }

        public static void c(String str, String str2, String str3, boolean z11) {
            if (a.f19358g == null) {
                return;
            }
            SharedPreferences sharedPreferences = a.f19358g.getSharedPreferences(str, 0);
            if (z11) {
                String strA = a();
                String strC = e.c(strA, str3, str3);
                if (TextUtils.isEmpty(strC)) {
                    String.format("LocalPreference::putLocalPreferences failed %s，%s", str3, strA);
                }
                str3 = strC;
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        public static void d(String str, String str2) {
            if (a.f19358g == null) {
                return;
            }
            a.f19358g.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }
    }

    public static synchronized a b(Context context) {
        try {
            if (f19359h == null) {
                f19359h = new a();
            }
            if (f19358g == null) {
                f19359h.e(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f19359h;
    }

    public void c(String str, String str2) {
        g.f("mspl", "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f19360a = str;
        this.f19361b = str2;
        this.f19362c = System.currentTimeMillis();
        l();
        m();
    }

    public final boolean d(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    public final void e(Context context) {
        if (context != null) {
            f19358g = context.getApplicationContext();
        }
        if (this.f19365f) {
            return;
        }
        this.f19365f = true;
        j();
    }

    public String f() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    public final String g() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public String h() {
        return this.f19361b;
    }

    public String i() {
        return this.f19360a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    public final void j() {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        String strOptString4 = null;
        try {
            String strB = C0395a.b("alipay_tid_storage", "tidinfo", true);
            if (TextUtils.isEmpty(strB)) {
                str = null;
                strOptString2 = null;
                strOptString3 = null;
            } else {
                JSONObject jSONObject = new JSONObject(strB);
                strOptString = jSONObject.optString("tid", "");
                try {
                    strOptString2 = jSONObject.optString("client_key", "");
                    try {
                        lValueOf = Long.valueOf(jSONObject.optLong("timestamp", System.currentTimeMillis()));
                        strOptString3 = jSONObject.optString("vimei", "");
                        try {
                            strOptString4 = jSONObject.optString("vimsi", "");
                        } catch (Exception e11) {
                            e = e11;
                            g.d(e);
                        }
                    } catch (Exception e12) {
                        e = e12;
                        strOptString3 = null;
                    }
                } catch (Exception e13) {
                    e = e13;
                    strOptString2 = null;
                    strOptString3 = strOptString2;
                    g.d(e);
                    str = strOptString4;
                    strOptString4 = strOptString;
                    g.f("mspl", "tid_str: load");
                    if (d(strOptString4, strOptString2, strOptString3, str)) {
                        k();
                        return;
                    }
                    this.f19360a = strOptString4;
                    this.f19361b = strOptString2;
                    this.f19362c = lValueOf.longValue();
                    this.f19363d = strOptString3;
                    this.f19364e = str;
                }
                str = strOptString4;
                strOptString4 = strOptString;
            }
        } catch (Exception e14) {
            e = e14;
            strOptString = null;
            strOptString2 = null;
        }
        g.f("mspl", "tid_str: load");
        if (d(strOptString4, strOptString2, strOptString3, str)) {
            k();
            return;
        }
        this.f19360a = strOptString4;
        this.f19361b = strOptString2;
        this.f19362c = lValueOf.longValue();
        this.f19363d = strOptString3;
        this.f19364e = str;
    }

    public final void k() {
        this.f19360a = "";
        this.f19361b = f();
        this.f19362c = System.currentTimeMillis();
        this.f19363d = g();
        this.f19364e = g();
        C0395a.d("alipay_tid_storage", "tidinfo");
    }

    public final void l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f19360a);
            jSONObject.put("client_key", this.f19361b);
            jSONObject.put("timestamp", this.f19362c);
            jSONObject.put("vimei", this.f19363d);
            jSONObject.put("vimsi", this.f19364e);
            C0395a.c("alipay_tid_storage", "tidinfo", jSONObject.toString(), true);
        } catch (Exception e11) {
            g.d(e11);
        }
    }

    public final void m() {
    }
}
