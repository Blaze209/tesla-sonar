package p013kotlin.jvm.internal;

import co0.d;
import co0.g;

/* JADX INFO: loaded from: classes9.dex */
public class d0 extends c0 {
    public d0(g gVar, String str, String str2) {
        super(f.NO_RECEIVER, ((h) gVar).a(), str, str2, !(gVar instanceof d) ? 1 : 0);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public d0(Class cls, String str, String str2, int i11) {
        super(f.NO_RECEIVER, cls, str, str2, i11);
    }

    public d0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }
}
