package jk0;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
class a extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f83929a;

    a(d dVar) {
        this.f83929a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f83929a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f83929a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f83929a.j(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int i11 = this.f83929a.f83934b;
        this.f83929a.remove(obj);
        return this.f83929a.f83934b != i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f83929a.f83934b;
    }
}
