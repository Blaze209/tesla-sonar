package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.m;

/* JADX INFO: loaded from: classes3.dex */
public class i extends a<i> {
    private static i centerCropOptions;
    private static i centerInsideOptions;
    private static i circleCropOptions;
    private static i fitCenterOptions;
    private static i noAnimationOptions;
    private static i noTransformOptions;
    private static i skipMemoryCacheFalseOptions;
    private static i skipMemoryCacheTrueOptions;

    @NonNull
    public static i bitmapTransform(@NonNull dj.l<Bitmap> lVar) {
        return new i().transform(lVar);
    }

    @NonNull
    public static i centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = new i().centerCrop().autoClone();
        }
        return centerCropOptions;
    }

    @NonNull
    public static i centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = new i().centerInside().autoClone();
        }
        return centerInsideOptions;
    }

    @NonNull
    public static i circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new i().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    @NonNull
    public static i decodeTypeOf(@NonNull Class<?> cls) {
        return new i().decode(cls);
    }

    @NonNull
    public static i diskCacheStrategyOf(@NonNull fj.a aVar) {
        return new i().diskCacheStrategy(aVar);
    }

    @NonNull
    public static i downsampleOf(@NonNull m mVar) {
        return new i().downsample(mVar);
    }

    @NonNull
    public static i encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new i().encodeFormat(compressFormat);
    }

    @NonNull
    public static i encodeQualityOf(int i11) {
        return new i().encodeQuality(i11);
    }

    @NonNull
    public static i errorOf(Drawable drawable) {
        return new i().error(drawable);
    }

    @NonNull
    public static i fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = new i().fitCenter().autoClone();
        }
        return fitCenterOptions;
    }

    @NonNull
    public static i formatOf(@NonNull dj.b bVar) {
        return new i().format(bVar);
    }

    @NonNull
    public static i frameOf(long j11) {
        return new i().frame(j11);
    }

    @NonNull
    public static i noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = new i().dontAnimate().autoClone();
        }
        return noAnimationOptions;
    }

    @NonNull
    public static i noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = new i().dontTransform().autoClone();
        }
        return noTransformOptions;
    }

    @NonNull
    public static <T> i option(@NonNull dj.g<T> gVar, @NonNull T t11) {
        return new i().set(gVar, t11);
    }

    @NonNull
    public static i overrideOf(int i11, int i12) {
        return new i().override(i11, i12);
    }

    @NonNull
    public static i placeholderOf(Drawable drawable) {
        return new i().placeholder(drawable);
    }

    @NonNull
    public static i priorityOf(@NonNull com.bumptech.glide.h hVar) {
        return new i().priority(hVar);
    }

    @NonNull
    public static i signatureOf(@NonNull dj.e eVar) {
        return new i().signature(eVar);
    }

    @NonNull
    public static i sizeMultiplierOf(float f11) {
        return new i().sizeMultiplier(f11);
    }

    @NonNull
    public static i skipMemoryCacheOf(boolean z11) {
        if (z11) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new i().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new i().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    @NonNull
    public static i timeoutOf(int i11) {
        return new i().timeout(i11);
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        return (obj instanceof i) && super.equals(obj);
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public static i errorOf(int i11) {
        return new i().error(i11);
    }

    @NonNull
    public static i overrideOf(int i11) {
        return overrideOf(i11, i11);
    }

    @NonNull
    public static i placeholderOf(int i11) {
        return new i().placeholder(i11);
    }
}
