package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
final class y0<T> extends r0<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r0<? super T> f43725a;

    y0(r0<? super T> r0Var) {
        this.f43725a = (r0) ou.p.m(r0Var);
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    public int compare(T t11, T t12) {
        return this.f43725a.compare(t12, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            return this.f43725a.equals(((y0) obj).f43725a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f43725a.hashCode();
    }

    @Override // com.google.common.collect.r0
    public <S extends T> r0<S> l() {
        return this.f43725a;
    }

    public String toString() {
        return this.f43725a + ".reverse()";
    }
}
