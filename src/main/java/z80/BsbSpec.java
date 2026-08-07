package z80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.x, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002(/B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010&\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lz80/x;", "Lz80/e1;", "Li90/g0;", "apiPath", "<init>", "(Li90/g0;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILi90/g0;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "f", "(Lz80/x;Luo0/d;Lto0/f;)V", "", "", "initialValues", "Lz80/v;", "e", "(Ljava/util/Map;)Lz80/v;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Li90/g0;", DateTokenConverter.CONVERTER_KEY, "()Li90/g0;", "getApiPath$annotations", "()V", "Companion", "b", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class BsbSpec extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec apiPath;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f127870b = IdentifierSpec.f76539d;
    public static final Parcelable.Creator<BsbSpec> CREATOR = new c();

    /* JADX INFO: renamed from: z80.x$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/BsbSpec.$serializer", "Lvo0/e0;", "Lz80/x;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/x;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/x;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<BsbSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127872a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127872a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.BsbSpec", aVar, 1);
            m1Var.o("api_path", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BsbSpec deserialize(uo0.e decoder) {
            IdentifierSpec identifierSpec;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i11 = 1;
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                identifierSpec = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, null);
            } else {
                boolean z11 = true;
                int i12 = 0;
                identifierSpec = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        identifierSpec = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, identifierSpec);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new BsbSpec(i11, identifierSpec, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, BsbSpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            BsbSpec.f(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{IdentifierSpec.a.f76565a};
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

    /* JADX INFO: renamed from: z80.x$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/x$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/x;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<BsbSpec> serializer() {
            return a.f127872a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.x$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<BsbSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BsbSpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new BsbSpec((IdentifierSpec) parcel.readParcelable(BsbSpec.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BsbSpec[] newArray(int i11) {
            return new BsbSpec[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BsbSpec() {
        this((IdentifierSpec) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void f(BsbSpec self, uo0.d output, to0.f serialDesc) {
        if (!output.G(serialDesc, 0) && p013kotlin.jvm.internal.s.f(self.getApiPath(), IdentifierSpec.INSTANCE.a("au_becs_debit[bsb_number]"))) {
            return;
        }
        output.D(serialDesc, 0, IdentifierSpec.a.f76565a, self.getApiPath());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final v e(Map<IdentifierSpec, String> initialValues) {
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        return new v(getApiPath(), y.f127879a, initialValues.get(getApiPath()));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BsbSpec) && p013kotlin.jvm.internal.s.f(this.apiPath, ((BsbSpec) other).apiPath);
    }

    public int hashCode() {
        return this.apiPath.hashCode();
    }

    public String toString() {
        return "BsbSpec(apiPath=" + this.apiPath + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeParcelable(this.apiPath, flags);
    }

    @jn0.e
    public /* synthetic */ BsbSpec(int i11, @ro0.o("api_path") IdentifierSpec identifierSpec, vo0.v1 v1Var) {
        super(null);
        if ((i11 & 1) == 0) {
            this.apiPath = IdentifierSpec.INSTANCE.a("au_becs_debit[bsb_number]");
        } else {
            this.apiPath = identifierSpec;
        }
    }

    public /* synthetic */ BsbSpec(IdentifierSpec identifierSpec, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.INSTANCE.a("au_becs_debit[bsb_number]") : identifierSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BsbSpec(IdentifierSpec apiPath) {
        super(null);
        p013kotlin.jvm.internal.s.k(apiPath, "apiPath");
        this.apiPath = apiPath;
    }
}
