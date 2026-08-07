package p013kotlin.jvm.internal;

import co0.d;
import co0.g;

/* JADX INFO: loaded from: classes9.dex */
public class z extends y {
    public z(g gVar, String str, String str2) {
        super(f.NO_RECEIVER, ((h) gVar).a(), str, str2, !(gVar instanceof d) ? 1 : 0);
    }

    @Override // co0.o
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // co0.k
    public void h(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public z(Class cls, String str, String str2, int i11) {
        super(f.NO_RECEIVER, cls, str, str2, i11);
    }
}
