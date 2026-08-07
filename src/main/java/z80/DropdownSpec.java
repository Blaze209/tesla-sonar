package z80;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.UnknownFieldException;
import p010i90.IdentifierSpec;
import p010i90.SectionElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.v0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002-3B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBE\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u001b2\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010+\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00102\u001a\u0004\b5\u00106R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u00102\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lz80/v0;", "Lz80/e1;", "Li90/g0;", "apiPath", "Lz80/o2;", "labelTranslationId", "", "Lz80/u0;", "items", "<init>", "(Li90/g0;Lz80/o2;Ljava/util/List;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILi90/g0;Lz80/o2;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lz80/v0;Luo0/d;Lto0/f;)V", "", "", "initialValues", "Li90/g1;", "f", "(Ljava/util/Map;)Li90/g1;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Li90/g0;", "e", "()Li90/g0;", "getApiPath$annotations", "()V", "b", "Lz80/o2;", "getLabelTranslationId", "()Lz80/o2;", "getLabelTranslationId$annotations", "c", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class DropdownSpec extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec apiPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final o2 labelTranslationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DropdownItemSpec> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f127843d = 8;
    public static final Parcelable.Creator<DropdownSpec> CREATOR = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d<Object>[] f127844e = {null, o2.INSTANCE.serializer(), new vo0.e(DropdownItemSpec.a.f127831a)};

    /* JADX INFO: renamed from: z80.v0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/DropdownSpec.$serializer", "Lvo0/e0;", "Lz80/v0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/v0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/v0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<DropdownSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127848a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127848a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.DropdownSpec", aVar, 3);
            m1Var.o("api_path", false);
            m1Var.o("translation_id", false);
            m1Var.o("items", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DropdownSpec deserialize(uo0.e decoder) {
            int i11;
            IdentifierSpec identifierSpec;
            o2 o2Var;
            List list;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = DropdownSpec.f127844e;
            IdentifierSpec identifierSpec2 = null;
            if (cVarB.i()) {
                IdentifierSpec identifierSpec3 = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, null);
                o2 o2Var2 = (o2) cVarB.n(descriptor2, 1, dVarArr[1], null);
                list = (List) cVarB.n(descriptor2, 2, dVarArr[2], null);
                identifierSpec = identifierSpec3;
                i11 = 7;
                o2Var = o2Var2;
            } else {
                boolean z11 = true;
                int i12 = 0;
                o2 o2Var3 = null;
                List list2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        identifierSpec2 = (IdentifierSpec) cVarB.n(descriptor2, 0, IdentifierSpec.a.f76565a, identifierSpec2);
                        i12 |= 1;
                    } else if (iA == 1) {
                        o2Var3 = (o2) cVarB.n(descriptor2, 1, dVarArr[1], o2Var3);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        list2 = (List) cVarB.n(descriptor2, 2, dVarArr[2], list2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                identifierSpec = identifierSpec2;
                o2Var = o2Var3;
                list = list2;
            }
            cVarB.c(descriptor2);
            return new DropdownSpec(i11, identifierSpec, o2Var, list, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, DropdownSpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            DropdownSpec.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = DropdownSpec.f127844e;
            return new ro0.d[]{IdentifierSpec.a.f76565a, dVarArr[1], dVarArr[2]};
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

    /* JADX INFO: renamed from: z80.v0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/v0$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/v0;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<DropdownSpec> serializer() {
            return a.f127848a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.v0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<DropdownSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DropdownSpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            IdentifierSpec identifierSpec = (IdentifierSpec) parcel.readParcelable(DropdownSpec.class.getClassLoader());
            o2 o2VarValueOf = o2.valueOf(parcel.readString());
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(DropdownItemSpec.CREATOR.createFromParcel(parcel));
            }
            return new DropdownSpec(identifierSpec, o2VarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DropdownSpec[] newArray(int i11) {
            return new DropdownSpec[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @jn0.e
    public /* synthetic */ DropdownSpec(int i11, @ro0.o("api_path") IdentifierSpec identifierSpec, @ro0.o("translation_id") o2 o2Var, @ro0.o("items") List list, vo0.v1 v1Var) {
        super(null);
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f127848a.getDescriptor());
        }
        this.apiPath = identifierSpec;
        this.labelTranslationId = o2Var;
        this.items = list;
    }

    public static final /* synthetic */ void g(DropdownSpec self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f127844e;
        output.D(serialDesc, 0, IdentifierSpec.a.f76565a, self.getApiPath());
        output.D(serialDesc, 1, dVarArr[1], self.labelTranslationId);
        output.D(serialDesc, 2, dVarArr[2], self.items);
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
        if (!(other instanceof DropdownSpec)) {
            return false;
        }
        DropdownSpec dropdownSpec = (DropdownSpec) other;
        return p013kotlin.jvm.internal.s.f(this.apiPath, dropdownSpec.apiPath) && this.labelTranslationId == dropdownSpec.labelTranslationId && p013kotlin.jvm.internal.s.f(this.items, dropdownSpec.items);
    }

    public final SectionElement f(Map<IdentifierSpec, String> initialValues) {
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        return e1.c(this, new SimpleDropdownElement(getApiPath(), new p010i90.y(new i2(this.labelTranslationId.getResourceId(), this.items), initialValues.get(getApiPath()))), null, 2, null);
    }

    public int hashCode() {
        return (((this.apiPath.hashCode() * 31) + this.labelTranslationId.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "DropdownSpec(apiPath=" + this.apiPath + ", labelTranslationId=" + this.labelTranslationId + ", items=" + this.items + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeParcelable(this.apiPath, flags);
        parcel.writeString(this.labelTranslationId.name());
        List<DropdownItemSpec> list = this.items;
        parcel.writeInt(list.size());
        Iterator<DropdownItemSpec> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownSpec(IdentifierSpec apiPath, o2 labelTranslationId, List<DropdownItemSpec> items) {
        super(null);
        p013kotlin.jvm.internal.s.k(apiPath, "apiPath");
        p013kotlin.jvm.internal.s.k(labelTranslationId, "labelTranslationId");
        p013kotlin.jvm.internal.s.k(items, "items");
        this.apiPath = apiPath;
        this.labelTranslationId = labelTranslationId;
        this.items = items;
    }
}
