package lw;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f90834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f90835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f90836c;

        public a(int i11, int i12, int i13) {
            this.f90834a = i11;
            this.f90835b = i12;
            this.f90836c = i13;
        }

        public a a(a aVar) {
            return new a(this.f90834a - aVar.d(), this.f90835b - aVar.c(), this.f90836c - aVar.b());
        }

        public int b() {
            return this.f90836c;
        }

        public int c() {
            return this.f90835b;
        }

        public int d() {
            return this.f90834a;
        }
    }

    @NonNull
    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        int i13 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i11 = 0;
            i12 = 0;
        } else {
            int i14 = 0;
            i11 = 0;
            i12 = 0;
            while (i13 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i13);
                int iValueAt = sparseIntArray.valueAt(i13);
                i14 += iValueAt;
                if (iKeyAt > 700) {
                    i12 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i11 += iValueAt;
                }
                i13++;
            }
            i13 = i14;
        }
        return new a(i13, i11, i12);
    }
}
