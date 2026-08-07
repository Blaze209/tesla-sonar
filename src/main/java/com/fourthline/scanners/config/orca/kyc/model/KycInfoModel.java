package com.fourthline.scanners.config.orca.kyc.model;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.e;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b;\b\u0087\b\u0018\u0000 \u007f2\u00020\u0001:\u0003\u0080\u0001\u007fBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0095\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010HÆ\u0003¢\u0006\u0004\b;\u00108J\u0012\u0010<\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0094\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010G\u001a\u00020F2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bG\u0010HR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010I\u0012\u0004\bM\u0010N\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010LR(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010O\u0012\u0004\bS\u0010N\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010RR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010T\u0012\u0004\bX\u0010N\u001a\u0004\bU\u0010.\"\u0004\bV\u0010WR(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010Y\u0012\u0004\b]\u0010N\u001a\u0004\bZ\u00100\"\u0004\b[\u0010\\R*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010^\u0012\u0004\bb\u0010N\u001a\u0004\b_\u00102\"\u0004\b`\u0010aR*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010c\u0012\u0004\bg\u0010N\u001a\u0004\bd\u00104\"\u0004\be\u0010fR*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010h\u0012\u0004\bl\u0010N\u001a\u0004\bi\u00106\"\u0004\bj\u0010kR.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010m\u0012\u0004\bq\u0010N\u001a\u0004\bn\u00108\"\u0004\bo\u0010pR(\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010r\u0012\u0004\bv\u0010N\u001a\u0004\bs\u0010:\"\u0004\bt\u0010uR.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010m\u0012\u0004\by\u0010N\u001a\u0004\bw\u00108\"\u0004\bx\u0010pR*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010z\u0012\u0004\b~\u0010N\u001a\u0004\b{\u0010=\"\u0004\b|\u0010}¨\u0006\u0081\u0001"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel;", "", "Lcom/fourthline/scanners/config/orca/kyc/model/ProviderModel;", "provider", "Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;", "person", "Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;", PlaceTypes.ADDRESS, "Lcom/fourthline/scanners/config/orca/kyc/model/ContactsModel;", "contacts", "Lcom/fourthline/scanners/config/orca/kyc/model/ProfessionModel;", "profession", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;", "selfie", "Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;", "document", "", "Lcom/fourthline/scanners/config/orca/kyc/model/SecondaryDocumentModel;", "secondaryDocuments", "Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;", OrcaKeys.METADATA, "Lcom/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel;", "documentsToSign", "Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;", "taxInfo", "<init>", "(Lcom/fourthline/scanners/config/orca/kyc/model/ProviderModel;Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;Lcom/fourthline/scanners/config/orca/kyc/model/ContactsModel;Lcom/fourthline/scanners/config/orca/kyc/model/ProfessionModel;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;Ljava/util/List;Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;Ljava/util/List;Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/scanners/config/orca/kyc/model/ProviderModel;Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;Lcom/fourthline/scanners/config/orca/kyc/model/ContactsModel;Lcom/fourthline/scanners/config/orca/kyc/model/ProfessionModel;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;Ljava/util/List;Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;Ljava/util/List;Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Lcom/fourthline/scanners/config/orca/kyc/model/ProviderModel;", "component2", "()Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;", "component3", "()Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;", "component4", "()Lcom/fourthline/scanners/config/orca/kyc/model/ContactsModel;", "component5", "()Lcom/fourthline/scanners/config/orca/kyc/model/ProfessionModel;", "component6", "()Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;", "component7", "()Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;", "component8", "()Ljava/util/List;", "component9", "()Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;", "component10", "component11", "()Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;", "copy", "(Lcom/fourthline/scanners/config/orca/kyc/model/ProviderModel;Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;Lcom/fourthline/scanners/config/orca/kyc/model/ContactsModel;Lcom/fourthline/scanners/config/orca/kyc/model/ProfessionModel;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;Ljava/util/List;Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;Ljava/util/List;Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;)Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/scanners/config/orca/kyc/model/ProviderModel;", "getProvider", "setProvider", "(Lcom/fourthline/scanners/config/orca/kyc/model/ProviderModel;)V", "getProvider$annotations", "()V", "Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;", "getPerson", "setPerson", "(Lcom/fourthline/scanners/config/orca/kyc/model/PersonModel;)V", "getPerson$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;", "getAddress", "setAddress", "(Lcom/fourthline/scanners/config/orca/kyc/model/AddressModel;)V", "getAddress$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/ContactsModel;", "getContacts", "setContacts", "(Lcom/fourthline/scanners/config/orca/kyc/model/ContactsModel;)V", "getContacts$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/ProfessionModel;", "getProfession", "setProfession", "(Lcom/fourthline/scanners/config/orca/kyc/model/ProfessionModel;)V", "getProfession$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;", "getSelfie", "setSelfie", "(Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Selfie;)V", "getSelfie$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;", "getDocument", "setDocument", "(Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;)V", "getDocument$annotations", "Ljava/util/List;", "getSecondaryDocuments", "setSecondaryDocuments", "(Ljava/util/List;)V", "getSecondaryDocuments$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;", "getMetadata", "setMetadata", "(Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;)V", "getMetadata$annotations", "getDocumentsToSign", "setDocumentsToSign", "getDocumentsToSign$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;", "getTaxInfo", "setTaxInfo", "(Lcom/fourthline/scanners/config/orca/kyc/model/TaxInfoModel;)V", "getTaxInfo$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class KycInfoModel {
    private AddressModel address;
    private ContactsModel contacts;
    private DocumentModel document;
    private List<QesAttachmentModel> documentsToSign;
    private DeviceMetadataModel metadata;
    private PersonModel person;
    private ProfessionModel profession;
    private ProviderModel provider;
    private List<SecondaryDocumentModel> secondaryDocuments;
    private AttachmentModel.Selfie selfie;
    private TaxInfoModel taxInfo;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final d<Object>[] $childSerializers = {null, null, null, null, null, null, null, new e(SecondaryDocumentModel$$serializer.INSTANCE), null, new e(QesAttachmentModel$$serializer.INSTANCE), null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<KycInfoModel> serializer() {
            return KycInfoModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ KycInfoModel(int i11, ProviderModel providerModel, PersonModel personModel, AddressModel addressModel, ContactsModel contactsModel, ProfessionModel professionModel, AttachmentModel.Selfie selfie, DocumentModel documentModel, List list, DeviceMetadataModel deviceMetadataModel, List list2, TaxInfoModel taxInfoModel, v1 v1Var) {
        if (2047 != (i11 & 2047)) {
            h1.b(i11, 2047, KycInfoModel$$serializer.INSTANCE.getDescriptor());
        }
        this.provider = providerModel;
        this.person = personModel;
        this.address = addressModel;
        this.contacts = contactsModel;
        this.profession = professionModel;
        this.selfie = selfie;
        this.document = documentModel;
        this.secondaryDocuments = list;
        this.metadata = deviceMetadataModel;
        this.documentsToSign = list2;
        this.taxInfo = taxInfoModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycInfoModel copy$default(KycInfoModel kycInfoModel, ProviderModel providerModel, PersonModel personModel, AddressModel addressModel, ContactsModel contactsModel, ProfessionModel professionModel, AttachmentModel.Selfie selfie, DocumentModel documentModel, List list, DeviceMetadataModel deviceMetadataModel, List list2, TaxInfoModel taxInfoModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            providerModel = kycInfoModel.provider;
        }
        if ((i11 & 2) != 0) {
            personModel = kycInfoModel.person;
        }
        if ((i11 & 4) != 0) {
            addressModel = kycInfoModel.address;
        }
        if ((i11 & 8) != 0) {
            contactsModel = kycInfoModel.contacts;
        }
        if ((i11 & 16) != 0) {
            professionModel = kycInfoModel.profession;
        }
        if ((i11 & 32) != 0) {
            selfie = kycInfoModel.selfie;
        }
        if ((i11 & 64) != 0) {
            documentModel = kycInfoModel.document;
        }
        if ((i11 & 128) != 0) {
            list = kycInfoModel.secondaryDocuments;
        }
        if ((i11 & 256) != 0) {
            deviceMetadataModel = kycInfoModel.metadata;
        }
        if ((i11 & 512) != 0) {
            list2 = kycInfoModel.documentsToSign;
        }
        if ((i11 & 1024) != 0) {
            taxInfoModel = kycInfoModel.taxInfo;
        }
        List list3 = list2;
        TaxInfoModel taxInfoModel2 = taxInfoModel;
        List list4 = list;
        DeviceMetadataModel deviceMetadataModel2 = deviceMetadataModel;
        AttachmentModel.Selfie selfie2 = selfie;
        DocumentModel documentModel2 = documentModel;
        ProfessionModel professionModel2 = professionModel;
        AddressModel addressModel2 = addressModel;
        return kycInfoModel.copy(providerModel, personModel, addressModel2, contactsModel, professionModel2, selfie2, documentModel2, list4, deviceMetadataModel2, list3, taxInfoModel2);
    }

    @o(PlaceTypes.ADDRESS)
    public static /* synthetic */ void getAddress$annotations() {
    }

    @o("contacts")
    public static /* synthetic */ void getContacts$annotations() {
    }

    @o("document")
    public static /* synthetic */ void getDocument$annotations() {
    }

    @o("documentsToSign")
    public static /* synthetic */ void getDocumentsToSign$annotations() {
    }

    @o(OrcaKeys.METADATA)
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @o("person")
    public static /* synthetic */ void getPerson$annotations() {
    }

    @o("profession")
    public static /* synthetic */ void getProfession$annotations() {
    }

    @o("provider")
    public static /* synthetic */ void getProvider$annotations() {
    }

    @o("secondaryDocuments")
    public static /* synthetic */ void getSecondaryDocuments$annotations() {
    }

    @o("selfie")
    public static /* synthetic */ void getSelfie$annotations() {
    }

    @o("taxInfo")
    public static /* synthetic */ void getTaxInfo$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(KycInfoModel self, uo0.d output, f serialDesc) {
        d<Object>[] dVarArr = $childSerializers;
        output.D(serialDesc, 0, ProviderModel$$serializer.INSTANCE, self.provider);
        output.D(serialDesc, 1, PersonModel$$serializer.INSTANCE, self.person);
        output.y(serialDesc, 2, AddressModel$$serializer.INSTANCE, self.address);
        output.D(serialDesc, 3, ContactsModel$$serializer.INSTANCE, self.contacts);
        output.y(serialDesc, 4, ProfessionModel$$serializer.INSTANCE, self.profession);
        output.y(serialDesc, 5, AttachmentModel$Selfie$$serializer.INSTANCE, self.selfie);
        output.y(serialDesc, 6, DocumentModel$$serializer.INSTANCE, self.document);
        output.D(serialDesc, 7, dVarArr[7], self.secondaryDocuments);
        output.D(serialDesc, 8, DeviceMetadataModel$$serializer.INSTANCE, self.metadata);
        output.D(serialDesc, 9, dVarArr[9], self.documentsToSign);
        output.y(serialDesc, 10, TaxInfoModel$$serializer.INSTANCE, self.taxInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProviderModel getProvider() {
        return this.provider;
    }

    public final List<QesAttachmentModel> component10() {
        return this.documentsToSign;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TaxInfoModel getTaxInfo() {
        return this.taxInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PersonModel getPerson() {
        return this.person;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AddressModel getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContactsModel getContacts() {
        return this.contacts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProfessionModel getProfession() {
        return this.profession;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AttachmentModel.Selfie getSelfie() {
        return this.selfie;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DocumentModel getDocument() {
        return this.document;
    }

    public final List<SecondaryDocumentModel> component8() {
        return this.secondaryDocuments;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceMetadataModel getMetadata() {
        return this.metadata;
    }

    public final KycInfoModel copy(ProviderModel provider, PersonModel person, AddressModel address, ContactsModel contacts, ProfessionModel profession, AttachmentModel.Selfie selfie, DocumentModel document, List<SecondaryDocumentModel> secondaryDocuments, DeviceMetadataModel metadata, List<QesAttachmentModel> documentsToSign, TaxInfoModel taxInfo) {
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
        s.k(secondaryDocuments, "secondaryDocuments");
        s.k(metadata, "metadata");
        s.k(documentsToSign, "documentsToSign");
        return new KycInfoModel(provider, person, address, contacts, profession, selfie, document, secondaryDocuments, metadata, documentsToSign, taxInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycInfoModel)) {
            return false;
        }
        KycInfoModel kycInfoModel = (KycInfoModel) other;
        return s.f(this.provider, kycInfoModel.provider) && s.f(this.person, kycInfoModel.person) && s.f(this.address, kycInfoModel.address) && s.f(this.contacts, kycInfoModel.contacts) && s.f(this.profession, kycInfoModel.profession) && s.f(this.selfie, kycInfoModel.selfie) && s.f(this.document, kycInfoModel.document) && s.f(this.secondaryDocuments, kycInfoModel.secondaryDocuments) && s.f(this.metadata, kycInfoModel.metadata) && s.f(this.documentsToSign, kycInfoModel.documentsToSign) && s.f(this.taxInfo, kycInfoModel.taxInfo);
    }

    public final AddressModel getAddress() {
        return this.address;
    }

    public final ContactsModel getContacts() {
        return this.contacts;
    }

    public final DocumentModel getDocument() {
        return this.document;
    }

    public final List<QesAttachmentModel> getDocumentsToSign() {
        return this.documentsToSign;
    }

    public final DeviceMetadataModel getMetadata() {
        return this.metadata;
    }

    public final PersonModel getPerson() {
        return this.person;
    }

    public final ProfessionModel getProfession() {
        return this.profession;
    }

    public final ProviderModel getProvider() {
        return this.provider;
    }

    public final List<SecondaryDocumentModel> getSecondaryDocuments() {
        return this.secondaryDocuments;
    }

    public final AttachmentModel.Selfie getSelfie() {
        return this.selfie;
    }

    public final TaxInfoModel getTaxInfo() {
        return this.taxInfo;
    }

    public int hashCode() {
        int iHashCode = ((this.provider.hashCode() * 31) + this.person.hashCode()) * 31;
        AddressModel addressModel = this.address;
        int iHashCode2 = (((iHashCode + (addressModel == null ? 0 : addressModel.hashCode())) * 31) + this.contacts.hashCode()) * 31;
        ProfessionModel professionModel = this.profession;
        int iHashCode3 = (iHashCode2 + (professionModel == null ? 0 : professionModel.hashCode())) * 31;
        AttachmentModel.Selfie selfie = this.selfie;
        int iHashCode4 = (iHashCode3 + (selfie == null ? 0 : selfie.hashCode())) * 31;
        DocumentModel documentModel = this.document;
        int iHashCode5 = (((((((iHashCode4 + (documentModel == null ? 0 : documentModel.hashCode())) * 31) + this.secondaryDocuments.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.documentsToSign.hashCode()) * 31;
        TaxInfoModel taxInfoModel = this.taxInfo;
        return iHashCode5 + (taxInfoModel != null ? taxInfoModel.hashCode() : 0);
    }

    public final void setAddress(AddressModel addressModel) {
        this.address = addressModel;
    }

    public final void setContacts(ContactsModel contactsModel) {
        s.k(contactsModel, "<set-?>");
        this.contacts = contactsModel;
    }

    public final void setDocument(DocumentModel documentModel) {
        this.document = documentModel;
    }

    public final void setDocumentsToSign(List<QesAttachmentModel> list) {
        s.k(list, "<set-?>");
        this.documentsToSign = list;
    }

    public final void setMetadata(DeviceMetadataModel deviceMetadataModel) {
        s.k(deviceMetadataModel, "<set-?>");
        this.metadata = deviceMetadataModel;
    }

    public final void setPerson(PersonModel personModel) {
        s.k(personModel, "<set-?>");
        this.person = personModel;
    }

    public final void setProfession(ProfessionModel professionModel) {
        this.profession = professionModel;
    }

    public final void setProvider(ProviderModel providerModel) {
        s.k(providerModel, "<set-?>");
        this.provider = providerModel;
    }

    public final void setSecondaryDocuments(List<SecondaryDocumentModel> list) {
        s.k(list, "<set-?>");
        this.secondaryDocuments = list;
    }

    public final void setSelfie(AttachmentModel.Selfie selfie) {
        this.selfie = selfie;
    }

    public final void setTaxInfo(TaxInfoModel taxInfoModel) {
        this.taxInfo = taxInfoModel;
    }

    public String toString() {
        return "KycInfoModel(provider=" + this.provider + ", person=" + this.person + ", address=" + this.address + ", contacts=" + this.contacts + ", profession=" + this.profession + ", selfie=" + this.selfie + ", document=" + this.document + ", secondaryDocuments=" + this.secondaryDocuments + ", metadata=" + this.metadata + ", documentsToSign=" + this.documentsToSign + ", taxInfo=" + this.taxInfo + ")";
    }

    public KycInfoModel(ProviderModel provider, PersonModel person, AddressModel addressModel, ContactsModel contacts, ProfessionModel professionModel, AttachmentModel.Selfie selfie, DocumentModel documentModel, List<SecondaryDocumentModel> secondaryDocuments, DeviceMetadataModel metadata, List<QesAttachmentModel> documentsToSign, TaxInfoModel taxInfoModel) {
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
        s.k(secondaryDocuments, "secondaryDocuments");
        s.k(metadata, "metadata");
        s.k(documentsToSign, "documentsToSign");
        this.provider = provider;
        this.person = person;
        this.address = addressModel;
        this.contacts = contacts;
        this.profession = professionModel;
        this.selfie = selfie;
        this.document = documentModel;
        this.secondaryDocuments = secondaryDocuments;
        this.metadata = metadata;
        this.documentsToSign = documentsToSign;
        this.taxInfo = taxInfoModel;
    }
}
