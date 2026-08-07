package com.fourthline.orca.internal;

import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class K0 implements Ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mh f26518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QA f26521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final QA f26522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Gh f26524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final QA f26525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3903uh f26526i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final QA f26527j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f26528k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC3903uh f26529l;

    public K0(Mh format, String identifier, boolean z11, QA title, QA placeholder, String text, Gh state, QA status, InterfaceC3903uh interfaceC3903uh, QA qa2, List suggestions, InterfaceC3903uh searchImageSource) {
        p013kotlin.jvm.internal.s.k(format, "format");
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(status, "status");
        p013kotlin.jvm.internal.s.k(suggestions, "suggestions");
        p013kotlin.jvm.internal.s.k(searchImageSource, "searchImageSource");
        this.f26518a = format;
        this.f26519b = identifier;
        this.f26520c = z11;
        this.f26521d = title;
        this.f26522e = placeholder;
        this.f26523f = text;
        this.f26524g = state;
        this.f26525h = status;
        this.f26526i = interfaceC3903uh;
        this.f26527j = qa2;
        this.f26528k = suggestions;
        this.f26529l = searchImageSource;
    }

    public final K0 a(Mh format, String identifier, boolean z11, QA title, QA placeholder, String text, Gh state, QA status, InterfaceC3903uh interfaceC3903uh, QA qa2, List suggestions, InterfaceC3903uh searchImageSource) {
        p013kotlin.jvm.internal.s.k(format, "format");
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(status, "status");
        p013kotlin.jvm.internal.s.k(suggestions, "suggestions");
        p013kotlin.jvm.internal.s.k(searchImageSource, "searchImageSource");
        return new K0(format, identifier, z11, title, placeholder, text, state, status, interfaceC3903uh, qa2, suggestions, searchImageSource);
    }

    @Override // com.fourthline.orca.internal.Ph
    public String b() {
        return this.f26519b;
    }

    @Override // com.fourthline.orca.internal.Ph
    public String c() {
        return this.f26523f;
    }

    @Override // com.fourthline.orca.internal.Ph
    public QA d() {
        return this.f26525h;
    }

    @Override // com.fourthline.orca.internal.Ph
    public Mh e() {
        return this.f26518a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k11 = (K0) obj;
        return this.f26518a == k11.f26518a && p013kotlin.jvm.internal.s.f(this.f26519b, k11.f26519b) && this.f26520c == k11.f26520c && p013kotlin.jvm.internal.s.f(this.f26521d, k11.f26521d) && p013kotlin.jvm.internal.s.f(this.f26522e, k11.f26522e) && p013kotlin.jvm.internal.s.f(this.f26523f, k11.f26523f) && this.f26524g == k11.f26524g && p013kotlin.jvm.internal.s.f(this.f26525h, k11.f26525h) && p013kotlin.jvm.internal.s.f(this.f26526i, k11.f26526i) && p013kotlin.jvm.internal.s.f(this.f26527j, k11.f26527j) && p013kotlin.jvm.internal.s.f(this.f26528k, k11.f26528k) && p013kotlin.jvm.internal.s.f(this.f26529l, k11.f26529l);
    }

    public QA f() {
        return this.f26522e;
    }

    public final InterfaceC3903uh g() {
        return this.f26529l;
    }

    @Override // com.fourthline.orca.internal.Ph
    public Gh getState() {
        return this.f26524g;
    }

    public InterfaceC3903uh h() {
        return this.f26526i;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f26518a.hashCode() * 31) + this.f26519b.hashCode()) * 31) + Boolean.hashCode(this.f26520c)) * 31) + this.f26521d.hashCode()) * 31) + this.f26522e.hashCode()) * 31) + this.f26523f.hashCode()) * 31) + this.f26524g.hashCode()) * 31) + this.f26525h.hashCode()) * 31;
        InterfaceC3903uh interfaceC3903uh = this.f26526i;
        int iHashCode2 = (iHashCode + (interfaceC3903uh == null ? 0 : interfaceC3903uh.hashCode())) * 31;
        QA qa2 = this.f26527j;
        return ((((iHashCode2 + (qa2 != null ? qa2.hashCode() : 0)) * 31) + this.f26528k.hashCode()) * 31) + this.f26529l.hashCode();
    }

    public final List i() {
        return this.f26528k;
    }

    public final QA j() {
        return this.f26527j;
    }

    public String toString() {
        return "PickerState(format=" + this.f26518a + ", identifier=" + this.f26519b + ", isVisible=" + this.f26520c + ", title=" + this.f26521d + ", placeholder=" + this.f26522e + ", text=" + this.f26523f + ", state=" + this.f26524g + ", status=" + this.f26525h + ", statusIcon=" + this.f26526i + ", warningMessage=" + this.f26527j + ", suggestions=" + this.f26528k + ", searchImageSource=" + this.f26529l + ")";
    }

    public static /* synthetic */ K0 a(K0 k11, Mh mh2, String str, boolean z11, QA qa2, QA qa3, String str2, Gh gh2, QA qa4, InterfaceC3903uh interfaceC3903uh, QA qa5, List list, InterfaceC3903uh interfaceC3903uh2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mh2 = k11.f26518a;
        }
        if ((i11 & 2) != 0) {
            str = k11.f26519b;
        }
        if ((i11 & 4) != 0) {
            z11 = k11.f26520c;
        }
        if ((i11 & 8) != 0) {
            qa2 = k11.f26521d;
        }
        if ((i11 & 16) != 0) {
            qa3 = k11.f26522e;
        }
        if ((i11 & 32) != 0) {
            str2 = k11.f26523f;
        }
        if ((i11 & 64) != 0) {
            gh2 = k11.f26524g;
        }
        if ((i11 & 128) != 0) {
            qa4 = k11.f26525h;
        }
        if ((i11 & 256) != 0) {
            interfaceC3903uh = k11.f26526i;
        }
        if ((i11 & 512) != 0) {
            qa5 = k11.f26527j;
        }
        if ((i11 & 1024) != 0) {
            list = k11.f26528k;
        }
        if ((i11 & 2048) != 0) {
            interfaceC3903uh2 = k11.f26529l;
        }
        List list2 = list;
        InterfaceC3903uh interfaceC3903uh3 = interfaceC3903uh2;
        InterfaceC3903uh interfaceC3903uh4 = interfaceC3903uh;
        QA qa6 = qa5;
        Gh gh3 = gh2;
        QA qa7 = qa4;
        QA qa8 = qa3;
        String str3 = str2;
        return k11.a(mh2, str, z11, qa2, qa8, str3, gh3, qa7, interfaceC3903uh4, qa6, list2, interfaceC3903uh3);
    }

    @Override // com.fourthline.orca.internal.Ph
    public QA a() {
        return this.f26521d;
    }

    public /* synthetic */ K0(Mh mh2, String str, boolean z11, QA qa2, QA qa3, String str2, Gh gh2, QA qa4, InterfaceC3903uh interfaceC3903uh, QA qa5, List list, InterfaceC3903uh interfaceC3903uh2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Mh.Text : mh2, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? QA.b.f27435b : qa2, (i11 & 16) != 0 ? QA.b.f27435b : qa3, (i11 & 32) != 0 ? "" : str2, (i11 & 64) != 0 ? Gh.UNFOCUSED : gh2, (i11 & 128) != 0 ? QA.b.f27435b : qa4, (i11 & 256) != 0 ? null : interfaceC3903uh, (i11 & 512) != 0 ? null : qa5, (i11 & 1024) != 0 ? p013kotlin.collections.v.m() : list, interfaceC3903uh2);
    }
}
