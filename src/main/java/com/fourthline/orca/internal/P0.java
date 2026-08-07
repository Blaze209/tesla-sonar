package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface P0 {

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.P0$a$a, reason: collision with other inner class name */
        public static final class C0511a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bo f27264a;

            public C0511a(Bo error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f27264a = error;
            }

            public final Bo a() {
                return this.f27264a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0511a) && p013kotlin.jvm.internal.s.f(this.f27264a, ((C0511a) obj).f27264a);
            }

            public int hashCode() {
                return this.f27264a.hashCode();
            }

            public String toString() {
                return "Invalid(error=" + this.f27264a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f27265a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1682397834;
            }

            public String toString() {
                return "Valid";
            }
        }
    }

    a a(InterfaceC3447jx interfaceC3447jx);
}
