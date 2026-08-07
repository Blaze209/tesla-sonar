package p010i90;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.BlikPaymentMethod;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Gender;
import java.lang.annotation.Annotation;
import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.h;
import ro0.p;
import to0.f;
import vo0.e0;
import vo0.h1;
import vo0.m1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: renamed from: i90.g0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0002(+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB7\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010&\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Li90/g0;", "Landroid/os/Parcelable;", "", "v1", "", "ignoreField", "Li90/p0;", "destination", "<init>", "(Ljava/lang/String;ZLi90/p0;)V", "()V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLi90/p0;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", Gender.OTHER, "(Li90/g0;Luo0/d;Lto0/f;)V", "G", "(Ljava/lang/String;ZLi90/p0;)Li90/g0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", Gender.NONE, "b", "Z", Gender.MALE, "()Z", "c", "Li90/p0;", "L", "()Li90/p0;", "Companion", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final /* data */ class IdentifierSpec implements Parcelable {
    private static final IdentifierSpec C;
    private static final IdentifierSpec D;
    private static final IdentifierSpec E;
    private static final IdentifierSpec F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final IdentifierSpec f76544i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final IdentifierSpec f76551p;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final IdentifierSpec f76558w;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String v1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean ignoreField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final p0 destination;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f76539d = 8;
    public static final Parcelable.Creator<IdentifierSpec> CREATOR = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d<Object>[] f76540e = {null, null, new h(o0.b(p0.class), new Annotation[0])};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final IdentifierSpec f76541f = new IdentifierSpec("billing_details[name]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final IdentifierSpec f76542g = new IdentifierSpec("card[brand]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final IdentifierSpec f76543h = new IdentifierSpec("card[networks][preferred]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final IdentifierSpec f76545j = new IdentifierSpec("card[cvc]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final IdentifierSpec f76546k = new IdentifierSpec("card[exp_month]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final IdentifierSpec f76547l = new IdentifierSpec("card[exp_year]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final IdentifierSpec f76548m = new IdentifierSpec("billing_details[address]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final IdentifierSpec f76549n = new IdentifierSpec("billing_details[email]", false, (p0) null, 6, (DefaultConstructorMarker) (0 == true ? 1 : 0));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final IdentifierSpec f76550o = new IdentifierSpec("billing_details[phone]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final IdentifierSpec f76552q = new IdentifierSpec("billing_details[address][line2]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final IdentifierSpec f76553r = new IdentifierSpec("billing_details[address][city]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final IdentifierSpec f76554s = new IdentifierSpec("", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final IdentifierSpec f76555t = new IdentifierSpec("billing_details[address][postal_code]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final IdentifierSpec f76556u = new IdentifierSpec("", false, (p0) null, 6, (DefaultConstructorMarker) (0 == true ? 1 : 0));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final IdentifierSpec f76557v = new IdentifierSpec("billing_details[address][state]", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final IdentifierSpec f76559x = new IdentifierSpec("save_for_future_use", false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final IdentifierSpec f76560y = new IdentifierSpec(PlaceTypes.ADDRESS, false, (p0) null, 6, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final IdentifierSpec f76561z = new IdentifierSpec("same_as_shipping", true, (p0) null, 4, (DefaultConstructorMarker) null);
    private static final IdentifierSpec A = new IdentifierSpec("upi", false, (p0) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec B = new IdentifierSpec("upi[vpa]", false, (p0) null, 6, (DefaultConstructorMarker) (0 == true ? 1 : 0));

    /* JADX INFO: renamed from: i90.g0$a */
    @e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/uicore/elements/IdentifierSpec.$serializer", "Lvo0/e0;", "Li90/g0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Li90/g0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Li90/g0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e0<IdentifierSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76565a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f76565a = aVar;
            m1 m1Var = new m1("com.stripe.android.uicore.elements.IdentifierSpec", aVar, 3);
            m1Var.o("v1", false);
            m1Var.o("ignoreField", true);
            m1Var.o("destination", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IdentifierSpec deserialize(uo0.e decoder) {
            int i11;
            boolean z11;
            String str;
            p0 p0Var;
            s.k(decoder, "decoder");
            f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            d[] dVarArr = IdentifierSpec.f76540e;
            if (cVarB.i()) {
                String strT = cVarB.t(descriptor2, 0);
                boolean zW = cVarB.w(descriptor2, 1);
                p0Var = (p0) cVarB.n(descriptor2, 2, dVarArr[2], null);
                str = strT;
                i11 = 7;
                z11 = zW;
            } else {
                boolean z12 = true;
                int i12 = 0;
                String strT2 = null;
                p0 p0Var2 = null;
                boolean zW2 = false;
                while (z12) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z12 = false;
                    } else if (iA == 0) {
                        strT2 = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        zW2 = cVarB.w(descriptor2, 1);
                        i12 |= 2;
                    } else {
                        if (iA != 2) {
                            throw new UnknownFieldException(iA);
                        }
                        p0Var2 = (p0) cVarB.n(descriptor2, 2, dVarArr[2], p0Var2);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                z11 = zW2;
                str = strT2;
                p0Var = p0Var2;
            }
            cVarB.c(descriptor2);
            return new IdentifierSpec(i11, str, z11, p0Var, (v1) null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, IdentifierSpec value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            IdentifierSpec.O(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public d<?>[] childSerializers() {
            return new d[]{z1.f119730a, vo0.h.f119620a, IdentifierSpec.f76540e[2]};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: i90.g0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b7\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011R\u0017\u0010\"\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\u0017\u0010$\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\u000f\u001a\u0004\b%\u0010\u0011R\u0017\u0010&\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010\u000f\u001a\u0004\b'\u0010\u0011R\u0017\u0010(\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R\u0017\u0010*\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b+\u0010\u0011R\u0017\u0010,\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010\u000f\u001a\u0004\b-\u0010\u0011R\u0017\u0010.\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010\u000f\u001a\u0004\b/\u0010\u0011R\u0017\u00100\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b1\u0010\u0011R\u0017\u00102\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b3\u0010\u0011R\u0017\u00104\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u0010\u0011R\u0017\u00106\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b7\u0010\u0011R\u0017\u00108\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b9\u0010\u0011R\u0017\u0010:\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010\u000f\u001a\u0004\b;\u0010\u0011R\u001a\u0010<\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u000f\u001a\u0004\b=\u0010\u0011R\u0017\u0010>\u001a\u00020\u00068G¢\u0006\f\n\u0004\b>\u0010\u000f\u001a\u0004\b?\u0010\u0011R\u0017\u0010@\u001a\u00020\u00068G¢\u0006\f\n\u0004\b@\u0010\u000f\u001a\u0004\bA\u0010\u0011¨\u0006B"}, d2 = {"Li90/g0$b;", "", "<init>", "()V", "", "_value", "Li90/g0;", "a", "(Ljava/lang/String;)Li90/g0;", "value", "b", "Lro0/d;", "serializer", "()Lro0/d;", "Name", "Li90/g0;", "r", "()Li90/g0;", "CardBrand", "f", "PreferredCardBrand", "v", "CardNumber", "j", "CardCvc", "g", "CardExpMonth", "h", "CardExpYear", IntegerTokenConverter.CONVERTER_KEY, "BillingAddress", DateTokenConverter.CONVERTER_KEY, "Email", "n", "Phone", "t", "Line1", "p", "Line2", "q", "City", "k", "DependentLocality", "m", "PostalCode", "u", "SortingCode", "y", "State", "z", "Country", "l", "SaveForFutureUse", "x", "OneLineAddress", "s", "SameAsShipping", "w", "Vpa", "A", "BlikCode", "e", "KonbiniConfirmationNumber", "o", "BacsDebitConfirmed", "c", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentifierSpec A() {
            return IdentifierSpec.B;
        }

        public final IdentifierSpec a(String _value) {
            s.k(_value, "_value");
            return new IdentifierSpec(_value, false, (p0) null, 6, (DefaultConstructorMarker) null);
        }

        public final IdentifierSpec b(String value) {
            s.k(value, "value");
            if (s.f(value, f().getV1())) {
                return f();
            }
            if (s.f(value, j().getV1())) {
                return j();
            }
            if (s.f(value, g().getV1())) {
                return g();
            }
            if (s.f(value, k().getV1())) {
                return k();
            }
            if (s.f(value, l().getV1())) {
                return l();
            }
            if (s.f(value, n().getV1())) {
                return n();
            }
            if (s.f(value, p().getV1())) {
                return p();
            }
            if (s.f(value, q().getV1())) {
                return q();
            }
            if (s.f(value, r().getV1())) {
                return r();
            }
            if (s.f(value, t().getV1())) {
                return t();
            }
            if (s.f(value, u().getV1())) {
                return u();
            }
            if (s.f(value, x().getV1())) {
                return x();
            }
            if (s.f(value, z().getV1())) {
                return z();
            }
            return s.f(value, s().getV1()) ? s() : a(value);
        }

        public final IdentifierSpec c() {
            return IdentifierSpec.F;
        }

        public final IdentifierSpec d() {
            return IdentifierSpec.f76548m;
        }

        public final IdentifierSpec e() {
            return IdentifierSpec.D;
        }

        public final IdentifierSpec f() {
            return IdentifierSpec.f76542g;
        }

        public final IdentifierSpec g() {
            return IdentifierSpec.f76545j;
        }

        public final IdentifierSpec h() {
            return IdentifierSpec.f76546k;
        }

        public final IdentifierSpec i() {
            return IdentifierSpec.f76547l;
        }

        public final IdentifierSpec j() {
            return IdentifierSpec.f76544i;
        }

        public final IdentifierSpec k() {
            return IdentifierSpec.f76553r;
        }

        public final IdentifierSpec l() {
            return IdentifierSpec.f76558w;
        }

        public final IdentifierSpec m() {
            return IdentifierSpec.f76554s;
        }

        public final IdentifierSpec n() {
            return IdentifierSpec.f76549n;
        }

        public final IdentifierSpec o() {
            return IdentifierSpec.E;
        }

        public final IdentifierSpec p() {
            return IdentifierSpec.f76551p;
        }

        public final IdentifierSpec q() {
            return IdentifierSpec.f76552q;
        }

        public final IdentifierSpec r() {
            return IdentifierSpec.f76541f;
        }

        public final IdentifierSpec s() {
            return IdentifierSpec.f76560y;
        }

        public final d<IdentifierSpec> serializer() {
            return a.f76565a;
        }

        public final IdentifierSpec t() {
            return IdentifierSpec.f76550o;
        }

        public final IdentifierSpec u() {
            return IdentifierSpec.f76555t;
        }

        public final IdentifierSpec v() {
            return IdentifierSpec.f76543h;
        }

        public final IdentifierSpec w() {
            return IdentifierSpec.f76561z;
        }

        public final IdentifierSpec x() {
            return IdentifierSpec.f76559x;
        }

        public final IdentifierSpec y() {
            return IdentifierSpec.f76556u;
        }

        public final IdentifierSpec z() {
            return IdentifierSpec.f76557v;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: i90.g0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<IdentifierSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdentifierSpec createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new IdentifierSpec(parcel.readString(), parcel.readInt() != 0, (p0) parcel.readParcelable(IdentifierSpec.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IdentifierSpec[] newArray(int i11) {
            return new IdentifierSpec[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f76544i = new IdentifierSpec("card[number]", false, (p0) null, 6, defaultConstructorMarker);
        f76551p = new IdentifierSpec("billing_details[address][line1]", false, (p0) null, 6, defaultConstructorMarker);
        f76558w = new IdentifierSpec("billing_details[address][country]", false, (p0) null, 6, defaultConstructorMarker);
        p0.a aVar = p0.a.Options;
        C = new IdentifierSpec(BlikPaymentMethod.PAYMENT_METHOD_TYPE, false, (p0) aVar, 2, (DefaultConstructorMarker) null);
        int i11 = 2;
        D = new IdentifierSpec("blik[code]", false, (p0) aVar, i11, defaultConstructorMarker);
        E = new IdentifierSpec("konbini[confirmation_number]", false, (p0) aVar, i11, defaultConstructorMarker);
        F = new IdentifierSpec("bacs_debit[confirmed]", false, (p0) p0.b.Extras, 2, (DefaultConstructorMarker) null);
    }

    @e
    public /* synthetic */ IdentifierSpec(int i11, String str, boolean z11, p0 p0Var, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, a.f76565a.getDescriptor());
        }
        this.v1 = str;
        if ((i11 & 2) == 0) {
            this.ignoreField = false;
        } else {
            this.ignoreField = z11;
        }
        if ((i11 & 4) == 0) {
            this.destination = p0.a.Params;
        } else {
            this.destination = p0Var;
        }
    }

    public static /* synthetic */ IdentifierSpec K(IdentifierSpec identifierSpec, String str, boolean z11, p0 p0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = identifierSpec.v1;
        }
        if ((i11 & 2) != 0) {
            z11 = identifierSpec.ignoreField;
        }
        if ((i11 & 4) != 0) {
            p0Var = identifierSpec.destination;
        }
        return identifierSpec.G(str, z11, p0Var);
    }

    public static final /* synthetic */ void O(IdentifierSpec self, uo0.d output, f serialDesc) {
        d<Object>[] dVarArr = f76540e;
        output.e(serialDesc, 0, self.v1);
        if (output.G(serialDesc, 1) || self.ignoreField) {
            output.A(serialDesc, 1, self.ignoreField);
        }
        if (!output.G(serialDesc, 2) && self.destination == p0.a.Params) {
            return;
        }
        output.D(serialDesc, 2, dVarArr[2], self.destination);
    }

    public final IdentifierSpec G(String v11, boolean ignoreField, p0 destination) {
        s.k(v11, "v1");
        s.k(destination, "destination");
        return new IdentifierSpec(v11, ignoreField, destination);
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final p0 getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final boolean getIgnoreField() {
        return this.ignoreField;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getV1() {
        return this.v1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentifierSpec)) {
            return false;
        }
        IdentifierSpec identifierSpec = (IdentifierSpec) other;
        return s.f(this.v1, identifierSpec.v1) && this.ignoreField == identifierSpec.ignoreField && s.f(this.destination, identifierSpec.destination);
    }

    public int hashCode() {
        return (((this.v1.hashCode() * 31) + Boolean.hashCode(this.ignoreField)) * 31) + this.destination.hashCode();
    }

    public String toString() {
        return "IdentifierSpec(v1=" + this.v1 + ", ignoreField=" + this.ignoreField + ", destination=" + this.destination + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.v1);
        parcel.writeInt(this.ignoreField ? 1 : 0);
        parcel.writeParcelable(this.destination, flags);
    }

    public IdentifierSpec(String v11, boolean z11, p0 destination) {
        s.k(v11, "v1");
        s.k(destination, "destination");
        this.v1 = v11;
        this.ignoreField = z11;
        this.destination = destination;
    }

    public /* synthetic */ IdentifierSpec(String str, boolean z11, p0 p0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? p0.a.Params : p0Var);
    }

    public IdentifierSpec() {
        this("", false, (p0) null, 6, (DefaultConstructorMarker) null);
    }
}
