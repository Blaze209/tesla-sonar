package rm0;

/* JADX INFO: loaded from: classes9.dex */
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float f108629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f108630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f108631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f108632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    T[] f108633e;

    public j() {
        this(16, 0.75f);
    }

    static int c(int i11) {
        int i12 = i11 * (-1640531527);
        return i12 ^ (i12 >>> 16);
    }

    public boolean a(T t11) {
        T t12;
        T[] tArr = this.f108633e;
        int i11 = this.f108630b;
        int iC = c(t11.hashCode()) & i11;
        T t13 = tArr[iC];
        if (t13 != null) {
            if (t13.equals(t11)) {
                return false;
            }
            do {
                iC = (iC + 1) & i11;
                t12 = tArr[iC];
                if (t12 == null) {
                }
            } while (!t12.equals(t11));
            return false;
        }
        tArr[iC] = t11;
        int i12 = this.f108631c + 1;
        this.f108631c = i12;
        if (i12 >= this.f108632d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f108633e;
    }

    void d() {
        T t11;
        T[] tArr = this.f108633e;
        int length = tArr.length;
        int i11 = length << 1;
        int i12 = i11 - 1;
        T[] tArr2 = (T[]) new Object[i11];
        int i13 = this.f108631c;
        while (true) {
            int i14 = i13 - 1;
            if (i13 == 0) {
                this.f108630b = i12;
                this.f108632d = (int) (i11 * this.f108629a);
                this.f108633e = tArr2;
                return;
            }
            do {
                length--;
                t11 = tArr[length];
            } while (t11 == null);
            int iC = c(t11.hashCode()) & i12;
            if (tArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i12;
                } while (tArr2[iC] != null);
            }
            tArr2[iC] = tArr[length];
            i13 = i14;
        }
    }

    public boolean e(T t11) {
        T t12;
        T[] tArr = this.f108633e;
        int i11 = this.f108630b;
        int iC = c(t11.hashCode()) & i11;
        T t13 = tArr[iC];
        if (t13 == null) {
            return false;
        }
        if (t13.equals(t11)) {
            return f(iC, tArr, i11);
        }
        do {
            iC = (iC + 1) & i11;
            t12 = tArr[iC];
            if (t12 == null) {
                return false;
            }
        } while (!t12.equals(t11));
        return f(iC, tArr, i11);
    }

    boolean f(int i11, T[] tArr, int i12) {
        int i13;
        T t11;
        this.f108631c--;
        while (true) {
            int i14 = i11 + 1;
            while (true) {
                i13 = i14 & i12;
                t11 = tArr[i13];
                if (t11 != null) {
                    int iC = c(t11.hashCode()) & i12;
                    if (i11 > i13) {
                        if (i11 >= iC && iC > i13) {
                            break;
                        }
                        i14 = i13 + 1;
                    } else {
                        if (i11 >= iC || iC > i13) {
                            break;
                        }
                        i14 = i13 + 1;
                    }
                } else {
                    tArr[i11] = null;
                    return true;
                }
            }
            tArr[i11] = t11;
            i11 = i13;
        }
    }

    public j(int i11, float f11) {
        this.f108629a = f11;
        int iA = k.a(i11);
        this.f108630b = iA - 1;
        this.f108632d = (int) (f11 * iA);
        this.f108633e = (T[]) new Object[iA];
    }
}
