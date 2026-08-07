package m50;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import jn0.x;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
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

/* JADX INFO: renamed from: m50.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002\u0012)B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010$\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u0012\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b)\u0010&\u0012\u0004\b*\u0010(¨\u0006,"}, d2 = {"Lm50/a;", "Landroid/os/Parcelable;", "", "clientSecret", "startingAfterAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lm50/a;Luo0/d;Lto0/f;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getClientSecret$annotations", "()V", "b", "getStartingAfterAccountId$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final /* data */ class GetFinancialConnectionsAcccountsParams implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientSecret;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startingAfterAccountId;
    private static final b Companion = new b(null);
    public static final Parcelable.Creator<GetFinancialConnectionsAcccountsParams> CREATOR = new c();

    /* JADX INFO: renamed from: m50.a$a, reason: collision with other inner class name */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams.$serializer", "Lvo0/e0;", "Lm50/a;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lm50/a;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lm50/a;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1941a implements e0<GetFinancialConnectionsAcccountsParams> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1941a f91238a;
        private static final /* synthetic */ m1 descriptor;

        static {
            C1941a c1941a = new C1941a();
            f91238a = c1941a;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams", c1941a, 2);
            m1Var.o("client_secret", false);
            m1Var.o("starting_after", false);
            descriptor = m1Var;
        }

        private C1941a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetFinancialConnectionsAcccountsParams deserialize(uo0.e decoder) {
            String strT;
            String str;
            int i11;
            s.k(decoder, "decoder");
            f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            v1 v1Var = null;
            if (cVarB.i()) {
                strT = cVarB.t(descriptor2, 0);
                str = (String) cVarB.v(descriptor2, 1, z1.f119730a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                strT = null;
                String str2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        str2 = (String) cVarB.v(descriptor2, 1, z1.f119730a, str2);
                        i12 |= 2;
                    }
                }
                str = str2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new GetFinancialConnectionsAcccountsParams(i11, strT, str, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, GetFinancialConnectionsAcccountsParams value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            GetFinancialConnectionsAcccountsParams.a(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{z1Var, so0.a.p(z1Var)};
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

    /* JADX INFO: renamed from: m50.a$b */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lm50/a$b;", "", "<init>", "()V", "Lro0/d;", "Lm50/a;", "serializer", "()Lro0/d;", "", "PARAM_CLIENT_SECRET", "Ljava/lang/String;", "PARAM_STARTING_AFTER", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<GetFinancialConnectionsAcccountsParams> serializer() {
            return C1941a.f91238a;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: m50.a$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<GetFinancialConnectionsAcccountsParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GetFinancialConnectionsAcccountsParams createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new GetFinancialConnectionsAcccountsParams(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GetFinancialConnectionsAcccountsParams[] newArray(int i11) {
            return new GetFinancialConnectionsAcccountsParams[i11];
        }
    }

    @jn0.e
    public /* synthetic */ GetFinancialConnectionsAcccountsParams(int i11, @o("client_secret") String str, @o("starting_after") String str2, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, C1941a.f91238a.getDescriptor());
        }
        this.clientSecret = str;
        this.startingAfterAccountId = str2;
    }

    public static final /* synthetic */ void a(GetFinancialConnectionsAcccountsParams self, uo0.d output, f serialDesc) {
        output.e(serialDesc, 0, self.clientSecret);
        output.y(serialDesc, 1, z1.f119730a, self.startingAfterAccountId);
    }

    public final Map<String, Object> c3() {
        List<Pair> listP = v.p(x.a("client_secret", this.clientSecret), x.a("starting_after", this.startingAfterAccountId));
        Map<String, Object> mapI = v0.i();
        for (Pair pair : listP) {
            String str = (String) pair.a();
            String str2 = (String) pair.b();
            Map mapF = str2 != null ? v0.f(x.a(str, str2)) : null;
            if (mapF == null) {
                mapF = v0.i();
            }
            mapI = v0.r(mapI, mapF);
        }
        return mapI;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetFinancialConnectionsAcccountsParams)) {
            return false;
        }
        GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams = (GetFinancialConnectionsAcccountsParams) other;
        return s.f(this.clientSecret, getFinancialConnectionsAcccountsParams.clientSecret) && s.f(this.startingAfterAccountId, getFinancialConnectionsAcccountsParams.startingAfterAccountId);
    }

    public int hashCode() {
        int iHashCode = this.clientSecret.hashCode() * 31;
        String str = this.startingAfterAccountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GetFinancialConnectionsAcccountsParams(clientSecret=" + this.clientSecret + ", startingAfterAccountId=" + this.startingAfterAccountId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.startingAfterAccountId);
    }

    public GetFinancialConnectionsAcccountsParams(String clientSecret, String str) {
        s.k(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.startingAfterAccountId = str;
    }
}
