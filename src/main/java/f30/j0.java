package f30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b'\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\u0014\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00048F¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lf30/j0;", "Lcom/stripe/android/model/StripeIntent;", "T", "Lt30/f;", "", "outcomeFromFlow", "<init>", "(I)V", "stripeIntent", "outcome", "a", "(Lcom/stripe/android/model/StripeIntent;I)I", "e", "(Lcom/stripe/android/model/StripeIntent;)I", "", "f", "(Lcom/stripe/android/model/StripeIntent;)Z", "I", "c", "()Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "", "b", "()Ljava/lang/String;", "failureMessage", DateTokenConverter.CONVERTER_KEY, "()I", "getOutcome$annotations", "()V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class j0<T extends StripeIntent> implements t30.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int outcomeFromFlow;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f64128b;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.RequiresAction.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.Canceled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StripeIntent.Status.Processing.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f64127a = iArr;
            int[] iArr2 = new int[StripeIntent.NextActionType.values().length];
            try {
                iArr2[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[StripeIntent.NextActionType.CashAppRedirect.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[StripeIntent.NextActionType.SwishRedirect.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[StripeIntent.NextActionType.DisplayBoletoDetails.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[StripeIntent.NextActionType.DisplayKonbiniDetails.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[StripeIntent.NextActionType.DisplayMultibancoDetails.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[StripeIntent.NextActionType.UpiAwaitNotification.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            f64128b = iArr2;
        }
    }

    public j0(int i11) {
        this.outcomeFromFlow = i11;
    }

    private final int a(StripeIntent stripeIntent, int outcome) {
        return outcome != 0 ? outcome : e(stripeIntent);
    }

    private final int e(StripeIntent stripeIntent) {
        PaymentMethod.p pVar;
        StripeIntent.Status status = stripeIntent.getStatus();
        switch (status == null ? -1 : a.f64127a[status.ordinal()]) {
            case 1:
                if (stripeIntent.getNextActionData() == null) {
                    return 2;
                }
                return f(c()) ? 1 : 3;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
                PaymentMethod paymentMethod = c().getPaymentMethod();
                return (paymentMethod == null || (pVar = paymentMethod.type) == null || !pVar.getHasDelayedSettlement()) ? 0 : 1;
            default:
                return 0;
        }
    }

    private final boolean f(StripeIntent stripeIntent) {
        StripeIntent.NextActionType nextActionTypeP0 = stripeIntent.P0();
        switch (nextActionTypeP0 == null ? -1 : a.f64128b[nextActionTypeP0.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return true;
        }
    }

    public abstract String b();

    public abstract T c();

    public final int d() {
        return a(c(), this.outcomeFromFlow);
    }
}
