package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Fq implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f25848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Nh f25849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Nh f25850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Nh f25851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f25852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f25853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final QA f25854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC3777rk.b f25855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3777rk.a f25856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC3903uh f25857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final InterfaceC3903uh f25858k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Mh f25859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f25860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Gh f25861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final QA f25862d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final QA f25863e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final QA f25864f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InterfaceC3903uh f25865g;

        public a(Mh format, QA text, Gh state, QA title, QA placeholder, QA status, InterfaceC3903uh interfaceC3903uh) {
            p013kotlin.jvm.internal.s.k(format, "format");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
            p013kotlin.jvm.internal.s.k(status, "status");
            this.f25859a = format;
            this.f25860b = text;
            this.f25861c = state;
            this.f25862d = title;
            this.f25863e = placeholder;
            this.f25864f = status;
            this.f25865g = interfaceC3903uh;
        }

        public final a a(Mh format, QA text, Gh state, QA title, QA placeholder, QA status, InterfaceC3903uh interfaceC3903uh) {
            p013kotlin.jvm.internal.s.k(format, "format");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
            p013kotlin.jvm.internal.s.k(status, "status");
            return new a(format, text, state, title, placeholder, status, interfaceC3903uh);
        }

        public final QA b() {
            return this.f25863e;
        }

        public final Gh c() {
            return this.f25861c;
        }

        public final QA d() {
            return this.f25864f;
        }

        public final InterfaceC3903uh e() {
            return this.f25865g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25859a == aVar.f25859a && p013kotlin.jvm.internal.s.f(this.f25860b, aVar.f25860b) && this.f25861c == aVar.f25861c && p013kotlin.jvm.internal.s.f(this.f25862d, aVar.f25862d) && p013kotlin.jvm.internal.s.f(this.f25863e, aVar.f25863e) && p013kotlin.jvm.internal.s.f(this.f25864f, aVar.f25864f) && p013kotlin.jvm.internal.s.f(this.f25865g, aVar.f25865g);
        }

        public final QA f() {
            return this.f25860b;
        }

        public final QA g() {
            return this.f25862d;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.f25859a.hashCode() * 31) + this.f25860b.hashCode()) * 31) + this.f25861c.hashCode()) * 31) + this.f25862d.hashCode()) * 31) + this.f25863e.hashCode()) * 31) + this.f25864f.hashCode()) * 31;
            InterfaceC3903uh interfaceC3903uh = this.f25865g;
            return iHashCode + (interfaceC3903uh == null ? 0 : interfaceC3903uh.hashCode());
        }

        public String toString() {
            return "GenderViewState(format=" + this.f25859a + ", text=" + this.f25860b + ", state=" + this.f25861c + ", title=" + this.f25862d + ", placeholder=" + this.f25863e + ", status=" + this.f25864f + ", statusIcon=" + this.f25865g + ")";
        }

        public static /* synthetic */ a a(a aVar, Mh mh2, QA qa2, Gh gh2, QA qa3, QA qa4, QA qa5, InterfaceC3903uh interfaceC3903uh, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                mh2 = aVar.f25859a;
            }
            if ((i11 & 2) != 0) {
                qa2 = aVar.f25860b;
            }
            if ((i11 & 4) != 0) {
                gh2 = aVar.f25861c;
            }
            if ((i11 & 8) != 0) {
                qa3 = aVar.f25862d;
            }
            if ((i11 & 16) != 0) {
                qa4 = aVar.f25863e;
            }
            if ((i11 & 32) != 0) {
                qa5 = aVar.f25864f;
            }
            if ((i11 & 64) != 0) {
                interfaceC3903uh = aVar.f25865g;
            }
            QA qa6 = qa5;
            InterfaceC3903uh interfaceC3903uh2 = interfaceC3903uh;
            QA qa7 = qa4;
            Gh gh3 = gh2;
            return aVar.a(mh2, qa2, gh3, qa3, qa7, qa6, interfaceC3903uh2);
        }

        public final Mh a() {
            return this.f25859a;
        }

        public /* synthetic */ a(Mh mh2, QA qa2, Gh gh2, QA qa3, QA qa4, QA qa5, InterfaceC3903uh interfaceC3903uh, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(mh2, qa2, gh2, qa3, qa4, qa5, (i11 & 64) != 0 ? null : interfaceC3903uh);
        }
    }

    public Fq(QA title, Nh firstNameInputViewState, Nh lastNameInputViewState, Nh birthDateInputViewState, a genderInputViewState, Map map, QA qa2, InterfaceC3777rk.b nextButtonState, InterfaceC3777rk.a backButtonState, InterfaceC3903uh arrowImageSource, InterfaceC3903uh calendarImageSource) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(firstNameInputViewState, "firstNameInputViewState");
        p013kotlin.jvm.internal.s.k(lastNameInputViewState, "lastNameInputViewState");
        p013kotlin.jvm.internal.s.k(birthDateInputViewState, "birthDateInputViewState");
        p013kotlin.jvm.internal.s.k(genderInputViewState, "genderInputViewState");
        p013kotlin.jvm.internal.s.k(nextButtonState, "nextButtonState");
        p013kotlin.jvm.internal.s.k(backButtonState, "backButtonState");
        p013kotlin.jvm.internal.s.k(arrowImageSource, "arrowImageSource");
        p013kotlin.jvm.internal.s.k(calendarImageSource, "calendarImageSource");
        this.f25848a = title;
        this.f25849b = firstNameInputViewState;
        this.f25850c = lastNameInputViewState;
        this.f25851d = birthDateInputViewState;
        this.f25852e = genderInputViewState;
        this.f25853f = map;
        this.f25854g = qa2;
        this.f25855h = nextButtonState;
        this.f25856i = backButtonState;
        this.f25857j = arrowImageSource;
        this.f25858k = calendarImageSource;
    }

    public final Fq a(QA title, Nh firstNameInputViewState, Nh lastNameInputViewState, Nh birthDateInputViewState, a genderInputViewState, Map map, QA qa2, InterfaceC3777rk.b nextButtonState, InterfaceC3777rk.a backButtonState, InterfaceC3903uh arrowImageSource, InterfaceC3903uh calendarImageSource) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(firstNameInputViewState, "firstNameInputViewState");
        p013kotlin.jvm.internal.s.k(lastNameInputViewState, "lastNameInputViewState");
        p013kotlin.jvm.internal.s.k(birthDateInputViewState, "birthDateInputViewState");
        p013kotlin.jvm.internal.s.k(genderInputViewState, "genderInputViewState");
        p013kotlin.jvm.internal.s.k(nextButtonState, "nextButtonState");
        p013kotlin.jvm.internal.s.k(backButtonState, "backButtonState");
        p013kotlin.jvm.internal.s.k(arrowImageSource, "arrowImageSource");
        p013kotlin.jvm.internal.s.k(calendarImageSource, "calendarImageSource");
        return new Fq(title, firstNameInputViewState, lastNameInputViewState, birthDateInputViewState, genderInputViewState, map, qa2, nextButtonState, backButtonState, arrowImageSource, calendarImageSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fq)) {
            return false;
        }
        Fq fq2 = (Fq) obj;
        return p013kotlin.jvm.internal.s.f(this.f25848a, fq2.f25848a) && p013kotlin.jvm.internal.s.f(this.f25849b, fq2.f25849b) && p013kotlin.jvm.internal.s.f(this.f25850c, fq2.f25850c) && p013kotlin.jvm.internal.s.f(this.f25851d, fq2.f25851d) && p013kotlin.jvm.internal.s.f(this.f25852e, fq2.f25852e) && p013kotlin.jvm.internal.s.f(this.f25853f, fq2.f25853f) && p013kotlin.jvm.internal.s.f(this.f25854g, fq2.f25854g) && p013kotlin.jvm.internal.s.f(this.f25855h, fq2.f25855h) && p013kotlin.jvm.internal.s.f(this.f25856i, fq2.f25856i) && p013kotlin.jvm.internal.s.f(this.f25857j, fq2.f25857j) && p013kotlin.jvm.internal.s.f(this.f25858k, fq2.f25858k);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f25848a.hashCode() * 31) + this.f25849b.hashCode()) * 31) + this.f25850c.hashCode()) * 31) + this.f25851d.hashCode()) * 31) + this.f25852e.hashCode()) * 31;
        Map map = this.f25853f;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        QA qa2 = this.f25854g;
        return ((((((((iHashCode2 + (qa2 != null ? qa2.hashCode() : 0)) * 31) + this.f25855h.hashCode()) * 31) + this.f25856i.hashCode()) * 31) + this.f25857j.hashCode()) * 31) + this.f25858k.hashCode();
    }

    public final InterfaceC3903uh p() {
        return this.f25857j;
    }

    public final InterfaceC3777rk.a q() {
        return this.f25856i;
    }

    public final Nh r() {
        return this.f25851d;
    }

    public final InterfaceC3903uh s() {
        return this.f25858k;
    }

    public final Nh t() {
        return this.f25849b;
    }

    public String toString() {
        return "State(title=" + this.f25848a + ", firstNameInputViewState=" + this.f25849b + ", lastNameInputViewState=" + this.f25850c + ", birthDateInputViewState=" + this.f25851d + ", genderInputViewState=" + this.f25852e + ", genders=" + this.f25853f + ", hint=" + this.f25854g + ", nextButtonState=" + this.f25855h + ", backButtonState=" + this.f25856i + ", arrowImageSource=" + this.f25857j + ", calendarImageSource=" + this.f25858k + ")";
    }

    public final a u() {
        return this.f25852e;
    }

    public final Map v() {
        return this.f25853f;
    }

    public final QA w() {
        return this.f25854g;
    }

    public final Nh x() {
        return this.f25850c;
    }

    public final InterfaceC3777rk.b y() {
        return this.f25855h;
    }

    public static /* synthetic */ Fq a(Fq fq2, QA qa2, Nh nh2, Nh nh3, Nh nh4, a aVar, Map map, QA qa3, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar2, InterfaceC3903uh interfaceC3903uh, InterfaceC3903uh interfaceC3903uh2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = fq2.f25848a;
        }
        if ((i11 & 2) != 0) {
            nh2 = fq2.f25849b;
        }
        if ((i11 & 4) != 0) {
            nh3 = fq2.f25850c;
        }
        if ((i11 & 8) != 0) {
            nh4 = fq2.f25851d;
        }
        if ((i11 & 16) != 0) {
            aVar = fq2.f25852e;
        }
        if ((i11 & 32) != 0) {
            map = fq2.f25853f;
        }
        if ((i11 & 64) != 0) {
            qa3 = fq2.f25854g;
        }
        if ((i11 & 128) != 0) {
            bVar = fq2.f25855h;
        }
        if ((i11 & 256) != 0) {
            aVar2 = fq2.f25856i;
        }
        if ((i11 & 512) != 0) {
            interfaceC3903uh = fq2.f25857j;
        }
        if ((i11 & 1024) != 0) {
            interfaceC3903uh2 = fq2.f25858k;
        }
        InterfaceC3903uh interfaceC3903uh3 = interfaceC3903uh;
        InterfaceC3903uh interfaceC3903uh4 = interfaceC3903uh2;
        InterfaceC3777rk.b bVar2 = bVar;
        InterfaceC3777rk.a aVar3 = aVar2;
        Map map2 = map;
        QA qa4 = qa3;
        a aVar4 = aVar;
        Nh nh5 = nh3;
        return fq2.a(qa2, nh2, nh5, nh4, aVar4, map2, qa4, bVar2, aVar3, interfaceC3903uh3, interfaceC3903uh4);
    }

    public final QA a() {
        return this.f25848a;
    }
}
