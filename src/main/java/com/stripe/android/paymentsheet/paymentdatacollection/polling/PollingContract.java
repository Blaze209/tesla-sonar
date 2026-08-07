package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import a70.Unvalidated;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import q5.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;", "La70/c;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)La70/c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PollingContract extends ActivityResultContract<Args, Unvalidated> {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0001\u001cB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b#\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u001c\u0010\u000f¨\u0006)"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;", "Landroid/os/Parcelable;", "", "clientSecret", "", "statusBarColor", "timeLimitInSeconds", "initialDelayInSeconds", "maxAttempts", "ctaText", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;IIII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "p", "b", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "c", "I", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer statusBarColor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int timeLimitInSeconds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int initialDelayInSeconds;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int maxAttempts;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int ctaText;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Args> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Args createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(String clientSecret, Integer num, int i11, int i12, int i13, int i14) {
            s.k(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.statusBarColor = num;
            this.timeLimitInSeconds = i11;
            this.initialDelayInSeconds = i12;
            this.maxAttempts = i13;
            this.ctaText = i14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCtaText() {
            return this.ctaText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getInitialDelayInSeconds() {
            return this.initialDelayInSeconds;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTimeLimitInSeconds() {
            return this.timeLimitInSeconds;
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
            return s.f(this.clientSecret, args.clientSecret) && s.f(this.statusBarColor, args.statusBarColor) && this.timeLimitInSeconds == args.timeLimitInSeconds && this.initialDelayInSeconds == args.initialDelayInSeconds && this.maxAttempts == args.maxAttempts && this.ctaText == args.ctaText;
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            Integer num = this.statusBarColor;
            return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.timeLimitInSeconds)) * 31) + Integer.hashCode(this.initialDelayInSeconds)) * 31) + Integer.hashCode(this.maxAttempts)) * 31) + Integer.hashCode(this.ctaText);
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        public String toString() {
            return "Args(clientSecret=" + this.clientSecret + ", statusBarColor=" + this.statusBarColor + ", timeLimitInSeconds=" + this.timeLimitInSeconds + ", initialDelayInSeconds=" + this.initialDelayInSeconds + ", maxAttempts=" + this.maxAttempts + ", ctaText=" + this.ctaText + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int iIntValue;
            s.k(parcel, "out");
            parcel.writeString(this.clientSecret);
            Integer num = this.statusBarColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeInt(this.timeLimitInSeconds);
            parcel.writeInt(this.initialDelayInSeconds);
            parcel.writeInt(this.maxAttempts);
            parcel.writeInt(this.ctaText);
        }
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Args input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) PollingActivity.class).putExtras(d.b(x.a("extra_args", input)));
        s.j(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Unvalidated parseResult(int resultCode, Intent intent) {
        return Unvalidated.INSTANCE.b(intent);
    }
}
