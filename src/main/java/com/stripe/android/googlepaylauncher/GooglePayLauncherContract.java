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
@jn0.e
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\n\u000f\u0012\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;", "Lcom/stripe/android/googlepaylauncher/f$h;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/googlepaylauncher/f$h;", DateTokenConverter.CONVERTER_KEY, "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayLauncherContract extends ActivityResultContract<a, f.h> {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078 X \u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8 X \u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "", "a", "()Ljava/lang/String;", "clientSecret", "Lcom/stripe/android/googlepaylauncher/f$f;", "b", "()Lcom/stripe/android/googlepaylauncher/f$f;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$c;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$d;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherContract$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;", "", "EXTRA_ARGS", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract String getClientSecret();

        /* JADX INFO: renamed from: b */
        public abstract f.Config getConfig();

        public final Bundle c() {
            return q5.d.b(x.a("extra_args", this));
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherContract$c, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\n¨\u0006!"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$c;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;", "", "clientSecret", "Lcom/stripe/android/googlepaylauncher/f$f;", "config", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/f$f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "a", "c", "Lcom/stripe/android/googlepaylauncher/f$f;", "()Lcom/stripe/android/googlepaylauncher/f$f;", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentIntentArgs extends a {
        public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final f.Config config;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String label;

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherContract$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PaymentIntentArgs> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaymentIntentArgs createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new PaymentIntentArgs(parcel.readString(), f.Config.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final PaymentIntentArgs[] newArray(int i11) {
                return new PaymentIntentArgs[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentIntentArgs(String clientSecret, f.Config config, String str) {
            super(null);
            s.k(clientSecret, "clientSecret");
            s.k(config, "config");
            this.clientSecret = clientSecret;
            this.config = config;
            this.label = str;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getClientSecret() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public f.Config getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentIntentArgs)) {
                return false;
            }
            PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) other;
            return s.f(this.clientSecret, paymentIntentArgs.clientSecret) && s.f(this.config, paymentIntentArgs.config) && s.f(this.label, paymentIntentArgs.label);
        }

        public int hashCode() {
            int iHashCode = ((this.clientSecret.hashCode() * 31) + this.config.hashCode()) * 31;
            String str = this.label;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentIntentArgs(clientSecret=" + this.clientSecret + ", config=" + this.config + ", label=" + this.label + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.clientSecret);
            this.config.writeToParcel(parcel, flags);
            parcel.writeString(this.label);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherContract$d, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b#\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b'\u0010\r¨\u0006("}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$d;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$a;", "", "clientSecret", "Lcom/stripe/android/googlepaylauncher/f$f;", "config", "currencyCode", "", "amount", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/f$f;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "a", "c", "Lcom/stripe/android/googlepaylauncher/f$f;", "()Lcom/stripe/android/googlepaylauncher/f$f;", DateTokenConverter.CONVERTER_KEY, "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetupIntentArgs extends a {
        public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final f.Config config;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currencyCode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long amount;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String label;

        /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.GooglePayLauncherContract$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SetupIntentArgs> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SetupIntentArgs createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new SetupIntentArgs(parcel.readString(), f.Config.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SetupIntentArgs[] newArray(int i11) {
                return new SetupIntentArgs[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetupIntentArgs(String clientSecret, f.Config config, String currencyCode, Long l11, String str) {
            super(null);
            s.k(clientSecret, "clientSecret");
            s.k(config, "config");
            s.k(currencyCode, "currencyCode");
            this.clientSecret = clientSecret;
            this.config = config;
            this.currencyCode = currencyCode;
            this.amount = l11;
            this.label = str;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getClientSecret() {
            return this.clientSecret;
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayLauncherContract.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public f.Config getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getAmount() {
            return this.amount;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetupIntentArgs)) {
                return false;
            }
            SetupIntentArgs setupIntentArgs = (SetupIntentArgs) other;
            return s.f(this.clientSecret, setupIntentArgs.clientSecret) && s.f(this.config, setupIntentArgs.config) && s.f(this.currencyCode, setupIntentArgs.currencyCode) && s.f(this.amount, setupIntentArgs.amount) && s.f(this.label, setupIntentArgs.label);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            int iHashCode = ((((this.clientSecret.hashCode() * 31) + this.config.hashCode()) * 31) + this.currencyCode.hashCode()) * 31;
            Long l11 = this.amount;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.label;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SetupIntentArgs(clientSecret=" + this.clientSecret + ", config=" + this.config + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", label=" + this.label + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeString(this.clientSecret);
            this.config.writeToParcel(parcel, flags);
            parcel.writeString(this.currencyCode);
            Long l11 = this.amount;
            if (l11 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l11.longValue());
            }
            parcel.writeString(this.label);
        }
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) GooglePayLauncherActivity.class).putExtras(input.c());
        s.j(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f.h parseResult(int resultCode, Intent intent) {
        f.h hVar = intent != null ? (f.h) intent.getParcelableExtra("extra_result") : null;
        return hVar == null ? new f.h.Failed(new IllegalStateException("Error while processing result from Google Pay.")) : hVar;
    }
}
