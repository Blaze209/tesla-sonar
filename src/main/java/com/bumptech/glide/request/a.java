package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.f0;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.q;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.request.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private static final int DISK_CACHE_STRATEGY = 4;
    private static final int ERROR_ID = 32;
    private static final int ERROR_PLACEHOLDER = 16;
    private static final int FALLBACK = 8192;
    private static final int FALLBACK_ID = 16384;
    private static final int IS_CACHEABLE = 256;
    private static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    private static final int OVERRIDE = 512;
    private static final int PLACEHOLDER = 64;
    private static final int PLACEHOLDER_ID = 128;
    private static final int PRIORITY = 8;
    private static final int RESOURCE_CLASS = 4096;
    private static final int SIGNATURE = 1024;
    private static final int SIZE_MULTIPLIER = 2;
    private static final int THEME = 32768;
    private static final int TRANSFORMATION = 2048;
    private static final int TRANSFORMATION_ALLOWED = 65536;
    private static final int TRANSFORMATION_REQUIRED = 131072;
    private static final int UNSET = -1;
    private static final int USE_ANIMATION_POOL = 1048576;
    private static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
    private int errorId;
    private Drawable errorPlaceholder;
    private Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isLocked;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;
    private Drawable placeholderDrawable;
    private int placeholderId;
    private Resources.Theme theme;
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;
    private float sizeMultiplier = 1.0f;

    @NonNull
    private fj.a diskCacheStrategy = fj.a.f66016e;

    @NonNull
    private com.bumptech.glide.h priority = com.bumptech.glide.h.NORMAL;
    private boolean isCacheable = true;
    private int overrideHeight = -1;
    private int overrideWidth = -1;

    @NonNull
    private dj.e signature = wj.c.c();
    private boolean isTransformationAllowed = true;

    @NonNull
    private dj.h options = new dj.h();

    @NonNull
    private Map<Class<?>, dj.l<?>> transformations = new xj.b();

    @NonNull
    private Class<?> resourceClass = Object.class;
    private boolean isScaleOnlyOrNoTransform = true;

    private static boolean isSet(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    @NonNull
    private T optionalScaleOnlyTransform(@NonNull m mVar, @NonNull dj.l<Bitmap> lVar) {
        return (T) scaleOnlyTransform(mVar, lVar, false);
    }

    @NonNull
    private T scaleOnlyTransform(@NonNull m mVar, @NonNull dj.l<Bitmap> lVar) {
        return (T) scaleOnlyTransform(mVar, lVar, true);
    }

    private T self() {
        return this;
    }

    @NonNull
    public T apply(@NonNull a<?> aVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().apply(aVar);
        }
        if (isSet(aVar.fields, 2)) {
            this.sizeMultiplier = aVar.sizeMultiplier;
        }
        if (isSet(aVar.fields, 262144)) {
            this.useUnlimitedSourceGeneratorsPool = aVar.useUnlimitedSourceGeneratorsPool;
        }
        if (isSet(aVar.fields, 1048576)) {
            this.useAnimationPool = aVar.useAnimationPool;
        }
        if (isSet(aVar.fields, 4)) {
            this.diskCacheStrategy = aVar.diskCacheStrategy;
        }
        if (isSet(aVar.fields, 8)) {
            this.priority = aVar.priority;
        }
        if (isSet(aVar.fields, 16)) {
            this.errorPlaceholder = aVar.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (isSet(aVar.fields, 32)) {
            this.errorId = aVar.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (isSet(aVar.fields, 64)) {
            this.placeholderDrawable = aVar.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (isSet(aVar.fields, 128)) {
            this.placeholderId = aVar.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (isSet(aVar.fields, 256)) {
            this.isCacheable = aVar.isCacheable;
        }
        if (isSet(aVar.fields, 512)) {
            this.overrideWidth = aVar.overrideWidth;
            this.overrideHeight = aVar.overrideHeight;
        }
        if (isSet(aVar.fields, 1024)) {
            this.signature = aVar.signature;
        }
        if (isSet(aVar.fields, 4096)) {
            this.resourceClass = aVar.resourceClass;
        }
        if (isSet(aVar.fields, 8192)) {
            this.fallbackDrawable = aVar.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (isSet(aVar.fields, 16384)) {
            this.fallbackId = aVar.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (isSet(aVar.fields, 32768)) {
            this.theme = aVar.theme;
        }
        if (isSet(aVar.fields, 65536)) {
            this.isTransformationAllowed = aVar.isTransformationAllowed;
        }
        if (isSet(aVar.fields, 131072)) {
            this.isTransformationRequired = aVar.isTransformationRequired;
        }
        if (isSet(aVar.fields, 2048)) {
            this.transformations.putAll(aVar.transformations);
            this.isScaleOnlyOrNoTransform = aVar.isScaleOnlyOrNoTransform;
        }
        if (isSet(aVar.fields, 524288)) {
            this.onlyRetrieveFromCache = aVar.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i11 = this.fields;
            this.isTransformationRequired = false;
            this.fields = i11 & (-133121);
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= aVar.fields;
        this.options.d(aVar.options);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T autoClone() {
        if (this.isLocked && !this.isAutoCloneEnabled) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.isAutoCloneEnabled = true;
        return (T) lock();
    }

    @NonNull
    public T centerCrop() {
        return (T) transform(m.f20815e, new com.bumptech.glide.load.resource.bitmap.j());
    }

    @NonNull
    public T centerInside() {
        return (T) scaleOnlyTransform(m.f20814d, new com.bumptech.glide.load.resource.bitmap.k());
    }

    @NonNull
    public T circleCrop() {
        return (T) transform(m.f20814d, new com.bumptech.glide.load.resource.bitmap.l());
    }

    @NonNull
    public T decode(@NonNull Class<?> cls) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().decode(cls);
        }
        this.resourceClass = (Class) xj.k.d(cls);
        this.fields |= 4096;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T disallowHardwareConfig() {
        return (T) set(q.f20824j, Boolean.FALSE);
    }

    @NonNull
    public T diskCacheStrategy(@NonNull fj.a aVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().diskCacheStrategy(aVar);
        }
        this.diskCacheStrategy = (fj.a) xj.k.d(aVar);
        this.fields |= 4;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T dontAnimate() {
        return (T) set(pj.i.f103122b, Boolean.TRUE);
    }

    @NonNull
    public T dontTransform() {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().dontTransform();
        }
        this.transformations.clear();
        int i11 = this.fields;
        this.isTransformationRequired = false;
        this.isTransformationAllowed = false;
        this.fields = (i11 & (-133121)) | 65536;
        this.isScaleOnlyOrNoTransform = true;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T downsample(@NonNull m mVar) {
        return (T) set(m.f20818h, xj.k.d(mVar));
    }

    @NonNull
    public T encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return (T) set(com.bumptech.glide.load.resource.bitmap.c.f20780c, xj.k.d(compressFormat));
    }

    @NonNull
    public T encodeQuality(int i11) {
        return (T) set(com.bumptech.glide.load.resource.bitmap.c.f20779b, Integer.valueOf(i11));
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return isEquivalentTo((a) obj);
        }
        return false;
    }

    @NonNull
    public T error(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        int i11 = this.fields | 16;
        this.errorId = 0;
        this.fields = i11 & (-33);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T fallback(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        int i11 = this.fields | 8192;
        this.fallbackId = 0;
        this.fields = i11 & (-16385);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T fitCenter() {
        return (T) scaleOnlyTransform(m.f20813c, new u());
    }

    @NonNull
    public T format(@NonNull dj.b bVar) {
        xj.k.d(bVar);
        return (T) set(q.f20820f, bVar).set(pj.i.f103121a, bVar);
    }

    @NonNull
    public T frame(long j11) {
        return (T) set(f0.f20795d, Long.valueOf(j11));
    }

    @NonNull
    public final fj.a getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    @NonNull
    public final dj.h getOptions() {
        return this.options;
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    @NonNull
    public final com.bumptech.glide.h getPriority() {
        return this.priority;
    }

    @NonNull
    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    @NonNull
    public final dj.e getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    public final Resources.Theme getTheme() {
        return this.theme;
    }

    @NonNull
    public final Map<Class<?>, dj.l<?>> getTransformations() {
        return this.transformations;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    public int hashCode() {
        return xj.l.p(this.theme, xj.l.p(this.signature, xj.l.p(this.resourceClass, xj.l.p(this.transformations, xj.l.p(this.options, xj.l.p(this.priority, xj.l.p(this.diskCacheStrategy, xj.l.q(this.onlyRetrieveFromCache, xj.l.q(this.useUnlimitedSourceGeneratorsPool, xj.l.q(this.isTransformationAllowed, xj.l.q(this.isTransformationRequired, xj.l.o(this.overrideWidth, xj.l.o(this.overrideHeight, xj.l.q(this.isCacheable, xj.l.p(this.fallbackDrawable, xj.l.o(this.fallbackId, xj.l.p(this.placeholderDrawable, xj.l.o(this.placeholderId, xj.l.p(this.errorPlaceholder, xj.l.o(this.errorId, xj.l.m(this.sizeMultiplier)))))))))))))))))))));
    }

    protected final boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return isSet(4);
    }

    public final boolean isEquivalentTo(a<?> aVar) {
        return Float.compare(aVar.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == aVar.errorId && xj.l.e(this.errorPlaceholder, aVar.errorPlaceholder) && this.placeholderId == aVar.placeholderId && xj.l.e(this.placeholderDrawable, aVar.placeholderDrawable) && this.fallbackId == aVar.fallbackId && xj.l.e(this.fallbackDrawable, aVar.fallbackDrawable) && this.isCacheable == aVar.isCacheable && this.overrideHeight == aVar.overrideHeight && this.overrideWidth == aVar.overrideWidth && this.isTransformationRequired == aVar.isTransformationRequired && this.isTransformationAllowed == aVar.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == aVar.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == aVar.onlyRetrieveFromCache && this.diskCacheStrategy.equals(aVar.diskCacheStrategy) && this.priority == aVar.priority && this.options.equals(aVar.options) && this.transformations.equals(aVar.transformations) && this.resourceClass.equals(aVar.resourceClass) && xj.l.e(this.signature, aVar.signature) && xj.l.e(this.theme, aVar.theme);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    public final boolean isPrioritySet() {
        return isSet(8);
    }

    boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSkipMemoryCacheSet() {
        return isSet(256);
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isTransformationSet() {
        return isSet(2048);
    }

    public final boolean isValidOverride() {
        return xj.l.u(this.overrideWidth, this.overrideHeight);
    }

    @NonNull
    public T lock() {
        this.isLocked = true;
        return (T) self();
    }

    @NonNull
    public T onlyRetrieveFromCache(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().onlyRetrieveFromCache(z11);
        }
        this.onlyRetrieveFromCache = z11;
        this.fields |= 524288;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T optionalCenterCrop() {
        return (T) optionalTransform(m.f20815e, new com.bumptech.glide.load.resource.bitmap.j());
    }

    @NonNull
    public T optionalCenterInside() {
        return (T) optionalScaleOnlyTransform(m.f20814d, new com.bumptech.glide.load.resource.bitmap.k());
    }

    @NonNull
    public T optionalCircleCrop() {
        return (T) optionalTransform(m.f20815e, new com.bumptech.glide.load.resource.bitmap.l());
    }

    @NonNull
    public T optionalFitCenter() {
        return (T) optionalScaleOnlyTransform(m.f20813c, new u());
    }

    @NonNull
    final T optionalTransform(@NonNull m mVar, @NonNull dj.l<Bitmap> lVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().optionalTransform(mVar, lVar);
        }
        downsample(mVar);
        return (T) transform(lVar, false);
    }

    @NonNull
    public T override(int i11, int i12) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().override(i11, i12);
        }
        this.overrideWidth = i11;
        this.overrideHeight = i12;
        this.fields |= 512;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T placeholder(Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        int i11 = this.fields | 64;
        this.placeholderId = 0;
        this.fields = i11 & (-129);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T priority(@NonNull com.bumptech.glide.h hVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().priority(hVar);
        }
        this.priority = (com.bumptech.glide.h) xj.k.d(hVar);
        this.fields |= 8;
        return (T) selfOrThrowIfLocked();
    }

    T removeOption(@NonNull dj.g<?> gVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().removeOption(gVar);
        }
        this.options.e(gVar);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    protected final T selfOrThrowIfLocked() {
        if (this.isLocked) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) self();
    }

    @NonNull
    public <Y> T set(@NonNull dj.g<Y> gVar, @NonNull Y y11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().set(gVar, y11);
        }
        xj.k.d(gVar);
        xj.k.d(y11);
        this.options.f(gVar, y11);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T signature(@NonNull dj.e eVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().signature(eVar);
        }
        this.signature = (dj.e) xj.k.d(eVar);
        this.fields |= 1024;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T sizeMultiplier(float f11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().sizeMultiplier(f11);
        }
        if (f11 < BitmapDescriptorFactory.HUE_RED || f11 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.sizeMultiplier = f11;
        this.fields |= 2;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T skipMemoryCache(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().skipMemoryCache(true);
        }
        this.isCacheable = !z11;
        this.fields |= 256;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T theme(Resources.Theme theme) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().theme(theme);
        }
        this.theme = theme;
        if (theme != null) {
            this.fields |= 32768;
            return (T) set(nj.g.f95062b, theme);
        }
        this.fields &= -32769;
        return (T) removeOption(nj.g.f95062b);
    }

    @NonNull
    public T timeout(int i11) {
        return (T) set(kj.a.f86156b, Integer.valueOf(i11));
    }

    @NonNull
    final T transform(@NonNull m mVar, @NonNull dj.l<Bitmap> lVar) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().transform(mVar, lVar);
        }
        downsample(mVar);
        return (T) transform(lVar);
    }

    @NonNull
    @Deprecated
    public T transforms(@NonNull dj.l<Bitmap>... lVarArr) {
        return (T) transform((dj.l<Bitmap>) new dj.f(lVarArr), true);
    }

    @NonNull
    public T useAnimationPool(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().useAnimationPool(z11);
        }
        this.useAnimationPool = z11;
        this.fields |= 1048576;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T useUnlimitedSourceGeneratorsPool(boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().useUnlimitedSourceGeneratorsPool(z11);
        }
        this.useUnlimitedSourceGeneratorsPool = z11;
        this.fields |= 262144;
        return (T) selfOrThrowIfLocked();
    }

    private boolean isSet(int i11) {
        return isSet(this.fields, i11);
    }

    @NonNull
    private T scaleOnlyTransform(@NonNull m mVar, @NonNull dj.l<Bitmap> lVar, boolean z11) {
        T t11 = z11 ? (T) transform(mVar, lVar) : (T) optionalTransform(mVar, lVar);
        t11.isScaleOnlyOrNoTransform = true;
        return t11;
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public T mo63clone() {
        try {
            T t11 = (T) super.clone();
            dj.h hVar = new dj.h();
            t11.options = hVar;
            hVar.d(this.options);
            xj.b bVar = new xj.b();
            t11.transformations = bVar;
            bVar.putAll(this.transformations);
            t11.isLocked = false;
            t11.isAutoCloneEnabled = false;
            return t11;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    @NonNull
    public T optionalTransform(@NonNull dj.l<Bitmap> lVar) {
        return (T) transform(lVar, false);
    }

    @NonNull
    public T transform(@NonNull dj.l<Bitmap> lVar) {
        return (T) transform(lVar, true);
    }

    @NonNull
    public <Y> T optionalTransform(@NonNull Class<Y> cls, @NonNull dj.l<Y> lVar) {
        return (T) transform(cls, lVar, false);
    }

    @NonNull
    public T transform(@NonNull dj.l<Bitmap>... lVarArr) {
        if (lVarArr.length > 1) {
            return (T) transform((dj.l<Bitmap>) new dj.f(lVarArr), true);
        }
        if (lVarArr.length == 1) {
            return (T) transform(lVarArr[0]);
        }
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T override(int i11) {
        return (T) override(i11, i11);
    }

    @NonNull
    public T error(int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().error(i11);
        }
        this.errorId = i11;
        int i12 = this.fields | 32;
        this.errorPlaceholder = null;
        this.fields = i12 & (-17);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T fallback(int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().fallback(i11);
        }
        this.fallbackId = i11;
        int i12 = this.fields | 16384;
        this.fallbackDrawable = null;
        this.fields = i12 & (-8193);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public T placeholder(int i11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().placeholder(i11);
        }
        this.placeholderId = i11;
        int i12 = this.fields | 128;
        this.placeholderDrawable = null;
        this.fields = i12 & (-65);
        return (T) selfOrThrowIfLocked();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    T transform(@NonNull dj.l<Bitmap> lVar, boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().transform(lVar, z11);
        }
        s sVar = new s(lVar, z11);
        transform(Bitmap.class, lVar, z11);
        transform(Drawable.class, sVar, z11);
        transform(BitmapDrawable.class, sVar.c(), z11);
        transform(pj.c.class, new pj.f(lVar), z11);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    <Y> T transform(@NonNull Class<Y> cls, @NonNull dj.l<Y> lVar, boolean z11) {
        if (this.isAutoCloneEnabled) {
            return (T) mo63clone().transform(cls, lVar, z11);
        }
        xj.k.d(cls);
        xj.k.d(lVar);
        this.transformations.put(cls, lVar);
        int i11 = this.fields;
        this.isTransformationAllowed = true;
        this.fields = 67584 | i11;
        this.isScaleOnlyOrNoTransform = false;
        if (z11) {
            this.fields = i11 | 198656;
            this.isTransformationRequired = true;
        }
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    public <Y> T transform(@NonNull Class<Y> cls, @NonNull dj.l<Y> lVar) {
        return (T) transform(cls, lVar, true);
    }
}
