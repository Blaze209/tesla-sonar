package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3529lt implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f33424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f33425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f33427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final QA f33428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f33429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f33431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f33432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f33433j;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.lt$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f33434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f33435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f33436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f33437d;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.lt$a$a, reason: collision with other inner class name */
        public interface InterfaceC0579a {

            /* JADX INFO: renamed from: com.fourthline.orca.internal.lt$a$a$a, reason: collision with other inner class name */
            public static final class C0580a implements InterfaceC0579a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f33438a;

                public C0580a(String title) {
                    p013kotlin.jvm.internal.s.k(title, "title");
                    this.f33438a = title;
                }

                public String a() {
                    return this.f33438a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0580a) && p013kotlin.jvm.internal.s.f(this.f33438a, ((C0580a) obj).f33438a);
                }

                public int hashCode() {
                    return this.f33438a.hashCode();
                }

                public String toString() {
                    return "Legal(title=" + this.f33438a + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.lt$a$a$b */
            public static final class b implements InterfaceC0579a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f33439a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final InterfaceC3903uh f33440b;

                public b(String title, InterfaceC3903uh iconImageSource) {
                    p013kotlin.jvm.internal.s.k(title, "title");
                    p013kotlin.jvm.internal.s.k(iconImageSource, "iconImageSource");
                    this.f33439a = title;
                    this.f33440b = iconImageSource;
                }

                public final InterfaceC3903uh a() {
                    return this.f33440b;
                }

                public String b() {
                    return this.f33439a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return p013kotlin.jvm.internal.s.f(this.f33439a, bVar.f33439a) && p013kotlin.jvm.internal.s.f(this.f33440b, bVar.f33440b);
                }

                public int hashCode() {
                    return (this.f33439a.hashCode() * 31) + this.f33440b.hashCode();
                }

                public String toString() {
                    return "Sign(title=" + this.f33439a + ", iconImageSource=" + this.f33440b + ")";
                }
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.lt$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QA f33441a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Yj f33442b;

            public b(QA title, Yj lottieSource) {
                p013kotlin.jvm.internal.s.k(title, "title");
                p013kotlin.jvm.internal.s.k(lottieSource, "lottieSource");
                this.f33441a = title;
                this.f33442b = lottieSource;
            }

            public final Yj a() {
                return this.f33442b;
            }

            public final QA b() {
                return this.f33441a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p013kotlin.jvm.internal.s.f(this.f33441a, bVar.f33441a) && p013kotlin.jvm.internal.s.f(this.f33442b, bVar.f33442b);
            }

            public int hashCode() {
                return (this.f33441a.hashCode() * 31) + this.f33442b.hashCode();
            }

            public String toString() {
                return "LoaderState(title=" + this.f33441a + ", lottieSource=" + this.f33442b + ")";
            }
        }

        public a(QA title, List signDocuments, List legalDocuments, b bVar) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(signDocuments, "signDocuments");
            p013kotlin.jvm.internal.s.k(legalDocuments, "legalDocuments");
            this.f33434a = title;
            this.f33435b = signDocuments;
            this.f33436c = legalDocuments;
            this.f33437d = bVar;
        }

        public final a a(QA title, List signDocuments, List legalDocuments, b bVar) {
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(signDocuments, "signDocuments");
            p013kotlin.jvm.internal.s.k(legalDocuments, "legalDocuments");
            return new a(title, signDocuments, legalDocuments, bVar);
        }

        public final b b() {
            return this.f33437d;
        }

        public final List c() {
            return this.f33435b;
        }

        public final QA d() {
            return this.f33434a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f33434a, aVar.f33434a) && p013kotlin.jvm.internal.s.f(this.f33435b, aVar.f33435b) && p013kotlin.jvm.internal.s.f(this.f33436c, aVar.f33436c) && p013kotlin.jvm.internal.s.f(this.f33437d, aVar.f33437d);
        }

        public int hashCode() {
            int iHashCode = ((((this.f33434a.hashCode() * 31) + this.f33435b.hashCode()) * 31) + this.f33436c.hashCode()) * 31;
            b bVar = this.f33437d;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Agreements(title=" + this.f33434a + ", signDocuments=" + this.f33435b + ", legalDocuments=" + this.f33436c + ", loader=" + this.f33437d + ")";
        }

        public static /* synthetic */ a a(a aVar, QA qa2, List list, List list2, b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                qa2 = aVar.f33434a;
            }
            if ((i11 & 2) != 0) {
                list = aVar.f33435b;
            }
            if ((i11 & 4) != 0) {
                list2 = aVar.f33436c;
            }
            if ((i11 & 8) != 0) {
                bVar = aVar.f33437d;
            }
            return aVar.a(qa2, list, list2, bVar);
        }

        public final List a() {
            return this.f33436c;
        }
    }

    public C3529lt(QA title, a agreements, String str, QA primaryButtonText, QA secondaryButtonText, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(agreements, "agreements");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        this.f33424a = title;
        this.f33425b = agreements;
        this.f33426c = str;
        this.f33427d = primaryButtonText;
        this.f33428e = secondaryButtonText;
        this.f33429f = z11;
        this.f33430g = z12;
        this.f33431h = z13;
        this.f33432i = z14;
        this.f33433j = z15;
    }

    public final C3529lt a(QA title, a agreements, String str, QA primaryButtonText, QA secondaryButtonText, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(agreements, "agreements");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        return new C3529lt(title, agreements, str, primaryButtonText, secondaryButtonText, z11, z12, z13, z14, z15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3529lt)) {
            return false;
        }
        C3529lt c3529lt = (C3529lt) obj;
        return p013kotlin.jvm.internal.s.f(this.f33424a, c3529lt.f33424a) && p013kotlin.jvm.internal.s.f(this.f33425b, c3529lt.f33425b) && p013kotlin.jvm.internal.s.f(this.f33426c, c3529lt.f33426c) && p013kotlin.jvm.internal.s.f(this.f33427d, c3529lt.f33427d) && p013kotlin.jvm.internal.s.f(this.f33428e, c3529lt.f33428e) && this.f33429f == c3529lt.f33429f && this.f33430g == c3529lt.f33430g && this.f33431h == c3529lt.f33431h && this.f33432i == c3529lt.f33432i && this.f33433j == c3529lt.f33433j;
    }

    public int hashCode() {
        int iHashCode = ((this.f33424a.hashCode() * 31) + this.f33425b.hashCode()) * 31;
        String str = this.f33426c;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f33427d.hashCode()) * 31) + this.f33428e.hashCode()) * 31) + Boolean.hashCode(this.f33429f)) * 31) + Boolean.hashCode(this.f33430g)) * 31) + Boolean.hashCode(this.f33431h)) * 31) + Boolean.hashCode(this.f33432i)) * 31) + Boolean.hashCode(this.f33433j);
    }

    public final a p() {
        return this.f33425b;
    }

    public final String q() {
        return this.f33426c;
    }

    public final boolean r() {
        return this.f33429f;
    }

    public final boolean s() {
        return this.f33431h;
    }

    public final boolean t() {
        return this.f33430g;
    }

    public String toString() {
        return "State(title=" + this.f33424a + ", agreements=" + this.f33425b + ", info=" + this.f33426c + ", primaryButtonText=" + this.f33427d + ", secondaryButtonText=" + this.f33428e + ", primaryButtonEnabled=" + this.f33429f + ", secondaryButtonEnabled=" + this.f33430g + ", primaryButtonInProgress=" + this.f33431h + ", isTermsChecked=" + this.f33432i + ", isClaimsChecked=" + this.f33433j + ")";
    }

    public final boolean u() {
        return this.f33433j;
    }

    public final boolean v() {
        return this.f33432i;
    }

    public static /* synthetic */ C3529lt a(C3529lt c3529lt, QA qa2, a aVar, String str, QA qa3, QA qa4, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3529lt.f33424a;
        }
        if ((i11 & 2) != 0) {
            aVar = c3529lt.f33425b;
        }
        if ((i11 & 4) != 0) {
            str = c3529lt.f33426c;
        }
        if ((i11 & 8) != 0) {
            qa3 = c3529lt.f33427d;
        }
        if ((i11 & 16) != 0) {
            qa4 = c3529lt.f33428e;
        }
        if ((i11 & 32) != 0) {
            z11 = c3529lt.f33429f;
        }
        if ((i11 & 64) != 0) {
            z12 = c3529lt.f33430g;
        }
        if ((i11 & 128) != 0) {
            z13 = c3529lt.f33431h;
        }
        if ((i11 & 256) != 0) {
            z14 = c3529lt.f33432i;
        }
        if ((i11 & 512) != 0) {
            z15 = c3529lt.f33433j;
        }
        boolean z16 = z14;
        boolean z17 = z15;
        boolean z18 = z12;
        boolean z19 = z13;
        QA qa5 = qa4;
        boolean z21 = z11;
        return c3529lt.a(qa2, aVar, str, qa3, qa5, z21, z18, z19, z16, z17);
    }

    public final QA a() {
        return this.f33424a;
    }
}
