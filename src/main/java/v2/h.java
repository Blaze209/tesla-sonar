package v2;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lv2/h;", "T", "", "Lv2/a;", "Lv2/f;", "builder", "", "index", "<init>", "(Lv2/f;I)V", "Ljn0/h0;", "reset", "()V", "m", "k", "l", "previous", "()Ljava/lang/Object;", "next", "element", "add", "(Ljava/lang/Object;)V", "remove", "set", "c", "Lv2/f;", DateTokenConverter.CONVERTER_KEY, "I", "expectedModCount", "Lv2/k;", "e", "Lv2/k;", "trieIterator", "f", "lastIteratedIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h<T> extends a<T> implements ListIterator<T>, xn0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f<T> builder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int expectedModCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private k<? extends T> trieIterator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int lastIteratedIndex;

    public h(f<T> fVar, int i11) {
        super(i11, fVar.size());
        this.builder = fVar;
        this.expectedModCount = fVar.i();
        this.lastIteratedIndex = -1;
        m();
    }

    private final void k() {
        if (this.expectedModCount != this.builder.i()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    private final void m() {
        Object[] objArrJ = this.builder.getRoot();
        if (objArrJ == null) {
            this.trieIterator = null;
            return;
        }
        int iD = l.d(this.builder.size());
        int iJ = n.j(getIndex(), iD);
        int iK = (this.builder.getRootShift() / 5) + 1;
        k<? extends T> kVar = this.trieIterator;
        if (kVar == null) {
            this.trieIterator = new k<>(objArrJ, iJ, iD, iK);
        } else {
            s.h(kVar);
            kVar.n(objArrJ, iJ, iD, iK);
        }
    }

    private final void reset() {
        j(this.builder.size());
        this.expectedModCount = this.builder.i();
        this.lastIteratedIndex = -1;
        m();
    }

    @Override // v2.a, java.util.ListIterator
    public void add(T element) {
        k();
        this.builder.add(getIndex(), element);
        i(getIndex() + 1);
        reset();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        k();
        b();
        this.lastIteratedIndex = getIndex();
        k<? extends T> kVar = this.trieIterator;
        if (kVar == null) {
            Object[] objArrL = this.builder.getTail();
            int index = getIndex();
            i(index + 1);
            return (T) objArrL[index];
        }
        if (kVar.hasNext()) {
            i(getIndex() + 1);
            return kVar.next();
        }
        Object[] objArrL2 = this.builder.getTail();
        int index2 = getIndex();
        i(index2 + 1);
        return (T) objArrL2[index2 - kVar.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        k();
        d();
        this.lastIteratedIndex = getIndex() - 1;
        k<? extends T> kVar = this.trieIterator;
        if (kVar == null) {
            Object[] objArrL = this.builder.getTail();
            i(getIndex() - 1);
            return (T) objArrL[getIndex()];
        }
        if (getIndex() <= kVar.getSize()) {
            i(getIndex() - 1);
            return kVar.previous();
        }
        Object[] objArrL2 = this.builder.getTail();
        i(getIndex() - 1);
        return (T) objArrL2[getIndex() - kVar.getSize()];
    }

    @Override // v2.a, java.util.ListIterator, java.util.Iterator
    public void remove() {
        k();
        l();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            i(this.lastIteratedIndex);
        }
        reset();
    }

    @Override // v2.a, java.util.ListIterator
    public void set(T element) {
        k();
        l();
        this.builder.set(this.lastIteratedIndex, element);
        this.expectedModCount = this.builder.i();
        m();
    }
}
