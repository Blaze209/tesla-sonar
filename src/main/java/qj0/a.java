package qj0;

import ch.qos.logback.core.joran.action.Action;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
abstract class a<K, V, V2> implements e<Map<K, V2>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, i<V>> f105599a;

    /* JADX INFO: renamed from: qj0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2240a<K, V, V2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final LinkedHashMap<K, i<V>> f105600a;

        AbstractC2240a(int i11) {
            this.f105600a = b.c(i11);
        }

        AbstractC2240a<K, V, V2> a(K k11, i<V> iVar) {
            this.f105600a.put((K) h.c(k11, Action.KEY_ATTRIBUTE), (i) h.c(iVar, "provider"));
            return this;
        }
    }

    a(Map<K, i<V>> map) {
        this.f105599a = Collections.unmodifiableMap(map);
    }

    final Map<K, i<V>> a() {
        return this.f105599a;
    }
}
