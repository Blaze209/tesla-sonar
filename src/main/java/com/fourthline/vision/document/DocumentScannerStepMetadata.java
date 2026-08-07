package com.fourthline.vision.document;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.location.Coordinate;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\t\u0010\u0013¨\u0006*"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerStepMetadata;", "", "Ljava/util/Date;", "timestamp", "Lcom/fourthline/core/location/Coordinate;", "location", "Lcom/fourthline/core/DocumentFileSide;", "fileSide", "", "isAngled", "<init>", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/core/DocumentFileSide;Z)V", "component1", "()Ljava/util/Date;", "component2", "()Lcom/fourthline/core/location/Coordinate;", "component3", "()Lcom/fourthline/core/DocumentFileSide;", "component4", "()Z", "copy", "(Ljava/util/Date;Lcom/fourthline/core/location/Coordinate;Lcom/fourthline/core/DocumentFileSide;Z)Lcom/fourthline/vision/document/DocumentScannerStepMetadata;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Date;", "getTimestamp", "b", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "c", "Lcom/fourthline/core/DocumentFileSide;", "getFileSide", DateTokenConverter.CONVERTER_KEY, "Z", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentScannerStepMetadata {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coordinate location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentFileSide fileSide;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAngled;

    public DocumentScannerStepMetadata(Date timestamp, Coordinate coordinate, DocumentFileSide fileSide, boolean z11) {
        s.k(timestamp, "timestamp");
        s.k(fileSide, "fileSide");
        this.timestamp = timestamp;
        this.location = coordinate;
        this.fileSide = fileSide;
        this.isAngled = z11;
    }

    public static /* synthetic */ DocumentScannerStepMetadata copy$default(DocumentScannerStepMetadata documentScannerStepMetadata, Date date, Coordinate coordinate, DocumentFileSide documentFileSide, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            date = documentScannerStepMetadata.timestamp;
        }
        if ((i11 & 2) != 0) {
            coordinate = documentScannerStepMetadata.location;
        }
        if ((i11 & 4) != 0) {
            documentFileSide = documentScannerStepMetadata.fileSide;
        }
        if ((i11 & 8) != 0) {
            z11 = documentScannerStepMetadata.isAngled;
        }
        return documentScannerStepMetadata.copy(date, coordinate, documentFileSide, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coordinate getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DocumentFileSide getFileSide() {
        return this.fileSide;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAngled() {
        return this.isAngled;
    }

    public final DocumentScannerStepMetadata copy(Date timestamp, Coordinate location, DocumentFileSide fileSide, boolean isAngled) {
        s.k(timestamp, "timestamp");
        s.k(fileSide, "fileSide");
        return new DocumentScannerStepMetadata(timestamp, location, fileSide, isAngled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentScannerStepMetadata)) {
            return false;
        }
        DocumentScannerStepMetadata documentScannerStepMetadata = (DocumentScannerStepMetadata) other;
        return s.f(this.timestamp, documentScannerStepMetadata.timestamp) && s.f(this.location, documentScannerStepMetadata.location) && this.fileSide == documentScannerStepMetadata.fileSide && this.isAngled == documentScannerStepMetadata.isAngled;
    }

    public final DocumentFileSide getFileSide() {
        return this.fileSide;
    }

    public final Coordinate getLocation() {
        return this.location;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.timestamp.hashCode() * 31;
        Coordinate coordinate = this.location;
        return ((((iHashCode + (coordinate == null ? 0 : coordinate.hashCode())) * 31) + this.fileSide.hashCode()) * 31) + Boolean.hashCode(this.isAngled);
    }

    public final boolean isAngled() {
        return this.isAngled;
    }

    public String toString() {
        return "DocumentScannerStepMetadata(timestamp=" + this.timestamp + ", location=" + this.location + ", fileSide=" + this.fileSide + ", isAngled=" + this.isAngled + ")";
    }
}
