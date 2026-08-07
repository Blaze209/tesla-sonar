package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
final class a1<E> extends b0<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient E f43521c;

    a1(E e11) {
        this.f43521c = (E) ou.p.m(e11);
    }

    @Override // com.google.common.collect.b0, com.google.common.collect.w
    public x<E> a() {
        return x.s(this.f43521c);
    }

    @Override // com.google.common.collect.w
    int b(Object[] objArr, int i11) {
        objArr[i11] = this.f43521c;
        return i11 + 1;
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f43521c.equals(obj);
    }

    @Override // com.google.common.collect.w
    boolean g() {
        return false;
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: h */
    public d1<E> iterator() {
        return d0.s(this.f43521c);
    }

    @Override // com.google.common.collect.b0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f43521c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f43521c.toString() + ']';
    }
}
