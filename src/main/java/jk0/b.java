package jk0;

import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
class b extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f83930a;

    b(d dVar) {
        this.f83930a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f83930a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f83930a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f83930a.j(1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f83930a.f83934b;
    }
}
