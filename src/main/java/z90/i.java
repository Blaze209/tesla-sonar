package z90;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0017"}, d2 = {"Lz90/i;", "Lz90/b;", "Lcom/swmansion/gesturehandler/core/i;", "handler", "<init>", "(Lcom/swmansion/gesturehandler/core/i;)V", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "Ljn0/h0;", "a", "(Lcom/facebook/react/bridge/WritableMap;)V", "", "e", "D", "rotation", "", "f", Gender.FEMALE, "anchorX", "g", "anchorY", "h", "velocity", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends b<com.swmansion.gesturehandler.core.i> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final double rotation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float anchorX;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float anchorY;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final double velocity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.swmansion.gesturehandler.core.i handler) {
        super(handler);
        s.k(handler, "handler");
        this.rotation = handler.getRotation();
        this.anchorX = handler.getAnchorX();
        this.anchorY = handler.getAnchorY();
        this.velocity = handler.getVelocity();
    }

    @Override // z90.b
    public void a(WritableMap eventData) {
        s.k(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("rotation", this.rotation);
        eventData.putDouble("anchorX", w.f(this.anchorX));
        eventData.putDouble("anchorY", w.f(this.anchorY));
        eventData.putDouble("velocity", this.velocity);
    }
}
