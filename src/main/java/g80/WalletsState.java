package g80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import jn0.h0;
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: g80.n, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0080\b\u0018\u0000 '2\u00020\u0001:\u0003\u0018\u001c\u001eBI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0018\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001c\u0010\u0014R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b&\u0010%¨\u0006("}, d2 = {"Lg80/n;", "", "Lg80/n$c;", "link", "Lg80/n$b;", "googlePay", "", "buttonsEnabled", "", "dividerTextResource", "Lkotlin/Function0;", "Ljn0/h0;", "onGooglePayPressed", "onLinkPressed", "<init>", "(Lg80/n$c;Lg80/n$b;ZILwn0/a;Lwn0/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lg80/n$c;", DateTokenConverter.CONVERTER_KEY, "()Lg80/n$c;", "b", "Lg80/n$b;", "c", "()Lg80/n$b;", "Z", "()Z", "I", "e", "Lwn0/a;", "()Lwn0/a;", "f", "g", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class WalletsState {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f67636h = f30.i.BillingAddressParameters.f64108d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Link link;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final GooglePay googlePay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean buttonsEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int dividerTextResource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<h0> onGooglePayPressed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<h0> onLinkPressed;

    /* JADX INFO: renamed from: g80.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jw\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lg80/n$a;", "", "<init>", "()V", "", "isLinkAvailable", "", "linkEmail", "isGooglePayReady", "Lw70/c;", "googlePayButtonType", "buttonsEnabled", "", "paymentMethodTypes", "Lcom/stripe/android/googlepaylauncher/h$e;", "googlePayLauncherConfig", "Lkotlin/Function0;", "Ljn0/h0;", "onGooglePayPressed", "onLinkPressed", "isSetupIntent", "Lg80/n;", "a", "(Ljava/lang/Boolean;Ljava/lang/String;ZLw70/c;ZLjava/util/List;Lcom/stripe/android/googlepaylauncher/h$e;Lwn0/a;Lwn0/a;Z)Lg80/n;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: g80.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C1392a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f67643a;

            static {
                int[] iArr = new int[com.stripe.android.googlepaylauncher.h.BillingAddressConfig.b.values().length];
                try {
                    iArr[com.stripe.android.googlepaylauncher.h.BillingAddressConfig.b.Min.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.stripe.android.googlepaylauncher.h.BillingAddressConfig.b.Full.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f67643a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WalletsState a(Boolean isLinkAvailable, String linkEmail, boolean isGooglePayReady, w70.c googlePayButtonType, boolean buttonsEnabled, List<String> paymentMethodTypes, com.stripe.android.googlepaylauncher.h.Config googlePayLauncherConfig, wn0.a<h0> onGooglePayPressed, wn0.a<h0> onLinkPressed, boolean isSetupIntent) {
            f30.i.BillingAddressParameters billingAddressParameters;
            int i11;
            f30.i.BillingAddressParameters.b bVar;
            s.k(googlePayButtonType, "googlePayButtonType");
            s.k(paymentMethodTypes, "paymentMethodTypes");
            s.k(onGooglePayPressed, "onGooglePayPressed");
            s.k(onLinkPressed, "onLinkPressed");
            Link link = new Link(linkEmail);
            if (!s.f(isLinkAvailable, Boolean.TRUE)) {
                link = null;
            }
            boolean allowCreditCards = googlePayLauncherConfig != null ? googlePayLauncherConfig.getAllowCreditCards() : false;
            if (googlePayLauncherConfig != null) {
                boolean isRequired = googlePayLauncherConfig.getBillingAddressConfig().getIsRequired();
                int i12 = C1392a.f67643a[googlePayLauncherConfig.getBillingAddressConfig().getFormat().ordinal()];
                if (i12 == 1) {
                    bVar = f30.i.BillingAddressParameters.b.Min;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = f30.i.BillingAddressParameters.b.Full;
                }
                billingAddressParameters = new f30.i.BillingAddressParameters(isRequired, bVar, googlePayLauncherConfig.getBillingAddressConfig().getIsPhoneNumberRequired());
            } else {
                billingAddressParameters = null;
            }
            GooglePay googlePay = new GooglePay(googlePayButtonType, allowCreditCards, billingAddressParameters);
            if (!isGooglePayReady) {
                googlePay = null;
            }
            if (link == null && googlePay == null) {
                return null;
            }
            Object objW0 = v.W0(paymentMethodTypes);
            PaymentMethod.p pVar = PaymentMethod.p.Card;
            if (s.f(objW0, pVar.code) && !isSetupIntent) {
                i11 = x.R;
            } else if (v.W0(paymentMethodTypes) != null || isSetupIntent) {
                i11 = (s.f(v.W0(paymentMethodTypes), pVar.code) && isSetupIntent) ? x.T : x.S;
            } else {
                i11 = x.Q;
            }
            return new WalletsState(link, googlePay, buttonsEnabled, i11, onGooglePayPressed, onLinkPressed);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: g80.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lg80/n$b;", "", "Lw70/c;", "buttonType", "", "allowCreditCards", "Lf30/i$a;", "billingAddressParameters", "<init>", "(Lw70/c;ZLf30/i$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lw70/c;", "c", "()Lw70/c;", "b", "Z", "()Z", "Lf30/i$a;", "()Lf30/i$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GooglePay {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f67644d = f30.i.BillingAddressParameters.f64108d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.c buttonType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowCreditCards;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final f30.i.BillingAddressParameters billingAddressParameters;

        public GooglePay(w70.c buttonType, boolean z11, f30.i.BillingAddressParameters billingAddressParameters) {
            s.k(buttonType, "buttonType");
            this.buttonType = buttonType;
            this.allowCreditCards = z11;
            this.billingAddressParameters = billingAddressParameters;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAllowCreditCards() {
            return this.allowCreditCards;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final f30.i.BillingAddressParameters getBillingAddressParameters() {
            return this.billingAddressParameters;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final w70.c getButtonType() {
            return this.buttonType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GooglePay)) {
                return false;
            }
            GooglePay googlePay = (GooglePay) other;
            return this.buttonType == googlePay.buttonType && this.allowCreditCards == googlePay.allowCreditCards && s.f(this.billingAddressParameters, googlePay.billingAddressParameters);
        }

        public int hashCode() {
            int iHashCode = ((this.buttonType.hashCode() * 31) + Boolean.hashCode(this.allowCreditCards)) * 31;
            f30.i.BillingAddressParameters billingAddressParameters = this.billingAddressParameters;
            return iHashCode + (billingAddressParameters == null ? 0 : billingAddressParameters.hashCode());
        }

        public String toString() {
            return "GooglePay(buttonType=" + this.buttonType + ", allowCreditCards=" + this.allowCreditCards + ", billingAddressParameters=" + this.billingAddressParameters + ")";
        }
    }

    /* JADX INFO: renamed from: g80.n$c, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lg80/n$c;", "", "", Scopes.EMAIL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Link {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        public Link(String str) {
            this.email = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Link) && s.f(this.email, ((Link) other).email);
        }

        public int hashCode() {
            String str = this.email;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Link(email=" + this.email + ")";
        }
    }

    public WalletsState(Link link, GooglePay googlePay, boolean z11, int i11, wn0.a<h0> onGooglePayPressed, wn0.a<h0> onLinkPressed) {
        s.k(onGooglePayPressed, "onGooglePayPressed");
        s.k(onLinkPressed, "onLinkPressed");
        this.link = link;
        this.googlePay = googlePay;
        this.buttonsEnabled = z11;
        this.dividerTextResource = i11;
        this.onGooglePayPressed = onGooglePayPressed;
        this.onLinkPressed = onLinkPressed;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getButtonsEnabled() {
        return this.buttonsEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDividerTextResource() {
        return this.dividerTextResource;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final GooglePay getGooglePay() {
        return this.googlePay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Link getLink() {
        return this.link;
    }

    public final wn0.a<h0> e() {
        return this.onGooglePayPressed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletsState)) {
            return false;
        }
        WalletsState walletsState = (WalletsState) other;
        return s.f(this.link, walletsState.link) && s.f(this.googlePay, walletsState.googlePay) && this.buttonsEnabled == walletsState.buttonsEnabled && this.dividerTextResource == walletsState.dividerTextResource && s.f(this.onGooglePayPressed, walletsState.onGooglePayPressed) && s.f(this.onLinkPressed, walletsState.onLinkPressed);
    }

    public final wn0.a<h0> f() {
        return this.onLinkPressed;
    }

    public int hashCode() {
        Link link = this.link;
        int iHashCode = (link == null ? 0 : link.hashCode()) * 31;
        GooglePay googlePay = this.googlePay;
        return ((((((((iHashCode + (googlePay != null ? googlePay.hashCode() : 0)) * 31) + Boolean.hashCode(this.buttonsEnabled)) * 31) + Integer.hashCode(this.dividerTextResource)) * 31) + this.onGooglePayPressed.hashCode()) * 31) + this.onLinkPressed.hashCode();
    }

    public String toString() {
        return "WalletsState(link=" + this.link + ", googlePay=" + this.googlePay + ", buttonsEnabled=" + this.buttonsEnabled + ", dividerTextResource=" + this.dividerTextResource + ", onGooglePayPressed=" + this.onGooglePayPressed + ", onLinkPressed=" + this.onLinkPressed + ")";
    }
}
