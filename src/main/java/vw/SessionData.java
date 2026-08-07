package vw;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: vw.e0, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0002#\u0019B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b(\u0010)R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lvw/e0;", "", "Lvw/h0;", "sessionDetails", "Lvw/v0;", "backgroundTime", "", "", "Lvw/v;", "processDataMap", "<init>", "(Lvw/h0;Lvw/v0;Ljava/util/Map;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILvw/h0;Lvw/v0;Ljava/util/Map;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lvw/e0;Luo0/d;Lto0/f;)V", "b", "(Lvw/h0;Lvw/v0;Ljava/util/Map;)Lvw/e0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvw/h0;", "f", "()Lvw/h0;", "Lvw/v0;", DateTokenConverter.CONVERTER_KEY, "()Lvw/v0;", "c", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class SessionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d<Object>[] f119929d = {null, null, new vo0.m0(z1.f119730a, ProcessData.a.f120056a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SessionDetails sessionDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Time backgroundTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, ProcessData> processDataMap;

    /* JADX INFO: renamed from: vw.e0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/google/firebase/sessions/SessionData.$serializer", "Lvo0/e0;", "Lvw/e0;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lvw/e0;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lvw/e0;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<SessionData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f119933a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f119933a = aVar;
            m1 m1Var = new m1("com.google.firebase.sessions.SessionData", aVar, 3);
            m1Var.o("sessionDetails", false);
            m1Var.o("backgroundTime", true);
            m1Var.o("processDataMap", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionData deserialize(uo0.e decoder) {
            int i11;
            SessionDetails sessionDetails;
            Time time;
            Map map;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = SessionData.f119929d;
            SessionDetails sessionDetails2 = null;
            if (cVarB.i()) {
                SessionDetails sessionDetails3 = (SessionDetails) cVarB.n(fVar, 0, SessionDetails.a.f119943a, null);
                Time time2 = (Time) cVarB.v(fVar, 1, Time.a.f120060a, null);
                map = (Map) cVarB.v(fVar, 2, dVarArr[2], null);
                sessionDetails = sessionDetails3;
                i11 = 7;
                time = time2;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Time time3 = null;
                Map map2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        sessionDetails2 = (SessionDetails) cVarB.n(fVar, 0, SessionDetails.a.f119943a, sessionDetails2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        time3 = (Time) cVarB.v(fVar, 1, Time.a.f120060a, time3);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        map2 = (Map) cVarB.v(fVar, 2, dVarArr[2], map2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                sessionDetails = sessionDetails2;
                time = time3;
                map = map2;
            }
            cVarB.c(fVar);
            return new SessionData(i11, sessionDetails, time, map, (v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, SessionData value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            SessionData.g(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            return new ro0.d[]{SessionDetails.a.f119943a, so0.a.p(Time.a.f120060a), so0.a.p(SessionData.f119929d[2])};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: vw.e0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvw/e0$b;", "", "<init>", "()V", "Lro0/d;", "Lvw/e0;", "serializer", "()Lro0/d;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<SessionData> serializer() {
            return a.f119933a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SessionData(int i11, SessionDetails sessionDetails, Time time, Map map, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, a.f119933a.getDescriptor());
        }
        this.sessionDetails = sessionDetails;
        if ((i11 & 2) == 0) {
            this.backgroundTime = null;
        } else {
            this.backgroundTime = time;
        }
        if ((i11 & 4) == 0) {
            this.processDataMap = null;
        } else {
            this.processDataMap = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionData c(SessionData sessionData, SessionDetails sessionDetails, Time time, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sessionDetails = sessionData.sessionDetails;
        }
        if ((i11 & 2) != 0) {
            time = sessionData.backgroundTime;
        }
        if ((i11 & 4) != 0) {
            map = sessionData.processDataMap;
        }
        return sessionData.b(sessionDetails, time, map);
    }

    public static final /* synthetic */ void g(SessionData self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f119929d;
        output.D(serialDesc, 0, SessionDetails.a.f119943a, self.sessionDetails);
        if (output.G(serialDesc, 1) || self.backgroundTime != null) {
            output.y(serialDesc, 1, Time.a.f120060a, self.backgroundTime);
        }
        if (!output.G(serialDesc, 2) && self.processDataMap == null) {
            return;
        }
        output.y(serialDesc, 2, dVarArr[2], self.processDataMap);
    }

    public final SessionData b(SessionDetails sessionDetails, Time backgroundTime, Map<String, ProcessData> processDataMap) {
        p013kotlin.jvm.internal.s.k(sessionDetails, "sessionDetails");
        return new SessionData(sessionDetails, backgroundTime, processDataMap);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Time getBackgroundTime() {
        return this.backgroundTime;
    }

    public final Map<String, ProcessData> e() {
        return this.processDataMap;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) other;
        return p013kotlin.jvm.internal.s.f(this.sessionDetails, sessionData.sessionDetails) && p013kotlin.jvm.internal.s.f(this.backgroundTime, sessionData.backgroundTime) && p013kotlin.jvm.internal.s.f(this.processDataMap, sessionData.processDataMap);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final SessionDetails getSessionDetails() {
        return this.sessionDetails;
    }

    public int hashCode() {
        int iHashCode = this.sessionDetails.hashCode() * 31;
        Time time = this.backgroundTime;
        int iHashCode2 = (iHashCode + (time == null ? 0 : time.hashCode())) * 31;
        Map<String, ProcessData> map = this.processDataMap;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "SessionData(sessionDetails=" + this.sessionDetails + ", backgroundTime=" + this.backgroundTime + ", processDataMap=" + this.processDataMap + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public SessionData(SessionDetails sessionDetails, Time time, Map<String, ProcessData> map) {
        p013kotlin.jvm.internal.s.k(sessionDetails, "sessionDetails");
        this.sessionDetails = sessionDetails;
        this.backgroundTime = time;
        this.processDataMap = map;
    }

    public /* synthetic */ SessionData(SessionDetails sessionDetails, Time time, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionDetails, (i11 & 2) != 0 ? null : time, (i11 & 4) != 0 ? null : map);
    }
}
