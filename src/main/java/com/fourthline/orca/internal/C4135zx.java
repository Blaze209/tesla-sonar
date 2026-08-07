package com.fourthline.orca.internal;

import java.util.Arrays;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4135zx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3490kx f37375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f37376b;

    public C4135zx(C3490kx selfie, byte[] bArr) {
        p013kotlin.jvm.internal.s.k(selfie, "selfie");
        this.f37375a = selfie;
        this.f37376b = bArr;
    }

    public final byte[] a() {
        return this.f37376b;
    }

    public final C3490kx b() {
        return this.f37375a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4135zx)) {
            return false;
        }
        C4135zx c4135zx = (C4135zx) obj;
        return p013kotlin.jvm.internal.s.f(this.f37375a, c4135zx.f37375a) && p013kotlin.jvm.internal.s.f(this.f37376b, c4135zx.f37376b);
    }

    public int hashCode() {
        int iHashCode = this.f37375a.hashCode() * 31;
        byte[] bArr = this.f37376b;
        return iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public String toString() {
        return "SelfieFlowDataBundle(selfie=" + this.f37375a + ", inMemoryVideo=" + Arrays.toString(this.f37376b) + ")";
    }

    public final void a(byte[] bArr) {
        this.f37376b = bArr;
    }

    public /* synthetic */ C4135zx(C3490kx c3490kx, byte[] bArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3490kx, (i11 & 2) != 0 ? null : bArr);
    }
}
