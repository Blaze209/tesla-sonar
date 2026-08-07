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

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.b0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0081\b\u0018\u0000 H2\u00020\u0001:\u0002-2BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010Bo\b\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÁ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010+\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b-\u0010/R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b5\u00101\u001a\u0004\b2\u00104R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b9\u00101\u001a\u0004\b6\u00108R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00101\u001a\u0004\b<\u0010=R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u00101\u001a\u0004\bA\u0010BR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010D\u0012\u0004\bE\u00101\u001a\u0004\b?\u0010\u001fR \u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010D\u0012\u0004\bG\u00101\u001a\u0004\b:\u0010\u001f¨\u0006I"}, d2 = {"Lcom/stripe/android/financialconnections/model/b0;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/d;", "body", "Lcom/stripe/android/financialconnections/model/k;", "cta", "Lcom/stripe/android/financialconnections/model/r;", "institutionIcon", "Lcom/stripe/android/financialconnections/model/e0;", "partnerNotice", "Lcom/stripe/android/financialconnections/model/l;", "dataAccessNotice", "", "title", "subtitle", "<init>", "(Lcom/stripe/android/financialconnections/model/d;Lcom/stripe/android/financialconnections/model/k;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/e0;Lcom/stripe/android/financialconnections/model/l;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/d;Lcom/stripe/android/financialconnections/model/k;Lcom/stripe/android/financialconnections/model/r;Lcom/stripe/android/financialconnections/model/e0;Lcom/stripe/android/financialconnections/model/l;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "f", "(Lcom/stripe/android/financialconnections/model/b0;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/d;", "()Lcom/stripe/android/financialconnections/model/d;", "getBody$annotations", "()V", "b", "Lcom/stripe/android/financialconnections/model/k;", "()Lcom/stripe/android/financialconnections/model/k;", "getCta$annotations", "c", "Lcom/stripe/android/financialconnections/model/r;", "()Lcom/stripe/android/financialconnections/model/r;", "getInstitutionIcon$annotations", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/model/e0;", "getPartnerNotice", "()Lcom/stripe/android/financialconnections/model/e0;", "getPartnerNotice$annotations", "e", "Lcom/stripe/android/financialconnections/model/l;", "getDataAccessNotice", "()Lcom/stripe/android/financialconnections/model/l;", "getDataAccessNotice$annotations", "Ljava/lang/String;", "getTitle$annotations", "g", "getSubtitle$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class OauthPrepane implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Body body;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Cta cta;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image institutionIcon;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final PartnerNotice partnerNotice;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataAccessNotice dataAccessNotice;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50394h = 8;
    public static final Parcelable.Creator<OauthPrepane> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.b0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/OauthPrepane.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/b0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/b0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/b0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<OauthPrepane> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50402a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50402a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.OauthPrepane", aVar, 7);
            m1Var.o("body", false);
            m1Var.o("cta", false);
            m1Var.o("institution_icon", true);
            m1Var.o("partner_notice", true);
            m1Var.o("data_access_notice", true);
            m1Var.o("title", false);
            m1Var.o("subtitle", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public OauthPrepane deserialize(uo0.e decoder) {
            int i11;
            String str;
            Body body;
            Cta kVar;
            Image image;
            PartnerNotice partnerNotice;
            DataAccessNotice dataAccessNotice;
            String str2;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i12 = 6;
            Body body2 = null;
            if (cVarB.i()) {
                Body body3 = (Body) cVarB.n(descriptor2, 0, Body.a.f50433a, null);
                Cta kVar2 = (Cta) cVarB.n(descriptor2, 1, Cta.a.f50493a, null);
                Image image2 = (Image) cVarB.v(descriptor2, 2, Image.a.f50552a, null);
                PartnerNotice partnerNotice2 = (PartnerNotice) cVarB.v(descriptor2, 3, PartnerNotice.a.f50446a, null);
                DataAccessNotice dataAccessNotice2 = (DataAccessNotice) cVarB.v(descriptor2, 4, DataAccessNotice.a.f50507a, null);
                n50.d dVar = n50.d.f93345a;
                String str3 = (String) cVarB.n(descriptor2, 5, dVar, null);
                body = body3;
                str = (String) cVarB.n(descriptor2, 6, dVar, null);
                str2 = str3;
                partnerNotice = partnerNotice2;
                dataAccessNotice = dataAccessNotice2;
                image = image2;
                kVar = kVar2;
                i11 = 127;
            } else {
                boolean z11 = true;
                int i13 = 0;
                String str4 = null;
                Cta kVar3 = null;
                Image image3 = null;
                PartnerNotice partnerNotice3 = null;
                DataAccessNotice dataAccessNotice3 = null;
                String str5 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                            break;
                        case 0:
                            body2 = (Body) cVarB.n(descriptor2, 0, Body.a.f50433a, body2);
                            i13 |= 1;
                            i12 = 6;
                            break;
                        case 1:
                            kVar3 = (Cta) cVarB.n(descriptor2, 1, Cta.a.f50493a, kVar3);
                            i13 |= 2;
                            i12 = 6;
                            break;
                        case 2:
                            image3 = (Image) cVarB.v(descriptor2, 2, Image.a.f50552a, image3);
                            i13 |= 4;
                            break;
                        case 3:
                            partnerNotice3 = (PartnerNotice) cVarB.v(descriptor2, 3, PartnerNotice.a.f50446a, partnerNotice3);
                            i13 |= 8;
                            break;
                        case 4:
                            dataAccessNotice3 = (DataAccessNotice) cVarB.v(descriptor2, 4, DataAccessNotice.a.f50507a, dataAccessNotice3);
                            i13 |= 16;
                            break;
                        case 5:
                            str5 = (String) cVarB.n(descriptor2, 5, n50.d.f93345a, str5);
                            i13 |= 32;
                            break;
                        case 6:
                            str4 = (String) cVarB.n(descriptor2, i12, n50.d.f93345a, str4);
                            i13 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                str = str4;
                body = body2;
                kVar = kVar3;
                image = image3;
                partnerNotice = partnerNotice3;
                dataAccessNotice = dataAccessNotice3;
                str2 = str5;
            }
            cVarB.c(descriptor2);
            return new OauthPrepane(i11, body, kVar, image, partnerNotice, dataAccessNotice, str2, str, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, OauthPrepane value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            OauthPrepane.f(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?> dVarP = so0.a.p(Image.a.f50552a);
            ro0.d<?> dVarP2 = so0.a.p(PartnerNotice.a.f50446a);
            ro0.d<?> dVarP3 = so0.a.p(DataAccessNotice.a.f50507a);
            n50.d dVar = n50.d.f93345a;
            return new ro0.d[]{Body.a.f50433a, Cta.a.f50493a, dVarP, dVarP2, dVarP3, dVar, dVar};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.b0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/b0$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/b0;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<OauthPrepane> serializer() {
            return a.f50402a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.b0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<OauthPrepane> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OauthPrepane createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new OauthPrepane(Body.CREATOR.createFromParcel(parcel), Cta.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PartnerNotice.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DataAccessNotice.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OauthPrepane[] newArray(int i11) {
            return new OauthPrepane[i11];
        }
    }

    @jn0.e
    public /* synthetic */ OauthPrepane(int i11, @ro0.o("body") Body body, @ro0.o("cta") Cta kVar, @ro0.o("institution_icon") Image image, @ro0.o("partner_notice") PartnerNotice partnerNotice, @ro0.o("data_access_notice") DataAccessNotice dataAccessNotice, @ro0.o("title") @ro0.p(with = n50.d.class) String str, @ro0.o("subtitle") @ro0.p(with = n50.d.class) String str2, v1 v1Var) {
        if (99 != (i11 & 99)) {
            h1.b(i11, 99, a.f50402a.getDescriptor());
        }
        this.body = body;
        this.cta = kVar;
        if ((i11 & 4) == 0) {
            this.institutionIcon = null;
        } else {
            this.institutionIcon = image;
        }
        if ((i11 & 8) == 0) {
            this.partnerNotice = null;
        } else {
            this.partnerNotice = partnerNotice;
        }
        if ((i11 & 16) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        this.title = str;
        this.subtitle = str2;
    }

    public static final /* synthetic */ void f(OauthPrepane self, uo0.d output, to0.f serialDesc) {
        output.D(serialDesc, 0, Body.a.f50433a, self.body);
        output.D(serialDesc, 1, Cta.a.f50493a, self.cta);
        if (output.G(serialDesc, 2) || self.institutionIcon != null) {
            output.y(serialDesc, 2, Image.a.f50552a, self.institutionIcon);
        }
        if (output.G(serialDesc, 3) || self.partnerNotice != null) {
            output.y(serialDesc, 3, PartnerNotice.a.f50446a, self.partnerNotice);
        }
        if (output.G(serialDesc, 4) || self.dataAccessNotice != null) {
            output.y(serialDesc, 4, DataAccessNotice.a.f50507a, self.dataAccessNotice);
        }
        n50.d dVar = n50.d.f93345a;
        output.D(serialDesc, 5, dVar, self.title);
        output.D(serialDesc, 6, dVar, self.subtitle);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Body getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Cta getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Image getInstitutionIcon() {
        return this.institutionIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OauthPrepane)) {
            return false;
        }
        OauthPrepane oauthPrepane = (OauthPrepane) other;
        return p013kotlin.jvm.internal.s.f(this.body, oauthPrepane.body) && p013kotlin.jvm.internal.s.f(this.cta, oauthPrepane.cta) && p013kotlin.jvm.internal.s.f(this.institutionIcon, oauthPrepane.institutionIcon) && p013kotlin.jvm.internal.s.f(this.partnerNotice, oauthPrepane.partnerNotice) && p013kotlin.jvm.internal.s.f(this.dataAccessNotice, oauthPrepane.dataAccessNotice) && p013kotlin.jvm.internal.s.f(this.title, oauthPrepane.title) && p013kotlin.jvm.internal.s.f(this.subtitle, oauthPrepane.subtitle);
    }

    public int hashCode() {
        int iHashCode = ((this.body.hashCode() * 31) + this.cta.hashCode()) * 31;
        Image image = this.institutionIcon;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        PartnerNotice partnerNotice = this.partnerNotice;
        int iHashCode3 = (iHashCode2 + (partnerNotice == null ? 0 : partnerNotice.hashCode())) * 31;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        return ((((iHashCode3 + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode();
    }

    public String toString() {
        return "OauthPrepane(body=" + this.body + ", cta=" + this.cta + ", institutionIcon=" + this.institutionIcon + ", partnerNotice=" + this.partnerNotice + ", dataAccessNotice=" + this.dataAccessNotice + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        this.body.writeToParcel(parcel, flags);
        this.cta.writeToParcel(parcel, flags);
        Image image = this.institutionIcon;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, flags);
        }
        PartnerNotice partnerNotice = this.partnerNotice;
        if (partnerNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            partnerNotice.writeToParcel(parcel, flags);
        }
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataAccessNotice.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
    }

    public OauthPrepane(Body body, Cta cta, Image image, PartnerNotice partnerNotice, DataAccessNotice dataAccessNotice, String title, String subtitle) {
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(cta, "cta");
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(subtitle, "subtitle");
        this.body = body;
        this.cta = cta;
        this.institutionIcon = image;
        this.partnerNotice = partnerNotice;
        this.dataAccessNotice = dataAccessNotice;
        this.title = title;
        this.subtitle = subtitle;
    }
}
