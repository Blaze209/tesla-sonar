package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.a.a;
import com.alipay.apmobilesecuritysdk.e.d;
import com.alipay.apmobilesecuritysdk.e.g;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.apmobilesecuritysdk.e.i;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import java.util.HashMap;
import java.util.Map;
import wg.f;

/* JADX INFO: loaded from: classes3.dex */
public class APSecuritySdk implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static APSecuritySdk f20087a;
    public static APSecBgCheckerInterface bgChecker;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IDeviceInfo f20088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Object f20089d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20090b;

    public interface InitResultListener {
        void onResult(TokenResult tokenResult);
    }

    public class TokenResult {
        public String apdid;
        public String apdidToken;
        public String clientKey;
        public String umidToken;

        public TokenResult() {
        }
    }

    private APSecuritySdk(Context context) {
        this.f20090b = context;
    }

    public static IDeviceInfo getDeviceInfo() {
        return f20088c;
    }

    public static APSecuritySdk getInstance(Context context) {
        if (f20087a == null) {
            synchronized (f20089d) {
                try {
                    if (f20087a == null) {
                        f20087a = new APSecuritySdk(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f20087a;
    }

    public static String getUtdid(Context context) {
        return UtdidWrapper.getUtdid(context);
    }

    public static void registerBgChecker(APSecBgCheckerInterface aPSecBgCheckerInterface) {
        bgChecker = aPSecBgCheckerInterface;
    }

    public static void registerDeviceInfo(IDeviceInfo iDeviceInfo) {
        f20088c = iDeviceInfo;
    }

    @Override // wg.f
    public String getAndroidId() {
        IDeviceInfo iDeviceInfo = f20088c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getAndroidId();
        }
        return null;
    }

    public String getApdidToken() {
        String strA = a.a(this.f20090b, "");
        if (sg.a.c(strA)) {
            initToken(0, new HashMap(), null);
        }
        return strA;
    }

    public String getSdkName() {
        return "APPSecuritySDK-ALIPAYSDK";
    }

    public String getSdkVersion() {
        return "3.4.0.202507280853";
    }

    @Override // wg.f
    public String getSubscriberId() {
        IDeviceInfo iDeviceInfo = f20088c;
        if (iDeviceInfo != null) {
            return iDeviceInfo.getSubscriberId();
        }
        return null;
    }

    public synchronized TokenResult getTokenResult() {
        TokenResult tokenResult;
        tokenResult = new TokenResult();
        try {
            tokenResult.apdidToken = a.a(this.f20090b, "");
            tokenResult.clientKey = h.f(this.f20090b);
            tokenResult.apdid = a.b(this.f20090b);
            tokenResult.umidToken = UmidSdkWrapper.getSecurityToken(this.f20090b);
            if (sg.a.c(tokenResult.apdid) || sg.a.c(tokenResult.apdidToken) || sg.a.c(tokenResult.clientKey)) {
                initToken(0, new HashMap(), null);
            }
        } catch (Throwable unused) {
        }
        return tokenResult;
    }

    public void initToken(int i11, Map<String, String> map, final InitResultListener initResultListener) {
        com.alipay.apmobilesecuritysdk.b.a.a().a(i11);
        String strB = h.b(this.f20090b);
        String strC = com.alipay.apmobilesecuritysdk.b.a.a().c();
        if (sg.a.f(strB) && !sg.a.d(strB, strC)) {
            com.alipay.apmobilesecuritysdk.e.a.b(this.f20090b);
            d.a(this.f20090b);
            g.a(this.f20090b);
            i.h();
        }
        if (!sg.a.d(strB, strC)) {
            h.c(this.f20090b, strC);
        }
        String strB2 = sg.a.b(map, "utdid", "");
        String strB3 = sg.a.b(map, "tid", "");
        String strB4 = sg.a.b(map, "userId", "");
        if (sg.a.c(strB2)) {
            strB2 = UtdidWrapper.getUtdid(this.f20090b);
        }
        final HashMap map2 = new HashMap();
        map2.put("utdid", strB2);
        map2.put("tid", strB3);
        map2.put("userId", strB4);
        map2.put("appName", "");
        map2.put("appKeyClient", "");
        map2.put("appchannel", "");
        map2.put("rpcVersion", "8");
        b.a().a(new Runnable(this) { // from class: com.alipay.apmobilesecuritysdk.face.APSecuritySdk.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ APSecuritySdk f20093c;

            {
                this.f20093c = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                new a(this.f20093c.f20090b).a(map2);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 != null) {
                    initResultListener2.onResult(this.f20093c.getTokenResult());
                }
            }
        });
    }

    @Override // wg.f
    public boolean isBackgroundRunning() {
        APSecBgCheckerInterface aPSecBgCheckerInterface = bgChecker;
        if (aPSecBgCheckerInterface != null) {
            return aPSecBgCheckerInterface.isBackgroundRunning();
        }
        return false;
    }
}
