package c80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: c80.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lc80/g;", "", "", "lastFour", "", "isTestMode", "Lc80/h;", "cvcState", "isEnabled", "<init>", "(Ljava/lang/String;ZLc80/h;Z)V", "a", "(Ljava/lang/String;ZLc80/h;Z)Lc80/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Z", "f", "()Z", "c", "Lc80/h;", "()Lc80/h;", "e", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CvcRecollectionViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastFour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTestMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CvcState cvcState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    public CvcRecollectionViewState(String lastFour, boolean z11, CvcState cvcState, boolean z12) {
        s.k(lastFour, "lastFour");
        s.k(cvcState, "cvcState");
        this.lastFour = lastFour;
        this.isTestMode = z11;
        this.cvcState = cvcState;
        this.isEnabled = z12;
    }

    public static /* synthetic */ CvcRecollectionViewState b(CvcRecollectionViewState cvcRecollectionViewState, String str, boolean z11, CvcState cvcState, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cvcRecollectionViewState.lastFour;
        }
        if ((i11 & 2) != 0) {
            z11 = cvcRecollectionViewState.isTestMode;
        }
        if ((i11 & 4) != 0) {
            cvcState = cvcRecollectionViewState.cvcState;
        }
        if ((i11 & 8) != 0) {
            z12 = cvcRecollectionViewState.isEnabled;
        }
        return cvcRecollectionViewState.a(str, z11, cvcState, z12);
    }

    public final CvcRecollectionViewState a(String lastFour, boolean isTestMode, CvcState cvcState, boolean isEnabled) {
        s.k(lastFour, "lastFour");
        s.k(cvcState, "cvcState");
        return new CvcRecollectionViewState(lastFour, isTestMode, cvcState, isEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CvcState getCvcState() {
        return this.cvcState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvcRecollectionViewState)) {
            return false;
        }
        CvcRecollectionViewState cvcRecollectionViewState = (CvcRecollectionViewState) other;
        return s.f(this.lastFour, cvcRecollectionViewState.lastFour) && this.isTestMode == cvcRecollectionViewState.isTestMode && s.f(this.cvcState, cvcRecollectionViewState.cvcState) && this.isEnabled == cvcRecollectionViewState.isEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    public int hashCode() {
        return (((((this.lastFour.hashCode() * 31) + Boolean.hashCode(this.isTestMode)) * 31) + this.cvcState.hashCode()) * 31) + Boolean.hashCode(this.isEnabled);
    }

    public String toString() {
        return "CvcRecollectionViewState(lastFour=" + this.lastFour + ", isTestMode=" + this.isTestMode + ", cvcState=" + this.cvcState + ", isEnabled=" + this.isEnabled + ")";
    }
}
