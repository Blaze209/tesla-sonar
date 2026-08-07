package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class b1<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b1<Object> f8044d = new b1<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E[] f8045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8046c;

    private b1(E[] eArr, int i11, boolean z11) {
        super(z11);
        this.f8045b = eArr;
        this.f8046c = i11;
    }

    private static <E> E[] b(int i11) {
        return (E[]) new Object[i11];
    }

    public static <E> b1<E> d() {
        return (b1<E>) f8044d;
    }

    private void e(int i11) {
        if (i11 < 0 || i11 >= this.f8046c) {
            throw new IndexOutOfBoundsException(f(i11));
        }
    }

    private String f(int i11) {
        return "Index:" + i11 + ", Size:" + this.f8046c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        a();
        int i11 = this.f8046c;
        E[] eArr = this.f8045b;
        if (i11 == eArr.length) {
            this.f8045b = (E[]) Arrays.copyOf(eArr, ((i11 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f8045b;
        int i12 = this.f8046c;
        this.f8046c = i12 + 1;
        eArr2[i12] = e11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.y.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b1<E> mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f8046c) {
            return new b1<>(Arrays.copyOf(this.f8045b, i11), this.f8046c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        e(i11);
        return this.f8045b[i11];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i11) {
        a();
        e(i11);
        E[] eArr = this.f8045b;
        E e11 = eArr[i11];
        int i12 = this.f8046c;
        if (i11 < i12 - 1) {
            System.arraycopy(eArr, i11 + 1, eArr, i11, (i12 - i11) - 1);
        }
        this.f8046c--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        a();
        e(i11);
        E[] eArr = this.f8045b;
        E e12 = eArr[i11];
        eArr[i11] = e11;
        ((AbstractList) this).modCount++;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8046c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        int i12;
        a();
        if (i11 >= 0 && i11 <= (i12 = this.f8046c)) {
            E[] eArr = this.f8045b;
            if (i12 < eArr.length) {
                System.arraycopy(eArr, i11, eArr, i11 + 1, i12 - i11);
            } else {
                E[] eArr2 = (E[]) b(((i12 * 3) / 2) + 1);
                System.arraycopy(this.f8045b, 0, eArr2, 0, i11);
                System.arraycopy(this.f8045b, i11, eArr2, i11 + 1, this.f8046c - i11);
                this.f8045b = eArr2;
            }
            this.f8045b[i11] = e11;
            this.f8046c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i11));
    }
}
