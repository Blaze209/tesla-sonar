package pm;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.common.memory.PooledByteBuffer;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 j2\u00020\u0001:\u0004\u0007\u0015\u0010\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!R\u0017\u0010$\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010(\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b\u0018\u0010\nR\u0017\u0010+\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010!R\u0017\u0010.\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b-\u0010\nR\u0017\u00100\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b/\u0010\nR\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0006078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b \u0010:R\u0017\u0010=\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010\b\u001a\u0004\b<\u0010\nR\u0017\u0010?\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010\b\u001a\u0004\b'\u0010\nR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0006078\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010:R\u0017\u0010E\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u0010\b\u001a\u0004\bD\u0010\nR\u0017\u0010H\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\b2\u0010GR\u0017\u0010J\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\b,\u0010\nR\u0017\u0010K\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b%\u0010\nR\u0017\u0010M\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\bL\u0010\nR\u0017\u0010O\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\bN\u0010\nR\u0017\u0010Q\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\bP\u0010\nR\u0017\u0010T\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bR\u0010\b\u001a\u0004\bS\u0010\nR\u0017\u0010V\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\bU\u0010 \u001a\u0004\bI\u0010!R\u0017\u0010W\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u0007\u0010\nR\u0017\u0010X\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bS\u0010\b\u001a\u0004\b)\u0010\nR\u0017\u0010Y\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u0010\b\u001a\u0004\b@\u0010\nR\u0017\u0010Z\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bP\u0010\b\u001a\u0004\b>\u0010\nR\u0017\u0010[\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u0010\b\u001a\u0004\bC\u0010\nR\u0017\u0010\\\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\b\f\u0010\nR\u0017\u0010]\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b#\u0010\nR\u0017\u0010^\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b \u0010 \u001a\u0004\b\u0010\u0010!R\u0017\u0010`\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b_\u0010\nR\u0017\u0010d\u001a\u00020a8\u0006¢\u0006\f\n\u0004\b/\u0010b\u001a\u0004\b8\u0010cR\u0017\u0010e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\bU\u0010\nR\u0019\u0010g\u001a\u0004\u0018\u00010f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bR\u0010i¨\u0006k"}, d2 = {"Lpm/x;", "", "Lpm/x$a;", "builder", "<init>", "(Lpm/x$a;)V", "", "a", "Z", "L", "()Z", "isWebpSupportEnabled", "b", "B", "isDecodeCancellationEnabled", "Lyk/b;", "c", "Lyk/b;", "y", "()Lyk/b;", "webpBitmapFactory", DateTokenConverter.CONVERTER_KEY, "x", "useDownsamplingRatioForResizing", "e", "w", "useBitmapPrepareToDraw", "f", "v", "useBalancedAnimationStrategy", "", "g", "I", "()I", "animationStrategyBufferLengthMilliseconds", "h", "bitmapPrepareToDrawMinSizeBytes", IntegerTokenConverter.CONVERTER_KEY, "bitmapPrepareToDrawMaxSizeBytes", "j", "bitmapPrepareToDrawForPrefetch", "k", "m", "maxBitmapDimension", "l", "J", "isNativeCodeDisabled", "K", "isPartialImageCachingEnabled", "Lpm/x$d;", "n", "Lpm/x$d;", "p", "()Lpm/x$d;", "producerFactoryMethod", "Lpk/n;", "o", "Lpk/n;", "()Lpk/n;", "isLazyDataSource", "H", "isGingerbreadDecoderEnabled", "q", "downscaleFrameToDrawableDimensions", "r", "t", "suppressBitmapPrefetchingSupplier", "s", "G", "isExperimentalThreadHandoffQueueEnabled", "", "()J", "memoryType", "u", "keepCancelledFetchAsLowPriority", "downsampleIfLargeBitmap", "D", "isEncodedCacheEnabled", Gender.FEMALE, "isEnsureTranscoderLibraryLoaded", "E", "isEncodedMemoryCacheProbingEnabled", "z", "C", "isDiskCacheProbingEnabled", "A", "trackedKeysSize", "allowDelay", "handOffOnUiThreadOnly", "shouldStoreCacheEntrySize", "shouldIgnoreCacheSizeMismatch", "shouldUseDecodingBufferHelper", "allowProgressiveOnPrefetch", "cancelDecodeOnCacheMiss", "animationRenderFpsLimit", "getPrefetchShortcutEnabled", "prefetchShortcutEnabled", "Lym/f;", "Lym/f;", "()Lym/f;", "platformDecoderOptions", "isBinaryXmlEnabled", "Lyk/b$a;", "webpErrorLogger", "Lyk/b$a;", "()Lyk/b$a;", Gender.MALE, "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int trackedKeysSize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final boolean allowDelay;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final boolean handOffOnUiThreadOnly;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final boolean shouldStoreCacheEntrySize;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean shouldIgnoreCacheSizeMismatch;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final boolean shouldUseDecodingBufferHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final boolean allowProgressiveOnPrefetch;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean cancelDecodeOnCacheMiss;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int animationRenderFpsLimit;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final boolean prefetchShortcutEnabled;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final ym.f platformDecoderOptions;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final boolean isBinaryXmlEnabled;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isWebpSupportEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDecodeCancellationEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yk.b webpBitmapFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean useDownsamplingRatioForResizing;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean useBitmapPrepareToDraw;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean useBalancedAnimationStrategy;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int animationStrategyBufferLengthMilliseconds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int bitmapPrepareToDrawMinSizeBytes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int bitmapPrepareToDrawMaxSizeBytes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean bitmapPrepareToDrawForPrefetch;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int maxBitmapDimension;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean isNativeCodeDisabled;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isPartialImageCachingEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final d producerFactoryMethod;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final pk.n<Boolean> isLazyDataSource;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean isGingerbreadDecoderEnabled;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean downscaleFrameToDrawableDimensions;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final pk.n<Boolean> suppressBitmapPrefetchingSupplier;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isExperimentalThreadHandoffQueueEnabled;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long memoryType;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean keepCancelledFetchAsLowPriority;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean downsampleIfLargeBitmap;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean isEncodedCacheEnabled;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final boolean isEnsureTranscoderLibraryLoaded;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final boolean isEncodedMemoryCacheProbingEnabled;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final boolean isDiskCacheProbingEnabled;

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0016\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010!\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0016\u0010%\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010$R\u0016\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010\u0014R\u0016\u0010-\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b,\u0010$R\u0016\u0010/\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0014R\u0016\u00101\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0014R\u0018\u00105\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u0010\u0014R\u0016\u0010=\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u0010\u0014R$\u0010@\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010\u000b0\u000b068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u00108R\u0016\u0010B\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010\u0014R\u0016\u0010F\u001a\u00020C8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010\u0014R\u0016\u0010J\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bI\u0010\u0014R\u0016\u0010L\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010\u0014R\u0016\u0010N\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010\u0014R\u0016\u0010P\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010\u0014R\u0016\u0010R\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u0014R\u0016\u0010T\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010$R\u0016\u0010V\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bU\u0010\u0014R\u0016\u0010X\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bW\u0010\u0014R\u0016\u0010Z\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bY\u0010\u0014R\u0016\u0010\\\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b[\u0010\u0014R\u0016\u0010^\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b]\u0010\u0014R\u0016\u0010_\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010$R\u0016\u0010`\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bE\u0010\u0014R\u0016\u0010b\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\ba\u0010\u0014R\u0016\u0010f\u001a\u00020c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010h\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bg\u0010\u0014¨\u0006i"}, d2 = {"Lpm/x$a;", "", "Lpm/u$a;", "configBuilder", "<init>", "(Lpm/u$a;)V", "Lkotlin/Function0;", "Ljn0/h0;", "block", "b", "(Lwn0/a;)Lpm/x$a;", "", "binaryXmlEnabled", DateTokenConverter.CONVERTER_KEY, "(Z)Lpm/x$a;", "Lpm/x;", "c", "()Lpm/x;", "a", "Lpm/u$a;", "Z", "shouldUseDecodingBufferHelper", "webpSupportEnabled", "decodeCancellationEnabled", "Lyk/b;", "e", "Lyk/b;", "webpBitmapFactory", "f", "useDownsamplingRatioForResizing", "g", "useBitmapPrepareToDraw", "h", "useBalancedAnimationStrategy", "", IntegerTokenConverter.CONVERTER_KEY, "I", "animationStrategyBufferLengthMilliseconds", "j", "bitmapPrepareToDrawMinSizeBytes", "k", "bitmapPrepareToDrawMaxSizeBytes", "l", "bitmapPrepareToDrawForPrefetch", "m", "maxBitmapDimension", "n", "nativeCodeDisabled", "o", "isPartialImageCachingEnabled", "Lpm/x$d;", "p", "Lpm/x$d;", "producerFactoryMethod", "Lpk/n;", "q", "Lpk/n;", "lazyDataSource", "r", "gingerbreadDecoderEnabled", "s", "downscaleFrameToDrawableDimensions", "kotlin.jvm.PlatformType", "t", "suppressBitmapPrefetchingSupplier", "u", "experimentalThreadHandoffQueueEnabled", "", "v", "J", "memoryType", "w", "keepCancelledFetchAsLowPriority", "x", "downsampleIfLargeBitmap", "y", "encodedCacheEnabled", "z", "ensureTranscoderLibraryLoaded", "A", "isEncodedMemoryCacheProbingEnabled", "B", "isDiskCacheProbingEnabled", "C", "trackedKeysSize", "D", "allowDelay", "E", "handOffOnUiThreadOnly", Gender.FEMALE, "shouldStoreCacheEntrySize", "G", "shouldIgnoreCacheSizeMismatch", "H", "allowProgressiveOnPrefetch", "animationRenderFpsLimit", "cancelDecodeOnCacheMiss", "K", "prefetchShortcutEnabled", "Lym/f;", "L", "Lym/f;", "platformDecoderOptions", Gender.MALE, "isBinaryXmlEnabled", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        public boolean isEncodedMemoryCacheProbingEnabled;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        public boolean isDiskCacheProbingEnabled;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        public int trackedKeysSize;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        public boolean allowDelay;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        public boolean handOffOnUiThreadOnly;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        public boolean shouldStoreCacheEntrySize;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        public boolean shouldIgnoreCacheSizeMismatch;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        public boolean allowProgressiveOnPrefetch;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        public int animationRenderFpsLimit;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        public boolean cancelDecodeOnCacheMiss;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        public boolean prefetchShortcutEnabled;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        public ym.f platformDecoderOptions;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        public boolean isBinaryXmlEnabled;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final u.a configBuilder;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public boolean shouldUseDecodingBufferHelper;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean webpSupportEnabled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public boolean decodeCancellationEnabled;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public yk.b webpBitmapFactory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean useDownsamplingRatioForResizing;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean useBitmapPrepareToDraw;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public boolean useBalancedAnimationStrategy;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public int animationStrategyBufferLengthMilliseconds;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public int bitmapPrepareToDrawMinSizeBytes;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public int bitmapPrepareToDrawMaxSizeBytes;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public boolean bitmapPrepareToDrawForPrefetch;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public int maxBitmapDimension;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public boolean nativeCodeDisabled;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public boolean isPartialImageCachingEnabled;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        public d producerFactoryMethod;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public pk.n<Boolean> lazyDataSource;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        public boolean gingerbreadDecoderEnabled;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        public boolean downscaleFrameToDrawableDimensions;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public pk.n<Boolean> suppressBitmapPrefetchingSupplier;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        public boolean experimentalThreadHandoffQueueEnabled;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        public long memoryType;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        public boolean keepCancelledFetchAsLowPriority;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        public boolean downsampleIfLargeBitmap;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        public boolean encodedCacheEnabled;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        public boolean ensureTranscoderLibraryLoaded;

        public a(u.a configBuilder) {
            p013kotlin.jvm.internal.s.k(configBuilder, "configBuilder");
            this.configBuilder = configBuilder;
            this.animationStrategyBufferLengthMilliseconds = 1000;
            this.maxBitmapDimension = 2048;
            pk.n<Boolean> nVarA = pk.o.a(Boolean.FALSE);
            p013kotlin.jvm.internal.s.j(nVarA, "of(...)");
            this.suppressBitmapPrefetchingSupplier = nVarA;
            this.encodedCacheEnabled = true;
            this.ensureTranscoderLibraryLoaded = true;
            this.trackedKeysSize = 20;
            this.animationRenderFpsLimit = 30;
            this.platformDecoderOptions = new ym.f(false, false, 3, null);
        }

        private final a b(wn0.a<jn0.h0> block) {
            block.invoke();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 e(a this$0, boolean z11) {
            p013kotlin.jvm.internal.s.k(this$0, "this$0");
            this$0.isBinaryXmlEnabled = z11;
            return jn0.h0.f84049a;
        }

        public final x c() {
            return new x(this, null);
        }

        public final a d(final boolean binaryXmlEnabled) {
            return b(new wn0.a() { // from class: pm.w
                @Override // wn0.a
                public final Object invoke() {
                    return x.a.e(this.f103379a, binaryXmlEnabled);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jå\u0001\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00172\u0016\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020$H\u0016¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lpm/x$c;", "Lpm/x$d;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsk/a;", "byteArrayPool", "Lsm/b;", "imageDecoder", "Lsm/d;", "progressiveJpegConfig", "Lpm/n;", "downsampleMode", "", "resizeAndRotateEnabledForNetwork", "decodeCancellationEnabled", "Lpm/p;", "executorSupplier", "Lsk/h;", "pooledByteBufferFactory", "Lsk/k;", "pooledByteStreams", "Lnm/x;", "Ljk/d;", "Lum/e;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Lpk/n;", "Lpm/c;", "diskCachesStoreSupplier", "Lnm/k;", "cacheKeyFactory", "Lmm/d;", "platformBitmapFactory", "", "bitmapPrepareToDrawMinSizeBytes", "bitmapPrepareToDrawMaxSizeBytes", "bitmapPrepareToDrawForPrefetch", "maxBitmapSize", "Lpm/a;", "closeableReferenceFactory", "keepCancelledFetchAsLowPriority", "trackedKeysSize", "Lpm/c0;", "a", "(Landroid/content/Context;Lsk/a;Lsm/b;Lsm/d;Lpm/n;ZZLpm/p;Lsk/h;Lsk/k;Lnm/x;Lnm/x;Lpk/n;Lnm/k;Lmm/d;IIZILpm/a;ZI)Lpm/c0;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements d {
        @Override // pm.x.d
        public c0 a(Context context, sk.a byteArrayPool, sm.b imageDecoder, sm.d progressiveJpegConfig, n downsampleMode, boolean resizeAndRotateEnabledForNetwork, boolean decodeCancellationEnabled, p executorSupplier, sk.h pooledByteBufferFactory, sk.k pooledByteStreams, nm.x<jk.d, um.e> bitmapMemoryCache, nm.x<jk.d, PooledByteBuffer> encodedMemoryCache, pk.n<pm.c> diskCachesStoreSupplier, nm.k cacheKeyFactory, mm.d platformBitmapFactory, int bitmapPrepareToDrawMinSizeBytes, int bitmapPrepareToDrawMaxSizeBytes, boolean bitmapPrepareToDrawForPrefetch, int maxBitmapSize, pm.a closeableReferenceFactory, boolean keepCancelledFetchAsLowPriority, int trackedKeysSize) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(byteArrayPool, "byteArrayPool");
            p013kotlin.jvm.internal.s.k(imageDecoder, "imageDecoder");
            p013kotlin.jvm.internal.s.k(progressiveJpegConfig, "progressiveJpegConfig");
            p013kotlin.jvm.internal.s.k(downsampleMode, "downsampleMode");
            p013kotlin.jvm.internal.s.k(executorSupplier, "executorSupplier");
            p013kotlin.jvm.internal.s.k(pooledByteBufferFactory, "pooledByteBufferFactory");
            p013kotlin.jvm.internal.s.k(pooledByteStreams, "pooledByteStreams");
            p013kotlin.jvm.internal.s.k(bitmapMemoryCache, "bitmapMemoryCache");
            p013kotlin.jvm.internal.s.k(encodedMemoryCache, "encodedMemoryCache");
            p013kotlin.jvm.internal.s.k(diskCachesStoreSupplier, "diskCachesStoreSupplier");
            p013kotlin.jvm.internal.s.k(cacheKeyFactory, "cacheKeyFactory");
            p013kotlin.jvm.internal.s.k(platformBitmapFactory, "platformBitmapFactory");
            p013kotlin.jvm.internal.s.k(closeableReferenceFactory, "closeableReferenceFactory");
            return new c0(context, byteArrayPool, imageDecoder, progressiveJpegConfig, downsampleMode, resizeAndRotateEnabledForNetwork, decodeCancellationEnabled, executorSupplier, pooledByteBufferFactory, bitmapMemoryCache, encodedMemoryCache, diskCachesStoreSupplier, cacheKeyFactory, platformBitmapFactory, bitmapPrepareToDrawMinSizeBytes, bitmapPrepareToDrawMaxSizeBytes, bitmapPrepareToDrawForPrefetch, maxBitmapSize, closeableReferenceFactory, keepCancelledFetchAsLowPriority, trackedKeysSize);
        }
    }

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jå\u0001\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\"2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\"H&¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lpm/x$d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsk/a;", "byteArrayPool", "Lsm/b;", "imageDecoder", "Lsm/d;", "progressiveJpegConfig", "Lpm/n;", "downsampleMode", "", "resizeAndRotateEnabledForNetwork", "decodeCancellationEnabled", "Lpm/p;", "executorSupplier", "Lsk/h;", "pooledByteBufferFactory", "Lsk/k;", "pooledByteStreams", "Lnm/x;", "Ljk/d;", "Lum/e;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Lpk/n;", "Lpm/c;", "diskCachesStoreSupplier", "Lnm/k;", "cacheKeyFactory", "Lmm/d;", "platformBitmapFactory", "", "bitmapPrepareToDrawMinSizeBytes", "bitmapPrepareToDrawMaxSizeBytes", "bitmapPrepareToDrawForPrefetch", "maxBitmapSize", "Lpm/a;", "closeableReferenceFactory", "keepCancelledFetchAsLowPriority", "trackedKeysSize", "Lpm/c0;", "a", "(Landroid/content/Context;Lsk/a;Lsm/b;Lsm/d;Lpm/n;ZZLpm/p;Lsk/h;Lsk/k;Lnm/x;Lnm/x;Lpk/n;Lnm/k;Lmm/d;IIZILpm/a;ZI)Lpm/c0;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface d {
        c0 a(Context context, sk.a byteArrayPool, sm.b imageDecoder, sm.d progressiveJpegConfig, n downsampleMode, boolean resizeAndRotateEnabledForNetwork, boolean decodeCancellationEnabled, p executorSupplier, sk.h pooledByteBufferFactory, sk.k pooledByteStreams, nm.x<jk.d, um.e> bitmapMemoryCache, nm.x<jk.d, PooledByteBuffer> encodedMemoryCache, pk.n<pm.c> diskCachesStoreSupplier, nm.k cacheKeyFactory, mm.d platformBitmapFactory, int bitmapPrepareToDrawMinSizeBytes, int bitmapPrepareToDrawMaxSizeBytes, boolean bitmapPrepareToDrawForPrefetch, int maxBitmapSize, pm.a closeableReferenceFactory, boolean keepCancelledFetchAsLowPriority, int trackedKeysSize);
    }

    public /* synthetic */ x(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getIsBinaryXmlEnabled() {
        return this.isBinaryXmlEnabled;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final boolean getIsDecodeCancellationEnabled() {
        return this.isDecodeCancellationEnabled;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getIsDiskCacheProbingEnabled() {
        return this.isDiskCacheProbingEnabled;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getIsEncodedCacheEnabled() {
        return this.isEncodedCacheEnabled;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getIsEncodedMemoryCacheProbingEnabled() {
        return this.isEncodedMemoryCacheProbingEnabled;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getIsEnsureTranscoderLibraryLoaded() {
        return this.isEnsureTranscoderLibraryLoaded;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getIsExperimentalThreadHandoffQueueEnabled() {
        return this.isExperimentalThreadHandoffQueueEnabled;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final boolean getIsGingerbreadDecoderEnabled() {
        return this.isGingerbreadDecoderEnabled;
    }

    public final pk.n<Boolean> I() {
        return this.isLazyDataSource;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getIsNativeCodeDisabled() {
        return this.isNativeCodeDisabled;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getIsPartialImageCachingEnabled() {
        return this.isPartialImageCachingEnabled;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getIsWebpSupportEnabled() {
        return this.isWebpSupportEnabled;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowDelay() {
        return this.allowDelay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowProgressiveOnPrefetch() {
        return this.allowProgressiveOnPrefetch;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAnimationRenderFpsLimit() {
        return this.animationRenderFpsLimit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAnimationStrategyBufferLengthMilliseconds() {
        return this.animationStrategyBufferLengthMilliseconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getBitmapPrepareToDrawForPrefetch() {
        return this.bitmapPrepareToDrawForPrefetch;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getBitmapPrepareToDrawMaxSizeBytes() {
        return this.bitmapPrepareToDrawMaxSizeBytes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getBitmapPrepareToDrawMinSizeBytes() {
        return this.bitmapPrepareToDrawMinSizeBytes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getCancelDecodeOnCacheMiss() {
        return this.cancelDecodeOnCacheMiss;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getDownsampleIfLargeBitmap() {
        return this.downsampleIfLargeBitmap;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getDownscaleFrameToDrawableDimensions() {
        return this.downscaleFrameToDrawableDimensions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getHandOffOnUiThreadOnly() {
        return this.handOffOnUiThreadOnly;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getKeepCancelledFetchAsLowPriority() {
        return this.keepCancelledFetchAsLowPriority;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getMaxBitmapDimension() {
        return this.maxBitmapDimension;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getMemoryType() {
        return this.memoryType;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final ym.f getPlatformDecoderOptions() {
        return this.platformDecoderOptions;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final d getProducerFactoryMethod() {
        return this.producerFactoryMethod;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShouldIgnoreCacheSizeMismatch() {
        return this.shouldIgnoreCacheSizeMismatch;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShouldStoreCacheEntrySize() {
        return this.shouldStoreCacheEntrySize;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getShouldUseDecodingBufferHelper() {
        return this.shouldUseDecodingBufferHelper;
    }

    public final pk.n<Boolean> t() {
        return this.suppressBitmapPrefetchingSupplier;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getTrackedKeysSize() {
        return this.trackedKeysSize;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getUseBalancedAnimationStrategy() {
        return this.useBalancedAnimationStrategy;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getUseBitmapPrepareToDraw() {
        return this.useBitmapPrepareToDraw;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getUseDownsamplingRatioForResizing() {
        return this.useDownsamplingRatioForResizing;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final yk.b getWebpBitmapFactory() {
        return this.webpBitmapFactory;
    }

    public final yk.b.a z() {
        return null;
    }

    private x(a aVar) {
        this.isWebpSupportEnabled = aVar.webpSupportEnabled;
        this.isDecodeCancellationEnabled = aVar.decodeCancellationEnabled;
        this.webpBitmapFactory = aVar.webpBitmapFactory;
        this.useDownsamplingRatioForResizing = aVar.useDownsamplingRatioForResizing;
        this.useBitmapPrepareToDraw = aVar.useBitmapPrepareToDraw;
        this.useBalancedAnimationStrategy = aVar.useBalancedAnimationStrategy;
        this.animationStrategyBufferLengthMilliseconds = aVar.animationStrategyBufferLengthMilliseconds;
        this.bitmapPrepareToDrawMinSizeBytes = aVar.bitmapPrepareToDrawMinSizeBytes;
        this.bitmapPrepareToDrawMaxSizeBytes = aVar.bitmapPrepareToDrawMaxSizeBytes;
        this.bitmapPrepareToDrawForPrefetch = aVar.bitmapPrepareToDrawForPrefetch;
        this.maxBitmapDimension = aVar.maxBitmapDimension;
        this.isNativeCodeDisabled = aVar.nativeCodeDisabled;
        this.isPartialImageCachingEnabled = aVar.isPartialImageCachingEnabled;
        d dVar = aVar.producerFactoryMethod;
        this.producerFactoryMethod = dVar == null ? new c() : dVar;
        pk.n<Boolean> BOOLEAN_FALSE = aVar.lazyDataSource;
        if (BOOLEAN_FALSE == null) {
            BOOLEAN_FALSE = pk.o.f103136b;
            p013kotlin.jvm.internal.s.j(BOOLEAN_FALSE, "BOOLEAN_FALSE");
        }
        this.isLazyDataSource = BOOLEAN_FALSE;
        this.isGingerbreadDecoderEnabled = aVar.gingerbreadDecoderEnabled;
        this.downscaleFrameToDrawableDimensions = aVar.downscaleFrameToDrawableDimensions;
        this.suppressBitmapPrefetchingSupplier = aVar.suppressBitmapPrefetchingSupplier;
        this.isExperimentalThreadHandoffQueueEnabled = aVar.experimentalThreadHandoffQueueEnabled;
        this.memoryType = aVar.memoryType;
        this.keepCancelledFetchAsLowPriority = aVar.keepCancelledFetchAsLowPriority;
        this.downsampleIfLargeBitmap = aVar.downsampleIfLargeBitmap;
        this.isEncodedCacheEnabled = aVar.encodedCacheEnabled;
        this.isEnsureTranscoderLibraryLoaded = aVar.ensureTranscoderLibraryLoaded;
        this.isEncodedMemoryCacheProbingEnabled = aVar.isEncodedMemoryCacheProbingEnabled;
        this.isDiskCacheProbingEnabled = aVar.isDiskCacheProbingEnabled;
        this.trackedKeysSize = aVar.trackedKeysSize;
        this.allowProgressiveOnPrefetch = aVar.allowProgressiveOnPrefetch;
        this.animationRenderFpsLimit = aVar.animationRenderFpsLimit;
        this.allowDelay = aVar.allowDelay;
        this.handOffOnUiThreadOnly = aVar.handOffOnUiThreadOnly;
        this.shouldStoreCacheEntrySize = aVar.shouldStoreCacheEntrySize;
        this.shouldIgnoreCacheSizeMismatch = aVar.shouldIgnoreCacheSizeMismatch;
        this.shouldUseDecodingBufferHelper = aVar.shouldUseDecodingBufferHelper;
        this.cancelDecodeOnCacheMiss = aVar.cancelDecodeOnCacheMiss;
        this.prefetchShortcutEnabled = aVar.prefetchShortcutEnabled;
        this.platformDecoderOptions = aVar.platformDecoderOptions;
        this.isBinaryXmlEnabled = aVar.isBinaryXmlEnabled;
    }
}
