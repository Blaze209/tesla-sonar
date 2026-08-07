package no0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lno0/i;", "T", "Lno0/v;", "", "predicates", "<init>", "(Ljava/util/List;)V", "value", "", "test", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class i<T> implements v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<v<T>> predicates;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends v<? super T>> predicates) {
        p013kotlin.jvm.internal.s.k(predicates, "predicates");
        this.predicates = predicates;
    }

    @Override // no0.v
    public boolean test(T value) {
        List<v<T>> list = this.predicates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((v) it.next()).test(value)) {
                return false;
            }
        }
        return true;
    }
}
