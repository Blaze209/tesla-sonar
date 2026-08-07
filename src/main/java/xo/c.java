package xo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lxo/c;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewId", "", "offset", "<init>", "(IIF)V", "a", "()F", "", "getEventName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", Gender.FEMALE, "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.facebook.react.uimanager.events.d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float offset;

    public c(int i11, int i12, float f11) {
        super(i11, i12);
        this.offset = f11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getOffset() {
        return this.offset;
    }

    @Override // com.facebook.react.uimanager.events.d
    /* JADX INFO: renamed from: getEventData */
    protected WritableMap getData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        s.j(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putDouble("offset", getOffset());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topDrawerSlide";
    }
}
