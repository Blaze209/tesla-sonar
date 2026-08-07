package com.facebook.react.modules.systeminfo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.n;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0013R\u001c\u0010\u001f\u001a\n \u001d*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e¨\u0006!"}, d2 = {"Lcom/facebook/react/modules/systeminfo/a;", "", "<init>", "()V", "", "j", "()Z", "k", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "h", "(Landroid/content/Context;)Ljava/lang/String;", "", "port", "a", "(I)Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "applicationContext", "", "e", "(Landroid/content/Context;)Ljava/util/Map;", "g", "c", "(Landroid/content/Context;)I", IntegerTokenConverter.CONVERTER_KEY, "f", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "metroHostPropValue", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22870a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String TAG = a.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static String metroHostPropValue;

    private a() {
    }

    public static final String a(int port) {
        return "adb reverse tcp:" + port + " tcp:" + port;
    }

    public static final String b(Context context) {
        s.k(context, "context");
        return a(f22870a.c(context));
    }

    private final int c(Context context) {
        return context.getResources().getInteger(n.f22876a);
    }

    public static final String d() {
        if (f22870a.j()) {
            String str = Build.MODEL;
            s.h(str);
            return str;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static final Map<String, String> e(Context applicationContext) {
        String packageName;
        String string;
        if (applicationContext != null) {
            ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
            int i11 = applicationInfo.labelRes;
            packageName = applicationContext.getPackageName();
            if (i11 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = applicationContext.getString(i11);
                s.h(string);
            }
        } else {
            packageName = null;
            string = null;
        }
        return v0.m(x.a("appDisplayName", string), x.a("appIdentifier", packageName), x.a("platform", "android"), x.a("deviceName", Build.MODEL), x.a("reactNativeVersion", f22870a.g()));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    private final synchronized String f() {
        BufferedReader bufferedReader;
        Throwable th2;
        Process processExec;
        Exception e11;
        String str;
        String str2 = metroHostPropValue;
        if (str2 != null) {
            s.h(str2);
            return str2;
        }
        try {
            try {
                processExec = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", "metro.host"});
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), Charset.forName("UTF-8")));
                    String str3 = "";
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            str3 = line;
                        } catch (Exception e12) {
                            e11 = e12;
                            qk.a.J(TAG, "Failed to query for metro.host prop:", e11);
                            metroHostPropValue = "";
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (processExec != null) {
                            }
                            str = metroHostPropValue;
                            if (str == null) {
                                str = "";
                            }
                            return str;
                        }
                    }
                    metroHostPropValue = str3;
                    bufferedReader.close();
                } catch (Exception e13) {
                    bufferedReader = null;
                    e11 = e13;
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th2 = th3;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Exception e14) {
            bufferedReader = null;
            e11 = e14;
            processExec = null;
        } catch (Throwable th5) {
            bufferedReader = null;
            th2 = th5;
            processExec = null;
        }
        processExec.destroy();
        str = metroHostPropValue;
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002f  */
    private final String g() {
        String str;
        Map<String, Object> map = b.f22873a;
        Object obj = map.get("major");
        Object obj2 = map.get("minor");
        Object obj3 = map.get("patch");
        Object obj4 = map.get("prerelease");
        if (obj4 != null) {
            str = "-" + obj4;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        return obj + "." + obj2 + "." + obj3 + str;
    }

    public static final String h(Context context) {
        s.k(context, "context");
        a aVar = f22870a;
        return aVar.i(aVar.c(context));
    }

    private final String i(int port) {
        String strF;
        if (f().length() > 0) {
            strF = f();
        } else if (j()) {
            strF = "10.0.3.2";
        } else {
            strF = k() ? "10.0.2.2" : "localhost";
        }
        t0 t0Var = t0.f86535a;
        String str = String.format(Locale.US, "%s:%d", Arrays.copyOf(new Object[]{strF, Integer.valueOf(port)}, 2));
        s.j(str, "format(...)");
        return str;
    }

    private final boolean j() {
        String FINGERPRINT = Build.FINGERPRINT;
        s.j(FINGERPRINT, "FINGERPRINT");
        return t.h0(FINGERPRINT, "vbox", false, 2, null);
    }

    private final boolean k() {
        String FINGERPRINT = Build.FINGERPRINT;
        s.j(FINGERPRINT, "FINGERPRINT");
        if (t.h0(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        s.j(FINGERPRINT, "FINGERPRINT");
        return t.b0(FINGERPRINT, "google/sdk_gphone", false, 2, null);
    }
}
