package gq;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private eq.a f69333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Map<String, eq.a>> f69334b = new HashMap();

    public c(eq.a aVar) {
        this.f69333a = aVar;
    }

    public static c f() {
        eq.a aVar = eq.a.OLD;
        c cVar = new c(aVar);
        cVar.a("VCARD", "2.1", aVar);
        eq.a aVar2 = eq.a.NEW;
        cVar.a("VCARD", "3.0", aVar2);
        cVar.a("VCARD", "4.0", aVar2);
        return cVar;
    }

    public void a(String str, String str2, eq.a aVar) {
        String upperCase = str == null ? null : str.toUpperCase();
        Map<String, eq.a> map = this.f69334b.get(upperCase);
        if (map == null) {
            map = new HashMap<>();
            this.f69334b.put(upperCase, map);
        }
        map.put(str2, aVar);
    }

    public eq.a b() {
        return this.f69333a;
    }

    public eq.a c(String str, String str2) {
        Map<String, eq.a> map = this.f69334b.get(str == null ? null : str.toUpperCase());
        if (map == null) {
            return null;
        }
        return map.get(str2);
    }

    public boolean d(String str) {
        if (str != null) {
            str = str.toUpperCase();
        }
        return this.f69334b.containsKey(str);
    }

    public void e(eq.a aVar) {
        this.f69333a = aVar;
    }
}
