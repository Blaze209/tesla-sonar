package net.time4j.engine;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f94117a = a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f94118b = a(-21600);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f94119c = a(21600);

    private static class b extends d0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f94120d;

        @Override // net.time4j.engine.d0
        public int b(g gVar, net.time4j.tz.k kVar) {
            return this.f94120d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f94120d == ((b) obj).f94120d;
        }

        public int hashCode() {
            return this.f94120d;
        }

        public String toString() {
            return "FixedStartOfDay[" + this.f94120d + "]";
        }

        private b(int i11) {
            this.f94120d = i11;
        }
    }

    protected d0() {
    }

    private static d0 a(int i11) {
        return new b(i11);
    }

    public abstract int b(g gVar, net.time4j.tz.k kVar);
}
