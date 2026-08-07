package qz;

import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import yz.m;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f106240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f106241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<f> f106242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jz.a f106243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f106244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final URI f106245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    private final yz.c f106246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yz.c f106247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<yz.a> f106248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<X509Certificate> f106249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final KeyStore f106250k;

    protected d(g gVar, h hVar, Set<f> set, jz.a aVar, String str, URI uri, yz.c cVar, yz.c cVar2, List<yz.a> list, KeyStore keyStore) {
        if (gVar == null) {
            throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
        }
        this.f106240a = gVar;
        if (!i.a(hVar, set)) {
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        this.f106241b = hVar;
        this.f106242c = set;
        this.f106243d = aVar;
        this.f106244e = str;
        this.f106245f = uri;
        this.f106246g = cVar;
        this.f106247h = cVar2;
        if (list != null && list.isEmpty()) {
            throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
        }
        this.f106248i = list;
        try {
            this.f106249j = m.a(list);
            this.f106250k = keyStore;
        } catch (ParseException e11) {
            throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e11.getMessage(), e11);
        }
    }

    public static d l(Map<String, Object> map) {
        String strH = yz.j.h(map, "kty");
        if (strH == null) {
            throw new ParseException("Missing key type \"kty\" parameter", 0);
        }
        g gVarB = g.b(strH);
        if (gVarB == g.f106251c) {
            return b.w(map);
        }
        if (gVarB == g.f106252d) {
            return l.p(map);
        }
        if (gVarB == g.f106253e) {
            return k.o(map);
        }
        if (gVarB == g.f106254f) {
            return j.o(map);
        }
        throw new ParseException("Unsupported key type \"kty\" parameter: " + gVarB, 0);
    }

    public jz.a a() {
        return this.f106243d;
    }

    public String b() {
        return this.f106244e;
    }

    public Set<f> c() {
        return this.f106242c;
    }

    public KeyStore d() {
        return this.f106250k;
    }

    public h e() {
        return this.f106241b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f106240a, dVar.f106240a) && Objects.equals(this.f106241b, dVar.f106241b) && Objects.equals(this.f106242c, dVar.f106242c) && Objects.equals(this.f106243d, dVar.f106243d) && Objects.equals(this.f106244e, dVar.f106244e) && Objects.equals(this.f106245f, dVar.f106245f) && Objects.equals(this.f106246g, dVar.f106246g) && Objects.equals(this.f106247h, dVar.f106247h) && Objects.equals(this.f106248i, dVar.f106248i) && Objects.equals(this.f106250k, dVar.f106250k);
    }

    public List<X509Certificate> f() {
        List<X509Certificate> list = this.f106249j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List<yz.a> g() {
        List<yz.a> list = this.f106248i;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public yz.c h() {
        return this.f106247h;
    }

    public int hashCode() {
        return Objects.hash(this.f106240a, this.f106241b, this.f106242c, this.f106243d, this.f106244e, this.f106245f, this.f106246g, this.f106247h, this.f106248i, this.f106250k);
    }

    @Deprecated
    public yz.c i() {
        return this.f106246g;
    }

    public URI j() {
        return this.f106245f;
    }

    public abstract boolean k();

    public Map<String, Object> m() {
        Map<String, Object> mapL = yz.j.l();
        mapL.put("kty", this.f106240a.a());
        h hVar = this.f106241b;
        if (hVar != null) {
            mapL.put("use", hVar.a());
        }
        if (this.f106242c != null) {
            List<Object> listA = yz.i.a();
            Iterator<f> it = this.f106242c.iterator();
            while (it.hasNext()) {
                listA.add(it.next().identifier());
            }
            mapL.put("key_ops", listA);
        }
        jz.a aVar = this.f106243d;
        if (aVar != null) {
            mapL.put("alg", aVar.getName());
        }
        String str = this.f106244e;
        if (str != null) {
            mapL.put("kid", str);
        }
        URI uri = this.f106245f;
        if (uri != null) {
            mapL.put("x5u", uri.toString());
        }
        yz.c cVar = this.f106246g;
        if (cVar != null) {
            mapL.put("x5t", cVar.toString());
        }
        yz.c cVar2 = this.f106247h;
        if (cVar2 != null) {
            mapL.put("x5t#S256", cVar2.toString());
        }
        if (this.f106248i != null) {
            List<Object> listA2 = yz.i.a();
            Iterator<yz.a> it2 = this.f106248i.iterator();
            while (it2.hasNext()) {
                listA2.add(it2.next().toString());
            }
            mapL.put("x5c", listA2);
        }
        return mapL;
    }

    public String n() {
        return yz.j.o(m());
    }

    public String toString() {
        return yz.j.o(m());
    }
}
