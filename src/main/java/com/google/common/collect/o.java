package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
final class o<T> extends r0<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<T> f43677a;

    o(Comparator<T> comparator) {
        this.f43677a = (Comparator) ou.p.m(comparator);
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    public int compare(T t11, T t12) {
        return this.f43677a.compare(t11, t12);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f43677a.equals(((o) obj).f43677a);
        }
        return false;
    }

    public int hashCode() {
        return this.f43677a.hashCode();
    }

    public String toString() {
        return this.f43677a.toString();
    }
}
