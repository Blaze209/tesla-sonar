package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
final class w0<E> extends b0<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f43712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final w0<Object> f43713i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f43714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f43715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f43716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f43717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f43718g;

    static {
        Object[] objArr = new Object[0];
        f43712h = objArr;
        f43713i = new w0<>(objArr, 0, objArr, 0, 0);
    }

    w0(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        this.f43714c = objArr;
        this.f43715d = i11;
        this.f43716e = objArr2;
        this.f43717f = i12;
        this.f43718g = i13;
    }

    @Override // com.google.common.collect.w
    int b(Object[] objArr, int i11) {
        System.arraycopy(this.f43714c, 0, objArr, i11, this.f43718g);
        return i11 + this.f43718g;
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f43716e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = u.c(obj);
        while (true) {
            int i11 = iC & this.f43717f;
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i11 + 1;
        }
    }

    @Override // com.google.common.collect.w
    Object[] d() {
        return this.f43714c;
    }

    @Override // com.google.common.collect.w
    int e() {
        return this.f43718g;
    }

    @Override // com.google.common.collect.w
    int f() {
        return 0;
    }

    @Override // com.google.common.collect.w
    boolean g() {
        return false;
    }

    @Override // com.google.common.collect.w, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: h */
    public d1<E> iterator() {
        return a().iterator();
    }

    @Override // com.google.common.collect.b0, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f43715d;
    }

    @Override // com.google.common.collect.b0
    x<E> o() {
        return x.j(this.f43714c, this.f43718g);
    }

    @Override // com.google.common.collect.b0
    boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f43718g;
    }
}
