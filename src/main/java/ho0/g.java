package ho0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lho0/g;", "T", "R", "E", "Lho0/i;", "sequence", "Lkotlin/Function1;", "transformer", "", "iterator", "<init>", "(Lho0/i;Lwn0/l;Lwn0/l;)V", "()Ljava/util/Iterator;", "a", "Lho0/i;", "b", "Lwn0/l;", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T, R, E> implements i<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i<T> sequence;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<T, R> transformer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<R, Iterator<E>> iterator;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0004R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ho0/g$a", "", "", "b", "()Z", "next", "()Ljava/lang/Object;", "hasNext", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "itemIterator", "", "c", "I", "getState", "()I", "setState", "(I)V", "state", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Iterator<E>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Iterator<T> iterator;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Iterator<? extends E> itemIterator;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int state;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g<T, R, E> f73234d;

        a(g<T, R, E> gVar) {
            this.f73234d = gVar;
            this.iterator = ((g) gVar).sequence.iterator();
        }

        private final boolean b() {
            Iterator<? extends E> it = this.itemIterator;
            if (it != null && it.hasNext()) {
                this.state = 1;
                return true;
            }
            while (this.iterator.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) ((g) this.f73234d).iterator.invoke(((g) this.f73234d).transformer.invoke(this.iterator.next()));
                if (it2.hasNext()) {
                    this.itemIterator = it2;
                    this.state = 1;
                    return true;
                }
            }
            this.state = 2;
            this.itemIterator = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i11 = this.state;
            if (i11 == 1) {
                return true;
            }
            if (i11 == 2) {
                return false;
            }
            return b();
        }

        @Override // java.util.Iterator
        public E next() {
            int i11 = this.state;
            if (i11 == 2) {
                throw new NoSuchElementException();
            }
            if (i11 == 0 && !b()) {
                throw new NoSuchElementException();
            }
            this.state = 0;
            Iterator<? extends E> it = this.itemIterator;
            p013kotlin.jvm.internal.s.h(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(i<? extends T> sequence, wn0.l<? super T, ? extends R> transformer, wn0.l<? super R, ? extends Iterator<? extends E>> iterator) {
        p013kotlin.jvm.internal.s.k(sequence, "sequence");
        p013kotlin.jvm.internal.s.k(transformer, "transformer");
        p013kotlin.jvm.internal.s.k(iterator, "iterator");
        this.sequence = sequence;
        this.transformer = transformer;
        this.iterator = iterator;
    }

    @Override // ho0.i
    public Iterator<E> iterator() {
        return new a(this);
    }
}
