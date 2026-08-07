package dp;

import com.facebook.soloader.d0;

/* JADX INFO: loaded from: classes4.dex */
public class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h[] f60804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60805b = 0;

    public e(h... hVarArr) {
        this.f60804a = hVarArr;
    }

    @Override // dp.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, d0[] d0VarArr) {
        int i11;
        h[] hVarArr;
        do {
            i11 = this.f60805b;
            hVarArr = this.f60804a;
            if (i11 >= hVarArr.length) {
                return false;
            }
            this.f60805b = i11 + 1;
        } while (!hVarArr[i11].a(unsatisfiedLinkError, d0VarArr));
        return true;
    }
}
