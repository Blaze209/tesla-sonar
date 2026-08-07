package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface K4 extends PD {

    public static final class a implements K4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26538a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -242866250;
        }

        public String toString() {
            return "ClearFocus";
        }
    }

    public static final class b implements K4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26539a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 314590644;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public interface c extends K4, InterfaceC3671p5 {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f26540a = new a();

            private a() {
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final InterfaceC3115c5 f26541a;

            public b(InterfaceC3115c5 flowAction) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                this.f26541a = flowAction;
            }

            public final InterfaceC3115c5 c() {
                return this.f26541a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f26541a, ((b) obj).f26541a);
            }

            public int hashCode() {
                return this.f26541a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f26541a + ")";
            }
        }
    }
}
