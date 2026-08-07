package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Lo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f26830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f26831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f26832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f26833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f26834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f26835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f26836g;

    public /* synthetic */ Lo(float f11, float f12, float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, f15);
    }

    public final float a() {
        return this.f26834e;
    }

    public final float b() {
        return this.f26831b;
    }

    public final float c() {
        return this.f26832c;
    }

    public final float d() {
        return this.f26836g;
    }

    public final float e() {
        return this.f26835f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lo)) {
            return false;
        }
        Lo lo2 = (Lo) obj;
        return w4.h.i(this.f26830a, lo2.f26830a) && w4.h.i(this.f26831b, lo2.f26831b) && w4.h.i(this.f26832c, lo2.f26832c) && w4.h.i(this.f26833d, lo2.f26833d) && w4.h.i(this.f26834e, lo2.f26834e);
    }

    public final float f() {
        return this.f26830a;
    }

    public int hashCode() {
        return (((((((w4.h.j(this.f26830a) * 31) + w4.h.j(this.f26831b)) * 31) + w4.h.j(this.f26832c)) * 31) + w4.h.j(this.f26833d)) * 31) + w4.h.j(this.f26834e);
    }

    public String toString() {
        return "OrcaLayouts(viewMargins=" + w4.h.k(this.f26830a) + ", cornerRadius=" + w4.h.k(this.f26831b) + ", popupCornerRadius=" + w4.h.k(this.f26832c) + ", primaryButtonCornerRadius=" + w4.h.k(this.f26833d) + ", borderWidth=" + w4.h.k(this.f26834e) + ")";
    }

    private Lo(float f11, float f12, float f13, float f14, float f15) {
        this.f26830a = f11;
        this.f26831b = f12;
        this.f26832c = f13;
        this.f26833d = f14;
        this.f26834e = f15;
        this.f26835f = w4.h.g(48);
        this.f26836g = w4.h.g(32);
    }
}
