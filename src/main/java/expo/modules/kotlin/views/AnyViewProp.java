package expo.modules.kotlin.views;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.types.AnyType;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/views/AnyViewProp;", "", "", "name", "Lexpo/modules/kotlin/types/AnyType;", "type", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;)V", "Lcom/facebook/react/bridge/Dynamic;", "prop", "Landroid/view/View;", "onView", "Lexpo/modules/kotlin/AppContext;", "appContext", "Ljn0/h0;", "set", "(Lcom/facebook/react/bridge/Dynamic;Landroid/view/View;Lexpo/modules/kotlin/AppContext;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lexpo/modules/kotlin/types/AnyType;", "getType$expo_modules_core_release", "()Lexpo/modules/kotlin/types/AnyType;", "", "isNullable", "()Z", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AnyViewProp {
    private final String name;
    private final AnyType type;

    public AnyViewProp(String name, AnyType type) {
        s.k(name, "name");
        s.k(type, "type");
        this.name = name;
        this.type = type;
    }

    public static /* synthetic */ void set$default(AnyViewProp anyViewProp, Dynamic dynamic, View view, AppContext appContext, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
        }
        if ((i11 & 4) != 0) {
            appContext = null;
        }
        anyViewProp.set(dynamic, view, appContext);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getType$expo_modules_core_release, reason: from getter */
    public final AnyType getType() {
        return this.type;
    }

    public abstract boolean isNullable();

    public abstract void set(Dynamic prop, View onView, AppContext appContext);
}
