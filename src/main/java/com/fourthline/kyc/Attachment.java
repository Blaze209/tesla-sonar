package com.fourthline.kyc;

import android.graphics.Bitmap;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.Validatable;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.Coordinate;
import com.fourthline.kyc.internal.i;
import com.fourthline.kyc.internal.j;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jn0.e;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004&'()B1\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0004¢\u0006\u0004\b\u0010\u0010\u000eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u0082\u0001\u0003*+,¨\u0006-"}, d2 = {"Lcom/fourthline/kyc/Attachment;", "", "Landroid/graphics/Bitmap;", "image", "", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "Ljava/util/UUID;", "uuid", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/Long;Lcom/fourthline/core/location/Coordinate;Ljava/util/UUID;)V", "", "b", "()Z", "a", "c", "Landroid/graphics/Bitmap;", "getImage", "()Landroid/graphics/Bitmap;", "setImage", "(Landroid/graphics/Bitmap;)V", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "()Lcom/fourthline/core/location/Coordinate;", "setLocation", "(Lcom/fourthline/core/location/Coordinate;)V", DateTokenConverter.CONVERTER_KEY, "Ljava/util/UUID;", "getUuid$fourthline_kyc_release", "()Ljava/util/UUID;", "setUuid$fourthline_kyc_release", "(Ljava/util/UUID;)V", "Selfie", "Document", "Nfc", "LocalFileAttachment", "Lcom/fourthline/kyc/Attachment$Document;", "Lcom/fourthline/kyc/Attachment$Nfc;", "Lcom/fourthline/kyc/Attachment$Selfie;", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Attachment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Bitmap image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Long timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Coordinate location;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private UUID uuid;

    @e
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BO\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u00102R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u00107R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010<R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b?\u0010@R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010ER$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010!\"\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/fourthline/kyc/Attachment$Document;", "Lcom/fourthline/kyc/Attachment;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/DocumentAttachmentValidationError;", "Landroid/graphics/Bitmap;", "image", "Lcom/fourthline/kyc/Attachment$LocalFileAttachment;", Action.FILE_ATTRIBUTE, "Lcom/fourthline/core/DocumentFileSide;", "fileSide", "", "isAngled", "", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "<init>", "(Landroid/graphics/Bitmap;Lcom/fourthline/kyc/Attachment$LocalFileAttachment;Lcom/fourthline/core/DocumentFileSide;ZLjava/lang/Long;Lcom/fourthline/core/location/Coordinate;)V", DateTokenConverter.CONVERTER_KEY, "()Z", "", "validate", "()Ljava/util/List;", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Lcom/fourthline/kyc/Attachment$LocalFileAttachment;", "component3", "()Lcom/fourthline/core/DocumentFileSide;", "component4", "component5", "()Ljava/lang/Long;", "component6", "()Lcom/fourthline/core/location/Coordinate;", "copy", "(Landroid/graphics/Bitmap;Lcom/fourthline/kyc/Attachment$LocalFileAttachment;Lcom/fourthline/core/DocumentFileSide;ZLjava/lang/Long;Lcom/fourthline/core/location/Coordinate;)Lcom/fourthline/kyc/Attachment$Document;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Landroid/graphics/Bitmap;", "getImage", "setImage", "(Landroid/graphics/Bitmap;)V", "f", "Lcom/fourthline/kyc/Attachment$LocalFileAttachment;", "getFile", "setFile", "(Lcom/fourthline/kyc/Attachment$LocalFileAttachment;)V", "g", "Lcom/fourthline/core/DocumentFileSide;", "getFileSide", "setFileSide", "(Lcom/fourthline/core/DocumentFileSide;)V", "h", "Z", "setAngled", "(Z)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "getTimestamp", "setTimestamp", "(Ljava/lang/Long;)V", "j", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "setLocation", "(Lcom/fourthline/core/location/Coordinate;)V", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Document extends Attachment implements Validatable<DocumentAttachmentValidationError> {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private Bitmap image;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private LocalFileAttachment file;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private DocumentFileSide fileSide;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean isAngled;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private Long timestamp;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private Coordinate location;

        public Document() {
            this(null, null, null, false, null, null, 63, null);
        }

        public static /* synthetic */ Document copy$default(Document document, Bitmap bitmap, LocalFileAttachment localFileAttachment, DocumentFileSide documentFileSide, boolean z11, Long l11, Coordinate coordinate, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bitmap = document.image;
            }
            if ((i11 & 2) != 0) {
                localFileAttachment = document.file;
            }
            if ((i11 & 4) != 0) {
                documentFileSide = document.fileSide;
            }
            if ((i11 & 8) != 0) {
                z11 = document.isAngled;
            }
            if ((i11 & 16) != 0) {
                l11 = document.timestamp;
            }
            if ((i11 & 32) != 0) {
                coordinate = document.location;
            }
            Long l12 = l11;
            Coordinate coordinate2 = coordinate;
            return document.copy(bitmap, localFileAttachment, documentFileSide, z11, l12, coordinate2);
        }

        private final boolean d() {
            return this.fileSide != null;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Bitmap getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LocalFileAttachment getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DocumentFileSide getFileSide() {
            return this.fileSide;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsAngled() {
            return this.isAngled;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Coordinate getLocation() {
            return this.location;
        }

        public final Document copy(Bitmap image, LocalFileAttachment file, DocumentFileSide fileSide, boolean isAngled, Long timestamp, Coordinate location) {
            return new Document(image, file, fileSide, isAngled, timestamp, location);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Document)) {
                return false;
            }
            Document document = (Document) other;
            return s.f(this.image, document.image) && s.f(this.file, document.file) && this.fileSide == document.fileSide && this.isAngled == document.isAngled && s.f(this.timestamp, document.timestamp) && s.f(this.location, document.location);
        }

        public final LocalFileAttachment getFile() {
            return this.file;
        }

        public final DocumentFileSide getFileSide() {
            return this.fileSide;
        }

        @Override // com.fourthline.kyc.Attachment
        public Bitmap getImage() {
            return this.image;
        }

        @Override // com.fourthline.kyc.Attachment
        public Coordinate getLocation() {
            return this.location;
        }

        @Override // com.fourthline.kyc.Attachment
        public Long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            Bitmap bitmap = this.image;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            LocalFileAttachment localFileAttachment = this.file;
            int iHashCode2 = (iHashCode + (localFileAttachment == null ? 0 : localFileAttachment.hashCode())) * 31;
            DocumentFileSide documentFileSide = this.fileSide;
            int iHashCode3 = (((iHashCode2 + (documentFileSide == null ? 0 : documentFileSide.hashCode())) * 31) + Boolean.hashCode(this.isAngled)) * 31;
            Long l11 = this.timestamp;
            int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Coordinate coordinate = this.location;
            return iHashCode4 + (coordinate != null ? coordinate.hashCode() : 0);
        }

        public final boolean isAngled() {
            return this.isAngled;
        }

        public final void setAngled(boolean z11) {
            this.isAngled = z11;
        }

        public final void setFile(LocalFileAttachment localFileAttachment) {
            this.file = localFileAttachment;
        }

        public final void setFileSide(DocumentFileSide documentFileSide) {
            this.fileSide = documentFileSide;
        }

        @Override // com.fourthline.kyc.Attachment
        public void setImage(Bitmap bitmap) {
            this.image = bitmap;
        }

        @Override // com.fourthline.kyc.Attachment
        public void setLocation(Coordinate coordinate) {
            this.location = coordinate;
        }

        @Override // com.fourthline.kyc.Attachment
        public void setTimestamp(Long l11) {
            this.timestamp = l11;
        }

        public String toString() {
            return "Document(image=" + this.image + ", file=" + this.file + ", fileSide=" + this.fileSide + ", isAngled=" + this.isAngled + ", timestamp=" + this.timestamp + ", location=" + this.location + ")";
        }

        @Override // com.fourthline.core.Validatable
        public List<DocumentAttachmentValidationError> validate() {
            ArrayList arrayList = new ArrayList();
            if ((getImage() == null) == (this.file == null)) {
                arrayList.add(DocumentAttachmentValidationError.INVALID_IMAGE);
            }
            if ((getImage() == null) == (this.file == null)) {
                arrayList.add(DocumentAttachmentValidationError.INVALID_FILE_ATTACHMENT);
            }
            if (!d()) {
                arrayList.add(DocumentAttachmentValidationError.INVALID_FILE_SIDE);
            }
            if (!c()) {
                arrayList.add(DocumentAttachmentValidationError.INVALID_TIMESTAMP);
            }
            if (!b()) {
                arrayList.add(DocumentAttachmentValidationError.INVALID_LOCATION);
            }
            return arrayList;
        }

        public Document(Bitmap bitmap) {
            this(bitmap, null, null, false, null, null, 62, null);
        }

        public Document(Bitmap bitmap, LocalFileAttachment localFileAttachment) {
            this(bitmap, localFileAttachment, null, false, null, null, 60, null);
        }

        public Document(Bitmap bitmap, LocalFileAttachment localFileAttachment, DocumentFileSide documentFileSide) {
            this(bitmap, localFileAttachment, documentFileSide, false, null, null, 56, null);
        }

        public Document(Bitmap bitmap, LocalFileAttachment localFileAttachment, DocumentFileSide documentFileSide, boolean z11) {
            this(bitmap, localFileAttachment, documentFileSide, z11, null, null, 48, null);
        }

        public Document(Bitmap bitmap, LocalFileAttachment localFileAttachment, DocumentFileSide documentFileSide, boolean z11, Long l11) {
            this(bitmap, localFileAttachment, documentFileSide, z11, l11, null, 32, null);
        }

        public /* synthetic */ Document(Bitmap bitmap, LocalFileAttachment localFileAttachment, DocumentFileSide documentFileSide, boolean z11, Long l11, Coordinate coordinate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bitmap, (i11 & 2) != 0 ? null : localFileAttachment, (i11 & 4) != 0 ? null : documentFileSide, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : l11, (i11 & 32) != 0 ? null : coordinate);
        }

        public Document(Bitmap bitmap, LocalFileAttachment localFileAttachment, DocumentFileSide documentFileSide, boolean z11, Long l11, Coordinate coordinate) {
            super(bitmap, l11, coordinate, null, 8, null);
            this.image = bitmap;
            this.file = localFileAttachment;
            this.fileSide = documentFileSide;
            this.isAngled = z11;
            this.timestamp = l11;
            this.location = coordinate;
        }
    }

    @e
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/fourthline/kyc/Attachment$LocalFileAttachment;", "", "Ljava/net/URI;", "filePath", "Lcom/fourthline/kyc/Attachment$LocalFileAttachment$MimeType;", "mimeType", "<init>", "(Ljava/net/URI;Lcom/fourthline/kyc/Attachment$LocalFileAttachment$MimeType;)V", "component1", "()Ljava/net/URI;", "component2", "()Lcom/fourthline/kyc/Attachment$LocalFileAttachment$MimeType;", "copy", "(Ljava/net/URI;Lcom/fourthline/kyc/Attachment$LocalFileAttachment$MimeType;)Lcom/fourthline/kyc/Attachment$LocalFileAttachment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/net/URI;", "getFilePath", "b", "Lcom/fourthline/kyc/Attachment$LocalFileAttachment$MimeType;", "getMimeType", "MimeType", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalFileAttachment {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final URI filePath;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final MimeType mimeType;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/fourthline/kyc/Attachment$LocalFileAttachment$MimeType;", "", "<init>", "(Ljava/lang/String;I)V", "PDF", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum MimeType {
            PDF;


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f24336b = a.a(a());

            public static EnumEntries<MimeType> getEntries() {
                return f24336b;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LocalFileAttachment(URI filePath) {
            this(filePath, null, 2, 0 == true ? 1 : 0);
            s.k(filePath, "filePath");
        }

        public static /* synthetic */ LocalFileAttachment copy$default(LocalFileAttachment localFileAttachment, URI uri, MimeType mimeType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uri = localFileAttachment.filePath;
            }
            if ((i11 & 2) != 0) {
                mimeType = localFileAttachment.mimeType;
            }
            return localFileAttachment.copy(uri, mimeType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final URI getFilePath() {
            return this.filePath;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final MimeType getMimeType() {
            return this.mimeType;
        }

        public final LocalFileAttachment copy(URI filePath, MimeType mimeType) {
            s.k(filePath, "filePath");
            s.k(mimeType, "mimeType");
            return new LocalFileAttachment(filePath, mimeType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LocalFileAttachment)) {
                return false;
            }
            LocalFileAttachment localFileAttachment = (LocalFileAttachment) other;
            return s.f(this.filePath, localFileAttachment.filePath) && this.mimeType == localFileAttachment.mimeType;
        }

        public final URI getFilePath() {
            return this.filePath;
        }

        public final MimeType getMimeType() {
            return this.mimeType;
        }

        public int hashCode() {
            return (this.filePath.hashCode() * 31) + this.mimeType.hashCode();
        }

        public String toString() {
            return "LocalFileAttachment(filePath=" + this.filePath + ", mimeType=" + this.mimeType + ")";
        }

        public LocalFileAttachment(URI filePath, MimeType mimeType) {
            s.k(filePath, "filePath");
            s.k(mimeType, "mimeType");
            this.filePath = filePath;
            this.mimeType = mimeType;
        }

        public /* synthetic */ LocalFileAttachment(URI uri, MimeType mimeType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, (i11 & 2) != 0 ? MimeType.PDF : mimeType);
        }
    }

    @e
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BO\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003¢\u0006\u0004\b \u0010!JV\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010/R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u00104R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010>R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010!¨\u0006B"}, d2 = {"Lcom/fourthline/kyc/Attachment$Nfc;", "Lcom/fourthline/kyc/Attachment;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/NfcAttachmentValidationError;", "Landroid/graphics/Bitmap;", "image", "", "mrz", "", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "", "", "", "dataGroups", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Long;Lcom/fourthline/core/location/Coordinate;Ljava/util/Map;)V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "", "validate", "()Ljava/util/List;", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/fourthline/core/location/Coordinate;", "component5", "()Ljava/util/Map;", "copy", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/Long;Lcom/fourthline/core/location/Coordinate;Ljava/util/Map;)Lcom/fourthline/kyc/Attachment$Nfc;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Landroid/graphics/Bitmap;", "getImage", "setImage", "(Landroid/graphics/Bitmap;)V", "f", "Ljava/lang/String;", "getMrz", "setMrz", "(Ljava/lang/String;)V", "g", "Ljava/lang/Long;", "getTimestamp", "setTimestamp", "(Ljava/lang/Long;)V", "h", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "setLocation", "(Lcom/fourthline/core/location/Coordinate;)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "getDataGroups", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Nfc extends Attachment implements Validatable<NfcAttachmentValidationError> {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private Bitmap image;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private String mrz;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private Long timestamp;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private Coordinate location;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map dataGroups;

        public Nfc() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Nfc copy$default(Nfc nfc, Bitmap bitmap, String str, Long l11, Coordinate coordinate, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bitmap = nfc.image;
            }
            if ((i11 & 2) != 0) {
                str = nfc.mrz;
            }
            if ((i11 & 4) != 0) {
                l11 = nfc.timestamp;
            }
            if ((i11 & 8) != 0) {
                coordinate = nfc.location;
            }
            if ((i11 & 16) != 0) {
                map = nfc.dataGroups;
            }
            Map map2 = map;
            Long l12 = l11;
            return nfc.copy(bitmap, str, l12, coordinate, map2);
        }

        private final boolean d() {
            String str = this.mrz;
            if (str != null) {
                return !t.y0(str);
            }
            return false;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Bitmap getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMrz() {
            return this.mrz;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Coordinate getLocation() {
            return this.location;
        }

        public final Map<Integer, byte[]> component5() {
            return this.dataGroups;
        }

        public final Nfc copy(Bitmap image, String mrz, Long timestamp, Coordinate location, Map<Integer, byte[]> dataGroups) {
            s.k(dataGroups, "dataGroups");
            return new Nfc(image, mrz, timestamp, location, dataGroups);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Nfc)) {
                return false;
            }
            Nfc nfc = (Nfc) other;
            return s.f(this.image, nfc.image) && s.f(this.mrz, nfc.mrz) && s.f(this.timestamp, nfc.timestamp) && s.f(this.location, nfc.location) && s.f(this.dataGroups, nfc.dataGroups);
        }

        public final Map<Integer, byte[]> getDataGroups() {
            return this.dataGroups;
        }

        @Override // com.fourthline.kyc.Attachment
        public Bitmap getImage() {
            return this.image;
        }

        @Override // com.fourthline.kyc.Attachment
        public Coordinate getLocation() {
            return this.location;
        }

        public final String getMrz() {
            return this.mrz;
        }

        @Override // com.fourthline.kyc.Attachment
        public Long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            Bitmap bitmap = this.image;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            String str = this.mrz;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l11 = this.timestamp;
            int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Coordinate coordinate = this.location;
            return ((iHashCode3 + (coordinate != null ? coordinate.hashCode() : 0)) * 31) + this.dataGroups.hashCode();
        }

        @Override // com.fourthline.kyc.Attachment
        public void setImage(Bitmap bitmap) {
            this.image = bitmap;
        }

        @Override // com.fourthline.kyc.Attachment
        public void setLocation(Coordinate coordinate) {
            this.location = coordinate;
        }

        public final void setMrz(String str) {
            this.mrz = str;
        }

        @Override // com.fourthline.kyc.Attachment
        public void setTimestamp(Long l11) {
            this.timestamp = l11;
        }

        public String toString() {
            return "Nfc(image=" + this.image + ", mrz=" + this.mrz + ", timestamp=" + this.timestamp + ", location=" + this.location + ", dataGroups=" + this.dataGroups + ")";
        }

        @Override // com.fourthline.core.Validatable
        public List<NfcAttachmentValidationError> validate() {
            ArrayList arrayList = new ArrayList();
            if (!c()) {
                arrayList.add(NfcAttachmentValidationError.INVALID_TIMESTAMP);
            }
            if (!d()) {
                arrayList.add(NfcAttachmentValidationError.INVALID_MRZ);
            }
            if (!b()) {
                arrayList.add(NfcAttachmentValidationError.INVALID_LOCATION);
            }
            return arrayList;
        }

        public Nfc(Bitmap bitmap) {
            this(bitmap, null, null, null, null, 30, null);
        }

        public Nfc(Bitmap bitmap, String str) {
            this(bitmap, str, null, null, null, 28, null);
        }

        public Nfc(Bitmap bitmap, String str, Long l11) {
            this(bitmap, str, l11, null, null, 24, null);
        }

        public Nfc(Bitmap bitmap, String str, Long l11, Coordinate coordinate) {
            this(bitmap, str, l11, coordinate, null, 16, null);
        }

        public /* synthetic */ Nfc(Bitmap bitmap, String str, Long l11, Coordinate coordinate, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bitmap, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : coordinate, (i11 & 16) != 0 ? v0.i() : map);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Nfc(Bitmap bitmap, String str, Long l11, Coordinate coordinate, Map<Integer, byte[]> dataGroups) {
            super(bitmap, l11, coordinate, null, 8, null);
            s.k(dataGroups, "dataGroups");
            this.image = bitmap;
            this.mrz = str;
            this.timestamp = l11;
            this.location = coordinate;
            this.dataGroups = dataGroups;
        }
    }

    @e
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BC\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\fHÀ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010/R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u00104R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u00109R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001a\"\u0004\b=\u0010>R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u001cR\"\u0010I\u001a\u00020B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/fourthline/kyc/Attachment$Selfie;", "Lcom/fourthline/kyc/Attachment;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/SelfieAttachmentValidationError;", "Landroid/graphics/Bitmap;", "image", "", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "Lcom/fourthline/core/VideoRecording;", "videoRecording", "Ljava/util/UUID;", "videoUUID", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/Long;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/core/VideoRecording;Ljava/util/UUID;)V", "", "validate", "()Ljava/util/List;", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Ljava/lang/Long;", "component3", "()Lcom/fourthline/core/location/Coordinate;", "component4", "()Lcom/fourthline/core/VideoRecording;", "component5$fourthline_kyc_release", "()Ljava/util/UUID;", "component5", "copy", "(Landroid/graphics/Bitmap;Ljava/lang/Long;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/core/VideoRecording;Ljava/util/UUID;)Lcom/fourthline/kyc/Attachment$Selfie;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Landroid/graphics/Bitmap;", "getImage", "setImage", "(Landroid/graphics/Bitmap;)V", "f", "Ljava/lang/Long;", "getTimestamp", "setTimestamp", "(Ljava/lang/Long;)V", "g", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "setLocation", "(Lcom/fourthline/core/location/Coordinate;)V", "h", "Lcom/fourthline/core/VideoRecording;", "getVideoRecording", "setVideoRecording", "(Lcom/fourthline/core/VideoRecording;)V", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/UUID;", "getVideoUUID$fourthline_kyc_release", "Lcom/fourthline/kyc/internal/i;", "j", "Lcom/fourthline/kyc/internal/i;", "getVideoValidator$fourthline_kyc_release", "()Lcom/fourthline/kyc/internal/i;", "setVideoValidator$fourthline_kyc_release", "(Lcom/fourthline/kyc/internal/i;)V", "videoValidator", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Selfie extends Attachment implements Validatable<SelfieAttachmentValidationError> {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private Bitmap image;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private Long timestamp;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private Coordinate location;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private VideoRecording videoRecording;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final UUID videoUUID;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private i videoValidator;

        public Selfie() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ Selfie copy$default(Selfie selfie, Bitmap bitmap, Long l11, Coordinate coordinate, VideoRecording videoRecording, UUID uuid, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bitmap = selfie.image;
            }
            if ((i11 & 2) != 0) {
                l11 = selfie.timestamp;
            }
            if ((i11 & 4) != 0) {
                coordinate = selfie.location;
            }
            if ((i11 & 8) != 0) {
                videoRecording = selfie.videoRecording;
            }
            if ((i11 & 16) != 0) {
                uuid = selfie.videoUUID;
            }
            UUID uuid2 = uuid;
            Coordinate coordinate2 = coordinate;
            return selfie.copy(bitmap, l11, coordinate2, videoRecording, uuid2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Bitmap getImage() {
            return this.image;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Coordinate getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final VideoRecording getVideoRecording() {
            return this.videoRecording;
        }

        /* JADX INFO: renamed from: component5$fourthline_kyc_release, reason: from getter */
        public final UUID getVideoUUID() {
            return this.videoUUID;
        }

        public final Selfie copy(Bitmap image, Long timestamp, Coordinate location, VideoRecording videoRecording, UUID videoUUID) {
            s.k(videoUUID, "videoUUID");
            return new Selfie(image, timestamp, location, videoRecording, videoUUID);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selfie)) {
                return false;
            }
            Selfie selfie = (Selfie) other;
            return s.f(this.image, selfie.image) && s.f(this.timestamp, selfie.timestamp) && s.f(this.location, selfie.location) && s.f(this.videoRecording, selfie.videoRecording) && s.f(this.videoUUID, selfie.videoUUID);
        }

        @Override // com.fourthline.kyc.Attachment
        public Bitmap getImage() {
            return this.image;
        }

        @Override // com.fourthline.kyc.Attachment
        public Coordinate getLocation() {
            return this.location;
        }

        @Override // com.fourthline.kyc.Attachment
        public Long getTimestamp() {
            return this.timestamp;
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
            Bitmap bitmap = this.image;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Long l11 = this.timestamp;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            Coordinate coordinate = this.location;
            int iHashCode3 = (iHashCode2 + (coordinate == null ? 0 : coordinate.hashCode())) * 31;
            VideoRecording videoRecording = this.videoRecording;
            return ((iHashCode3 + (videoRecording != null ? videoRecording.hashCode() : 0)) * 31) + this.videoUUID.hashCode();
        }

        @Override // com.fourthline.kyc.Attachment
        public void setImage(Bitmap bitmap) {
            this.image = bitmap;
        }

        @Override // com.fourthline.kyc.Attachment
        public void setLocation(Coordinate coordinate) {
            this.location = coordinate;
        }

        @Override // com.fourthline.kyc.Attachment
        public void setTimestamp(Long l11) {
            this.timestamp = l11;
        }

        public final void setVideoRecording(VideoRecording videoRecording) {
            this.videoRecording = videoRecording;
        }

        public final void setVideoValidator$fourthline_kyc_release(i iVar) {
            s.k(iVar, "<set-?>");
            this.videoValidator = iVar;
        }

        public String toString() {
            return "Selfie(image=" + this.image + ", timestamp=" + this.timestamp + ", location=" + this.location + ", videoRecording=" + this.videoRecording + ", videoUUID=" + this.videoUUID + ")";
        }

        @Override // com.fourthline.core.Validatable
        public List<SelfieAttachmentValidationError> validate() {
            ArrayList arrayList = new ArrayList();
            if (!a()) {
                arrayList.add(SelfieAttachmentValidationError.INVALID_IMAGE);
            }
            if (!c()) {
                arrayList.add(SelfieAttachmentValidationError.INVALID_TIMESTAMP);
            }
            if (!b()) {
                arrayList.add(SelfieAttachmentValidationError.INVALID_LOCATION);
            }
            VideoRecording videoRecording = this.videoRecording;
            if (videoRecording != null && !this.videoValidator.b(videoRecording)) {
                arrayList.add(SelfieAttachmentValidationError.INVALID_VIDEO_LENGTH);
            }
            VideoRecording videoRecording2 = this.videoRecording;
            if (videoRecording2 != null && !this.videoValidator.a(videoRecording2)) {
                arrayList.add(SelfieAttachmentValidationError.INVALID_VIDEO_LOCATION);
            }
            return arrayList;
        }

        public Selfie(Bitmap bitmap) {
            this(bitmap, null, null, null, null, 30, null);
        }

        public Selfie(Bitmap bitmap, Long l11) {
            this(bitmap, l11, null, null, null, 28, null);
        }

        public Selfie(Bitmap bitmap, Long l11, Coordinate coordinate) {
            this(bitmap, l11, coordinate, null, null, 24, null);
        }

        public Selfie(Bitmap bitmap, Long l11, Coordinate coordinate, VideoRecording videoRecording) {
            this(bitmap, l11, coordinate, videoRecording, null, 16, null);
        }

        public /* synthetic */ Selfie(Bitmap bitmap, Long l11, Coordinate coordinate, VideoRecording videoRecording, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bitmap, (i11 & 2) != 0 ? null : l11, (i11 & 4) != 0 ? null : coordinate, (i11 & 8) != 0 ? null : videoRecording, (i11 & 16) != 0 ? UUID.randomUUID() : uuid);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Selfie(Bitmap bitmap, Long l11, Coordinate coordinate, VideoRecording videoRecording, UUID videoUUID) {
            super(bitmap, l11, coordinate, null, 8, null);
            s.k(videoUUID, "videoUUID");
            this.image = bitmap;
            this.timestamp = l11;
            this.location = coordinate;
            this.videoRecording = videoRecording;
            this.videoUUID = videoUUID;
            this.videoValidator = new j();
        }
    }

    public /* synthetic */ Attachment(Bitmap bitmap, Long l11, Coordinate coordinate, UUID uuid, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, l11, coordinate, uuid);
    }

    protected final boolean a() {
        return getImage() != null;
    }

    protected final boolean b() {
        Coordinate location = getLocation();
        if (location == null) {
            return true;
        }
        double latitude = location.getLatitude();
        if (-90.0d > latitude || latitude > 90.0d) {
            return false;
        }
        double longitude = location.getLongitude();
        return -180.0d <= longitude && longitude <= 180.0d;
    }

    protected final boolean c() {
        Long timestamp = getTimestamp();
        return timestamp == null || timestamp.longValue() < new Date().getTime();
    }

    public Bitmap getImage() {
        return this.image;
    }

    public Coordinate getLocation() {
        return this.location;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: getUuid$fourthline_kyc_release, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    public void setImage(Bitmap bitmap) {
        this.image = bitmap;
    }

    public void setLocation(Coordinate coordinate) {
        this.location = coordinate;
    }

    public void setTimestamp(Long l11) {
        this.timestamp = l11;
    }

    public final void setUuid$fourthline_kyc_release(UUID uuid) {
        s.k(uuid, "<set-?>");
        this.uuid = uuid;
    }

    private Attachment(Bitmap bitmap, Long l11, Coordinate coordinate, UUID uuid) {
        this.image = bitmap;
        this.timestamp = l11;
        this.location = coordinate;
        this.uuid = uuid;
    }

    public /* synthetic */ Attachment(Bitmap bitmap, Long l11, Coordinate coordinate, UUID uuid, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, l11, coordinate, (i11 & 8) != 0 ? UUID.randomUUID() : uuid, null);
    }
}
