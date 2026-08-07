package lh;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import di.d;
import di.g;
import di.p;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile c f90023d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f90024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f90025b = "sdk-and-lite";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f90026c;

    public c() {
        String strA = fh.a.a();
        if (fh.a.c()) {
            return;
        }
        this.f90025b += '_' + strA;
    }

    public static String b(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public static synchronized c c() {
        try {
            if (f90023d == null) {
                f90023d = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f90023d;
    }

    public static synchronized void d(String str) {
        g.f("mspl", "setRsaPublicKey");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(ai.b.d().c()).edit().putString("trideskey", str).apply();
        jh.a.f83725c = str;
    }

    public static String e() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb2.append("(");
            sb2.append(packageName);
            sb2.append(";");
            sb2.append(packageInfo.versionCode);
            sb2.append(")");
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String g() {
        return "-1;-1";
    }

    public static String h() {
        return "1";
    }

    public static String i() {
        Context contextC = ai.b.d().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences("virtualImeiAndImsi", 0);
        String string = sharedPreferences.getString("virtual_imei", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strE = TextUtils.isEmpty(ci.a.b(contextC).i()) ? e() : d.a(contextC).b();
        sharedPreferences.edit().putString("virtual_imei", strE).apply();
        return strE;
    }

    public static String j() {
        String strC;
        Context contextC = ai.b.d().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences("virtualImeiAndImsi", 0);
        String string = sharedPreferences.getString("virtual_imsi", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(ci.a.b(contextC).i())) {
            String strE = ai.b.d().e();
            strC = (TextUtils.isEmpty(strE) || strE.length() < 18) ? e() : strE.substring(3, 18);
        } else {
            strC = d.a(contextC).c();
        }
        sharedPreferences.edit().putString("virtual_imsi", strC).apply();
        return strC;
    }

    public static String k() {
        return "00";
    }

    public static String l() {
        return "-1";
    }

    public String a(ai.a aVar, ci.a aVar2, boolean z11) {
        Context contextC = ai.b.d().c();
        d dVarA = d.a(contextC);
        if (TextUtils.isEmpty(this.f90024a)) {
            this.f90024a = "Msp/15.8.42 (" + p.S() + ";" + p.P() + ";" + p.I(contextC) + ";" + p.R(contextC) + ";" + p.T(contextC) + ";" + b(contextC);
        }
        String strC = d.e(contextC).c();
        String strC2 = p.C(contextC);
        String strH = h();
        String strC3 = dVarA.c();
        String strB = dVarA.b();
        String strJ = j();
        String strI = i();
        if (aVar2 != null) {
            this.f90026c = aVar2.h();
        }
        String strReplace = Build.MANUFACTURER.replace(";", " ");
        String strReplace2 = Build.MODEL.replace(";", " ");
        boolean zF = ai.b.f();
        String strF = dVarA.f();
        String strL = l();
        String strK = k();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f90024a);
        sb2.append(";");
        sb2.append(strC);
        sb2.append(";");
        sb2.append(strC2);
        sb2.append(";");
        sb2.append(strH);
        sb2.append(";");
        sb2.append(strC3);
        sb2.append(";");
        sb2.append(strB);
        sb2.append(";");
        sb2.append(this.f90026c);
        sb2.append(";");
        sb2.append(strReplace);
        sb2.append(";");
        sb2.append(strReplace2);
        sb2.append(";");
        sb2.append(zF);
        sb2.append(";");
        sb2.append(strF);
        sb2.append(";");
        sb2.append(g());
        sb2.append(";");
        sb2.append(this.f90025b);
        sb2.append(";");
        sb2.append(strJ);
        sb2.append(";");
        sb2.append(strI);
        sb2.append(";");
        sb2.append(strL);
        sb2.append(";");
        sb2.append(strK);
        if (aVar2 != null) {
            String strB2 = mg.b.b(aVar, contextC, ci.a.b(contextC).i(), mg.b.d(aVar, contextC));
            if (!TextUtils.isEmpty(strB2)) {
                sb2.append(";;;");
                sb2.append(strB2);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }
}
