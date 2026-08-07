package bm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bn\u0018\u0000 \u009a\u00012\u00020\u0001:\u00016Bý\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010*\u001a\u0004\u0018\u00010\n\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\u0018\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0-0,\u0012\u0006\u0010/\u001a\u00020\u0013\u0012\b\u00100\u001a\u0004\u0018\u00010\u0004\u0012\b\u00101\u001a\u0004\u0018\u00010\u0004\u0012\b\u00102\u001a\u0004\u0018\u00010\u0015\u0012\b\u00103\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010CR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010KR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010KR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bR\u0010I\u001a\u0004\bS\u0010KR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bT\u0010I\u001a\u0004\bU\u0010KR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010YR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b\u0014\u0010^R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bc\u0010`\u001a\u0004\bd\u0010bR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010\u001c\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bm\u0010I\u001a\u0004\bn\u0010KR\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bo\u0010I\u001a\u0004\bp\u0010KR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bu\u0010;\u001a\u0004\bv\u0010=R\u0019\u0010#\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bw\u0010;\u001a\u0004\bx\u0010=R\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0019\u0010&\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b}\u0010;\u001a\u0004\b~\u0010=R\u001a\u0010'\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u007f\u0010;\u001a\u0005\b\u0080\u0001\u0010=R\u001b\u0010(\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010;\u001a\u0005\b\u0082\u0001\u0010=R\u001b\u0010)\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010;\u001a\u0005\b\u0084\u0001\u0010=R\u001b\u0010*\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010W\u001a\u0005\b\u0086\u0001\u0010YR\u001b\u0010+\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010;\u001a\u0005\b\u0088\u0001\u0010=R-\u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0-0,8\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010/\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010]\u001a\u0005\b\u008e\u0001\u0010^R\u001b\u00100\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010;\u001a\u0005\b\u0090\u0001\u0010=R\u001a\u00101\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b`\u0010;\u001a\u0005\b\u0091\u0001\u0010=R\u001c\u00102\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u000f\n\u0005\bI\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u00103\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0092\u0001\u001a\u0006\b\u0096\u0001\u0010\u0094\u0001R\u001a\u0010\u0099\u0001\u001a\u00020\u00158\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010`\u001a\u0005\b\u0098\u0001\u0010b¨\u0006\u009b\u0001"}, d2 = {"Lbm/f;", "", "Lbm/k;", "infra", "", "controllerId", "requestId", "imageRequest", "callerContext", "imageInfo", "", "controllerSubmitTimeMs", "intermediateImageLoadTimeMs", "controllerFinalImageSetTimeMs", "controllerFailureTimeMs", "imageRequestStartTimeMs", "imageRequestEndTimeMs", "emptyEventTimestampNs", "releasedEventTimestampNs", "", "isPrefetch", "", "onScreenWidthPx", "onScreenHeightPx", "", "errorThrowable", "Lbm/n;", "visibilityState", "visibilityEventTimeMs", "invisibilityEventTimeMs", "Lbm/c;", "dimensionsInfo", "Lbm/b$a;", "extraData", "callingClassNameOnVisible", "rootContextNameOnVisible", "", "contextChainArrayOnVisible", "contextChainExtrasOnVisible", "contentIdOnVisible", "surfaceOnVisible", "subSurfaceOnVisible", "msSinceLastNavigationOnVisible", "startupStatusOnVisible", "", "Lkotlin/Pair;", "intermediateImageSetTimes", "newIntermediateImageSetPointAvailable", "errorMessageOnFailure", "errorStacktraceStringOnFailure", "errorCodeOnFailure", "densityDpiOnSuccess", "<init>", "(Lbm/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JJJJJJLjava/lang/Long;Ljava/lang/Long;ZIILjava/lang/Throwable;Lbm/n;JJLbm/c;Lbm/b$a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Lbm/k;", "getInfra", "()Lbm/k;", "b", "Ljava/lang/String;", "getControllerId", "()Ljava/lang/String;", "c", "getRequestId", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "getImageRequest", "()Ljava/lang/Object;", "e", "getCallerContext", "f", "getImageInfo", "g", "J", "getControllerSubmitTimeMs", "()J", "h", "getIntermediateImageLoadTimeMs", IntegerTokenConverter.CONVERTER_KEY, "getControllerFinalImageSetTimeMs", "j", "getControllerFailureTimeMs", "k", "getImageRequestStartTimeMs", "l", "getImageRequestEndTimeMs", "m", "Ljava/lang/Long;", "getEmptyEventTimestampNs", "()Ljava/lang/Long;", "n", "getReleasedEventTimestampNs", "o", "Z", "()Z", "p", "I", "getOnScreenWidthPx", "()I", "q", "getOnScreenHeightPx", "r", "Ljava/lang/Throwable;", "getErrorThrowable", "()Ljava/lang/Throwable;", "s", "Lbm/n;", "getVisibilityState", "()Lbm/n;", "t", "getVisibilityEventTimeMs", "u", "getInvisibilityEventTimeMs", "v", "Lbm/b$a;", "getExtraData", "()Lbm/b$a;", "w", "getCallingClassNameOnVisible", "x", "getRootContextNameOnVisible", "y", "[Ljava/lang/String;", "getContextChainArrayOnVisible", "()[Ljava/lang/String;", "z", "getContextChainExtrasOnVisible", "A", "getContentIdOnVisible", "B", "getSurfaceOnVisible", "C", "getSubSurfaceOnVisible", "D", "getMsSinceLastNavigationOnVisible", "E", "getStartupStatusOnVisible", Gender.FEMALE, "Ljava/util/List;", "getIntermediateImageSetTimes", "()Ljava/util/List;", "G", "getNewIntermediateImageSetPointAvailable", "H", "getErrorMessageOnFailure", "getErrorStacktraceStringOnFailure", "Ljava/lang/Integer;", "getErrorCodeOnFailure", "()Ljava/lang/Integer;", "K", "getDensityDpiOnSuccess", "L", "getInstanceId", "instanceId", Gender.MALE, "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final String contentIdOnVisible;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final String surfaceOnVisible;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final String subSurfaceOnVisible;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final Long msSinceLastNavigationOnVisible;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String startupStatusOnVisible;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final List<Pair<String, Long>> intermediateImageSetTimes;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final boolean newIntermediateImageSetPointAvailable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String errorMessageOnFailure;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String errorStacktraceStringOnFailure;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final Integer errorCodeOnFailure;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final Integer densityDpiOnSuccess;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final int instanceId;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k infra;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String controllerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String requestId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object imageRequest;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object callerContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Object imageInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long controllerSubmitTimeMs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long intermediateImageLoadTimeMs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long controllerFinalImageSetTimeMs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long controllerFailureTimeMs;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long imageRequestStartTimeMs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long imageRequestEndTimeMs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Long emptyEventTimestampNs;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Long releasedEventTimestampNs;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final boolean isPrefetch;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int onScreenWidthPx;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int onScreenHeightPx;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Throwable errorThrowable;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final n visibilityState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long visibilityEventTimeMs;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long invisibilityEventTimeMs;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final b.a extraData;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final String callingClassNameOnVisible;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final String rootContextNameOnVisible;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final String[] contextChainArrayOnVisible;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final String contextChainExtrasOnVisible;

    public f(k infra, String str, String str2, Object obj, Object obj2, Object obj3, long j11, long j12, long j13, long j14, long j15, long j16, Long l11, Long l12, boolean z11, int i11, int i12, Throwable th2, n visibilityState, long j17, long j18, c cVar, b.a aVar, String str3, String str4, String[] strArr, String str5, String str6, String str7, String str8, Long l13, String str9, List<Pair<String, Long>> intermediateImageSetTimes, boolean z12, String str10, String str11, Integer num, Integer num2) {
        s.k(infra, "infra");
        s.k(visibilityState, "visibilityState");
        s.k(intermediateImageSetTimes, "intermediateImageSetTimes");
        this.infra = infra;
        this.controllerId = str;
        this.requestId = str2;
        this.imageRequest = obj;
        this.callerContext = obj2;
        this.imageInfo = obj3;
        this.controllerSubmitTimeMs = j11;
        this.intermediateImageLoadTimeMs = j12;
        this.controllerFinalImageSetTimeMs = j13;
        this.controllerFailureTimeMs = j14;
        this.imageRequestStartTimeMs = j15;
        this.imageRequestEndTimeMs = j16;
        this.emptyEventTimestampNs = l11;
        this.releasedEventTimestampNs = l12;
        this.isPrefetch = z11;
        this.onScreenWidthPx = i11;
        this.onScreenHeightPx = i12;
        this.errorThrowable = th2;
        this.visibilityState = visibilityState;
        this.visibilityEventTimeMs = j17;
        this.invisibilityEventTimeMs = j18;
        this.extraData = aVar;
        this.callingClassNameOnVisible = str3;
        this.rootContextNameOnVisible = str4;
        this.contextChainArrayOnVisible = strArr;
        this.contextChainExtrasOnVisible = str5;
        this.contentIdOnVisible = str6;
        this.surfaceOnVisible = str7;
        this.subSurfaceOnVisible = str8;
        this.msSinceLastNavigationOnVisible = l13;
        this.startupStatusOnVisible = str9;
        this.intermediateImageSetTimes = intermediateImageSetTimes;
        this.newIntermediateImageSetPointAvailable = z12;
        this.errorMessageOnFailure = str10;
        this.errorStacktraceStringOnFailure = str11;
        this.errorCodeOnFailure = num;
        this.densityDpiOnSuccess = num2;
        this.instanceId = str != null ? str.hashCode() : 0;
    }
}
