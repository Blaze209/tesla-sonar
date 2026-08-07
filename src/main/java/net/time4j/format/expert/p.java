package net.time4j.format.expert;

/* JADX INFO: loaded from: classes9.dex */
final class p implements net.time4j.engine.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.d f94392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.d f94393b;

    p(net.time4j.engine.d dVar, net.time4j.engine.d dVar2) {
        this.f94392a = dVar;
        this.f94393b = dVar2;
    }

    @Override // net.time4j.engine.d
    public <A> A a(net.time4j.engine.c<A> cVar) {
        return this.f94392a.c(cVar) ? (A) this.f94392a.a(cVar) : (A) this.f94393b.a(cVar);
    }

    @Override // net.time4j.engine.d
    public <A> A b(net.time4j.engine.c<A> cVar, A a11) {
        return this.f94392a.c(cVar) ? (A) this.f94392a.a(cVar) : (A) this.f94393b.b(cVar, a11);
    }

    @Override // net.time4j.engine.d
    public boolean c(net.time4j.engine.c<?> cVar) {
        return this.f94392a.c(cVar) || this.f94393b.c(cVar);
    }
}
