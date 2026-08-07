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

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.a0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002).B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBc\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010'\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b1\u0010-\u001a\u0004\b.\u00100R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010*\u0012\u0004\b3\u0010-\u001a\u0004\b)\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b2\u0010\u001bR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010*\u0012\u0004\b7\u0010-\u001a\u0004\b6\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u00108\u0012\u0004\b:\u0010-\u001a\u0004\b4\u00109¨\u0006<"}, d2 = {"Lcom/stripe/android/financialconnections/model/a0;", "Landroid/os/Parcelable;", "", "title", "Lcom/stripe/android/financialconnections/model/z;", "body", "aboveCta", "cta", "skipCta", "Lcom/stripe/android/financialconnections/model/u;", "legalDetailsNotice", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/u;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/u;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "g", "(Lcom/stripe/android/financialconnections/model/a0;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "getTitle$annotations", "()V", "b", "Lcom/stripe/android/financialconnections/model/z;", "()Lcom/stripe/android/financialconnections/model/z;", "getBody$annotations", "c", "getAboveCta$annotations", DateTokenConverter.CONVERTER_KEY, "getCta$annotations", "e", "getSkipCta$annotations", "Lcom/stripe/android/financialconnections/model/u;", "()Lcom/stripe/android/financialconnections/model/u;", "getLegalDetailsNotice$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class NetworkingLinkSignupPane implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final NetworkingLinkSignupBody body;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String aboveCta;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cta;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String skipCta;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LegalDetailsNotice legalDetailsNotice;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f50383g = 8;
    public static final Parcelable.Creator<NetworkingLinkSignupPane> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.a0$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/NetworkingLinkSignupPane.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/a0;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/a0;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/a0;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<NetworkingLinkSignupPane> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50390a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50390a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.NetworkingLinkSignupPane", aVar, 6);
            m1Var.o("title", false);
            m1Var.o("body", false);
            m1Var.o("above_cta", false);
            m1Var.o("cta", false);
            m1Var.o("skip_cta", false);
            m1Var.o("legal_details_notice", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NetworkingLinkSignupPane deserialize(uo0.e decoder) {
            int i11;
            String str;
            NetworkingLinkSignupBody zVar;
            String str2;
            String str3;
            String str4;
            LegalDetailsNotice legalDetailsNotice;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i12 = 5;
            String str5 = null;
            if (cVarB.i()) {
                n50.d dVar = n50.d.f93345a;
                String str6 = (String) cVarB.n(descriptor2, 0, dVar, null);
                NetworkingLinkSignupBody zVar2 = (NetworkingLinkSignupBody) cVarB.n(descriptor2, 1, NetworkingLinkSignupBody.a.f50599a, null);
                String str7 = (String) cVarB.n(descriptor2, 2, dVar, null);
                String str8 = (String) cVarB.n(descriptor2, 3, dVar, null);
                str4 = (String) cVarB.n(descriptor2, 4, dVar, null);
                legalDetailsNotice = (LegalDetailsNotice) cVarB.v(descriptor2, 5, LegalDetailsNotice.a.f50569a, null);
                str3 = str8;
                i11 = 63;
                str2 = str7;
                zVar = zVar2;
                str = str6;
            } else {
                boolean z11 = true;
                int i13 = 0;
                NetworkingLinkSignupBody zVar3 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                LegalDetailsNotice legalDetailsNotice2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 5;
                            break;
                        case 0:
                            str5 = (String) cVarB.n(descriptor2, 0, n50.d.f93345a, str5);
                            i13 |= 1;
                            i12 = 5;
                            break;
                        case 1:
                            zVar3 = (NetworkingLinkSignupBody) cVarB.n(descriptor2, 1, NetworkingLinkSignupBody.a.f50599a, zVar3);
                            i13 |= 2;
                            break;
                        case 2:
                            str9 = (String) cVarB.n(descriptor2, 2, n50.d.f93345a, str9);
                            i13 |= 4;
                            break;
                        case 3:
                            str10 = (String) cVarB.n(descriptor2, 3, n50.d.f93345a, str10);
                            i13 |= 8;
                            break;
                        case 4:
                            str11 = (String) cVarB.n(descriptor2, 4, n50.d.f93345a, str11);
                            i13 |= 16;
                            break;
                        case 5:
                            legalDetailsNotice2 = (LegalDetailsNotice) cVarB.v(descriptor2, i12, LegalDetailsNotice.a.f50569a, legalDetailsNotice2);
                            i13 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                str = str5;
                zVar = zVar3;
                str2 = str9;
                str3 = str10;
                str4 = str11;
                legalDetailsNotice = legalDetailsNotice2;
            }
            cVarB.c(descriptor2);
            return new NetworkingLinkSignupPane(i11, str, zVar, str2, str3, str4, legalDetailsNotice, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, NetworkingLinkSignupPane value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            NetworkingLinkSignupPane.g(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?> dVarP = so0.a.p(LegalDetailsNotice.a.f50569a);
            n50.d dVar = n50.d.f93345a;
            return new ro0.d[]{dVar, NetworkingLinkSignupBody.a.f50599a, dVar, dVar, dVar, dVarP};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.a0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/a0$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/a0;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<NetworkingLinkSignupPane> serializer() {
            return a.f50390a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.a0$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<NetworkingLinkSignupPane> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkSignupPane createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new NetworkingLinkSignupPane(parcel.readString(), NetworkingLinkSignupBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LegalDetailsNotice.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NetworkingLinkSignupPane[] newArray(int i11) {
            return new NetworkingLinkSignupPane[i11];
        }
    }

    @jn0.e
    public /* synthetic */ NetworkingLinkSignupPane(int i11, @ro0.o("title") @ro0.p(with = n50.d.class) String str, @ro0.o("body") NetworkingLinkSignupBody zVar, @ro0.o("above_cta") @ro0.p(with = n50.d.class) String str2, @ro0.o("cta") @ro0.p(with = n50.d.class) String str3, @ro0.o("skip_cta") @ro0.p(with = n50.d.class) String str4, @ro0.o("legal_details_notice") LegalDetailsNotice legalDetailsNotice, v1 v1Var) {
        if (31 != (i11 & 31)) {
            h1.b(i11, 31, a.f50390a.getDescriptor());
        }
        this.title = str;
        this.body = zVar;
        this.aboveCta = str2;
        this.cta = str3;
        this.skipCta = str4;
        if ((i11 & 32) == 0) {
            this.legalDetailsNotice = null;
        } else {
            this.legalDetailsNotice = legalDetailsNotice;
        }
    }

    public static final /* synthetic */ void g(NetworkingLinkSignupPane self, uo0.d output, to0.f serialDesc) {
        n50.d dVar = n50.d.f93345a;
        output.D(serialDesc, 0, dVar, self.title);
        output.D(serialDesc, 1, NetworkingLinkSignupBody.a.f50599a, self.body);
        output.D(serialDesc, 2, dVar, self.aboveCta);
        output.D(serialDesc, 3, dVar, self.cta);
        output.D(serialDesc, 4, dVar, self.skipCta);
        if (!output.G(serialDesc, 5) && self.legalDetailsNotice == null) {
            return;
        }
        output.y(serialDesc, 5, LegalDetailsNotice.a.f50569a, self.legalDetailsNotice);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAboveCta() {
        return this.aboveCta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final NetworkingLinkSignupBody getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LegalDetailsNotice getLegalDetailsNotice() {
        return this.legalDetailsNotice;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSkipCta() {
        return this.skipCta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkingLinkSignupPane)) {
            return false;
        }
        NetworkingLinkSignupPane networkingLinkSignupPane = (NetworkingLinkSignupPane) other;
        return p013kotlin.jvm.internal.s.f(this.title, networkingLinkSignupPane.title) && p013kotlin.jvm.internal.s.f(this.body, networkingLinkSignupPane.body) && p013kotlin.jvm.internal.s.f(this.aboveCta, networkingLinkSignupPane.aboveCta) && p013kotlin.jvm.internal.s.f(this.cta, networkingLinkSignupPane.cta) && p013kotlin.jvm.internal.s.f(this.skipCta, networkingLinkSignupPane.skipCta) && p013kotlin.jvm.internal.s.f(this.legalDetailsNotice, networkingLinkSignupPane.legalDetailsNotice);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.aboveCta.hashCode()) * 31) + this.cta.hashCode()) * 31) + this.skipCta.hashCode()) * 31;
        LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
        return iHashCode + (legalDetailsNotice == null ? 0 : legalDetailsNotice.hashCode());
    }

    public String toString() {
        return "NetworkingLinkSignupPane(title=" + this.title + ", body=" + this.body + ", aboveCta=" + this.aboveCta + ", cta=" + this.cta + ", skipCta=" + this.skipCta + ", legalDetailsNotice=" + this.legalDetailsNotice + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.title);
        this.body.writeToParcel(parcel, flags);
        parcel.writeString(this.aboveCta);
        parcel.writeString(this.cta);
        parcel.writeString(this.skipCta);
        LegalDetailsNotice legalDetailsNotice = this.legalDetailsNotice;
        if (legalDetailsNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            legalDetailsNotice.writeToParcel(parcel, flags);
        }
    }

    public NetworkingLinkSignupPane(String title, NetworkingLinkSignupBody body, String aboveCta, String cta, String skipCta, LegalDetailsNotice legalDetailsNotice) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(aboveCta, "aboveCta");
        p013kotlin.jvm.internal.s.k(cta, "cta");
        p013kotlin.jvm.internal.s.k(skipCta, "skipCta");
        this.title = title;
        this.body = body;
        this.aboveCta = aboveCta;
        this.cta = cta;
        this.skipCta = skipCta;
        this.legalDetailsNotice = legalDetailsNotice;
    }
}
