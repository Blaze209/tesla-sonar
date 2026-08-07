package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Nh implements Ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Mh f27044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Gh f27047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final QA f27049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final QA f27050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final QA f27051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3903uh f27052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC3067b f27053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f27054k;

    public Nh(Mh format, String identifier, boolean z11, Gh state, String text, QA title, QA placeholder, QA status, InterfaceC3903uh interfaceC3903uh, InterfaceC3067b interfaceC3067b, int i11) {
        p013kotlin.jvm.internal.s.k(format, "format");
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
        p013kotlin.jvm.internal.s.k(status, "status");
        this.f27044a = format;
        this.f27045b = identifier;
        this.f27046c = z11;
        this.f27047d = state;
        this.f27048e = text;
        this.f27049f = title;
        this.f27050g = placeholder;
        this.f27051h = status;
        this.f27052i = interfaceC3903uh;
        this.f27053j = interfaceC3067b;
        this.f27054k = i11;
    }

    public final Nh a(Mh format, String identifier, boolean z11, Gh state, String text, QA title, QA placeholder, QA status, InterfaceC3903uh interfaceC3903uh, InterfaceC3067b interfaceC3067b, int i11) {
        p013kotlin.jvm.internal.s.k(format, "format");
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(text, "text");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(placeholder, "placeholder");
        p013kotlin.jvm.internal.s.k(status, "status");
        return new Nh(format, identifier, z11, state, text, title, placeholder, status, interfaceC3903uh, interfaceC3067b, i11);
    }

    @Override // com.fourthline.orca.internal.Ph
    public String b() {
        return this.f27045b;
    }

    @Override // com.fourthline.orca.internal.Ph
    public String c() {
        return this.f27048e;
    }

    @Override // com.fourthline.orca.internal.Ph
    public QA d() {
        return this.f27051h;
    }

    @Override // com.fourthline.orca.internal.Ph
    public Mh e() {
        return this.f27044a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nh)) {
            return false;
        }
        Nh nh2 = (Nh) obj;
        return this.f27044a == nh2.f27044a && p013kotlin.jvm.internal.s.f(this.f27045b, nh2.f27045b) && this.f27046c == nh2.f27046c && this.f27047d == nh2.f27047d && p013kotlin.jvm.internal.s.f(this.f27048e, nh2.f27048e) && p013kotlin.jvm.internal.s.f(this.f27049f, nh2.f27049f) && p013kotlin.jvm.internal.s.f(this.f27050g, nh2.f27050g) && p013kotlin.jvm.internal.s.f(this.f27051h, nh2.f27051h) && p013kotlin.jvm.internal.s.f(this.f27052i, nh2.f27052i) && p013kotlin.jvm.internal.s.f(this.f27053j, nh2.f27053j) && this.f27054k == nh2.f27054k;
    }

    public InterfaceC3067b f() {
        return this.f27053j;
    }

    public int g() {
        return this.f27054k;
    }

    @Override // com.fourthline.orca.internal.Ph
    public Gh getState() {
        return this.f27047d;
    }

    public QA h() {
        return this.f27050g;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.f27044a.hashCode() * 31) + this.f27045b.hashCode()) * 31) + Boolean.hashCode(this.f27046c)) * 31) + this.f27047d.hashCode()) * 31) + this.f27048e.hashCode()) * 31) + this.f27049f.hashCode()) * 31) + this.f27050g.hashCode()) * 31) + this.f27051h.hashCode()) * 31;
        InterfaceC3903uh interfaceC3903uh = this.f27052i;
        int iHashCode2 = (iHashCode + (interfaceC3903uh == null ? 0 : interfaceC3903uh.hashCode())) * 31;
        InterfaceC3067b interfaceC3067b = this.f27053j;
        return ((iHashCode2 + (interfaceC3067b != null ? interfaceC3067b.hashCode() : 0)) * 31) + Integer.hashCode(this.f27054k);
    }

    public InterfaceC3903uh i() {
        return this.f27052i;
    }

    public boolean j() {
        return this.f27046c;
    }

    public String toString() {
        return "InputViewState(format=" + this.f27044a + ", identifier=" + this.f27045b + ", isVisible=" + this.f27046c + ", state=" + this.f27047d + ", text=" + this.f27048e + ", title=" + this.f27049f + ", placeholder=" + this.f27050g + ", status=" + this.f27051h + ", statusIcon=" + this.f27052i + ", accessoryIcon=" + this.f27053j + ", maxLength=" + this.f27054k + ")";
    }

    public static /* synthetic */ Nh a(Nh nh2, Mh mh2, String str, boolean z11, Gh gh2, String str2, QA qa2, QA qa3, QA qa4, InterfaceC3903uh interfaceC3903uh, InterfaceC3067b interfaceC3067b, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            mh2 = nh2.f27044a;
        }
        if ((i12 & 2) != 0) {
            str = nh2.f27045b;
        }
        if ((i12 & 4) != 0) {
            z11 = nh2.f27046c;
        }
        if ((i12 & 8) != 0) {
            gh2 = nh2.f27047d;
        }
        if ((i12 & 16) != 0) {
            str2 = nh2.f27048e;
        }
        if ((i12 & 32) != 0) {
            qa2 = nh2.f27049f;
        }
        if ((i12 & 64) != 0) {
            qa3 = nh2.f27050g;
        }
        if ((i12 & 128) != 0) {
            qa4 = nh2.f27051h;
        }
        if ((i12 & 256) != 0) {
            interfaceC3903uh = nh2.f27052i;
        }
        if ((i12 & 512) != 0) {
            interfaceC3067b = nh2.f27053j;
        }
        if ((i12 & 1024) != 0) {
            i11 = nh2.f27054k;
        }
        InterfaceC3067b interfaceC3067b2 = interfaceC3067b;
        int i13 = i11;
        QA qa5 = qa4;
        InterfaceC3903uh interfaceC3903uh2 = interfaceC3903uh;
        QA qa6 = qa2;
        QA qa7 = qa3;
        String str3 = str2;
        boolean z12 = z11;
        return nh2.a(mh2, str, z12, gh2, str3, qa6, qa7, qa5, interfaceC3903uh2, interfaceC3067b2, i13);
    }

    @Override // com.fourthline.orca.internal.Ph
    public QA a() {
        return this.f27049f;
    }

    public /* synthetic */ Nh(Mh mh2, String str, boolean z11, Gh gh2, String str2, QA qa2, QA qa3, QA qa4, InterfaceC3903uh interfaceC3903uh, InterfaceC3067b interfaceC3067b, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? Mh.Text : mh2, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? true : z11, gh2, str2, qa2, qa3, qa4, (i12 & 256) != 0 ? null : interfaceC3903uh, (i12 & 512) != 0 ? null : interfaceC3067b, (i12 & 1024) != 0 ? Integer.MAX_VALUE : i11);
    }
}
