package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\b\u0081\b\u0018\u0000 M2\u00020\u0001:\u0003-2NBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0093\u0001\b\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010+\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u00101\u001a\u0004\b4\u00105R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010.\u0012\u0004\b8\u00101\u001a\u0004\b2\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00109\u0012\u0004\b;\u00101\u001a\u0004\b7\u0010:R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u00109\u0012\u0004\b>\u00101\u001a\u0004\b=\u0010:R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u00109\u0012\u0004\b@\u00101\u001a\u0004\b<\u0010:R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010.\u0012\u0004\bB\u00101\u001a\u0004\b?\u0010 R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010.\u0012\u0004\bD\u00101\u001a\u0004\bC\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\bE\u00109\u0012\u0004\bF\u00101R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bJ\u00101\u001a\u0004\b-\u0010IR\u0011\u0010L\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bA\u0010K¨\u0006O"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "Landroid/os/Parcelable;", "", "id", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "nextPane", AnalyticsContext.Flow, "", "institutionSkipAccountSelection", "showPartnerDisclosure", "skipAccountSelection", ImagesContract.URL, "urlQrCode", "_isOAuth", "Lcom/stripe/android/financialconnections/model/n;", "display", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/n;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/n;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "h", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "b", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getNextPane$annotations", "c", "getFlow$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getInstitutionSkipAccountSelection$annotations", "e", "getShowPartnerDisclosure", "getShowPartnerDisclosure$annotations", "f", "getSkipAccountSelection$annotations", "g", "getUrl$annotations", "getUrlQrCode", "getUrlQrCode$annotations", IntegerTokenConverter.CONVERTER_KEY, "get_isOAuth$annotations", "j", "Lcom/stripe/android/financialconnections/model/n;", "()Lcom/stripe/android/financialconnections/model/n;", "getDisplay$annotations", "()Z", "isOAuth", "Companion", "Flow", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class FinancialConnectionsAuthorizationSession implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane nextPane;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String flow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean institutionSkipAccountSelection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean showPartnerDisclosure;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean skipAccountSelection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String urlQrCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean _isOAuth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Display display;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f50294k = 8;
    public static final Parcelable.Creator<FinancialConnectionsAuthorizationSession> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "b", "c", "DIRECT", "DIRECT_WEBVIEW", "FINICITY_CONNECT_V2_FIX", "FINICITY_CONNECT_V2_LITE", "FINICITY_CONNECT_V2_OAUTH", "FINICITY_CONNECT_V2_OAUTH_REDIRECT", "FINICITY_CONNECT_V2_OAUTH_WEBVIEW", "MX_CONNECT", "MX_OAUTH", "MX_OAUTH_APP2APP", "MX_OAUTH_REDIRECT", "MX_OAUTH_WEBVIEW", "TESTMODE", "TESTMODE_OAUTH", "TESTMODE_OAUTH_WEBVIEW", "TRUELAYER_OAUTH", "TRUELAYER_OAUTH_HANDOFF", "TRUELAYER_OAUTH_WEBVIEW", "WELLS_FARGO", "WELLS_FARGO_WEBVIEW", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p(with = c.class)
    public enum Flow {
        DIRECT(DevicePublicKeyStringDef.DIRECT),
        DIRECT_WEBVIEW("direct_webview"),
        FINICITY_CONNECT_V2_FIX("finicity_connect_v2_fix"),
        FINICITY_CONNECT_V2_LITE("finicity_connect_v2_lite"),
        FINICITY_CONNECT_V2_OAUTH("finicity_connect_v2_oauth"),
        FINICITY_CONNECT_V2_OAUTH_REDIRECT("finicity_connect_v2_oauth_redirect"),
        FINICITY_CONNECT_V2_OAUTH_WEBVIEW("finicity_connect_v2_oauth_webview"),
        MX_CONNECT("mx_connect"),
        MX_OAUTH("mx_oauth"),
        MX_OAUTH_APP2APP("mx_oauth_app_to_app"),
        MX_OAUTH_REDIRECT("mx_oauth_redirect"),
        MX_OAUTH_WEBVIEW("mx_oauth_webview"),
        TESTMODE("testmode"),
        TESTMODE_OAUTH("testmode_oauth"),
        TESTMODE_OAUTH_WEBVIEW("testmode_oauth_webview"),
        TRUELAYER_OAUTH("truelayer_oauth"),
        TRUELAYER_OAUTH_HANDOFF("truelayer_oauth_handoff"),
        TRUELAYER_OAUTH_WEBVIEW("truelayer_oauth_webview"),
        WELLS_FARGO("wells_fargo"),
        WELLS_FARGO_WEBVIEW("wells_fargo_webview"),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f50305c);

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f50305c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return c.f50306e;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession$Flow$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) Flow.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<Flow> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$c;", "Lv30/a;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "<init>", "()V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends v30.a<Flow> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f50306e = new c();

            private c() {
                super((Enum[]) Flow.getEntries().toArray(new Flow[0]), Flow.UNKNOWN);
            }
        }

        Flow(String str) {
            this.value = str;
        }

        public static EnumEntries<Flow> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<FinancialConnectionsAuthorizationSession> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50307a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50307a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession", aVar, 10);
            m1Var.o("id", false);
            m1Var.o("next_pane", false);
            m1Var.o(AnalyticsContext.Flow, true);
            m1Var.o("institution_skip_account_selection", true);
            m1Var.o("show_partner_disclosure", true);
            m1Var.o("skip_account_selection", true);
            m1Var.o(ImagesContract.URL, true);
            m1Var.o("url_qr_code", true);
            m1Var.o("is_oauth", true);
            m1Var.o("display", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FinancialConnectionsAuthorizationSession deserialize(uo0.e decoder) {
            int i11;
            Display nVar;
            Boolean bool;
            String str;
            String str2;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            String str3;
            FinancialConnectionsSessionManifest.Pane pane;
            String str4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i12 = 9;
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                FinancialConnectionsSessionManifest.Pane pane2 = (FinancialConnectionsSessionManifest.Pane) cVarB.n(descriptor2, 1, FinancialConnectionsSessionManifest.Pane.c.f50360e, null);
                z1 z1Var = z1.f119730a;
                String str5 = (String) cVarB.v(descriptor2, 2, z1Var, null);
                vo0.h hVar = vo0.h.f119620a;
                Boolean bool5 = (Boolean) cVarB.v(descriptor2, 3, hVar, null);
                Boolean bool6 = (Boolean) cVarB.v(descriptor2, 4, hVar, null);
                Boolean bool7 = (Boolean) cVarB.v(descriptor2, 5, hVar, null);
                String str6 = (String) cVarB.v(descriptor2, 6, z1Var, null);
                String str7 = (String) cVarB.v(descriptor2, 7, z1Var, null);
                Boolean bool8 = (Boolean) cVarB.v(descriptor2, 8, hVar, null);
                str3 = strT2;
                nVar = (Display) cVarB.v(descriptor2, 9, Display.a.f50529a, null);
                str2 = str7;
                str = str6;
                bool2 = bool7;
                bool4 = bool5;
                bool = bool8;
                bool3 = bool6;
                str4 = str5;
                pane = pane2;
                i11 = 1023;
            } else {
                boolean z11 = true;
                int i13 = 0;
                Display nVar2 = null;
                Boolean bool9 = null;
                String str8 = null;
                String str9 = null;
                Boolean bool10 = null;
                Boolean bool11 = null;
                Boolean bool12 = null;
                FinancialConnectionsSessionManifest.Pane pane3 = null;
                String str10 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            strT = cVarB.t(descriptor2, 0);
                            i13 |= 1;
                            i12 = 9;
                            break;
                        case 1:
                            pane3 = (FinancialConnectionsSessionManifest.Pane) cVarB.n(descriptor2, 1, FinancialConnectionsSessionManifest.Pane.c.f50360e, pane3);
                            i13 |= 2;
                            i12 = 9;
                            break;
                        case 2:
                            str10 = (String) cVarB.v(descriptor2, 2, z1.f119730a, str10);
                            i13 |= 4;
                            i12 = 9;
                            break;
                        case 3:
                            bool12 = (Boolean) cVarB.v(descriptor2, 3, vo0.h.f119620a, bool12);
                            i13 |= 8;
                            i12 = 9;
                            break;
                        case 4:
                            bool11 = (Boolean) cVarB.v(descriptor2, 4, vo0.h.f119620a, bool11);
                            i13 |= 16;
                            i12 = 9;
                            break;
                        case 5:
                            bool10 = (Boolean) cVarB.v(descriptor2, 5, vo0.h.f119620a, bool10);
                            i13 |= 32;
                            i12 = 9;
                            break;
                        case 6:
                            str8 = (String) cVarB.v(descriptor2, 6, z1.f119730a, str8);
                            i13 |= 64;
                            i12 = 9;
                            break;
                        case 7:
                            str9 = (String) cVarB.v(descriptor2, 7, z1.f119730a, str9);
                            i13 |= 128;
                            i12 = 9;
                            break;
                        case 8:
                            bool9 = (Boolean) cVarB.v(descriptor2, 8, vo0.h.f119620a, bool9);
                            i13 |= 256;
                            break;
                        case 9:
                            nVar2 = (Display) cVarB.v(descriptor2, i12, Display.a.f50529a, nVar2);
                            i13 |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                nVar = nVar2;
                bool = bool9;
                str = str8;
                str2 = str9;
                bool2 = bool10;
                bool3 = bool11;
                bool4 = bool12;
                str3 = strT;
                pane = pane3;
                str4 = str10;
            }
            cVarB.c(descriptor2);
            return new FinancialConnectionsAuthorizationSession(i11, str3, pane, str4, bool4, bool3, bool2, str, str2, bool, nVar, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, FinancialConnectionsAuthorizationSession value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            FinancialConnectionsAuthorizationSession.h(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            ro0.d<?> dVarP = so0.a.p(z1Var);
            vo0.h hVar = vo0.h.f119620a;
            return new ro0.d[]{z1Var, FinancialConnectionsSessionManifest.Pane.c.f50360e, dVarP, so0.a.p(hVar), so0.a.p(hVar), so0.a.p(hVar), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(hVar), so0.a.p(Display.a.f50529a)};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<FinancialConnectionsAuthorizationSession> serializer() {
            return a.f50307a;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<FinancialConnectionsAuthorizationSession> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsAuthorizationSession createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            FinancialConnectionsSessionManifest.Pane paneValueOf = FinancialConnectionsSessionManifest.Pane.valueOf(parcel.readString());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = boolValueOf2;
            String string3 = parcel.readString();
            Boolean bool2 = boolValueOf3;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FinancialConnectionsAuthorizationSession(string, paneValueOf, string2, boolValueOf, bool, bool2, string3, string4, boolValueOf4, parcel.readInt() == 0 ? null : Display.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FinancialConnectionsAuthorizationSession[] newArray(int i11) {
            return new FinancialConnectionsAuthorizationSession[i11];
        }
    }

    @jn0.e
    public /* synthetic */ FinancialConnectionsAuthorizationSession(int i11, @ro0.o("id") String str, @ro0.o("next_pane") FinancialConnectionsSessionManifest.Pane pane, @ro0.o(AnalyticsContext.Flow) String str2, @ro0.o("institution_skip_account_selection") Boolean bool, @ro0.o("show_partner_disclosure") Boolean bool2, @ro0.o("skip_account_selection") Boolean bool3, @ro0.o(ImagesContract.URL) String str3, @ro0.o("url_qr_code") String str4, @ro0.o("is_oauth") Boolean bool4, @ro0.o("display") Display nVar, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, a.f50307a.getDescriptor());
        }
        this.id = str;
        this.nextPane = pane;
        if ((i11 & 4) == 0) {
            this.flow = null;
        } else {
            this.flow = str2;
        }
        if ((i11 & 8) == 0) {
            this.institutionSkipAccountSelection = null;
        } else {
            this.institutionSkipAccountSelection = bool;
        }
        if ((i11 & 16) == 0) {
            this.showPartnerDisclosure = null;
        } else {
            this.showPartnerDisclosure = bool2;
        }
        if ((i11 & 32) == 0) {
            this.skipAccountSelection = null;
        } else {
            this.skipAccountSelection = bool3;
        }
        if ((i11 & 64) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i11 & 128) == 0) {
            this.urlQrCode = null;
        } else {
            this.urlQrCode = str4;
        }
        if ((i11 & 256) == 0) {
            this._isOAuth = Boolean.FALSE;
        } else {
            this._isOAuth = bool4;
        }
        if ((i11 & 512) == 0) {
            this.display = null;
        } else {
            this.display = nVar;
        }
    }

    public static final /* synthetic */ void h(FinancialConnectionsAuthorizationSession self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.id);
        output.D(serialDesc, 1, FinancialConnectionsSessionManifest.Pane.c.f50360e, self.nextPane);
        if (output.G(serialDesc, 2) || self.flow != null) {
            output.y(serialDesc, 2, z1.f119730a, self.flow);
        }
        if (output.G(serialDesc, 3) || self.institutionSkipAccountSelection != null) {
            output.y(serialDesc, 3, vo0.h.f119620a, self.institutionSkipAccountSelection);
        }
        if (output.G(serialDesc, 4) || self.showPartnerDisclosure != null) {
            output.y(serialDesc, 4, vo0.h.f119620a, self.showPartnerDisclosure);
        }
        if (output.G(serialDesc, 5) || self.skipAccountSelection != null) {
            output.y(serialDesc, 5, vo0.h.f119620a, self.skipAccountSelection);
        }
        if (output.G(serialDesc, 6) || self.url != null) {
            output.y(serialDesc, 6, z1.f119730a, self.url);
        }
        if (output.G(serialDesc, 7) || self.urlQrCode != null) {
            output.y(serialDesc, 7, z1.f119730a, self.urlQrCode);
        }
        if (output.G(serialDesc, 8) || !p013kotlin.jvm.internal.s.f(self._isOAuth, Boolean.FALSE)) {
            output.y(serialDesc, 8, vo0.h.f119620a, self._isOAuth);
        }
        if (!output.G(serialDesc, 9) && self.display == null) {
            return;
        }
        output.y(serialDesc, 9, Display.a.f50529a, self.display);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Display getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getInstitutionSkipAccountSelection() {
        return this.institutionSkipAccountSelection;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getNextPane() {
        return this.nextPane;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getSkipAccountSelection() {
        return this.skipAccountSelection;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsAuthorizationSession)) {
            return false;
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) other;
        return p013kotlin.jvm.internal.s.f(this.id, financialConnectionsAuthorizationSession.id) && this.nextPane == financialConnectionsAuthorizationSession.nextPane && p013kotlin.jvm.internal.s.f(this.flow, financialConnectionsAuthorizationSession.flow) && p013kotlin.jvm.internal.s.f(this.institutionSkipAccountSelection, financialConnectionsAuthorizationSession.institutionSkipAccountSelection) && p013kotlin.jvm.internal.s.f(this.showPartnerDisclosure, financialConnectionsAuthorizationSession.showPartnerDisclosure) && p013kotlin.jvm.internal.s.f(this.skipAccountSelection, financialConnectionsAuthorizationSession.skipAccountSelection) && p013kotlin.jvm.internal.s.f(this.url, financialConnectionsAuthorizationSession.url) && p013kotlin.jvm.internal.s.f(this.urlQrCode, financialConnectionsAuthorizationSession.urlQrCode) && p013kotlin.jvm.internal.s.f(this._isOAuth, financialConnectionsAuthorizationSession._isOAuth) && p013kotlin.jvm.internal.s.f(this.display, financialConnectionsAuthorizationSession.display);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean g() {
        Boolean bool = this._isOAuth;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.nextPane.hashCode()) * 31;
        String str = this.flow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.institutionSkipAccountSelection;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showPartnerDisclosure;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.skipAccountSelection;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.url;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.urlQrCode;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this._isOAuth;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Display nVar = this.display;
        return iHashCode8 + (nVar != null ? nVar.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsAuthorizationSession(id=" + this.id + ", nextPane=" + this.nextPane + ", flow=" + this.flow + ", institutionSkipAccountSelection=" + this.institutionSkipAccountSelection + ", showPartnerDisclosure=" + this.showPartnerDisclosure + ", skipAccountSelection=" + this.skipAccountSelection + ", url=" + this.url + ", urlQrCode=" + this.urlQrCode + ", _isOAuth=" + this._isOAuth + ", display=" + this.display + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.nextPane.name());
        parcel.writeString(this.flow);
        Boolean bool = this.institutionSkipAccountSelection;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showPartnerDisclosure;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.skipAccountSelection;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.urlQrCode);
        Boolean bool4 = this._isOAuth;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Display nVar = this.display;
        if (nVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nVar.writeToParcel(parcel, flags);
        }
    }

    public FinancialConnectionsAuthorizationSession(String id2, FinancialConnectionsSessionManifest.Pane nextPane, String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, Boolean bool4, Display nVar) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(nextPane, "nextPane");
        this.id = id2;
        this.nextPane = nextPane;
        this.flow = str;
        this.institutionSkipAccountSelection = bool;
        this.showPartnerDisclosure = bool2;
        this.skipAccountSelection = bool3;
        this.url = str2;
        this.urlQrCode = str3;
        this._isOAuth = bool4;
        this.display = nVar;
    }
}
