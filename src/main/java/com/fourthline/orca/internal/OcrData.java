package com.fourthline.orca.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.fourthline.scanners.config.orca.workflow.WorkflowKeys;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Yn, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0081\b\u0018\u0000 A2\u00020\u0001:\u0002\u001c*B\u009d\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010)R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010)R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010)R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010&\u001a\u0004\b4\u0010\u001f\"\u0004\b5\u0010)R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010)R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010&\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010)R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b3\u0010\u001f\"\u0004\b:\u0010)R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010&\u001a\u0004\b*\u0010\u001f\"\u0004\b;\u0010)R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010&\u001a\u0004\b\u001c\u0010\u001f\"\u0004\b<\u0010)R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b-\u0010\u001f\"\u0004\b=\u0010)R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b0\u0010\u001f\"\u0004\b>\u0010)R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010&\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010)¨\u0006B"}, d2 = {"Lcom/fourthline/orca/internal/Yn;", "", "", "seen0", "", EContextPaymentMethod.FIRST_NAME, EContextPaymentMethod.LAST_NAME, "initials", "gender", "nationality", WorkflowKeys.ISSUING_COUNTRY, "issueDate", "expirationDate", "dateOfBirth", "birthPlace", "documentNumber", "documentType", "taxIdentificationNumber", "Lvo0/v1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "a", "(Lcom/fourthline/orca/internal/Yn;Luo0/d;Lto0/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "setFirstName", "(Ljava/lang/String;)V", "b", "k", "setLastName", "c", "h", "setInitials", DateTokenConverter.CONVERTER_KEY, "g", "setGender", "e", "l", "setNationality", "j", "setIssuingCountry", IntegerTokenConverter.CONVERTER_KEY, "setIssueDate", "setExpirationDate", "setDateOfBirth", "setBirthPlace", "setDocumentNumber", "setDocumentType", "m", "setTaxIdentificationNumber", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ro0.p
public final /* data */ class OcrData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f29905n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String firstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String lastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String initials;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String gender;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String nationality;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String issuingCountry;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String issueDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String expirationDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private String dateOfBirth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private String birthPlace;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private String documentNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private String documentType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private String taxIdentificationNumber;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Yn$a */
    public /* synthetic */ class a implements vo0.e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29920b;
        private static final to0.f descriptor;

        static {
            a aVar = new a();
            f29919a = aVar;
            f29920b = 8;
            vo0.m1 m1Var = new vo0.m1("com.fourthline.orca.core.internal.capabilities.documentrecognition.network.analysis.OcrData", aVar, 13);
            m1Var.o(EContextPaymentMethod.FIRST_NAME, true);
            m1Var.o(EContextPaymentMethod.LAST_NAME, true);
            m1Var.o("initials", true);
            m1Var.o("gender", true);
            m1Var.o("nationality", true);
            m1Var.o(WorkflowKeys.ISSUING_COUNTRY, true);
            m1Var.o("issueDate", true);
            m1Var.o("expirationDate", true);
            m1Var.o("dateOfBirth", true);
            m1Var.o("birthPlace", true);
            m1Var.o("documentNumber", true);
            m1Var.o("documentType", true);
            m1Var.o("taxIdentificationNumber", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OcrData deserialize(uo0.e decoder) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            int i11;
            p013kotlin.jvm.internal.s.k(decoder, "decoder");
            to0.f fVar = descriptor;
            uo0.c cVarB = decoder.b(fVar);
            if (cVarB.i()) {
                vo0.z1 z1Var = vo0.z1.f119730a;
                String str14 = (String) cVarB.v(fVar, 0, z1Var, null);
                String str15 = (String) cVarB.v(fVar, 1, z1Var, null);
                String str16 = (String) cVarB.v(fVar, 2, z1Var, null);
                String str17 = (String) cVarB.v(fVar, 3, z1Var, null);
                String str18 = (String) cVarB.v(fVar, 4, z1Var, null);
                String str19 = (String) cVarB.v(fVar, 5, z1Var, null);
                String str20 = (String) cVarB.v(fVar, 6, z1Var, null);
                String str21 = (String) cVarB.v(fVar, 7, z1Var, null);
                String str22 = (String) cVarB.v(fVar, 8, z1Var, null);
                String str23 = (String) cVarB.v(fVar, 9, z1Var, null);
                String str24 = (String) cVarB.v(fVar, 10, z1Var, null);
                String str25 = (String) cVarB.v(fVar, 11, z1Var, null);
                str13 = (String) cVarB.v(fVar, 12, z1Var, null);
                i11 = 8191;
                str3 = str24;
                str8 = str23;
                str5 = str21;
                str6 = str20;
                str9 = str19;
                str10 = str17;
                str4 = str22;
                str7 = str18;
                str11 = str16;
                str12 = str15;
                str = str14;
                str2 = str25;
            } else {
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                boolean z11 = true;
                String str37 = null;
                int i12 = 0;
                String str38 = null;
                while (z11) {
                    String str39 = str26;
                    int iA = cVarB.A(fVar);
                    switch (iA) {
                        case -1:
                            str26 = str39;
                            z11 = false;
                            str27 = str27;
                            i12 = i12;
                            continue;
                        case 0:
                            str26 = (String) cVarB.v(fVar, 0, vo0.z1.f119730a, str39);
                            i12 |= 1;
                            str27 = str27;
                            continue;
                        case 1:
                            str38 = (String) cVarB.v(fVar, 1, vo0.z1.f119730a, str38);
                            i12 |= 2;
                            str26 = str39;
                            continue;
                        case 2:
                            str37 = (String) cVarB.v(fVar, 2, vo0.z1.f119730a, str37);
                            i12 |= 4;
                            break;
                        case 3:
                            str36 = (String) cVarB.v(fVar, 3, vo0.z1.f119730a, str36);
                            i12 |= 8;
                            break;
                        case 4:
                            str33 = (String) cVarB.v(fVar, 4, vo0.z1.f119730a, str33);
                            i12 |= 16;
                            break;
                        case 5:
                            str35 = (String) cVarB.v(fVar, 5, vo0.z1.f119730a, str35);
                            i12 |= 32;
                            break;
                        case 6:
                            str32 = (String) cVarB.v(fVar, 6, vo0.z1.f119730a, str32);
                            i12 |= 64;
                            break;
                        case 7:
                            str31 = (String) cVarB.v(fVar, 7, vo0.z1.f119730a, str31);
                            i12 |= 128;
                            break;
                        case 8:
                            str30 = (String) cVarB.v(fVar, 8, vo0.z1.f119730a, str30);
                            i12 |= 256;
                            break;
                        case 9:
                            str34 = (String) cVarB.v(fVar, 9, vo0.z1.f119730a, str34);
                            i12 |= 512;
                            break;
                        case 10:
                            str29 = (String) cVarB.v(fVar, 10, vo0.z1.f119730a, str29);
                            i12 |= 1024;
                            break;
                        case 11:
                            str28 = (String) cVarB.v(fVar, 11, vo0.z1.f119730a, str28);
                            i12 |= 2048;
                            break;
                        case 12:
                            str27 = (String) cVarB.v(fVar, 12, vo0.z1.f119730a, str27);
                            i12 |= 4096;
                            break;
                        default:
                            throw new UnknownFieldException(iA);
                    }
                    str26 = str39;
                    str38 = str38;
                }
                str = str26;
                str2 = str28;
                str3 = str29;
                str4 = str30;
                str5 = str31;
                str6 = str32;
                str7 = str33;
                str8 = str34;
                str9 = str35;
                str10 = str36;
                str11 = str37;
                str12 = str38;
                str13 = str27;
                i11 = i12;
            }
            cVarB.c(fVar);
            return new OcrData(i11, str, str12, str11, str10, str7, str9, str6, str5, str4, str8, str3, str2, str13, null);
        }

        @Override // vo0.e0
        public final ro0.d[] childSerializers() {
            vo0.z1 z1Var = vo0.z1.f119730a;
            return new ro0.d[]{so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var), so0.a.p(z1Var)};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public final to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d[] typeParametersSerializers() {
            return vo0.e0.a.a(this);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(uo0.f encoder, OcrData value) {
            p013kotlin.jvm.internal.s.k(encoder, "encoder");
            p013kotlin.jvm.internal.s.k(value, "value");
            to0.f fVar = descriptor;
            uo0.d dVarB = encoder.b(fVar);
            OcrData.a(value, dVarB, fVar);
            dVarB.c(fVar);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Yn$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final ro0.d<OcrData> serializer() {
            return a.f29919a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OcrData(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, vo0.v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.firstName = null;
        } else {
            this.firstName = str;
        }
        if ((i11 & 2) == 0) {
            this.lastName = null;
        } else {
            this.lastName = str2;
        }
        if ((i11 & 4) == 0) {
            this.initials = null;
        } else {
            this.initials = str3;
        }
        if ((i11 & 8) == 0) {
            this.gender = null;
        } else {
            this.gender = str4;
        }
        if ((i11 & 16) == 0) {
            this.nationality = null;
        } else {
            this.nationality = str5;
        }
        if ((i11 & 32) == 0) {
            this.issuingCountry = null;
        } else {
            this.issuingCountry = str6;
        }
        if ((i11 & 64) == 0) {
            this.issueDate = null;
        } else {
            this.issueDate = str7;
        }
        if ((i11 & 128) == 0) {
            this.expirationDate = null;
        } else {
            this.expirationDate = str8;
        }
        if ((i11 & 256) == 0) {
            this.dateOfBirth = null;
        } else {
            this.dateOfBirth = str9;
        }
        if ((i11 & 512) == 0) {
            this.birthPlace = null;
        } else {
            this.birthPlace = str10;
        }
        if ((i11 & 1024) == 0) {
            this.documentNumber = null;
        } else {
            this.documentNumber = str11;
        }
        if ((i11 & 2048) == 0) {
            this.documentType = null;
        } else {
            this.documentType = str12;
        }
        if ((i11 & 4096) == 0) {
            this.taxIdentificationNumber = null;
        } else {
            this.taxIdentificationNumber = str13;
        }
    }

    public static final /* synthetic */ void a(OcrData self, uo0.d output, to0.f serialDesc) {
        if (output.G(serialDesc, 0) || self.firstName != null) {
            output.y(serialDesc, 0, vo0.z1.f119730a, self.firstName);
        }
        if (output.G(serialDesc, 1) || self.lastName != null) {
            output.y(serialDesc, 1, vo0.z1.f119730a, self.lastName);
        }
        if (output.G(serialDesc, 2) || self.initials != null) {
            output.y(serialDesc, 2, vo0.z1.f119730a, self.initials);
        }
        if (output.G(serialDesc, 3) || self.gender != null) {
            output.y(serialDesc, 3, vo0.z1.f119730a, self.gender);
        }
        if (output.G(serialDesc, 4) || self.nationality != null) {
            output.y(serialDesc, 4, vo0.z1.f119730a, self.nationality);
        }
        if (output.G(serialDesc, 5) || self.issuingCountry != null) {
            output.y(serialDesc, 5, vo0.z1.f119730a, self.issuingCountry);
        }
        if (output.G(serialDesc, 6) || self.issueDate != null) {
            output.y(serialDesc, 6, vo0.z1.f119730a, self.issueDate);
        }
        if (output.G(serialDesc, 7) || self.expirationDate != null) {
            output.y(serialDesc, 7, vo0.z1.f119730a, self.expirationDate);
        }
        if (output.G(serialDesc, 8) || self.dateOfBirth != null) {
            output.y(serialDesc, 8, vo0.z1.f119730a, self.dateOfBirth);
        }
        if (output.G(serialDesc, 9) || self.birthPlace != null) {
            output.y(serialDesc, 9, vo0.z1.f119730a, self.birthPlace);
        }
        if (output.G(serialDesc, 10) || self.documentNumber != null) {
            output.y(serialDesc, 10, vo0.z1.f119730a, self.documentNumber);
        }
        if (output.G(serialDesc, 11) || self.documentType != null) {
            output.y(serialDesc, 11, vo0.z1.f119730a, self.documentType);
        }
        if (!output.G(serialDesc, 12) && self.taxIdentificationNumber == null) {
            return;
        }
        output.y(serialDesc, 12, vo0.z1.f119730a, self.taxIdentificationNumber);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OcrData)) {
            return false;
        }
        OcrData ocrData = (OcrData) other;
        return p013kotlin.jvm.internal.s.f(this.firstName, ocrData.firstName) && p013kotlin.jvm.internal.s.f(this.lastName, ocrData.lastName) && p013kotlin.jvm.internal.s.f(this.initials, ocrData.initials) && p013kotlin.jvm.internal.s.f(this.gender, ocrData.gender) && p013kotlin.jvm.internal.s.f(this.nationality, ocrData.nationality) && p013kotlin.jvm.internal.s.f(this.issuingCountry, ocrData.issuingCountry) && p013kotlin.jvm.internal.s.f(this.issueDate, ocrData.issueDate) && p013kotlin.jvm.internal.s.f(this.expirationDate, ocrData.expirationDate) && p013kotlin.jvm.internal.s.f(this.dateOfBirth, ocrData.dateOfBirth) && p013kotlin.jvm.internal.s.f(this.birthPlace, ocrData.birthPlace) && p013kotlin.jvm.internal.s.f(this.documentNumber, ocrData.documentNumber) && p013kotlin.jvm.internal.s.f(this.documentType, ocrData.documentType) && p013kotlin.jvm.internal.s.f(this.taxIdentificationNumber, ocrData.taxIdentificationNumber);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getInitials() {
        return this.initials;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initials;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gender;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nationality;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.issuingCountry;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.issueDate;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.expirationDate;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dateOfBirth;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.birthPlace;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.documentNumber;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.documentType;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.taxIdentificationNumber;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTaxIdentificationNumber() {
        return this.taxIdentificationNumber;
    }

    public String toString() {
        return "OcrData(firstName=" + this.firstName + ", lastName=" + this.lastName + ", initials=" + this.initials + ", gender=" + this.gender + ", nationality=" + this.nationality + ", issuingCountry=" + this.issuingCountry + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", dateOfBirth=" + this.dateOfBirth + ", birthPlace=" + this.birthPlace + ", documentNumber=" + this.documentNumber + ", documentType=" + this.documentType + ", taxIdentificationNumber=" + this.taxIdentificationNumber + ")";
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBirthPlace() {
        return this.birthPlace;
    }
}
