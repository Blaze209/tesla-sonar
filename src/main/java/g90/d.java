package g90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002\u0017\u001dB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001d\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010\u001c\u001a\u0004\b!\u0010#¨\u0006&"}, d2 = {"Lg90/d;", "", "Lg90/f;", "type", "", "required", "Lg90/e;", "schema", "<init>", "(Lg90/f;ZLg90/e;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILg90/f;ZLg90/e;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "e", "(Lg90/d;Luo0/d;Lto0/f;)V", "a", "Lg90/f;", DateTokenConverter.CONVERTER_KEY, "()Lg90/f;", "getType$annotations", "()V", "b", "Z", "()Z", "getRequired$annotations", "c", "Lg90/e;", "()Lg90/e;", "getSchema$annotations", "Companion", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67655d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ro0.d<Object>[] f67656e = {f.INSTANCE.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e schema;

    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/uicore/address/CountryAddressSchema.$serializer", "Lvo0/e0;", "Lg90/d;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lg90/d;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lg90/d;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f67660a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f67660a = aVar;
            m1 m1Var = new m1("com.stripe.android.uicore.address.CountryAddressSchema", aVar, 3);
            m1Var.o("type", false);
            m1Var.o("required", false);
            m1Var.o("schema", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d deserialize(uo0.e decoder) {
            boolean zW;
            int i11;
            f fVar;
            e eVar;
            s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = d.f67656e;
            if (cVarB.i()) {
                f fVar2 = (f) cVarB.v(descriptor2, 0, dVarArr[0], null);
                zW = cVarB.w(descriptor2, 1);
                fVar = fVar2;
                eVar = (e) cVarB.v(descriptor2, 2, e.a.f67666a, null);
                i11 = 7;
            } else {
                boolean z11 = true;
                zW = false;
                f fVar3 = null;
                e eVar2 = null;
                int i12 = 0;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        fVar3 = (f) cVarB.v(descriptor2, 0, dVarArr[0], fVar3);
                        i12 |= 1;
                    } else if (iA == 1) {
                        zW = cVarB.w(descriptor2, 1);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        eVar2 = (e) cVarB.v(descriptor2, 2, e.a.f67666a, eVar2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                fVar = fVar3;
                eVar = eVar2;
            }
            boolean z12 = zW;
            cVarB.c(descriptor2);
            return new d(i11, fVar, z12, eVar, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, d value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            d.e(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{so0.a.p(d.f67656e[0]), vo0.h.f119620a, so0.a.p(e.a.f67666a)};
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

    /* JADX INFO: renamed from: g90.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg90/d$b;", "", "<init>", "()V", "Lro0/d;", "Lg90/d;", "serializer", "()Lro0/d;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<d> serializer() {
            return a.f67660a;
        }

        private Companion() {
        }
    }

    @jn0.e
    public /* synthetic */ d(int i11, @o("type") f fVar, @o("required") boolean z11, @o("schema") e eVar, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, a.f67660a.getDescriptor());
        }
        this.type = fVar;
        this.required = z11;
        if ((i11 & 4) == 0) {
            this.schema = null;
        } else {
            this.schema = eVar;
        }
    }

    public static final /* synthetic */ void e(d self, uo0.d output, to0.f serialDesc) {
        output.y(serialDesc, 0, f67656e[0], self.type);
        output.A(serialDesc, 1, self.required);
        if (!output.G(serialDesc, 2) && self.schema == null) {
            return;
        }
        output.y(serialDesc, 2, e.a.f67666a, self.schema);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getSchema() {
        return this.schema;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getType() {
        return this.type;
    }

    public d(f fVar, boolean z11, e eVar) {
        this.type = fVar;
        this.required = z11;
        this.schema = eVar;
    }
}
