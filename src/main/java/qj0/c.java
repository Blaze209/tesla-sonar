package qj0;

/* JADX INFO: loaded from: classes8.dex */
public final class c<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i<T> f105601a;

    public static <T> void a(i<T> iVar, i<T> iVar2) {
        b((c) iVar, iVar2);
    }

    private static <T> void b(c<T> cVar, i<T> iVar) {
        h.b(iVar);
        if (((c) cVar).f105601a != null) {
            throw new IllegalStateException();
        }
        ((c) cVar).f105601a = iVar;
    }

    @Override // javax.inject.Provider
    public T get() {
        i<T> iVar = this.f105601a;
        if (iVar != null) {
            return iVar.get();
        }
        throw new IllegalStateException();
    }
}
