package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3906uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f35923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f35924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f35925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3743qs f35926d;

    public C3906uk(boolean z11, boolean z12, boolean z13, C3743qs c3743qs) {
        this.f35923a = z11;
        this.f35924b = z12;
        this.f35925c = z13;
        this.f35926d = c3743qs;
    }

    public final boolean a() {
        return this.f35923a;
    }

    public final C3743qs b() {
        return this.f35926d;
    }

    public final boolean c() {
        return this.f35925c;
    }

    public final boolean d() {
        return this.f35924b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3906uk)) {
            return false;
        }
        C3906uk c3906uk = (C3906uk) obj;
        return this.f35923a == c3906uk.f35923a && this.f35924b == c3906uk.f35924b && this.f35925c == c3906uk.f35925c && p013kotlin.jvm.internal.s.f(this.f35926d, c3906uk.f35926d);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f35923a) * 31) + Boolean.hashCode(this.f35924b)) * 31) + Boolean.hashCode(this.f35925c)) * 31;
        C3743qs c3743qs = this.f35926d;
        return iHashCode + (c3743qs == null ? 0 : c3743qs.hashCode());
    }

    public String toString() {
        return "NavigationConfig(fullScreen=" + this.f35923a + ", singleTop=" + this.f35924b + ", shouldRestoreState=" + this.f35925c + ", popUpToConfig=" + this.f35926d + ")";
    }

    public /* synthetic */ C3906uk(boolean z11, boolean z12, boolean z13, C3743qs c3743qs, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? null : c3743qs);
    }
}
