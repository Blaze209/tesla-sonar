package t40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: t40.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u000e\u001cBC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b \u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lt40/c;", "", "Ls50/a;", "Lt40/c$a;", "consent", "", "", "merchantLogos", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "acceptConsent", "Lt40/c$b;", "viewEffect", "<init>", "(Ls50/a;Ljava/util/List;Ls50/a;Lt40/c$b;)V", "a", "(Ls50/a;Ljava/util/List;Ls50/a;Lt40/c$b;)Lt40/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ls50/a;", DateTokenConverter.CONVERTER_KEY, "()Ls50/a;", "b", "Ljava/util/List;", "getMerchantLogos", "()Ljava/util/List;", "c", "Lt40/c$b;", "e", "()Lt40/c$b;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ConsentState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> consent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> merchantLogos;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<FinancialConnectionsSessionManifest> acceptConsent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b viewEffect;

    /* JADX INFO: renamed from: t40.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lt40/c$a;", "", "Lcom/stripe/android/financialconnections/model/h;", "consent", "", "", "merchantLogos", "", "shouldShowMerchantLogos", "showAnimatedDots", "<init>", "(Lcom/stripe/android/financialconnections/model/h;Ljava/util/List;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/financialconnections/model/h;", "()Lcom/stripe/android/financialconnections/model/h;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ConsentPane consent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> merchantLogos;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowMerchantLogos;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showAnimatedDots;

        public Payload(ConsentPane consent, List<String> merchantLogos, boolean z11, boolean z12) {
            s.k(consent, "consent");
            s.k(merchantLogos, "merchantLogos");
            this.consent = consent;
            this.merchantLogos = merchantLogos;
            this.shouldShowMerchantLogos = z11;
            this.showAnimatedDots = z12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConsentPane getConsent() {
            return this.consent;
        }

        public final List<String> b() {
            return this.merchantLogos;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShouldShowMerchantLogos() {
            return this.shouldShowMerchantLogos;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowAnimatedDots() {
            return this.showAnimatedDots;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return s.f(this.consent, payload.consent) && s.f(this.merchantLogos, payload.merchantLogos) && this.shouldShowMerchantLogos == payload.shouldShowMerchantLogos && this.showAnimatedDots == payload.showAnimatedDots;
        }

        public int hashCode() {
            return (((((this.consent.hashCode() * 31) + this.merchantLogos.hashCode()) * 31) + Boolean.hashCode(this.shouldShowMerchantLogos)) * 31) + Boolean.hashCode(this.showAnimatedDots);
        }

        public String toString() {
            return "Payload(consent=" + this.consent + ", merchantLogos=" + this.merchantLogos + ", shouldShowMerchantLogos=" + this.shouldShowMerchantLogos + ", showAnimatedDots=" + this.showAnimatedDots + ")";
        }
    }

    /* JADX INFO: renamed from: t40.c$b */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lt40/c$b;", "", "<init>", "()V", "a", "Lt40/c$b$a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: t40.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lt40/c$b$a;", "Lt40/c$b;", "", ImagesContract.URL, "", "id", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "getId", "()J", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final long id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenUrl(String url, long j11) {
                super(null);
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

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public ConsentState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsentState b(ConsentState consentState, s50.a aVar, List list, s50.a aVar2, b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = consentState.consent;
        }
        if ((i11 & 2) != 0) {
            list = consentState.merchantLogos;
        }
        if ((i11 & 4) != 0) {
            aVar2 = consentState.acceptConsent;
        }
        if ((i11 & 8) != 0) {
            bVar = consentState.viewEffect;
        }
        return consentState.a(aVar, list, aVar2, bVar);
    }

    public final ConsentState a(s50.a<Payload> consent, List<String> merchantLogos, s50.a<FinancialConnectionsSessionManifest> acceptConsent, b viewEffect) {
        s.k(consent, "consent");
        s.k(merchantLogos, "merchantLogos");
        s.k(acceptConsent, "acceptConsent");
        return new ConsentState(consent, merchantLogos, acceptConsent, viewEffect);
    }

    public final s50.a<FinancialConnectionsSessionManifest> c() {
        return this.acceptConsent;
    }

    public final s50.a<Payload> d() {
        return this.consent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getViewEffect() {
        return this.viewEffect;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentState)) {
            return false;
        }
        ConsentState consentState = (ConsentState) other;
        return s.f(this.consent, consentState.consent) && s.f(this.merchantLogos, consentState.merchantLogos) && s.f(this.acceptConsent, consentState.acceptConsent) && s.f(this.viewEffect, consentState.viewEffect);
    }

    public int hashCode() {
        int iHashCode = ((((this.consent.hashCode() * 31) + this.merchantLogos.hashCode()) * 31) + this.acceptConsent.hashCode()) * 31;
        b bVar = this.viewEffect;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "ConsentState(consent=" + this.consent + ", merchantLogos=" + this.merchantLogos + ", acceptConsent=" + this.acceptConsent + ", viewEffect=" + this.viewEffect + ")";
    }

    public ConsentState(s50.a<Payload> consent, List<String> merchantLogos, s50.a<FinancialConnectionsSessionManifest> acceptConsent, b bVar) {
        s.k(consent, "consent");
        s.k(merchantLogos, "merchantLogos");
        s.k(acceptConsent, "acceptConsent");
        this.consent = consent;
        this.merchantLogos = merchantLogos;
        this.acceptConsent = acceptConsent;
        this.viewEffect = bVar;
    }

    public /* synthetic */ ConsentState(s50.a aVar, List list, s50.a aVar2, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s50.a.d.f110198b : aVar, (i11 & 2) != 0 ? v.m() : list, (i11 & 4) != 0 ? s50.a.d.f110198b : aVar2, (i11 & 8) != 0 ? null : bVar);
    }
}
