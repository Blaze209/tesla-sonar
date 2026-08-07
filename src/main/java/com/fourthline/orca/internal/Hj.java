package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Hj extends PD {

    public interface a extends Hj, MD {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Hj$a$a, reason: collision with other inner class name */
        public static final class C0493a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0493a f26115a = new C0493a();

            private C0493a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC3519lj f26116a;

            public b(InterfaceC3519lj flowAction) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                this.f26116a = flowAction;
            }

            public final InterfaceC3519lj c() {
                return this.f26116a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f26116a, ((b) obj).f26116a);
            }

            public int hashCode() {
                return this.f26116a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f26116a + ")";
            }
        }
    }

    public static final class b implements Hj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26117a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -233572221;
        }

        public String toString() {
            return "OpenLocationServicesSettings";
        }
    }

    public static final class c implements Hj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26118a = new c();

        private c() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -691658529;
        }

        public String toString() {
            return "OpenPermissionSettings";
        }
    }
}
