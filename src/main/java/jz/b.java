package jz;

import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
abstract class b extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final URI f84435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final qz.d f84436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final URI f84437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final yz.c f84438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final yz.c f84439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<yz.a> f84440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f84441n;

    protected b(a aVar, g gVar, String str, Set<String> set, URI uri, qz.d dVar, URI uri2, yz.c cVar, yz.c cVar2, List<yz.a> list, String str2, Map<String, Object> map, yz.c cVar3) {
        super(aVar, gVar, str, set, map, cVar3);
        this.f84435h = uri;
        this.f84436i = dVar;
        this.f84437j = uri2;
        this.f84438k = cVar;
        this.f84439l = cVar2;
        if (list != null) {
            this.f84440m = Collections.unmodifiableList(new ArrayList(list));
        } else {
            this.f84440m = null;
        }
        this.f84441n = str2;
    }

    static qz.d q(Map<String, Object> map) throws ParseException {
        if (map == null) {
            return null;
        }
        qz.d dVarL = qz.d.l(map);
        if (dVarL.k()) {
            throw new ParseException("Non-public key in jwk header parameter", 0);
        }
        return dVarL;
    }

    @Override // jz.e
    public Map<String, Object> i() {
        Map<String, Object> mapI = super.i();
        URI uri = this.f84435h;
        if (uri != null) {
            mapI.put("jku", uri.toString());
        }
        qz.d dVar = this.f84436i;
        if (dVar != null) {
            mapI.put("jwk", dVar.m());
        }
        URI uri2 = this.f84437j;
        if (uri2 != null) {
            mapI.put("x5u", uri2.toString());
        }
        yz.c cVar = this.f84438k;
        if (cVar != null) {
            mapI.put("x5t", cVar.toString());
        }
        yz.c cVar2 = this.f84439l;
        if (cVar2 != null) {
            mapI.put("x5t#S256", cVar2.toString());
        }
        List<yz.a> list = this.f84440m;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f84440m.size());
            Iterator<yz.a> it = this.f84440m.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            mapI.put("x5c", arrayList);
        }
        String str = this.f84441n;
        if (str != null) {
            mapI.put("kid", str);
        }
        return mapI;
    }

    public qz.d j() {
        return this.f84436i;
    }

    public URI k() {
        return this.f84435h;
    }

    public String l() {
        return this.f84441n;
    }

    public List<yz.a> m() {
        return this.f84440m;
    }

    public yz.c n() {
        return this.f84439l;
    }

    @Deprecated
    public yz.c o() {
        return this.f84438k;
    }

    public URI p() {
        return this.f84437j;
    }
}
