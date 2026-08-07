package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements dj.j<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj.d f20791a = new gj.e();

    @Override // dj.j
    public /* bridge */ /* synthetic */ fj.c<Bitmap> a(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull dj.h hVar) {
        return c(d.a(source), i11, i12, hVar);
    }

    @Override // dj.j
    public /* bridge */ /* synthetic */ boolean b(@NonNull ImageDecoder.Source source, @NonNull dj.h hVar) {
        return d(d.a(source), hVar);
    }

    public fj.c<Bitmap> c(@NonNull ImageDecoder.Source source, int i11, int i12, @NonNull dj.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new lj.a(i11, i12, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i11 + "x" + i12 + "]");
        }
        return new f(bitmapDecodeBitmap, this.f20791a);
    }

    public boolean d(@NonNull ImageDecoder.Source source, @NonNull dj.h hVar) {
        return true;
    }
}
