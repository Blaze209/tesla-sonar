package net.time4j.engine;

import java.util.Map;
import net.time4j.engine.l;

/* JADX INFO: loaded from: classes9.dex */
public final class j<T extends l<T>> extends w<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, ? extends k<T>> f94150h;

    @Override // net.time4j.engine.w
    public k<T> n() {
        throw new ChronoException("Cannot determine calendar system without variant.");
    }

    @Override // net.time4j.engine.w
    public k<T> o(String str) {
        if (str.isEmpty()) {
            return n();
        }
        k<T> kVar = this.f94150h.get(str);
        return kVar == null ? super.o(str) : kVar;
    }

    @Override // net.time4j.engine.w
    public boolean w(p<?> pVar) {
        return super.w(pVar) || (pVar instanceof z);
    }
}
