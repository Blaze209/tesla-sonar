package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class x extends c<Integer> implements y.d, RandomAccess, y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x f8234d = new x(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f8235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8236c;

    x() {
        this(new int[10], 0, true);
    }

    private void e(int i11, int i12) {
        int i13;
        a();
        if (i11 < 0 || i11 > (i13 = this.f8236c)) {
            throw new IndexOutOfBoundsException(h(i11));
        }
        int[] iArr = this.f8235b;
        if (i13 < iArr.length) {
            System.arraycopy(iArr, i11, iArr, i11 + 1, i13 - i11);
        } else {
            int[] iArr2 = new int[((i13 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.f8235b, i11, iArr2, i11 + 1, this.f8236c - i11);
            this.f8235b = iArr2;
        }
        this.f8235b[i11] = i12;
        this.f8236c++;
        ((AbstractList) this).modCount++;
    }

    private void f(int i11) {
        if (i11 < 0 || i11 >= this.f8236c) {
            throw new IndexOutOfBoundsException(h(i11));
        }
    }

    private String h(int i11) {
        return "Index:" + i11 + ", Size:" + this.f8236c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i11 = xVar.f8236c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f8236c;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.f8235b;
        if (i13 > iArr.length) {
            this.f8235b = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(xVar.f8235b, 0, this.f8235b, this.f8236c, xVar.f8236c);
        this.f8236c = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addInt(int i11) {
        a();
        int i12 = this.f8236c;
        int[] iArr = this.f8235b;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f8235b = iArr2;
        }
        int[] iArr3 = this.f8235b;
        int i13 = this.f8236c;
        this.f8236c = i13 + 1;
        iArr3[i13] = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i11, Integer num) {
        e(i11, num.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f8236c != xVar.f8236c) {
            return false;
        }
        int[] iArr = xVar.f8235b;
        for (int i11 = 0; i11 < this.f8236c; i11++) {
            if (this.f8235b[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer get(int i11) {
        return Integer.valueOf(getInt(i11));
    }

    public int getInt(int i11) {
        f(i11);
        return this.f8235b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f8236c; i12++) {
            i11 = (i11 * 31) + this.f8235b[i12];
        }
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.y.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y.d mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f8236c) {
            return new x(Arrays.copyOf(this.f8235b, i11), this.f8236c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f8235b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i11) {
        a();
        f(i11);
        int[] iArr = this.f8235b;
        int i12 = iArr[i11];
        int i13 = this.f8236c;
        if (i11 < i13 - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (i13 - i11) - 1);
        }
        this.f8236c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer set(int i11, Integer num) {
        return Integer.valueOf(setInt(i11, num.intValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f8235b;
        System.arraycopy(iArr, i12, iArr, i11, this.f8236c - i12);
        this.f8236c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    public int setInt(int i11, int i12) {
        a();
        f(i11);
        int[] iArr = this.f8235b;
        int i13 = iArr[i11];
        iArr[i11] = i12;
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8236c;
    }

    private x(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.f8235b = iArr;
        this.f8236c = i11;
    }
}
