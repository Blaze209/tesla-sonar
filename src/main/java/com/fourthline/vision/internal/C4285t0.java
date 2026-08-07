package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4285t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38883b;

    public C4285t0(int i11, int i12) {
        this.f38882a = i11;
        this.f38883b = i12;
    }

    public static /* synthetic */ C4285t0 copy$default(C4285t0 c4285t0, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = c4285t0.f38882a;
        }
        if ((i13 & 2) != 0) {
            i12 = c4285t0.f38883b;
        }
        return c4285t0.copy(i11, i12);
    }

    public final int component1() {
        return this.f38882a;
    }

    public final int component2() {
        return this.f38883b;
    }

    public final C4285t0 copy(int i11, int i12) {
        return new C4285t0(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4285t0)) {
            return false;
        }
        C4285t0 c4285t0 = (C4285t0) obj;
        return this.f38882a == c4285t0.f38882a && this.f38883b == c4285t0.f38883b;
    }

    public final int getX() {
        return this.f38882a;
    }

    public final int getY() {
        return this.f38883b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f38882a) * 31) + Integer.hashCode(this.f38883b);
    }

    public String toString() {
        return "Coordinate(x=" + this.f38882a + ", y=" + this.f38883b + ")";
    }
}
