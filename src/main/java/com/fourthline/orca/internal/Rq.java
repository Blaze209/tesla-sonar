package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Rq implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f27648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f27649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f27650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f27651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final QA f27652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f27653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f27654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f27655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Sq f27656i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f27657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f27658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f27659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Tr f27660d;

        public a(f state, QA text, QA qa2, Tr type) {
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(type, "type");
            this.f27657a = state;
            this.f27658b = text;
            this.f27659c = qa2;
            this.f27660d = type;
        }

        public final a a(f state, QA text, QA qa2, Tr type) {
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(type, "type");
            return new a(state, text, qa2, type);
        }

        public final f b() {
            return this.f27657a;
        }

        public final QA c() {
            return this.f27658b;
        }

        public final Tr d() {
            return this.f27660d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27657a == aVar.f27657a && p013kotlin.jvm.internal.s.f(this.f27658b, aVar.f27658b) && p013kotlin.jvm.internal.s.f(this.f27659c, aVar.f27659c) && this.f27660d == aVar.f27660d;
        }

        public int hashCode() {
            int iHashCode = ((this.f27657a.hashCode() * 31) + this.f27658b.hashCode()) * 31;
            QA qa2 = this.f27659c;
            return ((iHashCode + (qa2 == null ? 0 : qa2.hashCode())) * 31) + this.f27660d.hashCode();
        }

        public String toString() {
            return "DocumentOptionPresentation(state=" + this.f27657a + ", text=" + this.f27658b + ", hint=" + this.f27659c + ", type=" + this.f27660d + ")";
        }

        public static /* synthetic */ a a(a aVar, f fVar, QA qa2, QA qa3, Tr tr2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                fVar = aVar.f27657a;
            }
            if ((i11 & 2) != 0) {
                qa2 = aVar.f27658b;
            }
            if ((i11 & 4) != 0) {
                qa3 = aVar.f27659c;
            }
            if ((i11 & 8) != 0) {
                tr2 = aVar.f27660d;
            }
            return aVar.a(fVar, qa2, qa3, tr2);
        }

        public final QA a() {
            return this.f27659c;
        }
    }

    public static final class b implements Ds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27661a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f27662b = "poa_document_type_screen";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f27663c = "leave";

        private b() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return f27662b;
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f27663c;
        }
    }

    public static final class c implements Ds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27664a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f27665b = "poa_document_type_screen";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f27666c = "error_popup";

        private c() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return f27665b;
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f27666c;
        }
    }

    public static final class d implements Ds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27667a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f27668b = "poa_document_type_screen";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f27669c = "error_popup";

        private d() {
        }

        @Override // com.fourthline.orca.internal.Ds
        public String a() {
            return f27668b;
        }

        @Override // com.fourthline.orca.internal.Ds
        public String getName() {
            return f27669c;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f27670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private QA f27671b;

        public e(QA text, QA link) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(link, "link");
            this.f27670a = text;
            this.f27671b = link;
        }

        public final QA a() {
            return this.f27671b;
        }

        public final QA b() {
            return this.f27670a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p013kotlin.jvm.internal.s.f(this.f27670a, eVar.f27670a) && p013kotlin.jvm.internal.s.f(this.f27671b, eVar.f27671b);
        }

        public int hashCode() {
            return (this.f27670a.hashCode() * 31) + this.f27671b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f27670a + ", link=" + this.f27671b + ")";
        }
    }

    public enum f {
        CHECKED,
        UNCHECKED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f27675d = on0.a.a(a());
    }

    public Rq(QA title, QA description, QA hint, QA primaryButtonText, QA secondaryButtonText, List options, boolean z11, e linkButton, Sq sq2) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(linkButton, "linkButton");
        this.f27648a = title;
        this.f27649b = description;
        this.f27650c = hint;
        this.f27651d = primaryButtonText;
        this.f27652e = secondaryButtonText;
        this.f27653f = options;
        this.f27654g = z11;
        this.f27655h = linkButton;
        this.f27656i = sq2;
    }

    public final Rq a(QA title, QA description, QA hint, QA primaryButtonText, QA secondaryButtonText, List options, boolean z11, e linkButton, Sq sq2) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(description, "description");
        p013kotlin.jvm.internal.s.k(hint, "hint");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(linkButton, "linkButton");
        return new Rq(title, description, hint, primaryButtonText, secondaryButtonText, options, z11, linkButton, sq2);
    }

    public final QA b() {
        return this.f27649b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rq)) {
            return false;
        }
        Rq rq2 = (Rq) obj;
        return p013kotlin.jvm.internal.s.f(this.f27648a, rq2.f27648a) && p013kotlin.jvm.internal.s.f(this.f27649b, rq2.f27649b) && p013kotlin.jvm.internal.s.f(this.f27650c, rq2.f27650c) && p013kotlin.jvm.internal.s.f(this.f27651d, rq2.f27651d) && p013kotlin.jvm.internal.s.f(this.f27652e, rq2.f27652e) && p013kotlin.jvm.internal.s.f(this.f27653f, rq2.f27653f) && this.f27654g == rq2.f27654g && p013kotlin.jvm.internal.s.f(this.f27655h, rq2.f27655h) && p013kotlin.jvm.internal.s.f(this.f27656i, rq2.f27656i);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f27648a.hashCode() * 31) + this.f27649b.hashCode()) * 31) + this.f27650c.hashCode()) * 31) + this.f27651d.hashCode()) * 31) + this.f27652e.hashCode()) * 31) + this.f27653f.hashCode()) * 31) + Boolean.hashCode(this.f27654g)) * 31) + this.f27655h.hashCode()) * 31;
        Sq sq2 = this.f27656i;
        return iHashCode + (sq2 == null ? 0 : sq2.hashCode());
    }

    public final Sq p() {
        return this.f27656i;
    }

    public final QA q() {
        return this.f27650c;
    }

    public final e r() {
        return this.f27655h;
    }

    public final List s() {
        return this.f27653f;
    }

    public final boolean t() {
        return this.f27654g;
    }

    public String toString() {
        return "State(title=" + this.f27648a + ", description=" + this.f27649b + ", hint=" + this.f27650c + ", primaryButtonText=" + this.f27651d + ", secondaryButtonText=" + this.f27652e + ", options=" + this.f27653f + ", isPrimaryButtonEnabled=" + this.f27654g + ", linkButton=" + this.f27655h + ", destinationPopup=" + this.f27656i + ")";
    }

    public static /* synthetic */ Rq a(Rq rq2, QA qa2, QA qa3, QA qa4, QA qa5, QA qa6, List list, boolean z11, e eVar, Sq sq2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = rq2.f27648a;
        }
        if ((i11 & 2) != 0) {
            qa3 = rq2.f27649b;
        }
        if ((i11 & 4) != 0) {
            qa4 = rq2.f27650c;
        }
        if ((i11 & 8) != 0) {
            qa5 = rq2.f27651d;
        }
        if ((i11 & 16) != 0) {
            qa6 = rq2.f27652e;
        }
        if ((i11 & 32) != 0) {
            list = rq2.f27653f;
        }
        if ((i11 & 64) != 0) {
            z11 = rq2.f27654g;
        }
        if ((i11 & 128) != 0) {
            eVar = rq2.f27655h;
        }
        if ((i11 & 256) != 0) {
            sq2 = rq2.f27656i;
        }
        e eVar2 = eVar;
        Sq sq3 = sq2;
        List list2 = list;
        boolean z12 = z11;
        QA qa7 = qa6;
        QA qa8 = qa4;
        return rq2.a(qa2, qa3, qa8, qa5, qa7, list2, z12, eVar2, sq3);
    }

    public final QA a() {
        return this.f27648a;
    }

    public /* synthetic */ Rq(QA qa2, QA qa3, QA qa4, QA qa5, QA qa6, List list, boolean z11, e eVar, Sq sq2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qa2, qa3, qa4, qa5, qa6, list, (i11 & 64) != 0 ? false : z11, eVar, (i11 & 256) != 0 ? null : sq2);
    }
}
