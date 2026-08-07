package b10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006 "}, d2 = {"Lb10/f;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewId", "Lb10/f$a$a;", "event", "", Snapshot.HEIGHT, ReactProgressBarViewManager.PROP_PROGRESS, "duration", "target", "<init>", "(IILb10/f$a$a;DDII)V", "", "getEventName", "()Ljava/lang/String;", "", "getCoalescingKey", "()S", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", "Lb10/f$a$a;", "b", "D", "c", DateTokenConverter.CONVERTER_KEY, "I", "e", "f", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends com.facebook.react.uimanager.events.d<f> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Companion.EnumC0273a f15295g = Companion.EnumC0273a.Move;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Companion.EnumC0273a f15296h = Companion.EnumC0273a.Start;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Companion.EnumC0273a f15297i = Companion.EnumC0273a.End;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Companion.EnumC0273a f15298j = Companion.EnumC0273a.Interactive;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Companion.EnumC0273a event;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final double height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double progress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int duration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int target;

    /* JADX INFO: renamed from: b10.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lb10/f$a;", "", "<init>", "()V", "Lb10/f$a$a;", "Move", "Lb10/f$a$a;", "c", "()Lb10/f$a$a;", "Start", DateTokenConverter.CONVERTER_KEY, "End", "a", "Interactive", "b", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: b10.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lb10/f$a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Move", "Start", "End", "Interactive", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum EnumC0273a {
            Move("topKeyboardMove"),
            Start("topKeyboardMoveStart"),
            End("topKeyboardMoveEnd"),
            Interactive("topKeyboardMoveInteractive");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String value;

            EnumC0273a(String str) {
                this.value = str;
            }

            public static EnumEntries<EnumC0273a> getEntries() {
                return $ENTRIES;
            }

            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0273a a() {
            return f.f15297i;
        }

        public final EnumC0273a b() {
            return f.f15298j;
        }

        public final EnumC0273a c() {
            return f.f15295g;
        }

        public final EnumC0273a d() {
            return f.f15296h;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i11, int i12, Companion.EnumC0273a event, double d11, double d12, int i13, int i14) {
        super(i11, i12);
        s.k(event, "event");
        this.event = event;
        this.height = d11;
        this.progress = d12;
        this.duration = i13;
        this.target = i14;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, this.progress);
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, this.height);
        writableMapCreateMap.putInt("duration", this.duration);
        writableMapCreateMap.putInt("target", this.target);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return this.event.getValue();
    }
}
