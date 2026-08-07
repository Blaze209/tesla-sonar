package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.g2;
import vo0.m2;
import vo0.z1;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.p, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\"&BS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b+\u0010*R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b,\u0010\u001bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010-\u001a\u0004\b\"\u0010.¨\u00060"}, d2 = {"Lcom/tesla/dashcam_viewer/p;", "", "", "seen0", "Ljn0/c0;", "TimestampEpochMs", "", "City", "", "Est_lat", "Est_lon", "Reason", "Ljn0/y;", "Camera", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjn0/c0;Ljava/lang/String;DDLjava/lang/String;Ljn0/y;Lvo0/v1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lcom/tesla/dashcam_viewer/p;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "f", "()J", "b", "Ljava/lang/String;", "c", "D", "()D", DateTokenConverter.CONVERTER_KEY, "e", "B", "()B", "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class EventMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long TimestampEpochMs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String City;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double Est_lat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double Est_lon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String Reason;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte Camera;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.p$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/EventMetadata.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/p;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/p;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/p;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<EventMetadata> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f55961a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f55961a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.tesla.dashcam_viewer.EventMetadata", aVar, 6);
            m1Var.o("TimestampEpochMs", false);
            m1Var.o("City", true);
            m1Var.o("Est_lat", false);
            m1Var.o("Est_lon", false);
            m1Var.o("Reason", false);
            m1Var.o("Camera", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EventMetadata deserialize(uo0.e decoder) {
            int i11;
            jn0.c0 c0Var;
            String str;
            String str2;
            jn0.y yVar;
            double d11;
            double d12;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            int i12 = 5;
            jn0.c0 c0Var2 = null;
            if (cVarB.i()) {
                jn0.c0 c0Var3 = (jn0.c0) cVarB.n(fVar, 0, m2.f119659a, null);
                String str3 = (String) cVarB.v(fVar, 1, z1.f119730a, null);
                double dS = cVarB.s(fVar, 2);
                double dS2 = cVarB.s(fVar, 3);
                String strT = cVarB.t(fVar, 4);
                c0Var = c0Var3;
                yVar = (jn0.y) cVarB.n(fVar, 5, g2.f119618a, null);
                str2 = strT;
                i11 = 63;
                str = str3;
                d11 = dS;
                d12 = dS2;
            } else {
                boolean z11 = true;
                int i13 = 0;
                jn0.y yVar2 = null;
                double dS3 = 0.0d;
                double dS4 = 0.0d;
                String str4 = null;
                String strT2 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 5;
                            break;
                        case 0:
                            c0Var2 = (jn0.c0) cVarB.n(fVar, 0, m2.f119659a, c0Var2);
                            i13 |= 1;
                            i12 = 5;
                            break;
                        case 1:
                            str4 = (String) cVarB.v(fVar, 1, z1.f119730a, str4);
                            i13 |= 2;
                            break;
                        case 2:
                            dS3 = cVarB.s(fVar, 2);
                            i13 |= 4;
                            break;
                        case 3:
                            dS4 = cVarB.s(fVar, 3);
                            i13 |= 8;
                            break;
                        case 4:
                            strT2 = cVarB.t(fVar, 4);
                            i13 |= 16;
                            break;
                        case 5:
                            yVar2 = (jn0.y) cVarB.n(fVar, i12, g2.f119618a, yVar2);
                            i13 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                c0Var = c0Var2;
                str = str4;
                str2 = strT2;
                yVar = yVar2;
                d11 = dS3;
                d12 = dS4;
            }
            cVarB.c(fVar);
            return new EventMetadata(i11, c0Var, str, d11, d12, str2, yVar, null, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, EventMetadata value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            EventMetadata.g(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            ro0.d<?> dVarP = so0.a.p(z1Var);
            vo0.t tVar = vo0.t.f119690a;
            return new ro0.d[]{m2.f119659a, dVarP, tVar, tVar, z1Var, g2.f119618a};
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

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.p$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/p$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/p;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<EventMetadata> serializer() {
            return a.f55961a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EventMetadata(int i11, jn0.c0 c0Var, String str, double d11, double d12, String str2, jn0.y yVar, vo0.v1 v1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, c0Var, str, d11, d12, str2, yVar, v1Var);
    }

    public static final /* synthetic */ void g(EventMetadata self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, m2.f119659a, jn0.c0.a(self.TimestampEpochMs));
        if (output.G(serialDesc, 1) || self.City != null) {
            output.y(serialDesc, 1, z1.f119730a, self.City);
        }
        output.k(serialDesc, 2, self.Est_lat);
        output.k(serialDesc, 3, self.Est_lon);
        output.e(serialDesc, 4, self.Reason);
        output.D(serialDesc, 5, g2.f119618a, jn0.y.a(self.Camera));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte getCamera() {
        return this.Camera;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCity() {
        return this.City;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getEst_lat() {
        return this.Est_lat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getEst_lon() {
        return this.Est_lon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getReason() {
        return this.Reason;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return this.TimestampEpochMs == eventMetadata.TimestampEpochMs && p013kotlin.jvm.internal.s.f(this.City, eventMetadata.City) && Double.compare(this.Est_lat, eventMetadata.Est_lat) == 0 && Double.compare(this.Est_lon, eventMetadata.Est_lon) == 0 && p013kotlin.jvm.internal.s.f(this.Reason, eventMetadata.Reason) && this.Camera == eventMetadata.Camera;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTimestampEpochMs() {
        return this.TimestampEpochMs;
    }

    public int hashCode() {
        int iE = jn0.c0.e(this.TimestampEpochMs) * 31;
        String str = this.City;
        return ((((((((iE + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.Est_lat)) * 31) + Double.hashCode(this.Est_lon)) * 31) + this.Reason.hashCode()) * 31) + jn0.y.d(this.Camera);
    }

    public String toString() {
        return "EventMetadata(TimestampEpochMs=" + jn0.c0.f(this.TimestampEpochMs) + ", City=" + this.City + ", Est_lat=" + this.Est_lat + ", Est_lon=" + this.Est_lon + ", Reason=" + this.Reason + ", Camera=" + jn0.y.e(this.Camera) + ")";
    }

    private /* synthetic */ EventMetadata(int i11, jn0.c0 c0Var, String str, double d11, double d12, String str2, jn0.y yVar, vo0.v1 v1Var) {
        if (61 != (i11 & 61)) {
            vo0.h1.b(i11, 61, a.f55961a.getDescriptor());
        }
        this.TimestampEpochMs = c0Var.getData();
        if ((i11 & 2) == 0) {
            this.City = null;
        } else {
            this.City = str;
        }
        this.Est_lat = d11;
        this.Est_lon = d12;
        this.Reason = str2;
        this.Camera = yVar.getData();
    }
}
