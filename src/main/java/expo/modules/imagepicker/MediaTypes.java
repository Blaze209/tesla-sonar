package expo.modules.imagepicker;

import expo.modules.kotlin.types.Enumerable;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.n;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0010"}, d2 = {"Lexpo/modules/imagepicker/MediaTypes;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IMAGES", "VIDEOS", "ALL", "toMimeType", "toFileExtension", "toCameraIntentAction", "Companion", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum MediaTypes implements Enumerable {
    IMAGES("Images"),
    VIDEOS("Videos"),
    ALL("All");

    private static final String AllMimeType = "*/*";
    private static final String ImageAllMimeType = "image/*";
    private static final String VideoAllMimeType = "video/*";
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lexpo/modules/imagepicker/MediaTypes$Companion;", "", "<init>", "()V", "ImageAllMimeType", "", "VideoAllMimeType", "AllMimeType", "fromJSMediaTypesArray", "Lexpo/modules/imagepicker/MediaTypes;", "mediaTypes", "", "Lexpo/modules/imagepicker/JSMediaTypes;", "([Lexpo/modules/imagepicker/JSMediaTypes;)Lexpo/modules/imagepicker/MediaTypes;", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaTypes fromJSMediaTypesArray(JSMediaTypes[] mediaTypes) {
            s.k(mediaTypes, "mediaTypes");
            JSMediaTypes jSMediaTypes = JSMediaTypes.VIDEOS;
            if (n.e0(mediaTypes, jSMediaTypes)) {
                return (!n.e0(mediaTypes, jSMediaTypes) || n.e0(mediaTypes, JSMediaTypes.IMAGES)) ? MediaTypes.ALL : MediaTypes.VIDEOS;
            }
            return MediaTypes.IMAGES;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaTypes.values().length];
            try {
                iArr[MediaTypes.IMAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaTypes.VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaTypes.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    MediaTypes(String str) {
        this.value = str;
    }

    public static EnumEntries<MediaTypes> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }

    public final String toCameraIntentAction() {
        return WhenMappings.$EnumSwitchMapping$0[ordinal()] == 2 ? "android.media.action.VIDEO_CAPTURE" : "android.media.action.IMAGE_CAPTURE";
    }

    public final String toFileExtension() {
        return WhenMappings.$EnumSwitchMapping$0[ordinal()] == 2 ? ".mp4" : ".jpeg";
    }

    public final String toMimeType() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return ImageAllMimeType;
        }
        if (i11 == 2) {
            return VideoAllMimeType;
        }
        if (i11 == 3) {
            return AllMimeType;
        }
        throw new NoWhenBranchMatchedException();
    }
}
