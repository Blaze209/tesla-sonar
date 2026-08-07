package net.time4j;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class g implements net.time4j.engine.c0<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<h, g> f94472c = a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<h, g> f94473d = a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<h, g> f94474e = a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f94475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94476b;

    private g(h hVar, int i11) {
        this.f94475a = hVar;
        this.f94476b = i11;
    }

    private static Map<h, g> a(int i11) {
        EnumMap enumMap = new EnumMap(h.class);
        for (h hVar : h.values()) {
            enumMap.put(hVar, new g(hVar, i11));
        }
        return Collections.unmodifiableMap(enumMap);
    }

    static g b(h hVar) {
        g gVar = f94472c.get(hVar);
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException(hVar.name());
    }

    static g c(h hVar) {
        g gVar = f94474e.get(hVar);
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException(hVar.name());
    }

    static g d(h hVar) {
        g gVar = f94473d.get(hVar);
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException(hVar.name());
    }
}
