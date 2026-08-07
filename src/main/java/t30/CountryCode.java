package t30;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.p;
import vo0.e0;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: t30.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\"$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006&"}, d2 = {"Lt30/b;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lt30/b;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "Companion", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final /* data */ class CountryCode implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CountryCode> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CountryCode f112271b = new CountryCode("US");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final CountryCode f112272c = new CountryCode("CA");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final CountryCode f112273d = new CountryCode("GB");

    /* JADX INFO: renamed from: t30.b$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/core/model/CountryCode.$serializer", "Lvo0/e0;", "Lt30/b;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lt30/b;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lt30/b;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e0<CountryCode> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f112275a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f112275a = aVar;
            m1 m1Var = new m1("com.stripe.android.core.model.CountryCode", aVar, 1);
            m1Var.o("value", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CountryCode deserialize(uo0.e decoder) {
            String strT;
            s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i11 = 1;
            v1 v1Var = null;
            if (cVarB.i()) {
                strT = cVarB.t(descriptor2, 0);
            } else {
                boolean z11 = true;
                int i12 = 0;
                strT = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        strT = cVarB.t(descriptor2, 0);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new CountryCode(i11, strT, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, CountryCode value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            CountryCode.c(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{z1.f119730a};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: t30.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt30/b$b;", "", "<init>", "()V", "Lt30/b;", "countryCode", "", "c", "(Lt30/b;)Z", "", "value", "a", "(Ljava/lang/String;)Lt30/b;", "Lro0/d;", "serializer", "()Lro0/d;", "US", "Lt30/b;", "b", "()Lt30/b;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CountryCode a(String value) {
            s.k(value, "value");
            String upperCase = value.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            return new CountryCode(upperCase);
        }

        public final CountryCode b() {
            return CountryCode.f112271b;
        }

        public final boolean c(CountryCode countryCode) {
            return s.f(countryCode, b());
        }

        public final ro0.d<CountryCode> serializer() {
            return a.f112275a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: t30.b$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<CountryCode> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CountryCode createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new CountryCode(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CountryCode[] newArray(int i11) {
            return new CountryCode[i11];
        }
    }

    @jn0.e
    public /* synthetic */ CountryCode(int i11, String str, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, a.f112275a.getDescriptor());
        }
        this.value = str;
    }

    public static final /* synthetic */ void c(CountryCode self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.value);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CountryCode) && s.f(this.value, ((CountryCode) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "CountryCode(value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.value);
    }

    public CountryCode(String value) {
        s.k(value, "value");
        this.value = value;
    }
}
