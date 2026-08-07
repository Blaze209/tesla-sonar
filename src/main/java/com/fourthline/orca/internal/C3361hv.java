package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3361hv implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f32365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3903uh f32366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3903uh f32367e;

    public C3361hv(String title, List pdfPages, QA closeButtonText, InterfaceC3903uh downloadImageSource, InterfaceC3903uh shareImageSource) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(pdfPages, "pdfPages");
        p013kotlin.jvm.internal.s.k(closeButtonText, "closeButtonText");
        p013kotlin.jvm.internal.s.k(downloadImageSource, "downloadImageSource");
        p013kotlin.jvm.internal.s.k(shareImageSource, "shareImageSource");
        this.f32363a = title;
        this.f32364b = pdfPages;
        this.f32365c = closeButtonText;
        this.f32366d = downloadImageSource;
        this.f32367e = shareImageSource;
    }

    public final C3361hv a(String title, List pdfPages, QA closeButtonText, InterfaceC3903uh downloadImageSource, InterfaceC3903uh shareImageSource) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(pdfPages, "pdfPages");
        p013kotlin.jvm.internal.s.k(closeButtonText, "closeButtonText");
        p013kotlin.jvm.internal.s.k(downloadImageSource, "downloadImageSource");
        p013kotlin.jvm.internal.s.k(shareImageSource, "shareImageSource");
        return new C3361hv(title, pdfPages, closeButtonText, downloadImageSource, shareImageSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3361hv)) {
            return false;
        }
        C3361hv c3361hv = (C3361hv) obj;
        return p013kotlin.jvm.internal.s.f(this.f32363a, c3361hv.f32363a) && p013kotlin.jvm.internal.s.f(this.f32364b, c3361hv.f32364b) && p013kotlin.jvm.internal.s.f(this.f32365c, c3361hv.f32365c) && p013kotlin.jvm.internal.s.f(this.f32366d, c3361hv.f32366d) && p013kotlin.jvm.internal.s.f(this.f32367e, c3361hv.f32367e);
    }

    public int hashCode() {
        return (((((((this.f32363a.hashCode() * 31) + this.f32364b.hashCode()) * 31) + this.f32365c.hashCode()) * 31) + this.f32366d.hashCode()) * 31) + this.f32367e.hashCode();
    }

    public final QA p() {
        return this.f32365c;
    }

    public final InterfaceC3903uh q() {
        return this.f32366d;
    }

    public final List r() {
        return this.f32364b;
    }

    public final InterfaceC3903uh s() {
        return this.f32367e;
    }

    public final String t() {
        return this.f32363a;
    }

    public String toString() {
        return "State(title=" + this.f32363a + ", pdfPages=" + this.f32364b + ", closeButtonText=" + this.f32365c + ", downloadImageSource=" + this.f32366d + ", shareImageSource=" + this.f32367e + ")";
    }

    public static /* synthetic */ C3361hv a(C3361hv c3361hv, String str, List list, QA qa2, InterfaceC3903uh interfaceC3903uh, InterfaceC3903uh interfaceC3903uh2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c3361hv.f32363a;
        }
        if ((i11 & 2) != 0) {
            list = c3361hv.f32364b;
        }
        if ((i11 & 4) != 0) {
            qa2 = c3361hv.f32365c;
        }
        if ((i11 & 8) != 0) {
            interfaceC3903uh = c3361hv.f32366d;
        }
        if ((i11 & 16) != 0) {
            interfaceC3903uh2 = c3361hv.f32367e;
        }
        InterfaceC3903uh interfaceC3903uh3 = interfaceC3903uh2;
        QA qa3 = qa2;
        return c3361hv.a(str, list, qa3, interfaceC3903uh, interfaceC3903uh3);
    }
}
