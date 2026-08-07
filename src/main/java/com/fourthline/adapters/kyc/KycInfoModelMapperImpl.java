package com.fourthline.adapters.kyc;

import android.content.Context;
import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.adapters.common.DateFormat;
import com.fourthline.adapters.extensions.StringExtensionsKt;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.adapters.workflow.WorkflowResultsIdvModelsKt;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.Gender;
import com.fourthline.core.VideoDuration;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProviderKt;
import com.fourthline.kyc.Address;
import com.fourthline.kyc.Attachment;
import com.fourthline.kyc.Contacts;
import com.fourthline.kyc.Document;
import com.fourthline.kyc.EmploymentStatus;
import com.fourthline.kyc.Industry;
import com.fourthline.kyc.KycInfo;
import com.fourthline.kyc.Person;
import com.fourthline.kyc.Profession;
import com.fourthline.kyc.Provider;
import com.fourthline.kyc.QesAttachment;
import com.fourthline.kyc.SecondaryDocument;
import com.fourthline.kyc.TaxInfo;
import com.fourthline.scanners.config.orca.kyc.model.AddressModel;
import com.fourthline.scanners.config.orca.kyc.model.AttachmentModel;
import com.fourthline.scanners.config.orca.kyc.model.ContactsModel;
import com.fourthline.scanners.config.orca.kyc.model.CoordinateModel;
import com.fourthline.scanners.config.orca.kyc.model.DeviceMetadataModel;
import com.fourthline.scanners.config.orca.kyc.model.DocumentModel;
import com.fourthline.scanners.config.orca.kyc.model.KycInfoModel;
import com.fourthline.scanners.config.orca.kyc.model.PersonModel;
import com.fourthline.scanners.config.orca.kyc.model.ProfessionModel;
import com.fourthline.scanners.config.orca.kyc.model.ProviderModel;
import com.fourthline.scanners.config.orca.kyc.model.QesAttachmentModel;
import com.fourthline.scanners.config.orca.kyc.model.SecondaryDocumentModel;
import com.fourthline.scanners.config.orca.kyc.model.TaxInfoModel;
import com.fourthline.scanners.config.orca.kyc.model.VideoRecordingModel;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/fourthline/adapters/kyc/KycInfoModelMapperImpl;", "Lcom/fourthline/adapters/kyc/KycInfoModelMapper;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "documentModelMapper", "Lcom/fourthline/adapters/kyc/DocumentModelMapper;", "bitmapSaver", "Lcom/fourthline/adapters/kyc/BitmapSaver;", "<init>", "(Landroid/content/Context;Lcom/fourthline/adapters/kyc/DocumentModelMapper;Lcom/fourthline/adapters/kyc/BitmapSaver;)V", "map", "Lcom/fourthline/scanners/config/orca/kyc/model/KycInfoModel;", OrcaKeys.KEY_KYC_INFO, "Lcom/fourthline/kyc/KycInfo;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KycInfoModelMapperImpl implements KycInfoModelMapper {
    private final BitmapSaver bitmapSaver;
    private final Context context;
    private final DocumentModelMapper documentModelMapper;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Attachment.LocalFileAttachment.MimeType.values().length];
            try {
                iArr[Attachment.LocalFileAttachment.MimeType.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KycInfoModelMapperImpl(Context context, DocumentModelMapper documentModelMapper, BitmapSaver bitmapSaver) {
        s.k(context, "context");
        s.k(documentModelMapper, "documentModelMapper");
        s.k(bitmapSaver, "bitmapSaver");
        this.context = context;
        this.documentModelMapper = documentModelMapper;
        this.bitmapSaver = bitmapSaver;
    }

    @Override // com.fourthline.adapters.kyc.KycInfoModelMapper
    public KycInfoModel map(KycInfo kycInfo) {
        String str;
        ProfessionModel professionModel;
        AttachmentModel.Selfie selfie;
        ArrayList arrayList;
        AttachmentModel.LocalFileAttachmentModel localFileAttachmentModel;
        VideoRecordingModel videoRecordingModel;
        String strName;
        String strName2;
        KycInfoModelMapperImpl kycInfoModelMapperImpl = this;
        s.k(kycInfo, "kycInfo");
        Provider provider = kycInfo.getProvider();
        ProviderModel providerModel = new ProviderModel(provider.getName(), provider.getClientNumber());
        Person person = kycInfo.getPerson();
        String firstName = person.getFirstName();
        String middleName = person.getMiddleName();
        String lastName = person.getLastName();
        Gender gender = person.getGender();
        if (gender != null) {
            String lowerCase = gender.toString().toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
            str = lowerCase;
        } else {
            str = null;
        }
        String nationalityCode = person.getNationalityCode();
        String birthCountryCode = person.getBirthCountryCode();
        String birthPlace = person.getBirthPlace();
        Date birthDate = person.getBirthDate();
        PersonModel personModel = new PersonModel(firstName, middleName, lastName, str, nationalityCode, birthCountryCode, birthPlace, birthDate != null ? DateFormat.SHORT.toUtcDateFormat(birthDate.getTime()) : null);
        Address address = kycInfo.getAddress();
        AddressModel addressModel = address != null ? new AddressModel(address.getStreet(), address.getStreetNumber(), address.getStreetNumberSuffix(), address.getPostalCode(), address.getCity(), address.getCountryCode(), address.getRegion()) : null;
        Contacts contacts = kycInfo.getContacts();
        ContactsModel contactsModel = new ContactsModel(contacts.getEmail(), contacts.getPhone(), contacts.getMobile());
        Profession profession = kycInfo.getProfession();
        if (profession != null) {
            EmploymentStatus employment = profession.getEmployment();
            String lowerCamelCase = (employment == null || (strName2 = employment.name()) == null) ? null : StringExtensionsKt.toLowerCamelCase(strName2);
            String profession2 = profession.getProfession();
            Industry industry = profession.getIndustry();
            professionModel = new ProfessionModel(lowerCamelCase, profession2, (industry == null || (strName = industry.name()) == null) ? null : StringExtensionsKt.toLowerCamelCase(strName));
        } else {
            professionModel = null;
        }
        Attachment.Selfie selfie2 = kycInfo.getSelfie();
        if (selfie2 != null) {
            Bitmap image = selfie2.getImage();
            String strSaveToFileSystem = image != null ? kycInfoModelMapperImpl.bitmapSaver.saveToFileSystem(image, "selfie") : null;
            Long timestamp = selfie2.getTimestamp();
            String str2 = timestamp != null ? WorkflowResultsIdvModelsKt.formattedTimestamp(timestamp.longValue()) : null;
            Coordinate location = selfie2.getLocation();
            CoordinateModel coordinateModel = location != null ? DocumentModelMapperKt.toCoordinateModel(location) : null;
            VideoRecording videoRecording = selfie2.getVideoRecording();
            if (videoRecording != null) {
                URI url = videoRecording.getUrl();
                VideoDuration duration = videoRecording.getDuration();
                Coordinate location2 = videoRecording.getLocation();
                videoRecordingModel = new VideoRecordingModel(url, duration, location2 != null ? DocumentModelMapperKt.toCoordinateModel(location2) : null);
            } else {
                videoRecordingModel = null;
            }
            selfie = new AttachmentModel.Selfie(strSaveToFileSystem, str2, coordinateModel, videoRecordingModel, (UUID) null, 16, (DefaultConstructorMarker) null);
        } else {
            selfie = null;
        }
        Document document = kycInfo.getDocument();
        DocumentModel map = document != null ? kycInfoModelMapperImpl.documentModelMapper.map(document) : null;
        List<SecondaryDocument> secondaryDocuments = kycInfo.getSecondaryDocuments();
        ArrayList arrayList2 = new ArrayList(v.y(secondaryDocuments, 10));
        Iterator it = secondaryDocuments.iterator();
        while (it.hasNext()) {
            SecondaryDocument secondaryDocument = (SecondaryDocument) it.next();
            String lowerCamelCase2 = StringExtensionsKt.toLowerCamelCase(String.valueOf(secondaryDocument.getType()));
            Date issueDate = secondaryDocument.getIssueDate();
            String utcDateFormat = issueDate != null ? DateFormat.SHORT.toUtcDateFormat(issueDate.getTime()) : null;
            Date expirationDate = secondaryDocument.getExpirationDate();
            String utcDateFormat2 = expirationDate != null ? DateFormat.SHORT.toUtcDateFormat(expirationDate.getTime()) : null;
            List<Attachment.Document> images = secondaryDocument.getImages();
            if (images != null) {
                List<Attachment.Document> list = images;
                arrayList = new ArrayList(v.y(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Attachment.Document document2 = (Attachment.Document) it2.next();
                    DocumentFileSide fileSide = document2.getFileSide();
                    String str3 = fileSide != null ? DocumentModelMapperKt.formatted(fileSide) : null;
                    Iterator it3 = it2;
                    String str4 = document2.isAngled() ? ".angled" : "";
                    Bitmap image2 = document2.getImage();
                    PersonModel personModel2 = personModel;
                    String strSaveToFileSystem2 = image2 != null ? kycInfoModelMapperImpl.bitmapSaver.saveToFileSystem(image2, "document." + str3 + str4) : null;
                    Attachment.LocalFileAttachment file = document2.getFile();
                    if (file != null) {
                        URI filePath = file.getFilePath();
                        if (WhenMappings.$EnumSwitchMapping$0[file.getMimeType().ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        localFileAttachmentModel = new AttachmentModel.LocalFileAttachmentModel(filePath, "application/pdf");
                    } else {
                        localFileAttachmentModel = null;
                    }
                    boolean zIsAngled = document2.isAngled();
                    Long timestamp2 = document2.getTimestamp();
                    String str5 = timestamp2 != null ? WorkflowResultsIdvModelsKt.formattedTimestamp(timestamp2.longValue()) : null;
                    Coordinate location3 = document2.getLocation();
                    arrayList.add(new AttachmentModel.Document(strSaveToFileSystem2, localFileAttachmentModel, str3, zIsAngled, str5, location3 != null ? DocumentModelMapperKt.toCoordinateModel(location3) : null));
                    kycInfoModelMapperImpl = this;
                    it2 = it3;
                    personModel = personModel2;
                    addressModel = addressModel;
                }
            } else {
                arrayList = null;
            }
            PersonModel personModel3 = personModel;
            AddressModel addressModel2 = addressModel;
            arrayList2.add(new SecondaryDocumentModel(lowerCamelCase2, utcDateFormat, utcDateFormat2, arrayList));
            kycInfoModelMapperImpl = this;
            it = it;
            providerModel = providerModel;
            personModel = personModel3;
            addressModel = addressModel2;
        }
        ProviderModel providerModel2 = providerModel;
        PersonModel personModel4 = personModel;
        AddressModel addressModel3 = addressModel;
        DeviceMetadata metadata = kycInfo.getMetadata();
        DeviceMetadataModel deviceMetadataModel = new DeviceMetadataModel(metadata.getIpAddress(), metadata.getLocation() == LocationProviderKt.getNotProvidedCoordinate() ? "notProvided" : DocumentModelMapperKt.toCoordinateModel(metadata.getLocation()));
        List<QesAttachment> documentsToSign = kycInfo.getDocumentsToSign();
        ArrayList arrayList3 = new ArrayList(v.y(documentsToSign, 10));
        for (QesAttachment qesAttachment : documentsToSign) {
            arrayList3.add(new QesAttachmentModel(qesAttachment.getId(), qesAttachment.getFileUrl()));
        }
        TaxInfo taxInfo = kycInfo.getTaxInfo();
        return new KycInfoModel(providerModel2, personModel4, addressModel3, contactsModel, professionModel, selfie, map, arrayList2, deviceMetadataModel, arrayList3, taxInfo != null ? new TaxInfoModel(taxInfo.getTaxationCountryCode(), taxInfo.getTaxpayerIdentificationNumber()) : null);
    }

    public /* synthetic */ KycInfoModelMapperImpl(Context context, DocumentModelMapper documentModelMapper, BitmapSaver bitmapSaver, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new DocumentModelMapperImpl(context, null, 2, null) : documentModelMapper, (i11 & 4) != 0 ? new BitmapSaverImpl(context) : bitmapSaver);
    }
}
