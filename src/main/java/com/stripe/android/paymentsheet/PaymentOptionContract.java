package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import g80.Full;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\n\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "Lcom/stripe/android/paymentsheet/s;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/paymentsheet/s;", DateTokenConverter.CONVERTER_KEY, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentOptionContract extends ActivityResultContract<Args, s> {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionContract$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0001\u001bB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001b\u0010(¨\u0006*"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "", "Lg80/l;", "state", "", "statusBarColor", "", "enableLogging", "", "", "productUsage", "<init>", "(Lg80/l;Ljava/lang/Integer;ZLjava/util/Set;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lg80/l;", "b", "()Lg80/l;", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "c", "Z", "getEnableLogging", "()Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "()Ljava/util/Set;", "e", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Full state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer statusBarColor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enableLogging;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> productUsage;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f52275f = 8;
        public static final Parcelable.Creator<Args> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionContract$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$a$a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/PaymentOptionContract$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args a(Intent intent) {
                p013kotlin.jvm.internal.s.k(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_activity_args");
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.PaymentOptionContract$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Args createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                Full lVarCreateFromParcel = Full.CREATOR.createFromParcel(parcel);
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                boolean z11 = parcel.readInt() != 0;
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new Args(lVarCreateFromParcel, numValueOf, z11, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Args[] newArray(int i11) {
                return new Args[i11];
            }
        }

        public Args(Full state, Integer num, boolean z11, Set<String> productUsage) {
            p013kotlin.jvm.internal.s.k(state, "state");
            p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
            this.state = state;
            this.statusBarColor = num;
            this.enableLogging = z11;
            this.productUsage = productUsage;
        }

        public final Set<String> a() {
            return this.productUsage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Full getState() {
            return this.state;
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
            return p013kotlin.jvm.internal.s.f(this.state, args.state) && p013kotlin.jvm.internal.s.f(this.statusBarColor, args.statusBarColor) && this.enableLogging == args.enableLogging && p013kotlin.jvm.internal.s.f(this.productUsage, args.productUsage);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            Integer num = this.statusBarColor;
            return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.enableLogging)) * 31) + this.productUsage.hashCode();
        }

        public String toString() {
            return "Args(state=" + this.state + ", statusBarColor=" + this.statusBarColor + ", enableLogging=" + this.enableLogging + ", productUsage=" + this.productUsage + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            int iIntValue;
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.state.writeToParcel(parcel, flags);
            Integer num = this.statusBarColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeInt(this.enableLogging ? 1 : 0);
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
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(input, "input");
        Intent intentPutExtra = new Intent(context, (Class<?>) PaymentOptionsActivity.class).putExtra("extra_activity_args", input);
        p013kotlin.jvm.internal.s.j(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public s parseResult(int resultCode, Intent intent) {
        return s.INSTANCE.a(intent);
    }
}
