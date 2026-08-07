package com.alipay.apmobilesecuritysdk.a;

import android.content.Context;
import android.os.Environment;
import ch.d;
import com.alipay.apmobilesecuritysdk.c.c;
import com.alipay.apmobilesecuritysdk.d.e;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.alipay.apmobilesecuritysdk.b.a f20057b = com.alipay.apmobilesecuritysdk.b.a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20058c = 4;

    public a(Context context) {
        this.f20056a = context;
    }

    private int b(Map<String, String> map) {
        String str;
        String strB = sg.a.b(map, "appName", "");
        b();
        b(strB);
        boolean zA = a(map, strB);
        Context context = this.f20056a;
        h.b(context, String.valueOf(wg.b.c(APSecuritySdk.getInstance(context)).B()));
        if (!zA) {
            return 0;
        }
        c.a(this.f20056a).b();
        UmidSdkWrapper.startUmidTaskSync(this.f20056a, com.alipay.apmobilesecuritysdk.b.a.a().b());
        eh.c cVarC = c(map);
        int iC = cVarC != null ? cVarC.c() : 2;
        if (iC == 1) {
            a(strB, cVarC, map);
            return 0;
        }
        if (iC == 3) {
            return 1;
        }
        if (cVarC != null) {
            str = "Server error, result:" + cVarC.f62939b;
        } else {
            str = "Server error, returned null";
        }
        com.alipay.apmobilesecuritysdk.c.a.a(str);
        return sg.a.c(a(this.f20056a, strB)) ? 4 : 0;
    }

    private eh.c c(Map<String, String> map) {
        try {
            return d.c(this.f20056a, this.f20057b.c()).a(b.a(this.f20056a, map));
        } catch (Throwable th2) {
            th2.printStackTrace();
            com.alipay.apmobilesecuritysdk.c.a.a(th2);
            return null;
        }
    }

    private String d(Map<String, String> map) {
        String strB = sg.a.b(map, "utdid", "");
        if (!sg.a.f(strB) || sg.a.d(strB, i.e())) {
            return i.e();
        }
        i.f(strB);
        return strB;
    }

    private String e(Map<String, String> map) {
        String strB = sg.a.b(map, "tid", "");
        if (!sg.a.f(strB) || sg.a.d(strB, i.d())) {
            return i.d();
        }
        i.e(strB);
        return strB;
    }

    public int a(Map<String, String> map) {
        try {
            com.alipay.apmobilesecuritysdk.c.a.a(this.f20056a, sg.a.b(map, "tid", ""), sg.a.b(map, "utdid", ""), b(this.f20056a));
            this.f20058c = b(map);
            com.alipay.apmobilesecuritysdk.c.a.a(this.f20056a, d.c(this.f20056a, this.f20057b.c()));
        } catch (Exception e11) {
            com.alipay.apmobilesecuritysdk.c.a.a(e11);
        }
        return this.f20058c;
    }

    public static String a(Context context) {
        try {
            String strB = i.b();
            if (!sg.a.c(strB)) {
                return strB;
            }
            com.alipay.apmobilesecuritysdk.e.c cVarC = com.alipay.apmobilesecuritysdk.e.d.c(context);
            if (cVarC != null) {
                i.a(cVarC);
                String str = cVarC.f20066a;
                if (sg.a.f(str)) {
                    return str;
                }
            }
            com.alipay.apmobilesecuritysdk.e.b bVarC = com.alipay.apmobilesecuritysdk.e.a.c(context);
            if (bVarC == null) {
                return "";
            }
            i.a(bVarC);
            String str2 = bVarC.f20063a;
            return sg.a.f(str2) ? str2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        String strA = a(context);
        return sg.a.c(strA) ? h.f(context) : strA;
    }

    public static String a(Context context, String str) {
        try {
            b();
            String strA = i.a(str);
            if (!sg.a.c(strA)) {
                return strA;
            }
            String strA2 = g.a(context, str);
            i.a(str, strA2);
            return !sg.a.c(strA2) ? strA2 : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private static void b() {
        try {
            String[] strArr = {"device_feature_file_name", "wallet_times", "wxcasxx_v3", "wxcasxx_v4", "wxxzyy_v1"};
            for (int i11 = 0; i11 < 5; i11++) {
                String str = strArr[i11];
                File file = new File(Environment.getExternalStorageDirectory(), ".SystemConfig/" + str);
                if (file.exists() && file.canWrite()) {
                    file.delete();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void a(String str, eh.c cVar, Map<String, String> map) {
        h.a(this.f20056a, cVar.b());
        h.d(this.f20056a, cVar.a());
        h.e(this.f20056a, cVar.f62944g);
        h.a(this.f20056a, cVar.f62945h);
        h.f(this.f20056a, cVar.f62946i);
        h.g(this.f20056a, cVar.f62948k);
        i.c(e.b(this.f20056a, map));
        i.a(str, cVar.f62941d);
        i.b(cVar.f62940c);
        i.d(cVar.f62947j);
        i.e(e(map));
        i.f(d(map));
        i.a();
        com.alipay.apmobilesecuritysdk.e.d.a(this.f20056a, i.g());
        com.alipay.apmobilesecuritysdk.e.d.b(this.f20056a);
        com.alipay.apmobilesecuritysdk.e.a.a(this.f20056a, new com.alipay.apmobilesecuritysdk.e.b(i.b(), i.c(), i.f()));
        com.alipay.apmobilesecuritysdk.e.a.a(this.f20056a);
        g.a(this.f20056a, str, i.a(str));
        g.b(this.f20056a, str);
        h.a(this.f20056a, str, System.currentTimeMillis());
    }

    private void b(String str) {
        a(this.f20056a);
        a(this.f20056a, str);
        i.a();
    }

    private boolean a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = {"2017-01-27 2017-01-28", "2017-11-10 2017-11-11", "2017-12-11 2017-12-12"};
        int iRandom = (int) (Math.random() * 24.0d * 60.0d * 60.0d);
        for (int i11 = 0; i11 < 3; i11++) {
            try {
                String[] strArrSplit = strArr[i11].split(" ");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    Date date = new Date();
                    Date date2 = simpleDateFormat.parse(strArrSplit[0] + " 00:00:00");
                    Date date3 = simpleDateFormat.parse(strArrSplit[1] + " 23:59:59");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date3);
                    calendar.add(13, iRandom);
                    Date time = calendar.getTime();
                    if (date.after(date2) && date.before(time)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private boolean a(String str) {
        return sg.a.c(a(this.f20056a, str)) || sg.a.c(a(this.f20056a));
    }

    private boolean a(Map<String, String> map, String str) {
        if (a() || com.alipay.apmobilesecuritysdk.common.a.a(this.f20056a)) {
            return a(str);
        }
        e.a();
        if (!sg.a.d(e.b(this.f20056a, map), i.c())) {
            return true;
        }
        String strB = sg.a.b(map, "tid", "");
        String strB2 = sg.a.b(map, "utdid", "");
        if (!sg.a.f(strB) || sg.a.d(strB, i.d())) {
            return (sg.a.f(strB2) && !sg.a.d(strB2, i.e())) || !i.a(this.f20056a, str) || sg.a.c(a(this.f20056a, str)) || sg.a.c(a(this.f20056a));
        }
        return true;
    }
}
