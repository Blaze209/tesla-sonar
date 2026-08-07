package rd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.phonekeyauthengine.AuthorizationResult;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u00020\u000b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010,R\u0013\u00100\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00102\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0013\u00104\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0013\u00105\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010/¨\u00066"}, d2 = {"Lrd0/m;", "", "Lkotlin/Function0;", "", "getMotionActivityLookbackSeconds", "<init>", "(Lwn0/a;)V", "Lcom/tesla/logging/g;", "logger", "", "vin", "", "userPresent", "Ljn0/h0;", "m", "(Lcom/tesla/logging/g;Ljava/lang/String;Ljava/lang/Boolean;)V", "l", "()V", "k", "j", "phoneKeyEnabled", "Lrd0/v;", "eligibility", "Lcom/tesla/phonekeyauthengine/AuthorizationResult;", "b", "(Lcom/tesla/logging/g;Ljava/lang/String;ZLrd0/v;)Lcom/tesla/phonekeyauthengine/AuthorizationResult;", "a", "Lwn0/a;", "getGetMotionActivityLookbackSeconds", "()Lwn0/a;", "Ljava/lang/Long;", "imuEventOccurredTimestamp", "c", "imuMovementTimestamp", DateTokenConverter.CONVERTER_KEY, "significantMotionTimestamp", "", "Lrd0/m$a;", "e", "Ljava/util/Map;", "userPresentEvents", IntegerTokenConverter.CONVERTER_KEY, "(J)Z", "isFresh", "()Z", "hasRecentlyMoved", "g", "()Ljava/lang/Long;", "lastMovementTimeSecondsAgo", "f", "lastImuMovementSecondsAgo", "h", "lastSignificantMotionSecondsAgo", "lastImuEventSecondsAgo", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Long> getMotionActivityLookbackSeconds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Long imuEventOccurredTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Long imuMovementTimestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Long significantMotionTimestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, UserPresentEvent> userPresentEvents;

    /* JADX INFO: renamed from: rd0.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u0000 \u00062\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0019"}, d2 = {"Lrd0/m$a;", "", "", "userPresent", "<init>", "(Ljava/lang/Boolean;)V", "c", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/util/Date;", "Ljava/util/Date;", "userPresentTimestamp", "presentAndFresh", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class UserPresentEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean userPresent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Date userPresentTimestamp = new Date();

        public UserPresentEvent(Boolean bool) {
            this.userPresent = bool;
        }

        public final boolean a() {
            return p013kotlin.jvm.internal.s.f(this.userPresent, Boolean.TRUE) && !c();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getUserPresent() {
            return this.userPresent;
        }

        public final boolean c() {
            return new Date().getTime() - this.userPresentTimestamp.getTime() > 180000;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserPresentEvent) && p013kotlin.jvm.internal.s.f(this.userPresent, ((UserPresentEvent) other).userPresent);
        }

        public int hashCode() {
            Boolean bool = this.userPresent;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "UserPresentEvent(userPresent=" + this.userPresent + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f107799a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.StationaryRejectionFeatureEligible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.StationaryRejectionFeatureDisabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.VehicleNotSupported.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f107799a = iArr;
        }
    }

    public m(wn0.a<Long> getMotionActivityLookbackSeconds) {
        p013kotlin.jvm.internal.s.k(getMotionActivityLookbackSeconds, "getMotionActivityLookbackSeconds");
        this.getMotionActivityLookbackSeconds = getMotionActivityLookbackSeconds;
        this.userPresentEvents = new LinkedHashMap();
    }

    private static final synchronized AuthorizationResult c(m mVar, String str, com.tesla.logging.g gVar) {
        AuthorizationResult authorizationResult;
        try {
            if (mVar.d()) {
                authorizationResult = AuthorizationResult.IS_MOVING_IMU;
            } else {
                UserPresentEvent userPresentEvent = mVar.userPresentEvents.get(str);
                if (userPresentEvent != null && userPresentEvent.a()) {
                    authorizationResult = AuthorizationResult.USER_PRESENT;
                } else if (mVar.imuMovementTimestamp == null && mVar.significantMotionTimestamp == null) {
                    authorizationResult = AuthorizationResult.NO_MOTION_DATA;
                } else {
                    Long lE = mVar.e();
                    if ((lE != null ? lE.longValue() : 0L) > TimeUnit.SECONDS.convert(30L, TimeUnit.MINUTES)) {
                        authorizationResult = AuthorizationResult.STALE_MOTION_DATA;
                    } else if (mVar.imuMovementTimestamp != null) {
                        authorizationResult = AuthorizationResult.IS_STATIONARY_IMU;
                    } else {
                        TeslaLog teslaLog = TeslaLog.INSTANCE;
                        String tag = gVar.getTag();
                        String strG = gVar.g("no IMU timestamp but stale significant motion data, this is weird, don't trust that device is stationary.");
                        zb0.a aVar = zb0.a.f128044a;
                        Map mapF = v0.f(x.a(tag, strG));
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        for (Map.Entry entry : mapF.entrySet()) {
                            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                        }
                        firebaseCrashlytics.recordException(new Exception(strG));
                        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                        vr0.a.INSTANCE.a(strG, new Object[0]);
                        authorizationResult = AuthorizationResult.NO_MOTION_DATA;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return authorizationResult;
    }

    private final boolean d() {
        Long l11;
        Long l12 = this.imuMovementTimestamp;
        return (l12 != null && i(l12.longValue())) || ((l11 = this.significantMotionTimestamp) != null && i(l11.longValue()));
    }

    private final boolean i(long j11) {
        return TimeUnit.SECONDS.convert(System.currentTimeMillis() - j11, TimeUnit.MILLISECONDS) < this.getMotionActivityLookbackSeconds.invoke().longValue();
    }

    private static final void n(com.tesla.logging.g gVar, Boolean bool, UserPresentEvent userPresentEvent, m mVar, String str, String str2) {
        gVar.j(str2 + ": setting user present to " + bool + ", previously was " + (userPresentEvent != null ? userPresentEvent.getUserPresent() : null) + " expired:" + (userPresentEvent != null ? Boolean.valueOf(userPresentEvent.c()) : null));
        mVar.userPresentEvents.put(str, new UserPresentEvent(bool));
    }

    public final synchronized void a() {
        this.significantMotionTimestamp = null;
        this.imuMovementTimestamp = null;
        this.imuEventOccurredTimestamp = null;
        this.userPresentEvents.clear();
    }

    public final synchronized AuthorizationResult b(com.tesla.logging.g logger, String vin, boolean phoneKeyEnabled, v eligibility) {
        AuthorizationResult authorizationResultC;
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(vin, "vin");
        p013kotlin.jvm.internal.s.k(eligibility, "eligibility");
        if (!phoneKeyEnabled) {
            logger.j("Phone Key Disabled.");
            return AuthorizationResult.PHONE_KEY_DISABLED;
        }
        int i11 = b.f107799a[eligibility.ordinal()];
        if (i11 == 1) {
            authorizationResultC = c(this, vin, logger);
        } else if (i11 == 2) {
            authorizationResultC = AuthorizationResult.REJECTION_FEATURE_DISABLED;
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            authorizationResultC = AuthorizationResult.VEHICLE_NOT_SUPPORTED;
        }
        return authorizationResultC;
    }

    public final Long e() {
        synchronized (this) {
            Long l11 = this.imuEventOccurredTimestamp;
            if (l11 == null) {
                return null;
            }
            return Long.valueOf(a.c(l11.longValue()));
        }
    }

    public final Long f() {
        synchronized (this) {
            Long l11 = this.imuMovementTimestamp;
            if (l11 == null) {
                return null;
            }
            return Long.valueOf(a.c(l11.longValue()));
        }
    }

    public final Long g() {
        Long lF;
        synchronized (this) {
            lF = f();
            if (lF == null) {
                lF = h();
            }
        }
        return lF;
    }

    public final Long h() {
        synchronized (this) {
            Long l11 = this.significantMotionTimestamp;
            if (l11 == null) {
                return null;
            }
            return Long.valueOf(a.c(l11.longValue()));
        }
    }

    public final synchronized void j() {
        this.imuEventOccurredTimestamp = Long.valueOf(System.currentTimeMillis());
    }

    public final synchronized void k() {
        this.imuMovementTimestamp = Long.valueOf(System.currentTimeMillis());
    }

    public final synchronized void l() {
        this.significantMotionTimestamp = Long.valueOf(System.currentTimeMillis());
    }

    public final synchronized void m(com.tesla.logging.g logger, String vin, Boolean userPresent) throws Throwable {
        Throwable th2;
        try {
            try {
                p013kotlin.jvm.internal.s.k(logger, "logger");
                p013kotlin.jvm.internal.s.k(vin, "vin");
                UserPresentEvent userPresentEvent = this.userPresentEvents.get(vin);
                if (p013kotlin.jvm.internal.s.f(userPresent, Boolean.TRUE)) {
                    try {
                        if (d()) {
                            n(logger, userPresent, userPresentEvent, this, vin, "fresh recent movement");
                        } else if (userPresentEvent == null || !userPresentEvent.a()) {
                            logger.j("NOT setting user present because recent movement isn't fresh and no prior user presence exists or is fresh.");
                        } else {
                            n(logger, userPresent, userPresentEvent, this, vin, "fresh previous user presence");
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    n(logger, userPresent, userPresentEvent, this, vin, "non user present");
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }
}
