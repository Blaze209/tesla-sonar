package z80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.o1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 62\u00020\u0001:\u0002(.B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010&\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001cR\u001a\u00105\u001a\u0002018\u0002X\u0083\u0004¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u0010-¨\u00067"}, d2 = {"Lz80/o1;", "Lz80/e1;", "Li90/g0;", "apiPath", "", "stringResId", "<init>", "(Li90/g0;I)V", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILi90/g0;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "f", "(Lz80/o1;Luo0/d;Lto0/f;)V", "", "merchantName", "Li90/d0;", "e", "(Ljava/lang/String;)Li90/d0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Li90/g0;", DateTokenConverter.CONVERTER_KEY, "()Li90/g0;", "getApiPath$annotations", "()V", "b", "I", "getStringResId", "Lz80/t1;", "c", "Lz80/t1;", "getMandateTextSpec$annotations", "mandateTextSpec", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class KlarnaMandateTextSpec extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec apiPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int stringResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MandateTextSpec mandateTextSpec;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f127654d = IdentifierSpec.f76539d;
    public static final Parcelable.Creator<KlarnaMandateTextSpec> CREATOR = new c();

    /* JADX INFO: renamed from: z80.o1$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/KlarnaMandateTextSpec.$serializer", "Lvo0/e0;", "Lz80/o1;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/o1;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/o1;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<KlarnaMandateTextSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127658a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127658a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.KlarnaMandateTextSpec", aVar, 2);
            m1Var.o("api_path", true);
            m1Var.o("stringResId", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public KlarnaMandateTextSpec deserialize(uo0.e decoder) {
            IdentifierSpec identifierSpec;
            int iE;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                identifierSpec = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, null);
                iE = cVarB.e(descriptor2, 1);
                i11 = 3;
            } else {
                boolean z11 = true;
                int iE2 = 0;
                int i12 = 0;
                identifierSpec = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        identifierSpec = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, identifierSpec);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        iE2 = cVarB.e(descriptor2, 1);
                        i12 |= 2;
                    }
                }
                iE = iE2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new KlarnaMandateTextSpec(i11, identifierSpec, iE, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, KlarnaMandateTextSpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            KlarnaMandateTextSpec.f(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{IdentifierSpec.a.f76565a, vo0.j0.f119632a};
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

    /* JADX INFO: renamed from: z80.o1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/o1$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/o1;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<KlarnaMandateTextSpec> serializer() {
            return a.f127658a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.o1$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<KlarnaMandateTextSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KlarnaMandateTextSpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new KlarnaMandateTextSpec((IdentifierSpec) parcel.readParcelable(KlarnaMandateTextSpec.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KlarnaMandateTextSpec[] newArray(int i11) {
            return new KlarnaMandateTextSpec[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KlarnaMandateTextSpec() {
        this((IdentifierSpec) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void f(KlarnaMandateTextSpec self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.getApiPath(), IdentifierSpec.INSTANCE.a("klarna_mandate"))) {
            output.D(serialDesc, 0, IdentifierSpec.a.f76565a, self.getApiPath());
        }
        if (!output.G(serialDesc, 1) && self.stringResId == w80.n.A) {
            return;
        }
        output.x(serialDesc, 1, self.stringResId);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final p010i90.d0 e(String merchantName) {
        p013kotlin.jvm.internal.s.k(merchantName, "merchantName");
        return this.mandateTextSpec.e(merchantName, merchantName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KlarnaMandateTextSpec)) {
            return false;
        }
        KlarnaMandateTextSpec klarnaMandateTextSpec = (KlarnaMandateTextSpec) other;
        return p013kotlin.jvm.internal.s.f(this.apiPath, klarnaMandateTextSpec.apiPath) && this.stringResId == klarnaMandateTextSpec.stringResId;
    }

    public int hashCode() {
        return (this.apiPath.hashCode() * 31) + Integer.hashCode(this.stringResId);
    }

    public String toString() {
        return "KlarnaMandateTextSpec(apiPath=" + this.apiPath + ", stringResId=" + this.stringResId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeParcelable(this.apiPath, flags);
        parcel.writeInt(this.stringResId);
    }

    @jn0.e
    public /* synthetic */ KlarnaMandateTextSpec(int i11, @ro0.o("api_path") IdentifierSpec identifierSpec, int i12, vo0.v1 v1Var) {
        super(null);
        this.apiPath = (i11 & 1) == 0 ? IdentifierSpec.INSTANCE.a("klarna_mandate") : identifierSpec;
        if ((i11 & 2) == 0) {
            this.stringResId = w80.n.A;
        } else {
            this.stringResId = i12;
        }
        this.mandateTextSpec = new MandateTextSpec(getApiPath(), this.stringResId);
    }

    public /* synthetic */ KlarnaMandateTextSpec(IdentifierSpec identifierSpec, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? IdentifierSpec.INSTANCE.a("klarna_mandate") : identifierSpec, (i12 & 2) != 0 ? w80.n.A : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlarnaMandateTextSpec(IdentifierSpec apiPath, int i11) {
        super(null);
        p013kotlin.jvm.internal.s.k(apiPath, "apiPath");
        this.apiPath = apiPath;
        this.stringResId = i11;
        this.mandateTextSpec = new MandateTextSpec(getApiPath(), i11);
    }
}
