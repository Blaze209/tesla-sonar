package expo.modules.medialibrary;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJh\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0014R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0019R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001f\u0012\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u001e¨\u00062"}, d2 = {"Lexpo/modules/medialibrary/AssetsOptions;", "Lexpo/modules/kotlin/records/Record;", "first", "", "after", "", "album", "sortBy", "", "mediaType", "createdAfter", "createdBefore", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)V", "getFirst$annotations", "()V", "getFirst", "()D", "getAfter$annotations", "getAfter", "()Ljava/lang/String;", "getAlbum$annotations", "getAlbum", "getSortBy$annotations", "getSortBy", "()Ljava/util/List;", "getMediaType$annotations", "getMediaType", "getCreatedAfter$annotations", "getCreatedAfter", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCreatedBefore$annotations", "getCreatedBefore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)Lexpo/modules/medialibrary/AssetsOptions;", "equals", "", "other", "", "hashCode", "", "toString", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AssetsOptions implements Record {
    private final String after;
    private final String album;
    private final Double createdAfter;
    private final Double createdBefore;
    private final double first;
    private final List<String> mediaType;
    private final List<String> sortBy;

    public AssetsOptions(double d11, String str, String str2, List<String> sortBy, List<String> mediaType, Double d12, Double d13) {
        s.k(sortBy, "sortBy");
        s.k(mediaType, "mediaType");
        this.first = d11;
        this.after = str;
        this.album = str2;
        this.sortBy = sortBy;
        this.mediaType = mediaType;
        this.createdAfter = d12;
        this.createdBefore = d13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetsOptions copy$default(AssetsOptions assetsOptions, double d11, String str, String str2, List list, List list2, Double d12, Double d13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = assetsOptions.first;
        }
        double d14 = d11;
        if ((i11 & 2) != 0) {
            str = assetsOptions.after;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = assetsOptions.album;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            list = assetsOptions.sortBy;
        }
        List list3 = list;
        if ((i11 & 16) != 0) {
            list2 = assetsOptions.mediaType;
        }
        return assetsOptions.copy(d14, str3, str4, list3, list2, (i11 & 32) != 0 ? assetsOptions.createdAfter : d12, (i11 & 64) != 0 ? assetsOptions.createdBefore : d13);
    }

    @Field
    public static /* synthetic */ void getAfter$annotations() {
    }

    @Field
    public static /* synthetic */ void getAlbum$annotations() {
    }

    @Field
    public static /* synthetic */ void getCreatedAfter$annotations() {
    }

    @Field
    public static /* synthetic */ void getCreatedBefore$annotations() {
    }

    @Field
    public static /* synthetic */ void getFirst$annotations() {
    }

    @Field
    public static /* synthetic */ void getMediaType$annotations() {
    }

    @Field
    public static /* synthetic */ void getSortBy$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAfter() {
        return this.after;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAlbum() {
        return this.album;
    }

    public final List<String> component4() {
        return this.sortBy;
    }

    public final List<String> component5() {
        return this.mediaType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getCreatedAfter() {
        return this.createdAfter;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getCreatedBefore() {
        return this.createdBefore;
    }

    public final AssetsOptions copy(double first, String after, String album, List<String> sortBy, List<String> mediaType, Double createdAfter, Double createdBefore) {
        s.k(sortBy, "sortBy");
        s.k(mediaType, "mediaType");
        return new AssetsOptions(first, after, album, sortBy, mediaType, createdAfter, createdBefore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetsOptions)) {
            return false;
        }
        AssetsOptions assetsOptions = (AssetsOptions) other;
        return Double.compare(this.first, assetsOptions.first) == 0 && s.f(this.after, assetsOptions.after) && s.f(this.album, assetsOptions.album) && s.f(this.sortBy, assetsOptions.sortBy) && s.f(this.mediaType, assetsOptions.mediaType) && s.f(this.createdAfter, assetsOptions.createdAfter) && s.f(this.createdBefore, assetsOptions.createdBefore);
    }

    public final String getAfter() {
        return this.after;
    }

    public final String getAlbum() {
        return this.album;
    }

    public final Double getCreatedAfter() {
        return this.createdAfter;
    }

    public final Double getCreatedBefore() {
        return this.createdBefore;
    }

    public final double getFirst() {
        return this.first;
    }

    public final List<String> getMediaType() {
        return this.mediaType;
    }

    public final List<String> getSortBy() {
        return this.sortBy;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.first) * 31;
        String str = this.after;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.album;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.sortBy.hashCode()) * 31) + this.mediaType.hashCode()) * 31;
        Double d11 = this.createdAfter;
        int iHashCode4 = (iHashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.createdBefore;
        return iHashCode4 + (d12 != null ? d12.hashCode() : 0);
    }

    public String toString() {
        return "AssetsOptions(first=" + this.first + ", after=" + this.after + ", album=" + this.album + ", sortBy=" + this.sortBy + ", mediaType=" + this.mediaType + ", createdAfter=" + this.createdAfter + ", createdBefore=" + this.createdBefore + ")";
    }
}
