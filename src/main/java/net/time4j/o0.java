package net.time4j;

import java.util.Comparator;
import net.time4j.x;

/* JADX INFO: loaded from: classes9.dex */
class o0<U extends x> implements net.time4j.engine.c0<U>, Comparator<net.time4j.engine.j0.a<? extends net.time4j.engine.v>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f94701a;

    private o0(boolean z11) {
        this.f94701a = z11;
    }

    static Comparator<net.time4j.engine.j0.a<? extends net.time4j.engine.v>> a() {
        return new o0(false);
    }

    static int b(net.time4j.engine.v vVar, net.time4j.engine.v vVar2) {
        int iCompare = Double.compare(vVar2.getLength(), vVar.getLength());
        if (iCompare != 0 || vVar.equals(vVar2)) {
            return iCompare;
        }
        throw new IllegalArgumentException("Mixing different units of same length not allowed.");
    }

    static o0<f> f() {
        return new o0<>(false);
    }

    static o0<h> h() {
        return new o0<>(false);
    }

    static o0<x> j() {
        return new o0<>(true);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(net.time4j.engine.j0.a<? extends net.time4j.engine.v> aVar, net.time4j.engine.j0.a<? extends net.time4j.engine.v> aVar2) {
        return b(aVar.b(), aVar2.b());
    }
}
