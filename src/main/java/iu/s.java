package iu;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class s extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object[] f81916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final s f81917f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f81918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f81919d;

    static {
        Object[] objArr = new Object[0];
        f81916e = objArr;
        f81917f = new s(objArr, 0, objArr, 0, 0);
    }

    s(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        this.f81918c = objArr;
        this.f81919d = objArr2;
    }

    @Override // iu.m
    final int a(Object[] objArr, int i11) {
        System.arraycopy(this.f81918c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // iu.m
    final int b() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f81919d.length;
        return false;
    }

    @Override // iu.m
    final int d() {
        return 0;
    }

    @Override // iu.m
    final Object[] e() {
        return this.f81918c;
    }

    @Override // iu.q
    final p g() {
        int i11 = p.f81908c;
        return r.f81914e;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // iu.q
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
