package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface Uh {

    public static final class a implements Uh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Th f28795a;

        public a(Th error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f28795a = error;
        }

        public final Th a() {
            return this.f28795a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f28795a, ((a) obj).f28795a);
        }

        public int hashCode() {
            return this.f28795a.hashCode();
        }

        public String toString() {
            return "Invalid(error=" + this.f28795a + ")";
        }
    }

    public static final class b implements Uh {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28796a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1508229512;
        }

        public String toString() {
            return "Valid";
        }
    }
}
