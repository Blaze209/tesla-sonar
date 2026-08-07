package s20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.HashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001\rBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R4\u0010 \u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bj\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001f\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001c0!8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\"¨\u0006%"}, d2 = {"Ls20/f;", "Lg20/f;", "", "firstEventId", "firstEventTimestamp", "sessionId", "previousSessionId", "", "sessionIndex", "userId", PlaceTypes.STORAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getFirstEventId", "()Ljava/lang/String;", "b", "getFirstEventTimestamp", "c", DateTokenConverter.CONVERTER_KEY, "getPreviousSessionId", "e", "I", "()I", "f", "g", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "h", "Ljava/util/HashMap;", "sessionContext", "", "()Ljava/util/Map;", "sessionValues", IntegerTokenConverter.CONVERTER_KEY, "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements g20.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String firstEventId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String firstEventTimestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sessionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String previousSessionId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int sessionIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String userId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String storage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, Object> sessionContext;

    /* JADX INFO: renamed from: s20.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls20/f$a;", "", "<init>", "()V", "", "", "storedState", "Ls20/f;", "a", "(Ljava/util/Map;)Ls20/f;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Map<String, ? extends Object> storedState) {
            s.k(storedState, "storedState");
            Object obj = storedState.get("firstEventId");
            if (!(obj instanceof String)) {
                return null;
            }
            Object obj2 = storedState.get("firstEventTimestamp");
            if (!(obj2 instanceof String)) {
                return null;
            }
            Object obj3 = storedState.get("sessionId");
            if (!(obj3 instanceof String)) {
                return null;
            }
            Object obj4 = storedState.get("previousSessionId");
            if (!(obj4 instanceof String)) {
                obj4 = null;
            }
            String str = obj4 instanceof String ? (String) obj4 : null;
            Object obj5 = storedState.get("sessionIndex");
            if (!(obj5 instanceof Integer)) {
                return null;
            }
            Object obj6 = storedState.get("userId");
            if (!(obj6 instanceof String)) {
                return null;
            }
            Object obj7 = storedState.get("storageMechanism");
            if (obj7 instanceof String) {
                return new f((String) obj, (String) obj2, (String) obj3, str, ((Number) obj5).intValue(), (String) obj6, (String) obj7);
            }
            return null;
        }

        private Companion() {
        }
    }

    public f(String firstEventId, String firstEventTimestamp, String sessionId, String str, int i11, String userId, String storage) {
        s.k(firstEventId, "firstEventId");
        s.k(firstEventTimestamp, "firstEventTimestamp");
        s.k(sessionId, "sessionId");
        s.k(userId, "userId");
        s.k(storage, "storage");
        this.firstEventId = firstEventId;
        this.firstEventTimestamp = firstEventTimestamp;
        this.sessionId = sessionId;
        this.previousSessionId = str;
        this.sessionIndex = i11;
        this.userId = userId;
        this.storage = storage;
        HashMap<String, Object> map = new HashMap<>();
        this.sessionContext = map;
        map.put("firstEventId", firstEventId);
        map.put("firstEventTimestamp", firstEventTimestamp);
        map.put("sessionId", sessionId);
        map.put("previousSessionId", str);
        map.put("sessionIndex", Integer.valueOf(i11));
        map.put("userId", userId);
        map.put("storageMechanism", storage);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public final Map<String, Object> c() {
        return this.sessionContext;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStorage() {
        return this.storage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }
}
