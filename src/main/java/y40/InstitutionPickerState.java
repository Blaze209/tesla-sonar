package y40;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: y40.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0013B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0013\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000e\u0010\u0012Jd\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0016R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\"\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, d2 = {"Ly40/c;", "", "", "previewText", "selectedInstitutionId", "Ls50/a;", "Ly40/c$a;", StatusResponse.PAYLOAD, "Lcom/stripe/android/financialconnections/model/s;", "searchInstitutions", "Ljn0/h0;", "createSessionForInstitution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "referrer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ls50/a;Ls50/a;Ls50/a;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "Landroid/os/Bundle;", "args", "(Landroid/os/Bundle;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ls50/a;Ls50/a;Ls50/a;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Ly40/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "h", "c", "Ls50/a;", DateTokenConverter.CONVERTER_KEY, "()Ls50/a;", "g", "f", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class InstitutionPickerState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String previewText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedInstitutionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<InstitutionResponse> searchInstitutions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<h0> createSessionForInstitution;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane referrer;

    /* JADX INFO: renamed from: y40.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Ly40/c$a;", "", "Lcom/stripe/android/financialconnections/model/s;", "featuredInstitutions", "", "searchDisabled", "", "featuredInstitutionsDuration", "<init>", "(Lcom/stripe/android/financialconnections/model/s;ZJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/financialconnections/model/s;", "()Lcom/stripe/android/financialconnections/model/s;", "b", "Z", "getSearchDisabled", "()Z", "c", "J", "()J", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstitutionResponse featuredInstitutions;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean searchDisabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long featuredInstitutionsDuration;

        public Payload(InstitutionResponse featuredInstitutions, boolean z11, long j11) {
            s.k(featuredInstitutions, "featuredInstitutions");
            this.featuredInstitutions = featuredInstitutions;
            this.searchDisabled = z11;
            this.featuredInstitutionsDuration = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InstitutionResponse getFeaturedInstitutions() {
            return this.featuredInstitutions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getFeaturedInstitutionsDuration() {
            return this.featuredInstitutionsDuration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return s.f(this.featuredInstitutions, payload.featuredInstitutions) && this.searchDisabled == payload.searchDisabled && this.featuredInstitutionsDuration == payload.featuredInstitutionsDuration;
        }

        public int hashCode() {
            return (((this.featuredInstitutions.hashCode() * 31) + Boolean.hashCode(this.searchDisabled)) * 31) + Long.hashCode(this.featuredInstitutionsDuration);
        }

        public String toString() {
            return "Payload(featuredInstitutions=" + this.featuredInstitutions + ", searchDisabled=" + this.searchDisabled + ", featuredInstitutionsDuration=" + this.featuredInstitutionsDuration + ")";
        }
    }

    public InstitutionPickerState() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstitutionPickerState b(InstitutionPickerState institutionPickerState, String str, String str2, s50.a aVar, s50.a aVar2, s50.a aVar3, FinancialConnectionsSessionManifest.Pane pane, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = institutionPickerState.previewText;
        }
        if ((i11 & 2) != 0) {
            str2 = institutionPickerState.selectedInstitutionId;
        }
        if ((i11 & 4) != 0) {
            aVar = institutionPickerState.payload;
        }
        if ((i11 & 8) != 0) {
            aVar2 = institutionPickerState.searchInstitutions;
        }
        if ((i11 & 16) != 0) {
            aVar3 = institutionPickerState.createSessionForInstitution;
        }
        if ((i11 & 32) != 0) {
            pane = institutionPickerState.referrer;
        }
        s50.a aVar4 = aVar3;
        FinancialConnectionsSessionManifest.Pane pane2 = pane;
        return institutionPickerState.a(str, str2, aVar, aVar2, aVar4, pane2);
    }

    public final InstitutionPickerState a(String previewText, String selectedInstitutionId, s50.a<Payload> payload, s50.a<InstitutionResponse> searchInstitutions, s50.a<h0> createSessionForInstitution, FinancialConnectionsSessionManifest.Pane referrer) {
        s.k(payload, "payload");
        s.k(searchInstitutions, "searchInstitutions");
        s.k(createSessionForInstitution, "createSessionForInstitution");
        return new InstitutionPickerState(previewText, selectedInstitutionId, payload, searchInstitutions, createSessionForInstitution, referrer);
    }

    public final s50.a<h0> c() {
        return this.createSessionForInstitution;
    }

    public final s50.a<Payload> d() {
        return this.payload;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPreviewText() {
        return this.previewText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionPickerState)) {
            return false;
        }
        InstitutionPickerState institutionPickerState = (InstitutionPickerState) other;
        return s.f(this.previewText, institutionPickerState.previewText) && s.f(this.selectedInstitutionId, institutionPickerState.selectedInstitutionId) && s.f(this.payload, institutionPickerState.payload) && s.f(this.searchInstitutions, institutionPickerState.searchInstitutions) && s.f(this.createSessionForInstitution, institutionPickerState.createSessionForInstitution) && this.referrer == institutionPickerState.referrer;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getReferrer() {
        return this.referrer;
    }

    public final s50.a<InstitutionResponse> g() {
        return this.searchInstitutions;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSelectedInstitutionId() {
        return this.selectedInstitutionId;
    }

    public int hashCode() {
        String str = this.previewText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selectedInstitutionId;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.payload.hashCode()) * 31) + this.searchInstitutions.hashCode()) * 31) + this.createSessionForInstitution.hashCode()) * 31;
        FinancialConnectionsSessionManifest.Pane pane = this.referrer;
        return iHashCode2 + (pane != null ? pane.hashCode() : 0);
    }

    public String toString() {
        return "InstitutionPickerState(previewText=" + this.previewText + ", selectedInstitutionId=" + this.selectedInstitutionId + ", payload=" + this.payload + ", searchInstitutions=" + this.searchInstitutions + ", createSessionForInstitution=" + this.createSessionForInstitution + ", referrer=" + this.referrer + ")";
    }

    public InstitutionPickerState(String str, String str2, s50.a<Payload> payload, s50.a<InstitutionResponse> searchInstitutions, s50.a<h0> createSessionForInstitution, FinancialConnectionsSessionManifest.Pane pane) {
        s.k(payload, "payload");
        s.k(searchInstitutions, "searchInstitutions");
        s.k(createSessionForInstitution, "createSessionForInstitution");
        this.previewText = str;
        this.selectedInstitutionId = str2;
        this.payload = payload;
        this.searchInstitutions = searchInstitutions;
        this.createSessionForInstitution = createSessionForInstitution;
        this.referrer = pane;
    }

    public /* synthetic */ InstitutionPickerState(String str, String str2, s50.a aVar, s50.a aVar2, s50.a aVar3, FinancialConnectionsSessionManifest.Pane pane, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? s50.a.d.f110198b : aVar, (i11 & 8) != 0 ? s50.a.d.f110198b : aVar2, (i11 & 16) != 0 ? s50.a.d.f110198b : aVar3, (i11 & 32) != 0 ? null : pane);
    }

    public InstitutionPickerState(Bundle bundle) {
        this(null, null, null, null, null, o50.b.INSTANCE.a(bundle), 31, null);
    }
}
