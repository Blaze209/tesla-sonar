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

/* JADX INFO: renamed from: com.stripe.android.financialconnections.model.h, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0081\b\u0018\u0000 A2\u00020\u0001:\u0002+/BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eBo\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010)\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010,\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001dR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u0010.\u001a\u0004\b1\u00103R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010,\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b:\u0010.\u001a\u0004\b7\u00109R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b>\u0010.\u001a\u0004\b;\u0010=R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010,\u0012\u0004\b@\u0010.\u001a\u0004\b?\u0010\u001d¨\u0006B"}, d2 = {"Lcom/stripe/android/financialconnections/model/h;", "Landroid/os/Parcelable;", "", "aboveCta", "belowCta", "Lcom/stripe/android/financialconnections/model/i;", "body", "cta", "Lcom/stripe/android/financialconnections/model/l;", "dataAccessNotice", "Lcom/stripe/android/financialconnections/model/u;", "legalDetailsNotice", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/i;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/l;Lcom/stripe/android/financialconnections/model/u;Ljava/lang/String;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/i;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/l;Lcom/stripe/android/financialconnections/model/u;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "h", "(Lcom/stripe/android/financialconnections/model/h;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getAboveCta$annotations", "()V", "b", "getBelowCta$annotations", "c", "Lcom/stripe/android/financialconnections/model/i;", "()Lcom/stripe/android/financialconnections/model/i;", "getBody$annotations", DateTokenConverter.CONVERTER_KEY, "getCta$annotations", "e", "Lcom/stripe/android/financialconnections/model/l;", "()Lcom/stripe/android/financialconnections/model/l;", "getDataAccessNotice$annotations", "f", "Lcom/stripe/android/financialconnections/model/u;", "()Lcom/stripe/android/financialconnections/model/u;", "getLegalDetailsNotice$annotations", "g", "getTitle$annotations", "Companion", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ro0.p
public final /* data */ class ConsentPane implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String aboveCta;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String belowCta;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConsentPaneBody body;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cta;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final DataAccessNotice dataAccessNotice;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LegalDetailsNotice legalDetailsNotice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50464h = 8;
    public static final Parcelable.Creator<ConsentPane> CREATOR = new c();

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.h$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/financialconnections/model/ConsentPane.$serializer", "Lvo0/e0;", "Lcom/stripe/android/financialconnections/model/h;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lcom/stripe/android/financialconnections/model/h;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lcom/stripe/android/financialconnections/model/h;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements vo0.e0<ConsentPane> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f50472a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f50472a = aVar;
            m1 m1Var = new m1("com.stripe.android.financialconnections.model.ConsentPane", aVar, 7);
            m1Var.o("above_cta", false);
            m1Var.o("below_cta", true);
            m1Var.o("body", false);
            m1Var.o("cta", false);
            m1Var.o("data_access_notice", true);
            m1Var.o("legal_details_notice", false);
            m1Var.o("title", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConsentPane deserialize(uo0.e decoder) {
            int i11;
            String str;
            String str2;
            String str3;
            ConsentPaneBody consentPaneBody;
            String str4;
            DataAccessNotice dataAccessNotice;
            LegalDetailsNotice legalDetailsNotice;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            int i12 = 6;
            String str5 = null;
            if (cVarB.i()) {
                n50.d dVar = n50.d.f93345a;
                String str6 = (String) cVarB.n(descriptor2, 0, dVar, null);
                String str7 = (String) cVarB.v(descriptor2, 1, dVar, null);
                ConsentPaneBody consentPaneBody2 = (ConsentPaneBody) cVarB.n(descriptor2, 2, ConsentPaneBody.a.f50479a, null);
                String str8 = (String) cVarB.n(descriptor2, 3, dVar, null);
                DataAccessNotice dataAccessNotice2 = (DataAccessNotice) cVarB.v(descriptor2, 4, DataAccessNotice.a.f50507a, null);
                LegalDetailsNotice legalDetailsNotice2 = (LegalDetailsNotice) cVarB.n(descriptor2, 5, LegalDetailsNotice.a.f50569a, null);
                str = (String) cVarB.n(descriptor2, 6, dVar, null);
                i11 = 127;
                legalDetailsNotice = legalDetailsNotice2;
                str4 = str8;
                dataAccessNotice = dataAccessNotice2;
                consentPaneBody = consentPaneBody2;
                str3 = str7;
                str2 = str6;
            } else {
                boolean z11 = true;
                int i13 = 0;
                String str9 = null;
                String str10 = null;
                ConsentPaneBody consentPaneBody3 = null;
                String str11 = null;
                DataAccessNotice dataAccessNotice3 = null;
                LegalDetailsNotice legalDetailsNotice3 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    switch (iA) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                            break;
                        case 0:
                            str5 = (String) cVarB.n(descriptor2, 0, n50.d.f93345a, str5);
                            i13 |= 1;
                            i12 = 6;
                            break;
                        case 1:
                            str10 = (String) cVarB.v(descriptor2, 1, n50.d.f93345a, str10);
                            i13 |= 2;
                            i12 = 6;
                            break;
                        case 2:
                            consentPaneBody3 = (ConsentPaneBody) cVarB.n(descriptor2, 2, ConsentPaneBody.a.f50479a, consentPaneBody3);
                            i13 |= 4;
                            break;
                        case 3:
                            str11 = (String) cVarB.n(descriptor2, 3, n50.d.f93345a, str11);
                            i13 |= 8;
                            break;
                        case 4:
                            dataAccessNotice3 = (DataAccessNotice) cVarB.v(descriptor2, 4, DataAccessNotice.a.f50507a, dataAccessNotice3);
                            i13 |= 16;
                            break;
                        case 5:
                            legalDetailsNotice3 = (LegalDetailsNotice) cVarB.n(descriptor2, 5, LegalDetailsNotice.a.f50569a, legalDetailsNotice3);
                            i13 |= 32;
                            break;
                        case 6:
                            str9 = (String) cVarB.n(descriptor2, i12, n50.d.f93345a, str9);
                            i13 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                }
                i11 = i13;
                str = str9;
                str2 = str5;
                str3 = str10;
                consentPaneBody = consentPaneBody3;
                str4 = str11;
                dataAccessNotice = dataAccessNotice3;
                legalDetailsNotice = legalDetailsNotice3;
            }
            cVarB.c(descriptor2);
            return new ConsentPane(i11, str2, str3, consentPaneBody, str4, dataAccessNotice, legalDetailsNotice, str, null);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, ConsentPane value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            ConsentPane.h(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            n50.d dVar = n50.d.f93345a;
            return new ro0.d[]{dVar, so0.a.p(dVar), ConsentPaneBody.a.f50479a, dVar, so0.a.p(DataAccessNotice.a.f50507a), LegalDetailsNotice.a.f50569a, dVar};
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

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/h$b;", "", "<init>", "()V", "Lro0/d;", "Lcom/stripe/android/financialconnections/model/h;", "serializer", "()Lro0/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<ConsentPane> serializer() {
            return a.f50472a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.model.h$c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ConsentPane> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConsentPane createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ConsentPane(parcel.readString(), parcel.readString(), ConsentPaneBody.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : DataAccessNotice.CREATOR.createFromParcel(parcel), LegalDetailsNotice.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConsentPane[] newArray(int i11) {
            return new ConsentPane[i11];
        }
    }

    @jn0.e
    public /* synthetic */ ConsentPane(int i11, @ro0.o("above_cta") @ro0.p(with = n50.d.class) String str, @ro0.o("below_cta") @ro0.p(with = n50.d.class) String str2, @ro0.o("body") ConsentPaneBody consentPaneBody, @ro0.o("cta") @ro0.p(with = n50.d.class) String str3, @ro0.o("data_access_notice") DataAccessNotice dataAccessNotice, @ro0.o("legal_details_notice") LegalDetailsNotice legalDetailsNotice, @ro0.o("title") @ro0.p(with = n50.d.class) String str4, v1 v1Var) {
        if (109 != (i11 & 109)) {
            h1.b(i11, 109, a.f50472a.getDescriptor());
        }
        this.aboveCta = str;
        if ((i11 & 2) == 0) {
            this.belowCta = null;
        } else {
            this.belowCta = str2;
        }
        this.body = consentPaneBody;
        this.cta = str3;
        if ((i11 & 16) == 0) {
            this.dataAccessNotice = null;
        } else {
            this.dataAccessNotice = dataAccessNotice;
        }
        this.legalDetailsNotice = legalDetailsNotice;
        this.title = str4;
    }

    public static final /* synthetic */ void h(ConsentPane self, uo0.d output, to0.f serialDesc) {
        n50.d dVar = n50.d.f93345a;
        output.D(serialDesc, 0, dVar, self.aboveCta);
        if (output.G(serialDesc, 1) || self.belowCta != null) {
            output.y(serialDesc, 1, dVar, self.belowCta);
        }
        output.D(serialDesc, 2, ConsentPaneBody.a.f50479a, self.body);
        output.D(serialDesc, 3, dVar, self.cta);
        if (output.G(serialDesc, 4) || self.dataAccessNotice != null) {
            output.y(serialDesc, 4, DataAccessNotice.a.f50507a, self.dataAccessNotice);
        }
        output.D(serialDesc, 5, LegalDetailsNotice.a.f50569a, self.legalDetailsNotice);
        output.D(serialDesc, 6, dVar, self.title);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAboveCta() {
        return this.aboveCta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBelowCta() {
        return this.belowCta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ConsentPaneBody getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DataAccessNotice getDataAccessNotice() {
        return this.dataAccessNotice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentPane)) {
            return false;
        }
        ConsentPane consentPane = (ConsentPane) other;
        return p013kotlin.jvm.internal.s.f(this.aboveCta, consentPane.aboveCta) && p013kotlin.jvm.internal.s.f(this.belowCta, consentPane.belowCta) && p013kotlin.jvm.internal.s.f(this.body, consentPane.body) && p013kotlin.jvm.internal.s.f(this.cta, consentPane.cta) && p013kotlin.jvm.internal.s.f(this.dataAccessNotice, consentPane.dataAccessNotice) && p013kotlin.jvm.internal.s.f(this.legalDetailsNotice, consentPane.legalDetailsNotice) && p013kotlin.jvm.internal.s.f(this.title, consentPane.title);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LegalDetailsNotice getLegalDetailsNotice() {
        return this.legalDetailsNotice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.aboveCta.hashCode() * 31;
        String str = this.belowCta;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.body.hashCode()) * 31) + this.cta.hashCode()) * 31;
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        return ((((iHashCode2 + (dataAccessNotice != null ? dataAccessNotice.hashCode() : 0)) * 31) + this.legalDetailsNotice.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "ConsentPane(aboveCta=" + this.aboveCta + ", belowCta=" + this.belowCta + ", body=" + this.body + ", cta=" + this.cta + ", dataAccessNotice=" + this.dataAccessNotice + ", legalDetailsNotice=" + this.legalDetailsNotice + ", title=" + this.title + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.aboveCta);
        parcel.writeString(this.belowCta);
        this.body.writeToParcel(parcel, flags);
        parcel.writeString(this.cta);
        DataAccessNotice dataAccessNotice = this.dataAccessNotice;
        if (dataAccessNotice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataAccessNotice.writeToParcel(parcel, flags);
        }
        this.legalDetailsNotice.writeToParcel(parcel, flags);
        parcel.writeString(this.title);
    }

    public ConsentPane(String aboveCta, String str, ConsentPaneBody body, String cta, DataAccessNotice dataAccessNotice, LegalDetailsNotice legalDetailsNotice, String title) {
        p013kotlin.jvm.internal.s.k(aboveCta, "aboveCta");
        p013kotlin.jvm.internal.s.k(body, "body");
        p013kotlin.jvm.internal.s.k(cta, "cta");
        p013kotlin.jvm.internal.s.k(legalDetailsNotice, "legalDetailsNotice");
        p013kotlin.jvm.internal.s.k(title, "title");
        this.aboveCta = aboveCta;
        this.belowCta = str;
        this.body = body;
        this.cta = cta;
        this.dataAccessNotice = dataAccessNotice;
        this.legalDetailsNotice = legalDetailsNotice;
        this.title = title;
    }
}
