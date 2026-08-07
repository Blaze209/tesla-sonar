package com.facebook.react.views.image;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.horcrux.svg.events.SvgLoadEvent;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\r\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010Ba\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006!"}, d2 = {"Lcom/facebook/react/views/image/b;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewId", "eventType", "", "errorMessage", "sourceUri", Snapshot.WIDTH, Snapshot.HEIGHT, "loaded", "total", "<init>", "(IIILjava/lang/String;Ljava/lang/String;IIII)V", "Lcom/facebook/react/bridge/WritableMap;", "a", "()Lcom/facebook/react/bridge/WritableMap;", "getEventName", "()Ljava/lang/String;", "", "getCoalescingKey", "()S", "getEventData", "I", "b", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.facebook.react.uimanager.events.d<b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String errorMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sourceUri;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int loaded;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int total;

    /* JADX INFO: renamed from: com.facebook.react.views.image.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ9\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\tJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lcom/facebook/react/views/image/b$a;", "", "<init>", "()V", "", "surfaceId", "viewId", "Lcom/facebook/react/views/image/b;", DateTokenConverter.CONVERTER_KEY, "(II)Lcom/facebook/react/views/image/b;", "", "imageUri", "loaded", "total", "e", "(IILjava/lang/String;II)Lcom/facebook/react/views/image/b;", Snapshot.WIDTH, Snapshot.HEIGHT, "c", "", "throwable", "a", "(IILjava/lang/Throwable;)Lcom/facebook/react/views/image/b;", "b", "eventType", "f", "(I)Ljava/lang/String;", "ON_ERROR", "I", "ON_LOAD", "ON_LOAD_END", "ON_LOAD_START", "ON_PROGRESS", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int surfaceId, int viewId, Throwable throwable) {
            s.k(throwable, "throwable");
            return new b(surfaceId, viewId, 1, throwable.getMessage(), null, 0, 0, 0, 0, null);
        }

        public final b b(int surfaceId, int viewId) {
            return new b(surfaceId, viewId, 3, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b c(int surfaceId, int viewId, String imageUri, int width, int height) {
            return new b(surfaceId, viewId, 2, null, imageUri, width, height, 0, 0, null);
        }

        public final b d(int surfaceId, int viewId) {
            return new b(surfaceId, viewId, 4, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b e(int surfaceId, int viewId, String imageUri, int loaded, int total) {
            return new b(surfaceId, viewId, 5, null, imageUri, 0, 0, loaded, total, null);
        }

        public final String f(int eventType) {
            if (eventType == 1) {
                return "topError";
            }
            if (eventType == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (eventType == 3) {
                return "topLoadEnd";
            }
            if (eventType == 4) {
                return "topLoadStart";
            }
            if (eventType == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + eventType).toString());
        }

        private Companion() {
        }
    }

    public /* synthetic */ b(int i11, int i12, int i13, String str, String str2, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, str, str2, i14, i15, i16, i17);
    }

    private final WritableMap a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", this.sourceUri);
        writableMapCreateMap.putDouble(Snapshot.WIDTH, this.width);
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, this.height);
        s.j(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) this.eventType;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i11 = this.eventType;
        if (i11 == 1) {
            writableMapCreateMap.putString(AnalyticsAttribute.Error, this.errorMessage);
            return writableMapCreateMap;
        }
        if (i11 == 2) {
            writableMapCreateMap.putMap("source", a());
            return writableMapCreateMap;
        }
        if (i11 != 5) {
            return writableMapCreateMap;
        }
        writableMapCreateMap.putInt("loaded", this.loaded);
        writableMapCreateMap.putInt("total", this.total);
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, ((double) this.loaded) / ((double) this.total));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return INSTANCE.f(this.eventType);
    }

    /* synthetic */ b(int i11, int i12, int i13, String str, String str2, int i14, int i15, int i16, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, (i18 & 8) != 0 ? null : str, (i18 & 16) != 0 ? null : str2, (i18 & 32) != 0 ? 0 : i14, (i18 & 64) != 0 ? 0 : i15, (i18 & 128) != 0 ? 0 : i16, (i18 & 256) != 0 ? 0 : i17);
    }

    private b(int i11, int i12, int i13, String str, String str2, int i14, int i15, int i16, int i17) {
        super(i11, i12);
        this.eventType = i13;
        this.errorMessage = str;
        this.sourceUri = str2;
        this.width = i14;
        this.height = i15;
        this.loaded = i16;
        this.total = i17;
    }
}
