package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3822sm extends JD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sm$a */
    public static final class a implements InterfaceC3822sm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35340a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -375322232;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sm$b */
    public static final class b implements InterfaceC3822sm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3865tm f35341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f35342b;

        public b(EnumC3865tm type, boolean z11) {
            p013kotlin.jvm.internal.s.k(type, "type");
            this.f35341a = type;
            this.f35342b = z11;
        }

        public final boolean a() {
            return this.f35342b;
        }

        public final EnumC3865tm b() {
            return this.f35341a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f35341a == bVar.f35341a && this.f35342b == bVar.f35342b;
        }

        public int hashCode() {
            return (this.f35341a.hashCode() * 31) + Boolean.hashCode(this.f35342b);
        }

        public String toString() {
            return "OnFocusChangedEvent(type=" + this.f35341a + ", focused=" + this.f35342b + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sm$c */
    public static final class c implements InterfaceC3822sm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f35343a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -113232555;
        }

        public String toString() {
            return "OnLinkButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sm$d */
    public static final class d implements InterfaceC3822sm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f35344a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -2018855172;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sm$e */
    public static final class e implements InterfaceC3822sm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f35345a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -1414447585;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sm$f */
    public static final class f implements InterfaceC3822sm {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC3865tm f35346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35347b;

        public f(EnumC3865tm type, String value) {
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(value, "value");
            this.f35346a = type;
            this.f35347b = value;
        }

        public final String a() {
            return this.f35347b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f35346a == fVar.f35346a && p013kotlin.jvm.internal.s.f(this.f35347b, fVar.f35347b);
        }

        public int hashCode() {
            return (this.f35346a.hashCode() * 31) + this.f35347b.hashCode();
        }

        public String toString() {
            return "OnValueChangedEvent(type=" + this.f35346a + ", value=" + this.f35347b + ")";
        }
    }
}
