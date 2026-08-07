package xo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lxo/d;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewId", "drawerState", "<init>", "(III)V", "a", "()I", "", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "I", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends com.facebook.react.uimanager.events.d<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int drawerState;

    public d(int i11, int i12, int i13) {
        super(i11, i12);
        this.drawerState = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDrawerState() {
        return this.drawerState;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        s.j(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("drawerState", getDrawerState());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDrawerStateChanged";
    }
}
