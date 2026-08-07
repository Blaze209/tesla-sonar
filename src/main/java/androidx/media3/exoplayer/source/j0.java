package androidx.media3.exoplayer.source;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
final class j0<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s7.n<V> f11051c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f11050b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11049a = -1;

    public j0(s7.n<V> nVar) {
        this.f11051c = nVar;
    }

    public void a(int i11, V v11) {
        if (this.f11049a == -1) {
            s7.a.h(this.f11050b.size() == 0);
            this.f11049a = 0;
        }
        if (this.f11050b.size() > 0) {
            SparseArray<V> sparseArray = this.f11050b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            s7.a.a(i11 >= iKeyAt);
            if (iKeyAt == i11) {
                s7.n<V> nVar = this.f11051c;
                SparseArray<V> sparseArray2 = this.f11050b;
                nVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f11050b.append(i11, v11);
    }

    public void b() {
        for (int i11 = 0; i11 < this.f11050b.size(); i11++) {
            this.f11051c.accept(this.f11050b.valueAt(i11));
        }
        this.f11049a = -1;
        this.f11050b.clear();
    }

    public void c(int i11) {
        for (int size = this.f11050b.size() - 1; size >= 0 && i11 < this.f11050b.keyAt(size); size--) {
            this.f11051c.accept(this.f11050b.valueAt(size));
            this.f11050b.removeAt(size);
        }
        this.f11049a = this.f11050b.size() > 0 ? Math.min(this.f11049a, this.f11050b.size() - 1) : -1;
    }

    public void d(int i11) {
        int i12 = 0;
        while (i12 < this.f11050b.size() - 1) {
            int i13 = i12 + 1;
            if (i11 < this.f11050b.keyAt(i13)) {
                return;
            }
            this.f11051c.accept(this.f11050b.valueAt(i12));
            this.f11050b.removeAt(i12);
            int i14 = this.f11049a;
            if (i14 > 0) {
                this.f11049a = i14 - 1;
            }
            i12 = i13;
        }
    }

    public V e(int i11) {
        if (this.f11049a == -1) {
            this.f11049a = 0;
        }
        while (true) {
            int i12 = this.f11049a;
            if (i12 <= 0 || i11 >= this.f11050b.keyAt(i12)) {
                break;
            }
            this.f11049a--;
        }
        while (this.f11049a < this.f11050b.size() - 1 && i11 >= this.f11050b.keyAt(this.f11049a + 1)) {
            this.f11049a++;
        }
        return this.f11050b.valueAt(this.f11049a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f11050b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f11050b.size() == 0;
    }
}
