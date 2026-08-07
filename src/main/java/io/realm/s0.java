package io.realm;

import io.realm.internal.OsResults;
import io.realm.log.RealmLog;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes9.dex */
public class s0<E> extends x<E> {
    s0(a aVar, OsResults osResults, Class<E> cls) {
        this(aVar, osResults, (Class) cls, false);
    }

    private void h(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        this.f79176a.n();
        this.f79176a.f78899e.capabilities.c("Listeners cannot be used on current thread.");
    }

    private void i(Object obj, boolean z11) {
        if (z11 && obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        if (this.f79176a.isClosed()) {
            RealmLog.g("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.f79176a.f78897c.k());
        }
    }

    @Override // io.realm.x
    public /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.x, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        super.add(i11, obj);
    }

    @Override // io.realm.x, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int i11, Collection collection) {
        return super.addAll(i11, collection);
    }

    @Override // io.realm.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // io.realm.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // io.realm.x
    public /* bridge */ /* synthetic */ Object first() {
        return super.first();
    }

    public void g(h0<s0<E>> h0Var) {
        h(h0Var);
        this.f79179d.d(this, h0Var);
    }

    @Override // io.realm.x, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i11) {
        return super.get(i11);
    }

    @Override // io.realm.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public boolean j() {
        this.f79176a.n();
        this.f79179d.o();
        return true;
    }

    public void k(h0<s0<E>> h0Var) {
        i(h0Var, true);
        this.f79179d.q(this, h0Var);
    }

    public RealmQuery<E> l() {
        this.f79176a.n();
        return RealmQuery.f(this);
    }

    @Override // io.realm.x, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // io.realm.RealmCollection
    public boolean n3() {
        this.f79176a.n();
        return this.f79179d.m();
    }

    @Override // io.realm.x, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object remove(int i11) {
        return super.remove(i11);
    }

    @Override // io.realm.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // io.realm.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.x, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        return super.set(i11, obj);
    }

    @Override // io.realm.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    s0(a aVar, OsResults osResults, Class<E> cls, boolean z11) {
        super(aVar, osResults, cls, x.d(z11, aVar, osResults, cls, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.x, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // io.realm.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    @Override // io.realm.x, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
        return super.listIterator(i11);
    }

    @Override // io.realm.x, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    s0(a aVar, OsResults osResults, String str) {
        this(aVar, osResults, str, false);
    }

    s0(a aVar, OsResults osResults, String str, boolean z11) {
        super(aVar, osResults, str, x.d(z11, aVar, osResults, null, str));
    }
}
