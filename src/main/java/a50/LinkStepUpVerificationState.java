package a50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.Scopes;
import jn0.h0;
import p010i90.OTPElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import z50.n;

/* JADX INFO: renamed from: a50.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\nB7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ@\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001e\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\"\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"La50/b;", "", "Ls50/a;", "La50/b$a;", StatusResponse.PAYLOAD, "Ljn0/h0;", "confirmVerification", "resendOtp", "<init>", "(Ls50/a;Ls50/a;Ls50/a;)V", "a", "(Ls50/a;Ls50/a;Ls50/a;)La50/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls50/a;", DateTokenConverter.CONVERTER_KEY, "()Ls50/a;", "b", "c", "e", "g", "()Z", "submitLoading", "", "f", "()Ljava/lang/Throwable;", "submitError", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkStepUpVerificationState {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f406d = OTPElement.f76679e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<h0> confirmVerification;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<h0> resendOtp;

    /* JADX INFO: renamed from: a50.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001b"}, d2 = {"La50/b$a;", "", "", Scopes.EMAIL, "phoneNumber", "Li90/l0;", "otpElement", "consumerSessionClientSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Li90/l0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getPhoneNumber", "c", "Li90/l0;", "()Li90/l0;", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f410e = OTPElement.f76679e;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phoneNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OTPElement otpElement;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String consumerSessionClientSecret;

        public Payload(String email, String phoneNumber, OTPElement otpElement, String consumerSessionClientSecret) {
            s.k(email, "email");
            s.k(phoneNumber, "phoneNumber");
            s.k(otpElement, "otpElement");
            s.k(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.otpElement = otpElement;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConsumerSessionClientSecret() {
            return this.consumerSessionClientSecret;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final OTPElement getOtpElement() {
            return this.otpElement;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return s.f(this.email, payload.email) && s.f(this.phoneNumber, payload.phoneNumber) && s.f(this.otpElement, payload.otpElement) && s.f(this.consumerSessionClientSecret, payload.consumerSessionClientSecret);
        }

        public int hashCode() {
            return (((((this.email.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.otpElement.hashCode()) * 31) + this.consumerSessionClientSecret.hashCode();
        }

        public String toString() {
            return "Payload(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", otpElement=" + this.otpElement + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ")";
        }
    }

    public LinkStepUpVerificationState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkStepUpVerificationState b(LinkStepUpVerificationState linkStepUpVerificationState, s50.a aVar, s50.a aVar2, s50.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = linkStepUpVerificationState.payload;
        }
        if ((i11 & 2) != 0) {
            aVar2 = linkStepUpVerificationState.confirmVerification;
        }
        if ((i11 & 4) != 0) {
            aVar3 = linkStepUpVerificationState.resendOtp;
        }
        return linkStepUpVerificationState.a(aVar, aVar2, aVar3);
    }

    public final LinkStepUpVerificationState a(s50.a<Payload> payload, s50.a<h0> confirmVerification, s50.a<h0> resendOtp) {
        s.k(payload, "payload");
        s.k(confirmVerification, "confirmVerification");
        s.k(resendOtp, "resendOtp");
        return new LinkStepUpVerificationState(payload, confirmVerification, resendOtp);
    }

    public final s50.a<h0> c() {
        return this.confirmVerification;
    }

    public final s50.a<Payload> d() {
        return this.payload;
    }

    public final s50.a<h0> e() {
        return this.resendOtp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkStepUpVerificationState)) {
            return false;
        }
        LinkStepUpVerificationState linkStepUpVerificationState = (LinkStepUpVerificationState) other;
        return s.f(this.payload, linkStepUpVerificationState.payload) && s.f(this.confirmVerification, linkStepUpVerificationState.confirmVerification) && s.f(this.resendOtp, linkStepUpVerificationState.resendOtp);
    }

    public final Throwable f() {
        Throwable thA = n.a(this.confirmVerification);
        return thA == null ? n.a(this.resendOtp) : thA;
    }

    public final boolean g() {
        return (this.confirmVerification instanceof s50.a.Loading) || (this.resendOtp instanceof s50.a.Loading);
    }

    public int hashCode() {
        return (((this.payload.hashCode() * 31) + this.confirmVerification.hashCode()) * 31) + this.resendOtp.hashCode();
    }

    public String toString() {
        return "LinkStepUpVerificationState(payload=" + this.payload + ", confirmVerification=" + this.confirmVerification + ", resendOtp=" + this.resendOtp + ")";
    }

    public LinkStepUpVerificationState(s50.a<Payload> payload, s50.a<h0> confirmVerification, s50.a<h0> resendOtp) {
        s.k(payload, "payload");
        s.k(confirmVerification, "confirmVerification");
        s.k(resendOtp, "resendOtp");
        this.payload = payload;
        this.confirmVerification = confirmVerification;
        this.resendOtp = resendOtp;
    }

    public /* synthetic */ LinkStepUpVerificationState(s50.a aVar, s50.a aVar2, s50.a aVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s50.a.d.f110198b : aVar, (i11 & 2) != 0 ? s50.a.d.f110198b : aVar2, (i11 & 4) != 0 ? s50.a.d.f110198b : aVar3);
    }
}
