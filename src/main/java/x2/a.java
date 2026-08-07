package x2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0017"}, d2 = {"Lx2/a;", "", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "newNext", "e", "(Ljava/lang/Object;)Lx2/a;", "newPrevious", "f", "a", "Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "b", "c", "", "()Z", "hasNext", "hasPrevious", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object previous;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object next;

    public a(Object obj, Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean a() {
        return this.next != y2.c.f124654a;
    }

    public final boolean b() {
        return this.previous != y2.c.f124654a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getPrevious() {
        return this.previous;
    }

    public final a e(Object newNext) {
        return new a(this.previous, newNext);
    }

    public final a f(Object newPrevious) {
        return new a(newPrevious, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a() {
        y2.c cVar = y2.c.f124654a;
        this(cVar, cVar);
    }

    public a(Object obj) {
        this(obj, y2.c.f124654a);
    }
}
