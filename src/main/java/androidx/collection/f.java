package androidx.collection;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/collection/f;", "", "", "minCapacity", "<init>", "(I)V", "Ljn0/h0;", "c", "()V", "element", "a", "e", "()I", "b", "", DateTokenConverter.CONVERTER_KEY, "()Z", "", "[I", "elements", "I", "head", "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] elements;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int tail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int capacityBitmask;

    public f() {
        this(0, 1, null);
    }

    private final void c() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i11 = this.head;
        int i12 = length - i11;
        int i13 = length << 1;
        if (i13 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i13];
        p013kotlin.collections.n.n(iArr, iArr2, 0, i11, length);
        p013kotlin.collections.n.n(this.elements, iArr2, i12, 0, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i13 - 1;
    }

    public final void a(int element) {
        int[] iArr = this.elements;
        int i11 = this.tail;
        iArr[i11] = element;
        int i12 = this.capacityBitmask & (i11 + 1);
        this.tail = i12;
        if (i12 == this.head) {
            c();
        }
    }

    public final void b() {
        this.tail = this.head;
    }

    public final boolean d() {
        return this.head == this.tail;
    }

    public final int e() {
        int i11 = this.head;
        if (i11 == this.tail) {
            g gVar = g.f3841a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.elements[i11];
        this.head = (i11 + 1) & this.capacityBitmask;
        return i12;
    }

    public f(int i11) {
        if (!(i11 >= 1)) {
            n1.d.a("capacity must be >= 1");
        }
        if (!(i11 <= 1073741824)) {
            n1.d.a("capacity must be <= 2^30");
        }
        i11 = Integer.bitCount(i11) != 1 ? Integer.highestOneBit(i11 - 1) << 1 : i11;
        this.capacityBitmask = i11 - 1;
        this.elements = new int[i11];
    }

    public /* synthetic */ f(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 8 : i11);
    }
}
