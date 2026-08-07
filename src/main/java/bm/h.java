package bm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0011\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010(\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R$\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010)\u001a\u0004\b\t\u0010*\"\u0004\b+\u0010,R$\u00101\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R*\u00108\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b\u0017\u00105\"\u0004\b6\u00107R$\u0010;\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010)\u001a\u0004\b\u001e\u0010*\"\u0004\b:\u0010,R$\u0010=\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010)\u001a\u0004\b\u0011\u0010*\"\u0004\b<\u0010,R$\u0010@\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010)\u001a\u0004\b>\u0010*\"\u0004\b?\u0010,R$\u0010D\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010)\u001a\u0004\bB\u0010*\"\u0004\bC\u0010,R$\u0010F\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001f\u001a\u0004\bA\u0010!\"\u0004\bE\u0010#R$\u0010I\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010)\u001a\u0004\bG\u0010*\"\u0004\bH\u0010,R$\u0010K\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b3\u0010*\"\u0004\bJ\u0010,R$\u0010M\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010)\u001a\u0004\b9\u0010*\"\u0004\bL\u0010,R$\u0010S\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010O\u001a\u0004\b.\u0010P\"\u0004\bQ\u0010RR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010O\u001a\u0004\b%\u0010P\"\u0004\bT\u0010R¨\u0006V"}, d2 = {"Lbm/h;", "", "Lbm/k;", "infra", "<init>", "(Lbm/k;)V", "Ljn0/h0;", "s", "()V", "a", "Lbm/k;", "j", "()Lbm/k;", "", "Lkotlin/Pair;", "", "", "b", "Ljava/util/List;", "k", "()Ljava/util/List;", "intermediateImageSetTimes", "", "c", "Z", "m", "()Z", "u", "(Z)V", "newIntermediateImageSetPointAvailable", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "t", "(Ljava/lang/Long;)V", "emptyEventTimestampNs", "e", "n", "v", "releasedEventTimestampNs", "Ljava/lang/String;", "()Ljava/lang/String;", "setCallingClassNameOnVisible", "(Ljava/lang/String;)V", "callingClassNameOnVisible", "g", "o", "setRootContextNameOnVisible", "rootContextNameOnVisible", "", "h", "[Ljava/lang/String;", "()[Ljava/lang/String;", "setContextChainArrayOnVisible", "([Ljava/lang/String;)V", "contextChainArrayOnVisible", IntegerTokenConverter.CONVERTER_KEY, "setContextChainExtrasOnVisible", "contextChainExtrasOnVisible", "setContentIdOnVisible", "contentIdOnVisible", "r", "setSurfaceOnVisible", "surfaceOnVisible", "l", "q", "setSubSurfaceOnVisible", "subSurfaceOnVisible", "setMsSinceLastNavigationOnVisible", "msSinceLastNavigationOnVisible", "p", "setStartupStatusOnVisible", "startupStatusOnVisible", "setErrorMessageOnFailure", "errorMessageOnFailure", "setErrorStacktraceStringOnFailure", "errorStacktraceStringOnFailure", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setErrorCodeOnFailure", "(Ljava/lang/Integer;)V", "errorCodeOnFailure", "setDensityDpiOnSuccess", "densityDpiOnSuccess", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k infra;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Pair<String, Long>> intermediateImageSetTimes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean newIntermediateImageSetPointAvailable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Long emptyEventTimestampNs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Long releasedEventTimestampNs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String callingClassNameOnVisible;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String rootContextNameOnVisible;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String[] contextChainArrayOnVisible;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String contextChainExtrasOnVisible;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String contentIdOnVisible;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String surfaceOnVisible;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String subSurfaceOnVisible;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Long msSinceLastNavigationOnVisible;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String startupStatusOnVisible;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String errorMessageOnFailure;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private String errorStacktraceStringOnFailure;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Integer errorCodeOnFailure;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Integer densityDpiOnSuccess;

    public h(k infra) {
        s.k(infra, "infra");
        this.infra = infra;
        this.intermediateImageSetTimes = new ArrayList();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCallingClassNameOnVisible() {
        return this.callingClassNameOnVisible;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContentIdOnVisible() {
        return this.contentIdOnVisible;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String[] getContextChainArrayOnVisible() {
        return this.contextChainArrayOnVisible;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getContextChainExtrasOnVisible() {
        return this.contextChainExtrasOnVisible;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getDensityDpiOnSuccess() {
        return this.densityDpiOnSuccess;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getEmptyEventTimestampNs() {
        return this.emptyEventTimestampNs;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getErrorCodeOnFailure() {
        return this.errorCodeOnFailure;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getErrorMessageOnFailure() {
        return this.errorMessageOnFailure;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getErrorStacktraceStringOnFailure() {
        return this.errorStacktraceStringOnFailure;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k getInfra() {
        return this.infra;
    }

    public final List<Pair<String, Long>> k() {
        return this.intermediateImageSetTimes;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Long getMsSinceLastNavigationOnVisible() {
        return this.msSinceLastNavigationOnVisible;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getNewIntermediateImageSetPointAvailable() {
        return this.newIntermediateImageSetPointAvailable;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Long getReleasedEventTimestampNs() {
        return this.releasedEventTimestampNs;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getRootContextNameOnVisible() {
        return this.rootContextNameOnVisible;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getStartupStatusOnVisible() {
        return this.startupStatusOnVisible;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getSubSurfaceOnVisible() {
        return this.subSurfaceOnVisible;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getSurfaceOnVisible() {
        return this.surfaceOnVisible;
    }

    public final void s() {
        this.intermediateImageSetTimes.clear();
        this.newIntermediateImageSetPointAvailable = false;
        this.emptyEventTimestampNs = null;
        this.releasedEventTimestampNs = null;
        this.callingClassNameOnVisible = null;
        this.rootContextNameOnVisible = null;
        this.contextChainArrayOnVisible = null;
        this.contextChainExtrasOnVisible = null;
        this.contentIdOnVisible = null;
        this.surfaceOnVisible = null;
        this.subSurfaceOnVisible = null;
        this.msSinceLastNavigationOnVisible = null;
        this.startupStatusOnVisible = null;
        this.errorMessageOnFailure = null;
        this.errorStacktraceStringOnFailure = null;
        this.errorCodeOnFailure = null;
        this.densityDpiOnSuccess = null;
    }

    public final void t(Long l11) {
        this.emptyEventTimestampNs = l11;
    }

    public final void u(boolean z11) {
        this.newIntermediateImageSetPointAvailable = z11;
    }

    public final void v(Long l11) {
        this.releasedEventTimestampNs = l11;
    }
}
