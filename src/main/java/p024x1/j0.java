package p024x1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import t2.b;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u000b0\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\tR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR$\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#¨\u0006%"}, d2 = {"Lx1/j0;", "T", "Lx1/d;", "<init>", "()V", "", "itemIndex", "Lx1/d$a;", "e", "(I)Lx1/d$a;", "index", "Ljn0/h0;", "c", "(I)V", "", DateTokenConverter.CONVERTER_KEY, "(Lx1/d$a;I)Z", "size", "value", "b", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "a", "(IILwn0/l;)V", "get", "Lt2/b;", "Lt2/b;", "intervals", "<set-?>", "I", "getSize", "()I", "Lx1/d$a;", "lastInterval", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j0<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<d.a<T>> intervals = new b<>(new d.a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private d.a<? extends T> lastInterval;

    private final void c(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Index " + index + ", size " + getSize());
        }
    }

    private final boolean d(d.a<? extends T> aVar, int i11) {
        return i11 < aVar.getStartIndex() + aVar.getSize() && aVar.getStartIndex() <= i11;
    }

    private final d.a<T> e(int itemIndex) {
        d.a<? extends T> aVar = this.lastInterval;
        if (aVar != null && d(aVar, itemIndex)) {
            return aVar;
        }
        b<d.a<T>> bVar = this.intervals;
        d.a aVar2 = (d.a<? extends T>) bVar.m()[e.b(bVar, itemIndex)];
        this.lastInterval = aVar2;
        return aVar2;
    }

    @Override // p024x1.d
    public void a(int fromIndex, int toIndex, l<? super d.a<? extends T>, h0> block) {
        c(fromIndex);
        c(toIndex);
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException(("toIndex (" + toIndex + ") should be not smaller than fromIndex (" + fromIndex + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        int iB = e.b(this.intervals, fromIndex);
        int startIndex = this.intervals.m()[iB].getStartIndex();
        while (startIndex <= toIndex) {
            d.a<T> aVar = this.intervals.m()[iB];
            block.invoke(aVar);
            startIndex += aVar.getSize();
            iB++;
        }
    }

    public final void b(int size, T value) {
        if (size < 0) {
            throw new IllegalArgumentException(("size should be >=0, but was " + size).toString());
        }
        if (size == 0) {
            return;
        }
        d.a<T> aVar = new d.a<>(getSize(), size, value);
        this.size = getSize() + size;
        this.intervals.b(aVar);
    }

    @Override // p024x1.d
    public d.a<T> get(int index) {
        c(index);
        return e(index);
    }

    @Override // p024x1.d
    public int getSize() {
        return this.size;
    }
}
