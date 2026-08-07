package androidx.collection;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/collection/e;", "E", "", "", "minCapacity", "<init>", "(I)V", "Ljn0/h0;", "b", "()V", "element", "a", "(Ljava/lang/Object;)V", "e", "()Ljava/lang/Object;", "index", "c", "(I)Ljava/lang/Object;", "f", "()I", "", DateTokenConverter.CONVERTER_KEY, "()Z", "", "[Ljava/lang/Object;", "elements", "I", "head", "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private E[] elements;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int tail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int capacityBitmask;

    public e(int i11) {
        if (!(i11 >= 1)) {
            n1.d.a("capacity must be >= 1");
        }
        if (!(i11 <= 1073741824)) {
            n1.d.a("capacity must be <= 2^30");
        }
        i11 = Integer.bitCount(i11) != 1 ? Integer.highestOneBit(i11 - 1) << 1 : i11;
        this.capacityBitmask = i11 - 1;
        this.elements = (E[]) new Object[i11];
    }

    private final void b() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i11 = this.head;
        int i12 = length - i11;
        int i13 = length << 1;
        if (i13 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i13];
        p013kotlin.collections.n.p(eArr, eArr2, 0, i11, length);
        p013kotlin.collections.n.p(this.elements, eArr2, i12, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i13 - 1;
    }

    public final void a(E element) {
        E[] eArr = this.elements;
        int i11 = this.tail;
        eArr[i11] = element;
        int i12 = this.capacityBitmask & (i11 + 1);
        this.tail = i12;
        if (i12 == this.head) {
            b();
        }
    }

    public final E c(int index) {
        if (index < 0 || index >= f()) {
            g gVar = g.f3841a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e11 = this.elements[this.capacityBitmask & (this.head + index)];
        p013kotlin.jvm.internal.s.h(e11);
        return e11;
    }

    public final boolean d() {
        return this.head == this.tail;
    }

    public final E e() {
        int i11 = this.head;
        if (i11 == this.tail) {
            g gVar = g.f3841a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e11 = eArr[i11];
        eArr[i11] = null;
        this.head = (i11 + 1) & this.capacityBitmask;
        return e11;
    }

    public final int f() {
        return (this.tail - this.head) & this.capacityBitmask;
    }
}
