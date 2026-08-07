package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Cq extends PD {

    public interface a extends Cq, InterfaceC3612nq {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Cq$a$a, reason: collision with other inner class name */
        public static final class C0479a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0479a f25263a = new C0479a();

            private C0479a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Pp f25264a;

            public b(Pp flowAction) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                this.f25264a = flowAction;
            }

            public final Pp c() {
                return this.f25264a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25264a, ((b) obj).f25264a);
            }

            public int hashCode() {
                return this.f25264a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f25264a + ")";
            }
        }
    }

    public static final class b implements Cq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25265a = new b();

        private b() {
        }
    }
}
