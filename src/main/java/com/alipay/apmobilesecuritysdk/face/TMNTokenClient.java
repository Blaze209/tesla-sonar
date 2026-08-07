package com.alipay.apmobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.f.b;
import com.alipay.apmobilesecuritysdk.otherid.UtdidWrapper;
import java.util.HashMap;
import sg.a;

/* JADX INFO: loaded from: classes3.dex */
public class TMNTokenClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TMNTokenClient f20095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f20096b;

    public interface InitResultListener {
        void onResult(String str, int i11);
    }

    private TMNTokenClient(Context context) {
        this.f20096b = null;
        if (context == null) {
            throw new IllegalArgumentException("TMNTokenClient initialization error: context is null.");
        }
        this.f20096b = context;
    }

    public static TMNTokenClient getInstance(Context context) {
        if (f20095a == null) {
            synchronized (TMNTokenClient.class) {
                try {
                    if (f20095a == null) {
                        f20095a = new TMNTokenClient(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f20095a;
    }

    public void intiToken(final String str, String str2, String str3, final InitResultListener initResultListener) {
        if (a.c(str) && initResultListener != null) {
            initResultListener.onResult("", 2);
        }
        if (a.c(str2) && initResultListener != null) {
            initResultListener.onResult("", 3);
        }
        final HashMap map = new HashMap();
        map.put("utdid", UtdidWrapper.getUtdid(this.f20096b));
        map.put("tid", "");
        map.put("userId", "");
        map.put("appName", str);
        map.put("appKeyClient", str2);
        map.put("appchannel", "openapi");
        map.put("sessionId", str3);
        map.put("rpcVersion", "8");
        b.a().a(new Runnable(this) { // from class: com.alipay.apmobilesecuritysdk.face.TMNTokenClient.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TMNTokenClient f20100d;

            {
                this.f20100d = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                int iA = new com.alipay.apmobilesecuritysdk.a.a(this.f20100d.f20096b).a(map);
                InitResultListener initResultListener2 = initResultListener;
                if (initResultListener2 == null) {
                    return;
                }
                if (iA != 0) {
                    initResultListener2.onResult("", iA);
                } else {
                    initResultListener.onResult(com.alipay.apmobilesecuritysdk.a.a.a(this.f20100d.f20096b, str), 0);
                }
            }
        });
    }
}
