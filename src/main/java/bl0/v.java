package bl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import ezvcard.property.Gender;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u001a"}, d2 = {"Lbl0/v;", "", "", "value", "", "description", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b0", "(Lbl0/v;)I", "a", "I", "c0", "b", "Ljava/lang/String;", "getDescription", "c", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class v implements Comparable<v> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final List<v> f17732e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Map<Integer, v> f17734f0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final v f17729d = new v(100, "Continue");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final v f17731e = new v(101, "Switching Protocols");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final v f17733f = new v(102, "Processing");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final v f17735g = new v(200, "OK");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final v f17736h = new v(EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, "Created");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final v f17737i = new v(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, "Accepted");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final v f17738j = new v(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, "Non-Authoritative Information");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final v f17739k = new v(EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, "No Content");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final v f17740l = new v(EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE, "Reset Content");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final v f17741m = new v(EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, "Partial Content");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final v f17742n = new v(EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE, "Multi-Status");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final v f17743o = new v(300, "Multiple Choices");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final v f17744p = new v(EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, "Moved Permanently");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final v f17745q = new v(EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE, "Found");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final v f17746r = new v(EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, "See Other");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final v f17747s = new v(EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, "Not Modified");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final v f17748t = new v(EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, "Use Proxy");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final v f17749u = new v(EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, "Switch Proxy");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final v f17750v = new v(307, "Temporary Redirect");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final v f17751w = new v(308, "Permanent Redirect");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final v f17752x = new v(400, "Bad Request");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final v f17753y = new v(HttpStatusCode.UNAUTHORIZED_401, "Unauthorized");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final v f17754z = new v(WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, "Payment Required");
    private static final v A = new v(DownloaderService.STATUS_FORBIDDEN, "Forbidden");
    private static final v B = new v(404, "Not Found");
    private static final v C = new v(WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, "Method Not Allowed");
    private static final v D = new v(WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, "Not Acceptable");
    private static final v E = new v(407, "Proxy Authentication Required");
    private static final v F = new v(408, "Request Timeout");
    private static final v G = new v(409, "Conflict");
    private static final v H = new v(WalletConstants.ERROR_CODE_INVALID_TRANSACTION, "Gone");
    private static final v I = new v(WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, "Length Required");
    private static final v J = new v(WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, "Precondition Failed");
    private static final v K = new v(413, "Payload Too Large");
    private static final v L = new v(WalletConstants.ERROR_CODE_ILLEGAL_CALLER, "Request-URI Too Long");
    private static final v M = new v(WalletConstants.ERROR_CODE_APP_LABEL_UNAVAILABLE, "Unsupported Media Type");
    private static final v N = new v(416, "Requested Range Not Satisfiable");
    private static final v O = new v(417, "Expectation Failed");
    private static final v P = new v(HttpStatusCode.UNPROCESSABLE_ENTITY_422, "Unprocessable Entity");
    private static final v Q = new v(423, "Locked");
    private static final v R = new v(424, "Failed Dependency");
    private static final v S = new v(425, "Too Early");
    private static final v T = new v(426, "Upgrade Required");
    private static final v U = new v(HttpStatusCode.TOO_MANY_REQUESTS_429, "Too Many Requests");
    private static final v V = new v(431, "Request Header Fields Too Large");
    private static final v W = new v(500, "Internal Server Error");
    private static final v X = new v(501, "Not Implemented");
    private static final v Y = new v(HttpStatusCode.BAD_GATEWAY_502, "Bad Gateway");
    private static final v Z = new v(503, "Service Unavailable");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final v f17725a0 = new v(504, "Gateway Timeout");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final v f17726b0 = new v(505, "HTTP Version Not Supported");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final v f17728c0 = new v(506, "Variant Also Negotiates");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final v f17730d0 = new v(507, "Insufficient Storage");

    /* JADX INFO: renamed from: bl0.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bl\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\bR\u0017\u0010O\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\bR\u0017\u0010Q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\bR\u0017\u0010S\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u0017\u0010U\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\bX\u0010\bR\u0017\u0010Y\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\bZ\u0010\bR\u0017\u0010[\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\b^\u0010\bR\u0017\u0010_\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b`\u0010\bR\u0017\u0010a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bb\u0010\bR\u0017\u0010c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bd\u0010\bR\u0017\u0010e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u0017\u0010g\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010\u0006\u001a\u0004\bh\u0010\bR\u0017\u0010i\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bi\u0010\u0006\u001a\u0004\bj\u0010\bR\u0017\u0010k\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\bR\u0017\u0010m\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bm\u0010\u0006\u001a\u0004\bn\u0010\bR\u0017\u0010o\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\bR \u0010s\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\u00040q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010t¨\u0006u"}, d2 = {"Lbl0/v$a;", "", "<init>", "()V", "Lbl0/v;", "Continue", "Lbl0/v;", "e", "()Lbl0/v;", "SwitchingProtocols", "Q", "Processing", "G", "OK", "A", "Created", "f", "Accepted", "a", "NonAuthoritativeInformation", "v", "NoContent", "u", "ResetContent", Gender.MALE, "PartialContent", "B", "MultiStatus", "s", "MultipleChoices", "t", "MovedPermanently", "r", "Found", "j", "SeeOther", Gender.NONE, "NotModified", "z", "UseProxy", "Y", "SwitchProxy", "P", "TemporaryRedirect", "R", "PermanentRedirect", "E", "BadRequest", "c", "Unauthorized", Gender.UNKNOWN, "PaymentRequired", "D", "Forbidden", IntegerTokenConverter.CONVERTER_KEY, "NotFound", "x", "MethodNotAllowed", "q", "NotAcceptable", "w", "ProxyAuthenticationRequired", "H", "RequestTimeout", "J", "Conflict", DateTokenConverter.CONVERTER_KEY, "Gone", "l", "LengthRequired", "o", "PreconditionFailed", Gender.FEMALE, "PayloadTooLarge", "C", "RequestURITooLong", "K", "UnsupportedMediaType", "W", "RequestedRangeNotSatisfiable", "L", "ExpectationFailed", "g", "UnprocessableEntity", "V", "Locked", "p", "FailedDependency", "h", "TooEarly", "S", "UpgradeRequired", "X", "TooManyRequests", "T", "RequestHeaderFieldTooLarge", "I", "InternalServerError", "n", "NotImplemented", "y", "BadGateway", "b", "ServiceUnavailable", Gender.OTHER, "GatewayTimeout", "k", "VersionNotSupported", "a0", "VariantAlsoNegotiates", "Z", "InsufficientStorage", "m", "", "", "statusCodesMap", "Ljava/util/Map;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v A() {
            return v.f17735g;
        }

        public final v B() {
            return v.f17741m;
        }

        public final v C() {
            return v.K;
        }

        public final v D() {
            return v.f17754z;
        }

        public final v E() {
            return v.f17751w;
        }

        public final v F() {
            return v.J;
        }

        public final v G() {
            return v.f17733f;
        }

        public final v H() {
            return v.E;
        }

        public final v I() {
            return v.V;
        }

        public final v J() {
            return v.F;
        }

        public final v K() {
            return v.L;
        }

        public final v L() {
            return v.N;
        }

        public final v M() {
            return v.f17740l;
        }

        public final v N() {
            return v.f17746r;
        }

        public final v O() {
            return v.Z;
        }

        public final v P() {
            return v.f17749u;
        }

        public final v Q() {
            return v.f17731e;
        }

        public final v R() {
            return v.f17750v;
        }

        public final v S() {
            return v.S;
        }

        public final v T() {
            return v.U;
        }

        public final v U() {
            return v.f17753y;
        }

        public final v V() {
            return v.P;
        }

        public final v W() {
            return v.M;
        }

        public final v X() {
            return v.T;
        }

        public final v Y() {
            return v.f17748t;
        }

        public final v Z() {
            return v.f17728c0;
        }

        public final v a() {
            return v.f17737i;
        }

        public final v a0() {
            return v.f17726b0;
        }

        public final v b() {
            return v.Y;
        }

        public final v c() {
            return v.f17752x;
        }

        public final v d() {
            return v.G;
        }

        public final v e() {
            return v.f17729d;
        }

        public final v f() {
            return v.f17736h;
        }

        public final v g() {
            return v.O;
        }

        public final v h() {
            return v.R;
        }

        public final v i() {
            return v.A;
        }

        public final v j() {
            return v.f17745q;
        }

        public final v k() {
            return v.f17725a0;
        }

        public final v l() {
            return v.H;
        }

        public final v m() {
            return v.f17730d0;
        }

        public final v n() {
            return v.W;
        }

        public final v o() {
            return v.I;
        }

        public final v p() {
            return v.Q;
        }

        public final v q() {
            return v.C;
        }

        public final v r() {
            return v.f17744p;
        }

        public final v s() {
            return v.f17742n;
        }

        public final v t() {
            return v.f17743o;
        }

        public final v u() {
            return v.f17739k;
        }

        public final v v() {
            return v.f17738j;
        }

        public final v w() {
            return v.D;
        }

        public final v x() {
            return v.B;
        }

        public final v y() {
            return v.X;
        }

        public final v z() {
            return v.f17747s;
        }

        private Companion() {
        }
    }

    static {
        List<v> listA = w.a();
        f17732e0 = listA;
        List<v> list = listA;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(p013kotlin.collections.v.y(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((v) obj).value), obj);
        }
        f17734f0 = linkedHashMap;
    }

    public v(int i11, String description) {
        p013kotlin.jvm.internal.s.k(description, "description");
        this.value = i11;
        this.description = description;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public int compareTo(v other) {
        p013kotlin.jvm.internal.s.k(other, "other");
        return this.value - other.value;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        return (other instanceof v) && ((v) other).value == this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    public String toString() {
        return this.value + ' ' + this.description;
    }
}
