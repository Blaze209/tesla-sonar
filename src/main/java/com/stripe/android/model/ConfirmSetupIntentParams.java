package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.m, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001\u0016BW\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J`\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b \u0010\u001cJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010'\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u00101R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0015R\"\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0015¨\u0006?"}, d2 = {"Lcom/stripe/android/model/m;", "Lcom/stripe/android/model/n;", "", "clientSecret", "paymentMethodId", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "returnUrl", "", "useStripeSdk", "mandateId", "Lcom/stripe/android/model/q0;", "mandateData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/w0;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/q0;)V", "shouldUseStripeSdk", "f", "(Z)Lcom/stripe/android/model/m;", "", "", "c3", "()Ljava/util/Map;", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/w0;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/q0;)Lcom/stripe/android/model/m;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "p", "b", "getPaymentMethodId$payments_core_release", "c", "Lcom/stripe/android/model/w0;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/model/w0;", "getReturnUrl", "L3", "(Ljava/lang/String;)V", "e", "Z", "getMandateId", "setMandateId", "g", "Lcom/stripe/android/model/q0;", "getMandateData", "()Lcom/stripe/android/model/q0;", "setMandateData", "(Lcom/stripe/android/model/q0;)V", "paymentMethodParamMap", "mandateDataParams", "h", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ConfirmSetupIntentParams implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethodCreateParams paymentMethodCreateParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String returnUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useStripeSdk;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String mandateId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private MandateDataParams mandateData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f51387i = 8;
    public static final Parcelable.Creator<ConfirmSetupIntentParams> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/model/m$a;", "", "<init>", "()V", "", "clientSecret", "Lcom/stripe/android/model/v0$p;", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/m;", "b", "(Ljava/lang/String;Lcom/stripe/android/model/v0$p;)Lcom/stripe/android/model/m;", "paymentMethodId", "Lcom/stripe/android/model/q0;", "mandateData", "mandateId", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/q0;Ljava/lang/String;)Lcom/stripe/android/model/m;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "a", "(Lcom/stripe/android/model/w0;Ljava/lang/String;Lcom/stripe/android/model/q0;Ljava/lang/String;)Lcom/stripe/android/model/m;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConfirmSetupIntentParams d(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams q0Var, String str2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                q0Var = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            return companion.a(paymentMethodCreateParams, str, q0Var, str2);
        }

        public static /* synthetic */ ConfirmSetupIntentParams e(Companion companion, String str, String str2, MandateDataParams q0Var, String str3, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                q0Var = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            return companion.c(str, str2, q0Var, str3);
        }

        public final ConfirmSetupIntentParams a(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, MandateDataParams mandateData, String mandateId) {
            p013kotlin.jvm.internal.s.k(paymentMethodCreateParams, "paymentMethodCreateParams");
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, null, paymentMethodCreateParams, null, false, mandateId, mandateData, 26, null);
        }

        public final ConfirmSetupIntentParams b(String clientSecret, PaymentMethod.p paymentMethodType) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            p013kotlin.jvm.internal.s.k(paymentMethodType, "paymentMethodType");
            MandateDataParams q0Var = new MandateDataParams(MandateDataParams.c.Online.INSTANCE.a());
            if (!paymentMethodType.requiresMandate) {
                q0Var = null;
            }
            return new ConfirmSetupIntentParams(clientSecret, null, null, null, false, null, q0Var, 62, null);
        }

        public final ConfirmSetupIntentParams c(String paymentMethodId, String clientSecret, MandateDataParams mandateData, String mandateId) {
            p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, paymentMethodId, null, null, false, mandateId, mandateData, 28, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.m$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ConfirmSetupIntentParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConfirmSetupIntentParams createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ConfirmSetupIntentParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? MandateDataParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConfirmSetupIntentParams[] newArray(int i11) {
            return new ConfirmSetupIntentParams[i11];
        }
    }

    public ConfirmSetupIntentParams(String clientSecret, String str, PaymentMethodCreateParams paymentMethodCreateParams, String str2, boolean z11, String str3, MandateDataParams q0Var) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.paymentMethodId = str;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.returnUrl = str2;
        this.useStripeSdk = z11;
        this.mandateId = str3;
        this.mandateData = q0Var;
    }

    public static /* synthetic */ ConfirmSetupIntentParams b(ConfirmSetupIntentParams confirmSetupIntentParams, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z11, String str4, MandateDataParams q0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = confirmSetupIntentParams.clientSecret;
        }
        if ((i11 & 2) != 0) {
            str2 = confirmSetupIntentParams.paymentMethodId;
        }
        if ((i11 & 4) != 0) {
            paymentMethodCreateParams = confirmSetupIntentParams.paymentMethodCreateParams;
        }
        if ((i11 & 8) != 0) {
            str3 = confirmSetupIntentParams.returnUrl;
        }
        if ((i11 & 16) != 0) {
            z11 = confirmSetupIntentParams.useStripeSdk;
        }
        if ((i11 & 32) != 0) {
            str4 = confirmSetupIntentParams.mandateId;
        }
        if ((i11 & 64) != 0) {
            q0Var = confirmSetupIntentParams.mandateData;
        }
        String str5 = str4;
        MandateDataParams q0Var2 = q0Var;
        boolean z12 = z11;
        PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
        return confirmSetupIntentParams.a(str, str2, paymentMethodCreateParams2, str3, z12, str5, q0Var2);
    }

    private final Map<String, Object> c() {
        Map<String, Object> mapC3;
        MandateDataParams q0Var = this.mandateData;
        if (q0Var != null && (mapC3 = q0Var.c3()) != null) {
            return mapC3;
        }
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null && paymentMethodCreateParams.getRequiresMandate() && this.mandateId == null) {
            return new MandateDataParams(MandateDataParams.c.Online.INSTANCE.a()).c3();
        }
        return null;
    }

    private final Map<String, Object> e() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null) {
            return p013kotlin.collections.v0.f(jn0.x.a("payment_method_data", paymentMethodCreateParams.c3()));
        }
        String str = this.paymentMethodId;
        return str != null ? p013kotlin.collections.v0.f(jn0.x.a("payment_method", str)) : p013kotlin.collections.v0.i();
    }

    @Override // com.stripe.android.model.n
    public void L3(String str) {
        this.returnUrl = str;
    }

    public final ConfirmSetupIntentParams a(String clientSecret, String paymentMethodId, PaymentMethodCreateParams paymentMethodCreateParams, String returnUrl, boolean useStripeSdk, String mandateId, MandateDataParams mandateData) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        return new ConfirmSetupIntentParams(clientSecret, paymentMethodId, paymentMethodCreateParams, returnUrl, useStripeSdk, mandateId, mandateData);
    }

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        Map mapM = p013kotlin.collections.v0.m(jn0.x.a("client_secret", getClientSecret()), jn0.x.a("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        String returnUrl = getReturnUrl();
        Map mapF = returnUrl != null ? p013kotlin.collections.v0.f(jn0.x.a("return_url", returnUrl)) : null;
        if (mapF == null) {
            mapF = p013kotlin.collections.v0.i();
        }
        Map mapR = p013kotlin.collections.v0.r(mapM, mapF);
        String str = this.mandateId;
        Map mapF2 = str != null ? p013kotlin.collections.v0.f(jn0.x.a("mandate", str)) : null;
        if (mapF2 == null) {
            mapF2 = p013kotlin.collections.v0.i();
        }
        Map mapR2 = p013kotlin.collections.v0.r(mapR, mapF2);
        Map<String, Object> mapC = c();
        Map mapF3 = mapC != null ? p013kotlin.collections.v0.f(jn0.x.a("mandate_data", mapC)) : null;
        if (mapF3 == null) {
            mapF3 = p013kotlin.collections.v0.i();
        }
        return p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(mapR2, mapF3), e());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final /* synthetic */ PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmSetupIntentParams)) {
            return false;
        }
        ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) other;
        return p013kotlin.jvm.internal.s.f(this.clientSecret, confirmSetupIntentParams.clientSecret) && p013kotlin.jvm.internal.s.f(this.paymentMethodId, confirmSetupIntentParams.paymentMethodId) && p013kotlin.jvm.internal.s.f(this.paymentMethodCreateParams, confirmSetupIntentParams.paymentMethodCreateParams) && p013kotlin.jvm.internal.s.f(this.returnUrl, confirmSetupIntentParams.returnUrl) && this.useStripeSdk == confirmSetupIntentParams.useStripeSdk && p013kotlin.jvm.internal.s.f(this.mandateId, confirmSetupIntentParams.mandateId) && p013kotlin.jvm.internal.s.f(this.mandateData, confirmSetupIntentParams.mandateData);
    }

    @Override // com.stripe.android.model.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ConfirmSetupIntentParams m2(boolean shouldUseStripeSdk) {
        return b(this, null, null, null, null, shouldUseStripeSdk, null, null, 111, null);
    }

    @Override // com.stripe.android.model.n
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public int hashCode() {
        int iHashCode = this.clientSecret.hashCode() * 31;
        String str = this.paymentMethodId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int iHashCode3 = (iHashCode2 + (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode())) * 31;
        String str2 = this.returnUrl;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.useStripeSdk)) * 31;
        String str3 = this.mandateId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MandateDataParams q0Var = this.mandateData;
        return iHashCode5 + (q0Var != null ? q0Var.hashCode() : 0);
    }

    @Override // com.stripe.android.model.n
    /* JADX INFO: renamed from: p, reason: from getter */
    public /* synthetic */ String getClientSecret() {
        return this.clientSecret;
    }

    public String toString() {
        return "ConfirmSetupIntentParams(clientSecret=" + this.clientSecret + ", paymentMethodId=" + this.paymentMethodId + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", returnUrl=" + this.returnUrl + ", useStripeSdk=" + this.useStripeSdk + ", mandateId=" + this.mandateId + ", mandateData=" + this.mandateData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.paymentMethodId);
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodCreateParams.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.returnUrl);
        parcel.writeInt(this.useStripeSdk ? 1 : 0);
        parcel.writeString(this.mandateId);
        MandateDataParams q0Var = this.mandateData;
        if (q0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            q0Var.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ ConfirmSetupIntentParams(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z11, String str4, MandateDataParams q0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : paymentMethodCreateParams, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : q0Var);
    }
}
