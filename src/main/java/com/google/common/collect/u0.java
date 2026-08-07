package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class u0<E> extends x<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final x<Object> f43691e = new u0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f43692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f43693d;

    u0(Object[] objArr, int i11) {
        this.f43692c = objArr;
        this.f43693d = i11;
    }

    @Override // com.google.common.collect.x, com.google.common.collect.w
    int b(Object[] objArr, int i11) {
        System.arraycopy(this.f43692c, 0, objArr, i11, this.f43693d);
        return i11 + this.f43693d;
    }

    @Override // com.google.common.collect.w
    Object[] d() {
        return this.f43692c;
    }

    @Override // com.google.common.collect.w
    int e() {
        return this.f43693d;
    }

    @Override // com.google.common.collect.w
    int f() {
        return 0;
    }

    @Override // com.google.common.collect.w
    boolean g() {
        return false;
    }

    @Override // java.util.List
    public E get(int i11) {
        ou.p.k(i11, this.f43693d);
        E e11 = (E) this.f43692c[i11];
        Objects.requireNonNull(e11);
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f43693d;
    }
}
