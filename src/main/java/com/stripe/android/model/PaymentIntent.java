package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
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

/* JADX INFO: renamed from: com.stripe.android.model.u0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u0086\u00012\u00020\u0001:\u00075HLORY[B\u0099\u0002\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020\u00142\n\u0010,\u001a\u00060\u0002j\u0002`+H\u0002¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001000/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0014H\u0016¢\u0006\u0004\b3\u0010*J\u001b\u00104\u001a\u00020\u00142\n\u0010,\u001a\u00060\u0002j\u0002`+H\u0007¢\u0006\u0004\b4\u0010.J²\u0002\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u000209HÖ\u0001¢\u0006\u0004\b?\u0010;J \u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u000209HÖ\u0001¢\u0006\u0004\bD\u0010ER\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010F\u001a\u0004\bG\u00108R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bL\u0010NR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010QR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bR\u0010XR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010F\u001a\u0004\bZ\u00108R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\bV\u0010]R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010F\u001a\u0004\b_\u00108R\u001a\u0010\u0011\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010P\u001a\u0004\bY\u0010QR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010F\u001a\u0004\bb\u00108R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010F\u001a\u0004\b[\u00108R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010d\u001a\u0004\be\u0010*R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010F\u001a\u0004\bj\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010F\u001a\u0004\b`\u00108R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b)\u0010n\u001a\u0004\bo\u0010pR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\b^\u0010sR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bJ\u0010t\u001a\u0004\bc\u0010uR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010I\u001a\u0004\bw\u0010KR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010I\u001a\u0004\by\u0010KR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0016\u0010&\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010FR\u0019\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0084\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010*R\u0012\u0010\u0085\u0001\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\ba\u0010*¨\u0006\u0087\u0001"}, d2 = {"Lcom/stripe/android/model/u0;", "Lcom/stripe/android/model/StripeIntent;", "", "id", "", "paymentMethodTypes", "", "amount", "canceledAt", "Lcom/stripe/android/model/u0$a;", "cancellationReason", "Lcom/stripe/android/model/u0$b;", "captureMethod", "clientSecret", "Lcom/stripe/android/model/u0$e;", "confirmationMethod", "countryCode", "created", "currency", "description", "", "isLiveMode", "Lcom/stripe/android/model/v0;", "paymentMethod", "paymentMethodId", "receiptEmail", "Lcom/stripe/android/model/StripeIntent$Status;", PermissionsResponse.STATUS_KEY, "Lcom/stripe/android/model/StripeIntent$Usage;", "setupFutureUsage", "Lcom/stripe/android/model/u0$g;", "lastPaymentError", "Lcom/stripe/android/model/u0$h;", "shipping", "unactivatedPaymentMethods", "linkFundingSources", "Lcom/stripe/android/model/StripeIntent$a;", "nextActionData", "paymentMethodOptionsJsonString", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/u0$a;Lcom/stripe/android/model/u0$b;Ljava/lang/String;Lcom/stripe/android/model/u0$e;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/v0;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/u0$g;Lcom/stripe/android/model/u0$h;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$a;Ljava/lang/String;)V", "r", "()Z", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "m", "(Ljava/lang/String;)Z", "", "", "z2", "()Ljava/util/Map;", "f2", "q", "a", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/u0$a;Lcom/stripe/android/model/u0$b;Ljava/lang/String;Lcom/stripe/android/model/u0$e;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/v0;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/u0$g;Lcom/stripe/android/model/u0$h;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$a;Ljava/lang/String;)Lcom/stripe/android/model/u0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "b", "Ljava/util/List;", "t", "()Ljava/util/List;", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "J", "()J", "e", "Lcom/stripe/android/model/u0$a;", "getCancellationReason", "()Lcom/stripe/android/model/u0$a;", "f", "Lcom/stripe/android/model/u0$b;", "()Lcom/stripe/android/model/u0$b;", "g", "p", "h", "Lcom/stripe/android/model/u0$e;", "()Lcom/stripe/android/model/u0$e;", IntegerTokenConverter.CONVERTER_KEY, "getCountryCode", "j", "k", "getCurrency", "l", "Z", "n", "Lcom/stripe/android/model/v0;", "Z2", "()Lcom/stripe/android/model/v0;", "o", "z0", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "Lcom/stripe/android/model/StripeIntent$Usage;", "n0", "()Lcom/stripe/android/model/StripeIntent$Usage;", "s", "Lcom/stripe/android/model/u0$g;", "()Lcom/stripe/android/model/u0$g;", "Lcom/stripe/android/model/u0$h;", "()Lcom/stripe/android/model/u0$h;", "u", "m3", "v", "u3", "w", "Lcom/stripe/android/model/StripeIntent$a;", "O1", "()Lcom/stripe/android/model/StripeIntent$a;", "x", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "P0", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "nextActionType", "v3", "isConfirmed", "requireCvcRecollection", "y", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentIntent implements StripeIntent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> paymentMethodTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long amount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long canceledAt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a cancellationReason;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final b captureMethod;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final e confirmationMethod;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long created;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethod paymentMethod;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String receiptEmail;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent.Status status;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent.Usage setupFutureUsage;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Error lastPaymentError;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Shipping shipping;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> unactivatedPaymentMethods;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> linkFundingSources;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final StripeIntent.a nextActionData;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodOptionsJsonString;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f51476z = 8;
    public static final Parcelable.Creator<PaymentIntent> CREATOR = new f();

    /* JADX INFO: renamed from: com.stripe.android.model.u0$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/u0$a;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "Companion", "a", "Duplicate", "Fraudulent", "RequestedByCustomer", "Abandoned", "FailedInvoice", "VoidInvoice", "Automatic", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        Duplicate("duplicate"),
        Fraudulent("fraudulent"),
        RequestedByCustomer("requested_by_customer"),
        Abandoned("abandoned"),
        FailedInvoice("failed_invoice"),
        VoidInvoice("void_invoice"),
        Automatic("automatic");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.u0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/u0$a$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/u0$a;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/u0$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* JADX INFO: renamed from: com.stripe.android.model.u0$b */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/u0$b;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "a", "Automatic", "AutomaticAsync", "Manual", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        Automatic("automatic"),
        AutomaticAsync("automatic_async"),
        Manual("manual");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.u0$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/u0$b$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/u0$b;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/u0$b;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String code) {
                b next;
                Iterator<b> it = b.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p013kotlin.jvm.internal.s.f(next.getCode(), code));
                b bVar = next;
                return bVar == null ? b.Automatic : bVar;
            }

            private Companion() {
            }
        }

        b(String str) {
            this.code = str;
        }

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.u0$c, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/u0$c;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "paymentIntentId", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClientSecret {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f51502d = Pattern.compile("^pi_[^_]+_secret_[^_]+$");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String paymentIntentId;

        /* JADX INFO: renamed from: com.stripe.android.model.u0$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/u0$c$a;", "", "<init>", "()V", "", "value", "", "a", "(Ljava/lang/String;)Z", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN", "Ljava/util/regex/Pattern;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean a(String value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                return ClientSecret.f51502d.matcher(value).matches();
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
            this.paymentIntentId = ((String[]) listM.toArray(new String[0]))[0];
            if (INSTANCE.a(this.value)) {
                return;
            }
            throw new IllegalArgumentException(("Invalid Payment Intent client secret: " + this.value).toString());
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPaymentIntentId() {
            return this.paymentIntentId;
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

    /* JADX INFO: renamed from: com.stripe.android.model.u0$e */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/u0$e;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "Companion", "a", "Automatic", "Manual", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum e {
        Automatic("automatic"),
        Manual("manual");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.u0$e$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/u0$e$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/u0$e;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/u0$e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(String code) {
                e next;
                Iterator<e> it = e.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p013kotlin.jvm.internal.s.f(next.code, code));
                e eVar = next;
                return eVar == null ? e.Automatic : eVar;
            }

            private Companion() {
            }
        }

        e(String str) {
            this.code = str;
        }

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.u0$f */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f implements Parcelable.Creator<PaymentIntent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentIntent createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new PaymentIntent(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), b.valueOf(parcel.readString()), parcel.readString(), e.valueOf(parcel.readString()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Error.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Shipping.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.createStringArrayList(), (StripeIntent.a) parcel.readParcelable(PaymentIntent.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentIntent[] newArray(int i11) {
            return new PaymentIntent[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.u0$g, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0002\u000f&BY\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJp\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b&\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b'\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b)\u00102¨\u00064"}, d2 = {"Lcom/stripe/android/model/u0$g;", "Lt30/f;", "", "charge", "code", "declineCode", "docUrl", "message", "param", "Lcom/stripe/android/model/v0;", "paymentMethod", "Lcom/stripe/android/model/u0$g$c;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/u0$g$c;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/u0$g$c;)Lcom/stripe/android/model/u0$g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCharge", "b", "getCode", "c", DateTokenConverter.CONVERTER_KEY, "getDocUrl", "e", "f", "getParam", "g", "Lcom/stripe/android/model/v0;", "Z2", "()Lcom/stripe/android/model/v0;", "h", "Lcom/stripe/android/model/u0$g$c;", "()Lcom/stripe/android/model/u0$g$c;", IntegerTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements t30.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String charge;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String code;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String declineCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String docUrl;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String param;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentMethod paymentMethod;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final c type;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f51506j = 8;
        public static final Parcelable.Creator<Error> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.u0$g$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Error createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? c.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Error[] newArray(int i11) {
                return new Error[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.u0$g$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/u0$g$c;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "a", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

            /* JADX INFO: renamed from: com.stripe.android.model.u0$g$c$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/u0$g$c$a;", "", "<init>", "()V", "", "typeCode", "Lcom/stripe/android/model/u0$g$c;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/u0$g$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public Error(String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod v0Var, c cVar) {
            this.charge = str;
            this.code = str2;
            this.declineCode = str3;
            this.docUrl = str4;
            this.message = str5;
            this.param = str6;
            this.paymentMethod = v0Var;
            this.type = cVar;
        }

        public static /* synthetic */ Error b(Error error, String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod v0Var, c cVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.charge;
            }
            if ((i11 & 2) != 0) {
                str2 = error.code;
            }
            if ((i11 & 4) != 0) {
                str3 = error.declineCode;
            }
            if ((i11 & 8) != 0) {
                str4 = error.docUrl;
            }
            if ((i11 & 16) != 0) {
                str5 = error.message;
            }
            if ((i11 & 32) != 0) {
                str6 = error.param;
            }
            if ((i11 & 64) != 0) {
                v0Var = error.paymentMethod;
            }
            if ((i11 & 128) != 0) {
                cVar = error.type;
            }
            PaymentMethod v0Var2 = v0Var;
            c cVar2 = cVar;
            String str7 = str5;
            String str8 = str6;
            return error.a(str, str2, str3, str4, str7, str8, v0Var2, cVar2);
        }

        /* JADX INFO: renamed from: Z2, reason: from getter */
        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final Error a(String charge, String code, String declineCode, String docUrl, String message, String param, PaymentMethod paymentMethod, c type) {
            return new Error(charge, code, declineCode, docUrl, message, param, paymentMethod, type);
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
            return p013kotlin.jvm.internal.s.f(this.charge, error.charge) && p013kotlin.jvm.internal.s.f(this.code, error.code) && p013kotlin.jvm.internal.s.f(this.declineCode, error.declineCode) && p013kotlin.jvm.internal.s.f(this.docUrl, error.docUrl) && p013kotlin.jvm.internal.s.f(this.message, error.message) && p013kotlin.jvm.internal.s.f(this.param, error.param) && p013kotlin.jvm.internal.s.f(this.paymentMethod, error.paymentMethod) && this.type == error.type;
        }

        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            String str = this.charge;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.declineCode;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.docUrl;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.message;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.param;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            PaymentMethod v0Var = this.paymentMethod;
            int iHashCode7 = (iHashCode6 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
            c cVar = this.type;
            return iHashCode7 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "Error(charge=" + this.charge + ", code=" + this.code + ", declineCode=" + this.declineCode + ", docUrl=" + this.docUrl + ", message=" + this.message + ", param=" + this.param + ", paymentMethod=" + this.paymentMethod + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.charge);
            parcel.writeString(this.code);
            parcel.writeString(this.declineCode);
            parcel.writeString(this.docUrl);
            parcel.writeString(this.message);
            parcel.writeString(this.param);
            PaymentMethod v0Var = this.paymentMethod;
            if (v0Var == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                v0Var.writeToParcel(parcel, flags);
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

    /* JADX INFO: renamed from: com.stripe.android.model.u0$h, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b!\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b#\u0010\f¨\u0006%"}, d2 = {"Lcom/stripe/android/model/u0$h;", "Lt30/f;", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "", "carrier", "name", "phone", "trackingNumber", "<init>", "(Lcom/stripe/android/model/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/b;", "()Lcom/stripe/android/model/b;", "b", "Ljava/lang/String;", "c", "getName", DateTokenConverter.CONVERTER_KEY, "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Shipping implements t30.f {
        public static final Parcelable.Creator<Shipping> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Address address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carrier;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phone;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String trackingNumber;

        /* JADX INFO: renamed from: com.stripe.android.model.u0$h$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Shipping> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Shipping createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Shipping[] newArray(int i11) {
                return new Shipping[i11];
            }
        }

        public Shipping(Address address, String str, String str2, String str3, String str4) {
            p013kotlin.jvm.internal.s.k(address, "address");
            this.address = address;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCarrier() {
            return this.carrier;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shipping)) {
                return false;
            }
            Shipping shipping = (Shipping) other;
            return p013kotlin.jvm.internal.s.f(this.address, shipping.address) && p013kotlin.jvm.internal.s.f(this.carrier, shipping.carrier) && p013kotlin.jvm.internal.s.f(this.name, shipping.name) && p013kotlin.jvm.internal.s.f(this.phone, shipping.phone) && p013kotlin.jvm.internal.s.f(this.trackingNumber, shipping.trackingNumber);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int iHashCode = this.address.hashCode() * 31;
            String str = this.carrier;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackingNumber;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.address + ", carrier=" + this.carrier + ", name=" + this.name + ", phone=" + this.phone + ", trackingNumber=" + this.trackingNumber + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.address.writeToParcel(parcel, flags);
            parcel.writeString(this.carrier);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.u0$i */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51520a;

        static {
            int[] iArr = new int[StripeIntent.Usage.values().length];
            try {
                iArr[StripeIntent.Usage.OnSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Usage.OffSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StripeIntent.Usage.OneTime.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51520a = iArr;
        }
    }

    public PaymentIntent(String str, List<String> paymentMethodTypes, Long l11, long j11, a aVar, b captureMethod, String str2, e confirmationMethod, String str3, long j12, String str4, String str5, boolean z11, PaymentMethod v0Var, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.a aVar2, String str8) {
        p013kotlin.jvm.internal.s.k(paymentMethodTypes, "paymentMethodTypes");
        p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
        p013kotlin.jvm.internal.s.k(confirmationMethod, "confirmationMethod");
        p013kotlin.jvm.internal.s.k(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        p013kotlin.jvm.internal.s.k(linkFundingSources, "linkFundingSources");
        this.id = str;
        this.paymentMethodTypes = paymentMethodTypes;
        this.amount = l11;
        this.canceledAt = j11;
        this.cancellationReason = aVar;
        this.captureMethod = captureMethod;
        this.clientSecret = str2;
        this.confirmationMethod = confirmationMethod;
        this.countryCode = str3;
        this.created = j12;
        this.currency = str4;
        this.description = str5;
        this.isLiveMode = z11;
        this.paymentMethod = v0Var;
        this.paymentMethodId = str6;
        this.receiptEmail = str7;
        this.status = status;
        this.setupFutureUsage = usage;
        this.lastPaymentError = error;
        this.shipping = shipping;
        this.unactivatedPaymentMethods = unactivatedPaymentMethods;
        this.linkFundingSources = linkFundingSources;
        this.nextActionData = aVar2;
        this.paymentMethodOptionsJsonString = str8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentIntent b(PaymentIntent paymentIntent, String str, List list, Long l11, long j11, a aVar, b bVar, String str2, e eVar, String str3, long j12, String str4, String str5, boolean z11, PaymentMethod v0Var, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List list2, List list3, StripeIntent.a aVar2, String str8, int i11, Object obj) {
        String str9;
        StripeIntent.a aVar3;
        String str10 = (i11 & 1) != 0 ? paymentIntent.id : str;
        List list4 = (i11 & 2) != 0 ? paymentIntent.paymentMethodTypes : list;
        Long l12 = (i11 & 4) != 0 ? paymentIntent.amount : l11;
        long j13 = (i11 & 8) != 0 ? paymentIntent.canceledAt : j11;
        a aVar4 = (i11 & 16) != 0 ? paymentIntent.cancellationReason : aVar;
        b bVar2 = (i11 & 32) != 0 ? paymentIntent.captureMethod : bVar;
        String str11 = (i11 & 64) != 0 ? paymentIntent.clientSecret : str2;
        e eVar2 = (i11 & 128) != 0 ? paymentIntent.confirmationMethod : eVar;
        String str12 = (i11 & 256) != 0 ? paymentIntent.countryCode : str3;
        long j14 = (i11 & 512) != 0 ? paymentIntent.created : j12;
        String str13 = (i11 & 1024) != 0 ? paymentIntent.currency : str4;
        String str14 = (i11 & 2048) != 0 ? paymentIntent.description : str5;
        String str15 = str10;
        boolean z12 = (i11 & 4096) != 0 ? paymentIntent.isLiveMode : z11;
        PaymentMethod v0Var2 = (i11 & PKIFailureInfo.certRevoked) != 0 ? paymentIntent.paymentMethod : v0Var;
        String str16 = (i11 & 16384) != 0 ? paymentIntent.paymentMethodId : str6;
        String str17 = (i11 & 32768) != 0 ? paymentIntent.receiptEmail : str7;
        StripeIntent.Status status2 = (i11 & 65536) != 0 ? paymentIntent.status : status;
        StripeIntent.Usage usage2 = (i11 & 131072) != 0 ? paymentIntent.setupFutureUsage : usage;
        Error error2 = (i11 & 262144) != 0 ? paymentIntent.lastPaymentError : error;
        Shipping shipping2 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? paymentIntent.shipping : shipping;
        List list5 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? paymentIntent.unactivatedPaymentMethods : list2;
        List list6 = (i11 & PKIFailureInfo.badSenderNonce) != 0 ? paymentIntent.linkFundingSources : list3;
        StripeIntent.a aVar5 = (i11 & 4194304) != 0 ? paymentIntent.nextActionData : aVar2;
        if ((i11 & 8388608) != 0) {
            aVar3 = aVar5;
            str9 = paymentIntent.paymentMethodOptionsJsonString;
        } else {
            str9 = str8;
            aVar3 = aVar5;
        }
        return paymentIntent.a(str15, list4, l12, j13, aVar4, bVar2, str11, eVar2, str12, j14, str13, str14, z12, v0Var2, str16, str17, status2, usage2, error2, shipping2, list5, list6, aVar3, str9);
    }

    private final boolean m(String code) {
        JSONObject jSONObjectOptJSONObject;
        String str = this.paymentMethodOptionsJsonString;
        if (str == null || (jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(code)) == null) {
            return false;
        }
        return jSONObjectOptJSONObject.has("setup_future_usage");
    }

    private final boolean r() {
        StripeIntent.Usage usage = this.setupFutureUsage;
        int i11 = usage == null ? -1 : i.f51520a[usage.ordinal()];
        if (i11 == -1) {
            return false;
        }
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
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
        if (nextActionData instanceof StripeIntent.a.l) {
            return StripeIntent.NextActionType.UpiAwaitNotification;
        }
        if (nextActionData instanceof StripeIntent.a.CashAppRedirect) {
            return StripeIntent.NextActionType.CashAppRedirect;
        }
        if (nextActionData instanceof StripeIntent.a.b) {
            return StripeIntent.NextActionType.BlikAuthorize;
        }
        if (nextActionData instanceof StripeIntent.a.SwishRedirect) {
            return StripeIntent.NextActionType.SwishRedirect;
        }
        boolean z11 = true;
        if (!(nextActionData instanceof StripeIntent.a.AlipayRedirect ? true : nextActionData instanceof StripeIntent.a.WeChatPayRedirect) && nextActionData != null) {
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

    public final PaymentIntent a(String id2, List<String> paymentMethodTypes, Long amount, long canceledAt, a cancellationReason, b captureMethod, String clientSecret, e confirmationMethod, String countryCode, long created, String currency, String description, boolean isLiveMode, PaymentMethod paymentMethod, String paymentMethodId, String receiptEmail, StripeIntent.Status status, StripeIntent.Usage setupFutureUsage, Error lastPaymentError, Shipping shipping, List<String> unactivatedPaymentMethods, List<String> linkFundingSources, StripeIntent.a nextActionData, String paymentMethodOptionsJsonString) {
        p013kotlin.jvm.internal.s.k(paymentMethodTypes, "paymentMethodTypes");
        p013kotlin.jvm.internal.s.k(captureMethod, "captureMethod");
        p013kotlin.jvm.internal.s.k(confirmationMethod, "confirmationMethod");
        p013kotlin.jvm.internal.s.k(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        p013kotlin.jvm.internal.s.k(linkFundingSources, "linkFundingSources");
        return new PaymentIntent(id2, paymentMethodTypes, amount, canceledAt, cancellationReason, captureMethod, clientSecret, confirmationMethod, countryCode, created, currency, description, isLiveMode, paymentMethod, paymentMethodId, receiptEmail, status, setupFutureUsage, lastPaymentError, shipping, unactivatedPaymentMethods, linkFundingSources, nextActionData, paymentMethodOptionsJsonString);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCanceledAt() {
        return this.canceledAt;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getCaptureMethod() {
        return this.captureMethod;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentIntent)) {
            return false;
        }
        PaymentIntent paymentIntent = (PaymentIntent) other;
        return p013kotlin.jvm.internal.s.f(this.id, paymentIntent.id) && p013kotlin.jvm.internal.s.f(this.paymentMethodTypes, paymentIntent.paymentMethodTypes) && p013kotlin.jvm.internal.s.f(this.amount, paymentIntent.amount) && this.canceledAt == paymentIntent.canceledAt && this.cancellationReason == paymentIntent.cancellationReason && this.captureMethod == paymentIntent.captureMethod && p013kotlin.jvm.internal.s.f(this.clientSecret, paymentIntent.clientSecret) && this.confirmationMethod == paymentIntent.confirmationMethod && p013kotlin.jvm.internal.s.f(this.countryCode, paymentIntent.countryCode) && this.created == paymentIntent.created && p013kotlin.jvm.internal.s.f(this.currency, paymentIntent.currency) && p013kotlin.jvm.internal.s.f(this.description, paymentIntent.description) && this.isLiveMode == paymentIntent.isLiveMode && p013kotlin.jvm.internal.s.f(this.paymentMethod, paymentIntent.paymentMethod) && p013kotlin.jvm.internal.s.f(this.paymentMethodId, paymentIntent.paymentMethodId) && p013kotlin.jvm.internal.s.f(this.receiptEmail, paymentIntent.receiptEmail) && this.status == paymentIntent.status && this.setupFutureUsage == paymentIntent.setupFutureUsage && p013kotlin.jvm.internal.s.f(this.lastPaymentError, paymentIntent.lastPaymentError) && p013kotlin.jvm.internal.s.f(this.shipping, paymentIntent.shipping) && p013kotlin.jvm.internal.s.f(this.unactivatedPaymentMethods, paymentIntent.unactivatedPaymentMethods) && p013kotlin.jvm.internal.s.f(this.linkFundingSources, paymentIntent.linkFundingSources) && p013kotlin.jvm.internal.s.f(this.nextActionData, paymentIntent.nextActionData) && p013kotlin.jvm.internal.s.f(this.paymentMethodOptionsJsonString, paymentIntent.paymentMethodOptionsJsonString);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getConfirmationMethod() {
        return this.confirmationMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean f2() {
        return getStatus() == StripeIntent.Status.RequiresAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public long getCreated() {
        return this.created;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.id;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public String getDescription() {
        return this.description;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.paymentMethodTypes.hashCode()) * 31;
        Long l11 = this.amount;
        int iHashCode2 = (((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + Long.hashCode(this.canceledAt)) * 31;
        a aVar = this.cancellationReason;
        int iHashCode3 = (((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.captureMethod.hashCode()) * 31;
        String str2 = this.clientSecret;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.confirmationMethod.hashCode()) * 31;
        String str3 = this.countryCode;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.created)) * 31;
        String str4 = this.currency;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode7 = (((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.isLiveMode)) * 31;
        PaymentMethod v0Var = this.paymentMethod;
        int iHashCode8 = (iHashCode7 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        String str6 = this.paymentMethodId;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.receiptEmail;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        StripeIntent.Status status = this.status;
        int iHashCode11 = (iHashCode10 + (status == null ? 0 : status.hashCode())) * 31;
        StripeIntent.Usage usage = this.setupFutureUsage;
        int iHashCode12 = (iHashCode11 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastPaymentError;
        int iHashCode13 = (iHashCode12 + (error == null ? 0 : error.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int iHashCode14 = (((((iHashCode13 + (shipping == null ? 0 : shipping.hashCode())) * 31) + this.unactivatedPaymentMethods.hashCode()) * 31) + this.linkFundingSources.hashCode()) * 31;
        StripeIntent.a aVar2 = this.nextActionData;
        int iHashCode15 = (iHashCode14 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str8 = this.paymentMethodOptionsJsonString;
        return iHashCode15 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Error getLastPaymentError() {
        return this.lastPaymentError;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    public final boolean k() {
        JSONObject jSONObjectOptJSONObject;
        String str = this.paymentMethodOptionsJsonString;
        if (str == null || (jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("card")) == null) {
            return false;
        }
        return jSONObjectOptJSONObject.optBoolean("require_cvc_recollection");
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Shipping getShipping() {
        return this.shipping;
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

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final StripeIntent.Usage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    @Override // com.stripe.android.model.StripeIntent
    /* JADX INFO: renamed from: p, reason: from getter */
    public String getClientSecret() {
        return this.clientSecret;
    }

    public final boolean q(String code) {
        p013kotlin.jvm.internal.s.k(code, "code");
        return r() || m(code);
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> t() {
        return this.paymentMethodTypes;
    }

    public String toString() {
        return "PaymentIntent(id=" + this.id + ", paymentMethodTypes=" + this.paymentMethodTypes + ", amount=" + this.amount + ", canceledAt=" + this.canceledAt + ", cancellationReason=" + this.cancellationReason + ", captureMethod=" + this.captureMethod + ", clientSecret=" + this.clientSecret + ", confirmationMethod=" + this.confirmationMethod + ", countryCode=" + this.countryCode + ", created=" + this.created + ", currency=" + this.currency + ", description=" + this.description + ", isLiveMode=" + this.isLiveMode + ", paymentMethod=" + this.paymentMethod + ", paymentMethodId=" + this.paymentMethodId + ", receiptEmail=" + this.receiptEmail + ", status=" + this.status + ", setupFutureUsage=" + this.setupFutureUsage + ", lastPaymentError=" + this.lastPaymentError + ", shipping=" + this.shipping + ", unactivatedPaymentMethods=" + this.unactivatedPaymentMethods + ", linkFundingSources=" + this.linkFundingSources + ", nextActionData=" + this.nextActionData + ", paymentMethodOptionsJsonString=" + this.paymentMethodOptionsJsonString + ")";
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> u3() {
        return this.linkFundingSources;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean v3() {
        return p013kotlin.collections.v.g0(p013kotlin.collections.d1.i(StripeIntent.Status.Processing, StripeIntent.Status.RequiresCapture, StripeIntent.Status.Succeeded), getStatus());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeStringList(this.paymentMethodTypes);
        Long l11 = this.amount;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        parcel.writeLong(this.canceledAt);
        a aVar = this.cancellationReason;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        parcel.writeString(this.captureMethod.name());
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.confirmationMethod.name());
        parcel.writeString(this.countryCode);
        parcel.writeLong(this.created);
        parcel.writeString(this.currency);
        parcel.writeString(this.description);
        parcel.writeInt(this.isLiveMode ? 1 : 0);
        PaymentMethod v0Var = this.paymentMethod;
        if (v0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            v0Var.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.paymentMethodId);
        parcel.writeString(this.receiptEmail);
        StripeIntent.Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        StripeIntent.Usage usage = this.setupFutureUsage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        Error error = this.lastPaymentError;
        if (error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            error.writeToParcel(parcel, flags);
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shipping.writeToParcel(parcel, flags);
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

    public /* synthetic */ PaymentIntent(String str, List list, Long l11, long j11, a aVar, b bVar, String str2, e eVar, String str3, long j12, String str4, String str5, boolean z11, PaymentMethod v0Var, String str6, String str7, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List list2, List list3, StripeIntent.a aVar2, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, l11, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? null : aVar, (i11 & 32) != 0 ? b.Automatic : bVar, str2, (i11 & 128) != 0 ? e.Automatic : eVar, str3, j12, str4, (i11 & 2048) != 0 ? null : str5, z11, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : v0Var, (i11 & 16384) != 0 ? null : str6, (32768 & i11) != 0 ? null : str7, (65536 & i11) != 0 ? null : status, (131072 & i11) != 0 ? null : usage, (262144 & i11) != 0 ? null : error, (524288 & i11) != 0 ? null : shipping, list2, (2097152 & i11) != 0 ? p013kotlin.collections.v.m() : list3, (4194304 & i11) != 0 ? null : aVar2, (i11 & 8388608) != 0 ? null : str8);
    }
}
