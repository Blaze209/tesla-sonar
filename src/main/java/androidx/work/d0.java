package androidx.work;

/* JADX INFO: loaded from: classes3.dex */
public interface d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f14503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0246b f14504b;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f14505a;

            public a(Throwable th2) {
                this.f14505a = th2;
            }

            public String toString() {
                return "FAILURE (" + this.f14505a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: androidx.work.d0$b$b, reason: collision with other inner class name */
        public static final class C0246b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0246b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f14503a = new b.c();
        f14504b = new b.C0246b();
    }

    com.google.common.util.concurrent.s<b.c> getResult();
}
