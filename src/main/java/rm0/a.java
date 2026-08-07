package rm0;

import io.reactivex.rxjava3.core.s;

/* JADX INFO: loaded from: classes9.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f108621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object[] f108622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f108623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f108624d;

    /* JADX INFO: renamed from: rm0.a$a, reason: collision with other inner class name */
    public interface InterfaceC2312a<T> extends cm0.j<T> {
        @Override // cm0.j
        boolean test(T t11);
    }

    public a(int i11) {
        this.f108621a = i11;
        Object[] objArr = new Object[i11 + 1];
        this.f108622b = objArr;
        this.f108623c = objArr;
    }

    public <U> boolean a(s<? super U> sVar) {
        Object[] objArr = this.f108622b;
        int i11 = this.f108621a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                Object[] objArr2 = objArr[i12];
                if (objArr2 == null) {
                    break;
                }
                if (i.acceptFull(objArr2, sVar)) {
                    return true;
                }
            }
            objArr = objArr[i11];
        }
    }

    public <U> boolean b(nr0.b<? super U> bVar) {
        Object[] objArr = this.f108622b;
        int i11 = this.f108621a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                Object[] objArr2 = objArr[i12];
                if (objArr2 == null) {
                    break;
                }
                if (i.acceptFull(objArr2, bVar)) {
                    return true;
                }
            }
            objArr = objArr[i11];
        }
    }

    public void c(T t11) {
        int i11 = this.f108621a;
        int i12 = this.f108624d;
        if (i12 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.f108623c[i11] = objArr;
            this.f108623c = objArr;
            i12 = 0;
        }
        this.f108623c[i12] = t11;
        this.f108624d = i12 + 1;
    }

    public void d(InterfaceC2312a<? super T> interfaceC2312a) {
        int i11 = this.f108621a;
        for (Object[] objArr = this.f108622b; objArr != null; objArr = (Object[]) objArr[i11]) {
            for (int i12 = 0; i12 < i11; i12++) {
                Object obj = objArr[i12];
                if (obj == null) {
                    break;
                } else {
                    if (interfaceC2312a.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    public void e(T t11) {
        this.f108622b[0] = t11;
    }
}
