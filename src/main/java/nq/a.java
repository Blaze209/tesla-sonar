package nq;

/* JADX INFO: loaded from: classes4.dex */
final class a<T> extends d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f95287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f95288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f95289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f95290d;

    a(Integer num, T t11, f fVar, g gVar, e eVar) {
        this.f95287a = num;
        if (t11 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f95288b = t11;
        if (fVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f95289c = fVar;
        this.f95290d = gVar;
    }

    @Override // nq.d
    public Integer a() {
        return this.f95287a;
    }

    @Override // nq.d
    public e b() {
        return null;
    }

    @Override // nq.d
    public T c() {
        return this.f95288b;
    }

    @Override // nq.d
    public f d() {
        return this.f95289c;
    }

    @Override // nq.d
    public g e() {
        return this.f95290d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f95287a;
            if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
                if (this.f95288b.equals(dVar.c()) && this.f95289c.equals(dVar.d()) && ((gVar = this.f95290d) != null ? gVar.equals(dVar.e()) : dVar.e() == null)) {
                    dVar.b();
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f95287a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f95288b.hashCode()) * 1000003) ^ this.f95289c.hashCode()) * 1000003;
        g gVar = this.f95290d;
        return (iHashCode ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f95287a + ", payload=" + this.f95288b + ", priority=" + this.f95289c + ", productData=" + this.f95290d + ", eventContext=" + ((Object) null) + "}";
    }
}
