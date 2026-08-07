package p013kotlin.collections;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u0000 @*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001LB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ%\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0007J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u0010%J\u0015\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010%J\u000f\u0010.\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b.\u0010%J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010%J\u000f\u00100\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b0\u0010%J\u0017\u00101\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00101\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00103J\u001d\u00104\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b4\u00105J%\u00104\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b4\u00106J\u0018\u00107\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b7\u00108J \u00109\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b;\u00102J\u0017\u0010<\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u0010=J\u0017\u0010?\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u00102J\u0017\u0010@\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b@\u00108J\u001d\u0010A\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\bA\u00105J\u001d\u0010B\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\bB\u00105J\u000f\u0010C\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010\u0007J)\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010E\"\u0004\b\u0001\u0010D2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0EH\u0016¢\u0006\u0004\bG\u0010JJ\u001f\u0010K\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\bK\u0010\u001bR\u0016\u0010N\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010U\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bO\u0010T¨\u0006V"}, d2 = {"Lkotlin/collections/m;", "E", "Lkotlin/collections/h;", "", "initialCapacity", "<init>", "(I)V", "()V", "minCapacity", "Ljn0/h0;", "j", "newCapacity", "h", "index", "p", "(I)I", "n", "l", IntegerTokenConverter.CONVERTER_KEY, "internalIndex", "", "elements", "e", "(ILjava/util/Collection;)V", "fromIndex", "toIndex", "t", "(II)V", "u", "internalFromIndex", "internalToIndex", "o", "q", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "k", "last", "m", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "r", "removeLast", "s", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", DateTokenConverter.CONVERTER_KEY, "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "a", "I", "head", "b", "[Ljava/lang/Object;", "elementData", "value", "c", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m<E> extends h<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f86487e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] elementData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    public m(int i11) {
        Object[] objArr;
        if (i11 == 0) {
            objArr = f86487e;
        } else {
            if (i11 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i11);
            }
            objArr = new Object[i11];
        }
        this.elementData = objArr;
    }

    private final void e(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i11 = this.head;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.elementData[i12] = it.next();
        }
        this.size = size() + elements.size();
    }

    private final void h(int newCapacity) {
        Object[] objArr = new Object[newCapacity];
        Object[] objArr2 = this.elementData;
        q.p(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i11 = this.head;
        q.p(objArr3, objArr, length - i11, 0, i11);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int i(int index) {
        return index == 0 ? s.u0(this.elementData) : index - 1;
    }

    private final void j(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr == f86487e) {
            this.elementData = new Object[n.f(minCapacity, 10)];
        } else {
            h(d.INSTANCE.e(objArr.length, minCapacity));
        }
    }

    private final int l(int index) {
        if (index == s.u0(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    private final int n(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    private final void o(int internalFromIndex, int internalToIndex) {
        if (internalFromIndex < internalToIndex) {
            q.z(this.elementData, null, internalFromIndex, internalToIndex);
            return;
        }
        Object[] objArr = this.elementData;
        q.z(objArr, null, internalFromIndex, objArr.length);
        q.z(this.elementData, null, 0, internalToIndex);
    }

    private final int p(int index) {
        Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    private final void q() {
        ((AbstractList) this).modCount++;
    }

    private final void t(int fromIndex, int toIndex) {
        int iP = p(this.head + (fromIndex - 1));
        int iP2 = p(this.head + (toIndex - 1));
        while (fromIndex > 0) {
            int i11 = iP + 1;
            int iMin = Math.min(fromIndex, Math.min(i11, iP2 + 1));
            Object[] objArr = this.elementData;
            int i12 = iP2 - iMin;
            int i13 = iP - iMin;
            q.p(objArr, objArr, i12 + 1, i13 + 1, i11);
            iP = n(i13);
            iP2 = n(i12);
            fromIndex -= iMin;
        }
    }

    private final void u(int fromIndex, int toIndex) {
        int iP = p(this.head + toIndex);
        int iP2 = p(this.head + fromIndex);
        int size = size();
        while (true) {
            size -= toIndex;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            toIndex = Math.min(size, Math.min(objArr.length - iP, objArr.length - iP2));
            Object[] objArr2 = this.elementData;
            int i11 = iP + toIndex;
            q.p(objArr2, objArr2, iP2, iP, i11);
            iP = p(i11);
            iP2 = p(iP2 + toIndex);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        s.k(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        q();
        j(size() + elements.size());
        e(p(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E element) {
        q();
        j(size() + 1);
        int i11 = i(this.head);
        this.head = i11;
        this.elementData[i11] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        q();
        j(size() + 1);
        this.elementData[p(this.head + size())] = element;
        this.size = size() + 1;
    }

    @Override // p013kotlin.collections.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            q();
            o(this.head, p(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // p013kotlin.collections.h
    public E d(int index) {
        d.INSTANCE.b(index, size());
        if (index == x.o(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        q();
        int iP = p(this.head + index);
        E e11 = (E) this.elementData[iP];
        if (index < (size() >> 1)) {
            int i11 = this.head;
            if (iP >= i11) {
                Object[] objArr = this.elementData;
                q.p(objArr, objArr, i11 + 1, i11, iP);
            } else {
                Object[] objArr2 = this.elementData;
                q.p(objArr2, objArr2, 1, 0, iP);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.head;
                q.p(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i13 = this.head;
            objArr4[i13] = null;
            this.head = l(i13);
        } else {
            int iP2 = p(this.head + x.o(this));
            if (iP <= iP2) {
                Object[] objArr5 = this.elementData;
                q.p(objArr5, objArr5, iP, iP + 1, iP2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                q.p(objArr6, objArr6, iP, iP + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                q.p(objArr7, objArr7, 0, 1, iP2 + 1);
            }
            this.elementData[iP2] = null;
        }
        this.size = size() - 1;
        return e11;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        d.INSTANCE.b(index, size());
        return (E) this.elementData[p(this.head + index)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i11;
        int iP = p(this.head + size());
        int length = this.head;
        if (length < iP) {
            while (length < iP) {
                if (s.f(element, this.elementData[length])) {
                    i11 = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iP) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (length < length2) {
            if (s.f(element, this.elementData[length])) {
                i11 = this.head;
            } else {
                length++;
            }
        }
        for (int i12 = 0; i12 < iP; i12++) {
            if (s.f(element, this.elementData[i12])) {
                length = i12 + this.elementData.length;
                i11 = this.head;
            }
        }
        return -1;
        return length - i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E k() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[p(this.head + x.o(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int iU0;
        int i11;
        int iP = p(this.head + size());
        int i12 = this.head;
        if (i12 < iP) {
            iU0 = iP - 1;
            if (i12 <= iU0) {
                while (!s.f(element, this.elementData[iU0])) {
                    if (iU0 != i12) {
                        iU0--;
                    }
                }
                i11 = this.head;
                return iU0 - i11;
            }
            return -1;
        }
        if (i12 > iP) {
            for (int i13 = iP - 1; -1 < i13; i13--) {
                if (s.f(element, this.elementData[i13])) {
                    iU0 = i13 + this.elementData.length;
                    i11 = this.head;
                    return iU0 - i11;
                }
            }
            iU0 = s.u0(this.elementData);
            int i14 = this.head;
            if (i14 <= iU0) {
                while (!s.f(element, this.elementData[iU0])) {
                    if (iU0 != i14) {
                        iU0--;
                    }
                }
                i11 = this.head;
                return iU0 - i11;
            }
        }
        return -1;
    }

    public final E m() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[p(this.head + x.o(this))];
    }

    public final E r() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        int iP;
        s.k(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iP2 = p(this.head + size());
            int i11 = this.head;
            if (i11 < iP2) {
                iP = i11;
                while (i11 < iP2) {
                    Object obj = this.elementData[i11];
                    if (elements.contains(obj)) {
                        z11 = true;
                    } else {
                        this.elementData[iP] = obj;
                        iP++;
                    }
                    i11++;
                }
                q.z(this.elementData, null, iP, iP2);
            } else {
                int length = this.elementData.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        z12 = true;
                    } else {
                        this.elementData[i12] = obj2;
                        i12++;
                    }
                    i11++;
                }
                iP = p(i12);
                for (int i13 = 0; i13 < iP2; i13++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        z12 = true;
                    } else {
                        this.elementData[iP] = obj3;
                        iP = l(iP);
                    }
                }
                z11 = z12;
            }
            if (z11) {
                q();
                this.size = n(iP - this.head);
            }
        }
        return z11;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        Object[] objArr = this.elementData;
        int i11 = this.head;
        E e11 = (E) objArr[i11];
        objArr[i11] = null;
        this.head = l(i11);
        this.size = size() - 1;
        return e11;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        q();
        int iP = p(this.head + x.o(this));
        Object[] objArr = this.elementData;
        E e11 = (E) objArr[iP];
        objArr[iP] = null;
        this.size = size() - 1;
        return e11;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        d.INSTANCE.d(fromIndex, toIndex, size());
        int i11 = toIndex - fromIndex;
        if (i11 == 0) {
            return;
        }
        if (i11 == size()) {
            clear();
            return;
        }
        if (i11 == 1) {
            remove(fromIndex);
            return;
        }
        q();
        if (fromIndex < size() - toIndex) {
            t(fromIndex, toIndex);
            int iP = p(this.head + i11);
            o(this.head, iP);
            this.head = iP;
        } else {
            u(fromIndex, toIndex);
            int iP2 = p(this.head + size());
            o(n(iP2 - i11), iP2);
        }
        this.size = size() - i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        int iP;
        s.k(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iP2 = p(this.head + size());
            int i11 = this.head;
            if (i11 < iP2) {
                iP = i11;
                while (i11 < iP2) {
                    Object obj = this.elementData[i11];
                    if (elements.contains(obj)) {
                        this.elementData[iP] = obj;
                        iP++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                q.z(this.elementData, null, iP, iP2);
            } else {
                int length = this.elementData.length;
                boolean z12 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i12] = obj2;
                        i12++;
                    } else {
                        z12 = true;
                    }
                    i11++;
                }
                iP = p(i12);
                for (int i13 = 0; i13 < iP2; i13++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iP] = obj3;
                        iP = l(iP);
                    } else {
                        z12 = true;
                    }
                }
                z11 = z12;
            }
            if (z11) {
                q();
                this.size = n(iP - this.head);
            }
        }
        return z11;
    }

    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        d.INSTANCE.b(index, size());
        int iP = p(this.head + index);
        Object[] objArr = this.elementData;
        E e11 = (E) objArr[iP];
        objArr[iP] = element;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        s.k(array, "array");
        if (array.length < size()) {
            array = (T[]) o.a(array, size());
        }
        T[] tArr = array;
        int iP = p(this.head + size());
        int i11 = this.head;
        if (i11 < iP) {
            q.t(this.elementData, tArr, 0, i11, iP, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            q.p(objArr, tArr, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            q.p(objArr2, tArr, objArr2.length - this.head, 0, iP);
        }
        return (T[]) w.g(size(), tArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        d.INSTANCE.c(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        q();
        j(size() + 1);
        int iP = p(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int i11 = i(iP);
            int i12 = i(this.head);
            int i13 = this.head;
            if (i11 >= i13) {
                Object[] objArr = this.elementData;
                objArr[i12] = objArr[i13];
                q.p(objArr, objArr, i13, i13 + 1, i11 + 1);
            } else {
                Object[] objArr2 = this.elementData;
                q.p(objArr2, objArr2, i13 - 1, i13, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                q.p(objArr3, objArr3, 0, 1, i11 + 1);
            }
            this.elementData[i11] = element;
            this.head = i12;
        } else {
            int iP2 = p(this.head + size());
            if (iP < iP2) {
                Object[] objArr4 = this.elementData;
                q.p(objArr4, objArr4, iP + 1, iP, iP2);
            } else {
                Object[] objArr5 = this.elementData;
                q.p(objArr5, objArr5, 1, 0, iP2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                q.p(objArr6, objArr6, iP + 1, iP, objArr6.length - 1);
            }
            this.elementData[iP] = element;
        }
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        s.k(elements, "elements");
        d.INSTANCE.c(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        q();
        j(size() + elements.size());
        int iP = p(this.head + size());
        int iP2 = p(this.head + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i11 = this.head;
            int length = i11 - size;
            if (iP2 < i11) {
                Object[] objArr = this.elementData;
                q.p(objArr, objArr, length, i11, objArr.length);
                if (size >= iP2) {
                    Object[] objArr2 = this.elementData;
                    q.p(objArr2, objArr2, objArr2.length - size, 0, iP2);
                } else {
                    Object[] objArr3 = this.elementData;
                    q.p(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    q.p(objArr4, objArr4, 0, size, iP2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                q.p(objArr5, objArr5, length, i11, iP2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i12 = iP2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    q.p(objArr6, objArr6, length, i11, iP2);
                } else {
                    q.p(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.elementData;
                    q.p(objArr7, objArr7, 0, this.head + length2, iP2);
                }
            }
            this.head = length;
            e(n(iP2 - size), elements);
        } else {
            int i13 = iP2 + size;
            if (iP2 < iP) {
                int i14 = size + iP;
                Object[] objArr8 = this.elementData;
                if (i14 <= objArr8.length) {
                    q.p(objArr8, objArr8, i13, iP2, iP);
                } else if (i13 >= objArr8.length) {
                    q.p(objArr8, objArr8, i13 - objArr8.length, iP2, iP);
                } else {
                    int length3 = iP - (i14 - objArr8.length);
                    q.p(objArr8, objArr8, 0, length3, iP);
                    Object[] objArr9 = this.elementData;
                    q.p(objArr9, objArr9, i13, iP2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                q.p(objArr10, objArr10, size, 0, iP);
                Object[] objArr11 = this.elementData;
                if (i13 >= objArr11.length) {
                    q.p(objArr11, objArr11, i13 - objArr11.length, iP2, objArr11.length);
                } else {
                    q.p(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    q.p(objArr12, objArr12, i13, iP2, objArr12.length - size);
                }
            }
            e(iP2, elements);
        }
        return true;
    }

    public m() {
        this.elementData = f86487e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
