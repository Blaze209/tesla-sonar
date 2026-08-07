package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "Lcom/stripe/android/payments/paymentlauncher/a;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/payments/paymentlauncher/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentLauncherContract extends ActivityResultContract<a, com.stripe.android.payments.paymentlauncher.a> {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0004\u0011\u0015\u0017\u0013BE\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0001\u0003!\"#¨\u0006$"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "Landroid/os/Parcelable;", "", "publishableKey", "stripeAccountId", "", "enableLogging", "", "productUsage", "includePaymentSheetNextHandlers", "", "statusBarColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLjava/lang/Integer;)V", "Landroid/os/Bundle;", "g", "()Landroid/os/Bundle;", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "f", "c", "Z", "()Z", "Ljava/util/Set;", "()Ljava/util/Set;", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a$b;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a$c;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a$d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements Parcelable {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f52167h = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String publishableKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String stripeAccountId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean enableLogging;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Set<String> productUsage;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean includePaymentSheetNextHandlers;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Integer statusBarColor;

        /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "", "EXTRA_ARGS", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Intent intent) {
                s.k(intent, "intent");
                return (a) intent.getParcelableExtra("extra_args");
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a$b;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "", "publishableKey", "stripeAccountId", "", "enableLogging", "", "productUsage", "includePaymentSheetNextHandlers", "Lcom/stripe/android/model/n;", "confirmStripeIntentParams", "", "statusBarColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLcom/stripe/android/model/n;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "j", "f", "k", "Z", "a", "()Z", "l", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "m", "b", "n", "Lcom/stripe/android/model/n;", "h", "()Lcom/stripe/android/model/n;", "o", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class IntentConfirmationArgs extends a {
            public static final Parcelable.Creator<IntentConfirmationArgs> CREATOR = new C0945a();

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String publishableKey;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enableLogging;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<String> productUsage;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean includePaymentSheetNextHandlers;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final n confirmStripeIntentParams;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private Integer statusBarColor;

            /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0945a implements Parcelable.Creator<IntentConfirmationArgs> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final IntentConfirmationArgs createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    boolean z11 = true;
                    if (parcel.readInt() == 0) {
                        z11 = false;
                    }
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new IntentConfirmationArgs(string, string2, z11, linkedHashSet, parcel.readInt() != 0, (n) parcel.readParcelable(IntentConfirmationArgs.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final IntentConfirmationArgs[] newArray(int i11) {
                    return new IntentConfirmationArgs[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IntentConfirmationArgs(String publishableKey, String str, boolean z11, Set<String> productUsage, boolean z12, n confirmStripeIntentParams, Integer num) {
                super(publishableKey, str, z11, productUsage, z12, num, null);
                s.k(publishableKey, "publishableKey");
                s.k(productUsage, "productUsage");
                s.k(confirmStripeIntentParams, "confirmStripeIntentParams");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z11;
                this.productUsage = productUsage;
                this.includePaymentSheetNextHandlers = z12;
                this.confirmStripeIntentParams = confirmStripeIntentParams;
                this.statusBarColor = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set<String> c() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof IntentConfirmationArgs)) {
                    return false;
                }
                IntentConfirmationArgs intentConfirmationArgs = (IntentConfirmationArgs) other;
                return s.f(this.publishableKey, intentConfirmationArgs.publishableKey) && s.f(this.stripeAccountId, intentConfirmationArgs.stripeAccountId) && this.enableLogging == intentConfirmationArgs.enableLogging && s.f(this.productUsage, intentConfirmationArgs.productUsage) && this.includePaymentSheetNextHandlers == intentConfirmationArgs.includePaymentSheetNextHandlers && s.f(this.confirmStripeIntentParams, intentConfirmationArgs.confirmStripeIntentParams) && s.f(this.statusBarColor, intentConfirmationArgs.statusBarColor);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: f, reason: from getter */
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final n getConfirmStripeIntentParams() {
                return this.confirmStripeIntentParams;
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.productUsage.hashCode()) * 31) + Boolean.hashCode(this.includePaymentSheetNextHandlers)) * 31) + this.confirmStripeIntentParams.hashCode()) * 31;
                Integer num = this.statusBarColor;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "IntentConfirmationArgs(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", enableLogging=" + this.enableLogging + ", productUsage=" + this.productUsage + ", includePaymentSheetNextHandlers=" + this.includePaymentSheetNextHandlers + ", confirmStripeIntentParams=" + this.confirmStripeIntentParams + ", statusBarColor=" + this.statusBarColor + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                s.k(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeParcelable(this.confirmStripeIntentParams, flags);
                Integer num = this.statusBarColor;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0010R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a$c;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "", "publishableKey", "stripeAccountId", "", "enableLogging", "", "productUsage", "includePaymentSheetNextHandlers", "paymentIntentClientSecret", "", "statusBarColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLjava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "j", "f", "k", "Z", "a", "()Z", "l", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "m", "b", "n", "h", "o", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentIntentNextActionArgs extends a {
            public static final Parcelable.Creator<PaymentIntentNextActionArgs> CREATOR = new C0946a();

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String publishableKey;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enableLogging;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<String> productUsage;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean includePaymentSheetNextHandlers;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final String paymentIntentClientSecret;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private Integer statusBarColor;

            /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0946a implements Parcelable.Creator<PaymentIntentNextActionArgs> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaymentIntentNextActionArgs createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    boolean z11 = true;
                    if (parcel.readInt() == 0) {
                        z11 = false;
                    }
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new PaymentIntentNextActionArgs(string, string2, z11, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PaymentIntentNextActionArgs[] newArray(int i11) {
                    return new PaymentIntentNextActionArgs[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntentNextActionArgs(String publishableKey, String str, boolean z11, Set<String> productUsage, boolean z12, String paymentIntentClientSecret, Integer num) {
                super(publishableKey, str, z11, productUsage, z12, num, null);
                s.k(publishableKey, "publishableKey");
                s.k(productUsage, "productUsage");
                s.k(paymentIntentClientSecret, "paymentIntentClientSecret");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z11;
                this.productUsage = productUsage;
                this.includePaymentSheetNextHandlers = z12;
                this.paymentIntentClientSecret = paymentIntentClientSecret;
                this.statusBarColor = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set<String> c() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentIntentNextActionArgs)) {
                    return false;
                }
                PaymentIntentNextActionArgs paymentIntentNextActionArgs = (PaymentIntentNextActionArgs) other;
                return s.f(this.publishableKey, paymentIntentNextActionArgs.publishableKey) && s.f(this.stripeAccountId, paymentIntentNextActionArgs.stripeAccountId) && this.enableLogging == paymentIntentNextActionArgs.enableLogging && s.f(this.productUsage, paymentIntentNextActionArgs.productUsage) && this.includePaymentSheetNextHandlers == paymentIntentNextActionArgs.includePaymentSheetNextHandlers && s.f(this.paymentIntentClientSecret, paymentIntentNextActionArgs.paymentIntentClientSecret) && s.f(this.statusBarColor, paymentIntentNextActionArgs.statusBarColor);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: f, reason: from getter */
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getPaymentIntentClientSecret() {
                return this.paymentIntentClientSecret;
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.productUsage.hashCode()) * 31) + Boolean.hashCode(this.includePaymentSheetNextHandlers)) * 31) + this.paymentIntentClientSecret.hashCode()) * 31;
                Integer num = this.statusBarColor;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "PaymentIntentNextActionArgs(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", enableLogging=" + this.enableLogging + ", productUsage=" + this.productUsage + ", includePaymentSheetNextHandlers=" + this.includePaymentSheetNextHandlers + ", paymentIntentClientSecret=" + this.paymentIntentClientSecret + ", statusBarColor=" + this.statusBarColor + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                s.k(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeString(this.paymentIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u0010R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a$d;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "", "publishableKey", "stripeAccountId", "", "enableLogging", "", "productUsage", "includePaymentSheetNextHandlers", "setupIntentClientSecret", "", "statusBarColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;ZLjava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "j", "f", "k", "Z", "a", "()Z", "l", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "m", "b", "n", "h", "o", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "setStatusBarColor", "(Ljava/lang/Integer;)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetupIntentNextActionArgs extends a {
            public static final Parcelable.Creator<SetupIntentNextActionArgs> CREATOR = new C0947a();

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String publishableKey;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean enableLogging;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final Set<String> productUsage;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean includePaymentSheetNextHandlers;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final String setupIntentClientSecret;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private Integer statusBarColor;

            /* JADX INFO: renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherContract$a$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0947a implements Parcelable.Creator<SetupIntentNextActionArgs> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SetupIntentNextActionArgs createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    boolean z11 = true;
                    if (parcel.readInt() == 0) {
                        z11 = false;
                    }
                    int i11 = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new SetupIntentNextActionArgs(string, string2, z11, linkedHashSet, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SetupIntentNextActionArgs[] newArray(int i11) {
                    return new SetupIntentNextActionArgs[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntentNextActionArgs(String publishableKey, String str, boolean z11, Set<String> productUsage, boolean z12, String setupIntentClientSecret, Integer num) {
                super(publishableKey, str, z11, productUsage, z12, num, null);
                s.k(publishableKey, "publishableKey");
                s.k(productUsage, "productUsage");
                s.k(setupIntentClientSecret, "setupIntentClientSecret");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.enableLogging = z11;
                this.productUsage = productUsage;
                this.includePaymentSheetNextHandlers = z12;
                this.setupIntentClientSecret = setupIntentClientSecret;
                this.statusBarColor = num;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getEnableLogging() {
                return this.enableLogging;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIncludePaymentSheetNextHandlers() {
                return this.includePaymentSheetNextHandlers;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            public Set<String> c() {
                return this.productUsage;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public Integer getStatusBarColor() {
                return this.statusBarColor;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetupIntentNextActionArgs)) {
                    return false;
                }
                SetupIntentNextActionArgs setupIntentNextActionArgs = (SetupIntentNextActionArgs) other;
                return s.f(this.publishableKey, setupIntentNextActionArgs.publishableKey) && s.f(this.stripeAccountId, setupIntentNextActionArgs.stripeAccountId) && this.enableLogging == setupIntentNextActionArgs.enableLogging && s.f(this.productUsage, setupIntentNextActionArgs.productUsage) && this.includePaymentSheetNextHandlers == setupIntentNextActionArgs.includePaymentSheetNextHandlers && s.f(this.setupIntentClientSecret, setupIntentNextActionArgs.setupIntentClientSecret) && s.f(this.statusBarColor, setupIntentNextActionArgs.statusBarColor);
            }

            @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncherContract.a
            /* JADX INFO: renamed from: f, reason: from getter */
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getSetupIntentClientSecret() {
                return this.setupIntentClientSecret;
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.productUsage.hashCode()) * 31) + Boolean.hashCode(this.includePaymentSheetNextHandlers)) * 31) + this.setupIntentClientSecret.hashCode()) * 31;
                Integer num = this.statusBarColor;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            public String toString() {
                return "SetupIntentNextActionArgs(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", enableLogging=" + this.enableLogging + ", productUsage=" + this.productUsage + ", includePaymentSheetNextHandlers=" + this.includePaymentSheetNextHandlers + ", setupIntentClientSecret=" + this.setupIntentClientSecret + ", statusBarColor=" + this.statusBarColor + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                s.k(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeInt(this.enableLogging ? 1 : 0);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
                parcel.writeInt(this.includePaymentSheetNextHandlers ? 1 : 0);
                parcel.writeString(this.setupIntentClientSecret);
                Integer num = this.statusBarColor;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
            }
        }

        public /* synthetic */ a(String str, String str2, boolean z11, Set set, boolean z12, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z11, set, z12, num);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getEnableLogging() {
            return this.enableLogging;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIncludePaymentSheetNextHandlers() {
            return this.includePaymentSheetNextHandlers;
        }

        public Set<String> c() {
            return this.productUsage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public String getPublishableKey() {
            return this.publishableKey;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public String getStripeAccountId() {
            return this.stripeAccountId;
        }

        public final Bundle g() {
            return q5.d.b(x.a("extra_args", this));
        }

        private a(String str, String str2, boolean z11, Set<String> set, boolean z12, Integer num) {
            this.publishableKey = str;
            this.stripeAccountId = str2;
            this.enableLogging = z11;
            this.productUsage = set;
            this.includePaymentSheetNextHandlers = z12;
            this.statusBarColor = num;
        }
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) PaymentLauncherConfirmationActivity.class).putExtras(input.g());
        s.j(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.payments.paymentlauncher.a parseResult(int resultCode, Intent intent) {
        return com.stripe.android.payments.paymentlauncher.a.INSTANCE.a(intent);
    }
}
