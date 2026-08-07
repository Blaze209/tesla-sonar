package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.stripe.android.model.g0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/stripe/android/model/g0;", "Lt30/f;", "Lcom/stripe/android/model/g0$b;", "mode", "", "", "paymentMethodTypes", "paymentMethodConfigurationId", "onBehalfOf", "<init>", "(Lcom/stripe/android/model/g0$b;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "", "c", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/g0$b;", "()Lcom/stripe/android/model/g0$b;", "b", "Ljava/util/List;", "t", "()Ljava/util/List;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "getOnBehalfOf", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DeferredIntentParams implements t30.f {
    public static final Parcelable.Creator<DeferredIntentParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> paymentMethodTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodConfigurationId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String onBehalfOf;

    /* JADX INFO: renamed from: com.stripe.android.model.g0$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeferredIntentParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeferredIntentParams createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new DeferredIntentParams((b) parcel.readParcelable(DeferredIntentParams.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DeferredIntentParams[] newArray(int i11) {
            return new DeferredIntentParams[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.g0$b */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\f\rR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/g0$b;", "Landroid/os/Parcelable;", "", "getCode", "()Ljava/lang/String;", "code", "getCurrency", "currency", "Lcom/stripe/android/model/StripeIntent$Usage;", "n0", "()Lcom/stripe/android/model/StripeIntent$Usage;", "setupFutureUsage", "a", "b", "Lcom/stripe/android/model/g0$b$a;", "Lcom/stripe/android/model/g0$b$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends Parcelable {

        /* JADX INFO: renamed from: com.stripe.android.model.g0$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b \u0010)R\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\r¨\u0006,"}, d2 = {"Lcom/stripe/android/model/g0$b$a;", "Lcom/stripe/android/model/g0$b;", "", "amount", "", "currency", "Lcom/stripe/android/model/StripeIntent$Usage;", "setupFutureUsage", "Lcom/stripe/android/model/u0$b;", "captureMethod", "<init>", "(JLjava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/u0$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "J", "()J", "b", "Ljava/lang/String;", "getCurrency", "c", "Lcom/stripe/android/model/StripeIntent$Usage;", "n0", "()Lcom/stripe/android/model/StripeIntent$Usage;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/u0$b;", "()Lcom/stripe/android/model/u0$b;", "getCode", "code", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Payment implements b {
            public static final Parcelable.Creator<Payment> CREATOR = new C0888a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final long amount;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String currency;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final StripeIntent.Usage setupFutureUsage;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentIntent.b captureMethod;

            /* JADX INFO: renamed from: com.stripe.android.model.g0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0888a implements Parcelable.Creator<Payment> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Payment createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Payment(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), PaymentIntent.b.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Payment[] newArray(int i11) {
                    return new Payment[i11];
                }
            }

            public Payment(long j11, String currency, StripeIntent.Usage usage, PaymentIntent.b captureMethod) {
                p013kotlin.jvm.internal.s.k(currency, "currency");
                p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
                this.amount = j11;
                this.currency = currency;
                this.setupFutureUsage = usage;
                this.captureMethod = captureMethod;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getAmount() {
                return this.amount;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final PaymentIntent.b getCaptureMethod() {
                return this.captureMethod;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Payment)) {
                    return false;
                }
                Payment payment = (Payment) other;
                return this.amount == payment.amount && p013kotlin.jvm.internal.s.f(this.currency, payment.currency) && this.setupFutureUsage == payment.setupFutureUsage && this.captureMethod == payment.captureMethod;
            }

            @Override // com.stripe.android.model.DeferredIntentParams.b
            public String getCode() {
                return "payment";
            }

            @Override // com.stripe.android.model.DeferredIntentParams.b
            public String getCurrency() {
                return this.currency;
            }

            public int hashCode() {
                int iHashCode = ((Long.hashCode(this.amount) * 31) + this.currency.hashCode()) * 31;
                StripeIntent.Usage usage = this.setupFutureUsage;
                return ((iHashCode + (usage == null ? 0 : usage.hashCode())) * 31) + this.captureMethod.hashCode();
            }

            @Override // com.stripe.android.model.DeferredIntentParams.b
            /* JADX INFO: renamed from: n0, reason: from getter */
            public StripeIntent.Usage getSetupFutureUsage() {
                return this.setupFutureUsage;
            }

            public String toString() {
                return "Payment(amount=" + this.amount + ", currency=" + this.currency + ", setupFutureUsage=" + this.setupFutureUsage + ", captureMethod=" + this.captureMethod + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeLong(this.amount);
                parcel.writeString(this.currency);
                StripeIntent.Usage usage = this.setupFutureUsage;
                if (usage == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(usage.name());
                }
                parcel.writeString(this.captureMethod.name());
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.g0$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\t¨\u0006\""}, d2 = {"Lcom/stripe/android/model/g0$b$b;", "Lcom/stripe/android/model/g0$b;", "", "currency", "Lcom/stripe/android/model/StripeIntent$Usage;", "setupFutureUsage", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Usage;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getCurrency", "b", "Lcom/stripe/android/model/StripeIntent$Usage;", "n0", "()Lcom/stripe/android/model/StripeIntent$Usage;", "getCode", "code", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Setup implements b {
            public static final Parcelable.Creator<Setup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String currency;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StripeIntent.Usage setupFutureUsage;

            /* JADX INFO: renamed from: com.stripe.android.model.g0$b$b$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Setup> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Setup createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Setup(parcel.readString(), StripeIntent.Usage.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Setup[] newArray(int i11) {
                    return new Setup[i11];
                }
            }

            public Setup(String str, StripeIntent.Usage setupFutureUsage) {
                p013kotlin.jvm.internal.s.k(setupFutureUsage, "setupFutureUsage");
                this.currency = str;
                this.setupFutureUsage = setupFutureUsage;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Setup)) {
                    return false;
                }
                Setup setup = (Setup) other;
                return p013kotlin.jvm.internal.s.f(this.currency, setup.currency) && this.setupFutureUsage == setup.setupFutureUsage;
            }

            @Override // com.stripe.android.model.DeferredIntentParams.b
            public String getCode() {
                return "setup";
            }

            @Override // com.stripe.android.model.DeferredIntentParams.b
            public String getCurrency() {
                return this.currency;
            }

            public int hashCode() {
                String str = this.currency;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.setupFutureUsage.hashCode();
            }

            @Override // com.stripe.android.model.DeferredIntentParams.b
            /* JADX INFO: renamed from: n0, reason: from getter */
            public StripeIntent.Usage getSetupFutureUsage() {
                return this.setupFutureUsage;
            }

            public String toString() {
                return "Setup(currency=" + this.currency + ", setupFutureUsage=" + this.setupFutureUsage + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.currency);
                parcel.writeString(this.setupFutureUsage.name());
            }
        }

        String getCode();

        String getCurrency();

        /* JADX INFO: renamed from: n0 */
        StripeIntent.Usage getSetupFutureUsage();
    }

    public DeferredIntentParams(b mode, List<String> paymentMethodTypes, String str, String str2) {
        p013kotlin.jvm.internal.s.k(mode, "mode");
        p013kotlin.jvm.internal.s.k(paymentMethodTypes, "paymentMethodTypes");
        this.mode = mode;
        this.paymentMethodTypes = paymentMethodTypes;
        this.paymentMethodConfigurationId = str;
        this.onBehalfOf = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPaymentMethodConfigurationId() {
        return this.paymentMethodConfigurationId;
    }

    public final Map<String, Object> c() {
        PaymentIntent.b captureMethod;
        Pair pairA = jn0.x.a("deferred_intent[mode]", this.mode.getCode());
        b bVar = this.mode;
        String code = null;
        b.Payment payment = bVar instanceof b.Payment ? (b.Payment) bVar : null;
        Pair pairA2 = jn0.x.a("deferred_intent[amount]", payment != null ? Long.valueOf(payment.getAmount()) : null);
        Pair pairA3 = jn0.x.a("deferred_intent[currency]", this.mode.getCurrency());
        StripeIntent.Usage setupFutureUsage = this.mode.getSetupFutureUsage();
        Pair pairA4 = jn0.x.a("deferred_intent[setup_future_usage]", setupFutureUsage != null ? setupFutureUsage.getCode() : null);
        b bVar2 = this.mode;
        b.Payment payment2 = bVar2 instanceof b.Payment ? (b.Payment) bVar2 : null;
        if (payment2 != null && (captureMethod = payment2.getCaptureMethod()) != null) {
            code = captureMethod.getCode();
        }
        Map mapM = p013kotlin.collections.v0.m(pairA, pairA2, pairA3, pairA4, jn0.x.a("deferred_intent[capture_method]", code), jn0.x.a("deferred_intent[payment_method_configuration][id]", this.paymentMethodConfigurationId), jn0.x.a("deferred_intent[on_behalf_of]", this.onBehalfOf));
        List<String> list = this.paymentMethodTypes;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            arrayList.add(jn0.x.a("deferred_intent[payment_method_types][" + i11 + "]", (String) obj));
            i11 = i12;
        }
        return p013kotlin.collections.v0.q(mapM, arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeferredIntentParams)) {
            return false;
        }
        DeferredIntentParams deferredIntentParams = (DeferredIntentParams) other;
        return p013kotlin.jvm.internal.s.f(this.mode, deferredIntentParams.mode) && p013kotlin.jvm.internal.s.f(this.paymentMethodTypes, deferredIntentParams.paymentMethodTypes) && p013kotlin.jvm.internal.s.f(this.paymentMethodConfigurationId, deferredIntentParams.paymentMethodConfigurationId) && p013kotlin.jvm.internal.s.f(this.onBehalfOf, deferredIntentParams.onBehalfOf);
    }

    public int hashCode() {
        int iHashCode = ((this.mode.hashCode() * 31) + this.paymentMethodTypes.hashCode()) * 31;
        String str = this.paymentMethodConfigurationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.onBehalfOf;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final List<String> t() {
        return this.paymentMethodTypes;
    }

    public String toString() {
        return "DeferredIntentParams(mode=" + this.mode + ", paymentMethodTypes=" + this.paymentMethodTypes + ", paymentMethodConfigurationId=" + this.paymentMethodConfigurationId + ", onBehalfOf=" + this.onBehalfOf + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeParcelable(this.mode, flags);
        parcel.writeStringList(this.paymentMethodTypes);
        parcel.writeString(this.paymentMethodConfigurationId);
        parcel.writeString(this.onBehalfOf);
    }
}
