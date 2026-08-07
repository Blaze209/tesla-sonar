package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3893uD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4023xD f35850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3980wD f35851b;

    public C3893uD(C4023xD c4023xD, C3980wD c3980wD) {
        this.f35850a = c4023xD;
        this.f35851b = c3980wD;
    }

    public final C3980wD a() {
        return this.f35851b;
    }

    public final C4023xD b() {
        return this.f35850a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3893uD)) {
            return false;
        }
        C3893uD c3893uD = (C3893uD) obj;
        return p013kotlin.jvm.internal.s.f(this.f35850a, c3893uD.f35850a) && p013kotlin.jvm.internal.s.f(this.f35851b, c3893uD.f35851b);
    }

    public int hashCode() {
        C4023xD c4023xD = this.f35850a;
        int iHashCode = (c4023xD == null ? 0 : c4023xD.hashCode()) * 31;
        C3980wD c3980wD = this.f35851b;
        return iHashCode + (c3980wD != null ? c3980wD.hashCode() : 0);
    }

    public String toString() {
        return "ValidationDocAnalysisInput(recognitionData=" + this.f35850a + ", documentIdData=" + this.f35851b + ")";
    }

    public /* synthetic */ C3893uD(C4023xD c4023xD, C3980wD c3980wD, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c4023xD, (i11 & 2) != 0 ? null : c3980wD);
    }
}
