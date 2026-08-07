package qz;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class j extends d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Set<a> f106261q = Collections.unmodifiableSet(new HashSet(Arrays.asList(a.f106209i, a.f106210j, a.f106211k, a.f106212l)));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a f106262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final yz.c f106263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f106264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final yz.c f106265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f106266p;

    public j(a aVar, yz.c cVar, h hVar, Set<f> set, jz.a aVar2, String str, URI uri, yz.c cVar2, yz.c cVar3, List<yz.a> list, KeyStore keyStore) {
        super(g.f106254f, hVar, set, aVar2, str, uri, cVar2, cVar3, list, keyStore);
        if (aVar == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        if (!f106261q.contains(aVar)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        this.f106262l = aVar;
        if (cVar == null) {
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        }
        this.f106263m = cVar;
        this.f106264n = cVar.a();
        this.f106265o = null;
        this.f106266p = null;
    }

    public static j o(Map<String, Object> map) throws ParseException {
        g gVar = g.f106254f;
        if (!gVar.equals(e.d(map))) {
            throw new ParseException("The key type kty must be " + gVar.a(), 0);
        }
        try {
            a aVarD = a.d(yz.j.h(map, "crv"));
            yz.c cVarA = yz.j.a(map, "x");
            yz.c cVarA2 = yz.j.a(map, DateTokenConverter.CONVERTER_KEY);
            try {
                return cVarA2 == null ? new j(aVarD, cVarA, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null) : new j(aVarD, cVarA, cVarA2, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
            } catch (IllegalArgumentException e11) {
                throw new ParseException(e11.getMessage(), 0);
            }
        } catch (IllegalArgumentException e12) {
            throw new ParseException(e12.getMessage(), 0);
        }
    }

    @Override // qz.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j) || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.equals(this.f106262l, jVar.f106262l) && Objects.equals(this.f106263m, jVar.f106263m) && Arrays.equals(this.f106264n, jVar.f106264n) && Objects.equals(this.f106265o, jVar.f106265o) && Arrays.equals(this.f106266p, jVar.f106266p);
    }

    @Override // qz.d
    public int hashCode() {
        return (((Objects.hash(Integer.valueOf(super.hashCode()), this.f106262l, this.f106263m, this.f106265o) * 31) + Arrays.hashCode(this.f106264n)) * 31) + Arrays.hashCode(this.f106266p);
    }

    @Override // qz.d
    public boolean k() {
        return this.f106265o != null;
    }

    @Override // qz.d
    public Map<String, Object> m() {
        Map<String, Object> mapM = super.m();
        mapM.put("crv", this.f106262l.toString());
        mapM.put("x", this.f106263m.toString());
        yz.c cVar = this.f106265o;
        if (cVar != null) {
            mapM.put(DateTokenConverter.CONVERTER_KEY, cVar.toString());
        }
        return mapM;
    }

    public j(a aVar, yz.c cVar, yz.c cVar2, h hVar, Set<f> set, jz.a aVar2, String str, URI uri, yz.c cVar3, yz.c cVar4, List<yz.a> list, KeyStore keyStore) {
        super(g.f106254f, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            if (f106261q.contains(aVar)) {
                this.f106262l = aVar;
                if (cVar != null) {
                    this.f106263m = cVar;
                    this.f106264n = cVar.a();
                    if (cVar2 != null) {
                        this.f106265o = cVar2;
                        this.f106266p = cVar2.a();
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' parameter must not be null");
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
