package net.time4j;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
final class q<V extends Enum<V>> extends a<V> implements d0<V>, net.time4j.format.l<V>, dp0.e<V> {
    private static final long serialVersionUID = 2055272540517425102L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Class<V> f94710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient V f94711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient V f94712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f94713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient char f94714h;

    q(String str, Class<V> cls, V v11, V v12, int i11, char c11) {
        super(str);
        this.f94710d = cls;
        this.f94711e = v11;
        this.f94712f = v12;
        this.f94713g = i11;
        this.f94714h = c11;
    }

    private net.time4j.format.s p(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        switch (this.f94713g) {
            case 101:
                return net.time4j.format.b.d(locale).l(vVar, mVar);
            case 102:
                return net.time4j.format.b.d(locale).p(vVar, mVar);
            case 103:
                return net.time4j.format.b.d(locale).k(vVar, mVar);
            default:
                throw new UnsupportedOperationException(name());
        }
    }

    private Object readResolve() throws InvalidObjectException {
        Object objF0 = g0.F0(name());
        if (objF0 != null) {
            return objF0;
        }
        throw new InvalidObjectException(name());
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f94714h;
    }

    @Override // net.time4j.engine.p
    public Class<V> getType() {
        return this.f94710d;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.format.l
    public boolean k(net.time4j.engine.q<?> qVar, int i11) {
        for (V v11 : getType().getEnumConstants()) {
            if (t(v11) == i11) {
                qVar.B(this, v11);
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.engine.e
    protected boolean n() {
        return true;
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        appendable.append(p((Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT), (net.time4j.format.v) dVar.b(net.time4j.format.a.f94176g, net.time4j.format.v.WIDE), (net.time4j.format.m) dVar.b(net.time4j.format.a.f94177h, net.time4j.format.m.FORMAT)).g((Enum) oVar.s(this)));
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public V s() {
        return this.f94712f;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public V t() {
        return this.f94711e;
    }

    int s() {
        return this.f94713g;
    }

    public int t(V v11) {
        return v11.ordinal() + 1;
    }

    @Override // dp0.e
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public V parse(CharSequence charSequence, ParsePosition parsePosition, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar, net.time4j.format.g gVar) {
        int index = parsePosition.getIndex();
        V v11 = (V) p(locale, vVar, mVar).e(charSequence, parsePosition, getType(), gVar);
        if (v11 != null || gVar.isStrict()) {
            return v11;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        net.time4j.format.m mVar2 = net.time4j.format.m.FORMAT;
        if (mVar == mVar2) {
            mVar2 = net.time4j.format.m.STANDALONE;
        }
        return (V) p(locale, vVar, mVar2).e(charSequence, parsePosition, getType(), gVar);
    }

    @Override // net.time4j.format.t
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public V parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        int index = parsePosition.getIndex();
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT);
        net.time4j.format.v vVar = (net.time4j.format.v) dVar.b(net.time4j.format.a.f94176g, net.time4j.format.v.WIDE);
        net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f94177h;
        net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
        net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
        V v11 = (V) p(locale, vVar, mVar2).d(charSequence, parsePosition, getType(), dVar);
        if (v11 != null || !((Boolean) dVar.b(net.time4j.format.a.f94180k, Boolean.TRUE)).booleanValue()) {
            return v11;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        if (mVar2 == mVar) {
            mVar = net.time4j.format.m.STANDALONE;
        }
        return (V) p(locale, vVar, mVar).d(charSequence, parsePosition, getType(), dVar);
    }

    @Override // net.time4j.format.l
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int d(V v11, net.time4j.engine.o oVar, net.time4j.engine.d dVar) {
        return v11.ordinal() + 1;
    }

    @Override // dp0.e
    public void print(net.time4j.engine.o oVar, Appendable appendable, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) throws IOException {
        appendable.append(p(locale, vVar, mVar).g((Enum) oVar.s(this)));
    }
}
