package ou;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f99993a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f99994b;

    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f99993a = a.FAILED;
        this.f99994b = a();
        if (this.f99993a == a.DONE) {
            return false;
        }
        this.f99993a = a.READY;
        return true;
    }

    protected abstract T a();

    protected final T b() {
        this.f99993a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        p.r(this.f99993a != a.FAILED);
        int iOrdinal = this.f99993a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f99993a = a.NOT_READY;
        T t11 = (T) k.a(this.f99994b);
        this.f99994b = null;
        return t11;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
