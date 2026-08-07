package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.h0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010$\n\u0002\b\u0006\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0004$(,0B_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b(\u00102R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\u0015R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b$\u00106R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b*\u0010:\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b3\u00109R\u001d\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0>8F¢\u0006\u0006\u001a\u0004\b0\u0010?R\u0011\u0010A\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b+\u00109R\u0011\u0010C\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bB\u00109¨\u0006D"}, d2 = {"Lcom/stripe/android/model/h0;", "Lt30/f;", "Lcom/stripe/android/model/h0$e;", "linkSettings", "", "paymentMethodSpecs", "externalPaymentMethodData", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "Lcom/stripe/android/model/h0$d;", "customer", "merchantCountry", "Lcom/stripe/android/model/h0$a;", "cardBrandChoice", "", "isGooglePayEnabled", "", "sessionsError", "<init>", "(Lcom/stripe/android/model/h0$e;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/model/h0$d;Ljava/lang/String;Lcom/stripe/android/model/h0$a;ZLjava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/h0$e;", "g", "()Lcom/stripe/android/model/h0$e;", "b", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/StripeIntent;", "k", "()Lcom/stripe/android/model/StripeIntent;", "e", "Lcom/stripe/android/model/h0$d;", "()Lcom/stripe/android/model/h0$d;", "f", "h", "Lcom/stripe/android/model/h0$a;", "()Lcom/stripe/android/model/h0$a;", "Z", "l", "()Z", "Ljava/lang/Throwable;", "j", "()Ljava/lang/Throwable;", "linkPassthroughModeEnabled", "", "()Ljava/util/Map;", "linkFlags", "disableLinkSignup", "m", "isLinkEnabled", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ElementsSession implements t30.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LinkSettings linkSettings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodSpecs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalPaymentMethodData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent stripeIntent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Customer customer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantCountry;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardBrandChoice cardBrandChoice;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGooglePayEnabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable sessionsError;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f51179k = 8;
    public static final Parcelable.Creator<ElementsSession> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.model.h0$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/h0$a;", "Lt30/f;", "", "eligible", "", "", "preferredNetworks", "<init>", "(ZLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CardBrandChoice implements t30.f {
        public static final Parcelable.Creator<CardBrandChoice> CREATOR = new C0890a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean eligible;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> preferredNetworks;

        /* JADX INFO: renamed from: com.stripe.android.model.h0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0890a implements Parcelable.Creator<CardBrandChoice> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CardBrandChoice createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new CardBrandChoice(parcel.readInt() != 0, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CardBrandChoice[] newArray(int i11) {
                return new CardBrandChoice[i11];
            }
        }

        public CardBrandChoice(boolean z11, List<String> preferredNetworks) {
            p013kotlin.jvm.internal.s.k(preferredNetworks, "preferredNetworks");
            this.eligible = z11;
            this.preferredNetworks = preferredNetworks;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEligible() {
            return this.eligible;
        }

        public final List<String> b() {
            return this.preferredNetworks;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardBrandChoice)) {
                return false;
            }
            CardBrandChoice cardBrandChoice = (CardBrandChoice) other;
            return this.eligible == cardBrandChoice.eligible && p013kotlin.jvm.internal.s.f(this.preferredNetworks, cardBrandChoice.preferredNetworks);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.eligible) * 31) + this.preferredNetworks.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.eligible + ", preferredNetworks=" + this.preferredNetworks + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(this.eligible ? 1 : 0);
            parcel.writeStringList(this.preferredNetworks);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.h0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/h0$b;", "", "<init>", "()V", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "", "sessionsError", "Lcom/stripe/android/model/h0;", "a", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/Throwable;)Lcom/stripe/android/model/h0;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ElementsSession a(StripeIntent stripeIntent, Throwable sessionsError) {
            p013kotlin.jvm.internal.s.k(stripeIntent, "stripeIntent");
            return new ElementsSession(null, null, null, stripeIntent, null, null, null, true, sessionsError);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.h0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ElementsSession> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ElementsSession createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ElementsSession(parcel.readInt() == 0 ? null : LinkSettings.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (StripeIntent) parcel.readParcelable(ElementsSession.class.getClassLoader()), parcel.readInt() == 0 ? null : Customer.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? CardBrandChoice.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, (Throwable) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ElementsSession[] newArray(int i11) {
            return new ElementsSession[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.h0$d, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\"B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"Lcom/stripe/android/model/h0$d;", "Lt30/f;", "", "Lcom/stripe/android/model/v0;", "paymentMethods", "", "defaultPaymentMethod", "Lcom/stripe/android/model/h0$d$c;", "session", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/model/h0$d$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getDefaultPaymentMethod", "c", "Lcom/stripe/android/model/h0$d$c;", "()Lcom/stripe/android/model/h0$d$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Customer implements t30.f {
        public static final Parcelable.Creator<Customer> CREATOR = new b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f51191d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<PaymentMethod> paymentMethods;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String defaultPaymentMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Session session;

        /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006!"}, d2 = {"Lcom/stripe/android/model/h0$d$a;", "Lt30/f;", "Lcom/stripe/android/model/h0$d$a$c;", "mobilePaymentElement", "Lcom/stripe/android/model/h0$d$a$b;", "customerSheet", "<init>", "(Lcom/stripe/android/model/h0$d$a$c;Lcom/stripe/android/model/h0$d$a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/h0$d$a$c;", "b", "()Lcom/stripe/android/model/h0$d$a$c;", "Lcom/stripe/android/model/h0$d$a$b;", "()Lcom/stripe/android/model/h0$d$a$b;", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Components implements t30.f {
            public static final Parcelable.Creator<Components> CREATOR = new C0891a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final c mobilePaymentElement;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b customerSheet;

            /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0891a implements Parcelable.Creator<Components> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Components createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Components((c) parcel.readParcelable(Components.class.getClassLoader()), (b) parcel.readParcelable(Components.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Components[] newArray(int i11) {
                    return new Components[i11];
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$b */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/h0$d$a$b;", "Lt30/f;", "a", "b", "Lcom/stripe/android/model/h0$d$a$b$a;", "Lcom/stripe/android/model/h0$d$a$b$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public interface b extends t30.f {

                /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$b$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/h0$d$a$b$a;", "Lcom/stripe/android/model/h0$d$a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class C0892a implements b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0892a f51197a = new C0892a();
                    public static final Parcelable.Creator<C0892a> CREATOR = new C0893a();

                    /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$b$a$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class C0893a implements Parcelable.Creator<C0892a> {
                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0892a createFromParcel(Parcel parcel) {
                            p013kotlin.jvm.internal.s.k(parcel, "parcel");
                            parcel.readInt();
                            return C0892a.f51197a;
                        }

                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0892a[] newArray(int i11) {
                            return new C0892a[i11];
                        }
                    }

                    private C0892a() {
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof C0892a);
                    }

                    public int hashCode() {
                        return -269074152;
                    }

                    public String toString() {
                        return "Disabled";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        p013kotlin.jvm.internal.s.k(parcel, "out");
                        parcel.writeInt(1);
                    }
                }

                /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$b$b, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/h0$d$a$b$b;", "Lcom/stripe/android/model/h0$d$a$b;", "", "isPaymentMethodRemoveEnabled", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "()Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Enabled implements b {
                    public static final Parcelable.Creator<Enabled> CREATOR = new C0895a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final boolean isPaymentMethodRemoveEnabled;

                    /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$b$b$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class C0895a implements Parcelable.Creator<Enabled> {
                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Enabled createFromParcel(Parcel parcel) {
                            p013kotlin.jvm.internal.s.k(parcel, "parcel");
                            return new Enabled(parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Enabled[] newArray(int i11) {
                            return new Enabled[i11];
                        }
                    }

                    public Enabled(boolean z11) {
                        this.isPaymentMethodRemoveEnabled = z11;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final boolean getIsPaymentMethodRemoveEnabled() {
                        return this.isPaymentMethodRemoveEnabled;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Enabled) && this.isPaymentMethodRemoveEnabled == ((Enabled) other).isPaymentMethodRemoveEnabled;
                    }

                    public int hashCode() {
                        return Boolean.hashCode(this.isPaymentMethodRemoveEnabled);
                    }

                    public String toString() {
                        return "Enabled(isPaymentMethodRemoveEnabled=" + this.isPaymentMethodRemoveEnabled + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        p013kotlin.jvm.internal.s.k(parcel, "out");
                        parcel.writeInt(this.isPaymentMethodRemoveEnabled ? 1 : 0);
                    }
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$c */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/h0$d$a$c;", "Lt30/f;", "a", "b", "Lcom/stripe/android/model/h0$d$a$c$a;", "Lcom/stripe/android/model/h0$d$a$c$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public interface c extends t30.f {

                /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$c$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/h0$d$a$c$a;", "Lcom/stripe/android/model/h0$d$a$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class C0896a implements c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final C0896a f51199a = new C0896a();
                    public static final Parcelable.Creator<C0896a> CREATOR = new C0897a();

                    /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$c$a$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class C0897a implements Parcelable.Creator<C0896a> {
                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0896a createFromParcel(Parcel parcel) {
                            p013kotlin.jvm.internal.s.k(parcel, "parcel");
                            parcel.readInt();
                            return C0896a.f51199a;
                        }

                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0896a[] newArray(int i11) {
                            return new C0896a[i11];
                        }
                    }

                    private C0896a() {
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        return this == other || (other instanceof C0896a);
                    }

                    public int hashCode() {
                        return -1145758141;
                    }

                    public String toString() {
                        return "Disabled";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        p013kotlin.jvm.internal.s.k(parcel, "out");
                        parcel.writeInt(1);
                    }
                }

                /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$c$b, reason: from toString */
                @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"Lcom/stripe/android/model/h0$d$a$c$b;", "Lcom/stripe/android/model/h0$d$a$c;", "", "isPaymentMethodSaveEnabled", "isPaymentMethodRemoveEnabled", "Lcom/stripe/android/model/v0$b;", "allowRedisplayOverride", "<init>", "(ZZLcom/stripe/android/model/v0$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "c", "()Z", "b", "Lcom/stripe/android/model/v0$b;", "()Lcom/stripe/android/model/v0$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Enabled implements c {
                    public static final Parcelable.Creator<Enabled> CREATOR = new C0898a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final boolean isPaymentMethodSaveEnabled;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    private final boolean isPaymentMethodRemoveEnabled;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                    private final PaymentMethod.b allowRedisplayOverride;

                    /* JADX INFO: renamed from: com.stripe.android.model.h0$d$a$c$b$a, reason: collision with other inner class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class C0898a implements Parcelable.Creator<Enabled> {
                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Enabled createFromParcel(Parcel parcel) {
                            p013kotlin.jvm.internal.s.k(parcel, "parcel");
                            return new Enabled(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.b.CREATOR.createFromParcel(parcel));
                        }

                        @Override // android.os.Parcelable.Creator
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Enabled[] newArray(int i11) {
                            return new Enabled[i11];
                        }
                    }

                    public Enabled(boolean z11, boolean z12, PaymentMethod.b bVar) {
                        this.isPaymentMethodSaveEnabled = z11;
                        this.isPaymentMethodRemoveEnabled = z12;
                        this.allowRedisplayOverride = bVar;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final PaymentMethod.b getAllowRedisplayOverride() {
                        return this.allowRedisplayOverride;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getIsPaymentMethodRemoveEnabled() {
                        return this.isPaymentMethodRemoveEnabled;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final boolean getIsPaymentMethodSaveEnabled() {
                        return this.isPaymentMethodSaveEnabled;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Enabled)) {
                            return false;
                        }
                        Enabled enabled = (Enabled) other;
                        return this.isPaymentMethodSaveEnabled == enabled.isPaymentMethodSaveEnabled && this.isPaymentMethodRemoveEnabled == enabled.isPaymentMethodRemoveEnabled && this.allowRedisplayOverride == enabled.allowRedisplayOverride;
                    }

                    public int hashCode() {
                        int iHashCode = ((Boolean.hashCode(this.isPaymentMethodSaveEnabled) * 31) + Boolean.hashCode(this.isPaymentMethodRemoveEnabled)) * 31;
                        PaymentMethod.b bVar = this.allowRedisplayOverride;
                        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
                    }

                    public String toString() {
                        return "Enabled(isPaymentMethodSaveEnabled=" + this.isPaymentMethodSaveEnabled + ", isPaymentMethodRemoveEnabled=" + this.isPaymentMethodRemoveEnabled + ", allowRedisplayOverride=" + this.allowRedisplayOverride + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel parcel, int flags) {
                        p013kotlin.jvm.internal.s.k(parcel, "out");
                        parcel.writeInt(this.isPaymentMethodSaveEnabled ? 1 : 0);
                        parcel.writeInt(this.isPaymentMethodRemoveEnabled ? 1 : 0);
                        PaymentMethod.b bVar = this.allowRedisplayOverride;
                        if (bVar == null) {
                            parcel.writeInt(0);
                        } else {
                            parcel.writeInt(1);
                            bVar.writeToParcel(parcel, flags);
                        }
                    }
                }
            }

            public Components(c mobilePaymentElement, b customerSheet) {
                p013kotlin.jvm.internal.s.k(mobilePaymentElement, "mobilePaymentElement");
                p013kotlin.jvm.internal.s.k(customerSheet, "customerSheet");
                this.mobilePaymentElement = mobilePaymentElement;
                this.customerSheet = customerSheet;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b getCustomerSheet() {
                return this.customerSheet;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final c getMobilePaymentElement() {
                return this.mobilePaymentElement;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Components)) {
                    return false;
                }
                Components components = (Components) other;
                return p013kotlin.jvm.internal.s.f(this.mobilePaymentElement, components.mobilePaymentElement) && p013kotlin.jvm.internal.s.f(this.customerSheet, components.customerSheet);
            }

            public int hashCode() {
                return (this.mobilePaymentElement.hashCode() * 31) + this.customerSheet.hashCode();
            }

            public String toString() {
                return "Components(mobilePaymentElement=" + this.mobilePaymentElement + ", customerSheet=" + this.customerSheet + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeParcelable(this.mobilePaymentElement, flags);
                parcel.writeParcelable(this.customerSheet, flags);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.h0$d$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Customer> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Customer createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                }
                return new Customer(arrayList, parcel.readString(), Session.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Customer[] newArray(int i11) {
                return new Customer[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.h0$d$c, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010\u0011R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*¨\u0006+"}, d2 = {"Lcom/stripe/android/model/h0$d$c;", "Lt30/f;", "", "id", "", "liveMode", "apiKey", "", "apiKeyExpiry", "customerId", "Lcom/stripe/android/model/h0$d$a;", "components", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/h0$d$a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "b", "Z", "getLiveMode", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "I", "e", "f", "Lcom/stripe/android/model/h0$d$a;", "()Lcom/stripe/android/model/h0$d$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Session implements t30.f {
            public static final Parcelable.Creator<Session> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean liveMode;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String apiKey;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int apiKeyExpiry;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String customerId;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Components components;

            /* JADX INFO: renamed from: com.stripe.android.model.h0$d$c$a */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Session> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Session createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Session(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), Components.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Session[] newArray(int i11) {
                    return new Session[i11];
                }
            }

            public Session(String id2, boolean z11, String apiKey, int i11, String customerId, Components components) {
                p013kotlin.jvm.internal.s.k(id2, "id");
                p013kotlin.jvm.internal.s.k(apiKey, "apiKey");
                p013kotlin.jvm.internal.s.k(customerId, "customerId");
                p013kotlin.jvm.internal.s.k(components, "components");
                this.id = id2;
                this.liveMode = z11;
                this.apiKey = apiKey;
                this.apiKeyExpiry = i11;
                this.customerId = customerId;
                this.components = components;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getApiKey() {
                return this.apiKey;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getApiKeyExpiry() {
                return this.apiKeyExpiry;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Components getComponents() {
                return this.components;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getCustomerId() {
                return this.customerId;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Session)) {
                    return false;
                }
                Session session = (Session) other;
                return p013kotlin.jvm.internal.s.f(this.id, session.id) && this.liveMode == session.liveMode && p013kotlin.jvm.internal.s.f(this.apiKey, session.apiKey) && this.apiKeyExpiry == session.apiKeyExpiry && p013kotlin.jvm.internal.s.f(this.customerId, session.customerId) && p013kotlin.jvm.internal.s.f(this.components, session.components);
            }

            public int hashCode() {
                return (((((((((this.id.hashCode() * 31) + Boolean.hashCode(this.liveMode)) * 31) + this.apiKey.hashCode()) * 31) + Integer.hashCode(this.apiKeyExpiry)) * 31) + this.customerId.hashCode()) * 31) + this.components.hashCode();
            }

            public String toString() {
                return "Session(id=" + this.id + ", liveMode=" + this.liveMode + ", apiKey=" + this.apiKey + ", apiKeyExpiry=" + this.apiKeyExpiry + ", customerId=" + this.customerId + ", components=" + this.components + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.id);
                parcel.writeInt(this.liveMode ? 1 : 0);
                parcel.writeString(this.apiKey);
                parcel.writeInt(this.apiKeyExpiry);
                parcel.writeString(this.customerId);
                this.components.writeToParcel(parcel, flags);
            }
        }

        public Customer(List<PaymentMethod> paymentMethods, String str, Session session) {
            p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
            p013kotlin.jvm.internal.s.k(session, "session");
            this.paymentMethods = paymentMethods;
            this.defaultPaymentMethod = str;
            this.session = session;
        }

        public final List<PaymentMethod> a() {
            return this.paymentMethods;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Session getSession() {
            return this.session;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Customer)) {
                return false;
            }
            Customer customer = (Customer) other;
            return p013kotlin.jvm.internal.s.f(this.paymentMethods, customer.paymentMethods) && p013kotlin.jvm.internal.s.f(this.defaultPaymentMethod, customer.defaultPaymentMethod) && p013kotlin.jvm.internal.s.f(this.session, customer.session);
        }

        public int hashCode() {
            int iHashCode = this.paymentMethods.hashCode() * 31;
            String str = this.defaultPaymentMethod;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.session.hashCode();
        }

        public String toString() {
            return "Customer(paymentMethods=" + this.paymentMethods + ", defaultPaymentMethod=" + this.defaultPaymentMethod + ", session=" + this.session + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            List<PaymentMethod> list = this.paymentMethods;
            parcel.writeInt(list.size());
            Iterator<PaymentMethod> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
            parcel.writeString(this.defaultPaymentMethod);
            this.session.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.h0$e, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b\"\u0010*R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b\u001e\u0010%¨\u0006,"}, d2 = {"Lcom/stripe/android/model/h0$e;", "Lt30/f;", "", "", "linkFundingSources", "", "linkPassthroughModeEnabled", "Lcom/stripe/android/model/n0;", "linkMode", "", "linkFlags", "disableLinkSignup", "<init>", "(Ljava/util/List;ZLcom/stripe/android/model/n0;Ljava/util/Map;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "getLinkFundingSources", "()Ljava/util/List;", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "c", "Lcom/stripe/android/model/n0;", "()Lcom/stripe/android/model/n0;", "Ljava/util/Map;", "()Ljava/util/Map;", "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LinkSettings implements t30.f {
        public static final Parcelable.Creator<LinkSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> linkFundingSources;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean linkPassthroughModeEnabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final n0 linkMode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Boolean> linkFlags;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean disableLinkSignup;

        /* JADX INFO: renamed from: com.stripe.android.model.h0$e$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LinkSettings> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LinkSettings createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                boolean z11 = true;
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                n0 n0VarValueOf = parcel.readInt() == 0 ? null : n0.valueOf(parcel.readString());
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new LinkSettings(arrayListCreateStringArrayList, z11, n0VarValueOf, linkedHashMap, parcel.readInt() != 0 ? z11 : false);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LinkSettings[] newArray(int i11) {
                return new LinkSettings[i11];
            }
        }

        public LinkSettings(List<String> linkFundingSources, boolean z11, n0 n0Var, Map<String, Boolean> linkFlags, boolean z12) {
            p013kotlin.jvm.internal.s.k(linkFundingSources, "linkFundingSources");
            p013kotlin.jvm.internal.s.k(linkFlags, "linkFlags");
            this.linkFundingSources = linkFundingSources;
            this.linkPassthroughModeEnabled = z11;
            this.linkMode = n0Var;
            this.linkFlags = linkFlags;
            this.disableLinkSignup = z12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDisableLinkSignup() {
            return this.disableLinkSignup;
        }

        public final Map<String, Boolean> b() {
            return this.linkFlags;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final n0 getLinkMode() {
            return this.linkMode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getLinkPassthroughModeEnabled() {
            return this.linkPassthroughModeEnabled;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkSettings)) {
                return false;
            }
            LinkSettings linkSettings = (LinkSettings) other;
            return p013kotlin.jvm.internal.s.f(this.linkFundingSources, linkSettings.linkFundingSources) && this.linkPassthroughModeEnabled == linkSettings.linkPassthroughModeEnabled && this.linkMode == linkSettings.linkMode && p013kotlin.jvm.internal.s.f(this.linkFlags, linkSettings.linkFlags) && this.disableLinkSignup == linkSettings.disableLinkSignup;
        }

        public int hashCode() {
            int iHashCode = ((this.linkFundingSources.hashCode() * 31) + Boolean.hashCode(this.linkPassthroughModeEnabled)) * 31;
            n0 n0Var = this.linkMode;
            return ((((iHashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31) + this.linkFlags.hashCode()) * 31) + Boolean.hashCode(this.disableLinkSignup);
        }

        public String toString() {
            return "LinkSettings(linkFundingSources=" + this.linkFundingSources + ", linkPassthroughModeEnabled=" + this.linkPassthroughModeEnabled + ", linkMode=" + this.linkMode + ", linkFlags=" + this.linkFlags + ", disableLinkSignup=" + this.disableLinkSignup + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeStringList(this.linkFundingSources);
            parcel.writeInt(this.linkPassthroughModeEnabled ? 1 : 0);
            n0 n0Var = this.linkMode;
            if (n0Var == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(n0Var.name());
            }
            Map<String, Boolean> map = this.linkFlags;
            parcel.writeInt(map.size());
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeInt(entry.getValue().booleanValue() ? 1 : 0);
            }
            parcel.writeInt(this.disableLinkSignup ? 1 : 0);
        }
    }

    public ElementsSession(LinkSettings linkSettings, String str, String str2, StripeIntent stripeIntent, Customer customer, String str3, CardBrandChoice cardBrandChoice, boolean z11, Throwable th2) {
        p013kotlin.jvm.internal.s.k(stripeIntent, "stripeIntent");
        this.linkSettings = linkSettings;
        this.paymentMethodSpecs = str;
        this.externalPaymentMethodData = str2;
        this.stripeIntent = stripeIntent;
        this.customer = customer;
        this.merchantCountry = str3;
        this.cardBrandChoice = cardBrandChoice;
        this.isGooglePayEnabled = z11;
        this.sessionsError = th2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Customer getCustomer() {
        return this.customer;
    }

    public final boolean c() {
        LinkSettings linkSettings = this.linkSettings;
        if (linkSettings != null) {
            return linkSettings.getDisableLinkSignup();
        }
        return false;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExternalPaymentMethodData() {
        return this.externalPaymentMethodData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Map<String, Boolean> e() {
        Map<String, Boolean> mapB;
        LinkSettings linkSettings = this.linkSettings;
        return (linkSettings == null || (mapB = linkSettings.b()) == null) ? p013kotlin.collections.v0.i() : mapB;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElementsSession)) {
            return false;
        }
        ElementsSession elementsSession = (ElementsSession) other;
        return p013kotlin.jvm.internal.s.f(this.linkSettings, elementsSession.linkSettings) && p013kotlin.jvm.internal.s.f(this.paymentMethodSpecs, elementsSession.paymentMethodSpecs) && p013kotlin.jvm.internal.s.f(this.externalPaymentMethodData, elementsSession.externalPaymentMethodData) && p013kotlin.jvm.internal.s.f(this.stripeIntent, elementsSession.stripeIntent) && p013kotlin.jvm.internal.s.f(this.customer, elementsSession.customer) && p013kotlin.jvm.internal.s.f(this.merchantCountry, elementsSession.merchantCountry) && p013kotlin.jvm.internal.s.f(this.cardBrandChoice, elementsSession.cardBrandChoice) && this.isGooglePayEnabled == elementsSession.isGooglePayEnabled && p013kotlin.jvm.internal.s.f(this.sessionsError, elementsSession.sessionsError);
    }

    public final boolean f() {
        LinkSettings linkSettings = this.linkSettings;
        if (linkSettings != null) {
            return linkSettings.getLinkPassthroughModeEnabled();
        }
        return false;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LinkSettings getLinkSettings() {
        return this.linkSettings;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getMerchantCountry() {
        return this.merchantCountry;
    }

    public int hashCode() {
        LinkSettings linkSettings = this.linkSettings;
        int iHashCode = (linkSettings == null ? 0 : linkSettings.hashCode()) * 31;
        String str = this.paymentMethodSpecs;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.externalPaymentMethodData;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.stripeIntent.hashCode()) * 31;
        Customer customer = this.customer;
        int iHashCode4 = (iHashCode3 + (customer == null ? 0 : customer.hashCode())) * 31;
        String str3 = this.merchantCountry;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CardBrandChoice cardBrandChoice = this.cardBrandChoice;
        int iHashCode6 = (((iHashCode5 + (cardBrandChoice == null ? 0 : cardBrandChoice.hashCode())) * 31) + Boolean.hashCode(this.isGooglePayEnabled)) * 31;
        Throwable th2 = this.sessionsError;
        return iHashCode6 + (th2 != null ? th2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPaymentMethodSpecs() {
        return this.paymentMethodSpecs;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Throwable getSessionsError() {
        return this.sessionsError;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsGooglePayEnabled() {
        return this.isGooglePayEnabled;
    }

    public final boolean m() {
        boolean z11;
        boolean zContains = this.stripeIntent.t().contains(PaymentMethod.p.Link.code);
        List<String> listU3 = this.stripeIntent.u3();
        if (!(listU3 instanceof Collection) || !listU3.isEmpty()) {
            Iterator<T> it = listU3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                if (i0.f51229a.contains((String) it.next())) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        return (zContains && z11) || f();
    }

    public String toString() {
        return "ElementsSession(linkSettings=" + this.linkSettings + ", paymentMethodSpecs=" + this.paymentMethodSpecs + ", externalPaymentMethodData=" + this.externalPaymentMethodData + ", stripeIntent=" + this.stripeIntent + ", customer=" + this.customer + ", merchantCountry=" + this.merchantCountry + ", cardBrandChoice=" + this.cardBrandChoice + ", isGooglePayEnabled=" + this.isGooglePayEnabled + ", sessionsError=" + this.sessionsError + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        LinkSettings linkSettings = this.linkSettings;
        if (linkSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkSettings.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.paymentMethodSpecs);
        parcel.writeString(this.externalPaymentMethodData);
        parcel.writeParcelable(this.stripeIntent, flags);
        Customer customer = this.customer;
        if (customer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customer.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.merchantCountry);
        CardBrandChoice cardBrandChoice = this.cardBrandChoice;
        if (cardBrandChoice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cardBrandChoice.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isGooglePayEnabled ? 1 : 0);
        parcel.writeSerializable(this.sessionsError);
    }

    public /* synthetic */ ElementsSession(LinkSettings linkSettings, String str, String str2, StripeIntent stripeIntent, Customer customer, String str3, CardBrandChoice cardBrandChoice, boolean z11, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(linkSettings, str, str2, stripeIntent, customer, str3, cardBrandChoice, z11, (i11 & 256) != 0 ? null : th2);
    }
}
