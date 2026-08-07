package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f25545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25547c;

    public E3(QA text, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(text, "text");
        this.f25545a = text;
        this.f25546b = z11;
        this.f25547c = z12;
    }

    public final E3 a(QA text, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(text, "text");
        return new E3(text, z11, z12);
    }

    public final QA b() {
        return this.f25545a;
    }

    public final boolean c() {
        return this.f25547c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E3)) {
            return false;
        }
        E3 e11 = (E3) obj;
        return p013kotlin.jvm.internal.s.f(this.f25545a, e11.f25545a) && this.f25546b == e11.f25546b && this.f25547c == e11.f25547c;
    }

    public int hashCode() {
        return (((this.f25545a.hashCode() * 31) + Boolean.hashCode(this.f25546b)) * 31) + Boolean.hashCode(this.f25547c);
    }

    public String toString() {
        return "ButtonState(text=" + this.f25545a + ", enabled=" + this.f25546b + ", isProgressing=" + this.f25547c + ")";
    }

    public static /* synthetic */ E3 a(E3 e11, QA qa2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = e11.f25545a;
        }
        if ((i11 & 2) != 0) {
            z11 = e11.f25546b;
        }
        if ((i11 & 4) != 0) {
            z12 = e11.f25547c;
        }
        return e11.a(qa2, z11, z12);
    }

    public final boolean a() {
        return this.f25546b;
    }

    public /* synthetic */ E3(QA qa2, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? QA.b.f27435b : qa2, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? false : z12);
    }
}
