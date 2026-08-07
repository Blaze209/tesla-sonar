package com.fourthline.scanners;

import android.graphics.Bitmap;
import com.fourthline.nfc.NfcDataGroup;
import com.fourthline.scanners.config.ImageReturnType;
import java.util.Date;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003JU\u0010)\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061"}, d2 = {"Lcom/fourthline/scanners/NfcResultHolder;", "", "nfcRawData", "", "Lcom/fourthline/nfc/NfcDataGroup;", "nfcImage", "Landroid/graphics/Bitmap;", "location", "Lkotlin/Pair;", "", "timestamp", "Ljava/util/Date;", "imageReturnType", "Lcom/fourthline/scanners/config/ImageReturnType;", "<init>", "(Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/Pair;Ljava/util/Date;Lcom/fourthline/scanners/config/ImageReturnType;)V", "getNfcRawData", "()Ljava/util/List;", "setNfcRawData", "(Ljava/util/List;)V", "getNfcImage", "()Landroid/graphics/Bitmap;", "setNfcImage", "(Landroid/graphics/Bitmap;)V", "getLocation", "()Lkotlin/Pair;", "setLocation", "(Lkotlin/Pair;)V", "getTimestamp", "()Ljava/util/Date;", "setTimestamp", "(Ljava/util/Date;)V", "getImageReturnType", "()Lcom/fourthline/scanners/config/ImageReturnType;", "setImageReturnType", "(Lcom/fourthline/scanners/config/ImageReturnType;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NfcResultHolder {
    private ImageReturnType imageReturnType;
    private Pair<Double, Double> location;
    private Bitmap nfcImage;
    private List<NfcDataGroup> nfcRawData;
    private Date timestamp;

    public NfcResultHolder() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcResultHolder copy$default(NfcResultHolder nfcResultHolder, List list, Bitmap bitmap, Pair pair, Date date, ImageReturnType imageReturnType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = nfcResultHolder.nfcRawData;
        }
        if ((i11 & 2) != 0) {
            bitmap = nfcResultHolder.nfcImage;
        }
        if ((i11 & 4) != 0) {
            pair = nfcResultHolder.location;
        }
        if ((i11 & 8) != 0) {
            date = nfcResultHolder.timestamp;
        }
        if ((i11 & 16) != 0) {
            imageReturnType = nfcResultHolder.imageReturnType;
        }
        ImageReturnType imageReturnType2 = imageReturnType;
        Pair pair2 = pair;
        return nfcResultHolder.copy(list, bitmap, pair2, date, imageReturnType2);
    }

    public final List<NfcDataGroup> component1() {
        return this.nfcRawData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Bitmap getNfcImage() {
        return this.nfcImage;
    }

    public final Pair<Double, Double> component3() {
        return this.location;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ImageReturnType getImageReturnType() {
        return this.imageReturnType;
    }

    public final NfcResultHolder copy(List<NfcDataGroup> nfcRawData, Bitmap nfcImage, Pair<Double, Double> location, Date timestamp, ImageReturnType imageReturnType) {
        s.k(imageReturnType, "imageReturnType");
        return new NfcResultHolder(nfcRawData, nfcImage, location, timestamp, imageReturnType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcResultHolder)) {
            return false;
        }
        NfcResultHolder nfcResultHolder = (NfcResultHolder) other;
        return s.f(this.nfcRawData, nfcResultHolder.nfcRawData) && s.f(this.nfcImage, nfcResultHolder.nfcImage) && s.f(this.location, nfcResultHolder.location) && s.f(this.timestamp, nfcResultHolder.timestamp) && this.imageReturnType == nfcResultHolder.imageReturnType;
    }

    public final ImageReturnType getImageReturnType() {
        return this.imageReturnType;
    }

    public final Pair<Double, Double> getLocation() {
        return this.location;
    }

    public final Bitmap getNfcImage() {
        return this.nfcImage;
    }

    public final List<NfcDataGroup> getNfcRawData() {
        return this.nfcRawData;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        List<NfcDataGroup> list = this.nfcRawData;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Bitmap bitmap = this.nfcImage;
        int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Pair<Double, Double> pair = this.location;
        int iHashCode3 = (iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31;
        Date date = this.timestamp;
        return ((iHashCode3 + (date != null ? date.hashCode() : 0)) * 31) + this.imageReturnType.hashCode();
    }

    public final void setImageReturnType(ImageReturnType imageReturnType) {
        s.k(imageReturnType, "<set-?>");
        this.imageReturnType = imageReturnType;
    }

    public final void setLocation(Pair<Double, Double> pair) {
        this.location = pair;
    }

    public final void setNfcImage(Bitmap bitmap) {
        this.nfcImage = bitmap;
    }

    public final void setNfcRawData(List<NfcDataGroup> list) {
        this.nfcRawData = list;
    }

    public final void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public String toString() {
        return "NfcResultHolder(nfcRawData=" + this.nfcRawData + ", nfcImage=" + this.nfcImage + ", location=" + this.location + ", timestamp=" + this.timestamp + ", imageReturnType=" + this.imageReturnType + ")";
    }

    public NfcResultHolder(List<NfcDataGroup> list, Bitmap bitmap, Pair<Double, Double> pair, Date date, ImageReturnType imageReturnType) {
        s.k(imageReturnType, "imageReturnType");
        this.nfcRawData = list;
        this.nfcImage = bitmap;
        this.location = pair;
        this.timestamp = date;
        this.imageReturnType = imageReturnType;
    }

    public /* synthetic */ NfcResultHolder(List list, Bitmap bitmap, Pair pair, Date date, ImageReturnType imageReturnType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : bitmap, (i11 & 4) != 0 ? null : pair, (i11 & 8) != 0 ? null : date, (i11 & 16) != 0 ? ImageReturnType.BASE_64 : imageReturnType);
    }
}
