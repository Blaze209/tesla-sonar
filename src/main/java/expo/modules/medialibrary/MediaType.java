package expo.modules.medialibrary;

import bo0.n;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lexpo/modules/medialibrary/MediaType;", "", "apiName", "", "mediaColumn", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getApiName", "()Ljava/lang/String;", "getMediaColumn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "AUDIO", "PHOTO", "VIDEO", "UNKNOWN", "ALL", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum MediaType {
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND, 2),
    PHOTO("photo", 1),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND, 3),
    UNKNOWN("unknown", 0),
    ALL("all", null);

    private final String apiName;
    private final Integer mediaColumn;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lexpo/modules/medialibrary/MediaType$Companion;", "", "<init>", "()V", "getConstants", "", "", "fromApiName", "Lexpo/modules/medialibrary/MediaType;", "constantName", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaType fromApiName(String constantName) {
            s.k(constantName, "constantName");
            for (MediaType mediaType : MediaType.values()) {
                if (s.f(mediaType.getApiName(), constantName)) {
                    return mediaType;
                }
            }
            return null;
        }

        public final Map<String, String> getConstants() {
            MediaType[] mediaTypeArrValues = MediaType.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(mediaTypeArrValues.length), 16));
            for (MediaType mediaType : mediaTypeArrValues) {
                Pair pair = new Pair(mediaType.getApiName(), mediaType.getApiName());
                linkedHashMap.put(pair.e(), pair.f());
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }

    MediaType(String str, Integer num) {
        this.apiName = str;
        this.mediaColumn = num;
    }

    public static EnumEntries<MediaType> getEntries() {
        return $ENTRIES;
    }

    public final String getApiName() {
        return this.apiName;
    }

    public final Integer getMediaColumn() {
        return this.mediaColumn;
    }
}
