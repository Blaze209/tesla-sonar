package net.time4j;

import java.lang.Comparable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
class j0<U extends Comparable<U>> implements net.time4j.engine.p<U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final net.time4j.engine.p<h> f94662d = new j0(h.class, h.HOURS, h.NANOS);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final net.time4j.engine.p<TimeUnit> f94663e = new j0(TimeUnit.class, TimeUnit.DAYS, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<U> f94664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient U f94665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient U f94666c;

    private j0(Class<U> cls, U u11, U u12) {
        this.f94664a = cls;
        this.f94665b = u11;
        this.f94666c = u12;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        Comparable comparable = (Comparable) oVar.s(this);
        Comparable comparable2 = (Comparable) oVar2.s(this);
        return this.f94664a == h.class ? comparable.compareTo(comparable2) : comparable2.compareTo(comparable);
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public U getDefaultMaximum() {
        return this.f94666c;
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public U getDefaultMinimum() {
        return this.f94665b;
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return (char) 0;
    }

    @Override // net.time4j.engine.p
    public Class<U> getType() {
        return this.f94664a;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public String name() {
        return "PRECISION";
    }
}
