package pq;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class q implements nq.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<nq.c> f103621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f103622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f103623c;

    q(Set<nq.c> set, p pVar, t tVar) {
        this.f103621a = set;
        this.f103622b = pVar;
        this.f103623c = tVar;
    }

    @Override // nq.j
    public <T> nq.i<T> a(String str, Class<T> cls, nq.c cVar, nq.h<T, byte[]> hVar) {
        if (this.f103621a.contains(cVar)) {
            return new s(this.f103622b, str, cVar, hVar, this.f103623c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f103621a));
    }

    @Override // nq.j
    public <T> nq.i<T> b(String str, Class<T> cls, nq.h<T, byte[]> hVar) {
        return a(str, cls, nq.c.b("proto"), hVar);
    }
}
