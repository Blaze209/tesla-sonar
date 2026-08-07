package com.dylanvann.fastimage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.h;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.request.i;
import dj.e;
import dj.g;
import dj.l;

/* JADX INFO: loaded from: classes3.dex */
public final class GlideOptions extends i implements Cloneable {
    private static GlideOptions centerCropTransform2;
    private static GlideOptions centerInsideTransform1;
    private static GlideOptions circleCropTransform3;
    private static GlideOptions fitCenterTransform0;
    private static GlideOptions noAnimation5;
    private static GlideOptions noTransformation4;

    @NonNull
    public static GlideOptions bitmapTransform(@NonNull l<Bitmap> lVar) {
        return new GlideOptions().transform(lVar);
    }

    @NonNull
    public static GlideOptions centerCropTransform() {
        if (centerCropTransform2 == null) {
            centerCropTransform2 = new GlideOptions().centerCrop().autoClone();
        }
        return centerCropTransform2;
    }

    @NonNull
    public static GlideOptions centerInsideTransform() {
        if (centerInsideTransform1 == null) {
            centerInsideTransform1 = new GlideOptions().centerInside().autoClone();
        }
        return centerInsideTransform1;
    }

    @NonNull
    public static GlideOptions circleCropTransform() {
        if (circleCropTransform3 == null) {
            circleCropTransform3 = new GlideOptions().circleCrop().autoClone();
        }
        return circleCropTransform3;
    }

    @NonNull
    public static GlideOptions decodeTypeOf(@NonNull Class<?> cls) {
        return new GlideOptions().decode(cls);
    }

    @NonNull
    public static GlideOptions diskCacheStrategyOf(@NonNull fj.a aVar) {
        return new GlideOptions().diskCacheStrategy(aVar);
    }

    @NonNull
    public static GlideOptions downsampleOf(@NonNull m mVar) {
        return new GlideOptions().downsample(mVar);
    }

