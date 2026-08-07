package net.time4j.format.expert;

import java.io.IOException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class o<V> implements h<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.p<V> f94387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<V, String> f94388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f94390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Locale f94391e;

    o(net.time4j.engine.p<V> pVar, Map<V, String> map) {
        Map map2;
        Class<V> type = pVar.getType();
        if (!type.isEnum()) {
            map2 = new HashMap(map.size());
        } else {
            if (map.size() < type.getEnumConstants().length) {
                throw new IllegalArgumentException("Not enough text resources defined for enum: " + type.getName());
            }
            map2 = a(type);
        }
        map2.putAll(map);
        this.f94387a = pVar;
        this.f94388b = Collections.unmodifiableMap(map2);
        this.f94389c = 0;
        this.f94390d = true;
        this.f94391e = Locale.getDefault();
    }

    private static <V, K extends Enum<K>> Map<V, String> a(Class<V> cls) {
        return new EnumMap(cls);
    }

    private String b(V v11) {
        String str = this.f94388b.get(v11);
        return str == null ? v11.toString() : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int c(net.time4j.engine.o oVar, Appendable appendable) throws IOException {
        String strB = b(oVar.s(this.f94387a));
        appendable.append(strB);
        return strB.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f94387a.equals(oVar.f94387a) && this.f94388b.equals(oVar.f94388b)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<V> getElement() {
        return this.f94387a;
    }

    public int hashCode() {
        return (this.f94387a.hashCode() * 7) + (this.f94388b.hashCode() * 31);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        int iF = sVar.f();
        int length = charSequence.length();
        int iIntValue = z11 ? this.f94389c : ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue();
        if (iIntValue > 0) {
            length -= iIntValue;
        }
        if (iF >= length) {
            sVar.k(iF, "Missing chars for: " + this.f94387a.name());
            sVar.n();
            return;
        }
        boolean zBooleanValue = z11 ? this.f94390d : ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue();
        Locale locale = z11 ? this.f94391e : (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.getDefault());
        int i11 = length - iF;
        for (V v11 : this.f94388b.keySet()) {
            String strB = b(v11);
            if (zBooleanValue) {
                String upperCase = strB.toUpperCase(locale);
                int length2 = strB.length();
                if (length2 <= i11) {
                    int i12 = length2 + iF;
                    if (upperCase.equals(charSequence.subSequence(iF, i12).toString().toUpperCase(locale))) {
                        tVar.F(this.f94387a, v11);
                        sVar.l(i12);
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                int length3 = strB.length();
                if (length3 <= i11) {
                    int i13 = length3 + iF;
                    if (strB.equals(charSequence.subSequence(iF, i13).toString())) {
                        tVar.F(this.f94387a, v11);
                        sVar.l(i13);
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        sVar.k(iF, "Element value could not be parsed: " + this.f94387a.name());
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        if (!(appendable instanceof CharSequence)) {
            return c(oVar, appendable);
        }
        CharSequence charSequence = (CharSequence) appendable;
        int length = charSequence.length();
        int iC = c(oVar, appendable);
        if (set != null) {
            set.add(new g(this.f94387a, length, charSequence.length()));
        }
        return iC;
    }

    @Override // net.time4j.format.expert.h
    public h<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new o(this.f94387a, this.f94388b, ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue(), ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue(), (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.getDefault()));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(512);
        sb2.append(o.class.getName());
        sb2.append("[element=");
        sb2.append(this.f94387a.name());
        sb2.append(", resources=");
        sb2.append(this.f94388b);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<V> withElement(net.time4j.engine.p<V> pVar) {
        return this.f94387a == pVar ? this : new o(pVar, this.f94388b);
    }

    private o(net.time4j.engine.p<V> pVar, Map<V, String> map, int i11, boolean z11, Locale locale) {
        this.f94387a = pVar;
        this.f94388b = map;
        this.f94389c = i11;
        this.f94390d = z11;
        this.f94391e = locale;
    }
}
