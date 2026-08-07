package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3765rE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private XE f35014b;

    public C3765rE(String validationCode, XE xe2) {
        p013kotlin.jvm.internal.s.k(validationCode, "validationCode");
        this.f35013a = validationCode;
        this.f35014b = xe2;
    }

    public final XE a() {
        return this.f35014b;
    }

    public final String b() {
        return this.f35013a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3765rE)) {
            return false;
        }
        C3765rE c3765rE = (C3765rE) obj;
        return p013kotlin.jvm.internal.s.f(this.f35013a, c3765rE.f35013a) && p013kotlin.jvm.internal.s.f(this.f35014b, c3765rE.f35014b);
    }

    public int hashCode() {
        int iHashCode = this.f35013a.hashCode() * 31;
        XE xe2 = this.f35014b;
        return iHashCode + (xe2 == null ? 0 : xe2.hashCode());
    }

    public String toString() {
        return "WorkflowFlowDataBundle(validationCode=" + this.f35013a + ", networkConfig=" + this.f35014b + ")";
    }

    public final void a(XE xe2) {
        this.f35014b = xe2;
    }

    public /* synthetic */ C3765rE(String str, XE xe2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : xe2);
    }
}
