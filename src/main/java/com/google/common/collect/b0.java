package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b0<E> extends w<E> implements Set<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient x<E> f43524b;

    public static class a<E> extends w.a<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object[] f43525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f43526e;

        public a() {
            super(4);
        }

        private void k(E e11) {
            Objects.requireNonNull(this.f43525d);
            int length = this.f43525d.length - 1;
            int iHashCode = e11.hashCode();
            int iB = u.b(iHashCode);
            while (true) {
                int i11 = iB & length;
                Object[] objArr = this.f43525d;
                Object obj = objArr[i11];
                if (obj == null) {
                    objArr[i11] = e11;
                    this.f43526e += iHashCode;
                    super.d(e11);
                    return;
                } else if (obj.equals(e11)) {
                    return;
                } else {
                    iB = i11 + 1;
                }
            }
        }

        @Override // com.google.common.collect.w.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e11) {
            ou.p.m(e11);
            if (this.f43525d != null && b0.k(this.f43710b) <= this.f43525d.length) {
                k(e11);
                return this;
            }
            this.f43525d = null;
            super.d(e11);
            return this;
        }

        public a<E> i(E... eArr) {
            if (this.f43525d == null) {
                super.e(eArr);
                return this;
            }
            for (E e11 : eArr) {
                a(e11);
            }
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            ou.p.m(iterable);
            if (this.f43525d == null) {
                super.b(iterable);
                return this;
            }
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public b0<E> l() {
            b0<E> b0VarL;
            int i11 = this.f43710b;
            if (i11 == 0) {
                return b0.q();
            }
            if (i11 == 1) {
                Object obj = this.f43709a[0];
                Objects.requireNonNull(obj);
                return b0.r(obj);
            }
            if (this.f43525d == null || b0.k(i11) != this.f43525d.length) {
                b0VarL = b0.l(this.f43710b, this.f43709a);
                this.f43710b = b0VarL.size();
            } else {
                Object[] objArrCopyOf = b0.w(this.f43710b, this.f43709a.length) ? Arrays.copyOf(this.f43709a, this.f43710b) : this.f43709a;
                int i12 = this.f43526e;
                Object[] objArr = this.f43525d;
                b0VarL = new w0<>(objArrCopyOf, i12, objArr, objArr.length - 1, this.f43710b);
            }
            this.f43711c = true;
            this.f43525d = null;
            return b0VarL;
        }
    }

    b0() {
    }

    static int k(int i11) {
        int iMax = Math.max(i11, 2);
        if (iMax >= 751619276) {
            ou.p.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> b0<E> l(int i11, Object... objArr) {
        if (i11 == 0) {
            return q();
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return r(obj);
        }
        int iK = k(i11);
        Object[] objArr2 = new Object[iK];
        int i12 = iK - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            Object objA = q0.a(objArr[i15], i15);
            int iHashCode = objA.hashCode();
            int iB = u.b(iHashCode);
            while (true) {
                int i16 = iB & i12;
                Object obj2 = objArr2[i16];
                if (obj2 == null) {
                    objArr[i14] = objA;
                    objArr2[i16] = objA;
                    i13 += iHashCode;
                    i14++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i14, i11, (Object) null);
        if (i14 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new a1(obj3);
        }
        if (k(i14) < iK / 2) {
            return l(i14, objArr);
        }
        if (w(i14, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new w0(objArr, i13, objArr2, i12, i14);
    }

    public static <E> b0<E> m(Collection<? extends E> collection) {
        if ((collection instanceof b0) && !(collection instanceof SortedSet)) {
            b0<E> b0Var = (b0) collection;
            if (!b0Var.g()) {
                return b0Var;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static <E> b0<E> n(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            return length != 1 ? l(eArr.length, (Object[]) eArr.clone()) : r(eArr[0]);
        }
        return q();
    }

    public static <E> b0<E> q() {
        return w0.f43713i;
    }

    public static <E> b0<E> r(E e11) {
        return new a1(e11);
    }

    public static <E> b0<E> s(E e11, E e12) {
        return l(2, e11, e12);
    }

    public static <E> b0<E> t(E e11, E e12, E e13) {
        return l(3, e11, e12, e13);
    }

    public static <E> b0<E> u(E e11, E e12, E e13, E e14, E e15) {
        return l(5, e11, e12, e13, e14, e15);
    }

    @SafeVarargs
    public static <E> b0<E> v(E e11, E e12, E e13, E e14, E e15, E e16, E... eArr) {
        ou.p.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e11;
        objArr[1] = e12;
        objArr[2] = e13;
        objArr[3] = e14;
        objArr[4] = e15;
        objArr[5] = e16;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return l(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(int i11, int i12) {
        return i11 < (i12 >> 1) + (i12 >> 2);
    }

    @Override // com.google.common.collect.w
    public x<E> a() {
        x<E> xVar = this.f43524b;
        if (xVar != null) {
            return xVar;
        }
        x<E> xVarO = o();
        this.f43524b = xVarO;
        return xVarO;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof b0) && p() && ((b0) obj).p() && hashCode() != obj.hashCode()) {
            return false;
        }
        return z0.a(this, obj);
    }

    @Override // com.google.common.collect.w
    /* JADX INFO: renamed from: h */
    public abstract d1<E> iterator();

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return z0.d(this);
    }

    x<E> o() {
        return x.i(toArray());
    }

    boolean p() {
        return false;
    }
}
