package net.time4j.history;

import net.time4j.engine.ChronoException;
import net.time4j.engine.q;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.g0;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes9.dex */
final class i extends net.time4j.engine.e<h> {
    private static final long serialVersionUID = -5386613740709845550L;
    private final d history;

    private static class a<C extends q<C>> implements y<C, h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f94603a;

        a(d dVar) {
            this.f94603a = dVar;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(C c11) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public h getMaximum(C c11) {
            d dVar = this.f94603a;
            if (dVar == d.f94565s) {
                return h.g(j.BYZANTINE, 999984973, 8, 31);
            }
            if (dVar == d.f94564r) {
                return h.g(j.AD, 999979465, 12, 31);
            }
            return dVar == d.f94563q ? h.g(j.AD, 999999999, 12, 31) : h.g(j.AD, 9999, 12, 31);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public h getMinimum(C c11) {
            d dVar = this.f94603a;
            if (dVar == d.f94565s) {
                return h.g(j.BYZANTINE, 0, 9, 1);
            }
            if (dVar == d.f94564r) {
                return h.g(j.BC, 999979466, 1, 1);
            }
            return dVar == d.f94563q ? h.g(j.BC, Http2Connection.DEGRADED_PONG_TIMEOUT_NS, 1, 1) : h.g(j.BC, 45, 1, 1);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public h getValue(C c11) {
            try {
                return this.f94603a.e((g0) c11.s(g0.f94488o));
            } catch (IllegalArgumentException e11) {
                throw new ChronoException(e11.getMessage(), e11);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(C c11, h hVar) {
            return this.f94603a.B(hVar);
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C withValue(C c11, h hVar, boolean z11) {
            if (hVar == null) {
                throw new IllegalArgumentException("Missing historic date.");
            }
            return (C) c11.B(g0.f94488o, this.f94603a.d(hVar));
        }
    }

    i(d dVar) {
        super("HISTORIC_DATE");
        this.history = dVar;
    }

    private Object readResolve() {
        return this.history.f();
    }

    @Override // net.time4j.engine.e
    protected <T extends q<T>> y<T, h> f(w<T> wVar) {
        if (wVar.v(g0.f94488o)) {
            return new a(this.history);
        }
        return null;
    }

    @Override // net.time4j.engine.p
    public Class<h> getType() {
        return h.class;
    }

    @Override // net.time4j.engine.e
    protected boolean h(net.time4j.engine.e<?> eVar) {
        return this.history.equals(((i) eVar).history);
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public h s() {
        return h.g(j.AD, 9999, 12, 31);
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public h t() {
        return h.g(j.BC, 45, 1, 1);
    }
}
