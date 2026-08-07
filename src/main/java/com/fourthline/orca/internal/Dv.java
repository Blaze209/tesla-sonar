package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Dv extends PD {

    public static final class a implements Dv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25509a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 554606598;
        }

        public String toString() {
            return "ClearFocus";
        }
    }

    public static final class b implements Dv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25510a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2113148412;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public interface c extends Dv, MD {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25511a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -936945784;
            }

            public String toString() {
                return "Agreements";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f25512a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -2100836679;
            }

            public String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Dv$c$c, reason: collision with other inner class name */
        public static final class C0482c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Xt f25513a;

            public C0482c(Xt flowAction) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                this.f25513a = flowAction;
            }

            public final Xt c() {
                return this.f25513a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0482c) && p013kotlin.jvm.internal.s.f(this.f25513a, ((C0482c) obj).f25513a);
            }

            public int hashCode() {
                return this.f25513a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f25513a + ")";
            }
        }
    }

    public static final class d implements Dv {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f25514a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 767622335;
        }

        public String toString() {
            return "ShowKeyboard";
        }
    }
}
