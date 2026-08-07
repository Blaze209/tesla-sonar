package oq;

/* JADX INFO: loaded from: classes4.dex */
final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f98421a;

    static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f98422a;

        b() {
        }

        @Override // oq.r.a
        public r a() {
            return new h(this.f98422a);
        }

        @Override // oq.r.a
        public r.a b(Integer num) {
            this.f98422a = num;
            return this;
        }
    }

    @Override // oq.r
    public Integer b() {
        return this.f98421a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f98421a;
        Integer numB = ((r) obj).b();
        if (num == null) {
            return numB == null;
        }
        return num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f98421a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f98421a + "}";
    }

    private h(Integer num) {
        this.f98421a = num;
    }
}
