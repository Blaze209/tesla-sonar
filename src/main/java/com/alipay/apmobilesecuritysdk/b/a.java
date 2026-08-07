package com.alipay.apmobilesecuritysdk.b;

import ch.d;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f20059b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20060a = 0;

    public static a a() {
        return f20059b;
    }

    public int b() {
        return this.f20060a;
    }

    public String c() {
        String str;
        String strB = d.b();
        if (sg.a.f(strB)) {
            return strB;
        }
        int i11 = this.f20060a;
        if (i11 == 1) {
            str = "://mobilegw.stable.alipay.net/mgw.htm";
        } else {
            if (i11 == 2) {
                return "https://mobilegwpre.alipay.com/mgw.htm";
            }
            if (i11 == 3) {
                str = "://mobilegw-1-64.test.alipay.net/mgw.htm";
            } else {
                if (i11 != 4) {
                    return "https://mobilegw.alipay.com/mgw.htm";
                }
                str = "://mobilegw.aaa.alipay.net/mgw.htm";
            }
        }
        return a("http", str);
    }

    private String a(String str, String str2) {
        return str + str2;
    }

    public void a(int i11) {
        this.f20060a = i11;
    }
}
