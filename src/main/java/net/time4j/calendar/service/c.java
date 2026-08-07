package net.time4j.calendar.service;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.calendar.KoreanCalendar;
import net.time4j.engine.p;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.g0;

/* JADX INFO: loaded from: classes9.dex */
public class c implements r {
    @Override // net.time4j.engine.r
    public q<?> a(q<?> qVar, Locale locale, net.time4j.engine.d dVar) {
        p<Integer> pVar = KoreanCalendar.f93983j;
        if (!qVar.n(pVar)) {
            return qVar;
        }
        return qVar.z(g0.f94489p, qVar.p(pVar) - 2333);
    }

    @Override // net.time4j.engine.r
    public Set<p<?>> b(Locale locale, net.time4j.engine.d dVar) {
        return Collections.EMPTY_SET;
    }

    @Override // net.time4j.engine.r
    public boolean c(Class<?> cls) {
        return cls == g0.class;
    }

    @Override // net.time4j.engine.r
    public boolean d(p<?> pVar) {
        return pVar == KoreanCalendar.f93983j;
    }
}
