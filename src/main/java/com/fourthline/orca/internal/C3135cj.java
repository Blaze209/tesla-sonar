package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3135cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f30906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f30907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3903uh f30908c;

    public C3135cj(QA title, QA description, InterfaceC3903uh imageSource) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
        this.f30906a = title;
        this.f30907b = description;
        this.f30908c = imageSource;
    }

    public final QA a() {
        return this.f30907b;
    }

    public final InterfaceC3903uh b() {
        return this.f30908c;
    }

    public final QA c() {
        return this.f30906a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3135cj)) {
            return false;
        }
        C3135cj c3135cj = (C3135cj) obj;
        return p013kotlin.jvm.internal.s.f(this.f30906a, c3135cj.f30906a) && p013kotlin.jvm.internal.s.f(this.f30907b, c3135cj.f30907b) && p013kotlin.jvm.internal.s.f(this.f30908c, c3135cj.f30908c);
    }

    public int hashCode() {
        return (((this.f30906a.hashCode() * 31) + this.f30907b.hashCode()) * 31) + this.f30908c.hashCode();
    }

    public String toString() {
        return "LearnHowToScanStep(title=" + this.f30906a + ", description=" + this.f30907b + ", imageSource=" + this.f30908c + ")";
    }
}
