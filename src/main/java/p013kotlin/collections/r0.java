package p013kotlin.collections;

import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xn0.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/collections/r0;", "T", "", "Lkotlin/collections/p0;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", "b", "()Lkotlin/collections/p0;", "a", "Ljava/util/Iterator;", "", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0<T> implements Iterator<IndexedValue<? extends T>>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Iterator<T> iterator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(Iterator<? extends T> iterator) {
        s.k(iterator, "iterator");
        this.iterator = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final IndexedValue<T> next() {
        int i11 = this.index;
        this.index = i11 + 1;
        if (i11 < 0) {
            x.x();
        }
        return new IndexedValue<>(i11, this.iterator.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
