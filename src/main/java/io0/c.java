package io0;

import java.text.DecimalFormat;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\" \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"", "a", "Z", "()Z", "durationAssertionsEnabled", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "b", "[Ljava/lang/ThreadLocal;", "precisionFormats", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f81652a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat>[] f81653b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i11 = 0; i11 < 4; i11++) {
            threadLocalArr[i11] = new ThreadLocal<>();
        }
        f81653b = threadLocalArr;
    }

    public static final boolean a() {
        return f81652a;
    }
}
