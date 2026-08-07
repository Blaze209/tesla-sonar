package z80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.a1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002%*B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010&\u0012\u0004\b.\u0010)\u001a\u0004\b%\u0010\u0017¨\u00060"}, d2 = {"Lz80/a1;", "Landroid/os/Parcelable;", "", "type", AnnotatedPrivateKey.LABEL, "lightImageUrl", "darkImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lz80/a1;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "b", "getLabel$annotations", "c", "getLightImageUrl$annotations", "getDarkImageUrl$annotations", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class ExternalPaymentMethodSpec implements Parcelable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f127345e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lightImageUrl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String darkImageUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ExternalPaymentMethodSpec> CREATOR = new c();

    /* JADX INFO: renamed from: z80.a1$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/ExternalPaymentMethodSpec.$serializer", "Lvo0/e0;", "Lz80/a1;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lz80/a1;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lz80/a1;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<ExternalPaymentMethodSpec> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f127350a;
        private static final /* synthetic */ vo0.m1 descriptor;

        static {
            a aVar = new a();
            f127350a = aVar;
            vo0.m1 m1Var = new vo0.m1("com.stripe.android.ui.core.elements.ExternalPaymentMethodSpec", aVar, 4);
            m1Var.o("type", false);
            m1Var.o(AnnotatedPrivateKey.LABEL, false);
            m1Var.o("light_image_url", false);
            m1Var.o("dark_image_url", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExternalPaymentMethodSpec deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            String str3;
            String str4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            String strT = null;
            if (cVarB.i()) {
                String strT2 = cVarB.t(descriptor2, 0);
                String strT3 = cVarB.t(descriptor2, 1);
                String strT4 = cVarB.t(descriptor2, 2);
                str = strT2;
                str4 = (String) cVarB.v(descriptor2, 3, vo0.z1.f119730a, null);
                str3 = strT4;
                str2 = strT3;
                i11 = 15;
            } else {
                boolean z11 = true;
                int i12 = 0;
                String strT5 = null;
                String strT6 = null;
                String str5 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else if (iA == 0) {
                        strT = cVarB.t(descriptor2, 0);
                        i12 |= 1;
                    } else if (iA == 1) {
                        strT5 = cVarB.t(descriptor2, 1);
                        i12 |= 2;
                    } else if (iA == 2) {
                        strT6 = cVarB.t(descriptor2, 2);
                        i12 |= 4;
                    } else {
                        if (iA != 3) {
                            throw new UnknownFieldException(iA);
                        }
                        str5 = (String) cVarB.v(descriptor2, 3, vo0.z1.f119730a, str5);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = strT;
                str2 = strT5;
                str3 = strT6;
                str4 = str5;
            }
            cVarB.c(descriptor2);
            return new ExternalPaymentMethodSpec(i11, str, str2, str3, str4, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, ExternalPaymentMethodSpec value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            ExternalPaymentMethodSpec.d(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{z1Var, z1Var, z1Var, so0.a.p(z1Var)};
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

    /* JADX INFO: renamed from: z80.a1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/a1$b;", "", "<init>", "()V", "Lro0/d;", "Lz80/a1;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<ExternalPaymentMethodSpec> serializer() {
            return a.f127350a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: z80.a1$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ExternalPaymentMethodSpec> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExternalPaymentMethodSpec createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ExternalPaymentMethodSpec(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ExternalPaymentMethodSpec[] newArray(int i11) {
            return new ExternalPaymentMethodSpec[i11];
        }
    }

    @jn0.e
    public /* synthetic */ ExternalPaymentMethodSpec(int i11, @ro0.o("type") String str, @ro0.o(AnnotatedPrivateKey.LABEL) String str2, @ro0.o("light_image_url") String str3, @ro0.o("dark_image_url") String str4, vo0.v1 v1Var) {
        if (7 != (i11 & 7)) {
            vo0.h1.b(i11, 7, a.f127350a.getDescriptor());
        }
        this.type = str;
        this.label = str2;
        this.lightImageUrl = str3;
        if ((i11 & 8) == 0) {
            this.darkImageUrl = null;
        } else {
            this.darkImageUrl = str4;
        }
    }

    public static final /* synthetic */ void d(ExternalPaymentMethodSpec self, uo0.d output, to0.f serialDesc) {
        output.e(serialDesc, 0, self.type);
        output.e(serialDesc, 1, self.label);
        output.e(serialDesc, 2, self.lightImageUrl);
        if (!output.G(serialDesc, 3) && self.darkImageUrl == null) {
            return;
        }
        output.y(serialDesc, 3, vo0.z1.f119730a, self.darkImageUrl);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDarkImageUrl() {
        return this.darkImageUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLightImageUrl() {
        return this.lightImageUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalPaymentMethodSpec)) {
            return false;
        }
        ExternalPaymentMethodSpec externalPaymentMethodSpec = (ExternalPaymentMethodSpec) other;
        return p013kotlin.jvm.internal.s.f(this.type, externalPaymentMethodSpec.type) && p013kotlin.jvm.internal.s.f(this.label, externalPaymentMethodSpec.label) && p013kotlin.jvm.internal.s.f(this.lightImageUrl, externalPaymentMethodSpec.lightImageUrl) && p013kotlin.jvm.internal.s.f(this.darkImageUrl, externalPaymentMethodSpec.darkImageUrl);
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + this.label.hashCode()) * 31) + this.lightImageUrl.hashCode()) * 31;
        String str = this.darkImageUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ExternalPaymentMethodSpec(type=" + this.type + ", label=" + this.label + ", lightImageUrl=" + this.lightImageUrl + ", darkImageUrl=" + this.darkImageUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.label);
        parcel.writeString(this.lightImageUrl);
        parcel.writeString(this.darkImageUrl);
    }

    public ExternalPaymentMethodSpec(String type, String label, String lightImageUrl, String str) {
        p013kotlin.jvm.internal.s.k(type, "type");
        p013kotlin.jvm.internal.s.k(label, "label");
        p013kotlin.jvm.internal.s.k(lightImageUrl, "lightImageUrl");
        this.type = type;
        this.label = label;
        this.lightImageUrl = lightImageUrl;
        this.darkImageUrl = str;
    }
}
