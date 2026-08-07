package net.time4j.engine;

import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e<V extends Comparable<V>> implements p<V>, Serializable {
    private final int hash;
    private final int identity;
    private final String name;

    protected e(String str) {
        if (str.trim().isEmpty()) {
            throw new IllegalArgumentException("Element name is empty or contains only white space.");
        }
        this.name = str;
        int iHashCode = str.hashCode();
        this.hash = iHashCode;
        if (!n()) {
            iHashCode = -1;
        } else if (iHashCode == -1) {
            iHashCode = ~iHashCode;
        }
        this.identity = iHashCode;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(o oVar, o oVar2) {
        return ((Comparable) oVar.s(this)).compareTo(oVar2.s(this));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e<?> eVar = (e) obj;
            int i11 = this.identity;
            if (i11 == eVar.identity && (i11 != -1 || (name().equals(eVar.name()) && h(eVar)))) {
                return true;
            }
        }
        return false;
    }

    protected <T extends q<T>> y<T, V> f(w<T> wVar) {
        return null;
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return (char) 0;
    }

    protected boolean h(e<?> eVar) {
        return true;
    }

    public final int hashCode() {
        return this.hash;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    protected p<?> j() {
        return null;
    }

    protected String l(w<?> wVar) {
        if (!m() || !net.time4j.base.f.class.isAssignableFrom(wVar.p())) {
            return null;
        }
        return "Accessing the local element [" + this.name + "] from a global type requires a timezone.\n- Try to apply a zonal query like \"" + this.name + ".atUTC()\".\n- Or try to first convert the global type to a zonal timestamp: \"moment.toZonalTimestamp(...)\".\n- If used in formatting then consider \"ChronoFormatter.withTimezone(TZID)\".";
    }

    public boolean m() {
        return true;
    }

    protected boolean n() {
        return false;
    }

    @Override // net.time4j.engine.p
    public final String name() {
        return this.name;
    }

    public String toString() {
        String name = getClass().getName();
        StringBuilder sb2 = new StringBuilder(name.length() + 32);
        sb2.append(name);
        sb2.append('@');
        sb2.append(this.name);
        return sb2.toString();
    }
}
