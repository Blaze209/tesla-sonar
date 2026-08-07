package zf0;

import android.graphics.Bitmap;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lzf0/q0;", "", "Lzf0/h0;", "a", "()Lzf0/h0;", "imageLightCondition", "b", "c", "Lzf0/q0$a;", "Lzf0/q0$b;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface q0 {

    /* JADX INFO: renamed from: zf0.q0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzf0/q0$a;", "Lzf0/q0;", "Lzf0/h0;", "imageLightCondition", "<init>", "(Lzf0/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzf0/h0;", "()Lzf0/h0;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageLightCondition imageLightCondition;

        public None(ImageLightCondition imageLightCondition) {
            this.imageLightCondition = imageLightCondition;
        }

        @Override // zf0.q0
        /* JADX INFO: renamed from: a, reason: from getter */
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof None) && p013kotlin.jvm.internal.s.f(this.imageLightCondition, ((None) other).imageLightCondition);
        }

        public int hashCode() {
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            if (imageLightCondition == null) {
                return 0;
            }
            return imageLightCondition.hashCode();
        }

        public String toString() {
            return "None(imageLightCondition=" + this.imageLightCondition + ")";
        }
    }

    /* JADX INFO: renamed from: zf0.q0$b, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b&\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b\u001b\u0010,¨\u0006-"}, d2 = {"Lzf0/q0$b;", "Lzf0/q0;", "Lzf0/q0$c;", "side", "Landroid/graphics/Bitmap;", "bitmap", "Lzf0/g0;", OrcaKeys.METADATA, "Lzf0/g;", "extractedBarcode", "Lzf0/c0;", "extractedTexts", "Lzf0/h0;", "imageLightCondition", "<init>", "(Lzf0/q0$c;Landroid/graphics/Bitmap;Lzf0/g0;Lzf0/g;Lzf0/c0;Lzf0/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzf0/q0$c;", "f", "()Lzf0/q0$c;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "c", "Lzf0/g0;", "e", "()Lzf0/g0;", DateTokenConverter.CONVERTER_KEY, "Lzf0/g;", "()Lzf0/g;", "Lzf0/c0;", "()Lzf0/c0;", "Lzf0/h0;", "()Lzf0/h0;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParsedIdSide implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c side;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageIdMetadata metadata;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final g extractedBarcode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ExtractedTexts extractedTexts;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ImageLightCondition imageLightCondition;

        public ParsedIdSide(c side, Bitmap bitmap, ImageIdMetadata imageIdMetadata, g gVar, ExtractedTexts extractedTexts, ImageLightCondition imageLightCondition) {
            p013kotlin.jvm.internal.s.k(side, "side");
            p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
            this.side = side;
            this.bitmap = bitmap;
            this.metadata = imageIdMetadata;
            this.extractedBarcode = gVar;
            this.extractedTexts = extractedTexts;
            this.imageLightCondition = imageLightCondition;
        }

        @Override // zf0.q0
        /* JADX INFO: renamed from: a, reason: from getter */
        public ImageLightCondition getImageLightCondition() {
            return this.imageLightCondition;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final g getExtractedBarcode() {
            return this.extractedBarcode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ExtractedTexts getExtractedTexts() {
            return this.extractedTexts;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ImageIdMetadata getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedIdSide)) {
                return false;
            }
            ParsedIdSide parsedIdSide = (ParsedIdSide) other;
            return this.side == parsedIdSide.side && p013kotlin.jvm.internal.s.f(this.bitmap, parsedIdSide.bitmap) && p013kotlin.jvm.internal.s.f(this.metadata, parsedIdSide.metadata) && p013kotlin.jvm.internal.s.f(this.extractedBarcode, parsedIdSide.extractedBarcode) && p013kotlin.jvm.internal.s.f(this.extractedTexts, parsedIdSide.extractedTexts) && p013kotlin.jvm.internal.s.f(this.imageLightCondition, parsedIdSide.imageLightCondition);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final c getSide() {
            return this.side;
        }

        public int hashCode() {
            int iHashCode = ((this.side.hashCode() * 31) + this.bitmap.hashCode()) * 31;
            ImageIdMetadata imageIdMetadata = this.metadata;
            int iHashCode2 = (iHashCode + (imageIdMetadata == null ? 0 : imageIdMetadata.hashCode())) * 31;
            g gVar = this.extractedBarcode;
            int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            ExtractedTexts extractedTexts = this.extractedTexts;
            int iHashCode4 = (iHashCode3 + (extractedTexts == null ? 0 : extractedTexts.hashCode())) * 31;
            ImageLightCondition imageLightCondition = this.imageLightCondition;
            return iHashCode4 + (imageLightCondition != null ? imageLightCondition.hashCode() : 0);
        }

        public String toString() {
            return "ParsedIdSide(side=" + this.side + ", bitmap=" + this.bitmap + ", metadata=" + this.metadata + ", extractedBarcode=" + this.extractedBarcode + ", extractedTexts=" + this.extractedTexts + ", imageLightCondition=" + this.imageLightCondition + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lzf0/q0$c;", "", "<init>", "(Ljava/lang/String;I)V", "Front", "Back", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum c {
        Front,
        Back;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: a */
    ImageLightCondition getImageLightCondition();
}
