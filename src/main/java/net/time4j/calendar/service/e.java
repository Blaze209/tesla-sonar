package net.time4j.calendar.service;

import java.io.IOException;
import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.o;
import net.time4j.engine.q;
import net.time4j.engine.u;
import net.time4j.format.l;
import net.time4j.format.m;
import net.time4j.format.s;
import net.time4j.format.t;
import net.time4j.format.v;

/* JADX INFO: loaded from: classes9.dex */
public class e<V extends Enum<V>, T extends q<T>> extends d<V, T> implements l<V>, t<V> {
    private static final long serialVersionUID = -2452569351302286113L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Class<V> f94103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient String f94104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient u<T> f94105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient u<T> f94106g;

    public e(String str, Class<T> cls, Class<V> cls2, char c11) {
        super(str, cls, c11, y(c11));
        this.f94103d = cls2;
        this.f94104e = q(cls);
        this.f94105f = null;
        this.f94106g = null;
    }

    private static String q(Class<?> cls) {
        net.time4j.format.c cVar = (net.time4j.format.c) cls.getAnnotation(net.time4j.format.c.class);
        return cVar == null ? "iso8601" : cVar.value();
    }

    private static boolean y(char c11) {
        return c11 == 'E';
    }

    @Override // net.time4j.format.t
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public V parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        int index = parsePosition.getIndex();
        net.time4j.engine.c<m> cVar = net.time4j.format.a.f94177h;
        m mVar = m.FORMAT;
        m mVar2 = (m) dVar.b(cVar, mVar);
        V v11 = (V) p(dVar, mVar2, false).d(charSequence, parsePosition, getType(), dVar);
        if (v11 == null && w()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            v11 = (V) p(dVar, mVar2, true).d(charSequence, parsePosition, getType(), dVar);
        }
        if (v11 != null || !((Boolean) dVar.b(net.time4j.format.a.f94180k, Boolean.TRUE)).booleanValue()) {
            return v11;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        if (mVar2 == mVar) {
            mVar = m.STANDALONE;
        }
        V v12 = (V) p(dVar, mVar, false).d(charSequence, parsePosition, getType(), dVar);
        if (v12 != null || !w()) {
            return v12;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        return (V) p(dVar, mVar, true).d(charSequence, parsePosition, getType(), dVar);
    }

    @Override // net.time4j.format.l
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int d(V v11, o oVar, net.time4j.engine.d dVar) {
        return z(v11);
    }

    @Override // net.time4j.engine.p
    public Class<V> getType() {
        return this.f94103d;
    }

    @Override // net.time4j.format.l
    public boolean k(q<?> qVar, int i11) {
        for (V v11 : getType().getEnumConstants()) {
            if (z(v11) == i11) {
                qVar.B(this, v11);
                return true;
            }
        }
        return false;
    }

    protected s p(net.time4j.engine.d dVar, m mVar, boolean z11) {
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT);
        v vVar = (v) dVar.b(net.time4j.format.a.f94176g, v.WIDE);
        net.time4j.format.b bVarC = net.time4j.format.b.c(r(dVar), locale);
        if (w()) {
            return z11 ? bVarC.g(vVar, mVar) : bVarC.l(vVar, mVar);
        }
        if (x()) {
            return bVarC.p(vVar, mVar);
        }
        return v() ? bVarC.b(vVar) : bVarC.n(name(), this.f94103d, new String[0]);
    }

    @Override // net.time4j.format.t
    public void print(o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        appendable.append(p(dVar, (m) dVar.b(net.time4j.format.a.f94177h, m.FORMAT), u(oVar)).g((Enum) oVar.s(this)));
    }

    protected String r(net.time4j.engine.d dVar) {
        if (w() || v()) {
            return (String) dVar.b(net.time4j.format.a.f94171b, this.f94104e);
        }
        return x() ? "iso8601" : this.f94104e;
    }

    @Override // net.time4j.engine.p
    public V s() {
        V[] enumConstants = this.f94103d.getEnumConstants();
        return enumConstants[enumConstants.length - 1];
    }

    @Override // net.time4j.engine.p
    public V t() {
        return this.f94103d.getEnumConstants()[0];
    }

    protected boolean u(o oVar) {
        return false;
    }

    protected boolean v() {
        return getSymbol() == 'G';
    }

    protected boolean w() {
        return getSymbol() == 'M';
    }

    protected boolean x() {
        return y(getSymbol());
    }

    public int z(V v11) {
        return v11.ordinal() + 1;
    }
}
