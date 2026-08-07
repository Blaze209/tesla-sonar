package com.fourthline.orca.internal;

import com.fourthline.nfc.NfcScannerResult;

/* JADX INFO: loaded from: classes4.dex */
public final class Bm implements Am {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f25099b = NfcScannerResult.$stable;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NfcScannerResult f25100a;

    public Bm(NfcScannerResult scannerResult) {
        p013kotlin.jvm.internal.s.k(scannerResult, "scannerResult");
        this.f25100a = scannerResult;
    }

    public final NfcScannerResult a() {
        return this.f25100a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Bm) && p013kotlin.jvm.internal.s.f(this.f25100a, ((Bm) obj).f25100a);
    }

    public int hashCode() {
        return this.f25100a.hashCode();
    }

    public String toString() {
        return "NfcCapabilityResultFromModule(scannerResult=" + this.f25100a + ")";
    }
}
