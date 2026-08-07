package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.IdealPaymentMethod;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.w0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u000eQ>AY[SUac@:gikB\u0091\u0002\b\u0000\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(\u0012\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0018\u00010&¢\u0006\u0004\b,\u0010-B\u0085\u0002\b\u0010\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(\u0012\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0018\u00010&¢\u0006\u0004\b,\u00100B;\b\u0012\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00101B;\b\u0012\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00102B;\b\u0012\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00103B;\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00104B9\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00105B;\b\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00106B;\b\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00107B;\b\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00108B;\b\u0012\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&¢\u0006\u0004\b,\u00109J\u000f\u0010:\u001a\u00020\u0006H\u0007¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*0&H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010>\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b>\u0010?J\u0011\u0010@\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b@\u0010?J\u009c\u0002\u0010A\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0018\u00010&HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bC\u0010?J\u0010\u0010E\u001a\u00020DHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u00062\b\u0010G\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020DHÖ\u0001¢\u0006\u0004\bJ\u0010FJ \u0010O\u001a\u00020N2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020DHÖ\u0001¢\u0006\u0004\bO\u0010PR\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010?R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010T\u001a\u0004\bU\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bA\u0010V\u001a\u0004\bW\u0010XR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010_R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010`R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010eR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010fR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\b]\u0010oR\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010sR \u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*0&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010=R\u0011\u0010x\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\ba\u0010?R\u0017\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00030(8G¢\u0006\u0006\u001a\u0004\b[\u0010y¨\u0006|"}, d2 = {"Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "", "requiresMandate", "Lcom/stripe/android/model/w0$c;", "card", "Lcom/stripe/android/model/w0$h;", IdealPaymentMethod.PAYMENT_METHOD_TYPE, "Lcom/stripe/android/model/w0$g;", "fpx", "Lcom/stripe/android/model/w0$k;", "sepaDebit", "Lcom/stripe/android/model/w0$a;", "auBecsDebit", "Lcom/stripe/android/model/w0$b;", "bacsDebit", "Lcom/stripe/android/model/w0$l;", "sofort", "Lcom/stripe/android/model/w0$o;", "upi", "Lcom/stripe/android/model/w0$j;", "netbanking", "Lcom/stripe/android/model/w0$n;", "usBankAccount", "Lcom/stripe/android/model/w0$i;", "link", "Lcom/stripe/android/model/w0$d;", "cashAppPay", "Lcom/stripe/android/model/w0$m;", "swish", "Lcom/stripe/android/model/v0$e;", "billingDetails", "Lcom/stripe/android/model/v0$b;", "allowRedisplay", "", OrcaKeys.METADATA, "", "productUsage", "", "overrideParamMap", "<init>", "(Ljava/lang/String;ZLcom/stripe/android/model/w0$c;Lcom/stripe/android/model/w0$h;Lcom/stripe/android/model/w0$g;Lcom/stripe/android/model/w0$k;Lcom/stripe/android/model/w0$a;Lcom/stripe/android/model/w0$b;Lcom/stripe/android/model/w0$l;Lcom/stripe/android/model/w0$o;Lcom/stripe/android/model/w0$j;Lcom/stripe/android/model/w0$n;Lcom/stripe/android/model/w0$i;Lcom/stripe/android/model/w0$d;Lcom/stripe/android/model/w0$m;Lcom/stripe/android/model/v0$e;Lcom/stripe/android/model/v0$b;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V", "Lcom/stripe/android/model/v0$p;", "type", "(Lcom/stripe/android/model/v0$p;Lcom/stripe/android/model/w0$c;Lcom/stripe/android/model/w0$h;Lcom/stripe/android/model/w0$g;Lcom/stripe/android/model/w0$k;Lcom/stripe/android/model/w0$a;Lcom/stripe/android/model/w0$b;Lcom/stripe/android/model/w0$l;Lcom/stripe/android/model/w0$o;Lcom/stripe/android/model/w0$j;Lcom/stripe/android/model/w0$n;Lcom/stripe/android/model/w0$i;Lcom/stripe/android/model/w0$d;Lcom/stripe/android/model/w0$m;Lcom/stripe/android/model/v0$e;Lcom/stripe/android/model/v0$b;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)V", "(Lcom/stripe/android/model/w0$c;Lcom/stripe/android/model/v0$b;Lcom/stripe/android/model/v0$e;Ljava/util/Map;)V", "(Lcom/stripe/android/model/w0$h;Lcom/stripe/android/model/v0$b;Lcom/stripe/android/model/v0$e;Ljava/util/Map;)V", "(Lcom/stripe/android/model/w0$g;Lcom/stripe/android/model/v0$b;Lcom/stripe/android/model/v0$e;Ljava/util/Map;)V", "(Lcom/stripe/android/model/w0$k;Lcom/stripe/android/model/v0$b;Lcom/stripe/android/model/v0$e;Ljava/util/Map;)V", "(Lcom/stripe/android/model/w0$a;Lcom/stripe/android/model/v0$b;Lcom/stripe/android/model/v0$e;Ljava/util/Map;)V", "(Lcom/stripe/android/model/w0$l;Lcom/stripe/android/model/v0$b;Lcom/stripe/android/model/v0$e;Ljava/util/Map;)V", "(Lcom/stripe/android/model/w0$j;Lcom/stripe/android/model/v0$b;Lcom/stripe/android/model/v0$e;Ljava/util/Map;)V", "(Lcom/stripe/android/model/w0$n;Lcom/stripe/android/model/v0$b;Lcom/stripe/android/model/v0$e;Ljava/util/Map;)V", "(Lcom/stripe/android/model/w0$d;Lcom/stripe/android/model/v0$b;Lcom/stripe/android/model/v0$e;Ljava/util/Map;)V", "l", "()Z", "c3", "()Ljava/util/Map;", "b", "()Ljava/lang/String;", "k", "c", "(Ljava/lang/String;ZLcom/stripe/android/model/w0$c;Lcom/stripe/android/model/w0$h;Lcom/stripe/android/model/w0$g;Lcom/stripe/android/model/w0$k;Lcom/stripe/android/model/w0$a;Lcom/stripe/android/model/w0$b;Lcom/stripe/android/model/w0$l;Lcom/stripe/android/model/w0$o;Lcom/stripe/android/model/w0$j;Lcom/stripe/android/model/w0$n;Lcom/stripe/android/model/w0$i;Lcom/stripe/android/model/w0$d;Lcom/stripe/android/model/w0$m;Lcom/stripe/android/model/v0$e;Lcom/stripe/android/model/v0$b;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;)Lcom/stripe/android/model/w0;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "g", "Z", "h", "Lcom/stripe/android/model/w0$c;", "getCard", "()Lcom/stripe/android/model/w0$c;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/w0$h;", "e", "Lcom/stripe/android/model/w0$g;", "f", "Lcom/stripe/android/model/w0$k;", "Lcom/stripe/android/model/w0$a;", "Lcom/stripe/android/model/w0$b;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/w0$l;", "j", "Lcom/stripe/android/model/w0$o;", "Lcom/stripe/android/model/w0$j;", "Lcom/stripe/android/model/w0$n;", "m", "Lcom/stripe/android/model/w0$i;", "n", "Lcom/stripe/android/model/w0$d;", "o", "Lcom/stripe/android/model/w0$m;", "p", "Lcom/stripe/android/model/v0$e;", "()Lcom/stripe/android/model/v0$e;", "q", "Lcom/stripe/android/model/v0$b;", "r", "Ljava/util/Map;", "s", "Ljava/util/Set;", "t", "typeParams", "typeCode", "()Ljava/util/Set;", "attribution", "u", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentMethodCreateParams implements o1, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean requiresMandate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Card card;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ideal ideal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Fpx fpx;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final SepaDebit sepaDebit;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuBecsDebit auBecsDebit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final BacsDebit bacsDebit;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Sofort sofort;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Upi upi;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Netbanking netbanking;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final USBankAccount usBankAccount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Link link;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final d cashAppPay;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final m swish;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethod.BillingDetails billingDetails;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethod.b allowRedisplay;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> metadata;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> productUsage;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> overrideParamMap;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f51643v = 8;
    public static final Parcelable.Creator<PaymentMethodCreateParams> CREATOR = new f();

    /* JADX INFO: renamed from: com.stripe.android.model.w0$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010 ¨\u0006%"}, d2 = {"Lcom/stripe/android/model/w0$a;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "bsbNumber", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getBsbNumber", "setBsbNumber", "(Ljava/lang/String;)V", "b", "getAccountNumber", "setAccountNumber", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuBecsDebit implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String bsbNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private String accountNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final C0918a f51664c = new C0918a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f51665d = 8;
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/w0$a$a;", "", "<init>", "()V", "", "PARAM_ACCOUNT_NUMBER", "Ljava/lang/String;", "PARAM_BSB_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class C0918a {
            public /* synthetic */ C0918a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0918a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$a$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<AuBecsDebit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new AuBecsDebit(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AuBecsDebit[] newArray(int i11) {
                return new AuBecsDebit[i11];
            }
        }

        public AuBecsDebit(String bsbNumber, String accountNumber) {
            p013kotlin.jvm.internal.s.k(bsbNumber, "bsbNumber");
            p013kotlin.jvm.internal.s.k(accountNumber, "accountNumber");
            this.bsbNumber = bsbNumber;
            this.accountNumber = accountNumber;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            return p013kotlin.collections.v0.m(jn0.x.a("bsb_number", this.bsbNumber), jn0.x.a("account_number", this.accountNumber));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuBecsDebit)) {
                return false;
            }
            AuBecsDebit auBecsDebit = (AuBecsDebit) other;
            return p013kotlin.jvm.internal.s.f(this.bsbNumber, auBecsDebit.bsbNumber) && p013kotlin.jvm.internal.s.f(this.accountNumber, auBecsDebit.accountNumber);
        }

        public int hashCode() {
            return (this.bsbNumber.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.bsbNumber + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bsbNumber);
            parcel.writeString(this.accountNumber);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lcom/stripe/android/model/w0$b;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "accountNumber", "sortCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "setAccountNumber", "(Ljava/lang/String;)V", "b", "setSortCode", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BacsDebit implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String accountNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private String sortCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f51669d = 8;
        public static final Parcelable.Creator<BacsDebit> CREATOR = new C0919b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/w0$b$a;", "", "<init>", "()V", "Lcom/stripe/android/model/w0;", "params", "Lcom/stripe/android/model/w0$b;", "a", "(Lcom/stripe/android/model/w0;)Lcom/stripe/android/model/w0$b;", "", "PARAM_ACCOUNT_NUMBER", "Ljava/lang/String;", "PARAM_SORT_CODE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BacsDebit a(PaymentMethodCreateParams params) {
                p013kotlin.jvm.internal.s.k(params, "params");
                Object obj = params.c3().get(PaymentMethod.p.BacsDebit.code);
                Map map = obj instanceof Map ? (Map) obj : null;
                Object obj2 = map != null ? map.get("account_number") : null;
                String str = obj2 instanceof String ? (String) obj2 : null;
                Object obj3 = map != null ? map.get("sort_code") : null;
                String str2 = obj3 instanceof String ? (String) obj3 : null;
                if (str == null || str2 == null) {
                    return null;
                }
                return new BacsDebit(str, str2);
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0919b implements Parcelable.Creator<BacsDebit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BacsDebit createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new BacsDebit(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BacsDebit[] newArray(int i11) {
                return new BacsDebit[i11];
            }
        }

        public BacsDebit(String accountNumber, String sortCode) {
            p013kotlin.jvm.internal.s.k(accountNumber, "accountNumber");
            p013kotlin.jvm.internal.s.k(sortCode, "sortCode");
            this.accountNumber = accountNumber;
            this.sortCode = sortCode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSortCode() {
            return this.sortCode;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            return p013kotlin.collections.v0.m(jn0.x.a("account_number", this.accountNumber), jn0.x.a("sort_code", this.sortCode));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BacsDebit)) {
                return false;
            }
            BacsDebit bacsDebit = (BacsDebit) other;
            return p013kotlin.jvm.internal.s.f(this.accountNumber, bacsDebit.accountNumber) && p013kotlin.jvm.internal.s.f(this.sortCode, bacsDebit.sortCode);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.sortCode.hashCode();
        }

        public String toString() {
            return "BacsDebit(accountNumber=" + this.accountNumber + ", sortCode=" + this.sortCode + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.accountNumber);
            parcel.writeString(this.sortCode);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$c, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 62\u00020\u00012\u00020\u0002:\u0002#*Bc\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010$R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b#\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/stripe/android/model/w0$c;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", InquiryField.FloatField.TYPE2, "", "expiryMonth", "expiryYear", "cvc", "token", "", "attribution", "Lcom/stripe/android/model/w0$c$c;", "networks", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/w0$c$c;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getNumber$payments_core_release", "b", "Ljava/lang/Integer;", "getExpiryMonth$payments_core_release", "()Ljava/lang/Integer;", "c", "getExpiryYear$payments_core_release", DateTokenConverter.CONVERTER_KEY, "getCvc$payments_core_release", "e", "f", "Ljava/util/Set;", "()Ljava/util/Set;", "g", "Lcom/stripe/android/model/w0$c$c;", "getNetworks$payments_core_release", "()Lcom/stripe/android/model/w0$c$c;", "h", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Card implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String number;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer expiryMonth;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer expiryYear;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cvc;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String token;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> attribution;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final C0920c networks;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f51673i = 8;
        public static final Parcelable.Creator<Card> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/w0$c$a;", "", "<init>", "()V", "", "token", "Lcom/stripe/android/model/w0$c;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/w0$c;", "PARAM_CVC", "Ljava/lang/String;", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_NETWORKS", "PARAM_NUMBER", "PARAM_TOKEN", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Card a(String token) {
                p013kotlin.jvm.internal.s.k(token, "token");
                return new Card(null, null, null, null, token, null, null, 110, null);
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$c$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i11 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashSet.add(parcel.readString());
                    }
                }
                return new Card(string, numValueOf, numValueOf2, string2, string3, linkedHashSet, parcel.readInt() != 0 ? C0920c.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/w0$c$c;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "preferred", "<init>", "(Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getPreferred", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class C0920c implements o1, Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String preferred;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final a f51681b = new a(null);
            public static final Parcelable.Creator<C0920c> CREATOR = new b();

            /* JADX INFO: renamed from: com.stripe.android.model.w0$c$c$a */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/w0$c$c$a;", "", "<init>", "()V", "", "PARAM_PREFERRED", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            private static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private a() {
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.model.w0$c$c$b */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<C0920c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0920c createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new C0920c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0920c[] newArray(int i11) {
                    return new C0920c[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0920c() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.stripe.android.model.o1
            public Map<String, Object> c3() {
                String str = this.preferred;
                return str != null ? p013kotlin.collections.v0.f(jn0.x.a("preferred", str)) : p013kotlin.collections.v0.i();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return (other instanceof C0920c) && p013kotlin.jvm.internal.s.f(((C0920c) other).preferred, this.preferred);
            }

            public int hashCode() {
                return Objects.hash(this.preferred);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.preferred + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.preferred);
            }

            public C0920c(String str) {
                this.preferred = str;
            }

            public /* synthetic */ C0920c(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        public Card() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final Set<String> a() {
            return this.attribution;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            Pair pairA = jn0.x.a(InquiryField.FloatField.TYPE2, this.number);
            Pair pairA2 = jn0.x.a("exp_month", this.expiryMonth);
            Pair pairA3 = jn0.x.a("exp_year", this.expiryYear);
            Pair pairA4 = jn0.x.a("cvc", this.cvc);
            Pair pairA5 = jn0.x.a("token", this.token);
            C0920c c0920c = this.networks;
            List<Pair> listP = p013kotlin.collections.v.p(pairA, pairA2, pairA3, pairA4, pairA5, jn0.x.a("networks", c0920c != null ? c0920c.c3() : null));
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listP) {
                Object objF = pair.f();
                Pair pairA6 = objF != null ? jn0.x.a(pair.e(), objF) : null;
                if (pairA6 != null) {
                    arrayList.add(pairA6);
                }
            }
            return p013kotlin.collections.v0.y(arrayList);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return p013kotlin.jvm.internal.s.f(this.number, card.number) && p013kotlin.jvm.internal.s.f(this.expiryMonth, card.expiryMonth) && p013kotlin.jvm.internal.s.f(this.expiryYear, card.expiryYear) && p013kotlin.jvm.internal.s.f(this.cvc, card.cvc) && p013kotlin.jvm.internal.s.f(this.token, card.token) && p013kotlin.jvm.internal.s.f(this.attribution, card.attribution) && p013kotlin.jvm.internal.s.f(this.networks, card.networks);
        }

        public int hashCode() {
            String str = this.number;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.expiryMonth;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.cvc;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.token;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Set<String> set = this.attribution;
            int iHashCode6 = (iHashCode5 + (set == null ? 0 : set.hashCode())) * 31;
            C0920c c0920c = this.networks;
            return iHashCode6 + (c0920c != null ? c0920c.hashCode() : 0);
        }

        public String toString() {
            return "Card(number=" + this.number + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", cvc=" + this.cvc + ", token=" + this.token + ", attribution=" + this.attribution + ", networks=" + this.networks + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.number);
            Integer num = this.expiryMonth;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
            parcel.writeString(this.cvc);
            parcel.writeString(this.token);
            Set<String> set = this.attribution;
            if (set == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }
            C0920c c0920c = this.networks;
            if (c0920c == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                c0920c.writeToParcel(parcel, flags);
            }
        }

        public Card(String str, Integer num, Integer num2, String str2, String str3, Set<String> set, C0920c c0920c) {
            this.number = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.cvc = str2;
            this.token = str3;
            this.attribution = set;
            this.networks = c0920c;
        }

        public /* synthetic */ Card(String str, Integer num, Integer num2, String str2, String str3, Set set, C0920c c0920c, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : set, (i11 & 64) != 0 ? null : c0920c);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$d */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/w0$d;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements o1, Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                parcel.readInt();
                return new d();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJG\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJC\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\"\u0010#JG\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b&\u0010'JG\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b*\u0010+JG\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b.\u0010/J;\u00100\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b0\u00101J;\u00102\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b2\u00101J;\u00103\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b3\u00101J;\u00104\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b4\u00101J;\u00105\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b5\u00101J;\u00106\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b6\u00101J3\u00107\u001a\u00020\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b7\u00108J3\u00109\u001a\u00020\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b9\u00108J?\u0010:\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b:\u00101J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;H\u0007¢\u0006\u0004\b=\u0010>J?\u0010?\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b?\u00101J?\u0010@\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b@\u00101J?\u0010A\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\bA\u00101J?\u0010B\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\bB\u00101J?\u0010C\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\bC\u00101J7\u0010G\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00062\u0016\b\u0002\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0007¢\u0006\u0004\bG\u0010HJ9\u0010N\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00062\u0006\u0010K\u001a\u00020J2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060L2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\bN\u0010OJ]\u0010S\u001a\u00020\u00042\n\u0010Q\u001a\u00060\u0006j\u0002`P2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010K\u001a\u00020J2\u0014\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00060L2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bX\u0010YJ\u0019\u0010Z\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\bZ\u0010YR\u0014\u0010[\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010\\R\u0014\u0010^\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b^\u0010\\R\u0014\u0010_\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010\\¨\u0006`"}, d2 = {"Lcom/stripe/android/model/w0$e;", "", "<init>", "()V", "Lcom/stripe/android/model/w0;", "params", "", Action.KEY_ATTRIBUTE, "X", "(Lcom/stripe/android/model/w0;Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/model/w0$c;", "card", "Lcom/stripe/android/model/v0$e;", "billingDetails", "", OrcaKeys.METADATA, "Lcom/stripe/android/model/v0$b;", "allowRedisplay", "b", "(Lcom/stripe/android/model/w0$c;Lcom/stripe/android/model/v0$e;Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/w0$h;", IdealPaymentMethod.PAYMENT_METHOD_TYPE, DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/w0$h;Lcom/stripe/android/model/v0$e;Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/w0$g;", "fpx", "c", "(Lcom/stripe/android/model/w0$g;Lcom/stripe/android/model/v0$e;Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/w0$k;", "sepaDebit", "f", "(Lcom/stripe/android/model/w0$k;Lcom/stripe/android/model/v0$e;Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/w0$a;", "auBecsDebit", "a", "(Lcom/stripe/android/model/w0$a;Lcom/stripe/android/model/v0$e;Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/w0$l;", "sofort", "g", "(Lcom/stripe/android/model/w0$l;Lcom/stripe/android/model/v0$e;Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/w0$n;", "usBankAccount", "h", "(Lcom/stripe/android/model/w0$n;Lcom/stripe/android/model/v0$e;Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/w0$j;", "netbanking", "e", "(Lcom/stripe/android/model/w0$j;Lcom/stripe/android/model/v0$e;Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", Gender.OTHER, "(Lcom/stripe/android/model/v0$e;Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "x", "E", "G", "B", Gender.MALE, "u", "(Ljava/util/Map;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Q", "s", "Lorg/json/JSONObject;", "googlePayPaymentData", "D", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/w0;", "J", "q", Gender.UNKNOWN, "z", "S", "paymentDetailsId", "consumerSessionClientSecret", "extraParams", "L", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/stripe/android/model/w0;", "paymentMethodId", "", "requiresMandate", "", "productUsage", "I", "(Ljava/lang/String;ZLjava/util/Set;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "overrideParamMap", "W", "(Ljava/lang/String;Lcom/stripe/android/model/v0$e;ZLjava/util/Map;Ljava/util/Set;Lcom/stripe/android/model/v0$b;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/w0$b;", "w", "(Lcom/stripe/android/model/w0;)Lcom/stripe/android/model/w0$b;", "Z", "(Lcom/stripe/android/model/w0;)Ljava/lang/String;", "Y", "PARAM_ALLOW_REDISPLAY", "Ljava/lang/String;", "PARAM_BILLING_DETAILS", "PARAM_METADATA", "PARAM_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams A(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.z(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams C(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.B(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams F(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.E(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams H(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.G(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams K(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.J(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams N(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.M(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams P(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.O(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams R(Companion companion, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = null;
            }
            if ((i11 & 2) != 0) {
                bVar = null;
            }
            return companion.Q(map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams T(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.S(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams V(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.U(eVar, map, bVar);
        }

        private final String X(PaymentMethodCreateParams params, String key) {
            Map map = params.overrideParamMap;
            Object obj = map != null ? map.get("billing_details") : null;
            Map map2 = obj instanceof Map ? (Map) obj : null;
            Object obj2 = map2 != null ? map2.get(key) : null;
            if (obj2 instanceof String) {
                return (String) obj2;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams i(Companion companion, AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                bVar = null;
            }
            return companion.a(auBecsDebit, eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams j(Companion companion, Card card, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                eVar = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                bVar = null;
            }
            return companion.b(card, eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams k(Companion companion, Fpx fpx, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                eVar = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                bVar = null;
            }
            return companion.c(fpx, eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams l(Companion companion, Ideal ideal, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                eVar = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                bVar = null;
            }
            return companion.d(ideal, eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams m(Companion companion, Netbanking netbanking, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                eVar = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                bVar = null;
            }
            return companion.e(netbanking, eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams n(Companion companion, SepaDebit sepaDebit, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                eVar = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                bVar = null;
            }
            return companion.f(sepaDebit, eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams o(Companion companion, Sofort sofort, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                eVar = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                bVar = null;
            }
            return companion.g(sofort, eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams p(Companion companion, USBankAccount uSBankAccount, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                eVar = null;
            }
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                bVar = null;
            }
            return companion.h(uSBankAccount, eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams r(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.q(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams t(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.s(eVar, map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams v(Companion companion, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = null;
            }
            if ((i11 & 2) != 0) {
                bVar = null;
            }
            return companion.u(map, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PaymentMethodCreateParams y(Companion companion, PaymentMethod.BillingDetails eVar, Map map, PaymentMethod.b bVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            return companion.x(eVar, map, bVar);
        }

        public final PaymentMethodCreateParams B(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.p.Eps, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams D(JSONObject googlePayPaymentData) {
            com.stripe.android.model.Card gVarB;
            r1 r1VarM;
            p013kotlin.jvm.internal.s.k(googlePayPaymentData, "googlePayPaymentData");
            GooglePayResult m0VarB = GooglePayResult.INSTANCE.b(googlePayPaymentData);
            Token p1VarE = m0VarB.getToken();
            String string = null;
            String id2 = p1VarE != null ? p1VarE.getId() : null;
            if (id2 == null) {
                id2 = "";
            }
            String str = id2;
            if (p1VarE != null && (gVarB = p1VarE.getCard()) != null && (r1VarM = gVarB.getTokenizationMethod()) != null) {
                string = r1VarM.toString();
            }
            return j(this, new Card(null, null, null, null, str, p013kotlin.collections.d1.j(string), null, 79, null), new PaymentMethod.BillingDetails(m0VarB.getAddress(), m0VarB.getEmail(), m0VarB.getName(), m0VarB.getPhoneNumber()), null, null, 12, null);
        }

        public final PaymentMethodCreateParams E(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.p.Giropay, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams G(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.p.GrabPay, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams I(String paymentMethodId, boolean requiresMandate, Set<String> productUsage, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(paymentMethodId, "paymentMethodId");
            p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
            return new PaymentMethodCreateParams(PaymentMethod.p.Link.code, requiresMandate, null, null, null, null, null, null, null, null, null, null, null, null, null, null, allowRedisplay, null, productUsage, p013kotlin.collections.v0.f(jn0.x.a("link", p013kotlin.collections.v0.f(jn0.x.a("payment_method_id", paymentMethodId)))), 196604, null);
        }

        public final PaymentMethodCreateParams J(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            return new PaymentMethodCreateParams(PaymentMethod.p.Klarna, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams L(String paymentDetailsId, String consumerSessionClientSecret, Map<String, ? extends Object> extraParams) {
            p013kotlin.jvm.internal.s.k(paymentDetailsId, "paymentDetailsId");
            p013kotlin.jvm.internal.s.k(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new PaymentMethodCreateParams(PaymentMethod.p.Link, null, null, null, null, null, null, null, null, null, null, new Link(paymentDetailsId, consumerSessionClientSecret, extraParams), null, null, null, null, null, null, null, 522238, null);
        }

        public final PaymentMethodCreateParams M(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.p.Oxxo, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams O(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.p.P24, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams Q(Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            return new PaymentMethodCreateParams(PaymentMethod.p.PayPal, null, null, null, null, null, null, null, null, null, null, null, null, null, null, allowRedisplay, metadata, null, null, 425982, null);
        }

        public final PaymentMethodCreateParams S(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            return new PaymentMethodCreateParams(PaymentMethod.p.RevolutPay, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams U(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            return new PaymentMethodCreateParams(PaymentMethod.p.USBankAccount, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams W(String code, PaymentMethod.BillingDetails billingDetails, boolean requiresMandate, Map<String, ? extends Object> overrideParamMap, Set<String> productUsage, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(code, "code");
            p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
            return new PaymentMethodCreateParams(code, requiresMandate, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, null, productUsage, overrideParamMap, 163836, null);
        }

        public final String Y(PaymentMethodCreateParams params) {
            String str;
            p013kotlin.jvm.internal.s.k(params, "params");
            PaymentMethod.BillingDetails billingDetails = params.getBillingDetails();
            return (billingDetails == null || (str = billingDetails.email) == null) ? X(params, Scopes.EMAIL) : str;
        }

        public final String Z(PaymentMethodCreateParams params) {
            String str;
            p013kotlin.jvm.internal.s.k(params, "params");
            PaymentMethod.BillingDetails billingDetails = params.getBillingDetails();
            return (billingDetails == null || (str = billingDetails.name) == null) ? X(params, "name") : str;
        }

        public final PaymentMethodCreateParams a(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(auBecsDebit, "auBecsDebit");
            p013kotlin.jvm.internal.s.k(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(auBecsDebit, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        public final PaymentMethodCreateParams b(Card card, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(card, "card");
            return new PaymentMethodCreateParams(card, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        public final PaymentMethodCreateParams c(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(fpx, "fpx");
            return new PaymentMethodCreateParams(fpx, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        public final PaymentMethodCreateParams d(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(ideal, "ideal");
            return new PaymentMethodCreateParams(ideal, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        public final PaymentMethodCreateParams e(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(netbanking, "netbanking");
            return new PaymentMethodCreateParams(netbanking, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        public final PaymentMethodCreateParams f(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(sepaDebit, "sepaDebit");
            return new PaymentMethodCreateParams(sepaDebit, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        public final PaymentMethodCreateParams g(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(sofort, "sofort");
            return new PaymentMethodCreateParams(sofort, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        public final PaymentMethodCreateParams h(USBankAccount usBankAccount, PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(usBankAccount, "usBankAccount");
            return new PaymentMethodCreateParams(usBankAccount, allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        public final PaymentMethodCreateParams q(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            return new PaymentMethodCreateParams(PaymentMethod.p.Affirm, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams s(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            return new PaymentMethodCreateParams(PaymentMethod.p.AfterpayClearpay, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams u(Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            return new PaymentMethodCreateParams(PaymentMethod.p.Alipay, null, null, null, null, null, null, null, null, null, null, null, null, null, null, allowRedisplay, metadata, null, null, 425982, null);
        }

        public final BacsDebit w(PaymentMethodCreateParams params) {
            p013kotlin.jvm.internal.s.k(params, "params");
            return BacsDebit.INSTANCE.a(params);
        }

        public final PaymentMethodCreateParams x(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            p013kotlin.jvm.internal.s.k(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(PaymentMethod.p.Bancontact, null, null, null, null, null, null, null, null, null, null, null, null, null, billingDetails, allowRedisplay, metadata, null, null, 409598, null);
        }

        public final PaymentMethodCreateParams z(PaymentMethod.BillingDetails billingDetails, Map<String, String> metadata, PaymentMethod.b allowRedisplay) {
            return new PaymentMethodCreateParams(new d(), allowRedisplay, billingDetails, metadata, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$f */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f implements Parcelable.Creator<PaymentMethodCreateParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodCreateParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            Card cardCreateFromParcel = parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel);
            Ideal idealCreateFromParcel = parcel.readInt() == 0 ? null : Ideal.CREATOR.createFromParcel(parcel);
            Fpx fpxCreateFromParcel = parcel.readInt() == 0 ? null : Fpx.CREATOR.createFromParcel(parcel);
            SepaDebit sepaDebitCreateFromParcel = parcel.readInt() == 0 ? null : SepaDebit.CREATOR.createFromParcel(parcel);
            AuBecsDebit auBecsDebitCreateFromParcel = parcel.readInt() == 0 ? null : AuBecsDebit.CREATOR.createFromParcel(parcel);
            BacsDebit bacsDebitCreateFromParcel = parcel.readInt() == 0 ? null : BacsDebit.CREATOR.createFromParcel(parcel);
            Sofort sofortCreateFromParcel = parcel.readInt() == 0 ? null : Sofort.CREATOR.createFromParcel(parcel);
            Upi upiCreateFromParcel = parcel.readInt() == 0 ? null : Upi.CREATOR.createFromParcel(parcel);
            Netbanking netbankingCreateFromParcel = parcel.readInt() == 0 ? null : Netbanking.CREATOR.createFromParcel(parcel);
            USBankAccount uSBankAccountCreateFromParcel = parcel.readInt() == 0 ? null : USBankAccount.CREATOR.createFromParcel(parcel);
            Link linkCreateFromParcel = parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel);
            d dVarCreateFromParcel = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            m mVarCreateFromParcel = parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel);
            PaymentMethod.BillingDetails eVarCreateFromParcel = parcel.readInt() == 0 ? null : PaymentMethod.BillingDetails.CREATOR.createFromParcel(parcel);
            PaymentMethod.b bVarCreateFromParcel = parcel.readInt() == 0 ? null : PaymentMethod.b.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                int i12 = 0;
                while (i12 != i11) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    i12++;
                    i11 = i11;
                }
            }
            int i13 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i13);
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            int i14 = 0;
            while (i14 != i13) {
                linkedHashSet.add(parcel.readString());
                i14++;
                i13 = i13;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i15 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i15);
                int i16 = 0;
                while (i16 != i15) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(PaymentMethodCreateParams.class.getClassLoader()));
                    i16++;
                    i15 = i15;
                }
            }
            return new PaymentMethodCreateParams(string, z11, cardCreateFromParcel, idealCreateFromParcel, fpxCreateFromParcel, sepaDebitCreateFromParcel, auBecsDebitCreateFromParcel, bacsDebitCreateFromParcel, sofortCreateFromParcel, upiCreateFromParcel, netbankingCreateFromParcel, uSBankAccountCreateFromParcel, linkCreateFromParcel, dVarCreateFromParcel, mVarCreateFromParcel, eVarCreateFromParcel, bVarCreateFromParcel, linkedHashMap3, linkedHashSet, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodCreateParams[] newArray(int i11) {
            return new PaymentMethodCreateParams[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$g, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u0006¨\u0006 "}, d2 = {"Lcom/stripe/android/model/w0$g;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", PlaceTypes.BANK, "<init>", "(Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getBank", "setBank", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Fpx implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String bank;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f51683b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51684c = 8;
        public static final Parcelable.Creator<Fpx> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$g$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/w0$g$a;", "", "<init>", "()V", "", "PARAM_BANK", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$g$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Fpx> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Fpx createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Fpx(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Fpx[] newArray(int i11) {
                return new Fpx[i11];
            }
        }

        public Fpx(String str) {
            this.bank = str;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            String str = this.bank;
            Map<String, Object> mapF = str != null ? p013kotlin.collections.v0.f(jn0.x.a(PlaceTypes.BANK, str)) : null;
            return mapF == null ? p013kotlin.collections.v0.i() : mapF;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fpx) && p013kotlin.jvm.internal.s.f(this.bank, ((Fpx) other).bank);
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Fpx(bank=" + this.bank + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bank);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$h, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u0006¨\u0006 "}, d2 = {"Lcom/stripe/android/model/w0$h;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", PlaceTypes.BANK, "<init>", "(Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getBank", "setBank", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ideal implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String bank;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f51686b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51687c = 8;
        public static final Parcelable.Creator<Ideal> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$h$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/w0$h$a;", "", "<init>", "()V", "", "PARAM_BANK", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$h$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Ideal> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Ideal createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Ideal(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Ideal[] newArray(int i11) {
                return new Ideal[i11];
            }
        }

        public Ideal(String str) {
            this.bank = str;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            String str = this.bank;
            Map<String, Object> mapF = str != null ? p013kotlin.collections.v0.f(jn0.x.a(PlaceTypes.BANK, str)) : null;
            return mapF == null ? p013kotlin.collections.v0.i() : mapF;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ideal) && p013kotlin.jvm.internal.s.f(this.bank, ((Ideal) other).bank);
        }

        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Ideal(bank=" + this.bank + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bank);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$i, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001\u001dB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010!R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/stripe/android/model/w0$i;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "paymentDetailsId", "consumerSessionClientSecret", "", "", "extraParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getPaymentDetailsId$payments_core_release", "setPaymentDetailsId$payments_core_release", "(Ljava/lang/String;)V", "b", "getConsumerSessionClientSecret$payments_core_release", "setConsumerSessionClientSecret$payments_core_release", "c", "Ljava/util/Map;", "getExtraParams$payments_core_release", "setExtraParams$payments_core_release", "(Ljava/util/Map;)V", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Link implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String paymentDetailsId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private String consumerSessionClientSecret;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private Map<String, ? extends Object> extraParams;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final a f51689d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f51690e = 8;
        public static final Parcelable.Creator<Link> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$i$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/w0$i$a;", "", "<init>", "()V", "", "PARAM_CONSUMER_SESSION_CLIENT_SECRET", "Ljava/lang/String;", "PARAM_CREDENTIALS", "PARAM_PAYMENT_DETAILS_ID", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$i$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Link> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Link createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i11 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(Link.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Link(string, string2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Link[] newArray(int i11) {
                return new Link[i11];
            }
        }

        public Link(String paymentDetailsId, String consumerSessionClientSecret, Map<String, ? extends Object> map) {
            p013kotlin.jvm.internal.s.k(paymentDetailsId, "paymentDetailsId");
            p013kotlin.jvm.internal.s.k(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.paymentDetailsId = paymentDetailsId;
            this.consumerSessionClientSecret = consumerSessionClientSecret;
            this.extraParams = map;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            Map mapM = p013kotlin.collections.v0.m(jn0.x.a("payment_details_id", this.paymentDetailsId), jn0.x.a("credentials", p013kotlin.collections.v0.f(jn0.x.a("consumer_session_client_secret", this.consumerSessionClientSecret))));
            Map<String, ? extends Object> mapI = this.extraParams;
            if (mapI == null) {
                mapI = p013kotlin.collections.v0.i();
            }
            return p013kotlin.collections.v0.r(mapM, mapI);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return p013kotlin.jvm.internal.s.f(this.paymentDetailsId, link.paymentDetailsId) && p013kotlin.jvm.internal.s.f(this.consumerSessionClientSecret, link.consumerSessionClientSecret) && p013kotlin.jvm.internal.s.f(this.extraParams, link.extraParams);
        }

        public int hashCode() {
            int iHashCode = ((this.paymentDetailsId.hashCode() * 31) + this.consumerSessionClientSecret.hashCode()) * 31;
            Map<String, ? extends Object> map = this.extraParams;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Link(paymentDetailsId=" + this.paymentDetailsId + ", consumerSessionClientSecret=" + this.consumerSessionClientSecret + ", extraParams=" + this.extraParams + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.paymentDetailsId);
            parcel.writeString(this.consumerSessionClientSecret);
            Map<String, ? extends Object> map = this.extraParams;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeValue(entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$j, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u0006¨\u0006 "}, d2 = {"Lcom/stripe/android/model/w0$j;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", PlaceTypes.BANK, "<init>", "(Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getBank$payments_core_release", "setBank$payments_core_release", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Netbanking implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String bank;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f51694b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51695c = 8;
        public static final Parcelable.Creator<Netbanking> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$j$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/w0$j$a;", "", "<init>", "()V", "", "PARAM_BANK", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$j$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Netbanking> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Netbanking createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Netbanking(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Netbanking[] newArray(int i11) {
                return new Netbanking[i11];
            }
        }

        public Netbanking(String bank) {
            p013kotlin.jvm.internal.s.k(bank, "bank");
            this.bank = bank;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            String lowerCase = this.bank.toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            return p013kotlin.collections.v0.f(jn0.x.a(PlaceTypes.BANK, lowerCase));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Netbanking) && p013kotlin.jvm.internal.s.f(this.bank, ((Netbanking) other).bank);
        }

        public int hashCode() {
            return this.bank.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.bank + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.bank);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$k, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u0006¨\u0006 "}, d2 = {"Lcom/stripe/android/model/w0$k;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "iban", "<init>", "(Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getIban", "setIban", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SepaDebit implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String iban;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f51697b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51698c = 8;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$k$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/w0$k$a;", "", "<init>", "()V", "", "PARAM_IBAN", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$k$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<SepaDebit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SepaDebit createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new SepaDebit(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SepaDebit[] newArray(int i11) {
                return new SepaDebit[i11];
            }
        }

        public SepaDebit(String str) {
            this.iban = str;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            String str = this.iban;
            Map<String, Object> mapF = str != null ? p013kotlin.collections.v0.f(jn0.x.a("iban", str)) : null;
            return mapF == null ? p013kotlin.collections.v0.i() : mapF;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SepaDebit) && p013kotlin.jvm.internal.s.f(this.iban, ((SepaDebit) other).iban);
        }

        public int hashCode() {
            String str = this.iban;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SepaDebit(iban=" + this.iban + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.iban);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$l, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u0006¨\u0006 "}, d2 = {"Lcom/stripe/android/model/w0$l;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getCountry$payments_core_release", "setCountry$payments_core_release", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Sofort implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String country;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f51700b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f51701c = 8;
        public static final Parcelable.Creator<Sofort> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$l$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/w0$l$a;", "", "<init>", "()V", "", "PARAM_COUNTRY", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$l$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Sofort> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Sofort createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Sofort(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Sofort[] newArray(int i11) {
                return new Sofort[i11];
            }
        }

        public Sofort(String country) {
            p013kotlin.jvm.internal.s.k(country, "country");
            this.country = country;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            String upperCase = this.country.toUpperCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
            return p013kotlin.collections.v0.f(jn0.x.a(PlaceTypes.COUNTRY, upperCase));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sofort) && p013kotlin.jvm.internal.s.f(this.country, ((Sofort) other).country);
        }

        public int hashCode() {
            return this.country.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.country + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.country);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$m */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/w0$m;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements o1, Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$m$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                parcel.readInt();
                return new m();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i11) {
                return new m[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$n, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001#BE\b\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\rB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000eJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010$\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\rR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\rR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/stripe/android/model/w0$n;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "linkAccountSessionId", "accountNumber", "routingNumber", "Lcom/stripe/android/model/v0$r$c;", "accountType", "Lcom/stripe/android/model/v0$r$b;", "accountHolderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/v0$r$c;Lcom/stripe/android/model/v0$r$b;)V", "(Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/v0$r$c;Lcom/stripe/android/model/v0$r$b;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getLinkAccountSessionId$payments_core_release", "setLinkAccountSessionId$payments_core_release", "b", "getAccountNumber$payments_core_release", "setAccountNumber$payments_core_release", "c", "getRoutingNumber$payments_core_release", "setRoutingNumber$payments_core_release", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/v0$r$c;", "getAccountType$payments_core_release", "()Lcom/stripe/android/model/v0$r$c;", "setAccountType$payments_core_release", "(Lcom/stripe/android/model/v0$r$c;)V", "e", "Lcom/stripe/android/model/v0$r$b;", "getAccountHolderType$payments_core_release", "()Lcom/stripe/android/model/v0$r$b;", "setAccountHolderType$payments_core_release", "(Lcom/stripe/android/model/v0$r$b;)V", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class USBankAccount implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private String linkAccountSessionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private String accountNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private String routingNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private PaymentMethod.USBankAccount.c accountType;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private PaymentMethod.USBankAccount.b accountHolderType;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final a f51703f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f51704g = 8;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$n$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/w0$n$a;", "", "<init>", "()V", "", "PARAM_ACCOUNT_HOLDER_TYPE", "Ljava/lang/String;", "PARAM_ACCOUNT_NUMBER", "PARAM_ACCOUNT_TYPE", "PARAM_LINKED_ACCOUNT_SESSION_ID", "PARAM_ROUTING_NUMBER", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$n$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<USBankAccount> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final USBankAccount createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new USBankAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.USBankAccount.c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentMethod.USBankAccount.b.CREATOR.createFromParcel(parcel) : null, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final USBankAccount[] newArray(int i11) {
                return new USBankAccount[i11];
            }
        }

        public /* synthetic */ USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.c cVar, PaymentMethod.USBankAccount.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, cVar, bVar);
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            String str = this.linkAccountSessionId;
            if (str != null) {
                p013kotlin.jvm.internal.s.h(str);
                return p013kotlin.collections.v0.f(jn0.x.a("link_account_session", str));
            }
            String str2 = this.accountNumber;
            p013kotlin.jvm.internal.s.h(str2);
            Pair pairA = jn0.x.a("account_number", str2);
            String str3 = this.routingNumber;
            p013kotlin.jvm.internal.s.h(str3);
            Pair pairA2 = jn0.x.a("routing_number", str3);
            PaymentMethod.USBankAccount.c cVar = this.accountType;
            p013kotlin.jvm.internal.s.h(cVar);
            Pair pairA3 = jn0.x.a("account_type", cVar.getValue());
            PaymentMethod.USBankAccount.b bVar = this.accountHolderType;
            p013kotlin.jvm.internal.s.h(bVar);
            return p013kotlin.collections.v0.m(pairA, pairA2, pairA3, jn0.x.a("account_holder_type", bVar.getValue()));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return p013kotlin.jvm.internal.s.f(this.linkAccountSessionId, uSBankAccount.linkAccountSessionId) && p013kotlin.jvm.internal.s.f(this.accountNumber, uSBankAccount.accountNumber) && p013kotlin.jvm.internal.s.f(this.routingNumber, uSBankAccount.routingNumber) && this.accountType == uSBankAccount.accountType && this.accountHolderType == uSBankAccount.accountHolderType;
        }

        public int hashCode() {
            String str = this.linkAccountSessionId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountNumber;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.routingNumber;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            PaymentMethod.USBankAccount.c cVar = this.accountType;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            PaymentMethod.USBankAccount.b bVar = this.accountHolderType;
            return iHashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(linkAccountSessionId=" + this.linkAccountSessionId + ", accountNumber=" + this.accountNumber + ", routingNumber=" + this.routingNumber + ", accountType=" + this.accountType + ", accountHolderType=" + this.accountHolderType + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.linkAccountSessionId);
            parcel.writeString(this.accountNumber);
            parcel.writeString(this.routingNumber);
            PaymentMethod.USBankAccount.c cVar = this.accountType;
            if (cVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cVar.writeToParcel(parcel, flags);
            }
            PaymentMethod.USBankAccount.b bVar = this.accountHolderType;
            if (bVar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bVar.writeToParcel(parcel, flags);
            }
        }

        private USBankAccount(String str, String str2, String str3, PaymentMethod.USBankAccount.c cVar, PaymentMethod.USBankAccount.b bVar) {
            this.linkAccountSessionId = str;
            this.accountNumber = str2;
            this.routingNumber = str3;
            this.accountType = cVar;
            this.accountHolderType = bVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public USBankAccount(String linkAccountSessionId) {
            this(linkAccountSessionId, null, null, null, null);
            p013kotlin.jvm.internal.s.k(linkAccountSessionId, "linkAccountSessionId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public USBankAccount(String accountNumber, String routingNumber, PaymentMethod.USBankAccount.c accountType, PaymentMethod.USBankAccount.b accountHolderType) {
            this(null, accountNumber, routingNumber, accountType, accountHolderType);
            p013kotlin.jvm.internal.s.k(accountNumber, "accountNumber");
            p013kotlin.jvm.internal.s.k(routingNumber, "routingNumber");
            p013kotlin.jvm.internal.s.k(accountType, "accountType");
            p013kotlin.jvm.internal.s.k(accountHolderType, "accountHolderType");
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.w0$o, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/w0$o;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "vpa", "<init>", "(Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Upi implements o1, Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vpa;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f51710b = new a(null);
        public static final Parcelable.Creator<Upi> CREATOR = new b();

        /* JADX INFO: renamed from: com.stripe.android.model.w0$o$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/w0$o$a;", "", "<init>", "()V", "", "PARAM_VPA", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.model.w0$o$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Upi> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Upi createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Upi(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Upi[] newArray(int i11) {
                return new Upi[i11];
            }
        }

        public Upi(String str) {
            this.vpa = str;
        }

        @Override // com.stripe.android.model.o1
        public Map<String, Object> c3() {
            String str = this.vpa;
            Map<String, Object> mapF = str != null ? p013kotlin.collections.v0.f(jn0.x.a("vpa", str)) : null;
            return mapF == null ? p013kotlin.collections.v0.i() : mapF;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Upi) && p013kotlin.jvm.internal.s.f(this.vpa, ((Upi) other).vpa);
        }

        public int hashCode() {
            String str = this.vpa;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.vpa + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.vpa);
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(AuBecsDebit auBecsDebit, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(auBecsDebit, bVar, eVar, (Map<String, String>) map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodCreateParams d(PaymentMethodCreateParams paymentMethodCreateParams, String str, boolean z11, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, d dVar, m mVar, PaymentMethod.BillingDetails eVar, PaymentMethod.b bVar, Map map, Set set, Map map2, int i11, Object obj) {
        Map map3;
        Set set2;
        String str2 = (i11 & 1) != 0 ? paymentMethodCreateParams.code : str;
        boolean z12 = (i11 & 2) != 0 ? paymentMethodCreateParams.requiresMandate : z11;
        Card card2 = (i11 & 4) != 0 ? paymentMethodCreateParams.card : card;
        Ideal ideal2 = (i11 & 8) != 0 ? paymentMethodCreateParams.ideal : ideal;
        Fpx fpx2 = (i11 & 16) != 0 ? paymentMethodCreateParams.fpx : fpx;
        SepaDebit sepaDebit2 = (i11 & 32) != 0 ? paymentMethodCreateParams.sepaDebit : sepaDebit;
        AuBecsDebit auBecsDebit2 = (i11 & 64) != 0 ? paymentMethodCreateParams.auBecsDebit : auBecsDebit;
        BacsDebit bacsDebit2 = (i11 & 128) != 0 ? paymentMethodCreateParams.bacsDebit : bacsDebit;
        Sofort sofort2 = (i11 & 256) != 0 ? paymentMethodCreateParams.sofort : sofort;
        Upi upi2 = (i11 & 512) != 0 ? paymentMethodCreateParams.upi : upi;
        Netbanking netbanking2 = (i11 & 1024) != 0 ? paymentMethodCreateParams.netbanking : netbanking;
        USBankAccount uSBankAccount2 = (i11 & 2048) != 0 ? paymentMethodCreateParams.usBankAccount : uSBankAccount;
        Link link2 = (i11 & 4096) != 0 ? paymentMethodCreateParams.link : link;
        d dVar2 = (i11 & PKIFailureInfo.certRevoked) != 0 ? paymentMethodCreateParams.cashAppPay : dVar;
        String str3 = str2;
        m mVar2 = (i11 & 16384) != 0 ? paymentMethodCreateParams.swish : mVar;
        PaymentMethod.BillingDetails eVar2 = (i11 & 32768) != 0 ? paymentMethodCreateParams.billingDetails : eVar;
        PaymentMethod.b bVar2 = (i11 & 65536) != 0 ? paymentMethodCreateParams.allowRedisplay : bVar;
        Map map4 = (i11 & 131072) != 0 ? paymentMethodCreateParams.metadata : map;
        Set set3 = (i11 & 262144) != 0 ? paymentMethodCreateParams.productUsage : set;
        if ((i11 & PKIFailureInfo.signerNotTrusted) != 0) {
            set2 = set3;
            map3 = paymentMethodCreateParams.overrideParamMap;
        } else {
            map3 = map2;
            set2 = set3;
        }
        return paymentMethodCreateParams.c(str3, z12, card2, ideal2, fpx2, sepaDebit2, auBecsDebit2, bacsDebit2, sofort2, upi2, netbanking2, uSBankAccount2, link2, dVar2, mVar2, eVar2, bVar2, map4, set2, map3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Map<String, Object> j() {
        Link link;
        Map<String, Object> mapC3;
        String str = this.code;
        if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.Card.code)) {
            Card card = this.card;
            if (card != null) {
                mapC3 = card.c3();
            } else {
                mapC3 = null;
            }
        } else if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.Ideal.code)) {
            Ideal ideal = this.ideal;
            if (ideal != null) {
                mapC3 = ideal.c3();
            } else {
                mapC3 = null;
            }
        } else if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.Fpx.code)) {
            Fpx fpx = this.fpx;
            if (fpx != null) {
                mapC3 = fpx.c3();
            } else {
                mapC3 = null;
            }
        } else if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.SepaDebit.code)) {
            SepaDebit sepaDebit = this.sepaDebit;
            if (sepaDebit != null) {
                mapC3 = sepaDebit.c3();
            } else {
                mapC3 = null;
            }
        } else if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.AuBecsDebit.code)) {
            AuBecsDebit auBecsDebit = this.auBecsDebit;
            if (auBecsDebit != null) {
                mapC3 = auBecsDebit.c3();
            } else {
                mapC3 = null;
            }
        } else if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.BacsDebit.code)) {
            BacsDebit bacsDebit = this.bacsDebit;
            if (bacsDebit != null) {
                mapC3 = bacsDebit.c3();
            } else {
                mapC3 = null;
            }
        } else if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.Sofort.code)) {
            Sofort sofort = this.sofort;
            if (sofort != null) {
                mapC3 = sofort.c3();
            } else {
                mapC3 = null;
            }
        } else if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.Upi.code)) {
            Upi upi = this.upi;
            if (upi != null) {
                mapC3 = upi.c3();
            } else {
                mapC3 = null;
            }
        } else if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.Netbanking.code)) {
            Netbanking netbanking = this.netbanking;
            if (netbanking != null) {
                mapC3 = netbanking.c3();
            } else {
                mapC3 = null;
            }
        } else if (p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.USBankAccount.code)) {
            USBankAccount uSBankAccount = this.usBankAccount;
            if (uSBankAccount != null) {
                mapC3 = uSBankAccount.c3();
            } else {
                mapC3 = null;
            }
        } else if (!p013kotlin.jvm.internal.s.f(str, PaymentMethod.p.Link.code) || (link = this.link) == null) {
            mapC3 = null;
        } else {
            mapC3 = link.c3();
        }
        if (mapC3 == null || mapC3.isEmpty()) {
            mapC3 = null;
        }
        Map<String, Object> mapF = mapC3 != null ? p013kotlin.collections.v0.f(jn0.x.a(this.code, mapC3)) : null;
        return mapF == null ? p013kotlin.collections.v0.i() : mapF;
    }

    public final String b() {
        Object obj = c3().get("card");
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get(InquiryField.FloatField.TYPE2) : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str != null) {
            return p013kotlin.text.t.U1(str, 4);
        }
        return null;
    }

    public final PaymentMethodCreateParams c(String code, boolean requiresMandate, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount usBankAccount, Link link, d cashAppPay, m swish, PaymentMethod.BillingDetails billingDetails, PaymentMethod.b allowRedisplay, Map<String, String> metadata, Set<String> productUsage, Map<String, ? extends Object> overrideParamMap) {
        p013kotlin.jvm.internal.s.k(code, "code");
        p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
        return new PaymentMethodCreateParams(code, requiresMandate, card, ideal, fpx, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, usBankAccount, link, cashAppPay, swish, billingDetails, allowRedisplay, metadata, productUsage, overrideParamMap);
    }

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        Map<String, Object> mapR = this.overrideParamMap;
        if (mapR == null) {
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a("type", this.code));
            PaymentMethod.BillingDetails eVar = this.billingDetails;
            Map mapF2 = eVar != null ? p013kotlin.collections.v0.f(jn0.x.a("billing_details", eVar.c3())) : null;
            if (mapF2 == null) {
                mapF2 = p013kotlin.collections.v0.i();
            }
            Map mapR2 = p013kotlin.collections.v0.r(p013kotlin.collections.v0.r(mapF, mapF2), j());
            Map<String, String> map = this.metadata;
            Map mapF3 = map != null ? p013kotlin.collections.v0.f(jn0.x.a(OrcaKeys.METADATA, map)) : null;
            if (mapF3 == null) {
                mapF3 = p013kotlin.collections.v0.i();
            }
            mapR = p013kotlin.collections.v0.r(mapR2, mapF3);
        }
        PaymentMethod.b bVar = this.allowRedisplay;
        Map mapF4 = bVar != null ? p013kotlin.collections.v0.f(jn0.x.a("allow_redisplay", bVar.getValue())) : null;
        if (mapF4 == null) {
            mapF4 = p013kotlin.collections.v0.i();
        }
        return p013kotlin.collections.v0.r(mapR, mapF4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final /* synthetic */ Set e() {
        Set<String> setD;
        if (!p013kotlin.jvm.internal.s.f(this.code, PaymentMethod.p.Card.code)) {
            return this.productUsage;
        }
        Card card = this.card;
        if (card == null || (setD = card.a()) == null) {
            setD = p013kotlin.collections.d1.d();
        }
        return p013kotlin.collections.d1.n(setD, this.productUsage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodCreateParams)) {
            return false;
        }
        PaymentMethodCreateParams paymentMethodCreateParams = (PaymentMethodCreateParams) other;
        return p013kotlin.jvm.internal.s.f(this.code, paymentMethodCreateParams.code) && this.requiresMandate == paymentMethodCreateParams.requiresMandate && p013kotlin.jvm.internal.s.f(this.card, paymentMethodCreateParams.card) && p013kotlin.jvm.internal.s.f(this.ideal, paymentMethodCreateParams.ideal) && p013kotlin.jvm.internal.s.f(this.fpx, paymentMethodCreateParams.fpx) && p013kotlin.jvm.internal.s.f(this.sepaDebit, paymentMethodCreateParams.sepaDebit) && p013kotlin.jvm.internal.s.f(this.auBecsDebit, paymentMethodCreateParams.auBecsDebit) && p013kotlin.jvm.internal.s.f(this.bacsDebit, paymentMethodCreateParams.bacsDebit) && p013kotlin.jvm.internal.s.f(this.sofort, paymentMethodCreateParams.sofort) && p013kotlin.jvm.internal.s.f(this.upi, paymentMethodCreateParams.upi) && p013kotlin.jvm.internal.s.f(this.netbanking, paymentMethodCreateParams.netbanking) && p013kotlin.jvm.internal.s.f(this.usBankAccount, paymentMethodCreateParams.usBankAccount) && p013kotlin.jvm.internal.s.f(this.link, paymentMethodCreateParams.link) && p013kotlin.jvm.internal.s.f(this.cashAppPay, paymentMethodCreateParams.cashAppPay) && p013kotlin.jvm.internal.s.f(this.swish, paymentMethodCreateParams.swish) && p013kotlin.jvm.internal.s.f(this.billingDetails, paymentMethodCreateParams.billingDetails) && this.allowRedisplay == paymentMethodCreateParams.allowRedisplay && p013kotlin.jvm.internal.s.f(this.metadata, paymentMethodCreateParams.metadata) && p013kotlin.jvm.internal.s.f(this.productUsage, paymentMethodCreateParams.productUsage) && p013kotlin.jvm.internal.s.f(this.overrideParamMap, paymentMethodCreateParams.overrideParamMap);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final PaymentMethod.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequiresMandate() {
        return this.requiresMandate;
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + Boolean.hashCode(this.requiresMandate)) * 31;
        Card card = this.card;
        int iHashCode2 = (iHashCode + (card == null ? 0 : card.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int iHashCode3 = (iHashCode2 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int iHashCode4 = (iHashCode3 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int iHashCode5 = (iHashCode4 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int iHashCode6 = (iHashCode5 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int iHashCode7 = (iHashCode6 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Sofort sofort = this.sofort;
        int iHashCode8 = (iHashCode7 + (sofort == null ? 0 : sofort.hashCode())) * 31;
        Upi upi = this.upi;
        int iHashCode9 = (iHashCode8 + (upi == null ? 0 : upi.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int iHashCode10 = (iHashCode9 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        int iHashCode11 = (iHashCode10 + (uSBankAccount == null ? 0 : uSBankAccount.hashCode())) * 31;
        Link link = this.link;
        int iHashCode12 = (iHashCode11 + (link == null ? 0 : link.hashCode())) * 31;
        d dVar = this.cashAppPay;
        int iHashCode13 = (iHashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        m mVar = this.swish;
        int iHashCode14 = (iHashCode13 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        PaymentMethod.BillingDetails eVar = this.billingDetails;
        int iHashCode15 = (iHashCode14 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        PaymentMethod.b bVar = this.allowRedisplay;
        int iHashCode16 = (iHashCode15 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int iHashCode17 = (((iHashCode16 + (map == null ? 0 : map.hashCode())) * 31) + this.productUsage.hashCode()) * 31;
        Map<String, Object> map2 = this.overrideParamMap;
        return iHashCode17 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String i() {
        return this.code;
    }

    public final String k() {
        Object obj = c3().get("link");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        Object obj2 = map.get("payment_method_id");
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    public final boolean l() {
        return this.requiresMandate;
    }

    public String toString() {
        return "PaymentMethodCreateParams(code=" + this.code + ", requiresMandate=" + this.requiresMandate + ", card=" + this.card + ", ideal=" + this.ideal + ", fpx=" + this.fpx + ", sepaDebit=" + this.sepaDebit + ", auBecsDebit=" + this.auBecsDebit + ", bacsDebit=" + this.bacsDebit + ", sofort=" + this.sofort + ", upi=" + this.upi + ", netbanking=" + this.netbanking + ", usBankAccount=" + this.usBankAccount + ", link=" + this.link + ", cashAppPay=" + this.cashAppPay + ", swish=" + this.swish + ", billingDetails=" + this.billingDetails + ", allowRedisplay=" + this.allowRedisplay + ", metadata=" + this.metadata + ", productUsage=" + this.productUsage + ", overrideParamMap=" + this.overrideParamMap + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.code);
        parcel.writeInt(this.requiresMandate ? 1 : 0);
        Card card = this.card;
        if (card == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            card.writeToParcel(parcel, flags);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ideal.writeToParcel(parcel, flags);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fpx.writeToParcel(parcel, flags);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sepaDebit.writeToParcel(parcel, flags);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auBecsDebit.writeToParcel(parcel, flags);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bacsDebit.writeToParcel(parcel, flags);
        }
        Sofort sofort = this.sofort;
        if (sofort == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sofort.writeToParcel(parcel, flags);
        }
        Upi upi = this.upi;
        if (upi == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            upi.writeToParcel(parcel, flags);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            netbanking.writeToParcel(parcel, flags);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uSBankAccount.writeToParcel(parcel, flags);
        }
        Link link = this.link;
        if (link == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            link.writeToParcel(parcel, flags);
        }
        d dVar = this.cashAppPay;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, flags);
        }
        m mVar = this.swish;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, flags);
        }
        PaymentMethod.BillingDetails eVar = this.billingDetails;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, flags);
        }
        PaymentMethod.b bVar = this.allowRedisplay;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, flags);
        }
        Map<String, String> map = this.metadata;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Set<String> set = this.productUsage;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        Map<String, Object> map2 = this.overrideParamMap;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeValue(entry2.getValue());
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(Card card, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(card, bVar, eVar, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(d dVar, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, bVar, eVar, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Fpx fpx, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(fpx, bVar, eVar, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Ideal ideal, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(ideal, bVar, eVar, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Netbanking netbanking, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(netbanking, bVar, eVar, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(SepaDebit sepaDebit, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(sepaDebit, bVar, eVar, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Sofort sofort, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(sofort, bVar, eVar, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(USBankAccount uSBankAccount, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(uSBankAccount, bVar, eVar, (Map<String, String>) map);
    }

    public PaymentMethodCreateParams(String code, boolean z11, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, d dVar, m mVar, PaymentMethod.BillingDetails eVar, PaymentMethod.b bVar, Map<String, String> map, Set<String> productUsage, Map<String, ? extends Object> map2) {
        p013kotlin.jvm.internal.s.k(code, "code");
        p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
        this.code = code;
        this.requiresMandate = z11;
        this.card = card;
        this.ideal = ideal;
        this.fpx = fpx;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.sofort = sofort;
        this.upi = upi;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
        this.link = link;
        this.cashAppPay = dVar;
        this.swish = mVar;
        this.billingDetails = eVar;
        this.allowRedisplay = bVar;
        this.metadata = map;
        this.productUsage = productUsage;
        this.overrideParamMap = map2;
    }

    public /* synthetic */ PaymentMethodCreateParams(String str, boolean z11, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, d dVar, m mVar, PaymentMethod.BillingDetails eVar, PaymentMethod.b bVar, Map map, Set set, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, (i11 & 4) != 0 ? null : card, (i11 & 8) != 0 ? null : ideal, (i11 & 16) != 0 ? null : fpx, (i11 & 32) != 0 ? null : sepaDebit, (i11 & 64) != 0 ? null : auBecsDebit, (i11 & 128) != 0 ? null : bacsDebit, (i11 & 256) != 0 ? null : sofort, (i11 & 512) != 0 ? null : upi, (i11 & 1024) != 0 ? null : netbanking, (i11 & 2048) != 0 ? null : uSBankAccount, (i11 & 4096) != 0 ? null : link, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : dVar, (i11 & 16384) != 0 ? null : mVar, (32768 & i11) != 0 ? null : eVar, (65536 & i11) != 0 ? null : bVar, (131072 & i11) != 0 ? null : map, (262144 & i11) != 0 ? p013kotlin.collections.d1.d() : set, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : map2);
    }

    public /* synthetic */ PaymentMethodCreateParams(PaymentMethod.p pVar, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, d dVar, m mVar, PaymentMethod.BillingDetails eVar, PaymentMethod.b bVar, Map map, Set set, Map map2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i11 & 2) != 0 ? null : card, (i11 & 4) != 0 ? null : ideal, (i11 & 8) != 0 ? null : fpx, (i11 & 16) != 0 ? null : sepaDebit, (i11 & 32) != 0 ? null : auBecsDebit, (i11 & 64) != 0 ? null : bacsDebit, (i11 & 128) != 0 ? null : sofort, (i11 & 256) != 0 ? null : upi, (i11 & 512) != 0 ? null : netbanking, (i11 & 1024) != 0 ? null : uSBankAccount, (i11 & 2048) != 0 ? null : link, (i11 & 4096) != 0 ? null : dVar, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : mVar, (i11 & 16384) != 0 ? null : eVar, (i11 & 32768) != 0 ? null : bVar, (i11 & 65536) != 0 ? null : map, (i11 & 131072) != 0 ? p013kotlin.collections.d1.d() : set, (i11 & 262144) != 0 ? null : map2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentMethodCreateParams(PaymentMethod.p type, Card card, Ideal ideal, Fpx fpx, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, Link link, d dVar, m mVar, PaymentMethod.BillingDetails eVar, PaymentMethod.b bVar, Map<String, String> map, Set<String> productUsage, Map<String, ? extends Object> map2) {
        this(type.code, type.requiresMandate, card, ideal, fpx, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, uSBankAccount, link, dVar, mVar, eVar, bVar, map, productUsage, map2);
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(productUsage, "productUsage");
    }

    private PaymentMethodCreateParams(Card card, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map<String, String> map) {
        this(PaymentMethod.p.Card, card, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409596, null);
    }

    private PaymentMethodCreateParams(Ideal ideal, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map<String, String> map) {
        this(PaymentMethod.p.Ideal, null, ideal, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409594, null);
    }

    private PaymentMethodCreateParams(Fpx fpx, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map<String, String> map) {
        this(PaymentMethod.p.Fpx, null, null, fpx, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409590, null);
    }

    private PaymentMethodCreateParams(SepaDebit sepaDebit, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map<String, String> map) {
        this(PaymentMethod.p.SepaDebit, null, null, null, sepaDebit, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409582, null);
    }

    private PaymentMethodCreateParams(AuBecsDebit auBecsDebit, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map<String, String> map) {
        this(PaymentMethod.p.AuBecsDebit, null, null, null, null, auBecsDebit, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409566, null);
    }

    private PaymentMethodCreateParams(Sofort sofort, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map<String, String> map) {
        this(PaymentMethod.p.Sofort, null, null, null, null, null, null, sofort, null, null, null, null, null, null, eVar, bVar, map, null, null, 409470, null);
    }

    private PaymentMethodCreateParams(Netbanking netbanking, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map<String, String> map) {
        this(PaymentMethod.p.Netbanking, null, null, null, null, null, null, null, null, netbanking, null, null, null, null, eVar, bVar, map, null, null, 409086, null);
    }

    private PaymentMethodCreateParams(USBankAccount uSBankAccount, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map<String, String> map) {
        this(PaymentMethod.p.USBankAccount, null, null, null, null, null, null, null, null, null, uSBankAccount, null, null, null, eVar, bVar, map, null, null, 408574, null);
    }

    private PaymentMethodCreateParams(d dVar, PaymentMethod.b bVar, PaymentMethod.BillingDetails eVar, Map<String, String> map) {
        this(PaymentMethod.p.CashAppPay, null, null, null, null, null, null, null, null, null, null, null, dVar, null, eVar, bVar, map, null, null, 405502, null);
    }
}
