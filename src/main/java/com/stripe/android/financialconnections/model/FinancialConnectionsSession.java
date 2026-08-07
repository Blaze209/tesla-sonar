package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.Token;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlinx.serialization.UnknownFieldException;
import org.json.JSONObject;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u000427abB\u0081\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u009d\u0001\b\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ(\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÁ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b,\u0010'J \u00100\u001a\u00020!2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b0\u00101R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010%R \u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00103\u0012\u0004\b9\u00106\u001a\u0004\b8\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00106\u001a\u0004\b<\u0010=R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b?\u0010;\u0012\u0004\bA\u00106\u001a\u0004\b@\u0010=R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bE\u00106\u001a\u0004\b:\u0010DR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bI\u00106\u001a\u0004\bB\u0010HR\"\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u00103\u0012\u0004\bK\u00106\u001a\u0004\bJ\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bL\u00103\u0012\u0004\bM\u00106\u001a\u0004\b7\u0010%R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u00106\u001a\u0004\bP\u0010QR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bW\u00106\u001a\u0004\bU\u0010VR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bX\u0010Y\u0012\u0004\b[\u00106\u001a\u0004\bF\u0010ZR\u0011\u0010\\\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b2\u0010=R\u0016\u0010_\u001a\u0004\u0018\u00010]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010^¨\u0006c"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Lt30/f;", "Landroid/os/Parcelable;", "", "clientSecret", "id", "Lcom/stripe/android/financialconnections/model/p;", "accountsOld", "accountsNew", "", "livemode", "Lcom/stripe/android/financialconnections/model/f0;", "paymentAccount", "returnUrl", "bankAccountToken", "Lcom/stripe/android/financialconnections/model/w;", "manualEntry", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", PermissionsResponse.STATUS_KEY, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "statusDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/p;Lcom/stripe/android/financialconnections/model/p;ZLcom/stripe/android/financialconnections/model/f0;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/w;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/p;Lcom/stripe/android/financialconnections/model/p;ZLcom/stripe/android/financialconnections/model/f0;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/w;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "p", "getClientSecret$annotations", "()V", "b", "getId", "getId$annotations", "c", "Lcom/stripe/android/financialconnections/model/p;", "getAccountsOld$financial_connections_release", "()Lcom/stripe/android/financialconnections/model/p;", "getAccountsOld$financial_connections_release$annotations", DateTokenConverter.CONVERTER_KEY, "getAccountsNew$financial_connections_release", "getAccountsNew$financial_connections_release$annotations", "e", "Z", "()Z", "getLivemode$annotations", "f", "Lcom/stripe/android/financialconnections/model/f0;", "()Lcom/stripe/android/financialconnections/model/f0;", "getPaymentAccount$annotations", "getReturnUrl", "getReturnUrl$annotations", "h", "getBankAccountToken$financial_connections_release$annotations", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/model/w;", "getManualEntry", "()Lcom/stripe/android/financialconnections/model/w;", "getManualEntry$annotations", "j", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "getStatus", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "getStatus$annotations", "k", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "getStatusDetails$annotations", "accounts", "Lcom/stripe/android/model/p1;", "()Lcom/stripe/android/model/p1;", "parsedToken", "Companion", "Status", "StatusDetails", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class FinancialConnectionsSession implements t30.f, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsAccountList accountsOld;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsAccountList accountsNew;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean livemode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final f0 paymentAccount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String returnUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bankAccountToken;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final ManualEntry manualEntry;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Status status;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final StatusDetails statusDetails;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f50308l = 8;
    public static final Parcelable.Creator<FinancialConnectionsSession> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "PENDING", "SUCCEEDED", "CANCELED", "FAILED", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum Status {
        PENDING("pending"),
        SUCCEEDED("succeeded"),
        CANCELED("canceled"),
        FAILED("failed"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50320c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50320c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50321e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSession$Status$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Status.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Status> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$Status;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<Status> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50321e = new c();

            private c() {
                super((Enum[]) Status.getEntries().toArray(new Status[0]), Status.UNKNOWN);
            }
        }

        Status(String str) {
            this.value = str;
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0003#)\u0011B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b#\u0010%¨\u0006*"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "cancelled", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "getCancelled$annotations", "()V", "Companion", "Cancelled", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p
    public static final /* data */ class StatusDetails implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Cancelled cancelled;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<StatusDetails> CREATOR = new c();

        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0003#\u0011)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b#\u0010%¨\u0006*"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", AnalyticsAttribute.Reason, "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "getReason$annotations", "()V", "Companion", "Reason", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @ro0.p
        public static final /* data */ class Cancelled implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Reason reason;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Cancelled> CREATOR = new c();

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "CUSTOM_MANUAL_ENTRY", "OTHER", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @ro0.p(with = c.class)
            public enum Reason {
                CUSTOM_MANUAL_ENTRY("custom_manual_entry"),
                OTHER("other"),
                UNKNOWN("unknown");

                private final String value;
                private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50324c);

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final a f50324c = new a();

                    a() {
                        super(0);
                    }

                    @Override // wn0.a
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ro0.d<Object> invoke() {
                        return c.f50325e;
                    }
                }

                /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSession$StatusDetails$Cancelled$Reason$b, reason: from kotlin metadata */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private final /* synthetic */ ro0.d a() {
                        return (ro0.d) Reason.$cachedSerializer$delegate.getValue();
                    }

                    public final ro0.d<Reason> serializer() {
                        return a();
                    }

                    private Companion() {
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$Reason;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class c extends v30.a<Reason> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public static final c f50325e = new c();

                    private c() {
                        super((Enum[]) Reason.getEntries().toArray(new Reason[0]), Reason.UNKNOWN);
                    }
                }

                Reason(String str) {
                    this.value = str;
                }

                public static EnumEntries<Reason> getEntries() {
                    return $ENTRIES;
                }

                public final String getValue() {
                    return this.value;
                }
            }

            @jn0.e
            @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession.StatusDetails.Cancelled.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a implements vo0.e0<Cancelled> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f50326a;
                private static final /* synthetic */ m1 descriptor;

                static {
                    a aVar = new a();
                    f50326a = aVar;
                    m1 m1Var = new m1("com.stripe.android.financialconnections.model.FinancialConnectionsSession.StatusDetails.Cancelled", aVar, 1);
                    m1Var.o(AnalyticsAttribute.Reason, false);
                    descriptor = m1Var;
                }

                private a() {
                }

                @Override // ro0.c
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Cancelled deserialize(uo0.e decoder) {
                    Reason reason;
                    p013kotlin.jvm.internal.s.k(decoder, "decoder");
                    to0.f descriptor2 = getDescriptor();
                    uo0.c cVarB = decoder.b(descriptor2);
                    int i11 = 1;
                    v1 v1Var = null;
                    if (cVarB.i()) {
                        reason = (Reason) cVarB.n(descriptor2, 0, Reason.c.f50325e, null);
                    } else {
                        boolean z11 = true;
                        int i12 = 0;
                        reason = null;
                        while (z11) {
                            int iA = cVarB.A(descriptor2);
                            if (iA == -1) {
                                z11 = false;
                            } else {
                                if (iA != 0) {
                                    throw new UnknownFieldException(iA);
                                }
                                reason = (Reason) cVarB.n(descriptor2, 0, Reason.c.f50325e, reason);
                                i12 = 1;
                            }
                        }
                        i11 = i12;
                    }
                    cVarB.c(descriptor2);
                    return new Cancelled(i11, reason, v1Var);
                }

                @Override // ro0.q
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void serialize(uo0.f encoder, Cancelled value) {
                    p013kotlin.jvm.internal.s.k(encoder, "encoder");
                    p013kotlin.jvm.internal.s.k(value, "value");
                    to0.f descriptor2 = getDescriptor();
                    uo0.d dVarB = encoder.b(descriptor2);
                    Cancelled.b(value, dVarB, descriptor2);
                    dVarB.c(descriptor2);
                }

                @Override // vo0.e0
                public ro0.d<?>[] childSerializers() {
                    return new ro0.d[]{Reason.c.f50325e};
                }

                @Override // ro0.d, ro0.q, ro0.c
                public to0.f getDescriptor() {
                    return descriptor;
                }

                @Override // vo0.e0
                public ro0.d<?>[] typeParametersSerializers() {
                    return vo0.e0.a.a(this);
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSession$StatusDetails$Cancelled$b, reason: from kotlin metadata */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$Cancelled;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ro0.d<Cancelled> serializer() {
                    return a.f50326a;
                }

                private Companion() {
                }
            }

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class c implements Parcelable.Creator<Cancelled> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Cancelled createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Cancelled(Reason.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Cancelled[] newArray(int i11) {
                    return new Cancelled[i11];
                }
            }

            @jn0.e
            public /* synthetic */ Cancelled(int i11, @ro0.o(AnalyticsAttribute.Reason) Reason reason, v1 v1Var) {
                if (1 != (i11 & 1)) {
                    h1.b(i11, 1, a.f50326a.getDescriptor());
                }
                this.reason = reason;
            }

            public static final /* synthetic */ void b(Cancelled self, uo0.d output, to0.f serialDesc) {
                output.D(serialDesc, 0, Reason.c.f50325e, self.reason);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Reason getReason() {
                return this.reason;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cancelled) && this.reason == ((Cancelled) other).reason;
            }

            public int hashCode() {
                return this.reason.hashCode();
            }

            public String toString() {
                return "Cancelled(reason=" + this.reason + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                p013kotlin.jvm.internal.s.k(parcel, "out");
                parcel.writeString(this.reason.name());
            }

            public Cancelled(Reason reason) {
                p013kotlin.jvm.internal.s.k(reason, "reason");
                this.reason = reason;
            }
        }

        @jn0.e
        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession.StatusDetails.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements vo0.e0<StatusDetails> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f50327a;
            private static final /* synthetic */ m1 descriptor;

            static {
                a aVar = new a();
                f50327a = aVar;
                m1 m1Var = new m1("com.stripe.android.financialconnections.model.FinancialConnectionsSession.StatusDetails", aVar, 1);
                m1Var.o("cancelled", true);
                descriptor = m1Var;
            }

            private a() {
            }

            @Override // ro0.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public StatusDetails deserialize(uo0.e decoder) {
                Cancelled cancelled;
                p013kotlin.jvm.internal.s.k(decoder, "decoder");
                to0.f descriptor2 = getDescriptor();
                uo0.c cVarB = decoder.b(descriptor2);
                int i11 = 1;
                v1 v1Var = null;
                if (cVarB.i()) {
                    cancelled = (Cancelled) cVarB.v(descriptor2, 0, Cancelled.a.f50326a, null);
                } else {
                    boolean z11 = true;
                    int i12 = 0;
                    cancelled = null;
                    while (z11) {
                        int iA = cVarB.A(descriptor2);
                        if (iA == -1) {
                            z11 = false;
                        } else {
                            if (iA != 0) {
                                throw new UnknownFieldException(iA);
                            }
                            cancelled = (Cancelled) cVarB.v(descriptor2, 0, Cancelled.a.f50326a, cancelled);
                            i12 = 1;
                        }
                    }
                    i11 = i12;
                }
                cVarB.c(descriptor2);
                return new StatusDetails(i11, cancelled, v1Var);
            }

            @Override // ro0.q
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(uo0.f encoder, StatusDetails value) {
                p013kotlin.jvm.internal.s.k(encoder, "encoder");
                p013kotlin.jvm.internal.s.k(value, "value");
                to0.f descriptor2 = getDescriptor();
                uo0.d dVarB = encoder.b(descriptor2);
                StatusDetails.b(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // vo0.e0
            public ro0.d<?>[] childSerializers() {
                return new ro0.d[]{so0.a.p(Cancelled.a.f50326a)};
            }

            @Override // ro0.d, ro0.q, ro0.c
            public to0.f getDescriptor() {
                return descriptor;
            }

            @Override // vo0.e0
            public ro0.d<?>[] typeParametersSerializers() {
                return vo0.e0.a.a(this);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSession$StatusDetails$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$StatusDetails;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<StatusDetails> serializer() {
                return a.f50327a;
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c implements Parcelable.Creator<StatusDetails> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StatusDetails createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new StatusDetails(parcel.readInt() == 0 ? null : Cancelled.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final StatusDetails[] newArray(int i11) {
                return new StatusDetails[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StatusDetails() {
            this((Cancelled) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static final /* synthetic */ void b(StatusDetails self, uo0.d output, to0.f serialDesc) {
            if (!output.G(serialDesc, 0) && self.cancelled == null) {
                return;
            }
            output.y(serialDesc, 0, Cancelled.a.f50326a, self.cancelled);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Cancelled getCancelled() {
            return this.cancelled;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusDetails) && p013kotlin.jvm.internal.s.f(this.cancelled, ((StatusDetails) other).cancelled);
        }

        public int hashCode() {
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                return 0;
            }
            return cancelled.hashCode();
        }

        public String toString() {
            return "StatusDetails(cancelled=" + this.cancelled + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            Cancelled cancelled = this.cancelled;
            if (cancelled == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                cancelled.writeToParcel(parcel, flags);
            }
        }

        @jn0.e
        public /* synthetic */ StatusDetails(int i11, @ro0.o("cancelled") Cancelled cancelled, v1 v1Var) {
            if ((i11 & 1) == 0) {
                this.cancelled = null;
            } else {
                this.cancelled = cancelled;
            }
        }

        public StatusDetails(Cancelled cancelled) {
            this.cancelled = cancelled;
        }

        public /* synthetic */ StatusDetails(Cancelled cancelled, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : cancelled);
        }
    }

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<FinancialConnectionsSession> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50328a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50328a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.FinancialConnectionsSession", aVar, 11);
            m1Var.o("client_secret", false);
            m1Var.o("id", false);
            m1Var.o("linked_accounts", true);
            m1Var.o("accounts", true);
            m1Var.o("livemode", false);
            m1Var.o("payment_account", true);
            m1Var.o("return_url", true);
            m1Var.o("bank_account_token", true);
            m1Var.o("manual_entry", true);
            m1Var.o(PermissionsResponse.STATUS_KEY, true);
            m1Var.o("status_details", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FinancialConnectionsSession deserialize(uo0.e decoder) {
            boolean z11;
            StatusDetails statusDetails;
            Status status;
            ManualEntry wVar;
            String str;
            String str2;
            f0 f0Var;
            FinancialConnectionsAccountList pVar;
            FinancialConnectionsAccountList pVar2;
            int i11;
            String str3;
            String str4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i12 = 10;
            int i13 = 9;
            if (cVarB.i()) {
                String strT = cVarB.t(descriptor2, 0);
                String strT2 = cVarB.t(descriptor2, 1);
                FinancialConnectionsAccountList.a aVar = FinancialConnectionsAccountList.a.f50541a;
                FinancialConnectionsAccountList pVar3 = (FinancialConnectionsAccountList) cVarB.v(descriptor2, 2, aVar, null);
                FinancialConnectionsAccountList pVar4 = (FinancialConnectionsAccountList) cVarB.v(descriptor2, 3, aVar, null);
                boolean zW = cVarB.w(descriptor2, 4);
                f0 f0Var2 = (f0) cVarB.v(descriptor2, 5, n50.e.f93348c, null);
                String str5 = (String) cVarB.v(descriptor2, 6, z1.f119730a, null);
                String str6 = (String) cVarB.v(descriptor2, 7, n50.c.f93344b, null);
                ManualEntry wVar2 = (ManualEntry) cVarB.v(descriptor2, 8, ManualEntry.a.f50576a, null);
                Status status2 = (Status) cVarB.v(descriptor2, 9, Status.c.f50321e, null);
                str3 = strT;
                statusDetails = (StatusDetails) cVarB.v(descriptor2, 10, StatusDetails.a.f50327a, null);
                status = status2;
                str2 = str6;
                str = str5;
                f0Var = f0Var2;
                pVar = pVar4;
                wVar = wVar2;
                z11 = zW;
                pVar2 = pVar3;
                str4 = strT2;
                i11 = 2047;
            } else {
                boolean z12 = true;
                boolean zW2 = false;
                StatusDetails statusDetails2 = null;
                Status status3 = null;
                ManualEntry wVar3 = null;
                String str7 = null;
                String str8 = null;
                f0 f0Var3 = null;
                FinancialConnectionsAccountList pVar5 = null;
                String strT3 = null;
                String strT4 = null;
                int i14 = 0;
                FinancialConnectionsAccountList pVar6 = null;
                while (z12) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z12 = false;
                            i12 = 10;
                            break;
                        case 0:
                            i14 |= 1;
                            strT3 = cVarB.t(descriptor2, 0);
                            i12 = 10;
                            i13 = 9;
                            break;
                        case 1:
                            strT4 = cVarB.t(descriptor2, 1);
                            i14 |= 2;
                            i12 = 10;
                            i13 = 9;
                            break;
                        case 2:
                            pVar6 = (FinancialConnectionsAccountList) cVarB.v(descriptor2, 2, FinancialConnectionsAccountList.a.f50541a, pVar6);
                            i14 |= 4;
                            i12 = 10;
                            i13 = 9;
                            break;
                        case 3:
                            pVar5 = (FinancialConnectionsAccountList) cVarB.v(descriptor2, 3, FinancialConnectionsAccountList.a.f50541a, pVar5);
                            i14 |= 8;
                            i12 = 10;
                            i13 = 9;
                            break;
                        case 4:
                            zW2 = cVarB.w(descriptor2, 4);
                            i14 |= 16;
                            i12 = 10;
                            break;
                        case 5:
                            f0Var3 = (f0) cVarB.v(descriptor2, 5, n50.e.f93348c, f0Var3);
                            i14 |= 32;
                            i12 = 10;
                            break;
                        case 6:
                            str7 = (String) cVarB.v(descriptor2, 6, z1.f119730a, str7);
                            i14 |= 64;
                            i12 = 10;
                            break;
                        case 7:
                            str8 = (String) cVarB.v(descriptor2, 7, n50.c.f93344b, str8);
                            i14 |= 128;
                            i12 = 10;
                            break;
                        case 8:
                            wVar3 = (ManualEntry) cVarB.v(descriptor2, 8, ManualEntry.a.f50576a, wVar3);
                            i14 |= 256;
                            i12 = 10;
                            break;
                        case 9:
                            status3 = (Status) cVarB.v(descriptor2, i13, Status.c.f50321e, status3);
                            i14 |= 512;
                            break;
                        case 10:
                            statusDetails2 = (StatusDetails) cVarB.v(descriptor2, i12, StatusDetails.a.f50327a, statusDetails2);
                            i14 |= 1024;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                z11 = zW2;
                statusDetails = statusDetails2;
                status = status3;
                wVar = wVar3;
                str = str7;
                str2 = str8;
                f0Var = f0Var3;
                pVar = pVar5;
                pVar2 = pVar6;
                i11 = i14;
                str3 = strT3;
                str4 = strT4;
            }
            cVarB.c(descriptor2);
            return new FinancialConnectionsSession(i11, str3, str4, pVar2, pVar, z11, f0Var, str, str2, wVar, status, statusDetails, (v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, FinancialConnectionsSession value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            FinancialConnectionsSession.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            FinancialConnectionsAccountList.a aVar = FinancialConnectionsAccountList.a.f50541a;
            return new ro0.d[]{z1Var, z1Var, so0.a.p(aVar), so0.a.p(aVar), vo0.h.f119620a, so0.a.p(n50.e.f93348c), so0.a.p(z1Var), so0.a.p(n50.c.f93344b), so0.a.p(ManualEntry.a.f50576a), so0.a.p(Status.c.f50321e), so0.a.p(StatusDetails.a.f50327a)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsSession$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<FinancialConnectionsSession> serializer() {
            return a.f50328a;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<FinancialConnectionsSession> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSession createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new FinancialConnectionsSession(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FinancialConnectionsAccountList.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (f0) parcel.readParcelable(FinancialConnectionsSession.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ManualEntry.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readInt() != 0 ? StatusDetails.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsSession[] newArray(int i11) {
            return new FinancialConnectionsSession[i11];
        }
    }

    @jn0.e
    public /* synthetic */ FinancialConnectionsSession(int i11, @ro0.o("client_secret") String str, @ro0.o("id") String str2, @ro0.o("linked_accounts") FinancialConnectionsAccountList pVar, @ro0.o("accounts") FinancialConnectionsAccountList pVar2, @ro0.o("livemode") boolean z11, @ro0.o("payment_account") f0 f0Var, @ro0.o("return_url") String str3, @ro0.o("bank_account_token") @ro0.p(with = n50.c.class) String str4, @ro0.o("manual_entry") ManualEntry wVar, @ro0.o(PermissionsResponse.STATUS_KEY) Status status, @ro0.o("status_details") StatusDetails statusDetails, v1 v1Var) {
        if (19 != (i11 & 19)) {
            h1.b(i11, 19, a.f50328a.getDescriptor());
        }
        this.clientSecret = str;
        this.id = str2;
        if ((i11 & 4) == 0) {
            this.accountsOld = null;
        } else {
            this.accountsOld = pVar;
        }
        if ((i11 & 8) == 0) {
            this.accountsNew = null;
        } else {
            this.accountsNew = pVar2;
        }
        this.livemode = z11;
        if ((i11 & 32) == 0) {
            this.paymentAccount = null;
        } else {
            this.paymentAccount = f0Var;
        }
        if ((i11 & 64) == 0) {
            this.returnUrl = null;
        } else {
            this.returnUrl = str3;
        }
        if ((i11 & 128) == 0) {
            this.bankAccountToken = null;
        } else {
            this.bankAccountToken = str4;
        }
        if ((i11 & 256) == 0) {
            this.manualEntry = null;
        } else {
            this.manualEntry = wVar;
        }
        if ((i11 & 512) == 0) {
            this.status = null;
        } else {
            this.status = status;
        }
        if ((i11 & 1024) == 0) {
            this.statusDetails = null;
        } else {
            this.statusDetails = statusDetails;
        }
    }

    public static final /* synthetic */ void g(FinancialConnectionsSession self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.clientSecret);
        output.e(serialDesc, 1, self.id);
        if (output.G(serialDesc, 2) || self.accountsOld != null) {
            output.y(serialDesc, 2, FinancialConnectionsAccountList.a.f50541a, self.accountsOld);
        }
        if (output.G(serialDesc, 3) || self.accountsNew != null) {
            output.y(serialDesc, 3, FinancialConnectionsAccountList.a.f50541a, self.accountsNew);
        }
        output.A(serialDesc, 4, self.livemode);
        if (output.G(serialDesc, 5) || self.paymentAccount != null) {
            output.y(serialDesc, 5, n50.e.f93348c, self.paymentAccount);
        }
        if (output.G(serialDesc, 6) || self.returnUrl != null) {
            output.y(serialDesc, 6, z1.f119730a, self.returnUrl);
        }
        if (output.G(serialDesc, 7) || self.bankAccountToken != null) {
            output.y(serialDesc, 7, n50.c.f93344b, self.bankAccountToken);
        }
        if (output.G(serialDesc, 8) || self.manualEntry != null) {
            output.y(serialDesc, 8, ManualEntry.a.f50576a, self.manualEntry);
        }
        if (output.G(serialDesc, 9) || self.status != null) {
            output.y(serialDesc, 9, Status.c.f50321e, self.status);
        }
        if (!output.G(serialDesc, 10) && self.statusDetails == null) {
            return;
        }
        output.y(serialDesc, 10, StatusDetails.a.f50327a, self.statusDetails);
    }

    public final FinancialConnectionsAccountList a() {
        FinancialConnectionsAccountList pVar = this.accountsNew;
        if (pVar != null) {
            return pVar;
        }
        FinancialConnectionsAccountList pVar2 = this.accountsOld;
        p013kotlin.jvm.internal.s.h(pVar2);
        return pVar2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBankAccountToken() {
        return this.bankAccountToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getLivemode() {
        return this.livemode;
    }

    public final Token d() {
        String str = this.bankAccountToken;
        if (str != null) {
            return new x60.f0().a(new JSONObject(str));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f0 getPaymentAccount() {
        return this.paymentAccount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSession)) {
            return false;
        }
        FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) other;
        return p013kotlin.jvm.internal.s.f(this.clientSecret, financialConnectionsSession.clientSecret) && p013kotlin.jvm.internal.s.f(this.id, financialConnectionsSession.id) && p013kotlin.jvm.internal.s.f(this.accountsOld, financialConnectionsSession.accountsOld) && p013kotlin.jvm.internal.s.f(this.accountsNew, financialConnectionsSession.accountsNew) && this.livemode == financialConnectionsSession.livemode && p013kotlin.jvm.internal.s.f(this.paymentAccount, financialConnectionsSession.paymentAccount) && p013kotlin.jvm.internal.s.f(this.returnUrl, financialConnectionsSession.returnUrl) && p013kotlin.jvm.internal.s.f(this.bankAccountToken, financialConnectionsSession.bankAccountToken) && p013kotlin.jvm.internal.s.f(this.manualEntry, financialConnectionsSession.manualEntry) && this.status == financialConnectionsSession.status && p013kotlin.jvm.internal.s.f(this.statusDetails, financialConnectionsSession.statusDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final StatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((this.clientSecret.hashCode() * 31) + this.id.hashCode()) * 31;
        FinancialConnectionsAccountList pVar = this.accountsOld;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        FinancialConnectionsAccountList pVar2 = this.accountsNew;
        int iHashCode3 = (((iHashCode2 + (pVar2 == null ? 0 : pVar2.hashCode())) * 31) + Boolean.hashCode(this.livemode)) * 31;
        f0 f0Var = this.paymentAccount;
        int iHashCode4 = (iHashCode3 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        String str = this.returnUrl;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bankAccountToken;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ManualEntry wVar = this.manualEntry;
        int iHashCode7 = (iHashCode6 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        Status status = this.status;
        int iHashCode8 = (iHashCode7 + (status == null ? 0 : status.hashCode())) * 31;
        StatusDetails statusDetails = this.statusDetails;
        return iHashCode8 + (statusDetails != null ? statusDetails.hashCode() : 0);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getClientSecret() {
        return this.clientSecret;
    }

    public String toString() {
        return "FinancialConnectionsSession(clientSecret=" + this.clientSecret + ", id=" + this.id + ", accountsOld=" + this.accountsOld + ", accountsNew=" + this.accountsNew + ", livemode=" + this.livemode + ", paymentAccount=" + this.paymentAccount + ", returnUrl=" + this.returnUrl + ", bankAccountToken=" + this.bankAccountToken + ", manualEntry=" + this.manualEntry + ", status=" + this.status + ", statusDetails=" + this.statusDetails + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.id);
        FinancialConnectionsAccountList pVar = this.accountsOld;
        if (pVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar.writeToParcel(parcel, flags);
        }
        FinancialConnectionsAccountList pVar2 = this.accountsNew;
        if (pVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pVar2.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.livemode ? 1 : 0);
        parcel.writeParcelable(this.paymentAccount, flags);
        parcel.writeString(this.returnUrl);
        parcel.writeString(this.bankAccountToken);
        ManualEntry wVar = this.manualEntry;
        if (wVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wVar.writeToParcel(parcel, flags);
        }
        Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(status.name());
        }
        StatusDetails statusDetails = this.statusDetails;
        if (statusDetails == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDetails.writeToParcel(parcel, flags);
        }
    }

    public FinancialConnectionsSession(String clientSecret, String id2, FinancialConnectionsAccountList pVar, FinancialConnectionsAccountList pVar2, boolean z11, f0 f0Var, String str, String str2, ManualEntry wVar, Status status, StatusDetails statusDetails) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(id2, "id");
        this.clientSecret = clientSecret;
        this.id = id2;
        this.accountsOld = pVar;
        this.accountsNew = pVar2;
        this.livemode = z11;
        this.paymentAccount = f0Var;
        this.returnUrl = str;
        this.bankAccountToken = str2;
        this.manualEntry = wVar;
        this.status = status;
        this.statusDetails = statusDetails;
    }

    public /* synthetic */ FinancialConnectionsSession(String str, String str2, FinancialConnectionsAccountList pVar, FinancialConnectionsAccountList pVar2, boolean z11, f0 f0Var, String str3, String str4, ManualEntry wVar, Status status, StatusDetails statusDetails, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : pVar, (i11 & 8) != 0 ? null : pVar2, z11, (i11 & 32) != 0 ? null : f0Var, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : wVar, (i11 & 512) != 0 ? null : status, (i11 & 1024) != 0 ? null : statusDetails);
    }
}
