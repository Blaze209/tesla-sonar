package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.EPSPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.IdealPaymentMethod;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bG\b\u0087\b\u0018\u0000 v2\u00020\u00012\u00020\u0002:\tw8x?AEyz{B\u0089\u0002\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020+HÖ\u0001¢\u0006\u0004\b1\u0010-J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020+HÖ\u0001¢\u0006\u0004\b6\u00107R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b@\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010>R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bH\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b8\u0010KR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b\u000f\u0010NR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b;\u0010YR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R'\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\b?\u0010dR\u0017\u0010\u001c\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\be\u00109\u001a\u0004\bf\u0010*R\u0017\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bg\u0010*R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0019\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bt\u00109\u001a\u0004\bu\u0010*¨\u0006|"}, d2 = {"Lcom/stripe/android/model/Source;", "Lt30/f;", "", "", "id", "", "amount", "clientSecret", "Lcom/stripe/android/model/Source$CodeVerification;", "codeVerification", "created", "currency", "Lcom/stripe/android/model/Source$Flow;", AnalyticsContext.Flow, "", "isLiveMode", "Lcom/stripe/android/model/Source$d;", "owner", "Lcom/stripe/android/model/Source$e;", "receiver", "Lcom/stripe/android/model/Source$Redirect;", RedirectAction.ACTION_TYPE, "Lcom/stripe/android/model/Source$Status;", PermissionsResponse.STATUS_KEY, "", "sourceTypeData", "Lcom/stripe/android/model/SourceTypeModel;", "sourceTypeModel", "type", "typeRaw", "Lcom/stripe/android/model/Source$Usage;", "usage", "Lcom/stripe/android/model/u1;", "_weChat", "Lcom/stripe/android/model/Source$c;", "_klarna", "Lcom/stripe/android/model/h1;", "sourceOrder", "statementDescriptor", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$d;Lcom/stripe/android/model/Source$e;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/u1;Lcom/stripe/android/model/Source$c;Lcom/stripe/android/model/h1;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "b", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "c", "p", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/Source$CodeVerification;", "getCodeVerification", "()Lcom/stripe/android/model/Source$CodeVerification;", "e", "getCreated", "f", "getCurrency", "g", "Lcom/stripe/android/model/Source$Flow;", "()Lcom/stripe/android/model/Source$Flow;", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/Source$d;", "getOwner", "()Lcom/stripe/android/model/Source$d;", "j", "Lcom/stripe/android/model/Source$e;", "getReceiver", "()Lcom/stripe/android/model/Source$e;", "k", "Lcom/stripe/android/model/Source$Redirect;", "()Lcom/stripe/android/model/Source$Redirect;", "l", "Lcom/stripe/android/model/Source$Status;", "getStatus", "()Lcom/stripe/android/model/Source$Status;", "m", "Ljava/util/Map;", "getSourceTypeData", "()Ljava/util/Map;", "n", "Lcom/stripe/android/model/SourceTypeModel;", "()Lcom/stripe/android/model/SourceTypeModel;", "o", "getType", "getTypeRaw", "q", "Lcom/stripe/android/model/Source$Usage;", "getUsage", "()Lcom/stripe/android/model/Source$Usage;", "r", "Lcom/stripe/android/model/u1;", "s", "Lcom/stripe/android/model/Source$c;", "t", "Lcom/stripe/android/model/h1;", "getSourceOrder", "()Lcom/stripe/android/model/h1;", "u", "getStatementDescriptor", "v", "CodeVerification", "Flow", "Redirect", "Status", "Usage", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Source implements t30.f, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CodeVerification codeVerification;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long created;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Flow flow;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isLiveMode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Owner owner;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Receiver receiver;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Redirect redirect;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Status status;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> sourceTypeData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final SourceTypeModel sourceTypeModel;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String typeRaw;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final Usage usage;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final WeChat _weChat;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Klarna _klarna;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final SourceOrder sourceOrder;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statementDescriptor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f50937w = 8;
    public static final Parcelable.Creator<Source> CREATOR = new b();

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification;", "Lt30/f;", "", "attemptsRemaining", "Lcom/stripe/android/model/Source$CodeVerification$Status;", PermissionsResponse.STATUS_KEY, "<init>", "(ILcom/stripe/android/model/Source$CodeVerification$Status;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "I", "getAttemptsRemaining", "b", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "getStatus", "()Lcom/stripe/android/model/Source$CodeVerification$Status;", "Status", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CodeVerification implements t30.f {
        public static final Parcelable.Creator<CodeVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int attemptsRemaining;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Status status;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "Pending", "Succeeded", "Failed", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum Status {
            Pending("pending"),
            Succeeded("succeeded"),
            Failed("failed");

            private final String code;
            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: com.stripe.android.model.Source$CodeVerification$Status$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$CodeVerification$Status$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/Source$CodeVerification$Status;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$CodeVerification$Status;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Status a(String code) {
                    Status next;
                    Iterator<Status> it = Status.getEntries().iterator();
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

            Status(String str) {
                this.code = str;
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.code;
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CodeVerification> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CodeVerification createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new CodeVerification(parcel.readInt(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CodeVerification[] newArray(int i11) {
                return new CodeVerification[i11];
            }
        }

        public CodeVerification(int i11, Status status) {
            this.attemptsRemaining = i11;
            this.status = status;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CodeVerification)) {
                return false;
            }
            CodeVerification codeVerification = (CodeVerification) other;
            return this.attemptsRemaining == codeVerification.attemptsRemaining && this.status == codeVerification.status;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.attemptsRemaining) * 31;
            Status status = this.status;
            return iHashCode + (status == null ? 0 : status.hashCode());
        }

        public String toString() {
            return "CodeVerification(attemptsRemaining=" + this.attemptsRemaining + ", status=" + this.status + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeInt(this.attemptsRemaining);
            Status status = this.status;
            if (status == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(status.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/Source$Flow;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode$payments_core_release", "Companion", "a", "Redirect", "Receiver", "CodeVerification", "None", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Flow {
        Redirect(RedirectAction.ACTION_TYPE),
        Receiver("receiver"),
        CodeVerification("code_verification"),
        None("none");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.Source$Flow$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$Flow$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/Source$Flow;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$Flow;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Flow a(String code) {
                Flow next;
                Iterator<Flow> it = Flow.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.getCode(), code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        Flow(String str) {
            this.code = str;
        }

        public static EnumEntries<Flow> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001a\u0010\n¨\u0006#"}, d2 = {"Lcom/stripe/android/model/Source$Redirect;", "Lt30/f;", "", "returnUrl", "Lcom/stripe/android/model/Source$Redirect$Status;", PermissionsResponse.STATUS_KEY, ImagesContract.URL, "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/Source$Redirect$Status;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getReturnUrl", "b", "Lcom/stripe/android/model/Source$Redirect$Status;", "getStatus", "()Lcom/stripe/android/model/Source$Redirect$Status;", "c", "Status", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Redirect implements t30.f {
        public static final Parcelable.Creator<Redirect> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String returnUrl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Status status;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/Source$Redirect$Status;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "Pending", "Succeeded", "NotRequired", "Failed", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum Status {
            Pending("pending"),
            Succeeded("succeeded"),
            NotRequired("not_required"),
            Failed("failed");

            private final String code;
            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: com.stripe.android.model.Source$Redirect$Status$a, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$Redirect$Status$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/Source$Redirect$Status;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$Redirect$Status;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Status a(String code) {
                    Status next;
                    Iterator<Status> it = Status.getEntries().iterator();
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

            Status(String str) {
                this.code = str;
            }

            public static EnumEntries<Status> getEntries() {
                return $ENTRIES;
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.code;
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Redirect> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Redirect createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Redirect(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Redirect[] newArray(int i11) {
                return new Redirect[i11];
            }
        }

        public Redirect(String str, Status status, String str2) {
            this.returnUrl = str;
            this.status = status;
            this.url = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) other;
            return p013kotlin.jvm.internal.s.f(this.returnUrl, redirect.returnUrl) && this.status == redirect.status && p013kotlin.jvm.internal.s.f(this.url, redirect.url);
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        public int hashCode() {
            String str = this.returnUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Status status = this.status;
            int iHashCode2 = (iHashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.url;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Redirect(returnUrl=" + this.returnUrl + ", status=" + this.status + ", url=" + this.url + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.returnUrl);
            Status status = this.status;
            if (status == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(status.name());
            }
            parcel.writeString(this.url);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/Source$Status;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "Canceled", "Chargeable", "Consumed", "Failed", "Pending", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Status {
        Canceled("canceled"),
        Chargeable("chargeable"),
        Consumed("consumed"),
        Failed("failed"),
        Pending("pending");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.Source$Status$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$Status$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/Source$Status;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$Status;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Status a(String code) {
                Status next;
                Iterator<Status> it = Status.getEntries().iterator();
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

        Status(String str) {
            this.code = str;
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/Source$Usage;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode$payments_core_release", "Companion", "a", "Reusable", "SingleUse", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Usage {
        Reusable("reusable"),
        SingleUse("single_use");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.model.Source$Usage$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/Source$Usage$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/Source$Usage;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/Source$Usage;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Usage a(String code) {
                Usage next;
                Iterator<Usage> it = Usage.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (p013kotlin.jvm.internal.s.f(next.getCode(), code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        Usage(String str) {
            this.code = str;
        }

        public static EnumEntries<Usage> getEntries() {
            return $ENTRIES;
        }

        /* JADX INFO: renamed from: getCode$payments_core_release, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.code;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.Source$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/Source$a;", "", "<init>", "()V", "", "sourceType", "a", "(Ljava/lang/String;)Ljava/lang/String;", "EURO", "Ljava/lang/String;", "USD", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final String a(String sourceType) {
            if (sourceType != null) {
                switch (sourceType.hashCode()) {
                    case -1920743119:
                        if (sourceType.equals("bancontact")) {
                            return "bancontact";
                        }
                        break;
                    case -1414960566:
                        if (sourceType.equals("alipay")) {
                            return "alipay";
                        }
                        break;
                    case -896955097:
                        if (sourceType.equals("sofort")) {
                            return "sofort";
                        }
                        break;
                    case -825238221:
                        if (sourceType.equals("three_d_secure")) {
                            return "three_d_secure";
                        }
                        break;
                    case -791770330:
                        if (sourceType.equals(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE)) {
                            return ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE;
                        }
                        break;
                    case -284840886:
                        sourceType.equals("unknown");
                        break;
                    case 100648:
                        if (sourceType.equals(EPSPaymentMethod.PAYMENT_METHOD_TYPE)) {
                            return EPSPaymentMethod.PAYMENT_METHOD_TYPE;
                        }
                        break;
                    case 109234:
                        if (sourceType.equals("p24")) {
                            return "p24";
                        }
                        break;
                    case 3046160:
                        if (sourceType.equals("card")) {
                            return "card";
                        }
                        break;
                    case 38358441:
                        if (sourceType.equals("giropay")) {
                            return "giropay";
                        }
                        break;
                    case 100048981:
                        if (sourceType.equals(IdealPaymentMethod.PAYMENT_METHOD_TYPE)) {
                            return IdealPaymentMethod.PAYMENT_METHOD_TYPE;
                        }
                        break;
                    case 1251821346:
                        if (sourceType.equals("multibanco")) {
                            return "multibanco";
                        }
                        break;
                    case 1636477296:
                        if (sourceType.equals("sepa_debit")) {
                            return "sepa_debit";
                        }
                        break;
                }
            }
            return "unknown";
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Source> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Source createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            LinkedHashMap linkedHashMap;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            CodeVerification codeVerificationCreateFromParcel = parcel.readInt() == 0 ? null : CodeVerification.CREATOR.createFromParcel(parcel);
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            Flow flowValueOf = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            int i11 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Owner ownerCreateFromParcel = parcel.readInt() == 0 ? null : Owner.CREATOR.createFromParcel(parcel);
            Receiver receiverCreateFromParcel = parcel.readInt() == 0 ? null : Receiver.CREATOR.createFromParcel(parcel);
            Redirect redirectCreateFromParcel = parcel.readInt() == 0 ? null : Redirect.CREATOR.createFromParcel(parcel);
            Status statusValueOf = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                while (i11 != i12) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(Source.class.getClassLoader()));
                    i11++;
                    boolValueOf = boolValueOf;
                    string = string;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Source(string, lValueOf, string2, codeVerificationCreateFromParcel, lValueOf2, string3, flowValueOf, boolValueOf, ownerCreateFromParcel, receiverCreateFromParcel, redirectCreateFromParcel, statusValueOf, linkedHashMap, (SourceTypeModel) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : WeChat.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Klarna.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SourceOrder.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Source[] newArray(int i11) {
            return new Source[i11];
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.Source$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010*\u001a\u0004\b3\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010*\u001a\u0004\b?\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010*\u001a\u0004\bA\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010*\u001a\u0004\bC\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010*\u001a\u0004\bE\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010*\u001a\u0004\bG\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010*\u001a\u0004\bI\u0010\u0019R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0006¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bO\u0010M¨\u0006P"}, d2 = {"Lcom/stripe/android/model/Source$c;", "Lt30/f;", "", EContextPaymentMethod.FIRST_NAME, EContextPaymentMethod.LAST_NAME, "purchaseCountry", "clientToken", "payNowAssetUrlsDescriptive", "payNowAssetUrlsStandard", "payNowName", "payNowRedirectUrl", "payLaterAssetUrlsDescriptive", "payLaterAssetUrlsStandard", "payLaterName", "payLaterRedirectUrl", "payOverTimeAssetUrlsDescriptive", "payOverTimeAssetUrlsStandard", "payOverTimeName", "payOverTimeRedirectUrl", "", "paymentMethodCategories", "customPaymentMethods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getFirstName", "b", "getLastName", "c", "getPurchaseCountry", DateTokenConverter.CONVERTER_KEY, "getClientToken", "e", "getPayNowAssetUrlsDescriptive", "f", "getPayNowAssetUrlsStandard", "g", "getPayNowName", "h", "getPayNowRedirectUrl", IntegerTokenConverter.CONVERTER_KEY, "getPayLaterAssetUrlsDescriptive", "j", "getPayLaterAssetUrlsStandard", "k", "getPayLaterName", "l", "getPayLaterRedirectUrl", "m", "getPayOverTimeAssetUrlsDescriptive", "n", "getPayOverTimeAssetUrlsStandard", "o", "getPayOverTimeName", "p", "getPayOverTimeRedirectUrl", "q", "Ljava/util/Set;", "getPaymentMethodCategories", "()Ljava/util/Set;", "r", "getCustomPaymentMethods", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Klarna implements t30.f {
        public static final Parcelable.Creator<Klarna> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String lastName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String purchaseCountry;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientToken;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payNowAssetUrlsDescriptive;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payNowAssetUrlsStandard;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payNowName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payNowRedirectUrl;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payLaterAssetUrlsDescriptive;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payLaterAssetUrlsStandard;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payLaterName;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payLaterRedirectUrl;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payOverTimeAssetUrlsDescriptive;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payOverTimeAssetUrlsStandard;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payOverTimeName;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String payOverTimeRedirectUrl;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> paymentMethodCategories;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<String> customPaymentMethods;

        /* JADX INFO: renamed from: com.stripe.android.model.Source$c$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Klarna> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Klarna createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                int i12 = 0;
                while (i12 != i11) {
                    linkedHashSet.add(parcel.readString());
                    i12++;
                    i11 = i11;
                }
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i13);
                int i14 = 0;
                while (i14 != i13) {
                    linkedHashSet2.add(parcel.readString());
                    i14++;
                    i13 = i13;
                }
                return new Klarna(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, linkedHashSet, linkedHashSet2);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Klarna[] newArray(int i11) {
                return new Klarna[i11];
            }
        }

        public Klarna(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set<String> paymentMethodCategories, Set<String> customPaymentMethods) {
            p013kotlin.jvm.internal.s.k(paymentMethodCategories, "paymentMethodCategories");
            p013kotlin.jvm.internal.s.k(customPaymentMethods, "customPaymentMethods");
            this.firstName = str;
            this.lastName = str2;
            this.purchaseCountry = str3;
            this.clientToken = str4;
            this.payNowAssetUrlsDescriptive = str5;
            this.payNowAssetUrlsStandard = str6;
            this.payNowName = str7;
            this.payNowRedirectUrl = str8;
            this.payLaterAssetUrlsDescriptive = str9;
            this.payLaterAssetUrlsStandard = str10;
            this.payLaterName = str11;
            this.payLaterRedirectUrl = str12;
            this.payOverTimeAssetUrlsDescriptive = str13;
            this.payOverTimeAssetUrlsStandard = str14;
            this.payOverTimeName = str15;
            this.payOverTimeRedirectUrl = str16;
            this.paymentMethodCategories = paymentMethodCategories;
            this.customPaymentMethods = customPaymentMethods;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Klarna)) {
                return false;
            }
            Klarna klarna = (Klarna) other;
            return p013kotlin.jvm.internal.s.f(this.firstName, klarna.firstName) && p013kotlin.jvm.internal.s.f(this.lastName, klarna.lastName) && p013kotlin.jvm.internal.s.f(this.purchaseCountry, klarna.purchaseCountry) && p013kotlin.jvm.internal.s.f(this.clientToken, klarna.clientToken) && p013kotlin.jvm.internal.s.f(this.payNowAssetUrlsDescriptive, klarna.payNowAssetUrlsDescriptive) && p013kotlin.jvm.internal.s.f(this.payNowAssetUrlsStandard, klarna.payNowAssetUrlsStandard) && p013kotlin.jvm.internal.s.f(this.payNowName, klarna.payNowName) && p013kotlin.jvm.internal.s.f(this.payNowRedirectUrl, klarna.payNowRedirectUrl) && p013kotlin.jvm.internal.s.f(this.payLaterAssetUrlsDescriptive, klarna.payLaterAssetUrlsDescriptive) && p013kotlin.jvm.internal.s.f(this.payLaterAssetUrlsStandard, klarna.payLaterAssetUrlsStandard) && p013kotlin.jvm.internal.s.f(this.payLaterName, klarna.payLaterName) && p013kotlin.jvm.internal.s.f(this.payLaterRedirectUrl, klarna.payLaterRedirectUrl) && p013kotlin.jvm.internal.s.f(this.payOverTimeAssetUrlsDescriptive, klarna.payOverTimeAssetUrlsDescriptive) && p013kotlin.jvm.internal.s.f(this.payOverTimeAssetUrlsStandard, klarna.payOverTimeAssetUrlsStandard) && p013kotlin.jvm.internal.s.f(this.payOverTimeName, klarna.payOverTimeName) && p013kotlin.jvm.internal.s.f(this.payOverTimeRedirectUrl, klarna.payOverTimeRedirectUrl) && p013kotlin.jvm.internal.s.f(this.paymentMethodCategories, klarna.paymentMethodCategories) && p013kotlin.jvm.internal.s.f(this.customPaymentMethods, klarna.customPaymentMethods);
        }

        public int hashCode() {
            String str = this.firstName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.purchaseCountry;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.clientToken;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.payNowAssetUrlsDescriptive;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.payNowAssetUrlsStandard;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.payNowName;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.payNowRedirectUrl;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.payLaterAssetUrlsDescriptive;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.payLaterAssetUrlsStandard;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.payLaterName;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.payLaterRedirectUrl;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.payOverTimeAssetUrlsDescriptive;
            int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.payOverTimeAssetUrlsStandard;
            int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.payOverTimeName;
            int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.payOverTimeRedirectUrl;
            return ((((iHashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.paymentMethodCategories.hashCode()) * 31) + this.customPaymentMethods.hashCode();
        }

        public String toString() {
            return "Klarna(firstName=" + this.firstName + ", lastName=" + this.lastName + ", purchaseCountry=" + this.purchaseCountry + ", clientToken=" + this.clientToken + ", payNowAssetUrlsDescriptive=" + this.payNowAssetUrlsDescriptive + ", payNowAssetUrlsStandard=" + this.payNowAssetUrlsStandard + ", payNowName=" + this.payNowName + ", payNowRedirectUrl=" + this.payNowRedirectUrl + ", payLaterAssetUrlsDescriptive=" + this.payLaterAssetUrlsDescriptive + ", payLaterAssetUrlsStandard=" + this.payLaterAssetUrlsStandard + ", payLaterName=" + this.payLaterName + ", payLaterRedirectUrl=" + this.payLaterRedirectUrl + ", payOverTimeAssetUrlsDescriptive=" + this.payOverTimeAssetUrlsDescriptive + ", payOverTimeAssetUrlsStandard=" + this.payOverTimeAssetUrlsStandard + ", payOverTimeName=" + this.payOverTimeName + ", payOverTimeRedirectUrl=" + this.payOverTimeRedirectUrl + ", paymentMethodCategories=" + this.paymentMethodCategories + ", customPaymentMethods=" + this.customPaymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.firstName);
            parcel.writeString(this.lastName);
            parcel.writeString(this.purchaseCountry);
            parcel.writeString(this.clientToken);
            parcel.writeString(this.payNowAssetUrlsDescriptive);
            parcel.writeString(this.payNowAssetUrlsStandard);
            parcel.writeString(this.payNowName);
            parcel.writeString(this.payNowRedirectUrl);
            parcel.writeString(this.payLaterAssetUrlsDescriptive);
            parcel.writeString(this.payLaterAssetUrlsStandard);
            parcel.writeString(this.payLaterName);
            parcel.writeString(this.payLaterRedirectUrl);
            parcel.writeString(this.payOverTimeAssetUrlsDescriptive);
            parcel.writeString(this.payOverTimeAssetUrlsStandard);
            parcel.writeString(this.payOverTimeName);
            parcel.writeString(this.payOverTimeRedirectUrl);
            Set<String> set = this.paymentMethodCategories;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
            Set<String> set2 = this.customPaymentMethods;
            parcel.writeInt(set2.size());
            Iterator<String> it2 = set2.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.Source$d, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BY\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010\u000f¨\u00062"}, d2 = {"Lcom/stripe/android/model/Source$d;", "Lt30/f;", "Lcom/stripe/android/model/b;", PlaceTypes.ADDRESS, "", Scopes.EMAIL, "name", "phone", "verifiedAddress", "verifiedEmail", "verifiedName", "verifiedPhone", "<init>", "(Lcom/stripe/android/model/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/b;", "getAddress", "()Lcom/stripe/android/model/b;", "b", "Ljava/lang/String;", "getEmail", "c", "getName", DateTokenConverter.CONVERTER_KEY, "getPhone", "e", "getVerifiedAddress", "f", "getVerifiedEmail", "g", "getVerifiedName", "h", "getVerifiedPhone", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Owner implements t30.f {
        public static final Parcelable.Creator<Owner> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Address address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phone;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Address verifiedAddress;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verifiedEmail;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verifiedName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verifiedPhone;

        /* JADX INFO: renamed from: com.stripe.android.model.Source$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Owner> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Owner createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Owner(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Owner[] newArray(int i11) {
                return new Owner[i11];
            }
        }

        public Owner(Address address, String str, String str2, String str3, Address address2, String str4, String str5, String str6) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
            this.verifiedAddress = address2;
            this.verifiedEmail = str4;
            this.verifiedName = str5;
            this.verifiedPhone = str6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) other;
            return p013kotlin.jvm.internal.s.f(this.address, owner.address) && p013kotlin.jvm.internal.s.f(this.email, owner.email) && p013kotlin.jvm.internal.s.f(this.name, owner.name) && p013kotlin.jvm.internal.s.f(this.phone, owner.phone) && p013kotlin.jvm.internal.s.f(this.verifiedAddress, owner.verifiedAddress) && p013kotlin.jvm.internal.s.f(this.verifiedEmail, owner.verifiedEmail) && p013kotlin.jvm.internal.s.f(this.verifiedName, owner.verifiedName) && p013kotlin.jvm.internal.s.f(this.verifiedPhone, owner.verifiedPhone);
        }

        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Address address2 = this.verifiedAddress;
            int iHashCode5 = (iHashCode4 + (address2 == null ? 0 : address2.hashCode())) * 31;
            String str4 = this.verifiedEmail;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.verifiedName;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.verifiedPhone;
            return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Owner(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ", verifiedAddress=" + this.verifiedAddress + ", verifiedEmail=" + this.verifiedEmail + ", verifiedName=" + this.verifiedName + ", verifiedPhone=" + this.verifiedPhone + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Address address = this.address;
            if (address == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            Address address2 = this.verifiedAddress;
            if (address2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.verifiedEmail);
            parcel.writeString(this.verifiedName);
            parcel.writeString(this.verifiedPhone);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.Source$e, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006&"}, d2 = {"Lcom/stripe/android/model/Source$e;", "Lt30/f;", "", PlaceTypes.ADDRESS, "", "amountCharged", "amountReceived", "amountReturned", "<init>", "(Ljava/lang/String;JJJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getAddress", "b", "J", "getAmountCharged", "()J", "c", "getAmountReceived", DateTokenConverter.CONVERTER_KEY, "getAmountReturned", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Receiver implements t30.f {
        public static final Parcelable.Creator<Receiver> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long amountCharged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long amountReceived;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long amountReturned;

        /* JADX INFO: renamed from: com.stripe.android.model.Source$e$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Receiver> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Receiver createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Receiver(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Receiver[] newArray(int i11) {
                return new Receiver[i11];
            }
        }

        public Receiver(String str, long j11, long j12, long j13) {
            this.address = str;
            this.amountCharged = j11;
            this.amountReceived = j12;
            this.amountReturned = j13;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Receiver)) {
                return false;
            }
            Receiver receiver = (Receiver) other;
            return p013kotlin.jvm.internal.s.f(this.address, receiver.address) && this.amountCharged == receiver.amountCharged && this.amountReceived == receiver.amountReceived && this.amountReturned == receiver.amountReturned;
        }

        public int hashCode() {
            String str = this.address;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.amountCharged)) * 31) + Long.hashCode(this.amountReceived)) * 31) + Long.hashCode(this.amountReturned);
        }

        public String toString() {
            return "Receiver(address=" + this.address + ", amountCharged=" + this.amountCharged + ", amountReceived=" + this.amountReceived + ", amountReturned=" + this.amountReturned + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.address);
            parcel.writeLong(this.amountCharged);
            parcel.writeLong(this.amountReceived);
            parcel.writeLong(this.amountReturned);
        }
    }

    public Source(String str, Long l11, String str2, CodeVerification codeVerification, Long l12, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map<String, ? extends Object> map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str4) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(typeRaw, "typeRaw");
        this.id = str;
        this.amount = l11;
        this.clientSecret = str2;
        this.codeVerification = codeVerification;
        this.created = l12;
        this.currency = str3;
        this.flow = flow;
        this.isLiveMode = bool;
        this.owner = owner;
        this.receiver = receiver;
        this.redirect = redirect;
        this.status = status;
        this.sourceTypeData = map;
        this.sourceTypeModel = sourceTypeModel;
        this.type = type;
        this.typeRaw = typeRaw;
        this.usage = usage;
        this._weChat = weChat;
        this._klarna = klarna;
        this.sourceOrder = sourceOrder;
        this.statementDescriptor = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Flow getFlow() {
        return this.flow;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Redirect getRedirect() {
        return this.redirect;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SourceTypeModel getSourceTypeModel() {
        return this.sourceTypeModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Source)) {
            return false;
        }
        Source source = (Source) other;
        return p013kotlin.jvm.internal.s.f(this.id, source.id) && p013kotlin.jvm.internal.s.f(this.amount, source.amount) && p013kotlin.jvm.internal.s.f(this.clientSecret, source.clientSecret) && p013kotlin.jvm.internal.s.f(this.codeVerification, source.codeVerification) && p013kotlin.jvm.internal.s.f(this.created, source.created) && p013kotlin.jvm.internal.s.f(this.currency, source.currency) && this.flow == source.flow && p013kotlin.jvm.internal.s.f(this.isLiveMode, source.isLiveMode) && p013kotlin.jvm.internal.s.f(this.owner, source.owner) && p013kotlin.jvm.internal.s.f(this.receiver, source.receiver) && p013kotlin.jvm.internal.s.f(this.redirect, source.redirect) && this.status == source.status && p013kotlin.jvm.internal.s.f(this.sourceTypeData, source.sourceTypeData) && p013kotlin.jvm.internal.s.f(this.sourceTypeModel, source.sourceTypeModel) && p013kotlin.jvm.internal.s.f(this.type, source.type) && p013kotlin.jvm.internal.s.f(this.typeRaw, source.typeRaw) && this.usage == source.usage && p013kotlin.jvm.internal.s.f(this._weChat, source._weChat) && p013kotlin.jvm.internal.s.f(this._klarna, source._klarna) && p013kotlin.jvm.internal.s.f(this.sourceOrder, source.sourceOrder) && p013kotlin.jvm.internal.s.f(this.statementDescriptor, source.statementDescriptor);
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.amount;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.clientSecret;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CodeVerification codeVerification = this.codeVerification;
        int iHashCode4 = (iHashCode3 + (codeVerification == null ? 0 : codeVerification.hashCode())) * 31;
        Long l12 = this.created;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Flow flow = this.flow;
        int iHashCode7 = (iHashCode6 + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.isLiveMode;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Owner owner = this.owner;
        int iHashCode9 = (iHashCode8 + (owner == null ? 0 : owner.hashCode())) * 31;
        Receiver receiver = this.receiver;
        int iHashCode10 = (iHashCode9 + (receiver == null ? 0 : receiver.hashCode())) * 31;
        Redirect redirect = this.redirect;
        int iHashCode11 = (iHashCode10 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        Status status = this.status;
        int iHashCode12 = (iHashCode11 + (status == null ? 0 : status.hashCode())) * 31;
        Map<String, Object> map = this.sourceTypeData;
        int iHashCode13 = (iHashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        SourceTypeModel sourceTypeModel = this.sourceTypeModel;
        int iHashCode14 = (((((iHashCode13 + (sourceTypeModel == null ? 0 : sourceTypeModel.hashCode())) * 31) + this.type.hashCode()) * 31) + this.typeRaw.hashCode()) * 31;
        Usage usage = this.usage;
        int iHashCode15 = (iHashCode14 + (usage == null ? 0 : usage.hashCode())) * 31;
        WeChat weChat = this._weChat;
        int iHashCode16 = (iHashCode15 + (weChat == null ? 0 : weChat.hashCode())) * 31;
        Klarna klarna = this._klarna;
        int iHashCode17 = (iHashCode16 + (klarna == null ? 0 : klarna.hashCode())) * 31;
        SourceOrder sourceOrder = this.sourceOrder;
        int iHashCode18 = (iHashCode17 + (sourceOrder == null ? 0 : sourceOrder.hashCode())) * 31;
        String str4 = this.statementDescriptor;
        return iHashCode18 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    public String toString() {
        return "Source(id=" + this.id + ", amount=" + this.amount + ", clientSecret=" + this.clientSecret + ", codeVerification=" + this.codeVerification + ", created=" + this.created + ", currency=" + this.currency + ", flow=" + this.flow + ", isLiveMode=" + this.isLiveMode + ", owner=" + this.owner + ", receiver=" + this.receiver + ", redirect=" + this.redirect + ", status=" + this.status + ", sourceTypeData=" + this.sourceTypeData + ", sourceTypeModel=" + this.sourceTypeModel + ", type=" + this.type + ", typeRaw=" + this.typeRaw + ", usage=" + this.usage + ", _weChat=" + this._weChat + ", _klarna=" + this._klarna + ", sourceOrder=" + this.sourceOrder + ", statementDescriptor=" + this.statementDescriptor + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        Long l11 = this.amount;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        parcel.writeString(this.clientSecret);
        CodeVerification codeVerification = this.codeVerification;
        if (codeVerification == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            codeVerification.writeToParcel(parcel, flags);
        }
        Long l12 = this.created;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l12.longValue());
        }
        parcel.writeString(this.currency);
        Flow flow = this.flow;
        if (flow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(flow.name());
        }
        Boolean bool = this.isLiveMode;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Owner owner = this.owner;
        if (owner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            owner.writeToParcel(parcel, flags);
        }
        Receiver receiver = this.receiver;
        if (receiver == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            receiver.writeToParcel(parcel, flags);
        }
        Redirect redirect = this.redirect;
        if (redirect == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            redirect.writeToParcel(parcel, flags);
        }
        Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        Map<String, Object> map = this.sourceTypeData;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeValue(entry.getValue());
            }
        }
        parcel.writeParcelable(this.sourceTypeModel, flags);
        parcel.writeString(this.type);
        parcel.writeString(this.typeRaw);
        Usage usage = this.usage;
        if (usage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        }
        WeChat weChat = this._weChat;
        if (weChat == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            weChat.writeToParcel(parcel, flags);
        }
        Klarna klarna = this._klarna;
        if (klarna == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            klarna.writeToParcel(parcel, flags);
        }
        SourceOrder sourceOrder = this.sourceOrder;
        if (sourceOrder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sourceOrder.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.statementDescriptor);
    }

    public /* synthetic */ Source(String str, Long l11, String str2, CodeVerification codeVerification, Long l12, String str3, Flow flow, Boolean bool, Owner owner, Receiver receiver, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String str4, String str5, Usage usage, WeChat weChat, Klarna klarna, SourceOrder sourceOrder, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : codeVerification, (i11 & 16) != 0 ? null : l12, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : flow, (i11 & 128) != 0 ? null : bool, (i11 & 256) != 0 ? null : owner, (i11 & 512) != 0 ? null : receiver, (i11 & 1024) != 0 ? null : redirect, (i11 & 2048) != 0 ? null : status, (i11 & 4096) != 0 ? null : map, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : sourceTypeModel, str4, str5, (65536 & i11) != 0 ? null : usage, (131072 & i11) != 0 ? null : weChat, (262144 & i11) != 0 ? null : klarna, (524288 & i11) != 0 ? null : sourceOrder, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : str6);
    }
}
