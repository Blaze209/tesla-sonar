package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3475ki implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f32998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f32999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Yj f33000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3777rk.b f33001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3777rk.a f33002f;

    public C3475ki(String name, QA title, QA description, Yj lottieSource, InterfaceC3777rk.b primaryButton, InterfaceC3777rk.a secondaryButton) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p013kotlin.jvm.internal.s.k(primaryButton, "primaryButton");
        p013kotlin.jvm.internal.s.k(secondaryButton, "secondaryButton");
        this.f32997a = name;
        this.f32998b = title;
        this.f32999c = description;
        this.f33000d = lottieSource;
        this.f33001e = primaryButton;
        this.f33002f = secondaryButton;
    }

    public final C3475ki a(String name, QA title, QA description, Yj lottieSource, InterfaceC3777rk.b primaryButton, InterfaceC3777rk.a secondaryButton) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p013kotlin.jvm.internal.s.k(primaryButton, "primaryButton");
        p013kotlin.jvm.internal.s.k(secondaryButton, "secondaryButton");
        return new C3475ki(name, title, description, lottieSource, primaryButton, secondaryButton);
    }

    public final QA b() {
        return this.f32999c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3475ki)) {
            return false;
        }
        C3475ki c3475ki = (C3475ki) obj;
        return p013kotlin.jvm.internal.s.f(this.f32997a, c3475ki.f32997a) && p013kotlin.jvm.internal.s.f(this.f32998b, c3475ki.f32998b) && p013kotlin.jvm.internal.s.f(this.f32999c, c3475ki.f32999c) && p013kotlin.jvm.internal.s.f(this.f33000d, c3475ki.f33000d) && p013kotlin.jvm.internal.s.f(this.f33001e, c3475ki.f33001e) && p013kotlin.jvm.internal.s.f(this.f33002f, c3475ki.f33002f);
    }

    public int hashCode() {
        return (((((((((this.f32997a.hashCode() * 31) + this.f32998b.hashCode()) * 31) + this.f32999c.hashCode()) * 31) + this.f33000d.hashCode()) * 31) + this.f33001e.hashCode()) * 31) + this.f33002f.hashCode();
    }

    public final Yj p() {
        return this.f33000d;
    }

    public final String q() {
        return this.f32997a;
    }

    public final InterfaceC3777rk.b r() {
        return this.f33001e;
    }

    public final InterfaceC3777rk.a s() {
        return this.f33002f;
    }

    public String toString() {
        return "State(name=" + this.f32997a + ", title=" + this.f32998b + ", description=" + this.f32999c + ", lottieSource=" + this.f33000d + ", primaryButton=" + this.f33001e + ", secondaryButton=" + this.f33002f + ")";
    }

    public static /* synthetic */ C3475ki a(C3475ki c3475ki, String str, QA qa2, QA qa3, Yj yj2, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c3475ki.f32997a;
        }
        if ((i11 & 2) != 0) {
            qa2 = c3475ki.f32998b;
        }
        if ((i11 & 4) != 0) {
            qa3 = c3475ki.f32999c;
        }
        if ((i11 & 8) != 0) {
            yj2 = c3475ki.f33000d;
        }
        if ((i11 & 16) != 0) {
            bVar = c3475ki.f33001e;
        }
        if ((i11 & 32) != 0) {
            aVar = c3475ki.f33002f;
        }
        InterfaceC3777rk.b bVar2 = bVar;
        InterfaceC3777rk.a aVar2 = aVar;
        return c3475ki.a(str, qa2, qa3, yj2, bVar2, aVar2);
    }

    public final QA a() {
        return this.f32998b;
    }
}
