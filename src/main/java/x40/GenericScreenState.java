package x40;

import com.fourthline.analytics.internal.AnalyticsContext;
import defpackage.FinancialConnectionsGenericInfoScreen;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: x40.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lx40/b;", "", "Lg;", AnalyticsContext.Screen, "", "inModal", "<init>", "(Lg;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lg;", "b", "()Lg;", "Z", "()Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GenericScreenState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsGenericInfoScreen screen;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean inModal;

    public GenericScreenState(FinancialConnectionsGenericInfoScreen screen, boolean z11) {
        s.k(screen, "screen");
        this.screen = screen;
        this.inModal = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getInModal() {
        return this.inModal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final FinancialConnectionsGenericInfoScreen getScreen() {
        return this.screen;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericScreenState)) {
            return false;
        }
        GenericScreenState genericScreenState = (GenericScreenState) other;
        return s.f(this.screen, genericScreenState.screen) && this.inModal == genericScreenState.inModal;
    }

    public int hashCode() {
        return (this.screen.hashCode() * 31) + Boolean.hashCode(this.inModal);
    }

    public String toString() {
        return "GenericScreenState(screen=" + this.screen + ", inModal=" + this.inModal + ")";
    }
}
