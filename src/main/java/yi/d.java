package yi;

import com.brentvatne.exoplayer.ReactExoplayerViewManager;
import com.brentvatne.exoplayer.y;
import com.brentvatne.react.VideoDecoderInfoModule;
import com.brentvatne.react.VideoManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyi/d;", "Lcom/facebook/react/p0;", "Lcom/brentvatne/exoplayer/y;", "config", "<init>", "(Lcom/brentvatne/exoplayer/y;)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "Lcom/facebook/react/uimanager/ViewManager;", "createViewManagers", "a", "Lcom/brentvatne/exoplayer/y;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y config;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        return v.p(new VideoDecoderInfoModule(reactContext), new VideoManagerModule(reactContext));
    }

    @Override // com.facebook.react.p0
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        s.k(reactContext, "reactContext");
        y jVar = this.config;
        if (jVar == null) {
            jVar = new com.brentvatne.exoplayer.j(reactContext, null, 2, null);
        }
        return v.e(new ReactExoplayerViewManager(jVar));
    }

    public d(y yVar) {
        this.config = yVar;
    }

    public /* synthetic */ d(y yVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : yVar);
    }
}
