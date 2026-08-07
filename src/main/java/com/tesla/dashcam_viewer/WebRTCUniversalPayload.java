package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.z1;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.w1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0002#%Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b&\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b/\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b#\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b+\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b'\u0010\u001d¨\u00065"}, d2 = {"Lcom/tesla/dashcam_viewer/w1;", "", "", "msg_type", "uid", "", "type", "Lcom/tesla/dashcam_viewer/x1;", "session_description", "v", "", "data_limit_reached", "rejected", AnalyticsAttribute.Reason, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/tesla/dashcam_viewer/x1;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/tesla/dashcam_viewer/x1;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "f", "(Lcom/tesla/dashcam_viewer/w1;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getUid", "c", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/dashcam_viewer/x1;", "e", "()Lcom/tesla/dashcam_viewer/x1;", "getV", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "h", "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class WebRTCUniversalPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String msg_type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final WebRTCUniversalSessionDescription session_description;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer v;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean data_limit_reached;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean rejected;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reason;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.w1$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/WebRTCUniversalPayload.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/w1;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/w1;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/w1;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<WebRTCUniversalPayload> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f56131a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f56131a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.tesla.dashcam_viewer.WebRTCUniversalPayload", aVar, 8);
            m1Var.o("msg_type", false);
            m1Var.o("uid", true);
            m1Var.o("type", true);
            m1Var.o("session_description", true);
            m1Var.o("v", true);
            m1Var.o("data_limit_reached", true);
            m1Var.o("rejected", true);
            m1Var.o(AnalyticsAttribute.Reason, true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebRTCUniversalPayload deserialize(uo0.e decoder) {
            int i11;
            String str;
            Boolean bool;
            Boolean bool2;
            String str2;
            String str3;
            Integer num;
            WebRTCUniversalSessionDescription webRTCUniversalSessionDescription;
            Integer num2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            int i12 = 7;
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(fVar, 0);
                z1 z1Var = z1.f119730a;
                String str4 = (String) cVarB.v(fVar, 1, z1Var, null);
                vo0.j0 j0Var = vo0.j0.f119632a;
                Integer num3 = (Integer) cVarB.v(fVar, 2, j0Var, null);
                WebRTCUniversalSessionDescription webRTCUniversalSessionDescription2 = (WebRTCUniversalSessionDescription) cVarB.v(fVar, 3, WebRTCUniversalSessionDescription.a.f56143a, null);
                Integer num4 = (Integer) cVarB.v(fVar, 4, j0Var, null);
                vo0.h hVar = vo0.h.f119620a;
                Boolean bool3 = (Boolean) cVarB.v(fVar, 5, hVar, null);
                Boolean bool4 = (Boolean) cVarB.v(fVar, 6, hVar, null);
                str2 = strT2;
                str = (String) cVarB.v(fVar, 7, z1Var, null);
                bool = bool4;
                bool2 = bool3;
                webRTCUniversalSessionDescription = webRTCUniversalSessionDescription2;
                num2 = num4;
                num = num3;
                str3 = str4;
                i11 = 255;
            } else {
                boolean z11 = true;
                int i13 = 0;
                String str5 = null;
                Boolean bool5 = null;
                Boolean bool6 = null;
                String str6 = null;
                Integer num5 = null;
                WebRTCUniversalSessionDescription webRTCUniversalSessionDescription3 = null;
                Integer num6 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            strT = cVarB.t(fVar, 0);
                            i13 |= 1;
                            i12 = 7;
                            break;
                        case 1:
                            str6 = (String) cVarB.v(fVar, 1, z1.f119730a, str6);
                            i13 |= 2;
                            i12 = 7;
                            break;
                        case 2:
                            num5 = (Integer) cVarB.v(fVar, 2, vo0.j0.f119632a, num5);
                            i13 |= 4;
                            i12 = 7;
                            break;
                        case 3:
                            webRTCUniversalSessionDescription3 = (WebRTCUniversalSessionDescription) cVarB.v(fVar, 3, WebRTCUniversalSessionDescription.a.f56143a, webRTCUniversalSessionDescription3);
                            i13 |= 8;
                            i12 = 7;
                            break;
                        case 4:
                            num6 = (Integer) cVarB.v(fVar, 4, vo0.j0.f119632a, num6);
                            i13 |= 16;
                            break;
                        case 5:
                            bool6 = (Boolean) cVarB.v(fVar, 5, vo0.h.f119620a, bool6);
                            i13 |= 32;
                            break;
                        case 6:
                            bool5 = (Boolean) cVarB.v(fVar, 6, vo0.h.f119620a, bool5);
                            i13 |= 64;
                            break;
                        case 7:
                            str5 = (String) cVarB.v(fVar, i12, z1.f119730a, str5);
                            i13 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                str = str5;
                bool = bool5;
                bool2 = bool6;
                str2 = strT;
                str3 = str6;
                num = num5;
                webRTCUniversalSessionDescription = webRTCUniversalSessionDescription3;
                num2 = num6;
            }
            cVarB.c(fVar);
            return new WebRTCUniversalPayload(i11, str2, str3, num, webRTCUniversalSessionDescription, num2, bool2, bool, str, (vo0.v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, WebRTCUniversalPayload value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            WebRTCUniversalPayload.f(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            ro0.d<?> dVarP = so0.a.p(z1Var);
            vo0.j0 j0Var = vo0.j0.f119632a;
            ro0.d<?> dVarP2 = so0.a.p(j0Var);
            ro0.d<?> dVarP3 = so0.a.p(WebRTCUniversalSessionDescription.a.f56143a);
            ro0.d<?> dVarP4 = so0.a.p(j0Var);
            vo0.h hVar = vo0.h.f119620a;
            return new ro0.d[]{z1Var, dVarP, dVarP2, dVarP3, dVarP4, so0.a.p(hVar), so0.a.p(hVar), so0.a.p(z1Var)};
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

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.w1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/w1$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/w1;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<WebRTCUniversalPayload> serializer() {
            return a.f56131a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WebRTCUniversalPayload(int i11, String str, String str2, Integer num, WebRTCUniversalSessionDescription webRTCUniversalSessionDescription, Integer num2, Boolean bool, Boolean bool2, String str3, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f56131a.getDescriptor());
        }
        this.msg_type = str;
        if ((i11 & 2) == 0) {
            this.uid = null;
        } else {
            this.uid = str2;
        }
        if ((i11 & 4) == 0) {
            this.type = null;
        } else {
            this.type = num;
        }
        if ((i11 & 8) == 0) {
            this.session_description = null;
        } else {
            this.session_description = webRTCUniversalSessionDescription;
        }
        if ((i11 & 16) == 0) {
            this.v = null;
        } else {
            this.v = num2;
        }
        if ((i11 & 32) == 0) {
            this.data_limit_reached = null;
        } else {
            this.data_limit_reached = bool;
        }
        if ((i11 & 64) == 0) {
            this.rejected = null;
        } else {
            this.rejected = bool2;
        }
        if ((i11 & 128) == 0) {
            this.reason = null;
        } else {
            this.reason = str3;
        }
    }

    public static final /* synthetic */ void f(WebRTCUniversalPayload self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.msg_type);
        if (output.G(serialDesc, 1) || self.uid != null) {
            output.y(serialDesc, 1, z1.f119730a, self.uid);
        }
        if (output.G(serialDesc, 2) || self.type != null) {
            output.y(serialDesc, 2, vo0.j0.f119632a, self.type);
        }
        if (output.G(serialDesc, 3) || self.session_description != null) {
            output.y(serialDesc, 3, WebRTCUniversalSessionDescription.a.f56143a, self.session_description);
        }
        if (output.G(serialDesc, 4) || self.v != null) {
            output.y(serialDesc, 4, vo0.j0.f119632a, self.v);
        }
        if (output.G(serialDesc, 5) || self.data_limit_reached != null) {
            output.y(serialDesc, 5, vo0.h.f119620a, self.data_limit_reached);
        }
        if (output.G(serialDesc, 6) || self.rejected != null) {
            output.y(serialDesc, 6, vo0.h.f119620a, self.rejected);
        }
        if (!output.G(serialDesc, 7) && self.reason == null) {
            return;
        }
        output.y(serialDesc, 7, z1.f119730a, self.reason);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getData_limit_reached() {
        return this.data_limit_reached;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMsg_type() {
        return this.msg_type;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getRejected() {
        return this.rejected;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final WebRTCUniversalSessionDescription getSession_description() {
        return this.session_description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebRTCUniversalPayload)) {
            return false;
        }
        WebRTCUniversalPayload webRTCUniversalPayload = (WebRTCUniversalPayload) other;
        return p013kotlin.jvm.internal.s.f(this.msg_type, webRTCUniversalPayload.msg_type) && p013kotlin.jvm.internal.s.f(this.uid, webRTCUniversalPayload.uid) && p013kotlin.jvm.internal.s.f(this.type, webRTCUniversalPayload.type) && p013kotlin.jvm.internal.s.f(this.session_description, webRTCUniversalPayload.session_description) && p013kotlin.jvm.internal.s.f(this.v, webRTCUniversalPayload.v) && p013kotlin.jvm.internal.s.f(this.data_limit_reached, webRTCUniversalPayload.data_limit_reached) && p013kotlin.jvm.internal.s.f(this.rejected, webRTCUniversalPayload.rejected) && p013kotlin.jvm.internal.s.f(this.reason, webRTCUniversalPayload.reason);
    }

    public int hashCode() {
        int iHashCode = this.msg_type.hashCode() * 31;
        String str = this.uid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        WebRTCUniversalSessionDescription webRTCUniversalSessionDescription = this.session_description;
        int iHashCode4 = (iHashCode3 + (webRTCUniversalSessionDescription == null ? 0 : webRTCUniversalSessionDescription.hashCode())) * 31;
        Integer num2 = this.v;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.data_limit_reached;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.rejected;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.reason;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "WebRTCUniversalPayload(msg_type=" + this.msg_type + ", uid=" + this.uid + ", type=" + this.type + ", session_description=" + this.session_description + ", v=" + this.v + ", data_limit_reached=" + this.data_limit_reached + ", rejected=" + this.rejected + ", reason=" + this.reason + ")";
    }

    public WebRTCUniversalPayload(String msg_type, String str, Integer num, WebRTCUniversalSessionDescription webRTCUniversalSessionDescription, Integer num2, Boolean bool, Boolean bool2, String str2) {
        p013kotlin.jvm.internal.s.k(msg_type, "msg_type");
        this.msg_type = msg_type;
        this.uid = str;
        this.type = num;
        this.session_description = webRTCUniversalSessionDescription;
        this.v = num2;
        this.data_limit_reached = bool;
        this.rejected = bool2;
        this.reason = str2;
    }

    public /* synthetic */ WebRTCUniversalPayload(String str, String str2, Integer num, WebRTCUniversalSessionDescription webRTCUniversalSessionDescription, Integer num2, Boolean bool, Boolean bool2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : webRTCUniversalSessionDescription, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : bool2, (i11 & 128) != 0 ? null : str3);
    }
}
