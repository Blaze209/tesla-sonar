package com.fourthline.scanners;

import android.graphics.Bitmap;
import java.util.Date;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/fourthline/scanners/DocumentStepResult;", "", "image", "Landroid/graphics/Bitmap;", "location", "Lkotlin/Pair;", "", "timestamp", "Ljava/util/Date;", "<init>", "(Landroid/graphics/Bitmap;Lkotlin/Pair;Ljava/util/Date;)V", "getImage", "()Landroid/graphics/Bitmap;", "getLocation", "()Lkotlin/Pair;", "setLocation", "(Lkotlin/Pair;)V", "getTimestamp", "()Ljava/util/Date;", "setTimestamp", "(Ljava/util/Date;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentStepResult {
    private final Bitmap image;
    private Pair<Double, Double> location;
    private Date timestamp;

    public DocumentStepResult(Bitmap image, Pair<Double, Double> pair, Date date) {
        s.k(image, "image");
        this.image = image;
        this.location = pair;
        this.timestamp = date;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentStepResult copy$default(DocumentStepResult documentStepResult, Bitmap bitmap, Pair pair, Date date, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bitmap = documentStepResult.image;
        }
        if ((i11 & 2) != 0) {
            pair = documentStepResult.location;
        }
        if ((i11 & 4) != 0) {
            date = documentStepResult.timestamp;
        }
        return documentStepResult.copy(bitmap, pair, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    public final Pair<Double, Double> component2() {
        return this.location;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    public final DocumentStepResult copy(Bitmap image, Pair<Double, Double> location, Date timestamp) {
        s.k(image, "image");
        return new DocumentStepResult(image, location, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentStepResult)) {
            return false;
        }
        DocumentStepResult documentStepResult = (DocumentStepResult) other;
        return s.f(this.image, documentStepResult.image) && s.f(this.location, documentStepResult.location) && s.f(this.timestamp, documentStepResult.timestamp);
    }

    public final Bitmap getImage() {
        return this.image;
    }

    public final Pair<Double, Double> getLocation() {
        return this.location;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = this.image.hashCode() * 31;
        Pair<Double, Double> pair = this.location;
        int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
        Date date = this.timestamp;
        return iHashCode2 + (date != null ? date.hashCode() : 0);
    }

    public final void setLocation(Pair<Double, Double> pair) {
        this.location = pair;
    }

    public final void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public String toString() {
        return "DocumentStepResult(image=" + this.image + ", location=" + this.location + ", timestamp=" + this.timestamp + ")";
    }

    public /* synthetic */ DocumentStepResult(Bitmap bitmap, Pair pair, Date date, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, (i11 & 2) != 0 ? null : pair, (i11 & 4) != 0 ? null : date);
    }
}
