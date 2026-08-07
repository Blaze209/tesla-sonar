package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface C extends JD {

    public static final class a implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25158a = new a();

        private a() {
        }
    }

    public static final class b implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25159a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -196615974;
        }

        public String toString() {
            return "OnDoneButtonClicked";
        }
    }

    public static final class c implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final A f25160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f25161b;

        public c(A type, boolean z11) {
            p013kotlin.jvm.internal.s.k(type, "type");
            this.f25160a = type;
            this.f25161b = z11;
        }

        public final A a() {
            return this.f25160a;
        }

        public final boolean b() {
            return this.f25161b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f25160a == cVar.f25160a && this.f25161b == cVar.f25161b;
        }

        public int hashCode() {
            return (this.f25160a.hashCode() * 31) + Boolean.hashCode(this.f25161b);
        }

        public String toString() {
            return "OnFocusChangedEvent(type=" + this.f25160a + ", isFocused=" + this.f25161b + ")";
        }
    }

    public static final class d implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25162a;

        public d(String input) {
            p013kotlin.jvm.internal.s.k(input, "input");
            this.f25162a = input;
        }

        public final String a() {
            return this.f25162a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f25162a, ((d) obj).f25162a);
        }

        public int hashCode() {
            return this.f25162a.hashCode();
        }

        public String toString() {
            return "OnInputChanged(input=" + this.f25162a + ")";
        }
    }

    public static final class e implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f25163a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1021830330;
        }

        public String toString() {
            return "OnInputFocused";
        }
    }

    public static final class f implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f25164a = new f();

        private f() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 960194253;
        }

        public String toString() {
            return "OnInputUnfocused";
        }
    }

    public static final class g implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3447jx f25165a;

        public g(InterfaceC3447jx item) {
            p013kotlin.jvm.internal.s.k(item, "item");
            this.f25165a = item;
        }

        public final InterfaceC3447jx a() {
            return this.f25165a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p013kotlin.jvm.internal.s.f(this.f25165a, ((g) obj).f25165a);
        }

        public int hashCode() {
            return this.f25165a.hashCode();
        }

        public String toString() {
            return "OnItemSelected(item=" + this.f25165a + ")";
        }
    }

    public static final class h implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f25166a = new h();

        private h() {
        }
    }

    public static final class i implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f25167a = new i();

        private i() {
        }
    }

    public static final class j implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final A f25168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f25169b;

        public j(A type, String value) {
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(value, "value");
            this.f25168a = type;
            this.f25169b = value;
        }

        public final A a() {
            return this.f25168a;
        }

        public final String b() {
            return this.f25169b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f25168a == jVar.f25168a && p013kotlin.jvm.internal.s.f(this.f25169b, jVar.f25169b);
        }

        public int hashCode() {
            return (this.f25168a.hashCode() * 31) + this.f25169b.hashCode();
        }

        public String toString() {
            return "OnValueChangedEvent(type=" + this.f25168a + ", value=" + this.f25169b + ")";
        }
    }
}
