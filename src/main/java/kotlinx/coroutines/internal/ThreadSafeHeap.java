package kotlinx.coroutines.internal;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jn0.h0;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.q;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@InternalCoroutinesApi
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ&\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0086\b¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010!\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u00002\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0086\b¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\bH\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0001¢\u0006\u0004\b)\u0010\u001fR \u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u00100\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\fR\u0011\u00101\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b1\u00102R\u000b\u00104\u001a\u0002038\u0002X\u0082\u0004¨\u00065"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "", IntegerTokenConverter.CONVERTER_KEY, "Ljn0/h0;", "siftUpFrom", "(I)V", "siftDownFrom", "", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "j", "swap", "(II)V", "Lkotlin/Function1;", "", "predicate", "find", "(Lwn0/l;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "removeFirstIf", "node", "addLast", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lwn0/l;)Z", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "firstImpl", "index", "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "addImpl", "a", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "value", "getSize", "()I", "setSize", "size", "isEmpty", "()Z", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final T[] realloc() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new ThreadSafeHeapNode[4];
            this.a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, getSize() * 2);
        s.j(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((ThreadSafeHeapNode[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void setSize(int i11) {
        _size$volatile$FU.set(this, i11);
    }

    private final /* synthetic */ void set_size$volatile(int i11) {
        this._size$volatile = i11;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    private final void siftDownFrom(int i11) {
        while (true) {
            int i12 = i11 * 2;
            int i13 = i12 + 1;
            if (i13 >= getSize()) {
                return;
            }
            T[] tArr = this.a;
            s.h(tArr);
            int i14 = i12 + 2;
            if (i14 < getSize()) {
                T t11 = tArr[i14];
                s.h(t11);
                T t12 = tArr[i13];
                s.h(t12);
                if (((Comparable) t11).compareTo(t12) >= 0) {
                    i14 = i13;
                }
            } else {
                i14 = i13;
            }
            T t13 = tArr[i11];
            s.h(t13);
            T t14 = tArr[i14];
            s.h(t14);
            if (((Comparable) t13).compareTo(t14) <= 0) {
                return;
            }
            swap(i11, i14);
            i11 = i14;
        }
    }

    private final void siftUpFrom(int i11) {
        while (i11 > 0) {
            T[] tArr = this.a;
            s.h(tArr);
            int i12 = (i11 - 1) / 2;
            T t11 = tArr[i12];
            s.h(t11);
            T t12 = tArr[i11];
            s.h(t12);
            if (((Comparable) t11).compareTo(t12) <= 0) {
                return;
            }
            swap(i11, i12);
            i11 = i12;
        }
    }

    private final void swap(int i11, int j11) {
        T[] tArr = this.a;
        s.h(tArr);
        T t11 = tArr[j11];
        s.h(t11);
        T t12 = tArr[i11];
        s.h(t12);
        tArr[i11] = t11;
        tArr[j11] = t12;
        t11.setIndex(i11);
        t12.setIndex(j11);
    }

    public final void addImpl(T node) {
        node.setHeap(this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArrRealloc = realloc();
        int size = getSize();
        setSize(size + 1);
        threadSafeHeapNodeArrRealloc[size] = node;
        node.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(T node) {
        synchronized (this) {
            addImpl(node);
            h0 h0Var = h0.f84049a;
        }
    }

    public final boolean addLastIf(T node, l<? super T, Boolean> cond) {
        boolean z11;
        synchronized (this) {
            try {
                if (cond.invoke(firstImpl()).booleanValue()) {
                    addImpl(node);
                    z11 = true;
                } else {
                    z11 = false;
                }
                q.b(1);
            } catch (Throwable th2) {
                q.b(1);
                q.a(1);
                throw th2;
            }
        }
        q.a(1);
        return z11;
    }

    public final T find(l<? super T, Boolean> predicate) {
        T t11;
        synchronized (this) {
            try {
                int size = getSize();
                int i11 = 0;
                while (true) {
                    t11 = null;
                    if (i11 >= size) {
                        break;
                    }
                    T[] tArr = this.a;
                    if (tArr != null) {
                        t11 = (Object) tArr[i11];
                    }
                    s.h(t11);
                    if (predicate.invoke(t11).booleanValue()) {
                        break;
                    }
                    i11++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }

    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$volatile$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T t11;
        synchronized (this) {
            t11 = (T) firstImpl();
        }
        return t11;
    }

    public final boolean remove(T node) {
        boolean z11;
        synchronized (this) {
            if (node.getHeap() == null) {
                z11 = false;
            } else {
                removeAtImpl(node.getIndex());
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final T removeAtImpl(int index) {
        T[] tArr = this.a;
        s.h(tArr);
        setSize(getSize() - 1);
        if (index < getSize()) {
            swap(index, getSize());
            int i11 = (index - 1) / 2;
            if (index > 0) {
                T t11 = tArr[index];
                s.h(t11);
                T t12 = tArr[i11];
                s.h(t12);
                if (((Comparable) t11).compareTo(t12) < 0) {
                    swap(index, i11);
                    siftUpFrom(i11);
                } else {
                    siftDownFrom(index);
                }
            } else {
                siftDownFrom(index);
            }
        }
        T t13 = tArr[getSize()];
        s.h(t13);
        t13.setHeap(null);
        t13.setIndex(-1);
        tArr[getSize()] = null;
        return t13;
    }

    public final T removeFirstIf(l<? super T, Boolean> predicate) {
        synchronized (this) {
            int i11 = 1;
            try {
                ThreadSafeHeapNode threadSafeHeapNodeFirstImpl = firstImpl();
                T t11 = null;
                if (threadSafeHeapNodeFirstImpl == null) {
                    q.b(2);
                    return null;
                }
                if (predicate.invoke(threadSafeHeapNodeFirstImpl).booleanValue()) {
                    t11 = (T) removeAtImpl(0);
                }
                q.b(i11);
                return t11;
            } finally {
                q.b(i11);
                q.a(i11);
            }
        }
    }

    public final T removeFirstOrNull() {
        T t11;
        synchronized (this) {
            t11 = getSize() > 0 ? (T) removeAtImpl(0) : null;
        }
        return t11;
    }
}
