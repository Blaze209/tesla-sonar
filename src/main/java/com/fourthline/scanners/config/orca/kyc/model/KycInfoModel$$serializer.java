package com.fourthline.scanners.config.orca.kyc.model;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import jn0.e;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import so0.a;
import to0.f;
import uo0.c;
import vo0.e0;
import vo0.m1;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/fourthline/scanners/config/orca/kyc/model/KycInfoModel.$serializer", "Lvo0/e0;", "Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel;", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class KycInfoModel$$serializer implements e0<KycInfoModel> {
    public static final KycInfoModel$$serializer INSTANCE;
    private static final f descriptor;

    static {
        KycInfoModel$$serializer kycInfoModel$$serializer = new KycInfoModel$$serializer();
        INSTANCE = kycInfoModel$$serializer;
        m1 m1Var = new m1("com.fourthline.scanners.config.orca.kyc.model.KycInfoModel", kycInfoModel$$serializer, 11);
        m1Var.o("provider", false);
        m1Var.o("person", false);
        m1Var.o(PlaceTypes.ADDRESS, false);
        m1Var.o("contacts", false);
        m1Var.o("profession", false);
        m1Var.o("selfie", false);
        m1Var.o("document", false);
        m1Var.o("secondaryDocuments", false);
        m1Var.o(OrcaKeys.METADATA, false);
        m1Var.o("documentsToSign", false);
        m1Var.o("taxInfo", false);
        descriptor = m1Var;
    }

    private KycInfoModel$$serializer() {
    }

    @Override // vo0.e0
    public final d<?>[] childSerializers() {
        d<?>[] dVarArr = KycInfoModel.$childSerializers;
        return new d[]{ProviderModel$$serializer.INSTANCE, PersonModel$$serializer.INSTANCE, a.p(AddressModel$$serializer.INSTANCE), ContactsModel$$serializer.INSTANCE, a.p(ProfessionModel$$serializer.INSTANCE), a.p(AttachmentModel$Selfie$$serializer.INSTANCE), a.p(DocumentModel$$serializer.INSTANCE), dVarArr[7], DeviceMetadataModel$$serializer.INSTANCE, dVarArr[9], a.p(TaxInfoModel$$serializer.INSTANCE)};
    }

    @Override // ro0.c
    public final KycInfoModel deserialize(uo0.e decoder) {
        int i11;
        List list;
        DocumentModel documentModel;
        ProfessionModel professionModel;
        List list2;
        AttachmentModel.Selfie selfie;
        ContactsModel contactsModel;
        TaxInfoModel taxInfoModel;
        DeviceMetadataModel deviceMetadataModel;
        AddressModel addressModel;
        PersonModel personModel;
        ProviderModel providerModel;
        d[] dVarArr;
        s.k(decoder, "decoder");
        f fVar = descriptor;
        c cVarB = decoder.b(fVar);
        d[] dVarArr2 = KycInfoModel.$childSerializers;
        ProviderModel providerModel2 = null;
        if (cVarB.i()) {
            ProviderModel providerModel3 = (ProviderModel) cVarB.n(fVar, 0, ProviderModel$$serializer.INSTANCE, null);
            PersonModel personModel2 = (PersonModel) cVarB.n(fVar, 1, PersonModel$$serializer.INSTANCE, null);
            AddressModel addressModel2 = (AddressModel) cVarB.v(fVar, 2, AddressModel$$serializer.INSTANCE, null);
            ContactsModel contactsModel2 = (ContactsModel) cVarB.n(fVar, 3, ContactsModel$$serializer.INSTANCE, null);
            ProfessionModel professionModel2 = (ProfessionModel) cVarB.v(fVar, 4, ProfessionModel$$serializer.INSTANCE, null);
            AttachmentModel.Selfie selfie2 = (AttachmentModel.Selfie) cVarB.v(fVar, 5, AttachmentModel$Selfie$$serializer.INSTANCE, null);
            DocumentModel documentModel2 = (DocumentModel) cVarB.v(fVar, 6, DocumentModel$$serializer.INSTANCE, null);
            List list3 = (List) cVarB.n(fVar, 7, dVarArr2[7], null);
            DeviceMetadataModel deviceMetadataModel2 = (DeviceMetadataModel) cVarB.n(fVar, 8, DeviceMetadataModel$$serializer.INSTANCE, null);
            list2 = (List) cVarB.n(fVar, 9, dVarArr2[9], null);
            providerModel = providerModel3;
            taxInfoModel = (TaxInfoModel) cVarB.v(fVar, 10, TaxInfoModel$$serializer.INSTANCE, null);
            documentModel = documentModel2;
            selfie = selfie2;
            contactsModel = contactsModel2;
            deviceMetadataModel = deviceMetadataModel2;
            professionModel = professionModel2;
            addressModel = addressModel2;
            i11 = 2047;
            list = list3;
            personModel = personModel2;
        } else {
            int i12 = 9;
            int i13 = 7;
            boolean z11 = true;
            int i14 = 0;
            List list4 = null;
            DocumentModel documentModel3 = null;
            ProfessionModel professionModel3 = null;
            List list5 = null;
            AttachmentModel.Selfie selfie3 = null;
            ContactsModel contactsModel3 = null;
            TaxInfoModel taxInfoModel2 = null;
            DeviceMetadataModel deviceMetadataModel3 = null;
            AddressModel addressModel3 = null;
            PersonModel personModel3 = null;
            while (z11) {
                int iA = cVarB.A(fVar);
                switch (iA) {
                    case -1:
                        z11 = false;
                        dVarArr2 = dVarArr2;
                        i13 = 7;
                        i12 = 9;
                        break;
                    case 0:
                        providerModel2 = (ProviderModel) cVarB.n(fVar, 0, ProviderModel$$serializer.INSTANCE, providerModel2);
                        i14 |= 1;
                        dVarArr2 = dVarArr2;
                        i13 = 7;
                        i12 = 9;
                        break;
                    case 1:
                        personModel3 = (PersonModel) cVarB.n(fVar, 1, PersonModel$$serializer.INSTANCE, personModel3);
                        i14 |= 2;
                        dVarArr2 = dVarArr2;
                        i13 = 7;
                        i12 = 9;
                        break;
                    case 2:
                        addressModel3 = (AddressModel) cVarB.v(fVar, 2, AddressModel$$serializer.INSTANCE, addressModel3);
                        i14 |= 4;
                        dVarArr2 = dVarArr2;
                        i13 = 7;
                        i12 = 9;
                        break;
                    case 3:
                        contactsModel3 = (ContactsModel) cVarB.n(fVar, 3, ContactsModel$$serializer.INSTANCE, contactsModel3);
                        i14 |= 8;
                        dVarArr2 = dVarArr2;
                        i13 = 7;
                        i12 = 9;
                        break;
                    case 4:
                        professionModel3 = (ProfessionModel) cVarB.v(fVar, 4, ProfessionModel$$serializer.INSTANCE, professionModel3);
                        i14 |= 16;
                        dVarArr2 = dVarArr2;
                        i13 = 7;
                        i12 = 9;
                        break;
                    case 5:
                        selfie3 = (AttachmentModel.Selfie) cVarB.v(fVar, 5, AttachmentModel$Selfie$$serializer.INSTANCE, selfie3);
                        i14 |= 32;
                        dVarArr2 = dVarArr2;
                        i13 = 7;
                        i12 = 9;
                        break;
                    case 6:
                        documentModel3 = (DocumentModel) cVarB.v(fVar, 6, DocumentModel$$serializer.INSTANCE, documentModel3);
                        i14 |= 64;
                        dVarArr2 = dVarArr2;
                        i13 = 7;
                        i12 = 9;
                        break;
                    case 7:
                        dVarArr = dVarArr2;
                        list4 = (List) cVarB.n(fVar, i13, dVarArr[i13], list4);
                        i14 |= 128;
                        dVarArr2 = dVarArr;
                        i12 = 9;
                        break;
                    case 8:
                        dVarArr = dVarArr2;
                        deviceMetadataModel3 = (DeviceMetadataModel) cVarB.n(fVar, 8, DeviceMetadataModel$$serializer.INSTANCE, deviceMetadataModel3);
                        i14 |= 256;
                        dVarArr2 = dVarArr;
                        i12 = 9;
                        break;
                    case 9:
                        d[] dVarArr3 = dVarArr2;
                        list5 = (List) cVarB.n(fVar, i12, dVarArr3[i12], list5);
                        i14 |= 512;
                        dVarArr2 = dVarArr3;
                        break;
                    case 10:
                        taxInfoModel2 = (TaxInfoModel) cVarB.v(fVar, 10, TaxInfoModel$$serializer.INSTANCE, taxInfoModel2);
                        i14 |= 1024;
                        dVarArr2 = dVarArr2;
                        break;
                    default:
                        throw new UnknownFieldException(iA);
                }
            }
            i11 = i14;
            list = list4;
            documentModel = documentModel3;
            professionModel = professionModel3;
            list2 = list5;
            selfie = selfie3;
            contactsModel = contactsModel3;
            taxInfoModel = taxInfoModel2;
            deviceMetadataModel = deviceMetadataModel3;
            addressModel = addressModel3;
            personModel = personModel3;
            providerModel = providerModel2;
        }
        cVarB.c(fVar);
        return new KycInfoModel(i11, providerModel, personModel, addressModel, contactsModel, professionModel, selfie, documentModel, list, deviceMetadataModel, list2, taxInfoModel, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, KycInfoModel value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        f fVar = descriptor;
        uo0.d dVarB = encoder.b(fVar);
        KycInfoModel.write$Self$fourthline_adapters_json_release(value, dVarB, fVar);
        dVarB.c(fVar);
    }

    @Override // vo0.e0
    public d<?>[] typeParametersSerializers() {
        return e0.a.a(this);
    }
}
