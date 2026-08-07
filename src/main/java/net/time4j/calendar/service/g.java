package net.time4j.calendar.service;

import net.time4j.engine.o;
import net.time4j.engine.q;
import net.time4j.x0;
import net.time4j.z0;

/* JADX INFO: loaded from: classes9.dex */
public class g<T extends q<T>> extends e<x0, T> {
    private static final long serialVersionUID = -84764920511581480L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient z0 f94111h;

    public g(Class<T> cls, z0 z0Var) {
        super("DAY_OF_WEEK", cls, x0.class, 'E');
        this.f94111h = z0Var;
    }

    @Override // net.time4j.calendar.service.e
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public x0 s() {
        return this.f94111h.f().roll(6);
    }

    @Override // net.time4j.calendar.service.e
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public x0 t() {
        return this.f94111h.f();
    }

    @Override // net.time4j.calendar.service.e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public int z(x0 x0Var) {
        return x0Var.getValue(this.f94111h);
    }

    @Override // net.time4j.engine.e, java.util.Comparator
    /* JADX INFO: renamed from: c */
    public int compare(o oVar, o oVar2) {
        int value = ((x0) oVar.s(this)).getValue(this.f94111h);
        int value2 = ((x0) oVar2.s(this)).getValue(this.f94111h);
        if (value < value2) {
            return -1;
        }
        return value == value2 ? 0 : 1;
    }
}
