package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.k;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.request.h;
import dj.e;
import dj.g;
import dj.l;
import java.io.File;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GlideRequest<TranscodeType> extends k<TranscodeType> implements Cloneable {
    GlideRequest(@NonNull Class<TranscodeType> cls, @NonNull k<?> kVar) {
        super(cls, kVar);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.request.a
    @NonNull
    public /* bridge */ /* synthetic */ k apply(@NonNull com.bumptech.glide.request.a aVar) {
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
    @Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a transforms(@NonNull l[] lVarArr) {
        return transforms((l<Bitmap>[]) lVarArr);
    }

    GlideRequest(@NonNull com.bumptech.glide.c cVar, @NonNull com.bumptech.glide.l lVar, @NonNull Class<TranscodeType> cls, @NonNull Context context) {
        super(cVar, lVar, cls, context);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequest<TranscodeType> addListener(h<TranscodeType> hVar) {
        return (GlideRequest) super.addListener((h) hVar);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.request.a
    @NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a apply(@NonNull com.bumptech.glide.request.a aVar) {
        return apply((com.bumptech.glide.request.a<?>) aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> autoClone() {
        return (GlideRequest) super.autoClone();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> centerCrop() {
        return (GlideRequest) super.centerCrop();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> centerInside() {
        return (GlideRequest) super.centerInside();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> circleCrop() {
        return (GlideRequest) super.circleCrop();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> decode(@NonNull Class<?> cls) {
        return (GlideRequest) super.decode(cls);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> disallowHardwareConfig() {
        return (GlideRequest) super.disallowHardwareConfig();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> diskCacheStrategy(@NonNull fj.a aVar) {
        return (GlideRequest) super.diskCacheStrategy(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> dontAnimate() {
        return (GlideRequest) super.dontAnimate();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> dontTransform() {
        return (GlideRequest) super.dontTransform();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> downsample(@NonNull m mVar) {
        return (GlideRequest) super.downsample(mVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return (GlideRequest) super.encodeFormat(compressFormat);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> encodeQuality(int i11) {
        return (GlideRequest) super.encodeQuality(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> fitCenter() {
        return (GlideRequest) super.fitCenter();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> format(@NonNull dj.b bVar) {
        return (GlideRequest) super.format(bVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> frame(long j11) {
        return (GlideRequest) super.frame(j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequest<File> getDownloadOnlyRequest() {
        return new GlideRequest(File.class, this).apply((com.bumptech.glide.request.a<?>) k.DOWNLOAD_ONLY_OPTIONS);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequest<TranscodeType> listener(h<TranscodeType> hVar) {
        return (GlideRequest) super.listener((h) hVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> lock() {
        return (GlideRequest) super.lock();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean z11) {
        return (GlideRequest) super.onlyRetrieveFromCache(z11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> optionalCenterCrop() {
        return (GlideRequest) super.optionalCenterCrop();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> optionalCenterInside() {
        return (GlideRequest) super.optionalCenterInside();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> optionalCircleCrop() {
        return (GlideRequest) super.optionalCircleCrop();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> optionalFitCenter() {
        return (GlideRequest) super.optionalFitCenter();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> priority(@NonNull com.bumptech.glide.h hVar) {
        return (GlideRequest) super.priority(hVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public <Y> GlideRequest<TranscodeType> set(@NonNull g<Y> gVar, @NonNull Y y11) {
        return (GlideRequest) super.set((g) gVar, (Object) y11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> signature(@NonNull e eVar) {
        return (GlideRequest) super.signature(eVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> sizeMultiplier(float f11) {
        return (GlideRequest) super.sizeMultiplier(f11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> skipMemoryCache(boolean z11) {
        return (GlideRequest) super.skipMemoryCache(z11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> theme(Resources.Theme theme) {
        return (GlideRequest) super.theme(theme);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> timeout(int i11) {
        return (GlideRequest) super.timeout(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    @Deprecated
    public GlideRequest<TranscodeType> transforms(@NonNull l<Bitmap>... lVarArr) {
        return (GlideRequest) super.transforms(lVarArr);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequest<TranscodeType> transition(@NonNull com.bumptech.glide.m<?, ? super TranscodeType> mVar) {
        return (GlideRequest) super.transition((com.bumptech.glide.m) mVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> useAnimationPool(boolean z11) {
        return (GlideRequest) super.useAnimationPool(z11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean z11) {
        return (GlideRequest) super.useUnlimitedSourceGeneratorsPool(z11);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> apply(@NonNull com.bumptech.glide.request.a<?> aVar) {
        return (GlideRequest) super.apply(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> fallback(Drawable drawable) {
        return (GlideRequest) super.fallback(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> optionalTransform(@NonNull l<Bitmap> lVar) {
        return (GlideRequest) super.optionalTransform(lVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> override(int i11, int i12) {
        return (GlideRequest) super.override(i11, i12);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> placeholder(Drawable drawable) {
        return (GlideRequest) super.placeholder(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a transform(@NonNull l[] lVarArr) {
        return transform((l<Bitmap>[]) lVarArr);
    }

    @Override // com.bumptech.glide.k, com.bumptech.glide.request.a
    /* JADX INFO: renamed from: clone */
    public GlideRequest<TranscodeType> mo63clone() {
        return (GlideRequest) super.mo63clone();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> fallback(int i11) {
        return (GlideRequest) super.fallback(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public <Y> GlideRequest<TranscodeType> optionalTransform(@NonNull Class<Y> cls, @NonNull l<Y> lVar) {
        return (GlideRequest) super.optionalTransform((Class) cls, (l) lVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> override(int i11) {
        return (GlideRequest) super.override(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> placeholder(int i11) {
        return (GlideRequest) super.placeholder(i11);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> transform(@NonNull l<Bitmap> lVar) {
        return (GlideRequest) super.transform(lVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> error(Drawable drawable) {
        return (GlideRequest) super.error(drawable);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequest<TranscodeType> thumbnail(k<TranscodeType> kVar) {
        return (GlideRequest) super.thumbnail((k) kVar);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> transform(@NonNull l<Bitmap>... lVarArr) {
        return (GlideRequest) super.transform(lVarArr);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public GlideRequest<TranscodeType> error(int i11) {
        return (GlideRequest) super.error(i11);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    @SafeVarargs
    public final GlideRequest<TranscodeType> thumbnail(k<TranscodeType>... kVarArr) {
        return (GlideRequest) super.thumbnail((k[]) kVarArr);
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public <Y> GlideRequest<TranscodeType> transform(@NonNull Class<Y> cls, @NonNull l<Y> lVar) {
        return (GlideRequest) super.transform((Class) cls, (l) lVar);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequest<TranscodeType> error(k<TranscodeType> kVar) {
        return (GlideRequest) super.error((k) kVar);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequest<TranscodeType> thumbnail(List<k<TranscodeType>> list) {
        return (GlideRequest) super.thumbnail((List) list);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequest<TranscodeType> error(Object obj) {
        return (GlideRequest) super.error(obj);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    public GlideRequest<TranscodeType> thumbnail(float f11) {
        return (GlideRequest) super.thumbnail(f11);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<TranscodeType> mo69load(Object obj) {
        return (GlideRequest) super.mo69load(obj);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<TranscodeType> mo64load(Bitmap bitmap) {
        return (GlideRequest) super.mo64load(bitmap);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<TranscodeType> mo65load(Drawable drawable) {
        return (GlideRequest) super.mo65load(drawable);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<TranscodeType> mo70load(String str) {
        return (GlideRequest) super.mo70load(str);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<TranscodeType> mo66load(Uri uri) {
        return (GlideRequest) super.mo66load(uri);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<TranscodeType> mo67load(File file) {
        return (GlideRequest) super.mo67load(file);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<TranscodeType> mo68load(Integer num) {
        return (GlideRequest) super.mo68load(num);
    }

    @Override // com.bumptech.glide.k
    @Deprecated
    /* JADX INFO: renamed from: load */
    public GlideRequest<TranscodeType> mo71load(URL url) {
        return (GlideRequest) super.mo71load(url);
    }

    @Override // com.bumptech.glide.k
    @NonNull
    /* JADX INFO: renamed from: load */
    public GlideRequest<TranscodeType> mo72load(byte[] bArr) {
        return (GlideRequest) super.mo72load(bArr);
    }
}
