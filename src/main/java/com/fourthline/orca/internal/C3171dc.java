package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.List;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3171dc implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f31121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f31122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f31123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f31124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final QA f31125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f31126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f31127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f31128h;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f31129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f31130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC3903uh f31131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final DocumentType f31132d;

        public a(b state, QA text, InterfaceC3903uh iconImageSource, DocumentType type) {
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(iconImageSource, "iconImageSource");
            p013kotlin.jvm.internal.s.k(type, "type");
            this.f31129a = state;
            this.f31130b = text;
            this.f31131c = iconImageSource;
            this.f31132d = type;
        }

        public final a a(b state, QA text, InterfaceC3903uh iconImageSource, DocumentType type) {
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(iconImageSource, "iconImageSource");
            p013kotlin.jvm.internal.s.k(type, "type");
            return new a(state, text, iconImageSource, type);
        }

        public final b b() {
            return this.f31129a;
        }

        public final QA c() {
            return this.f31130b;
        }

        public final DocumentType d() {
            return this.f31132d;
        }

        public final boolean e() {
            return this.f31129a != b.NOT_ACCEPTED;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31129a == aVar.f31129a && p013kotlin.jvm.internal.s.f(this.f31130b, aVar.f31130b) && p013kotlin.jvm.internal.s.f(this.f31131c, aVar.f31131c) && this.f31132d == aVar.f31132d;
        }

        public int hashCode() {
            return (((((this.f31129a.hashCode() * 31) + this.f31130b.hashCode()) * 31) + this.f31131c.hashCode()) * 31) + this.f31132d.hashCode();
        }

        public String toString() {
            return "DocumentOptionPresentation(state=" + this.f31129a + ", text=" + this.f31130b + ", iconImageSource=" + this.f31131c + ", type=" + this.f31132d + ")";
        }

        public static /* synthetic */ a a(a aVar, b bVar, QA qa2, InterfaceC3903uh interfaceC3903uh, DocumentType documentType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bVar = aVar.f31129a;
            }
            if ((i11 & 2) != 0) {
                qa2 = aVar.f31130b;
            }
            if ((i11 & 4) != 0) {
                interfaceC3903uh = aVar.f31131c;
            }
            if ((i11 & 8) != 0) {
                documentType = aVar.f31132d;
            }
            return aVar.a(bVar, qa2, interfaceC3903uh, documentType);
        }

        public final InterfaceC3903uh a() {
            return this.f31131c;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dc$b */
    public enum b {
        CHECKED,
        UNCHECKED,
        NOT_ACCEPTED;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f31137e = on0.a.a(a());
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dc$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f31138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private QA f31139b;

        public c(QA text, QA link) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(link, "link");
            this.f31138a = text;
            this.f31139b = link;
        }

        public final QA a() {
            return this.f31139b;
        }

        public final QA b() {
            return this.f31138a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p013kotlin.jvm.internal.s.f(this.f31138a, cVar.f31138a) && p013kotlin.jvm.internal.s.f(this.f31139b, cVar.f31139b);
        }

        public int hashCode() {
            return (this.f31138a.hashCode() * 31) + this.f31139b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f31138a + ", link=" + this.f31139b + ")";
        }
    }

    public C3171dc(QA title, QA description, QA hint, QA primaryButtonText, QA secondaryButtonText, List options, boolean z11, c linkButton) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(linkButton, "linkButton");
        this.f31121a = title;
        this.f31122b = description;
        this.f31123c = hint;
        this.f31124d = primaryButtonText;
        this.f31125e = secondaryButtonText;
        this.f31126f = options;
        this.f31127g = z11;
        this.f31128h = linkButton;
    }

    public final C3171dc a(QA title, QA description, QA hint, QA primaryButtonText, QA secondaryButtonText, List options, boolean z11, c linkButton) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(linkButton, "linkButton");
        return new C3171dc(title, description, hint, primaryButtonText, secondaryButtonText, options, z11, linkButton);
    }

    public final QA b() {
        return this.f31122b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3171dc)) {
            return false;
        }
        C3171dc c3171dc = (C3171dc) obj;
        return p013kotlin.jvm.internal.s.f(this.f31121a, c3171dc.f31121a) && p013kotlin.jvm.internal.s.f(this.f31122b, c3171dc.f31122b) && p013kotlin.jvm.internal.s.f(this.f31123c, c3171dc.f31123c) && p013kotlin.jvm.internal.s.f(this.f31124d, c3171dc.f31124d) && p013kotlin.jvm.internal.s.f(this.f31125e, c3171dc.f31125e) && p013kotlin.jvm.internal.s.f(this.f31126f, c3171dc.f31126f) && this.f31127g == c3171dc.f31127g && p013kotlin.jvm.internal.s.f(this.f31128h, c3171dc.f31128h);
    }

    public int hashCode() {
        return (((((((((((((this.f31121a.hashCode() * 31) + this.f31122b.hashCode()) * 31) + this.f31123c.hashCode()) * 31) + this.f31124d.hashCode()) * 31) + this.f31125e.hashCode()) * 31) + this.f31126f.hashCode()) * 31) + Boolean.hashCode(this.f31127g)) * 31) + this.f31128h.hashCode();
    }

    public final QA p() {
        return this.f31123c;
    }

    public final c q() {
        return this.f31128h;
    }

    public final List r() {
        return this.f31126f;
    }

    public final boolean s() {
        return this.f31127g;
    }

    public String toString() {
        return "State(title=" + this.f31121a + ", description=" + this.f31122b + ", hint=" + this.f31123c + ", primaryButtonText=" + this.f31124d + ", secondaryButtonText=" + this.f31125e + ", options=" + this.f31126f + ", isPrimaryButtonEnabled=" + this.f31127g + ", linkButton=" + this.f31128h + ")";
    }

    public static /* synthetic */ C3171dc a(C3171dc c3171dc, QA qa2, QA qa3, QA qa4, QA qa5, QA qa6, List list, boolean z11, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3171dc.f31121a;
        }
        if ((i11 & 2) != 0) {
            qa3 = c3171dc.f31122b;
        }
        if ((i11 & 4) != 0) {
            qa4 = c3171dc.f31123c;
        }
        if ((i11 & 8) != 0) {
            qa5 = c3171dc.f31124d;
        }
        if ((i11 & 16) != 0) {
            qa6 = c3171dc.f31125e;
        }
        if ((i11 & 32) != 0) {
            list = c3171dc.f31126f;
        }
        if ((i11 & 64) != 0) {
            z11 = c3171dc.f31127g;
        }
        if ((i11 & 128) != 0) {
            cVar = c3171dc.f31128h;
        }
        boolean z12 = z11;
        c cVar2 = cVar;
        QA qa7 = qa6;
        List list2 = list;
        return c3171dc.a(qa2, qa3, qa4, qa5, qa7, list2, z12, cVar2);
    }

    public final QA a() {
        return this.f31121a;
    }

    public /* synthetic */ C3171dc(QA qa2, QA qa3, QA qa4, QA qa5, QA qa6, List list, boolean z11, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qa2, qa3, qa4, qa5, qa6, list, (i11 & 64) != 0 ? false : z11, cVar);
    }
}
