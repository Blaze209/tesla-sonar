package or0;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;

/* JADX INFO: loaded from: classes10.dex */
public class a extends d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WritableMap f98502a;

    public a(int i11, int i12, WritableMap writableMap) {
        super(i11, i12);
        this.f98502a = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return this.f98502a;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
