package k00;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lk00/e;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewTag", Snapshot.HEIGHT, "<init>", "(III)V", "Lcom/facebook/react/bridge/WritableMap;", "kotlin.jvm.PlatformType", "a", "()Lcom/facebook/react/bridge/WritableMap;", "getEventData", "I", "b", "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e extends com.facebook.react.uimanager.events.d<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int height;

    public e(int i11, int i12, int i13) {
        super(i11, i12);
        this.height = i13;
    }

    private final WritableMap a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("softInputHeight", this.height);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return a();
    }
}
