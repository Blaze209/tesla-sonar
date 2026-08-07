package p013kotlin.reflect.jvm.internal.impl.platform;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import p013kotlin.jvm.internal.j;
import p013kotlin.jvm.internal.s;
import xn0.a;

/* JADX INFO: loaded from: classes9.dex */
public class TargetPlatform implements Collection<SimplePlatform>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<SimplePlatform> f88240a;

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(SimplePlatform simplePlatform) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends SimplePlatform> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(SimplePlatform element) {
        s.k(element, "element");
        return this.f88240a.contains(element);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        s.k(elements, "elements");
        return this.f88240a.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TargetPlatform) && s.f(this.f88240a, ((TargetPlatform) obj).f88240a);
    }

    public final Set<SimplePlatform> getComponentPlatforms() {
        return this.f88240a;
    }

    public int getSize() {
        return this.f88240a.size();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f88240a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f88240a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<SimplePlatform> iterator() {
        return this.f88240a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super SimplePlatform> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return j.a(this);
    }

    public String toString() {
        return PlatformUtilKt.getPresentableDescription(this);
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SimplePlatform) {
            return contains((SimplePlatform) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        s.k(array, "array");
        return (T[]) j.b(this, array);
    }
}
