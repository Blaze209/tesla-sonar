package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Dn extends OD {

    public static final class a implements Dn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25483a = new a();

        private a() {
        }
    }

    public static final class b implements Dn {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Am f25484a;

        public b(Am capabilityResult) {
            p013kotlin.jvm.internal.s.k(capabilityResult, "capabilityResult");
            this.f25484a = capabilityResult;
        }

        public final Am a() {
            return this.f25484a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f25484a, ((b) obj).f25484a);
        }

        public int hashCode() {
            return this.f25484a.hashCode();
        }

        public String toString() {
            return "Success(capabilityResult=" + this.f25484a + ")";
        }
    }
}
