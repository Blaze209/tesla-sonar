package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.z1;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.x1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002\u001f\"BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b#\u0010&R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010 \u001a\u0004\b$\u0010\u0018\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/tesla/dashcam_viewer/x1;", "", "", "type", "sdp", "candidate", "", "sdpMLineIndex", "sdpMid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lcom/tesla/dashcam_viewer/x1;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "f", "(Ljava/lang/String;)V", "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class WebRTCUniversalSessionDescription {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String candidate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer sdpMLineIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String sdpMid;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.x1$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/WebRTCUniversalSessionDescription.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/x1;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/x1;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/x1;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<WebRTCUniversalSessionDescription> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f56143a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f56143a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.tesla.dashcam_viewer.WebRTCUniversalSessionDescription", aVar, 5);
            m1Var.o("type", true);
            m1Var.o("sdp", true);
            m1Var.o("candidate", true);
            m1Var.o("sdpMLineIndex", true);
            m1Var.o("sdpMid", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebRTCUniversalSessionDescription deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            String str3;
            Integer num;
            String str4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            String str5 = null;
            if (cVarB.i()) {
                z1 z1Var = z1.f119730a;
                String str6 = (String) cVarB.v(fVar, 0, z1Var, null);
                String str7 = (String) cVarB.v(fVar, 1, z1Var, null);
                String str8 = (String) cVarB.v(fVar, 2, z1Var, null);
                Integer num2 = (Integer) cVarB.v(fVar, 3, vo0.j0.f119632a, null);
                str4 = (String) cVarB.v(fVar, 4, z1Var, null);
                num = num2;
                i11 = 31;
                str3 = str8;
                str2 = str7;
                str = str6;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String str9 = null;
                String str10 = null;
                Integer num3 = null;
                String str11 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        str5 = (String) cVarB.v(fVar, 0, z1.f119730a, str5);
                        i12 |= 1;
                    } else if (iA == 1) {
                        str9 = (String) cVarB.v(fVar, 1, z1.f119730a, str9);
                        i12 |= 2;
                    } else if (iA == 2) {
                        str10 = (String) cVarB.v(fVar, 2, z1.f119730a, str10);
                        i12 |= 4;
                    } else if (iA == 3) {
                        num3 = (Integer) cVarB.v(fVar, 3, vo0.j0.f119632a, num3);
                        i12 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        str11 = (String) cVarB.v(fVar, 4, z1.f119730a, str11);
                        i12 |= 16;
                    }
                }
                i11 = i12;
                str = str5;
                str2 = str9;
                str3 = str10;
                num = num3;
                str4 = str11;
            }
            cVarB.c(fVar);
            return new WebRTCUniversalSessionDescription(i11, str, str2, str3, num, str4, (vo0.v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, WebRTCUniversalSessionDescription value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            WebRTCUniversalSessionDescription.g(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(vo0.j0.f119632a), so0.a.p(z1Var)};
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

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.x1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/x1$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/x1;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<WebRTCUniversalSessionDescription> serializer() {
            return a.f56143a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WebRTCUniversalSessionDescription() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void g(WebRTCUniversalSessionDescription self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.type != null) {
            output.y(serialDesc, 0, z1.f119730a, self.type);
        }
        if (output.G(serialDesc, 1) || self.sdp != null) {
            output.y(serialDesc, 1, z1.f119730a, self.sdp);
        }
        if (output.G(serialDesc, 2) || self.candidate != null) {
            output.y(serialDesc, 2, z1.f119730a, self.candidate);
        }
        if (output.G(serialDesc, 3) || self.sdpMLineIndex != null) {
            output.y(serialDesc, 3, vo0.j0.f119632a, self.sdpMLineIndex);
        }
        if (!output.G(serialDesc, 4) && self.sdpMid == null) {
            return;
        }
        output.y(serialDesc, 4, z1.f119730a, self.sdpMid);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCandidate() {
        return this.candidate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSdp() {
        return this.sdp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getSdpMLineIndex() {
        return this.sdpMLineIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSdpMid() {
        return this.sdpMid;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebRTCUniversalSessionDescription)) {
            return false;
        }
        WebRTCUniversalSessionDescription webRTCUniversalSessionDescription = (WebRTCUniversalSessionDescription) other;
        return p013kotlin.jvm.internal.s.f(this.type, webRTCUniversalSessionDescription.type) && p013kotlin.jvm.internal.s.f(this.sdp, webRTCUniversalSessionDescription.sdp) && p013kotlin.jvm.internal.s.f(this.candidate, webRTCUniversalSessionDescription.candidate) && p013kotlin.jvm.internal.s.f(this.sdpMLineIndex, webRTCUniversalSessionDescription.sdpMLineIndex) && p013kotlin.jvm.internal.s.f(this.sdpMid, webRTCUniversalSessionDescription.sdpMid);
    }

    public final void f(String str) {
        this.sdpMid = str;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.candidate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.sdpMLineIndex;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.sdpMid;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "WebRTCUniversalSessionDescription(type=" + this.type + ", sdp=" + this.sdp + ", candidate=" + this.candidate + ", sdpMLineIndex=" + this.sdpMLineIndex + ", sdpMid=" + this.sdpMid + ")";
    }

    public /* synthetic */ WebRTCUniversalSessionDescription(int i11, String str, String str2, String str3, Integer num, String str4, vo0.v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i11 & 2) == 0) {
            this.sdp = null;
        } else {
            this.sdp = str2;
        }
        if ((i11 & 4) == 0) {
            this.candidate = null;
        } else {
            this.candidate = str3;
        }
        if ((i11 & 8) == 0) {
            this.sdpMLineIndex = null;
        } else {
            this.sdpMLineIndex = num;
        }
        if ((i11 & 16) == 0) {
            this.sdpMid = null;
        } else {
            this.sdpMid = str4;
        }
    }

    public WebRTCUniversalSessionDescription(String str, String str2, String str3, Integer num, String str4) {
        this.type = str;
        this.sdp = str2;
        this.candidate = str3;
        this.sdpMLineIndex = num;
        this.sdpMid = str4;
    }

    public /* synthetic */ WebRTCUniversalSessionDescription(String str, String str2, String str3, Integer num, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str4);
    }
}
