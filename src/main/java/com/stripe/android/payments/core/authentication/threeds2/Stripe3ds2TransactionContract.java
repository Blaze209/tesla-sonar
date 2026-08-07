package com.stripe.android.payments.core.authentication.threeds2;

import a70.Unvalidated;
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
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import f30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import t80.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "La70/c;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)La70/c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Stripe3ds2TransactionContract extends ActivityResultContract<Args, Unvalidated> {

    /* JADX INFO: renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a, reason: from toString */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u0001(BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b,\u0010<R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b*\u0010@\u001a\u0004\b:\u0010\u001aR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0006¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\b6\u0010BR\u0011\u0010E\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\b/\u0010D¨\u0006F"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "Landroid/os/Parcelable;", "Lt80/q;", "sdkTransactionId", "Lf30/l$d;", "config", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent$a$j$b;", "nextActionData", "Lw30/l$c;", "requestOptions", "", "enableLogging", "", "statusBarColor", "", "publishableKey", "", "productUsage", "<init>", "(Lt80/q;Lf30/l$d;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/StripeIntent$a$j$b;Lw30/l$c;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/Set;)V", "Landroid/os/Bundle;", "k", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lt80/q;", "h", "()Lt80/q;", "b", "Lf30/l$d;", "()Lf30/l$d;", "c", "Lcom/stripe/android/model/StripeIntent;", "j", "()Lcom/stripe/android/model/StripeIntent;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/StripeIntent$a$j$b;", "()Lcom/stripe/android/model/StripeIntent$a$j$b;", "e", "Lw30/l$c;", "g", "()Lw30/l$c;", "f", "Z", "()Z", "Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "Ljava/lang/String;", "Ljava/util/Set;", "()Ljava/util/Set;", "Lcom/stripe/android/model/m1;", "()Lcom/stripe/android/model/m1;", "fingerprint", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q sdkTransactionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.Stripe3ds2Config config;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final StripeIntent stripeIntent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final StripeIntent.a.j.Use3DS2 nextActionData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final w30.l.Options requestOptions;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enableLogging;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer statusBarColor;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String publishableKey;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> productUsage;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f52093k = 8;
        public static final Parcelable.Creator<Args> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$a;", "", "EXTRA_ARGS", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args a(Intent intent) {
                s.k(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_args");
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Args createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                q qVar = (q) parcel.readParcelable(Args.class.getClassLoader());
                l.Stripe3ds2Config dVarCreateFromParcel = l.Stripe3ds2Config.CREATOR.createFromParcel(parcel);
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Args.class.getClassLoader());
                StripeIntent.a.j.Use3DS2 bVarCreateFromParcel = StripeIntent.a.j.Use3DS2.CREATOR.createFromParcel(parcel);
                w30.l.Options cVar = (w30.l.Options) parcel.readParcelable(Args.class.getClassLoader());
                boolean z11 = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string = parcel.readString();
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(qVar, dVarCreateFromParcel, stripeIntent, bVarCreateFromParcel, cVar, z11, numValueOf, string, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(q sdkTransactionId, l.Stripe3ds2Config config, StripeIntent stripeIntent, StripeIntent.a.j.Use3DS2 nextActionData, w30.l.Options requestOptions, boolean z11, Integer num, String publishableKey, Set<String> productUsage) {
            s.k(sdkTransactionId, "sdkTransactionId");
            s.k(config, "config");
            s.k(stripeIntent, "stripeIntent");
            s.k(nextActionData, "nextActionData");
            s.k(requestOptions, "requestOptions");
            s.k(publishableKey, "publishableKey");
            s.k(productUsage, "productUsage");
            this.sdkTransactionId = sdkTransactionId;
            this.config = config;
            this.stripeIntent = stripeIntent;
            this.nextActionData = nextActionData;
            this.requestOptions = requestOptions;
            this.enableLogging = z11;
            this.statusBarColor = num;
            this.publishableKey = publishableKey;
            this.productUsage = productUsage;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final l.Stripe3ds2Config getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final Stripe3ds2Fingerprint c() {
            return new Stripe3ds2Fingerprint(this.nextActionData);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final StripeIntent.a.j.Use3DS2 getNextActionData() {
            return this.nextActionData;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Set<String> e() {
            return this.productUsage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return s.f(this.sdkTransactionId, args.sdkTransactionId) && s.f(this.config, args.config) && s.f(this.stripeIntent, args.stripeIntent) && s.f(this.nextActionData, args.nextActionData) && s.f(this.requestOptions, args.requestOptions) && this.enableLogging == args.enableLogging && s.f(this.statusBarColor, args.statusBarColor) && s.f(this.publishableKey, args.publishableKey) && s.f(this.productUsage, args.productUsage);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPublishableKey() {
            return this.publishableKey;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final w30.l.Options getRequestOptions() {
            return this.requestOptions;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final q getSdkTransactionId() {
            return this.sdkTransactionId;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.sdkTransactionId.hashCode() * 31) + this.config.hashCode()) * 31) + this.stripeIntent.hashCode()) * 31) + this.nextActionData.hashCode()) * 31) + this.requestOptions.hashCode()) * 31) + Boolean.hashCode(this.enableLogging)) * 31;
            Integer num = this.statusBarColor;
            return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.publishableKey.hashCode()) * 31) + this.productUsage.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        public final Bundle k() {
            return q5.d.b(x.a("extra_args", this));
        }

        public String toString() {
            return "Args(sdkTransactionId=" + this.sdkTransactionId + ", config=" + this.config + ", stripeIntent=" + this.stripeIntent + ", nextActionData=" + this.nextActionData + ", requestOptions=" + this.requestOptions + ", enableLogging=" + this.enableLogging + ", statusBarColor=" + this.statusBarColor + ", publishableKey=" + this.publishableKey + ", productUsage=" + this.productUsage + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int iIntValue;
            s.k(parcel, "out");
            parcel.writeParcelable(this.sdkTransactionId, flags);
            this.config.writeToParcel(parcel, flags);
            parcel.writeParcelable(this.stripeIntent, flags);
            this.nextActionData.writeToParcel(parcel, flags);
            parcel.writeParcelable(this.requestOptions, flags);
            parcel.writeInt(this.enableLogging ? 1 : 0);
            Integer num = this.statusBarColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.publishableKey);
            Set<String> set = this.productUsage;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        }
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Args input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) Stripe3ds2TransactionActivity.class).putExtras(input.k());
        s.j(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Unvalidated parseResult(int resultCode, Intent intent) {
        return Unvalidated.INSTANCE.b(intent);
    }
}
