package i60;

import android.content.Context;
import android.util.Base64;
import c60.LinkConfiguration;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import java.util.List;
import java.util.Map;
import jn0.e;
import jn0.h0;
import jn0.x;
import kotlinx.serialization.UnknownFieldException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import ro0.d;
import ro0.o;
import ro0.p;
import vo0.e0;
import vo0.h;
import vo0.h1;
import vo0.m0;
import vo0.m1;
import vo0.s0;
import vo0.v1;
import vo0.z1;
import wn0.l;
import wo0.b;

/* JADX INFO: renamed from: i60.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bK\b\u0081\b\u0018\u0000 p2\u00020\u0001:\u00071)<AFILB\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0089\u0002\b\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0001\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0016\b\u0001\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u0016\u0010 J(\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$HÁ\u0001¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010*R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u00102\u0012\u0004\b7\u00105\u001a\u0004\b6\u0010*R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u00108\u0012\u0004\b;\u00105\u001a\u0004\b9\u0010:R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u00105\u001a\u0004\b>\u0010?R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u00105\u001a\u0004\bC\u0010DR \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u00102\u0012\u0004\bH\u00105\u001a\u0004\bG\u0010*R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u00102\u0012\u0004\bK\u00105\u001a\u0004\bJ\u0010*R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u00102\u0012\u0004\bN\u00105\u001a\u0004\bM\u0010*R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u00102\u0012\u0004\bQ\u00105\u001a\u0004\bP\u0010*R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bR\u00102\u0012\u0004\bT\u00105\u001a\u0004\bS\u0010*R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u00105\u001a\u0004\bW\u0010XR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u0010[\u0012\u0004\b^\u00105\u001a\u0004\b\\\u0010]R,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b_\u0010`\u0012\u0004\bc\u00105\u001a\u0004\ba\u0010bR \u0010\u001a\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\bd\u00102\u0012\u0004\bf\u00105\u001a\u0004\be\u0010*R \u0010\u001b\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\bg\u00102\u0012\u0004\bi\u00105\u001a\u0004\bh\u0010*R,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bj\u0010`\u0012\u0004\bl\u00105\u001a\u0004\bk\u0010bR,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bm\u0010`\u0012\u0004\bo\u00105\u001a\u0004\bn\u0010b¨\u0006q"}, d2 = {"Li60/a;", "", "", "publishableKey", "stripeAccount", "Li60/a$g;", "merchantInfo", "Li60/a$e;", "customerInfo", "Li60/a$h;", "paymentInfo", "appId", "locale", "paymentUserAgent", "paymentObject", "intentMode", "", "setupFutureUsage", "Li60/a$b;", "cardBrandChoice", "", "flags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Li60/a$g;Li60/a$e;Li60/a$h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi60/a$b;Ljava/util/Map;)V", "", "seen1", "path", "integrationType", "loggerMetadata", "experiments", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Li60/a$g;Li60/a$e;Li60/a$h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi60/a$b;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Li60/a;Luo0/d;Lto0/f;)V", "b", "()Ljava/lang/String;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPublishableKey", "getPublishableKey$annotations", "()V", "getStripeAccount", "getStripeAccount$annotations", "Li60/a$g;", "getMerchantInfo", "()Li60/a$g;", "getMerchantInfo$annotations", DateTokenConverter.CONVERTER_KEY, "Li60/a$e;", "getCustomerInfo", "()Li60/a$e;", "getCustomerInfo$annotations", "e", "Li60/a$h;", "getPaymentInfo", "()Li60/a$h;", "getPaymentInfo$annotations", "f", "getAppId", "getAppId$annotations", "g", "getLocale", "getLocale$annotations", "h", "getPaymentUserAgent", "getPaymentUserAgent$annotations", IntegerTokenConverter.CONVERTER_KEY, "getPaymentObject", "getPaymentObject$annotations", "j", "getIntentMode", "getIntentMode$annotations", "k", "Z", "getSetupFutureUsage", "()Z", "getSetupFutureUsage$annotations", "l", "Li60/a$b;", "getCardBrandChoice", "()Li60/a$b;", "getCardBrandChoice$annotations", "m", "Ljava/util/Map;", "getFlags", "()Ljava/util/Map;", "getFlags$annotations", "n", "getPath", "getPath$annotations", "o", "getIntegrationType", "getIntegrationType$annotations", "p", "getLoggerMetadata", "getLoggerMetadata$annotations", "q", "getExperiments", "getExperiments$annotations", "Companion", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final /* data */ class PopupPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f76035r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final d<Object>[] f76036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final b f76037t;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publishableKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stripeAccount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final MerchantInfo merchantInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerInfo customerInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentInfo paymentInfo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String locale;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentUserAgent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentObject;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String intentMode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean setupFutureUsage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final CardBrandChoice cardBrandChoice;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Boolean> flags;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String integrationType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> loggerMetadata;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> experiments;

    /* JADX INFO: renamed from: i60.a$a, reason: collision with other inner class name */
    @e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/link/serialization/PopupPayload.$serializer", "Lvo0/e0;", "Li60/a;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Li60/a;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Li60/a;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1590a implements e0<PopupPayload> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1590a f76055a;
        private static final /* synthetic */ m1 descriptor;

        static {
            C1590a c1590a = new C1590a();
            f76055a = c1590a;
            m1 m1Var = new m1("com.stripe.android.link.serialization.PopupPayload", c1590a, 17);
            m1Var.o("publishableKey", false);
            m1Var.o("stripeAccount", false);
            m1Var.o("merchantInfo", false);
            m1Var.o("customerInfo", false);
            m1Var.o("paymentInfo", false);
            m1Var.o("appId", false);
            m1Var.o("locale", false);
            m1Var.o("paymentUserAgent", false);
            m1Var.o("paymentObject", false);
            m1Var.o("intentMode", false);
            m1Var.o("setupFutureUsage", false);
            m1Var.o("cardBrandChoice", false);
            m1Var.o("flags", false);
            m1Var.o("path", true);
            m1Var.o("integrationType", true);
            m1Var.o("loggerMetadata", true);
            m1Var.o("experiments", true);
            descriptor = m1Var;
        }

        private C1590a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PopupPayload deserialize(uo0.e decoder) {
            int i11;
            MerchantInfo merchantInfo;
            String str;
            String str2;
            Map map;
            Map map2;
            Map map3;
            PaymentInfo paymentInfo;
            CardBrandChoice cardBrandChoice;
            CustomerInfo customerInfo;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            boolean z11;
            s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            d[] dVarArr = PopupPayload.f76036s;
            int i12 = 10;
            if (cVarB.i()) {
                String strT = cVarB.t(descriptor2, 0);
                String str10 = (String) cVarB.v(descriptor2, 1, z1.f119730a, null);
                MerchantInfo merchantInfo2 = (MerchantInfo) cVarB.n(descriptor2, 2, MerchantInfo.C1595a.f76068a, null);
                CustomerInfo customerInfo2 = (CustomerInfo) cVarB.n(descriptor2, 3, CustomerInfo.C1594a.f76065a, null);
                PaymentInfo paymentInfo2 = (PaymentInfo) cVarB.v(descriptor2, 4, PaymentInfo.C1596a.f76071a, null);
                String strT2 = cVarB.t(descriptor2, 5);
                String strT3 = cVarB.t(descriptor2, 6);
                String strT4 = cVarB.t(descriptor2, 7);
                String strT5 = cVarB.t(descriptor2, 8);
                String strT6 = cVarB.t(descriptor2, 9);
                boolean zW = cVarB.w(descriptor2, 10);
                CardBrandChoice cardBrandChoice2 = (CardBrandChoice) cVarB.v(descriptor2, 11, CardBrandChoice.C1591a.f76060a, null);
                Map map4 = (Map) cVarB.n(descriptor2, 12, dVarArr[12], null);
                String strT7 = cVarB.t(descriptor2, 13);
                String strT8 = cVarB.t(descriptor2, 14);
                i11 = 131071;
                map3 = map4;
                map2 = (Map) cVarB.n(descriptor2, 15, dVarArr[15], null);
                map = (Map) cVarB.n(descriptor2, 16, dVarArr[16], null);
                str9 = strT8;
                z11 = zW;
                str7 = strT6;
                str5 = strT4;
                str4 = strT3;
                str3 = strT2;
                customerInfo = customerInfo2;
                str6 = strT5;
                paymentInfo = paymentInfo2;
                str8 = strT7;
                str = str10;
                str2 = strT;
                merchantInfo = merchantInfo2;
                cardBrandChoice = cardBrandChoice2;
            } else {
                int i13 = 16;
                boolean z12 = true;
                boolean zW2 = false;
                MerchantInfo merchantInfo3 = null;
                String strT9 = null;
                Map map5 = null;
                Map map6 = null;
                Map map7 = null;
                PaymentInfo paymentInfo3 = null;
                CardBrandChoice cardBrandChoice3 = null;
                CustomerInfo customerInfo3 = null;
                String strT10 = null;
                String strT11 = null;
                String strT12 = null;
                String strT13 = null;
                String strT14 = null;
                String strT15 = null;
                String strT16 = null;
                i11 = 0;
                String str11 = null;
                while (z12) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z12 = false;
                            i13 = 16;
                            break;
                        case 0:
                            strT9 = cVarB.t(descriptor2, 0);
                            i11 |= 1;
                            i13 = 16;
                            i12 = 10;
                            break;
                        case 1:
                            str11 = (String) cVarB.v(descriptor2, 1, z1.f119730a, str11);
                            i11 |= 2;
                            i13 = 16;
                            i12 = 10;
                            break;
                        case 2:
                            merchantInfo3 = (MerchantInfo) cVarB.n(descriptor2, 2, MerchantInfo.C1595a.f76068a, merchantInfo3);
                            i11 |= 4;
                            i13 = 16;
                            i12 = 10;
                            break;
                        case 3:
                            customerInfo3 = (CustomerInfo) cVarB.n(descriptor2, 3, CustomerInfo.C1594a.f76065a, customerInfo3);
                            i11 |= 8;
                            i13 = 16;
                            i12 = 10;
                            break;
                        case 4:
                            paymentInfo3 = (PaymentInfo) cVarB.v(descriptor2, 4, PaymentInfo.C1596a.f76071a, paymentInfo3);
                            i11 |= 16;
                            i13 = 16;
                            i12 = 10;
                            break;
                        case 5:
                            strT10 = cVarB.t(descriptor2, 5);
                            i11 |= 32;
                            i13 = 16;
                            break;
                        case 6:
                            strT11 = cVarB.t(descriptor2, 6);
                            i11 |= 64;
                            i13 = 16;
                            break;
                        case 7:
                            strT12 = cVarB.t(descriptor2, 7);
                            i11 |= 128;
                            i13 = 16;
                            break;
                        case 8:
                            strT13 = cVarB.t(descriptor2, 8);
                            i11 |= 256;
                            i13 = 16;
                            break;
                        case 9:
                            strT14 = cVarB.t(descriptor2, 9);
                            i11 |= 512;
                            i13 = 16;
                            break;
                        case 10:
                            zW2 = cVarB.w(descriptor2, i12);
                            i11 |= 1024;
                            i13 = 16;
                            break;
                        case 11:
                            cardBrandChoice3 = (CardBrandChoice) cVarB.v(descriptor2, 11, CardBrandChoice.C1591a.f76060a, cardBrandChoice3);
                            i11 |= 2048;
                            i13 = 16;
                            break;
                        case 12:
                            map7 = (Map) cVarB.n(descriptor2, 12, dVarArr[12], map7);
                            i11 |= 4096;
                            i13 = 16;
                            break;
                        case 13:
                            strT15 = cVarB.t(descriptor2, 13);
                            i11 |= PKIFailureInfo.certRevoked;
                            i13 = 16;
                            break;
                        case 14:
                            strT16 = cVarB.t(descriptor2, 14);
                            i11 |= 16384;
                            i13 = 16;
                            break;
                        case 15:
                            map6 = (Map) cVarB.n(descriptor2, 15, dVarArr[15], map6);
                            i11 |= 32768;
                            i13 = 16;
                            break;
                        case 16:
                            map5 = (Map) cVarB.n(descriptor2, i13, dVarArr[i13], map5);
                            i11 |= 65536;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                merchantInfo = merchantInfo3;
                str = str11;
                str2 = strT9;
                map = map5;
                map2 = map6;
                map3 = map7;
                paymentInfo = paymentInfo3;
                cardBrandChoice = cardBrandChoice3;
                customerInfo = customerInfo3;
                str3 = strT10;
                str4 = strT11;
                str5 = strT12;
                str6 = strT13;
                str7 = strT14;
                str8 = strT15;
                str9 = strT16;
                z11 = zW2;
            }
            int i14 = i11;
            cVarB.c(descriptor2);
            return new PopupPayload(i14, str2, str, merchantInfo, customerInfo, paymentInfo, str3, str4, str5, str6, str7, z11, cardBrandChoice, map3, str8, str9, map2, map, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, PopupPayload value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            PopupPayload.c(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public d<?>[] childSerializers() {
            d<?>[] dVarArr = PopupPayload.f76036s;
            z1 z1Var = z1.f119730a;
            return new d[]{z1Var, so0.a.p(z1Var), MerchantInfo.C1595a.f76068a, CustomerInfo.C1594a.f76065a, so0.a.p(PaymentInfo.C1596a.f76071a), z1Var, z1Var, z1Var, z1Var, z1Var, h.f119620a, so0.a.p(CardBrandChoice.C1591a.f76060a), dVarArr[12], z1Var, z1Var, dVarArr[15], dVarArr[16]};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: i60.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u001d\u0014B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Li60/a$b;", "", "", "eligible", "", "", "preferredNetworks", "<init>", "(ZLjava/util/List;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(IZLjava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Li60/a$b;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getEligible", "()Z", "getEligible$annotations", "()V", "Ljava/util/List;", "getPreferredNetworks", "()Ljava/util/List;", "getPreferredNetworks$annotations", "Companion", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class CardBrandChoice {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f76056c = 8;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final d<Object>[] f76057d = {null, new vo0.e(z1.f119730a)};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean eligible;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> preferredNetworks;

        /* JADX INFO: renamed from: i60.a$b$a, reason: collision with other inner class name */
        @e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/link/serialization/PopupPayload.CardBrandChoice.$serializer", "Lvo0/e0;", "Li60/a$b;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Li60/a$b;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Li60/a$b;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1591a implements e0<CardBrandChoice> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1591a f76060a;
            private static final /* synthetic */ m1 descriptor;

            static {
                C1591a c1591a = new C1591a();
                f76060a = c1591a;
                m1 m1Var = new m1("com.stripe.android.link.serialization.PopupPayload.CardBrandChoice", c1591a, 2);
                m1Var.o("isMerchantEligibleForCBC", false);
                m1Var.o("stripePreferredNetworks", false);
                descriptor = m1Var;
            }

            private C1591a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CardBrandChoice deserialize(uo0.e decoder) {
                List list;
                boolean zW;
                int i11;
                s.k(decoder, "decoder");
                to0.f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                d[] dVarArr = CardBrandChoice.f76057d;
                v1 v1Var = null;
                if (cVarB.i()) {
                    zW = cVarB.w(descriptor2, 0);
                    list = (List) cVarB.n(descriptor2, 1, dVarArr[1], null);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    boolean zW2 = false;
                    int i12 = 0;
                    List list2 = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            zW2 = cVarB.w(descriptor2, 0);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            list2 = (List) cVarB.n(descriptor2, 1, dVarArr[1], list2);
                            i12 |= 2;
                        }
                    }
                    list = list2;
                    zW = zW2;
                    i11 = i12;
                }
                cVarB.c(descriptor2);
                return new CardBrandChoice(i11, zW, list, v1Var);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, CardBrandChoice value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                to0.f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                CardBrandChoice.b(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public d<?>[] childSerializers() {
                return new d[]{h.f119620a, CardBrandChoice.f76057d[1]};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: i60.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li60/a$b$b;", "", "<init>", "()V", "Lro0/d;", "Li60/a$b;", "serializer", "()Lro0/d;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d<CardBrandChoice> serializer() {
                return C1591a.f76060a;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ CardBrandChoice(int i11, @o("isMerchantEligibleForCBC") boolean z11, @o("stripePreferredNetworks") List list, v1 v1Var) {
            if (3 != (i11 & 3)) {
                h1.b(i11, 3, C1591a.f76060a.getDescriptor());
            }
            this.eligible = z11;
            this.preferredNetworks = list;
        }

        public static final /* synthetic */ void b(CardBrandChoice self, uo0.d output, to0.f serialDesc) {
            d<Object>[] dVarArr = f76057d;
            output.A(serialDesc, 0, self.eligible);
            output.D(serialDesc, 1, dVarArr[1], self.preferredNetworks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardBrandChoice)) {
                return false;
            }
            CardBrandChoice cardBrandChoice = (CardBrandChoice) other;
            return this.eligible == cardBrandChoice.eligible && s.f(this.preferredNetworks, cardBrandChoice.preferredNetworks);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.eligible) * 31) + this.preferredNetworks.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.eligible + ", preferredNetworks=" + this.preferredNetworks + ")";
        }

        public CardBrandChoice(boolean z11, List<String> preferredNetworks) {
            s.k(preferredNetworks, "preferredNetworks");
            this.eligible = z11;
            this.preferredNetworks = preferredNetworks;
        }
    }

    /* JADX INFO: renamed from: i60.a$c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwo0/d;", "Ljn0/h0;", "a", "(Lwo0/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<wo0.d, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f76061c = new c();

        c() {
            super(1);
        }

        public final void a(wo0.d Json) {
            s.k(Json, "$this$Json");
            Json.f(true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(wo0.d dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i60.a$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u0017*\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0007*\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b \u0010\rJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!HÆ\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, d2 = {"Li60/a$d;", "", "<init>", "()V", "Lc60/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "publishableKey", "stripeAccount", "paymentUserAgent", "Li60/a;", "h", "(Lc60/c;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Li60/a;", "e", "(Lc60/c;)Ljava/lang/String;", "Lcom/stripe/android/model/StripeIntent;", "Li60/a$h;", "g", "(Lcom/stripe/android/model/StripeIntent;)Li60/a$h;", "Li60/a$f;", "f", "(Lcom/stripe/android/model/StripeIntent;)Li60/a$f;", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/StripeIntent;)Z", "Lcom/stripe/android/model/StripeIntent$Usage;", "c", "(Lcom/stripe/android/model/StripeIntent$Usage;)Z", "b", "(Landroid/content/Context;)Ljava/lang/String;", "configuration", "a", "Lro0/d;", "serializer", "()Lro0/d;", "MOBILE_SESSION_ID_KEY", "Ljava/lang/String;", "baseUrl", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: i60.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class C1593a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f76062a;

            static {
                int[] iArr = new int[StripeIntent.Usage.values().length];
                try {
                    iArr[StripeIntent.Usage.OneTime.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StripeIntent.Usage.OffSession.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StripeIntent.Usage.OnSession.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f76062a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String b(Context context) {
            String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
            s.j(country, "getCountry(...)");
            return country;
        }

        private final boolean c(StripeIntent.Usage usage) {
            int i11 = usage == null ? -1 : C1593a.f76062a[usage.ordinal()];
            if (i11 == -1 || i11 == 1) {
                return false;
            }
            if (i11 == 2 || i11 == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }

        private final boolean d(StripeIntent stripeIntent) {
            if (stripeIntent instanceof PaymentIntent) {
                return c(((PaymentIntent) stripeIntent).getSetupFutureUsage());
            }
            if (stripeIntent instanceof SetupIntent) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }

        private final String e(LinkConfiguration linkConfiguration) {
            return linkConfiguration.getPassthroughModeEnabled() ? "card_payment_method" : "link_payment_method";
        }

        private final f f(StripeIntent stripeIntent) {
            if (stripeIntent instanceof PaymentIntent) {
                return f.Payment;
            }
            if (stripeIntent instanceof SetupIntent) {
                return f.Setup;
            }
            throw new NoWhenBranchMatchedException();
        }

        private final PaymentInfo g(StripeIntent stripeIntent) {
            if (!(stripeIntent instanceof PaymentIntent)) {
                if (stripeIntent instanceof SetupIntent) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            String currency = paymentIntent.getCurrency();
            Long amount = paymentIntent.getAmount();
            if (currency == null || amount == null) {
                return null;
            }
            return new PaymentInfo(currency, amount.longValue());
        }

        private final PopupPayload h(LinkConfiguration linkConfiguration, Context context, String str, String str2, String str3) {
            MerchantInfo merchantInfo = new MerchantInfo(linkConfiguration.getMerchantName(), linkConfiguration.getMerchantCountryCode());
            String email = linkConfiguration.getCustomerInfo().getEmail();
            String billingCountryCode = linkConfiguration.getCustomerInfo().getBillingCountryCode();
            if (billingCountryCode == null) {
                billingCountryCode = b(context);
            }
            CustomerInfo customerInfo = new CustomerInfo(email, billingCountryCode);
            LinkConfiguration.CardBrandChoice cardBrandChoice = linkConfiguration.getCardBrandChoice();
            CardBrandChoice cardBrandChoice2 = cardBrandChoice != null ? new CardBrandChoice(cardBrandChoice.getEligible(), cardBrandChoice.b()) : null;
            PaymentInfo paymentInfoG = g(linkConfiguration.getStripeIntent());
            String str4 = context.getApplicationInfo().packageName;
            String strB = b(context);
            String strE = e(linkConfiguration);
            String type = f(linkConfiguration.getStripeIntent()).getType();
            boolean zD = d(linkConfiguration.getStripeIntent());
            Map<String, Boolean> mapC = linkConfiguration.c();
            s.h(str4);
            return new PopupPayload(str, str2, merchantInfo, customerInfo, paymentInfoG, str4, strB, str3, strE, type, zD, cardBrandChoice2, mapC);
        }

        public final PopupPayload a(LinkConfiguration configuration, Context context, String publishableKey, String stripeAccount, String paymentUserAgent) {
            s.k(configuration, "configuration");
            s.k(context, "context");
            s.k(publishableKey, "publishableKey");
            s.k(paymentUserAgent, "paymentUserAgent");
            return h(configuration, context, publishableKey, stripeAccount, paymentUserAgent);
        }

        public final d<PopupPayload> serializer() {
            return C1590a.f76055a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: i60.a$e, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0012 B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Li60/a$e;", "", "", Scopes.EMAIL, PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Li60/a$e;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getEmail$annotations", "()V", "b", "getCountry", "getCountry$annotations", "Companion", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class CustomerInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String country;

        /* JADX INFO: renamed from: i60.a$e$a, reason: collision with other inner class name */
        @e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/link/serialization/PopupPayload.CustomerInfo.$serializer", "Lvo0/e0;", "Li60/a$e;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Li60/a$e;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Li60/a$e;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1594a implements e0<CustomerInfo> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1594a f76065a;
            private static final /* synthetic */ m1 descriptor;

            static {
                C1594a c1594a = new C1594a();
                f76065a = c1594a;
                m1 m1Var = new m1("com.stripe.android.link.serialization.PopupPayload.CustomerInfo", c1594a, 2);
                m1Var.o(Scopes.EMAIL, false);
                m1Var.o(PlaceTypes.COUNTRY, false);
                descriptor = m1Var;
            }

            private C1594a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomerInfo deserialize(uo0.e decoder) {
                String str;
                int i11;
                String str2;
                s.k(decoder, "decoder");
                to0.f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                v1 v1Var = null;
                if (cVarB.i()) {
                    z1 z1Var = z1.f119730a;
                    str2 = (String) cVarB.v(descriptor2, 0, z1Var, null);
                    str = (String) cVarB.v(descriptor2, 1, z1Var, null);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    str = null;
                    String str3 = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            str3 = (String) cVarB.v(descriptor2, 0, z1.f119730a, str3);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            str = (String) cVarB.v(descriptor2, 1, z1.f119730a, str);
                            i12 |= 2;
                        }
                    }
                    i11 = i12;
                    str2 = str3;
                }
                cVarB.c(descriptor2);
                return new CustomerInfo(i11, str2, str, v1Var);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, CustomerInfo value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                to0.f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                CustomerInfo.a(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public d<?>[] childSerializers() {
                z1 z1Var = z1.f119730a;
                return new d[]{so0.a.p(z1Var), so0.a.p(z1Var)};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: i60.a$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li60/a$e$b;", "", "<init>", "()V", "Lro0/d;", "Li60/a$e;", "serializer", "()Lro0/d;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d<CustomerInfo> serializer() {
                return C1594a.f76065a;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ CustomerInfo(int i11, @o(Scopes.EMAIL) String str, @o(PlaceTypes.COUNTRY) String str2, v1 v1Var) {
            if (3 != (i11 & 3)) {
                h1.b(i11, 3, C1594a.f76065a.getDescriptor());
            }
            this.email = str;
            this.country = str2;
        }

        public static final /* synthetic */ void a(CustomerInfo self, uo0.d output, to0.f serialDesc) {
            z1 z1Var = z1.f119730a;
            output.y(serialDesc, 0, z1Var, self.email);
            output.y(serialDesc, 1, z1Var, self.country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerInfo)) {
                return false;
            }
            CustomerInfo customerInfo = (CustomerInfo) other;
            return s.f(this.email, customerInfo.email) && s.f(this.country, customerInfo.country);
        }

        public int hashCode() {
            String str = this.email;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.country;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "CustomerInfo(email=" + this.email + ", country=" + this.country + ")";
        }

        public CustomerInfo(String str, String str2) {
            this.email = str;
            this.country = str2;
        }
    }

    /* JADX INFO: renamed from: i60.a$f */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Li60/a$f;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Payment", "Setup", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum f {
        Payment("payment"),
        Setup("setup");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String type;

        f(String str) {
            this.type = str;
        }

        public static EnumEntries<f> getEntries() {
            return $ENTRIES;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* JADX INFO: renamed from: i60.a$g, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0012 B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Li60/a$g;", "", "", "businessName", PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Li60/a$g;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBusinessName", "getBusinessName$annotations", "()V", "b", "getCountry", "getCountry$annotations", "Companion", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class MerchantInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String businessName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String country;

        /* JADX INFO: renamed from: i60.a$g$a, reason: collision with other inner class name */
        @e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/link/serialization/PopupPayload.MerchantInfo.$serializer", "Lvo0/e0;", "Li60/a$g;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Li60/a$g;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Li60/a$g;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1595a implements e0<MerchantInfo> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1595a f76068a;
            private static final /* synthetic */ m1 descriptor;

            static {
                C1595a c1595a = new C1595a();
                f76068a = c1595a;
                m1 m1Var = new m1("com.stripe.android.link.serialization.PopupPayload.MerchantInfo", c1595a, 2);
                m1Var.o("businessName", false);
                m1Var.o(PlaceTypes.COUNTRY, false);
                descriptor = m1Var;
            }

            private C1595a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MerchantInfo deserialize(uo0.e decoder) {
                String strT;
                String str;
                int i11;
                s.k(decoder, "decoder");
                to0.f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                v1 v1Var = null;
                if (cVarB.i()) {
                    strT = cVarB.t(descriptor2, 0);
                    str = (String) cVarB.v(descriptor2, 1, z1.f119730a, null);
                    i11 = 3;
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    strT = null;
                    String str2 = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            strT = cVarB.t(descriptor2, 0);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            str2 = (String) cVarB.v(descriptor2, 1, z1.f119730a, str2);
                            i12 |= 2;
                        }
                    }
                    str = str2;
                    i11 = i12;
                }
                cVarB.c(descriptor2);
                return new MerchantInfo(i11, strT, str, v1Var);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, MerchantInfo value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                to0.f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                MerchantInfo.a(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public d<?>[] childSerializers() {
                z1 z1Var = z1.f119730a;
                return new d[]{z1Var, so0.a.p(z1Var)};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: i60.a$g$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li60/a$g$b;", "", "<init>", "()V", "Lro0/d;", "Li60/a$g;", "serializer", "()Lro0/d;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d<MerchantInfo> serializer() {
                return C1595a.f76068a;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ MerchantInfo(int i11, @o("businessName") String str, @o(PlaceTypes.COUNTRY) String str2, v1 v1Var) {
            if (3 != (i11 & 3)) {
                h1.b(i11, 3, C1595a.f76068a.getDescriptor());
            }
            this.businessName = str;
            this.country = str2;
        }

        public static final /* synthetic */ void a(MerchantInfo self, uo0.d output, to0.f serialDesc) {
            output.e(serialDesc, 0, self.businessName);
            output.y(serialDesc, 1, z1.f119730a, self.country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantInfo)) {
                return false;
            }
            MerchantInfo merchantInfo = (MerchantInfo) other;
            return s.f(this.businessName, merchantInfo.businessName) && s.f(this.country, merchantInfo.country);
        }

        public int hashCode() {
            int iHashCode = this.businessName.hashCode() * 31;
            String str = this.country;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "MerchantInfo(businessName=" + this.businessName + ", country=" + this.country + ")";
        }

        public MerchantInfo(String businessName, String str) {
            s.k(businessName, "businessName");
            this.businessName = businessName;
            this.country = str;
        }
    }

    /* JADX INFO: renamed from: i60.a$h, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\u0013!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010 \u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Li60/a$h;", "", "", "currency", "", "amount", "<init>", "(Ljava/lang/String;J)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;JLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Li60/a$h;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency", "getCurrency$annotations", "()V", "b", "J", "getAmount", "()J", "getAmount$annotations", "Companion", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p
    public static final /* data */ class PaymentInfo {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currency;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long amount;

        /* JADX INFO: renamed from: i60.a$h$a, reason: collision with other inner class name */
        @e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/link/serialization/PopupPayload.PaymentInfo.$serializer", "Lvo0/e0;", "Li60/a$h;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Li60/a$h;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Li60/a$h;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C1596a implements e0<PaymentInfo> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1596a f76071a;
            private static final /* synthetic */ m1 descriptor;

            static {
                C1596a c1596a = new C1596a();
                f76071a = c1596a;
                m1 m1Var = new m1("com.stripe.android.link.serialization.PopupPayload.PaymentInfo", c1596a, 2);
                m1Var.o("currency", false);
                m1Var.o("amount", false);
                descriptor = m1Var;
            }

            private C1596a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public PaymentInfo deserialize(uo0.e decoder) {
                String strT;
                long j11;
                int i11;
                s.k(decoder, "decoder");
                to0.f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                if (cVarB.i()) {
                    strT = cVarB.t(descriptor2, 0);
                    j11 = cVarB.j(descriptor2, 1);
                    i11 = 3;
                } else {
                    strT = null;
                    long j12 = 0;
                    boolean z11 = true;
                    int i12 = 0;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else if (iA == 0) {
                            strT = cVarB.t(descriptor2, 0);
                            i12 |= 1;
                        } else {
                            if (iA != 1) {
                                throw new UnknownFieldException(iA);
                            }
                            j12 = cVarB.j(descriptor2, 1);
                            i12 |= 2;
                        }
                    }
                    j11 = j12;
                    i11 = i12;
                }
                String str = strT;
                cVarB.c(descriptor2);
                return new PaymentInfo(i11, str, j11, null);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, PaymentInfo value) {
                s.k(encoder, "encoder");
                s.k(value, "value");
                to0.f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                PaymentInfo.a(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public d<?>[] childSerializers() {
                return new d[]{z1.f119730a, s0.f119686a};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public d<?>[] typeParametersSerializers() {
                return e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: i60.a$h$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li60/a$h$b;", "", "<init>", "()V", "Lro0/d;", "Li60/a$h;", "serializer", "()Lro0/d;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d<PaymentInfo> serializer() {
                return C1596a.f76071a;
            }

            private Companion() {
            }
        }

        @e
        public /* synthetic */ PaymentInfo(int i11, @o("currency") String str, @o("amount") long j11, v1 v1Var) {
            if (3 != (i11 & 3)) {
                h1.b(i11, 3, C1596a.f76071a.getDescriptor());
            }
            this.currency = str;
            this.amount = j11;
        }

        public static final /* synthetic */ void a(PaymentInfo self, uo0.d output, to0.f serialDesc) {
            output.e(serialDesc, 0, self.currency);
            output.z(serialDesc, 1, self.amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentInfo)) {
                return false;
            }
            PaymentInfo paymentInfo = (PaymentInfo) other;
            return s.f(this.currency, paymentInfo.currency) && this.amount == paymentInfo.amount;
        }

        public int hashCode() {
            return (this.currency.hashCode() * 31) + Long.hashCode(this.amount);
        }

        public String toString() {
            return "PaymentInfo(currency=" + this.currency + ", amount=" + this.amount + ")";
        }

        public PaymentInfo(String currency, long j11) {
            s.k(currency, "currency");
            this.currency = currency;
            this.amount = j11;
        }
    }

    static {
        z1 z1Var = z1.f119730a;
        f76036s = new d[]{null, null, null, null, null, null, null, null, null, null, null, null, new m0(z1Var, h.f119620a), null, null, new m0(z1Var, z1Var), new m0(z1Var, z1Var)};
        f76037t = wo0.u.b(null, c.f76061c, 1, null);
    }

    @e
    public /* synthetic */ PopupPayload(int i11, @o("publishableKey") String str, @o("stripeAccount") String str2, @o("merchantInfo") MerchantInfo merchantInfo, @o("customerInfo") CustomerInfo customerInfo, @o("paymentInfo") PaymentInfo paymentInfo, @o("appId") String str3, @o("locale") String str4, @o("paymentUserAgent") String str5, @o("paymentObject") String str6, @o("intentMode") String str7, @o("setupFutureUsage") boolean z11, @o("cardBrandChoice") CardBrandChoice cardBrandChoice, @o("flags") Map map, @o("path") String str8, @o("integrationType") String str9, @o("loggerMetadata") Map map2, @o("experiments") Map map3, v1 v1Var) {
        if (8191 != (i11 & 8191)) {
            h1.b(i11, 8191, C1590a.f76055a.getDescriptor());
        }
        this.publishableKey = str;
        this.stripeAccount = str2;
        this.merchantInfo = merchantInfo;
        this.customerInfo = customerInfo;
        this.paymentInfo = paymentInfo;
        this.appId = str3;
        this.locale = str4;
        this.paymentUserAgent = str5;
        this.paymentObject = str6;
        this.intentMode = str7;
        this.setupFutureUsage = z11;
        this.cardBrandChoice = cardBrandChoice;
        this.flags = map;
        this.path = (i11 & PKIFailureInfo.certRevoked) == 0 ? "mobile_pay" : str8;
        this.integrationType = (i11 & 16384) == 0 ? "mobile" : str9;
        this.loggerMetadata = (32768 & i11) == 0 ? v0.f(x.a("mobile_session_id", w30.e.INSTANCE.a().toString())) : map2;
        this.experiments = (i11 & 65536) == 0 ? v0.i() : map3;
    }

    public static final /* synthetic */ void c(PopupPayload self, uo0.d output, to0.f serialDesc) {
        d<Object>[] dVarArr = f76036s;
        output.e(serialDesc, 0, self.publishableKey);
        output.y(serialDesc, 1, z1.f119730a, self.stripeAccount);
        output.D(serialDesc, 2, MerchantInfo.C1595a.f76068a, self.merchantInfo);
        output.D(serialDesc, 3, CustomerInfo.C1594a.f76065a, self.customerInfo);
        output.y(serialDesc, 4, PaymentInfo.C1596a.f76071a, self.paymentInfo);
        output.e(serialDesc, 5, self.appId);
        output.e(serialDesc, 6, self.locale);
        output.e(serialDesc, 7, self.paymentUserAgent);
        output.e(serialDesc, 8, self.paymentObject);
        output.e(serialDesc, 9, self.intentMode);
        output.A(serialDesc, 10, self.setupFutureUsage);
        output.y(serialDesc, 11, CardBrandChoice.C1591a.f76060a, self.cardBrandChoice);
        output.D(serialDesc, 12, dVarArr[12], self.flags);
        if (output.G(serialDesc, 13) || !s.f(self.path, "mobile_pay")) {
            output.e(serialDesc, 13, self.path);
        }
        if (output.G(serialDesc, 14) || !s.f(self.integrationType, "mobile")) {
            output.e(serialDesc, 14, self.integrationType);
        }
        if (output.G(serialDesc, 15) || !s.f(self.loggerMetadata, v0.f(x.a("mobile_session_id", w30.e.INSTANCE.a().toString())))) {
            output.D(serialDesc, 15, dVarArr[15], self.loggerMetadata);
        }
        if (!output.G(serialDesc, 16) && s.f(self.experiments, v0.i())) {
            return;
        }
        output.D(serialDesc, 16, dVarArr[16], self.experiments);
    }

    public final String b() {
        return "https://checkout.link.com/#" + Base64.encodeToString(t.J(f76037t.b(INSTANCE.serializer(), this)), 2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupPayload)) {
            return false;
        }
        PopupPayload popupPayload = (PopupPayload) other;
        return s.f(this.publishableKey, popupPayload.publishableKey) && s.f(this.stripeAccount, popupPayload.stripeAccount) && s.f(this.merchantInfo, popupPayload.merchantInfo) && s.f(this.customerInfo, popupPayload.customerInfo) && s.f(this.paymentInfo, popupPayload.paymentInfo) && s.f(this.appId, popupPayload.appId) && s.f(this.locale, popupPayload.locale) && s.f(this.paymentUserAgent, popupPayload.paymentUserAgent) && s.f(this.paymentObject, popupPayload.paymentObject) && s.f(this.intentMode, popupPayload.intentMode) && this.setupFutureUsage == popupPayload.setupFutureUsage && s.f(this.cardBrandChoice, popupPayload.cardBrandChoice) && s.f(this.flags, popupPayload.flags);
    }

    public int hashCode() {
        int iHashCode = this.publishableKey.hashCode() * 31;
        String str = this.stripeAccount;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.merchantInfo.hashCode()) * 31) + this.customerInfo.hashCode()) * 31;
        PaymentInfo paymentInfo = this.paymentInfo;
        int iHashCode3 = (((((((((((((iHashCode2 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31) + this.appId.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.paymentUserAgent.hashCode()) * 31) + this.paymentObject.hashCode()) * 31) + this.intentMode.hashCode()) * 31) + Boolean.hashCode(this.setupFutureUsage)) * 31;
        CardBrandChoice cardBrandChoice = this.cardBrandChoice;
        return ((iHashCode3 + (cardBrandChoice != null ? cardBrandChoice.hashCode() : 0)) * 31) + this.flags.hashCode();
    }

    public String toString() {
        return "PopupPayload(publishableKey=" + this.publishableKey + ", stripeAccount=" + this.stripeAccount + ", merchantInfo=" + this.merchantInfo + ", customerInfo=" + this.customerInfo + ", paymentInfo=" + this.paymentInfo + ", appId=" + this.appId + ", locale=" + this.locale + ", paymentUserAgent=" + this.paymentUserAgent + ", paymentObject=" + this.paymentObject + ", intentMode=" + this.intentMode + ", setupFutureUsage=" + this.setupFutureUsage + ", cardBrandChoice=" + this.cardBrandChoice + ", flags=" + this.flags + ")";
    }

    public PopupPayload(String publishableKey, String str, MerchantInfo merchantInfo, CustomerInfo customerInfo, PaymentInfo paymentInfo, String appId, String locale, String paymentUserAgent, String paymentObject, String intentMode, boolean z11, CardBrandChoice cardBrandChoice, Map<String, Boolean> flags) {
        s.k(publishableKey, "publishableKey");
        s.k(merchantInfo, "merchantInfo");
        s.k(customerInfo, "customerInfo");
        s.k(appId, "appId");
        s.k(locale, "locale");
        s.k(paymentUserAgent, "paymentUserAgent");
        s.k(paymentObject, "paymentObject");
        s.k(intentMode, "intentMode");
        s.k(flags, "flags");
        this.publishableKey = publishableKey;
        this.stripeAccount = str;
        this.merchantInfo = merchantInfo;
        this.customerInfo = customerInfo;
        this.paymentInfo = paymentInfo;
        this.appId = appId;
        this.locale = locale;
        this.paymentUserAgent = paymentUserAgent;
        this.paymentObject = paymentObject;
        this.intentMode = intentMode;
        this.setupFutureUsage = z11;
        this.cardBrandChoice = cardBrandChoice;
        this.flags = flags;
        this.path = "mobile_pay";
        this.integrationType = "mobile";
        this.loggerMetadata = v0.f(x.a("mobile_session_id", w30.e.INSTANCE.a().toString()));
        this.experiments = v0.i();
    }
}
