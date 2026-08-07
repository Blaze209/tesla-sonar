package expo.modules.kotlin.views;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.u0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/views/ShadowNodeProxy;", "", "Lexpo/modules/kotlin/views/ExpoView;", "expoView", "<init>", "(Lexpo/modules/kotlin/views/ExpoView;)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Ljn0/h0;", "setViewSize", "(DD)V", "Lexpo/modules/kotlin/views/ExpoView;", "getExpoView", "()Lexpo/modules/kotlin/views/ExpoView;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShadowNodeProxy {
    private final ExpoView expoView;

    public ShadowNodeProxy(ExpoView expoView) {
        s.k(expoView, "expoView");
        this.expoView = expoView;
    }

    public final ExpoView getExpoView() {
        return this.expoView;
    }

    public final void setViewSize(double width, double height) {
        u0 stateWrapper = this.expoView.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap((Map<String, Object>) v0.m(x.a(Snapshot.WIDTH, Double.valueOf(width)), x.a(Snapshot.HEIGHT, Double.valueOf(height))));
            s.j(writableNativeMapMakeNativeMap, "makeNativeMap(...)");
            stateWrapper.updateState(writableNativeMapMakeNativeMap);
        }
    }
}
