package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import ch.qos.logback.classic.spi.CallerData;
import sg.a;
import yg.d;

/* JADX INFO: loaded from: classes3.dex */
public class UmidSdkWrapper {
    private static final String UMIDTOKEN_FILE_NAME = "xxxwww_v2";
    private static final String UMIDTOKEN_KEY_NAME = "umidtk";
    private static volatile String cachedUmidToken = "";
    private static volatile boolean initUmidFinished = false;

    private static String compatUmidBug(Context context, String str) {
        if (!a.c(str) && !a.d(str, "000000000000000000000000")) {
            return str;
        }
        String utdid = UtdidWrapper.getUtdid(context);
        if (utdid != null && utdid.contains(CallerData.NA)) {
            utdid = "";
        }
        return a.c(utdid) ? "" : utdid;
    }

    public static synchronized String getSecurityToken(Context context) {
        return cachedUmidToken;
    }

    public static String startUmidTaskSync(Context context, int i11) {
        return "";
    }

    private static synchronized void updateLocalUmidToken(Context context, String str) {
        if (a.f(str)) {
            d.a(context, UMIDTOKEN_FILE_NAME, UMIDTOKEN_KEY_NAME, str);
            cachedUmidToken = str;
        }
    }
}
