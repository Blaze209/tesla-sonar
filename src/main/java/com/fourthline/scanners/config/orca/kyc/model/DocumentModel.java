package com.fourthline.scanners.config.orca.kyc.model;

import com.fourthline.scanners.config.orca.kyc.model.serialization.UUIDSerializer;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.e;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXBm\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010-\u001a\u00020\u000eHÀ\u0003¢\u0006\u0004\b+\u0010,Jt\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00107\u0012\u0004\b;\u0010<\u001a\u0004\b8\u0010!\"\u0004\b9\u0010:R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u00107\u0012\u0004\b?\u0010<\u001a\u0004\b=\u0010!\"\u0004\b>\u0010:R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00107\u0012\u0004\bB\u0010<\u001a\u0004\b@\u0010!\"\u0004\bA\u0010:R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00107\u0012\u0004\bE\u0010<\u001a\u0004\bC\u0010!\"\u0004\bD\u0010:R0\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010F\u0012\u0004\bJ\u0010<\u001a\u0004\bG\u0010&\"\u0004\bH\u0010IR*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010K\u0012\u0004\bO\u0010<\u001a\u0004\bL\u0010(\"\u0004\bM\u0010NR*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010P\u0012\u0004\bT\u0010<\u001a\u0004\bQ\u0010*\"\u0004\bR\u0010SR \u0010\u000f\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010U\u0012\u0004\bW\u0010<\u001a\u0004\bV\u0010,¨\u0006Z"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;", "", "", "type", InquiryField.FloatField.TYPE2, "issueDate", "expirationDate", "", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document;", "images", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;", "nfc", "Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;", "videoRecording", "Ljava/util/UUID;", "videoUUID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;Ljava/util/UUID;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;Ljava/util/UUID;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;", "component7", "()Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;", "component8$fourthline_adapters_json_release", "()Ljava/util/UUID;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;Ljava/util/UUID;)Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getType$annotations", "()V", "getNumber", "setNumber", "getNumber$annotations", "getIssueDate", "setIssueDate", "getIssueDate$annotations", "getExpirationDate", "setExpirationDate", "getExpirationDate$annotations", "Ljava/util/List;", "getImages", "setImages", "(Ljava/util/List;)V", "getImages$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;", "getNfc", "setNfc", "(Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Nfc;)V", "getNfc$annotations", "Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;", "getVideoRecording", "setVideoRecording", "(Lcom/fourthline/scanners/config/orca/kyc/model/VideoRecordingModel;)V", "getVideoRecording$annotations", "Ljava/util/UUID;", "getVideoUUID$fourthline_adapters_json_release", "getVideoUUID$fourthline_adapters_json_release$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class DocumentModel {
    private String expirationDate;
    private List<AttachmentModel.Document> images;
    private String issueDate;
    private AttachmentModel.Nfc nfc;
    private String number;
    private String type;
    private VideoRecordingModel videoRecording;
    private final UUID videoUUID;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final d<Object>[] $childSerializers = {null, null, null, null, new e(AttachmentModel$Document$$serializer.INSTANCE), null, null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/DocumentModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<DocumentModel> serializer() {
            return DocumentModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DocumentModel() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (AttachmentModel.Nfc) null, (VideoRecordingModel) null, (UUID) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentModel copy$default(DocumentModel documentModel, String str, String str2, String str3, String str4, List list, AttachmentModel.Nfc nfc, VideoRecordingModel videoRecordingModel, UUID uuid, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = documentModel.type;
        }
        if ((i11 & 2) != 0) {
            str2 = documentModel.number;
        }
        if ((i11 & 4) != 0) {
            str3 = documentModel.issueDate;
        }
        if ((i11 & 8) != 0) {
            str4 = documentModel.expirationDate;
        }
        if ((i11 & 16) != 0) {
            list = documentModel.images;
        }
        if ((i11 & 32) != 0) {
            nfc = documentModel.nfc;
        }
        if ((i11 & 64) != 0) {
            videoRecordingModel = documentModel.videoRecording;
        }
        if ((i11 & 128) != 0) {
            uuid = documentModel.videoUUID;
        }
        VideoRecordingModel videoRecordingModel2 = videoRecordingModel;
        UUID uuid2 = uuid;
        List list2 = list;
        AttachmentModel.Nfc nfc2 = nfc;
        return documentModel.copy(str, str2, str3, str4, list2, nfc2, videoRecordingModel2, uuid2);
    }

    @o("expirationDate")
    public static /* synthetic */ void getExpirationDate$annotations() {
    }

    @o("images")
    public static /* synthetic */ void getImages$annotations() {
    }

    @o("issueDate")
    public static /* synthetic */ void getIssueDate$annotations() {
    }

    @o("nfc")
    public static /* synthetic */ void getNfc$annotations() {
    }

    @o(InquiryField.FloatField.TYPE2)
    public static /* synthetic */ void getNumber$annotations() {
    }

    @o("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @o("videoRecording")
    public static /* synthetic */ void getVideoRecording$annotations() {
    }

    @o("videoUUID")
    @p(with = UUIDSerializer.class)
    public static /* synthetic */ void getVideoUUID$fourthline_adapters_json_release$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(DocumentModel self, uo0.d output, f serialDesc) {
        d<Object>[] dVarArr = $childSerializers;
        if (output.G(serialDesc, 0) || self.type != null) {
            output.y(serialDesc, 0, z1.f119730a, self.type);
        }
        if (output.G(serialDesc, 1) || self.number != null) {
            output.y(serialDesc, 1, z1.f119730a, self.number);
        }
        if (output.G(serialDesc, 2) || self.issueDate != null) {
            output.y(serialDesc, 2, z1.f119730a, self.issueDate);
        }
        if (output.G(serialDesc, 3) || self.expirationDate != null) {
            output.y(serialDesc, 3, z1.f119730a, self.expirationDate);
        }
        if (output.G(serialDesc, 4) || self.images != null) {
            output.y(serialDesc, 4, dVarArr[4], self.images);
        }
        if (output.G(serialDesc, 5) || self.nfc != null) {
            output.y(serialDesc, 5, AttachmentModel$Nfc$$serializer.INSTANCE, self.nfc);
        }
        if (output.G(serialDesc, 6) || self.videoRecording != null) {
            output.y(serialDesc, 6, VideoRecordingModel$$serializer.INSTANCE, self.videoRecording);
        }
        if (!output.G(serialDesc, 7) && s.f(self.videoUUID, UUID.randomUUID())) {
            return;
        }
        output.D(serialDesc, 7, UUIDSerializer.INSTANCE, self.videoUUID);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final List<AttachmentModel.Document> component5() {
        return this.images;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AttachmentModel.Nfc getNfc() {
        return this.nfc;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final VideoRecordingModel getVideoRecording() {
        return this.videoRecording;
    }

    /* JADX INFO: renamed from: component8$fourthline_adapters_json_release, reason: from getter */
    public final UUID getVideoUUID() {
        return this.videoUUID;
    }

    public final DocumentModel copy(String type, String number, String issueDate, String expirationDate, List<AttachmentModel.Document> images, AttachmentModel.Nfc nfc, VideoRecordingModel videoRecording, UUID videoUUID) {
        s.k(videoUUID, "videoUUID");
        return new DocumentModel(type, number, issueDate, expirationDate, images, nfc, videoRecording, videoUUID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentModel)) {
            return false;
        }
        DocumentModel documentModel = (DocumentModel) other;
        return s.f(this.type, documentModel.type) && s.f(this.number, documentModel.number) && s.f(this.issueDate, documentModel.issueDate) && s.f(this.expirationDate, documentModel.expirationDate) && s.f(this.images, documentModel.images) && s.f(this.nfc, documentModel.nfc) && s.f(this.videoRecording, documentModel.videoRecording) && s.f(this.videoUUID, documentModel.videoUUID);
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final List<AttachmentModel.Document> getImages() {
        return this.images;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final AttachmentModel.Nfc getNfc() {
        return this.nfc;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getType() {
        return this.type;
    }

    public final VideoRecordingModel getVideoRecording() {
        return this.videoRecording;
    }

    public final UUID getVideoUUID$fourthline_adapters_json_release() {
        return this.videoUUID;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.number;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issueDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expirationDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<AttachmentModel.Document> list = this.images;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        AttachmentModel.Nfc nfc = this.nfc;
        int iHashCode6 = (iHashCode5 + (nfc == null ? 0 : nfc.hashCode())) * 31;
        VideoRecordingModel videoRecordingModel = this.videoRecording;
        return ((iHashCode6 + (videoRecordingModel != null ? videoRecordingModel.hashCode() : 0)) * 31) + this.videoUUID.hashCode();
    }

    public final void setExpirationDate(String str) {
        this.expirationDate = str;
    }

    public final void setImages(List<AttachmentModel.Document> list) {
        this.images = list;
    }

    public final void setIssueDate(String str) {
        this.issueDate = str;
    }

    public final void setNfc(AttachmentModel.Nfc nfc) {
        this.nfc = nfc;
    }

    public final void setNumber(String str) {
        this.number = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVideoRecording(VideoRecordingModel videoRecordingModel) {
        this.videoRecording = videoRecordingModel;
    }

    public String toString() {
        return "DocumentModel(type=" + this.type + ", number=" + this.number + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", images=" + this.images + ", nfc=" + this.nfc + ", videoRecording=" + this.videoRecording + ", videoUUID=" + this.videoUUID + ")";
    }

    public DocumentModel(String str) {
        this(str, (String) null, (String) null, (String) null, (List) null, (AttachmentModel.Nfc) null, (VideoRecordingModel) null, (UUID) null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null);
    }

    public DocumentModel(String str, String str2) {
        this(str, str2, (String) null, (String) null, (List) null, (AttachmentModel.Nfc) null, (VideoRecordingModel) null, (UUID) null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, (DefaultConstructorMarker) null);
    }

    public DocumentModel(String str, String str2, String str3) {
        this(str, str2, str3, (String) null, (List) null, (AttachmentModel.Nfc) null, (VideoRecordingModel) null, (UUID) null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, (DefaultConstructorMarker) null);
    }

    public DocumentModel(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, (List) null, (AttachmentModel.Nfc) null, (VideoRecordingModel) null, (UUID) null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, (DefaultConstructorMarker) null);
    }

    public DocumentModel(String str, String str2, String str3, String str4, List<AttachmentModel.Document> list) {
        this(str, str2, str3, str4, list, (AttachmentModel.Nfc) null, (VideoRecordingModel) null, (UUID) null, 224, (DefaultConstructorMarker) null);
    }

    public DocumentModel(String str, String str2, String str3, String str4, List<AttachmentModel.Document> list, AttachmentModel.Nfc nfc) {
        this(str, str2, str3, str4, list, nfc, (VideoRecordingModel) null, (UUID) null, 192, (DefaultConstructorMarker) null);
    }

    public DocumentModel(String str, String str2, String str3, String str4, List<AttachmentModel.Document> list, AttachmentModel.Nfc nfc, VideoRecordingModel videoRecordingModel) {
        this(str, str2, str3, str4, list, nfc, videoRecordingModel, (UUID) null, 128, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ DocumentModel(int i11, String str, String str2, String str3, String str4, List list, AttachmentModel.Nfc nfc, VideoRecordingModel videoRecordingModel, UUID uuid, v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i11 & 2) == 0) {
            this.number = null;
        } else {
            this.number = str2;
        }
        if ((i11 & 4) == 0) {
            this.issueDate = null;
        } else {
            this.issueDate = str3;
        }
        if ((i11 & 8) == 0) {
            this.expirationDate = null;
        } else {
            this.expirationDate = str4;
        }
        if ((i11 & 16) == 0) {
            this.images = null;
        } else {
            this.images = list;
        }
        if ((i11 & 32) == 0) {
            this.nfc = null;
        } else {
            this.nfc = nfc;
        }
        if ((i11 & 64) == 0) {
            this.videoRecording = null;
        } else {
            this.videoRecording = videoRecordingModel;
        }
        if ((i11 & 128) == 0) {
            this.videoUUID = UUID.randomUUID();
        } else {
            this.videoUUID = uuid;
        }
    }

    public DocumentModel(String str, String str2, String str3, String str4, List<AttachmentModel.Document> list, AttachmentModel.Nfc nfc, VideoRecordingModel videoRecordingModel, UUID videoUUID) {
        s.k(videoUUID, "videoUUID");
        this.type = str;
        this.number = str2;
        this.issueDate = str3;
        this.expirationDate = str4;
        this.images = list;
        this.nfc = nfc;
        this.videoRecording = videoRecordingModel;
        this.videoUUID = videoUUID;
    }

    public /* synthetic */ DocumentModel(String str, String str2, String str3, String str4, List list, AttachmentModel.Nfc nfc, VideoRecordingModel videoRecordingModel, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : nfc, (i11 & 64) != 0 ? null : videoRecordingModel, (i11 & 128) != 0 ? UUID.randomUUID() : uuid);
    }
}
