package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import w70.PaymentIntentClientSecret;
import w70.SetupIntentClientSecret;

/* JADX INFO: loaded from: classes7.dex */
@jn0.e
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$a;", "Lcom/stripe/android/paymentsheet/b0;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentSheetContract$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/paymentsheet/b0;", DateTokenConverter.CONVERTER_KEY, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentSheetContract extends ActivityResultContract<Args, b0> {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetContract$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001\u0011B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0014¨\u00060"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$a;", "", "Lw70/a;", "clientSecret", "Lcom/stripe/android/paymentsheet/y$h;", "config", "", "statusBarColor", "", "injectorKey", "<init>", "(Lw70/a;Lcom/stripe/android/paymentsheet/y$h;Ljava/lang/Integer;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "c", "(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "a", "(Lw70/a;Lcom/stripe/android/paymentsheet/y$h;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheetContract$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lw70/a;", "getClientSecret$paymentsheet_release", "()Lw70/a;", "b", "Lcom/stripe/android/paymentsheet/y$h;", "getConfig$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/y$h;", "Ljava/lang/Integer;", "getStatusBarColor$paymentsheet_release", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getInjectorKey$paymentsheet_release", "e", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w70.a clientSecret;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.Configuration config;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer statusBarColor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String injectorKey;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f52326f = 8;
        public static final Parcelable.Creator<Args> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetContract$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Args createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Args((w70.a) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : y.Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(w70.a clientSecret, y.Configuration configuration, Integer num, String injectorKey) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            p013kotlin.jvm.internal.s.k(injectorKey, "injectorKey");
            this.clientSecret = clientSecret;
            this.config = configuration;
            this.statusBarColor = num;
            this.injectorKey = injectorKey;
        }

        public static /* synthetic */ Args b(Args args, w70.a aVar, y.Configuration configuration, Integer num, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar = args.clientSecret;
            }
            if ((i11 & 2) != 0) {
                configuration = args.config;
            }
            if ((i11 & 4) != 0) {
                num = args.statusBarColor;
            }
            if ((i11 & 8) != 0) {
                str = args.injectorKey;
            }
            return args.a(aVar, configuration, num, str);
        }

        public final Args a(w70.a clientSecret, y.Configuration config, Integer statusBarColor, String injectorKey) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            p013kotlin.jvm.internal.s.k(injectorKey, "injectorKey");
            return new Args(clientSecret, config, statusBarColor, injectorKey);
        }

        public final PaymentSheetContractV2.Args c(Context context) {
            y.m setupIntent;
            p013kotlin.jvm.internal.s.k(context, "context");
            w70.a aVar = this.clientSecret;
            if (aVar instanceof PaymentIntentClientSecret) {
                setupIntent = new y.m.PaymentIntent(this.clientSecret.getValue());
            } else {
                if (!(aVar instanceof SetupIntentClientSecret)) {
                    throw new NoWhenBranchMatchedException();
                }
                setupIntent = new y.m.SetupIntent(this.clientSecret.getValue());
            }
            y.Configuration configurationA = this.config;
            if (configurationA == null) {
                configurationA = y.Configuration.INSTANCE.a(context);
            }
            return new PaymentSheetContractV2.Args(setupIntent, configurationA, this.statusBarColor, false);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return p013kotlin.jvm.internal.s.f(this.clientSecret, args.clientSecret) && p013kotlin.jvm.internal.s.f(this.config, args.config) && p013kotlin.jvm.internal.s.f(this.statusBarColor, args.statusBarColor) && p013kotlin.jvm.internal.s.f(this.injectorKey, args.injectorKey);
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            y.Configuration configuration = this.config;
            int iHashCode2 = (iHashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
            Integer num = this.statusBarColor;
            return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.injectorKey.hashCode();
        }

        public String toString() {
            return "Args(clientSecret=" + this.clientSecret + ", config=" + this.config + ", statusBarColor=" + this.statusBarColor + ", injectorKey=" + this.injectorKey + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.clientSecret, flags);
            y.Configuration configuration = this.config;
            if (configuration == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                configuration.writeToParcel(parcel, flags);
            }
            Integer num = this.statusBarColor;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.injectorKey);
        }
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Args input) {
        Window window;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(input, "input");
        Integer numValueOf = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            numValueOf = Integer.valueOf(window.getStatusBarColor());
        }
        Intent intentPutExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", Args.b(input, null, null, numValueOf, null, 11, null).c(context));
        p013kotlin.jvm.internal.s.j(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 parseResult(int resultCode, Intent intent) {
        PaymentSheetContractV2.Result result;
        b0 paymentSheetResult = (intent == null || (result = (PaymentSheetContractV2.Result) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result")) == null) ? null : result.getPaymentSheetResult();
        return paymentSheetResult == null ? new b0.Failed(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult.")) : paymentSheetResult;
    }
}
