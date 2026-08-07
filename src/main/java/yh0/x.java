package yh0;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements qj0.e<gi0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f125593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<gi0.b> f125594b;

    public x(v vVar, qj0.i<gi0.b> iVar) {
        this.f125593a = vVar;
        this.f125594b = iVar;
    }

    public static x a(v vVar, qj0.i<gi0.b> iVar) {
        return new x(vVar, iVar);
    }

    public static gi0.a c(v vVar, gi0.b bVar) {
        return (gi0.a) qj0.h.d(vVar.b(bVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public gi0.a get() {
        return c(this.f125593a, this.f125594b.get());
    }
}
