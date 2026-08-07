package net.time4j.calendar;

import java.util.Locale;
import net.time4j.calendar.f;
import net.time4j.engine.d0;
import net.time4j.engine.t;
import net.time4j.engine.w;
import net.time4j.engine.x;

/* JADX INFO: loaded from: classes9.dex */
abstract class a<C extends f<?, C>> implements t<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<C> f94001a;

    a(Class<C> cls) {
        this.f94001a = cls;
    }

    @Override // net.time4j.engine.t
    public w<?> a() {
        return null;
    }

    @Override // net.time4j.engine.t
    public int c() {
        return 100;
    }

    @Override // net.time4j.engine.t
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.o f(C c11, net.time4j.engine.d dVar) {
        return c11;
    }

    @Override // net.time4j.engine.t
    public d0 h() {
        return d0.f94117a;
    }

    @Override // net.time4j.engine.t
    public String j(x xVar, Locale locale) {
        return net.time4j.calendar.service.a.a("chinese", xVar, locale);
    }
}
