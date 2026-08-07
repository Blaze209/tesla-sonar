package wz;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class d extends f<sz.c> {
    protected d(e eVar) {
        super(eVar);
    }

    @Override // wz.f
    public void a(Object obj, Object obj2) {
        ((sz.a) obj).add(obj2);
    }

    @Override // wz.f
    public Object c() {
        return new sz.a();
    }

    @Override // wz.f
    public Object d() {
        return new LinkedHashMap();
    }

    @Override // wz.f
    public void e(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    @Override // wz.f
    public f<sz.c> f(String str) {
        return this.f122446a.f122444c;
    }

    @Override // wz.f
    public f<sz.c> g(String str) {
        return this.f122446a.f122444c;
    }
}
