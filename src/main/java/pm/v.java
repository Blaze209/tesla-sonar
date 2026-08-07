package pm;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.common.memory.PooledByteBuffer;
import ezvcard.property.Gender;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020!0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0005R\u0014\u0010D\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0018\u0010O\u001a\u0006\u0012\u0002\b\u00030L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001c\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010[R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020`0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010[R\u0014\u0010d\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010#R\u0014\u0010f\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010CR\u0016\u0010j\u001a\u0004\u0018\u00010g8&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0016\u0010n\u001a\u0004\u0018\u00010k8&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8&X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\"\u0010{\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020x\u0018\u00010w8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R'\u0010\u0084\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020A\u0018\u00010\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, d2 = {"Lpm/v;", "", "Lpk/n;", "Lnm/y;", "y", "()Lpk/n;", "bitmapMemoryCacheParamsSupplier", "Lnm/x$a;", "s", "()Lnm/x$a;", "bitmapMemoryCacheTrimStrategy", "r", "encodedMemoryCacheTrimStrategy", "Lnm/n$b;", "Ljk/d;", "e", "()Lnm/n$b;", "bitmapMemoryCacheEntryStateObserver", "Lnm/k;", "C", "()Lnm/k;", "cacheKeyFactory", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lpm/c;", "A", "diskCachesStoreSupplier", "Lpm/n;", Gender.FEMALE, "()Lpm/n;", "downsampleMode", "", "f", "()Z", "isDiskCacheEnabled", "h", "encodedMemoryCacheParamsSupplier", "Lpm/p;", "H", "()Lpm/p;", "executorSupplier", "Lnk/g;", "u", "()Lnk/g;", "executorServiceForAnimatedImages", "Lnm/t;", "k", "()Lnm/t;", "imageCacheStatsTracker", "Lsm/b;", "g", "()Lsm/b;", "imageDecoder", "Lcn/d;", "w", "()Lcn/d;", "imageTranscoderFactory", "", "v", "()Ljava/lang/Integer;", "imageTranscoderType", "l", "isPrefetchEnabledSupplier", "Lkk/d;", "p", "()Lkk/d;", "mainDiskCacheConfig", "Lsk/d;", "m", "()Lsk/d;", "memoryTrimmableRegistry", "z", "()I", "memoryChunkType", "Lcom/facebook/imagepipeline/producers/t0;", "o", "()Lcom/facebook/imagepipeline/producers/t0;", "networkFetcher", "Lxm/y;", IntegerTokenConverter.CONVERTER_KEY, "()Lxm/y;", "poolFactory", "Lsm/d;", "c", "()Lsm/d;", "progressiveJpegConfig", "", "Lwm/e;", "q", "()Ljava/util/Set;", "requestListeners", "Lwm/d;", "a", "requestListener2s", "Lcom/facebook/imagepipeline/producers/o;", "E", "customProducerSequenceFactories", "D", "isResizeAndRotateEnabledForNetwork", "t", "smallImageDiskCacheConfig", "Lsm/c;", "x", "()Lsm/c;", "imageDecoderConfig", "Llk/a;", "G", "()Llk/a;", "callerContextVerifier", "Lpm/x;", "n", "()Lpm/x;", "experiments", "Lrm/a;", "j", "()Lrm/a;", "closeableReferenceLeakTracker", "Lnm/x;", "Lcom/facebook/common/memory/PooledByteBuffer;", "b", "()Lnm/x;", "encodedMemoryCacheOverride", "Lnm/a;", "B", "()Lnm/a;", "bitmapMemoryCacheFactory", "", "", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface v {
    pk.n<c> A();

    /* JADX INFO: renamed from: B */
    nm.a getBitmapMemoryCacheFactory();

    /* JADX INFO: renamed from: C */
    nm.k getCacheKeyFactory();

    /* JADX INFO: renamed from: D */
    boolean getIsResizeAndRotateEnabledForNetwork();

    Set<com.facebook.imagepipeline.producers.o> E();

    /* JADX INFO: renamed from: F */
    n getDownsampleMode();

    lk.a G();

    /* JADX INFO: renamed from: H */
    p getExecutorSupplier();

    Set<wm.d> a();

    nm.x<jk.d, PooledByteBuffer> b();

    /* JADX INFO: renamed from: c */
    sm.d getProgressiveJpegConfig();

    Map<String, kk.d> d();

    nm.n.b<jk.d> e();

    /* JADX INFO: renamed from: f */
    boolean getIsDiskCacheEnabled();

    /* JADX INFO: renamed from: g */
    sm.b getImageDecoder();

    Context getContext();

    pk.n<nm.y> h();

    /* JADX INFO: renamed from: i */
    xm.y getPoolFactory();

    /* JADX INFO: renamed from: j */
    rm.a getCloseableReferenceLeakTracker();

    /* JADX INFO: renamed from: k */
    nm.t getImageCacheStatsTracker();

    pk.n<Boolean> l();

    /* JADX INFO: renamed from: m */
    sk.d getMemoryTrimmableRegistry();

    /* JADX INFO: renamed from: n */
    x getExperiments();

    com.facebook.imagepipeline.producers.t0<?> o();

    /* JADX INFO: renamed from: p */
    kk.d getMainDiskCacheConfig();

    Set<wm.e> q();

    /* JADX INFO: renamed from: r */
    nm.x.a getEncodedMemoryCacheTrimStrategy();

    /* JADX INFO: renamed from: s */
    nm.x.a getBitmapMemoryCacheTrimStrategy();

    /* JADX INFO: renamed from: t */
    kk.d getSmallImageDiskCacheConfig();

    /* JADX INFO: renamed from: u */
    nk.g getExecutorServiceForAnimatedImages();

    /* JADX INFO: renamed from: v */
    Integer getImageTranscoderType();

    /* JADX INFO: renamed from: w */
    cn.d getImageTranscoderFactory();

    sm.c x();

    pk.n<nm.y> y();

    /* JADX INFO: renamed from: z */
    int getMemoryChunkType();
}
