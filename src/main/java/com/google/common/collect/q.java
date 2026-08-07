package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
final class q<T> extends r0<T> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator<? super T>[] f43683a;

    q(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.f43683a = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    public int compare(T t11, T t12) {
        int i11 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f43683a;
            if (i11 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i11].compare(t11, t12);
            if (iCompare != 0) {
                return iCompare;
            }
            i11++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            return Arrays.equals(this.f43683a, ((q) obj).f43683a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f43683a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f43683a) + ")";
    }
}
