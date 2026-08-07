package pm;

import android.net.Uri;
import android.os.StrictMode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.h1;
import com.facebook.imagepipeline.producers.l1;
import com.facebook.imagepipeline.producers.z0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import ezvcard.property.Gender;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 z2\u00020\u0001:\u0001aB±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#Jc\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0.\"\u0004\b\u0000\u0010$2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b/\u00100Jw\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0.\"\u0004\b\u0000\u0010$2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010-\u001a\u0004\u0018\u00010,2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0002\b\u0003\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104JS\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050.2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050%2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u0002062\b\u0010+\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0<2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020,¢\u0006\u0004\b?\u0010@J+\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0.2\u0006\u0010!\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bA\u0010BJQ\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\bC\u0010DJ-\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bE\u0010BJ5\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\bF\u0010GJ)\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bH\u0010BJ=\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u0002062\b\u0010+\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020K2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020K2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\bN\u0010MJ\u0017\u0010O\u001a\u00020K2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020K2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bQ\u0010MJ\r\u0010R\u001a\u00020K¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020K¢\u0006\u0004\bT\u0010SJ\r\u0010U\u001a\u00020K¢\u0006\u0004\bU\u0010SJ\u0017\u0010V\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bX\u0010#J\u0017\u0010Y\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\bY\u0010WJ!\u0010\\\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010[\u001a\u0004\u0018\u00010Z¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b^\u0010#J!\u0010_\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010fR\u0014\u0010+\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010gR\u0014\u0010i\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010hR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010kR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bN\u0010n\u001a\u0004\bo\u0010pR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010qR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010fR\u0014\u0010t\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010sR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\bF\u0010f\u001a\u0004\bu\u0010vR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bC\u0010w\u001a\u0004\bx\u0010y¨\u0006{"}, d2 = {"Lpm/t;", "", "Lpm/v0;", "producerSequenceFactory", "", "Lwm/e;", "requestListeners", "Lwm/d;", "requestListener2s", "Lpk/n;", "", "isPrefetchEnabledSupplier", "Lnm/x;", "Ljk/d;", "Lum/e;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Lpm/c;", "diskCachesStoreSupplier", "Lnm/k;", "cacheKeyFactory", "Lcom/facebook/imagepipeline/producers/l1;", "threadHandoffProducerQueue", "suppressBitmapPrefetchingSupplier", "lazyDataSource", "Llk/a;", "callerContextVerifier", "Lpm/v;", "config", "<init>", "(Lpm/v0;Ljava/util/Set;Ljava/util/Set;Lpk/n;Lnm/x;Lnm/x;Lpk/n;Lnm/k;Lcom/facebook/imagepipeline/producers/l1;Lpk/n;Lpk/n;Llk/a;Lpm/v;)V", "Lcom/facebook/imagepipeline/request/a;", "imageRequest", "y", "(Lcom/facebook/imagepipeline/request/a;)Z", "T", "Lcom/facebook/imagepipeline/producers/z0;", "Ltk/a;", "producerSequence", "Lcom/facebook/imagepipeline/request/a$c;", "lowestPermittedRequestLevelOnSubmit", "callerContext", "requestListener", "", "uiComponentId", "Lcom/facebook/datasource/c;", "D", "(Lcom/facebook/imagepipeline/producers/z0;Lcom/facebook/imagepipeline/request/a;Lcom/facebook/imagepipeline/request/a$c;Ljava/lang/Object;Lwm/e;Ljava/lang/String;)Lcom/facebook/datasource/c;", "", "extras", "E", "(Lcom/facebook/imagepipeline/producers/z0;Lcom/facebook/imagepipeline/request/a;Lcom/facebook/imagepipeline/request/a$c;Ljava/lang/Object;Lwm/e;Ljava/lang/String;Ljava/util/Map;)Lcom/facebook/datasource/c;", "Ljava/lang/Void;", "Lom/e;", "priority", Gender.FEMALE, "(Lcom/facebook/imagepipeline/producers/z0;Lcom/facebook/imagepipeline/request/a;Lcom/facebook/imagepipeline/request/a$c;Ljava/lang/Object;Lom/e;Lwm/e;)Lcom/facebook/datasource/c;", "Landroid/net/Uri;", "uri", "Lpk/l;", "z", "(Landroid/net/Uri;)Lpk/l;", "p", "()Ljava/lang/String;", "o", "(Lcom/facebook/imagepipeline/request/a;Ljava/lang/Object;)Lcom/facebook/datasource/c;", "m", "(Lcom/facebook/imagepipeline/request/a;Ljava/lang/Object;Lcom/facebook/imagepipeline/request/a$c;Lwm/e;Ljava/lang/String;)Lcom/facebook/datasource/c;", "k", "l", "(Lcom/facebook/imagepipeline/request/a;Ljava/lang/Object;Lcom/facebook/imagepipeline/request/a$c;)Lcom/facebook/datasource/c;", "B", "C", "(Lcom/facebook/imagepipeline/request/a;Ljava/lang/Object;Lom/e;Lwm/e;)Lcom/facebook/datasource/c;", "Ljn0/h0;", "j", "(Landroid/net/Uri;)V", "h", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/request/a;)V", "g", "e", "()V", DateTokenConverter.CONVERTER_KEY, "c", "t", "(Landroid/net/Uri;)Z", "u", "v", "Lcom/facebook/imagepipeline/request/a$b;", "cacheChoice", "w", "(Landroid/net/Uri;Lcom/facebook/imagepipeline/request/a$b;)Z", "x", "s", "(Lcom/facebook/imagepipeline/request/a;Lwm/e;)Lwm/e;", "a", "Lpm/v0;", "getProducerSequenceFactory", "()Lpm/v0;", "b", "Lpk/n;", "Lwm/e;", "Lwm/d;", "requestListener2", "f", "Lnm/x;", "q", "()Lnm/x;", "Lnm/k;", "r", "()Lnm/k;", "Lcom/facebook/imagepipeline/producers/l1;", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "idCounter", "isLazyDataSource", "()Lpk/n;", "Lpm/v;", "getConfig", "()Lpm/v;", "n", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final CancellationException f103281o = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final CancellationException f103282p = new CancellationException("ImageRequest is null");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final CancellationException f103283q = new CancellationException("Modified URL is null");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 producerSequenceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pk.n<Boolean> isPrefetchEnabledSupplier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pk.n<c> diskCachesStoreSupplier;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wm.e requestListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wm.d requestListener2;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final nm.x<jk.d, um.e> bitmapMemoryCache;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final nm.x<jk.d, PooledByteBuffer> encodedMemoryCache;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final nm.k cacheKeyFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final l1 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final pk.n<Boolean> suppressBitmapPrefetchingSupplier;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final AtomicLong idCounter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final pk.n<Boolean> isLazyDataSource;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final v config;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103297a;

        static {
            int[] iArr = new int[com.facebook.imagepipeline.request.a.b.values().length];
            try {
                iArr[com.facebook.imagepipeline.request.a.b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.facebook.imagepipeline.request.a.b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.facebook.imagepipeline.request.a.b.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f103297a = iArr;
        }
    }

    public t(v0 producerSequenceFactory, Set<? extends wm.e> requestListeners, Set<? extends wm.d> requestListener2s, pk.n<Boolean> isPrefetchEnabledSupplier, nm.x<jk.d, um.e> bitmapMemoryCache, nm.x<jk.d, PooledByteBuffer> encodedMemoryCache, pk.n<c> diskCachesStoreSupplier, nm.k cacheKeyFactory, l1 threadHandoffProducerQueue, pk.n<Boolean> suppressBitmapPrefetchingSupplier, pk.n<Boolean> lazyDataSource, lk.a aVar, v config) {
        p013kotlin.jvm.internal.s.k(producerSequenceFactory, "producerSequenceFactory");
        p013kotlin.jvm.internal.s.k(requestListeners, "requestListeners");
        p013kotlin.jvm.internal.s.k(requestListener2s, "requestListener2s");
        p013kotlin.jvm.internal.s.k(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        p013kotlin.jvm.internal.s.k(bitmapMemoryCache, "bitmapMemoryCache");
        p013kotlin.jvm.internal.s.k(encodedMemoryCache, "encodedMemoryCache");
        p013kotlin.jvm.internal.s.k(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        p013kotlin.jvm.internal.s.k(cacheKeyFactory, "cacheKeyFactory");
        p013kotlin.jvm.internal.s.k(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        p013kotlin.jvm.internal.s.k(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        p013kotlin.jvm.internal.s.k(lazyDataSource, "lazyDataSource");
        p013kotlin.jvm.internal.s.k(config, "config");
        this.producerSequenceFactory = producerSequenceFactory;
        this.isPrefetchEnabledSupplier = isPrefetchEnabledSupplier;
        this.diskCachesStoreSupplier = diskCachesStoreSupplier;
        this.requestListener = new wm.c((Set<wm.e>) requestListeners);
        this.requestListener2 = new wm.b(requestListener2s);
        this.idCounter = new AtomicLong();
        this.bitmapMemoryCache = bitmapMemoryCache;
        this.encodedMemoryCache = encodedMemoryCache;
        this.cacheKeyFactory = cacheKeyFactory;
        this.threadHandoffProducerQueue = threadHandoffProducerQueue;
        this.suppressBitmapPrefetchingSupplier = suppressBitmapPrefetchingSupplier;
        this.isLazyDataSource = lazyDataSource;
        this.config = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(Uri uri, jk.d key) {
        p013kotlin.jvm.internal.s.k(uri, "$uri");
        p013kotlin.jvm.internal.s.k(key, "key");
        return key.c(uri);
    }

    private final <T> com.facebook.datasource.c<tk.a<T>> D(z0<tk.a<T>> producerSequence, com.facebook.imagepipeline.request.a imageRequest, com.facebook.imagepipeline.request.a.c lowestPermittedRequestLevelOnSubmit, Object callerContext, wm.e requestListener, String uiComponentId) {
        return E(producerSequence, imageRequest, lowestPermittedRequestLevelOnSubmit, callerContext, requestListener, uiComponentId, null);
    }

    private final <T> com.facebook.datasource.c<tk.a<T>> E(z0<tk.a<T>> producerSequence, com.facebook.imagepipeline.request.a imageRequest, com.facebook.imagepipeline.request.a.c lowestPermittedRequestLevelOnSubmit, Object callerContext, wm.e requestListener, String uiComponentId, Map<String, ?> extras) {
        com.facebook.datasource.c<tk.a<T>> cVarB;
        if (!bn.b.d()) {
            com.facebook.imagepipeline.producers.f0 f0Var = new com.facebook.imagepipeline.producers.f0(s(imageRequest, requestListener), this.requestListener2);
            try {
                com.facebook.imagepipeline.request.a.c max = com.facebook.imagepipeline.request.a.c.getMax(imageRequest.k(), lowestPermittedRequestLevelOnSubmit);
                p013kotlin.jvm.internal.s.j(max, "getMax(...)");
                h1 h1Var = new h1(imageRequest, p(), uiComponentId, f0Var, callerContext, max, false, imageRequest.p() || !xk.e.o(imageRequest.v()), imageRequest.o(), this.config);
                h1Var.C(extras);
                return qm.c.E(producerSequence, h1Var, f0Var);
            } catch (Exception e11) {
                return com.facebook.datasource.d.b(e11);
            }
        }
        bn.b.a("ImagePipeline#submitFetchRequest");
        try {
            com.facebook.imagepipeline.producers.f0 f0Var2 = new com.facebook.imagepipeline.producers.f0(s(imageRequest, requestListener), this.requestListener2);
            try {
                com.facebook.imagepipeline.request.a.c max2 = com.facebook.imagepipeline.request.a.c.getMax(imageRequest.k(), lowestPermittedRequestLevelOnSubmit);
                p013kotlin.jvm.internal.s.j(max2, "getMax(...)");
                h1 h1Var2 = new h1(imageRequest, p(), uiComponentId, f0Var2, callerContext, max2, false, imageRequest.p() || !xk.e.o(imageRequest.v()), imageRequest.o(), this.config);
                h1Var2.C(extras);
                cVarB = qm.c.E(producerSequence, h1Var2, f0Var2);
            } catch (Exception e12) {
                cVarB = com.facebook.datasource.d.b(e12);
            }
            bn.b.b();
            return cVarB;
        } catch (Throwable th2) {
            bn.b.b();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    private final com.facebook.datasource.c<Void> F(z0<Void> producerSequence, com.facebook.imagepipeline.request.a imageRequest, com.facebook.imagepipeline.request.a.c lowestPermittedRequestLevelOnSubmit, Object callerContext, om.e priority, wm.e requestListener) {
        boolean z11;
        com.facebook.imagepipeline.producers.f0 f0Var = new com.facebook.imagepipeline.producers.f0(s(imageRequest, requestListener), this.requestListener2);
        Uri uriV = imageRequest.v();
        p013kotlin.jvm.internal.s.j(uriV, "getSourceUri(...)");
        Uri uriA = cm.b.INSTANCE.a(uriV, callerContext);
        if (uriA == null) {
            com.facebook.datasource.c<Void> cVarB = com.facebook.datasource.d.b(f103283q);
            p013kotlin.jvm.internal.s.j(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        if (!p013kotlin.jvm.internal.s.f(uriV, uriA)) {
            imageRequest = ImageRequestBuilder.b(imageRequest).R(uriA).a();
        }
        com.facebook.imagepipeline.request.a aVar = imageRequest;
        try {
            com.facebook.imagepipeline.request.a.c max = com.facebook.imagepipeline.request.a.c.getMax(aVar.k(), lowestPermittedRequestLevelOnSubmit);
            p013kotlin.jvm.internal.s.j(max, "getMax(...)");
            String strP = p();
            x xVarN = this.config.getExperiments();
            if (xVarN != null) {
                z11 = xVarN.getAllowProgressiveOnPrefetch() && aVar.p();
            }
            return qm.d.INSTANCE.a(producerSequence, new h1(aVar, strP, f0Var, callerContext, max, true, z11, priority, this.config), f0Var);
        } catch (Exception e11) {
            return com.facebook.datasource.d.b(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(jk.d it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return true;
    }

    public static /* synthetic */ com.facebook.datasource.c n(t tVar, com.facebook.imagepipeline.request.a aVar, Object obj, com.facebook.imagepipeline.request.a.c cVar, wm.e eVar, String str, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            cVar = null;
        }
        if ((i11 & 8) != 0) {
            eVar = null;
        }
        if ((i11 & 16) != 0) {
            str = null;
        }
        return tVar.m(aVar, obj, cVar, eVar, str);
    }

    private final boolean y(com.facebook.imagepipeline.request.a imageRequest) {
        c cVar = this.diskCachesStoreSupplier.get();
        p013kotlin.jvm.internal.s.j(cVar, "get(...)");
        c cVar2 = cVar;
        jk.d dVarB = this.cacheKeyFactory.b(imageRequest, null);
        String strF = imageRequest.f();
        if (strF != null) {
            nm.j jVar = cVar2.c().get(strF);
            if (jVar == null) {
                return false;
            }
            p013kotlin.jvm.internal.s.h(dVarB);
            return jVar.k(dVarB);
        }
        Iterator<Map.Entry<String, nm.j>> it = cVar2.c().entrySet().iterator();
        while (it.hasNext()) {
            nm.j value = it.next().getValue();
            p013kotlin.jvm.internal.s.h(dVarB);
            if (value.k(dVarB)) {
                return true;
            }
        }
        return false;
    }

    private final pk.l<jk.d> z(final Uri uri) {
        return new pk.l() { // from class: pm.r
            @Override // pk.l
            public final boolean apply(Object obj) {
                return t.A(uri, (jk.d) obj);
            }
        };
    }

    public final com.facebook.datasource.c<Void> B(com.facebook.imagepipeline.request.a imageRequest, Object callerContext) {
        return C(imageRequest, callerContext, om.e.MEDIUM, null);
    }

    public final com.facebook.datasource.c<Void> C(com.facebook.imagepipeline.request.a imageRequest, Object callerContext, om.e priority, wm.e requestListener) {
        p013kotlin.jvm.internal.s.k(priority, "priority");
        if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
            com.facebook.datasource.c<Void> cVarB = com.facebook.datasource.d.b(f103281o);
            p013kotlin.jvm.internal.s.j(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        if (imageRequest == null) {
            com.facebook.datasource.c<Void> cVarB2 = com.facebook.datasource.d.b(new NullPointerException("imageRequest is null"));
            p013kotlin.jvm.internal.s.h(cVarB2);
            return cVarB2;
        }
        try {
            return F(this.producerSequenceFactory.G(imageRequest), imageRequest, com.facebook.imagepipeline.request.a.c.FULL_FETCH, callerContext, priority, requestListener);
        } catch (Exception e11) {
            return com.facebook.datasource.d.b(e11);
        }
    }

    public final void c() {
        e();
        d();
    }

    public final void d() {
        c cVar = this.diskCachesStoreSupplier.get();
        p013kotlin.jvm.internal.s.j(cVar, "get(...)");
        c cVar2 = cVar;
        cVar2.b().h();
        cVar2.a().h();
        Iterator<Map.Entry<String, nm.j>> it = cVar2.c().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().h();
        }
    }

    public final void e() {
        pk.l<jk.d> lVar = new pk.l() { // from class: pm.s
            @Override // pk.l
            public final boolean apply(Object obj) {
                return t.f((jk.d) obj);
            }
        };
        this.bitmapMemoryCache.e(lVar);
        this.encodedMemoryCache.e(lVar);
    }

    public final void g(Uri uri) {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        j(uri);
        h(uri);
    }

    public final void h(Uri uri) {
        com.facebook.imagepipeline.request.a aVarA = com.facebook.imagepipeline.request.a.a(uri);
        if (aVarA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        i(aVarA);
    }

    public final void i(com.facebook.imagepipeline.request.a imageRequest) {
        if (imageRequest == null) {
            return;
        }
        jk.d dVarB = this.cacheKeyFactory.b(imageRequest, null);
        c cVar = this.diskCachesStoreSupplier.get();
        p013kotlin.jvm.internal.s.j(cVar, "get(...)");
        c cVar2 = cVar;
        nm.j jVarB = cVar2.b();
        p013kotlin.jvm.internal.s.h(dVarB);
        jVarB.s(dVarB);
        cVar2.a().s(dVarB);
        Iterator<Map.Entry<String, nm.j>> it = cVar2.c().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().s(dVarB);
        }
    }

    public final void j(Uri uri) {
        p013kotlin.jvm.internal.s.k(uri, "uri");
        pk.l<jk.d> lVarZ = z(uri);
        this.bitmapMemoryCache.e(lVarZ);
        this.encodedMemoryCache.e(lVarZ);
    }

    public final com.facebook.datasource.c<tk.a<um.e>> k(com.facebook.imagepipeline.request.a imageRequest, Object callerContext) {
        return n(this, imageRequest, callerContext, null, null, null, 24, null);
    }

    public final com.facebook.datasource.c<tk.a<um.e>> l(com.facebook.imagepipeline.request.a imageRequest, Object callerContext, com.facebook.imagepipeline.request.a.c lowestPermittedRequestLevelOnSubmit) {
        p013kotlin.jvm.internal.s.k(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        return n(this, imageRequest, callerContext, lowestPermittedRequestLevelOnSubmit, null, null, 16, null);
    }

    public final com.facebook.datasource.c<tk.a<um.e>> m(com.facebook.imagepipeline.request.a imageRequest, Object callerContext, com.facebook.imagepipeline.request.a.c lowestPermittedRequestLevelOnSubmit, wm.e requestListener, String uiComponentId) {
        if (imageRequest == null) {
            com.facebook.datasource.c<tk.a<um.e>> cVarB = com.facebook.datasource.d.b(new NullPointerException());
            p013kotlin.jvm.internal.s.j(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        try {
            z0<tk.a<um.e>> z0VarE = this.producerSequenceFactory.E(imageRequest);
            if (lowestPermittedRequestLevelOnSubmit == null) {
                lowestPermittedRequestLevelOnSubmit = com.facebook.imagepipeline.request.a.c.FULL_FETCH;
            }
            return D(z0VarE, imageRequest, lowestPermittedRequestLevelOnSubmit, callerContext, requestListener, uiComponentId);
        } catch (Exception e11) {
            return com.facebook.datasource.d.b(e11);
        }
    }

    public final com.facebook.datasource.c<tk.a<um.e>> o(com.facebook.imagepipeline.request.a imageRequest, Object callerContext) {
        p013kotlin.jvm.internal.s.k(imageRequest, "imageRequest");
        return l(imageRequest, callerContext, com.facebook.imagepipeline.request.a.c.BITMAP_MEMORY_CACHE);
    }

    public final String p() {
        return String.valueOf(this.idCounter.getAndIncrement());
    }

    public final nm.x<jk.d, um.e> q() {
        return this.bitmapMemoryCache;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final nm.k getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    public final wm.e s(com.facebook.imagepipeline.request.a imageRequest, wm.e requestListener) {
        if (imageRequest == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (requestListener == null) {
            return imageRequest.q() == null ? this.requestListener : new wm.c(this.requestListener, imageRequest.q());
        }
        return imageRequest.q() == null ? new wm.c(this.requestListener, requestListener) : new wm.c(this.requestListener, requestListener, imageRequest.q());
    }

    public final boolean t(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.bitmapMemoryCache.f(z(uri));
    }

    public final boolean u(com.facebook.imagepipeline.request.a imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        jk.d dVarC = this.cacheKeyFactory.c(imageRequest, null);
        nm.x<jk.d, um.e> xVar = this.bitmapMemoryCache;
        p013kotlin.jvm.internal.s.h(dVarC);
        tk.a<um.e> aVar = xVar.get(dVarC);
        try {
            return tk.a.b0(aVar);
        } finally {
            tk.a.C(aVar);
        }
    }

    public final boolean v(Uri uri) {
        return w(uri, com.facebook.imagepipeline.request.a.b.SMALL) || w(uri, com.facebook.imagepipeline.request.a.b.DEFAULT) || w(uri, com.facebook.imagepipeline.request.a.b.DYNAMIC);
    }

    public final boolean w(Uri uri, com.facebook.imagepipeline.request.a.b cacheChoice) {
        com.facebook.imagepipeline.request.a aVarA = ImageRequestBuilder.x(uri).A(cacheChoice).a();
        p013kotlin.jvm.internal.s.h(aVarA);
        return x(aVarA);
    }

    public final boolean x(com.facebook.imagepipeline.request.a imageRequest) {
        boolean zK;
        p013kotlin.jvm.internal.s.k(imageRequest, "imageRequest");
        c cVar = this.diskCachesStoreSupplier.get();
        p013kotlin.jvm.internal.s.j(cVar, "get(...)");
        c cVar2 = cVar;
        jk.d dVarB = this.cacheKeyFactory.b(imageRequest, null);
        com.facebook.imagepipeline.request.a.b bVarC = imageRequest.c();
        p013kotlin.jvm.internal.s.j(bVarC, "getCacheChoice(...)");
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i11 = b.f103297a[bVarC.ordinal()];
            if (i11 == 1) {
                nm.j jVarB = cVar2.b();
                p013kotlin.jvm.internal.s.h(dVarB);
                zK = jVarB.k(dVarB);
            } else if (i11 == 2) {
                nm.j jVarA = cVar2.a();
                p013kotlin.jvm.internal.s.h(dVarB);
                zK = jVarA.k(dVarB);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                zK = y(imageRequest);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zK;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }
}
