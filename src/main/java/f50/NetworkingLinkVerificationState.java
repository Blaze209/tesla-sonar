package f50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.Scopes;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import jn0.h0;
import p010i90.OTPElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: f50.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\tB'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lf50/c;", "", "Ls50/a;", "Lf50/c$a;", StatusResponse.PAYLOAD, "Ljn0/h0;", "confirmVerification", "<init>", "(Ls50/a;Ls50/a;)V", "a", "(Ls50/a;Ls50/a;)Lf50/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls50/a;", DateTokenConverter.CONVERTER_KEY, "()Ls50/a;", "b", "c", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NetworkingLinkVerificationState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f64439c = OTPElement.f76679e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<h0> confirmVerification;

    /* JADX INFO: renamed from: f50.c$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001f¨\u0006 "}, d2 = {"Lf50/c$a;", "", "", Scopes.EMAIL, "phoneNumber", "Li90/l0;", "otpElement", "consumerSessionClientSecret", "Lcom/stripe/android/financialconnections/model/q;", "initialInstitution", "<init>", "(Ljava/lang/String;Ljava/lang/String;Li90/l0;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/q;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getEmail", "b", DateTokenConverter.CONVERTER_KEY, "c", "Li90/l0;", "()Li90/l0;", "e", "Lcom/stripe/android/financialconnections/model/q;", "()Lcom/stripe/android/financialconnections/model/q;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f64442f = OTPElement.f76679e;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phoneNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OTPElement otpElement;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String consumerSessionClientSecret;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final FinancialConnectionsInstitution initialInstitution;

        public Payload(String email, String phoneNumber, OTPElement otpElement, String consumerSessionClientSecret, FinancialConnectionsInstitution financialConnectionsInstitution) {
            s.k(email, "email");
            s.k(phoneNumber, "phoneNumber");
            s.k(otpElement, "otpElement");
            s.k(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.otpElement = otpElement;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
            this.initialInstitution = financialConnectionsInstitution;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConsumerSessionClientSecret() {
            return this.consumerSessionClientSecret;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FinancialConnectionsInstitution getInitialInstitution() {
            return this.initialInstitution;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final OTPElement getOtpElement() {
            return this.otpElement;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return s.f(this.email, payload.email) && s.f(this.phoneNumber, payload.phoneNumber) && s.f(this.otpElement, payload.otpElement) && s.f(this.consumerSessionClientSecret, payload.consumerSessionClientSecret) && s.f(this.initialInstitution, payload.initialInstitution);
        }

        public int hashCode() {
            int iHashCode = ((((((this.email.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.otpElement.hashCode()) * 31) + this.consumerSessionClientSecret.hashCode()) * 31;
            FinancialConnectionsInstitution financialConnectionsInstitution = this.initialInstitution;
            return iHashCode + (financialConnectionsInstitution == null ? 0 : financialConnectionsInstitution.hashCode());
        }

        public String toString() {
            return "Payload(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", otpElement=" + this.otpElement + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ", initialInstitution=" + this.initialInstitution + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkingLinkVerificationState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkingLinkVerificationState b(NetworkingLinkVerificationState networkingLinkVerificationState, s50.a aVar, s50.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = networkingLinkVerificationState.payload;
        }
        if ((i11 & 2) != 0) {
            aVar2 = networkingLinkVerificationState.confirmVerification;
        }
        return networkingLinkVerificationState.a(aVar, aVar2);
    }

    public final NetworkingLinkVerificationState a(s50.a<Payload> payload, s50.a<h0> confirmVerification) {
        s.k(payload, "payload");
        s.k(confirmVerification, "confirmVerification");
        return new NetworkingLinkVerificationState(payload, confirmVerification);
    }

    public final s50.a<h0> c() {
        return this.confirmVerification;
    }

    public final s50.a<Payload> d() {
        return this.payload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingLinkVerificationState)) {
            return false;
        }
        NetworkingLinkVerificationState networkingLinkVerificationState = (NetworkingLinkVerificationState) other;
        return s.f(this.payload, networkingLinkVerificationState.payload) && s.f(this.confirmVerification, networkingLinkVerificationState.confirmVerification);
    }

    public int hashCode() {
        return (this.payload.hashCode() * 31) + this.confirmVerification.hashCode();
    }

    public String toString() {
        return "NetworkingLinkVerificationState(payload=" + this.payload + ", confirmVerification=" + this.confirmVerification + ")";
    }

    public NetworkingLinkVerificationState(s50.a<Payload> payload, s50.a<h0> confirmVerification) {
        s.k(payload, "payload");
        s.k(confirmVerification, "confirmVerification");
        this.payload = payload;
        this.confirmVerification = confirmVerification;
    }

    public /* synthetic */ NetworkingLinkVerificationState(s50.a aVar, s50.a aVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s50.a.d.f110198b : aVar, (i11 & 2) != 0 ? s50.a.d.f110198b : aVar2);
    }
}
