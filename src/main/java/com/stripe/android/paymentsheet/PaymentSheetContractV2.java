package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\n\u000f\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContractV2;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "Lcom/stripe/android/paymentsheet/b0;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/paymentsheet/b0;", DateTokenConverter.CONVERTER_KEY, "c", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentSheetContractV2 extends ActivityResultContract<Args, b0> {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetContractV2$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010)¨\u0006+"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lcom/stripe/android/paymentsheet/y$h;", "config", "", "statusBarColor", "", "initializedViaCompose", "<init>", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/paymentsheet/y$h;Ljava/lang/Integer;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$m;", "c", "()Lcom/stripe/android/paymentsheet/y$m;", "b", "Lcom/stripe/android/paymentsheet/y$h;", "()Lcom/stripe/android/paymentsheet/y$h;", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "Lcom/stripe/android/paymentsheet/y$l;", "()Lcom/stripe/android/paymentsheet/y$l;", "googlePayConfig", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.m initializationMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.Configuration config;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer statusBarColor;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean initializedViaCompose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f52333f = 8;
        public static final Parcelable.Creator<Args> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetContractV2$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args a(Intent intent) {
                p013kotlin.jvm.internal.s.k(intent, "intent");
                return (Args) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args");
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetContractV2$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Args createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Args((y.m) parcel.readParcelable(Args.class.getClassLoader()), y.Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(y.m initializationMode, y.Configuration config, Integer num, boolean z11) {
            p013kotlin.jvm.internal.s.k(initializationMode, "initializationMode");
            p013kotlin.jvm.internal.s.k(config, "config");
            this.initializationMode = initializationMode;
            this.config = config;
            this.statusBarColor = num;
            this.initializedViaCompose = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final y.Configuration getConfig() {
            return this.config;
        }

        public final y.GooglePayConfiguration b() {
            return this.config.getGooglePay();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final y.m getInitializationMode() {
            return this.initializationMode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getInitializedViaCompose() {
            return this.initializedViaCompose;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return p013kotlin.jvm.internal.s.f(this.initializationMode, args.initializationMode) && p013kotlin.jvm.internal.s.f(this.config, args.config) && p013kotlin.jvm.internal.s.f(this.statusBarColor, args.statusBarColor) && this.initializedViaCompose == args.initializedViaCompose;
        }

        public int hashCode() {
            int iHashCode = ((this.initializationMode.hashCode() * 31) + this.config.hashCode()) * 31;
            Integer num = this.statusBarColor;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.initializedViaCompose);
        }

        public String toString() {
            return "Args(initializationMode=" + this.initializationMode + ", config=" + this.config + ", statusBarColor=" + this.statusBarColor + ", initializedViaCompose=" + this.initializedViaCompose + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int iIntValue;
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.initializationMode, flags);
            this.config.writeToParcel(parcel, flags);
            Integer num = this.statusBarColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeInt(this.initializedViaCompose ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetContractV2$c, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContractV2$c;", "", "Lcom/stripe/android/paymentsheet/b0;", "paymentSheetResult", "<init>", "(Lcom/stripe/android/paymentsheet/b0;)V", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/b0;", "()Lcom/stripe/android/paymentsheet/b0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 paymentSheetResult;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentSheetContractV2$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Result createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Result((b0) parcel.readParcelable(Result.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Result[] newArray(int i11) {
                return new Result[i11];
            }
        }

        public Result(b0 paymentSheetResult) {
            p013kotlin.jvm.internal.s.k(paymentSheetResult, "paymentSheetResult");
            this.paymentSheetResult = paymentSheetResult;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getPaymentSheetResult() {
            return this.paymentSheetResult;
        }

        public Bundle b() {
            return q5.d.b(jn0.x.a("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && p013kotlin.jvm.internal.s.f(this.paymentSheetResult, ((Result) other).paymentSheetResult);
        }

        public int hashCode() {
            return this.paymentSheetResult.hashCode();
        }

        public String toString() {
            return "Result(paymentSheetResult=" + this.paymentSheetResult + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeParcelable(this.paymentSheetResult, flags);
        }
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Args input) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) PaymentSheetActivity.class).putExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_args", input);
        p013kotlin.jvm.internal.s.j(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 parseResult(int resultCode, Intent intent) {
        Result result;
        b0 paymentSheetResult = (intent == null || (result = (Result) intent.getParcelableExtra("com.stripe.android.paymentsheet.PaymentSheetContract.extra_result")) == null) ? null : result.getPaymentSheetResult();
        return paymentSheetResult == null ? new b0.Failed(new IllegalArgumentException("Failed to retrieve a PaymentSheetResult.")) : paymentSheetResult;
    }
}
