package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.l, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b9\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0003!83B«\u0001\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J´\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020%HÖ\u0001¢\u0006\u0004\b+\u0010'J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020%HÖ\u0001¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u00106\u001a\u0004\b<\u0010$R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u0010$R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b@\u0010$\"\u0004\bA\u0010BR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010J\u001a\u0004\b=\u0010K\"\u0004\bL\u0010MR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u00106\u001a\u0004\bO\u0010$\"\u0004\bP\u0010BR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\bH\u0010aR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u00106\u001a\u0004\bc\u0010$\"\u0004\bd\u0010BR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010 R\"\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 ¨\u0006h"}, d2 = {"Lcom/stripe/android/model/l;", "Lcom/stripe/android/model/n;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "", "paymentMethodId", "Lcom/stripe/android/model/j1;", "sourceParams", "sourceId", "clientSecret", "returnUrl", "", "savePaymentMethod", "useStripeSdk", "Lcom/stripe/android/model/y0;", "paymentMethodOptions", "mandateId", "Lcom/stripe/android/model/q0;", "mandateData", "Lcom/stripe/android/model/l$c;", "setupFutureUsage", "Lcom/stripe/android/model/l$d;", "shipping", "receiptEmail", "<init>", "(Lcom/stripe/android/model/w0;Ljava/lang/String;Lcom/stripe/android/model/j1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/y0;Ljava/lang/String;Lcom/stripe/android/model/q0;Lcom/stripe/android/model/l$c;Lcom/stripe/android/model/l$d;Ljava/lang/String;)V", "shouldUseStripeSdk", IntegerTokenConverter.CONVERTER_KEY, "(Z)Lcom/stripe/android/model/l;", "", "", "c3", "()Ljava/util/Map;", "a", "(Lcom/stripe/android/model/w0;Ljava/lang/String;Lcom/stripe/android/model/j1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/y0;Ljava/lang/String;Lcom/stripe/android/model/q0;Lcom/stripe/android/model/l$c;Lcom/stripe/android/model/l$d;Ljava/lang/String;)Lcom/stripe/android/model/l;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/w0;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/model/w0;", "b", "Ljava/lang/String;", "getPaymentMethodId", "c", "Lcom/stripe/android/model/j1;", "g", "()Lcom/stripe/android/model/j1;", "getSourceId", "e", "p", "f", "getReturnUrl", "L3", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getSavePaymentMethod", "()Ljava/lang/Boolean;", "setSavePaymentMethod", "(Ljava/lang/Boolean;)V", "h", "Z", "Lcom/stripe/android/model/y0;", "()Lcom/stripe/android/model/y0;", "setPaymentMethodOptions", "(Lcom/stripe/android/model/y0;)V", "j", "getMandateId", "setMandateId", "k", "Lcom/stripe/android/model/q0;", "getMandateData", "()Lcom/stripe/android/model/q0;", "setMandateData", "(Lcom/stripe/android/model/q0;)V", "l", "Lcom/stripe/android/model/l$c;", "getSetupFutureUsage", "()Lcom/stripe/android/model/l$c;", "setSetupFutureUsage", "(Lcom/stripe/android/model/l$c;)V", "m", "Lcom/stripe/android/model/l$d;", "getShipping", "()Lcom/stripe/android/model/l$d;", "(Lcom/stripe/android/model/l$d;)V", "n", "getReceiptEmail", "setReceiptEmail", "paymentMethodParamMap", "mandateDataParams", "o", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ConfirmPaymentIntentParams implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethodCreateParams paymentMethodCreateParams;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final SourceParams sourceParams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String returnUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private Boolean savePaymentMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useStripeSdk;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private y0 paymentMethodOptions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private String mandateId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private MandateDataParams mandateData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private c setupFutureUsage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private Shipping shipping;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private String receiptEmail;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f51325p = 8;
    public static final Parcelable.Creator<ConfirmPaymentIntentParams> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010Jg\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJg\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010'\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Lcom/stripe/android/model/l$a;", "", "<init>", "()V", "", "clientSecret", "Lcom/stripe/android/model/v0$p;", Action.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/l;", "b", "(Ljava/lang/String;Lcom/stripe/android/model/v0$p;)Lcom/stripe/android/model/l;", "Lcom/stripe/android/model/l$d;", "shipping", "Lcom/stripe/android/model/l$c;", "setupFutureUsage", "a", "(Ljava/lang/String;Lcom/stripe/android/model/l$d;Lcom/stripe/android/model/l$c;)Lcom/stripe/android/model/l;", "paymentMethodId", "", "savePaymentMethod", "Lcom/stripe/android/model/y0;", "paymentMethodOptions", "mandateId", "Lcom/stripe/android/model/q0;", "mandateData", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/y0;Ljava/lang/String;Lcom/stripe/android/model/q0;Lcom/stripe/android/model/l$c;Lcom/stripe/android/model/l$d;)Lcom/stripe/android/model/l;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "e", "(Lcom/stripe/android/model/w0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/q0;Lcom/stripe/android/model/l$c;Lcom/stripe/android/model/l$d;Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/l;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/y0;)Lcom/stripe/android/model/l;", "PARAM_PAYMENT_METHOD_OPTIONS", "Ljava/lang/String;", "PARAM_RECEIPT_EMAIL", "PARAM_SAVE_PAYMENT_METHOD", "PARAM_SETUP_FUTURE_USAGE", "PARAM_SHIPPING", "PARAM_SOURCE_DATA", "PARAM_SOURCE_ID", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConfirmPaymentIntentParams c(Companion companion, String str, Shipping shipping, c cVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                shipping = null;
            }
            if ((i11 & 4) != 0) {
                cVar = null;
            }
            return companion.a(str, shipping, cVar);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams f(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams q0Var, c cVar, Shipping shipping, y0 y0Var, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                bool = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            if ((i11 & 16) != 0) {
                q0Var = null;
            }
            if ((i11 & 32) != 0) {
                cVar = null;
            }
            if ((i11 & 64) != 0) {
                shipping = null;
            }
            if ((i11 & 128) != 0) {
                y0Var = null;
            }
            return companion.e(paymentMethodCreateParams, str, bool, str2, q0Var, cVar, shipping, y0Var);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams h(Companion companion, String str, String str2, Boolean bool, y0 y0Var, String str3, MandateDataParams q0Var, c cVar, Shipping shipping, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                bool = null;
            }
            if ((i11 & 8) != 0) {
                y0Var = null;
            }
            if ((i11 & 16) != 0) {
                str3 = null;
            }
            if ((i11 & 32) != 0) {
                q0Var = null;
            }
            if ((i11 & 64) != 0) {
                cVar = null;
            }
            if ((i11 & 128) != 0) {
                shipping = null;
            }
            return companion.g(str, str2, bool, y0Var, str3, q0Var, cVar, shipping);
        }

        public final ConfirmPaymentIntentParams a(String clientSecret, Shipping shipping, c setupFutureUsage) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(null, null, null, null, clientSecret, null, null, false, null, null, null, setupFutureUsage, shipping, null, 10223, null);
        }

        public final ConfirmPaymentIntentParams b(String clientSecret, PaymentMethod.p paymentMethodType) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            p013kotlin.jvm.internal.s.k(paymentMethodType, "paymentMethodType");
            MandateDataParams q0Var = new MandateDataParams(MandateDataParams.c.Online.INSTANCE.a());
            if (!paymentMethodType.requiresMandate) {
                q0Var = null;
            }
            return new ConfirmPaymentIntentParams(null, null, null, null, clientSecret, null, null, false, null, null, q0Var, null, null, null, 15343, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ConfirmPaymentIntentParams d(String clientSecret, String paymentMethodId, y0 paymentMethodOptions) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
            y0.Card card = paymentMethodOptions instanceof y0.Card ? (y0.Card) paymentMethodOptions : null;
            return new ConfirmPaymentIntentParams(null, paymentMethodId, null, null, clientSecret, null, Boolean.FALSE, true, new y0.Card(null, null, card != null ? card.getSetupFutureUsage() : null, Boolean.TRUE, 3, null), null, null, 0 == true ? 1 : 0, null, null, 15917, null);
        }

        public final ConfirmPaymentIntentParams e(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean savePaymentMethod, String mandateId, MandateDataParams mandateData, c setupFutureUsage, Shipping shipping, y0 paymentMethodOptions) {
            p013kotlin.jvm.internal.s.k(paymentMethodCreateParams, "paymentMethodCreateParams");
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(paymentMethodCreateParams, null, null, null, clientSecret, null, savePaymentMethod, false, paymentMethodOptions, mandateId, mandateData, setupFutureUsage, shipping, null, 8366, null);
        }

        public final ConfirmPaymentIntentParams g(String paymentMethodId, String clientSecret, Boolean savePaymentMethod, y0 paymentMethodOptions, String mandateId, MandateDataParams mandateData, c setupFutureUsage, Shipping shipping) {
            p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(null, paymentMethodId, null, null, clientSecret, null, savePaymentMethod, false, paymentMethodOptions, mandateId, mandateData, setupFutureUsage, shipping, null, 8365, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.l$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ConfirmPaymentIntentParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConfirmPaymentIntentParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            PaymentMethodCreateParams paymentMethodCreateParamsCreateFromParcel = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            SourceParams j1VarCreateFromParcel = parcel.readInt() == 0 ? null : SourceParams.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ConfirmPaymentIntentParams(paymentMethodCreateParamsCreateFromParcel, string, j1VarCreateFromParcel, string2, string3, string4, boolValueOf, parcel.readInt() != 0, (y0) parcel.readParcelable(ConfirmPaymentIntentParams.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : MandateDataParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConfirmPaymentIntentParams[] newArray(int i11) {
            return new ConfirmPaymentIntentParams[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.l$c */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/l$c;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "OnSession", "OffSession", "Blank", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum c {
        OnSession("on_session"),
        OffSession("off_session"),
        Blank("");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String code;

        c(String str) {
            this.code = str;
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }
    }

    public ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams j1Var, String str2, String clientSecret, String str3, Boolean bool, boolean z11, y0 y0Var, String str4, MandateDataParams q0Var, c cVar, Shipping shipping, String str5) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.paymentMethodId = str;
        this.sourceParams = j1Var;
        this.sourceId = str2;
        this.clientSecret = clientSecret;
        this.returnUrl = str3;
        this.savePaymentMethod = bool;
        this.useStripeSdk = z11;
        this.paymentMethodOptions = y0Var;
        this.mandateId = str4;
        this.mandateData = q0Var;
        this.setupFutureUsage = cVar;
        this.shipping = shipping;
        this.receiptEmail = str5;
    }

    public static /* synthetic */ ConfirmPaymentIntentParams b(ConfirmPaymentIntentParams confirmPaymentIntentParams, PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams j1Var, String str2, String str3, String str4, Boolean bool, boolean z11, y0 y0Var, String str5, MandateDataParams q0Var, c cVar, Shipping shipping, String str6, int i11, Object obj) {
        return confirmPaymentIntentParams.a((i11 & 1) != 0 ? confirmPaymentIntentParams.paymentMethodCreateParams : paymentMethodCreateParams, (i11 & 2) != 0 ? confirmPaymentIntentParams.paymentMethodId : str, (i11 & 4) != 0 ? confirmPaymentIntentParams.sourceParams : j1Var, (i11 & 8) != 0 ? confirmPaymentIntentParams.sourceId : str2, (i11 & 16) != 0 ? confirmPaymentIntentParams.clientSecret : str3, (i11 & 32) != 0 ? confirmPaymentIntentParams.returnUrl : str4, (i11 & 64) != 0 ? confirmPaymentIntentParams.savePaymentMethod : bool, (i11 & 128) != 0 ? confirmPaymentIntentParams.useStripeSdk : z11, (i11 & 256) != 0 ? confirmPaymentIntentParams.paymentMethodOptions : y0Var, (i11 & 512) != 0 ? confirmPaymentIntentParams.mandateId : str5, (i11 & 1024) != 0 ? confirmPaymentIntentParams.mandateData : q0Var, (i11 & 2048) != 0 ? confirmPaymentIntentParams.setupFutureUsage : cVar, (i11 & 4096) != 0 ? confirmPaymentIntentParams.shipping : shipping, (i11 & PKIFailureInfo.certRevoked) != 0 ? confirmPaymentIntentParams.receiptEmail : str6);
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

    private final Map<String, Object> f() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null) {
            return p013kotlin.collections.v0.f(jn0.x.a("payment_method_data", paymentMethodCreateParams.c3()));
        }
        String str = this.paymentMethodId;
        if (str != null) {
            return p013kotlin.collections.v0.f(jn0.x.a("payment_method", str));
        }
        SourceParams j1Var = this.sourceParams;
        if (j1Var != null) {
            return p013kotlin.collections.v0.f(jn0.x.a("source_data", j1Var.c3()));
        }
        String str2 = this.sourceId;
        return str2 != null ? p013kotlin.collections.v0.f(jn0.x.a("source", str2)) : p013kotlin.collections.v0.i();
    }

    @Override // com.stripe.android.model.n
    public void L3(String str) {
        this.returnUrl = str;
    }

    public final ConfirmPaymentIntentParams a(PaymentMethodCreateParams paymentMethodCreateParams, String paymentMethodId, SourceParams sourceParams, String sourceId, String clientSecret, String returnUrl, Boolean savePaymentMethod, boolean useStripeSdk, y0 paymentMethodOptions, String mandateId, MandateDataParams mandateData, c setupFutureUsage, Shipping shipping, String receiptEmail) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        return new ConfirmPaymentIntentParams(paymentMethodCreateParams, paymentMethodId, sourceParams, sourceId, clientSecret, returnUrl, savePaymentMethod, useStripeSdk, paymentMethodOptions, mandateId, mandateData, setupFutureUsage, shipping, receiptEmail);
    }

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        Map mapM = p013kotlin.collections.v0.m(jn0.x.a("client_secret", getClientSecret()), jn0.x.a("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        Boolean bool = this.savePaymentMethod;
        Map mapF = bool != null ? p013kotlin.collections.v0.f(jn0.x.a("save_payment_method", bool)) : null;
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
        Map mapR3 = p013kotlin.collections.v0.r(mapR2, mapF3);
        String returnUrl = getReturnUrl();
        Map mapF4 = returnUrl != null ? p013kotlin.collections.v0.f(jn0.x.a("return_url", returnUrl)) : null;
        if (mapF4 == null) {
            mapF4 = p013kotlin.collections.v0.i();
        }
        Map mapR4 = p013kotlin.collections.v0.r(mapR3, mapF4);
        y0 y0Var = this.paymentMethodOptions;
        Map mapF5 = y0Var != null ? p013kotlin.collections.v0.f(jn0.x.a("payment_method_options", y0Var.c3())) : null;
        if (mapF5 == null) {
            mapF5 = p013kotlin.collections.v0.i();
        }
        Map mapR5 = p013kotlin.collections.v0.r(mapR4, mapF5);
        c cVar = this.setupFutureUsage;
        Map mapF6 = cVar != null ? p013kotlin.collections.v0.f(jn0.x.a("setup_future_usage", cVar.getCode())) : null;
        if (mapF6 == null) {
            mapF6 = p013kotlin.collections.v0.i();
        }
        Map mapR6 = p013kotlin.collections.v0.r(mapR5, mapF6);
        Shipping shipping = this.shipping;
        Map mapF7 = shipping != null ? p013kotlin.collections.v0.f(jn0.x.a("shipping", shipping.c3())) : null;
        if (mapF7 == null) {
            mapF7 = p013kotlin.collections.v0.i();
        }
        Map mapR7 = p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(mapR6, mapF7), f());
        String str2 = this.receiptEmail;
        Map mapF8 = str2 != null ? p013kotlin.collections.v0.f(jn0.x.a("receipt_email", str2)) : null;
        if (mapF8 == null) {
            mapF8 = p013kotlin.collections.v0.i();
        }
        return p013kotlin.collections.v0.r(mapR7, mapF8);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final y0 getPaymentMethodOptions() {
        return this.paymentMethodOptions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmPaymentIntentParams)) {
            return false;
        }
        ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) other;
        return p013kotlin.jvm.internal.s.f(this.paymentMethodCreateParams, confirmPaymentIntentParams.paymentMethodCreateParams) && p013kotlin.jvm.internal.s.f(this.paymentMethodId, confirmPaymentIntentParams.paymentMethodId) && p013kotlin.jvm.internal.s.f(this.sourceParams, confirmPaymentIntentParams.sourceParams) && p013kotlin.jvm.internal.s.f(this.sourceId, confirmPaymentIntentParams.sourceId) && p013kotlin.jvm.internal.s.f(this.clientSecret, confirmPaymentIntentParams.clientSecret) && p013kotlin.jvm.internal.s.f(this.returnUrl, confirmPaymentIntentParams.returnUrl) && p013kotlin.jvm.internal.s.f(this.savePaymentMethod, confirmPaymentIntentParams.savePaymentMethod) && this.useStripeSdk == confirmPaymentIntentParams.useStripeSdk && p013kotlin.jvm.internal.s.f(this.paymentMethodOptions, confirmPaymentIntentParams.paymentMethodOptions) && p013kotlin.jvm.internal.s.f(this.mandateId, confirmPaymentIntentParams.mandateId) && p013kotlin.jvm.internal.s.f(this.mandateData, confirmPaymentIntentParams.mandateData) && this.setupFutureUsage == confirmPaymentIntentParams.setupFutureUsage && p013kotlin.jvm.internal.s.f(this.shipping, confirmPaymentIntentParams.shipping) && p013kotlin.jvm.internal.s.f(this.receiptEmail, confirmPaymentIntentParams.receiptEmail);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final SourceParams getSourceParams() {
        return this.sourceParams;
    }

    @Override // com.stripe.android.model.n
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public final void h(Shipping shipping) {
        this.shipping = shipping;
    }

    public int hashCode() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int iHashCode = (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode()) * 31;
        String str = this.paymentMethodId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SourceParams j1Var = this.sourceParams;
        int iHashCode3 = (iHashCode2 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        String str2 = this.sourceId;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.clientSecret.hashCode()) * 31;
        String str3 = this.returnUrl;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.savePaymentMethod;
        int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.useStripeSdk)) * 31;
        y0 y0Var = this.paymentMethodOptions;
        int iHashCode7 = (iHashCode6 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        String str4 = this.mandateId;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MandateDataParams q0Var = this.mandateData;
        int iHashCode9 = (iHashCode8 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        c cVar = this.setupFutureUsage;
        int iHashCode10 = (iHashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int iHashCode11 = (iHashCode10 + (shipping == null ? 0 : shipping.hashCode())) * 31;
        String str5 = this.receiptEmail;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.stripe.android.model.n
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ConfirmPaymentIntentParams m2(boolean shouldUseStripeSdk) {
        return b(this, null, null, null, null, null, null, null, shouldUseStripeSdk, null, null, null, null, null, null, 16255, null);
    }

    @Override // com.stripe.android.model.n
    /* JADX INFO: renamed from: p, reason: from getter */
    public String getClientSecret() {
        return this.clientSecret;
    }

    public String toString() {
        return "ConfirmPaymentIntentParams(paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", paymentMethodId=" + this.paymentMethodId + ", sourceParams=" + this.sourceParams + ", sourceId=" + this.sourceId + ", clientSecret=" + this.clientSecret + ", returnUrl=" + this.returnUrl + ", savePaymentMethod=" + this.savePaymentMethod + ", useStripeSdk=" + this.useStripeSdk + ", paymentMethodOptions=" + this.paymentMethodOptions + ", mandateId=" + this.mandateId + ", mandateData=" + this.mandateData + ", setupFutureUsage=" + this.setupFutureUsage + ", shipping=" + this.shipping + ", receiptEmail=" + this.receiptEmail + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodCreateParams.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.paymentMethodId);
        SourceParams j1Var = this.sourceParams;
        if (j1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            j1Var.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.sourceId);
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.returnUrl);
        Boolean bool = this.savePaymentMethod;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.useStripeSdk ? 1 : 0);
        parcel.writeParcelable(this.paymentMethodOptions, flags);
        parcel.writeString(this.mandateId);
        MandateDataParams q0Var = this.mandateData;
        if (q0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            q0Var.writeToParcel(parcel, flags);
        }
        c cVar = this.setupFutureUsage;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shipping.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.receiptEmail);
    }

    /* JADX INFO: renamed from: com.stripe.android.model.l$d, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001 B=\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0011¨\u0006."}, d2 = {"Lcom/stripe/android/model/l$d;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "", "name", "carrier", "phone", "trackingNumber", "<init>", "(Lcom/stripe/android/model/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/b;", "getAddress$payments_core_release", "()Lcom/stripe/android/model/b;", "b", "Ljava/lang/String;", "getName$payments_core_release", "c", "getCarrier$payments_core_release", DateTokenConverter.CONVERTER_KEY, "getPhone$payments_core_release", "e", "getTrackingNumber$payments_core_release", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Shipping implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Address address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carrier;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phone;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String trackingNumber;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final a f51340f = new a(null);
        public static final Parcelable.Creator<Shipping> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.l$d$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/l$d$a;", "", "<init>", "()V", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_CARRIER", "PARAM_NAME", "PARAM_PHONE", "PARAM_TRACKING_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.l$d$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Shipping> {
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

        public Shipping(Address address, String name, String str, String str2, String str3) {
            p013kotlin.jvm.internal.s.k(address, "address");
            p013kotlin.jvm.internal.s.k(name, "name");
            this.address = address;
            this.name = name;
            this.carrier = str;
            this.phone = str2;
            this.trackingNumber = str3;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            List<Pair> listP = p013kotlin.collections.v.p(jn0.x.a(PlaceTypes.ADDRESS, this.address.c3()), jn0.x.a("name", this.name), jn0.x.a("carrier", this.carrier), jn0.x.a("phone", this.phone), jn0.x.a("tracking_number", this.trackingNumber));
            Map<String, Object> mapI = p013kotlin.collections.v0.i();
            for (Pair pair : listP) {
                String str = (String) pair.a();
                Object objB = pair.b();
                Map mapF = objB != null ? p013kotlin.collections.v0.f(jn0.x.a(str, objB)) : null;
                if (mapF == null) {
                    mapF = p013kotlin.collections.v0.i();
                }
                mapI = p013kotlin.collections.v0.r(mapI, mapF);
            }
            return mapI;
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
            return p013kotlin.jvm.internal.s.f(this.address, shipping.address) && p013kotlin.jvm.internal.s.f(this.name, shipping.name) && p013kotlin.jvm.internal.s.f(this.carrier, shipping.carrier) && p013kotlin.jvm.internal.s.f(this.phone, shipping.phone) && p013kotlin.jvm.internal.s.f(this.trackingNumber, shipping.trackingNumber);
        }

        public int hashCode() {
            int iHashCode = ((this.address.hashCode() * 31) + this.name.hashCode()) * 31;
            String str = this.carrier;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.phone;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackingNumber;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.address + ", name=" + this.name + ", carrier=" + this.carrier + ", phone=" + this.phone + ", trackingNumber=" + this.trackingNumber + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.address.writeToParcel(parcel, flags);
            parcel.writeString(this.name);
            parcel.writeString(this.carrier);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams j1Var, String str2, String str3, String str4, Boolean bool, boolean z11, y0 y0Var, String str5, MandateDataParams q0Var, c cVar, Shipping shipping, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : paymentMethodCreateParams, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : j1Var, (i11 & 8) != 0 ? null : str2, str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? null : y0Var, (i11 & 512) != 0 ? null : str5, (i11 & 1024) != 0 ? null : q0Var, (i11 & 2048) != 0 ? null : cVar, (i11 & 4096) != 0 ? null : shipping, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str6);
    }
}
