package z80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.UnknownFieldException;
import p010i90.CountryElement;
import p010i90.IdentifierSpec;
import p010i90.SameAsShippingElement;
import p010i90.SectionElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u00024:BO\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010BU\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\"\u001a\u0004\u0018\u00010!2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001e2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010#JX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00102\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b2\u00103R \u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00109\u001a\u0004\b<\u0010=R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010;\u0012\u0004\bA\u00109\u001a\u0004\b@\u0010=R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u00109\u001a\u0004\bD\u0010ER \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010G\u0012\u0004\bJ\u00109\u001a\u0004\bH\u0010IR \u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bK\u0010C\u0012\u0004\bM\u00109\u001a\u0004\bL\u0010E¨\u0006O"}, d2 = {"Lz80/a;", "Lz80/e1;", "Landroid/os/Parcelable;", "Li90/g0;", "apiPath", "", "", "allowedCountryCodes", "Lz80/t0;", "displayFields", "", "showLabel", "Li90/i;", "type", "hideCountry", "<init>", "(Li90/g0;Ljava/util/Set;Ljava/util/Set;ZLi90/i;Z)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILi90/g0;Ljava/util/Set;Ljava/util/Set;ZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lz80/a;Luo0/d;Lto0/f;)V", "", "initialValues", "shippingValues", "Li90/g1;", "h", "(Ljava/util/Map;Ljava/util/Map;)Li90/g1;", "e", "(Li90/g0;Ljava/util/Set;Ljava/util/Set;ZLi90/i;Z)Lz80/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Li90/g0;", "g", "()Li90/g0;", "getApiPath$annotations", "()V", "b", "Ljava/util/Set;", "getAllowedCountryCodes", "()Ljava/util/Set;", "getAllowedCountryCodes$annotations", "c", "getDisplayFields", "getDisplayFields$annotations", DateTokenConverter.CONVERTER_KEY, "Z", "getShowLabel", "()Z", "getShowLabel$annotations", "Li90/i;", "getType", "()Li90/i;", "getType$annotations", "f", "getHideCountry", "getHideCountry$annotations", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class AddressSpec extends e1 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec apiPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<String> allowedCountryCodes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<t0> displayFields;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final p010i90.i type;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hideCountry;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f127331g = 8;
    public static final Parcelable.Creator<AddressSpec> CREATOR = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ro0.d<Object>[] f127332h = {null, new vo0.o0(vo0.z1.f119730a), new vo0.o0(t0.INSTANCE.serializer()), null};

    /* JADX INFO: renamed from: z80.a$a, reason: collision with other inner class name */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/AddressSpec.$serializer", "Lvo0/e0;", "Lz80/a;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/a;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/a;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C2767a implements vo0.e0<AddressSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2767a f127339a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            C2767a c2767a = new C2767a();
            f127339a = c2767a;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.AddressSpec", c2767a, 4);
            m1Var.o("api_path", true);
            m1Var.o("allowed_country_codes", true);
            m1Var.o("display_fields", true);
            m1Var.o("show_label", true);
            descriptor = m1Var;
        }

        private C2767a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AddressSpec deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            IdentifierSpec identifierSpec;
            Set set;
            Set set2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = AddressSpec.f127332h;
            if (cVarB.i()) {
                IdentifierSpec identifierSpec2 = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, null);
                Set set3 = (Set) cVarB.n(descriptor2, 1, dVarArr[1], null);
                set2 = (Set) cVarB.n(descriptor2, 2, dVarArr[2], null);
                identifierSpec = identifierSpec2;
                zW = cVarB.w(descriptor2, 3);
                i11 = 15;
                set = set3;
            } else {
                boolean z11 = true;
                boolean zW2 = false;
                IdentifierSpec identifierSpec3 = null;
                Set set4 = null;
                Set set5 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        identifierSpec3 = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, identifierSpec3);
                        i12 |= 1;
                    } else if (iA == 1) {
                        set4 = (Set) cVarB.n(descriptor2, 1, dVarArr[1], set4);
                        i12 |= 2;
                    } else if (iA == 2) {
                        set5 = (Set) cVarB.n(descriptor2, 2, dVarArr[2], set5);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        zW2 = cVarB.w(descriptor2, 3);
                        i12 |= 8;
                    }
                }
                zW = zW2;
                i11 = i12;
                identifierSpec = identifierSpec3;
                set = set4;
                set2 = set5;
            }
            cVarB.c(descriptor2);
            return new AddressSpec(i11, identifierSpec, set, set2, zW, (vo0.v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, AddressSpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            AddressSpec.i(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = AddressSpec.f127332h;
            return new ro0.d[]{IdentifierSpec.a.f76565a, dVarArr[1], dVarArr[2], vo0.h.f119620a};
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

    /* JADX INFO: renamed from: z80.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/a$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/a;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<AddressSpec> serializer() {
            return C2767a.f127339a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.a$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<AddressSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AddressSpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            IdentifierSpec identifierSpec = (IdentifierSpec) parcel.readParcelable(AddressSpec.class.getClassLoader());
            int i11 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashSet.add(parcel.readString());
            }
            int i13 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                linkedHashSet2.add(t0.valueOf(parcel.readString()));
            }
            boolean z11 = true;
            if (parcel.readInt() == 0) {
                z11 = false;
            }
            return new AddressSpec(identifierSpec, linkedHashSet, linkedHashSet2, z11, (p010i90.i) parcel.readParcelable(AddressSpec.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AddressSpec[] newArray(int i11) {
            return new AddressSpec[i11];
        }
    }

    public AddressSpec() {
        this(null, null, null, false, null, false, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressSpec f(AddressSpec addressSpec, IdentifierSpec identifierSpec, Set set, Set set2, boolean z11, p010i90.i iVar, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            identifierSpec = addressSpec.apiPath;
        }
        if ((i11 & 2) != 0) {
            set = addressSpec.allowedCountryCodes;
        }
        if ((i11 & 4) != 0) {
            set2 = addressSpec.displayFields;
        }
        if ((i11 & 8) != 0) {
            z11 = addressSpec.showLabel;
        }
        if ((i11 & 16) != 0) {
            iVar = addressSpec.type;
        }
        if ((i11 & 32) != 0) {
            z12 = addressSpec.hideCountry;
        }
        p010i90.i iVar2 = iVar;
        boolean z13 = z12;
        return addressSpec.e(identifierSpec, set, set2, z11, iVar2, z13);
    }

    public static final /* synthetic */ void i(AddressSpec self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f127332h;
        if (output.G(serialDesc, 0) || !p013kotlin.jvm.internal.s.f(self.getApiPath(), IdentifierSpec.INSTANCE.a("billing_details[address]"))) {
            output.D(serialDesc, 0, IdentifierSpec.a.f76565a, self.getApiPath());
        }
        if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.allowedCountryCodes, t30.d.f112276a.h())) {
            output.D(serialDesc, 1, dVarArr[1], self.allowedCountryCodes);
        }
        if (output.G(serialDesc, 2) || !p013kotlin.jvm.internal.s.f(self.displayFields, p013kotlin.collections.d1.d())) {
            output.D(serialDesc, 2, dVarArr[2], self.displayFields);
        }
        if (!output.G(serialDesc, 3) && self.showLabel) {
            return;
        }
        output.A(serialDesc, 3, self.showLabel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final AddressSpec e(IdentifierSpec apiPath, Set<String> allowedCountryCodes, Set<? extends t0> displayFields, boolean showLabel, p010i90.i type, boolean hideCountry) {
        p013kotlin.jvm.internal.s.k(apiPath, "apiPath");
        p013kotlin.jvm.internal.s.k(allowedCountryCodes, "allowedCountryCodes");
        p013kotlin.jvm.internal.s.k(displayFields, "displayFields");
        p013kotlin.jvm.internal.s.k(type, "type");
        return new AddressSpec(apiPath, allowedCountryCodes, displayFields, showLabel, type, hideCountry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSpec)) {
            return false;
        }
        AddressSpec addressSpec = (AddressSpec) other;
        return p013kotlin.jvm.internal.s.f(this.apiPath, addressSpec.apiPath) && p013kotlin.jvm.internal.s.f(this.allowedCountryCodes, addressSpec.allowedCountryCodes) && p013kotlin.jvm.internal.s.f(this.displayFields, addressSpec.displayFields) && this.showLabel == addressSpec.showLabel && p013kotlin.jvm.internal.s.f(this.type, addressSpec.type) && this.hideCountry == addressSpec.hideCountry;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public IdentifierSpec getApiPath() {
        return this.apiPath;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0093  */
    public final SectionElement h(Map<IdentifierSpec, String> initialValues, Map<IdentifierSpec, String> shippingValues) {
        SameAsShippingElement d1Var;
        Boolean boolE1;
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        Integer numValueOf = this.showLabel ? Integer.valueOf(w80.n.f121516j) : null;
        if (this.displayFields.size() == 1 && p013kotlin.collections.v.n0(this.displayFields) == t0.Country) {
            SectionElement sectionElementA = a(new CountryElement(IdentifierSpec.INSTANCE.a("billing_details[address][country]"), new p010i90.y(new p010i90.t(this.allowedCountryCodes, null, false, false, null, null, 62, null), initialValues.get(getApiPath()))), numValueOf);
            if (this.hideCountry) {
                return null;
            }
            return sectionElementA;
        }
        if (shippingValues != null) {
            IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
            String str = shippingValues.get(companion.w());
            if (str == null || (boolE1 = p013kotlin.text.t.E1(str)) == null) {
                d1Var = null;
            } else {
                d1Var = new SameAsShippingElement(companion.w(), new p010i90.c1(boolE1.booleanValue()));
            }
        } else {
            d1Var = null;
        }
        return b(p013kotlin.collections.v.r(new p010i90.b(getApiPath(), initialValues, this.type, this.allowedCountryCodes, null, d1Var, shippingValues, null, this.hideCountry, 144, null), d1Var), numValueOf);
    }

    public int hashCode() {
        return (((((((((this.apiPath.hashCode() * 31) + this.allowedCountryCodes.hashCode()) * 31) + this.displayFields.hashCode()) * 31) + Boolean.hashCode(this.showLabel)) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.hideCountry);
    }

    public String toString() {
        return "AddressSpec(apiPath=" + this.apiPath + ", allowedCountryCodes=" + this.allowedCountryCodes + ", displayFields=" + this.displayFields + ", showLabel=" + this.showLabel + ", type=" + this.type + ", hideCountry=" + this.hideCountry + ")";
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
        Set<t0> set2 = this.displayFields;
        parcel.writeInt(set2.size());
        Iterator<t0> it2 = set2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next().name());
        }
        parcel.writeInt(this.showLabel ? 1 : 0);
        parcel.writeParcelable(this.type, flags);
        parcel.writeInt(this.hideCountry ? 1 : 0);
    }

    @jn0.e
    public /* synthetic */ AddressSpec(int i11, @ro0.o("api_path") IdentifierSpec identifierSpec, @ro0.o("allowed_country_codes") Set set, @ro0.o("display_fields") Set set2, @ro0.o("show_label") boolean z11, vo0.v1 v1Var) {
        super(null);
        this.apiPath = (i11 & 1) == 0 ? IdentifierSpec.INSTANCE.a("billing_details[address]") : identifierSpec;
        if ((i11 & 2) == 0) {
            this.allowedCountryCodes = t30.d.f112276a.h();
        } else {
            this.allowedCountryCodes = set;
        }
        if ((i11 & 4) == 0) {
            this.displayFields = p013kotlin.collections.d1.d();
        } else {
            this.displayFields = set2;
        }
        if ((i11 & 8) == 0) {
            this.showLabel = true;
        } else {
            this.showLabel = z11;
        }
        this.type = new p010i90.i.Normal(null, 1, null);
        this.hideCountry = false;
    }

    public /* synthetic */ AddressSpec(IdentifierSpec identifierSpec, Set set, Set set2, boolean z11, p010i90.i iVar, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.INSTANCE.a("billing_details[address]") : identifierSpec, (Set<String>) ((i11 & 2) != 0 ? t30.d.f112276a.h() : set), (Set<? extends t0>) ((i11 & 4) != 0 ? p013kotlin.collections.d1.d() : set2), (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? new p010i90.i.Normal(null, 1, null) : iVar, (i11 & 32) != 0 ? false : z12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AddressSpec(IdentifierSpec apiPath, Set<String> allowedCountryCodes, Set<? extends t0> displayFields, boolean z11, p010i90.i type, boolean z12) {
        super(null);
        p013kotlin.jvm.internal.s.k(apiPath, "apiPath");
        p013kotlin.jvm.internal.s.k(allowedCountryCodes, "allowedCountryCodes");
        p013kotlin.jvm.internal.s.k(displayFields, "displayFields");
        p013kotlin.jvm.internal.s.k(type, "type");
        this.apiPath = apiPath;
        this.allowedCountryCodes = allowedCountryCodes;
        this.displayFields = displayFields;
        this.showLabel = z11;
        this.type = type;
        this.hideCountry = z12;
    }
}
