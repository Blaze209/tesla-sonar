package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Ev extends JD {

    public static final class a implements Ev {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25655a;

        public a(String input) {
            p013kotlin.jvm.internal.s.k(input, "input");
            this.f25655a = input;
        }

        public final String a() {
            return this.f25655a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f25655a, ((a) obj).f25655a);
        }

        public int hashCode() {
            return this.f25655a.hashCode();
        }

        public String toString() {
            return "OnInputChanged(input=" + this.f25655a + ")";
        }
    }

    public static final class b implements Ev {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25656a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -398968798;
        }

        public String toString() {
            return "OnInputFocused";
        }
    }

    public static final class c implements Ev {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25657a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1765294935;
        }

        public String toString() {
            return "OnInputUnfocused";
        }
    }

    public static final class d implements Ev {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f25658a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -982411128;
        }

        public String toString() {
            return "OnPrimaryButtonClicked";
        }
    }

    public static final class e implements Ev {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f25659a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1046739568;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }

    public static final class f implements Ev {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f25660a = new f();

        private f() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1364034282;
        }

        public String toString() {
            return "OnSecondaryButtonClicked";
        }
    }

    public static final class g implements Ev {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f25661a = new g();

        private g() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 1399780434;
        }

        public String toString() {
            return "OnSendAgainButtonClicked";
        }
    }
}
