package com.fourthline.core.internal;

import android.os.Build;
import p013kotlin.Metadata;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"", "isRealme8Device", "()Z", "isXiaomiRedmi9TDevice", "", "b", "(Ljava/lang/String;)Z", "a", "fourthline-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidDevicesKt {
    private static final boolean a(String str) {
        return t.M(str, Build.MANUFACTURER, true);
    }

    private static final boolean b(String str) {
        return t.M(str, Build.MODEL, true);
    }

    public static final boolean isRealme8Device() {
        return a("realme") && b("RMX3241");
    }

    public static final boolean isXiaomiRedmi9TDevice() {
        return a("xiaomi") && b("M2010J19SY");
    }
}
