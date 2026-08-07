package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Y4 implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f29809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3777rk.b f29810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3777rk.a f29811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Nh f29812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f29813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f29814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f29815g;

    public static final class a implements Ph {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Mh f29816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f29818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final QA f29819d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f29820e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final QA f29821f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final QA f29822g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Gh f29823h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final InterfaceC3903uh f29824i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f29825j;

        public a(Mh format, String identifier, boolean z11, QA title, String text, QA placeholder, QA status, Gh state, InterfaceC3903uh searchImageSource, List suggestions) {
            p013kotlin.jvm.internal.s.k(format, "format");
            p013kotlin.jvm.internal.s.k(identifier, "identifier");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
            p013kotlin.jvm.internal.s.k(status, "status");
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(searchImageSource, "searchImageSource");
            p013kotlin.jvm.internal.s.k(suggestions, "suggestions");
            this.f29816a = format;
            this.f29817b = identifier;
            this.f29818c = z11;
            this.f29819d = title;
            this.f29820e = text;
            this.f29821f = placeholder;
            this.f29822g = status;
            this.f29823h = state;
            this.f29824i = searchImageSource;
            this.f29825j = suggestions;
        }

        public final a a(Mh format, String identifier, boolean z11, QA title, String text, QA placeholder, QA status, Gh state, InterfaceC3903uh searchImageSource, List suggestions) {
            p013kotlin.jvm.internal.s.k(format, "format");
            p013kotlin.jvm.internal.s.k(identifier, "identifier");
            p013kotlin.jvm.internal.s.k(title, "title");
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
            p013kotlin.jvm.internal.s.k(status, "status");
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(searchImageSource, "searchImageSource");
            p013kotlin.jvm.internal.s.k(suggestions, "suggestions");
            return new a(format, identifier, z11, title, text, placeholder, status, state, searchImageSource, suggestions);
        }

        @Override // com.fourthline.orca.internal.Ph
        public String b() {
            return this.f29817b;
        }

        @Override // com.fourthline.orca.internal.Ph
        public String c() {
            return this.f29820e;
        }

        @Override // com.fourthline.orca.internal.Ph
        public QA d() {
            return this.f29822g;
        }

        @Override // com.fourthline.orca.internal.Ph
        public Mh e() {
            return this.f29816a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29816a == aVar.f29816a && p013kotlin.jvm.internal.s.f(this.f29817b, aVar.f29817b) && this.f29818c == aVar.f29818c && p013kotlin.jvm.internal.s.f(this.f29819d, aVar.f29819d) && p013kotlin.jvm.internal.s.f(this.f29820e, aVar.f29820e) && p013kotlin.jvm.internal.s.f(this.f29821f, aVar.f29821f) && p013kotlin.jvm.internal.s.f(this.f29822g, aVar.f29822g) && this.f29823h == aVar.f29823h && p013kotlin.jvm.internal.s.f(this.f29824i, aVar.f29824i) && p013kotlin.jvm.internal.s.f(this.f29825j, aVar.f29825j);
        }

        public QA f() {
            return this.f29821f;
        }

        public final InterfaceC3903uh g() {
            return this.f29824i;
        }

        @Override // com.fourthline.orca.internal.Ph
        public Gh getState() {
            return this.f29823h;
        }

        public final List h() {
            return this.f29825j;
        }

        public int hashCode() {
            return (((((((((((((((((this.f29816a.hashCode() * 31) + this.f29817b.hashCode()) * 31) + Boolean.hashCode(this.f29818c)) * 31) + this.f29819d.hashCode()) * 31) + this.f29820e.hashCode()) * 31) + this.f29821f.hashCode()) * 31) + this.f29822g.hashCode()) * 31) + this.f29823h.hashCode()) * 31) + this.f29824i.hashCode()) * 31) + this.f29825j.hashCode();
        }

        public String toString() {
            return "CountryState(format=" + this.f29816a + ", identifier=" + this.f29817b + ", isVisible=" + this.f29818c + ", title=" + this.f29819d + ", text=" + this.f29820e + ", placeholder=" + this.f29821f + ", status=" + this.f29822g + ", state=" + this.f29823h + ", searchImageSource=" + this.f29824i + ", suggestions=" + this.f29825j + ")";
        }

        public static /* synthetic */ a a(a aVar, Mh mh2, String str, boolean z11, QA qa2, String str2, QA qa3, QA qa4, Gh gh2, InterfaceC3903uh interfaceC3903uh, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                mh2 = aVar.f29816a;
            }
            if ((i11 & 2) != 0) {
                str = aVar.f29817b;
            }
            if ((i11 & 4) != 0) {
                z11 = aVar.f29818c;
            }
            if ((i11 & 8) != 0) {
                qa2 = aVar.f29819d;
            }
            if ((i11 & 16) != 0) {
                str2 = aVar.f29820e;
            }
            if ((i11 & 32) != 0) {
                qa3 = aVar.f29821f;
            }
            if ((i11 & 64) != 0) {
                qa4 = aVar.f29822g;
            }
            if ((i11 & 128) != 0) {
                gh2 = aVar.f29823h;
            }
            if ((i11 & 256) != 0) {
                interfaceC3903uh = aVar.f29824i;
            }
            if ((i11 & 512) != 0) {
                list = aVar.f29825j;
            }
            InterfaceC3903uh interfaceC3903uh2 = interfaceC3903uh;
            List list2 = list;
            QA qa5 = qa4;
            Gh gh3 = gh2;
            String str3 = str2;
            QA qa6 = qa3;
            return aVar.a(mh2, str, z11, qa2, str3, qa6, qa5, gh3, interfaceC3903uh2, list2);
        }

        @Override // com.fourthline.orca.internal.Ph
        public QA a() {
            return this.f29819d;
        }

        public /* synthetic */ a(Mh mh2, String str, boolean z11, QA qa2, String str2, QA qa3, QA qa4, Gh gh2, InterfaceC3903uh interfaceC3903uh, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Mh.Text : mh2, (i11 & 2) != 0 ? "contact_phone_country" : str, (i11 & 4) != 0 ? true : z11, qa2, (i11 & 16) != 0 ? "" : str2, qa3, (i11 & 64) != 0 ? QA.b.f27435b : qa4, (i11 & 128) != 0 ? Gh.UNFOCUSED : gh2, interfaceC3903uh, (i11 & 512) != 0 ? p013kotlin.collections.v.m() : list);
        }
    }

    public enum b {
        NUMBER,
        COUNTRY;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f29829d = on0.a.a(a());
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Nh f29830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f29831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f29832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final InterfaceC3903uh f29833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final QA f29834e;

        public c(Nh inputViewState, String flag, String selectedCode, InterfaceC3903uh phoneImageSource, QA phoneImageAccessibility) {
            p013kotlin.jvm.internal.s.k(inputViewState, "inputViewState");
            p013kotlin.jvm.internal.s.k(flag, "flag");
            p013kotlin.jvm.internal.s.k(selectedCode, "selectedCode");
            p013kotlin.jvm.internal.s.k(phoneImageSource, "phoneImageSource");
            p013kotlin.jvm.internal.s.k(phoneImageAccessibility, "phoneImageAccessibility");
            this.f29830a = inputViewState;
            this.f29831b = flag;
            this.f29832c = selectedCode;
            this.f29833d = phoneImageSource;
            this.f29834e = phoneImageAccessibility;
        }

        public final c a(Nh inputViewState, String flag, String selectedCode, InterfaceC3903uh phoneImageSource, QA phoneImageAccessibility) {
            p013kotlin.jvm.internal.s.k(inputViewState, "inputViewState");
            p013kotlin.jvm.internal.s.k(flag, "flag");
            p013kotlin.jvm.internal.s.k(selectedCode, "selectedCode");
            p013kotlin.jvm.internal.s.k(phoneImageSource, "phoneImageSource");
            p013kotlin.jvm.internal.s.k(phoneImageAccessibility, "phoneImageAccessibility");
            return new c(inputViewState, flag, selectedCode, phoneImageSource, phoneImageAccessibility);
        }

        public final Nh b() {
            return this.f29830a;
        }

        public final QA c() {
            return this.f29834e;
        }

        public final InterfaceC3903uh d() {
            return this.f29833d;
        }

        public final String e() {
            return this.f29832c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p013kotlin.jvm.internal.s.f(this.f29830a, cVar.f29830a) && p013kotlin.jvm.internal.s.f(this.f29831b, cVar.f29831b) && p013kotlin.jvm.internal.s.f(this.f29832c, cVar.f29832c) && p013kotlin.jvm.internal.s.f(this.f29833d, cVar.f29833d) && p013kotlin.jvm.internal.s.f(this.f29834e, cVar.f29834e);
        }

        public int hashCode() {
            return (((((((this.f29830a.hashCode() * 31) + this.f29831b.hashCode()) * 31) + this.f29832c.hashCode()) * 31) + this.f29833d.hashCode()) * 31) + this.f29834e.hashCode();
        }

        public String toString() {
            return "PhoneState(inputViewState=" + this.f29830a + ", flag=" + this.f29831b + ", selectedCode=" + this.f29832c + ", phoneImageSource=" + this.f29833d + ", phoneImageAccessibility=" + this.f29834e + ")";
        }

        public static /* synthetic */ c a(c cVar, Nh nh2, String str, String str2, InterfaceC3903uh interfaceC3903uh, QA qa2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                nh2 = cVar.f29830a;
            }
            if ((i11 & 2) != 0) {
                str = cVar.f29831b;
            }
            if ((i11 & 4) != 0) {
                str2 = cVar.f29832c;
            }
            if ((i11 & 8) != 0) {
                interfaceC3903uh = cVar.f29833d;
            }
            if ((i11 & 16) != 0) {
                qa2 = cVar.f29834e;
            }
            QA qa3 = qa2;
            String str3 = str2;
            return cVar.a(nh2, str, str3, interfaceC3903uh, qa3);
        }

        public final String a() {
            return this.f29831b;
        }
    }

    public Y4(QA title, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState, Nh emailState, c phoneState, a countryState, b phoneEnterState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        p013kotlin.jvm.internal.s.k(emailState, "emailState");
        p013kotlin.jvm.internal.s.k(phoneState, "phoneState");
        p013kotlin.jvm.internal.s.k(countryState, "countryState");
        p013kotlin.jvm.internal.s.k(phoneEnterState, "phoneEnterState");
        this.f29809a = title;
        this.f29810b = primaryButtonState;
        this.f29811c = secondaryButtonState;
        this.f29812d = emailState;
        this.f29813e = phoneState;
        this.f29814f = countryState;
        this.f29815g = phoneEnterState;
    }

    public final Y4 a(QA title, InterfaceC3777rk.b primaryButtonState, InterfaceC3777rk.a secondaryButtonState, Nh emailState, c phoneState, a countryState, b phoneEnterState) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(primaryButtonState, "primaryButtonState");
        p013kotlin.jvm.internal.s.k(secondaryButtonState, "secondaryButtonState");
        p013kotlin.jvm.internal.s.k(emailState, "emailState");
        p013kotlin.jvm.internal.s.k(phoneState, "phoneState");
        p013kotlin.jvm.internal.s.k(countryState, "countryState");
        p013kotlin.jvm.internal.s.k(phoneEnterState, "phoneEnterState");
        return new Y4(title, primaryButtonState, secondaryButtonState, emailState, phoneState, countryState, phoneEnterState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y4)) {
            return false;
        }
        Y4 y11 = (Y4) obj;
        return p013kotlin.jvm.internal.s.f(this.f29809a, y11.f29809a) && p013kotlin.jvm.internal.s.f(this.f29810b, y11.f29810b) && p013kotlin.jvm.internal.s.f(this.f29811c, y11.f29811c) && p013kotlin.jvm.internal.s.f(this.f29812d, y11.f29812d) && p013kotlin.jvm.internal.s.f(this.f29813e, y11.f29813e) && p013kotlin.jvm.internal.s.f(this.f29814f, y11.f29814f) && this.f29815g == y11.f29815g;
    }

    public int hashCode() {
        return (((((((((((this.f29809a.hashCode() * 31) + this.f29810b.hashCode()) * 31) + this.f29811c.hashCode()) * 31) + this.f29812d.hashCode()) * 31) + this.f29813e.hashCode()) * 31) + this.f29814f.hashCode()) * 31) + this.f29815g.hashCode();
    }

    public final a p() {
        return this.f29814f;
    }

    public final Nh q() {
        return this.f29812d;
    }

    public final b r() {
        return this.f29815g;
    }

    public final c s() {
        return this.f29813e;
    }

    public final InterfaceC3777rk.b t() {
        return this.f29810b;
    }

    public String toString() {
        return "State(title=" + this.f29809a + ", primaryButtonState=" + this.f29810b + ", secondaryButtonState=" + this.f29811c + ", emailState=" + this.f29812d + ", phoneState=" + this.f29813e + ", countryState=" + this.f29814f + ", phoneEnterState=" + this.f29815g + ")";
    }

    public final InterfaceC3777rk.a u() {
        return this.f29811c;
    }

    public static /* synthetic */ Y4 a(Y4 y11, QA qa2, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar, Nh nh2, c cVar, a aVar2, b bVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = y11.f29809a;
        }
        if ((i11 & 2) != 0) {
            bVar = y11.f29810b;
        }
        if ((i11 & 4) != 0) {
            aVar = y11.f29811c;
        }
        if ((i11 & 8) != 0) {
            nh2 = y11.f29812d;
        }
        if ((i11 & 16) != 0) {
            cVar = y11.f29813e;
        }
        if ((i11 & 32) != 0) {
            aVar2 = y11.f29814f;
        }
        if ((i11 & 64) != 0) {
            bVar2 = y11.f29815g;
        }
        a aVar3 = aVar2;
        b bVar3 = bVar2;
        c cVar2 = cVar;
        InterfaceC3777rk.a aVar4 = aVar;
        return y11.a(qa2, bVar, aVar4, nh2, cVar2, aVar3, bVar3);
    }

    public final QA a() {
        return this.f29809a;
    }

    public /* synthetic */ Y4(QA qa2, InterfaceC3777rk.b bVar, InterfaceC3777rk.a aVar, Nh nh2, c cVar, a aVar2, b bVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(qa2, bVar, aVar, nh2, cVar, aVar2, (i11 & 64) != 0 ? b.NUMBER : bVar2);
    }
}
