package net.time4j.calendar;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.engine.w;
import net.time4j.engine.y;
import net.time4j.format.t;
import net.time4j.format.v;
import net.time4j.g0;

/* JADX INFO: loaded from: classes9.dex */
public enum k implements net.time4j.engine.i {
    DANGI;

    private final transient net.time4j.engine.p<k> eraElement;
    private final transient net.time4j.engine.p<Integer> yearOfEraElement;

    private static class b extends net.time4j.format.d<k> implements t<k> {
        private static final long serialVersionUID = -5179188137244162427L;

        private Object readResolve() {
            return k.DANGI.era();
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.q<T>> y<T, k> f(w<T> wVar) {
            if (wVar.v(g0.f94488o)) {
                return new c();
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            return 'G';
        }

        @Override // net.time4j.engine.p
        public Class<k> getType() {
            return k.class;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected boolean n() {
            return true;
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public k s() {
            return k.DANGI;
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public k t() {
            return k.DANGI;
        }

        @Override // net.time4j.format.t
        public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
            appendable.append(k.DANGI.getDisplayName((Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT), (v) dVar.b(net.time4j.format.a.f94176g, v.WIDE)));
        }

        @Override // net.time4j.format.t
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public k parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            Locale locale = (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT);
            boolean zBooleanValue = ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue();
            boolean zBooleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f94179j, Boolean.FALSE)).booleanValue();
            v vVar = (v) dVar.b(net.time4j.format.a.f94176g, v.WIDE);
            int index = parsePosition.getIndex();
            k kVar = k.DANGI;
            String displayName = kVar.getDisplayName(locale, vVar);
            int iMax = Math.max(Math.min(displayName.length() + index, charSequence.length()), index);
            if (iMax > index) {
                String string = charSequence.subSequence(index, iMax).toString();
                if (zBooleanValue) {
                    displayName = displayName.toLowerCase(locale);
                    string = string.toLowerCase(locale);
                }
                if (displayName.equals(string) || (zBooleanValue2 && displayName.startsWith(string))) {
                    parsePosition.setIndex(iMax);
                    return kVar;
                }
            }
            parsePosition.setErrorIndex(index);
            return null;
        }

        private b() {
            super("ERA");
        }
    }

    private static class c implements y<net.time4j.engine.q<?>, k> {
        private c() {
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(net.time4j.engine.q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(net.time4j.engine.q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public k getMaximum(net.time4j.engine.q<?> qVar) {
            return k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public k getMinimum(net.time4j.engine.q<?> qVar) {
            return k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public k getValue(net.time4j.engine.q<?> qVar) {
            return k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean isValid(net.time4j.engine.q<?> qVar, k kVar) {
            return kVar == k.DANGI;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> withValue(net.time4j.engine.q<?> qVar, k kVar, boolean z11) {
            if (isValid(qVar, kVar)) {
                return qVar;
            }
            throw new IllegalArgumentException("Invalid Korean era: " + kVar);
        }
    }

    private static class d implements y<net.time4j.engine.q<?>, Integer> {
        private d() {
        }

        private int e(net.time4j.engine.q<?> qVar) {
            return ((g0) qVar.s(g0.f94488o)).b() + 2333;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtCeiling(net.time4j.engine.q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p<?> getChildAtFloor(net.time4j.engine.q<?> qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(net.time4j.engine.q<?> qVar) {
            return 1000002332;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(net.time4j.engine.q<?> qVar) {
            return -999997666;
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(net.time4j.engine.q<?> qVar) {
            return Integer.valueOf(e(qVar));
        }

        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean isValid(net.time4j.engine.q<?> qVar, Integer num) {
            if (num == null) {
                return false;
            }
            return num.intValue() >= getMinimum(qVar).intValue() && num.intValue() <= getMaximum(qVar).intValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.y
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> withValue(net.time4j.engine.q<?> qVar, Integer num, boolean z11) {
            if (num == null) {
                throw new IllegalArgumentException("Missing year of era.");
            }
            if (isValid(qVar, num)) {
                int iE = e(qVar);
                net.time4j.e eVar = g0.f94488o;
                return qVar.B(eVar, (g0) ((g0) qVar.s(eVar)).H(num.intValue() - iE, net.time4j.f.YEARS));
            }
            throw new IllegalArgumentException("Invalid year of era: " + num);
        }
    }

    private static class e extends net.time4j.format.d<Integer> {
        private static final long serialVersionUID = -7864513245908399367L;

        private Object readResolve() {
            return k.DANGI.yearOfEra();
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.q<T>> y<T, Integer> f(w<T> wVar) {
            if (wVar.v(g0.f94488o)) {
                return new d();
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.p
        public char getSymbol() {
            return 'y';
        }

        @Override // net.time4j.engine.p
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // net.time4j.engine.p
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.p
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected boolean n() {
            return true;
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Integer s() {
            return 5332;
        }

        @Override // net.time4j.engine.p
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Integer t() {
            return 3978;
        }

        private e() {
            super("YEAR_OF_ERA");
        }
    }

    k() {
        this.eraElement = new b();
        this.yearOfEraElement = new e();
    }

    net.time4j.engine.p<k> era() {
        return this.eraElement;
    }

    public String getDisplayName(Locale locale) {
        return getDisplayName(locale, v.WIDE);
    }

    net.time4j.engine.p<Integer> yearOfEra() {
        return this.yearOfEraElement;
    }

    public String getDisplayName(Locale locale, v vVar) {
        return net.time4j.format.b.c("dangi", locale).b(vVar).g(this);
    }
}
