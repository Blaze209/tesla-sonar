package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class e3 {

    public enum a {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        final int mId;

        a(int i11) {
            this.mId = i11;
        }

        int getId() {
            return this.mId;
        }
    }

    public enum b {
        PRIV,
        YUV,
        JPEG,
        JPEG_R,
        RAW
    }

    e3() {
    }

    @NonNull
    public static e3 a(@NonNull b bVar, @NonNull a aVar) {
        return new n(bVar, aVar, 0L);
    }

    @NonNull
    public static e3 b(@NonNull b bVar, @NonNull a aVar, long j11) {
        return new n(bVar, aVar, j11);
    }

    @NonNull
    public static b e(int i11) {
        if (i11 == 35) {
            return b.YUV;
        }
        if (i11 == 256) {
            return b.JPEG;
        }
        if (i11 == 4101) {
            return b.JPEG_R;
        }
        return i11 == 32 ? b.RAW : b.PRIV;
    }

    @NonNull
    public static e3 h(int i11, int i12, @NonNull Size size, @NonNull f3 f3Var) {
        b bVarE = e(i12);
        a aVar = a.NOT_SUPPORT;
        int iC = o0.c.c(size);
        if (i11 == 1) {
            if (iC <= o0.c.c(f3Var.i(i12))) {
                aVar = a.s720p;
            } else if (iC <= o0.c.c(f3Var.g(i12))) {
                aVar = a.s1440p;
            }
        } else if (iC <= o0.c.c(f3Var.b())) {
            aVar = a.VGA;
        } else if (iC <= o0.c.c(f3Var.e())) {
            aVar = a.PREVIEW;
        } else if (iC <= o0.c.c(f3Var.f())) {
            aVar = a.RECORD;
        } else if (iC <= o0.c.c(f3Var.c(i12))) {
            aVar = a.MAXIMUM;
        } else {
            Size sizeK = f3Var.k(i12);
            if (sizeK != null && iC <= o0.c.c(sizeK)) {
                aVar = a.ULTRA_MAXIMUM;
            }
        }
        return a(bVarE, aVar);
    }

    @NonNull
    public abstract a c();

    @NonNull
    public abstract b d();

    public abstract long f();

    public final boolean g(@NonNull e3 e3Var) {
        return e3Var.c().getId() <= c().getId() && e3Var.d() == d();
    }
}
