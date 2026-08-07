package yw;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.p;
import vo0.e0;
import vo0.h1;
import vo0.j0;
import vo0.m1;
import vo0.s0;
import vo0.t;
import vo0.v1;

/* JADX INFO: renamed from: yw.h, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002!%B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b!\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b%\u0010-¨\u0006/"}, d2 = {"Lyw/h;", "", "", "sessionsEnabled", "", "sessionSamplingRate", "", "sessionTimeoutSeconds", "cacheDurationSeconds", "", "cacheUpdatedTimeSeconds", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "f", "(Lyw/h;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class SessionConfigs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean sessionsEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double sessionSamplingRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer sessionTimeoutSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer cacheDurationSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long cacheUpdatedTimeSeconds;

    /* JADX INFO: renamed from: yw.h$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/settings/SessionConfigs.$serializer", "Lvo0/e0;", "Lyw/h;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lyw/h;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lyw/h;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements e0<SessionConfigs> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f125929a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f125929a = aVar;
            m1 m1Var = new m1("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            m1Var.o("sessionsEnabled", false);
            m1Var.o("sessionSamplingRate", false);
            m1Var.o("sessionTimeoutSeconds", false);
            m1Var.o("cacheDurationSeconds", false);
            m1Var.o("cacheUpdatedTimeSeconds", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionConfigs deserialize(uo0.e decoder) {
            int i11;
            Boolean bool;
            Double d11;
            Integer num;
            Integer num2;
            Long l11;
            s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            Boolean bool2 = null;
            if (cVarB.i()) {
                Boolean bool3 = (Boolean) cVarB.v(fVar, 0, vo0.h.f119620a, null);
                Double d12 = (Double) cVarB.v(fVar, 1, t.f119690a, null);
                j0 j0Var = j0.f119632a;
                Integer num3 = (Integer) cVarB.v(fVar, 2, j0Var, null);
                bool = bool3;
                num2 = (Integer) cVarB.v(fVar, 3, j0Var, null);
                l11 = (Long) cVarB.v(fVar, 4, s0.f119686a, null);
                num = num3;
                d11 = d12;
                i11 = 31;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Double d13 = null;
                Integer num4 = null;
                Integer num5 = null;
                Long l12 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        bool2 = (Boolean) cVarB.v(fVar, 0, vo0.h.f119620a, bool2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        d13 = (Double) cVarB.v(fVar, 1, t.f119690a, d13);
                        i12 |= 2;
                    } else if (iA == 2) {
                        num4 = (Integer) cVarB.v(fVar, 2, j0.f119632a, num4);
                        i12 |= 4;
                    } else if (iA == 3) {
                        num5 = (Integer) cVarB.v(fVar, 3, j0.f119632a, num5);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        l12 = (Long) cVarB.v(fVar, 4, s0.f119686a, l12);
                        i12 |= 16;
                    }
                }
                i11 = i12;
                bool = bool2;
                d11 = d13;
                num = num4;
                num2 = num5;
                l11 = l12;
            }
            cVarB.c(fVar);
            return new SessionConfigs(i11, bool, d11, num, num2, l11, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, SessionConfigs value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            SessionConfigs.f(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            ro0.d<?> dVarP = so0.a.p(vo0.h.f119620a);
            ro0.d<?> dVarP2 = so0.a.p(t.f119690a);
            j0 j0Var = j0.f119632a;
            return new ro0.d[]{dVarP, dVarP2, so0.a.p(j0Var), so0.a.p(j0Var), so0.a.p(s0.f119686a)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: yw.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyw/h$b;", "", "<init>", "()V", "Lro0/d;", "Lyw/h;", "serializer", "()Lro0/d;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<SessionConfigs> serializer() {
            return a.f125929a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SessionConfigs(int i11, Boolean bool, Double d11, Integer num, Integer num2, Long l11, v1 v1Var) {
        if (31 != (i11 & 31)) {
            h1.b(i11, 31, a.f125929a.getDescriptor());
        }
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d11;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l11;
    }

    public static final /* synthetic */ void f(SessionConfigs self, uo0.d output, to0.f serialDesc) {
        output.y(serialDesc, 0, vo0.h.f119620a, self.sessionsEnabled);
        output.y(serialDesc, 1, t.f119690a, self.sessionSamplingRate);
        j0 j0Var = j0.f119632a;
        output.y(serialDesc, 2, j0Var, self.sessionTimeoutSeconds);
        output.y(serialDesc, 3, j0Var, self.cacheDurationSeconds);
        output.y(serialDesc, 4, s0.f119686a, self.cacheUpdatedTimeSeconds);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCacheDurationSeconds() {
        return this.cacheDurationSeconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCacheUpdatedTimeSeconds() {
        return this.cacheUpdatedTimeSeconds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getSessionTimeoutSeconds() {
        return this.sessionTimeoutSeconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getSessionsEnabled() {
        return this.sessionsEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) other;
        return s.f(this.sessionsEnabled, sessionConfigs.sessionsEnabled) && s.f(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && s.f(this.sessionTimeoutSeconds, sessionConfigs.sessionTimeoutSeconds) && s.f(this.cacheDurationSeconds, sessionConfigs.cacheDurationSeconds) && s.f(this.cacheUpdatedTimeSeconds, sessionConfigs.cacheUpdatedTimeSeconds);
    }

    public int hashCode() {
        Boolean bool = this.sessionsEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d11 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num = this.sessionTimeoutSeconds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDurationSeconds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l11 = this.cacheUpdatedTimeSeconds;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.sessionsEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionTimeoutSeconds=" + this.sessionTimeoutSeconds + ", cacheDurationSeconds=" + this.cacheDurationSeconds + ", cacheUpdatedTimeSeconds=" + this.cacheUpdatedTimeSeconds + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public SessionConfigs(Boolean bool, Double d11, Integer num, Integer num2, Long l11) {
        this.sessionsEnabled = bool;
        this.sessionSamplingRate = d11;
        this.sessionTimeoutSeconds = num;
        this.cacheDurationSeconds = num2;
        this.cacheUpdatedTimeSeconds = l11;
    }
}
