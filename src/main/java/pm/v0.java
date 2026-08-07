package pm;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.imagepipeline.producers.e1;
import com.facebook.imagepipeline.producers.f1;
import com.facebook.imagepipeline.producers.g1;
import com.facebook.imagepipeline.producers.j1;
import com.facebook.imagepipeline.producers.l1;
import com.facebook.imagepipeline.producers.n1;
import com.facebook.imagepipeline.producers.p1;
import com.facebook.imagepipeline.producers.q1;
import com.facebook.imagepipeline.producers.x0;
import com.facebook.imagepipeline.producers.z0;
import ezvcard.property.Gender;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010%\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b-\u0018\u0000 \u0083\u00012\u00020\u0001:\u0001;B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b%\u0010&J=\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b,\u0010&J#\u0010-\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b-\u0010&J/\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b.\u0010&J7\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b/\u0010+J)\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b0\u00101J/\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b2\u0010&J/\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b3\u0010&J/\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b4\u0010&J\u001d\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b6\u0010\"J!\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b7\u0010\"J\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b8\u00109J'\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e¢\u0006\u0004\b:\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010BR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010BR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010BR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010BR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010BR\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QRL\u0010[\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0R8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010Z\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XRH\u0010`\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e0R8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\\\u0010T\u0012\u0004\b_\u0010Z\u001a\u0004\b]\u0010V\"\u0004\b^\u0010XRL\u0010e\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0R8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\ba\u0010T\u0012\u0004\bd\u0010Z\u001a\u0004\bb\u0010V\"\u0004\bc\u0010XR'\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR-\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u001f0\u001e8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bl\u0010h\u0012\u0004\bn\u0010Z\u001a\u0004\bm\u0010jR'\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bp\u0010h\u001a\u0004\bq\u0010jR'\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bs\u0010h\u001a\u0004\bt\u0010jR#\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bv\u0010h\u001a\u0004\bw\u0010jR#\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\by\u0010h\u001a\u0004\bz\u0010jR!\u0010~\u001a\b\u0012\u0004\u0012\u00020#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b|\u0010h\u001a\u0004\b}\u0010jR$\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bw\u0010h\u001a\u0004\b\u007f\u0010jR$\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010h\u001a\u0004\b|\u0010jR$\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010h\u001a\u0004\by\u0010jR)\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b}\u0010h\u001a\u0005\b\u0083\u0001\u0010jR*\u0010\u0087\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010h\u001a\u0005\b\u0086\u0001\u0010jR)\u0010\u0089\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b7\u0010h\u001a\u0005\b\u0088\u0001\u0010jR)\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8GX\u0086\u0084\u0002¢\u0006\r\n\u0004\b4\u0010h\u001a\u0005\b\u008a\u0001\u0010jR)\u0010\u008d\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b6\u0010h\u001a\u0005\b\u008c\u0001\u0010jR*\u0010\u0090\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010h\u001a\u0005\b\u008f\u0001\u0010jR*\u0010\u0091\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010h\u001a\u0005\b\u008e\u0001\u0010jR)\u0010\u0092\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010h\u001a\u0005\b\u0085\u0001\u0010j¨\u0006\u0093\u0001"}, d2 = {"Lpm/v0;", "", "Landroid/content/ContentResolver;", "contentResolver", "Lpm/c0;", "producerFactory", "Lcom/facebook/imagepipeline/producers/t0;", "networkFetcher", "", "resizeAndRotateEnabledForNetwork", "webpSupportEnabled", "Lcom/facebook/imagepipeline/producers/l1;", "threadHandoffProducerQueue", "Lpm/n;", "downsampleMode", "useBitmapPrepareToDraw", "partialImageCachingEnabled", "diskCacheEnabled", "Lcn/d;", "imageTranscoderFactory", "isEncodedMemoryCacheProbingEnabled", "isDiskCacheProbingEnabled", "allowDelay", "", "Lcom/facebook/imagepipeline/producers/o;", "customProducerSequenceFactories", "<init>", "(Landroid/content/ContentResolver;Lpm/c0;Lcom/facebook/imagepipeline/producers/t0;ZZLcom/facebook/imagepipeline/producers/l1;Lpm/n;ZZZLcn/d;ZZZLjava/util/Set;)V", "Lcom/facebook/imagepipeline/request/a;", "imageRequest", "Lcom/facebook/imagepipeline/producers/z0;", "Ltk/a;", "Lum/e;", "A", "(Lcom/facebook/imagepipeline/request/a;)Lcom/facebook/imagepipeline/producers/z0;", "Lum/k;", "inputProducer", "g0", "(Lcom/facebook/imagepipeline/producers/z0;)Lcom/facebook/imagepipeline/producers/z0;", "", "Lcom/facebook/imagepipeline/producers/q1;", "thumbnailProducers", "h0", "(Lcom/facebook/imagepipeline/producers/z0;[Lcom/facebook/imagepipeline/producers/q1;)Lcom/facebook/imagepipeline/producers/z0;", "k0", "j0", "e0", "m0", "l0", "([Lcom/facebook/imagepipeline/producers/q1;)Lcom/facebook/imagepipeline/producers/z0;", "Q", "B", Gender.FEMALE, "Ljava/lang/Void;", "G", "E", "i0", "(Lcom/facebook/imagepipeline/producers/t0;)Lcom/facebook/imagepipeline/producers/z0;", "f0", "a", "Landroid/content/ContentResolver;", "b", "Lpm/c0;", "c", "Lcom/facebook/imagepipeline/producers/t0;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "f", "Lcom/facebook/imagepipeline/producers/l1;", "g", "Lpm/n;", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "Lcn/d;", "l", "m", "n", "o", "Ljava/util/Set;", "", "p", "Ljava/util/Map;", "getPostprocessorSequences", "()Ljava/util/Map;", "setPostprocessorSequences", "(Ljava/util/Map;)V", "getPostprocessorSequences$annotations", "()V", "postprocessorSequences", "q", "getCloseableImagePrefetchSequences", "setCloseableImagePrefetchSequences", "getCloseableImagePrefetchSequences$annotations", "closeableImagePrefetchSequences", "r", "getBitmapPrepareSequences", "setBitmapPrepareSequences", "getBitmapPrepareSequences$annotations", "bitmapPrepareSequences", "Lcom/facebook/common/memory/PooledByteBuffer;", "s", "Lkotlin/Lazy;", "getNetworkFetchEncodedImageProducerSequence", "()Lcom/facebook/imagepipeline/producers/z0;", "networkFetchEncodedImageProducerSequence", "t", "getLocalFileFetchEncodedImageProducerSequence", "getLocalFileFetchEncodedImageProducerSequence$annotations", "localFileFetchEncodedImageProducerSequence", "u", "getLocalContentUriFetchEncodedImageProducerSequence", "localContentUriFetchEncodedImageProducerSequence", "v", Gender.OTHER, "networkFetchSequence", "w", "z", "backgroundNetworkFetchToEncodedMemorySequence", "x", "P", "networkFetchToEncodedMemoryPrefetchSequence", "y", "C", "commonNetworkFetchToEncodedMemorySequence", "J", "localFileFetchToEncodedMemoryPrefetchSequence", "backgroundLocalFileFetchToEncodeMemorySequence", "backgroundLocalContentUriFetchToEncodeMemorySequence", "K", "localImageFileFetchSequence", "D", Gender.NONE, "localVideoFileFetchSequence", "I", "localContentUriFetchSequence", Gender.MALE, "localThumbnailBitmapSdk29FetchSequence", "R", "qualifiedResourceFetchSequence", "H", "L", "localResourceFetchSequence", "localAssetFetchSequence", "dataFetchSequence", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Lazy backgroundLocalFileFetchToEncodeMemorySequence;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Lazy backgroundLocalContentUriFetchToEncodeMemorySequence;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final Lazy localImageFileFetchSequence;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final Lazy localVideoFileFetchSequence;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Lazy localContentUriFetchSequence;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Lazy localThumbnailBitmapSdk29FetchSequence;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Lazy qualifiedResourceFetchSequence;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Lazy localResourceFetchSequence;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Lazy localAssetFetchSequence;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final Lazy dataFetchSequence;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ContentResolver contentResolver;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 producerFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.facebook.imagepipeline.producers.t0<?> networkFetcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean resizeAndRotateEnabledForNetwork;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean webpSupportEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l1 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n downsampleMode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean useBitmapPrepareToDraw;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean partialImageCachingEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean diskCacheEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final cn.d imageTranscoderFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean isEncodedMemoryCacheProbingEnabled;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isDiskCacheProbingEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean allowDelay;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Set<com.facebook.imagepipeline.producers.o> customProducerSequenceFactories;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Map<z0<tk.a<um.e>>, z0<tk.a<um.e>>> postprocessorSequences;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Map<z0<tk.a<um.e>>, z0<Void>> closeableImagePrefetchSequences;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Map<z0<tk.a<um.e>>, z0<tk.a<um.e>>> bitmapPrepareSequences;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy networkFetchEncodedImageProducerSequence;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy localFileFetchEncodedImageProducerSequence;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy localContentUriFetchEncodedImageProducerSequence;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy networkFetchSequence;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy backgroundNetworkFetchToEncodedMemorySequence;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy networkFetchToEncodedMemoryPrefetchSequence;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy commonNetworkFetchToEncodedMemorySequence;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy localFileFetchToEncodedMemoryPrefetchSequence;

    /* JADX INFO: renamed from: pm.v0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpm/v0$a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/a;", "imageRequest", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/request/a;)V", "Landroid/net/Uri;", "uri", "", "c", "(Landroid/net/Uri;)Ljava/lang/String;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(Uri uri) {
            String string = uri.toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            if (string.length() <= 30) {
                return string;
            }
            String strSubstring = string.substring(0, 30);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            return strSubstring + "...";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(com.facebook.imagepipeline.request.a imageRequest) {
            pk.k.b(Boolean.valueOf(imageRequest.k().getValue() <= com.facebook.imagepipeline.request.a.c.ENCODED_MEMORY_CACHE.getValue()));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v0(ContentResolver contentResolver, c0 producerFactory, com.facebook.imagepipeline.producers.t0<?> networkFetcher, boolean z11, boolean z12, l1 threadHandoffProducerQueue, n downsampleMode, boolean z13, boolean z14, boolean z15, cn.d imageTranscoderFactory, boolean z16, boolean z17, boolean z18, Set<? extends com.facebook.imagepipeline.producers.o> set) {
        p013kotlin.jvm.internal.s.k(contentResolver, "contentResolver");
        p013kotlin.jvm.internal.s.k(producerFactory, "producerFactory");
        p013kotlin.jvm.internal.s.k(networkFetcher, "networkFetcher");
        p013kotlin.jvm.internal.s.k(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        p013kotlin.jvm.internal.s.k(downsampleMode, "downsampleMode");
        p013kotlin.jvm.internal.s.k(imageTranscoderFactory, "imageTranscoderFactory");
        this.contentResolver = contentResolver;
        this.producerFactory = producerFactory;
        this.networkFetcher = networkFetcher;
        this.resizeAndRotateEnabledForNetwork = z11;
        this.webpSupportEnabled = z12;
        this.threadHandoffProducerQueue = threadHandoffProducerQueue;
        this.downsampleMode = downsampleMode;
        this.useBitmapPrepareToDraw = z13;
        this.partialImageCachingEnabled = z14;
        this.diskCacheEnabled = z15;
        this.imageTranscoderFactory = imageTranscoderFactory;
        this.isEncodedMemoryCacheProbingEnabled = z16;
        this.isDiskCacheProbingEnabled = z17;
        this.allowDelay = z18;
        this.customProducerSequenceFactories = set;
        this.postprocessorSequences = new LinkedHashMap();
        this.closeableImagePrefetchSequences = new LinkedHashMap();
        this.bitmapPrepareSequences = new LinkedHashMap();
        this.networkFetchEncodedImageProducerSequence = jn0.m.b(new wn0.a() { // from class: pm.d0
            @Override // wn0.a
            public final Object invoke() {
                return v0.b0(this.f103237a);
            }
        });
        this.localFileFetchEncodedImageProducerSequence = jn0.m.b(new wn0.a() { // from class: pm.u0
            @Override // wn0.a
            public final Object invoke() {
                return v0.V(this.f103352a);
            }
        });
        this.localContentUriFetchEncodedImageProducerSequence = jn0.m.b(new wn0.a() { // from class: pm.e0
            @Override // wn0.a
            public final Object invoke() {
                return v0.T(this.f103239a);
            }
        });
        this.networkFetchSequence = jn0.m.b(new wn0.a() { // from class: pm.f0
            @Override // wn0.a
            public final Object invoke() {
                return v0.c0(this.f103242a);
            }
        });
        this.backgroundNetworkFetchToEncodedMemorySequence = jn0.m.b(new wn0.a() { // from class: pm.g0
            @Override // wn0.a
            public final Object invoke() {
                return v0.u(this.f103244a);
            }
        });
        this.networkFetchToEncodedMemoryPrefetchSequence = jn0.m.b(new wn0.a() { // from class: pm.h0
            @Override // wn0.a
            public final Object invoke() {
                return v0.d0(this.f103247a);
            }
        });
        this.commonNetworkFetchToEncodedMemorySequence = jn0.m.b(new wn0.a() { // from class: pm.i0
            @Override // wn0.a
            public final Object invoke() {
                return v0.v(this.f103250a);
            }
        });
        this.localFileFetchToEncodedMemoryPrefetchSequence = jn0.m.b(new wn0.a() { // from class: pm.j0
            @Override // wn0.a
            public final Object invoke() {
                return v0.W(this.f103253a);
            }
        });
        this.backgroundLocalFileFetchToEncodeMemorySequence = jn0.m.b(new wn0.a() { // from class: pm.k0
            @Override // wn0.a
            public final Object invoke() {
                return v0.t(this.f103269a);
            }
        });
        this.backgroundLocalContentUriFetchToEncodeMemorySequence = jn0.m.b(new wn0.a() { // from class: pm.l0
            @Override // wn0.a
            public final Object invoke() {
                return v0.s(this.f103271a);
            }
        });
        this.localImageFileFetchSequence = jn0.m.b(new wn0.a() { // from class: pm.m0
            @Override // wn0.a
            public final Object invoke() {
                return v0.X(this.f103272a);
            }
        });
        this.localVideoFileFetchSequence = jn0.m.b(new wn0.a() { // from class: pm.n0
            @Override // wn0.a
            public final Object invoke() {
                return v0.a0(this.f103273a);
            }
        });
        this.localContentUriFetchSequence = jn0.m.b(new wn0.a() { // from class: pm.o0
            @Override // wn0.a
            public final Object invoke() {
                return v0.U(this.f103274a);
            }
        });
        this.localThumbnailBitmapSdk29FetchSequence = jn0.m.b(new wn0.a() { // from class: pm.p0
            @Override // wn0.a
            public final Object invoke() {
                return v0.Z(this.f103275a);
            }
        });
        this.qualifiedResourceFetchSequence = jn0.m.b(new wn0.a() { // from class: pm.q0
            @Override // wn0.a
            public final Object invoke() {
                return v0.n0(this.f103276a);
            }
        });
        this.localResourceFetchSequence = jn0.m.b(new wn0.a() { // from class: pm.r0
            @Override // wn0.a
            public final Object invoke() {
                return v0.Y(this.f103278a);
            }
        });
        this.localAssetFetchSequence = jn0.m.b(new wn0.a() { // from class: pm.s0
            @Override // wn0.a
            public final Object invoke() {
                return v0.S(this.f103279a);
            }
        });
        this.dataFetchSequence = jn0.m.b(new wn0.a() { // from class: pm.t0
            @Override // wn0.a
            public final Object invoke() {
                return v0.w(this.f103298a);
            }
        });
    }

    private final z0<tk.a<um.e>> A(com.facebook.imagepipeline.request.a imageRequest) {
        z0<tk.a<um.e>> z0VarO;
        if (!bn.b.d()) {
            Uri uriV = imageRequest.v();
            p013kotlin.jvm.internal.s.j(uriV, "getSourceUri(...)");
            if (uriV == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int iW = imageRequest.w();
            if (iW == 0) {
                return O();
            }
            switch (iW) {
                case 2:
                    return imageRequest.i() ? M() : N();
                case 3:
                    return imageRequest.i() ? M() : K();
                case 4:
                    if (imageRequest.i()) {
                        return M();
                    }
                    return rk.a.c(this.contentResolver.getType(uriV)) ? N() : I();
                case 5:
                    return H();
                case 6:
                    return L();
                case 7:
                    return D();
                case 8:
                    return R();
                default:
                    Set<com.facebook.imagepipeline.producers.o> set = this.customProducerSequenceFactories;
                    if (set != null) {
                        Iterator<com.facebook.imagepipeline.producers.o> it = set.iterator();
                        while (it.hasNext()) {
                            com.facebook.imagepipeline.request.a aVar = imageRequest;
                            z0<tk.a<um.e>> z0VarB = it.next().b(aVar, this, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                            if (z0VarB != null) {
                                return z0VarB;
                            }
                            imageRequest = aVar;
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + INSTANCE.c(uriV));
            }
        }
        bn.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri uriV2 = imageRequest.v();
            p013kotlin.jvm.internal.s.j(uriV2, "getSourceUri(...)");
            if (uriV2 == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int iW2 = imageRequest.w();
            if (iW2 != 0) {
                switch (iW2) {
                    case 2:
                        if (imageRequest.i()) {
                            z0<tk.a<um.e>> z0VarM = M();
                            bn.b.b();
                            return z0VarM;
                        }
                        z0VarO = N();
                        break;
                    case 3:
                        if (imageRequest.i()) {
                            z0<tk.a<um.e>> z0VarM2 = M();
                            bn.b.b();
                            return z0VarM2;
                        }
                        z0VarO = K();
                        break;
                    case 4:
                        if (imageRequest.i()) {
                            z0<tk.a<um.e>> z0VarM3 = M();
                            bn.b.b();
                            return z0VarM3;
                        }
                        if (rk.a.c(this.contentResolver.getType(uriV2))) {
                            z0<tk.a<um.e>> z0VarN = N();
                            bn.b.b();
                            return z0VarN;
                        }
                        z0VarO = I();
                        break;
                    case 5:
                        z0VarO = H();
                        break;
                    case 6:
                        z0VarO = L();
                        break;
                    case 7:
                        z0VarO = D();
                        break;
                    case 8:
                        z0VarO = R();
                        break;
                    default:
                        Set<com.facebook.imagepipeline.producers.o> set2 = this.customProducerSequenceFactories;
                        if (set2 != null) {
                            Iterator<com.facebook.imagepipeline.producers.o> it2 = set2.iterator();
                            while (it2.hasNext()) {
                                z0<tk.a<um.e>> z0VarB2 = it2.next().b(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                                if (z0VarB2 != null) {
                                    bn.b.b();
                                    return z0VarB2;
                                }
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + INSTANCE.c(uriV2));
                }
            } else {
                z0VarO = O();
            }
            bn.b.b();
            return z0VarO;
        } catch (Throwable th2) {
            bn.b.b();
            throw th2;
        }
    }

    private final synchronized z0<tk.a<um.e>> B(z0<tk.a<um.e>> inputProducer) {
        z0<tk.a<um.e>> z0VarF;
        z0VarF = this.bitmapPrepareSequences.get(inputProducer);
        if (z0VarF == null) {
            z0VarF = this.producerFactory.f(inputProducer);
            this.bitmapPrepareSequences.put(inputProducer, z0VarF);
        }
        return z0VarF;
    }

    private final synchronized z0<tk.a<um.e>> F(z0<tk.a<um.e>> inputProducer) {
        com.facebook.imagepipeline.producers.t tVarK;
        tVarK = this.producerFactory.k(inputProducer);
        p013kotlin.jvm.internal.s.j(tVarK, "newDelayProducer(...)");
        return tVarK;
    }

    private final synchronized z0<tk.a<um.e>> Q(z0<tk.a<um.e>> inputProducer) {
        z0<tk.a<um.e>> z0VarA;
        z0VarA = this.postprocessorSequences.get(inputProducer);
        if (z0VarA == null) {
            x0 x0VarB = this.producerFactory.B(inputProducer);
            p013kotlin.jvm.internal.s.j(x0VarB, "newPostprocessorProducer(...)");
            z0VarA = this.producerFactory.A(x0VarB);
            this.postprocessorSequences.put(inputProducer, z0VarA);
        }
        return z0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 S(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        com.facebook.imagepipeline.producers.h0 h0VarQ = this$0.producerFactory.q();
        p013kotlin.jvm.internal.s.j(h0VarQ, "newLocalAssetFetchProducer(...)");
        return this$0.g0(h0VarQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1 T(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            return new f1(this$0.x());
        }
        bn.b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new f1(this$0.x());
        } finally {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 U(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        com.facebook.imagepipeline.producers.i0 i0VarR = this$0.producerFactory.r();
        p013kotlin.jvm.internal.s.j(i0VarR, "newLocalContentUriFetchProducer(...)");
        return this$0.h0(i0VarR, new q1[]{this$0.producerFactory.s(), this$0.producerFactory.t()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1 V(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            return new f1(this$0.y());
        }
        bn.b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new f1(this$0.y());
        } finally {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 W(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            return this$0.producerFactory.E(this$0.y());
        }
        bn.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return this$0.producerFactory.E(this$0.y());
        } finally {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 X(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        com.facebook.imagepipeline.producers.m0 m0VarU = this$0.producerFactory.u();
        p013kotlin.jvm.internal.s.j(m0VarU, "newLocalFileFetchProducer(...)");
        return this$0.g0(m0VarU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 Y(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        com.facebook.imagepipeline.producers.n0 n0VarV = this$0.producerFactory.v();
        p013kotlin.jvm.internal.s.j(n0VarV, "newLocalResourceFetchProducer(...)");
        return this$0.g0(n0VarV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 Z(v0 this$0) throws Throwable {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (Build.VERSION.SDK_INT < 29) {
            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
        }
        com.facebook.imagepipeline.producers.o0 o0VarW = this$0.producerFactory.w();
        p013kotlin.jvm.internal.s.j(o0VarW, "newLocalThumbnailBitmapSdk29Producer(...)");
        return this$0.e0(o0VarW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 a0(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        com.facebook.imagepipeline.producers.p0 p0VarX = this$0.producerFactory.x();
        p013kotlin.jvm.internal.s.j(p0VarX, "newLocalVideoThumbnailProducer(...)");
        return this$0.e0(p0VarX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f1 b0(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            return new f1(this$0.z());
        }
        bn.b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new f1(this$0.z());
        } finally {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 c0(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            return this$0.f0(this$0.C());
        }
        bn.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return this$0.f0(this$0.C());
        } finally {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j1 d0(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            return this$0.producerFactory.E(this$0.z());
        }
        bn.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return this$0.producerFactory.E(this$0.z());
        } finally {
            bn.b.b();
        }
    }

    private final z0<tk.a<um.e>> e0(z0<tk.a<um.e>> inputProducer) {
        com.facebook.imagepipeline.producers.i iVarE = this.producerFactory.e(inputProducer);
        p013kotlin.jvm.internal.s.j(iVarE, "newBitmapMemoryCacheProducer(...)");
        com.facebook.imagepipeline.producers.h hVarD = this.producerFactory.d(iVarE);
        p013kotlin.jvm.internal.s.j(hVarD, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        z0<tk.a<um.e>> z0VarB = this.producerFactory.b(hVarD, this.threadHandoffProducerQueue);
        p013kotlin.jvm.internal.s.j(z0VarB, "newBackgroundThreadHandoffProducer(...)");
        if (!this.isEncodedMemoryCacheProbingEnabled && !this.isDiskCacheProbingEnabled) {
            com.facebook.imagepipeline.producers.g gVarC = this.producerFactory.c(z0VarB);
            p013kotlin.jvm.internal.s.j(gVarC, "newBitmapMemoryCacheGetProducer(...)");
            return gVarC;
        }
        com.facebook.imagepipeline.producers.g gVarC2 = this.producerFactory.c(z0VarB);
        p013kotlin.jvm.internal.s.j(gVarC2, "newBitmapMemoryCacheGetProducer(...)");
        com.facebook.imagepipeline.producers.k kVarG = this.producerFactory.g(gVarC2);
        p013kotlin.jvm.internal.s.j(kVarG, "newBitmapProbeProducer(...)");
        return kVarG;
    }

    private final z0<tk.a<um.e>> g0(z0<um.k> inputProducer) {
        return h0(inputProducer, new q1[]{this.producerFactory.t()});
    }

    private final z0<tk.a<um.e>> h0(z0<um.k> inputProducer, q1<um.k>[] thumbnailProducers) {
        return f0(m0(k0(inputProducer), thumbnailProducers));
    }

    private final z0<um.k> j0(z0<um.k> inputProducer) {
        com.facebook.imagepipeline.producers.w wVarM;
        com.facebook.imagepipeline.producers.w wVarM2;
        if (!bn.b.d()) {
            if (this.partialImageCachingEnabled) {
                com.facebook.imagepipeline.producers.u0 u0VarZ = this.producerFactory.z(inputProducer);
                p013kotlin.jvm.internal.s.j(u0VarZ, "newPartialDiskCacheProducer(...)");
                wVarM2 = this.producerFactory.m(u0VarZ);
            } else {
                wVarM2 = this.producerFactory.m(inputProducer);
            }
            p013kotlin.jvm.internal.s.h(wVarM2);
            com.facebook.imagepipeline.producers.v vVarL = this.producerFactory.l(wVarM2);
            p013kotlin.jvm.internal.s.j(vVarL, "newDiskCacheReadProducer(...)");
            return vVarL;
        }
        bn.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.partialImageCachingEnabled) {
                com.facebook.imagepipeline.producers.u0 u0VarZ2 = this.producerFactory.z(inputProducer);
                p013kotlin.jvm.internal.s.j(u0VarZ2, "newPartialDiskCacheProducer(...)");
                wVarM = this.producerFactory.m(u0VarZ2);
            } else {
                wVarM = this.producerFactory.m(inputProducer);
            }
            p013kotlin.jvm.internal.s.h(wVarM);
            com.facebook.imagepipeline.producers.v vVarL2 = this.producerFactory.l(wVarM);
            p013kotlin.jvm.internal.s.j(vVarL2, "newDiskCacheReadProducer(...)");
            return vVarL2;
        } finally {
            bn.b.b();
        }
    }

    private final z0<um.k> k0(z0<um.k> inputProducer) {
        if (this.diskCacheEnabled) {
            inputProducer = j0(inputProducer);
        }
        z0<um.k> z0VarO = this.producerFactory.o(inputProducer);
        p013kotlin.jvm.internal.s.j(z0VarO, "newEncodedMemoryCacheProducer(...)");
        if (!this.isDiskCacheProbingEnabled) {
            com.facebook.imagepipeline.producers.y yVarN = this.producerFactory.n(z0VarO);
            p013kotlin.jvm.internal.s.j(yVarN, "newEncodedCacheKeyMultiplexProducer(...)");
            return yVarN;
        }
        com.facebook.imagepipeline.producers.a0 a0VarP = this.producerFactory.p(z0VarO);
        p013kotlin.jvm.internal.s.j(a0VarP, "newEncodedProbeProducer(...)");
        com.facebook.imagepipeline.producers.y yVarN2 = this.producerFactory.n(a0VarP);
        p013kotlin.jvm.internal.s.j(yVarN2, "newEncodedCacheKeyMultiplexProducer(...)");
        return yVarN2;
    }

    private final z0<um.k> l0(q1<um.k>[] thumbnailProducers) {
        p1 p1VarG = this.producerFactory.G(thumbnailProducers);
        p013kotlin.jvm.internal.s.j(p1VarG, "newThumbnailBranchProducer(...)");
        g1 g1VarD = this.producerFactory.D(p1VarG, true, this.imageTranscoderFactory);
        p013kotlin.jvm.internal.s.j(g1VarD, "newResizeAndRotateProducer(...)");
        return g1VarD;
    }

    private final z0<um.k> m0(z0<um.k> inputProducer, q1<um.k>[] thumbnailProducers) {
        com.facebook.imagepipeline.producers.a aVarA = c0.a(inputProducer);
        p013kotlin.jvm.internal.s.j(aVarA, "newAddImageTransformMetaDataProducer(...)");
        n1 n1VarF = this.producerFactory.F(this.producerFactory.D(aVarA, true, this.imageTranscoderFactory));
        p013kotlin.jvm.internal.s.j(n1VarF, "newThrottlingProducer(...)");
        com.facebook.imagepipeline.producers.l lVarH = c0.h(l0(thumbnailProducers), n1VarF);
        p013kotlin.jvm.internal.s.j(lVarH, "newBranchOnSeparateImagesProducer(...)");
        return lVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 n0(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        e1 e1VarC = this$0.producerFactory.C();
        p013kotlin.jvm.internal.s.j(e1VarC, "newQualifiedResourceFetchProducer(...)");
        return this$0.g0(e1VarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 s(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            com.facebook.imagepipeline.producers.i0 i0VarR = this$0.producerFactory.r();
            p013kotlin.jvm.internal.s.j(i0VarR, "newLocalContentUriFetchProducer(...)");
            return this$0.producerFactory.b(this$0.k0(i0VarR), this$0.threadHandoffProducerQueue);
        }
        bn.b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            com.facebook.imagepipeline.producers.i0 i0VarR2 = this$0.producerFactory.r();
            p013kotlin.jvm.internal.s.j(i0VarR2, "newLocalContentUriFetchProducer(...)");
            return this$0.producerFactory.b(this$0.k0(i0VarR2), this$0.threadHandoffProducerQueue);
        } finally {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 t(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            com.facebook.imagepipeline.producers.m0 m0VarU = this$0.producerFactory.u();
            p013kotlin.jvm.internal.s.j(m0VarU, "newLocalFileFetchProducer(...)");
            return this$0.producerFactory.b(this$0.k0(m0VarU), this$0.threadHandoffProducerQueue);
        }
        bn.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            com.facebook.imagepipeline.producers.m0 m0VarU2 = this$0.producerFactory.u();
            p013kotlin.jvm.internal.s.j(m0VarU2, "newLocalFileFetchProducer(...)");
            return this$0.producerFactory.b(this$0.k0(m0VarU2), this$0.threadHandoffProducerQueue);
        } finally {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 u(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            return this$0.producerFactory.b(this$0.C(), this$0.threadHandoffProducerQueue);
        }
        bn.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return this$0.producerFactory.b(this$0.C(), this$0.threadHandoffProducerQueue);
        } finally {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 v(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        if (!bn.b.d()) {
            return this$0.i0(this$0.networkFetcher);
        }
        bn.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return this$0.i0(this$0.networkFetcher);
        } finally {
            bn.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 w(v0 this$0) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        com.facebook.imagepipeline.producers.p pVarI = this$0.producerFactory.i();
        p013kotlin.jvm.internal.s.j(pVarI, "newDataFetchProducer(...)");
        return this$0.f0(this$0.producerFactory.D(c0.a(pVarI), true, this$0.imageTranscoderFactory));
    }

    public final z0<um.k> C() {
        return (z0) this.commonNetworkFetchToEncodedMemorySequence.getValue();
    }

    public final z0<tk.a<um.e>> D() {
        return (z0) this.dataFetchSequence.getValue();
    }

    public final z0<tk.a<um.e>> E(com.facebook.imagepipeline.request.a imageRequest) {
        p013kotlin.jvm.internal.s.k(imageRequest, "imageRequest");
        if (!bn.b.d()) {
            z0<tk.a<um.e>> z0VarA = A(imageRequest);
            if (imageRequest.l() != null) {
                z0VarA = Q(z0VarA);
            }
            if (this.useBitmapPrepareToDraw) {
                z0VarA = B(z0VarA);
            }
            return (!this.allowDelay || imageRequest.e() <= 0) ? z0VarA : F(z0VarA);
        }
        bn.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            z0<tk.a<um.e>> z0VarA2 = A(imageRequest);
            if (imageRequest.l() != null) {
                z0VarA2 = Q(z0VarA2);
            }
            if (this.useBitmapPrepareToDraw) {
                z0VarA2 = B(z0VarA2);
            }
            if (this.allowDelay && imageRequest.e() > 0) {
                z0VarA2 = F(z0VarA2);
            }
            return z0VarA2;
        } finally {
            bn.b.b();
        }
    }

    public final z0<Void> G(com.facebook.imagepipeline.request.a imageRequest) {
        p013kotlin.jvm.internal.s.k(imageRequest, "imageRequest");
        Companion companion = INSTANCE;
        companion.d(imageRequest);
        int iW = imageRequest.w();
        if (iW == 0) {
            return P();
        }
        if (iW == 2 || iW == 3) {
            return J();
        }
        Uri uriV = imageRequest.v();
        p013kotlin.jvm.internal.s.j(uriV, "getSourceUri(...)");
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + companion.c(uriV));
    }

    public final z0<tk.a<um.e>> H() {
        return (z0) this.localAssetFetchSequence.getValue();
    }

    public final z0<tk.a<um.e>> I() {
        return (z0) this.localContentUriFetchSequence.getValue();
    }

    public final z0<Void> J() {
        Object value = this.localFileFetchToEncodedMemoryPrefetchSequence.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (z0) value;
    }

    public final z0<tk.a<um.e>> K() {
        return (z0) this.localImageFileFetchSequence.getValue();
    }

    public final z0<tk.a<um.e>> L() {
        return (z0) this.localResourceFetchSequence.getValue();
    }

    public final z0<tk.a<um.e>> M() {
        return (z0) this.localThumbnailBitmapSdk29FetchSequence.getValue();
    }

    public final z0<tk.a<um.e>> N() {
        return (z0) this.localVideoFileFetchSequence.getValue();
    }

    public final z0<tk.a<um.e>> O() {
        return (z0) this.networkFetchSequence.getValue();
    }

    public final z0<Void> P() {
        Object value = this.networkFetchToEncodedMemoryPrefetchSequence.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (z0) value;
    }

    public final z0<tk.a<um.e>> R() {
        return (z0) this.qualifiedResourceFetchSequence.getValue();
    }

    public final z0<tk.a<um.e>> f0(z0<um.k> inputProducer) {
        p013kotlin.jvm.internal.s.k(inputProducer, "inputProducer");
        if (!bn.b.d()) {
            com.facebook.imagepipeline.producers.q qVarJ = this.producerFactory.j(inputProducer);
            p013kotlin.jvm.internal.s.j(qVarJ, "newDecodeProducer(...)");
            return e0(qVarJ);
        }
        bn.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            com.facebook.imagepipeline.producers.q qVarJ2 = this.producerFactory.j(inputProducer);
            p013kotlin.jvm.internal.s.j(qVarJ2, "newDecodeProducer(...)");
            return e0(qVarJ2);
        } finally {
            bn.b.b();
        }
    }

    public final synchronized z0<um.k> i0(com.facebook.imagepipeline.producers.t0<?> networkFetcher) {
        try {
            p013kotlin.jvm.internal.s.k(networkFetcher, "networkFetcher");
            boolean z11 = false;
            if (!bn.b.d()) {
                z0<um.k> z0VarY = this.producerFactory.y(networkFetcher);
                p013kotlin.jvm.internal.s.j(z0VarY, "newNetworkFetchProducer(...)");
                com.facebook.imagepipeline.producers.a aVarA = c0.a(k0(z0VarY));
                p013kotlin.jvm.internal.s.j(aVarA, "newAddImageTransformMetaDataProducer(...)");
                c0 c0Var = this.producerFactory;
                if (this.resizeAndRotateEnabledForNetwork && this.downsampleMode != n.NEVER) {
                    z11 = true;
                }
                return c0Var.D(aVarA, z11, this.imageTranscoderFactory);
            }
            bn.b.a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                z0<um.k> z0VarY2 = this.producerFactory.y(networkFetcher);
                p013kotlin.jvm.internal.s.j(z0VarY2, "newNetworkFetchProducer(...)");
                com.facebook.imagepipeline.producers.a aVarA2 = c0.a(k0(z0VarY2));
                p013kotlin.jvm.internal.s.j(aVarA2, "newAddImageTransformMetaDataProducer(...)");
                c0 c0Var2 = this.producerFactory;
                if (this.resizeAndRotateEnabledForNetwork && this.downsampleMode != n.NEVER) {
                    z11 = true;
                }
                g1 g1VarD = c0Var2.D(aVarA2, z11, this.imageTranscoderFactory);
                bn.b.b();
                return g1VarD;
            } catch (Throwable th2) {
                bn.b.b();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final z0<um.k> x() {
        Object value = this.backgroundLocalContentUriFetchToEncodeMemorySequence.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (z0) value;
    }

    public final z0<um.k> y() {
        Object value = this.backgroundLocalFileFetchToEncodeMemorySequence.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (z0) value;
    }

    public final z0<um.k> z() {
        Object value = this.backgroundNetworkFetchToEncodedMemorySequence.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (z0) value;
    }
}
