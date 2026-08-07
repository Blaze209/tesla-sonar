package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: loaded from: classes4.dex */
public interface O9 extends PD {

    public static final class a implements O9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27128a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1606792259;
        }

        public String toString() {
            return "ClearFocus";
        }
    }

    public static final class b implements O9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27129a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -453278725;
        }

        public String toString() {
            return "HideKeyboard";
        }
    }

    public interface c extends I0, InterfaceC3612nq {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27130a = new a();

            private a() {
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final KycError f27131a;

            public b(KycError error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f27131a = error;
            }

            public final KycError c() {
                return this.f27131a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f27131a, ((b) obj).f27131a);
            }

            public int hashCode() {
                return this.f27131a.hashCode();
            }

            public String toString() {
                return "FinishWithError(error=" + this.f27131a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.O9$c$c, reason: collision with other inner class name */
        public static final class C0508c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Pp f27132a;

            public C0508c(Pp flowAction) {
                p013kotlin.jvm.internal.s.k(flowAction, "flowAction");
                this.f27132a = flowAction;
            }

            public final Pp c() {
                return this.f27132a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0508c) && p013kotlin.jvm.internal.s.f(this.f27132a, ((C0508c) obj).f27132a);
            }

            public int hashCode() {
                return this.f27132a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f27132a + ")";
            }
        }
    }

    public static final class d implements O9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27133a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1867475274;
        }

        public String toString() {
            return "ShowKeyboard";
        }
    }
}
