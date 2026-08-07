package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3743qs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3949vk f34888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f34889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34890c;

    public C3743qs(InterfaceC3949vk destination, boolean z11, boolean z12) {
        p013kotlin.jvm.internal.s.k(destination, "destination");
        this.f34888a = destination;
        this.f34889b = z11;
        this.f34890c = z12;
    }

    public final InterfaceC3949vk a() {
        return this.f34888a;
    }

    public final boolean b() {
        return this.f34889b;
    }

    public final boolean c() {
        return this.f34890c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3743qs)) {
            return false;
        }
        C3743qs c3743qs = (C3743qs) obj;
        return p013kotlin.jvm.internal.s.f(this.f34888a, c3743qs.f34888a) && this.f34889b == c3743qs.f34889b && this.f34890c == c3743qs.f34890c;
    }

    public int hashCode() {
        return (((this.f34888a.hashCode() * 31) + Boolean.hashCode(this.f34889b)) * 31) + Boolean.hashCode(this.f34890c);
    }

    public String toString() {
        return "PopUpToConfig(destination=" + this.f34888a + ", inclusive=" + this.f34889b + ", saveState=" + this.f34890c + ")";
    }

    public /* synthetic */ C3743qs(InterfaceC3949vk interfaceC3949vk, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3949vk, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12);
    }
}
