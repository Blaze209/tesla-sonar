package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface An extends PD {

    public static final class a implements An {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24972a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 727954105;
        }

        public String toString() {
            return "DisableScanner";
        }
    }

    public static final class b implements An {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24973a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1971633624;
        }

        public String toString() {
            return "EnableScanner";
        }
    }

    public interface c extends An, MD {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f24974a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1373147198;
            }

            public String toString() {
                return "Back";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Im f24975a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Am f24976b;

            public b(Im flowAction, Am result) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                p013kotlin.jvm.internal.s.k(result, "result");
                this.f24975a = flowAction;
                this.f24976b = result;
            }

            public final Im c() {
                return this.f24975a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p013kotlin.jvm.internal.s.f(this.f24975a, bVar.f24975a) && p013kotlin.jvm.internal.s.f(this.f24976b, bVar.f24976b);
            }

            public int hashCode() {
                return (this.f24975a.hashCode() * 31) + this.f24976b.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f24975a + ", result=" + this.f24976b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.An$c$c, reason: collision with other inner class name */
        public static final class C0471c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Im f24977a;

            public C0471c(Im flowAction) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                this.f24977a = flowAction;
            }

            public final Im c() {
                return this.f24977a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0471c) && p013kotlin.jvm.internal.s.f(this.f24977a, ((C0471c) obj).f24977a);
            }

            public int hashCode() {
                return this.f24977a.hashCode();
            }

            public String toString() {
                return "Skip(flowAction=" + this.f24977a + ")";
            }
        }

        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Jn f24978a;

            public d(Jn jn2) {
                this.f24978a = jn2;
            }

            public final Jn c() {
                return this.f24978a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f24978a, ((d) obj).f24978a);
            }

            public int hashCode() {
                Jn jn2 = this.f24978a;
                if (jn2 == null) {
                    return 0;
                }
                return jn2.hashCode();
            }

            public String toString() {
                return "WrongKey(key=" + this.f24978a + ")";
            }
        }
    }

    public static final class d implements An {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f24979a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 784654546;
        }

        public String toString() {
            return "OpenNfcSetting";
        }
    }

    public static final class e implements An {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f24980a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -621404660;
        }

        public String toString() {
            return "Vibrate";
        }
    }
}
