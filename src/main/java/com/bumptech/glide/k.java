package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class k<TranscodeType> extends com.bumptech.glide.request.a<k<TranscodeType>> implements Cloneable {
    protected static final com.bumptech.glide.request.i DOWNLOAD_ONLY_OPTIONS = new com.bumptech.glide.request.i().diskCacheStrategy(fj.a.f66014c).priority(h.LOW).skipMemoryCache(true);
    private final Context context;
    private k<TranscodeType> errorBuilder;
    private final c glide;
    private final e glideContext;
    private boolean isDefaultTransitionOptionsSet;
    private boolean isModelSet;
    private boolean isThumbnailBuilt;
    private Object model;
    private List<com.bumptech.glide.request.h<TranscodeType>> requestListeners;
    private final l requestManager;
    private Float thumbSizeMultiplier;
    private k<TranscodeType> thumbnailBuilder;
    private final Class<TranscodeType> transcodeClass;

    @NonNull
    private m<?, ? super TranscodeType> transitionOptions;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20505b;

        static {
            int[] iArr = new int[h.values().length];
            f20505b = iArr;
            try {
                iArr[h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20505b[h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20505b[h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20505b[h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f20504a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20504a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20504a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20504a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20504a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20504a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20504a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20504a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected k(@NonNull c cVar, l lVar, Class<TranscodeType> cls, Context context) {
        this.isDefaultTransitionOptionsSet = true;
        this.glide = cVar;
        this.requestManager = lVar;
        this.transcodeClass = cls;
        this.context = context;
        this.transitionOptions = lVar.getDefaultTransitionOptions(cls);
        this.glideContext = cVar.k();
        initRequestListeners(lVar.getDefaultRequestListeners());
        apply((com.bumptech.glide.request.a<?>) lVar.getDefaultRequestOptions());
    }

    private k<TranscodeType> applyResourceThemeAndSignature(k<TranscodeType> kVar) {
        return kVar.theme(this.context.getTheme()).signature(wj.a.c(this.context));
    }

    private com.bumptech.glide.request.e buildRequest(uj.j<TranscodeType> jVar, com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        return buildRequestRecursive(new Object(), jVar, hVar, null, this.transitionOptions, aVar.getPriority(), aVar.getOverrideWidth(), aVar.getOverrideHeight(), aVar, executor);
    }

    private com.bumptech.glide.request.e buildRequestRecursive(Object obj, uj.j<TranscodeType> jVar, com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.f fVar, m<?, ? super TranscodeType> mVar, h hVar2, int i11, int i12, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        com.bumptech.glide.request.b bVar;
        com.bumptech.glide.request.f fVar2;
        if (this.errorBuilder != null) {
            bVar = new com.bumptech.glide.request.b(obj, fVar);
            fVar2 = bVar;
        } else {
            bVar = null;
            fVar2 = fVar;
        }
        com.bumptech.glide.request.e eVarBuildThumbnailRequestRecursive = buildThumbnailRequestRecursive(obj, jVar, hVar, fVar2, mVar, hVar2, i11, i12, aVar, executor);
        if (bVar == null) {
            return eVarBuildThumbnailRequestRecursive;
        }
        int overrideWidth = this.errorBuilder.getOverrideWidth();
        int overrideHeight = this.errorBuilder.getOverrideHeight();
        if (xj.l.u(i11, i12) && !this.errorBuilder.isValidOverride()) {
            overrideWidth = aVar.getOverrideWidth();
            overrideHeight = aVar.getOverrideHeight();
        }
        k<TranscodeType> kVar = this.errorBuilder;
        com.bumptech.glide.request.b bVar2 = bVar;
        bVar2.o(eVarBuildThumbnailRequestRecursive, kVar.buildRequestRecursive(obj, jVar, hVar, bVar2, kVar.transitionOptions, kVar.getPriority(), overrideWidth, overrideHeight, this.errorBuilder, executor));
        return bVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private com.bumptech.glide.request.e buildThumbnailRequestRecursive(Object obj, uj.j<TranscodeType> jVar, com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.f fVar, m<?, ? super TranscodeType> mVar, h hVar2, int i11, int i12, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        k<TranscodeType> kVar = this.thumbnailBuilder;
        if (kVar == null) {
            if (this.thumbSizeMultiplier == null) {
                return obtainRequest(obj, jVar, hVar, aVar, fVar, mVar, hVar2, i11, i12, executor);
            }
            com.bumptech.glide.request.l lVar = new com.bumptech.glide.request.l(obj, fVar);
            lVar.n(obtainRequest(obj, jVar, hVar, aVar, lVar, mVar, hVar2, i11, i12, executor), obtainRequest(obj, jVar, hVar, aVar.mo63clone().sizeMultiplier(this.thumbSizeMultiplier.floatValue()), lVar, mVar, getThumbnailPriority(hVar2), i11, i12, executor));
            return lVar;
        }
        if (this.isThumbnailBuilt) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        m<?, ? super TranscodeType> mVar2 = kVar.isDefaultTransitionOptionsSet ? mVar : kVar.transitionOptions;
        h priority = kVar.isPrioritySet() ? this.thumbnailBuilder.getPriority() : getThumbnailPriority(hVar2);
        int overrideWidth = this.thumbnailBuilder.getOverrideWidth();
        int overrideHeight = this.thumbnailBuilder.getOverrideHeight();
        if (xj.l.u(i11, i12) && !this.thumbnailBuilder.isValidOverride()) {
            overrideWidth = aVar.getOverrideWidth();
            overrideHeight = aVar.getOverrideHeight();
        }
        com.bumptech.glide.request.l lVar2 = new com.bumptech.glide.request.l(obj, fVar);
        com.bumptech.glide.request.e eVarObtainRequest = obtainRequest(obj, jVar, hVar, aVar, lVar2, mVar, hVar2, i11, i12, executor);
        this.isThumbnailBuilt = true;
        k<TranscodeType> kVar2 = this.thumbnailBuilder;
        com.bumptech.glide.request.e eVarBuildRequestRecursive = kVar2.buildRequestRecursive(obj, jVar, hVar, lVar2, mVar2, priority, overrideWidth, overrideHeight, kVar2, executor);
        this.isThumbnailBuilt = false;
        lVar2.n(eVarObtainRequest, eVarBuildRequestRecursive);
        return lVar2;
    }

    private k<TranscodeType> cloneWithNullErrorAndThumbnail() {
        return mo63clone().error((k) null).thumbnail((k) null);
    }

    @NonNull
    private h getThumbnailPriority(@NonNull h hVar) {
        int i11 = a.f20505b[hVar.ordinal()];
        if (i11 == 1) {
            return h.NORMAL;
        }
        if (i11 == 2) {
            return h.HIGH;
        }
        if (i11 == 3 || i11 == 4) {
            return h.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + getPriority());
    }

    @SuppressLint({"CheckResult"})
    private void initRequestListeners(List<com.bumptech.glide.request.h<Object>> list) {
        Iterator<com.bumptech.glide.request.h<Object>> it = list.iterator();
        while (it.hasNext()) {
            addListener((com.bumptech.glide.request.h) it.next());
        }
    }

    private boolean isSkipMemoryCacheWithCompletePreviousRequest(com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.e eVar) {
        return !aVar.isMemoryCacheable() && eVar.isComplete();
    }

    @NonNull
    private k<TranscodeType> loadGeneric(Object obj) {
        if (isAutoCloneEnabled()) {
            return mo63clone().loadGeneric(obj);
        }
        this.model = obj;
        this.isModelSet = true;
        return selfOrThrowIfLocked();
    }

    private k<TranscodeType> maybeApplyOptionsResourceUri(Uri uri, k<TranscodeType> kVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? kVar : applyResourceThemeAndSignature(kVar);
    }

    private com.bumptech.glide.request.e obtainRequest(Object obj, uj.j<TranscodeType> jVar, com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.f fVar, m<?, ? super TranscodeType> mVar, h hVar2, int i11, int i12, Executor executor) {
        Context context = this.context;
        e eVar = this.glideContext;
        return com.bumptech.glide.request.k.y(context, eVar, obj, this.model, this.transcodeClass, aVar, i11, i12, hVar2, jVar, hVar, this.requestListeners, fVar, eVar.f(), mVar.b(), executor);
    }

    @NonNull
    public k<TranscodeType> addListener(com.bumptech.glide.request.h<TranscodeType> hVar) {
        if (isAutoCloneEnabled()) {
            return mo63clone().addListener(hVar);
        }
        if (hVar != null) {
            if (this.requestListeners == null) {
                this.requestListeners = new ArrayList();
            }
            this.requestListeners.add(hVar);
        }
        return selfOrThrowIfLocked();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a apply(@NonNull com.bumptech.glide.request.a aVar) {
        return apply((com.bumptech.glide.request.a<?>) aVar);
    }

    @Deprecated
    public <Y extends uj.j<File>> Y downloadOnly(@NonNull Y y11) {
        return (Y) getDownloadOnlyRequest().into(y11);
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (super.equals(kVar) && Objects.equals(this.transcodeClass, kVar.transcodeClass) && this.transitionOptions.equals(kVar.transitionOptions) && Objects.equals(this.model, kVar.model) && Objects.equals(this.requestListeners, kVar.requestListeners) && Objects.equals(this.thumbnailBuilder, kVar.thumbnailBuilder) && Objects.equals(this.errorBuilder, kVar.errorBuilder) && Objects.equals(this.thumbSizeMultiplier, kVar.thumbSizeMultiplier) && this.isDefaultTransitionOptionsSet == kVar.isDefaultTransitionOptionsSet && this.isModelSet == kVar.isModelSet) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public k<TranscodeType> error(k<TranscodeType> kVar) {
        if (isAutoCloneEnabled()) {
            return mo63clone().error((k) kVar);
        }
        this.errorBuilder = kVar;
        return selfOrThrowIfLocked();
    }

    @NonNull
    protected k<File> getDownloadOnlyRequest() {
        return new k(File.class, this).apply((com.bumptech.glide.request.a<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    Object getModel() {
        return this.model;
    }

    l getRequestManager() {
        return this.requestManager;
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return xj.l.q(this.isModelSet, xj.l.q(this.isDefaultTransitionOptionsSet, xj.l.p(this.thumbSizeMultiplier, xj.l.p(this.errorBuilder, xj.l.p(this.thumbnailBuilder, xj.l.p(this.requestListeners, xj.l.p(this.model, xj.l.p(this.transitionOptions, xj.l.p(this.transcodeClass, super.hashCode())))))))));
    }

    @NonNull
    public <Y extends uj.j<TranscodeType>> Y into(@NonNull Y y11) {
        return (Y) into(y11, null, xj.e.b());
    }

    @NonNull
    public k<TranscodeType> listener(com.bumptech.glide.request.h<TranscodeType> hVar) {
        if (isAutoCloneEnabled()) {
            return mo63clone().listener(hVar);
        }
        this.requestListeners = null;
        return addListener(hVar);
    }

    @NonNull
    public uj.j<TranscodeType> preload(int i11, int i12) {
        return into(uj.h.b(this.requestManager, i11, i12));
    }

    @NonNull
    public com.bumptech.glide.request.d<TranscodeType> submit() {
        return submit(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    public k<TranscodeType> thumbnail(k<TranscodeType> kVar) {
        if (isAutoCloneEnabled()) {
            return mo63clone().thumbnail(kVar);
        }
        this.thumbnailBuilder = kVar;
        return selfOrThrowIfLocked();
    }

    @NonNull
    public k<TranscodeType> transition(@NonNull m<?, ? super TranscodeType> mVar) {
        if (isAutoCloneEnabled()) {
            return mo63clone().transition(mVar);
        }
        this.transitionOptions = (m) xj.k.d(mVar);
        this.isDefaultTransitionOptionsSet = false;
        return selfOrThrowIfLocked();
    }

    @Override // com.bumptech.glide.request.a
    @NonNull
    public k<TranscodeType> apply(@NonNull com.bumptech.glide.request.a<?> aVar) {
        xj.k.d(aVar);
        return (k) super.apply(aVar);
    }

    @Deprecated
    public com.bumptech.glide.request.d<File> downloadOnly(int i11, int i12) {
        return getDownloadOnlyRequest().submit(i11, i12);
    }

    @NonNull
    <Y extends uj.j<TranscodeType>> Y into(@NonNull Y y11, com.bumptech.glide.request.h<TranscodeType> hVar, Executor executor) {
        return (Y) into(y11, hVar, this, executor);
    }

    @NonNull
    public com.bumptech.glide.request.d<TranscodeType> submit(int i11, int i12) {
        com.bumptech.glide.request.g gVar = new com.bumptech.glide.request.g(i11, i12);
        return (com.bumptech.glide.request.d) into(gVar, gVar, xj.e.a());
    }

    private <Y extends uj.j<TranscodeType>> Y into(@NonNull Y y11, com.bumptech.glide.request.h<TranscodeType> hVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        xj.k.d(y11);
        if (this.isModelSet) {
            com.bumptech.glide.request.e eVarBuildRequest = buildRequest(y11, hVar, aVar, executor);
            com.bumptech.glide.request.e request = y11.getRequest();
            if (eVarBuildRequest.g(request) && !isSkipMemoryCacheWithCompletePreviousRequest(aVar, request)) {
                if (!((com.bumptech.glide.request.e) xj.k.d(request)).isRunning()) {
                    request.i();
                }
                return y11;
            }
            this.requestManager.clear((uj.j<?>) y11);
            y11.setRequest(eVarBuildRequest);
            this.requestManager.track(y11, eVarBuildRequest);
            return y11;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @Override // com.bumptech.glide.request.a
    /* JADX INFO: renamed from: clone */
    public k<TranscodeType> mo63clone() {
        k<TranscodeType> kVar = (k) super.mo63clone();
        kVar.transitionOptions = kVar.transitionOptions.clone();
        if (kVar.requestListeners != null) {
            kVar.requestListeners = new ArrayList(kVar.requestListeners);
        }
        k<TranscodeType> kVar2 = kVar.thumbnailBuilder;
        if (kVar2 != null) {
            kVar.thumbnailBuilder = kVar2.mo63clone();
        }
        k<TranscodeType> kVar3 = kVar.errorBuilder;
        if (kVar3 != null) {
            kVar.errorBuilder = kVar3.mo63clone();
        }
        return kVar;
    }

    @NonNull
    public uj.j<TranscodeType> preload() {
        return preload(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @NonNull
    public k<TranscodeType> error(Object obj) {
        if (obj == null) {
            return error((k) null);
        }
        return error((k) cloneWithNullErrorAndThumbnail().mo69load(obj));
    }

    @NonNull
    public k<TranscodeType> thumbnail(k<TranscodeType>... kVarArr) {
        if (kVarArr != null && kVarArr.length != 0) {
            return thumbnail(Arrays.asList(kVarArr));
        }
        return thumbnail((k) null);
    }

    @NonNull
    public k<TranscodeType> thumbnail(List<k<TranscodeType>> list) {
        k<TranscodeType> kVarThumbnail = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                k<TranscodeType> kVar = list.get(size);
                if (kVar != null) {
                    kVarThumbnail = kVarThumbnail == null ? kVar : kVar.thumbnail(kVarThumbnail);
                }
            }
            return thumbnail(kVarThumbnail);
        }
        return thumbnail((k) null);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> mo69load(Object obj) {
        return loadGeneric(obj);
    }

    @SuppressLint({"CheckResult"})
    protected k(Class<TranscodeType> cls, k<?> kVar) {
        this(kVar.glide, kVar.requestManager, cls, kVar.context);
        this.model = kVar.model;
        this.isModelSet = kVar.isModelSet;
        apply((com.bumptech.glide.request.a<?>) kVar);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> mo64load(Bitmap bitmap) {
        return loadGeneric(bitmap).apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.i.diskCacheStrategyOf(fj.a.f66013b));
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> mo65load(Drawable drawable) {
        return loadGeneric(drawable).apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.i.diskCacheStrategyOf(fj.a.f66013b));
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> mo70load(String str) {
        return loadGeneric(str);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> mo66load(Uri uri) {
        return maybeApplyOptionsResourceUri(uri, loadGeneric(uri));
    }

    @NonNull
    @Deprecated
    public k<TranscodeType> thumbnail(float f11) {
        if (isAutoCloneEnabled()) {
            return mo63clone().thumbnail(f11);
        }
        if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 <= 1.0f) {
            this.thumbSizeMultiplier = Float.valueOf(f11);
            return selfOrThrowIfLocked();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @NonNull
    public uj.k<ImageView, TranscodeType> into(@NonNull ImageView imageView) {
        com.bumptech.glide.request.a aVarOptionalCenterCrop;
        xj.l.b();
        xj.k.d(imageView);
        if (!isTransformationSet() && isTransformationAllowed() && imageView.getScaleType() != null) {
            switch (a.f20504a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarOptionalCenterCrop = mo63clone().optionalCenterCrop();
                    break;
                case 2:
                    aVarOptionalCenterCrop = mo63clone().optionalCenterInside();
                    break;
                case 3:
                case 4:
                case 5:
                    aVarOptionalCenterCrop = mo63clone().optionalFitCenter();
                    break;
                case 6:
                    aVarOptionalCenterCrop = mo63clone().optionalCenterInside();
                    break;
                default:
                    aVarOptionalCenterCrop = this;
                    break;
            }
        } else {
            aVarOptionalCenterCrop = this;
        }
        return (uj.k) into(this.glideContext.a(imageView, this.transcodeClass), null, aVarOptionalCenterCrop, xj.e.b());
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> mo67load(File file) {
        return loadGeneric(file);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> mo68load(Integer num) {
        return applyResourceThemeAndSignature(loadGeneric(num));
    }

    @Override // 
    @Deprecated
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> mo71load(URL url) {
        return loadGeneric(url);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> mo72load(byte[] bArr) {
        k<TranscodeType> kVarLoadGeneric = loadGeneric(bArr);
        if (!kVarLoadGeneric.isDiskCacheStrategySet()) {
            kVarLoadGeneric = kVarLoadGeneric.apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.i.diskCacheStrategyOf(fj.a.f66013b));
        }
        return !kVarLoadGeneric.isSkipMemoryCacheSet() ? kVarLoadGeneric.apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.i.skipMemoryCacheOf(true)) : kVarLoadGeneric;
    }

    @Deprecated
    public com.bumptech.glide.request.d<TranscodeType> into(int i11, int i12) {
        return submit(i11, i12);
    }
}
