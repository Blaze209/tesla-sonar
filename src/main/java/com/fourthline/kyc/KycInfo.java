package com.fourthline.kyc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.Validatable;
import com.fourthline.kyc.internal.d;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b8\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008d\u0001\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ\u0010\u0010-\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011HÆ\u0003¢\u0006\u0004\b/\u0010\u001dJ\u0012\u00100\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b0\u00101J\u0094\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010=\u001a\u00020<2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b=\u0010>R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010CR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010!\"\u0004\bG\u0010HR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010#\"\u0004\bL\u0010MR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010%\"\u0004\bQ\u0010RR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010'\"\u0004\bV\u0010WR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010)\"\u0004\b[\u0010\\R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010+\"\u0004\b`\u0010aR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010\u001d\"\u0004\be\u0010fR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010.\"\u0004\bj\u0010kR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010c\u001a\u0004\bm\u0010\u001d\"\u0004\bn\u0010fR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u00101\"\u0004\br\u0010s¨\u0006t"}, d2 = {"Lcom/fourthline/kyc/KycInfo;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/KycInfoValidationError;", "Lcom/fourthline/kyc/Provider;", "provider", "Lcom/fourthline/kyc/Person;", "person", "Lcom/fourthline/kyc/Address;", PlaceTypes.ADDRESS, "Lcom/fourthline/kyc/Contacts;", "contacts", "Lcom/fourthline/kyc/Profession;", "profession", "Lcom/fourthline/kyc/Attachment$Selfie;", "selfie", "Lcom/fourthline/kyc/Document;", "document", "", "Lcom/fourthline/kyc/SecondaryDocument;", "secondaryDocuments", "Lcom/fourthline/core/DeviceMetadata;", OrcaKeys.METADATA, "Lcom/fourthline/kyc/QesAttachment;", "documentsToSign", "Lcom/fourthline/kyc/TaxInfo;", "taxInfo", "<init>", "(Lcom/fourthline/kyc/Provider;Lcom/fourthline/kyc/Person;Lcom/fourthline/kyc/Address;Lcom/fourthline/kyc/Contacts;Lcom/fourthline/kyc/Profession;Lcom/fourthline/kyc/Attachment$Selfie;Lcom/fourthline/kyc/Document;Ljava/util/List;Lcom/fourthline/core/DeviceMetadata;Ljava/util/List;Lcom/fourthline/kyc/TaxInfo;)V", "validate", "()Ljava/util/List;", "component1", "()Lcom/fourthline/kyc/Provider;", "component2", "()Lcom/fourthline/kyc/Person;", "component3", "()Lcom/fourthline/kyc/Address;", "component4", "()Lcom/fourthline/kyc/Contacts;", "component5", "()Lcom/fourthline/kyc/Profession;", "component6", "()Lcom/fourthline/kyc/Attachment$Selfie;", "component7", "()Lcom/fourthline/kyc/Document;", "component8", "component9", "()Lcom/fourthline/core/DeviceMetadata;", "component10", "component11", "()Lcom/fourthline/kyc/TaxInfo;", "copy", "(Lcom/fourthline/kyc/Provider;Lcom/fourthline/kyc/Person;Lcom/fourthline/kyc/Address;Lcom/fourthline/kyc/Contacts;Lcom/fourthline/kyc/Profession;Lcom/fourthline/kyc/Attachment$Selfie;Lcom/fourthline/kyc/Document;Ljava/util/List;Lcom/fourthline/core/DeviceMetadata;Ljava/util/List;Lcom/fourthline/kyc/TaxInfo;)Lcom/fourthline/kyc/KycInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/kyc/Provider;", "getProvider", "setProvider", "(Lcom/fourthline/kyc/Provider;)V", "b", "Lcom/fourthline/kyc/Person;", "getPerson", "setPerson", "(Lcom/fourthline/kyc/Person;)V", "c", "Lcom/fourthline/kyc/Address;", "getAddress", "setAddress", "(Lcom/fourthline/kyc/Address;)V", DateTokenConverter.CONVERTER_KEY, "Lcom/fourthline/kyc/Contacts;", "getContacts", "setContacts", "(Lcom/fourthline/kyc/Contacts;)V", "e", "Lcom/fourthline/kyc/Profession;", "getProfession", "setProfession", "(Lcom/fourthline/kyc/Profession;)V", "f", "Lcom/fourthline/kyc/Attachment$Selfie;", "getSelfie", "setSelfie", "(Lcom/fourthline/kyc/Attachment$Selfie;)V", "g", "Lcom/fourthline/kyc/Document;", "getDocument", "setDocument", "(Lcom/fourthline/kyc/Document;)V", "h", "Ljava/util/List;", "getSecondaryDocuments", "setSecondaryDocuments", "(Ljava/util/List;)V", IntegerTokenConverter.CONVERTER_KEY, "Lcom/fourthline/core/DeviceMetadata;", "getMetadata", "setMetadata", "(Lcom/fourthline/core/DeviceMetadata;)V", "j", "getDocumentsToSign", "setDocumentsToSign", "k", "Lcom/fourthline/kyc/TaxInfo;", "getTaxInfo", "setTaxInfo", "(Lcom/fourthline/kyc/TaxInfo;)V", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KycInfo implements Validatable<KycInfoValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private Provider provider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private Person person;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private Address address;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private Contacts contacts;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private Profession profession;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private Attachment.Selfie selfie;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private Document document;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private List secondaryDocuments;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private DeviceMetadata metadata;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private List documentsToSign;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private TaxInfo taxInfo;

    public KycInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycInfo copy$default(KycInfo kycInfo, Provider provider, Person person, Address address, Contacts contacts, Profession profession, Attachment.Selfie selfie, Document document, List list, DeviceMetadata deviceMetadata, List list2, TaxInfo taxInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            provider = kycInfo.provider;
        }
        if ((i11 & 2) != 0) {
            person = kycInfo.person;
        }
        if ((i11 & 4) != 0) {
            address = kycInfo.address;
        }
        if ((i11 & 8) != 0) {
            contacts = kycInfo.contacts;
        }
        if ((i11 & 16) != 0) {
            profession = kycInfo.profession;
        }
        if ((i11 & 32) != 0) {
            selfie = kycInfo.selfie;
        }
        if ((i11 & 64) != 0) {
            document = kycInfo.document;
        }
        if ((i11 & 128) != 0) {
            list = kycInfo.secondaryDocuments;
        }
        if ((i11 & 256) != 0) {
            deviceMetadata = kycInfo.metadata;
        }
        if ((i11 & 512) != 0) {
            list2 = kycInfo.documentsToSign;
        }
        if ((i11 & 1024) != 0) {
            taxInfo = kycInfo.taxInfo;
        }
        List list3 = list2;
        TaxInfo taxInfo2 = taxInfo;
        List list4 = list;
        DeviceMetadata deviceMetadata2 = deviceMetadata;
        Attachment.Selfie selfie2 = selfie;
        Document document2 = document;
        Profession profession2 = profession;
        Address address2 = address;
        return kycInfo.copy(provider, person, address2, contacts, profession2, selfie2, document2, list4, deviceMetadata2, list3, taxInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Provider getProvider() {
        return this.provider;
    }

    public final List<QesAttachment> component10() {
        return this.documentsToSign;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final TaxInfo getTaxInfo() {
        return this.taxInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Person getPerson() {
        return this.person;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Contacts getContacts() {
        return this.contacts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Profession getProfession() {
        return this.profession;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Attachment.Selfie getSelfie() {
        return this.selfie;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Document getDocument() {
        return this.document;
    }

    public final List<SecondaryDocument> component8() {
        return this.secondaryDocuments;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceMetadata getMetadata() {
        return this.metadata;
    }

    public final KycInfo copy(Provider provider, Person person, Address address, Contacts contacts, Profession profession, Attachment.Selfie selfie, Document document, List<SecondaryDocument> secondaryDocuments, DeviceMetadata metadata, List<QesAttachment> documentsToSign, TaxInfo taxInfo) {
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
        s.k(secondaryDocuments, "secondaryDocuments");
        s.k(metadata, "metadata");
        s.k(documentsToSign, "documentsToSign");
        return new KycInfo(provider, person, address, contacts, profession, selfie, document, secondaryDocuments, metadata, documentsToSign, taxInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycInfo)) {
            return false;
        }
        KycInfo kycInfo = (KycInfo) other;
        return s.f(this.provider, kycInfo.provider) && s.f(this.person, kycInfo.person) && s.f(this.address, kycInfo.address) && s.f(this.contacts, kycInfo.contacts) && s.f(this.profession, kycInfo.profession) && s.f(this.selfie, kycInfo.selfie) && s.f(this.document, kycInfo.document) && s.f(this.secondaryDocuments, kycInfo.secondaryDocuments) && s.f(this.metadata, kycInfo.metadata) && s.f(this.documentsToSign, kycInfo.documentsToSign) && s.f(this.taxInfo, kycInfo.taxInfo);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final Contacts getContacts() {
        return this.contacts;
    }

    public final Document getDocument() {
        return this.document;
    }

    public final List<QesAttachment> getDocumentsToSign() {
        return this.documentsToSign;
    }

    public final DeviceMetadata getMetadata() {
        return this.metadata;
    }

    public final Person getPerson() {
        return this.person;
    }

    public final Profession getProfession() {
        return this.profession;
    }

    public final Provider getProvider() {
        return this.provider;
    }

    public final List<SecondaryDocument> getSecondaryDocuments() {
        return this.secondaryDocuments;
    }

    public final Attachment.Selfie getSelfie() {
        return this.selfie;
    }

    public final TaxInfo getTaxInfo() {
        return this.taxInfo;
    }

    public int hashCode() {
        int iHashCode = ((this.provider.hashCode() * 31) + this.person.hashCode()) * 31;
        Address address = this.address;
        int iHashCode2 = (((iHashCode + (address == null ? 0 : address.hashCode())) * 31) + this.contacts.hashCode()) * 31;
        Profession profession = this.profession;
        int iHashCode3 = (iHashCode2 + (profession == null ? 0 : profession.hashCode())) * 31;
        Attachment.Selfie selfie = this.selfie;
        int iHashCode4 = (iHashCode3 + (selfie == null ? 0 : selfie.hashCode())) * 31;
        Document document = this.document;
        int iHashCode5 = (((((((iHashCode4 + (document == null ? 0 : document.hashCode())) * 31) + this.secondaryDocuments.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.documentsToSign.hashCode()) * 31;
        TaxInfo taxInfo = this.taxInfo;
        return iHashCode5 + (taxInfo != null ? taxInfo.hashCode() : 0);
    }

    public final void setAddress(Address address) {
        this.address = address;
    }

    public final void setContacts(Contacts contacts) {
        s.k(contacts, "<set-?>");
        this.contacts = contacts;
    }

    public final void setDocument(Document document) {
        this.document = document;
    }

    public final void setDocumentsToSign(List<QesAttachment> list) {
        s.k(list, "<set-?>");
        this.documentsToSign = list;
    }

    public final void setMetadata(DeviceMetadata deviceMetadata) {
        s.k(deviceMetadata, "<set-?>");
        this.metadata = deviceMetadata;
    }

    public final void setPerson(Person person) {
        s.k(person, "<set-?>");
        this.person = person;
    }

    public final void setProfession(Profession profession) {
        this.profession = profession;
    }

    public final void setProvider(Provider provider) {
        s.k(provider, "<set-?>");
        this.provider = provider;
    }

    public final void setSecondaryDocuments(List<SecondaryDocument> list) {
        s.k(list, "<set-?>");
        this.secondaryDocuments = list;
    }

    public final void setSelfie(Attachment.Selfie selfie) {
        this.selfie = selfie;
    }

    public final void setTaxInfo(TaxInfo taxInfo) {
        this.taxInfo = taxInfo;
    }

    public String toString() {
        return "KycInfo(provider=" + this.provider + ", person=" + this.person + ", address=" + this.address + ", contacts=" + this.contacts + ", profession=" + this.profession + ", selfie=" + this.selfie + ", document=" + this.document + ", secondaryDocuments=" + this.secondaryDocuments + ", metadata=" + this.metadata + ", documentsToSign=" + this.documentsToSign + ", taxInfo=" + this.taxInfo + ")";
    }

    @Override // com.fourthline.core.Validatable
    public List<KycInfoValidationError> validate() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(KycInfoValidationError.INVALID_PROVIDER, this.provider.validate());
        linkedHashMap.put(KycInfoValidationError.INVALID_PERSON, this.person.validate());
        KycInfoValidationError kycInfoValidationError = KycInfoValidationError.INVALID_ADDRESS;
        Address address = this.address;
        linkedHashMap.put(kycInfoValidationError, address != null ? address.validate() : null);
        linkedHashMap.put(KycInfoValidationError.INVALID_CONTACTS, this.contacts.validate());
        KycInfoValidationError kycInfoValidationError2 = KycInfoValidationError.INVALID_SELFIE;
        Attachment.Selfie selfie = this.selfie;
        linkedHashMap.put(kycInfoValidationError2, selfie != null ? selfie.validate() : null);
        KycInfoValidationError kycInfoValidationError3 = KycInfoValidationError.INVALID_DOCUMENT;
        Document document = this.document;
        linkedHashMap.put(kycInfoValidationError3, document != null ? document.validate() : null);
        KycInfoValidationError kycInfoValidationError4 = KycInfoValidationError.INVALID_TAX_INFO;
        TaxInfo taxInfo = this.taxInfo;
        linkedHashMap.put(kycInfoValidationError4, taxInfo != null ? taxInfo.validate() : null);
        linkedHashMap.put(KycInfoValidationError.INVALID_METADATA, this.metadata.validate());
        Iterator it = this.secondaryDocuments.iterator();
        while (it.hasNext()) {
            List<SecondaryDocumentValidationError> listValidate = ((SecondaryDocument) it.next()).validate();
            if (!listValidate.isEmpty()) {
                linkedHashMap.put(KycInfoValidationError.INVALID_SECONDARY_DOCUMENT, listValidate);
            }
        }
        Iterator it2 = this.documentsToSign.iterator();
        while (it2.hasNext()) {
            List<QesAttachmentValidationError> listValidate2 = ((QesAttachment) it2.next()).validate();
            if (!listValidate2.isEmpty()) {
                linkedHashMap.put(KycInfoValidationError.INVALID_DOCUMENTS_TO_SIGN, listValidate2);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list != null && (!list.isEmpty())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        List<KycInfoValidationError> listM1 = v.m1(linkedHashMap2.keySet());
        if (!listM1.isEmpty()) {
            new d().a(linkedHashMap);
        }
        return listM1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider) {
        this(provider, null, null, null, null, null, null, null, null, null, null, 2046, null);
        s.k(provider, "provider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider, Person person) {
        this(provider, person, null, null, null, null, null, null, null, null, null, 2044, null);
        s.k(provider, "provider");
        s.k(person, "person");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider, Person person, Address address) {
        this(provider, person, address, null, null, null, null, null, null, null, null, 2040, null);
        s.k(provider, "provider");
        s.k(person, "person");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider, Person person, Address address, Contacts contacts) {
        this(provider, person, address, contacts, null, null, null, null, null, null, null, 2032, null);
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider, Person person, Address address, Contacts contacts, Profession profession) {
        this(provider, person, address, contacts, profession, null, null, null, null, null, null, 2016, null);
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider, Person person, Address address, Contacts contacts, Profession profession, Attachment.Selfie selfie) {
        this(provider, person, address, contacts, profession, selfie, null, null, null, null, null, 1984, null);
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider, Person person, Address address, Contacts contacts, Profession profession, Attachment.Selfie selfie, Document document) {
        this(provider, person, address, contacts, profession, selfie, document, null, null, null, null, 1920, null);
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider, Person person, Address address, Contacts contacts, Profession profession, Attachment.Selfie selfie, Document document, List<SecondaryDocument> secondaryDocuments) {
        this(provider, person, address, contacts, profession, selfie, document, secondaryDocuments, null, null, null, 1792, null);
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
        s.k(secondaryDocuments, "secondaryDocuments");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider, Person person, Address address, Contacts contacts, Profession profession, Attachment.Selfie selfie, Document document, List<SecondaryDocument> secondaryDocuments, DeviceMetadata metadata) {
        this(provider, person, address, contacts, profession, selfie, document, secondaryDocuments, metadata, null, null, 1536, null);
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
        s.k(secondaryDocuments, "secondaryDocuments");
        s.k(metadata, "metadata");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KycInfo(Provider provider, Person person, Address address, Contacts contacts, Profession profession, Attachment.Selfie selfie, Document document, List<SecondaryDocument> secondaryDocuments, DeviceMetadata metadata, List<QesAttachment> documentsToSign) {
        this(provider, person, address, contacts, profession, selfie, document, secondaryDocuments, metadata, documentsToSign, null, 1024, null);
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
        s.k(secondaryDocuments, "secondaryDocuments");
        s.k(metadata, "metadata");
        s.k(documentsToSign, "documentsToSign");
    }

    public KycInfo(Provider provider, Person person, Address address, Contacts contacts, Profession profession, Attachment.Selfie selfie, Document document, List<SecondaryDocument> secondaryDocuments, DeviceMetadata metadata, List<QesAttachment> documentsToSign, TaxInfo taxInfo) {
        s.k(provider, "provider");
        s.k(person, "person");
        s.k(contacts, "contacts");
        s.k(secondaryDocuments, "secondaryDocuments");
        s.k(metadata, "metadata");
        s.k(documentsToSign, "documentsToSign");
        this.provider = provider;
        this.person = person;
        this.address = address;
        this.contacts = contacts;
        this.profession = profession;
        this.selfie = selfie;
        this.document = document;
        this.secondaryDocuments = secondaryDocuments;
        this.metadata = metadata;
        this.documentsToSign = documentsToSign;
        this.taxInfo = taxInfo;
    }

    public /* synthetic */ KycInfo(Provider provider, Person person, Address address, Contacts contacts, Profession profession, Attachment.Selfie selfie, Document document, List list, DeviceMetadata deviceMetadata, List list2, TaxInfo taxInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Provider(null, null, 3, null) : provider, (i11 & 2) != 0 ? new Person(null, null, null, null, null, null, null, null, 255, null) : person, (i11 & 4) != 0 ? null : address, (i11 & 8) != 0 ? new Contacts(null, null, null, 7, null) : contacts, (i11 & 16) != 0 ? null : profession, (i11 & 32) != 0 ? null : selfie, (i11 & 64) != 0 ? null : document, (i11 & 128) != 0 ? v.m() : list, (i11 & 256) != 0 ? new DeviceMetadata(null, null, null, null, null, null, null, false, 255, null) : deviceMetadata, (i11 & 512) != 0 ? v.m() : list2, (i11 & 1024) != 0 ? null : taxInfo);
    }
}
