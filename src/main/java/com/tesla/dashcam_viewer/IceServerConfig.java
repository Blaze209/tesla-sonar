package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.z1;

/* JADX INFO: renamed from: com.tesla.dashcam_viewer.w, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u001e\"B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\"\u0010\u0017¨\u0006&"}, d2 = {"Lcom/tesla/dashcam_viewer/w;", "", "", "", "urls", "username", "credential", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "e", "(Lcom/tesla/dashcam_viewer/w;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Companion", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class IceServerConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d<Object>[] f56118d = {new vo0.e(z1.f119730a), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> urls;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String username;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String credential;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.w$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/tesla/dashcam_viewer/IceServerConfig.$serializer", "Lvo0/e0;", "Lcom/tesla/dashcam_viewer/w;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/tesla/dashcam_viewer/w;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/tesla/dashcam_viewer/w;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a implements vo0.e0<IceServerConfig> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f56122a;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f56122a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.tesla.dashcam_viewer.IceServerConfig", aVar, 3);
            m1Var.o("urls", true);
            m1Var.o("username", true);
            m1Var.o("credential", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IceServerConfig deserialize(uo0.e decoder) {
            int i11;
            List list;
            String str;
            String str2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            ro0.d[] dVarArr = IceServerConfig.f56118d;
            List list2 = null;
            if (cVarB.i()) {
                List list3 = (List) cVarB.v(fVar, 0, dVarArr[0], null);
                z1 z1Var = z1.f119730a;
                String str3 = (String) cVarB.v(fVar, 1, z1Var, null);
                list = list3;
                str2 = (String) cVarB.v(fVar, 2, z1Var, null);
                i11 = 7;
                str = str3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String str4 = null;
                String str5 = null;
                while (z11) {
                    int iA = cVarB.A(fVar);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        list2 = (List) cVarB.v(fVar, 0, dVarArr[0], list2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        str4 = (String) cVarB.v(fVar, 1, z1.f119730a, str4);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        str5 = (String) cVarB.v(fVar, 2, z1.f119730a, str5);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                list = list2;
                str = str4;
                str2 = str5;
            }
            cVarB.c(fVar);
            return new IceServerConfig(i11, list, str, str2, (vo0.v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, IceServerConfig value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            IceServerConfig.e(value, dVarB, fVar);
            dVarB.c(fVar);
        }

        @Override // vo0.e0
        public final ro0.d<?>[] childSerializers() {
            ro0.d<?> dVarP = so0.a.p(IceServerConfig.f56118d[0]);
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{dVarP, so0.a.p(z1Var), so0.a.p(z1Var)};
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

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.w$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/dashcam_viewer/w$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/tesla/dashcam_viewer/w;", "serializer", "()Lro0/d;", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<IceServerConfig> serializer() {
            return a.f56122a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public IceServerConfig() {
        this((List) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void e(IceServerConfig self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f56118d;
        if (output.G(serialDesc, 0) || self.urls != null) {
            output.y(serialDesc, 0, dVarArr[0], self.urls);
        }
        if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.username, "")) {
            output.y(serialDesc, 1, z1.f119730a, self.username);
        }
        if (!output.G(serialDesc, 2) && p013kotlin.jvm.internal.s.f(self.credential, "")) {
            return;
        }
        output.y(serialDesc, 2, z1.f119730a, self.credential);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCredential() {
        return this.credential;
    }

    public final List<String> c() {
        return this.urls;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceServerConfig)) {
            return false;
        }
        IceServerConfig iceServerConfig = (IceServerConfig) other;
        return p013kotlin.jvm.internal.s.f(this.urls, iceServerConfig.urls) && p013kotlin.jvm.internal.s.f(this.username, iceServerConfig.username) && p013kotlin.jvm.internal.s.f(this.credential, iceServerConfig.credential);
    }

    public int hashCode() {
        List<String> list = this.urls;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.username;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.credential;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "IceServerConfig(urls=" + this.urls + ", username=" + this.username + ", credential=" + this.credential + ")";
    }

    public /* synthetic */ IceServerConfig(int i11, List list, String str, String str2, vo0.v1 v1Var) {
        this.urls = (i11 & 1) == 0 ? null : list;
        if ((i11 & 2) == 0) {
            this.username = "";
        } else {
            this.username = str;
        }
        if ((i11 & 4) == 0) {
            this.credential = "";
        } else {
            this.credential = str2;
        }
    }

    public IceServerConfig(List<String> list, String str, String str2) {
        this.urls = list;
        this.username = str;
        this.credential = str2;
    }

    public /* synthetic */ IceServerConfig(List list, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2);
    }
}
