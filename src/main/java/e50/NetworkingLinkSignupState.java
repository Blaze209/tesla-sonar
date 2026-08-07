package e50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.model.ConsumerSessionLookup;
import java.util.List;
import p010i90.q0;
import p010i90.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import s50.FinancialConnectionsSheetNativeState;

/* JADX INFO: renamed from: e50.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0015\"%Be\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014Jn\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b,\u0010/R\u0011\u00102\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u00104\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u00103¨\u00065"}, d2 = {"Le50/h;", "", "Ls50/a;", "Le50/h$b;", StatusResponse.PAYLOAD, "", "validEmail", "validPhone", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "saveAccountToLink", "Lcom/stripe/android/model/u;", "lookupAccount", "Le50/h$c;", "viewEffect", "", "isInstantDebits", "<init>", "(Ls50/a;Ljava/lang/String;Ljava/lang/String;Ls50/a;Ls50/a;Le50/h$c;Z)V", "Ls50/c;", "parentState", "(Ls50/c;)V", "a", "(Ls50/a;Ljava/lang/String;Ljava/lang/String;Ls50/a;Ls50/a;Le50/h$c;Z)Le50/h;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ls50/a;", "e", "()Ls50/a;", "b", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "c", "j", DateTokenConverter.CONVERTER_KEY, "f", "Le50/h$c;", "k", "()Le50/h$c;", "g", "Z", "l", "()Z", "showFullForm", "h", "valid", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class NetworkingLinkSignupState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<Payload> payload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String validEmail;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String validPhone;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<FinancialConnectionsSessionManifest.Pane> saveAccountToLink;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final s50.a<ConsumerSessionLookup> lookupAccount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final c viewEffect;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInstantDebits;

    /* JADX INFO: renamed from: e50.h$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b!\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b \u0010#¨\u0006$"}, d2 = {"Le50/h$a;", "", "", "title", "message", "", "Lcom/stripe/android/financialconnections/model/e;", "bullets", "aboveCta", "cta", "skipCta", "Lcom/stripe/android/financialconnections/model/u;", "legalDetailsNotice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "e", "c", "Ljava/util/List;", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "f", "Lcom/stripe/android/financialconnections/model/u;", "()Lcom/stripe/android/financialconnections/model/u;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Bullet> bullets;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String aboveCta;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cta;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String skipCta;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final LegalDetailsNotice legalDetailsNotice;

        public Content(String title, String str, List<Bullet> bullets, String aboveCta, String cta, String str2, LegalDetailsNotice legalDetailsNotice) {
            s.k(title, "title");
            s.k(bullets, "bullets");
            s.k(aboveCta, "aboveCta");
            s.k(cta, "cta");
            this.title = title;
            this.message = str;
            this.bullets = bullets;
            this.aboveCta = aboveCta;
            this.cta = cta;
            this.skipCta = str2;
            this.legalDetailsNotice = legalDetailsNotice;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAboveCta() {
            return this.aboveCta;
        }

        public final List<Bullet> b() {
            return this.bullets;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LegalDetailsNotice getLegalDetailsNotice() {
            return this.legalDetailsNotice;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return s.f(this.title, content.title) && s.f(this.message, content.message) && s.f(this.bullets, content.bullets) && s.f(this.aboveCta, content.aboveCta) && s.f(this.cta, content.cta) && s.f(this.skipCta, content.skipCta) && s.f(this.legalDetailsNotice, content.legalDetailsNotice);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSkipCta() {
            return this.skipCta;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.message;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.bullets.hashCode()) * 31) + this.aboveCta.hashCode()) * 31) + this.cta.hashCode()) * 31;
            String str2 = this.skipCta;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
            return iHashCode3 + (legalDetailsNotice != null ? legalDetailsNotice.hashCode() : 0);
        }

        public String toString() {
            return "Content(title=" + this.title + ", message=" + this.message + ", bullets=" + this.bullets + ", aboveCta=" + this.aboveCta + ", cta=" + this.cta + ", skipCta=" + this.skipCta + ", legalDetailsNotice=" + this.legalDetailsNotice + ")";
        }
    }

    /* JADX INFO: renamed from: e50.h$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\t\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0016\u0010$R\u0011\u0010%\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010!¨\u0006&"}, d2 = {"Le50/h$b;", "", "", "merchantName", "Li90/r1;", "emailController", "Li90/q0;", "phoneController", "", "isInstantDebits", "Le50/h$a;", "content", "<init>", "(Ljava/lang/String;Li90/r1;Li90/q0;ZLe50/h$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMerchantName", "b", "Li90/r1;", "()Li90/r1;", "c", "Li90/q0;", DateTokenConverter.CONVERTER_KEY, "()Li90/q0;", "Z", "()Z", "e", "Le50/h$a;", "()Le50/h$a;", "focusEmailField", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String merchantName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final r1 emailController;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q0 phoneController;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isInstantDebits;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Content content;

        public Payload(String str, r1 emailController, q0 phoneController, boolean z11, Content content) {
            s.k(emailController, "emailController");
            s.k(phoneController, "phoneController");
            s.k(content, "content");
            this.merchantName = str;
            this.emailController = emailController;
            this.phoneController = phoneController;
            this.isInstantDebits = z11;
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Content getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final r1 getEmailController() {
            return this.emailController;
        }

        public final boolean c() {
            if (!this.isInstantDebits) {
                return false;
            }
            String initialValue = this.emailController.getInitialValue();
            return initialValue == null || t.y0(initialValue);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final q0 getPhoneController() {
            return this.phoneController;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return s.f(this.merchantName, payload.merchantName) && s.f(this.emailController, payload.emailController) && s.f(this.phoneController, payload.phoneController) && this.isInstantDebits == payload.isInstantDebits && s.f(this.content, payload.content);
        }

        public int hashCode() {
            String str = this.merchantName;
            return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.emailController.hashCode()) * 31) + this.phoneController.hashCode()) * 31) + Boolean.hashCode(this.isInstantDebits)) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "Payload(merchantName=" + this.merchantName + ", emailController=" + this.emailController + ", phoneController=" + this.phoneController + ", isInstantDebits=" + this.isInstantDebits + ", content=" + this.content + ")";
        }
    }

    /* JADX INFO: renamed from: e50.h$c */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Le50/h$c;", "", "<init>", "()V", "a", "Le50/h$c$a;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: e50.h$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Le50/h$c$a;", "Le50/h$c;", "", ImagesContract.URL, "", "id", "<init>", "(Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "getId", "()J", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends c {

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

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public NetworkingLinkSignupState() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkingLinkSignupState b(NetworkingLinkSignupState networkingLinkSignupState, s50.a aVar, String str, String str2, s50.a aVar2, s50.a aVar3, c cVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = networkingLinkSignupState.payload;
        }
        if ((i11 & 2) != 0) {
            str = networkingLinkSignupState.validEmail;
        }
        if ((i11 & 4) != 0) {
            str2 = networkingLinkSignupState.validPhone;
        }
        if ((i11 & 8) != 0) {
            aVar2 = networkingLinkSignupState.saveAccountToLink;
        }
        if ((i11 & 16) != 0) {
            aVar3 = networkingLinkSignupState.lookupAccount;
        }
        if ((i11 & 32) != 0) {
            cVar = networkingLinkSignupState.viewEffect;
        }
        if ((i11 & 64) != 0) {
            z11 = networkingLinkSignupState.isInstantDebits;
        }
        c cVar2 = cVar;
        boolean z12 = z11;
        s50.a aVar4 = aVar3;
        String str3 = str2;
        return networkingLinkSignupState.a(aVar, str, str3, aVar2, aVar4, cVar2, z12);
    }

    public final NetworkingLinkSignupState a(s50.a<Payload> payload, String validEmail, String validPhone, s50.a<? extends FinancialConnectionsSessionManifest.Pane> saveAccountToLink, s50.a<ConsumerSessionLookup> lookupAccount, c viewEffect, boolean isInstantDebits) {
        s.k(payload, "payload");
        s.k(saveAccountToLink, "saveAccountToLink");
        s.k(lookupAccount, "lookupAccount");
        return new NetworkingLinkSignupState(payload, validEmail, validPhone, saveAccountToLink, lookupAccount, viewEffect, isInstantDebits);
    }

    public final s50.a<ConsumerSessionLookup> c() {
        return this.lookupAccount;
    }

    public final FinancialConnectionsSessionManifest.Pane d() {
        return this.isInstantDebits ? FinancialConnectionsSessionManifest.Pane.LINK_LOGIN : FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE;
    }

    public final s50.a<Payload> e() {
        return this.payload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingLinkSignupState)) {
            return false;
        }
        NetworkingLinkSignupState networkingLinkSignupState = (NetworkingLinkSignupState) other;
        return s.f(this.payload, networkingLinkSignupState.payload) && s.f(this.validEmail, networkingLinkSignupState.validEmail) && s.f(this.validPhone, networkingLinkSignupState.validPhone) && s.f(this.saveAccountToLink, networkingLinkSignupState.saveAccountToLink) && s.f(this.lookupAccount, networkingLinkSignupState.lookupAccount) && s.f(this.viewEffect, networkingLinkSignupState.viewEffect) && this.isInstantDebits == networkingLinkSignupState.isInstantDebits;
    }

    public final s50.a<FinancialConnectionsSessionManifest.Pane> f() {
        return this.saveAccountToLink;
    }

    public final boolean g() {
        ConsumerSessionLookup consumerSessionLookupA = this.lookupAccount.a();
        if (consumerSessionLookupA != null) {
            return !consumerSessionLookupA.getExists();
        }
        return false;
    }

    public final boolean h() {
        ConsumerSessionLookup consumerSessionLookupA = this.lookupAccount.a();
        return this.validEmail != null && ((consumerSessionLookupA != null && consumerSessionLookupA.getExists()) || this.validPhone != null);
    }

    public int hashCode() {
        int iHashCode = this.payload.hashCode() * 31;
        String str = this.validEmail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.validPhone;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.saveAccountToLink.hashCode()) * 31) + this.lookupAccount.hashCode()) * 31;
        c cVar = this.viewEffect;
        return ((iHashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInstantDebits);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getValidEmail() {
        return this.validEmail;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getValidPhone() {
        return this.validPhone;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final c getViewEffect() {
        return this.viewEffect;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsInstantDebits() {
        return this.isInstantDebits;
    }

    public String toString() {
        return "NetworkingLinkSignupState(payload=" + this.payload + ", validEmail=" + this.validEmail + ", validPhone=" + this.validPhone + ", saveAccountToLink=" + this.saveAccountToLink + ", lookupAccount=" + this.lookupAccount + ", viewEffect=" + this.viewEffect + ", isInstantDebits=" + this.isInstantDebits + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkingLinkSignupState(s50.a<Payload> payload, String str, String str2, s50.a<? extends FinancialConnectionsSessionManifest.Pane> saveAccountToLink, s50.a<ConsumerSessionLookup> lookupAccount, c cVar, boolean z11) {
        s.k(payload, "payload");
        s.k(saveAccountToLink, "saveAccountToLink");
        s.k(lookupAccount, "lookupAccount");
        this.payload = payload;
        this.validEmail = str;
        this.validPhone = str2;
        this.saveAccountToLink = saveAccountToLink;
        this.lookupAccount = lookupAccount;
        this.viewEffect = cVar;
        this.isInstantDebits = z11;
    }

    public /* synthetic */ NetworkingLinkSignupState(s50.a aVar, String str, String str2, s50.a aVar2, s50.a aVar3, c cVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s50.a.d.f110198b : aVar, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? s50.a.d.f110198b : aVar2, (i11 & 16) != 0 ? s50.a.d.f110198b : aVar3, (i11 & 32) != 0 ? null : cVar, (i11 & 64) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkingLinkSignupState(FinancialConnectionsSheetNativeState parentState) {
        this(null, null, null, null, null, null, parentState.getIsLinkWithStripe(), 63, null);
        s.k(parentState, "parentState");
    }
}
