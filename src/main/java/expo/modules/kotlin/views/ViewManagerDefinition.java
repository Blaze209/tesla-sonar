package expo.modules.kotlin.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.ReactExtensionsKt;
import expo.modules.kotlin.defaultmodules.ErrorManagerModule;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\"\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b:\u00103R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=¨\u0006@"}, d2 = {"Lexpo/modules/kotlin/views/ViewManagerDefinition;", "", "", "name", "Lkotlin/Function2;", "Landroid/content/Context;", "Lexpo/modules/kotlin/AppContext;", "Landroid/view/View;", "viewFactory", "Ljava/lang/Class;", "viewType", "", "Lexpo/modules/kotlin/views/AnyViewProp;", "props", "Lkotlin/Function1;", "Ljn0/h0;", "onViewDestroys", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "callbacksDefinition", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "viewGroupDefinition", "onViewDidUpdateProps", "", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "asyncFunctions", "<init>", "(Ljava/lang/String;Lwn0/p;Ljava/lang/Class;Ljava/util/Map;Lwn0/l;Lexpo/modules/kotlin/views/CallbacksDefinition;Lexpo/modules/kotlin/views/ViewGroupDefinition;Lwn0/l;Ljava/util/List;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "appContext", "createView", "(Landroid/content/Context;Lexpo/modules/kotlin/AppContext;)Landroid/view/View;", "Lexpo/modules/kotlin/views/ViewManagerType;", "getViewManagerType", "()Lexpo/modules/kotlin/views/ViewManagerType;", "view", "Lexpo/modules/kotlin/exception/CodedException;", "exception", "handleException", "(Landroid/view/View;Lexpo/modules/kotlin/exception/CodedException;)V", "Ljava/lang/String;", "getName$expo_modules_core_release", "()Ljava/lang/String;", "Lwn0/p;", "Ljava/lang/Class;", "getViewType$expo_modules_core_release", "()Ljava/lang/Class;", "Ljava/util/Map;", "getProps$expo_modules_core_release", "()Ljava/util/Map;", "Lwn0/l;", "getOnViewDestroys", "()Lwn0/l;", "Lexpo/modules/kotlin/views/CallbacksDefinition;", "getCallbacksDefinition", "()Lexpo/modules/kotlin/views/CallbacksDefinition;", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getOnViewDidUpdateProps", "Ljava/util/List;", "getAsyncFunctions", "()Ljava/util/List;", "propsNames", "getPropsNames", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewManagerDefinition {
    private final List<BaseAsyncFunctionComponent> asyncFunctions;
    private final CallbacksDefinition callbacksDefinition;
    private final String name;
    private final l<View, h0> onViewDestroys;
    private final l<View, h0> onViewDidUpdateProps;
    private final Map<String, AnyViewProp> props;
    private final List<String> propsNames;
    private final p<Context, AppContext, View> viewFactory;
    private final ViewGroupDefinition viewGroupDefinition;
    private final Class<? extends View> viewType;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewManagerDefinition(String str, p<? super Context, ? super AppContext, ? extends View> viewFactory, Class<? extends View> viewType, Map<String, ? extends AnyViewProp> props, l<? super View, h0> lVar, CallbacksDefinition callbacksDefinition, ViewGroupDefinition viewGroupDefinition, l<? super View, h0> lVar2, List<? extends BaseAsyncFunctionComponent> asyncFunctions) {
        s.k(viewFactory, "viewFactory");
        s.k(viewType, "viewType");
        s.k(props, "props");
        s.k(asyncFunctions, "asyncFunctions");
        this.name = str;
        this.viewFactory = viewFactory;
        this.viewType = viewType;
        this.props = props;
        this.onViewDestroys = lVar;
        this.callbacksDefinition = callbacksDefinition;
        this.viewGroupDefinition = viewGroupDefinition;
        this.onViewDidUpdateProps = lVar2;
        this.asyncFunctions = asyncFunctions;
        this.propsNames = v.m1(props.keySet());
    }

    public final View createView(Context context, AppContext appContext) {
        s.k(context, "context");
        s.k(appContext, "appContext");
        return this.viewFactory.invoke(context, appContext);
    }

    public final List<BaseAsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final CallbacksDefinition getCallbacksDefinition() {
        return this.callbacksDefinition;
    }

    /* JADX INFO: renamed from: getName$expo_modules_core_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final l<View, h0> getOnViewDestroys() {
        return this.onViewDestroys;
    }

    public final l<View, h0> getOnViewDidUpdateProps() {
        return this.onViewDidUpdateProps;
    }

    public final Map<String, AnyViewProp> getProps$expo_modules_core_release() {
        return this.props;
    }

    public final List<String> getPropsNames() {
        return this.propsNames;
    }

    public final ViewGroupDefinition getViewGroupDefinition() {
        return this.viewGroupDefinition;
    }

    public final ViewManagerType getViewManagerType() {
        return ViewGroup.class.isAssignableFrom(this.viewType) ? ViewManagerType.GROUP : ViewManagerType.SIMPLE;
    }

    public final Class<? extends View> getViewType$expo_modules_core_release() {
        return this.viewType;
    }

    public final void handleException(View view, CodedException exception) {
        NativeModulesProxy unimoduleProxy;
        ErrorManagerModule errorManager;
        s.k(view, "view");
        s.k(exception, "exception");
        Context context = view.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null || (unimoduleProxy = ReactExtensionsKt.getUnimoduleProxy(reactContext)) == null || (errorManager = unimoduleProxy.getKotlinInteropModuleRegistry().getAppContext().getErrorManager()) == null) {
            return;
        }
        errorManager.reportExceptionToLogBox(exception);
    }

    public /* synthetic */ ViewManagerDefinition(String str, p pVar, Class cls, Map map, l lVar, CallbacksDefinition callbacksDefinition, ViewGroupDefinition viewGroupDefinition, l lVar2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, pVar, cls, (i11 & 8) != 0 ? v0.i() : map, (i11 & 16) != 0 ? null : lVar, (i11 & 32) != 0 ? null : callbacksDefinition, (i11 & 64) != 0 ? null : viewGroupDefinition, (i11 & 128) != 0 ? null : lVar2, (i11 & 256) != 0 ? v.m() : list);
    }
}
