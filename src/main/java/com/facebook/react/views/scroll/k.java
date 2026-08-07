package com.facebook.react.views.scroll;

import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0016\u0010\r\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/facebook/react/views/scroll/k;", "Lcom/facebook/react/uimanager/events/d;", "<init>", "()V", "", "surfaceId", "viewTag", "Lcom/facebook/react/views/scroll/l;", "scrollEventType", "", "scrollX", "scrollY", "xVelocity", "yVelocity", "contentWidth", "contentHeight", "scrollViewWidth", "scrollViewHeight", "Ljn0/h0;", "c", "(IILcom/facebook/react/views/scroll/l;FFFFIIII)V", "onDispose", "", "getEventName", "()Ljava/lang/String;", "", "canCoalesce", "()Z", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", Gender.FEMALE, "b", DateTokenConverter.CONVERTER_KEY, "e", "I", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/views/scroll/l;", "", "j", "J", "timestamp", "k", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends com.facebook.react.uimanager.events.d<k> {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f23631l = k.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final u5.g<k> f23632m = new u5.g<>(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float scrollX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float scrollY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float xVelocity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float yVelocity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int contentWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int contentHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int scrollViewWidth;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int scrollViewHeight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private l scrollEventType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long timestamp;

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014Ja\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/views/scroll/k$a;", "", "<init>", "()V", "", "surfaceId", "viewTag", "Lcom/facebook/react/views/scroll/l;", "scrollEventType", "", "scrollX", "scrollY", "xVelocity", "yVelocity", "contentWidth", "contentHeight", "scrollViewWidth", "scrollViewHeight", "Lcom/facebook/react/views/scroll/k;", "a", "(IILcom/facebook/react/views/scroll/l;FFFFIIII)Lcom/facebook/react/views/scroll/k;", "b", "(ILcom/facebook/react/views/scroll/l;FFFFIIII)Lcom/facebook/react/views/scroll/k;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Lu5/g;", "EVENTS_POOL", "Lu5/g;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(int surfaceId, int viewTag, l scrollEventType, float scrollX, float scrollY, float xVelocity, float yVelocity, int contentWidth, int contentHeight, int scrollViewWidth, int scrollViewHeight) {
            k kVar = (k) k.f23632m.b();
            if (kVar == null) {
                kVar = new k(null);
            }
            k kVar2 = kVar;
            kVar2.c(surfaceId, viewTag, scrollEventType, scrollX, scrollY, xVelocity, yVelocity, contentWidth, contentHeight, scrollViewWidth, scrollViewHeight);
            return kVar2;
        }

        @jn0.e
        public final k b(int viewTag, l scrollEventType, float scrollX, float scrollY, float xVelocity, float yVelocity, int contentWidth, int contentHeight, int scrollViewWidth, int scrollViewHeight) {
            return a(-1, viewTag, scrollEventType, scrollX, scrollY, xVelocity, yVelocity, contentWidth, contentHeight, scrollViewWidth, scrollViewHeight);
        }

        private Companion() {
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int surfaceId, int viewTag, l scrollEventType, float scrollX, float scrollY, float xVelocity, float yVelocity, int contentWidth, int contentHeight, int scrollViewWidth, int scrollViewHeight) {
        super.init(surfaceId, viewTag);
        this.scrollEventType = scrollEventType;
        this.scrollX = scrollX;
        this.scrollY = scrollY;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.contentWidth = contentWidth;
        this.contentHeight = contentHeight;
        this.scrollViewWidth = scrollViewWidth;
        this.scrollViewHeight = scrollViewHeight;
        this.timestamp = SystemClock.uptimeMillis();
    }

    public static final k d(int i11, int i12, l lVar, float f11, float f12, float f13, float f14, int i13, int i14, int i15, int i16) {
        return INSTANCE.a(i11, i12, lVar, f11, f12, f13, f14, i13, i14, i15, i16);
    }

    @jn0.e
    public static final k e(int i11, l lVar, float f11, float f12, float f13, float f14, int i12, int i13, int i14, int i15) {
        return INSTANCE.b(i11, lVar, f11, f12, f13, f14, i12, i13, i14, i15);
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return this.scrollEventType == l.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", 0.0d);
        writableMapCreateMap.putDouble("bottom", 0.0d);
        writableMapCreateMap.putDouble("left", 0.0d);
        writableMapCreateMap.putDouble("right", 0.0d);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", w.f(this.scrollX));
        writableMapCreateMap2.putDouble("y", w.f(this.scrollY));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble(Snapshot.WIDTH, w.f(this.contentWidth));
        writableMapCreateMap3.putDouble(Snapshot.HEIGHT, w.f(this.contentHeight));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble(Snapshot.WIDTH, w.f(this.scrollViewWidth));
        writableMapCreateMap4.putDouble(Snapshot.HEIGHT, w.f(this.scrollViewHeight));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putDouble("x", this.xVelocity);
        writableMapCreateMap5.putDouble("y", this.yVelocity);
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        writableMapCreateMap6.putMap("contentInset", writableMapCreateMap);
        writableMapCreateMap6.putMap("contentOffset", writableMapCreateMap2);
        writableMapCreateMap6.putMap("contentSize", writableMapCreateMap3);
        writableMapCreateMap6.putMap("layoutMeasurement", writableMapCreateMap4);
        writableMapCreateMap6.putMap("velocity", writableMapCreateMap5);
        writableMapCreateMap6.putInt("target", getViewTag());
        writableMapCreateMap6.putDouble("timestamp", this.timestamp);
        writableMapCreateMap6.putBoolean("responderIgnoreScroll", true);
        s.h(writableMapCreateMap6);
        return writableMapCreateMap6;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        l.Companion companion = l.INSTANCE;
        Object objC = gn.a.c(this.scrollEventType);
        s.j(objC, "assertNotNull(...)");
        return companion.a((l) objC);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        try {
            f23632m.a(this);
        } catch (IllegalStateException e11) {
            String TAG = f23631l;
            s.j(TAG, "TAG");
            ReactSoftExceptionLogger.logSoftException(TAG, e11);
        }
    }

    private k() {
    }
}
