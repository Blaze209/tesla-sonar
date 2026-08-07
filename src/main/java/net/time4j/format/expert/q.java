package net.time4j.format.expert;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
class q extends HashMap<net.time4j.engine.p<?>, Object> {
    private static final long serialVersionUID = 1245025551222311435L;

    q(Map<? extends net.time4j.engine.p<?>, ?> map) {
        super(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object put(net.time4j.engine.p<?> pVar, Object obj) {
        Object objPut = super.put(pVar, obj);
        if (pVar == null || objPut == null || objPut.equals(obj)) {
            return objPut;
        }
        throw new a(pVar);
    }
}
