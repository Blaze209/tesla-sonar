package z80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import p010i90.IdentifierSpec;
import p010i90.SectionElement;
import p010i90.SimpleTextElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002\"%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B9\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0002\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00182\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\"\u0010#\u0012\u0004\b$\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b%\u0010#\u0012\u0004\b&\u0010\u0003R \u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b'\u0010#\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lz80/n;", "Lz80/e1;", "<init>", "()V", "", "seen1", "Li90/g0;", "sortCodeIdentifier", "accountNumberIdentifier", "apiPath", "Lvo0/v1;", "serializationConstructorMarker", "(ILi90/g0;Li90/g0;Li90/g0;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "f", "(Lz80/n;Luo0/d;Lto0/f;)V", "", "", "initialValues", "Li90/g1;", "e", "(Ljava/util/Map;)Li90/g1;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Li90/g0;", "getSortCodeIdentifier$annotations", "b", "getAccountNumberIdentifier$annotations", "c", DateTokenConverter.CONVERTER_KEY, "()Li90/g0;", "getApiPath$annotations", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final class n extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec sortCodeIdentifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec accountNumberIdentifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec apiPath;
    private static final b Companion = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f127629d = IdentifierSpec.f76539d;
    public static final Parcelable.Creator<n> CREATOR = new c();

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/BacsDebitBankAccountSpec.$serializer", "Lvo0/e0;", "Lz80/n;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/n;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/n;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127633a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127633a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.BacsDebitBankAccountSpec", aVar, 3);
            m1Var.o("sortCodeIdentifier", true);
            m1Var.o("accountNumberIdentifier", true);
            m1Var.o("apiPath", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n deserialize(uo0.e decoder) {
            int i11;
            IdentifierSpec identifierSpec;
            IdentifierSpec identifierSpec2;
            IdentifierSpec identifierSpec3;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            IdentifierSpec identifierSpec4 = null;
            if (cVarB.i()) {
                IdentifierSpec.a aVar = IdentifierSpec.a.f76565a;
                IdentifierSpec identifierSpec5 = (IdentifierSpec) cVarB.n(descriptor2, 0, aVar, null);
                IdentifierSpec identifierSpec6 = (IdentifierSpec) cVarB.n(descriptor2, 1, aVar, null);
                identifierSpec3 = (IdentifierSpec) cVarB.n(descriptor2, 2, aVar, null);
                i11 = 7;
                identifierSpec2 = identifierSpec6;
                identifierSpec = identifierSpec5;
            } else {
                boolean z11 = true;
                int i12 = 0;
                IdentifierSpec identifierSpec7 = null;
                IdentifierSpec identifierSpec8 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        identifierSpec4 = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, identifierSpec4);
                        i12 |= 1;
                    } else if (iA == 1) {
                        identifierSpec7 = (IdentifierSpec) cVarB.n(descriptor2, 1, IdentifierSpec.a.f76565a, identifierSpec7);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        identifierSpec8 = (IdentifierSpec) cVarB.n(descriptor2, 2, IdentifierSpec.a.f76565a, identifierSpec8);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                identifierSpec = identifierSpec4;
                identifierSpec2 = identifierSpec7;
                identifierSpec3 = identifierSpec8;
            }
            cVarB.c(descriptor2);
            return new n(i11, identifierSpec, identifierSpec2, identifierSpec3, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, n value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            n.f(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            IdentifierSpec.a aVar = IdentifierSpec.a.f76565a;
            return new ro0.d[]{aVar, aVar, aVar};
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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lz80/n$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/n;", "serializer", "()Lro0/d;", "", "ACCOUNT_NUMBER_API_PATH", "Ljava/lang/String;", "SORT_CODE_API_PATH", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<n> serializer() {
            return a.f127633a;
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            parcel.readInt();
            return new n();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i11) {
            return new n[i11];
        }
    }

    @jn0.e
    public /* synthetic */ n(int i11, IdentifierSpec identifierSpec, IdentifierSpec identifierSpec2, IdentifierSpec identifierSpec3, vo0.v1 v1Var) {
        super(null);
        this.sortCodeIdentifier = (i11 & 1) == 0 ? IdentifierSpec.INSTANCE.a("bacs_debit[sort_code]") : identifierSpec;
        if ((i11 & 2) == 0) {
            this.accountNumberIdentifier = IdentifierSpec.INSTANCE.a("bacs_debit[account_number]");
        } else {
            this.accountNumberIdentifier = identifierSpec2;
        }
        if ((i11 & 4) == 0) {
            this.apiPath = new IdentifierSpec();
        } else {
            this.apiPath = identifierSpec3;
        }
    }

    public static final /* synthetic */ void f(n self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.sortCodeIdentifier, IdentifierSpec.INSTANCE.a("bacs_debit[sort_code]"))) {
            output.D(serialDesc, 0, IdentifierSpec.a.f76565a, self.sortCodeIdentifier);
        }
        if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.accountNumberIdentifier, IdentifierSpec.INSTANCE.a("bacs_debit[account_number]"))) {
            output.D(serialDesc, 1, IdentifierSpec.a.f76565a, self.accountNumberIdentifier);
        }
        if (!output.G(serialDesc, 2) && p013kotlin.jvm.internal.s.f(self.getApiPath(), new IdentifierSpec())) {
            return;
        }
        output.D(serialDesc, 2, IdentifierSpec.a.f76565a, self.getApiPath());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final SectionElement e(Map<IdentifierSpec, String> initialValues) {
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        return b(p013kotlin.collections.v.p(new SimpleTextElement(this.sortCodeIdentifier, new p010i90.r1(new p(), false, initialValues.get(this.sortCodeIdentifier), 2, null)), new SimpleTextElement(this.accountNumberIdentifier, new p010i90.r1(new m(), false, initialValues.get(this.accountNumberIdentifier), 2, null))), Integer.valueOf(w80.n.f121508f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeInt(1);
    }

    public n() {
        super(null);
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        this.sortCodeIdentifier = companion.a("bacs_debit[sort_code]");
        this.accountNumberIdentifier = companion.a("bacs_debit[account_number]");
        this.apiPath = new IdentifierSpec();
    }
}
