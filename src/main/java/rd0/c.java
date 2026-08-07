package rd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Address;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.tesla.phonekeyauthengine.AuthorizationResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrd0/c;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lrd0/c$a;", StatusResponse.PAYLOAD, "Ljn0/h0;", "a", "(Landroid/content/Context;Lrd0/c$a;)V", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f107733a = new c();

    /* JADX INFO: renamed from: rd0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\bP\b\u0086\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0013\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010%\u001a\u00020\u0013¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b5\u0010-J\u0010\u00106\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010;\u001a\u0004\b<\u0010)R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010=\u001a\u0004\b>\u0010+R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\b@\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010A\u001a\u0004\bB\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u0010C\u001a\u0004\bD\u00101R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u0010C\u001a\u0004\bE\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b3\u0010F\u001a\u0004\bG\u00104R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u00107R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bW\u0010M\u001a\u0004\bX\u0010OR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bY\u0010M\u001a\u0004\bZ\u0010OR\u0017\u0010\u0019\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b[\u0010Q\u001a\u0004\b[\u0010SR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\\\u0010M\u001a\u0004\b]\u0010OR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b^\u0010M\u001a\u0004\b_\u0010OR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b_\u0010M\u001a\u0004\b`\u0010OR\u0017\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b]\u0010?\u001a\u0004\ba\u0010-R\u0017\u0010\u001e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b`\u0010?\u001a\u0004\bH\u0010-R\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bZ\u0010b\u001a\u0004\bY\u0010cR\u0017\u0010 \u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bN\u0010?\u001a\u0004\bL\u0010-R\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bX\u0010Q\u001a\u0004\b\\\u0010SR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bJ\u0010M\u001a\u0004\bP\u0010OR\u0019\u0010#\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\ba\u0010M\u001a\u0004\bT\u0010OR\u0019\u0010$\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bV\u0010M\u001a\u0004\bW\u0010OR\u0017\u0010%\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bd\u0010Q\u001a\u0004\b^\u0010S¨\u0006e"}, d2 = {"Lrd0/c$a;", "", "Lrd0/t$c;", "mode", "", "", "authReasons", "vin", "Lvc0/m;", "requestedLevel", "Lvc0/r;", "response", "imuResponse", "Lcom/tesla/phonekeyauthengine/AuthorizationResult;", "authorizationResult", "", OrcaKeys.METADATA, "", "lastMovementSecondsAgo", "", "includeTeslaEmail", "", "version", "lastSignificantMotionSecondsAgo", "lastImuMovementSecondsAgo", "feedbackEnabled", "lastForegroundSecondsAgo", "lastBackgroundSecondsAgo", "lastImuEventSecondsAgo", "responseId", "authEngineInstanceId", "engineAgeSeconds", "authRequestInstanceId", "ignoringBatteryOptimization", "deviceMotionLastImuEventSecondsAgo", "deviceMotionManagerRegisteredSecondsAgo", "deviceMotionManagerUnregisteredSecondsAgo", "imuRegistered", "<init>", "(Lrd0/t$c;[Ljava/lang/String;Ljava/lang/String;Lvc0/m;Lvc0/r;Lvc0/r;Lcom/tesla/phonekeyauthengine/AuthorizationResult;Ljava/util/Map;Ljava/lang/Long;ZILjava/lang/Long;Ljava/lang/Long;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Z)V", "a", "()Lrd0/t$c;", "b", "()[Ljava/lang/String;", "c", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/m;", "e", "()Lvc0/r;", "f", "g", "()Lcom/tesla/phonekeyauthengine/AuthorizationResult;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrd0/t$c;", "getMode", "[Ljava/lang/String;", "getAuthReasons", "Ljava/lang/String;", "getVin", "Lvc0/m;", "getRequestedLevel", "Lvc0/r;", "getResponse", "getImuResponse", "Lcom/tesla/phonekeyauthengine/AuthorizationResult;", "getAuthorizationResult", "h", "Ljava/util/Map;", "w", "()Ljava/util/Map;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "u", "()Ljava/lang/Long;", "j", "Z", "getIncludeTeslaEmail", "()Z", "k", "I", "y", "l", "v", "m", "t", "n", "o", "r", "p", "q", "s", "x", "J", "()J", "z", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Payload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final t.c mode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String[] authReasons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final vc0.m requestedLevel;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final vc0.r response;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final vc0.r imuResponse;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final AuthorizationResult authorizationResult;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> metadata;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long lastMovementSecondsAgo;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean includeTeslaEmail;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final int version;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long lastSignificantMotionSecondsAgo;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long lastImuMovementSecondsAgo;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean feedbackEnabled;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long lastForegroundSecondsAgo;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long lastBackgroundSecondsAgo;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long lastImuEventSecondsAgo;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final String responseId;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authEngineInstanceId;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final long engineAgeSeconds;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authRequestInstanceId;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean ignoringBatteryOptimization;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long deviceMotionLastImuEventSecondsAgo;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long deviceMotionManagerRegisteredSecondsAgo;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long deviceMotionManagerUnregisteredSecondsAgo;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean imuRegistered;

        public Payload(t.c mode, String[] authReasons, String vin, vc0.m requestedLevel, vc0.r response, vc0.r imuResponse, AuthorizationResult authorizationResult, Map<String, String> metadata, Long l11, boolean z11, int i11, Long l12, Long l13, boolean z12, Long l14, Long l15, Long l16, String responseId, String authEngineInstanceId, long j11, String authRequestInstanceId, boolean z13, Long l17, Long l18, Long l19, boolean z14) {
            p013kotlin.jvm.internal.s.k(mode, "mode");
            p013kotlin.jvm.internal.s.k(authReasons, "authReasons");
            p013kotlin.jvm.internal.s.k(vin, "vin");
            p013kotlin.jvm.internal.s.k(requestedLevel, "requestedLevel");
            p013kotlin.jvm.internal.s.k(response, "response");
            p013kotlin.jvm.internal.s.k(imuResponse, "imuResponse");
            p013kotlin.jvm.internal.s.k(authorizationResult, "authorizationResult");
            p013kotlin.jvm.internal.s.k(metadata, "metadata");
            p013kotlin.jvm.internal.s.k(responseId, "responseId");
            p013kotlin.jvm.internal.s.k(authEngineInstanceId, "authEngineInstanceId");
            p013kotlin.jvm.internal.s.k(authRequestInstanceId, "authRequestInstanceId");
            this.mode = mode;
            this.authReasons = authReasons;
            this.vin = vin;
            this.requestedLevel = requestedLevel;
            this.response = response;
            this.imuResponse = imuResponse;
            this.authorizationResult = authorizationResult;
            this.metadata = metadata;
            this.lastMovementSecondsAgo = l11;
            this.includeTeslaEmail = z11;
            this.version = i11;
            this.lastSignificantMotionSecondsAgo = l12;
            this.lastImuMovementSecondsAgo = l13;
            this.feedbackEnabled = z12;
            this.lastForegroundSecondsAgo = l14;
            this.lastBackgroundSecondsAgo = l15;
            this.lastImuEventSecondsAgo = l16;
            this.responseId = responseId;
            this.authEngineInstanceId = authEngineInstanceId;
            this.engineAgeSeconds = j11;
            this.authRequestInstanceId = authRequestInstanceId;
            this.ignoringBatteryOptimization = z13;
            this.deviceMotionLastImuEventSecondsAgo = l17;
            this.deviceMotionManagerRegisteredSecondsAgo = l18;
            this.deviceMotionManagerUnregisteredSecondsAgo = l19;
            this.imuRegistered = z14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final t.c getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String[] getAuthReasons() {
            return this.authReasons;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getVin() {
            return this.vin;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final vc0.m getRequestedLevel() {
            return this.requestedLevel;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final vc0.r getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return this.mode == payload.mode && p013kotlin.jvm.internal.s.f(this.authReasons, payload.authReasons) && p013kotlin.jvm.internal.s.f(this.vin, payload.vin) && this.requestedLevel == payload.requestedLevel && p013kotlin.jvm.internal.s.f(this.response, payload.response) && p013kotlin.jvm.internal.s.f(this.imuResponse, payload.imuResponse) && this.authorizationResult == payload.authorizationResult && p013kotlin.jvm.internal.s.f(this.metadata, payload.metadata) && p013kotlin.jvm.internal.s.f(this.lastMovementSecondsAgo, payload.lastMovementSecondsAgo) && this.includeTeslaEmail == payload.includeTeslaEmail && this.version == payload.version && p013kotlin.jvm.internal.s.f(this.lastSignificantMotionSecondsAgo, payload.lastSignificantMotionSecondsAgo) && p013kotlin.jvm.internal.s.f(this.lastImuMovementSecondsAgo, payload.lastImuMovementSecondsAgo) && this.feedbackEnabled == payload.feedbackEnabled && p013kotlin.jvm.internal.s.f(this.lastForegroundSecondsAgo, payload.lastForegroundSecondsAgo) && p013kotlin.jvm.internal.s.f(this.lastBackgroundSecondsAgo, payload.lastBackgroundSecondsAgo) && p013kotlin.jvm.internal.s.f(this.lastImuEventSecondsAgo, payload.lastImuEventSecondsAgo) && p013kotlin.jvm.internal.s.f(this.responseId, payload.responseId) && p013kotlin.jvm.internal.s.f(this.authEngineInstanceId, payload.authEngineInstanceId) && this.engineAgeSeconds == payload.engineAgeSeconds && p013kotlin.jvm.internal.s.f(this.authRequestInstanceId, payload.authRequestInstanceId) && this.ignoringBatteryOptimization == payload.ignoringBatteryOptimization && p013kotlin.jvm.internal.s.f(this.deviceMotionLastImuEventSecondsAgo, payload.deviceMotionLastImuEventSecondsAgo) && p013kotlin.jvm.internal.s.f(this.deviceMotionManagerRegisteredSecondsAgo, payload.deviceMotionManagerRegisteredSecondsAgo) && p013kotlin.jvm.internal.s.f(this.deviceMotionManagerUnregisteredSecondsAgo, payload.deviceMotionManagerUnregisteredSecondsAgo) && this.imuRegistered == payload.imuRegistered;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final vc0.r getImuResponse() {
            return this.imuResponse;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final AuthorizationResult getAuthorizationResult() {
            return this.authorizationResult;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getAuthEngineInstanceId() {
            return this.authEngineInstanceId;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.mode.hashCode() * 31) + Arrays.hashCode(this.authReasons)) * 31) + this.vin.hashCode()) * 31) + this.requestedLevel.hashCode()) * 31) + this.response.hashCode()) * 31) + this.imuResponse.hashCode()) * 31) + this.authorizationResult.hashCode()) * 31) + this.metadata.hashCode()) * 31;
            Long l11 = this.lastMovementSecondsAgo;
            int iHashCode2 = (((((iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + Boolean.hashCode(this.includeTeslaEmail)) * 31) + Integer.hashCode(this.version)) * 31;
            Long l12 = this.lastSignificantMotionSecondsAgo;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.lastImuMovementSecondsAgo;
            int iHashCode4 = (((iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31) + Boolean.hashCode(this.feedbackEnabled)) * 31;
            Long l14 = this.lastForegroundSecondsAgo;
            int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.lastBackgroundSecondsAgo;
            int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.lastImuEventSecondsAgo;
            int iHashCode7 = (((((((((((iHashCode6 + (l16 == null ? 0 : l16.hashCode())) * 31) + this.responseId.hashCode()) * 31) + this.authEngineInstanceId.hashCode()) * 31) + Long.hashCode(this.engineAgeSeconds)) * 31) + this.authRequestInstanceId.hashCode()) * 31) + Boolean.hashCode(this.ignoringBatteryOptimization)) * 31;
            Long l17 = this.deviceMotionLastImuEventSecondsAgo;
            int iHashCode8 = (iHashCode7 + (l17 == null ? 0 : l17.hashCode())) * 31;
            Long l18 = this.deviceMotionManagerRegisteredSecondsAgo;
            int iHashCode9 = (iHashCode8 + (l18 == null ? 0 : l18.hashCode())) * 31;
            Long l19 = this.deviceMotionManagerUnregisteredSecondsAgo;
            return ((iHashCode9 + (l19 != null ? l19.hashCode() : 0)) * 31) + Boolean.hashCode(this.imuRegistered);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getAuthRequestInstanceId() {
            return this.authRequestInstanceId;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Long getDeviceMotionLastImuEventSecondsAgo() {
            return this.deviceMotionLastImuEventSecondsAgo;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Long getDeviceMotionManagerRegisteredSecondsAgo() {
            return this.deviceMotionManagerRegisteredSecondsAgo;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Long getDeviceMotionManagerUnregisteredSecondsAgo() {
            return this.deviceMotionManagerUnregisteredSecondsAgo;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final long getEngineAgeSeconds() {
            return this.engineAgeSeconds;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getFeedbackEnabled() {
            return this.feedbackEnabled;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getIgnoringBatteryOptimization() {
            return this.ignoringBatteryOptimization;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getImuRegistered() {
            return this.imuRegistered;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final Long getLastBackgroundSecondsAgo() {
            return this.lastBackgroundSecondsAgo;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final Long getLastForegroundSecondsAgo() {
            return this.lastForegroundSecondsAgo;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final Long getLastImuEventSecondsAgo() {
            return this.lastImuEventSecondsAgo;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final Long getLastImuMovementSecondsAgo() {
            return this.lastImuMovementSecondsAgo;
        }

        public String toString() {
            return "Payload(mode=" + this.mode + ", authReasons=" + Arrays.toString(this.authReasons) + ", vin=" + this.vin + ", requestedLevel=" + this.requestedLevel + ", response=" + this.response + ", imuResponse=" + this.imuResponse + ", authorizationResult=" + this.authorizationResult + ", metadata=" + this.metadata + ", lastMovementSecondsAgo=" + this.lastMovementSecondsAgo + ", includeTeslaEmail=" + this.includeTeslaEmail + ", version=" + this.version + ", lastSignificantMotionSecondsAgo=" + this.lastSignificantMotionSecondsAgo + ", lastImuMovementSecondsAgo=" + this.lastImuMovementSecondsAgo + ", feedbackEnabled=" + this.feedbackEnabled + ", lastForegroundSecondsAgo=" + this.lastForegroundSecondsAgo + ", lastBackgroundSecondsAgo=" + this.lastBackgroundSecondsAgo + ", lastImuEventSecondsAgo=" + this.lastImuEventSecondsAgo + ", responseId=" + this.responseId + ", authEngineInstanceId=" + this.authEngineInstanceId + ", engineAgeSeconds=" + this.engineAgeSeconds + ", authRequestInstanceId=" + this.authRequestInstanceId + ", ignoringBatteryOptimization=" + this.ignoringBatteryOptimization + ", deviceMotionLastImuEventSecondsAgo=" + this.deviceMotionLastImuEventSecondsAgo + ", deviceMotionManagerRegisteredSecondsAgo=" + this.deviceMotionManagerRegisteredSecondsAgo + ", deviceMotionManagerUnregisteredSecondsAgo=" + this.deviceMotionManagerUnregisteredSecondsAgo + ", imuRegistered=" + this.imuRegistered + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final Long getLastMovementSecondsAgo() {
            return this.lastMovementSecondsAgo;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final Long getLastSignificantMotionSecondsAgo() {
            return this.lastSignificantMotionSecondsAgo;
        }

        public final Map<String, String> w() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getResponseId() {
            return this.responseId;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final int getVersion() {
            return this.version;
        }
    }

    private c() {
    }

    public static final void a(Context context, Payload payload) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(payload, "payload");
        t.c mode = payload.getMode();
        String[] authReasons = payload.getAuthReasons();
        String vin = payload.getVin();
        vc0.m requestedLevel = payload.getRequestedLevel();
        vc0.r response = payload.getResponse();
        vc0.r imuResponse = payload.getImuResponse();
        AuthorizationResult authorizationResult = payload.getAuthorizationResult();
        Map mapD = v0.D(g.INSTANCE.c(context));
        boolean feedbackEnabled = payload.getFeedbackEnabled();
        mapD.put("v", Integer.valueOf(payload.getVersion()));
        mapD.put("engine_instance_id", payload.getAuthEngineInstanceId());
        mapD.put("engine_age_seconds", Long.valueOf(payload.getEngineAgeSeconds()));
        mapD.put("type", "mobile-app-authorization-telemetry");
        ArrayList arrayList = new ArrayList(authReasons.length);
        for (String str : authReasons) {
            arrayList.add(str);
        }
        mapD.put("reasons", arrayList);
        mapD.put("auth_request_instance_id", payload.getAuthRequestInstanceId());
        mapD.put("ignoring_battery_optimization", Boolean.valueOf(payload.getIgnoringBatteryOptimization()));
        Object deviceMotionManagerRegisteredSecondsAgo = payload.getDeviceMotionManagerRegisteredSecondsAgo();
        Object obj = Address.ADDRESS_NULL_PLACEHOLDER;
        if (deviceMotionManagerRegisteredSecondsAgo == null) {
            deviceMotionManagerRegisteredSecondsAgo = Address.ADDRESS_NULL_PLACEHOLDER;
        }
        mapD.put("imu_registered_seconds_ago", deviceMotionManagerRegisteredSecondsAgo);
        Object deviceMotionManagerUnregisteredSecondsAgo = payload.getDeviceMotionManagerUnregisteredSecondsAgo();
        if (deviceMotionManagerUnregisteredSecondsAgo != null) {
            obj = deviceMotionManagerUnregisteredSecondsAgo;
        }
        mapD.put("imu_unregistered_seconds_ago", obj);
        mapD.put("imu_registered", Boolean.valueOf(payload.getImuRegistered()));
        if (feedbackEnabled) {
            mapD.put("vin", vin);
        }
        mapD.put("requested_level", a.a(requestedLevel));
        mapD.put("response_level", a.a(response.getAuthenticationLevel()));
        mapD.put("response_rejection", a.b(response.getAuthenticationRejection()));
        mapD.put("authorization_result", authorizationResult.getAnalyticsName());
        mapD.put("imu_response_level", a.a(imuResponse.getAuthenticationLevel()));
        mapD.put("imu_response_rejection", a.b(imuResponse.getAuthenticationRejection()));
        mapD.put("mode", mode.getValue());
        for (Map.Entry<String, String> entry : payload.w().entrySet()) {
            mapD.put(entry.getKey(), entry.getValue());
        }
        Long lastMovementSecondsAgo = payload.getLastMovementSecondsAgo();
        if (lastMovementSecondsAgo != null) {
            mapD.put("last_movement_seconds_ago", Long.valueOf(lastMovementSecondsAgo.longValue()));
        }
        mapD.put("include_tesla_email", Boolean.TRUE);
        Long lastImuMovementSecondsAgo = payload.getLastImuMovementSecondsAgo();
        if (lastImuMovementSecondsAgo != null) {
            mapD.put("last_imu_movement_seconds_ago", Long.valueOf(lastImuMovementSecondsAgo.longValue()));
        }
        Long deviceMotionLastImuEventSecondsAgo = payload.getDeviceMotionLastImuEventSecondsAgo();
        if (deviceMotionLastImuEventSecondsAgo != null) {
            mapD.put("device_motion_last_imu_event_seconds_ago", Long.valueOf(deviceMotionLastImuEventSecondsAgo.longValue()));
        }
        Long lastSignificantMotionSecondsAgo = payload.getLastSignificantMotionSecondsAgo();
        if (lastSignificantMotionSecondsAgo != null) {
            mapD.put("last_significant_motion_seconds_ago", Long.valueOf(lastSignificantMotionSecondsAgo.longValue()));
        }
        Long lastForegroundSecondsAgo = payload.getLastForegroundSecondsAgo();
        if (lastForegroundSecondsAgo != null) {
            mapD.put("last_foreground_seconds_ago", Long.valueOf(lastForegroundSecondsAgo.longValue()));
        }
        Long lastBackgroundSecondsAgo = payload.getLastBackgroundSecondsAgo();
        if (lastBackgroundSecondsAgo != null) {
            mapD.put("last_background_seconds_ago", Long.valueOf(lastBackgroundSecondsAgo.longValue()));
        }
        Long lastImuEventSecondsAgo = payload.getLastImuEventSecondsAgo();
        if (lastImuEventSecondsAgo != null) {
            mapD.put("last_imu_event_seconds_ago", Long.valueOf(lastImuEventSecondsAgo.longValue()));
        }
        mapD.put("response_id", payload.getResponseId());
        mapD.put("feedback_enabled", Boolean.valueOf(feedbackEnabled));
        ud0.a.b(mapD, false, null, 4, null);
    }
}
