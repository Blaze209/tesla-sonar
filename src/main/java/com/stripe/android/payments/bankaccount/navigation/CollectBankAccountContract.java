package com.stripe.android.payments.bankaccount.navigation;

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
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\n\u000f\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/payments/bankaccount/navigation/e;", DateTokenConverter.CONVERTER_KEY, "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CollectBankAccountContract extends ActivityResultContract<a, e> {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001a2\u00020\u0001:\u0005\r\u0011\u0013\u000f\u0012B?\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\r\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\u0082\u0001\u0004\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "Landroid/os/Parcelable;", "", "publishableKey", "stripeAccountId", "clientSecret", "Lb70/a;", "configuration", "", "attachToIntent", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb70/a;ZLjava/lang/String;)V", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "e", "c", "p", "Lb70/a;", "()Lb70/a;", "Z", "()Z", "f", "g", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a$b;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a$c;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a$d;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a$e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements Parcelable {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f51960h = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String publishableKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String stripeAccountId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String clientSecret;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b70.a configuration;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean attachToIntent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String hostedSurface;

        /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Intent intent) {
                s.k(intent, "intent");
                return (a) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args");
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b \u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010\u0011¨\u00066"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a$b;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "", "publishableKey", "stripeAccountId", "Lb70/a;", "configuration", "hostedSurface", "elementsSessionId", "customerId", "onBehalfOf", "", "amount", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb70/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "j", "e", "k", "Lb70/a;", "b", "()Lb70/a;", "l", "c", "m", "h", "n", "g", "o", "p", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "q", "getCurrency", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ForDeferredPaymentIntent extends a {
            public static final Parcelable.Creator<ForDeferredPaymentIntent> CREATOR = new C0928a();

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String publishableKey;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final b70.a configuration;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hostedSurface;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final String elementsSessionId;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final String customerId;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final String onBehalfOf;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer amount;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            private final String currency;

            /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$b$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0928a implements Parcelable.Creator<ForDeferredPaymentIntent> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ForDeferredPaymentIntent createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new ForDeferredPaymentIntent(parcel.readString(), parcel.readString(), (b70.a) parcel.readParcelable(ForDeferredPaymentIntent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ForDeferredPaymentIntent[] newArray(int i11) {
                    return new ForDeferredPaymentIntent[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForDeferredPaymentIntent(String publishableKey, String str, b70.a configuration, String str2, String elementsSessionId, String str3, String str4, Integer num, String str5) {
                super(publishableKey, str, null, configuration, false, str2, null);
                s.k(publishableKey, "publishableKey");
                s.k(configuration, "configuration");
                s.k(elementsSessionId, "elementsSessionId");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.configuration = configuration;
                this.hostedSurface = str2;
                this.elementsSessionId = elementsSessionId;
                this.customerId = str3;
                this.onBehalfOf = str4;
                this.amount = num;
                this.currency = str5;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public b70.a getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ForDeferredPaymentIntent)) {
                    return false;
                }
                ForDeferredPaymentIntent forDeferredPaymentIntent = (ForDeferredPaymentIntent) other;
                return s.f(this.publishableKey, forDeferredPaymentIntent.publishableKey) && s.f(this.stripeAccountId, forDeferredPaymentIntent.stripeAccountId) && s.f(this.configuration, forDeferredPaymentIntent.configuration) && s.f(this.hostedSurface, forDeferredPaymentIntent.hostedSurface) && s.f(this.elementsSessionId, forDeferredPaymentIntent.elementsSessionId) && s.f(this.customerId, forDeferredPaymentIntent.customerId) && s.f(this.onBehalfOf, forDeferredPaymentIntent.onBehalfOf) && s.f(this.amount, forDeferredPaymentIntent.amount) && s.f(this.currency, forDeferredPaymentIntent.currency);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Integer getAmount() {
                return this.amount;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getCustomerId() {
                return this.customerId;
            }

            public final String getCurrency() {
                return this.currency;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getElementsSessionId() {
                return this.elementsSessionId;
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.configuration.hashCode()) * 31;
                String str2 = this.hostedSurface;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.elementsSessionId.hashCode()) * 31;
                String str3 = this.customerId;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.onBehalfOf;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num = this.amount;
                int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                String str5 = this.currency;
                return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public String toString() {
                return "ForDeferredPaymentIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", configuration=" + this.configuration + ", hostedSurface=" + this.hostedSurface + ", elementsSessionId=" + this.elementsSessionId + ", customerId=" + this.customerId + ", onBehalfOf=" + this.onBehalfOf + ", amount=" + this.amount + ", currency=" + this.currency + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                s.k(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeParcelable(this.configuration, flags);
                parcel.writeString(this.hostedSurface);
                parcel.writeString(this.elementsSessionId);
                parcel.writeString(this.customerId);
                parcel.writeString(this.onBehalfOf);
                Integer num = this.amount;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
                parcel.writeString(this.currency);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010\u000e¨\u0006/"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a$c;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "", "publishableKey", "stripeAccountId", "Lb70/a;", "configuration", "hostedSurface", "elementsSessionId", "customerId", "onBehalfOf", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb70/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "j", "e", "k", "Lb70/a;", "b", "()Lb70/a;", "l", "c", "m", "g", "n", "f", "o", "h", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ForDeferredSetupIntent extends a {
            public static final Parcelable.Creator<ForDeferredSetupIntent> CREATOR = new C0929a();

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String publishableKey;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final b70.a configuration;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hostedSurface;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final String elementsSessionId;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final String customerId;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final String onBehalfOf;

            /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0929a implements Parcelable.Creator<ForDeferredSetupIntent> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ForDeferredSetupIntent createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new ForDeferredSetupIntent(parcel.readString(), parcel.readString(), (b70.a) parcel.readParcelable(ForDeferredSetupIntent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ForDeferredSetupIntent[] newArray(int i11) {
                    return new ForDeferredSetupIntent[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForDeferredSetupIntent(String publishableKey, String str, b70.a configuration, String str2, String elementsSessionId, String str3, String str4) {
                super(publishableKey, str, null, configuration, false, str2, null);
                s.k(publishableKey, "publishableKey");
                s.k(configuration, "configuration");
                s.k(elementsSessionId, "elementsSessionId");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.configuration = configuration;
                this.hostedSurface = str2;
                this.elementsSessionId = elementsSessionId;
                this.customerId = str3;
                this.onBehalfOf = str4;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public b70.a getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ForDeferredSetupIntent)) {
                    return false;
                }
                ForDeferredSetupIntent forDeferredSetupIntent = (ForDeferredSetupIntent) other;
                return s.f(this.publishableKey, forDeferredSetupIntent.publishableKey) && s.f(this.stripeAccountId, forDeferredSetupIntent.stripeAccountId) && s.f(this.configuration, forDeferredSetupIntent.configuration) && s.f(this.hostedSurface, forDeferredSetupIntent.hostedSurface) && s.f(this.elementsSessionId, forDeferredSetupIntent.elementsSessionId) && s.f(this.customerId, forDeferredSetupIntent.customerId) && s.f(this.onBehalfOf, forDeferredSetupIntent.onBehalfOf);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getCustomerId() {
                return this.customerId;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getElementsSessionId() {
                return this.elementsSessionId;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getOnBehalfOf() {
                return this.onBehalfOf;
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.configuration.hashCode()) * 31;
                String str2 = this.hostedSurface;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.elementsSessionId.hashCode()) * 31;
                String str3 = this.customerId;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.onBehalfOf;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "ForDeferredSetupIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", configuration=" + this.configuration + ", hostedSurface=" + this.hostedSurface + ", elementsSessionId=" + this.elementsSessionId + ", customerId=" + this.customerId + ", onBehalfOf=" + this.onBehalfOf + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeParcelable(this.configuration, flags);
                parcel.writeString(this.hostedSurface);
                parcel.writeString(this.elementsSessionId);
                parcel.writeString(this.customerId);
                parcel.writeString(this.onBehalfOf);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010\u000e¨\u0006."}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a$d;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "", "publishableKey", "stripeAccountId", "clientSecret", "Lb70/a;", "configuration", "", "attachToIntent", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb70/a;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "j", "e", "k", "p", "l", "Lb70/a;", "b", "()Lb70/a;", "m", "Z", "a", "()Z", "n", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ForPaymentIntent extends a {
            public static final Parcelable.Creator<ForPaymentIntent> CREATOR = new C0930a();

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String publishableKey;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final String clientSecret;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final b70.a configuration;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean attachToIntent;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hostedSurface;

            /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0930a implements Parcelable.Creator<ForPaymentIntent> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ForPaymentIntent createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new ForPaymentIntent(parcel.readString(), parcel.readString(), parcel.readString(), (b70.a) parcel.readParcelable(ForPaymentIntent.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ForPaymentIntent[] newArray(int i11) {
                    return new ForPaymentIntent[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForPaymentIntent(String publishableKey, String str, String clientSecret, b70.a configuration, boolean z11, String str2) {
                super(publishableKey, str, clientSecret, configuration, z11, str2, null);
                s.k(publishableKey, "publishableKey");
                s.k(clientSecret, "clientSecret");
                s.k(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z11;
                this.hostedSurface = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public b70.a getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ForPaymentIntent)) {
                    return false;
                }
                ForPaymentIntent forPaymentIntent = (ForPaymentIntent) other;
                return s.f(this.publishableKey, forPaymentIntent.publishableKey) && s.f(this.stripeAccountId, forPaymentIntent.stripeAccountId) && s.f(this.clientSecret, forPaymentIntent.clientSecret) && s.f(this.configuration, forPaymentIntent.configuration) && this.attachToIntent == forPaymentIntent.attachToIntent && s.f(this.hostedSurface, forPaymentIntent.hostedSurface);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.clientSecret.hashCode()) * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.attachToIntent)) * 31;
                String str2 = this.hostedSurface;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: p, reason: from getter */
            public String getClientSecret() {
                return this.clientSecret;
            }

            public String toString() {
                return "ForPaymentIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", clientSecret=" + this.clientSecret + ", configuration=" + this.configuration + ", attachToIntent=" + this.attachToIntent + ", hostedSurface=" + this.hostedSurface + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeString(this.clientSecret);
                parcel.writeParcelable(this.configuration, flags);
                parcel.writeInt(this.attachToIntent ? 1 : 0);
                parcel.writeString(this.hostedSurface);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$e, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b-\u0010\u000e¨\u0006."}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a$e;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "", "publishableKey", "stripeAccountId", "clientSecret", "Lb70/a;", "configuration", "", "attachToIntent", "hostedSurface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb70/a;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "j", "e", "k", "p", "l", "Lb70/a;", "b", "()Lb70/a;", "m", "Z", "a", "()Z", "n", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ForSetupIntent extends a {
            public static final Parcelable.Creator<ForSetupIntent> CREATOR = new C0931a();

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String publishableKey;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final String clientSecret;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final b70.a configuration;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean attachToIntent;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final String hostedSurface;

            /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a$e$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0931a implements Parcelable.Creator<ForSetupIntent> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ForSetupIntent createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new ForSetupIntent(parcel.readString(), parcel.readString(), parcel.readString(), (b70.a) parcel.readParcelable(ForSetupIntent.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ForSetupIntent[] newArray(int i11) {
                    return new ForSetupIntent[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ForSetupIntent(String publishableKey, String str, String clientSecret, b70.a configuration, boolean z11, String str2) {
                super(publishableKey, str, clientSecret, configuration, z11, str2, null);
                s.k(publishableKey, "publishableKey");
                s.k(clientSecret, "clientSecret");
                s.k(configuration, "configuration");
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.clientSecret = clientSecret;
                this.configuration = configuration;
                this.attachToIntent = z11;
                this.hostedSurface = str2;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public boolean getAttachToIntent() {
                return this.attachToIntent;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public b70.a getConfiguration() {
                return this.configuration;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public String getHostedSurface() {
                return this.hostedSurface;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getPublishableKey() {
                return this.publishableKey;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: e, reason: from getter */
            public String getStripeAccountId() {
                return this.stripeAccountId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ForSetupIntent)) {
                    return false;
                }
                ForSetupIntent forSetupIntent = (ForSetupIntent) other;
                return s.f(this.publishableKey, forSetupIntent.publishableKey) && s.f(this.stripeAccountId, forSetupIntent.stripeAccountId) && s.f(this.clientSecret, forSetupIntent.clientSecret) && s.f(this.configuration, forSetupIntent.configuration) && this.attachToIntent == forSetupIntent.attachToIntent && s.f(this.hostedSurface, forSetupIntent.hostedSurface);
            }

            public int hashCode() {
                int iHashCode = this.publishableKey.hashCode() * 31;
                String str = this.stripeAccountId;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.clientSecret.hashCode()) * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.attachToIntent)) * 31;
                String str2 = this.hostedSurface;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.a
            /* JADX INFO: renamed from: p, reason: from getter */
            public String getClientSecret() {
                return this.clientSecret;
            }

            public String toString() {
                return "ForSetupIntent(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ", clientSecret=" + this.clientSecret + ", configuration=" + this.configuration + ", attachToIntent=" + this.attachToIntent + ", hostedSurface=" + this.hostedSurface + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                parcel.writeString(this.publishableKey);
                parcel.writeString(this.stripeAccountId);
                parcel.writeString(this.clientSecret);
                parcel.writeParcelable(this.configuration, flags);
                parcel.writeInt(this.attachToIntent ? 1 : 0);
                parcel.writeString(this.hostedSurface);
            }
        }

        public /* synthetic */ a(String str, String str2, String str3, b70.a aVar, boolean z11, String str4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, aVar, z11, str4);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getAttachToIntent() {
            return this.attachToIntent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public b70.a getConfiguration() {
            return this.configuration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getHostedSurface() {
            return this.hostedSurface;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public String getPublishableKey() {
            return this.publishableKey;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public String getStripeAccountId() {
            return this.stripeAccountId;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public String getClientSecret() {
            return this.clientSecret;
        }

        private a(String str, String str2, String str3, b70.a aVar, boolean z11, String str4) {
            this.publishableKey = str;
            this.stripeAccountId = str2;
            this.clientSecret = str3;
            this.configuration = aVar;
            this.attachToIntent = z11;
            this.hostedSurface = str4;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$c, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$c;", "Landroid/os/Parcelable;", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "collectBankAccountResult", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/e;)V", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "()Lcom/stripe/android/payments/bankaccount/navigation/e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e collectBankAccountResult;

        /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Result createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Result((e) parcel.readParcelable(Result.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Result[] newArray(int i11) {
                return new Result[i11];
            }
        }

        public Result(e collectBankAccountResult) {
            s.k(collectBankAccountResult, "collectBankAccountResult");
            this.collectBankAccountResult = collectBankAccountResult;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getCollectBankAccountResult() {
            return this.collectBankAccountResult;
        }

        public final Bundle b() {
            return q5.d.b(x.a("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result", this));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && s.f(this.collectBankAccountResult, ((Result) other).collectBankAccountResult);
        }

        public int hashCode() {
            return this.collectBankAccountResult.hashCode();
        }

        public String toString() {
            return "Result(collectBankAccountResult=" + this.collectBankAccountResult + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.collectBankAccountResult, flags);
        }
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) CollectBankAccountActivity.class).putExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args", input);
        s.j(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e parseResult(int resultCode, Intent intent) {
        Result result;
        e collectBankAccountResult = (intent == null || (result = (Result) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result")) == null) ? null : result.getCollectBankAccountResult();
        return collectBankAccountResult == null ? new e.Failed(new IllegalArgumentException("Failed to retrieve a CollectBankAccountResult.")) : collectBankAccountResult;
    }
}
