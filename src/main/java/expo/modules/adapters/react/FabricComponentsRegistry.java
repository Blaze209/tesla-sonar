package expo.modules.adapters.react;

import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.soloader.SoLoader;
import expo.modules.core.interfaces.DoNotStrip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lexpo/modules/adapters/react/FabricComponentsRegistry;", "", "", "Lcom/facebook/react/uimanager/ViewManager;", "viewManagerList", "<init>", "(Ljava/util/List;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "", "componentNames", "Ljn0/h0;", "registerComponentsRegistry", "([Ljava/lang/String;)V", "finalize", "()V", "Ljava/util/List;", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class FabricComponentsRegistry {
    private final List<String> componentNames;

    @DoNotStrip
    private final HybridData mHybridData;

    static {
        SoLoader.t("expo-modules-core");
    }

    public FabricComponentsRegistry(List<? extends ViewManager<?, ?>> viewManagerList) {
        s.k(viewManagerList, "viewManagerList");
        List<? extends ViewManager<?, ?>> list = viewManagerList;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ViewManager) it.next()).getName());
        }
        this.componentNames = arrayList;
        this.mHybridData = initHybrid();
        registerComponentsRegistry((String[]) arrayList.toArray(new String[0]));
    }

    private final native HybridData initHybrid();

    private final native void registerComponentsRegistry(String[] componentNames);

    protected final void finalize() {
        this.mHybridData.resetNative();
    }
}
