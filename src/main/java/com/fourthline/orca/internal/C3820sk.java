package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3820sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3735qk f35329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3735qk f35330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f35331c;

    public C3820sk(C3735qk c3735qk, C3735qk c3735qk2, boolean z11) {
        this.f35329a = c3735qk;
        this.f35330b = c3735qk2;
        this.f35331c = z11;
    }

    public final C3735qk a() {
        return this.f35329a;
    }

    public final boolean b() {
        return this.f35331c;
    }

    public final C3735qk c() {
        return this.f35330b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3820sk)) {
            return false;
        }
        C3820sk c3820sk = (C3820sk) obj;
        return p013kotlin.jvm.internal.s.f(this.f35329a, c3820sk.f35329a) && p013kotlin.jvm.internal.s.f(this.f35330b, c3820sk.f35330b) && this.f35331c == c3820sk.f35331c;
    }

    public int hashCode() {
        C3735qk c3735qk = this.f35329a;
        int iHashCode = (c3735qk == null ? 0 : c3735qk.hashCode()) * 31;
        C3735qk c3735qk2 = this.f35330b;
        return ((iHashCode + (c3735qk2 != null ? c3735qk2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f35331c);
    }

    public String toString() {
        return "NavigationButtonsState(primaryButtonState=" + this.f35329a + ", secondaryButtonState=" + this.f35330b + ", reserveSecondaryButtonSpaceIfButtonIsMissing=" + this.f35331c + ")";
    }

    public /* synthetic */ C3820sk(C3735qk c3735qk, C3735qk c3735qk2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c3735qk, (i11 & 2) != 0 ? null : c3735qk2, (i11 & 4) != 0 ? false : z11);
    }
}
