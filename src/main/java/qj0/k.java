package qj0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class k<T> implements e<Set<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e<Set<Object>> f105609c = f.a(Collections.EMPTY_SET);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<i<T>> f105610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<i<Collection<T>>> f105611b;

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<i<T>> f105612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<i<Collection<T>>> f105613b;

        public b<T> a(i<? extends Collection<? extends T>> iVar) {
            this.f105613b.add(iVar);
            return this;
        }

        public b<T> b(i<? extends T> iVar) {
            this.f105612a.add(iVar);
            return this;
        }

        public k<T> c() {
            return new k<>(this.f105612a, this.f105613b);
        }

        private b(int i11, int i12) {
            this.f105612a = qj0.b.d(i11);
            this.f105613b = qj0.b.d(i12);
        }
    }

    public static <T> b<T> a(int i11, int i12) {
        return new b<>(i11, i12);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f105610a.size();
        ArrayList arrayList = new ArrayList(this.f105611b.size());
        int size2 = this.f105611b.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Collection<T> collection = this.f105611b.get(i11).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetB = qj0.b.b(size);
        int size3 = this.f105610a.size();
        for (int i12 = 0; i12 < size3; i12++) {
            hashSetB.add(h.b(this.f105610a.get(i12).get()));
        }
        int size4 = arrayList.size();
        for (int i13 = 0; i13 < size4; i13++) {
            Iterator it = ((Collection) arrayList.get(i13)).iterator();
            while (it.hasNext()) {
                hashSetB.add(h.b(it.next()));
            }
        }
        return Collections.unmodifiableSet(hashSetB);
    }

    private k(List<i<T>> list, List<i<Collection<T>>> list2) {
        this.f105610a = list;
        this.f105611b = list2;
    }
}
