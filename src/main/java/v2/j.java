package v2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\f\b\u0000\u0018\u0000 .*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\"J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lv2/j;", "E", "Lu2/c;", "Lv2/b;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "", "size", IntegerTokenConverter.CONVERTER_KEY, "(I)[Ljava/lang/Object;", "element", "Lu2/e;", "add", "(Ljava/lang/Object;)Lu2/e;", "", "elements", "addAll", "(Ljava/util/Collection;)Lu2/e;", "Lkotlin/Function1;", "", "predicate", "b0", "(Lwn0/l;)Lu2/e;", "index", "(ILjava/lang/Object;)Lu2/e;", "d2", "(I)Lu2/e;", "Lu2/e$a;", "builder", "()Lu2/e$a;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "b", "[Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()I", "c", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j<E> extends b<E> implements u2.c<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f117633d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j f117634e = new j(new Object[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object[] buffer;

    /* JADX INFO: renamed from: v2.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv2/j$a;", "", "<init>", "()V", "Lv2/j;", "", "EMPTY", "Lv2/j;", "a", "()Lv2/j;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f117634e;
        }

        private Companion() {
        }
    }

    public j(Object[] objArr) {
        this.buffer = objArr;
        y2.a.a(objArr.length <= 32);
    }

    private final Object[] i(int size) {
        return new Object[size];
    }

    @Override // java.util.Collection, java.util.List, u2.e
    public u2.e<E> add(E element) {
        if (size() >= 32) {
            return new e(this.buffer, l.c(element), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
        s.j(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = element;
        return new j(objArrCopyOf);
    }

    @Override // v2.b, java.util.Collection, java.util.List, u2.e
    public u2.e<E> addAll(Collection<? extends E> elements) {
        if (size() + elements.size() > 32) {
            u2.e.a<E> aVarBuilder = builder();
            aVarBuilder.addAll(elements);
            return aVarBuilder.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + elements.size());
        s.j(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new j(objArrCopyOf);
    }

    @Override // u2.e
    public u2.e<E> b0(wn0.l<? super E, Boolean> predicate) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size2; i11++) {
            Object obj = this.buffer[i11];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z11) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    s.j(objArrCopyOf, "copyOf(this, size)");
                    z11 = true;
                    size = i11;
                }
            } else if (z11) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f117634e : new j(n.w(objArrCopyOf, 0, size));
    }

    @Override // u2.e
    public u2.e.a<E> builder() {
        return new f(this, null, this.buffer, 0);
    }

    @Override // p013kotlin.collections.b
    /* JADX INFO: renamed from: d */
    public int getSize() {
        return this.buffer.length;
    }

    @Override // u2.e
    public u2.e<E> d2(int index) {
        y2.d.a(index, size());
        if (size() == 1) {
            return f117634e;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        s.j(objArrCopyOf, "copyOf(this, newSize)");
        n.p(this.buffer, objArrCopyOf, index, index + 1, size());
        return new j(objArrCopyOf);
    }

    @Override // p013kotlin.collections.d, java.util.List
    public E get(int index) {
        y2.d.a(index, size());
        return (E) this.buffer[index];
    }

    @Override // p013kotlin.collections.d, java.util.List
    public int indexOf(Object element) {
        return n.C0(this.buffer, element);
    }

    @Override // p013kotlin.collections.d, java.util.List
    public int lastIndexOf(Object element) {
        return n.X0(this.buffer, element);
    }

    @Override // p013kotlin.collections.d, java.util.List
    public ListIterator<E> listIterator(int index) {
        y2.d.b(index, size());
        return new c(this.buffer, index, size());
    }

    @Override // p013kotlin.collections.d, java.util.List
    public u2.e<E> set(int index, E element) {
        y2.d.a(index, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        s.j(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[index] = element;
        return new j(objArrCopyOf);
    }

    @Override // java.util.List, u2.e
    public u2.e<E> add(int index, E element) {
        y2.d.b(index, size());
        if (index == size()) {
            return add((Object) element);
        }
        if (size() < 32) {
            Object[] objArrI = i(size() + 1);
            n.t(this.buffer, objArrI, 0, 0, index, 6, null);
            n.p(this.buffer, objArrI, index + 1, index, size());
            objArrI[index] = element;
            return new j(objArrI);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        s.j(objArrCopyOf, "copyOf(this, size)");
        n.p(this.buffer, objArrCopyOf, index + 1, index, size() - 1);
        objArrCopyOf[index] = element;
        return new e(objArrCopyOf, l.c(this.buffer[31]), size() + 1, 0);
    }
}
