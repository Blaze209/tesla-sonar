package g80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lg80/j;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "type", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lg80/j$a;", "Lg80/j$b;", "Lg80/j$c;", "Lg80/j$d;", "Lg80/j$e;", "Lg80/j$f;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class j extends Throwable {

    /* JADX INFO: renamed from: g80.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b¨\u0006\u0019"}, d2 = {"Lg80/j$a;", "Lg80/j;", "Lcom/stripe/android/model/u0$e;", "confirmationMethod", "<init>", "(Lcom/stripe/android/model/u0$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/u0$e;", "b", "Ljava/lang/String;", "type", "c", "getMessage", "message", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InvalidConfirmationMethod extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentIntent.e confirmationMethod;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidConfirmationMethod(PaymentIntent.e confirmationMethod) {
            super(null);
            s.k(confirmationMethod, "confirmationMethod");
            this.confirmationMethod = confirmationMethod;
            this.type = "invalidConfirmationMethod";
            this.message = t.n("\n            PaymentIntent with confirmation_method='automatic' is required.\n            The current PaymentIntent has confirmation_method '" + confirmationMethod + "'.\n            See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n        ");
        }

        @Override // g80.j
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidConfirmationMethod) && this.confirmationMethod == ((InvalidConfirmationMethod) other).confirmationMethod;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.confirmationMethod.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidConfirmationMethod(confirmationMethod=" + this.confirmationMethod + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lg80/j$b;", "Lg80/j;", "<init>", "()V", "", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "type", "c", "getMessage", "message", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f67615a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String type = "missingAmountOrCurrency";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final String message = "PaymentIntent must contain amount and currency.";

        private b() {
            super(null);
        }

        @Override // g80.j
        /* JADX INFO: renamed from: a */
        public String getType() {
            return type;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return message;
        }
    }

    /* JADX INFO: renamed from: g80.j$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0016"}, d2 = {"Lg80/j$c;", "Lg80/j;", "", "requested", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "type", "getMessage", "message", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoPaymentMethodTypesAvailable extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requested;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoPaymentMethodTypesAvailable(String requested) {
            super(null);
            s.k(requested, "requested");
            this.requested = requested;
            this.type = "noPaymentMethodTypesAvailable";
        }

        @Override // g80.j
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoPaymentMethodTypesAvailable) && s.f(this.requested, ((NoPaymentMethodTypesAvailable) other).requested);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "None of the requested payment methods (" + this.requested + ") are supported.";
        }

        public int hashCode() {
            return this.requested.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NoPaymentMethodTypesAvailable(requested=" + this.requested + ")";
        }
    }

    /* JADX INFO: renamed from: g80.j$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lg80/j$d;", "Lg80/j;", "Lcom/stripe/android/model/StripeIntent$Status;", PermissionsResponse.STATUS_KEY, "<init>", "(Lcom/stripe/android/model/StripeIntent$Status;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/StripeIntent$Status;", "b", "Ljava/lang/String;", "type", "getMessage", "message", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentIntentInTerminalState extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StripeIntent.Status status;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String type;

        public PaymentIntentInTerminalState(StripeIntent.Status status) {
            super(null);
            this.status = status;
            this.type = "paymentIntentInTerminalState";
        }

        @Override // g80.j
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentIntentInTerminalState) && this.status == ((PaymentIntentInTerminalState) other).status;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return t.n("\n                PaymentSheet cannot set up a PaymentIntent in status '" + this.status + "'.\n                See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.status;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PaymentIntentInTerminalState(status=" + this.status + ")";
        }
    }

    /* JADX INFO: renamed from: g80.j$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\bR\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lg80/j$e;", "Lg80/j;", "Lcom/stripe/android/model/StripeIntent$Status;", PermissionsResponse.STATUS_KEY, "<init>", "(Lcom/stripe/android/model/StripeIntent$Status;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/StripeIntent$Status;", "b", "Ljava/lang/String;", "type", "getMessage", "message", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetupIntentInTerminalState extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StripeIntent.Status status;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String type;

        public SetupIntentInTerminalState(StripeIntent.Status status) {
            super(null);
            this.status = status;
            this.type = "setupIntentInTerminalState";
        }

        @Override // g80.j
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetupIntentInTerminalState) && this.status == ((SetupIntentInTerminalState) other).status;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return t.n("\n                PaymentSheet cannot set up a SetupIntent in status '" + this.status + "'.\n                See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status.\n            ");
        }

        public int hashCode() {
            StripeIntent.Status status = this.status;
            if (status == null) {
                return 0;
            }
            return status.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "SetupIntentInTerminalState(status=" + this.status + ")";
        }
    }

    /* JADX INFO: renamed from: g80.j$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u001a"}, d2 = {"Lg80/j$f;", "Lg80/j;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "b", "Ljava/lang/String;", "getMessage", "message", "type", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unknown extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(Throwable cause) {
            super(null);
            s.k(cause, "cause");
            this.cause = cause;
            this.message = getCause().getMessage();
        }

        @Override // g80.j
        /* JADX INFO: renamed from: a */
        public String getType() {
            return StripeException.INSTANCE.b(getCause()).a();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unknown) && s.f(this.cause, ((Unknown) other).cause);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unknown(cause=" + this.cause + ")";
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String getType();

    private j() {
    }
}
