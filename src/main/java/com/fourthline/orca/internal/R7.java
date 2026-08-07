package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: loaded from: classes4.dex */
public interface R7 extends I0, InterfaceC2923Qb {

    public static final class a implements R7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27596a = new a();

        private a() {
        }
    }

    public static final class b implements R7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final KycError f27597a;

        public b(KycError error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f27597a = error;
        }

        public final KycError c() {
            return this.f27597a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f27597a, ((b) obj).f27597a);
        }

        public int hashCode() {
            return this.f27597a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f27597a + ")";
        }
    }

    public static final class c implements R7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27598a = new c();

        private c() {
        }
    }
}
