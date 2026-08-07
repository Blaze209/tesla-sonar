package z90;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import com.swmansion.gesturehandler.core.StylusData;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lz90/g;", "Lz90/b;", "Lcom/swmansion/gesturehandler/core/f;", "handler", "<init>", "(Lcom/swmansion/gesturehandler/core/f;)V", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "Ljn0/h0;", "a", "(Lcom/facebook/react/bridge/WritableMap;)V", "", "e", Gender.FEMALE, "x", "f", "y", "g", "absoluteX", "h", "absoluteY", IntegerTokenConverter.CONVERTER_KEY, "translationX", "j", "translationY", "k", "velocityX", "l", "velocityY", "Lcom/swmansion/gesturehandler/core/k;", "m", "Lcom/swmansion/gesturehandler/core/k;", "stylusData", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends b<com.swmansion.gesturehandler.core.f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float x;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float y;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float absoluteX;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float absoluteY;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float translationX;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float translationY;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float velocityX;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float velocityY;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final StylusData stylusData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.swmansion.gesturehandler.core.f handler) {
        super(handler);
        s.k(handler, "handler");
        this.x = handler.getLastAbsolutePositionX();
        this.y = handler.getLastAbsolutePositionY();
        this.absoluteX = handler.J();
        this.absoluteY = handler.K();
        this.translationX = handler.n1();
        this.translationY = handler.o1();
        this.velocityX = handler.getVelocityX();
        this.velocityY = handler.getVelocityY();
        this.stylusData = handler.getStylusData();
    }

    @Override // z90.b
    public void a(WritableMap eventData) {
        s.k(eventData, "eventData");
        super.a(eventData);
        eventData.putDouble("x", w.f(this.x));
        eventData.putDouble("y", w.f(this.y));
        eventData.putDouble("absoluteX", w.f(this.absoluteX));
        eventData.putDouble("absoluteY", w.f(this.absoluteY));
        eventData.putDouble("translationX", w.f(this.translationX));
        eventData.putDouble("translationY", w.f(this.translationY));
        eventData.putDouble("velocityX", w.f(this.velocityX));
        eventData.putDouble("velocityY", w.f(this.velocityY));
        if (this.stylusData.getPressure() == -1.0d) {
            return;
        }
        eventData.putMap("stylusData", this.stylusData.b());
    }
}
