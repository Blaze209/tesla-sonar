package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements dj.l<Bitmap> {
    @Override // dj.l
    @NonNull
    public final fj.c<Bitmap> a(@NonNull Context context, @NonNull fj.c<Bitmap> cVar, int i11, int i12) {
        if (!xj.l.u(i11, i12)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i11 + " or height: " + i12 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        gj.d dVarH = com.bumptech.glide.c.e(context).h();
        Bitmap bitmap = cVar.get();
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getWidth();
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(dVarH, bitmap, i11, i12);
        return bitmap.equals(bitmapC) ? cVar : f.c(bitmapC, dVarH);
    }

    protected abstract Bitmap c(@NonNull gj.d dVar, @NonNull Bitmap bitmap, int i11, int i12);
}
