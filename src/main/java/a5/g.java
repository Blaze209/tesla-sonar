package a5;

/* JADX INFO: loaded from: classes.dex */
class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f319b;

    g(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f318a = new Object[i11];
    }

    @Override // a5.f
    public boolean a(T t11) {
        int i11 = this.f319b;
        Object[] objArr = this.f318a;
        if (i11 >= objArr.length) {
            return false;
        }
        objArr[i11] = t11;
        this.f319b = i11 + 1;
        return true;
    }

    @Override // a5.f
    public T b() {
        int i11 = this.f319b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object[] objArr = this.f318a;
        T t11 = (T) objArr[i12];
        objArr[i12] = null;
        this.f319b = i11 - 1;
        return t11;
    }

    @Override // a5.f
    public void c(T[] tArr, int i11) {
        if (i11 > tArr.length) {
            i11 = tArr.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            T t11 = tArr[i12];
            int i13 = this.f319b;
            Object[] objArr = this.f318a;
            if (i13 < objArr.length) {
                objArr[i13] = t11;
                this.f319b = i13 + 1;
            }
        }
    }
}
