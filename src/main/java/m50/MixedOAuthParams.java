package m50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.e0;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: m50.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\u001d\u0013BK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001e\u0012\u0004\b&\u0010!\u001a\u0004\b%\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001e\u0012\u0004\b(\u0010!\u001a\u0004\b\u001d\u0010\u0016¨\u0006*"}, d2 = {"Lm50/b;", "", "", "seen1", "", "state", "code", PermissionsResponse.STATUS_KEY, "publicToken", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "b", "(Lm50/b;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getState", "getState$annotations", "()V", "getCode", "getCode$annotations", "c", "getStatus", "getStatus$annotations", DateTokenConverter.CONVERTER_KEY, "getPublicToken$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final /* data */ class MixedOAuthParams {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publicToken;

    /* JADX INFO: renamed from: m50.b$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/MixedOAuthParams.$serializer", "Lvo0/e0;", "Lm50/b;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lm50/b;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lm50/b;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e0<MixedOAuthParams> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f91243a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f91243a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.MixedOAuthParams", aVar, 4);
            m1Var.o("state", false);
            m1Var.o("code", false);
            m1Var.o(PermissionsResponse.STATUS_KEY, false);
            m1Var.o("public_token", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MixedOAuthParams deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            String str3;
            String str4;
            s.k(decoder, "decoder");
            f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                z1 z1Var = z1.f119730a;
                String str5 = (String) cVarB.v(descriptor2, 1, z1Var, null);
                String str6 = (String) cVarB.v(descriptor2, 2, z1Var, null);
                str = strT2;
                str4 = (String) cVarB.v(descriptor2, 3, z1Var, null);
                str3 = str6;
                str2 = str5;
                i11 = 15;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        str7 = (String) cVarB.v(descriptor2, 1, z1.f119730a, str7);
                        i12 |= 2;
                    } else if (iA == 2) {
                        str8 = (String) cVarB.v(descriptor2, 2, z1.f119730a, str8);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        str9 = (String) cVarB.v(descriptor2, 3, z1.f119730a, str9);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = strT;
                str2 = str7;
                str3 = str8;
                str4 = str9;
            }
            cVarB.c(descriptor2);
            return new MixedOAuthParams(i11, str, str2, str3, str4, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, MixedOAuthParams value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            MixedOAuthParams.b(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{z1Var, so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: m50.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm50/b$b;", "", "<init>", "()V", "Lro0/d;", "Lm50/b;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<MixedOAuthParams> serializer() {
            return a.f91243a;
        }

        private Companion() {
        }
    }

    @jn0.e
    public /* synthetic */ MixedOAuthParams(int i11, @o("state") String str, @o("code") String str2, @o(PermissionsResponse.STATUS_KEY) String str3, @o("public_token") String str4, v1 v1Var) {
        if (15 != (i11 & 15)) {
            h1.b(i11, 15, a.f91243a.getDescriptor());
        }
        this.state = str;
        this.code = str2;
        this.status = str3;
        this.publicToken = str4;
    }

    public static final /* synthetic */ void b(MixedOAuthParams self, uo0.d output, f serialDesc) {
        output.e(serialDesc, 0, self.state);
        z1 z1Var = z1.f119730a;
        output.y(serialDesc, 1, z1Var, self.code);
        output.y(serialDesc, 2, z1Var, self.status);
        output.y(serialDesc, 3, z1Var, self.publicToken);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPublicToken() {
        return this.publicToken;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MixedOAuthParams)) {
            return false;
        }
        MixedOAuthParams mixedOAuthParams = (MixedOAuthParams) other;
        return s.f(this.state, mixedOAuthParams.state) && s.f(this.code, mixedOAuthParams.code) && s.f(this.status, mixedOAuthParams.status) && s.f(this.publicToken, mixedOAuthParams.publicToken);
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publicToken;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "MixedOAuthParams(state=" + this.state + ", code=" + this.code + ", status=" + this.status + ", publicToken=" + this.publicToken + ")";
    }
}
