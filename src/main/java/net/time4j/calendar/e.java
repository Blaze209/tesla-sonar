package net.time4j.calendar;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.format.t;

/* JADX INFO: loaded from: classes9.dex */
class e implements t<c>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e f94048a = new e();
    private static final long serialVersionUID = -4211396220263977858L;

    e() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        return ((c) oVar.s(this)).compareTo((o) oVar2.s(this));
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c getDefaultMaximum() {
        return c.n(60);
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c getDefaultMinimum() {
        return c.n(1);
    }

    @Override // net.time4j.format.t
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        return c.o(charSequence, parsePosition, (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT), !((net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART)).isStrict());
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return 'U';
    }

    @Override // net.time4j.engine.p
    public Class<c> getType() {
        return c.class;
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
    public String name() {
        return "CYCLIC_YEAR";
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        appendable.append(((c) oVar.s(this)).g((Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT)));
    }

    protected Object readResolve() {
        return f94048a;
    }
}
