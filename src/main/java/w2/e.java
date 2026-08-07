package w2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010\u0012¨\u0006'"}, d2 = {"Lw2/e;", "K", "V", "T", "", "Lw2/t;", "node", "", "Lw2/u;", "path", "<init>", "(Lw2/t;[Lw2/u;)V", "", "pathIndex", IntegerTokenConverter.CONVERTER_KEY, "(I)I", "Ljn0/h0;", "e", "()V", "b", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "a", "[Lw2/u;", "h", "()[Lw2/u;", "I", "getPathLastIndex", "()I", "j", "(I)V", "pathLastIndex", "c", "Z", "getHasNext$annotations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e<K, V, T> implements Iterator<T>, xn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u<K, V, T>[] path;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int pathLastIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasNext = true;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        this.path = uVarArr;
        uVarArr[0].m(tVar.getBuffer(), tVar.m() * 2);
        this.pathLastIndex = 0;
        e();
    }

    private final void b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void e() {
        if (this.path[this.pathLastIndex].i()) {
            return;
        }
        for (int i11 = this.pathLastIndex; -1 < i11; i11--) {
            int i12 = i(i11);
            if (i12 == -1 && this.path[i11].j()) {
                this.path[i11].l();
                i12 = i(i11);
            }
            if (i12 != -1) {
                this.pathLastIndex = i12;
                return;
            }
            if (i11 > 0) {
                this.path[i11 - 1].l();
            }
            this.path[i11].m(t.INSTANCE.a().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private final int i(int pathIndex) {
        if (this.path[pathIndex].i()) {
            return pathIndex;
        }
        if (!this.path[pathIndex].j()) {
            return -1;
        }
        t<? extends K, ? extends V> tVarD = this.path[pathIndex].d();
        if (pathIndex == 6) {
            this.path[pathIndex + 1].m(tVarD.getBuffer(), tVarD.getBuffer().length);
        } else {
            this.path[pathIndex + 1].m(tVarD.getBuffer(), tVarD.m() * 2);
        }
        return i(pathIndex + 1);
    }

    protected final K d() {
        b();
        return this.path[this.pathLastIndex].b();
    }

    protected final u<K, V, T>[] h() {
        return this.path;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    protected final void j(int i11) {
        this.pathLastIndex = i11;
    }

    @Override // java.util.Iterator
    public T next() {
        b();
        T next = this.path[this.pathLastIndex].next();
        e();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
