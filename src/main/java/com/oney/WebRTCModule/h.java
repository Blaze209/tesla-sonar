package com.oney.WebRTCModule;

import android.util.Log;
import org.webrtc.EglBase;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static EglBase f45948a;

    public static synchronized EglBase a() {
        if (f45948a == null) {
            int[] iArr = EglBase.CONFIG_PLAIN;
            EglBase eglBaseCreateEgl10 = null;
            try {
                e = null;
                eglBaseCreateEgl10 = EglBase.createEgl14(iArr);
            } catch (RuntimeException e11) {
                e = e11;
            }
            if (eglBaseCreateEgl10 == null) {
                try {
                    eglBaseCreateEgl10 = EglBase.createEgl10(iArr);
                } catch (RuntimeException e12) {
                    e = e12;
                }
            }
            if (e != null) {
                Log.e(h.class.getName(), "Failed to create EglBase", e);
            } else {
                f45948a = eglBaseCreateEgl10;
            }
        }
        return f45948a;
    }

    public static EglBase.Context b() {
        EglBase eglBaseA = a();
        if (eglBaseA == null) {
            return null;
        }
        return eglBaseA.getEglBaseContext();
    }
}
