package z80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import java.lang.annotation.Annotation;
import kotlinx.serialization.UnknownFieldException;
import p010i90.IdentifierSpec;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.y1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0003%+1B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010*\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lz80/y1;", "Lz80/e1;", "Li90/g0;", "apiPath", "Lz80/y1$d;", "field", "<init>", "(Li90/g0;Lz80/y1$d;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILi90/g0;Lz80/y1$d;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lz80/y1;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Li90/g0;", "e", "()Li90/g0;", "getApiPath$annotations", "()V", "b", "Lz80/y1$d;", "f", "()Lz80/y1$d;", "getField$annotations", "Companion", DateTokenConverter.CONVERTER_KEY, "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class PlaceholderSpec extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec apiPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d field;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f127884c = IdentifierSpec.f76539d;
    public static final Parcelable.Creator<PlaceholderSpec> CREATOR = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ro0.d<Object>[] f127885d = {null, d.INSTANCE.serializer()};

    /* JADX INFO: renamed from: z80.y1$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/PlaceholderSpec.$serializer", "Lvo0/e0;", "Lz80/y1;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/y1;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/y1;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<PlaceholderSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127888a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127888a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.PlaceholderSpec", aVar, 2);
            m1Var.o("api_path", true);
            m1Var.o("for", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaceholderSpec deserialize(uo0.e decoder) {
            d dVar;
            IdentifierSpec identifierSpec;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = PlaceholderSpec.f127885d;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                identifierSpec = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, null);
                dVar = (d) cVarB.n(descriptor2, 1, dVarArr[1], null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                d dVar2 = null;
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
                        dVar2 = (d) cVarB.n(descriptor2, 1, dVarArr[1], dVar2);
                        i12 |= 2;
                    }
                }
                dVar = dVar2;
                identifierSpec = identifierSpec2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new PlaceholderSpec(i11, identifierSpec, dVar, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, PlaceholderSpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            PlaceholderSpec.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{IdentifierSpec.a.f76565a, PlaceholderSpec.f127885d[1]};
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

    /* JADX INFO: renamed from: z80.y1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/y1$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/y1;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<PlaceholderSpec> serializer() {
            return a.f127888a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.y1$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<PlaceholderSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlaceholderSpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new PlaceholderSpec((IdentifierSpec) parcel.readParcelable(PlaceholderSpec.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PlaceholderSpec[] newArray(int i11) {
            return new PlaceholderSpec[i11];
        }
    }

    /* JADX INFO: renamed from: z80.y1$d */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lz80/y1$d;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "b", "Name", "Email", "Phone", "BillingAddress", "BillingAddressWithoutCountry", "SepaMandate", "Unknown", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ro0.p
    public enum d {
        Name,
        Email,
        Phone,
        BillingAddress,
        BillingAddressWithoutCountry,
        SepaMandate,
        Unknown;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = jn0.m.a(jn0.p.PUBLICATION, a.f127889c);

        /* JADX INFO: renamed from: z80.y1$d$a */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<ro0.d<Object>> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f127889c = new a();

            a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ro0.d<Object> invoke() {
                return vo0.a0.a("com.stripe.android.ui.core.elements.PlaceholderSpec.PlaceholderField", d.values(), new String[]{"name", Scopes.EMAIL, "phone", "billing_address", "billing_address_without_country", "sepa_mandate", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null}, null);
            }
        }

        /* JADX INFO: renamed from: z80.y1$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/y1$d$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/y1$d;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ ro0.d a() {
                return (ro0.d) d.$cachedSerializer$delegate.getValue();
            }

            public final ro0.d<d> serializer() {
                return a();
            }

            private Companion() {
            }
        }

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlaceholderSpec() {
        this((IdentifierSpec) null, (d) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void g(PlaceholderSpec self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f127885d;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.getApiPath(), IdentifierSpec.INSTANCE.a("placeholder"))) {
            output.D(serialDesc, 0, IdentifierSpec.a.f76565a, self.getApiPath());
        }
        if (!output.G(serialDesc, 1) && self.field == d.Unknown) {
            return;
        }
        output.D(serialDesc, 1, dVarArr[1], self.field);
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
        if (!(other instanceof PlaceholderSpec)) {
            return false;
        }
        PlaceholderSpec placeholderSpec = (PlaceholderSpec) other;
        return p013kotlin.jvm.internal.s.f(this.apiPath, placeholderSpec.apiPath) && this.field == placeholderSpec.field;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getField() {
        return this.field;
    }

    public int hashCode() {
        return (this.apiPath.hashCode() * 31) + this.field.hashCode();
    }

    public String toString() {
        return "PlaceholderSpec(apiPath=" + this.apiPath + ", field=" + this.field + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeParcelable(this.apiPath, flags);
        parcel.writeString(this.field.name());
    }

    @jn0.e
    public /* synthetic */ PlaceholderSpec(int i11, @ro0.o("api_path") IdentifierSpec identifierSpec, @ro0.o("for") d dVar, vo0.v1 v1Var) {
        super(null);
        this.apiPath = (i11 & 1) == 0 ? IdentifierSpec.INSTANCE.a("placeholder") : identifierSpec;
        if ((i11 & 2) == 0) {
            this.field = d.Unknown;
        } else {
            this.field = dVar;
        }
    }

    public /* synthetic */ PlaceholderSpec(IdentifierSpec identifierSpec, d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.INSTANCE.a("placeholder") : identifierSpec, (i11 & 2) != 0 ? d.Unknown : dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderSpec(IdentifierSpec apiPath, d field) {
        super(null);
        p013kotlin.jvm.internal.s.k(apiPath, "apiPath");
        p013kotlin.jvm.internal.s.k(field, "field");
        this.apiPath = apiPath;
        this.field = field;
    }
}
