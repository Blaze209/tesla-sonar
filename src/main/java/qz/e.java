package qz;

import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yz.m;

/* JADX INFO: loaded from: classes6.dex */
final class e {
    static jz.a a(Map<String, Object> map) {
        return jz.a.a(yz.j.h(map, "alg"));
    }

    static String b(Map<String, Object> map) {
        return yz.j.h(map, "kid");
    }

    static Set<f> c(Map<String, Object> map) {
        return f.parse(yz.j.j(map, "key_ops"));
    }

    static g d(Map<String, Object> map) throws ParseException {
        try {
            return g.b(yz.j.h(map, "kty"));
        } catch (IllegalArgumentException e11) {
            throw new ParseException(e11.getMessage(), 0);
        }
    }

    static h e(Map<String, Object> map) {
        return h.b(yz.j.h(map, "use"));
    }

    static List<yz.a> f(Map<String, Object> map) throws ParseException {
        List<yz.a> listB = m.b(yz.j.e(map, "x5c"));
        if (listB == null || !listB.isEmpty()) {
            return listB;
        }
        return null;
    }

    static yz.c g(Map<String, Object> map) {
        return yz.j.a(map, "x5t#S256");
    }

    static yz.c h(Map<String, Object> map) {
        return yz.j.a(map, "x5t");
    }

    static URI i(Map<String, Object> map) {
        return yz.j.k(map, "x5u");
    }
}
