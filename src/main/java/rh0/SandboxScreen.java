package rh0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: rh0.i, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"Lrh0/i;", "", "R", "mainScreen", "Lkotlin/Function0;", "Ljn0/h0;", "onFabClick", "Lrh0/c$b;", "getCurrentForcedStatus", "", "simulateGovIdNfc", "Lkotlin/Function1;", "onSimulateGovIdNfcChanged", "<init>", "(Ljava/lang/Object;Lwn0/a;Lwn0/a;ZLwn0/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lwn0/a;", "c", "()Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "()Z", "Lwn0/l;", "()Lwn0/l;", "sandbox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SandboxScreen<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final R mainScreen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<h0> onFabClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<c.b> getCurrentForcedStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean simulateGovIdNfc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.l<Boolean, h0> onSimulateGovIdNfcChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public SandboxScreen(R mainScreen, wn0.a<h0> onFabClick, wn0.a<? extends c.b> getCurrentForcedStatus, boolean z11, wn0.l<? super Boolean, h0> onSimulateGovIdNfcChanged) {
        s.k(mainScreen, "mainScreen");
        s.k(onFabClick, "onFabClick");
        s.k(getCurrentForcedStatus, "getCurrentForcedStatus");
        s.k(onSimulateGovIdNfcChanged, "onSimulateGovIdNfcChanged");
        this.mainScreen = mainScreen;
        this.onFabClick = onFabClick;
        this.getCurrentForcedStatus = getCurrentForcedStatus;
        this.simulateGovIdNfc = z11;
        this.onSimulateGovIdNfcChanged = onSimulateGovIdNfcChanged;
    }

    public final wn0.a<c.b> a() {
        return this.getCurrentForcedStatus;
    }

    public final R b() {
        return this.mainScreen;
    }

    public final wn0.a<h0> c() {
        return this.onFabClick;
    }

    public final wn0.l<Boolean, h0> d() {
        return this.onSimulateGovIdNfcChanged;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSimulateGovIdNfc() {
        return this.simulateGovIdNfc;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SandboxScreen)) {
            return false;
        }
        SandboxScreen sandboxScreen = (SandboxScreen) other;
        return s.f(this.mainScreen, sandboxScreen.mainScreen) && s.f(this.onFabClick, sandboxScreen.onFabClick) && s.f(this.getCurrentForcedStatus, sandboxScreen.getCurrentForcedStatus) && this.simulateGovIdNfc == sandboxScreen.simulateGovIdNfc && s.f(this.onSimulateGovIdNfcChanged, sandboxScreen.onSimulateGovIdNfcChanged);
    }

    public int hashCode() {
        return (((((((this.mainScreen.hashCode() * 31) + this.onFabClick.hashCode()) * 31) + this.getCurrentForcedStatus.hashCode()) * 31) + Boolean.hashCode(this.simulateGovIdNfc)) * 31) + this.onSimulateGovIdNfcChanged.hashCode();
    }

    public String toString() {
        return "SandboxScreen(mainScreen=" + this.mainScreen + ", onFabClick=" + this.onFabClick + ", getCurrentForcedStatus=" + this.getCurrentForcedStatus + ", simulateGovIdNfc=" + this.simulateGovIdNfc + ", onSimulateGovIdNfcChanged=" + this.onSimulateGovIdNfcChanged + ")";
    }
}
