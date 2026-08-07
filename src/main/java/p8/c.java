package p8;

import androidx.media3.exoplayer.source.f0;
import s7.t;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f101847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0[] f101848b;

    public c(int[] iArr, f0[] f0VarArr) {
        this.f101847a = iArr;
        this.f101848b = f0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f101848b.length];
        int i11 = 0;
        while (true) {
            f0[] f0VarArr = this.f101848b;
            if (i11 >= f0VarArr.length) {
                return iArr;
            }
            iArr[i11] = f0VarArr[i11].J();
            i11++;
        }
    }

    @Override // p8.f.b
    public o0 b(int i11, int i12) {
        int i13 = 0;
        while (true) {
            int[] iArr = this.f101847a;
            if (i13 >= iArr.length) {
                t.d("BaseMediaChunkOutput", "Unmatched track of type: " + i12);
                return new w8.n();
            }
            if (i12 == iArr[i13]) {
                return this.f101848b[i13];
            }
            i13++;
        }
    }

    public void c(long j11) {
        for (f0 f0Var : this.f101848b) {
            f0Var.c0(j11);
        }
    }
}
