package fo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lfo0/a;", "a", "(Lwn0/l;)Lfo0/a;", "kotlin-reflection"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    static {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        if (jn0.s.h(objB)) {
            objB = Boolean.TRUE;
        }
        Object objB2 = jn0.s.b(objB);
        Boolean bool = Boolean.FALSE;
        if (jn0.s.g(objB2)) {
            objB2 = bool;
        }
        ((Boolean) objB2).getClass();
    }

    public static final <V> a<V> a(wn0.l<? super Class<?>, ? extends V> compute) {
        p013kotlin.jvm.internal.s.k(compute, "compute");
        return new i(compute);
    }
}
