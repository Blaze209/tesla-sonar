package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class S9 implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f27731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K0 f27732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Nh f27733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3777rk.b f27734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3777rk.a f27735e;

    public S9(QA title, K0 nationalityPicker, Nh birthplaceInputViewState, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(nationalityPicker, "nationalityPicker");
        p013kotlin.jvm.internal.s.k(birthplaceInputViewState, "birthplaceInputViewState");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        this.f27731a = title;
        this.f27732b = nationalityPicker;
        this.f27733c = birthplaceInputViewState;
        this.f27734d = primaryButtonState;
        this.f27735e = secondaryButtonState;
    }

    public final S9 a(QA title, K0 nationalityPicker, Nh birthplaceInputViewState, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(nationalityPicker, "nationalityPicker");
        p013kotlin.jvm.internal.s.k(birthplaceInputViewState, "birthplaceInputViewState");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        return new S9(title, nationalityPicker, birthplaceInputViewState, primaryButtonState, secondaryButtonState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S9)) {
            return false;
        }
        S9 s11 = (S9) obj;
        return p013kotlin.jvm.internal.s.f(this.f27731a, s11.f27731a) && p013kotlin.jvm.internal.s.f(this.f27732b, s11.f27732b) && p013kotlin.jvm.internal.s.f(this.f27733c, s11.f27733c) && p013kotlin.jvm.internal.s.f(this.f27734d, s11.f27734d) && p013kotlin.jvm.internal.s.f(this.f27735e, s11.f27735e);
    }

    public int hashCode() {
        return (((((((this.f27731a.hashCode() * 31) + this.f27732b.hashCode()) * 31) + this.f27733c.hashCode()) * 31) + this.f27734d.hashCode()) * 31) + this.f27735e.hashCode();
    }

    public final Nh p() {
        return this.f27733c;
    }

    public final K0 q() {
        return this.f27732b;
    }

    public final InterfaceC3777rk.b r() {
        return this.f27734d;
    }

    public final InterfaceC3777rk.a s() {
        return this.f27735e;
    }

    public String toString() {
        return "State(title=" + this.f27731a + ", nationalityPicker=" + this.f27732b + ", birthplaceInputViewState=" + this.f27733c + ", primaryButtonState=" + this.f27734d + ", secondaryButtonState=" + this.f27735e + ")";
    }

    public static /* synthetic */ S9 a(S9 s11, QA qa2, K0 k11, Nh nh2, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = s11.f27731a;
        }
        if ((i11 & 2) != 0) {
            k11 = s11.f27732b;
        }
        if ((i11 & 4) != 0) {
            nh2 = s11.f27733c;
        }
        if ((i11 & 8) != 0) {
            bVar = s11.f27734d;
        }
        if ((i11 & 16) != 0) {
            aVar = s11.f27735e;
        }
        InterfaceC3777rk.a aVar2 = aVar;
        Nh nh3 = nh2;
        return s11.a(qa2, k11, nh3, bVar, aVar2);
    }

    public final QA a() {
        return this.f27731a;
    }
}
