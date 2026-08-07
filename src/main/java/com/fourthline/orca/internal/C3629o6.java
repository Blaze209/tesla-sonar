package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3629o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3500l6.a f34085b;

    public C3629o6(String identifier, InterfaceC3500l6.a status) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(status, "status");
        this.f34084a = identifier;
        this.f34085b = status;
    }

    public final String a() {
        return this.f34084a;
    }

    public final InterfaceC3500l6.a b() {
        return this.f34085b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3629o6)) {
            return false;
        }
        C3629o6 c3629o6 = (C3629o6) obj;
        return p013kotlin.jvm.internal.s.f(this.f34084a, c3629o6.f34084a) && p013kotlin.jvm.internal.s.f(this.f34085b, c3629o6.f34085b);
    }

    public int hashCode() {
        return (this.f34084a.hashCode() * 31) + this.f34085b.hashCode();
    }

    public String toString() {
        return "DataWorkStatusUpdate(identifier=" + this.f34084a + ", status=" + this.f34085b + ")";
    }
}
