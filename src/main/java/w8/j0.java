package w8;

/* JADX INFO: loaded from: classes3.dex */
public interface j0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0 f121331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f121332b;

        public a(k0 k0Var) {
            this(k0Var, k0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f121331a.equals(aVar.f121331a) && this.f121332b.equals(aVar.f121332b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f121331a.hashCode() * 31) + this.f121332b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f121331a);
            if (this.f121331a.equals(this.f121332b)) {
                str = "";
            } else {
                str = ", " + this.f121332b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public a(k0 k0Var, k0 k0Var2) {
            this.f121331a = (k0) s7.a.f(k0Var);
            this.f121332b = (k0) s7.a.f(k0Var2);
        }
    }

    public static class b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f121333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f121334b;

        public b(long j11) {
            this(j11, 0L);
        }

        @Override // w8.j0
        public a c(long j11) {
            return this.f121334b;
        }

        @Override // w8.j0
        public boolean d() {
            return false;
        }

        @Override // w8.j0
        public long g() {
            return this.f121333a;
        }

        public b(long j11, long j12) {
            this.f121333a = j11;
            this.f121334b = new a(j12 == 0 ? k0.f121335c : new k0(0L, j12));
        }
    }

    a c(long j11);

    boolean d();

    long g();
}
