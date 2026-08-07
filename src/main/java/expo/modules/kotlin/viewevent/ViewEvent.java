package expo.modules.kotlin.viewevent;

import android.content.Context;
import android.view.View;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.core.logging.Logger;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.CoreLoggerKt;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.ReactExtensionsKt;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.types.JSTypeConverter;
import expo.modules.kotlin.types.JSTypeConverterHelperKt;
import expo.modules.kotlin.views.CallbacksDefinition;
import expo.modules.kotlin.views.ViewManagerDefinition;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R.\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lexpo/modules/kotlin/viewevent/ViewEvent;", "T", "Lexpo/modules/kotlin/viewevent/ViewEventCallback;", "", "name", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "Lexpo/modules/kotlin/viewevent/CoalescingKey;", "coalescingKey", "<init>", "(Ljava/lang/String;Landroid/view/View;Lwn0/l;)V", "arg", "Lcom/facebook/react/bridge/WritableMap;", "convertEventBody", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "Ljn0/h0;", "invoke", "(Ljava/lang/Object;)V", "Ljava/lang/String;", "Landroid/view/View;", "Lwn0/l;", "", "isValidated", "Z", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ViewEvent<T> implements ViewEventCallback<T> {
    private final l<T, Short> coalescingKey;
    private boolean isValidated;
    private final String name;
    private final View view;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewEvent(String name, View view, l<? super T, Short> lVar) {
        s.k(name, "name");
        s.k(view, "view");
        this.name = name;
        this.view = view;
        this.coalescingKey = lVar;
    }

    private final WritableMap convertEventBody(T arg) {
        Object objConvertToJSValue$default = JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, arg, null, false, 6, null);
        if ((objConvertToJSValue$default instanceof h0) || objConvertToJSValue$default == null) {
            return null;
        }
        if (objConvertToJSValue$default instanceof WritableMap) {
            return (WritableMap) objConvertToJSValue$default;
        }
        WritableMap writableMapCreateMap = JSTypeConverter.DefaultContainerProvider.INSTANCE.createMap();
        JSTypeConverterHelperKt.putGeneric(writableMapCreateMap, StatusResponse.PAYLOAD, objConvertToJSValue$default);
        return writableMapCreateMap;
    }

    @Override // expo.modules.kotlin.viewevent.ViewEventCallback
    public void invoke(T arg) {
        Context context = this.view.getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        NativeModulesProxy unimoduleProxy = ReactExtensionsKt.getUnimoduleProxy((ReactContext) context);
        if (unimoduleProxy == null) {
            return;
        }
        AppContext appContext = unimoduleProxy.getKotlinInteropModuleRegistry().getAppContext();
        if (!this.isValidated) {
            ModuleHolder<?> moduleHolder = appContext.getHostingRuntimeContext().getRegistry().getModuleHolder(this.view.getClass());
            if (moduleHolder == null) {
                Logger.warn$default(CoreLoggerKt.getLogger(), "⚠️ Cannot get module holder for " + this.view.getClass(), null, 2, null);
                return;
            }
            ViewManagerDefinition viewDefinition = appContext.getHostingRuntimeContext().getRegistry().getViewDefinition(moduleHolder, this.view.getClass());
            CallbacksDefinition callbacksDefinition = viewDefinition != null ? viewDefinition.getCallbacksDefinition() : null;
            if (callbacksDefinition == null) {
                Logger.warn$default(CoreLoggerKt.getLogger(), "⚠️ Cannot get callbacks for " + moduleHolder.getModule().getClass(), null, 2, null);
                return;
            }
            String[] names = callbacksDefinition.getNames();
            int length = names.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Logger.warn$default(CoreLoggerKt.getLogger(), "⚠️ Event " + this.name + " wasn't exported from " + moduleHolder.getModule().getClass(), null, 2, null);
                    return;
                }
                if (s.f(names[i11], this.name)) {
                    this.isValidated = true;
                    break;
                }
                i11++;
            }
        }
        EventEmitter callbackInvoker$expo_modules_core_release = appContext.getCallbackInvoker$expo_modules_core_release();
        if (callbackInvoker$expo_modules_core_release != null) {
            View view = this.view;
            String str = this.name;
            WritableMap writableMapConvertEventBody = convertEventBody(arg);
            l<T, Short> lVar = this.coalescingKey;
            callbackInvoker$expo_modules_core_release.emit(view, str, writableMapConvertEventBody, lVar != null ? lVar.invoke(arg) : null);
        }
    }
}
