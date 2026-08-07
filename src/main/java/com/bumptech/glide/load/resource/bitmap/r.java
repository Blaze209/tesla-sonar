package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gj.d f20834a = new a();

    class a extends gj.e {
        a() {
        }

        @Override // gj.e, gj.d
        public void c(Bitmap bitmap) {
        }
    }

    static fj.c<Bitmap> a(gj.d dVar, Drawable drawable, int i11, int i12) {
        Bitmap bitmapB;
        Drawable current = drawable.getCurrent();
        boolean z11 = false;
        if (current instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapB = null;
        } else {
            bitmapB = b(dVar, current, i11, i12);
            z11 = true;
        }
        if (!z11) {
            dVar = f20834a;
        }
        return f.c(bitmapB, dVar);
    }

    private static Bitmap b(gj.d dVar, Drawable drawable, int i11, int i12) {
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i12 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        Lock lockI = d0.i();
        lockI.lock();
        Bitmap bitmapD = dVar.d(i11, i12, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapD);
            drawable.setBounds(0, 0, i11, i12);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapD;
        } finally {
            lockI.unlock();
        }
    }
}
