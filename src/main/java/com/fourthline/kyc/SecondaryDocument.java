package com.fourthline.kyc;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Validatable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014JF\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010\u0016\"\u0004\b)\u0010*R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010.R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010+\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010.R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u00105R\u001c\u00108\u001a\n 6*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+¨\u00069"}, d2 = {"Lcom/fourthline/kyc/SecondaryDocument;", "Lcom/fourthline/core/Validatable;", "Lcom/fourthline/kyc/SecondaryDocumentValidationError;", "Lcom/fourthline/core/DocumentType;", "type", "Ljava/util/Date;", "issueDate", "expirationDate", "", "Lcom/fourthline/kyc/Attachment$Document;", "images", "<init>", "(Lcom/fourthline/core/DocumentType;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;)V", "", "c", "()Z", "b", "a", "(Ljava/util/List;)Z", "validate", "()Ljava/util/List;", "component1", "()Lcom/fourthline/core/DocumentType;", "component2", "()Ljava/util/Date;", "component3", "component4", "copy", "(Lcom/fourthline/core/DocumentType;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;)Lcom/fourthline/kyc/SecondaryDocument;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/core/DocumentType;", "getType", "setType", "(Lcom/fourthline/core/DocumentType;)V", "Ljava/util/Date;", "getIssueDate", "setIssueDate", "(Ljava/util/Date;)V", "getExpirationDate", "setExpirationDate", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getImages", "setImages", "(Ljava/util/List;)V", "kotlin.jvm.PlatformType", "e", "endOfTheDay", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SecondaryDocument implements Validatable<SecondaryDocumentValidationError> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private DocumentType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private Date issueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private Date expirationDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private List images;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Date endOfTheDay;

    public SecondaryDocument() {
        this(null, null, null, null, 15, null);
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
        return this.type != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SecondaryDocument copy$default(SecondaryDocument secondaryDocument, DocumentType documentType, Date date, Date date2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            documentType = secondaryDocument.type;
        }
        if ((i11 & 2) != 0) {
            date = secondaryDocument.issueDate;
        }
        if ((i11 & 4) != 0) {
            date2 = secondaryDocument.expirationDate;
        }
        if ((i11 & 8) != 0) {
            list = secondaryDocument.images;
        }
        return secondaryDocument.copy(documentType, date, date2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DocumentType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final List<Attachment.Document> component4() {
        return this.images;
    }

    public final SecondaryDocument copy(DocumentType type, Date issueDate, Date expirationDate, List<Attachment.Document> images) {
        return new SecondaryDocument(type, issueDate, expirationDate, images);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondaryDocument)) {
            return false;
        }
        SecondaryDocument secondaryDocument = (SecondaryDocument) other;
        return this.type == secondaryDocument.type && s.f(this.issueDate, secondaryDocument.issueDate) && s.f(this.expirationDate, secondaryDocument.expirationDate) && s.f(this.images, secondaryDocument.images);
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

    public final DocumentType getType() {
        return this.type;
    }

    public int hashCode() {
        DocumentType documentType = this.type;
        int iHashCode = (documentType == null ? 0 : documentType.hashCode()) * 31;
        Date date = this.issueDate;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        List list = this.images;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
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

    public final void setType(DocumentType documentType) {
        this.type = documentType;
    }

    public String toString() {
        return "SecondaryDocument(type=" + this.type + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", images=" + this.images + ")";
    }

    @Override // com.fourthline.core.Validatable
    public List<SecondaryDocumentValidationError> validate() {
        ArrayList arrayList = new ArrayList();
        if (!c()) {
            arrayList.add(SecondaryDocumentValidationError.INVALID_TYPE);
        }
        if (!b()) {
            arrayList.add(SecondaryDocumentValidationError.INVALID_ISSUE_DATE);
        }
        if (!a()) {
            arrayList.add(SecondaryDocumentValidationError.INVALID_IMAGES);
        }
        return arrayList;
    }

    public SecondaryDocument(DocumentType documentType) {
        this(documentType, null, null, null, 14, null);
    }

    public SecondaryDocument(DocumentType documentType, Date date) {
        this(documentType, date, null, null, 12, null);
    }

    public SecondaryDocument(DocumentType documentType, Date date, Date date2) {
        this(documentType, date, date2, null, 8, null);
    }

    public SecondaryDocument(DocumentType documentType, Date date, Date date2, List<Attachment.Document> list) {
        this.type = documentType;
        this.issueDate = date;
        this.expirationDate = date2;
        this.images = list;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        this.endOfTheDay = calendar.getTime();
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

    public /* synthetic */ SecondaryDocument(DocumentType documentType, Date date, Date date2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : documentType, (i11 & 2) != 0 ? null : date, (i11 & 4) != 0 ? null : date2, (i11 & 8) != 0 ? null : list);
    }
}
