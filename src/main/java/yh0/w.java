package yh0;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements qj0.e<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f125591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<q> f125592b;

    public w(v vVar, qj0.i<q> iVar) {
        this.f125591a = vVar;
        this.f125592b = iVar;
    }

    public static w a(v vVar, qj0.i<q> iVar) {
        return new w(vVar, iVar);
    }

    public static i b(v vVar, q qVar) {
        return (i) qj0.h.d(vVar.a(qVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i get() {
        return b(this.f125591a, this.f125592b.get());
    }
}
