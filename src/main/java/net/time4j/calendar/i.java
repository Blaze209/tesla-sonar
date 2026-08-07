package net.time4j.calendar;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.calendar.f;
import net.time4j.engine.y;
import net.time4j.format.t;

/* JADX INFO: loaded from: classes9.dex */
class i<D extends f<?, D>> implements t<p>, y<D, p>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i f94065a = new i();
    private static final long serialVersionUID = 4572549754637955194L;

    i() {
    }

    static <D extends f<?, D>> i<D> m() {
        return f94065a;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        return ((p) oVar.s(this)).compareTo((Enum) oVar2.s(this));
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.p<?> getChildAtCeiling(D d11) {
        throw new AbstractMethodError();
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.p
    public Class<p> getType() {
        return p.class;
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public net.time4j.engine.p<?> getChildAtFloor(D d11) {
        throw new AbstractMethodError();
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p s() {
        return p.MAJOR_12_DAHAN_300;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public p t() {
        return p.MINOR_01_LICHUN_315;
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public p getMaximum(D d11) {
        d dVarS = d11.S();
        return p.of(dVarS.m(dVarS.p(d11.T(), d11.e0().getNumber()) + ((long) d11.lengthOfYear())));
    }

    @Override // net.time4j.engine.p
    public String name() {
        return "SOLAR_TERM";
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public p getMinimum(D d11) {
        d dVarS = d11.S();
        return p.of(dVarS.m(dVarS.p(d11.T(), d11.e0().getNumber()) + 1));
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public p getValue(D d11) {
        return p.of(d11.S().m(d11.h() + 1));
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        appendable.append(((p) oVar.s(this)).getDisplayName((Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT)));
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean isValid(D d11, p pVar) {
        return pVar != null;
    }

    @Override // net.time4j.format.t
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public p parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT);
        int length = charSequence.length();
        if (parsePosition.getIndex() < length) {
            return p.parse(charSequence, locale, parsePosition);
        }
        parsePosition.setErrorIndex(length);
        return null;
    }

    protected Object readResolve() {
        return f94065a;
    }

    @Override // net.time4j.engine.y
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public D withValue(D d11, p pVar, boolean z11) {
        if (pVar != null) {
            return (D) d11.C(pVar.sinceNewYear());
        }
        throw new IllegalArgumentException("Missing solar term.");
    }
}
