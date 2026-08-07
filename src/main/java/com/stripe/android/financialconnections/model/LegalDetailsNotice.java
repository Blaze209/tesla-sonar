package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.u, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002)/BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fBc\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010'\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00100\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001bR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u00106\u0012\u0004\b8\u0010.\u001a\u0004\b)\u00107R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00100\u0012\u0004\b9\u0010.\u001a\u0004\b/\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00100\u0012\u0004\b:\u0010.\u001a\u0004\b3\u0010\u001b¨\u0006<"}, d2 = {"Lcom/stripe/android/financialconnections/model/u;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/r;", "icon", "", "title", "subtitle", "Lcom/stripe/android/financialconnections/model/t;", "body", "cta", "disclaimer", "<init>", "(Lcom/stripe/android/financialconnections/model/r;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/t;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/r;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/t;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lcom/stripe/android/financialconnections/model/u;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/r;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/financialconnections/model/r;", "getIcon$annotations", "()V", "b", "Ljava/lang/String;", "f", "getTitle$annotations", "c", "e", "getSubtitle$annotations", "Lcom/stripe/android/financialconnections/model/t;", "()Lcom/stripe/android/financialconnections/model/t;", "getBody$annotations", "getCta$annotations", "getDisclaimer$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class LegalDetailsNotice implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final LegalDetailsBody body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cta;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String disclaimer;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50562g = 8;
    public static final Parcelable.Creator<LegalDetailsNotice> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.u$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/LegalDetailsNotice.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/u;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/u;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/u;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<LegalDetailsNotice> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50569a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50569a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.LegalDetailsNotice", aVar, 6);
            m1Var.o("icon", true);
            m1Var.o("title", false);
            m1Var.o("subtitle", true);
            m1Var.o("body", false);
            m1Var.o("cta", false);
            m1Var.o("disclaimer", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LegalDetailsNotice deserialize(uo0.e decoder) {
            int i11;
            Image image;
            String str;
            String str2;
            LegalDetailsBody tVar;
            String str3;
            String str4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i12 = 5;
            Image image2 = null;
            if (cVarB.i()) {
                Image image3 = (Image) cVarB.v(descriptor2, 0, Image.a.f50552a, null);
                n50.d dVar = n50.d.f93345a;
                String str5 = (String) cVarB.n(descriptor2, 1, dVar, null);
                String str6 = (String) cVarB.v(descriptor2, 2, dVar, null);
                LegalDetailsBody tVar2 = (LegalDetailsBody) cVarB.n(descriptor2, 3, LegalDetailsBody.a.f50561a, null);
                String str7 = (String) cVarB.n(descriptor2, 4, dVar, null);
                image = image3;
                str4 = (String) cVarB.v(descriptor2, 5, dVar, null);
                tVar = tVar2;
                str3 = str7;
                str2 = str6;
                str = str5;
                i11 = 63;
            } else {
                boolean z11 = true;
                int i13 = 0;
                String str8 = null;
                String str9 = null;
                LegalDetailsBody tVar3 = null;
                String str10 = null;
                String str11 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 5;
                            break;
                        case 0:
                            image2 = (Image) cVarB.v(descriptor2, 0, Image.a.f50552a, image2);
                            i13 |= 1;
                            i12 = 5;
                            break;
                        case 1:
                            str8 = (String) cVarB.n(descriptor2, 1, n50.d.f93345a, str8);
                            i13 |= 2;
                            break;
                        case 2:
                            str9 = (String) cVarB.v(descriptor2, 2, n50.d.f93345a, str9);
                            i13 |= 4;
                            break;
                        case 3:
                            tVar3 = (LegalDetailsBody) cVarB.n(descriptor2, 3, LegalDetailsBody.a.f50561a, tVar3);
                            i13 |= 8;
                            break;
                        case 4:
                            str10 = (String) cVarB.n(descriptor2, 4, n50.d.f93345a, str10);
                            i13 |= 16;
                            break;
                        case 5:
                            str11 = (String) cVarB.v(descriptor2, i12, n50.d.f93345a, str11);
                            i13 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                image = image2;
                str = str8;
                str2 = str9;
                tVar = tVar3;
                str3 = str10;
                str4 = str11;
            }
            cVarB.c(descriptor2);
            return new LegalDetailsNotice(i11, image, str, str2, tVar, str3, str4, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, LegalDetailsNotice value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            LegalDetailsNotice.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?> dVarP = so0.a.p(Image.a.f50552a);
            n50.d dVar = n50.d.f93345a;
            return new ro0.d[]{dVarP, dVar, so0.a.p(dVar), LegalDetailsBody.a.f50561a, dVar, so0.a.p(dVar)};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/u$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/u;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<LegalDetailsNotice> serializer() {
            return a.f50569a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.u$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<LegalDetailsNotice> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LegalDetailsNotice createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new LegalDetailsNotice(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), LegalDetailsBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LegalDetailsNotice[] newArray(int i11) {
            return new LegalDetailsNotice[i11];
        }
    }

    @jn0.e
    public /* synthetic */ LegalDetailsNotice(int i11, @ro0.o("icon") Image image, @ro0.o("title") @ro0.p(with = n50.d.class) String str, @ro0.o("subtitle") @ro0.p(with = n50.d.class) String str2, @ro0.o("body") LegalDetailsBody tVar, @ro0.o("cta") @ro0.p(with = n50.d.class) String str3, @ro0.o("disclaimer") @ro0.p(with = n50.d.class) String str4, v1 v1Var) {
        if (26 != (i11 & 26)) {
            h1.b(i11, 26, a.f50569a.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = image;
        }
        this.title = str;
        if ((i11 & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        this.body = tVar;
        this.cta = str3;
        if ((i11 & 32) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = str4;
        }
    }

    public static final /* synthetic */ void g(LegalDetailsNotice self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.icon != null) {
            output.y(serialDesc, 0, Image.a.f50552a, self.icon);
        }
        n50.d dVar = n50.d.f93345a;
        output.D(serialDesc, 1, dVar, self.title);
        if (output.G(serialDesc, 2) || self.subtitle != null) {
            output.y(serialDesc, 2, dVar, self.subtitle);
        }
        output.D(serialDesc, 3, LegalDetailsBody.a.f50561a, self.body);
        output.D(serialDesc, 4, dVar, self.cta);
        if (!output.G(serialDesc, 5) && self.disclaimer == null) {
            return;
        }
        output.y(serialDesc, 5, dVar, self.disclaimer);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LegalDetailsBody getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalDetailsNotice)) {
            return false;
        }
        LegalDetailsNotice legalDetailsNotice = (LegalDetailsNotice) other;
        return p013kotlin.jvm.internal.s.f(this.icon, legalDetailsNotice.icon) && p013kotlin.jvm.internal.s.f(this.title, legalDetailsNotice.title) && p013kotlin.jvm.internal.s.f(this.subtitle, legalDetailsNotice.subtitle) && p013kotlin.jvm.internal.s.f(this.body, legalDetailsNotice.body) && p013kotlin.jvm.internal.s.f(this.cta, legalDetailsNotice.cta) && p013kotlin.jvm.internal.s.f(this.disclaimer, legalDetailsNotice.disclaimer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Image image = this.icon;
        int iHashCode = (((image == null ? 0 : image.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.subtitle;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.body.hashCode()) * 31) + this.cta.hashCode()) * 31;
        String str2 = this.disclaimer;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "LegalDetailsNotice(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", body=" + this.body + ", cta=" + this.cta + ", disclaimer=" + this.disclaimer + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        Image image = this.icon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        this.body.writeToParcel(parcel, flags);
        parcel.writeString(this.cta);
        parcel.writeString(this.disclaimer);
    }

    public LegalDetailsNotice(Image image, String title, String str, LegalDetailsBody body, String cta, String str2) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(cta, "cta");
        this.icon = image;
        this.title = title;
        this.subtitle = str;
        this.body = body;
        this.cta = cta;
        this.disclaimer = str2;
    }
}
