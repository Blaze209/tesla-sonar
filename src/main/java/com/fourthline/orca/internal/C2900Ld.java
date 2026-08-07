package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2900Ld implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f26766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f26767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f26768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f26769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f26771f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ld$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f26772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f26773b;

        public a(QA text, String link) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(link, "link");
            this.f26772a = text;
            this.f26773b = link;
        }

        public final String a() {
            return this.f26773b;
        }

        public final QA b() {
            return this.f26772a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f26772a, aVar.f26772a) && p013kotlin.jvm.internal.s.f(this.f26773b, aVar.f26773b);
        }

        public int hashCode() {
            return (this.f26772a.hashCode() * 31) + this.f26773b.hashCode();
        }

        public String toString() {
            return "Hint(text=" + this.f26772a + ", link=" + this.f26773b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ld$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f26774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private QA f26775b;

        public b(QA text, QA link) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(link, "link");
            this.f26774a = text;
            this.f26775b = link;
        }

        public final QA a() {
            return this.f26775b;
        }

        public final QA b() {
            return this.f26774a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f26774a, bVar.f26774a) && p013kotlin.jvm.internal.s.f(this.f26775b, bVar.f26775b);
        }

        public int hashCode() {
            return (this.f26774a.hashCode() * 31) + this.f26775b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f26774a + ", link=" + this.f26775b + ")";
        }
    }

    public C2900Ld(QA title, QA description, QA pinInputTitle, a hint, boolean z11, b linkButton) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(pinInputTitle, "pinInputTitle");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(linkButton, "linkButton");
        this.f26766a = title;
        this.f26767b = description;
        this.f26768c = pinInputTitle;
        this.f26769d = hint;
        this.f26770e = z11;
        this.f26771f = linkButton;
    }

    public final C2900Ld a(QA title, QA description, QA pinInputTitle, a hint, boolean z11, b linkButton) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(pinInputTitle, "pinInputTitle");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(linkButton, "linkButton");
        return new C2900Ld(title, description, pinInputTitle, hint, z11, linkButton);
    }

    public final QA b() {
        return this.f26767b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2900Ld)) {
            return false;
        }
        C2900Ld c2900Ld = (C2900Ld) obj;
        return p013kotlin.jvm.internal.s.f(this.f26766a, c2900Ld.f26766a) && p013kotlin.jvm.internal.s.f(this.f26767b, c2900Ld.f26767b) && p013kotlin.jvm.internal.s.f(this.f26768c, c2900Ld.f26768c) && p013kotlin.jvm.internal.s.f(this.f26769d, c2900Ld.f26769d) && this.f26770e == c2900Ld.f26770e && p013kotlin.jvm.internal.s.f(this.f26771f, c2900Ld.f26771f);
    }

    public int hashCode() {
        return (((((((((this.f26766a.hashCode() * 31) + this.f26767b.hashCode()) * 31) + this.f26768c.hashCode()) * 31) + this.f26769d.hashCode()) * 31) + Boolean.hashCode(this.f26770e)) * 31) + this.f26771f.hashCode();
    }

    public final a p() {
        return this.f26769d;
    }

    public final b q() {
        return this.f26771f;
    }

    public final QA r() {
        return this.f26768c;
    }

    public final boolean s() {
        return this.f26770e;
    }

    public String toString() {
        return "State(title=" + this.f26766a + ", description=" + this.f26767b + ", pinInputTitle=" + this.f26768c + ", hint=" + this.f26769d + ", isPrimaryButtonEnabled=" + this.f26770e + ", linkButton=" + this.f26771f + ")";
    }

    public static /* synthetic */ C2900Ld a(C2900Ld c2900Ld, QA qa2, QA qa3, QA qa4, a aVar, boolean z11, b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c2900Ld.f26766a;
        }
        if ((i11 & 2) != 0) {
            qa3 = c2900Ld.f26767b;
        }
        if ((i11 & 4) != 0) {
            qa4 = c2900Ld.f26768c;
        }
        if ((i11 & 8) != 0) {
            aVar = c2900Ld.f26769d;
        }
        if ((i11 & 16) != 0) {
            z11 = c2900Ld.f26770e;
        }
        if ((i11 & 32) != 0) {
            bVar = c2900Ld.f26771f;
        }
        boolean z12 = z11;
        b bVar2 = bVar;
        return c2900Ld.a(qa2, qa3, qa4, aVar, z12, bVar2);
    }

    public final QA a() {
        return this.f26766a;
    }
}
