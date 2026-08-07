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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006-"}, d2 = {"Ljn0/g0;", "", "Ljn0/f0;", "", "size", DateTokenConverter.CONVERTER_KEY, "(I)[S", "", PlaceTypes.STORAGE, "e", "([S)[S", "index", "l", "([SI)S", "value", "Ljn0/h0;", "r", "([SIS)V", "", "q", "([S)Ljava/util/Iterator;", "element", "", IntegerTokenConverter.CONVERTER_KEY, "([SS)Z", "elements", "j", "([SLjava/util/Collection;)Z", "p", "([S)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[S", "getStorage$annotations", "()V", "n", "([S)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@vn0.b
public final class g0 implements Collection<f0>, xn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final short[] storage;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Ljn0/g0$a;", "", "Ljn0/f0;", "", "array", "<init>", "([S)V", "", "hasNext", "()Z", "b", "()S", "a", "[S", "", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements Iterator<f0>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final short[] array;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        public a(short[] array) {
            p013kotlin.jvm.internal.s.k(array, "array");
            this.array = array;
        }

        public short b() {
            int i11 = this.index;
            short[] sArr = this.array;
            if (i11 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i11 + 1;
            return f0.b(sArr[i11]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ f0 next() {
            return f0.a(b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ g0(short[] sArr) {
        this.storage = sArr;
    }

    public static final /* synthetic */ g0 b(short[] sArr) {
        return new g0(sArr);
    }

    public static short[] d(int i11) {
        return e(new short[i11]);
    }

    public static short[] e(short[] storage) {
        p013kotlin.jvm.internal.s.k(storage, "storage");
        return storage;
    }

    public static boolean i(short[] sArr, short s11) {
        return p013kotlin.collections.n.f0(sArr, s11);
    }

    public static boolean j(short[] sArr, Collection<f0> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        Collection<f0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof f0) || !p013kotlin.collections.n.f0(sArr, ((f0) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(short[] sArr, Object obj) {
        return (obj instanceof g0) && p013kotlin.jvm.internal.s.f(sArr, ((g0) obj).getStorage());
    }

    public static final short l(short[] sArr, int i11) {
        return f0.b(sArr[i11]);
    }

    public static int n(short[] sArr) {
        return sArr.length;
    }

    public static int o(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean p(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator<f0> q(short[] sArr) {
        return new a(sArr);
    }

    public static final void r(short[] sArr, int i11, short s11) {
        sArr[i11] = s11;
    }

    public static String s(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(f0 f0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends f0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof f0) {
            return h(((f0) obj).getData());
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

    public boolean h(short s11) {
        return i(this.storage, s11);
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
    public Iterator<f0> iterator() {
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
    public final /* synthetic */ short[] getStorage() {
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
