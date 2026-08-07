package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.d8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3161d8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f31077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private QA f31078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31079c;

    public C3161d8(QA text, QA link, boolean z11) {
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(link, "link");
        this.f31077a = text;
        this.f31078b = link;
        this.f31079c = z11;
    }

    public final C3161d8 a(QA text, QA link, boolean z11) {
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(link, "link");
        return new C3161d8(text, link, z11);
    }

    public final QA b() {
        return this.f31078b;
    }

    public final QA c() {
        return this.f31077a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3161d8)) {
            return false;
        }
        C3161d8 c3161d8 = (C3161d8) obj;
        return p013kotlin.jvm.internal.s.f(this.f31077a, c3161d8.f31077a) && p013kotlin.jvm.internal.s.f(this.f31078b, c3161d8.f31078b) && this.f31079c == c3161d8.f31079c;
    }

    public int hashCode() {
        return (((this.f31077a.hashCode() * 31) + this.f31078b.hashCode()) * 31) + Boolean.hashCode(this.f31079c);
    }

    public String toString() {
        return "LinkButtonState(text=" + this.f31077a + ", link=" + this.f31078b + ", enabled=" + this.f31079c + ")";
    }

    public static /* synthetic */ C3161d8 a(C3161d8 c3161d8, QA qa2, QA qa3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3161d8.f31077a;
        }
        if ((i11 & 2) != 0) {
            qa3 = c3161d8.f31078b;
        }
        if ((i11 & 4) != 0) {
            z11 = c3161d8.f31079c;
        }
        return c3161d8.a(qa2, qa3, z11);
    }

    public final boolean a() {
        return this.f31079c;
    }
}
