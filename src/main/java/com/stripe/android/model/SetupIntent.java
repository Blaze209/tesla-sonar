package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.d1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 h2\u00020\u0001:\u0004%8<ABÁ\u0001\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$Jä\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020)HÖ\u0001¢\u0006\u0004\b/\u0010+J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020)HÖ\u0001¢\u0006\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\b7\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\bB\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\b?\u0010(R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u0010(R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bC\u0010WR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bA\u0010ZR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\b[\u0010PR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010N\u001a\u0004\b]\u0010PR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010^\u001a\u0004\b_\u0010`R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u00106R\u0016\u0010e\u001a\u0004\u0018\u00010b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010g\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010$¨\u0006i"}, d2 = {"Lcom/stripe/android/model/d1;", "Lcom/stripe/android/model/StripeIntent;", "", "id", "Lcom/stripe/android/model/d1$a;", "cancellationReason", "", "created", "countryCode", "clientSecret", "description", "", "isLiveMode", "Lcom/stripe/android/model/v0;", "paymentMethod", "paymentMethodId", "", "paymentMethodTypes", "Lcom/stripe/android/model/StripeIntent$Status;", PermissionsResponse.STATUS_KEY, "Lcom/stripe/android/model/StripeIntent$Usage;", "usage", "Lcom/stripe/android/model/d1$e;", "lastSetupError", "unactivatedPaymentMethods", "linkFundingSources", "Lcom/stripe/android/model/StripeIntent$a;", "nextActionData", "paymentMethodOptionsJsonString", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/d1$a;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/v0;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/d1$e;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$a;Ljava/lang/String;)V", "", "", "z2", "()Ljava/util/Map;", "f2", "()Z", "a", "(Ljava/lang/String;Lcom/stripe/android/model/d1$a;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/v0;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/d1$e;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$a;Ljava/lang/String;)Lcom/stripe/android/model/d1;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "b", "Lcom/stripe/android/model/d1$a;", "getCancellationReason", "()Lcom/stripe/android/model/d1$a;", "c", "J", "()J", DateTokenConverter.CONVERTER_KEY, "getCountryCode", "e", "p", "f", "g", "Z", "n", "h", "Lcom/stripe/android/model/v0;", "Z2", "()Lcom/stripe/android/model/v0;", IntegerTokenConverter.CONVERTER_KEY, "z0", "j", "Ljava/util/List;", "t", "()Ljava/util/List;", "k", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "l", "Lcom/stripe/android/model/StripeIntent$Usage;", "()Lcom/stripe/android/model/StripeIntent$Usage;", "m", "Lcom/stripe/android/model/d1$e;", "()Lcom/stripe/android/model/d1$e;", "m3", "o", "u3", "Lcom/stripe/android/model/StripeIntent$a;", "O1", "()Lcom/stripe/android/model/StripeIntent$a;", "q", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "P0", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "nextActionType", "v3", "isConfirmed", "r", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SetupIntent implements StripeIntent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a cancellationReason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long created;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethod paymentMethod;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> paymentMethodTypes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent.Status status;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent.Usage usage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Error lastSetupError;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> unactivatedPaymentMethods;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> linkFundingSources;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent.a nextActionData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodOptionsJsonString;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f51100s = 8;
    public static final Parcelable.Creator<SetupIntent> CREATOR = new d();

    /* JADX INFO: renamed from: com.stripe.android.model.d1$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/d1$a;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "Companion", "a", "Duplicate", "RequestedByCustomer", "Abandoned", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        Duplicate("duplicate"),
        RequestedByCustomer("requested_by_customer"),
        Abandoned("abandoned");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.d1$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/d1$a$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/d1$a;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/d1$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String code) {
                a next;
                Iterator<a> it = a.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.code, code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        a(String str) {
            this.code = str;
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.d1$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/d1$b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "setupIntentId", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientSecret {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f51119d = Pattern.compile("^seti_[^_]+_secret_[^_]+$");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String setupIntentId;

        /* JADX INFO: renamed from: com.stripe.android.model.d1$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/d1$b$a;", "", "<init>", "()V", "", "value", "", "a", "(Ljava/lang/String;)Z", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN", "Ljava/util/regex/Pattern;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean a(String value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                return ClientSecret.f51119d.matcher(value).matches();
            }

            private Companion() {
            }
        }

        public ClientSecret(String value) {
            List listM;
            p013kotlin.jvm.internal.s.k(value, "value");
            this.value = value;
            List<String> listM2 = new p013kotlin.text.q("_secret").m(value, 0);
            if (!listM2.isEmpty()) {
                ListIterator<String> listIterator = listM2.listIterator(listM2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listM = p013kotlin.collections.v.m();
                        break;
                    } else if (listIterator.previous().length() != 0) {
                        listM = p013kotlin.collections.v.d1(listM2, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listM = p013kotlin.collections.v.m();
                break;
            }
            this.setupIntentId = ((String[]) listM.toArray(new String[0]))[0];
            if (INSTANCE.a(this.value)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Setup Intent client secret: " + this.value).toString());
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSetupIntentId() {
            return this.setupIntentId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClientSecret) && p013kotlin.jvm.internal.s.f(this.value, ((ClientSecret) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.d1$d */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Parcelable.Creator<SetupIntent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SetupIntent createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new SetupIntent(parcel.readString(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? Error.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(SetupIntent.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SetupIntent[] newArray(int i11) {
            return new SetupIntent[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.d1$e, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002\u000e$BO\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJd\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b'\u0010/¨\u00061"}, d2 = {"Lcom/stripe/android/model/d1$e;", "Lt30/f;", "", "code", "declineCode", "docUrl", "message", "param", "Lcom/stripe/android/model/v0;", "paymentMethod", "Lcom/stripe/android/model/d1$e$c;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/d1$e$c;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/d1$e$c;)Lcom/stripe/android/model/d1$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCode", "b", "c", "getDocUrl", DateTokenConverter.CONVERTER_KEY, "e", "getParam", "f", "Lcom/stripe/android/model/v0;", "Z2", "()Lcom/stripe/android/model/v0;", "g", "Lcom/stripe/android/model/d1$e$c;", "()Lcom/stripe/android/model/d1$e$c;", "h", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements t30.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String declineCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String docUrl;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String param;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentMethod paymentMethod;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final c type;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f51123i = 8;
        public static final Parcelable.Creator<Error> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.d1$e$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Error createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? c.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Error[] newArray(int i11) {
                return new Error[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.d1$e$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/d1$e$c;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "a", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum c {
            ApiConnectionError("api_connection_error"),
            ApiError("api_error"),
            AuthenticationError("authentication_error"),
            CardError("card_error"),
            IdempotencyError("idempotency_error"),
            InvalidRequestError("invalid_request_error"),
            RateLimitError("rate_limit_error");

            private final String code;
            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: com.stripe.android.model.d1$e$c$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/d1$e$c$a;", "", "<init>", "()V", "", "typeCode", "Lcom/stripe/android/model/d1$e$c;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/d1$e$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final c a(String typeCode) {
                    c next;
                    Iterator<c> it = c.getEntries().iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (p013kotlin.jvm.internal.s.f(next.getCode(), typeCode)) {
                            return next;
                        }
                    }
                    next = null;
                    return next;
                }

                private Companion() {
                }
            }

            c(String str) {
                this.code = str;
            }

            public static EnumEntries<c> getEntries() {
                return $ENTRIES;
            }

            public final String getCode() {
                return this.code;
            }
        }

        public Error(String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, c cVar) {
            this.code = str;
            this.declineCode = str2;
            this.docUrl = str3;
            this.message = str4;
            this.param = str5;
            this.paymentMethod = paymentMethod;
            this.type = cVar;
        }

        public static /* synthetic */ Error b(Error error, String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, c cVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.code;
            }
            if ((i11 & 2) != 0) {
                str2 = error.declineCode;
            }
            if ((i11 & 4) != 0) {
                str3 = error.docUrl;
            }
            if ((i11 & 8) != 0) {
                str4 = error.message;
            }
            if ((i11 & 16) != 0) {
                str5 = error.param;
            }
            if ((i11 & 32) != 0) {
                paymentMethod = error.paymentMethod;
            }
            if ((i11 & 64) != 0) {
                cVar = error.type;
            }
            PaymentMethod paymentMethod2 = paymentMethod;
            c cVar2 = cVar;
            String str6 = str5;
            String str7 = str3;
            return error.a(str, str2, str7, str4, str6, paymentMethod2, cVar2);
        }

        /* JADX INFO: renamed from: Z2, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final Error a(String code, String declineCode, String docUrl, String message, String param, PaymentMethod paymentMethod, c type) {
            return new Error(code, declineCode, docUrl, message, param, paymentMethod, type);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDeclineCode() {
            return this.declineCode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final c getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return p013kotlin.jvm.internal.s.f(this.code, error.code) && p013kotlin.jvm.internal.s.f(this.declineCode, error.declineCode) && p013kotlin.jvm.internal.s.f(this.docUrl, error.docUrl) && p013kotlin.jvm.internal.s.f(this.message, error.message) && p013kotlin.jvm.internal.s.f(this.param, error.param) && p013kotlin.jvm.internal.s.f(this.paymentMethod, error.paymentMethod) && this.type == error.type;
        }

        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.declineCode;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.docUrl;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.param;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int iHashCode6 = (iHashCode5 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            c cVar = this.type;
            return iHashCode6 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "Error(code=" + this.code + ", declineCode=" + this.declineCode + ", docUrl=" + this.docUrl + ", message=" + this.message + ", param=" + this.param + ", paymentMethod=" + this.paymentMethod + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.code);
            parcel.writeString(this.declineCode);
            parcel.writeString(this.docUrl);
            parcel.writeString(this.message);
            parcel.writeString(this.param);
            PaymentMethod paymentMethod = this.paymentMethod;
            if (paymentMethod == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                paymentMethod.writeToParcel(parcel, flags);
            }
            c cVar = this.type;
            if (cVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(cVar.name());
            }
        }
    }

    public SetupIntent(String str, a aVar, long j11, String str2, String str3, String str4, boolean z11, PaymentMethod paymentMethod, String str5, List<String> paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.a aVar2, String str6) {
        p013kotlin.jvm.internal.s.k(paymentMethodTypes, "paymentMethodTypes");
        p013kotlin.jvm.internal.s.k(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        p013kotlin.jvm.internal.s.k(linkFundingSources, "linkFundingSources");
        this.id = str;
        this.cancellationReason = aVar;
        this.created = j11;
        this.countryCode = str2;
        this.clientSecret = str3;
        this.description = str4;
        this.isLiveMode = z11;
        this.paymentMethod = paymentMethod;
        this.paymentMethodId = str5;
        this.paymentMethodTypes = paymentMethodTypes;
        this.status = status;
        this.usage = usage;
        this.lastSetupError = error;
        this.unactivatedPaymentMethods = unactivatedPaymentMethods;
        this.linkFundingSources = linkFundingSources;
        this.nextActionData = aVar2;
        this.paymentMethodOptionsJsonString = str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetupIntent b(SetupIntent setupIntent, String str, a aVar, long j11, String str2, String str3, String str4, boolean z11, PaymentMethod paymentMethod, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List list2, List list3, StripeIntent.a aVar2, String str6, int i11, Object obj) {
        String str7;
        StripeIntent.a aVar3;
        String str8 = (i11 & 1) != 0 ? setupIntent.id : str;
        a aVar4 = (i11 & 2) != 0 ? setupIntent.cancellationReason : aVar;
        long j12 = (i11 & 4) != 0 ? setupIntent.created : j11;
        String str9 = (i11 & 8) != 0 ? setupIntent.countryCode : str2;
        String str10 = (i11 & 16) != 0 ? setupIntent.clientSecret : str3;
        String str11 = (i11 & 32) != 0 ? setupIntent.description : str4;
        boolean z12 = (i11 & 64) != 0 ? setupIntent.isLiveMode : z11;
        PaymentMethod paymentMethod2 = (i11 & 128) != 0 ? setupIntent.paymentMethod : paymentMethod;
        String str12 = (i11 & 256) != 0 ? setupIntent.paymentMethodId : str5;
        List list4 = (i11 & 512) != 0 ? setupIntent.paymentMethodTypes : list;
        StripeIntent.Status status2 = (i11 & 1024) != 0 ? setupIntent.status : status;
        StripeIntent.Usage usage2 = (i11 & 2048) != 0 ? setupIntent.usage : usage;
        Error error2 = (i11 & 4096) != 0 ? setupIntent.lastSetupError : error;
        String str13 = str8;
        List list5 = (i11 & PKIFailureInfo.certRevoked) != 0 ? setupIntent.unactivatedPaymentMethods : list2;
        List list6 = (i11 & 16384) != 0 ? setupIntent.linkFundingSources : list3;
        StripeIntent.a aVar5 = (i11 & 32768) != 0 ? setupIntent.nextActionData : aVar2;
        if ((i11 & 65536) != 0) {
            aVar3 = aVar5;
            str7 = setupIntent.paymentMethodOptionsJsonString;
        } else {
            str7 = str6;
            aVar3 = aVar5;
        }
        return setupIntent.a(str13, aVar4, j12, str9, str10, str11, z12, paymentMethod2, str12, list4, status2, usage2, error2, list5, list6, aVar3, str7);
    }

    @Override // com.stripe.android.model.StripeIntent
    /* JADX INFO: renamed from: O1, reason: from getter */
    public StripeIntent.a getNextActionData() {
        return this.nextActionData;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType P0() {
        StripeIntent.a nextActionData = getNextActionData();
        if (nextActionData instanceof StripeIntent.a.j) {
            return StripeIntent.NextActionType.UseStripeSdk;
        }
        if (nextActionData instanceof StripeIntent.a.RedirectToUrl) {
            return StripeIntent.NextActionType.RedirectToUrl;
        }
        if (nextActionData instanceof StripeIntent.a.DisplayOxxoDetails) {
            return StripeIntent.NextActionType.DisplayOxxoDetails;
        }
        if (nextActionData instanceof StripeIntent.a.DisplayBoletoDetails) {
            return StripeIntent.NextActionType.DisplayBoletoDetails;
        }
        if (nextActionData instanceof StripeIntent.a.DisplayKonbiniDetails) {
            return StripeIntent.NextActionType.DisplayKonbiniDetails;
        }
        if (nextActionData instanceof StripeIntent.a.DisplayMultibancoDetails) {
            return StripeIntent.NextActionType.DisplayMultibancoDetails;
        }
        if (nextActionData instanceof StripeIntent.a.VerifyWithMicrodeposits) {
            return StripeIntent.NextActionType.VerifyWithMicrodeposits;
        }
        if (nextActionData instanceof StripeIntent.a.CashAppRedirect) {
            return StripeIntent.NextActionType.CashAppRedirect;
        }
        boolean z11 = true;
        if (!(nextActionData instanceof StripeIntent.a.AlipayRedirect ? true : nextActionData instanceof StripeIntent.a.b ? true : nextActionData instanceof StripeIntent.a.WeChatPayRedirect ? true : nextActionData instanceof StripeIntent.a.l ? true : nextActionData instanceof StripeIntent.a.SwishRedirect) && nextActionData != null) {
            z11 = false;
        }
        if (z11) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.stripe.android.model.StripeIntent
    /* JADX INFO: renamed from: Z2, reason: from getter */
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final SetupIntent a(String id2, a cancellationReason, long created, String countryCode, String clientSecret, String description, boolean isLiveMode, PaymentMethod paymentMethod, String paymentMethodId, List<String> paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, Error lastSetupError, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.a nextActionData, String paymentMethodOptionsJsonString) {
        p013kotlin.jvm.internal.s.k(paymentMethodTypes, "paymentMethodTypes");
        p013kotlin.jvm.internal.s.k(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        p013kotlin.jvm.internal.s.k(linkFundingSources, "linkFundingSources");
        return new SetupIntent(id2, cancellationReason, created, countryCode, clientSecret, description, isLiveMode, paymentMethod, paymentMethodId, paymentMethodTypes, status, usage, lastSetupError, unactivatedPaymentMethods, linkFundingSources, nextActionData, paymentMethodOptionsJsonString);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public long getCreated() {
        return this.created;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getDescription() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Error getLastSetupError() {
        return this.lastSetupError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupIntent)) {
            return false;
        }
        SetupIntent setupIntent = (SetupIntent) other;
        return p013kotlin.jvm.internal.s.f(this.id, setupIntent.id) && this.cancellationReason == setupIntent.cancellationReason && this.created == setupIntent.created && p013kotlin.jvm.internal.s.f(this.countryCode, setupIntent.countryCode) && p013kotlin.jvm.internal.s.f(this.clientSecret, setupIntent.clientSecret) && p013kotlin.jvm.internal.s.f(this.description, setupIntent.description) && this.isLiveMode == setupIntent.isLiveMode && p013kotlin.jvm.internal.s.f(this.paymentMethod, setupIntent.paymentMethod) && p013kotlin.jvm.internal.s.f(this.paymentMethodId, setupIntent.paymentMethodId) && p013kotlin.jvm.internal.s.f(this.paymentMethodTypes, setupIntent.paymentMethodTypes) && this.status == setupIntent.status && this.usage == setupIntent.usage && p013kotlin.jvm.internal.s.f(this.lastSetupError, setupIntent.lastSetupError) && p013kotlin.jvm.internal.s.f(this.unactivatedPaymentMethods, setupIntent.unactivatedPaymentMethods) && p013kotlin.jvm.internal.s.f(this.linkFundingSources, setupIntent.linkFundingSources) && p013kotlin.jvm.internal.s.f(this.nextActionData, setupIntent.nextActionData) && p013kotlin.jvm.internal.s.f(this.paymentMethodOptionsJsonString, setupIntent.paymentMethodOptionsJsonString);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final StripeIntent.Usage getUsage() {
        return this.usage;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean f2() {
        return getStatus() == StripeIntent.Status.RequiresAction;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.id;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        a aVar = this.cancellationReason;
        int iHashCode2 = (((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Long.hashCode(this.created)) * 31;
        String str2 = this.countryCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientSecret;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isLiveMode)) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int iHashCode6 = (iHashCode5 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        String str5 = this.paymentMethodId;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.paymentMethodTypes.hashCode()) * 31;
        StripeIntent.Status status = this.status;
        int iHashCode8 = (iHashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.usage;
        int iHashCode9 = (iHashCode8 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastSetupError;
        int iHashCode10 = (((((iHashCode9 + (error == null ? 0 : error.hashCode())) * 31) + this.unactivatedPaymentMethods.hashCode()) * 31) + this.linkFundingSources.hashCode()) * 31;
        StripeIntent.a aVar2 = this.nextActionData;
        int iHashCode11 = (iHashCode10 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str6 = this.paymentMethodOptionsJsonString;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> m3() {
        return this.unactivatedPaymentMethods;
    }

    @Override // com.stripe.android.model.StripeIntent
    /* JADX INFO: renamed from: n, reason: from getter */
    public boolean getIsLiveMode() {
        return this.isLiveMode;
    }

    @Override // com.stripe.android.model.StripeIntent
    /* JADX INFO: renamed from: p, reason: from getter */
    public String getClientSecret() {
        return this.clientSecret;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> t() {
        return this.paymentMethodTypes;
    }

    public String toString() {
        return "SetupIntent(id=" + this.id + ", cancellationReason=" + this.cancellationReason + ", created=" + this.created + ", countryCode=" + this.countryCode + ", clientSecret=" + this.clientSecret + ", description=" + this.description + ", isLiveMode=" + this.isLiveMode + ", paymentMethod=" + this.paymentMethod + ", paymentMethodId=" + this.paymentMethodId + ", paymentMethodTypes=" + this.paymentMethodTypes + ", status=" + this.status + ", usage=" + this.usage + ", lastSetupError=" + this.lastSetupError + ", unactivatedPaymentMethods=" + this.unactivatedPaymentMethods + ", linkFundingSources=" + this.linkFundingSources + ", nextActionData=" + this.nextActionData + ", paymentMethodOptionsJsonString=" + this.paymentMethodOptionsJsonString + ")";
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> u3() {
        return this.linkFundingSources;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean v3() {
        return p013kotlin.collections.v.g0(p013kotlin.collections.d1.i(StripeIntent.Status.Processing, StripeIntent.Status.Succeeded), getStatus());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        a aVar = this.cancellationReason;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeLong(this.created);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.description);
        parcel.writeInt(this.isLiveMode ? 1 : 0);
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethod.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.paymentMethodId);
        parcel.writeStringList(this.paymentMethodTypes);
        StripeIntent.Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        StripeIntent.Usage usage = this.usage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        Error error = this.lastSetupError;
        if (error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            error.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.unactivatedPaymentMethods);
        parcel.writeStringList(this.linkFundingSources);
        parcel.writeParcelable(this.nextActionData, flags);
        parcel.writeString(this.paymentMethodOptionsJsonString);
    }

    @Override // com.stripe.android.model.StripeIntent
    /* JADX INFO: renamed from: z0, reason: from getter */
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    @Override // com.stripe.android.model.StripeIntent
    public Map<String, Object> z2() {
        Map<String, Object> mapB;
        String str = this.paymentMethodOptionsJsonString;
        return (str == null || (mapB = t30.e.f112281a.b(new JSONObject(str))) == null) ? p013kotlin.collections.v0.i() : mapB;
    }

    public /* synthetic */ SetupIntent(String str, a aVar, long j11, String str2, String str3, String str4, boolean z11, PaymentMethod paymentMethod, String str5, List list, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List list2, List list3, StripeIntent.a aVar2, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aVar, j11, str2, str3, str4, z11, (i11 & 128) != 0 ? null : paymentMethod, str5, list, status, usage, (i11 & 4096) != 0 ? null : error, list2, list3, aVar2, (i11 & 65536) != 0 ? null : str6);
    }
}
