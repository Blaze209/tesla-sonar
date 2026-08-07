package b90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.o;
import ro0.p;
import vo0.e0;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: b90.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002\u001e#B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBE\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0017R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010%\u0012\u0004\b(\u0010\"\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lb90/b;", "", "", "shortName", "longName", "", "types", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "e", "(Lb90/b;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getShortName$annotations", "()V", "b", "getLongName$annotations", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "getTypes$annotations", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final /* data */ class AddressComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16905d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d<Object>[] f16906e = {null, null, new vo0.e(z1.f119730a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String longName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> types;

    /* JADX INFO: renamed from: b90.b$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/autocomplete/model/AddressComponent.$serializer", "Lvo0/e0;", "Lb90/b;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lb90/b;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lb90/b;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e0<AddressComponent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16910a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f16910a = aVar;
            m1 m1Var = new m1("com.stripe.android.ui.core.elements.autocomplete.model.AddressComponent", aVar, 3);
            m1Var.o("short_name", false);
            m1Var.o("long_name", false);
            m1Var.o("types", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AddressComponent deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            List list;
            s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = AddressComponent.f16906e;
            String str3 = null;
            if (cVarB.i()) {
                String str4 = (String) cVarB.v(descriptor2, 0, z1.f119730a, null);
                String strT = cVarB.t(descriptor2, 1);
                list = (List) cVarB.n(descriptor2, 2, dVarArr[2], null);
                str = str4;
                i11 = 7;
                str2 = strT;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String strT2 = null;
                List list2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        str3 = (String) cVarB.v(descriptor2, 0, z1.f119730a, str3);
                        i12 |= 1;
                    } else if (iA == 1) {
                        strT2 = cVarB.t(descriptor2, 1);
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
                str = str3;
                str2 = strT2;
                list = list2;
            }
            cVarB.c(descriptor2);
            return new AddressComponent(i11, str, str2, list, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, AddressComponent value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            AddressComponent.e(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = AddressComponent.f16906e;
            z1 z1Var = z1.f119730a;
            return new ro0.d[]{so0.a.p(z1Var), z1Var, dVarArr[2]};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: b90.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb90/b$b;", "", "<init>", "()V", "Lro0/d;", "Lb90/b;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<AddressComponent> serializer() {
            return a.f16910a;
        }

        private Companion() {
        }
    }

    @jn0.e
    public /* synthetic */ AddressComponent(int i11, @o("short_name") String str, @o("long_name") String str2, @o("types") List list, v1 v1Var) {
        if (7 != (i11 & 7)) {
            h1.b(i11, 7, a.f16910a.getDescriptor());
        }
        this.shortName = str;
        this.longName = str2;
        this.types = list;
    }

    public static final /* synthetic */ void e(AddressComponent self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f16906e;
        output.y(serialDesc, 0, z1.f119730a, self.shortName);
        output.e(serialDesc, 1, self.longName);
        output.D(serialDesc, 2, dVarArr[2], self.types);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLongName() {
        return this.longName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    public final List<String> d() {
        return this.types;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressComponent)) {
            return false;
        }
        AddressComponent addressComponent = (AddressComponent) other;
        return s.f(this.shortName, addressComponent.shortName) && s.f(this.longName, addressComponent.longName) && s.f(this.types, addressComponent.types);
    }

    public int hashCode() {
        String str = this.shortName;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.longName.hashCode()) * 31) + this.types.hashCode();
    }

    public String toString() {
        return "AddressComponent(shortName=" + this.shortName + ", longName=" + this.longName + ", types=" + this.types + ")";
    }

    public AddressComponent(String str, String longName, List<String> types) {
        s.k(longName, "longName");
        s.k(types, "types");
        this.shortName = str;
        this.longName = longName;
        this.types = types;
    }
}
