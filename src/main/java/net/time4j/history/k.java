package net.time4j.history;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.ChronoException;
import net.time4j.engine.q;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.format.s;
import net.time4j.format.t;
import net.time4j.format.v;
import net.time4j.g0;

/* JADX INFO: loaded from: classes9.dex */
final class k extends net.time4j.format.d<j> implements t<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Locale f94605b = new Locale("la");
    private static final long serialVersionUID = 5200533417265981438L;
    private final d history;

    private static class a<C extends q<C>> implements y<C, j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f94606a;

        a(d dVar) {
            this.f94606a = dVar;
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
        public j getMaximum(C c11) {
            j value = getValue(c11);
            return value == j.BC ? j.AD : value;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public j getMinimum(C c11) {
            j value = getValue(c11);
            return value == j.AD ? j.BC : value;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public j getValue(C c11) {
            try {
                return this.f94606a.e((g0) c11.s(g0.f94488o)).c();
            } catch (IllegalArgumentException e11) {
                throw new ChronoException(e11.getMessage(), e11);
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(C c11, j jVar) {
            if (jVar == null) {
                return false;
            }
            try {
                return this.f94606a.e((g0) c11.s(g0.f94488o)).c() == jVar;
            } catch (IllegalArgumentException unused) {
            }
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C withValue(C c11, j jVar, boolean z11) {
            if (jVar == null) {
                throw new IllegalArgumentException("Missing era value.");
            }
            if (this.f94606a.e((g0) c11.s(g0.f94488o)).c() == jVar) {
                return c11;
            }
            throw new IllegalArgumentException(jVar.name());
        }
    }

    k(d dVar) {
        super("ERA");
        this.history = dVar;
    }

    private s o(net.time4j.engine.d dVar) {
        net.time4j.engine.c<v> cVar = net.time4j.format.a.f94176g;
        v vVar = v.WIDE;
        v vVar2 = (v) dVar.b(cVar, vVar);
        net.time4j.engine.c<Boolean> cVar2 = ep0.a.f63120c;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) dVar.b(cVar2, bool)).booleanValue()) {
            return net.time4j.format.b.c("historic", f94605b).o(this, vVar2 == vVar ? "w" : "a");
        }
        net.time4j.format.b bVarD = net.time4j.format.b.d((Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT));
        if (((Boolean) dVar.b(ep0.a.f63119b, bool)).booleanValue()) {
            return bVarD.o(this, vVar2 == vVar ? "w" : "a", "alt");
        }
        return bVarD.b(vVar2);
    }

    private Object readResolve() {
        return this.history.i();
    }

    @Override // net.time4j.engine.e
    protected <T extends q<T>> y<T, j> f(w<T> wVar) {
        if (wVar.v(g0.f94488o)) {
            return new a(this.history);
        }
        return null;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return 'G';
    }

    @Override // net.time4j.engine.p
    public Class<j> getType() {
        return j.class;
    }

    @Override // net.time4j.engine.e
    protected boolean h(net.time4j.engine.e<?> eVar) {
        return this.history.equals(((k) eVar).history);
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
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public j s() {
        return j.AD;
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        appendable.append(o(dVar).g((Enum) oVar.s(this)));
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public j t() {
        return j.BC;
    }

    @Override // net.time4j.format.t
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return (j) o(dVar).d(charSequence, parsePosition, getType(), dVar);
    }
}
