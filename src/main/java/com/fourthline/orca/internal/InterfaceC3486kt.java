package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3486kt extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kt$a */
    public static final class a implements InterfaceC3486kt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f33055a;

        public a(boolean z11) {
            this.f33055a = z11;
        }

        public final boolean a() {
            return this.f33055a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f33055a == ((a) obj).f33055a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f33055a);
        }

        public String toString() {
            return "OnClaimsToggled(isChecked=" + this.f33055a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kt$b */
    public static final class b implements InterfaceC3486kt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3529lt.a.InterfaceC0579a f33056a;

        public b(C3529lt.a.InterfaceC0579a document) {
            p013kotlin.jvm.internal.s.k(document, "document");
            this.f33056a = document;
        }

        public final C3529lt.a.InterfaceC0579a a() {
            return this.f33056a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f33056a, ((b) obj).f33056a);
        }

        public int hashCode() {
            return this.f33056a.hashCode();
        }

        public String toString() {
            return "OnDocumentClicked(document=" + this.f33056a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kt$c */
    public static final class c implements InterfaceC3486kt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f33057a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1141629360;
        }

        public String toString() {
            return "OnPrimaryButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kt$d */
    public static final class d implements InterfaceC3486kt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f33058a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1360744296;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kt$e */
    public static final class e implements InterfaceC3486kt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f33059a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -270590914;
        }

        public String toString() {
            return "OnSecondaryButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kt$f */
    public static final class f implements InterfaceC3486kt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f33060a = new f();

        private f() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -2034244876;
        }

        public String toString() {
            return "OnShowLessClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kt$g */
    public static final class g implements InterfaceC3486kt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f33061a = new g();

        private g() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 1676549560;
        }

        public String toString() {
            return "OnShowMoreClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kt$h */
    public static final class h implements InterfaceC3486kt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f33062a;

        public h(boolean z11) {
            this.f33062a = z11;
        }

        public final boolean a() {
            return this.f33062a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f33062a == ((h) obj).f33062a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f33062a);
        }

        public String toString() {
            return "OnTermsToggled(isChecked=" + this.f33062a + ")";
        }
    }
}
