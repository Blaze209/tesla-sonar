package hr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface z {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f73404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f73405b;

        public a(a0 a0Var) {
            this(a0Var, a0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f73404a.equals(aVar.f73404a) && this.f73405b.equals(aVar.f73405b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f73404a.hashCode() * 31) + this.f73405b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f73404a);
            if (this.f73404a.equals(this.f73405b)) {
                str = "";
            } else {
                str = ", " + this.f73405b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(a0 a0Var, a0 a0Var2) {
            this.f73404a = (a0) ts.a.e(a0Var);
            this.f73405b = (a0) ts.a.e(a0Var2);
        }
    }

    public static class b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f73406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f73407b;

        public b(long j11) {
            this(j11, 0L);
        }

        @Override // hr.z
        public a c(long j11) {
            return this.f73407b;
        }

        @Override // hr.z
        public boolean d() {
            return false;
        }

        @Override // hr.z
        public long g() {
            return this.f73406a;
        }

        public b(long j11, long j12) {
            this.f73406a = j11;
            this.f73407b = new a(j12 == 0 ? a0.f73300c : new a0(0L, j12));
        }
    }

    a c(long j11);

    boolean d();

    long g();
}
