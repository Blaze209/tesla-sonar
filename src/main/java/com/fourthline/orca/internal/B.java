package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface B extends PD {

    public static final class a implements B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25037a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -344314014;
        }

        public String toString() {
            return "ClearFocus";
        }
    }

    public static final class b implements B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25038a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1607537248;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public interface c extends B, InterfaceC3025a0 {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f25039a = new a();

            private a() {
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final K f25040a;

            public b(K flowAction) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                this.f25040a = flowAction;
            }

            public final K c() {
                return this.f25040a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25040a, ((b) obj).f25040a);
            }

            public int hashCode() {
                return this.f25040a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f25040a + ")";
            }
        }
    }

    public static final class d implements B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f25041a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 193340699;
        }

        public String toString() {
            return "ShowKeyboard";
        }
    }
}
