package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c implements dj.k<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dj.g<Integer> f20779b = dj.g.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dj.g<Bitmap.CompressFormat> f20780c = dj.g.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gj.b f20781a;

    public c(@NonNull gj.b bVar) {
        this.f20781a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, dj.h hVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(f20780c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // dj.k
    @NonNull
    public dj.c a(@NonNull dj.h hVar) {
        return dj.c.TRANSFORMED;
    }

    @Override // dj.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull fj.c<Bitmap> cVar, @NonNull File file, @NonNull dj.h hVar) {
        boolean z11;
        Bitmap bitmap = cVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, hVar);
        yj.b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = xj.g.b();
            int iIntValue = ((Integer) hVar.c(f20779b)).intValue();
            OutputStream cVar2 = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        cVar2 = this.f20781a != null ? new com.bumptech.glide.load.data.c(fileOutputStream, this.f20781a) : fileOutputStream;
                        bitmap.compress(compressFormatD, iIntValue, cVar2);
                        cVar2.close();
                        try {
                            cVar2.close();
                        } catch (IOException unused) {
                        }
                        z11 = true;
                    } catch (IOException e11) {
                        e = e11;
                        cVar2 = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (cVar2 != null) {
                            try {
                                cVar2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z11 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar2 = fileOutputStream;
                        if (cVar2 != null) {
                            try {
                                cVar2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e12) {
                e = e12;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormatD + " of size " + xj.l.i(bitmap) + " in " + xj.g.a(jB) + ", options format: " + hVar.c(f20780c) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            yj.b.e();
            return z11;
        } catch (Throwable th4) {
            yj.b.e();
            throw th4;
        }
    }
}
