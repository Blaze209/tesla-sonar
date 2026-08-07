package nl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\b&\u0018\u0000 -*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001!B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H$¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\rJ\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\u0012R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\nR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lnl0/c;", "", "T", "Lnl0/f;", "", "capacity", "<init>", "(I)V", "instance", "", "I", "(Ljava/lang/Object;)Z", "H", "()Ljava/lang/Object;", "index", "Ljn0/h0;", "C", "t", "()I", "B", "o", "(Ljava/lang/Object;)Ljava/lang/Object;", "J", "(Ljava/lang/Object;)V", "p", "S2", "F1", "dispose", "()V", "a", "getCapacity", "", "top", "b", "maxIndex", "c", "shift", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "instances", "", "e", "[I", "next", "f", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c<T> implements f<T> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater<c<?>> f95120g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int shift;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicReferenceArray<T> instances;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int[] next;
    private volatile long top;

    static {
        AtomicLongFieldUpdater<c<?>> atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(c.class, new z() { // from class: nl0.c.a
            @Override // p013kotlin.jvm.internal.z, co0.o
            public Object get(Object obj) {
                return Long.valueOf(((c) obj).top);
            }

            @Override // p013kotlin.jvm.internal.z, co0.k
            public void h(Object obj, Object obj2) {
                ((c) obj).top = ((Number) obj2).longValue();
            }
        }.getName());
        s.j(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        f95120g = atomicLongFieldUpdaterNewUpdater;
    }

    public c(int i11) {
        this.capacity = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i11).toString());
        }
        if (i11 > 536870911) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i11).toString());
        }
        int iHighestOneBit = Integer.highestOneBit((i11 * 4) - 1) * 2;
        this.maxIndex = iHighestOneBit;
        this.shift = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        this.instances = new AtomicReferenceArray<>(iHighestOneBit + 1);
        this.next = new int[iHighestOneBit + 1];
    }

    private final void C(int index) {
        long j11;
        if (index <= 0) {
            throw new IllegalArgumentException("index should be positive");
        }
        do {
            j11 = this.top;
            this.next[index] = (int) (4294967295L & j11);
        } while (!f95120g.compareAndSet(this, j11, ((((j11 >> 32) & 4294967295L) + 1) << 32) | ((long) index)));
    }

    private final T H() {
        int iT = t();
        if (iT == 0) {
            return null;
        }
        return this.instances.getAndSet(iT, null);
    }

    private final boolean I(T instance) {
        int iIdentityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.shift) + 1;
        for (int i11 = 0; i11 < 8; i11++) {
            if (b.a(this.instances, iIdentityHashCode, null, instance)) {
                C(iIdentityHashCode);
                return true;
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = this.maxIndex;
            }
        }
        return false;
    }

    private final int t() {
        long j11;
        long j12;
        int i11;
        do {
            j11 = this.top;
            if (j11 == 0) {
                return 0;
            }
            j12 = ((j11 >> 32) & 4294967295L) + 1;
            i11 = (int) (4294967295L & j11);
            if (i11 == 0) {
                return 0;
            }
        } while (!f95120g.compareAndSet(this, j11, (j12 << 32) | ((long) this.next[i11])));
        return i11;
    }

    protected abstract T B();

    @Override // nl0.f
    public final void F1(T instance) {
        s.k(instance, "instance");
        J(instance);
        if (I(instance)) {
            return;
        }
        p(instance);
    }

    protected void J(T instance) {
        s.k(instance, "instance");
    }

    @Override // nl0.f
    public final T S2() {
        T tO;
        T tH = H();
        return (tH == null || (tO = o(tH)) == null) ? B() : tO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f.a.a(this);
    }

    @Override // nl0.f
    public final void dispose() {
        while (true) {
            T tH = H();
            if (tH == null) {
                return;
            } else {
                p(tH);
            }
        }
    }

    protected T o(T instance) {
        s.k(instance, "instance");
        return instance;
    }

    protected void p(T instance) {
        s.k(instance, "instance");
    }
}
