package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class L0 implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3777rk.b f26692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3777rk.a f26693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f26694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K0 f26695e;

    public L0(String name, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState, QA title, K0 itemPicker) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(itemPicker, "itemPicker");
        this.f26691a = name;
        this.f26692b = primaryButtonState;
        this.f26693c = secondaryButtonState;
        this.f26694d = title;
        this.f26695e = itemPicker;
    }

    public final L0 a(String name, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState, QA title, K0 itemPicker) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(itemPicker, "itemPicker");
        return new L0(name, primaryButtonState, secondaryButtonState, title, itemPicker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l11 = (L0) obj;
        return p013kotlin.jvm.internal.s.f(this.f26691a, l11.f26691a) && p013kotlin.jvm.internal.s.f(this.f26692b, l11.f26692b) && p013kotlin.jvm.internal.s.f(this.f26693c, l11.f26693c) && p013kotlin.jvm.internal.s.f(this.f26694d, l11.f26694d) && p013kotlin.jvm.internal.s.f(this.f26695e, l11.f26695e);
    }

    public int hashCode() {
        return (((((((this.f26691a.hashCode() * 31) + this.f26692b.hashCode()) * 31) + this.f26693c.hashCode()) * 31) + this.f26694d.hashCode()) * 31) + this.f26695e.hashCode();
    }

    public final K0 p() {
        return this.f26695e;
    }

    public final String q() {
        return this.f26691a;
    }

    public final InterfaceC3777rk.b r() {
        return this.f26692b;
    }

    public final InterfaceC3777rk.a s() {
        return this.f26693c;
    }

    public String toString() {
        return "State(name=" + this.f26691a + ", primaryButtonState=" + this.f26692b + ", secondaryButtonState=" + this.f26693c + ", title=" + this.f26694d + ", itemPicker=" + this.f26695e + ")";
    }

    public static /* synthetic */ L0 a(L0 l11, String str, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar, QA qa2, K0 k11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = l11.f26691a;
        }
        if ((i11 & 2) != 0) {
            bVar = l11.f26692b;
        }
        if ((i11 & 4) != 0) {
            aVar = l11.f26693c;
        }
        if ((i11 & 8) != 0) {
            qa2 = l11.f26694d;
        }
        if ((i11 & 16) != 0) {
            k11 = l11.f26695e;
        }
        K0 k12 = k11;
        InterfaceC3777rk.a aVar2 = aVar;
        return l11.a(str, bVar, aVar2, qa2, k12);
    }

    public final QA a() {
        return this.f26694d;
    }
}
