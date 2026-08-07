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

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.l, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0081\b\u0018\u0000 A2\u00020\u0001:\u0002+1BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eBo\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010)\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00102\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u00100\u001a\u0004\b+\u0010:R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010<\u0012\u0004\b>\u00100\u001a\u0004\b1\u0010=R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00102\u0012\u0004\b?\u00100\u001a\u0004\b8\u0010\u001dR \u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00102\u0012\u0004\b@\u00100\u001a\u0004\b5\u0010\u001d¨\u0006B"}, d2 = {"Lcom/stripe/android/financialconnections/model/l;", "Landroid/os/Parcelable;", "Lcom/stripe/android/financialconnections/model/r;", "icon", "", "title", "subtitle", "Lcom/stripe/android/financialconnections/model/m;", "body", "Lcom/stripe/android/financialconnections/model/g;", "connectedAccountNotice", "disclaimer", "cta", "<init>", "(Lcom/stripe/android/financialconnections/model/r;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/m;Lcom/stripe/android/financialconnections/model/g;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/stripe/android/financialconnections/model/r;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/m;Lcom/stripe/android/financialconnections/model/g;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "h", "(Lcom/stripe/android/financialconnections/model/l;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/financialconnections/model/r;", "e", "()Lcom/stripe/android/financialconnections/model/r;", "getIcon$annotations", "()V", "b", "Ljava/lang/String;", "g", "getTitle$annotations", "c", "f", "getSubtitle$annotations", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/model/m;", "()Lcom/stripe/android/financialconnections/model/m;", "getBody$annotations", "Lcom/stripe/android/financialconnections/model/g;", "()Lcom/stripe/android/financialconnections/model/g;", "getConnectedAccountNotice$annotations", "getDisclaimer$annotations", "getCta$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class DataAccessNotice implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataAccessNoticeBody body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConnectedAccessNotice connectedAccountNotice;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String disclaimer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cta;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50499h = 8;
    public static final Parcelable.Creator<DataAccessNotice> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.l$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/DataAccessNotice.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/l;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/l;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/l;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<DataAccessNotice> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50507a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50507a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.DataAccessNotice", aVar, 7);
            m1Var.o("icon", true);
            m1Var.o("title", false);
            m1Var.o("subtitle", true);
            m1Var.o("body", false);
            m1Var.o("connected_account_notice", true);
            m1Var.o("disclaimer", true);
            m1Var.o("cta", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataAccessNotice deserialize(uo0.e decoder) {
            int i11;
            String str;
            Image image;
            String str2;
            String str3;
            DataAccessNoticeBody mVar;
            ConnectedAccessNotice gVar;
            String str4;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i12 = 6;
            Image image2 = null;
            if (cVarB.i()) {
                Image image3 = (Image) cVarB.v(descriptor2, 0, Image.a.f50552a, null);
                n50.d dVar = n50.d.f93345a;
                String str5 = (String) cVarB.n(descriptor2, 1, dVar, null);
                String str6 = (String) cVarB.v(descriptor2, 2, dVar, null);
                DataAccessNoticeBody mVar2 = (DataAccessNoticeBody) cVarB.n(descriptor2, 3, DataAccessNoticeBody.a.f50520a, null);
                ConnectedAccessNotice gVar2 = (ConnectedAccessNotice) cVarB.v(descriptor2, 4, ConnectedAccessNotice.a.f50454a, null);
                String str7 = (String) cVarB.v(descriptor2, 5, dVar, null);
                image = image3;
                str = (String) cVarB.n(descriptor2, 6, dVar, null);
                str4 = str7;
                mVar = mVar2;
                gVar = gVar2;
                str3 = str6;
                str2 = str5;
                i11 = 127;
            } else {
                boolean z11 = true;
                int i13 = 0;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                DataAccessNoticeBody mVar3 = null;
                ConnectedAccessNotice gVar3 = null;
                String str11 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                            break;
                        case 0:
                            image2 = (Image) cVarB.v(descriptor2, 0, Image.a.f50552a, image2);
                            i13 |= 1;
                            i12 = 6;
                            break;
                        case 1:
                            str9 = (String) cVarB.n(descriptor2, 1, n50.d.f93345a, str9);
                            i13 |= 2;
                            i12 = 6;
                            break;
                        case 2:
                            str10 = (String) cVarB.v(descriptor2, 2, n50.d.f93345a, str10);
                            i13 |= 4;
                            break;
                        case 3:
                            mVar3 = (DataAccessNoticeBody) cVarB.n(descriptor2, 3, DataAccessNoticeBody.a.f50520a, mVar3);
                            i13 |= 8;
                            break;
                        case 4:
                            gVar3 = (ConnectedAccessNotice) cVarB.v(descriptor2, 4, ConnectedAccessNotice.a.f50454a, gVar3);
                            i13 |= 16;
                            break;
                        case 5:
                            str11 = (String) cVarB.v(descriptor2, 5, n50.d.f93345a, str11);
                            i13 |= 32;
                            break;
                        case 6:
                            str8 = (String) cVarB.n(descriptor2, i12, n50.d.f93345a, str8);
                            i13 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                str = str8;
                image = image2;
                str2 = str9;
                str3 = str10;
                mVar = mVar3;
                gVar = gVar3;
                str4 = str11;
            }
            cVarB.c(descriptor2);
            return new DataAccessNotice(i11, image, str2, str3, mVar, gVar, str4, str, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, DataAccessNotice value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            DataAccessNotice.h(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            ro0.d<?> dVarP = so0.a.p(Image.a.f50552a);
            n50.d dVar = n50.d.f93345a;
            return new ro0.d[]{dVarP, dVar, so0.a.p(dVar), DataAccessNoticeBody.a.f50520a, so0.a.p(ConnectedAccessNotice.a.f50454a), so0.a.p(dVar), dVar};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/l$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/l;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<DataAccessNotice> serializer() {
            return a.f50507a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.l$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<DataAccessNotice> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DataAccessNotice createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new DataAccessNotice(parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), DataAccessNoticeBody.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ConnectedAccessNotice.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DataAccessNotice[] newArray(int i11) {
            return new DataAccessNotice[i11];
        }
    }

    @jn0.e
    public /* synthetic */ DataAccessNotice(int i11, @ro0.o("icon") Image image, @ro0.o("title") @ro0.p(with = n50.d.class) String str, @ro0.o("subtitle") @ro0.p(with = n50.d.class) String str2, @ro0.o("body") DataAccessNoticeBody mVar, @ro0.o("connected_account_notice") ConnectedAccessNotice gVar, @ro0.o("disclaimer") @ro0.p(with = n50.d.class) String str3, @ro0.o("cta") @ro0.p(with = n50.d.class) String str4, v1 v1Var) {
        if (74 != (i11 & 74)) {
            h1.b(i11, 74, a.f50507a.getDescriptor());
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
        this.body = mVar;
        if ((i11 & 16) == 0) {
            this.connectedAccountNotice = null;
        } else {
            this.connectedAccountNotice = gVar;
        }
        if ((i11 & 32) == 0) {
            this.disclaimer = null;
        } else {
            this.disclaimer = str3;
        }
        this.cta = str4;
    }

    public static final /* synthetic */ void h(DataAccessNotice self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.icon != null) {
            output.y(serialDesc, 0, Image.a.f50552a, self.icon);
        }
        n50.d dVar = n50.d.f93345a;
        output.D(serialDesc, 1, dVar, self.title);
        if (output.G(serialDesc, 2) || self.subtitle != null) {
            output.y(serialDesc, 2, dVar, self.subtitle);
        }
        output.D(serialDesc, 3, DataAccessNoticeBody.a.f50520a, self.body);
        if (output.G(serialDesc, 4) || self.connectedAccountNotice != null) {
            output.y(serialDesc, 4, ConnectedAccessNotice.a.f50454a, self.connectedAccountNotice);
        }
        if (output.G(serialDesc, 5) || self.disclaimer != null) {
            output.y(serialDesc, 5, dVar, self.disclaimer);
        }
        output.D(serialDesc, 6, dVar, self.cta);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DataAccessNoticeBody getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ConnectedAccessNotice getConnectedAccountNotice() {
        return this.connectedAccountNotice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataAccessNotice)) {
            return false;
        }
        DataAccessNotice dataAccessNotice = (DataAccessNotice) other;
        return p013kotlin.jvm.internal.s.f(this.icon, dataAccessNotice.icon) && p013kotlin.jvm.internal.s.f(this.title, dataAccessNotice.title) && p013kotlin.jvm.internal.s.f(this.subtitle, dataAccessNotice.subtitle) && p013kotlin.jvm.internal.s.f(this.body, dataAccessNotice.body) && p013kotlin.jvm.internal.s.f(this.connectedAccountNotice, dataAccessNotice.connectedAccountNotice) && p013kotlin.jvm.internal.s.f(this.disclaimer, dataAccessNotice.disclaimer) && p013kotlin.jvm.internal.s.f(this.cta, dataAccessNotice.cta);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Image image = this.icon;
        int iHashCode = (((image == null ? 0 : image.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.subtitle;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.body.hashCode()) * 31;
        ConnectedAccessNotice gVar = this.connectedAccountNotice;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str2 = this.disclaimer;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.cta.hashCode();
    }

    public String toString() {
        return "DataAccessNotice(icon=" + this.icon + ", title=" + this.title + ", subtitle=" + this.subtitle + ", body=" + this.body + ", connectedAccountNotice=" + this.connectedAccountNotice + ", disclaimer=" + this.disclaimer + ", cta=" + this.cta + ")";
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
        ConnectedAccessNotice gVar = this.connectedAccountNotice;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gVar.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.disclaimer);
        parcel.writeString(this.cta);
    }

    public DataAccessNotice(Image image, String title, String str, DataAccessNoticeBody body, ConnectedAccessNotice gVar, String str2, String cta) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(cta, "cta");
        this.icon = image;
        this.title = title;
        this.subtitle = str;
        this.body = body;
        this.connectedAccountNotice = gVar;
        this.disclaimer = str2;
        this.cta = cta;
    }
}
