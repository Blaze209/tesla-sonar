package androidx.collection;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0013\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00017B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u0013J\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001aJ\u0015\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140 ¢\u0006\u0004\b!\u0010\"J'\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 \"\u0004\b\u0001\u0010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b!\u0010%J\u001a\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b'\u0010\u0013J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00101\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b1\u00102J\u001d\u00103\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b3\u00102J\u001d\u00104\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b4\u00102J\u001d\u00105\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b5\u00102R\"\u0010=\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010)\"\u0004\bE\u0010\u0007R\u0014\u0010H\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010)¨\u0006I"}, d2 = {"Landroidx/collection/b;", "E", "", "", "", "capacity", "<init>", "(I)V", "", "set", "(Ljava/util/Collection;)V", "Ljn0/h0;", "clear", "()V", "minimumCapacity", "b", "element", "", "contains", "(Ljava/lang/Object;)Z", "", Action.KEY_ATTRIBUTE, "indexOf", "(Ljava/lang/Object;)I", "index", "n", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "remove", "j", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", "a", "[I", "e", "()[I", "l", "([I)V", "hashes", "[Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "k", "([Ljava/lang/Object;)V", "c", "I", IntegerTokenConverter.CONVERTER_KEY, "m", "_size", "h", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<E> implements Collection<E>, Set<E>, xn0.b, xn0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] array;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int _size;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/collection/b$a;", "Landroidx/collection/k;", "<init>", "(Landroidx/collection/b;)V", "", "index", "b", "(I)Ljava/lang/Object;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(I)V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a extends k<E> {
        public a() {
            super(b.this.i());
        }

        @Override // androidx.collection.k
        protected E b(int index) {
            return b.this.n(index);
        }

        @Override // androidx.collection.k
        protected void d(int index) {
            b.this.j(index);
        }
    }

    public b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i11;
        int iC;
        int i12 = i();
        if (element == null) {
            iC = d.d(this);
            i11 = 0;
        } else {
            int iHashCode = element.hashCode();
            i11 = iHashCode;
            iC = d.c(this, element, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i13 = ~iC;
        if (i12 >= getHashes().length) {
            int i14 = 8;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i14 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            d.a(this, i14);
            if (i12 != i()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                p013kotlin.collections.n.s(hashes, getHashes(), 0, 0, hashes.length, 6, null);
                p013kotlin.collections.n.t(array, getArray(), 0, 0, array.length, 6, null);
            }
        }
        if (i13 < i12) {
            int i15 = i13 + 1;
            p013kotlin.collections.n.n(getHashes(), getHashes(), i15, i13, i12);
            p013kotlin.collections.n.p(getArray(), getArray(), i15, i13, i12);
        }
        if (i12 != i() || i13 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i13] = i11;
        getArray()[i13] = element;
        m(i() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        b(i() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int minimumCapacity) {
        int i11 = i();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            d.a(this, minimumCapacity);
            if (i() > 0) {
                p013kotlin.collections.n.s(hashes, getHashes(), 0, 0, i(), 6, null);
                p013kotlin.collections.n.t(array, getArray(), 0, 0, i(), 6, null);
            }
        }
        if (i() != i11) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (i() != 0) {
            l(n1.a.f92645a);
            k(n1.a.f92647c);
            m(0);
        }
        if (i() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set) || size() != ((Set) other).size()) {
            return false;
        }
        try {
            int i11 = i();
            for (int i12 = 0; i12 < i11; i12++) {
                if (!((Set) other).contains(n(i12))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int get_size() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int i11 = i();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += hashes[i13];
        }
        return i12;
    }

    public final int i() {
        return this._size;
    }

    public final int indexOf(Object key) {
        return key == null ? d.d(this) : d.c(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return i() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    public final E j(int index) {
        int i11;
        Object[] objArr;
        int i12 = i();
        E e11 = (E) getArray()[index];
        if (i12 <= 1) {
            clear();
            return e11;
        }
        int i13 = i12 - 1;
        if (getHashes().length <= 8 || i() >= getHashes().length / 3) {
            if (index < i13) {
                int i14 = index + 1;
                p013kotlin.collections.n.n(getHashes(), getHashes(), index, i14, i12);
                p013kotlin.collections.n.p(getArray(), getArray(), index, i14, i12);
            }
            getArray()[i13] = null;
        } else {
            int i15 = i() > 8 ? i() + (i() >> 1) : 8;
            int[] hashes = getHashes();
            Object[] array = getArray();
            d.a(this, i15);
            if (index > 0) {
                p013kotlin.collections.n.s(hashes, getHashes(), 0, 0, index, 6, null);
                objArr = array;
                p013kotlin.collections.n.t(objArr, getArray(), 0, 0, index, 6, null);
                i11 = index;
            } else {
                i11 = index;
                objArr = array;
            }
            if (i11 < i13) {
                int i16 = i11 + 1;
                p013kotlin.collections.n.n(hashes, getHashes(), i11, i16, i12);
                p013kotlin.collections.n.p(objArr, getArray(), i11, i16, i12);
            }
        }
        if (i12 != i()) {
            throw new ConcurrentModificationException();
        }
        m(i13);
        return e11;
    }

    public final void k(Object[] objArr) {
        p013kotlin.jvm.internal.s.k(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void l(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void m(int i11) {
        this._size = i11;
    }

    public final E n(int index) {
        return (E) getArray()[index];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        j(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        p013kotlin.jvm.internal.s.k(elements, "elements");
        boolean z11 = false;
        for (int i11 = i() - 1; -1 < i11; i11--) {
            if (!p013kotlin.collections.v.g0(elements, getArray()[i11])) {
                j(i11);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return p013kotlin.collections.n.w(this.array, 0, this._size);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i() * 14);
        sb2.append(CoreConstants.CURLY_LEFT);
        int i11 = i();
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            E eN = n(i12);
            if (eN != this) {
                sb2.append(eN);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public b(int i11) {
        this.hashes = n1.a.f92645a;
        this.array = n1.a.f92647c;
        if (i11 > 0) {
            d.a(this, i11);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        p013kotlin.jvm.internal.s.k(array, "array");
        T[] result = (T[]) c.a(array, this._size);
        p013kotlin.collections.n.p(this.array, result, 0, 0, this._size);
        p013kotlin.jvm.internal.s.j(result, "result");
        return result;
    }

    public /* synthetic */ b(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11);
    }

    public b(Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
