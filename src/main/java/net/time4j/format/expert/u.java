package net.time4j.format.expert;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.ChronoException;

/* JADX INFO: loaded from: classes9.dex */
class u extends t<u> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<net.time4j.engine.p<?>, Object> f94415b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f94414a = null;

    u() {
    }

    @Override // net.time4j.format.expert.t
    <E> E D() {
        return (E) this.f94414a;
    }

    @Override // net.time4j.format.expert.t
    void E(net.time4j.engine.p<?> pVar, int i11) {
        pVar.getClass();
        Map map = this.f94415b;
        if (map == null) {
            map = new HashMap();
            this.f94415b = map;
        }
        map.put(pVar, Integer.valueOf(i11));
    }

    @Override // net.time4j.format.expert.t
    void F(net.time4j.engine.p<?> pVar, Object obj) {
        pVar.getClass();
        if (obj != null) {
            Map map = this.f94415b;
            if (map == null) {
                map = new HashMap();
                this.f94415b = map;
            }
            map.put(pVar, obj);
            return;
        }
        Map<net.time4j.engine.p<?>, Object> map2 = this.f94415b;
        if (map2 != null) {
            map2.remove(pVar);
            if (this.f94415b.isEmpty()) {
                this.f94415b = null;
            }
        }
    }

    @Override // net.time4j.format.expert.t
    void G(Object obj) {
        this.f94414a = obj;
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public boolean n(net.time4j.engine.p<?> pVar) {
        Map<net.time4j.engine.p<?>, Object> map;
        if (pVar == null || (map = this.f94415b) == null) {
            return false;
        }
        return map.containsKey(pVar);
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public int p(net.time4j.engine.p<Integer> pVar) {
        pVar.getClass();
        Map<net.time4j.engine.p<?>, Object> map = this.f94415b;
        if (map == null || !map.containsKey(pVar)) {
            return Integer.MIN_VALUE;
        }
        return pVar.getType().cast(map.get(pVar)).intValue();
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public <V> V s(net.time4j.engine.p<V> pVar) {
        pVar.getClass();
        Map<net.time4j.engine.p<?>, Object> map = this.f94415b;
        if (map != null && map.containsKey(pVar)) {
            return pVar.getType().cast(map.get(pVar));
        }
        throw new ChronoException("No value found for: " + pVar.name());
    }

    @Override // net.time4j.engine.q
    public Set<net.time4j.engine.p<?>> v() {
        Map<net.time4j.engine.p<?>, Object> map = this.f94415b;
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }
}
