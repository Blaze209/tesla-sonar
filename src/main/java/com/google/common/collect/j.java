package com.google.common.collect;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class j<F, T> extends r0<F> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ou.h<F, ? extends T> f43640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r0<T> f43641b;

    j(ou.h<F, ? extends T> hVar, r0<T> r0Var) {
        this.f43640a = (ou.h) ou.p.m(hVar);
        this.f43641b = (r0) ou.p.m(r0Var);
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    public int compare(F f11, F f12) {
        return this.f43641b.compare(this.f43640a.apply(f11), this.f43640a.apply(f12));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f43640a.equals(jVar.f43640a) && this.f43641b.equals(jVar.f43641b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f43640a, this.f43641b);
    }

    public String toString() {
        return this.f43641b + ".onResultOf(" + this.f43640a + ")";
    }
}
