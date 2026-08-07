package net.time4j.calendar.service;

import java.io.InvalidObjectException;
import java.lang.Comparable;
import net.time4j.engine.p;
import net.time4j.engine.q;
import net.time4j.engine.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d<V extends Comparable<V>, T extends q<T>> extends net.time4j.format.d<V> implements net.time4j.calendar.q<V, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient char f94101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient boolean f94102c;
    private final Class<T> chrono;

    public d(String str, Class<T> cls, char c11, boolean z11) {
        super(str);
        this.chrono = cls;
        this.f94101b = c11;
        this.f94102c = z11;
    }

    @Override // net.time4j.engine.e, net.time4j.engine.p
    public char getSymbol() {
        return this.f94101b;
    }

    @Override // net.time4j.engine.e
    protected boolean h(net.time4j.engine.e<?> eVar) {
        return this.chrono == ((d) eVar).chrono;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    protected Class<T> o() {
        return this.chrono;
    }

    protected Object readResolve() throws InvalidObjectException {
        String strName = name();
        for (p<?> pVar : w.x(this.chrono).t()) {
            if (pVar.name().equals(strName)) {
                return pVar;
            }
        }
        throw new InvalidObjectException(strName);
    }
}
