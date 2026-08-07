package rd0;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.features.AuthConfig;
import com.tesla.features.FeaturesConfig;
import com.tesla.logging.TeslaLog;
import com.tesla.phonekeyauthengine.AuthorizationResult;
import ezvcard.property.Gender;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import jn0.h0;
import jn0.x;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import vc0.f3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0003\u0017\u0014\u0019B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u000fJC\u0010$\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\r0\"j\u0002`#0 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0003¢\u0006\u0004\b,\u0010\u000fJ=\u00100\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020!2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001eH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010\u000fJ\u0017\u00104\u001a\u0002032\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107R\u0014\u00109\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00108R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010:R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u00107R\u0014\u0010U\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u00107R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\"\u0010^\u001a\u0010\u0012\f\u0012\n [*\u0004\u0018\u00010\u00120\u00120Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\"\u0010`\u001a\u0010\u0012\f\u0012\n [*\u0004\u0018\u00010\u00120\u00120Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010nR\u0016\u0010s\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010XR\u0016\u0010t\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010XR \u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020v0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010wR \u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010wR\u0016\u0010{\u001a\u00020h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010jR\u001e\u0010}\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00020\u001a0\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010|¨\u0006\u007f"}, d2 = {"Lrd0/t;", "Lrd0/g$b;", "Lrd0/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "feedbackEnabled", "Lbe0/e;", "getVehicleData", "Lcom/tesla/features/FeaturesConfig;", "featuresConfig", "<init>", "(Landroid/content/Context;ZLbe0/e;Lcom/tesla/features/FeaturesConfig;)V", "Ljn0/h0;", "destroy", "()V", "start", "h", "", "values", "c", "([F)V", "f", "a", "e", "b", "", "vin", "Lvc0/m;", "requestedLevel", "", "authReasons", "Lkotlin/Pair;", "Lvc0/r;", "Lkotlin/Function0;", "Lcom/tesla/phonekeyauthengine/Logging;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lvc0/m;[Ljava/lang/String;)Lkotlin/Pair;", "Lvc0/f3;", "userPresence", "g", "(Ljava/lang/String;Lvc0/f3;)V", "w", "()Z", "B", "Lcom/tesla/logging/g;", "logger", "response", "x", "(Lcom/tesla/logging/g;Ljava/lang/String;Lvc0/m;Lvc0/r;[Ljava/lang/String;)Ljava/lang/String;", "D", "Lrd0/v;", "z", "(Ljava/lang/String;)Lrd0/v;", "Landroid/content/Context;", "Z", "Ljava/lang/String;", "instanceId", "Lcom/tesla/logging/g;", "Lrd0/f;", "Lrd0/f;", "deviceMotionDisconnectManager", "Lrd0/u;", "Lrd0/u;", "timerManager", "Lrd0/n;", "Lrd0/n;", "metadataManager", "Lrd0/g;", IntegerTokenConverter.CONVERTER_KEY, "Lrd0/g;", "deviceMotionManager", "Lrd0/l;", "j", "Lrd0/l;", "eligibilityManager", "Lcom/tesla/features/AuthConfig;", "k", "Lkotlin/Lazy;", "r", "()Lcom/tesla/features/AuthConfig;", "authRejectionConfig", "l", "featureEnabled", "m", "rejectionEnabled", "", "n", "J", "createdTimestamp", "Lwm0/b;", "kotlin.jvm.PlatformType", "o", "Lwm0/b;", "imuMovementsEvents", "p", "imuStationaryEvents", "Lam0/a;", "q", "Lam0/a;", "disposables", "Lrd0/m;", "Lrd0/m;", "state", "Ljava/util/concurrent/atomic/AtomicBoolean;", "s", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasVehiclesConnected", "Ljava/util/concurrent/atomic/AtomicLong;", "t", "Ljava/util/concurrent/atomic/AtomicLong;", "lastVehicleConnectedTimestamp", "u", "onAllVehiclesDisconnectedTimestamp", "v", "lastForegroundTimestamp", "lastBackgroundTimestamp", "Ljava/util/concurrent/ConcurrentHashMap;", "Lrd0/t$a;", "Ljava/util/concurrent/ConcurrentHashMap;", "previousAuthRequestAndResponse", "y", "responseIds", "presenceWhenDisconnectedLogged", "([Ljava/lang/String;)Ljava/lang/String;", "analyticsName", "A", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t implements rd0.g.b, rd0.h {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long B = TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean feedbackEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String instanceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final rd0.f deviceMotionDisconnectManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final u timerManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n metadataManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final rd0.g deviceMotionManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l eligibilityManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy authRejectionConfig;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean featureEnabled;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean rejectionEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long createdTimestamp;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final wm0.b<float[]> imuMovementsEvents;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final wm0.b<float[]> imuStationaryEvents;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final am0.a disposables;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final m state;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean hasVehiclesConnected;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AtomicLong lastVehicleConnectedTimestamp;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final AtomicLong onAllVehiclesDisconnectedTimestamp;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long lastForegroundTimestamp;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long lastBackgroundTimestamp;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, AuthRequestResponse> previousAuthRequestAndResponse;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, String> responseIds;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private AtomicBoolean presenceWhenDisconnectedLogged;

    /* JADX INFO: renamed from: rd0.t$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"Lrd0/t$b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isFeedbackEnabled", "Lbe0/e;", "getVehicleData", "Lcom/tesla/features/FeaturesConfig;", "featuresConfig", "Lrd0/t;", "a", "(Landroid/content/Context;ZLbe0/e;Lcom/tesla/features/FeaturesConfig;)Lrd0/t;", "", "PREVIOUS_AUTH_RESPONSE_TELEMETRY_EXPIRATION", "J", "", "MOVEMENT_FORCE_THRESHOLD", Gender.FEMALE, "MOTION_FRESH_THRESHOLD_SECONDS", "DEBUG_MOTION_FRESH_THRESHOLD_SECONDS", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(Context context, boolean isFeedbackEnabled, be0.e getVehicleData, FeaturesConfig featuresConfig) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(getVehicleData, "getVehicleData");
            p013kotlin.jvm.internal.s.k(featuresConfig, "featuresConfig");
            Context applicationContext = context.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            return new t(applicationContext, isFeedbackEnabled, getVehicleData, featuresConfig, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lrd0/t$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ARMED", "SHADOW", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        ARMED("armed"),
        SHADOW("shadow");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String value;

        c(String str) {
            this.value = str;
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f107846b;

        static {
            int[] iArr = new int[AuthorizationResult.values().length];
            try {
                iArr[AuthorizationResult.PHONE_KEY_DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthorizationResult.REJECTION_FEATURE_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthorizationResult.VEHICLE_NOT_SUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AuthorizationResult.STALE_MOTION_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AuthorizationResult.USER_PRESENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AuthorizationResult.IS_MOVING_IMU.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AuthorizationResult.IS_STATIONARY_IMU.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AuthorizationResult.NO_MOTION_DATA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f107845a = iArr;
            int[] iArr2 = new int[f3.values().length];
            try {
                iArr2[f3.VEHICLE_USER_PRESENCE_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[f3.VEHICLE_USER_PRESENCE_NOT_PRESENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[f3.VEHICLE_USER_PRESENCE_PRESENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f107846b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e<T, R> f107847a = new e<>();

        e() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final float[] apply(Throwable it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return new float[0];
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f<T> implements cm0.f {
        f() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(float[] fArr) {
            com.tesla.logging.g gVar = t.this.logger;
            p013kotlin.jvm.internal.s.h(fArr);
            gVar.j("IMU movement detected! " + p013kotlin.collections.n.R0(fArr, null, null, null, 0, null, null, 63, null));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class g<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g<T, R> f107849a = new g<>();

        g() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final float[] apply(Throwable it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return new float[0];
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class h<T> implements cm0.f {
        h() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(float[] fArr) {
            com.tesla.logging.g gVar = t.this.logger;
            p013kotlin.jvm.internal.s.h(fArr);
            gVar.j("stationary IMU event! " + p013kotlin.collections.n.R0(fArr, null, null, null, 0, null, null, 63, null));
        }
    }

    public /* synthetic */ t(Context context, boolean z11, be0.e eVar, FeaturesConfig featuresConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, z11, eVar, featuresConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 A(t tVar, String str) {
        tVar.logger.j(str + " last vehicle disconnected, unregistering device motion manager!");
        tVar.deviceMotionManager.j(tVar.context, tVar.instanceId);
        tVar.logger.j(str + " last vehicle disconnected, clearing state!");
        tVar.state.a();
        return h0.f84049a;
    }

    @SuppressLint({"CheckResult"})
    private final void B() {
        this.disposables.b(this.imuMovementsEvents.h(2L, TimeUnit.SECONDS).G(e.f107847a).N(new f()));
        this.disposables.b(this.imuStationaryEvents.U(5L, TimeUnit.MINUTES).G(g.f107849a).N(new h()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long C(t tVar) {
        return tVar.w() ? 10L : 3600L;
    }

    private final void D() {
        this.logger.j(qb0.a.INSTANCE.b().E() + " feature flag enabled: " + this.featureEnabled);
        ud0.a.b(v0.r(v0.m(x.a("type", "mobile-app-auth-engine-stats"), x.a("ignoring_battery_optimization", Boolean.valueOf(ie0.h.f77583a.b(this.context))), x.a("feedback_enabled", Boolean.valueOf(this.feedbackEnabled)), x.a("feature_enabled", Boolean.valueOf(this.featureEnabled)), x.a("feature_min_version", Integer.valueOf(r().getMinVersion())), x.a("rejection_enabled", Boolean.valueOf(this.rejectionEnabled)), x.a("v", 8)), rd0.g.INSTANCE.f(this.context)), false, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AuthConfig p(FeaturesConfig featuresConfig) {
        return featuresConfig.getAuthRejection();
    }

    private final String q(String[] strArr) {
        return p013kotlin.collections.n.T0(strArr, ",", "[", "]", 0, null, null, 56, null);
    }

    private final AuthConfig r() {
        return (AuthConfig) this.authRejectionConfig.getValue();
    }

    private static final Pair<vc0.r, wn0.a<h0>> s(vc0.r rVar, String[] strArr, com.tesla.logging.g gVar, t tVar) {
        ld0.d.d(nc0.l.AUTH_ENGINE, null, 1, null);
        v(gVar, tVar, rVar, strArr);
        return x.a(rVar, new wn0.a() { // from class: rd0.s
            @Override // wn0.a
            public final Object invoke() {
                return t.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 t() {
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final h0 u(t tVar, n0 n0Var, n0 n0Var2, String str, String[] strArr, vc0.m mVar, vc0.r rVar, AuthorizationResult authorizationResult, String str2, String str3) {
        Context context = tVar.context;
        vc0.r rVar2 = (vc0.r) n0Var.f86529a;
        c cVar = (c) n0Var2.f86529a;
        Map<String, String> mapA = tVar.metadataManager.a(str);
        Long lG = tVar.state.g();
        Long lF = tVar.state.f();
        Long lH = tVar.state.h();
        boolean z11 = tVar.feedbackEnabled;
        Long lValueOf = Long.valueOf(tVar.lastForegroundTimestamp);
        if (lValueOf.longValue() == 0) {
            lValueOf = null;
        }
        Long lValueOf2 = lValueOf != null ? Long.valueOf(a.c(lValueOf.longValue())) : null;
        Long lValueOf3 = Long.valueOf(tVar.lastBackgroundTimestamp);
        if (lValueOf3.longValue() == 0) {
            lValueOf3 = null;
        }
        Long lValueOf4 = lValueOf3 != null ? Long.valueOf(a.c(lValueOf3.longValue())) : null;
        Long lE = tVar.state.e();
        String str4 = tVar.instanceId;
        long jCurrentTimeMillis = (System.currentTimeMillis() - tVar.createdTimestamp) / ((long) 1000);
        Long lValueOf5 = Long.valueOf(tVar.deviceMotionManager.getLastImuEventTimestamp().get());
        if (lValueOf5.longValue() == 0) {
            lValueOf5 = null;
        }
        Long lValueOf6 = lValueOf5 != null ? Long.valueOf(a.c(lValueOf5.longValue())) : null;
        Long registeredTimestamp = tVar.deviceMotionManager.getRegisteredTimestamp();
        if (registeredTimestamp != null && registeredTimestamp.longValue() == 0) {
            registeredTimestamp = null;
        }
        Long lValueOf7 = registeredTimestamp != null ? Long.valueOf(a.c(registeredTimestamp.longValue())) : null;
        Long unregisteredTimestamp = tVar.deviceMotionManager.getUnregisteredTimestamp();
        if (unregisteredTimestamp != null && unregisteredTimestamp.longValue() == 0) {
            unregisteredTimestamp = null;
        }
        rd0.c.a(context, new rd0.c.Payload(cVar, strArr, str, mVar, rVar2, rVar, authorizationResult, mapA, lG, true, 8, lH, lF, z11, lValueOf2, lValueOf4, lE, str2, str4, jCurrentTimeMillis, str3, ie0.h.f77583a.b(tVar.context), lValueOf6, lValueOf7, unregisteredTimestamp != null ? Long.valueOf(a.c(unregisteredTimestamp.longValue())) : null, tVar.deviceMotionManager.g()));
        return h0.f84049a;
    }

    private static final void v(com.tesla.logging.g gVar, t tVar, vc0.r rVar, String[] strArr) {
        gVar.j("-> auth response: " + a.a(rVar.getAuthenticationLevel()) + " rejection: " + a.b(rVar.getAuthenticationRejection()) + " reasons:" + tVar.q(strArr));
    }

    private final boolean w() {
        return false;
    }

    private final String x(com.tesla.logging.g logger, String vin, vc0.m requestedLevel, vc0.r response, String[] authReasons) {
        AuthRequestResponse authRequestResponse = new AuthRequestResponse(requestedLevel, p013kotlin.collections.v.Y0(p013kotlin.collections.n.w1(authReasons)), response, 0L, 8, null);
        String str = this.responseIds.get(vin);
        AuthRequestResponse authRequestResponse2 = this.previousAuthRequestAndResponse.get(vin);
        logger.a("computing response id for " + vin + " previous: " + authRequestResponse2 + " current:" + authRequestResponse);
        this.previousAuthRequestAndResponse.put(vin, authRequestResponse);
        if (str == null || authRequestResponse2 == null) {
            String strY = y(this, vin);
            logger.a("new req/response mapping for " + vin + ", id is now " + strY);
            return strY;
        }
        if (System.currentTimeMillis() - authRequestResponse2.getTimestamp() > B) {
            String strY2 = y(this, vin);
            logger.a("previous mapping expired, rotating id to " + strY2);
            return strY2;
        }
        boolean zF = p013kotlin.jvm.internal.s.f(authRequestResponse2.getResponse(), authRequestResponse.getResponse());
        boolean zF2 = p013kotlin.jvm.internal.s.f(authRequestResponse2.a(), authRequestResponse.a());
        boolean z11 = authRequestResponse2.getRequestedLevel() == authRequestResponse.getRequestedLevel();
        if (zF && zF2 && z11) {
            logger.a("identical req/response to previous, using existing id " + str);
            return str;
        }
        String strY3 = y(this, vin);
        logger.a("different req/response to previous response:" + zF + " reasons:" + zF2 + " level:" + z11 + ", rotating id to " + strY3);
        return strY3;
    }

    private static final String y(t tVar, String str) {
        String string = UUID.randomUUID().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        tVar.responseIds.put(str, string);
        return string;
    }

    private final v z(String vin) {
        if (this.rejectionEnabled) {
            return this.eligibilityManager.a(vin) ? v.StationaryRejectionFeatureEligible : v.VehicleNotSupported;
        }
        return v.StationaryRejectionFeatureDisabled;
    }

    @Override // rd0.h
    public void a() {
        this.logger.j("application backgrounded");
        this.lastBackgroundTimestamp = System.currentTimeMillis();
    }

    @Override // rd0.h
    public void b() {
        if (this.rejectionEnabled) {
            if (this.hasVehiclesConnected.compareAndSet(true, false)) {
                this.onAllVehiclesDisconnectedTimestamp.set(System.currentTimeMillis());
            }
            if (!this.deviceMotionManager.g()) {
                this.logger.j("motion manager has never been registered with, doing nothing more.");
                return;
            }
            String string = UUID.randomUUID().toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            final String strN1 = p013kotlin.text.t.n1(string, new bo0.j(0, 6));
            this.logger.j(strN1 + " last vehicle disconnected, setting up timer to unregister IMU and clear state!");
            this.deviceMotionDisconnectManager.d(strN1, new wn0.a() { // from class: rd0.r
                @Override // wn0.a
                public final Object invoke() {
                    return t.A(this.f107814a, strN1);
                }
            }, TimeUnit.MILLISECONDS.convert(15L, TimeUnit.MINUTES));
        }
    }

    @Override // rd0.g.b
    public void c(float[] values) {
        Float fValueOf;
        p013kotlin.jvm.internal.s.k(values, "values");
        this.state.j();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                fValueOf = null;
                break;
            }
            float f11 = values[i11];
            if (Math.abs(f11) > 0.2f) {
                fValueOf = Float.valueOf(f11);
                break;
            }
            i11++;
        }
        if (fValueOf == null) {
            this.imuStationaryEvents.onNext(values);
        } else {
            this.imuMovementsEvents.onNext(values);
            this.state.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, rd0.t$c] */
    /* JADX WARN: Type inference failed for: r12v2, types: [T, rd0.t$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, vc0.r] */
    /* JADX WARN: Type inference failed for: r7v9, types: [T, vc0.r] */
    @Override // rd0.h
    public Pair<vc0.r, wn0.a<h0>> d(final String vin, final vc0.m requestedLevel, final String[] authReasons) {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        p013kotlin.jvm.internal.s.k(requestedLevel, "requestedLevel");
        p013kotlin.jvm.internal.s.k(authReasons, "authReasons");
        nc0.l lVar = nc0.l.AUTH_ENGINE;
        ld0.d.b(lVar);
        String string = UUID.randomUUID().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        final String strN1 = p013kotlin.text.t.n1(string, new bo0.j(0, 2));
        com.tesla.logging.g gVarP = this.logger.p(strN1);
        com.tesla.logging.f.f56375e.o(gVarP.getTag());
        gVarP.j("<- auth request: " + a.a(requestedLevel) + " reasons:" + q(authReasons) + ") from " + vin);
        final AuthorizationResult authorizationResultB = this.state.b(gVarP, vin, k.f107787a.a(vin), z(vin));
        ?? authenticationResponse = authorizationResultB.getAuthenticationResponse(requestedLevel);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("initial authorization result: ");
        sb2.append(authorizationResultB);
        gVarP.j(sb2.toString());
        switch (d.f107845a[authorizationResultB.ordinal()]) {
            case 1:
                gVarP.j("Phone Key disabled. NOT considering movement for authentication rejection.");
                return s(authenticationResponse, authReasons, gVarP, this);
            case 2:
                gVarP.j("Feature disabled. NOT considering movement for authentication rejection.");
                return s(authenticationResponse, authReasons, gVarP, this);
            case 3:
                gVarP.j("Vehicle not supported. NOT considering movement for authentication rejection.");
                return s(authenticationResponse, authReasons, gVarP, this);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                gVarP.j("Considering recent movement for authentication rejection...");
                final ?? authenticationResponseIncludingIMUState = authorizationResultB.getAuthenticationResponseIncludingIMUState(requestedLevel);
                final n0 n0Var = new n0();
                n0Var.f86529a = c.SHADOW;
                final n0 n0Var2 = new n0();
                n0Var2.f86529a = authenticationResponse;
                if (this.rejectionEnabled) {
                    n0Var.f86529a = c.ARMED;
                    n0Var2.f86529a = authenticationResponseIncludingIMUState;
                    gVarP.j("mode: " + n0Var.f86529a + " default response: " + a.a(authenticationResponse.getAuthenticationLevel()) + " " + a.b(authenticationResponse.getAuthenticationRejection()) + " IMU response: " + a.a(authenticationResponseIncludingIMUState.getAuthenticationLevel()) + " " + a.b(authenticationResponseIncludingIMUState.getAuthenticationRejection()));
                }
                ld0.d.d(lVar, null, 1, null);
                v(gVarP, this, (vc0.r) n0Var2.f86529a, authReasons);
                final String strX = x(gVarP, vin, requestedLevel, (vc0.r) n0Var2.f86529a, authReasons);
                return x.a(n0Var2.f86529a, new wn0.a() { // from class: rd0.q
                    @Override // wn0.a
                    public final Object invoke() {
                        return t.u(this.f107804a, n0Var2, n0Var, vin, authReasons, requestedLevel, authenticationResponseIncludingIMUState, authorizationResultB, strX, strN1);
                    }
                });
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // rd0.h
    public void destroy() {
        this.logger.j("destroying auth engine");
        this.deviceMotionDisconnectManager.c();
        this.deviceMotionManager.j(this.context, this.instanceId);
        this.disposables.f();
    }

    @Override // rd0.h
    public void e() {
        if (this.rejectionEnabled) {
            if (this.hasVehiclesConnected.compareAndSet(false, true)) {
                this.lastVehicleConnectedTimestamp.set(System.currentTimeMillis());
            }
            this.logger.j("vehicle has connected, registering device motion manager!");
            this.deviceMotionDisconnectManager.c();
            this.deviceMotionManager.h(this.context, this, this.instanceId);
        }
    }

    @Override // rd0.h
    public void f() {
        this.logger.j("application foregrounded");
        this.lastForegroundTimestamp = System.currentTimeMillis();
    }

    @Override // rd0.h
    public void g(String vin, f3 userPresence) throws Throwable {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        p013kotlin.jvm.internal.s.k(userPresence, "userPresence");
        if (!this.rejectionEnabled) {
            this.logger.a("user presence received from " + vin + " but rejection is not enabled. ignoring!");
            return;
        }
        Boolean bool = null;
        if (!this.hasVehiclesConnected.get() && !this.presenceWhenDisconnectedLogged.get()) {
            this.presenceWhenDisconnectedLogged.set(true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lValueOf = Long.valueOf(this.onAllVehiclesDisconnectedTimestamp.get());
            if (lValueOf.longValue() == 0) {
                lValueOf = null;
            }
            long jLongValue = lValueOf != null ? jCurrentTimeMillis - lValueOf.longValue() : -1L;
            Long lValueOf2 = Long.valueOf(this.lastVehicleConnectedTimestamp.get());
            if (lValueOf2.longValue() == 0) {
                lValueOf2 = null;
            }
            long jLongValue2 = lValueOf2 != null ? jCurrentTimeMillis - lValueOf2.longValue() : -1L;
            ud0.a.b(v0.m(x.a("type", "mobile-app-auth-engine-connection-user-presence"), x.a("disconnect_seconds_ago", Long.valueOf(jLongValue)), x.a("connect_seconds_ago", Long.valueOf(jLongValue2))), false, null, 4, null);
            com.tesla.logging.g gVar = this.logger;
            String str = "no vehicle connected but user presence received! last connect seconds ago: " + jLongValue2 + ". disconnect seconds ago: " + jLongValue;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
        int i11 = d.f107846b[userPresence.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                bool = Boolean.FALSE;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bool = Boolean.TRUE;
            }
        }
        this.state.m(this.logger, vin, bool);
    }

    @Override // rd0.g.b
    public void h() {
        this.state.l();
    }

    @Override // rd0.h
    @SuppressLint({"CheckResult"})
    public void start() {
        D();
    }

    private t(Context context, boolean z11, be0.e eVar, final FeaturesConfig featuresConfig) {
        this.context = context;
        this.feedbackEnabled = z11;
        String string = UUID.randomUUID().toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        String strN1 = p013kotlin.text.t.n1(string, new bo0.j(0, 3));
        this.instanceId = strN1;
        com.tesla.logging.g gVarP = com.tesla.logging.g.INSTANCE.a("AuthEngine").p(strN1);
        this.logger = gVarP;
        this.deviceMotionDisconnectManager = new rd0.f();
        this.timerManager = new u();
        this.metadataManager = new n(eVar);
        this.deviceMotionManager = new rd0.g();
        this.eligibilityManager = new l(gVarP, eVar);
        this.authRejectionConfig = jn0.m.b(new wn0.a() { // from class: rd0.o
            @Override // wn0.a
            public final Object invoke() {
                return t.p(featuresConfig);
            }
        });
        boolean z12 = r().getEnabled() && 8 >= r().getMinVersion();
        this.featureEnabled = z12;
        this.rejectionEnabled = z12;
        this.createdTimestamp = System.currentTimeMillis();
        wm0.b<float[]> bVarD0 = wm0.b.d0();
        p013kotlin.jvm.internal.s.j(bVarD0, "create(...)");
        this.imuMovementsEvents = bVarD0;
        wm0.b<float[]> bVarD1 = wm0.b.d0();
        p013kotlin.jvm.internal.s.j(bVarD1, "create(...)");
        this.imuStationaryEvents = bVarD1;
        this.disposables = new am0.a();
        com.tesla.logging.f.f56375e.o(gVarP.getTag());
        gVarP.j("Initialized auth engine! Engine version: 8 Feature config enabled: " + r().getEnabled() + ". Feature config min. version: " + r().getMinVersion() + " Rejection enabled: " + z12);
        B();
        this.state = new m(new wn0.a() { // from class: rd0.p
            @Override // wn0.a
            public final Object invoke() {
                return Long.valueOf(t.C(this.f107803a));
            }
        });
        this.hasVehiclesConnected = new AtomicBoolean(false);
        this.lastVehicleConnectedTimestamp = new AtomicLong(0L);
        this.onAllVehiclesDisconnectedTimestamp = new AtomicLong(0L);
        this.previousAuthRequestAndResponse = new ConcurrentHashMap<>();
        this.responseIds = new ConcurrentHashMap<>();
        this.presenceWhenDisconnectedLogged = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: rd0.t$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lrd0/t$a;", "", "Lvc0/m;", "requestedLevel", "", "", "authReasons", "Lvc0/r;", "response", "", "timestamp", "<init>", "(Lvc0/m;Ljava/util/List;Lvc0/r;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvc0/m;", "b", "()Lvc0/m;", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lvc0/r;", "()Lvc0/r;", DateTokenConverter.CONVERTER_KEY, "J", "()J", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class AuthRequestResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vc0.m requestedLevel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> authReasons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final vc0.r response;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        public AuthRequestResponse(vc0.m requestedLevel, List<String> authReasons, vc0.r response, long j11) {
            p013kotlin.jvm.internal.s.k(requestedLevel, "requestedLevel");
            p013kotlin.jvm.internal.s.k(authReasons, "authReasons");
            p013kotlin.jvm.internal.s.k(response, "response");
            this.requestedLevel = requestedLevel;
            this.authReasons = authReasons;
            this.response = response;
            this.timestamp = j11;
        }

        public final List<String> a() {
            return this.authReasons;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final vc0.m getRequestedLevel() {
            return this.requestedLevel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final vc0.r getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthRequestResponse)) {
                return false;
            }
            AuthRequestResponse authRequestResponse = (AuthRequestResponse) other;
            return this.requestedLevel == authRequestResponse.requestedLevel && p013kotlin.jvm.internal.s.f(this.authReasons, authRequestResponse.authReasons) && p013kotlin.jvm.internal.s.f(this.response, authRequestResponse.response) && this.timestamp == authRequestResponse.timestamp;
        }

        public int hashCode() {
            return (((((this.requestedLevel.hashCode() * 31) + this.authReasons.hashCode()) * 31) + this.response.hashCode()) * 31) + Long.hashCode(this.timestamp);
        }

        public String toString() {
            return "AuthRequestResponse(requestedLevel=" + this.requestedLevel + ", authReasons=" + this.authReasons + ", response=" + this.response + ", timestamp=" + this.timestamp + ")";
        }

        public /* synthetic */ AuthRequestResponse(vc0.m mVar, List list, vc0.r rVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(mVar, list, rVar, (i11 & 8) != 0 ? System.currentTimeMillis() : j11);
        }
    }
}
