package expo.modules.imagemanipulator;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lexpo/modules/imagemanipulator/CropRect;", "Lexpo/modules/kotlin/records/Record;", "<init>", "()V", Snapshot.ORIGIN_X, "", "getOriginX$annotations", "getOriginX", "()D", Snapshot.ORIGIN_Y, "getOriginY$annotations", "getOriginY", Snapshot.WIDTH, "getWidth$annotations", "getWidth", Snapshot.HEIGHT, "getHeight$annotations", "getHeight", "expo-image-manipulator_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropRect implements Record {
    private final double height;
    private final double originX;
    private final double originY;
    private final double width;

    @Field
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Field
    public static /* synthetic */ void getOriginX$annotations() {
    }

    @Field
    public static /* synthetic */ void getOriginY$annotations() {
    }

    @Field
    public static /* synthetic */ void getWidth$annotations() {
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getOriginX() {
        return this.originX;
    }

    public final double getOriginY() {
        return this.originY;
    }

    public final double getWidth() {
        return this.width;
    }
}
