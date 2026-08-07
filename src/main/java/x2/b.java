package x2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.collections.k;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import u2.f;
import w2.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001$B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010!¨\u0006%"}, d2 = {"Lx2/b;", "E", "Lkotlin/collections/k;", "Lu2/f;", "", "firstElement", "lastElement", "Lw2/d;", "Lx2/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lw2/d;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Lu2/f;", "remove", "", "iterator", "()Ljava/util/Iterator;", "b", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "c", "getLastElement$runtime_release", DateTokenConverter.CONVERTER_KEY, "Lw2/d;", "getHashMap$runtime_release", "()Lw2/d;", "", "()I", "size", "e", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<E> extends k<E> implements f<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f122695f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f122696g;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object firstElement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lastElement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d<E, a> hashMap;

    /* JADX INFO: renamed from: x2.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx2/b$a;", "", "<init>", "()V", "E", "Lu2/f;", "a", "()Lu2/f;", "Lx2/b;", "", "EMPTY", "Lx2/b;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E> f<E> a() {
            return b.f122696g;
        }

        private Companion() {
        }
    }

    static {
        y2.c cVar = y2.c.f124654a;
        f122696g = new b(cVar, cVar, d.INSTANCE.a());
    }

    public b(Object obj, Object obj2, d<E, a> dVar) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = dVar;
    }

    @Override // java.util.Collection, java.util.Set, u2.f
    public f<E> add(E element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new b(element, element, this.hashMap.t(element, new a()));
        }
        Object obj = this.lastElement;
        a aVar = this.hashMap.get((E) obj);
        s.h(aVar);
        return new b(this.firstElement, element, this.hashMap.t((E) obj, aVar.e(element)).t(element, new a(obj)));
    }

    @Override // p013kotlin.collections.b, java.util.Collection
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    @Override // p013kotlin.collections.b
    /* JADX INFO: renamed from: d */
    public int get_size() {
        return this.hashMap.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new c(this.firstElement, this.hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, u2.f
    public f<E> remove(E element) {
        a aVar = this.hashMap.get(element);
        if (aVar == null) {
            return this;
        }
        d dVarU = this.hashMap.u(element);
        if (aVar.b()) {
            V v11 = dVarU.get(aVar.getPrevious());
            s.h(v11);
            dVarU = dVarU.t(aVar.getPrevious(), ((a) v11).e(aVar.getNext()));
        }
        if (aVar.a()) {
            V v12 = dVarU.get(aVar.getNext());
            s.h(v12);
            dVarU = dVarU.t(aVar.getNext(), ((a) v12).f(aVar.getPrevious()));
        }
        return new b(!aVar.b() ? aVar.getNext() : this.firstElement, !aVar.a() ? aVar.getPrevious() : this.lastElement, dVarU);
    }
}
