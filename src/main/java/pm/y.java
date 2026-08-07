package pm;

import android.content.Context;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.l1;
import com.facebook.imagepipeline.producers.m1;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Class<?> f103433p = y.class;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static y f103434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static t f103435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f103436s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1 f103437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f103438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f103439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pk.n<c> f103440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private nm.n<jk.d, um.e> f103441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private nm.u<jk.d, um.e> f103442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private nm.n<jk.d, PooledByteBuffer> f103443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private nm.u<jk.d, PooledByteBuffer> f103444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private sm.b f103445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private cn.d f103446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c0 f103447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v0 f103448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private mm.d f103449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ym.d f103450n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private im.a f103451o;

    public y(v vVar) {
        if (bn.b.d()) {
            bn.b.a("ImagePipelineConfig()");
        }
        v vVar2 = (v) pk.k.g(vVar);
        this.f103438b = vVar2;
        this.f103437a = vVar2.getExperiments().getIsExperimentalThreadHandoffQueueEnabled() ? new com.facebook.imagepipeline.producers.b0(vVar.getExecutorSupplier().getLightWeightBackgroundExecutor()) : new m1(vVar.getExecutorSupplier().getLightWeightBackgroundExecutor());
        this.f103439c = new a(vVar.getCloseableReferenceLeakTracker());
        if (bn.b.d()) {
            bn.b.b();
        }
        this.f103440d = vVar2.A();
        if (vVar2.getExperiments().getIsBinaryXmlEnabled()) {
            gm.e.e().g(true);
        }
    }

    private t a() {
        v0 v0VarP = p();
        Set<wm.e> setQ = this.f103438b.q();
        Set<wm.d> setA = this.f103438b.a();
        pk.n<Boolean> nVarL = this.f103438b.l();
        nm.u<jk.d, um.e> uVarE = e();
        nm.u<jk.d, PooledByteBuffer> uVarH = h();
        pk.n<c> nVar = this.f103440d;
        nm.k cacheKeyFactory = this.f103438b.getCacheKeyFactory();
        l1 l1Var = this.f103437a;
        pk.n<Boolean> nVarT = this.f103438b.getExperiments().t();
        pk.n<Boolean> nVarI = this.f103438b.getExperiments().I();
        this.f103438b.G();
        return new t(v0VarP, setQ, setA, nVarL, uVarE, uVarH, nVar, cacheKeyFactory, l1Var, nVarT, nVarI, null, this.f103438b);
    }

    private im.a c() {
        if (this.f103451o == null) {
            this.f103451o = im.b.a(m(), this.f103438b.getExecutorSupplier(), d(), this.f103438b.getExperiments().getDownscaleFrameToDrawableDimensions(), this.f103438b.getExperiments().getUseBalancedAnimationStrategy(), this.f103438b.getExperiments().getAnimationRenderFpsLimit(), this.f103438b.getExperiments().getAnimationStrategyBufferLengthMilliseconds(), this.f103438b.getExecutorServiceForAnimatedImages());
        }
        return this.f103451o;
    }

    private sm.b i() {
        sm.b bVarC;
        sm.b bVarB;
        if (this.f103445i == null) {
            if (this.f103438b.getImageDecoder() != null) {
                this.f103445i = this.f103438b.getImageDecoder();
            } else {
                im.a aVarC = c();
                if (aVarC != null) {
                    bVarC = aVarC.c();
                    bVarB = aVarC.b();
                } else {
                    bVarC = null;
                    bVarB = null;
                }
                sm.b bVarR = r();
                this.f103438b.x();
                this.f103445i = new sm.a(bVarC, bVarB, bVarR, n());
            }
        }
        return this.f103445i;
    }

    private cn.d k() {
        if (this.f103446j == null) {
            if (this.f103438b.getImageTranscoderFactory() == null && this.f103438b.getImageTranscoderType() == null && this.f103438b.getExperiments().getIsNativeCodeDisabled()) {
                this.f103446j = new cn.h(this.f103438b.getExperiments().getMaxBitmapDimension());
            } else {
                this.f103446j = new cn.f(this.f103438b.getExperiments().getMaxBitmapDimension(), this.f103438b.getExperiments().getUseDownsamplingRatioForResizing(), this.f103438b.getImageTranscoderFactory(), this.f103438b.getImageTranscoderType(), this.f103438b.getExperiments().getIsEnsureTranscoderLibraryLoaded());
            }
        }
        return this.f103446j;
    }

    public static y l() {
        return (y) pk.k.h(f103434q, "ImagePipelineFactory was not initialized!");
    }

    private c0 o() {
        if (this.f103447k == null) {
            this.f103447k = this.f103438b.getExperiments().getProducerFactoryMethod().a(this.f103438b.getContext(), this.f103438b.getPoolFactory().k(), i(), this.f103438b.getProgressiveJpegConfig(), this.f103438b.getDownsampleMode(), this.f103438b.getIsResizeAndRotateEnabledForNetwork(), this.f103438b.getExperiments().getIsDecodeCancellationEnabled(), this.f103438b.getExecutorSupplier(), this.f103438b.getPoolFactory().i(this.f103438b.getMemoryChunkType()), this.f103438b.getPoolFactory().j(), e(), h(), this.f103440d, this.f103438b.getCacheKeyFactory(), m(), this.f103438b.getExperiments().getBitmapPrepareToDrawMinSizeBytes(), this.f103438b.getExperiments().getBitmapPrepareToDrawMaxSizeBytes(), this.f103438b.getExperiments().getBitmapPrepareToDrawForPrefetch(), this.f103438b.getExperiments().getMaxBitmapDimension(), f(), this.f103438b.getExperiments().getKeepCancelledFetchAsLowPriority(), this.f103438b.getExperiments().getTrackedKeysSize());
        }
        return this.f103447k;
    }

    private v0 p() {
        boolean useBitmapPrepareToDraw = this.f103438b.getExperiments().getUseBitmapPrepareToDraw();
        if (this.f103448l == null) {
            this.f103448l = new v0(this.f103438b.getContext().getApplicationContext().getContentResolver(), o(), this.f103438b.o(), this.f103438b.getIsResizeAndRotateEnabledForNetwork(), this.f103438b.getExperiments().getIsWebpSupportEnabled(), this.f103437a, this.f103438b.getDownsampleMode(), useBitmapPrepareToDraw, this.f103438b.getExperiments().getIsPartialImageCachingEnabled(), this.f103438b.getIsDiskCacheEnabled(), k(), this.f103438b.getExperiments().getIsEncodedMemoryCacheProbingEnabled(), this.f103438b.getExperiments().getIsDiskCacheProbingEnabled(), this.f103438b.getExperiments().getAllowDelay(), this.f103438b.E());
        }
        return this.f103448l;
    }

    public static synchronized void s(Context context) {
        try {
            if (bn.b.d()) {
                bn.b.a("ImagePipelineFactory#initialize");
            }
            t(u.K(context).a());
            if (bn.b.d()) {
                bn.b.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void t(v vVar) {
        if (f103434q != null) {
            qk.a.E(f103433p, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            if (f103436s) {
                return;
            }
        }
        f103434q = new y(vVar);
    }

    public tm.a b(Context context) {
        im.a aVarC = c();
        if (aVarC == null) {
            return null;
        }
        return aVarC.a(context);
    }

    public nm.n<jk.d, um.e> d() {
        if (this.f103441e == null) {
            this.f103441e = this.f103438b.getBitmapMemoryCacheFactory().a(this.f103438b.y(), this.f103438b.getMemoryTrimmableRegistry(), this.f103438b.getBitmapMemoryCacheTrimStrategy(), this.f103438b.getExperiments().getShouldStoreCacheEntrySize(), this.f103438b.getExperiments().getShouldIgnoreCacheSizeMismatch(), this.f103438b.e());
        }
        return this.f103441e;
    }

    public nm.u<jk.d, um.e> e() {
        if (this.f103442f == null) {
            this.f103442f = nm.v.a(d(), this.f103438b.getImageCacheStatsTracker());
        }
        return this.f103442f;
    }

    public a f() {
        return this.f103439c;
    }

    public nm.n<jk.d, PooledByteBuffer> g() {
        if (this.f103443g == null) {
            this.f103443g = nm.r.a(this.f103438b.h(), this.f103438b.getMemoryTrimmableRegistry(), this.f103438b.getEncodedMemoryCacheTrimStrategy());
        }
        return this.f103443g;
    }

    public nm.u<jk.d, PooledByteBuffer> h() {
        if (this.f103444h == null) {
            this.f103444h = nm.s.a(this.f103438b.b() != null ? this.f103438b.b() : g(), this.f103438b.getImageCacheStatsTracker());
        }
        return this.f103444h;
    }

    public t j() {
        if (f103435r == null) {
            f103435r = a();
        }
        return f103435r;
    }

    public mm.d m() {
        if (this.f103449m == null) {
            this.f103449m = mm.e.a(this.f103438b.getPoolFactory(), n(), f());
        }
        return this.f103449m;
    }

    public ym.d n() {
        if (this.f103450n == null) {
            this.f103450n = ym.e.a(this.f103438b.getPoolFactory(), this.f103438b.getExperiments().getIsGingerbreadDecoderEnabled(), this.f103438b.getExperiments().getShouldUseDecodingBufferHelper(), this.f103438b.getExperiments().getPlatformDecoderOptions());
        }
        return this.f103450n;
    }

    public tm.a q() {
        if (this.f103438b.getExperiments().getIsBinaryXmlEnabled()) {
            return new en.a();
        }
        return null;
    }

    public sm.b r() {
        if (this.f103438b.getExperiments().getIsBinaryXmlEnabled()) {
            return new en.b(this.f103438b.getContext().getApplicationContext().getResources());
        }
        return null;
    }
}
