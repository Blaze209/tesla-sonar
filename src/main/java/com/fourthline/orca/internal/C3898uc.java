package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3898uc implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f35868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f35869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f35870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f35871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f35872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f35873f;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.uc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentType f35874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f35875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC3903uh f35876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f35877d;

        public a(DocumentType type, QA qa2, InterfaceC3903uh interfaceC3903uh, boolean z11) {
            p013kotlin.jvm.internal.s.k(type, "type");
            this.f35874a = type;
            this.f35875b = qa2;
            this.f35876c = interfaceC3903uh;
            this.f35877d = z11;
        }

        public final QA a() {
            return this.f35875b;
        }

        public final InterfaceC3903uh b() {
            return this.f35876c;
        }

        public final DocumentType c() {
            return this.f35874a;
        }

        public final boolean d() {
            return this.f35877d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35874a == aVar.f35874a && p013kotlin.jvm.internal.s.f(this.f35875b, aVar.f35875b) && p013kotlin.jvm.internal.s.f(this.f35876c, aVar.f35876c) && this.f35877d == aVar.f35877d;
        }

        public int hashCode() {
            int iHashCode = this.f35874a.hashCode() * 31;
            QA qa2 = this.f35875b;
            int iHashCode2 = (iHashCode + (qa2 == null ? 0 : qa2.hashCode())) * 31;
            InterfaceC3903uh interfaceC3903uh = this.f35876c;
            return ((iHashCode2 + (interfaceC3903uh != null ? interfaceC3903uh.hashCode() : 0)) * 31) + Boolean.hashCode(this.f35877d);
        }

        public String toString() {
            return "DocumentVersionPresentation(type=" + this.f35874a + ", description=" + this.f35875b + ", imageSource=" + this.f35876c + ", isSelected=" + this.f35877d + ")";
        }
    }

    public C3898uc(QA title, QA subtitle, QA primaryButtonText, QA secondaryButtonText, List options, boolean z11) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        p013kotlin.jvm.internal.s.k(options, "options");
        this.f35868a = title;
        this.f35869b = subtitle;
        this.f35870c = primaryButtonText;
        this.f35871d = secondaryButtonText;
        this.f35872e = options;
        this.f35873f = z11;
    }

    public final C3898uc a(QA title, QA subtitle, QA primaryButtonText, QA secondaryButtonText, List options, boolean z11) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        p013kotlin.jvm.internal.s.k(primaryButtonText, "primaryButtonText");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        p013kotlin.jvm.internal.s.k(options, "options");
        return new C3898uc(title, subtitle, primaryButtonText, secondaryButtonText, options, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3898uc)) {
            return false;
        }
        C3898uc c3898uc = (C3898uc) obj;
        return p013kotlin.jvm.internal.s.f(this.f35868a, c3898uc.f35868a) && p013kotlin.jvm.internal.s.f(this.f35869b, c3898uc.f35869b) && p013kotlin.jvm.internal.s.f(this.f35870c, c3898uc.f35870c) && p013kotlin.jvm.internal.s.f(this.f35871d, c3898uc.f35871d) && p013kotlin.jvm.internal.s.f(this.f35872e, c3898uc.f35872e) && this.f35873f == c3898uc.f35873f;
    }

    public int hashCode() {
        return (((((((((this.f35868a.hashCode() * 31) + this.f35869b.hashCode()) * 31) + this.f35870c.hashCode()) * 31) + this.f35871d.hashCode()) * 31) + this.f35872e.hashCode()) * 31) + Boolean.hashCode(this.f35873f);
    }

    public final List p() {
        return this.f35872e;
    }

    public final QA q() {
        return this.f35869b;
    }

    public final boolean r() {
        return this.f35873f;
    }

    public String toString() {
        return "State(title=" + this.f35868a + ", subtitle=" + this.f35869b + ", primaryButtonText=" + this.f35870c + ", secondaryButtonText=" + this.f35871d + ", options=" + this.f35872e + ", isPrimaryButtonEnabled=" + this.f35873f + ")";
    }

    public static /* synthetic */ C3898uc a(C3898uc c3898uc, QA qa2, QA qa3, QA qa4, QA qa5, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3898uc.f35868a;
        }
        if ((i11 & 2) != 0) {
            qa3 = c3898uc.f35869b;
        }
        if ((i11 & 4) != 0) {
            qa4 = c3898uc.f35870c;
        }
        if ((i11 & 8) != 0) {
            qa5 = c3898uc.f35871d;
        }
        if ((i11 & 16) != 0) {
            list = c3898uc.f35872e;
        }
        if ((i11 & 32) != 0) {
            z11 = c3898uc.f35873f;
        }
        List list2 = list;
        boolean z12 = z11;
        return c3898uc.a(qa2, qa3, qa4, qa5, list2, z12);
    }

    public final QA a() {
        return this.f35868a;
    }

    public /* synthetic */ C3898uc(QA qa2, QA qa3, QA qa4, QA qa5, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qa2, qa3, qa4, qa5, list, (i11 & 32) != 0 ? false : z11);
    }
}
