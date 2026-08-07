package hx;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* JADX INFO: loaded from: classes5.dex */
public class b extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f73680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f73681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f73682c;

    public b(c cVar, String str, Map<String, String> map) {
        this.f73682c = cVar;
        this.f73680a = str;
        if (map == null) {
            this.f73681b = new HashMap();
        } else {
            this.f73681b = map;
        }
    }

    public c a() {
        return this.f73682c;
    }

    public String b() {
        return this.f73680a;
    }

    public Iterable c() {
        return this.f73681b.entrySet();
    }

    public String d(String str) {
        return this.f73681b.get(str);
    }

    public boolean e() {
        return this.f73682c != null;
    }

    public boolean f(String str) {
        return this.f73681b.containsKey(str);
    }
}
