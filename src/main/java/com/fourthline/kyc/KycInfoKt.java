package com.fourthline.kyc;

import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProviderKt;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007¨\u0006\u0002"}, d2 = {"deepCopy", "Lcom/fourthline/kyc/KycInfo;", "fourthline-kyc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KycInfoKt {
    /* JADX WARN: Code duplicated, block: B:54:0x01c0 A[LOOP:3: B:52:0x01ba->B:54:0x01c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d7  */
    @e
    public static final KycInfo deepCopy(KycInfo kycInfo) {
        Document documentCopy$default;
        Coordinate coordinate;
        Coordinate coordinateCopy$default;
        ArrayList arrayList;
        Iterator<T> it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        s.k(kycInfo, "<this>");
        KycInfo kycInfo2 = new KycInfo(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        kycInfo2.setProvider(Provider.copy$default(kycInfo.getProvider(), null, null, 3, null));
        kycInfo2.setPerson(Person.copy$default(kycInfo.getPerson(), null, null, null, null, null, null, null, null, 255, null));
        Address address = kycInfo.getAddress();
        kycInfo2.setAddress(address != null ? Address.copy$default(address, null, null, null, null, null, null, null, 127, null) : null);
        kycInfo2.setContacts(Contacts.copy$default(kycInfo.getContacts(), null, null, null, 7, null));
        Profession profession = kycInfo.getProfession();
        kycInfo2.setProfession(profession != null ? Profession.copy$default(profession, null, null, null, 7, null) : null);
        Attachment.Selfie selfie = kycInfo.getSelfie();
        kycInfo2.setSelfie(selfie != null ? Attachment.Selfie.copy$default(selfie, null, null, null, null, null, 31, null) : null);
        Document document = kycInfo.getDocument();
        if (document == null || (documentCopy$default = Document.copy$default(document, null, null, null, null, null, null, null, null, 255, null)) == null) {
            documentCopy$default = null;
        } else {
            List<Attachment.Document> images = documentCopy$default.getImages();
            if (images != null) {
                arrayList3 = new ArrayList(v.y(images, 10));
                Iterator<T> it2 = images.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Attachment.Document.copy$default((Attachment.Document) it2.next(), null, null, null, false, null, null, 63, null));
                }
            } else {
                arrayList3 = null;
            }
            documentCopy$default.setImages(arrayList3);
            Attachment.Nfc nfc = documentCopy$default.getNfc();
            documentCopy$default.setNfc(nfc != null ? new Attachment.Nfc(nfc.getImage(), nfc.getMrz(), nfc.getTimestamp(), nfc.getLocation(), v0.A(nfc.getDataGroups())) : null);
        }
        kycInfo2.setDocument(documentCopy$default);
        List<SecondaryDocument> secondaryDocuments = kycInfo.getSecondaryDocuments();
        ArrayList arrayList4 = new ArrayList(v.y(secondaryDocuments, 10));
        for (SecondaryDocument secondaryDocument : secondaryDocuments) {
            List<Attachment.Document> images2 = secondaryDocument.getImages();
            if (images2 != null) {
                ArrayList arrayList5 = new ArrayList(v.y(images2, 10));
                Iterator<T> it3 = images2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(Attachment.Document.copy$default((Attachment.Document) it3.next(), null, null, null, false, null, null, 63, null));
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = null;
            }
            arrayList4.add(SecondaryDocument.copy$default(secondaryDocument, null, null, null, arrayList2, 7, null));
        }
        kycInfo2.setSecondaryDocuments(arrayList4);
        DeviceMetadata metadata = kycInfo.getMetadata();
        if (kycInfo.getMetadata().getLocation() != LocationProviderKt.getNotProvidedCoordinate()) {
            Coordinate location = kycInfo.getMetadata().getLocation();
            if (location != null) {
                coordinateCopy$default = Coordinate.copy$default(location, 0.0d, 0.0d, 3, null);
            } else {
                coordinate = null;
            }
            kycInfo2.setMetadata(DeviceMetadata.copy$default(metadata, null, coordinate, null, null, null, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null));
            List<QesAttachment> documentsToSign = kycInfo.getDocumentsToSign();
            arrayList = new ArrayList(v.y(documentsToSign, 10));
            it = documentsToSign.iterator();
            while (it.hasNext()) {
                arrayList.add(QesAttachment.copy$default((QesAttachment) it.next(), null, null, 3, null));
            }
            kycInfo2.setDocumentsToSign(arrayList);
            TaxInfo taxInfo = kycInfo.getTaxInfo();
            kycInfo2.setTaxInfo(taxInfo != null ? TaxInfo.copy$default(taxInfo, null, null, 3, null) : null);
            return kycInfo2;
        }
        coordinateCopy$default = LocationProviderKt.getNotProvidedCoordinate();
        coordinate = coordinateCopy$default;
        kycInfo2.setMetadata(DeviceMetadata.copy$default(metadata, null, coordinate, null, null, null, null, null, false, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null));
        List<QesAttachment> documentsToSign2 = kycInfo.getDocumentsToSign();
        arrayList = new ArrayList(v.y(documentsToSign2, 10));
        it = documentsToSign2.iterator();
        while (it.hasNext()) {
            arrayList.add(QesAttachment.copy$default((QesAttachment) it.next(), null, null, 3, null));
        }
        kycInfo2.setDocumentsToSign(arrayList);
        TaxInfo taxInfo2 = kycInfo.getTaxInfo();
        kycInfo2.setTaxInfo(taxInfo2 != null ? TaxInfo.copy$default(taxInfo2, null, null, 3, null) : null);
        return kycInfo2;
    }
}
