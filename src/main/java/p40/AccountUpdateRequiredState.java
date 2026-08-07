package p40;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import h50.NoticeSheetState;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: p40.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lp40/b;", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "referrer", "Ls50/a;", "Lh50/b$a$d;", StatusResponse.PAYLOAD, "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ls50/a;)V", "Landroid/os/Bundle;", "arguments", "(Landroid/os/Bundle;)V", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ls50/a;)Lp40/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "Ls50/a;", "c", "()Ls50/a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AccountUpdateRequiredState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane referrer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<NoticeSheetState.a.UpdateRequired> payload;

    public AccountUpdateRequiredState(FinancialConnectionsSessionManifest.Pane referrer, s50.a<NoticeSheetState.a.UpdateRequired> payload) {
        s.k(referrer, "referrer");
        s.k(payload, "payload");
        this.referrer = referrer;
        this.payload = payload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountUpdateRequiredState b(AccountUpdateRequiredState accountUpdateRequiredState, FinancialConnectionsSessionManifest.Pane pane, s50.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pane = accountUpdateRequiredState.referrer;
        }
        if ((i11 & 2) != 0) {
            aVar = accountUpdateRequiredState.payload;
        }
        return accountUpdateRequiredState.a(pane, aVar);
    }

    public final AccountUpdateRequiredState a(FinancialConnectionsSessionManifest.Pane referrer, s50.a<NoticeSheetState.a.UpdateRequired> payload) {
        s.k(referrer, "referrer");
        s.k(payload, "payload");
        return new AccountUpdateRequiredState(referrer, payload);
    }

    public final s50.a<NoticeSheetState.a.UpdateRequired> c() {
        return this.payload;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountUpdateRequiredState)) {
            return false;
        }
        AccountUpdateRequiredState accountUpdateRequiredState = (AccountUpdateRequiredState) other;
        return this.referrer == accountUpdateRequiredState.referrer && s.f(this.payload, accountUpdateRequiredState.payload);
    }

    public int hashCode() {
        return (this.referrer.hashCode() * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "AccountUpdateRequiredState(referrer=" + this.referrer + ", payload=" + this.payload + ")";
    }

    public /* synthetic */ AccountUpdateRequiredState(FinancialConnectionsSessionManifest.Pane pane, s50.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pane, (i11 & 2) != 0 ? s50.a.d.f110198b : aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountUpdateRequiredState(Bundle bundle) {
        FinancialConnectionsSessionManifest.Pane paneA = o50.b.INSTANCE.a(bundle);
        s.h(paneA);
        this(paneA, null, 2, 0 == true ? 1 : 0);
    }
}
