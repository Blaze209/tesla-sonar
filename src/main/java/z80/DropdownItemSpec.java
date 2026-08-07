package z80;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.u0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002#'B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010$\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lz80/u0;", "Landroid/os/Parcelable;", "", "apiValue", "displayText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lz80/u0;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getApiValue$annotations", "()V", "b", "getDisplayText$annotations", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class DropdownItemSpec implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apiValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DropdownItemSpec> CREATOR = new c();

    /* JADX INFO: renamed from: z80.u0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/DropdownItemSpec.$serializer", "Lvo0/e0;", "Lz80/u0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/u0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/u0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<DropdownItemSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127831a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127831a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.DropdownItemSpec", aVar, 2);
            m1Var.o("api_value", true);
            m1Var.o("display_text", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DropdownItemSpec deserialize(uo0.e decoder) {
            String str;
            String strT;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            vo0.v1 v1Var = null;
            if (cVarB.i()) {
                str = (String) cVarB.v(descriptor2, 0, vo0.z1.f119730a, null);
                strT = cVarB.t(descriptor2, 1);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                str = null;
                String strT2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        str = (String) cVarB.v(descriptor2, 0, vo0.z1.f119730a, str);
                        i12 |= 1;
                    } else {
                        if (iA != 1) {
                            throw new UnknownFieldException(iA);
                        }
                        strT2 = cVarB.t(descriptor2, 1);
                        i12 |= 2;
                    }
                }
                strT = strT2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new DropdownItemSpec(i11, str, strT, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, DropdownItemSpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            DropdownItemSpec.c(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{so0.a.p(z1Var), z1Var};
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

    /* JADX INFO: renamed from: z80.u0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/u0$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/u0;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<DropdownItemSpec> serializer() {
            return a.f127831a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.u0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<DropdownItemSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DropdownItemSpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new DropdownItemSpec(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DropdownItemSpec[] newArray(int i11) {
            return new DropdownItemSpec[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropdownItemSpec() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void c(DropdownItemSpec self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.apiValue != null) {
            output.y(serialDesc, 0, vo0.z1.f119730a, self.apiValue);
        }
        if (!output.G(serialDesc, 1) && p013kotlin.jvm.internal.s.f(self.displayText, "Other")) {
            return;
        }
        output.e(serialDesc, 1, self.displayText);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApiValue() {
        return this.apiValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDisplayText() {
        return this.displayText;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownItemSpec)) {
            return false;
        }
        DropdownItemSpec dropdownItemSpec = (DropdownItemSpec) other;
        return p013kotlin.jvm.internal.s.f(this.apiValue, dropdownItemSpec.apiValue) && p013kotlin.jvm.internal.s.f(this.displayText, dropdownItemSpec.displayText);
    }

    public int hashCode() {
        String str = this.apiValue;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.displayText.hashCode();
    }

    public String toString() {
        return "DropdownItemSpec(apiValue=" + this.apiValue + ", displayText=" + this.displayText + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.apiValue);
        parcel.writeString(this.displayText);
    }

    @jn0.e
    public /* synthetic */ DropdownItemSpec(int i11, @ro0.o("api_value") String str, @ro0.o("display_text") String str2, vo0.v1 v1Var) {
        this.apiValue = (i11 & 1) == 0 ? null : str;
        if ((i11 & 2) == 0) {
            this.displayText = "Other";
        } else {
            this.displayText = str2;
        }
    }

    public DropdownItemSpec(String str, String displayText) {
        p013kotlin.jvm.internal.s.k(displayText, "displayText");
        this.apiValue = str;
        this.displayText = displayText;
    }

    public /* synthetic */ DropdownItemSpec(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? "Other" : str2);
    }
}
