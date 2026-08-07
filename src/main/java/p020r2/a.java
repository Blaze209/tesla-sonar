package p020r2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\"\u0004\b\u0017\u0010\u0005¨\u0006\u0019"}, d2 = {"Lr2/a;", "T", "Lr2/f;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "Ljn0/h0;", "h", IntegerTokenConverter.CONVERTER_KEY, "()V", "clear", "k", "a", "Ljava/lang/Object;", "j", "()Ljava/lang/Object;", "", "b", "Ljava/util/List;", "stack", "<set-?>", "c", "l", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<T> stack = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T current;

    public a(T t11) {
        this.root = t11;
        this.current = t11;
    }

    @Override // p020r2.f
    public T b() {
        return this.current;
    }

    @Override // p020r2.f
    public final void clear() {
        this.stack.clear();
        l(this.root);
        k();
    }

    @Override // p020r2.f
    public void h(T node) {
        this.stack.add(b());
        l(node);
    }

    @Override // p020r2.f
    public void i() {
        if (this.stack.isEmpty()) {
            a2.b("empty stack");
        }
        List<T> list = this.stack;
        l(list.remove(list.size() - 1));
    }

    public final T j() {
        return this.root;
    }

    protected abstract void k();

    protected void l(T t11) {
        this.current = t11;
    }
}
