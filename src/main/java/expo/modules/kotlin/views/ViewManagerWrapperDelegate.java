package expo.modules.kotlin.views;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.RuntimeContext;
import expo.modules.kotlin.events.KModuleEventEmitterWrapperKt;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.OnViewDidUpdatePropsException;
import expo.modules.kotlin.exception.UnexpectedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0012J\u001b\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010'8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010&R\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0\u00198F¢\u0006\u0006\u001a\u0004\b.\u0010\u001b¨\u00060"}, d2 = {"Lexpo/modules/kotlin/views/ViewManagerWrapperDelegate;", "", "Lexpo/modules/kotlin/ModuleHolder;", "moduleHolder", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "definition", "", "delegateName", "<init>", "(Lexpo/modules/kotlin/ModuleHolder;Lexpo/modules/kotlin/views/ViewManagerDefinition;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "createView", "(Landroid/content/Context;)Landroid/view/View;", "view", "Ljn0/h0;", "onViewDidUpdateProps", "(Landroid/view/View;)V", "Lcom/facebook/react/bridge/ReadableMap;", "propsMap", "", "updateProperties", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/List;", "onDestroy", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lexpo/modules/kotlin/ModuleHolder;", "getModuleHolder$expo_modules_core_release", "()Lexpo/modules/kotlin/ModuleHolder;", "setModuleHolder$expo_modules_core_release", "(Lexpo/modules/kotlin/ModuleHolder;)V", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "getDefinition$expo_modules_core_release", "()Lexpo/modules/kotlin/views/ViewManagerDefinition;", "Ljava/lang/String;", "getDelegateName$expo_modules_core_release", "()Ljava/lang/String;", "Lexpo/modules/kotlin/views/ViewGroupDefinition;", "getViewGroupDefinition$expo_modules_core_release", "()Lexpo/modules/kotlin/views/ViewGroupDefinition;", "viewGroupDefinition", "getName", "name", "Lexpo/modules/kotlin/views/AnyViewProp;", "getProps", "props", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewManagerWrapperDelegate {
    private final ViewManagerDefinition definition;
    private final String delegateName;
    private ModuleHolder<?> moduleHolder;

    public ViewManagerWrapperDelegate(ModuleHolder<?> moduleHolder, ViewManagerDefinition definition, String str) {
        s.k(moduleHolder, "moduleHolder");
        s.k(definition, "definition");
        this.moduleHolder = moduleHolder;
        this.definition = definition;
        this.delegateName = str;
    }

    public final View createView(Context context) {
        s.k(context, "context");
        return this.definition.createView(context, this.moduleHolder.getModule().getAppContext());
    }

    /* JADX INFO: renamed from: getDefinition$expo_modules_core_release, reason: from getter */
    public final ViewManagerDefinition getDefinition() {
        return this.definition;
    }

    /* JADX INFO: renamed from: getDelegateName$expo_modules_core_release, reason: from getter */
    public final String getDelegateName() {
        return this.delegateName;
    }

    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        String[] names;
        Map mapC = v0.c();
        CallbacksDefinition callbacksDefinition = this.definition.getCallbacksDefinition();
        if (callbacksDefinition != null && (names = callbacksDefinition.getNames()) != null) {
            for (String str : names) {
                mapC.put(KModuleEventEmitterWrapperKt.normalizeEventName(str), v0.f(x.a("registrationName", str)));
            }
        }
        return v0.b(mapC);
    }

    public final ModuleHolder<?> getModuleHolder$expo_modules_core_release() {
        return this.moduleHolder;
    }

    public final String getName() {
        String str = this.delegateName;
        if (str != null) {
            return str;
        }
        return this.moduleHolder.getName() + "_" + this.definition.getName();
    }

    public final Map<String, AnyViewProp> getProps() {
        return this.definition.getProps$expo_modules_core_release();
    }

    public final ViewGroupDefinition getViewGroupDefinition$expo_modules_core_release() {
        return this.definition.getViewGroupDefinition();
    }

    public final void onDestroy(View view) {
        CodedException unexpectedException;
        CodedException codedException;
        s.k(view, "view");
        try {
            l<View, h0> onViewDestroys = this.definition.getOnViewDestroys();
            if (onViewDestroys != null) {
                onViewDestroys.invoke(view);
            }
        } catch (Throwable th2) {
            if (ErrorViewKt.isErrorView(view)) {
                return;
            }
            if (th2 instanceof CodedException) {
                codedException = (CodedException) th2;
            } else {
                if (th2 instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th2;
                    String code = codedException2.getCode();
                    s.j(code, "getCode(...)");
                    unexpectedException = new CodedException(code, codedException2.getMessage(), codedException2.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th2);
                }
                codedException = unexpectedException;
            }
            CoreLoggerKt.getLogger().error("❌ '" + view + "' wasn't able to destroy itself", codedException);
            this.definition.handleException(view, codedException);
        }
    }

    public final void onViewDidUpdateProps(View view) {
        CodedException unexpectedException;
        CodedException unexpectedException2;
        s.k(view, "view");
        l<View, h0> onViewDidUpdateProps = this.definition.getOnViewDidUpdateProps();
        if (onViewDidUpdateProps != null) {
            try {
                onViewDidUpdateProps.invoke(view);
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof CodedException) {
                        unexpectedException2 = (CodedException) th2;
                    } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                        String code = ((expo.modules.core.errors.CodedException) th2).getCode();
                        s.j(code, "getCode(...)");
                        unexpectedException2 = new CodedException(code, ((expo.modules.core.errors.CodedException) th2).getMessage(), ((expo.modules.core.errors.CodedException) th2).getCause());
                    } else {
                        unexpectedException2 = new UnexpectedException(th2);
                    }
                    throw new OnViewDidUpdatePropsException(vn0.a.e(view.getClass()), unexpectedException2);
                } catch (Throwable th3) {
                    if (ErrorViewKt.isErrorView(view)) {
                        return;
                    }
                    if (th3 instanceof CodedException) {
                        unexpectedException = (CodedException) th3;
                    } else if (th3 instanceof expo.modules.core.errors.CodedException) {
                        expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th3;
                        String code2 = codedException.getCode();
                        s.j(code2, "getCode(...)");
                        unexpectedException = new CodedException(code2, codedException.getMessage(), codedException.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th3);
                    }
                    CoreLoggerKt.getLogger().error("❌ Error occurred when invoking 'onViewDidUpdateProps' on '" + view.getClass().getSimpleName() + "'", unexpectedException);
                    this.definition.handleException(view, unexpectedException);
                }
            }
        }
    }

    public final void setModuleHolder$expo_modules_core_release(ModuleHolder<?> moduleHolder) {
        s.k(moduleHolder, "<set-?>");
        this.moduleHolder = moduleHolder;
    }

    public final List<String> updateProperties(View view, ReadableMap propsMap) {
        CodedException unexpectedException;
        CodedException codedException;
        s.k(view, "view");
        s.k(propsMap, "propsMap");
        Map<String, AnyViewProp> props = getProps();
        ArrayList arrayList = new ArrayList();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = propsMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            AnyViewProp anyViewProp = props.get(strNextKey);
            if (anyViewProp != null) {
                try {
                    Dynamic dynamic = propsMap.getDynamic(strNextKey);
                    RuntimeContext runtimeContext = this.moduleHolder.getModule().get_runtimeContext();
                    anyViewProp.set(dynamic, view, runtimeContext != null ? runtimeContext.getAppContext() : null);
                } catch (Throwable th2) {
                    try {
                        if (!ErrorViewKt.isErrorView(view)) {
                            if (th2 instanceof CodedException) {
                                codedException = (CodedException) th2;
                            } else {
                                if (th2 instanceof expo.modules.core.errors.CodedException) {
                                    String code = ((expo.modules.core.errors.CodedException) th2).getCode();
                                    s.j(code, "getCode(...)");
                                    unexpectedException = new CodedException(code, ((expo.modules.core.errors.CodedException) th2).getMessage(), ((expo.modules.core.errors.CodedException) th2).getCause());
                                } else {
                                    unexpectedException = new UnexpectedException(th2);
                                }
                                codedException = unexpectedException;
                            }
                            CoreLoggerKt.getLogger().error("❌ Cannot set the '" + getName() + "' prop on the '" + view + "'", codedException);
                            this.definition.handleException(view, codedException);
                        }
                    } catch (Throwable th3) {
                        arrayList.add(strNextKey);
                        throw th3;
                    }
                }
                arrayList.add(strNextKey);
            }
        }
        return arrayList;
    }

    public /* synthetic */ ViewManagerWrapperDelegate(ModuleHolder moduleHolder, ViewManagerDefinition viewManagerDefinition, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(moduleHolder, viewManagerDefinition, (i11 & 4) != 0 ? null : str);
    }
}
