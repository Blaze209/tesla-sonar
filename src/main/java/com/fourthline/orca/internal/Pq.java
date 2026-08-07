package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: loaded from: classes4.dex */
public interface Pq extends PD {

    public interface a extends Pq, InterfaceC3143cr {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Pq$a$a, reason: collision with other inner class name */
        public static final class C0513a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0513a f27379a = new C0513a();

            private C0513a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f27380a = new b();

            private b() {
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final KycError f27381a;

            public c(KycError error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.f27381a = error;
            }

            public final KycError c() {
                return this.f27381a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f27381a, ((c) obj).f27381a);
            }

            public int hashCode() {
                return this.f27381a.hashCode();
            }

            public String toString() {
                return "FinishWithError(error=" + this.f27381a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f27382a = new d();

            private d() {
            }
        }
    }

    public static final class b implements Pq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f27383a = new b();

        private b() {
        }
    }

    public static final class c implements Pq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27384a = new c();

        private c() {
        }
    }
}
