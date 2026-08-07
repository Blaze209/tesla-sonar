package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface J0 extends JD {

    public static final class a implements J0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26406a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1156785419;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements J0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26407a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1133875258;
        }

        public String toString() {
            return "OnDoneButtonClicked";
        }
    }

    public static final class c implements J0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26408a;

        public c(String input) {
            p013kotlin.jvm.internal.s.k(input, "input");
            this.f26408a = input;
        }

        public final String a() {
            return this.f26408a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f26408a, ((c) obj).f26408a);
        }

        public int hashCode() {
            return this.f26408a.hashCode();
        }

        public String toString() {
            return "OnInputChanged(input=" + this.f26408a + ")";
        }
    }

    public static final class d implements J0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26409a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1829916646;
        }

        public String toString() {
            return "OnInputFocused";
        }
    }

    public static final class e implements J0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f26410a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1299903341;
        }

        public String toString() {
            return "OnInputUnfocused";
        }
    }

    public static final class f implements J0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3447jx f26411a;

        public f(InterfaceC3447jx item) {
            p013kotlin.jvm.internal.s.k(item, "item");
            this.f26411a = item;
        }

        public final InterfaceC3447jx a() {
            return this.f26411a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f26411a, ((f) obj).f26411a);
        }

        public int hashCode() {
            return this.f26411a.hashCode();
        }

        public String toString() {
            return "OnItemSelected(item=" + this.f26411a + ")";
        }
    }

    public static final class g implements J0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f26412a = new g();

        private g() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 1494648937;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    public static final class h implements J0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f26413a = new h();

        private h() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 687727948;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }
}
