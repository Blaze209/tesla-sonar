package pm;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.common.memory.PooledByteBuffer;
import ezvcard.property.Gender;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 º\u00012\u00020\u0001:\u0003\u0014\u0007\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00107\u001a\b\u0012\u0004\u0012\u0002040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\u000f\u001a\u0004\b6\u0010\u0011R \u00109\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b/\u0010\u0011R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010D\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b;\u0010CR\u001c\u0010I\u001a\u0004\u0018\u00010E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b)\u0010HR\u001c\u0010O\u001a\u0004\u0018\u00010J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010S\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010\u000f\u001a\u0004\bR\u0010\u0011R\"\u0010[\u001a\u0004\u0018\u00010T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR \u0010]\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010\u000f\u001a\u0004\bA\u0010\u0011R\u001a\u0010a\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\bU\u0010`R\u001a\u0010e\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bF\u0010dR \u0010k\u001a\u00020T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bj\u0010Z\u001a\u0004\bh\u0010iR\u001e\u0010p\u001a\u0006\u0012\u0002\b\u00030l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bQ\u0010oR\u0014\u0010q\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010gR\u001c\u0010v\u001a\u0004\u0018\u00010r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010{\u001a\u00020w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\b5\u0010zR\u001a\u0010\u007f\u001a\u00020|8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010}\u001a\u0004\b\u0014\u0010~R%\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bh\u0010\u0082\u0001\u001a\u0005\b\\\u0010\u0083\u0001R%\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b6\u0010\u0082\u0001\u001a\u0005\b\u0007\u0010\u0083\u0001R'\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001R\u001e\u0010\u008e\u0001\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b%\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u008c\u0001\u0010_\u001a\u0004\bf\u0010`R\u001f\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u0091\u0001\u001a\u0005\bK\u0010\u0092\u0001R\u001d\u0010\u0094\u0001\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b1\u0010\u008b\u0001\u001a\u0005\b#\u0010\u008d\u0001R\u001f\u0010\u0099\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0005\b8\u0010\u0098\u0001R.\u0010\u009f\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030\u009b\u0001\u0018\u00010\u009a\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b=\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R-\u0010¡\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030 \u0001\u0018\u00010\u009a\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bg\u0010\u009c\u0001\u001a\u0005\b\u000e\u0010\u009e\u0001R!\u0010¦\u0001\u001a\u0005\u0018\u00010¢\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\bm\u0010¥\u0001R \u0010«\u0001\u001a\u00030§\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\b\u0088\u0001\u0010ª\u0001R.\u0010±\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u00ad\u0001\u0012\u0004\u0012\u00020^\u0018\u00010¬\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0005\b\u0019\u0010°\u0001R!\u0010³\u0001\u001a\u0005\u0018\u00010²\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b³\u0001\u0010´\u0001\u001a\u0005\bx\u0010µ\u0001R\"\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b\u0096\u0001\u0010¹\u0001¨\u0006»\u0001"}, d2 = {"Lpm/u;", "Lpm/v;", "Lpm/u$a;", "builder", "<init>", "(Lpm/u$a;)V", "Landroid/graphics/Bitmap$Config;", "a", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Lpk/n;", "Lnm/y;", "b", "Lpk/n;", "y", "()Lpk/n;", "bitmapMemoryCacheParamsSupplier", "Lnm/x$a;", "c", "Lnm/x$a;", "s", "()Lnm/x$a;", "bitmapMemoryCacheTrimStrategy", DateTokenConverter.CONVERTER_KEY, "r", "encodedMemoryCacheTrimStrategy", "Lnm/n$b;", "Ljk/d;", "e", "Lnm/n$b;", "()Lnm/n$b;", "bitmapMemoryCacheEntryStateObserver", "Lnm/k;", "f", "Lnm/k;", "C", "()Lnm/k;", "cacheKeyFactory", "Landroid/content/Context;", "g", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpm/n;", "h", "Lpm/n;", Gender.FEMALE, "()Lpm/n;", "downsampleMode", "Lpm/c;", IntegerTokenConverter.CONVERTER_KEY, "A", "diskCachesStoreSupplier", "j", "encodedMemoryCacheParamsSupplier", "Lpm/p;", "k", "Lpm/p;", "H", "()Lpm/p;", "executorSupplier", "Lnm/t;", "l", "Lnm/t;", "()Lnm/t;", "imageCacheStatsTracker", "Lsm/b;", "m", "Lsm/b;", "()Lsm/b;", "imageDecoder", "Lcn/d;", "n", "Lcn/d;", "w", "()Lcn/d;", "imageTranscoderFactory", "", "o", "getEnableEncodedImageColorSpaceUsage", "enableEncodedImageColorSpaceUsage", "", "p", "Ljava/lang/Integer;", "v", "()Ljava/lang/Integer;", "getImageTranscoderType$annotations", "()V", "imageTranscoderType", "q", "isPrefetchEnabledSupplier", "Lkk/d;", "Lkk/d;", "()Lkk/d;", "mainDiskCacheConfig", "Lsk/d;", "Lsk/d;", "()Lsk/d;", "memoryTrimmableRegistry", "t", "I", "z", "()I", "getMemoryChunkType$annotations", "memoryChunkType", "Lcom/facebook/imagepipeline/producers/t0;", "u", "Lcom/facebook/imagepipeline/producers/t0;", "()Lcom/facebook/imagepipeline/producers/t0;", "networkFetcher", "httpNetworkTimeout", "Lmm/d;", "Lmm/d;", "getPlatformBitmapFactory", "()Lmm/d;", "platformBitmapFactory", "Lxm/y;", "x", "Lxm/y;", "()Lxm/y;", "poolFactory", "Lsm/d;", "Lsm/d;", "()Lsm/d;", "progressiveJpegConfig", "", "Lwm/e;", "Ljava/util/Set;", "()Ljava/util/Set;", "requestListeners", "Lwm/d;", "requestListener2s", "Lcom/facebook/imagepipeline/producers/o;", "B", "E", "customProducerSequenceFactories", "Z", "D", "()Z", "isResizeAndRotateEnabledForNetwork", "smallImageDiskCacheConfig", "Lpm/x;", "Lpm/x;", "()Lpm/x;", "experiments", "isDiskCacheEnabled", "Lrm/a;", "G", "Lrm/a;", "()Lrm/a;", "closeableReferenceLeakTracker", "Lnm/x;", "Lum/e;", "Lnm/x;", "getBitmapCacheOverride", "()Lnm/x;", "bitmapCacheOverride", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCacheOverride", "Lnk/g;", "J", "Lnk/g;", "()Lnk/g;", "executorServiceForAnimatedImages", "Lnm/a;", "K", "Lnm/a;", "()Lnm/a;", "bitmapMemoryCacheFactory", "", "", "L", "Ljava/util/Map;", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "Lsm/c;", "imageDecoderConfig", "Lsm/c;", "()Lsm/c;", "Llk/a;", "callerContextVerifier", "Llk/a;", "()Llk/a;", Gender.MALE, "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u implements v {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static c N = new c();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Set<wm.d> requestListener2s;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Set<com.facebook.imagepipeline.producers.o> customProducerSequenceFactories;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final boolean isResizeAndRotateEnabledForNetwork;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final kk.d smallImageDiskCacheConfig;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final x experiments;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final boolean isDiskCacheEnabled;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final rm.a closeableReferenceLeakTracker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final nm.x<jk.d, um.e> bitmapCacheOverride;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final nm.x<jk.d, PooledByteBuffer> encodedMemoryCacheOverride;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final nk.g executorServiceForAnimatedImages;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final nm.a bitmapMemoryCacheFactory;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final Map<String, kk.d> dynamicDiskCacheConfigMap;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pk.n<nm.y> bitmapMemoryCacheParamsSupplier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nm.x.a bitmapMemoryCacheTrimStrategy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nm.x.a encodedMemoryCacheTrimStrategy;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final nm.n.b<jk.d> bitmapMemoryCacheEntryStateObserver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final nm.k cacheKeyFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n downsampleMode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final pk.n<pm.c> diskCachesStoreSupplier;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final pk.n<nm.y> encodedMemoryCacheParamsSupplier;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p executorSupplier;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final nm.t imageCacheStatsTracker;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final sm.b imageDecoder;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final cn.d imageTranscoderFactory;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final pk.n<Boolean> enableEncodedImageColorSpaceUsage;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Integer imageTranscoderType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final pk.n<Boolean> isPrefetchEnabledSupplier;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final kk.d mainDiskCacheConfig;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final sk.d memoryTrimmableRegistry;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int memoryChunkType;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.imagepipeline.producers.t0<?> networkFetcher;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final int httpNetworkTimeout;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final mm.d platformBitmapFactory;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final xm.y poolFactory;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final sm.d progressiveJpegConfig;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Set<wm.e> requestListeners;

    @Metadata(d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u001e\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR4\u0010$\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R4\u0010*\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)R(\u00100\u001a\u0004\u0018\u00010+2\b\u0010\u001a\u001a\u0004\u0018\u00010+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R(\u00102\u001a\u0004\u0018\u00010+2\b\u0010\u001a\u001a\u0004\u0018\u00010+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b1\u0010/R(\u00108\u001a\u0004\u0018\u0001032\b\u0010\u001a\u001a\u0004\u0018\u0001038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u00109\u001a\u0004\b:\u0010;R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010<\u001a\u0004\b=\u0010>R4\u0010@\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b?\u0010#R(\u0010F\u001a\u0004\u0018\u00010A2\b\u0010\u001a\u001a\u0004\u0018\u00010A8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER(\u0010L\u001a\u0004\u0018\u00010G2\b\u0010\u001a\u001a\u0004\u0018\u00010G8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR(\u0010Q\u001a\u0004\u0018\u00010M2\b\u0010\u001a\u001a\u0004\u0018\u00010M8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u0010N\u001a\u0004\bO\u0010PR4\u0010U\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010\u001f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bS\u0010!\u001a\u0004\bT\u0010#R(\u0010[\u001a\u0004\u0018\u00010V2\b\u0010\u001a\u001a\u0004\u0018\u00010V8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR*\u0010e\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b]\u0010^\u0012\u0004\bc\u0010d\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR4\u0010g\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010\u001f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u0010!\u001a\u0004\bf\u0010#R(\u0010m\u001a\u0004\u0018\u00010h2\b\u0010\u001a\u001a\u0004\u0018\u00010h8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR(\u0010r\u001a\u0004\u0018\u00010n2\b\u0010\u001a\u001a\u0004\u0018\u00010n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bT\u0010o\u001a\u0004\bp\u0010qR*\u0010w\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bs\u0010^\u0012\u0004\bv\u0010d\u001a\u0004\bt\u0010`\"\u0004\bu\u0010bR0\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b?\u0010x\u001a\u0004\by\u0010zR(\u0010\u007f\u001a\u0004\u0018\u00010{2\b\u0010\u001a\u001a\u0004\u0018\u00010{8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010|\u001a\u0004\b}\u0010~R.\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0080\u00012\t\u0010\u001a\u001a\u0005\u0018\u00010\u0080\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bD\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R/\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0085\u00012\t\u0010\u001a\u001a\u0005\u0018\u00010\u0085\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R8\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R;\u0010\u0092\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u000e2\u000f\u0010\u001a\u001a\u000b\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u008c\u0001\u001a\u0006\b\u0091\u0001\u0010\u008e\u0001R9\u0010\u0094\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0093\u0001\u0018\u00010\u000e2\u000f\u0010\u001a\u001a\u000b\u0012\u0005\u0012\u00030\u0093\u0001\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bJ\u0010\u008c\u0001\u001a\u0005\bS\u0010\u008e\u0001R(\u0010\u0098\u0001\u001a\u00020R2\u0006\u0010\u001a\u001a\u00020R8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bO\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R+\u0010\u009b\u0001\u001a\u0004\u0018\u00010h2\b\u0010\u001a\u001a\u0004\u0018\u00010h8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010j\u001a\u0005\b\u009a\u0001\u0010lR.\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009c\u00012\t\u0010\u001a\u001a\u0005\u0018\u00010\u009c\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bY\u0010\u009d\u0001\u001a\u0006\b\u008b\u0001\u0010\u009e\u0001R7\u0010¡\u0001\u001a\u000b\u0012\u0005\u0012\u00030 \u0001\u0018\u00010\u001f2\u000f\u0010\u001a\u001a\u000b\u0012\u0005\u0012\u00030 \u0001\u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010!\u001a\u0004\b]\u0010#R'\u0010£\u0001\u001a\u00020\\2\u0006\u0010\u001a\u001a\u00020\\8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\bk\u0010}\u001a\u0006\b\u0090\u0001\u0010¢\u0001R\u001a\u0010¥\u0001\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\bt\u0010¤\u0001\u001a\u0005\b\u0086\u0001\u0010\u0015R'\u0010¦\u0001\u001a\u00020R2\u0006\u0010\u001a\u001a\u00020R8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bp\u0010\u0095\u0001\u001a\u0005\bW\u0010\u0097\u0001R)\u0010ª\u0001\u001a\u00030§\u00012\u0007\u0010\u001a\u001a\u00030§\u00018\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\by\u0010¨\u0001\u001a\u0005\bH\u0010©\u0001RG\u0010¯\u0001\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010«\u00012\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010«\u00018\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b}\u0010\u00ad\u0001\u001a\u0005\b,\u0010®\u0001RH\u0010±\u0001\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030°\u0001\u0018\u00010«\u00012\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0005\u0012\u00030°\u0001\u0018\u00010«\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u00ad\u0001\u001a\u0005\bs\u0010®\u0001R/\u0010¶\u0001\u001a\u0005\u0018\u00010²\u00012\t\u0010\u001a\u001a\u0005\u0018\u00010²\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R.\u0010º\u0001\u001a\u0005\u0018\u00010·\u00012\t\u0010\u001a\u001a\u0005\u0018\u00010·\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010¸\u0001\u001a\u0005\b4\u0010¹\u0001RH\u0010¿\u0001\u001a\u0012\u0012\u0005\u0012\u00030¼\u0001\u0012\u0004\u0012\u00020h\u0018\u00010»\u00012\u0016\u0010\u001a\u001a\u0012\u0012\u0005\u0012\u00030¼\u0001\u0012\u0004\u0012\u00020h\u0018\u00010»\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010½\u0001\u001a\u0005\bi\u0010¾\u0001R/\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00012\t\u0010\u001a\u001a\u0005\u0018\u00010À\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\b\u0099\u0001\u0010Ã\u0001R.\u0010Å\u0001\u001a\u0005\u0018\u00010Ä\u00012\t\u0010\u001a\u001a\u0005\u0018\u00010Ä\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0005\bB\u0010Ç\u0001¨\u0006È\u0001"}, d2 = {"Lpm/u$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lpm/n;", "downsampleMode", "R", "(Lpm/n;)Lpm/u$a;", "Lcom/facebook/imagepipeline/producers/t0;", "networkFetcher", "S", "(Lcom/facebook/imagepipeline/producers/t0;)Lpm/u$a;", "", "Lwm/e;", "requestListeners", "T", "(Ljava/util/Set;)Lpm/u$a;", "Lpm/x$a;", "b", "()Lpm/x$a;", "Lpm/u;", "a", "()Lpm/u;", "Landroid/graphics/Bitmap$Config;", "value", "Landroid/graphics/Bitmap$Config;", "c", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Lpk/n;", "Lnm/y;", "Lpk/n;", "g", "()Lpk/n;", "bitmapMemoryCacheParamsSupplier", "Lnm/n$b;", "Ljk/d;", "Lnm/n$b;", "e", "()Lnm/n$b;", "bitmapMemoryCacheEntryStateObserver", "Lnm/x$a;", DateTokenConverter.CONVERTER_KEY, "Lnm/x$a;", "h", "()Lnm/x$a;", "bitmapMemoryCacheTrimStrategy", "u", "encodedMemoryCacheTrimStrategy", "Lnm/k;", "f", "Lnm/k;", IntegerTokenConverter.CONVERTER_KEY, "()Lnm/k;", "cacheKeyFactory", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "Lpm/n;", "p", "()Lpm/n;", "t", "encodedMemoryCacheParamsSupplier", "Lpm/p;", "j", "Lpm/p;", "v", "()Lpm/p;", "executorSupplier", "Lnm/t;", "k", "Lnm/t;", "z", "()Lnm/t;", "imageCacheStatsTracker", "Lsm/b;", "Lsm/b;", "A", "()Lsm/b;", "imageDecoder", "", "m", "r", "enableEncodedImageColorSpaceUsage", "Lcn/d;", "n", "Lcn/d;", "C", "()Lcn/d;", "imageTranscoderFactory", "", "o", "Ljava/lang/Integer;", "D", "()Ljava/lang/Integer;", "setImageTranscoderType", "(Ljava/lang/Integer;)V", "getImageTranscoderType$annotations", "()V", "imageTranscoderType", "Q", "isPrefetchEnabledSupplier", "Lkk/d;", "q", "Lkk/d;", "E", "()Lkk/d;", "mainDiskCacheConfig", "Lsk/d;", "Lsk/d;", "G", "()Lsk/d;", "memoryTrimmableRegistry", "s", Gender.FEMALE, "setMemoryChunkType", "getMemoryChunkType$annotations", "memoryChunkType", "Lcom/facebook/imagepipeline/producers/t0;", "H", "()Lcom/facebook/imagepipeline/producers/t0;", "Lmm/d;", "Lmm/d;", "I", "()Lmm/d;", "platformBitmapFactory", "Lxm/y;", "Lxm/y;", "J", "()Lxm/y;", "poolFactory", "Lsm/d;", "w", "Lsm/d;", "K", "()Lsm/d;", "progressiveJpegConfig", "x", "Ljava/util/Set;", Gender.MALE, "()Ljava/util/Set;", "Lwm/d;", "y", "L", "requestListener2s", "Lcom/facebook/imagepipeline/producers/o;", "customProducerSequenceFactories", "Z", Gender.NONE, "()Z", "resizeAndRotateEnabledForNetwork", "B", "P", "smallImageDiskCacheConfig", "Lpm/q;", "Lpm/q;", "()Lpm/q;", "fileCacheFactory", "Lpm/c;", "diskCachesStoreSupplier", "()I", "httpConnectionTimeout", "Lpm/x$a;", "experimentsBuilder", "diskCacheEnabled", "Lrm/a;", "Lrm/a;", "()Lrm/a;", "closeableReferenceLeakTracker", "Lnm/x;", "Lum/e;", "Lnm/x;", "()Lnm/x;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Lnk/g;", "Lnk/g;", Gender.OTHER, "()Lnk/g;", "serialExecutorServiceForAnimatedImages", "Lnm/a;", "Lnm/a;", "()Lnm/a;", "bitmapMemoryCacheFactory", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "Lsm/c;", "imageDecoderConfig", "Lsm/c;", "()Lsm/c;", "Llk/a;", "callerContextVerifier", "Llk/a;", "()Llk/a;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private boolean resizeAndRotateEnabledForNetwork;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private kk.d smallImageDiskCacheConfig;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private q fileCacheFactory;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private pk.n<pm.c> diskCachesStoreSupplier;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private int httpConnectionTimeout;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final x.a experimentsBuilder;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private boolean diskCacheEnabled;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private rm.a closeableReferenceLeakTracker;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        private nm.x<jk.d, um.e> bitmapMemoryCache;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        private nm.x<jk.d, PooledByteBuffer> encodedMemoryCache;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        private nk.g serialExecutorServiceForAnimatedImages;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        private nm.a bitmapMemoryCacheFactory;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        private Map<String, ? extends kk.d> dynamicDiskCacheConfigMap;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Bitmap.Config bitmapConfig;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private pk.n<nm.y> bitmapMemoryCacheParamsSupplier;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private nm.n.b<jk.d> bitmapMemoryCacheEntryStateObserver;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private nm.x.a bitmapMemoryCacheTrimStrategy;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private nm.x.a encodedMemoryCacheTrimStrategy;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private nm.k cacheKeyFactory;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private n downsampleMode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private pk.n<nm.y> encodedMemoryCacheParamsSupplier;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private p executorSupplier;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private nm.t imageCacheStatsTracker;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private sm.b imageDecoder;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private pk.n<Boolean> enableEncodedImageColorSpaceUsage;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private cn.d imageTranscoderFactory;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private Integer imageTranscoderType;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private pk.n<Boolean> isPrefetchEnabledSupplier;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private kk.d mainDiskCacheConfig;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private sk.d memoryTrimmableRegistry;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private Integer memoryChunkType;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private com.facebook.imagepipeline.producers.t0<?> networkFetcher;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private mm.d platformBitmapFactory;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private xm.y poolFactory;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private sm.d progressiveJpegConfig;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private Set<? extends wm.e> requestListeners;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private Set<? extends wm.d> requestListener2s;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private Set<? extends com.facebook.imagepipeline.producers.o> customProducerSequenceFactories;

        public a(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            this.downsampleMode = n.AUTO;
            this.resizeAndRotateEnabledForNetwork = true;
            this.httpConnectionTimeout = -1;
            this.experimentsBuilder = new x.a(this);
            this.diskCacheEnabled = true;
            this.closeableReferenceLeakTracker = new rm.b();
            this.context = context;
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final sm.b getImageDecoder() {
            return this.imageDecoder;
        }

        public final sm.c B() {
            return null;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final cn.d getImageTranscoderFactory() {
            return this.imageTranscoderFactory;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final Integer getImageTranscoderType() {
            return this.imageTranscoderType;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final kk.d getMainDiskCacheConfig() {
            return this.mainDiskCacheConfig;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final Integer getMemoryChunkType() {
            return this.memoryChunkType;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final sk.d getMemoryTrimmableRegistry() {
            return this.memoryTrimmableRegistry;
        }

        public final com.facebook.imagepipeline.producers.t0<?> H() {
            return this.networkFetcher;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final mm.d getPlatformBitmapFactory() {
            return this.platformBitmapFactory;
        }

        /* JADX INFO: renamed from: J, reason: from getter */
        public final xm.y getPoolFactory() {
            return this.poolFactory;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final sm.d getProgressiveJpegConfig() {
            return this.progressiveJpegConfig;
        }

        public final Set<wm.d> L() {
            return this.requestListener2s;
        }

        public final Set<wm.e> M() {
            return this.requestListeners;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public final boolean getResizeAndRotateEnabledForNetwork() {
            return this.resizeAndRotateEnabledForNetwork;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final nk.g getSerialExecutorServiceForAnimatedImages() {
            return this.serialExecutorServiceForAnimatedImages;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public final kk.d getSmallImageDiskCacheConfig() {
            return this.smallImageDiskCacheConfig;
        }

        public final pk.n<Boolean> Q() {
            return this.isPrefetchEnabledSupplier;
        }

        public final a R(n downsampleMode) {
            p013kotlin.jvm.internal.s.k(downsampleMode, "downsampleMode");
            this.downsampleMode = downsampleMode;
            return this;
        }

        public final a S(com.facebook.imagepipeline.producers.t0<?> networkFetcher) {
            this.networkFetcher = networkFetcher;
            return this;
        }

        public final a T(Set<? extends wm.e> requestListeners) {
            this.requestListeners = requestListeners;
            return this;
        }

        public final u a() {
            return new u(this, null);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final x.a getExperimentsBuilder() {
            return this.experimentsBuilder;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Bitmap.Config getBitmapConfig() {
            return this.bitmapConfig;
        }

        public final nm.x<jk.d, um.e> d() {
            return this.bitmapMemoryCache;
        }

        public final nm.n.b<jk.d> e() {
            return this.bitmapMemoryCacheEntryStateObserver;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final nm.a getBitmapMemoryCacheFactory() {
            return this.bitmapMemoryCacheFactory;
        }

        public final pk.n<nm.y> g() {
            return this.bitmapMemoryCacheParamsSupplier;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final nm.x.a getBitmapMemoryCacheTrimStrategy() {
            return this.bitmapMemoryCacheTrimStrategy;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final nm.k getCacheKeyFactory() {
            return this.cacheKeyFactory;
        }

        public final lk.a j() {
            return null;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final rm.a getCloseableReferenceLeakTracker() {
            return this.closeableReferenceLeakTracker;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        public final Set<com.facebook.imagepipeline.producers.o> m() {
            return this.customProducerSequenceFactories;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getDiskCacheEnabled() {
            return this.diskCacheEnabled;
        }

        public final pk.n<pm.c> o() {
            return this.diskCachesStoreSupplier;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final n getDownsampleMode() {
            return this.downsampleMode;
        }

        public final Map<String, kk.d> q() {
            return this.dynamicDiskCacheConfigMap;
        }

        public final pk.n<Boolean> r() {
            return this.enableEncodedImageColorSpaceUsage;
        }

        public final nm.x<jk.d, PooledByteBuffer> s() {
            return this.encodedMemoryCache;
        }

        public final pk.n<nm.y> t() {
            return this.encodedMemoryCacheParamsSupplier;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final nm.x.a getEncodedMemoryCacheTrimStrategy() {
            return this.encodedMemoryCacheTrimStrategy;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final p getExecutorSupplier() {
            return this.executorSupplier;
        }

        public final x.a w() {
            return this.experimentsBuilder;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final q getFileCacheFactory() {
            return this.fileCacheFactory;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final int getHttpConnectionTimeout() {
            return this.httpConnectionTimeout;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final nm.t getImageCacheStatsTracker() {
            return this.imageCacheStatsTracker;
        }
    }

    /* JADX INFO: renamed from: pm.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lpm/u$b;", "", "<init>", "()V", "Lyk/b;", "webpBitmapFactory", "Lpm/x;", "imagePipelineExperiments", "Lyk/a;", "bitmapCreator", "Ljn0/h0;", "j", "(Lyk/b;Lpm/x;Lyk/a;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkk/d;", "f", "(Landroid/content/Context;)Lkk/d;", "Lpm/u$a;", "builder", "Lcn/d;", "g", "(Lpm/u$a;)Lcn/d;", "", "h", "(Lpm/u$a;Lpm/x;)I", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Lpm/u$a;", "Lpm/u$c;", "value", "defaultImageRequestConfig", "Lpm/u$c;", "e", "()Lpm/u$c;", "getDefaultImageRequestConfig$annotations", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final kk.d f(Context context) {
            kk.d dVarN;
            if (bn.b.d()) {
                bn.b.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
                try {
                    dVarN = kk.d.m(context).n();
                    bn.b.b();
                } catch (Throwable th2) {
                    bn.b.b();
                    throw th2;
                }
            } else {
                dVarN = kk.d.m(context).n();
            }
            p013kotlin.jvm.internal.s.j(dVarN, "traceSection(...)");
            return dVarN;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final cn.d g(a builder) {
            if (builder.getImageTranscoderFactory() == null || builder.getImageTranscoderType() == null) {
                return builder.getImageTranscoderFactory();
            }
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int h(a builder, x imagePipelineExperiments) {
            Integer memoryChunkType = builder.getMemoryChunkType();
            if (memoryChunkType != null) {
                return memoryChunkType.intValue();
            }
            if (imagePipelineExperiments.getMemoryType() == 2 && Build.VERSION.SDK_INT >= 27) {
                return 2;
            }
            if (imagePipelineExperiments.getMemoryType() == 1) {
                return 1;
            }
            imagePipelineExperiments.getMemoryType();
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j(yk.b webpBitmapFactory, x imagePipelineExperiments, yk.a bitmapCreator) {
            yk.c.f125641c = webpBitmapFactory;
            imagePipelineExperiments.z();
            if (bitmapCreator != null) {
                webpBitmapFactory.a(bitmapCreator);
            }
        }

        public final c e() {
            return u.N;
        }

        public final a i(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            return new a(context);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lpm/u$c;", "", "<init>", "()V", "", "a", "Z", "()Z", "setProgressiveRenderingEnabled", "(Z)V", "isProgressiveRenderingEnabled", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean isProgressiveRenderingEnabled;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsProgressiveRenderingEnabled() {
            return this.isProgressiveRenderingEnabled;
        }
    }

    public /* synthetic */ u(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public static final c J() {
        return INSTANCE.e();
    }

    public static final a K(Context context) {
        return INSTANCE.i(context);
    }

    @Override // pm.v
    public pk.n<pm.c> A() {
        return this.diskCachesStoreSupplier;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: B, reason: from getter */
    public nm.a getBitmapMemoryCacheFactory() {
        return this.bitmapMemoryCacheFactory;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: C, reason: from getter */
    public nm.k getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: D, reason: from getter */
    public boolean getIsResizeAndRotateEnabledForNetwork() {
        return this.isResizeAndRotateEnabledForNetwork;
    }

    @Override // pm.v
    public Set<com.facebook.imagepipeline.producers.o> E() {
        return this.customProducerSequenceFactories;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: F, reason: from getter */
    public n getDownsampleMode() {
        return this.downsampleMode;
    }

    @Override // pm.v
    public lk.a G() {
        return null;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: H, reason: from getter */
    public p getExecutorSupplier() {
        return this.executorSupplier;
    }

    @Override // pm.v
    public Set<wm.d> a() {
        return this.requestListener2s;
    }

    @Override // pm.v
    public nm.x<jk.d, PooledByteBuffer> b() {
        return this.encodedMemoryCacheOverride;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: c, reason: from getter */
    public sm.d getProgressiveJpegConfig() {
        return this.progressiveJpegConfig;
    }

    @Override // pm.v
    public Map<String, kk.d> d() {
        return this.dynamicDiskCacheConfigMap;
    }

    @Override // pm.v
    public nm.n.b<jk.d> e() {
        return this.bitmapMemoryCacheEntryStateObserver;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getIsDiskCacheEnabled() {
        return this.isDiskCacheEnabled;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: g, reason: from getter */
    public sm.b getImageDecoder() {
        return this.imageDecoder;
    }

    @Override // pm.v
    public Context getContext() {
        return this.context;
    }

    @Override // pm.v
    public pk.n<nm.y> h() {
        return this.encodedMemoryCacheParamsSupplier;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: i, reason: from getter */
    public xm.y getPoolFactory() {
        return this.poolFactory;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: j, reason: from getter */
    public rm.a getCloseableReferenceLeakTracker() {
        return this.closeableReferenceLeakTracker;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: k, reason: from getter */
    public nm.t getImageCacheStatsTracker() {
        return this.imageCacheStatsTracker;
    }

    @Override // pm.v
    public pk.n<Boolean> l() {
        return this.isPrefetchEnabledSupplier;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: m, reason: from getter */
    public sk.d getMemoryTrimmableRegistry() {
        return this.memoryTrimmableRegistry;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: n, reason: from getter */
    public x getExperiments() {
        return this.experiments;
    }

    @Override // pm.v
    public com.facebook.imagepipeline.producers.t0<?> o() {
        return this.networkFetcher;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: p, reason: from getter */
    public kk.d getMainDiskCacheConfig() {
        return this.mainDiskCacheConfig;
    }

    @Override // pm.v
    public Set<wm.e> q() {
        return this.requestListeners;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: r, reason: from getter */
    public nm.x.a getEncodedMemoryCacheTrimStrategy() {
        return this.encodedMemoryCacheTrimStrategy;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: s, reason: from getter */
    public nm.x.a getBitmapMemoryCacheTrimStrategy() {
        return this.bitmapMemoryCacheTrimStrategy;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: t, reason: from getter */
    public kk.d getSmallImageDiskCacheConfig() {
        return this.smallImageDiskCacheConfig;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: u, reason: from getter */
    public nk.g getExecutorServiceForAnimatedImages() {
        return this.executorServiceForAnimatedImages;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: v, reason: from getter */
    public Integer getImageTranscoderType() {
        return this.imageTranscoderType;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: w, reason: from getter */
    public cn.d getImageTranscoderFactory() {
        return this.imageTranscoderFactory;
    }

    @Override // pm.v
    public sm.c x() {
        return null;
    }

    @Override // pm.v
    public pk.n<nm.y> y() {
        return this.bitmapMemoryCacheParamsSupplier;
    }

    @Override // pm.v
    /* JADX INFO: renamed from: z, reason: from getter */
    public int getMemoryChunkType() {
        return this.memoryChunkType;
    }

    private u(a aVar) {
        com.facebook.imagepipeline.producers.t0<?> t0VarH;
        if (bn.b.d()) {
            bn.b.a("ImagePipelineConfig()");
        }
        this.experiments = aVar.w().c();
        pk.n<nm.y> nVarG = aVar.g();
        if (nVarG == null) {
            Object systemService = aVar.getContext().getSystemService("activity");
            if (systemService == null) {
                throw new IllegalStateException("Required value was null.");
            }
            p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            nVarG = new nm.o((ActivityManager) systemService);
        }
        this.bitmapMemoryCacheParamsSupplier = nVarG;
        nm.x.a bitmapMemoryCacheTrimStrategy = aVar.getBitmapMemoryCacheTrimStrategy();
        this.bitmapMemoryCacheTrimStrategy = bitmapMemoryCacheTrimStrategy == null ? new nm.c() : bitmapMemoryCacheTrimStrategy;
        nm.x.a encodedMemoryCacheTrimStrategy = aVar.getEncodedMemoryCacheTrimStrategy();
        this.encodedMemoryCacheTrimStrategy = encodedMemoryCacheTrimStrategy == null ? new nm.a0() : encodedMemoryCacheTrimStrategy;
        this.bitmapMemoryCacheEntryStateObserver = aVar.e();
        Bitmap.Config bitmapConfig = aVar.getBitmapConfig();
        this.bitmapConfig = bitmapConfig == null ? Bitmap.Config.ARGB_8888 : bitmapConfig;
        nm.k cacheKeyFactory = aVar.getCacheKeyFactory();
        if (cacheKeyFactory == null) {
            cacheKeyFactory = nm.p.f();
            p013kotlin.jvm.internal.s.j(cacheKeyFactory, "getInstance(...)");
        }
        this.cacheKeyFactory = cacheKeyFactory;
        Context context = aVar.getContext();
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.context = context;
        this.downsampleMode = aVar.getDownsampleMode();
        pk.n<nm.y> nVarT = aVar.t();
        this.encodedMemoryCacheParamsSupplier = nVarT == null ? new nm.q() : nVarT;
        nm.t imageCacheStatsTracker = aVar.getImageCacheStatsTracker();
        if (imageCacheStatsTracker == null) {
            imageCacheStatsTracker = nm.b0.o();
            p013kotlin.jvm.internal.s.j(imageCacheStatsTracker, "getInstance(...)");
        }
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        this.imageDecoder = aVar.getImageDecoder();
        pk.n<Boolean> BOOLEAN_FALSE = aVar.r();
        if (BOOLEAN_FALSE == null) {
            BOOLEAN_FALSE = pk.o.f103136b;
            p013kotlin.jvm.internal.s.j(BOOLEAN_FALSE, "BOOLEAN_FALSE");
        }
        this.enableEncodedImageColorSpaceUsage = BOOLEAN_FALSE;
        Companion companion = INSTANCE;
        this.imageTranscoderFactory = companion.g(aVar);
        this.imageTranscoderType = aVar.getImageTranscoderType();
        pk.n<Boolean> BOOLEAN_TRUE = aVar.Q();
        if (BOOLEAN_TRUE == null) {
            BOOLEAN_TRUE = pk.o.f103135a;
            p013kotlin.jvm.internal.s.j(BOOLEAN_TRUE, "BOOLEAN_TRUE");
        }
        this.isPrefetchEnabledSupplier = BOOLEAN_TRUE;
        kk.d mainDiskCacheConfig = aVar.getMainDiskCacheConfig();
        this.mainDiskCacheConfig = mainDiskCacheConfig == null ? companion.f(aVar.getContext()) : mainDiskCacheConfig;
        sk.d memoryTrimmableRegistry = aVar.getMemoryTrimmableRegistry();
        if (memoryTrimmableRegistry == null) {
            memoryTrimmableRegistry = sk.e.b();
            p013kotlin.jvm.internal.s.j(memoryTrimmableRegistry, "getInstance(...)");
        }
        this.memoryTrimmableRegistry = memoryTrimmableRegistry;
        this.memoryChunkType = companion.h(aVar, getExperiments());
        int httpConnectionTimeout = aVar.getHttpConnectionTimeout() < 0 ? 30000 : aVar.getHttpConnectionTimeout();
        this.httpNetworkTimeout = httpConnectionTimeout;
        if (bn.b.d()) {
            bn.b.a("ImagePipelineConfig->mNetworkFetcher");
            try {
                t0VarH = aVar.H();
                t0VarH = t0VarH == null ? new com.facebook.imagepipeline.producers.d0(httpConnectionTimeout) : t0VarH;
                bn.b.b();
            } catch (Throwable th2) {
                bn.b.b();
                throw th2;
            }
        } else {
            t0VarH = aVar.H();
            if (t0VarH == null) {
                t0VarH = new com.facebook.imagepipeline.producers.d0(httpConnectionTimeout);
            }
        }
        this.networkFetcher = t0VarH;
        this.platformBitmapFactory = aVar.getPlatformBitmapFactory();
        xm.y poolFactory = aVar.getPoolFactory();
        this.poolFactory = poolFactory == null ? new xm.y(xm.w.n().m()) : poolFactory;
        sm.d progressiveJpegConfig = aVar.getProgressiveJpegConfig();
        this.progressiveJpegConfig = progressiveJpegConfig == null ? new sm.f() : progressiveJpegConfig;
        Set<wm.e> setM = aVar.M();
        this.requestListeners = setM == null ? d1.d() : setM;
        Set<wm.d> setL = aVar.L();
        this.requestListener2s = setL == null ? d1.d() : setL;
        Set<com.facebook.imagepipeline.producers.o> setM2 = aVar.m();
        this.customProducerSequenceFactories = setM2 == null ? d1.d() : setM2;
        this.isResizeAndRotateEnabledForNetwork = aVar.getResizeAndRotateEnabledForNetwork();
        kk.d smallImageDiskCacheConfig = aVar.getSmallImageDiskCacheConfig();
        this.smallImageDiskCacheConfig = smallImageDiskCacheConfig == null ? getMainDiskCacheConfig() : smallImageDiskCacheConfig;
        aVar.B();
        int iE = getPoolFactory().e();
        p executorSupplier = aVar.getExecutorSupplier();
        this.executorSupplier = executorSupplier == null ? new b(iE) : executorSupplier;
        this.isDiskCacheEnabled = aVar.getDiskCacheEnabled();
        aVar.j();
        this.closeableReferenceLeakTracker = aVar.getCloseableReferenceLeakTracker();
        this.bitmapCacheOverride = aVar.d();
        nm.a bitmapMemoryCacheFactory = aVar.getBitmapMemoryCacheFactory();
        this.bitmapMemoryCacheFactory = bitmapMemoryCacheFactory == null ? new nm.l() : bitmapMemoryCacheFactory;
        this.encodedMemoryCacheOverride = aVar.s();
        this.executorServiceForAnimatedImages = aVar.getSerialExecutorServiceForAnimatedImages();
        this.dynamicDiskCacheConfigMap = aVar.q();
        pk.n<pm.c> nVarO = aVar.o();
        if (nVarO == null) {
            q fileCacheFactory = aVar.getFileCacheFactory();
            nVarO = new k(fileCacheFactory == null ? new l(new o()) : fileCacheFactory, this);
        }
        this.diskCachesStoreSupplier = nVarO;
        yk.b bVarY = getExperiments().getWebpBitmapFactory();
        if (bVarY != null) {
            companion.j(bVarY, getExperiments(), new mm.c(getPoolFactory()));
        }
        if (bn.b.d()) {
            bn.b.b();
        }
    }
}
