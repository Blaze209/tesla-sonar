package qz;

import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final yz.c f106267l;

    public k(yz.c cVar, h hVar, Set<f> set, jz.a aVar, String str, URI uri, yz.c cVar2, yz.c cVar3, List<yz.a> list, KeyStore keyStore) {
        super(g.f106253e, hVar, set, aVar, str, uri, cVar2, cVar3, list, keyStore);
        if (cVar == null) {
            throw new IllegalArgumentException("The key value must not be null");
        }
        this.f106267l = cVar;
    }

    public static k o(Map<String, Object> map) throws ParseException {
        g gVar = g.f106253e;
        if (gVar.equals(e.d(map))) {
            try {
                return new k(yz.j.a(map, "k"), e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
            } catch (IllegalArgumentException e11) {
                throw new ParseException(e11.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + gVar.a(), 0);
    }

    @Override // qz.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && super.equals(obj)) {
            return Objects.equals(this.f106267l, ((k) obj).f106267l);
        }
        return false;
    }

    @Override // qz.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f106267l);
    }

    @Override // qz.d
    public boolean k() {
        return true;
    }

    @Override // qz.d
    public Map<String, Object> m() {
        Map<String, Object> mapM = super.m();
        mapM.put("k", this.f106267l.toString());
        return mapM;
    }
}
