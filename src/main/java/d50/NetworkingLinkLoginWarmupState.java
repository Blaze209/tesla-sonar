package d50;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.Scopes;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import i40.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import s50.FinancialConnectionsSheetNativeState;

/* JADX INFO: renamed from: d50.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0014BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\r\u0010\u0013JR\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b$\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b+\u0010\u001a¨\u0006-"}, d2 = {"Ld50/c;", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "referrer", "", "nextPaneOnDisableNetworking", "Ls50/a;", "Ld50/c$a;", StatusResponse.PAYLOAD, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "disableNetworkingAsync", "", "isInstantDebits", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ls50/a;Ls50/a;Z)V", "Landroid/os/Bundle;", "args", "Ls50/c;", "state", "(Landroid/os/Bundle;Ls50/c;)V", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ls50/a;Ls50/a;Z)Ld50/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "f", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "c", "Ls50/a;", "e", "()Ls50/a;", "Z", "h", "()Z", "g", "secondaryButtonLabel", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NetworkingLinkLoginWarmupState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane referrer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String nextPaneOnDisableNetworking;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<FinancialConnectionsSessionManifest> disableNetworkingAsync;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInstantDebits;

    /* JADX INFO: renamed from: d50.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0014"}, d2 = {"Ld50/c$a;", "", "", "merchantName", Scopes.EMAIL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMerchantName", "b", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String merchantName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        public Payload(String str, String email) {
            s.k(email, "email");
            this.merchantName = str;
            this.email = email;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return s.f(this.merchantName, payload.merchantName) && s.f(this.email, payload.email);
        }

        public int hashCode() {
            String str = this.merchantName;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.email.hashCode();
        }

        public String toString() {
            return "Payload(merchantName=" + this.merchantName + ", email=" + this.email + ")";
        }
    }

    public NetworkingLinkLoginWarmupState() {
        this(null, null, null, null, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkingLinkLoginWarmupState b(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState, FinancialConnectionsSessionManifest.Pane pane, String str, s50.a aVar, s50.a aVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pane = networkingLinkLoginWarmupState.referrer;
        }
        if ((i11 & 2) != 0) {
            str = networkingLinkLoginWarmupState.nextPaneOnDisableNetworking;
        }
        if ((i11 & 4) != 0) {
            aVar = networkingLinkLoginWarmupState.payload;
        }
        if ((i11 & 8) != 0) {
            aVar2 = networkingLinkLoginWarmupState.disableNetworkingAsync;
        }
        if ((i11 & 16) != 0) {
            z11 = networkingLinkLoginWarmupState.isInstantDebits;
        }
        boolean z12 = z11;
        s50.a aVar3 = aVar;
        return networkingLinkLoginWarmupState.a(pane, str, aVar3, aVar2, z12);
    }

    public final NetworkingLinkLoginWarmupState a(FinancialConnectionsSessionManifest.Pane referrer, String nextPaneOnDisableNetworking, s50.a<Payload> payload, s50.a<FinancialConnectionsSessionManifest> disableNetworkingAsync, boolean isInstantDebits) {
        s.k(payload, "payload");
        s.k(disableNetworkingAsync, "disableNetworkingAsync");
        return new NetworkingLinkLoginWarmupState(referrer, nextPaneOnDisableNetworking, payload, disableNetworkingAsync, isInstantDebits);
    }

    public final s50.a<FinancialConnectionsSessionManifest> c() {
        return this.disableNetworkingAsync;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNextPaneOnDisableNetworking() {
        return this.nextPaneOnDisableNetworking;
    }

    public final s50.a<Payload> e() {
        return this.payload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingLinkLoginWarmupState)) {
            return false;
        }
        NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState = (NetworkingLinkLoginWarmupState) other;
        return this.referrer == networkingLinkLoginWarmupState.referrer && s.f(this.nextPaneOnDisableNetworking, networkingLinkLoginWarmupState.nextPaneOnDisableNetworking) && s.f(this.payload, networkingLinkLoginWarmupState.payload) && s.f(this.disableNetworkingAsync, networkingLinkLoginWarmupState.disableNetworkingAsync) && this.isInstantDebits == networkingLinkLoginWarmupState.isInstantDebits;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public final int g() {
        return this.isInstantDebits ? k.T : k.V;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsInstantDebits() {
        return this.isInstantDebits;
    }

    public int hashCode() {
        FinancialConnectionsSessionManifest.Pane pane = this.referrer;
        int iHashCode = (pane == null ? 0 : pane.hashCode()) * 31;
        String str = this.nextPaneOnDisableNetworking;
        return ((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.payload.hashCode()) * 31) + this.disableNetworkingAsync.hashCode()) * 31) + Boolean.hashCode(this.isInstantDebits);
    }

    public String toString() {
        return "NetworkingLinkLoginWarmupState(referrer=" + this.referrer + ", nextPaneOnDisableNetworking=" + this.nextPaneOnDisableNetworking + ", payload=" + this.payload + ", disableNetworkingAsync=" + this.disableNetworkingAsync + ", isInstantDebits=" + this.isInstantDebits + ")";
    }

    public NetworkingLinkLoginWarmupState(FinancialConnectionsSessionManifest.Pane pane, String str, s50.a<Payload> payload, s50.a<FinancialConnectionsSessionManifest> disableNetworkingAsync, boolean z11) {
        s.k(payload, "payload");
        s.k(disableNetworkingAsync, "disableNetworkingAsync");
        this.referrer = pane;
        this.nextPaneOnDisableNetworking = str;
        this.payload = payload;
        this.disableNetworkingAsync = disableNetworkingAsync;
        this.isInstantDebits = z11;
    }

    public /* synthetic */ NetworkingLinkLoginWarmupState(FinancialConnectionsSessionManifest.Pane pane, String str, s50.a aVar, s50.a aVar2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : pane, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? s50.a.d.f110198b : aVar, (i11 & 8) != 0 ? s50.a.d.f110198b : aVar2, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkingLinkLoginWarmupState(Bundle bundle, FinancialConnectionsSheetNativeState state) {
        s.k(state, "state");
        FinancialConnectionsSessionManifest.Pane paneA = o50.b.INSTANCE.a(bundle);
        String string = bundle != null ? bundle.getString("next_pane_on_disable_networking") : null;
        s50.a.d dVar = s50.a.d.f110198b;
        this(paneA, string, dVar, dVar, state.getIsLinkWithStripe());
    }
}
