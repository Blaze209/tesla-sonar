package jz;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, Object> f84454g = Collections.unmodifiableMap(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f84456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f84457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<String> f84458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f84459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final yz.c f84460f;

    protected e(a aVar, g gVar, String str, Set<String> set, Map<String, Object> map, yz.c cVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
        }
        this.f84455a = aVar;
        this.f84456b = gVar;
        this.f84457c = str;
        if (set != null) {
            this.f84458d = Collections.unmodifiableSet(new HashSet(set));
        } else {
            this.f84458d = null;
        }
        if (map != null) {
            this.f84459e = Collections.unmodifiableMap(new HashMap(map));
        } else {
            this.f84459e = f84454g;
        }
        this.f84460f = cVar;
    }

    public static a g(Map<String, Object> map) throws ParseException {
        String strH = yz.j.h(map, "alg");
        if (strH == null) {
            throw new ParseException("Missing \"alg\" in header JSON object", 0);
        }
        a aVar = a.f84432c;
        if (strH.equals(aVar.getName())) {
            return aVar;
        }
        return map.containsKey("enc") ? h.b(strH) : o.b(strH);
    }

    public a a() {
        return this.f84455a;
    }

    public String b() {
        return this.f84457c;
    }

    public Set<String> c() {
        return this.f84458d;
    }

    public Object d(String str) {
        return this.f84459e.get(str);
    }

    public Map<String, Object> e() {
        return this.f84459e;
    }

    public g f() {
        return this.f84456b;
    }

    public yz.c h() {
        yz.c cVar = this.f84460f;
        return cVar == null ? yz.c.d(toString()) : cVar;
    }

    public Map<String, Object> i() {
        Map<String, Object> mapL = yz.j.l();
        mapL.putAll(this.f84459e);
        mapL.put("alg", this.f84455a.toString());
        g gVar = this.f84456b;
        if (gVar != null) {
            mapL.put(ClientData.KEY_TYPE, gVar.toString());
        }
        String str = this.f84457c;
        if (str != null) {
            mapL.put("cty", str);
        }
        Set<String> set = this.f84458d;
        if (set != null && !set.isEmpty()) {
            mapL.put("crit", new ArrayList(this.f84458d));
        }
        return mapL;
    }

    public String toString() {
        return yz.j.o(i());
    }
}
