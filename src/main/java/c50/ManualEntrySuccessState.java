package c50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import k50.SuccessState;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: c50.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lc50/b;", "", "Ls50/a;", "Lk50/c$a;", StatusResponse.PAYLOAD, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "completeSession", "<init>", "(Ls50/a;Ls50/a;)V", "a", "(Ls50/a;Ls50/a;)Lc50/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls50/a;", DateTokenConverter.CONVERTER_KEY, "()Ls50/a;", "b", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ManualEntrySuccessState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<SuccessState.Payload> payload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<FinancialConnectionsSession> completeSession;

    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntrySuccessState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManualEntrySuccessState b(ManualEntrySuccessState manualEntrySuccessState, s50.a aVar, s50.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = manualEntrySuccessState.payload;
        }
        if ((i11 & 2) != 0) {
            aVar2 = manualEntrySuccessState.completeSession;
        }
        return manualEntrySuccessState.a(aVar, aVar2);
    }

    public final ManualEntrySuccessState a(s50.a<SuccessState.Payload> payload, s50.a<FinancialConnectionsSession> completeSession) {
        s.k(payload, "payload");
        s.k(completeSession, "completeSession");
        return new ManualEntrySuccessState(payload, completeSession);
    }

    public final s50.a<FinancialConnectionsSession> c() {
        return this.completeSession;
    }

    public final s50.a<SuccessState.Payload> d() {
        return this.payload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualEntrySuccessState)) {
            return false;
        }
        ManualEntrySuccessState manualEntrySuccessState = (ManualEntrySuccessState) other;
        return s.f(this.payload, manualEntrySuccessState.payload) && s.f(this.completeSession, manualEntrySuccessState.completeSession);
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.completeSession.hashCode();
    }

    public String toString() {
        return "ManualEntrySuccessState(payload=" + this.payload + ", completeSession=" + this.completeSession + ")";
    }

    public ManualEntrySuccessState(s50.a<SuccessState.Payload> payload, s50.a<FinancialConnectionsSession> completeSession) {
        s.k(payload, "payload");
        s.k(completeSession, "completeSession");
        this.payload = payload;
        this.completeSession = completeSession;
    }

    public /* synthetic */ ManualEntrySuccessState(s50.a aVar, s50.a aVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s50.a.d.f110198b : aVar, (i11 & 2) != 0 ? s50.a.d.f110198b : aVar2);
    }
}
