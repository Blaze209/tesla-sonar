package com.fourthline.kyc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Validatable;
import com.fourthline.core.VideoRecording;
import com.fourthline.kyc.internal.i;
import com.fourthline.kyc.internal.j;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bm\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001cJ\u0019\u0010\u001a\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010.\u001a\u00020\u0011HÀ\u0003¢\u0006\u0004\b,\u0010-Jt\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b1\u0010#J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00109\u001a\u0004\b:\u0010!\"\u0004\b;\u0010<R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010=\u001a\u0004\b>\u0010#\"\u0004\b?\u0010@R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010A\u001a\u0004\bB\u0010%\"\u0004\bC\u0010DR$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010A\u001a\u0004\bE\u0010%\"\u0004\bF\u0010DR*\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010\u001f\"\u0004\bI\u0010JR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010)\"\u0004\bN\u0010OR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010+\"\u0004\bS\u0010TR\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010-R\"\u0010_\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001c\u0010b\u001a\n `*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010A¨\u0006c"}, d2 = {"Lcom/fourthline/kyc/Document;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/DocumentValidationError;", "Lcom/fourthline/core/DocumentType;", "type", "", InquiryField.FloatField.TYPE2, "Ljava/util/Date;", "issueDate", "expirationDate", "", "Lcom/fourthline/kyc/Attachment$Document;", "images", "Lcom/fourthline/kyc/Attachment$Nfc;", "nfc", "Lcom/fourthline/core/VideoRecording;", "videoRecording", "Ljava/util/UUID;", "videoUUID", "<init>", "(Lcom/fourthline/core/DocumentType;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Lcom/fourthline/kyc/Attachment$Nfc;Lcom/fourthline/core/VideoRecording;Ljava/util/UUID;)V", "", "e", "()Z", DateTokenConverter.CONVERTER_KEY, "b", "a", "c", "(Ljava/lang/String;)Z", "(Ljava/util/List;)Z", "validate", "()Ljava/util/List;", "component1", "()Lcom/fourthline/core/DocumentType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Date;", "component4", "component5", "component6", "()Lcom/fourthline/kyc/Attachment$Nfc;", "component7", "()Lcom/fourthline/core/VideoRecording;", "component8$fourthline_kyc_release", "()Ljava/util/UUID;", "component8", "copy", "(Lcom/fourthline/core/DocumentType;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Lcom/fourthline/kyc/Attachment$Nfc;Lcom/fourthline/core/VideoRecording;Ljava/util/UUID;)Lcom/fourthline/kyc/Document;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/core/DocumentType;", "getType", "setType", "(Lcom/fourthline/core/DocumentType;)V", "Ljava/lang/String;", "getNumber", "setNumber", "(Ljava/lang/String;)V", "Ljava/util/Date;", "getIssueDate", "setIssueDate", "(Ljava/util/Date;)V", "getExpirationDate", "setExpirationDate", "Ljava/util/List;", "getImages", "setImages", "(Ljava/util/List;)V", "f", "Lcom/fourthline/kyc/Attachment$Nfc;", "getNfc", "setNfc", "(Lcom/fourthline/kyc/Attachment$Nfc;)V", "g", "Lcom/fourthline/core/VideoRecording;", "getVideoRecording", "setVideoRecording", "(Lcom/fourthline/core/VideoRecording;)V", "h", "Ljava/util/UUID;", "getVideoUUID$fourthline_kyc_release", "Lcom/fourthline/kyc/internal/i;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/fourthline/kyc/internal/i;", "getVideoValidator$fourthline_kyc_release", "()Lcom/fourthline/kyc/internal/i;", "setVideoValidator$fourthline_kyc_release", "(Lcom/fourthline/kyc/internal/i;)V", "videoValidator", "kotlin.jvm.PlatformType", "j", "endOfTheDay", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Document implements Validatable<DocumentValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private DocumentType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private Date issueDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private Date expirationDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private List images;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private Attachment.Nfc nfc;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private VideoRecording videoRecording;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final UUID videoUUID;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private i videoValidator;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Date endOfTheDay;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Document() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    private final boolean a() {
        List list = this.images;
        if (list == null || list.isEmpty() || !a(list)) {
            return false;
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((Attachment.Document) it.next()).validate().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private final boolean b() {
        Date date = this.issueDate;
        if (date != null) {
            return date.before(this.endOfTheDay);
        }
        return true;
    }

    private final boolean c() {
        Attachment.Nfc nfc = this.nfc;
        if (nfc != null) {
            return nfc.validate().isEmpty();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Document copy$default(Document document, DocumentType documentType, String str, Date date, Date date2, List list, Attachment.Nfc nfc, VideoRecording videoRecording, UUID uuid, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            documentType = document.type;
        }
        if ((i11 & 2) != 0) {
            str = document.number;
        }
        if ((i11 & 4) != 0) {
            date = document.issueDate;
        }
        if ((i11 & 8) != 0) {
            date2 = document.expirationDate;
        }
        if ((i11 & 16) != 0) {
            list = document.images;
        }
        if ((i11 & 32) != 0) {
            nfc = document.nfc;
        }
        if ((i11 & 64) != 0) {
            videoRecording = document.videoRecording;
        }
        if ((i11 & 128) != 0) {
            uuid = document.videoUUID;
        }
        VideoRecording videoRecording2 = videoRecording;
        UUID uuid2 = uuid;
        List list2 = list;
        Attachment.Nfc nfc2 = nfc;
        return document.copy(documentType, str, date, date2, list2, nfc2, videoRecording2, uuid2);
    }

    private final boolean d() {
        String str = this.number;
        if (str != null) {
            return a(str);
        }
        return false;
    }

    private final boolean e() {
        DocumentType documentType = this.type;
        int i11 = documentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[documentType.ordinal()];
        return (i11 == -1 || i11 == 1 || i11 == 2) ? false : true;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DocumentType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final List<Attachment.Document> component5() {
        return this.images;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Attachment.Nfc getNfc() {
        return this.nfc;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    /* JADX INFO: renamed from: component8$fourthline_kyc_release, reason: from getter */
    public final UUID getVideoUUID() {
        return this.videoUUID;
    }

    public final Document copy(DocumentType type, String number, Date issueDate, Date expirationDate, List<Attachment.Document> images, Attachment.Nfc nfc, VideoRecording videoRecording, UUID videoUUID) {
        s.k(videoUUID, "videoUUID");
        return new Document(type, number, issueDate, expirationDate, images, nfc, videoRecording, videoUUID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Document)) {
            return false;
        }
        Document document = (Document) other;
        return this.type == document.type && s.f(this.number, document.number) && s.f(this.issueDate, document.issueDate) && s.f(this.expirationDate, document.expirationDate) && s.f(this.images, document.images) && s.f(this.nfc, document.nfc) && s.f(this.videoRecording, document.videoRecording) && s.f(this.videoUUID, document.videoUUID);
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final List<Attachment.Document> getImages() {
        return this.images;
    }

    public final Date getIssueDate() {
        return this.issueDate;
    }

    public final Attachment.Nfc getNfc() {
        return this.nfc;
    }

    public final String getNumber() {
        return this.number;
    }

    public final DocumentType getType() {
        return this.type;
    }

    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    public final UUID getVideoUUID$fourthline_kyc_release() {
        return this.videoUUID;
    }

    /* JADX INFO: renamed from: getVideoValidator$fourthline_kyc_release, reason: from getter */
    public final i getVideoValidator() {
        return this.videoValidator;
    }

    public int hashCode() {
        DocumentType documentType = this.type;
        int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
        String str = this.number;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        List list = this.images;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Attachment.Nfc nfc = this.nfc;
        int iHashCode6 = (iHashCode5 + (nfc == null ? 0 : nfc.hashCode())) * 31;
        VideoRecording videoRecording = this.videoRecording;
        return ((iHashCode6 + (videoRecording != null ? videoRecording.hashCode() : 0)) * 31) + this.videoUUID.hashCode();
    }

    public final void setExpirationDate(Date date) {
        this.expirationDate = date;
    }

    public final void setImages(List<Attachment.Document> list) {
        this.images = list;
    }

    public final void setIssueDate(Date date) {
        this.issueDate = date;
    }

    public final void setNfc(Attachment.Nfc nfc) {
        this.nfc = nfc;
    }

    public final void setNumber(String str) {
        this.number = str;
    }

    public final void setType(DocumentType documentType) {
        this.type = documentType;
    }

    public final void setVideoRecording(VideoRecording videoRecording) {
        this.videoRecording = videoRecording;
    }

    public final void setVideoValidator$fourthline_kyc_release(i iVar) {
        s.k(iVar, "<set-?>");
        this.videoValidator = iVar;
    }

    public String toString() {
        return "Document(type=" + this.type + ", number=" + this.number + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", images=" + this.images + ", nfc=" + this.nfc + ", videoRecording=" + this.videoRecording + ", videoUUID=" + this.videoUUID + ")";
    }

    @Override // com.fourthline.core.Validatable
    public List<DocumentValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (!e()) {
            arrayList.add(DocumentValidationError.INVALID_TYPE);
        }
        if (!d()) {
            arrayList.add(DocumentValidationError.INVALID_NUMBER);
        }
        if (!b()) {
            arrayList.add(DocumentValidationError.INVALID_ISSUE_DATE);
        }
        if (!a()) {
            arrayList.add(DocumentValidationError.INVALID_IMAGES);
        }
        if (!c()) {
            arrayList.add(DocumentValidationError.INVALID_NFC_ATTACHMENT);
        }
        VideoRecording videoRecording = this.videoRecording;
        if (videoRecording != null && !this.videoValidator.b(videoRecording)) {
            arrayList.add(DocumentValidationError.INVALID_VIDEO_LENGTH);
        }
        VideoRecording videoRecording2 = this.videoRecording;
        if (videoRecording2 != null && !this.videoValidator.a(videoRecording2)) {
            arrayList.add(DocumentValidationError.INVALID_VIDEO_LOCATION);
        }
        return arrayList;
    }

    public Document(DocumentType documentType) {
        this(documentType, null, null, null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    public Document(DocumentType documentType, String str) {
        this(documentType, str, null, null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public Document(DocumentType documentType, String str, Date date) {
        this(documentType, str, date, null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
    }

    public Document(DocumentType documentType, String str, Date date, Date date2) {
        this(documentType, str, date, date2, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
    }

    public Document(DocumentType documentType, String str, Date date, Date date2, List<Attachment.Document> list) {
        this(documentType, str, date, date2, list, null, null, null, 224, null);
    }

    private final boolean a(String str) {
        int length;
        return !t.y0(str) && 6 <= (length = str.length()) && length < 17;
    }

    public Document(DocumentType documentType, String str, Date date, Date date2, List<Attachment.Document> list, Attachment.Nfc nfc) {
        this(documentType, str, date, date2, list, nfc, null, null, 192, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    private final boolean a(List list) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            Attachment.Document document = (Attachment.Document) obj;
            if (document.isAngled()) {
                if (i11 > 0) {
                    List list2 = this.images;
                    s.h(list2);
                    Attachment.Document document2 = (Attachment.Document) list2.get(i11 - 1);
                    if (document2.getFileSide() != document.getFileSide() && !document2.isAngled()) {
                        arrayList.add(obj);
                    }
                } else {
                    arrayList.add(obj);
                }
            }
            i11 = i12;
        }
        return arrayList.isEmpty();
    }

    public Document(DocumentType documentType, String str, Date date, Date date2, List<Attachment.Document> list, Attachment.Nfc nfc, VideoRecording videoRecording) {
        this(documentType, str, date, date2, list, nfc, videoRecording, null, 128, null);
    }

    public Document(DocumentType documentType, String str, Date date, Date date2, List<Attachment.Document> list, Attachment.Nfc nfc, VideoRecording videoRecording, UUID videoUUID) {
        s.k(videoUUID, "videoUUID");
        this.type = documentType;
        this.number = str;
        this.issueDate = date;
        this.expirationDate = date2;
        this.images = list;
        this.nfc = nfc;
        this.videoRecording = videoRecording;
        this.videoUUID = videoUUID;
        this.videoValidator = new j();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        this.endOfTheDay = calendar.getTime();
    }

    public /* synthetic */ Document(DocumentType documentType, String str, Date date, Date date2, List list, Attachment.Nfc nfc, VideoRecording videoRecording, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : documentType, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : date, (i11 & 8) != 0 ? null : date2, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : nfc, (i11 & 64) != 0 ? null : videoRecording, (i11 & 128) != 0 ? UUID.randomUUID() : uuid);
    }
}
