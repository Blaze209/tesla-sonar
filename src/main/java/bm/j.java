package bm;

import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0017J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0017J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b)\u0010\u0013J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b/\u0010-J\u0017\u00102\u001a\u00020\u00062\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020$¢\u0006\u0004\b5\u0010'J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010F\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010A\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0013R\u0018\u0010(\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010!R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010 \u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0016\u0010H\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010GR\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u0012R\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u0012R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010IR\"\u0010P\u001a\u00020J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bK\u0010OR\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010RR\"\u0010W\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010!\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u0017R\u0016\u0010\"\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0018\u0010Y\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010X¨\u0006Z"}, d2 = {"Lbm/j;", "Lbm/h;", "Lbm/k;", "infra", "<init>", "(Lbm/k;)V", "Ljn0/h0;", "w", "()V", "x", "", "controllerId", "B", "(Ljava/lang/String;)V", "requestId", "P", "", "imageRequest", "I", "(Ljava/lang/Object;)V", "", "controllerSubmitTimeMs", "D", "(J)V", "controllerIntermediateImageSetTimeMs", "C", "controllerFinalImageSetTimeMs", "A", "controllerFailureTimeMs", "z", "imageRequestStartTimeMs", "K", "imageRequestEndTimeMs", "J", "invisibilityEventTimeMs", "L", "", "prefetch", Gender.OTHER, "(Z)V", "imageInfo", "G", "", "onScreenWidthPx", Gender.NONE, "(I)V", "onScreenHeightPx", Gender.MALE, "", "errorThrowable", "E", "(Ljava/lang/Throwable;)V", "visible", "R", "Lbm/f;", "S", "()Lbm/f;", "Lbm/b$a;", "extraData", Gender.FEMALE, "(Lbm/b$a;)V", "s", "Ljava/lang/String;", "t", "u", "Ljava/lang/Object;", "v", "getCallerContext", "()Ljava/lang/Object;", "y", "callerContext", "Z", "isPrefetch", "Ljava/lang/Throwable;", "Lbm/e;", "H", "Lbm/e;", "getImageLoadStatus", "()Lbm/e;", "(Lbm/e;)V", "imageLoadStatus", "Lbm/n;", "Lbm/n;", "visibilityState", "getVisibilityEventTimeMs", "()J", "Q", "visibilityEventTimeMs", "Lbm/b$a;", "_extraData", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends h {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long controllerFailureTimeMs;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private long imageRequestStartTimeMs;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private long imageRequestEndTimeMs;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean isPrefetch;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int onScreenWidthPx;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int onScreenHeightPx;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private Throwable errorThrowable;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private e imageLoadStatus;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private n visibilityState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private long visibilityEventTimeMs;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private long invisibilityEventTimeMs;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private b.a _extraData;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private String controllerId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private String requestId;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Object imageRequest;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Object callerContext;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Object imageInfo;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private long controllerSubmitTimeMs;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long controllerIntermediateImageSetTimeMs;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long controllerFinalImageSetTimeMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k infra) {
        super(infra);
        s.k(infra, "infra");
        this.controllerSubmitTimeMs = -1L;
        this.controllerIntermediateImageSetTimeMs = -1L;
        this.controllerFinalImageSetTimeMs = -1L;
        this.controllerFailureTimeMs = -1L;
        this.imageRequestStartTimeMs = -1L;
        this.imageRequestEndTimeMs = -1L;
        this.onScreenWidthPx = -1;
        this.onScreenHeightPx = -1;
        this.imageLoadStatus = e.UNKNOWN;
        this.visibilityState = n.UNKNOWN;
        this.visibilityEventTimeMs = -1L;
        this.invisibilityEventTimeMs = -1L;
    }

    public final void A(long controllerFinalImageSetTimeMs) {
        this.controllerFinalImageSetTimeMs = controllerFinalImageSetTimeMs;
    }

    public final void B(String controllerId) {
        this.controllerId = controllerId;
    }

    public final void C(long controllerIntermediateImageSetTimeMs) {
        this.controllerIntermediateImageSetTimeMs = controllerIntermediateImageSetTimeMs;
    }

    public final void D(long controllerSubmitTimeMs) {
        this.controllerSubmitTimeMs = controllerSubmitTimeMs;
    }

    public final void E(Throwable errorThrowable) {
        this.errorThrowable = errorThrowable;
    }

    public final void F(b.a extraData) {
        this._extraData = extraData;
    }

    public final void G(Object imageInfo) {
        this.imageInfo = imageInfo;
    }

    public final void H(e eVar) {
        s.k(eVar, "<set-?>");
        this.imageLoadStatus = eVar;
    }

    public final void I(Object imageRequest) {
        this.imageRequest = imageRequest;
    }

    public final void J(long imageRequestEndTimeMs) {
        this.imageRequestEndTimeMs = imageRequestEndTimeMs;
    }

    public final void K(long imageRequestStartTimeMs) {
        this.imageRequestStartTimeMs = imageRequestStartTimeMs;
    }

    public final void L(long invisibilityEventTimeMs) {
        this.invisibilityEventTimeMs = invisibilityEventTimeMs;
    }

    public final void M(int onScreenHeightPx) {
        this.onScreenHeightPx = onScreenHeightPx;
    }

    public final void N(int onScreenWidthPx) {
        this.onScreenWidthPx = onScreenWidthPx;
    }

    public final void O(boolean prefetch) {
        this.isPrefetch = prefetch;
    }

    public final void P(String requestId) {
        this.requestId = requestId;
    }

    public final void Q(long j11) {
        this.visibilityEventTimeMs = j11;
    }

    public final void R(boolean visible) {
        this.visibilityState = visible ? n.VISIBLE : n.INVISIBLE;
    }

    public final f S() {
        return new f(getInfra(), this.controllerId, this.requestId, this.imageRequest, this.callerContext, this.imageInfo, this.controllerSubmitTimeMs, this.controllerIntermediateImageSetTimeMs, this.controllerFinalImageSetTimeMs, this.controllerFailureTimeMs, this.imageRequestStartTimeMs, this.imageRequestEndTimeMs, getEmptyEventTimestampNs(), getReleasedEventTimestampNs(), this.isPrefetch, this.onScreenWidthPx, this.onScreenHeightPx, this.errorThrowable, this.visibilityState, this.visibilityEventTimeMs, this.invisibilityEventTimeMs, null, this._extraData, getCallingClassNameOnVisible(), getRootContextNameOnVisible(), getContextChainArrayOnVisible(), getContextChainExtrasOnVisible(), getContentIdOnVisible(), getSurfaceOnVisible(), getSubSurfaceOnVisible(), getMsSinceLastNavigationOnVisible(), getStartupStatusOnVisible(), v.m1(k()), getNewIntermediateImageSetPointAvailable(), getErrorMessageOnFailure(), getErrorStacktraceStringOnFailure(), getErrorCodeOnFailure(), getDensityDpiOnSuccess());
    }

    public final void w() {
        this.requestId = null;
        this.imageRequest = null;
        this.callerContext = null;
        this.imageInfo = null;
        this.isPrefetch = false;
        this.onScreenWidthPx = -1;
        this.onScreenHeightPx = -1;
        this.errorThrowable = null;
        this.imageLoadStatus = e.UNKNOWN;
        this.visibilityState = n.UNKNOWN;
        this._extraData = null;
        x();
        s();
    }

    public final void x() {
        this.imageRequestStartTimeMs = -1L;
        this.imageRequestEndTimeMs = -1L;
        this.controllerSubmitTimeMs = -1L;
        this.controllerFinalImageSetTimeMs = -1L;
        this.controllerFailureTimeMs = -1L;
        this.visibilityEventTimeMs = -1L;
        this.invisibilityEventTimeMs = -1L;
        k().clear();
        u(false);
        t(null);
        v(null);
    }

    public final void y(Object obj) {
        this.callerContext = obj;
    }

    public final void z(long controllerFailureTimeMs) {
        this.controllerFailureTimeMs = controllerFailureTimeMs;
    }
}
