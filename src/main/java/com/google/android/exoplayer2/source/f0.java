package com.google.android.exoplayer2.source;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class f0<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ts.h<V> f40451c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f40450b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40449a = -1;

    public f0(ts.h<V> hVar) {
        this.f40451c = hVar;
    }

    public void a(int i11, V v11) {
        if (this.f40449a == -1) {
            ts.a.g(this.f40450b.size() == 0);
            this.f40449a = 0;
        }
        if (this.f40450b.size() > 0) {
            SparseArray<V> sparseArray = this.f40450b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            ts.a.a(i11 >= iKeyAt);
            if (iKeyAt == i11) {
                ts.h<V> hVar = this.f40451c;
                SparseArray<V> sparseArray2 = this.f40450b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f40450b.append(i11, v11);
    }

    public void b() {
        for (int i11 = 0; i11 < this.f40450b.size(); i11++) {
            this.f40451c.accept(this.f40450b.valueAt(i11));
        }
        this.f40449a = -1;
        this.f40450b.clear();
    }

    public void c(int i11) {
        for (int size = this.f40450b.size() - 1; size >= 0 && i11 < this.f40450b.keyAt(size); size--) {
            this.f40451c.accept(this.f40450b.valueAt(size));
            this.f40450b.removeAt(size);
        }
        this.f40449a = this.f40450b.size() > 0 ? Math.min(this.f40449a, this.f40450b.size() - 1) : -1;
    }

    public void d(int i11) {
        int i12 = 0;
        while (i12 < this.f40450b.size() - 1) {
            int i13 = i12 + 1;
            if (i11 < this.f40450b.keyAt(i13)) {
                return;
            }
            this.f40451c.accept(this.f40450b.valueAt(i12));
            this.f40450b.removeAt(i12);
            int i14 = this.f40449a;
            if (i14 > 0) {
                this.f40449a = i14 - 1;
            }
            i12 = i13;
        }
    }

    public V e(int i11) {
        if (this.f40449a == -1) {
            this.f40449a = 0;
        }
        while (true) {
            int i12 = this.f40449a;
            if (i12 <= 0 || i11 >= this.f40450b.keyAt(i12)) {
                break;
            }
            this.f40449a--;
        }
        while (this.f40449a < this.f40450b.size() - 1 && i11 >= this.f40450b.keyAt(this.f40449a + 1)) {
            this.f40449a++;
        }
        return this.f40450b.valueAt(this.f40449a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f40450b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f40450b.size() == 0;
    }
}
