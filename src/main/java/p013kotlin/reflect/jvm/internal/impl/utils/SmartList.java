package p013kotlin.reflect.jvm.internal.impl.utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes9.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f89102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f89103b;

    private static class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f89104a = new b();

        private b() {
        }

        public static <T> b<T> a() {
            return f89104a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    private class c extends d<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f89105b;

        public c() {
            super();
            this.f89105b = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.d
        protected void a() {
            if (((AbstractList) SmartList.this).modCount == this.f89105b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) SmartList.this).modCount + "; expected: " + this.f89105b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.d
        protected E b() {
            return (E) SmartList.this.f89103b;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            SmartList.this.clear();
        }
    }

    private static abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f89107a;

        private d() {
        }

        protected abstract void a();

        protected abstract T b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f89107a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f89107a) {
                throw new NoSuchElementException();
            }
            this.f89107a = true;
            a();
            return b();
        }
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i11 == 2 || i11 == 3) {
            objArr[1] = "iterator";
        } else if (i11 == 5 || i11 == 6 || i11 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        int i11 = this.f89102a;
        if (i11 == 0) {
            this.f89103b = e11;
        } else if (i11 == 1) {
            this.f89103b = new Object[]{this.f89103b, e11};
        } else {
            Object[] objArr = (Object[]) this.f89103b;
            int length = objArr.length;
            if (i11 >= length) {
                int i12 = ((length * 3) / 2) + 1;
                int i13 = i11 + 1;
                if (i12 < i13) {
                    i12 = i13;
                }
                Object[] objArr2 = new Object[i12];
                this.f89103b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f89102a] = e11;
        }
        this.f89102a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f89103b = null;
        this.f89102a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        int i12;
        if (i11 >= 0 && i11 < (i12 = this.f89102a)) {
            return i12 == 1 ? (E) this.f89103b : (E) ((Object[]) this.f89103b)[i11];
        }
        throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f89102a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i11 = this.f89102a;
        if (i11 == 0) {
            b bVarA = b.a();
            if (bVarA == null) {
                a(2);
            }
            return bVarA;
        }
        if (i11 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            a(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i11) {
        int i12;
        E e11;
        if (i11 < 0 || i11 >= (i12 = this.f89102a)) {
            throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f89102a);
        }
        if (i12 == 1) {
            e11 = (E) this.f89103b;
            this.f89103b = null;
        } else {
            Object[] objArr = (Object[]) this.f89103b;
            Object obj = objArr[i11];
            if (i12 == 2) {
                this.f89103b = objArr[1 - i11];
            } else {
                int i13 = (i12 - i11) - 1;
                if (i13 > 0) {
                    System.arraycopy(objArr, i11 + 1, objArr, i11, i13);
                }
                objArr[this.f89102a - 1] = null;
            }
            e11 = (E) obj;
        }
        this.f89102a--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f89102a)) {
            throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f89102a);
        }
        if (i12 == 1) {
            E e12 = (E) this.f89103b;
            this.f89103b = e11;
            return e12;
        }
        Object[] objArr = (Object[]) this.f89103b;
        E e13 = (E) objArr[i11];
        objArr[i11] = e11;
        return e13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f89102a;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i11 = this.f89102a;
        if (i11 >= 2) {
            Arrays.sort((Object[]) this.f89103b, 0, i11, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            a(4);
        }
        int length = tArr.length;
        int i11 = this.f89102a;
        if (i11 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f89103b;
                return tArr2;
            }
            tArr[0] = this.f89103b;
        } else {
            if (length < i11) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f89103b, i11, tArr.getClass());
                if (tArr3 == null) {
                    a(6);
                }
                return tArr3;
            }
            if (i11 != 0) {
                System.arraycopy(this.f89103b, 0, tArr, 0, i11);
            }
        }
        int i12 = this.f89102a;
        if (length > i12) {
            tArr[i12] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        int i12;
        if (i11 >= 0 && i11 <= (i12 = this.f89102a)) {
            if (i12 == 0) {
                this.f89103b = e11;
            } else if (i12 == 1 && i11 == 0) {
                this.f89103b = new Object[]{e11, this.f89103b};
            } else {
                Object[] objArr = new Object[i12 + 1];
                if (i12 == 1) {
                    objArr[0] = this.f89103b;
                } else {
                    Object[] objArr2 = (Object[]) this.f89103b;
                    System.arraycopy(objArr2, 0, objArr, 0, i11);
                    System.arraycopy(objArr2, i11, objArr, i11 + 1, this.f89102a - i11);
                }
                objArr[i11] = e11;
                this.f89103b = objArr;
            }
            this.f89102a++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i11 + ", Size: " + this.f89102a);
    }
}
