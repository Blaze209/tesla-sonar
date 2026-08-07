package b50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: b50.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\tB'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lb50/e;", "", "Ls50/a;", "Lb50/e$a;", StatusResponse.PAYLOAD, "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "linkPaymentAccount", "<init>", "(Ls50/a;Ls50/a;)V", "a", "(Ls50/a;Ls50/a;)Lb50/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls50/a;", DateTokenConverter.CONVERTER_KEY, "()Ls50/a;", "b", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ManualEntryState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<LinkAccountSessionPaymentAccount> linkPaymentAccount;

    /* JADX INFO: renamed from: b50.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lb50/e$a;", "", "", "verifyWithMicrodeposits", "customManualEntry", "testMode", "<init>", "(ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean verifyWithMicrodeposits;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean customManualEntry;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean testMode;

        public Payload(boolean z11, boolean z12, boolean z13) {
            this.verifyWithMicrodeposits = z11;
            this.customManualEntry = z12;
            this.testMode = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCustomManualEntry() {
            return this.customManualEntry;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getTestMode() {
            return this.testMode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getVerifyWithMicrodeposits() {
            return this.verifyWithMicrodeposits;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return this.verifyWithMicrodeposits == payload.verifyWithMicrodeposits && this.customManualEntry == payload.customManualEntry && this.testMode == payload.testMode;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.verifyWithMicrodeposits) * 31) + Boolean.hashCode(this.customManualEntry)) * 31) + Boolean.hashCode(this.testMode);
        }

        public String toString() {
            return "Payload(verifyWithMicrodeposits=" + this.verifyWithMicrodeposits + ", customManualEntry=" + this.customManualEntry + ", testMode=" + this.testMode + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ManualEntryState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ManualEntryState b(ManualEntryState manualEntryState, s50.a aVar, s50.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = manualEntryState.payload;
        }
        if ((i11 & 2) != 0) {
            aVar2 = manualEntryState.linkPaymentAccount;
        }
        return manualEntryState.a(aVar, aVar2);
    }

    public final ManualEntryState a(s50.a<Payload> payload, s50.a<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        s.k(payload, "payload");
        s.k(linkPaymentAccount, "linkPaymentAccount");
        return new ManualEntryState(payload, linkPaymentAccount);
    }

    public final s50.a<LinkAccountSessionPaymentAccount> c() {
        return this.linkPaymentAccount;
    }

    public final s50.a<Payload> d() {
        return this.payload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManualEntryState)) {
            return false;
        }
        ManualEntryState manualEntryState = (ManualEntryState) other;
        return s.f(this.payload, manualEntryState.payload) && s.f(this.linkPaymentAccount, manualEntryState.linkPaymentAccount);
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.linkPaymentAccount.hashCode();
    }

    public String toString() {
        return "ManualEntryState(payload=" + this.payload + ", linkPaymentAccount=" + this.linkPaymentAccount + ")";
    }

    public ManualEntryState(s50.a<Payload> payload, s50.a<LinkAccountSessionPaymentAccount> linkPaymentAccount) {
        s.k(payload, "payload");
        s.k(linkPaymentAccount, "linkPaymentAccount");
        this.payload = payload;
        this.linkPaymentAccount = linkPaymentAccount;
    }

    public /* synthetic */ ManualEntryState(s50.a aVar, s50.a aVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s50.a.d.f110198b : aVar, (i11 & 2) != 0 ? s50.a.d.f110198b : aVar2);
    }
}
