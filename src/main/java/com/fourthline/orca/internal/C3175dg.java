package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3175dg implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f31164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QA f31165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3777rk.b f31166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f31167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f31168e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.dg$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3718q9 f31169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f31170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final QA f31171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3903uh f31172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f31173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f31174f;

        public a(EnumC3718q9 type, QA subtitle, QA description, InterfaceC3903uh interfaceC3903uh, boolean z11, boolean z12) {
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
            p013kotlin.jvm.internal.s.k(description, "description");
            this.f31169a = type;
            this.f31170b = subtitle;
            this.f31171c = description;
            this.f31172d = interfaceC3903uh;
            this.f31173e = z11;
            this.f31174f = z12;
        }

        public final a a(EnumC3718q9 type, QA subtitle, QA description, InterfaceC3903uh interfaceC3903uh, boolean z11, boolean z12) {
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
            p013kotlin.jvm.internal.s.k(description, "description");
            return new a(type, subtitle, description, interfaceC3903uh, z11, z12);
        }

        public final InterfaceC3903uh b() {
            return this.f31172d;
        }

        public final QA c() {
            return this.f31170b;
        }

        public final EnumC3718q9 d() {
            return this.f31169a;
        }

        public final boolean e() {
            return this.f31174f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31169a == aVar.f31169a && p013kotlin.jvm.internal.s.f(this.f31170b, aVar.f31170b) && p013kotlin.jvm.internal.s.f(this.f31171c, aVar.f31171c) && p013kotlin.jvm.internal.s.f(this.f31172d, aVar.f31172d) && this.f31173e == aVar.f31173e && this.f31174f == aVar.f31174f;
        }

        public final boolean f() {
            return this.f31173e;
        }

        public int hashCode() {
            int iHashCode = ((((this.f31169a.hashCode() * 31) + this.f31170b.hashCode()) * 31) + this.f31171c.hashCode()) * 31;
            InterfaceC3903uh interfaceC3903uh = this.f31172d;
            return ((((iHashCode + (interfaceC3903uh == null ? 0 : interfaceC3903uh.hashCode())) * 31) + Boolean.hashCode(this.f31173e)) * 31) + Boolean.hashCode(this.f31174f);
        }

        public String toString() {
            return "FlowSelectionPresentation(type=" + this.f31169a + ", subtitle=" + this.f31170b + ", description=" + this.f31171c + ", icon=" + this.f31172d + ", isSelected=" + this.f31173e + ", isEnabled=" + this.f31174f + ")";
        }

        public static /* synthetic */ a a(a aVar, EnumC3718q9 enumC3718q9, QA qa2, QA qa3, InterfaceC3903uh interfaceC3903uh, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                enumC3718q9 = aVar.f31169a;
            }
            if ((i11 & 2) != 0) {
                qa2 = aVar.f31170b;
            }
            if ((i11 & 4) != 0) {
                qa3 = aVar.f31171c;
            }
            if ((i11 & 8) != 0) {
                interfaceC3903uh = aVar.f31172d;
            }
            if ((i11 & 16) != 0) {
                z11 = aVar.f31173e;
            }
            if ((i11 & 32) != 0) {
                z12 = aVar.f31174f;
            }
            boolean z13 = z11;
            boolean z14 = z12;
            return aVar.a(enumC3718q9, qa2, qa3, interfaceC3903uh, z13, z14);
        }

        public final QA a() {
            return this.f31171c;
        }

        public /* synthetic */ a(EnumC3718q9 enumC3718q9, QA qa2, QA qa3, InterfaceC3903uh interfaceC3903uh, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC3718q9, qa2, qa3, interfaceC3903uh, z11, (i11 & 32) != 0 ? true : z12);
        }
    }

    public C3175dg(QA title, QA subtitle, InterfaceC3777rk.b primaryButtonState, QA secondaryButtonText, List options) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        p013kotlin.jvm.internal.s.k(options, "options");
        this.f31164a = title;
        this.f31165b = subtitle;
        this.f31166c = primaryButtonState;
        this.f31167d = secondaryButtonText;
        this.f31168e = options;
    }

    public final C3175dg a(QA title, QA subtitle, InterfaceC3777rk.b primaryButtonState, QA secondaryButtonText, List options) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonText, "secondaryButtonText");
        p013kotlin.jvm.internal.s.k(options, "options");
        return new C3175dg(title, subtitle, primaryButtonState, secondaryButtonText, options);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3175dg)) {
            return false;
        }
        C3175dg c3175dg = (C3175dg) obj;
        return p013kotlin.jvm.internal.s.f(this.f31164a, c3175dg.f31164a) && p013kotlin.jvm.internal.s.f(this.f31165b, c3175dg.f31165b) && p013kotlin.jvm.internal.s.f(this.f31166c, c3175dg.f31166c) && p013kotlin.jvm.internal.s.f(this.f31167d, c3175dg.f31167d) && p013kotlin.jvm.internal.s.f(this.f31168e, c3175dg.f31168e);
    }

    public int hashCode() {
        return (((((((this.f31164a.hashCode() * 31) + this.f31165b.hashCode()) * 31) + this.f31166c.hashCode()) * 31) + this.f31167d.hashCode()) * 31) + this.f31168e.hashCode();
    }

    public final List p() {
        return this.f31168e;
    }

    public final InterfaceC3777rk.b q() {
        return this.f31166c;
    }

    public final QA r() {
        return this.f31165b;
    }

    public String toString() {
        return "State(title=" + this.f31164a + ", subtitle=" + this.f31165b + ", primaryButtonState=" + this.f31166c + ", secondaryButtonText=" + this.f31167d + ", options=" + this.f31168e + ")";
    }

    public static /* synthetic */ C3175dg a(C3175dg c3175dg, QA qa2, QA qa3, InterfaceC3777rk.b bVar, QA qa4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3175dg.f31164a;
        }
        if ((i11 & 2) != 0) {
            qa3 = c3175dg.f31165b;
        }
        if ((i11 & 4) != 0) {
            bVar = c3175dg.f31166c;
        }
        if ((i11 & 8) != 0) {
            qa4 = c3175dg.f31167d;
        }
        if ((i11 & 16) != 0) {
            list = c3175dg.f31168e;
        }
        List list2 = list;
        InterfaceC3777rk.b bVar2 = bVar;
        return c3175dg.a(qa2, qa3, bVar2, qa4, list2);
    }

    public final QA a() {
        return this.f31164a;
    }
}
