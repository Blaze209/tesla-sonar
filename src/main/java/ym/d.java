package ym;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import p013kotlin.Metadata;
import um.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J;\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\f\u0010\rJC\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lym/d;", "", "Lum/k;", "encodedImage", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Rect;", "regionToDecode", "Landroid/graphics/ColorSpace;", "colorSpace", "Ltk/a;", "Landroid/graphics/Bitmap;", "a", "(Lum/k;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;Landroid/graphics/ColorSpace;)Ltk/a;", "", "length", "b", "(Lum/k;Landroid/graphics/Bitmap$Config;Landroid/graphics/Rect;ILandroid/graphics/ColorSpace;)Ltk/a;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface d {
    tk.a<Bitmap> a(k encodedImage, Bitmap.Config bitmapConfig, Rect regionToDecode, ColorSpace colorSpace);

    tk.a<Bitmap> b(k encodedImage, Bitmap.Config bitmapConfig, Rect regionToDecode, int length, ColorSpace colorSpace);
}
