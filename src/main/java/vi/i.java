package vi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import ezvcard.property.Gender;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0002\u0013\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010)R\"\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b+\u0010\u0006\"\u0004\b/\u0010)R\"\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b%\u0010\u0006\"\u0004\b2\u0010)R$\u00108\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0010\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010@\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010&\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010)R#\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0D8\u0006¢\u0006\f\n\u0004\bA\u0010E\u001a\u0004\b:\u0010FR$\u0010N\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\b1\u0010K\"\u0004\bL\u0010MR\"\u0010Q\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001b\u001a\u0004\bO\u0010\u001d\"\u0004\bP\u0010\u001fR$\u0010W\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010S\u001a\u0004\b!\u0010T\"\u0004\bU\u0010VR\"\u0010]\u001a\u00020X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010Y\u001a\u0004\b\u001a\u0010Z\"\u0004\b[\u0010\\R$\u0010c\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010_\u001a\u0004\bI\u0010`\"\u0004\ba\u0010bR$\u0010e\u001a\u0004\u0018\u00010d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\b\u0013\u0010g\"\u0004\bh\u0010i¨\u0006j"}, d2 = {"Lvi/i;", "", "<init>", "()V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "source", "r", "(Lvi/i;)Z", "", "a", "Ljava/lang/String;", "uriString", "Landroid/net/Uri;", "b", "Landroid/net/Uri;", "p", "()Landroid/net/Uri;", "H", "(Landroid/net/Uri;)V", "uri", "c", "Z", "s", "()Z", "B", "(Z)V", "isLocalAssetFile", DateTokenConverter.CONVERTER_KEY, "q", "t", "isAsset", "e", "I", "n", Gender.FEMALE, "(I)V", "startPositionMs", "f", "g", "y", "cropStartMs", "x", "cropEndMs", "h", "w", "contentStartTime", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "A", "(Ljava/lang/String;)V", "extension", "Lvi/i$b;", "j", "Lvi/i$b;", "k", "()Lvi/i$b;", "C", "(Lvi/i$b;)V", OrcaKeys.METADATA, "l", "D", "minLoadRetryCount", "", "Ljava/util/Map;", "()Ljava/util/Map;", "headers", "Lvi/f;", "m", "Lvi/f;", "()Lvi/f;", "z", "(Lvi/f;)V", "drmProps", "o", "G", "textTracksAllowChunklessPreparation", "Lvi/d;", "Lvi/d;", "()Lvi/d;", "v", "(Lvi/d;)V", "cmcdProps", "Lvi/b;", "Lvi/b;", "()Lvi/b;", "u", "(Lvi/b;)V", "bufferConfig", "Lvi/h;", "Lvi/h;", "()Lvi/h;", "E", "(Lvi/h;)V", "sideLoadedTextTracks", "Lvi/a;", "adsProps", "Lvi/a;", "()Lvi/a;", "setAdsProps", "(Lvi/a;)V", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String uriString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Uri uri;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isLocalAssetFile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isAsset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String extension;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private b metadata;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private f drmProps;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean textTracksAllowChunklessPreparation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private CMCDProps cmcdProps;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private h sideLoadedTextTracks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int startPositionMs = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int cropStartMs = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int cropEndMs = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int contentStartTime = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int minLoadRetryCount = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> headers = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private vi.b bufferConfig = new vi.b();

    /* JADX INFO: renamed from: vi.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0015R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0015¨\u0006'"}, d2 = {"Lvi/i$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "uriString", "Landroid/net/Uri;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;", CardPaymentMethod.PAYMENT_METHOD_TYPE, "", "b", "(Ljava/lang/String;)Z", "Lcom/facebook/react/bridge/ReadableMap;", "src", "Lvi/i;", "c", "(Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)Lvi/i;", "TAG", "Ljava/lang/String;", "PROP_SRC_URI", "PROP_SRC_IS_LOCAL_ASSET_FILE", "PROP_SRC_IS_ASSET", "PROP_SRC_START_POSITION", "PROP_SRC_CROP_START", "PROP_SRC_CROP_END", "PROP_SRC_CONTENT_START_TIME", "PROP_SRC_TYPE", "PROP_SRC_METADATA", "PROP_SRC_HEADERS", "PROP_SRC_DRM", "PROP_SRC_CMCD", "PROP_SRC_ADS", "PROP_SRC_TEXT_TRACKS_ALLOW_CHUNKLESS_PREPARATION", "PROP_SRC_TEXT_TRACKS", "PROP_SRC_MIN_LOAD_RETRY_COUNT", "PROP_SRC_BUFFER_CONFIG", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @SuppressLint({"DiscouragedApi"})
        private final Uri a(Context context, String uriString) {
            Resources resources = context.getResources();
            s.j(resources, "getResources(...)");
            String packageName = context.getPackageName();
            s.j(packageName, "getPackageName(...)");
            int identifier = resources.getIdentifier(uriString, "drawable", packageName);
            if (identifier == 0) {
                identifier = resources.getIdentifier(uriString, "raw", packageName);
            }
            if (identifier > 0) {
                return new Uri.Builder().scheme("android.resource").path(String.valueOf(identifier)).build();
            }
            xi.a.a("Source", "cannot find identifier");
            return null;
        }

        private final boolean b(String scheme) {
            if (scheme == null) {
                return false;
            }
            Locale locale = Locale.getDefault();
            s.j(locale, "getDefault(...)");
            String lowerCase = scheme.toLowerCase(locale);
            s.j(lowerCase, "toLowerCase(...)");
            return s.f(lowerCase, "http") || s.f(lowerCase, "https") || s.f(lowerCase, "content") || s.f(lowerCase, Action.FILE_ATTRIBUTE) || s.f(lowerCase, "rtsp") || s.f(lowerCase, "asset");
        }

        public final i c(ReadableMap src, Context context) {
            s.k(context, "context");
            i iVar = new i();
            if (src != null) {
                String strH = xi.b.h(src, "uri", null);
                if (strH != null) {
                    if (t.y0(strH)) {
                        strH = null;
                    }
                    if (strH != null) {
                        Uri uriA = Uri.parse(strH);
                        Companion companion = i.INSTANCE;
                        if (companion.b(uriA.getScheme()) || (uriA = companion.a(context, strH)) != null) {
                            iVar.uriString = strH;
                            iVar.H(uriA);
                        }
                    }
                }
                iVar.B(xi.b.b(src, "isLocalAssetFile", false));
                iVar.t(xi.b.b(src, "isAsset", false));
                iVar.F(xi.b.e(src, "startPosition", -1));
                iVar.y(xi.b.e(src, "cropStart", -1));
                iVar.x(xi.b.e(src, "cropEnd", -1));
                iVar.w(xi.b.e(src, "contentStartTime", -1));
                iVar.A(xi.b.h(src, "type", null));
                iVar.z(f.INSTANCE.a(xi.b.f(src, "drm")));
                iVar.v(CMCDProps.INSTANCE.a(xi.b.f(src, "cmcd")));
                iVar.G(xi.b.b(src, "textTracksAllowChunklessPreparation", true));
                iVar.E(h.INSTANCE.a(xi.b.a(src, "textTracks")));
                iVar.D(xi.b.e(src, "minLoadRetryCount", 3));
                iVar.u(vi.b.INSTANCE.c(xi.b.f(src, "bufferConfig")));
                ReadableArray readableArrayA = xi.b.a(src, "requestHeaders");
                if (readableArrayA != null && readableArrayA.size() > 0) {
                    int size = readableArrayA.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ReadableMap map = readableArrayA.getMap(i11);
                        String string = map != null ? map.getString(Action.KEY_ATTRIBUTE) : null;
                        String string2 = map != null ? map.getString("value") : null;
                        if (string != null && string2 != null) {
                            iVar.j().put(string, string2);
                        }
                    }
                }
                iVar.C(b.INSTANCE.a(xi.b.f(src, OrcaKeys.METADATA)));
                return iVar;
            }
            return iVar;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u0011\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lvi/i$b;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "title", "b", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "subtitle", "c", "g", "description", "f", "artist", "Landroid/net/Uri;", "Landroid/net/Uri;", "()Landroid/net/Uri;", "h", "(Landroid/net/Uri;)V", "imageUri", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String artist;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Uri imageUri;

        /* JADX INFO: renamed from: vi.i$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lvi/i$b$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "src", "Lvi/i$b;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lvi/i$b;", "", "PROP_SRC_METADATA_TITLE", "Ljava/lang/String;", "PROP_SRC_METADATA_SUBTITLE", "PROP_SRC_METADATA_DESCRIPTION", "PROP_SRC_METADATA_ARTIST", "PROP_SRC_METADATA_IMAGE_URI", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(ReadableMap src) {
                if (src == null) {
                    return null;
                }
                b bVar = new b();
                bVar.j(xi.b.g(src, "title"));
                bVar.i(xi.b.g(src, "subtitle"));
                bVar.g(xi.b.g(src, "description"));
                bVar.f(xi.b.g(src, "artist"));
                try {
                    bVar.h(Uri.parse(xi.b.g(src, "imageUri")));
                    return bVar;
                } catch (Exception unused) {
                    xi.a.b("Source", "Could not parse imageUri in metadata");
                    return bVar;
                }
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getArtist() {
            return this.artist;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Uri getImageUri() {
            return this.imageUri;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final void f(String str) {
            this.artist = str;
        }

        public final void g(String str) {
            this.description = str;
        }

        public final void h(Uri uri) {
            this.imageUri = uri;
        }

        public final void i(String str) {
            this.subtitle = str;
        }

        public final void j(String str) {
            this.title = str;
        }
    }

    public final void A(String str) {
        this.extension = str;
    }

    public final void B(boolean z11) {
        this.isLocalAssetFile = z11;
    }

    public final void C(b bVar) {
        this.metadata = bVar;
    }

    public final void D(int i11) {
        this.minLoadRetryCount = i11;
    }

    public final void E(h hVar) {
        this.sideLoadedTextTracks = hVar;
    }

    public final void F(int i11) {
        this.startPositionMs = i11;
    }

    public final void G(boolean z11) {
        this.textTracksAllowChunklessPreparation = z11;
    }

    public final void H(Uri uri) {
        this.uri = uri;
    }

    public final a b() {
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final vi.b getBufferConfig() {
        return this.bufferConfig;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CMCDProps getCmcdProps() {
        return this.cmcdProps;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getContentStartTime() {
        return this.contentStartTime;
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof i)) {
            i iVar = (i) other;
            if (s.f(this.uri, iVar.uri) && this.cropStartMs == iVar.cropStartMs && this.cropEndMs == iVar.cropEndMs && this.startPositionMs == iVar.startPositionMs && s.f(this.extension, iVar.extension) && s.f(this.drmProps, iVar.drmProps) && this.contentStartTime == iVar.contentStartTime && s.f(this.cmcdProps, iVar.cmcdProps) && s.f(this.sideLoadedTextTracks, iVar.sideLoadedTextTracks) && s.f(null, null) && this.minLoadRetryCount == iVar.minLoadRetryCount && this.isLocalAssetFile == iVar.isLocalAssetFile && this.isAsset == iVar.isAsset && s.f(this.bufferConfig, iVar.bufferConfig)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getCropEndMs() {
        return this.cropEndMs;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getCropStartMs() {
        return this.cropStartMs;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getDrmProps() {
        return this.drmProps;
    }

    public int hashCode() {
        return Objects.hash(this.uriString, this.uri, Integer.valueOf(this.startPositionMs), Integer.valueOf(this.cropStartMs), Integer.valueOf(this.cropEndMs), this.extension, this.metadata, this.headers, null);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    public final Map<String, String> j() {
        return this.headers;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getMinLoadRetryCount() {
        return this.minLoadRetryCount;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final h getSideLoadedTextTracks() {
        return this.sideLoadedTextTracks;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getStartPositionMs() {
        return this.startPositionMs;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getTextTracksAllowChunklessPreparation() {
        return this.textTracksAllowChunklessPreparation;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsAsset() {
        return this.isAsset;
    }

    public final boolean r(i source) {
        s.k(source, "source");
        return s.f(this, source);
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsLocalAssetFile() {
        return this.isLocalAssetFile;
    }

    public final void t(boolean z11) {
        this.isAsset = z11;
    }

    public final void u(vi.b bVar) {
        s.k(bVar, "<set-?>");
        this.bufferConfig = bVar;
    }

    public final void v(CMCDProps cMCDProps) {
        this.cmcdProps = cMCDProps;
    }

    public final void w(int i11) {
        this.contentStartTime = i11;
    }

    public final void x(int i11) {
        this.cropEndMs = i11;
    }

    public final void y(int i11) {
        this.cropStartMs = i11;
    }

    public final void z(f fVar) {
        this.drmProps = fVar;
    }
}
