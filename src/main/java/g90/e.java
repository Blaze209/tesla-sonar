package g90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002\u0019\u001fB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBO\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u001c\b\u0001\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR0\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\"R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010$\u0012\u0004\b&\u0010\u001e\u001a\u0004\b\u001f\u0010%¨\u0006("}, d2 = {"Lg90/e;", "", "", "isNumeric", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "examples", "Lg90/g;", "nameType", "<init>", "(ZLjava/util/ArrayList;Lg90/g;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(IZLjava/util/ArrayList;Lg90/g;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lg90/e;Luo0/d;Lto0/f;)V", "a", "Z", "c", "()Z", "isNumeric$annotations", "()V", "b", "Ljava/util/ArrayList;", "getExamples", "()Ljava/util/ArrayList;", "getExamples$annotations", "Lg90/g;", "()Lg90/g;", "getNameType$annotations", "Companion", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final class e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67661d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d<Object>[] f67662e = {null, new vo0.e(z1.f119730a), g.INSTANCE.serializer()};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isNumeric;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<String> examples;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g nameType;

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/uicore/address/FieldSchema.$serializer", "Lvo0/e0;", "Lg90/e;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg90/e;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg90/e;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e0<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f67666a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f67666a = aVar;
            m1 m1Var = new m1("com.stripe.android.uicore.address.FieldSchema", aVar, 3);
            m1Var.o("isNumeric", true);
            m1Var.o("examples", true);
            m1Var.o("nameType", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            ArrayList arrayList;
            g gVar;
            s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = e.f67662e;
            if (cVarB.i()) {
                zW = cVarB.w(descriptor2, 0);
                ArrayList arrayList2 = (ArrayList) cVarB.n(descriptor2, 1, dVarArr[1], null);
                gVar = (g) cVarB.n(descriptor2, 2, dVarArr[2], null);
                i11 = 7;
                arrayList = arrayList2;
            } else {
                boolean z11 = true;
                zW = false;
                ArrayList arrayList3 = null;
                g gVar2 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        zW = cVarB.w(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        arrayList3 = (ArrayList) cVarB.n(descriptor2, 1, dVarArr[1], arrayList3);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        gVar2 = (g) cVarB.n(descriptor2, 2, dVarArr[2], gVar2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                arrayList = arrayList3;
                gVar = gVar2;
            }
            boolean z12 = zW;
            cVarB.c(descriptor2);
            return new e(i11, z12, arrayList, gVar, (v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, e value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            e.d(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?>[] dVarArr = e.f67662e;
            return new ro0.d[]{vo0.h.f119620a, dVarArr[1], dVarArr[2]};
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

    /* JADX INFO: renamed from: g90.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg90/e$b;", "", "<init>", "()V", "Lro0/d;", "Lg90/e;", "serializer", "()Lro0/d;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<e> serializer() {
            return a.f67666a;
        }

        private Companion() {
        }
    }

    @jn0.e
    public /* synthetic */ e(int i11, @o("isNumeric") boolean z11, @o("examples") ArrayList arrayList, @o("nameType") g gVar, v1 v1Var) {
        if (4 != (i11 & 4)) {
            h1.b(i11, 4, a.f67666a.getDescriptor());
        }
        this.isNumeric = (i11 & 1) == 0 ? false : z11;
        if ((i11 & 2) == 0) {
            this.examples = new ArrayList<>();
        } else {
            this.examples = arrayList;
        }
        this.nameType = gVar;
    }

    public static final /* synthetic */ void d(e self, uo0.d output, to0.f serialDesc) {
        ro0.d<Object>[] dVarArr = f67662e;
        if (output.G(serialDesc, 0) || self.isNumeric) {
            output.A(serialDesc, 0, self.isNumeric);
        }
        if (output.G(serialDesc, 1) || !s.f(self.examples, new ArrayList())) {
            output.D(serialDesc, 1, dVarArr[1], self.examples);
        }
        output.D(serialDesc, 2, dVarArr[2], self.nameType);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getNameType() {
        return this.nameType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsNumeric() {
        return this.isNumeric;
    }

    public e(boolean z11, ArrayList<String> examples, g nameType) {
        s.k(examples, "examples");
        s.k(nameType, "nameType");
        this.isNumeric = z11;
        this.examples = examples;
        this.nameType = nameType;
    }

    public /* synthetic */ e(boolean z11, ArrayList arrayList, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? new ArrayList() : arrayList, gVar);
    }
}
