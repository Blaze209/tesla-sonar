package q70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.core.exception.StripeException;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\b\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lq70/b;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "analyticsValue", "b", "errorCode", "c", DateTokenConverter.CONVERTER_KEY, "Lq70/b$a;", "Lq70/b$b;", "Lq70/b$c;", "Lq70/b$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b extends Throwable {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, d2 = {"Lq70/b$a;", "Lq70/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "errorCode", "a", "analyticsValue", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f104882a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String errorCode = null;

        private a() {
            super(null);
        }

        @Override // q70.b
        public String a() {
            return "externalPaymentMethodError";
        }

        @Override // q70.b
        /* JADX INFO: renamed from: b */
        public String getErrorCode() {
            return errorCode;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return -1706746466;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ExternalPaymentMethod";
        }
    }

    /* JADX INFO: renamed from: q70.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0017"}, d2 = {"Lq70/b$b;", "Lq70/b;", "", "errorCodeInt", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getErrorCodeInt", "b", "Ljava/lang/String;", "errorCode", "analyticsValue", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GooglePay extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int errorCodeInt;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String errorCode;

        public GooglePay(int i11) {
            super(null);
            this.errorCodeInt = i11;
            this.errorCode = String.valueOf(i11);
        }

        @Override // q70.b
        public String a() {
            return "googlePay_" + getErrorCode();
        }

        @Override // q70.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getErrorCode() {
            return this.errorCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GooglePay) && this.errorCodeInt == ((GooglePay) other).errorCodeInt;
        }

        public int hashCode() {
            return Integer.hashCode(this.errorCodeInt);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GooglePay(errorCodeInt=" + this.errorCodeInt + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lq70/b$c;", "Lq70/b;", "<init>", "()V", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "errorCode", "a", "analyticsValue", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f104886a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final String errorCode = null;

        private c() {
            super(null);
        }

        @Override // q70.b
        public String a() {
            return "invalidState";
        }

        @Override // q70.b
        /* JADX INFO: renamed from: b */
        public String getErrorCode() {
            return errorCode;
        }
    }

    /* JADX INFO: renamed from: q70.b$d, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u001c\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006\u001d"}, d2 = {"Lq70/b$d;", "Lq70/b;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "Lcom/stripe/android/core/exception/StripeException;", "b", "Lcom/stripe/android/core/exception/StripeException;", "stripeException", "c", "Ljava/lang/String;", "errorCode", "analyticsValue", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stripe extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StripeException stripeException;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String errorCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Stripe(Throwable cause) {
            super(0 == true ? 1 : 0);
            s.k(cause, "cause");
            this.cause = cause;
            StripeException stripeExceptionB = StripeException.INSTANCE.b(getCause());
            this.stripeException = stripeExceptionB;
            StripeError stripeError = stripeExceptionB.getStripeError();
            this.errorCode = stripeError != null ? stripeError.getCode() : null;
        }

        @Override // q70.b
        public String a() {
            return this.stripeException.a();
        }

        @Override // q70.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getErrorCode() {
            return this.errorCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stripe) && s.f(this.cause, ((Stripe) other).cause);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Stripe(cause=" + this.cause + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    /* JADX INFO: renamed from: b */
    public abstract String getErrorCode();

    private b() {
    }
}
