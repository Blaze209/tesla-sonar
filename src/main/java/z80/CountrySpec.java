package z80;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.UnknownFieldException;
import p010i90.CountryElement;
import p010i90.IdentifierSpec;
import p010i90.SectionElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.o0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0002*0B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010(\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010/\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lz80/o0;", "Lz80/e1;", "Li90/g0;", "apiPath", "", "", "allowedCountryCodes", "<init>", "(Li90/g0;Ljava/util/Set;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILi90/g0;Ljava/util/Set;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lz80/o0;Luo0/d;Lto0/f;)V", "", "initialValues", "Li90/g1;", "f", "(Ljava/util/Map;)Li90/g1;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Li90/g0;", "e", "()Li90/g0;", "getApiPath$annotations", "()V", "b", "Ljava/util/Set;", "getAllowedCountryCodes", "()Ljava/util/Set;", "getAllowedCountryCodes$annotations", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class CountrySpec extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec apiPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> allowedCountryCodes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f127649c = 8;
    public static final Parcelable.Creator<CountrySpec> CREATOR = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d<Object>[] f127650d = {null, new vo0.o0(vo0.z1.f119730a)};

    /* JADX INFO: renamed from: z80.o0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/CountrySpec.$serializer", "Lvo0/e0;", "Lz80/o0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/o0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/o0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<CountrySpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127653a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127653a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.CountrySpec", aVar, 2);
            m1Var.o("api_path", true);
            m1Var.o("allowed_country_codes", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CountrySpec deserialize(uo0.e decoder) {
            Set set;
            IdentifierSpec identifierSpec;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = CountrySpec.f127650d;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                identifierSpec = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, null);
                set = (Set) cVarB.n(descriptor2, 1, dVarArr[1], null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                Set set2 = null;
                IdentifierSpec identifierSpec2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        identifierSpec2 = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, identifierSpec2);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        set2 = (Set) cVarB.n(descriptor2, 1, dVarArr[1], set2);
                        i12 |= 2;
                    }
                }
                set = set2;
                identifierSpec = identifierSpec2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new CountrySpec(i11, identifierSpec, set, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, CountrySpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            CountrySpec.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{IdentifierSpec.a.f76565a, CountrySpec.f127650d[1]};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: z80.o0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/o0$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/o0;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<CountrySpec> serializer() {
            return a.f127653a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.o0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<CountrySpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CountrySpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            IdentifierSpec identifierSpec = (IdentifierSpec) parcel.readParcelable(CountrySpec.class.getClassLoader());
            int i11 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashSet.add(parcel.readString());
            }
            return new CountrySpec(identifierSpec, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CountrySpec[] newArray(int i11) {
            return new CountrySpec[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CountrySpec() {
        this((IdentifierSpec) null, (Set) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void g(CountrySpec self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f127650d;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.getApiPath(), IdentifierSpec.INSTANCE.l())) {
            output.D(serialDesc, 0, IdentifierSpec.a.f76565a, self.getApiPath());
        }
        if (!output.G(serialDesc, 1) && p013kotlin.jvm.internal.s.f(self.allowedCountryCodes, t30.d.f112276a.h())) {
            return;
        }
        output.D(serialDesc, 1, dVarArr[1], self.allowedCountryCodes);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountrySpec)) {
            return false;
        }
        CountrySpec countrySpec = (CountrySpec) other;
        return p013kotlin.jvm.internal.s.f(this.apiPath, countrySpec.apiPath) && p013kotlin.jvm.internal.s.f(this.allowedCountryCodes, countrySpec.allowedCountryCodes);
    }

    public final SectionElement f(Map<IdentifierSpec, String> initialValues) {
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        return e1.c(this, new CountryElement(getApiPath(), new p010i90.y(new p010i90.t(this.allowedCountryCodes, null, false, false, null, null, 62, null), initialValues.get(getApiPath()))), null, 2, null);
    }

    public int hashCode() {
        return (this.apiPath.hashCode() * 31) + this.allowedCountryCodes.hashCode();
    }

    public String toString() {
        return "CountrySpec(apiPath=" + this.apiPath + ", allowedCountryCodes=" + this.allowedCountryCodes + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeParcelable(this.apiPath, flags);
        Set<String> set = this.allowedCountryCodes;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
    }

    @jn0.e
    public /* synthetic */ CountrySpec(int i11, @ro0.o("api_path") IdentifierSpec identifierSpec, @ro0.o("allowed_country_codes") Set set, vo0.v1 v1Var) {
        super(null);
        this.apiPath = (i11 & 1) == 0 ? IdentifierSpec.INSTANCE.l() : identifierSpec;
        if ((i11 & 2) == 0) {
            this.allowedCountryCodes = t30.d.f112276a.h();
        } else {
            this.allowedCountryCodes = set;
        }
    }

    public /* synthetic */ CountrySpec(IdentifierSpec identifierSpec, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.INSTANCE.l() : identifierSpec, (i11 & 2) != 0 ? t30.d.f112276a.h() : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountrySpec(IdentifierSpec apiPath, Set<String> allowedCountryCodes) {
        super(null);
        p013kotlin.jvm.internal.s.k(apiPath, "apiPath");
        p013kotlin.jvm.internal.s.k(allowedCountryCodes, "allowedCountryCodes");
        this.apiPath = apiPath;
        this.allowedCountryCodes = allowedCountryCodes;
    }
}
