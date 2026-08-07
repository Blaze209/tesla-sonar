package hk0;

import freemarker.core.BugException;

/* JADX INFO: loaded from: classes8.dex */
class y extends x {
    y(boolean z11) {
        super(z11);
    }

    private void i(int i11, Class[] clsArr, int[] iArr) {
        Class[] clsArr2 = f()[i11];
        if (clsArr2 == null) {
            return;
        }
        int length = clsArr2.length;
        int length2 = clsArr.length;
        int iMin = Math.min(length2, length);
        for (int i12 = 0; i12 < iMin; i12++) {
            clsArr2[i12] = d(clsArr2[i12], clsArr[i12]);
        }
        if (length > length2) {
            Class cls = clsArr[length2 - 1];
            while (length2 < length) {
                clsArr2[length2] = d(clsArr2[length2], cls);
                length2++;
            }
        }
        if (this.f73111f) {
            g(i11, iArr);
        }
    }

    @Override // hk0.x
    void b(Class[] clsArr, int[] iArr) {
        Class[] clsArr2;
        int length = clsArr.length;
        Class[][] clsArrF = f();
        int i11 = length - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            Class[] clsArr3 = clsArrF[i12];
            if (clsArr3 != null) {
                i(length, clsArr3, e(i12));
                break;
            }
        }
        int i13 = length + 1;
        if (i13 < clsArrF.length && (clsArr2 = clsArrF[i13]) != null) {
            i(length, clsArr2, e(i13));
        }
        while (i13 < clsArrF.length) {
            i(i13, clsArr, iArr);
            i13++;
        }
        if (length > 0) {
            i(i11, clsArr, iArr);
        }
    }

    @Override // hk0.x
    Class[] h(m mVar) {
        Class[] clsArr = (Class[]) mVar.a().clone();
        int length = clsArr.length - 1;
        Class<?> componentType = clsArr[length].getComponentType();
        if (componentType == null) {
            throw new BugException("Only varargs methods should be handled here");
        }
        clsArr[length] = componentType;
        return clsArr;
    }
}
