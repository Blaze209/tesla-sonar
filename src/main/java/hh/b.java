package hh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import di.d;
import di.g;
import di.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f72798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f72800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f72801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f72802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f72803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f72804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f72805h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f72806i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f72807j;

    public b(Context context, boolean z11) {
        context = context != null ? context.getApplicationContext() : context;
        this.f72798a = k();
        this.f72800c = c(context);
        this.f72801d = b(z11 ? 0L : a.f.a(context));
        this.f72802e = a();
        this.f72803f = l(context);
        this.f72804g = "-";
        this.f72807j = "-";
    }

    public static String a() {
        return m(ci.a.b(ai.b.d().c()).i()) + "," + m(ai.b.d().e()) + ",-,-,-";
    }

    public static String b(long j11) {
        return "android,3," + m("15.8.42") + "," + m("h.a.3.8.42") + ",com.alipay.mcpay,5.0,-,~" + j11 + ",-";
    }

    public static String c(Context context) {
        String packageName;
        String str;
        String str2 = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str2 = packageInfo.versionName + "|" + d(packageInfo);
                } catch (Throwable th2) {
                    th = th2;
                    g.d(th);
                }
            } catch (Throwable th3) {
                th = th3;
                packageName = "-";
            }
            str = str2;
            str2 = packageName;
        } else {
            str = "-";
        }
        return m(str2) + "," + m(str) + ",-,-,-";
    }

    public static String d(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String strSubstring;
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) {
            return WebrtcBuildVersion.maint_version;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    String strM = p.m(null, signature.toByteArray());
                    strSubstring = TextUtils.isEmpty(strM) ? CallerData.NA : p.X(strM).substring(0, 8);
                } catch (Throwable unused) {
                }
                sb2.append("-");
                sb2.append(strSubstring);
            }
            return sb2.toString();
        } catch (Throwable unused2) {
            return CallerData.NA;
        }
    }

    public static String e(String str) {
        String string;
        String strReplace;
        if (str == null) {
            str = "";
        }
        String[] strArrSplit = str.split("&");
        String strReplace2 = null;
        if (strArrSplit != null) {
            string = null;
            strReplace = null;
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split("=");
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    if (strArrSplit2[0].equalsIgnoreCase("partner")) {
                        strReplace2 = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("out_trade_no")) {
                        string = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("trade_no")) {
                        strReplace = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("biz_content")) {
                        try {
                            JSONObject jSONObject = new JSONObject(p.Q(ai.a.u(), strArrSplit2[1]));
                            if (TextUtils.isEmpty(string)) {
                                string = jSONObject.getString("out_trade_no");
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (strArrSplit2[0].equalsIgnoreCase("app_id") && TextUtils.isEmpty(strReplace2)) {
                        strReplace2 = strArrSplit2[1];
                    }
                }
            }
        } else {
            string = null;
            strReplace = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", m(strReplace), m(string), m(strReplace2));
    }

    public static String f(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th2.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th2.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th2.getStackTrace();
            if (stackTrace != null) {
                int i11 = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i11++;
                    if (i11 > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String k() {
        return t() + "," + new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date());
    }

    public static String l(Context context) {
        return m(d.d(context)) + ",android," + m(Build.VERSION.RELEASE) + "," + m(Build.MODEL) + ",-," + WebrtcBuildVersion.maint_version + "," + m(d.e(context).c()) + ",gw," + m(mg.b.c(null, context)) + ",-";
    }

    public static String m(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(",", "，").replace("^", "~").replace("#", "＃");
    }

    public static String o() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    public static String p(String str) {
        return TextUtils.isEmpty(str) ? "-" : str;
    }

    public static String t() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    public void g(String str, String str2) {
        n("", str, str2);
    }

    public void h(String str, String str2, String str3) {
        n("", str, str2 + "|" + str3);
    }

    public void i(String str, String str2, Throwable th2) {
        s(str, str2, f(th2));
    }

    public void j(String str, String str2, Throwable th2, String str3) {
        s(str, str2, str3 + ": " + f(th2));
    }

    public final synchronized void n(String str, String str2, String str3) {
        try {
            if (lh.b.E().D(null)) {
                g.h("mspl", "event " + str + " " + str2 + " " + str3);
                StringBuilder sb2 = new StringBuilder();
                if (!TextUtils.isEmpty(this.f72805h)) {
                    sb2.append("^");
                }
                sb2.append(TextUtils.isEmpty(str) ? "-" : m(str));
                sb2.append(",");
                sb2.append(m(str2));
                sb2.append(",");
                sb2.append(m(str3));
                sb2.append(",-,-,-,-,-,-,-,-,-,-,");
                sb2.append(o());
                this.f72805h += ((Object) sb2);
            } else {
                g.h("mspl", String.format("event %s %s %s", str, str2, str3));
                String str4 = "";
                if (!TextUtils.isEmpty(this.f72805h)) {
                    str4 = "^";
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", TextUtils.isEmpty(str) ? "-" : m(str), m(str2), m(str3), m(o())));
                this.f72805h += sb3.toString();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void q(String str, String str2, String str3) {
        s(str, str2, str3);
    }

    public String r(String str) {
        String strE = e(str);
        this.f72799b = strE;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.f72798a, strE, this.f72800c, this.f72801d, this.f72802e, this.f72803f, this.f72804g, p(this.f72805h), p(this.f72806i), this.f72807j);
    }

    public final synchronized void s(String str, String str2, String str3) {
        try {
            g.g("mspl", String.format("err %s %s %s", str, str2, str3));
            String str4 = "";
            if (!TextUtils.isEmpty(this.f72806i)) {
                str4 = "^";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(String.format("%s,%s,%s,%s", str, str2, TextUtils.isEmpty(str3) ? "-" : m(str3), m(o())));
            this.f72806i += sb2.toString();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
