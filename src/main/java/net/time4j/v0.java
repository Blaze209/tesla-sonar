package net.time4j;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
class v0 implements net.time4j.engine.r {
    v0() {
    }

    @Override // net.time4j.engine.r
    public net.time4j.engine.q<?> a(net.time4j.engine.q<?> qVar, Locale locale, net.time4j.engine.d dVar) {
        return qVar;
    }

    @Override // net.time4j.engine.r
    public Set<net.time4j.engine.p<?>> b(Locale locale, net.time4j.engine.d dVar) {
        return locale.getCountry().isEmpty() ? Collections.EMPTY_SET : z0.j(locale).d();
    }

    @Override // net.time4j.engine.r
    public boolean c(Class<?> cls) {
        return false;
    }

    @Override // net.time4j.engine.r
    public boolean d(net.time4j.engine.p<?> pVar) {
        return false;
    }
}
