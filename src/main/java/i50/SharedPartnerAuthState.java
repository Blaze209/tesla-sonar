package i50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: i50.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0014\"&*BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0013JP\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0011\u0010.\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010-¨\u0006/"}, d2 = {"Li50/e;", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "Ls50/a;", "Li50/e$c;", StatusResponse.PAYLOAD, "Li50/e$d;", "viewEffect", "Li50/e$a;", "authenticationStatus", "", "inModal", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ls50/a;Li50/e$d;Ls50/a;Z)V", "Li50/b$a;", "args", "(Li50/b$a;)V", "Lr40/b$a;", "(Lr40/b$a;)V", "a", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ls50/a;Li50/e$d;Ls50/a;Z)Li50/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "Ls50/a;", "f", "()Ls50/a;", "c", "Li50/e$d;", "g", "()Li50/e$d;", DateTokenConverter.CONVERTER_KEY, "e", "Z", "()Z", "canNavigateBack", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SharedPartnerAuthState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane pane;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d viewEffect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<AuthenticationStatus> authenticationStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean inModal;

    /* JADX INFO: renamed from: i50.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Li50/e$a;", "", "Li50/e$a$a;", "action", "<init>", "(Li50/e$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/e$a$a;", "()Li50/e$a$a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuthenticationStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC1587a action;

        /* JADX INFO: renamed from: i50.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Li50/e$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CANCELLING", "AUTHENTICATING", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum EnumC1587a {
            CANCELLING,
            AUTHENTICATING;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<EnumC1587a> getEntries() {
                return $ENTRIES;
            }
        }

        public AuthenticationStatus(EnumC1587a action) {
            s.k(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC1587a getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AuthenticationStatus) && this.action == ((AuthenticationStatus) other).action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "AuthenticationStatus(action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: i50.e$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, d2 = {"Li50/e$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "DATA", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        DATA("stripe://data-access-notice");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String value;

        b(String str) {
            this.value = str;
        }

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: i50.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001d"}, d2 = {"Li50/e$c;", "", "", "isStripeDirect", "Lcom/stripe/android/financialconnections/model/q;", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "authSession", "<init>", "(ZLcom/stripe/android/financialconnections/model/q;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lcom/stripe/android/financialconnections/model/q;", "getInstitution", "()Lcom/stripe/android/financialconnections/model/q;", "c", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isStripeDirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FinancialConnectionsInstitution institution;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FinancialConnectionsAuthorizationSession authSession;

        public Payload(boolean z11, FinancialConnectionsInstitution institution, FinancialConnectionsAuthorizationSession authSession) {
            s.k(institution, "institution");
            s.k(authSession, "authSession");
            this.isStripeDirect = z11;
            this.institution = institution;
            this.authSession = authSession;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FinancialConnectionsAuthorizationSession getAuthSession() {
            return this.authSession;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return this.isStripeDirect == payload.isStripeDirect && s.f(this.institution, payload.institution) && s.f(this.authSession, payload.authSession);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isStripeDirect) * 31) + this.institution.hashCode()) * 31) + this.authSession.hashCode();
        }

        public String toString() {
            return "Payload(isStripeDirect=" + this.isStripeDirect + ", institution=" + this.institution + ", authSession=" + this.authSession + ")";
        }
    }

    /* JADX INFO: renamed from: i50.e$d */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Li50/e$d;", "", "a", "b", "Li50/e$d$a;", "Li50/e$d$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {

        /* JADX INFO: renamed from: i50.e$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Li50/e$d$a;", "Li50/e$d;", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenPartnerAuth implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            public OpenPartnerAuth(String url) {
                s.k(url, "url");
                this.url = url;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenPartnerAuth) && s.f(this.url, ((OpenPartnerAuth) other).url);
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return "OpenPartnerAuth(url=" + this.url + ")";
            }
        }

        /* JADX INFO: renamed from: i50.e$d$b, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Li50/e$d$b;", "Li50/e$d;", "", ImagesContract.URL, "", "id", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "getId", "()J", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final long id;

            public OpenUrl(String url, long j11) {
                s.k(url, "url");
                this.url = url;
                this.id = j11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenUrl)) {
                    return false;
                }
                OpenUrl openUrl = (OpenUrl) other;
                return s.f(this.url, openUrl.url) && this.id == openUrl.id;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Long.hashCode(this.id);
            }

            public String toString() {
                return "OpenUrl(url=" + this.url + ", id=" + this.id + ")";
            }
        }
    }

    public SharedPartnerAuthState(FinancialConnectionsSessionManifest.Pane pane, s50.a<Payload> payload, d dVar, s50.a<AuthenticationStatus> authenticationStatus, boolean z11) {
        s.k(pane, "pane");
        s.k(payload, "payload");
        s.k(authenticationStatus, "authenticationStatus");
        this.pane = pane;
        this.payload = payload;
        this.viewEffect = dVar;
        this.authenticationStatus = authenticationStatus;
        this.inModal = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedPartnerAuthState b(SharedPartnerAuthState sharedPartnerAuthState, FinancialConnectionsSessionManifest.Pane pane, s50.a aVar, d dVar, s50.a aVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pane = sharedPartnerAuthState.pane;
        }
        if ((i11 & 2) != 0) {
            aVar = sharedPartnerAuthState.payload;
        }
        if ((i11 & 4) != 0) {
            dVar = sharedPartnerAuthState.viewEffect;
        }
        if ((i11 & 8) != 0) {
            aVar2 = sharedPartnerAuthState.authenticationStatus;
        }
        if ((i11 & 16) != 0) {
            z11 = sharedPartnerAuthState.inModal;
        }
        boolean z12 = z11;
        d dVar2 = dVar;
        return sharedPartnerAuthState.a(pane, aVar, dVar2, aVar2, z12);
    }

    public final SharedPartnerAuthState a(FinancialConnectionsSessionManifest.Pane pane, s50.a<Payload> payload, d viewEffect, s50.a<AuthenticationStatus> authenticationStatus, boolean inModal) {
        s.k(pane, "pane");
        s.k(payload, "payload");
        s.k(authenticationStatus, "authenticationStatus");
        return new SharedPartnerAuthState(pane, payload, viewEffect, authenticationStatus, inModal);
    }

    public final s50.a<AuthenticationStatus> c() {
        return this.authenticationStatus;
    }

    public final boolean d() {
        s50.a<AuthenticationStatus> aVar = this.authenticationStatus;
        return ((aVar instanceof s50.a.Loading) || (aVar instanceof s50.a.Success) || (this.payload instanceof s50.a.Fail)) ? false : true;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getInModal() {
        return this.inModal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedPartnerAuthState)) {
            return false;
        }
        SharedPartnerAuthState sharedPartnerAuthState = (SharedPartnerAuthState) other;
        return this.pane == sharedPartnerAuthState.pane && s.f(this.payload, sharedPartnerAuthState.payload) && s.f(this.viewEffect, sharedPartnerAuthState.viewEffect) && s.f(this.authenticationStatus, sharedPartnerAuthState.authenticationStatus) && this.inModal == sharedPartnerAuthState.inModal;
    }

    public final s50.a<Payload> f() {
        return this.payload;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getViewEffect() {
        return this.viewEffect;
    }

    public int hashCode() {
        int iHashCode = ((this.pane.hashCode() * 31) + this.payload.hashCode()) * 31;
        d dVar = this.viewEffect;
        return ((((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.authenticationStatus.hashCode()) * 31) + Boolean.hashCode(this.inModal);
    }

    public String toString() {
        return "SharedPartnerAuthState(pane=" + this.pane + ", payload=" + this.payload + ", viewEffect=" + this.viewEffect + ", authenticationStatus=" + this.authenticationStatus + ", inModal=" + this.inModal + ")";
    }

    public /* synthetic */ SharedPartnerAuthState(FinancialConnectionsSessionManifest.Pane pane, s50.a aVar, d dVar, s50.a aVar2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pane, (i11 & 2) != 0 ? s50.a.d.f110198b : aVar, (i11 & 4) != 0 ? null : dVar, (i11 & 8) != 0 ? s50.a.d.f110198b : aVar2, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPartnerAuthState(i50.b.a args) {
        this(args.b(), null, null, null, args.a(), 14, null);
        s.k(args, "args");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPartnerAuthState(r40.b.Args args) {
        this(args.getPane(), null, null, null, false, 30, null);
        s.k(args, "args");
    }
}
