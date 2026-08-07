package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3888u8 implements Of, Of.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rf f35816a;

    public C3888u8(Rf rf2) {
        this.f35816a = rf2;
    }

    @Override // com.fourthline.orca.internal.Of.b
    public Rf a() {
        return this.f35816a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3888u8) && p013kotlin.jvm.internal.s.f(this.f35816a, ((C3888u8) obj).f35816a);
    }

    public int hashCode() {
        Rf rf2 = this.f35816a;
        if (rf2 == null) {
            return 0;
        }
        return rf2.hashCode();
    }

    public String toString() {
        return "FinishFlow(nextFlow=" + this.f35816a + ")";
    }

    @Override // com.fourthline.orca.internal.Of.b
    public void a(Rf rf2) {
        this.f35816a = rf2;
    }

    public /* synthetic */ C3888u8(Rf rf2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : rf2);
    }
}
