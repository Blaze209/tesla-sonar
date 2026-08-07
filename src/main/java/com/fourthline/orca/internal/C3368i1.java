package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3368i1 implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f32408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Nh f32409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f32410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f32411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3777rk.b f32412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3777rk.a f32413f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.i1$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f32414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f32415b;

        public a(QA text, QA link) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(link, "link");
            this.f32414a = text;
            this.f32415b = link;
        }

        public final QA a() {
            return this.f32415b;
        }

        public final QA b() {
            return this.f32414a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f32414a, aVar.f32414a) && p013kotlin.jvm.internal.s.f(this.f32415b, aVar.f32415b);
        }

        public int hashCode() {
            return (this.f32414a.hashCode() * 31) + this.f32415b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f32414a + ", link=" + this.f32415b + ")";
        }
    }

    public C3368i1(QA title, Nh input, QA hint, a linkButton, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(linkButton, "linkButton");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        this.f32408a = title;
        this.f32409b = input;
        this.f32410c = hint;
        this.f32411d = linkButton;
        this.f32412e = primaryButtonState;
        this.f32413f = secondaryButtonState;
    }

    public final C3368i1 a(QA title, Nh input, QA hint, a linkButton, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(linkButton, "linkButton");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        return new C3368i1(title, input, hint, linkButton, primaryButtonState, secondaryButtonState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3368i1)) {
            return false;
        }
        C3368i1 c3368i1 = (C3368i1) obj;
        return p013kotlin.jvm.internal.s.f(this.f32408a, c3368i1.f32408a) && p013kotlin.jvm.internal.s.f(this.f32409b, c3368i1.f32409b) && p013kotlin.jvm.internal.s.f(this.f32410c, c3368i1.f32410c) && p013kotlin.jvm.internal.s.f(this.f32411d, c3368i1.f32411d) && p013kotlin.jvm.internal.s.f(this.f32412e, c3368i1.f32412e) && p013kotlin.jvm.internal.s.f(this.f32413f, c3368i1.f32413f);
    }

    public int hashCode() {
        return (((((((((this.f32408a.hashCode() * 31) + this.f32409b.hashCode()) * 31) + this.f32410c.hashCode()) * 31) + this.f32411d.hashCode()) * 31) + this.f32412e.hashCode()) * 31) + this.f32413f.hashCode();
    }

    public final QA p() {
        return this.f32410c;
    }

    public final Nh q() {
        return this.f32409b;
    }

    public final a r() {
        return this.f32411d;
    }

    public final InterfaceC3777rk.b s() {
        return this.f32412e;
    }

    public final InterfaceC3777rk.a t() {
        return this.f32413f;
    }

    public String toString() {
        return "State(title=" + this.f32408a + ", input=" + this.f32409b + ", hint=" + this.f32410c + ", linkButton=" + this.f32411d + ", primaryButtonState=" + this.f32412e + ", secondaryButtonState=" + this.f32413f + ")";
    }

    public static /* synthetic */ C3368i1 a(C3368i1 c3368i1, QA qa2, Nh nh2, QA qa3, a aVar, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3368i1.f32408a;
        }
        if ((i11 & 2) != 0) {
            nh2 = c3368i1.f32409b;
        }
        if ((i11 & 4) != 0) {
            qa3 = c3368i1.f32410c;
        }
        if ((i11 & 8) != 0) {
            aVar = c3368i1.f32411d;
        }
        if ((i11 & 16) != 0) {
            bVar = c3368i1.f32412e;
        }
        if ((i11 & 32) != 0) {
            aVar2 = c3368i1.f32413f;
        }
        InterfaceC3777rk.b bVar2 = bVar;
        InterfaceC3777rk.a aVar3 = aVar2;
        return c3368i1.a(qa2, nh2, qa3, aVar, bVar2, aVar3);
    }

    public final QA a() {
        return this.f32408a;
    }
}
