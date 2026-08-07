package z80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.g2, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0002(-B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0001\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010&\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR0\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u0010,\u001a\u0004\b-\u0010/R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u0010,\u001a\u0004\b1\u00103¨\u00066"}, d2 = {"Lz80/g2;", "Landroid/os/Parcelable;", "", "type", "Ljava/util/ArrayList;", "Lz80/e1;", "Lkotlin/collections/ArrayList;", "fields", "Lz80/e2;", "selectorIcon", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;Lz80/e2;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/ArrayList;Lz80/e2;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lz80/g2;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "b", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "getFields$annotations", "c", "Lz80/e2;", "()Lz80/e2;", "getSelectorIcon$annotations", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class SharedDataSpec implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ArrayList<e1> fields;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final SelectorIcon selectorIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f127475d = 8;
    public static final Parcelable.Creator<SharedDataSpec> CREATOR = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d<Object>[] f127476e = {null, new vo0.e(f1.f127458c), null};

    /* JADX INFO: renamed from: z80.g2$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/SharedDataSpec.$serializer", "Lvo0/e0;", "Lz80/g2;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/g2;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/g2;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<SharedDataSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127480a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127480a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.SharedDataSpec", aVar, 3);
            m1Var.o("type", false);
            m1Var.o("fields", true);
            m1Var.o("selector_icon", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SharedDataSpec deserialize(uo0.e decoder) {
            int i11;
            String str;
            ArrayList arrayList;
            SelectorIcon e2Var;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = SharedDataSpec.f127476e;
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                arrayList = (ArrayList) cVarB.n(descriptor2, 1, dVarArr[1], null);
                str = strT2;
                e2Var = (SelectorIcon) cVarB.v(descriptor2, 2, SelectorIcon.a.f127446a, null);
                i11 = 7;
            } else {
                boolean z11 = true;
                int i12 = 0;
                ArrayList arrayList2 = null;
                SelectorIcon e2Var2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        arrayList2 = (ArrayList) cVarB.n(descriptor2, 1, dVarArr[1], arrayList2);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        e2Var2 = (SelectorIcon) cVarB.v(descriptor2, 2, SelectorIcon.a.f127446a, e2Var2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                str = strT;
                arrayList = arrayList2;
                e2Var = e2Var2;
            }
            cVarB.c(descriptor2);
            return new SharedDataSpec(i11, str, arrayList, e2Var, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, SharedDataSpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            SharedDataSpec.d(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{vo0.z1.f119730a, SharedDataSpec.f127476e[1], so0.a.p(SelectorIcon.a.f127446a)};
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

    /* JADX INFO: renamed from: z80.g2$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/g2$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/g2;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<SharedDataSpec> serializer() {
            return a.f127480a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.g2$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SharedDataSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedDataSpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(SharedDataSpec.class.getClassLoader()));
            }
            return new SharedDataSpec(string, arrayList, parcel.readInt() == 0 ? null : SelectorIcon.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedDataSpec[] newArray(int i11) {
            return new SharedDataSpec[i11];
        }
    }

    @jn0.e
    public /* synthetic */ SharedDataSpec(int i11, @ro0.o("type") String str, @ro0.o("fields") ArrayList arrayList, @ro0.o("selector_icon") SelectorIcon e2Var, vo0.v1 v1Var) {
        if (1 != (i11 & 1)) {
            vo0.h1.b(i11, 1, a.f127480a.getDescriptor());
        }
        this.type = str;
        if ((i11 & 2) == 0) {
            this.fields = new ArrayList<>();
        } else {
            this.fields = arrayList;
        }
        if ((i11 & 4) == 0) {
            this.selectorIcon = null;
        } else {
            this.selectorIcon = e2Var;
        }
    }

    public static final /* synthetic */ void d(SharedDataSpec self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f127476e;
        output.e(serialDesc, 0, self.type);
        if (output.G(serialDesc, 1) || !p013kotlin.jvm.internal.s.f(self.fields, new ArrayList())) {
            output.D(serialDesc, 1, dVarArr[1], self.fields);
        }
        if (!output.G(serialDesc, 2) && self.selectorIcon == null) {
            return;
        }
        output.y(serialDesc, 2, SelectorIcon.a.f127446a, self.selectorIcon);
    }

    public final ArrayList<e1> b() {
        return this.fields;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SelectorIcon getSelectorIcon() {
        return this.selectorIcon;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedDataSpec)) {
            return false;
        }
        SharedDataSpec sharedDataSpec = (SharedDataSpec) other;
        return p013kotlin.jvm.internal.s.f(this.type, sharedDataSpec.type) && p013kotlin.jvm.internal.s.f(this.fields, sharedDataSpec.fields) && p013kotlin.jvm.internal.s.f(this.selectorIcon, sharedDataSpec.selectorIcon);
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.fields.hashCode()) * 31;
        SelectorIcon e2Var = this.selectorIcon;
        return iHashCode + (e2Var == null ? 0 : e2Var.hashCode());
    }

    public String toString() {
        return "SharedDataSpec(type=" + this.type + ", fields=" + this.fields + ", selectorIcon=" + this.selectorIcon + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.type);
        ArrayList<e1> arrayList = this.fields;
        parcel.writeInt(arrayList.size());
        Iterator<e1> it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
        SelectorIcon e2Var = this.selectorIcon;
        if (e2Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            e2Var.writeToParcel(parcel, flags);
        }
    }

    public SharedDataSpec(String type, ArrayList<e1> fields, SelectorIcon e2Var) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(fields, "fields");
        this.type = type;
        this.fields = fields;
        this.selectorIcon = e2Var;
    }
}
