package fg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    private static <T> List<ig.a<T>> a(gg.c cVar, float f11, tf.i iVar, n0<T> n0Var) {
        return u.a(cVar, iVar, f11, n0Var, false);
    }

    private static <T> List<ig.a<T>> b(gg.c cVar, tf.i iVar, n0<T> n0Var) {
        return u.a(cVar, iVar, 1.0f, n0Var, false);
    }

    static bg.a c(gg.c cVar, tf.i iVar) {
        return new bg.a(b(cVar, iVar, g.f65894a));
    }

    static bg.j d(gg.c cVar, tf.i iVar) {
        return new bg.j(a(cVar, hg.l.e(), iVar, i.f65899a));
    }

    public static bg.b e(gg.c cVar, tf.i iVar) {
        return f(cVar, iVar, true);
    }

    public static bg.b f(gg.c cVar, tf.i iVar, boolean z11) {
        return new bg.b(a(cVar, z11 ? hg.l.e() : 1.0f, iVar, l.f65916a));
    }

    static bg.c g(gg.c cVar, tf.i iVar, int i11) {
        return new bg.c(b(cVar, iVar, new o(i11)));
    }

    static bg.d h(gg.c cVar, tf.i iVar) {
        return new bg.d(b(cVar, iVar, r.f65929a));
    }

    static bg.f i(gg.c cVar, tf.i iVar) {
        return new bg.f(u.a(cVar, iVar, hg.l.e(), b0.f65884a, true));
    }

    static bg.g j(gg.c cVar, tf.i iVar) {
        return new bg.g(b(cVar, iVar, g0.f65895a));
    }

    static bg.h k(gg.c cVar, tf.i iVar) {
        return new bg.h(a(cVar, hg.l.e(), iVar, h0.f65897a));
    }
}
