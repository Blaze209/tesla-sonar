package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4042xq implements InterfaceC3447jx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G5 f36787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f36788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f36789c;

    public C4042xq(G5 country, QA name, wn0.a presentation) {
        p013kotlin.jvm.internal.s.k(country, "country");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(presentation, "presentation");
        this.f36787a = country;
        this.f36788b = name;
        this.f36789c = presentation;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3447jx
    public wn0.a a() {
        return this.f36789c;
    }

    public final G5 b() {
        return this.f36787a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4042xq)) {
            return false;
        }
        C4042xq c4042xq = (C4042xq) obj;
        return p013kotlin.jvm.internal.s.f(this.f36787a, c4042xq.f36787a) && p013kotlin.jvm.internal.s.f(this.f36788b, c4042xq.f36788b) && p013kotlin.jvm.internal.s.f(this.f36789c, c4042xq.f36789c);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3447jx
    public QA getName() {
        return this.f36788b;
    }

    public int hashCode() {
        return (((this.f36787a.hashCode() * 31) + this.f36788b.hashCode()) * 31) + this.f36789c.hashCode();
    }

    public String toString() {
        return "PersonNationalitySuggestion(country=" + this.f36787a + ", name=" + this.f36788b + ", presentation=" + this.f36789c + ")";
    }
}
