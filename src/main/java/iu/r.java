package iu;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class r extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final p f81914e = new r(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f81915d;

    r(Object[] objArr, int i11) {
        this.f81915d = objArr;
    }

    @Override // iu.p, iu.m
    final int a(Object[] objArr, int i11) {
        System.arraycopy(this.f81915d, 0, objArr, 0, 0);
        return 0;
    }

    @Override // iu.m
    final int b() {
        return 0;
    }

    @Override // iu.m
    final int d() {
        return 0;
    }

    @Override // iu.m
    final Object[] e() {
        return this.f81915d;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        j.a(i11, 0, "index");
        Object obj = this.f81915d[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
