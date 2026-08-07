package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3721qC implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f34754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f34755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f34756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f34757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f34758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3777rk.b f34759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC3777rk.a f34760g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qC$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f34761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f34762b;

        public a(QA text, QA link) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(link, "link");
            this.f34761a = text;
            this.f34762b = link;
        }

        public final QA a() {
            return this.f34762b;
        }

        public final QA b() {
            return this.f34761a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f34761a, aVar.f34761a) && p013kotlin.jvm.internal.s.f(this.f34762b, aVar.f34762b);
        }

        public int hashCode() {
            return (this.f34761a.hashCode() * 31) + this.f34762b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f34761a + ", link=" + this.f34762b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qC$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f34763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f34764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f34765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final QA f34766d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InterfaceC3903uh f34767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Object f34768f;

        public b(d state, c layout, QA text, QA qa2, InterfaceC3903uh interfaceC3903uh, Object obj) {
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(layout, "layout");
            p013kotlin.jvm.internal.s.k(text, "text");
            this.f34763a = state;
            this.f34764b = layout;
            this.f34765c = text;
            this.f34766d = qa2;
            this.f34767e = interfaceC3903uh;
            this.f34768f = obj;
        }

        public final b a(d state, c layout, QA text, QA qa2, InterfaceC3903uh interfaceC3903uh, Object obj) {
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(layout, "layout");
            p013kotlin.jvm.internal.s.k(text, "text");
            return new b(state, layout, text, qa2, interfaceC3903uh, obj);
        }

        public final InterfaceC3903uh b() {
            return this.f34767e;
        }

        public final c c() {
            return this.f34764b;
        }

        public final d d() {
            return this.f34763a;
        }

        public final QA e() {
            return this.f34765c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f34763a == bVar.f34763a && this.f34764b == bVar.f34764b && p013kotlin.jvm.internal.s.f(this.f34765c, bVar.f34765c) && p013kotlin.jvm.internal.s.f(this.f34766d, bVar.f34766d) && p013kotlin.jvm.internal.s.f(this.f34767e, bVar.f34767e) && p013kotlin.jvm.internal.s.f(this.f34768f, bVar.f34768f);
        }

        public final Object f() {
            return this.f34768f;
        }

        public int hashCode() {
            int iHashCode = ((((this.f34763a.hashCode() * 31) + this.f34764b.hashCode()) * 31) + this.f34765c.hashCode()) * 31;
            QA qa2 = this.f34766d;
            int iHashCode2 = (iHashCode + (qa2 == null ? 0 : qa2.hashCode())) * 31;
            InterfaceC3903uh interfaceC3903uh = this.f34767e;
            int iHashCode3 = (iHashCode2 + (interfaceC3903uh == null ? 0 : interfaceC3903uh.hashCode())) * 31;
            Object obj = this.f34768f;
            return iHashCode3 + (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            return "TypeOptionPresentation(state=" + this.f34763a + ", layout=" + this.f34764b + ", text=" + this.f34765c + ", description=" + this.f34766d + ", icon=" + this.f34767e + ", type=" + this.f34768f + ")";
        }

        public static /* synthetic */ b a(b bVar, d dVar, c cVar, QA qa2, QA qa3, InterfaceC3903uh interfaceC3903uh, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                dVar = bVar.f34763a;
            }
            if ((i11 & 2) != 0) {
                cVar = bVar.f34764b;
            }
            if ((i11 & 4) != 0) {
                qa2 = bVar.f34765c;
            }
            if ((i11 & 8) != 0) {
                qa3 = bVar.f34766d;
            }
            if ((i11 & 16) != 0) {
                interfaceC3903uh = bVar.f34767e;
            }
            if ((i11 & 32) != 0) {
                obj = bVar.f34768f;
            }
            InterfaceC3903uh interfaceC3903uh2 = interfaceC3903uh;
            Object obj3 = obj;
            return bVar.a(dVar, cVar, qa2, qa3, interfaceC3903uh2, obj3);
        }

        public final QA a() {
            return this.f34766d;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qC$c */
    public enum c {
        Default,
        Descriptive;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f34772d = on0.a.a(a());
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qC$d */
    public enum d {
        CHECKED,
        UNCHECKED,
        NOT_ACCEPTED;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f34777e = on0.a.a(a());
    }

    public C3721qC(QA title, QA description, List options, QA qa2, a aVar, InterfaceC3777rk.b primaryButton, InterfaceC3777rk.a secondaryButton) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(primaryButton, "primaryButton");
        p013kotlin.jvm.internal.s.k(secondaryButton, "secondaryButton");
        this.f34754a = title;
        this.f34755b = description;
        this.f34756c = options;
        this.f34757d = qa2;
        this.f34758e = aVar;
        this.f34759f = primaryButton;
        this.f34760g = secondaryButton;
    }

    public final C3721qC a(QA title, QA description, List options, QA qa2, a aVar, InterfaceC3777rk.b primaryButton, InterfaceC3777rk.a secondaryButton) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(primaryButton, "primaryButton");
        p013kotlin.jvm.internal.s.k(secondaryButton, "secondaryButton");
        return new C3721qC(title, description, options, qa2, aVar, primaryButton, secondaryButton);
    }

    public final QA b() {
        return this.f34755b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3721qC)) {
            return false;
        }
        C3721qC c3721qC = (C3721qC) obj;
        return p013kotlin.jvm.internal.s.f(this.f34754a, c3721qC.f34754a) && p013kotlin.jvm.internal.s.f(this.f34755b, c3721qC.f34755b) && p013kotlin.jvm.internal.s.f(this.f34756c, c3721qC.f34756c) && p013kotlin.jvm.internal.s.f(this.f34757d, c3721qC.f34757d) && p013kotlin.jvm.internal.s.f(this.f34758e, c3721qC.f34758e) && p013kotlin.jvm.internal.s.f(this.f34759f, c3721qC.f34759f) && p013kotlin.jvm.internal.s.f(this.f34760g, c3721qC.f34760g);
    }

    public int hashCode() {
        int iHashCode = ((((this.f34754a.hashCode() * 31) + this.f34755b.hashCode()) * 31) + this.f34756c.hashCode()) * 31;
        QA qa2 = this.f34757d;
        int iHashCode2 = (iHashCode + (qa2 == null ? 0 : qa2.hashCode())) * 31;
        a aVar = this.f34758e;
        return ((((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f34759f.hashCode()) * 31) + this.f34760g.hashCode();
    }

    public final QA p() {
        return this.f34757d;
    }

    public final a q() {
        return this.f34758e;
    }

    public final List r() {
        return this.f34756c;
    }

    public final InterfaceC3777rk.b s() {
        return this.f34759f;
    }

    public final InterfaceC3777rk.a t() {
        return this.f34760g;
    }

    public String toString() {
        return "State(title=" + this.f34754a + ", description=" + this.f34755b + ", options=" + this.f34756c + ", hint=" + this.f34757d + ", linkButton=" + this.f34758e + ", primaryButton=" + this.f34759f + ", secondaryButton=" + this.f34760g + ")";
    }

    public static /* synthetic */ C3721qC a(C3721qC c3721qC, QA qa2, QA qa3, List list, QA qa4, a aVar, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3721qC.f34754a;
        }
        if ((i11 & 2) != 0) {
            qa3 = c3721qC.f34755b;
        }
        if ((i11 & 4) != 0) {
            list = c3721qC.f34756c;
        }
        if ((i11 & 8) != 0) {
            qa4 = c3721qC.f34757d;
        }
        if ((i11 & 16) != 0) {
            aVar = c3721qC.f34758e;
        }
        if ((i11 & 32) != 0) {
            bVar = c3721qC.f34759f;
        }
        if ((i11 & 64) != 0) {
            aVar2 = c3721qC.f34760g;
        }
        InterfaceC3777rk.b bVar2 = bVar;
        InterfaceC3777rk.a aVar3 = aVar2;
        a aVar4 = aVar;
        List list2 = list;
        return c3721qC.a(qa2, qa3, list2, qa4, aVar4, bVar2, aVar3);
    }

    public final QA a() {
        return this.f34754a;
    }
}
