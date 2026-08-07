package expo.modules.imagepicker;

import android.os.Bundle;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0000\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010 R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010(\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010/R \u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00103\u0012\u0004\b0\u0010\u0016\u001a\u0004\b1\u00102R \u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u00103\u0012\u0004\b4\u0010\u0016\u001a\u0004\b5\u00102¨\u00066"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerAsset;", "Lexpo/modules/kotlin/records/Record;", "assetId", "", "type", "Lexpo/modules/imagepicker/MediaType;", "uri", Snapshot.WIDTH, "", Snapshot.HEIGHT, "fileName", "fileSize", "", "mimeType", "base64", "exif", "Landroid/os/Bundle;", "duration", "rotation", "<init>", "(Ljava/lang/String;Lexpo/modules/imagepicker/MediaType;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAssetId$annotations", "()V", "getAssetId", "()Ljava/lang/String;", "getType$annotations", "getType", "()Lexpo/modules/imagepicker/MediaType;", "getUri$annotations", "getUri", "getWidth$annotations", "getWidth", "()I", "getHeight$annotations", "getHeight", "getFileName$annotations", "getFileName", "getFileSize$annotations", "getFileSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMimeType$annotations", "getMimeType", "getBase64$annotations", "getBase64", "getExif$annotations", "getExif", "()Landroid/os/Bundle;", "getDuration$annotations", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRotation$annotations", "getRotation", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImagePickerAsset implements Record {
    private final String assetId;
    private final String base64;
    private final Integer duration;
    private final Bundle exif;
    private final String fileName;
    private final Long fileSize;
    private final int height;
    private final String mimeType;
    private final Integer rotation;
    private final MediaType type;
    private final String uri;
    private final int width;

    public ImagePickerAsset() {
        this(null, null, null, 0, 0, null, null, null, null, null, null, null, 4095, null);
    }

    @Field
    public static /* synthetic */ void getAssetId$annotations() {
    }

    @Field
    public static /* synthetic */ void getBase64$annotations() {
    }

    @Field
    public static /* synthetic */ void getDuration$annotations() {
    }

    @Field
    public static /* synthetic */ void getExif$annotations() {
    }

    @Field
    public static /* synthetic */ void getFileName$annotations() {
    }

    @Field
    public static /* synthetic */ void getFileSize$annotations() {
    }

    @Field
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Field
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @Field
    public static /* synthetic */ void getRotation$annotations() {
    }

    @Field
    public static /* synthetic */ void getType$annotations() {
    }

    @Field
    public static /* synthetic */ void getUri$annotations() {
    }

    @Field
    public static /* synthetic */ void getWidth$annotations() {
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getBase64() {
        return this.base64;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final Bundle getExif() {
        return this.exif;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final Long getFileSize() {
        return this.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Integer getRotation() {
        return this.rotation;
    }

    public final MediaType getType() {
        return this.type;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public ImagePickerAsset(String str, MediaType type, String uri, int i11, int i12, String str2, Long l11, String str3, String str4, Bundle bundle, Integer num, Integer num2) {
        s.k(type, "type");
        s.k(uri, "uri");
        this.assetId = str;
        this.type = type;
        this.uri = uri;
        this.width = i11;
        this.height = i12;
        this.fileName = str2;
        this.fileSize = l11;
        this.mimeType = str3;
        this.base64 = str4;
        this.exif = bundle;
        this.duration = num;
        this.rotation = num2;
    }

    public /* synthetic */ ImagePickerAsset(String str, MediaType mediaType, String str2, int i11, int i12, String str3, Long l11, String str4, String str5, Bundle bundle, Integer num, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? MediaType.IMAGE : mediaType, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) == 0 ? i12 : 0, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : l11, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : str5, (i13 & 512) != 0 ? null : bundle, (i13 & 1024) != 0 ? null : num, (i13 & 2048) != 0 ? null : num2);
    }
}
