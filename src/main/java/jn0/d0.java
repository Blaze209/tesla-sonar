package jn0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006-"}, d2 = {"Ljn0/d0;", "", "Ljn0/c0;", "", "size", DateTokenConverter.CONVERTER_KEY, "(I)[J", "", PlaceTypes.STORAGE, "e", "([J)[J", "index", "l", "([JI)J", "value", "Ljn0/h0;", "r", "([JIJ)V", "", "q", "([J)Ljava/util/Iterator;", "element", "", IntegerTokenConverter.CONVERTER_KEY, "([JJ)Z", "elements", "j", "([JLjava/util/Collection;)Z", "p", "([J)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[J", "getStorage$annotations", "()V", "n", "([J)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@vn0.b
public final class d0 implements Collection<c0>, xn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long[] storage;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljn0/d0$a;", "", "Ljn0/c0;", "", "array", "<init>", "([J)V", "", "hasNext", "()Z", "b", "()J", "a", "[J", "", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements Iterator<c0>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long[] array;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        public a(long[] array) {
            p013kotlin.jvm.internal.s.k(array, "array");
            this.array = array;
        }

        public long b() {
            int i11 = this.index;
            long[] jArr = this.array;
            if (i11 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i11 + 1;
            return c0.b(jArr[i11]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ c0 next() {
            return c0.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ d0(long[] jArr) {
        this.storage = jArr;
    }

    public static final /* synthetic */ d0 b(long[] jArr) {
        return new d0(jArr);
    }

    public static long[] d(int i11) {
        return e(new long[i11]);
    }

    public static long[] e(long[] storage) {
        p013kotlin.jvm.internal.s.k(storage, "storage");
        return storage;
    }

    public static boolean i(long[] jArr, long j11) {
        return p013kotlin.collections.n.d0(jArr, j11);
    }

    public static boolean j(long[] jArr, Collection<c0> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        Collection<c0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof c0) || !p013kotlin.collections.n.d0(jArr, ((c0) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(long[] jArr, Object obj) {
        return (obj instanceof d0) && p013kotlin.jvm.internal.s.f(jArr, ((d0) obj).getStorage());
    }

    public static final long l(long[] jArr, int i11) {
        return c0.b(jArr[i11]);
    }

    public static int n(long[] jArr) {
        return jArr.length;
    }

    public static int o(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean p(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator<c0> q(long[] jArr) {
        return new a(jArr);
    }

    public static final void r(long[] jArr, int i11, long j11) {
        jArr[i11] = j11;
    }

    public static String s(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(c0 c0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends c0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof c0) {
            return h(((c0) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        return j(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return k(this.storage, other);
    }

    public boolean h(long j11) {
        return i(this.storage, j11);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return o(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return p(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<c0> iterator() {
        return q(this.storage);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final /* synthetic */ long[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return p013kotlin.jvm.internal.j.a(this);
    }

    public String toString() {
        return s(this.storage);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        p013kotlin.jvm.internal.s.k(array, "array");
        return (T[]) p013kotlin.jvm.internal.j.b(this, array);
    }
}
