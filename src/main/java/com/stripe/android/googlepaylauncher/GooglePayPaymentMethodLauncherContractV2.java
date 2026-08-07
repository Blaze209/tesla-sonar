package com.stripe.android.googlepaylauncher;

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
import jn0.x;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "Lcom/stripe/android/googlepaylauncher/h$g;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/googlepaylauncher/h$g;", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayPaymentMethodLauncherContractV2 extends ActivityResultContract<Args, h.g> {
    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Args input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) GooglePayPaymentMethodLauncherActivity.class).putExtras(input.f());
        s.j(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h.g parseResult(int resultCode, Intent intent) {
        h.g gVar = intent != null ? (h.g) intent.getParcelableExtra("extra_result") : null;
        return gVar == null ? new h.g.Failed(new IllegalArgumentException("Could not parse a valid result."), 1) : gVar;
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2$a, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0001 B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b(\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b)\u0010\u0010¨\u0006*"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "Landroid/os/Parcelable;", "Lcom/stripe/android/googlepaylauncher/h$e;", "config", "", "currencyCode", "", "amount", AnnotatedPrivateKey.LABEL, "transactionId", "<init>", "(Lcom/stripe/android/googlepaylauncher/h$e;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "f", "()Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/googlepaylauncher/h$e;", "b", "()Lcom/stripe/android/googlepaylauncher/h$e;", "Ljava/lang/String;", "c", "J", "()J", DateTokenConverter.CONVERTER_KEY, "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h.Config config;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currencyCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long amount;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String label;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String transactionId;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f50740g = 8;
        public static final Parcelable.Creator<Args> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$a;", "", "EXTRA_ARGS", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Args createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Args(h.Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(h.Config config, String currencyCode, long j11, String str, String str2) {
            s.k(config, "config");
            s.k(currencyCode, "currencyCode");
            this.config = config;
            this.currencyCode = currencyCode;
            this.amount = j11;
            this.label = str;
            this.transactionId = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final h.Config getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return s.f(this.config, args.config) && s.f(this.currencyCode, args.currencyCode) && this.amount == args.amount && s.f(this.label, args.label) && s.f(this.transactionId, args.transactionId);
        }

        public final Bundle f() {
            return q5.d.b(x.a("extra_args", this));
        }

        public int hashCode() {
            int iHashCode = ((((this.config.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + Long.hashCode(this.amount)) * 31;
            String str = this.label;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transactionId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(config=" + this.config + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", label=" + this.label + ", transactionId=" + this.transactionId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            this.config.writeToParcel(parcel, flags);
            parcel.writeString(this.currencyCode);
            parcel.writeLong(this.amount);
            parcel.writeString(this.label);
            parcel.writeString(this.transactionId);
        }

        public /* synthetic */ Args(h.Config config, String str, long j11, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(config, str, j11, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
        }
    }
}
