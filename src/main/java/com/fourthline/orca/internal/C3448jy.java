package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerResult;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3448jy implements OD {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f32852b = SelfieScannerResult.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SelfieScannerResult f32853a;

    public C3448jy(SelfieScannerResult scannerResult) {
        p013kotlin.jvm.internal.s.k(scannerResult, "scannerResult");
        this.f32853a = scannerResult;
    }

    public final SelfieScannerResult a() {
        return this.f32853a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3448jy) && p013kotlin.jvm.internal.s.f(this.f32853a, ((C3448jy) obj).f32853a);
    }

    public int hashCode() {
        return this.f32853a.hashCode();
    }

    public String toString() {
        return "Result(scannerResult=" + this.f32853a + ")";
    }
}
