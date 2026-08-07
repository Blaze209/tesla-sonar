package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0011\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\rJ\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010(J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b/\u00101J%\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020#H\u0016¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0005¢\u0006\u0004\b6\u0010\u0004R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u000108078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010=R\u0016\u0010A\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010F\u001a\u00020#2\u0006\u0010B\u001a\u00020#8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010ER\"\u0010L\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010\r\"\u0004\bJ\u0010K\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Lb4/u;", "", "Landroidx/compose/ui/d$c;", "<init>", "()V", "Ljn0/h0;", "u", "Lb4/q;", "k", "()J", "j", "", "o", "()Z", "b", "", "distanceFromEdge", "isInLayer", "s", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "p", "(Landroidx/compose/ui/d$c;ZLwn0/a;)V", "q", "(Landroidx/compose/ui/d$c;FZLwn0/a;)V", "v", "element", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/d$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "l", "(I)Landroidx/compose/ui/d$c;", "r", "(Landroidx/compose/ui/d$c;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "t", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "", "", "a", "[Ljava/lang/Object;", "values", "", "[J", "distanceFromEdgeAndInLayer", "c", "I", "hitDepth", "<set-?>", DateTokenConverter.CONVERTER_KEY, "n", "()I", "size", "e", "Z", "m", "setShouldSharePointerInputWithSibling", "(Z)V", "shouldSharePointerInputWithSibling", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u implements List<androidx.compose.ui.d.c>, xn0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object[] values = new Object[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long[] distanceFromEdgeAndInLayer = new long[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int hitDepth = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean shouldSharePointerInputWithSibling = true;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, d2 = {"Lb4/u$b;", "", "Landroidx/compose/ui/d$c;", "", "minIndex", "maxIndex", "<init>", "(Lb4/u;II)V", "element", "", "b", "(Landroidx/compose/ui/d$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", DateTokenConverter.CONVERTER_KEY, "(I)Landroidx/compose/ui/d$c;", "h", "(Landroidx/compose/ui/d$c;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", IntegerTokenConverter.CONVERTER_KEY, "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "I", "getMinIndex", "()I", "getMaxIndex", "e", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b implements List<androidx.compose.ui.d.c>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public b(int i11, int i12) {
            this.minIndex = i11;
            this.maxIndex = i12;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i11, androidx.compose.ui.d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i11, Collection<? extends androidx.compose.ui.d.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean b(androidx.compose.ui.d.c element) {
            return indexOf(element) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof androidx.compose.ui.d.c) {
                return b((androidx.compose.ui.d.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((androidx.compose.ui.d.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.d.c get(int index) {
            Object obj = u.this.values[index + this.minIndex];
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.d.c) obj;
        }

        public int e() {
            return this.maxIndex - this.minIndex;
        }

        public int h(androidx.compose.ui.d.c element) {
            int i11 = this.minIndex;
            int i12 = this.maxIndex;
            if (i11 > i12) {
                return -1;
            }
            while (!p013kotlin.jvm.internal.s.f(u.this.values[i11], element)) {
                if (i11 == i12) {
                    return -1;
                }
                i11++;
            }
            return i11 - this.minIndex;
        }

        public int i(androidx.compose.ui.d.c element) {
            int i11 = this.maxIndex;
            int i12 = this.minIndex;
            if (i12 > i11) {
                return -1;
            }
            while (!p013kotlin.jvm.internal.s.f(u.this.values[i11], element)) {
                if (i11 == i12) {
                    return -1;
                }
                i11--;
            }
            return i11 - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.d.c) {
                return h((androidx.compose.ui.d.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<androidx.compose.ui.d.c> iterator() {
            u uVar = u.this;
            int i11 = this.minIndex;
            return uVar.new a(i11, i11, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof androidx.compose.ui.d.c) {
                return i((androidx.compose.ui.d.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<androidx.compose.ui.d.c> listIterator() {
            u uVar = u.this;
            int i11 = this.minIndex;
            return uVar.new a(i11, i11, this.maxIndex);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.d.c remove(int i11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<androidx.compose.ui.d.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ androidx.compose.ui.d.c set(int i11, androidx.compose.ui.d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return e();
        }

        @Override // java.util.List
        public void sort(Comparator<? super androidx.compose.ui.d.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<androidx.compose.ui.d.c> subList(int fromIndex, int toIndex) {
            u uVar = u.this;
            int i11 = this.minIndex;
            return uVar.new b(fromIndex + i11, i11 + toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return p013kotlin.jvm.internal.j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends androidx.compose.ui.d.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<androidx.compose.ui.d.c> listIterator(int index) {
            u uVar = u.this;
            int i11 = this.minIndex;
            return uVar.new a(index + i11, i11, this.maxIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) p013kotlin.jvm.internal.j.b(this, tArr);
        }
    }

    private final void j() {
        int i11 = this.hitDepth;
        Object[] objArr = this.values;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            p013kotlin.jvm.internal.s.j(jArrCopyOf, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = jArrCopyOf;
        }
    }

    private final long k() {
        long jA = v.a(Float.POSITIVE_INFINITY, false);
        int i11 = this.hitDepth + 1;
        int iO = p013kotlin.collections.v.o(this);
        if (i11 <= iO) {
            while (true) {
                long jB = q.b(this.distanceFromEdgeAndInLayer[i11]);
                if (q.a(jB, jA) < 0) {
                    jA = jB;
                }
                if ((q.c(jA) < BitmapDescriptorFactory.HUE_RED && q.d(jA)) || i11 == iO) {
                    break;
                }
                i11++;
            }
        }
        return jA;
    }

    private final void u() {
        int i11 = this.hitDepth + 1;
        int iO = p013kotlin.collections.v.o(this);
        if (i11 <= iO) {
            while (true) {
                this.values[i11] = null;
                if (i11 == iO) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.size = this.hitDepth + 1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i11, androidx.compose.ui.d.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends androidx.compose.ui.d.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        u();
        this.shouldSharePointerInputWithSibling = true;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof androidx.compose.ui.d.c) {
            return i((androidx.compose.ui.d.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((androidx.compose.ui.d.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean i(androidx.compose.ui.d.c element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.d.c) {
            return r((androidx.compose.ui.d.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<androidx.compose.ui.d.c> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.d.c get(int index) {
        Object obj = this.values[index];
        p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (androidx.compose.ui.d.c) obj;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof androidx.compose.ui.d.c) {
            return t((androidx.compose.ui.d.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<androidx.compose.ui.d.c> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShouldSharePointerInputWithSibling() {
        return this.shouldSharePointerInputWithSibling;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public final boolean o() {
        long jK = k();
        return q.c(jK) < BitmapDescriptorFactory.HUE_RED && q.d(jK);
    }

    public final void p(androidx.compose.ui.d.c node, boolean isInLayer, wn0.a<jn0.h0> childHitTest) {
        q(node, -1.0f, isInLayer, childHitTest);
        z0 coordinator = node.getCoordinator();
        if (coordinator == null || coordinator.p3()) {
            return;
        }
        this.shouldSharePointerInputWithSibling = false;
    }

    public final void q(androidx.compose.ui.d.c node, float distanceFromEdge, boolean isInLayer, wn0.a<jn0.h0> childHitTest) {
        int i11 = this.hitDepth;
        this.hitDepth = i11 + 1;
        j();
        Object[] objArr = this.values;
        int i12 = this.hitDepth;
        objArr[i12] = node;
        this.distanceFromEdgeAndInLayer[i12] = v.a(distanceFromEdge, isInLayer);
        u();
        childHitTest.invoke();
        this.hitDepth = i11;
    }

    public int r(androidx.compose.ui.d.c element) {
        int iO = p013kotlin.collections.v.o(this);
        if (iO < 0) {
            return -1;
        }
        int i11 = 0;
        while (!p013kotlin.jvm.internal.s.f(this.values[i11], element)) {
            if (i11 == iO) {
                return -1;
            }
            i11++;
        }
        return i11;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.d.c remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<androidx.compose.ui.d.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean s(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == p013kotlin.collections.v.o(this)) {
            return true;
        }
        return q.a(k(), v.a(distanceFromEdge, isInLayer)) > 0;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ androidx.compose.ui.d.c set(int i11, androidx.compose.ui.d.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super androidx.compose.ui.d.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<androidx.compose.ui.d.c> subList(int fromIndex, int toIndex) {
        return new b(fromIndex, toIndex);
    }

    public int t(androidx.compose.ui.d.c element) {
        for (int iO = p013kotlin.collections.v.o(this); -1 < iO; iO--) {
            if (p013kotlin.jvm.internal.s.f(this.values[iO], element)) {
                return iO;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return p013kotlin.jvm.internal.j.a(this);
    }

    public final void v(androidx.compose.ui.d.c node, float distanceFromEdge, boolean isInLayer, wn0.a<jn0.h0> childHitTest) {
        if (this.hitDepth == p013kotlin.collections.v.o(this)) {
            q(node, distanceFromEdge, isInLayer, childHitTest);
            if (this.hitDepth + 1 == p013kotlin.collections.v.o(this)) {
                u();
                return;
            }
            return;
        }
        long jK = k();
        int i11 = this.hitDepth;
        this.hitDepth = p013kotlin.collections.v.o(this);
        q(node, distanceFromEdge, isInLayer, childHitTest);
        if (this.hitDepth + 1 < p013kotlin.collections.v.o(this) && q.a(jK, k()) > 0) {
            int i12 = this.hitDepth + 1;
            int i13 = i11 + 1;
            Object[] objArr = this.values;
            p013kotlin.collections.n.p(objArr, objArr, i13, i12, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            p013kotlin.collections.n.o(jArr, jArr, i13, i12, size());
            this.hitDepth = ((size() + i11) - this.hitDepth) - 1;
        }
        u();
        this.hitDepth = i11;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends androidx.compose.ui.d.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<androidx.compose.ui.d.c> listIterator(int index) {
        return new a(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p013kotlin.jvm.internal.j.b(this, tArr);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"Lb4/u$a;", "", "Landroidx/compose/ui/d$c;", "", "index", "minIndex", "maxIndex", "<init>", "(Lb4/u;III)V", "", "hasNext", "()Z", "hasPrevious", "b", "()Landroidx/compose/ui/d$c;", "nextIndex", "()I", DateTokenConverter.CONVERTER_KEY, "previousIndex", "a", "I", "getIndex", "setIndex", "(I)V", "getMinIndex", "c", "getMaxIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements ListIterator<androidx.compose.ui.d.c>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public a(int i11, int i12, int i13) {
            this.index = i11;
            this.minIndex = i12;
            this.maxIndex = i13;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(androidx.compose.ui.d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.d.c next() {
            Object[] objArr = u.this.values;
            int i11 = this.index;
            this.index = i11 + 1;
            Object obj = objArr[i11];
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.d.c) obj;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public androidx.compose.ui.d.c previous() {
            Object[] objArr = u.this.values;
            int i11 = this.index - 1;
            this.index = i11;
            Object obj = objArr[i11];
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (androidx.compose.ui.d.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(androidx.compose.ui.d.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(u uVar, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? uVar.size() : i13);
        }
    }
}
