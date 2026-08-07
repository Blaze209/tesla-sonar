package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3780rn implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f35111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Yj f35112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f35113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f35114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3777rk.b f35115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f35116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3777rk.a f35117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f35118h;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rn$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3903uh f35119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f35120b;

        public a(InterfaceC3903uh imageSource, QA text) {
            p013kotlin.jvm.internal.s.k(imageSource, "imageSource");
            p013kotlin.jvm.internal.s.k(text, "text");
            this.f35119a = imageSource;
            this.f35120b = text;
        }

        public final InterfaceC3903uh a() {
            return this.f35119a;
        }

        public final QA b() {
            return this.f35120b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f35119a, aVar.f35119a) && p013kotlin.jvm.internal.s.f(this.f35120b, aVar.f35120b);
        }

        public int hashCode() {
            return (this.f35119a.hashCode() * 31) + this.f35120b.hashCode();
        }

        public String toString() {
            return "Instruction(imageSource=" + this.f35119a + ", text=" + this.f35120b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.rn$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f35121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f35122b;

        public b(QA text, QA link) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(link, "link");
            this.f35121a = text;
            this.f35122b = link;
        }

        public final QA a() {
            return this.f35122b;
        }

        public final QA b() {
            return this.f35121a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f35121a, bVar.f35121a) && p013kotlin.jvm.internal.s.f(this.f35122b, bVar.f35122b);
        }

        public int hashCode() {
            return (this.f35121a.hashCode() * 31) + this.f35122b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f35121a + ", link=" + this.f35122b + ")";
        }
    }

    public C3780rn(QA title, Yj lottieSource, QA subtitle, QA description, InterfaceC3777rk.b primaryButton, b secondaryButton, InterfaceC3777rk.a backButton, a learnHowToScanInstruction) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(primaryButton, "primaryButton");
        p013kotlin.jvm.internal.s.k(secondaryButton, "secondaryButton");
        p013kotlin.jvm.internal.s.k(backButton, "backButton");
        p013kotlin.jvm.internal.s.k(learnHowToScanInstruction, "learnHowToScanInstruction");
        this.f35111a = title;
        this.f35112b = lottieSource;
        this.f35113c = subtitle;
        this.f35114d = description;
        this.f35115e = primaryButton;
        this.f35116f = secondaryButton;
        this.f35117g = backButton;
        this.f35118h = learnHowToScanInstruction;
    }

    public final QA a() {
        return this.f35111a;
    }

    public final QA b() {
        return this.f35114d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3780rn)) {
            return false;
        }
        C3780rn c3780rn = (C3780rn) obj;
        return p013kotlin.jvm.internal.s.f(this.f35111a, c3780rn.f35111a) && p013kotlin.jvm.internal.s.f(this.f35112b, c3780rn.f35112b) && p013kotlin.jvm.internal.s.f(this.f35113c, c3780rn.f35113c) && p013kotlin.jvm.internal.s.f(this.f35114d, c3780rn.f35114d) && p013kotlin.jvm.internal.s.f(this.f35115e, c3780rn.f35115e) && p013kotlin.jvm.internal.s.f(this.f35116f, c3780rn.f35116f) && p013kotlin.jvm.internal.s.f(this.f35117g, c3780rn.f35117g) && p013kotlin.jvm.internal.s.f(this.f35118h, c3780rn.f35118h);
    }

    public int hashCode() {
        return (((((((((((((this.f35111a.hashCode() * 31) + this.f35112b.hashCode()) * 31) + this.f35113c.hashCode()) * 31) + this.f35114d.hashCode()) * 31) + this.f35115e.hashCode()) * 31) + this.f35116f.hashCode()) * 31) + this.f35117g.hashCode()) * 31) + this.f35118h.hashCode();
    }

    public final InterfaceC3777rk.a p() {
        return this.f35117g;
    }

    public final a q() {
        return this.f35118h;
    }

    public final Yj r() {
        return this.f35112b;
    }

    public final InterfaceC3777rk.b s() {
        return this.f35115e;
    }

    public final b t() {
        return this.f35116f;
    }

    public String toString() {
        return "State(title=" + this.f35111a + ", lottieSource=" + this.f35112b + ", subtitle=" + this.f35113c + ", description=" + this.f35114d + ", primaryButton=" + this.f35115e + ", secondaryButton=" + this.f35116f + ", backButton=" + this.f35117g + ", learnHowToScanInstruction=" + this.f35118h + ")";
    }
}
