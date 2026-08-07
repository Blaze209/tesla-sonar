package ru;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
import ou.p;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends g {

    private static final class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f109214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f109215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f109216c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i11) {
            p.k(i11, size());
            return Integer.valueOf(this.f109214a[this.f109215b + i11]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i11, Integer num) {
            p.k(i11, size());
            int[] iArr = this.f109214a;
            int i12 = this.f109215b;
            int i13 = iArr[i12 + i11];
            iArr[i12 + i11] = ((Integer) p.m(num)).intValue();
            return Integer.valueOf(i13);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && f.k(this.f109214a, ((Integer) obj).intValue(), this.f109215b, this.f109216c) != -1;
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Spliterator.OfInt spliterator() {
            return Spliterators.spliterator(this.f109214a, this.f109215b, this.f109216c, 0);
        }

        int[] e() {
            return Arrays.copyOfRange(this.f109214a, this.f109215b, this.f109216c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f109214a[this.f109215b + i11] != aVar.f109214a[aVar.f109215b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i11 = this.f109215b; i11 < this.f109216c; i11++) {
                iHashCode = (iHashCode * 31) + Integer.hashCode(this.f109214a[i11]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iK;
            if (!(obj instanceof Integer) || (iK = f.k(this.f109214a, ((Integer) obj).intValue(), this.f109215b, this.f109216c)) < 0) {
                return -1;
            }
            return iK - this.f109215b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iL;
            if (!(obj instanceof Integer) || (iL = f.l(this.f109214a, ((Integer) obj).intValue(), this.f109215b, this.f109216c)) < 0) {
                return -1;
            }
            return iL - this.f109215b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f109216c - this.f109215b;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i11, int i12) {
            p.q(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.f109214a;
            int i13 = this.f109215b;
            return new a(iArr, i11 + i13, i13 + i12);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f109214a[this.f109215b]);
            int i11 = this.f109215b;
            while (true) {
                i11++;
                if (i11 >= this.f109216c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f109214a[i11]);
            }
        }

        a(int[] iArr, int i11, int i12) {
            this.f109214a = iArr;
            this.f109215b = i11;
            this.f109216c = i12;
        }
    }

    public static List<Integer> c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(iArr);
    }

    private static int d(long j11) {
        int i11 = (int) j11;
        p.i(j11 == ((long) i11), "the total number of elements (%s) in the arrays must fit in an int", j11);
        return i11;
    }

    public static int e(long j11) {
        int i11 = (int) j11;
        p.i(((long) i11) == j11, "Out of range: %s", j11);
        return i11;
    }

    public static int[] f(int[]... iArr) {
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int[] iArr3 = new int[d(length)];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    public static int g(int i11, int i12, int i13) {
        p.h(i12 <= i13, "min (%s) must be less than or equal to max (%s)", i12, i13);
        return Math.min(Math.max(i11, i12), i13);
    }

    public static int h(byte[] bArr) {
        p.h(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return i(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int i(byte b11, byte b12, byte b13, byte b14) {
        return (b11 << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    public static int j(int[] iArr, int i11) {
        return k(iArr, i11, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int[] iArr, int i11, int i12, int i13) {
        while (i12 < i13) {
            if (iArr[i12] == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(int[] iArr, int i11, int i12, int i13) {
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            if (iArr[i14] == i11) {
                return i14;
            }
        }
        return -1;
    }

    public static int m(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j11 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }

    public static int[] n(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = ((Number) p.m(array[i11])).intValue();
        }
        return iArr;
    }

    public static Integer o(String str) {
        return p(str, 10);
    }

    public static Integer p(String str, int i11) {
        Long lE = h.e(str, i11);
        if (lE == null || lE.longValue() != lE.intValue()) {
            return null;
        }
        return Integer.valueOf(lE.intValue());
    }
}
