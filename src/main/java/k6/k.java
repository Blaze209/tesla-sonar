package k6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import d6.f0;
import e6.b0;
import e6.l;
import e6.n;
import e6.p;
import e6.r;
import e6.s;
import e6.z;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jn0.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lk6/k;", "", "a", "b", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f85098b = "clientDataJSON";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f85099c = "attestationObject";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f85100d = "authenticatorData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f85101e = "signature";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f85102f = "userHandle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f85103g = "response";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f85104h = "id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f85105i = "rawId";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f85106j = "type";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f85107k = "rpId";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f85108l = ClientData.KEY_CHALLENGE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f85109m = "appid";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f85110n = "thirdPartyPayment";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f85111o = "authenticatorSelection";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f85112p = "requireResidentKey";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f85113q = "residentKey";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f85114r = "authenticatorAttachment";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f85115s = "timeout";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f85116t = "excludeCredentials";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f85117u = "transports";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f85118v = "rp";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f85119w = "name";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f85120x = "icon";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f85121y = "alg";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f85122z = "user";
    private static final String A = "displayName";
    private static final String B = "userVerificationMethod";
    private static final String C = "keyProtectionType";
    private static final String D = "matcherProtectionType";
    private static final String E = "extensions";
    private static final String F = "attestation";
    private static final String G = "pubKeyCredParams";
    private static final String H = "clientExtensionResults";
    private static final String I = "rk";
    private static final String J = "credProps";
    private static final LinkedHashMap<ErrorCode, e6.e> K = v0.l(x.a(ErrorCode.UNKNOWN_ERR, new b0()), x.a(ErrorCode.ABORT_ERR, new e6.a()), x.a(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new r()), x.a(ErrorCode.CONSTRAINT_ERR, new e6.b()), x.a(ErrorCode.DATA_ERR, new e6.d()), x.a(ErrorCode.INVALID_STATE_ERR, new l()), x.a(ErrorCode.ENCODING_ERR, new e6.f()), x.a(ErrorCode.NETWORK_ERR, new n()), x.a(ErrorCode.NOT_ALLOWED_ERR, new p()), x.a(ErrorCode.NOT_SUPPORTED_ERR, new s()), x.a(ErrorCode.SECURITY_ERR, new e6.x()), x.a(ErrorCode.TIMEOUT_ERR, new z()));

    /* JADX INFO: renamed from: k6.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0018\u001a\u00020$¢\u0006\u0004\b&\u0010'J!\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b3\u00102J\u001f\u00104\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b4\u00102J\u001f\u00105\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b5\u00102J\u001f\u00106\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b6\u00102J\u001f\u00107\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b7\u00102J\u0015\u00109\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0019¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u001a\u0010E\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010BR\u001a\u0010G\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u001a\u0010I\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010BR\u001a\u0010K\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bK\u0010@\u001a\u0004\bL\u0010BR\u001a\u0010M\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bM\u0010@\u001a\u0004\bN\u0010BR\u001a\u0010O\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010BR\u001a\u0010Q\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bQ\u0010@\u001a\u0004\bR\u0010BR\u001a\u0010S\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bT\u0010BR\u001a\u0010U\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bU\u0010@\u001a\u0004\bV\u0010BR\u001a\u0010W\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bW\u0010@\u001a\u0004\bX\u0010BR\u001a\u0010Y\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bY\u0010@\u001a\u0004\bZ\u0010BR\u001a\u0010[\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\b[\u0010@\u001a\u0004\b\\\u0010BR\u001a\u0010]\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\b]\u0010@\u001a\u0004\b^\u0010BR\u001a\u0010_\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\b_\u0010@\u001a\u0004\b`\u0010BR\u001a\u0010a\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\ba\u0010@\u001a\u0004\bb\u0010BR\u001a\u0010c\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bc\u0010@\u001a\u0004\bd\u0010BR\u001a\u0010e\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\be\u0010@\u001a\u0004\bf\u0010BR\u001a\u0010g\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bg\u0010@\u001a\u0004\bh\u0010BR\u001a\u0010i\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bi\u0010@\u001a\u0004\bj\u0010BR\u001a\u0010k\u001a\u00020\u00198\u0000X\u0080D¢\u0006\f\n\u0004\bk\u0010@\u001a\u0004\bl\u0010BR6\u0010p\u001a\u001e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020n0mj\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020n`o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0014\u0010t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bt\u00105R\u0014\u0010u\u001a\u00020;8\u0002X\u0082T¢\u0006\u0006\n\u0004\bu\u00104R\u0014\u0010v\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010@¨\u0006w"}, d2 = {"Lk6/k$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "version", "", Gender.FEMALE, "(Landroid/content/Context;J)Z", "Lorg/json/JSONObject;", "json", "", "h", "(Lorg/json/JSONObject;)[B", "Ld6/f;", "request", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", DateTokenConverter.CONVERTER_KEY, "(Ld6/f;Landroid/content/Context;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "e", "(Lorg/json/JSONObject;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "cred", "", Gender.NONE, "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ljava/lang/String;", "Ld6/f0;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "f", "(Ld6/f0;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "g", "(Ld6/f0;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Landroidx/credentials/exceptions/CreateCredentialException;", Gender.MALE, "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Landroidx/credentials/exceptions/CreateCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;", "code", "msg", "Landroidx/credentials/exceptions/GetCredentialException;", "b", "(Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;", "builder", "Ljn0/h0;", "H", "(Lorg/json/JSONObject;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V", "G", "I", "J", "L", "K", "str", "a", "(Ljava/lang/String;)[B", "", "alg", "c", "(I)Z", "JSON_KEY_ID", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "JSON_KEY_TYPE", "C", "JSON_KEY_RPID", "y", "JSON_KEY_CHALLENGE", "n", "JSON_KEY_APPID", "j", "JSON_KEY_THIRD_PARTY_PAYMENT", "z", "JSON_KEY_AUTH_SELECTION", "m", "JSON_KEY_REQUIRE_RES_KEY", "v", "JSON_KEY_RES_KEY", "w", "JSON_KEY_AUTH_ATTACHMENT", "l", "JSON_KEY_TIMEOUT", "A", "JSON_KEY_EXCLUDE_CREDENTIALS", "p", "JSON_KEY_TRANSPORTS", "B", "JSON_KEY_RP", "x", "JSON_KEY_NAME", "t", "JSON_KEY_ICON", "r", "JSON_KEY_ALG", IntegerTokenConverter.CONVERTER_KEY, "JSON_KEY_USER", "D", "JSON_KEY_DISPLAY_NAME", "o", "JSON_KEY_EXTENSTIONS", "q", "JSON_KEY_ATTESTATION", "k", "JSON_KEY_PUB_KEY_CRED_PARAMS", "u", "Ljava/util/LinkedHashMap;", "Le6/e;", "Lkotlin/collections/LinkedHashMap;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "E", "()Ljava/util/LinkedHashMap;", "AUTH_MIN_VERSION_JSON_CREATE", "FLAGS", "TAG", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean F(Context context, long version) throws PackageManager.NameNotFoundException {
            long jA;
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return false;
            }
            PackageManager packageManager = context.getPackageManager();
            p013kotlin.jvm.internal.s.j(packageManager, "getPackageManager(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
                p013kotlin.jvm.internal.s.j(packageInfo, "getPackageInfo(...)");
                jA = b.a(packageInfo);
            } else {
                jA = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
            }
            return jA > version;
        }

        private final byte[] h(JSONObject json) throws JSONException {
            String strOptString = json.optString(n(), "");
            p013kotlin.jvm.internal.s.h(strOptString);
            if (strOptString.length() != 0) {
                return a(strOptString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        public final String A() {
            return k.f85115s;
        }

        public final String B() {
            return k.f85117u;
        }

        public final String C() {
            return k.f85106j;
        }

        public final String D() {
            return k.f85122z;
        }

        public final LinkedHashMap<ErrorCode, e6.e> E() {
            return k.K;
        }

        public final void G(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            p013kotlin.jvm.internal.s.k(json, "json");
            p013kotlin.jvm.internal.s.k(builder, "builder");
            if (json.has(m())) {
                JSONObject jSONObject = json.getJSONObject(m());
                AuthenticatorSelectionCriteria.Builder builder2 = new AuthenticatorSelectionCriteria.Builder();
                boolean zOptBoolean = jSONObject.optBoolean(v(), false);
                String strOptString = jSONObject.optString(w(), "");
                p013kotlin.jvm.internal.s.h(strOptString);
                builder2.setRequireResidentKey(Boolean.valueOf(zOptBoolean)).setResidentKeyRequirement(strOptString.length() > 0 ? ResidentKeyRequirement.fromString(strOptString) : null);
                String strOptString2 = jSONObject.optString(l(), "");
                p013kotlin.jvm.internal.s.h(strOptString2);
                if (strOptString2.length() > 0) {
                    builder2.setAttachment(Attachment.fromString(strOptString2));
                }
                builder.setAuthenticatorSelection(builder2.build());
            }
        }

        public final void H(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            p013kotlin.jvm.internal.s.k(json, "json");
            p013kotlin.jvm.internal.s.k(builder, "builder");
            if (json.has(q())) {
                JSONObject jSONObject = json.getJSONObject(q());
                AuthenticationExtensions.Builder builder2 = new AuthenticationExtensions.Builder();
                String strOptString = jSONObject.optString(j(), "");
                p013kotlin.jvm.internal.s.h(strOptString);
                if (strOptString.length() > 0) {
                    builder2.setFido2Extension(new FidoAppIdExtension(strOptString));
                }
                if (jSONObject.optBoolean(z(), false)) {
                    builder2.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(true));
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    builder2.setUserVerificationMethodExtension(new UserVerificationMethodExtension(true));
                }
                builder.setAuthenticationExtensions(builder2.build());
            }
        }

        public final void I(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) {
            p013kotlin.jvm.internal.s.k(json, "json");
            p013kotlin.jvm.internal.s.k(builder, "builder");
            if (json.has(A())) {
                builder.setTimeoutSeconds(Double.valueOf(json.getLong(A()) / ((double) 1000)));
            }
        }

        public final void J(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException, CreatePublicKeyCredentialDomException {
            ArrayList arrayList;
            p013kotlin.jvm.internal.s.k(json, "json");
            p013kotlin.jvm.internal.s.k(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(p())) {
                JSONArray jSONArray = json.getJSONArray(p());
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    String string = jSONObject.getString(s());
                    p013kotlin.jvm.internal.s.j(string, "getString(...)");
                    byte[] bArrA = a(string);
                    String string2 = jSONObject.getString(C());
                    p013kotlin.jvm.internal.s.h(string2);
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrA.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(B())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(B());
                        int length2 = jSONArray2.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            try {
                                Transport transportFromString = Transport.fromString(jSONArray2.getString(i12));
                                p013kotlin.jvm.internal.s.j(transportFromString, "fromString(...)");
                                arrayList.add(transportFromString);
                            } catch (Transport.UnsupportedTransportException e11) {
                                throw new CreatePublicKeyCredentialDomException(new e6.f(), e11.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(string2, bArrA, arrayList));
                }
            }
            builder.setExcludeList(arrayList2);
            String strOptString = json.optString(k(), "none");
            p013kotlin.jvm.internal.s.h(strOptString);
            builder.setAttestationConveyancePreference(AttestationConveyancePreference.fromString(strOptString.length() != 0 ? strOptString : "none"));
        }

        public final void K(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            p013kotlin.jvm.internal.s.k(json, "json");
            p013kotlin.jvm.internal.s.k(builder, "builder");
            builder.setChallenge(h(json));
            JSONObject jSONObject = json.getJSONObject(D());
            String string = jSONObject.getString(s());
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            byte[] bArrA = a(string);
            String string2 = jSONObject.getString(t());
            String string3 = jSONObject.getString(o());
            String strOptString = jSONObject.optString(r(), "");
            p013kotlin.jvm.internal.s.h(string3);
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrA.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            p013kotlin.jvm.internal.s.h(string2);
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.setUser(new PublicKeyCredentialUserEntity(bArrA, string2, strOptString, string3));
        }

        public final void L(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            p013kotlin.jvm.internal.s.k(json, "json");
            p013kotlin.jvm.internal.s.k(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(x());
            String string = jSONObject.getString(s());
            String strOptString = jSONObject.optString(t(), "");
            String strOptString2 = jSONObject.optString(r(), "");
            p013kotlin.jvm.internal.s.h(strOptString2);
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            p013kotlin.jvm.internal.s.h(strOptString);
            if (strOptString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            p013kotlin.jvm.internal.s.h(string);
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.setRp(new PublicKeyCredentialRpEntity(string, strOptString, strOptString2));
            JSONArray jSONArray = json.getJSONArray(u());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                int i12 = (int) jSONObject2.getLong(i());
                String strOptString3 = jSONObject2.optString(C(), "");
                p013kotlin.jvm.internal.s.h(strOptString3);
                if (strOptString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (c(i12)) {
                    arrayList.add(new PublicKeyCredentialParameters(strOptString3, i12));
                }
            }
            builder.setParameters(arrayList);
        }

        public final CreateCredentialException M(PublicKeyCredential cred) {
            p013kotlin.jvm.internal.s.k(cred, "cred");
            AuthenticatorResponse response = cred.getResponse();
            p013kotlin.jvm.internal.s.j(response, "getResponse(...)");
            if (!(response instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
            ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
            p013kotlin.jvm.internal.s.j(errorCode, "getErrorCode(...)");
            e6.e eVar = E().get(errorCode);
            String errorMessage = authenticatorErrorResponse.getErrorMessage();
            if (eVar != null) {
                return (errorCode == ErrorCode.NOT_ALLOWED_ERR && errorMessage != null && t.h0(errorMessage, "Unable to get sync account", false, 2, null)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(eVar, errorMessage);
            }
            return new CreatePublicKeyCredentialDomException(new b0(), "unknown fido gms exception - " + errorMessage);
        }

        public final String N(SignInCredential cred) throws GetCredentialException {
            p013kotlin.jvm.internal.s.k(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = cred.getPublicKeyCredential();
            AuthenticatorResponse response = publicKeyCredential != null ? publicKeyCredential.getResponse() : null;
            p013kotlin.jvm.internal.s.h(response);
            if (response instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
                ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
                p013kotlin.jvm.internal.s.j(errorCode, "getErrorCode(...)");
                throw b(errorCode, authenticatorErrorResponse.getErrorMessage());
            }
            if (!(response instanceof AuthenticatorAssertionResponse)) {
                Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: " + response.getClass().getName());
                String string = jSONObject.toString();
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                return string;
            }
            try {
                String json = publicKeyCredential.toJson();
                p013kotlin.jvm.internal.s.j(json, "toJson(...)");
                return json;
            } catch (Throwable th2) {
                throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
            }
        }

        public final byte[] a(String str) {
            p013kotlin.jvm.internal.s.k(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            p013kotlin.jvm.internal.s.j(bArrDecode, "decode(...)");
            return bArrDecode;
        }

        public final GetCredentialException b(ErrorCode code, String msg) {
            p013kotlin.jvm.internal.s.k(code, "code");
            e6.e eVar = E().get(code);
            if (eVar != null) {
                return (code == ErrorCode.NOT_ALLOWED_ERR && msg != null && t.h0(msg, "Unable to get sync account", false, 2, null)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(eVar, msg);
            }
            return new GetPublicKeyCredentialDomException(new b0(), "unknown fido gms exception - " + msg);
        }

        public final boolean c(int alg) {
            try {
                COSEAlgorithmIdentifier.fromCoseValue(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final PublicKeyCredentialCreationOptions d(d6.f request, Context context) {
            p013kotlin.jvm.internal.s.k(request, "request");
            p013kotlin.jvm.internal.s.k(context, "context");
            return F(context, 241217000L) ? new PublicKeyCredentialCreationOptions(request.b()) : e(new JSONObject(request.b()));
        }

        public final PublicKeyCredentialCreationOptions e(JSONObject json) throws JSONException, CreatePublicKeyCredentialDomException {
            p013kotlin.jvm.internal.s.k(json, "json");
            PublicKeyCredentialCreationOptions.Builder builder = new PublicKeyCredentialCreationOptions.Builder();
            K(json, builder);
            L(json, builder);
            J(json, builder);
            I(json, builder);
            G(json, builder);
            H(json, builder);
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsBuild = builder.build();
            p013kotlin.jvm.internal.s.j(publicKeyCredentialCreationOptionsBuild, "build(...)");
            return publicKeyCredentialCreationOptionsBuild;
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions f(f0 option) {
            p013kotlin.jvm.internal.s.k(option, "option");
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptionsBuild = new BeginSignInRequest.PasskeyJsonRequestOptions.Builder().setSupported(true).setRequestJson(option.f()).build();
            p013kotlin.jvm.internal.s.j(passkeyJsonRequestOptionsBuild, "build(...)");
            return passkeyJsonRequestOptionsBuild;
        }

        @jn0.e
        public final BeginSignInRequest.PasskeysRequestOptions g(f0 option) throws JSONException {
            p013kotlin.jvm.internal.s.k(option, "option");
            JSONObject jSONObject = new JSONObject(option.f());
            String strOptString = jSONObject.optString(y(), "");
            p013kotlin.jvm.internal.s.h(strOptString);
            if (strOptString.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptionsBuild = new BeginSignInRequest.PasskeysRequestOptions.Builder().setSupported(true).setRpId(strOptString).setChallenge(h(jSONObject)).build();
            p013kotlin.jvm.internal.s.j(passkeysRequestOptionsBuild, "build(...)");
            return passkeysRequestOptionsBuild;
        }

        public final String i() {
            return k.f85121y;
        }

        public final String j() {
            return k.f85109m;
        }

        public final String k() {
            return k.F;
        }

        public final String l() {
            return k.f85114r;
        }

        public final String m() {
            return k.f85111o;
        }

        public final String n() {
            return k.f85108l;
        }

        public final String o() {
            return k.A;
        }

        public final String p() {
            return k.f85116t;
        }

        public final String q() {
            return k.E;
        }

        public final String r() {
            return k.f85120x;
        }

        public final String s() {
            return k.f85104h;
        }

        public final String t() {
            return k.f85119w;
        }

        public final String u() {
            return k.G;
        }

        public final String v() {
            return k.f85112p;
        }

        public final String w() {
            return k.f85113q;
        }

        public final String x() {
            return k.f85118v;
        }

        public final String y() {
            return k.f85107k;
        }

        public final String z() {
            return k.f85110n;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk6/k$b;", "", "<init>", "()V", "Landroid/content/pm/PackageInfo;", "info", "", "a", "(Landroid/content/pm/PackageInfo;)J", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f85123a = new b();

        private b() {
        }

        public static final long a(PackageInfo info) {
            p013kotlin.jvm.internal.s.k(info, "info");
            return info.getLongVersionCode();
        }
    }
}
