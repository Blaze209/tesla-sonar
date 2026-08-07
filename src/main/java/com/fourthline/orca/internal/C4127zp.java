package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4127zp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f37319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f37320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3277fx f37321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k3.p1 f37322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k3.p1 f37323f;

    public /* synthetic */ C4127zp(boolean z11, boolean z12, float f11, C3277fx c3277fx, k3.p1 p1Var, k3.p1 p1Var2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12, f11, c3277fx, p1Var, p1Var2);
    }

    public final k3.p1 a() {
        return this.f37322e;
    }

    public final k3.p1 b() {
        return this.f37323f;
    }

    public final float c() {
        return this.f37320c;
    }

    public final C3277fx d() {
        return this.f37321d;
    }

    public final boolean e() {
        return this.f37319b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4127zp)) {
            return false;
        }
        C4127zp c4127zp = (C4127zp) obj;
        return this.f37318a == c4127zp.f37318a && this.f37319b == c4127zp.f37319b && Float.compare(this.f37320c, c4127zp.f37320c) == 0 && p013kotlin.jvm.internal.s.f(this.f37321d, c4127zp.f37321d) && p013kotlin.jvm.internal.s.f(this.f37322e, c4127zp.f37322e) && p013kotlin.jvm.internal.s.f(this.f37323f, c4127zp.f37323f);
    }

    public final boolean f() {
        return this.f37318a;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f37318a) * 31) + Boolean.hashCode(this.f37319b)) * 31) + Float.hashCode(this.f37320c)) * 31) + this.f37321d.hashCode()) * 31;
        k3.p1 p1Var = this.f37322e;
        int iX = (iHashCode + (p1Var == null ? 0 : k3.p1.x(p1Var.getValue()))) * 31;
        k3.p1 p1Var2 = this.f37323f;
        return iX + (p1Var2 != null ? k3.p1.x(p1Var2.getValue()) : 0);
    }

    public String toString() {
        return "OverlaySettings(showGradientAtTop=" + this.f37318a + ", showGradientAtBottom=" + this.f37319b + ", overlayPercentage=" + this.f37320c + ", paddings=" + this.f37321d + ", gradientFillColor=" + this.f37322e + ", gradientTransparentColor=" + this.f37323f + ")";
    }

    private C4127zp(boolean z11, boolean z12, float f11, C3277fx paddings, k3.p1 p1Var, k3.p1 p1Var2) {
        p013kotlin.jvm.internal.s.k(paddings, "paddings");
        this.f37318a = z11;
        this.f37319b = z12;
        this.f37320c = f11;
        this.f37321d = paddings;
        this.f37322e = p1Var;
        this.f37323f = p1Var2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4127zp(boolean z11, boolean z12, float f11, C3277fx c3277fx, k3.p1 p1Var, k3.p1 p1Var2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z13 = (i11 & 1) != 0 ? false : z11;
        boolean z14 = (i11 & 2) != 0 ? true : z12;
        float f12 = (i11 & 4) != 0 ? 0.3f : f11;
        C3277fx c3277fx2 = (i11 & 8) != 0 ? new C3277fx(BitmapDescriptorFactory.HUE_RED, 1, null) : c3277fx;
        k3.p1 p1Var3 = (i11 & 16) != 0 ? null : p1Var;
        this(z13, z14, f12, c3277fx2, p1Var3, (i11 & 32) == 0 ? p1Var2 : null, null);
    }
}
