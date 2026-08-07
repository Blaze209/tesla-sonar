package expo.modules.medialibrary;

import expo.modules.kotlin.types.Enumerable;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\u0004H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lexpo/modules/medialibrary/GranularPermission;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AUDIO", "PHOTO", "VIDEO", "toManifestPermission", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum GranularPermission implements Enumerable {
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND),
    PHOTO("photo"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND);

    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GranularPermission.values().length];
            try {
                iArr[GranularPermission.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GranularPermission.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GranularPermission.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    GranularPermission(String str) {
        this.value = str;
    }

    public static EnumEntries<GranularPermission> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }

    public final String toManifestPermission() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return "android.permission.READ_MEDIA_AUDIO";
        }
        if (i11 == 2) {
            return "android.permission.READ_MEDIA_IMAGES";
        }
        if (i11 == 3) {
            return "android.permission.READ_MEDIA_VIDEO";
        }
        throw new NoWhenBranchMatchedException();
    }
}
