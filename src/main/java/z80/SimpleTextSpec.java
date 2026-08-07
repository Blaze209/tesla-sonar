package z80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p010i90.IdentifierSpec;
import p010i90.SectionElement;
import p010i90.SimpleTextElement;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.k2, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002.4B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBS\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u001d2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010,\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b7\u00103\u001a\u0004\b6\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u00103\u001a\u0004\b:\u0010;R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u00103\u001a\u0004\b?\u0010@R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010B\u0012\u0004\bE\u00103\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lz80/k2;", "Lz80/e1;", "Li90/g0;", "apiPath", "", AnnotatedPrivateKey.LABEL, "Lz80/z;", "capitalization", "Lz80/m1;", "keyboardType", "", "showOptionalLabel", "<init>", "(Li90/g0;ILz80/z;Lz80/m1;Z)V", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILi90/g0;ILz80/z;Lz80/m1;ZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lz80/k2;Luo0/d;Lto0/f;)V", "", "", "initialValues", "Li90/g1;", "f", "(Ljava/util/Map;)Li90/g1;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Li90/g0;", "e", "()Li90/g0;", "getApiPath$annotations", "()V", "b", "I", "getLabel", "getLabel$annotations", "c", "Lz80/z;", "getCapitalization", "()Lz80/z;", "getCapitalization$annotations", DateTokenConverter.CONVERTER_KEY, "Lz80/m1;", "getKeyboardType", "()Lz80/m1;", "getKeyboardType$annotations", "Z", "getShowOptionalLabel", "()Z", "getShowOptionalLabel$annotations", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class SimpleTextSpec extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec apiPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final z capitalization;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final m1 keyboardType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showOptionalLabel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f127589f = IdentifierSpec.f76539d;
    public static final Parcelable.Creator<SimpleTextSpec> CREATOR = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ro0.d<Object>[] f127590g = {null, null, z.INSTANCE.serializer(), m1.INSTANCE.serializer(), null};

    /* JADX INFO: renamed from: z80.k2$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/SimpleTextSpec.$serializer", "Lvo0/e0;", "Lz80/k2;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/k2;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/k2;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<SimpleTextSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127596a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127596a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.SimpleTextSpec", aVar, 5);
            m1Var.o("api_path", false);
            m1Var.o(AnnotatedPrivateKey.LABEL, false);
            m1Var.o("capitalization", true);
            m1Var.o("keyboard_type", true);
            m1Var.o("show_optional_label", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleTextSpec deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            int i12;
            IdentifierSpec identifierSpec;
            z zVar;
            m1 m1Var;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = SimpleTextSpec.f127590g;
            if (cVarB.i()) {
                IdentifierSpec identifierSpec2 = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, null);
                int iE = cVarB.e(descriptor2, 1);
                z zVar2 = (z) cVarB.n(descriptor2, 2, dVarArr[2], null);
                m1Var = (m1) cVarB.n(descriptor2, 3, dVarArr[3], null);
                identifierSpec = identifierSpec2;
                zW = cVarB.w(descriptor2, 4);
                i11 = 31;
                zVar = zVar2;
                i12 = iE;
            } else {
                boolean z11 = true;
                boolean zW2 = false;
                int iE2 = 0;
                IdentifierSpec identifierSpec3 = null;
                z zVar3 = null;
                m1 m1Var2 = null;
                int i13 = 0;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        identifierSpec3 = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, identifierSpec3);
                        i13 |= 1;
                    } else if (iA == 1) {
                        iE2 = cVarB.e(descriptor2, 1);
                        i13 |= 2;
                    } else if (iA == 2) {
                        zVar3 = (z) cVarB.n(descriptor2, 2, dVarArr[2], zVar3);
                        i13 |= 4;
                    } else if (iA == 3) {
                        m1Var2 = (m1) cVarB.n(descriptor2, 3, dVarArr[3], m1Var2);
                        i13 |= 8;
                    } else {
                        if (iA != 4) {
                            throw new UnknownFieldException(iA);
                        }
                        zW2 = cVarB.w(descriptor2, 4);
                        i13 |= 16;
                    }
                }
                zW = zW2;
                i11 = i13;
                i12 = iE2;
                identifierSpec = identifierSpec3;
                zVar = zVar3;
                m1Var = m1Var2;
            }
            cVarB.c(descriptor2);
            return new SimpleTextSpec(i11, identifierSpec, i12, zVar, m1Var, zW, (vo0.v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, SimpleTextSpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            SimpleTextSpec.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = SimpleTextSpec.f127590g;
            return new ro0.d[]{IdentifierSpec.a.f76565a, vo0.j0.f119632a, dVarArr[2], dVarArr[3], vo0.h.f119620a};
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

    /* JADX INFO: renamed from: z80.k2$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/k2$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/k2;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<SimpleTextSpec> serializer() {
            return a.f127596a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.k2$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SimpleTextSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleTextSpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new SimpleTextSpec((IdentifierSpec) parcel.readParcelable(SimpleTextSpec.class.getClassLoader()), parcel.readInt(), z.valueOf(parcel.readString()), m1.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SimpleTextSpec[] newArray(int i11) {
            return new SimpleTextSpec[i11];
        }
    }

    /* JADX INFO: renamed from: z80.k2$d */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f127598b;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.Characters.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.Words.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z.Sentences.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f127597a = iArr;
            int[] iArr2 = new int[m1.values().length];
            try {
                iArr2[m1.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[m1.Ascii.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[m1.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[m1.Phone.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[m1.Uri.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[m1.Email.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[m1.Password.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[m1.NumberPassword.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            f127598b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @jn0.e
    public /* synthetic */ SimpleTextSpec(int i11, @ro0.o("api_path") IdentifierSpec identifierSpec, @ro0.o(AnnotatedPrivateKey.LABEL) int i12, @ro0.o("capitalization") z zVar, @ro0.o("keyboard_type") m1 m1Var, @ro0.o("show_optional_label") boolean z11, vo0.v1 v1Var) {
        super(null);
        if (3 != (i11 & 3)) {
            vo0.h1.b(i11, 3, a.f127596a.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.label = i12;
        if ((i11 & 4) == 0) {
            this.capitalization = z.None;
        } else {
            this.capitalization = zVar;
        }
        if ((i11 & 8) == 0) {
            this.keyboardType = m1.Ascii;
        } else {
            this.keyboardType = m1Var;
        }
        if ((i11 & 16) == 0) {
            this.showOptionalLabel = false;
        } else {
            this.showOptionalLabel = z11;
        }
    }

    public static final /* synthetic */ void g(SimpleTextSpec self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f127590g;
        output.D(serialDesc, 0, IdentifierSpec.a.f76565a, self.getApiPath());
        output.x(serialDesc, 1, self.label);
        if (output.G(serialDesc, 2) || self.capitalization != z.None) {
            output.D(serialDesc, 2, dVarArr[2], self.capitalization);
        }
        if (output.G(serialDesc, 3) || self.keyboardType != m1.Ascii) {
            output.D(serialDesc, 3, dVarArr[3], self.keyboardType);
        }
        if (output.G(serialDesc, 4) || self.showOptionalLabel) {
            output.A(serialDesc, 4, self.showOptionalLabel);
        }
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
        if (!(other instanceof SimpleTextSpec)) {
            return false;
        }
        SimpleTextSpec simpleTextSpec = (SimpleTextSpec) other;
        return p013kotlin.jvm.internal.s.f(this.apiPath, simpleTextSpec.apiPath) && this.label == simpleTextSpec.label && this.capitalization == simpleTextSpec.capitalization && this.keyboardType == simpleTextSpec.keyboardType && this.showOptionalLabel == simpleTextSpec.showOptionalLabel;
    }

    public final SectionElement f(Map<IdentifierSpec, String> initialValues) {
        int iB;
        int iH;
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        IdentifierSpec apiPath = getApiPath();
        Integer numValueOf = Integer.valueOf(this.label);
        int i11 = d.f127597a[this.capitalization.ordinal()];
        if (i11 == 1) {
            iB = o4.x.INSTANCE.b();
        } else if (i11 == 2) {
            iB = o4.x.INSTANCE.a();
        } else if (i11 == 3) {
            iB = o4.x.INSTANCE.e();
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iB = o4.x.INSTANCE.c();
        }
        switch (d.f127598b[this.keyboardType.ordinal()]) {
            case 1:
                iH = o4.y.INSTANCE.h();
                break;
            case 2:
                iH = o4.y.INSTANCE.a();
                break;
            case 3:
                iH = o4.y.INSTANCE.d();
                break;
            case 4:
                iH = o4.y.INSTANCE.g();
                break;
            case 5:
                iH = o4.y.INSTANCE.j();
                break;
            case 6:
                iH = o4.y.INSTANCE.c();
                break;
            case 7:
                iH = o4.y.INSTANCE.f();
                break;
            case 8:
                iH = o4.y.INSTANCE.e();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return e1.c(this, new SimpleTextElement(apiPath, new p010i90.r1(new p010i90.q1(numValueOf, iB, iH, null, 8, null), this.showOptionalLabel, initialValues.get(getApiPath()))), null, 2, null);
    }

    public int hashCode() {
        return (((((((this.apiPath.hashCode() * 31) + Integer.hashCode(this.label)) * 31) + this.capitalization.hashCode()) * 31) + this.keyboardType.hashCode()) * 31) + Boolean.hashCode(this.showOptionalLabel);
    }

    public String toString() {
        return "SimpleTextSpec(apiPath=" + this.apiPath + ", label=" + this.label + ", capitalization=" + this.capitalization + ", keyboardType=" + this.keyboardType + ", showOptionalLabel=" + this.showOptionalLabel + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeParcelable(this.apiPath, flags);
        parcel.writeInt(this.label);
        parcel.writeString(this.capitalization.name());
        parcel.writeString(this.keyboardType.name());
        parcel.writeInt(this.showOptionalLabel ? 1 : 0);
    }

    public /* synthetic */ SimpleTextSpec(IdentifierSpec identifierSpec, int i11, z zVar, m1 m1Var, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i11, (i12 & 4) != 0 ? z.None : zVar, (i12 & 8) != 0 ? m1.Ascii : m1Var, (i12 & 16) != 0 ? false : z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTextSpec(IdentifierSpec apiPath, int i11, z capitalization, m1 keyboardType, boolean z11) {
        super(null);
        p013kotlin.jvm.internal.s.k(apiPath, "apiPath");
        p013kotlin.jvm.internal.s.k(capitalization, "capitalization");
        p013kotlin.jvm.internal.s.k(keyboardType, "keyboardType");
        this.apiPath = apiPath;
        this.label = i11;
        this.capitalization = capitalization;
        this.keyboardType = keyboardType;
        this.showOptionalLabel = z11;
    }
}
