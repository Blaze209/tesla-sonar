package expo.modules.imagemanipulator;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/imagemanipulator/ManipulateOptions;", "Lexpo/modules/kotlin/records/Record;", "<init>", "()V", "base64", "", "getBase64$annotations", "getBase64", "()Z", "compress", "", "getCompress$annotations", "getCompress", "()D", "format", "Lexpo/modules/imagemanipulator/ImageFormat;", "getFormat$annotations", "getFormat", "()Lexpo/modules/imagemanipulator/ImageFormat;", "expo-image-manipulator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManipulateOptions implements Record {
    private final boolean base64;
    private final double compress = 1.0d;
    private final ImageFormat format = ImageFormat.JPEG;

    @Field
    public static /* synthetic */ void getBase64$annotations() {
    }

    @Field
    public static /* synthetic */ void getCompress$annotations() {
    }

    @Field
    public static /* synthetic */ void getFormat$annotations() {
    }

    public final boolean getBase64() {
        return this.base64;
    }

    public final double getCompress() {
        return this.compress;
    }

    public final ImageFormat getFormat() {
        return this.format;
    }
}
