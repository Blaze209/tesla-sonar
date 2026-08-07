package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface T6 extends PD, MD {

    public static final class a implements T6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27836a = new a();

        private a() {
        }
    }

    public static final class b implements T6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC3641oc f27837a;

        public b(AbstractC3641oc error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f27837a = error;
        }

        public final AbstractC3641oc c() {
            return this.f27837a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f27837a, ((b) obj).f27837a);
        }

        public int hashCode() {
            return this.f27837a.hashCode();
        }

        public String toString() {
            return "Country(error=" + this.f27837a + ")";
        }
    }

    public static final class c implements T6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC3641oc f27838a;

        public c(AbstractC3641oc error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f27838a = error;
        }

        public final AbstractC3641oc c() {
            return this.f27838a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f27838a, ((c) obj).f27838a);
        }

        public int hashCode() {
            return this.f27838a.hashCode();
        }

        public String toString() {
            return "FinishWithError(error=" + this.f27838a + ")";
        }
    }

    public static final class d implements T6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f27839a = new d();

        private d() {
        }
    }

    public static final class e implements T6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC3641oc f27840a;

        public e(AbstractC3641oc error) {
            p013kotlin.jvm.internal.s.k(error, "error");
            this.f27840a = error;
        }

        public final AbstractC3641oc c() {
            return this.f27840a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p013kotlin.jvm.internal.s.f(this.f27840a, ((e) obj).f27840a);
        }

        public int hashCode() {
            return this.f27840a.hashCode();
        }

        public String toString() {
            return "Type(error=" + this.f27840a + ")";
        }
    }
}