    @NonNull
    public static GlideOptions encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new GlideOptions().encodeFormat(compressFormat);
    }

    @NonNull
    public static GlideOptions encodeQualityOf(int i11) {
        return new GlideOptions().encodeQuality(i11);
    }

    @NonNull
    public static GlideOptions errorOf(Drawable drawable) {
        return new GlideOptions().error(drawable);
    }

    @NonNull
    public static GlideOptions fitCenterTransform() {
        if (fitCenterTransform0 == null) {
            fitCenterTransform0 = new GlideOptions().fitCenter().autoClone();
        }
        return fitCenterTransform0;
    }

    @NonNull
    public static GlideOptions formatOf(@NonNull dj.b bVar) {
        return new GlideOptions().format(bVar);
    }

    @NonNull
    public static GlideOptions frameOf(long j11) {
        return new GlideOptions().frame(j11);
    }

    @NonNull
    public static GlideOptions noAnimation() {
        if (noAnimation5 == null) {
            noAnimation5 = new GlideOptions().dontAnimate().autoClone();
        }
        return noAnimation5;
    }

    @NonNull
    public static GlideOptions noTransformation() {
        if (noTransformation4 == null) {
            noTransformation4 = new GlideOptions().dontTransform().autoClone();
        }
        return noTransformation4;
    }

    @NonNull
    public static <T> GlideOptions option(@NonNull g<T> gVar, @NonNull T t11) {
        return new GlideOptions().set(gVar, t11);
    }

    @NonNull
    public static GlideOptions overrideOf(int i11, int i12) {
        return new GlideOptions().override(i11, i12);
    }

    @NonNull
    public static GlideOptions placeholderOf(Drawable drawable) {
        return new GlideOptions().placeholder(drawable);
    }

    @NonNull
    public static GlideOptions priorityOf(@NonNull h hVar) {
        return new GlideOptions().priority(hVar);
    }

    @NonNull
    public static GlideOptions signatureOf(@NonNull e eVar) {
        return new GlideOptions().signature(eVar);
    }

    @NonNull
    public static GlideOptions sizeMultiplierOf(float f11) {
        return new GlideOptions().sizeMultiplier(f11);
    }

    @NonNull
    public static GlideOptions skipMemoryCacheOf(boolean z11) {
        return new GlideOptions().skipMemoryCache(z11);
    }

    @NonNull
    public static GlideOptions timeoutOf(int i11) {
        return new GlideOptions().timeout(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a apply(@NonNull com.bumptech.glide.request.a aVar) {
        return apply((com.bumptech.glide.request.a<?>) aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a decode(@NonNull Class cls) {
        return decode((Class<?>) cls);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a optionalTransform(@NonNull l lVar) {
        return optionalTransform((l<Bitmap>) lVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a set(@NonNull g gVar, @NonNull Object obj) {
        return set((g<Object>) gVar, obj);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a transform(@NonNull l lVar) {
        return transform((l<Bitmap>) lVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @SafeVarargs
    @Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a transforms(@NonNull l[] lVarArr) {
        return transforms((l<Bitmap>[]) lVarArr);
    }

    @NonNull
    public static GlideOptions errorOf(int i11) {
        return new GlideOptions().error(i11);
    }

    @NonNull
    public static GlideOptions overrideOf(int i11) {
        return new GlideOptions().override(i11);
    }

    @NonNull
    public static GlideOptions placeholderOf(int i11) {
        return new GlideOptions().placeholder(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions apply(@NonNull com.bumptech.glide.request.a<?> aVar) {
        return (GlideOptions) super.apply(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions autoClone() {
        return (GlideOptions) super.autoClone();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions centerCrop() {
        return (GlideOptions) super.centerCrop();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions centerInside() {
        return (GlideOptions) super.centerInside();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions circleCrop() {
        return (GlideOptions) super.circleCrop();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions decode(@NonNull Class<?> cls) {
        return (GlideOptions) super.decode(cls);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions disallowHardwareConfig() {
        return (GlideOptions) super.disallowHardwareConfig();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions diskCacheStrategy(@NonNull fj.a aVar) {
        return (GlideOptions) super.diskCacheStrategy(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions dontAnimate() {
        return (GlideOptions) super.dontAnimate();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions dontTransform() {
        return (GlideOptions) super.dontTransform();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions downsample(@NonNull m mVar) {
        return (GlideOptions) super.downsample(mVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return (GlideOptions) super.encodeFormat(compressFormat);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions encodeQuality(int i11) {
        return (GlideOptions) super.encodeQuality(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions fitCenter() {
        return (GlideOptions) super.fitCenter();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions format(@NonNull dj.b bVar) {
        return (GlideOptions) super.format(bVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions frame(long j11) {
        return (GlideOptions) super.frame(j11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions lock() {
        return (GlideOptions) super.lock();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions onlyRetrieveFromCache(boolean z11) {
        return (GlideOptions) super.onlyRetrieveFromCache(z11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions optionalCenterCrop() {
        return (GlideOptions) super.optionalCenterCrop();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions optionalCenterInside() {
        return (GlideOptions) super.optionalCenterInside();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions optionalCircleCrop() {
        return (GlideOptions) super.optionalCircleCrop();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions optionalFitCenter() {
        return (GlideOptions) super.optionalFitCenter();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions priority(@NonNull h hVar) {
        return (GlideOptions) super.priority(hVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public <Y> GlideOptions set(@NonNull g<Y> gVar, @NonNull Y y11) {
        return (GlideOptions) super.set((g) gVar, (Object) y11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions signature(@NonNull e eVar) {
        return (GlideOptions) super.signature(eVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions sizeMultiplier(float f11) {
        return (GlideOptions) super.sizeMultiplier(f11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions skipMemoryCache(boolean z11) {
        return (GlideOptions) super.skipMemoryCache(z11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions theme(Resources.Theme theme) {
        return (GlideOptions) super.theme(theme);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions timeout(int i11) {
        return (GlideOptions) super.timeout(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @SafeVarargs
    @Deprecated
    public final GlideOptions transforms(@NonNull l<Bitmap>... lVarArr) {
        return (GlideOptions) super.transforms(lVarArr);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions useAnimationPool(boolean z11) {
        return (GlideOptions) super.useAnimationPool(z11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions useUnlimitedSourceGeneratorsPool(boolean z11) {
        return (GlideOptions) super.useUnlimitedSourceGeneratorsPool(z11);
    }

    @Override // com.bumptech.glide.request.a
    /* JADX INFO: renamed from: clone */
    public GlideOptions mo63clone() {
        return (GlideOptions) super.mo63clone();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions error(Drawable drawable) {
        return (GlideOptions) super.error(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions fallback(Drawable drawable) {
        return (GlideOptions) super.fallback(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions optionalTransform(@NonNull l<Bitmap> lVar) {
        return (GlideOptions) super.optionalTransform(lVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions override(int i11, int i12) {
        return (GlideOptions) super.override(i11, i12);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions placeholder(Drawable drawable) {
        return (GlideOptions) super.placeholder(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @SafeVarargs
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a transform(@NonNull l[] lVarArr) {
        return transform((l<Bitmap>[]) lVarArr);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions error(int i11) {
        return (GlideOptions) super.error(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions fallback(int i11) {
        return (GlideOptions) super.fallback(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public <Y> GlideOptions optionalTransform(@NonNull Class<Y> cls, @NonNull l<Y> lVar) {
        return (GlideOptions) super.optionalTransform((Class) cls, (l) lVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions override(int i11) {
        return (GlideOptions) super.override(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions placeholder(int i11) {
        return (GlideOptions) super.placeholder(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideOptions transform(@NonNull l<Bitmap> lVar) {
        return (GlideOptions) super.transform(lVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @SafeVarargs
    public final GlideOptions transform(@NonNull l<Bitmap>... lVarArr) {
        return (GlideOptions) super.transform(lVarArr);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public <Y> GlideOptions transform(@NonNull Class<Y> cls, @NonNull l<Y> lVar) {
        return (GlideOptions) super.transform((Class) cls, (l) lVar);
    }
}
