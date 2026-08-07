package w40;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import v50.g;

/* JADX INFO: renamed from: w40.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u000eB'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rJ6\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lw40/c;", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "referrer", "Ls50/a;", "Lw40/c$a;", StatusResponse.PAYLOAD, "", "closing", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ls50/a;Z)V", "Landroid/os/Bundle;", "args", "(Landroid/os/Bundle;)V", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ls50/a;Z)Lw40/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "e", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "Ls50/a;", DateTokenConverter.CONVERTER_KEY, "()Ls50/a;", "c", "Z", "()Z", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ExitState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane referrer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean closing;

    /* JADX INFO: renamed from: w40.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lw40/c$a;", "", "Lv50/g;", "description", "<init>", "(Lv50/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv50/g;", "()Lv50/g;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g description;

        public Payload(g description) {
            s.k(description, "description");
            this.description = description;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final g getDescription() {
            return this.description;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && s.f(this.description, ((Payload) other).description);
        }

        public int hashCode() {
            return this.description.hashCode();
        }

        public String toString() {
            return "Payload(description=" + this.description + ")";
        }
    }

    public ExitState(FinancialConnectionsSessionManifest.Pane pane, s50.a<Payload> payload, boolean z11) {
        s.k(payload, "payload");
        this.referrer = pane;
        this.payload = payload;
        this.closing = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExitState b(ExitState exitState, FinancialConnectionsSessionManifest.Pane pane, s50.a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pane = exitState.referrer;
        }
        if ((i11 & 2) != 0) {
            aVar = exitState.payload;
        }
        if ((i11 & 4) != 0) {
            z11 = exitState.closing;
        }
        return exitState.a(pane, aVar, z11);
    }

    public final ExitState a(FinancialConnectionsSessionManifest.Pane referrer, s50.a<Payload> payload, boolean closing) {
        s.k(payload, "payload");
        return new ExitState(referrer, payload, closing);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getClosing() {
        return this.closing;
    }

    public final s50.a<Payload> d() {
        return this.payload;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExitState)) {
            return false;
        }
        ExitState exitState = (ExitState) other;
        return this.referrer == exitState.referrer && s.f(this.payload, exitState.payload) && this.closing == exitState.closing;
    }

    public int hashCode() {
        FinancialConnectionsSessionManifest.Pane pane = this.referrer;
        return ((((pane == null ? 0 : pane.hashCode()) * 31) + this.payload.hashCode()) * 31) + Boolean.hashCode(this.closing);
    }

    public String toString() {
        return "ExitState(referrer=" + this.referrer + ", payload=" + this.payload + ", closing=" + this.closing + ")";
    }

    public ExitState(Bundle bundle) {
        this(o50.b.INSTANCE.a(bundle), s50.a.d.f110198b, false);
    }
}
