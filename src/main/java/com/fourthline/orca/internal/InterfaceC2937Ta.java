package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2937Ta extends PD {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ta$a */
    public interface a extends InterfaceC2937Ta, MD {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Ta$a$a, reason: collision with other inner class name */
        public static final class C0518a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0518a f27873a = new C0518a();

            private C0518a() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Ta$a$b */
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f27874a = new b();

            private b() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Ta$a$c */
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AbstractC3502l8 f27875a;

            public c(AbstractC3502l8 error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f27875a = error;
            }

            public final AbstractC3502l8 c() {
                return this.f27875a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f27875a, ((c) obj).f27875a);
            }

            public int hashCode() {
                return this.f27875a.hashCode();
            }

            public String toString() {
                return "FinishWithError(error=" + this.f27875a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Ta$a$d */
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Of f27876a;

            public d(Of flowAction) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                this.f27876a = flowAction;
            }

            public final Of c() {
                return this.f27876a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f27876a, ((d) obj).f27876a);
            }

            public int hashCode() {
                return this.f27876a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f27876a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Ta$a$e */
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f27877a = new e();

            private e() {
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ta$b */
    public static final class b implements InterfaceC2937Ta {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27878a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 45044044;
        }

        public String toString() {
            return "OpenSettings";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ta$c */
    public static final class c implements InterfaceC2937Ta {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f27879a;

        public c(List permissions) {
            p013kotlin.jvm.internal.s.k(permissions, "permissions");
            this.f27879a = permissions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f27879a, ((c) obj).f27879a);
        }

        public int hashCode() {
            return this.f27879a.hashCode();
        }

        public String toString() {
            return "RequestPermissions(permissions=" + this.f27879a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ta$d */
    public static final class d implements InterfaceC2937Ta {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27880a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1753630032;
        }

        public String toString() {
            return "Vibrate";
        }
    }
}
