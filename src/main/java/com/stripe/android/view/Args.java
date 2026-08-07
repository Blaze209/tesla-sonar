package com.stripe.android.view;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.PaymentMethod;
import f30.PaymentConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.view.d2, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001$By\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b$\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b,\u0010-R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b.\u00103R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b'\u00109R\u001a\u0010\u0011\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b7\u0010-R\u001a\u0010\u0012\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b:\u0010-R\u001a\u0010\u0013\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b*\u0010-¨\u0006<"}, d2 = {"Lcom/stripe/android/view/d2;", "", "", "initialPaymentMethodId", "", "paymentMethodsFooterLayoutId", "addPaymentMethodFooterLayoutId", "", "isPaymentSessionActive", "", "Lcom/stripe/android/model/v0$p;", "paymentMethodTypes", "Lf30/o;", "paymentConfiguration", "windowFlags", "Lcom/stripe/android/view/t;", "billingAddressFields", "shouldShowGooglePay", "useGooglePay", "canDeletePaymentMethods", "<init>", "(Ljava/lang/String;IIZLjava/util/List;Lf30/o;Ljava/lang/Integer;Lcom/stripe/android/view/t;ZZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "I", "g", "c", "Z", "k", "()Z", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lf30/o;", "()Lf30/o;", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "h", "Lcom/stripe/android/view/t;", "()Lcom/stripe/android/view/t;", IntegerTokenConverter.CONVERTER_KEY, "l", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Args implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String initialPaymentMethodId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int paymentMethodsFooterLayoutId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int addPaymentMethodFooterLayoutId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPaymentSessionActive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PaymentMethod.p> paymentMethodTypes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentConfiguration paymentConfiguration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer windowFlags;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final t billingAddressFields;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowGooglePay;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useGooglePay;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canDeletePaymentMethods;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f54842m = 8;
    public static final Parcelable.Creator<Args> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.view.d2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/d2$a;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/view/d2;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/view/d2;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Args a(Intent intent) {
            p013kotlin.jvm.internal.s.k(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
            if (parcelableExtra != null) {
                return (Args) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.view.d2$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Args> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Args createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            boolean z11 = true;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(PaymentMethod.p.CREATOR.createFromParcel(parcel));
            }
            return new Args(string, i11, i12, z11, arrayList, parcel.readInt() == 0 ? null : PaymentConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, t.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? z11 : false, parcel.readInt() != 0 ? z11 : false);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Args[] newArray(int i11) {
            return new Args[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Args(String str, int i11, int i12, boolean z11, List<? extends PaymentMethod.p> paymentMethodTypes, PaymentConfiguration paymentConfiguration, Integer num, t billingAddressFields, boolean z12, boolean z13, boolean z14) {
        p013kotlin.jvm.internal.s.k(paymentMethodTypes, "paymentMethodTypes");
        p013kotlin.jvm.internal.s.k(billingAddressFields, "billingAddressFields");
        this.initialPaymentMethodId = str;
        this.paymentMethodsFooterLayoutId = i11;
        this.addPaymentMethodFooterLayoutId = i12;
        this.isPaymentSessionActive = z11;
        this.paymentMethodTypes = paymentMethodTypes;
        this.paymentConfiguration = paymentConfiguration;
        this.windowFlags = num;
        this.billingAddressFields = billingAddressFields;
        this.shouldShowGooglePay = z12;
        this.useGooglePay = z13;
        this.canDeletePaymentMethods = z14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAddPaymentMethodFooterLayoutId() {
        return this.addPaymentMethodFooterLayoutId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t getBillingAddressFields() {
        return this.billingAddressFields;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCanDeletePaymentMethods() {
        return this.canDeletePaymentMethods;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInitialPaymentMethodId() {
        return this.initialPaymentMethodId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final PaymentConfiguration getPaymentConfiguration() {
        return this.paymentConfiguration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Args)) {
            return false;
        }
        Args args = (Args) other;
        return p013kotlin.jvm.internal.s.f(this.initialPaymentMethodId, args.initialPaymentMethodId) && this.paymentMethodsFooterLayoutId == args.paymentMethodsFooterLayoutId && this.addPaymentMethodFooterLayoutId == args.addPaymentMethodFooterLayoutId && this.isPaymentSessionActive == args.isPaymentSessionActive && p013kotlin.jvm.internal.s.f(this.paymentMethodTypes, args.paymentMethodTypes) && p013kotlin.jvm.internal.s.f(this.paymentConfiguration, args.paymentConfiguration) && p013kotlin.jvm.internal.s.f(this.windowFlags, args.windowFlags) && this.billingAddressFields == args.billingAddressFields && this.shouldShowGooglePay == args.shouldShowGooglePay && this.useGooglePay == args.useGooglePay && this.canDeletePaymentMethods == args.canDeletePaymentMethods;
    }

    public final List<PaymentMethod.p> f() {
        return this.paymentMethodTypes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getPaymentMethodsFooterLayoutId() {
        return this.paymentMethodsFooterLayoutId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShouldShowGooglePay() {
        return this.shouldShowGooglePay;
    }

    public int hashCode() {
        String str = this.initialPaymentMethodId;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.paymentMethodsFooterLayoutId)) * 31) + Integer.hashCode(this.addPaymentMethodFooterLayoutId)) * 31) + Boolean.hashCode(this.isPaymentSessionActive)) * 31) + this.paymentMethodTypes.hashCode()) * 31;
        PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
        int iHashCode2 = (iHashCode + (paymentConfiguration == null ? 0 : paymentConfiguration.hashCode())) * 31;
        Integer num = this.windowFlags;
        return ((((((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.billingAddressFields.hashCode()) * 31) + Boolean.hashCode(this.shouldShowGooglePay)) * 31) + Boolean.hashCode(this.useGooglePay)) * 31) + Boolean.hashCode(this.canDeletePaymentMethods);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getUseGooglePay() {
        return this.useGooglePay;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getWindowFlags() {
        return this.windowFlags;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsPaymentSessionActive() {
        return this.isPaymentSessionActive;
    }

    public String toString() {
        return "Args(initialPaymentMethodId=" + this.initialPaymentMethodId + ", paymentMethodsFooterLayoutId=" + this.paymentMethodsFooterLayoutId + ", addPaymentMethodFooterLayoutId=" + this.addPaymentMethodFooterLayoutId + ", isPaymentSessionActive=" + this.isPaymentSessionActive + ", paymentMethodTypes=" + this.paymentMethodTypes + ", paymentConfiguration=" + this.paymentConfiguration + ", windowFlags=" + this.windowFlags + ", billingAddressFields=" + this.billingAddressFields + ", shouldShowGooglePay=" + this.shouldShowGooglePay + ", useGooglePay=" + this.useGooglePay + ", canDeletePaymentMethods=" + this.canDeletePaymentMethods + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.initialPaymentMethodId);
        parcel.writeInt(this.paymentMethodsFooterLayoutId);
        parcel.writeInt(this.addPaymentMethodFooterLayoutId);
        parcel.writeInt(this.isPaymentSessionActive ? 1 : 0);
        List<PaymentMethod.p> list = this.paymentMethodTypes;
        parcel.writeInt(list.size());
        Iterator<PaymentMethod.p> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        PaymentConfiguration paymentConfiguration = this.paymentConfiguration;
        if (paymentConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentConfiguration.writeToParcel(parcel, flags);
        }
        Integer num = this.windowFlags;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.billingAddressFields.name());
        parcel.writeInt(this.shouldShowGooglePay ? 1 : 0);
        parcel.writeInt(this.useGooglePay ? 1 : 0);
        parcel.writeInt(this.canDeletePaymentMethods ? 1 : 0);
    }
}
