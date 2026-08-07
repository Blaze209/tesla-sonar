package b10;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lb10/a;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewId", "Lb10/b;", "event", "<init>", "(IILb10/b;)V", "", "getEventName", "()Ljava/lang/String;", "", "getCoalescingKey", "()S", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", "Lb10/b;", "b", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends com.facebook.react.uimanager.events.d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FocusedInputLayoutChangedEventData event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i11, int i12, FocusedInputLayoutChangedEventData event) {
        super(i11, i12);
        s.k(event, "event");
        this.event = event;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", this.event.getTarget());
        writableMapCreateMap.putInt("parentScrollViewTarget", this.event.getParentScrollViewTarget());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", this.event.getX());
        writableMapCreateMap2.putDouble("y", this.event.getY());
        writableMapCreateMap2.putDouble(Snapshot.WIDTH, this.event.getWidth());
        writableMapCreateMap2.putDouble(Snapshot.HEIGHT, this.event.getHeight());
        writableMapCreateMap2.putDouble("absoluteX", this.event.getAbsoluteX());
        writableMapCreateMap2.putDouble("absoluteY", this.event.getAbsoluteY());
        h0 h0Var = h0.f84049a;
        writableMapCreateMap.putMap("layout", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topFocusedInputLayoutChanged";
    }
}
