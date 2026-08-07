package d80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: d80.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Ld80/f;", "", "Lio0/b;", "durationRemaining", "", "ctaText", "Ld80/e;", "pollingState", "<init>", "(JILd80/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(JILd80/e;)Ld80/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", DateTokenConverter.CONVERTER_KEY, "()J", "b", "I", "c", "Ld80/e;", "e", "()Ld80/e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PollingUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long durationRemaining;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int ctaText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e pollingState;

    public /* synthetic */ PollingUiState(long j11, int i11, e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, i11, eVar);
    }

    public static /* synthetic */ PollingUiState b(PollingUiState pollingUiState, long j11, int i11, e eVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = pollingUiState.durationRemaining;
        }
        if ((i12 & 2) != 0) {
            i11 = pollingUiState.ctaText;
        }
        if ((i12 & 4) != 0) {
            eVar = pollingUiState.pollingState;
        }
        return pollingUiState.a(j11, i11, eVar);
    }

    public final PollingUiState a(long durationRemaining, int ctaText, e pollingState) {
        s.k(pollingState, "pollingState");
        return new PollingUiState(durationRemaining, ctaText, pollingState, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getDurationRemaining() {
        return this.durationRemaining;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getPollingState() {
        return this.pollingState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollingUiState)) {
            return false;
        }
        PollingUiState pollingUiState = (PollingUiState) other;
        return io0.b.k(this.durationRemaining, pollingUiState.durationRemaining) && this.ctaText == pollingUiState.ctaText && this.pollingState == pollingUiState.pollingState;
    }

    public int hashCode() {
        return (((io0.b.x(this.durationRemaining) * 31) + Integer.hashCode(this.ctaText)) * 31) + this.pollingState.hashCode();
    }

    public String toString() {
        return "PollingUiState(durationRemaining=" + io0.b.K(this.durationRemaining) + ", ctaText=" + this.ctaText + ", pollingState=" + this.pollingState + ")";
    }

    private PollingUiState(long j11, int i11, e pollingState) {
        s.k(pollingState, "pollingState");
        this.durationRemaining = j11;
        this.ctaText = i11;
        this.pollingState = pollingState;
    }

    public /* synthetic */ PollingUiState(long j11, int i11, e eVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, i11, (i12 & 4) != 0 ? e.Active : eVar, null);
    }
}
