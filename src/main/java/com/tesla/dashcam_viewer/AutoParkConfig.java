package com.tesla.dashcam_viewer;

import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002\u0012 B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"Lcom/tesla/dashcam_viewer/c;", "", "", "heartbeat_frequency", "autopark_pause_timeout", "autopark_stop_timeout", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/tesla/dashcam_viewer/c;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getHeartbeat_frequency", "()Ljava/lang/Integer;", "b", "getAutopark_pause_timeout", "c", "getAutopark_stop_timeout", "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class AutoParkConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer heartbeat_frequency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer autopark_pause_timeout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer autopark_stop_timeout;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.c$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/AutoParkConfig.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/c;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/c;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/c;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<AutoParkConfig> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55781a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f55781a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.tesla.dashcam_viewer.AutoParkConfig", aVar, 3);
            m1Var.o("heartbeat_frequency", true);
            m1Var.o("autopark_pause_timeout", true);
            m1Var.o("autopark_stop_timeout", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AutoParkConfig deserialize(uo0.e decoder) {
            int i11;
            Integer num;
            Integer num2;
            Integer num3;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            Integer num4 = null;
            if (cVarB.i()) {
                vo0.j0 j0Var = vo0.j0.f119632a;
                Integer num5 = (Integer) cVarB.v(fVar, 0, j0Var, null);
                Integer num6 = (Integer) cVarB.v(fVar, 1, j0Var, null);
                num3 = (Integer) cVarB.v(fVar, 2, j0Var, null);
                i11 = 7;
                num2 = num6;
                num = num5;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Integer num7 = null;
                Integer num8 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        num4 = (Integer) cVarB.v(fVar, 0, vo0.j0.f119632a, num4);
                        i12 |= 1;
                    } else if (iA == 1) {
                        num7 = (Integer) cVarB.v(fVar, 1, vo0.j0.f119632a, num7);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        num8 = (Integer) cVarB.v(fVar, 2, vo0.j0.f119632a, num8);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                num = num4;
                num2 = num7;
                num3 = num8;
            }
            cVarB.c(fVar);
            return new AutoParkConfig(i11, num, num2, num3, (vo0.v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, AutoParkConfig value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            AutoParkConfig.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            vo0.j0 j0Var = vo0.j0.f119632a;
            return new ro0.d[]{so0.a.p(j0Var), so0.a.p(j0Var), so0.a.p(j0Var)};
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

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/c$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/c;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<AutoParkConfig> serializer() {
            return a.f55781a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AutoParkConfig() {
        this((Integer) null, (Integer) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void a(AutoParkConfig self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.heartbeat_frequency != null) {
            output.y(serialDesc, 0, vo0.j0.f119632a, self.heartbeat_frequency);
        }
        if (output.G(serialDesc, 1) || self.autopark_pause_timeout != null) {
            output.y(serialDesc, 1, vo0.j0.f119632a, self.autopark_pause_timeout);
        }
        if (!output.G(serialDesc, 2) && self.autopark_stop_timeout == null) {
            return;
        }
        output.y(serialDesc, 2, vo0.j0.f119632a, self.autopark_stop_timeout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoParkConfig)) {
            return false;
        }
        AutoParkConfig autoParkConfig = (AutoParkConfig) other;
        return p013kotlin.jvm.internal.s.f(this.heartbeat_frequency, autoParkConfig.heartbeat_frequency) && p013kotlin.jvm.internal.s.f(this.autopark_pause_timeout, autoParkConfig.autopark_pause_timeout) && p013kotlin.jvm.internal.s.f(this.autopark_stop_timeout, autoParkConfig.autopark_stop_timeout);
    }

    public int hashCode() {
        Integer num = this.heartbeat_frequency;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.autopark_pause_timeout;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.autopark_stop_timeout;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "AutoParkConfig(heartbeat_frequency=" + this.heartbeat_frequency + ", autopark_pause_timeout=" + this.autopark_pause_timeout + ", autopark_stop_timeout=" + this.autopark_stop_timeout + ")";
    }

    public /* synthetic */ AutoParkConfig(int i11, Integer num, Integer num2, Integer num3, vo0.v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.heartbeat_frequency = null;
        } else {
            this.heartbeat_frequency = num;
        }
        if ((i11 & 2) == 0) {
            this.autopark_pause_timeout = null;
        } else {
            this.autopark_pause_timeout = num2;
        }
        if ((i11 & 4) == 0) {
            this.autopark_stop_timeout = null;
        } else {
            this.autopark_stop_timeout = num3;
        }
    }

    public AutoParkConfig(Integer num, Integer num2, Integer num3) {
        this.heartbeat_frequency = num;
        this.autopark_pause_timeout = num2;
        this.autopark_stop_timeout = num3;
    }

    public /* synthetic */ AutoParkConfig(Integer num, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3);
    }
}
