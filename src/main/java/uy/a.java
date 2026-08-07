package uy;

import cm0.j;

/* JADX INFO: loaded from: classes6.dex */
class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f116764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f116765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f116766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f116767d;

    /* JADX INFO: renamed from: uy.a$a, reason: collision with other inner class name */
    public interface InterfaceC2518a<T> extends j<T> {
        @Override // cm0.j
        boolean test(T t11);
    }

    a(int i11) {
        this.f116764a = i11;
        Object[] objArr = new Object[i11 + 1];
        this.f116765b = objArr;
        this.f116766c = objArr;
    }

    void a(T t11) {
        int i11 = this.f116764a;
        int i12 = this.f116767d;
        if (i12 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.f116766c[i11] = objArr;
            this.f116766c = objArr;
            i12 = 0;
        }
        this.f116766c[i12] = t11;
        this.f116767d = i12 + 1;
    }

    void b(InterfaceC2518a<? super T> interfaceC2518a) {
        int i11 = this.f116764a;
        for (Object[] objArr = this.f116765b; objArr != null; objArr = (Object[]) objArr[i11]) {
            for (int i12 = 0; i12 < i11; i12++) {
                Object obj = objArr[i12];
                if (obj == null || interfaceC2518a.test(obj)) {
                    break;
                }
            }
        }
    }
}
