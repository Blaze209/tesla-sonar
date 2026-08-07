package tf0;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import rf0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR%\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltf0/a;", "Ljava/util/Comparator;", "Lrf0/c;", "Lkotlin/Comparator;", "", "Ljava/lang/Class;", "order", "<init>", "(Ljava/util/List;)V", "o1", "o2", "", "a", "(Lrf0/c;Lrf0/c;)I", "Ljava/util/List;", "getOrder", "()Ljava/util/List;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
public final class a implements Comparator<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Class<? extends c>> order;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends Class<? extends c>> order) {
        s.k(order, "order");
        this.order = order;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c o11, c o12) {
        Object next;
        Class cls;
        if (o11 == null && o12 == null) {
            return 0;
        }
        if (o11 == null) {
            return -1;
        }
        if (o12 == null) {
            return 1;
        }
        Class<?> cls2 = o11.getClass();
        Class<?> cls3 = o12.getClass();
        if (s.f(cls2, cls3)) {
            return 0;
        }
        Iterator<T> it = this.order.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            cls = (Class) next;
            if (s.f(cls, cls2)) {
                break;
            }
        } while (!s.f(cls, cls3));
        return s.f((Class) next, cls2) ? -1 : 1;
    }
}
