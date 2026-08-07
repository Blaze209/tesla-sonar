package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface P9 extends JD {

    public static final class a implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27290a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1862877968;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27291a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 427782709;
        }

        public String toString() {
            return "OnDoneButtonClicked";
        }
    }

    public static final class c implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q9 f27292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f27293b;

        public c(Q9 type, boolean z11) {
            p013kotlin.jvm.internal.s.k(type, "type");
            this.f27292a = type;
            this.f27293b = z11;
        }

        public final boolean a() {
            return this.f27293b;
        }

        public final Q9 b() {
            return this.f27292a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f27292a == cVar.f27292a && this.f27293b == cVar.f27293b;
        }

        public int hashCode() {
            return (this.f27292a.hashCode() * 31) + Boolean.hashCode(this.f27293b);
        }

        public String toString() {
            return "OnFocusChangedEvent(type=" + this.f27292a + ", focused=" + this.f27293b + ")";
        }
    }

    public static final class d implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27294a;

        public d(String input) {
            p013kotlin.jvm.internal.s.k(input, "input");
            this.f27294a = input;
        }

        public final String a() {
            return this.f27294a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f27294a, ((d) obj).f27294a);
        }

        public int hashCode() {
            return this.f27294a.hashCode();
        }

        public String toString() {
            return "OnInputChanged(input=" + this.f27294a + ")";
        }
    }

    public static final class e implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f27295a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -482616053;
        }

        public String toString() {
            return "OnInputFocused";
        }
    }

    public static final class f implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f27296a = new f();

        private f() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -545928366;
        }

        public String toString() {
            return "OnInputUnfocused";
        }
    }

    public static final class g implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3447jx f27297a;

        public g(InterfaceC3447jx item) {
            p013kotlin.jvm.internal.s.k(item, "item");
            this.f27297a = item;
        }

        public final InterfaceC3447jx a() {
            return this.f27297a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p013kotlin.jvm.internal.s.f(this.f27297a, ((g) obj).f27297a);
        }

        public int hashCode() {
            return this.f27297a.hashCode();
        }

        public String toString() {
            return "OnItemSelected(item=" + this.f27297a + ")";
        }
    }

    public static final class h implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f27298a = new h();

        private h() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 788556388;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    public static final class i implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f27299a = new i();

        private i() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 613130119;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }

    public static final class j implements P9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q9 f27300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f27301b;

        public j(Q9 type, String value) {
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(value, "value");
            this.f27300a = type;
            this.f27301b = value;
        }

        public final Q9 a() {
            return this.f27300a;
        }

        public final String b() {
            return this.f27301b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f27300a == jVar.f27300a && p013kotlin.jvm.internal.s.f(this.f27301b, jVar.f27301b);
        }

        public int hashCode() {
            return (this.f27300a.hashCode() * 31) + this.f27301b.hashCode();
        }

        public String toString() {
            return "OnValueChangedEvent(type=" + this.f27300a + ", value=" + this.f27301b + ")";
        }
    }
}
