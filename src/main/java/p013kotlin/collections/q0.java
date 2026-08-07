package p013kotlin.collections;

import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xn0.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/collections/q0;", "T", "", "Lkotlin/collections/p0;", "Lkotlin/Function0;", "", "iteratorFactory", "<init>", "(Lwn0/a;)V", "iterator", "()Ljava/util/Iterator;", "a", "Lwn0/a;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0<T> implements Iterable<IndexedValue<? extends T>>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Iterator<T>> iteratorFactory;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(wn0.a<? extends Iterator<? extends T>> iteratorFactory) {
        s.k(iteratorFactory, "iteratorFactory");
        this.iteratorFactory = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator<IndexedValue<T>> iterator() {
        return new r0(this.iteratorFactory.invoke());
    }
}
