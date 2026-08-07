package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3952vm implements QD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f36257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Nh f36258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QA f36259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3903uh f36260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f36261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f36262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final QA f36263g;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vm$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f36264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final QA f36265b;

        public a(QA text, QA link) {
            p013kotlin.jvm.internal.s.k(text, "text");
            p013kotlin.jvm.internal.s.k(link, "link");
            this.f36264a = text;
            this.f36265b = link;
        }

        public final QA a() {
            return this.f36265b;
        }

        public final QA b() {
            return this.f36264a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p013kotlin.jvm.internal.s.f(this.f36264a, aVar.f36264a) && p013kotlin.jvm.internal.s.f(this.f36265b, aVar.f36265b);
        }

        public int hashCode() {
            return (this.f36264a.hashCode() * 31) + this.f36265b.hashCode();
        }

        public String toString() {
            return "LinkButtonState(text=" + this.f36264a + ", link=" + this.f36265b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.vm$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final QA f36266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f36267b;

        public b(QA text, boolean z11) {
            p013kotlin.jvm.internal.s.k(text, "text");
            this.f36266a = text;
            this.f36267b = z11;
        }

        public final b a(QA text, boolean z11) {
            p013kotlin.jvm.internal.s.k(text, "text");
            return new b(text, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p013kotlin.jvm.internal.s.f(this.f36266a, bVar.f36266a) && this.f36267b == bVar.f36267b;
        }

        public int hashCode() {
            return (this.f36266a.hashCode() * 31) + Boolean.hashCode(this.f36267b);
        }

        public String toString() {
            return "PrimaryButtonState(text=" + this.f36266a + ", enabled=" + this.f36267b + ")";
        }

        public static /* synthetic */ b a(b bVar, QA qa2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                qa2 = bVar.f36266a;
            }
            if ((i11 & 2) != 0) {
                z11 = bVar.f36267b;
            }
            return bVar.a(qa2, z11);
        }

        public final boolean a() {
            return this.f36267b;
        }
    }

    public C3952vm(QA title, Nh inputViewState, QA hintText, InterfaceC3903uh hintImage, a aVar, b nextButtonState, QA backButtonText) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(inputViewState, "inputViewState");
        p013kotlin.jvm.internal.s.k(hintText, "hintText");
        p013kotlin.jvm.internal.s.k(hintImage, "hintImage");
        p013kotlin.jvm.internal.s.k(nextButtonState, "nextButtonState");
        p013kotlin.jvm.internal.s.k(backButtonText, "backButtonText");
        this.f36257a = title;
        this.f36258b = inputViewState;
        this.f36259c = hintText;
        this.f36260d = hintImage;
        this.f36261e = aVar;
        this.f36262f = nextButtonState;
        this.f36263g = backButtonText;
    }

    public final C3952vm a(QA title, Nh inputViewState, QA hintText, InterfaceC3903uh hintImage, a aVar, b nextButtonState, QA backButtonText) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(inputViewState, "inputViewState");
        p013kotlin.jvm.internal.s.k(hintText, "hintText");
        p013kotlin.jvm.internal.s.k(hintImage, "hintImage");
        p013kotlin.jvm.internal.s.k(nextButtonState, "nextButtonState");
        p013kotlin.jvm.internal.s.k(backButtonText, "backButtonText");
        return new C3952vm(title, inputViewState, hintText, hintImage, aVar, nextButtonState, backButtonText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3952vm)) {
            return false;
        }
        C3952vm c3952vm = (C3952vm) obj;
        return p013kotlin.jvm.internal.s.f(this.f36257a, c3952vm.f36257a) && p013kotlin.jvm.internal.s.f(this.f36258b, c3952vm.f36258b) && p013kotlin.jvm.internal.s.f(this.f36259c, c3952vm.f36259c) && p013kotlin.jvm.internal.s.f(this.f36260d, c3952vm.f36260d) && p013kotlin.jvm.internal.s.f(this.f36261e, c3952vm.f36261e) && p013kotlin.jvm.internal.s.f(this.f36262f, c3952vm.f36262f) && p013kotlin.jvm.internal.s.f(this.f36263g, c3952vm.f36263g);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f36257a.hashCode() * 31) + this.f36258b.hashCode()) * 31) + this.f36259c.hashCode()) * 31) + this.f36260d.hashCode()) * 31;
        a aVar = this.f36261e;
        return ((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f36262f.hashCode()) * 31) + this.f36263g.hashCode();
    }

    public final InterfaceC3903uh p() {
        return this.f36260d;
    }

    public final QA q() {
        return this.f36259c;
    }

    public final Nh r() {
        return this.f36258b;
    }

    public final a s() {
        return this.f36261e;
    }

    public final b t() {
        return this.f36262f;
    }

    public String toString() {
        return "State(title=" + this.f36257a + ", inputViewState=" + this.f36258b + ", hintText=" + this.f36259c + ", hintImage=" + this.f36260d + ", linkButtonState=" + this.f36261e + ", nextButtonState=" + this.f36262f + ", backButtonText=" + this.f36263g + ")";
    }

    public static /* synthetic */ C3952vm a(C3952vm c3952vm, QA qa2, Nh nh2, QA qa3, InterfaceC3903uh interfaceC3903uh, a aVar, b bVar, QA qa4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qa2 = c3952vm.f36257a;
        }
        if ((i11 & 2) != 0) {
            nh2 = c3952vm.f36258b;
        }
        if ((i11 & 4) != 0) {
            qa3 = c3952vm.f36259c;
        }
        if ((i11 & 8) != 0) {
            interfaceC3903uh = c3952vm.f36260d;
        }
        if ((i11 & 16) != 0) {
            aVar = c3952vm.f36261e;
        }
        if ((i11 & 32) != 0) {
            bVar = c3952vm.f36262f;
        }
        if ((i11 & 64) != 0) {
            qa4 = c3952vm.f36263g;
        }
        b bVar2 = bVar;
        QA qa5 = qa4;
        a aVar2 = aVar;
        QA qa6 = qa3;
        return c3952vm.a(qa2, nh2, qa6, interfaceC3903uh, aVar2, bVar2, qa5);
    }

    public final QA a() {
        return this.f36257a;
    }
}
