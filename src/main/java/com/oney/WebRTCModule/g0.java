package com.oney.WebRTCModule;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes6.dex */
public class g0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45939a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f45939a = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45939a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45939a[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str)) {
            return null;
        }
        int i11 = a.f45939a[readableMap.getType(str).ordinal()];
        if (i11 == 1) {
            return String.valueOf(readableMap.getBoolean(str));
        }
        if (i11 == 2) {
            return String.valueOf(readableMap.getDouble(str));
        }
        if (i11 != 3) {
            return null;
        }
        return readableMap.getString(str);
    }
}
