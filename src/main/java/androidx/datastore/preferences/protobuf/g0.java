package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class g0 extends c<Long> implements y.e, RandomAccess, y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g0 f8069d = new g0(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f8070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8071c;

    g0() {
        this(new long[10], 0, true);
    }

    private void e(int i11, long j11) {
        int i12;
        a();
        if (i11 < 0 || i11 > (i12 = this.f8071c)) {
            throw new IndexOutOfBoundsException(h(i11));
        }
        long[] jArr = this.f8070b;
        if (i12 < jArr.length) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
        } else {
            long[] jArr2 = new long[((i12 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            System.arraycopy(this.f8070b, i11, jArr2, i11 + 1, this.f8071c - i11);
            this.f8070b = jArr2;
        }
        this.f8070b[i11] = j11;
        this.f8071c++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i11) {
        if (i11 < 0 || i11 >= this.f8071c) {
            throw new IndexOutOfBoundsException(h(i11));
        }
    }

    private String h(int i11) {
        return "Index:" + i11 + ", Size:" + this.f8071c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof g0)) {
            return super.addAll(collection);
        }
        g0 g0Var = (g0) collection;
        int i11 = g0Var.f8071c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f8071c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.f8070b;
        if (i13 > jArr.length) {
            this.f8070b = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(g0Var.f8070b, 0, this.f8070b, this.f8071c, g0Var.f8071c);
        this.f8071c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addLong(long j11) {
        a();
        int i11 = this.f8071c;
        long[] jArr = this.f8070b;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i11);
            this.f8070b = jArr2;
        }
        long[] jArr3 = this.f8070b;
        int i12 = this.f8071c;
        this.f8071c = i12 + 1;
        jArr3[i12] = j11;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i11, Long l11) {
        e(i11, l11.longValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l11) {
        addLong(l11.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return super.equals(obj);
        }
        g0 g0Var = (g0) obj;
        if (this.f8071c != g0Var.f8071c) {
            return false;
        }
        long[] jArr = g0Var.f8070b;
        for (int i11 = 0; i11 < this.f8071c; i11++) {
            if (this.f8070b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long get(int i11) {
        return Long.valueOf(getLong(i11));
    }

    public long getLong(int i11) {
        f(i11);
        return this.f8070b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i11 = 0; i11 < this.f8071c; i11++) {
            iF = (iF * 31) + y.f(this.f8070b[i11]);
        }
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.y.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y.e mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f8071c) {
            return new g0(Arrays.copyOf(this.f8070b, i11), this.f8071c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f8070b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Long remove(int i11) {
        a();
        f(i11);
        long[] jArr = this.f8070b;
        long j11 = jArr[i11];
        int i12 = this.f8071c;
        if (i11 < i12 - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (i12 - i11) - 1);
        }
        this.f8071c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long set(int i11, Long l11) {
        return Long.valueOf(setLong(i11, l11.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f8070b;
        System.arraycopy(jArr, i12, jArr, i11, this.f8071c - i12);
        this.f8071c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    public long setLong(int i11, long j11) {
        a();
        f(i11);
        long[] jArr = this.f8070b;
        long j12 = jArr[i11];
        jArr[i11] = j11;
        return j12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8071c;
    }

    private g0(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f8070b = jArr;
        this.f8071c = i11;
    }
}
