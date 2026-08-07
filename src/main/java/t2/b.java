package t2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.j;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0010\f\u0019B!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\rJ\u001b\u0010#\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b#\u0010\u001cJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000b¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010(J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b/\u0010*J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\rJ\u001b\u00101\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b1\u0010\u001cJ\u0015\u00102\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u0006H\u0001¢\u0006\u0004\b9\u0010&J\u001b\u0010:\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b:\u0010\u001cJ \u0010;\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b;\u0010<J%\u0010@\u001a\u00020\u000f2\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00028\u00000=j\b\u0012\u0004\u0012\u00028\u0000`>¢\u0006\u0004\b@\u0010AR0\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010B\u0012\u0004\bG\u0010!\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010HR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lt2/b;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "element", "", "b", "(Ljava/lang/Object;)Z", "index", "Ljn0/h0;", "a", "(ILjava/lang/Object;)V", "", "elements", DateTokenConverter.CONVERTER_KEY, "(ILjava/util/List;)Z", "e", "(ILt2/b;)Z", "", "c", "(ILjava/util/Collection;)Z", "f", "(Ljava/util/Collection;)Z", "", "g", "()Ljava/util/List;", "h", "()V", IntegerTokenConverter.CONVERTER_KEY, "j", "capacity", "k", "(I)V", "l", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)I", "p", "()Z", "q", "r", "s", "t", "u", "v", "(I)Ljava/lang/Object;", "start", "end", "w", "(II)V", "newSize", "z", "x", "y", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "A", "(Ljava/util/Comparator;)V", "[Ljava/lang/Object;", "m", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", "Ljava/util/List;", "list", "<set-?>", "I", "n", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<T> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f112081d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private T[] content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<T> list;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lt2/b$a;", "T", "", "Lt2/b;", "vector", "<init>", "(Lt2/b;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Ljn0/h0;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", DateTokenConverter.CONVERTER_KEY, "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Lt2/b;", "b", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<T> implements List<T>, xn0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b<T> vector;

        public a(b<T> bVar) {
            this.vector = bVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            return this.vector.b(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            return this.vector.c(index, elements);
        }

        public int b() {
            return this.vector.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.h();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.i(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            return this.vector.j(elements);
        }

        public T d(int index) {
            t2.c.c(this, index);
            return this.vector.v(index);
        }

        @Override // java.util.List
        public T get(int index) {
            t2.c.c(this, index);
            return this.vector.m()[index];
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.o(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.p();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.s(element);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return d(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            return this.vector.u(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            return this.vector.x(elements);
        }

        @Override // java.util.List
        public T set(int index, T element) {
            t2.c.c(this, index);
            return this.vector.y(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            t2.c.d(this, fromIndex, toIndex);
            return new C2390b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return j.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.vector.a(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            return this.vector.f(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new c(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.t(element);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) j.b(this, tArr);
        }
    }

    /* JADX INFO: renamed from: t2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0015\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00107\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00106¨\u00068"}, d2 = {"Lt2/b$b;", "T", "", "list", "", "start", "end", "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "Ljn0/h0;", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", DateTokenConverter.CONVERTER_KEY, "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "Ljava/util/List;", "b", "I", "c", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class C2390b<T> implements List<T>, xn0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int start;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int end;

        public C2390b(List<T> list, int i11, int i12) {
            this.list = list;
            this.start = i11;
            this.end = i12;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T element) {
            List<T> list = this.list;
            int i11 = this.end;
            this.end = i11 + 1;
            list.add(i11, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection<? extends T> elements) {
            this.list.addAll(index + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        public int b() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i11 = this.end - 1;
            int i12 = this.start;
            if (i12 <= i11) {
                while (true) {
                    this.list.remove(i11);
                    if (i11 == i12) {
                        break;
                    } else {
                        i11--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i11 = this.end;
            for (int i12 = this.start; i12 < i11; i12++) {
                if (s.f(this.list.get(i12), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public T d(int index) {
            t2.c.c(this, index);
            T tRemove = this.list.remove(index + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List
        public T get(int index) {
            t2.c.c(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i11 = this.end;
            for (int i12 = this.start; i12 < i11; i12++) {
                if (s.f(this.list.get(i12), element)) {
                    return i12 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i11 = this.end - 1;
            int i12 = this.start;
            if (i12 > i11) {
                return -1;
            }
            while (!s.f(this.list.get(i11), element)) {
                if (i11 == i12) {
                    return -1;
                }
                i11--;
            }
            return i11 - this.start;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return d(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            int i11 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i11 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            int i11 = this.end;
            int i12 = i11 - 1;
            int i13 = this.start;
            if (i13 <= i12) {
                while (true) {
                    if (!elements.contains(this.list.get(i12))) {
                        this.list.remove(i12);
                        this.end--;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12--;
                }
            }
            return i11 != this.end;
        }

        @Override // java.util.List
        public T set(int index, T element) {
            t2.c.c(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List<T> subList(int fromIndex, int toIndex) {
            t2.c.d(this, fromIndex, toIndex);
            return new C2390b(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return j.a(this);
        }

        @Override // java.util.List
        public void add(int index, T element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int index) {
            return new c(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i11 = this.end;
            for (int i12 = this.start; i12 < i11; i12++) {
                if (s.f(this.list.get(i12), element)) {
                    this.list.remove(i12);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) j.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lt2/b$c;", "T", "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ljn0/h0;", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", "add", "(Ljava/lang/Object;)V", "set", "a", "Ljava/util/List;", "b", "I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c<T> implements ListIterator<T>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<T> list;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        public c(List<T> list, int i11) {
            this.list = list;
            this.index = i11;
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i11 = this.index;
            this.index = i11 + 1;
            return list.get(i11);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i11 = this.index - 1;
            this.index = i11;
            return this.list.get(i11);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i11 = this.index - 1;
            this.index = i11;
            this.list.remove(i11);
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.list.set(this.index, element);
        }
    }

    public b(T[] tArr, int i11) {
        this.content = tArr;
        this.size = i11;
    }

    public final void A(Comparator<T> comparator) {
        n.S(this.content, comparator, 0, this.size);
    }

    public final void a(int index, T element) {
        k(this.size + 1);
        T[] tArr = this.content;
        int i11 = this.size;
        if (index != i11) {
            n.p(tArr, tArr, index + 1, index, i11);
        }
        tArr[index] = element;
        this.size++;
    }

    public final boolean b(T element) {
        k(this.size + 1);
        T[] tArr = this.content;
        int i11 = this.size;
        tArr[i11] = element;
        this.size = i11 + 1;
        return true;
    }

    public final boolean c(int index, Collection<? extends T> elements) {
        int i11 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        k(this.size + elements.size());
        T[] tArr = this.content;
        if (index != this.size) {
            n.p(tArr, tArr, elements.size() + index, index, this.size);
        }
        for (T t11 : elements) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            tArr[i11 + index] = t11;
            i11 = i12;
        }
        this.size += elements.size();
        return true;
    }

    public final boolean d(int index, List<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        k(this.size + elements.size());
        T[] tArr = this.content;
        if (index != this.size) {
            n.p(tArr, tArr, elements.size() + index, index, this.size);
        }
        int size = elements.size();
        for (int i11 = 0; i11 < size; i11++) {
            tArr[index + i11] = elements.get(i11);
        }
        this.size += elements.size();
        return true;
    }

    public final boolean e(int index, b<T> elements) {
        if (elements.p()) {
            return false;
        }
        k(this.size + elements.size);
        T[] tArr = this.content;
        int i11 = this.size;
        if (index != i11) {
            n.p(tArr, tArr, elements.size + index, index, i11);
        }
        n.p(elements.content, tArr, index, 0, elements.size);
        this.size += elements.size;
        return true;
    }

    public final boolean f(Collection<? extends T> elements) {
        return c(this.size, elements);
    }

    public final List<T> g() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.list = aVar;
        return aVar;
    }

    public final void h() {
        T[] tArr = this.content;
        int size = getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this.size = 0;
                return;
            }
            tArr[size] = null;
        }
    }

    public final boolean i(T element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i11 = 0; !s.f(m()[i11], element); i11++) {
                if (i11 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean j(Collection<? extends T> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!i(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void k(int capacity) {
        T[] tArr = this.content;
        if (tArr.length < capacity) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(capacity, tArr.length * 2));
            s.j(tArr2, "copyOf(this, newSize)");
            this.content = tArr2;
        }
    }

    public final T l() {
        if (p()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return m()[0];
    }

    public final T[] m() {
        return this.content;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final int o(T element) {
        int i11 = this.size;
        if (i11 <= 0) {
            return -1;
        }
        T[] tArr = this.content;
        int i12 = 0;
        while (!s.f(element, tArr[i12])) {
            i12++;
            if (i12 >= i11) {
                return -1;
            }
        }
        return i12;
    }

    public final boolean p() {
        return this.size == 0;
    }

    public final boolean q() {
        return this.size != 0;
    }

    public final T r() {
        if (p()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return m()[getSize() - 1];
    }

    public final int s(T element) {
        int i11 = this.size;
        if (i11 <= 0) {
            return -1;
        }
        int i12 = i11 - 1;
        T[] tArr = this.content;
        while (!s.f(element, tArr[i12])) {
            i12--;
            if (i12 < 0) {
                return -1;
            }
        }
        return i12;
    }

    public final boolean t(T element) {
        int iO = o(element);
        if (iO < 0) {
            return false;
        }
        v(iO);
        return true;
    }

    public final boolean u(Collection<? extends T> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i11 = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        return i11 != this.size;
    }

    public final T v(int index) {
        T[] tArr = this.content;
        T t11 = tArr[index];
        if (index != getSize() - 1) {
            n.p(tArr, tArr, index, index + 1, this.size);
        }
        int i11 = this.size - 1;
        this.size = i11;
        tArr[i11] = null;
        return t11;
    }

    public final void w(int start, int end) {
        if (end > start) {
            int i11 = this.size;
            if (end < i11) {
                T[] tArr = this.content;
                n.p(tArr, tArr, start, end, i11);
            }
            int i12 = this.size - (end - start);
            int size = getSize() - 1;
            if (i12 <= size) {
                int i13 = i12;
                while (true) {
                    this.content[i13] = null;
                    if (i13 == size) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            this.size = i12;
        }
    }

    public final boolean x(Collection<? extends T> elements) {
        int i11 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(m()[size])) {
                v(size);
            }
        }
        return i11 != this.size;
    }

    public final T y(int index, T element) {
        T[] tArr = this.content;
        T t11 = tArr[index];
        tArr[index] = element;
        return t11;
    }

    public final void z(int newSize) {
        this.size = newSize;
    }
}
