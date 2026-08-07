package expo.modules.kotlin;

import co0.f;
import co0.q;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.classcomponent.ClassDefinitionData;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithPayload;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.MethodNotFoundException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JavaScriptModuleObject_;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilderKt;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.ConstantComponent;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.objects.PropertyComponent;
import expo.modules.kotlin.views.ViewManagerDefinition;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import jn0.h0;
import jn0.m;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\r2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001d\u001a\u00020\u000f\"\u0004\b\u0001\u0010\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00028\u0001¢\u0006\u0004\b\u001d\u0010!J1\u0010\u001d\u001a\u00020\u000f\"\u0004\b\u0001\u0010\"\"\u0004\b\u0002\u0010\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010#\u001a\u00028\u00012\u0006\u0010 \u001a\u00028\u0002¢\u0006\u0004\b\u001d\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\n\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00106\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010:\u001a\u0004\u0018\u0001018F¢\u0006\u0006\u001a\u0004\b9\u00105¨\u0006;"}, d2 = {"Lexpo/modules/kotlin/ModuleHolder;", "Lexpo/modules/kotlin/modules/Module;", "T", "", "module", "<init>", "(Lexpo/modules/kotlin/modules/Module;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "definition", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "moduleDecorator", "", "name", "Ljn0/h0;", "attachPrimitives", "(Lexpo/modules/kotlin/AppContext;Lexpo/modules/kotlin/objects/ObjectDefinitionData;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;Ljava/lang/String;)V", "methodName", "", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "call", "(Ljava/lang/String;[Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V", "callSync", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "post", "(Lexpo/modules/kotlin/events/EventName;)V", "Payload", StatusResponse.PAYLOAD, "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;)V", "Sender", "sender", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)V", "registerContracts", "()V", "Lexpo/modules/kotlin/modules/Module;", "getModule", "()Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getDefinition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "", "wasInitialized", "Z", "Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "jsObject$delegate", "Lkotlin/Lazy;", "getJsObject", "()Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "jsObject", "getName", "()Ljava/lang/String;", "getSafeJSObject", "safeJSObject", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ModuleHolder<T extends Module> {
    private final ModuleDefinitionData definition;

    /* JADX INFO: renamed from: jsObject$delegate, reason: from kotlin metadata */
    private final Lazy jsObject;
    private final T module;
    private boolean wasInitialized;

    public ModuleHolder(T module) {
        s.k(module, "module");
        this.module = module;
        this.definition = module.definition();
        this.jsObject = m.b(new wn0.a() { // from class: expo.modules.kotlin.d
            @Override // wn0.a
            public final Object invoke() {
                return ModuleHolder.jsObject_delegate$lambda$4(this.f63353a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachPrimitives(AppContext appContext, ObjectDefinitionData definition, JSDecoratorsBridgingObject moduleDecorator, String name) {
        eb.a.c("[ExpoModulesCore] Exporting constants");
        try {
            WritableNativeMap writableNativeMapMakeNativeMap = Arguments.makeNativeMap(definition.getLegacyConstantsProvider().invoke());
            s.h(writableNativeMapMakeNativeMap);
            moduleDecorator.registerConstants(writableNativeMapMakeNativeMap);
            Iterator<Map.Entry<String, ConstantComponent>> it = definition.getConstants().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().attachToJSObject(moduleDecorator);
            }
            h0 h0Var = h0.f84049a;
            eb.a.f();
            eb.a.c("[ExpoModulesCore] Attaching functions");
            try {
                ConcatIterator<AnyFunction> functions = definition.getFunctions();
                while (functions.hasNext()) {
                    functions.next().attachToJSObject(appContext, moduleDecorator, name);
                }
                h0 h0Var2 = h0.f84049a;
                eb.a.f();
                eb.a.c("[ExpoModulesCore] Attaching properties");
                try {
                    Iterator<Map.Entry<String, PropertyComponent>> it2 = definition.getProperties().entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next().getValue().attachToJSObject(appContext, moduleDecorator);
                    }
                    h0 h0Var3 = h0.f84049a;
                } finally {
                    eb.a.f();
                }
            } catch (Throwable th2) {
                eb.a.f();
                throw th2;
            }
        } catch (Throwable th3) {
            eb.a.f();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaScriptModuleObject_ jsObject_delegate$lambda$4(final ModuleHolder moduleHolder) {
        moduleHolder.wasInitialized = true;
        eb.a.c("[ExpoModulesCore] " + (moduleHolder.getName() + ".jsObject"));
        try {
            final AppContext appContext = moduleHolder.getModule().getAppContext();
            final JNIDeallocator jniDeallocator = moduleHolder.getModule().getRuntimeContext().getJniDeallocator();
            JSDecoratorsBridgingObject jSDecoratorsBridgingObject = new JSDecoratorsBridgingObject(jniDeallocator);
            moduleHolder.attachPrimitives(appContext, moduleHolder.getDefinition().getObjectDefinition(), jSDecoratorsBridgingObject, moduleHolder.getName());
            jSDecoratorsBridgingObject.registerProperty("__expo_module_name__", false, new ExpectedType[0], new JNIFunctionBody(moduleHolder) { // from class: expo.modules.kotlin.ModuleHolder$jsObject$2$1$1
                final /* synthetic */ ModuleHolder<T> this$0;

                {
                    this.this$0 = moduleHolder;
                }

                @Override // expo.modules.kotlin.jni.JNIFunctionBody
                public final Object invoke(Object[] it) {
                    s.k(it, "it");
                    return this.this$0.getName();
                }
            }, false, new ExpectedType[0], null);
            final JSDecoratorsBridgingObject jSDecoratorsBridgingObject2 = new JSDecoratorsBridgingObject(jniDeallocator);
            Map<String, ViewManagerDefinition> viewManagerDefinitions = moduleHolder.getDefinition().getViewManagerDefinitions();
            final p<String, ViewManagerDefinition, h0> pVar = new p<String, ViewManagerDefinition, h0>() { // from class: expo.modules.kotlin.ModuleHolder$jsObject$2$1$2
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(String str, ViewManagerDefinition viewManagerDefinition) {
                    invoke2(str, viewManagerDefinition);
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String key, ViewManagerDefinition definition) {
                    String name;
                    s.k(key, "key");
                    s.k(definition, "definition");
                    List<BaseAsyncFunctionComponent> asyncFunctions = definition.getAsyncFunctions();
                    if (asyncFunctions.isEmpty()) {
                        return;
                    }
                    JNIDeallocator jNIDeallocator = jniDeallocator;
                    JSDecoratorsBridgingObject jSDecoratorsBridgingObject3 = jSDecoratorsBridgingObject2;
                    ModuleHolder<T> moduleHolder2 = moduleHolder;
                    AppContext appContext2 = appContext;
                    eb.a.c("[ExpoModulesCore] Attaching view prototype");
                    try {
                        JSDecoratorsBridgingObject jSDecoratorsBridgingObject4 = new JSDecoratorsBridgingObject(jNIDeallocator);
                        Iterator<T> it = asyncFunctions.iterator();
                        while (it.hasNext()) {
                            ((BaseAsyncFunctionComponent) it.next()).attachToJSObject(appContext2, jSDecoratorsBridgingObject4, moduleHolder2.getName());
                        }
                        if (key.hashCode() == 764185466 && key.equals(ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW)) {
                            name = moduleHolder2.getName();
                        } else {
                            name = moduleHolder2.getName() + "_" + definition.getName();
                        }
                        jSDecoratorsBridgingObject3.registerObject(name, jSDecoratorsBridgingObject4);
                        h0 h0Var = h0.f84049a;
                    } finally {
                        eb.a.f();
                    }
                }
            };
            viewManagerDefinitions.forEach(new BiConsumer(pVar) { // from class: expo.modules.kotlin.ModuleHolder$sam$java_util_function_BiConsumer$0
                private final /* synthetic */ p function;

                {
                    s.k(pVar, "function");
                    this.function = pVar;
                }

                @Override // java.util.function.BiConsumer
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    this.function.invoke(obj, obj2);
                }
            });
            jSDecoratorsBridgingObject.registerObject("ViewPrototypes", jSDecoratorsBridgingObject2);
            eb.a.c("[ExpoModulesCore] Attaching classes");
            try {
                for (ClassDefinitionData classDefinitionData : moduleHolder.getDefinition().getClassData()) {
                    JSDecoratorsBridgingObject jSDecoratorsBridgingObject3 = new JSDecoratorsBridgingObject(jniDeallocator);
                    moduleHolder.attachPrimitives(appContext, classDefinitionData.getObjectDefinition(), jSDecoratorsBridgingObject3, classDefinitionData.getName());
                    SyncFunctionComponent constructor = classDefinitionData.getConstructor();
                    q ownerType = constructor.getOwnerType();
                    Class<?> clsB = null;
                    f classifier = ownerType != null ? ownerType.getClassifier() : null;
                    co0.d dVar = classifier instanceof co0.d ? (co0.d) classifier : null;
                    if (dVar != null) {
                        clsB = vn0.a.b(dVar);
                    }
                    jSDecoratorsBridgingObject.registerClass(classDefinitionData.getName(), jSDecoratorsBridgingObject3, constructor.getTakesOwner$expo_modules_core_release(), clsB, classDefinitionData.getIsSharedRef(), (ExpectedType[]) constructor.getCppRequiredTypes$expo_modules_core_release().toArray(new ExpectedType[0]), constructor.getJNIFunctionBody$expo_modules_core_release(classDefinitionData.getName(), appContext));
                }
                h0 h0Var = h0.f84049a;
                eb.a.f();
                JavaScriptModuleObject_ javaScriptModuleObject_ = new JavaScriptModuleObject_(jniDeallocator, moduleHolder.getName());
                javaScriptModuleObject_.decorate(jSDecoratorsBridgingObject);
                return javaScriptModuleObject_;
            } finally {
                eb.a.f();
            }
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public final void call(String methodName, Object[] args, Promise promise) throws FunctionCallException {
        CodedException unexpectedException;
        s.k(methodName, "methodName");
        s.k(args, "args");
        s.k(promise, "promise");
        try {
            BaseAsyncFunctionComponent baseAsyncFunctionComponent = this.definition.getAsyncFunctions().get(methodName);
            if (baseAsyncFunctionComponent == null) {
                throw new MethodNotFoundException();
            }
            if (baseAsyncFunctionComponent instanceof AsyncFunctionComponent) {
                ((AsyncFunctionComponent) baseAsyncFunctionComponent).callUserImplementation$expo_modules_core_release(args, promise, this.module.getAppContext());
                h0 h0Var = h0.f84049a;
            } else {
                throw new IllegalStateException("Cannot call a " + baseAsyncFunctionComponent + " method in test context");
            }
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                unexpectedException = (CodedException) th2;
            } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th2;
                String code = codedException.getCode();
                s.j(code, "getCode(...)");
                unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th2);
            }
            throw new FunctionCallException(methodName, this.definition.getName(), unexpectedException);
        }
    }

    public final Object callSync(String methodName, Object[] args) throws MethodNotFoundException {
        s.k(methodName, "methodName");
        s.k(args, "args");
        SyncFunctionComponent syncFunctionComponent = this.definition.getSyncFunctions().get(methodName);
        if (syncFunctionComponent != null) {
            return SyncFunctionComponent.callUserImplementation$default(syncFunctionComponent, args, null, 2, null);
        }
        throw new MethodNotFoundException();
    }

    public final ModuleDefinitionData getDefinition() {
        return this.definition;
    }

    public final JavaScriptModuleObject_ getJsObject() {
        return (JavaScriptModuleObject_) this.jsObject.getValue();
    }

    public final T getModule() {
        return this.module;
    }

    public final String getName() {
        return this.definition.getName();
    }

    public final JavaScriptModuleObject_ getSafeJSObject() {
        if (this.wasInitialized) {
            return getJsObject();
        }
        return null;
    }

    public final void post(EventName eventName) {
        s.k(eventName, "eventName");
        EventListener eventListener = this.definition.getEventListeners().get(eventName);
        if (eventListener == null) {
            return;
        }
        BasicEventListener basicEventListener = eventListener instanceof BasicEventListener ? (BasicEventListener) eventListener : null;
        if (basicEventListener != null) {
            basicEventListener.call();
        }
    }

    public final void registerContracts() {
        p<AppContextActivityResultCaller, Continuation<? super h0>, Object> registerContracts = this.definition.getRegisterContracts();
        if (registerContracts != null) {
            BuildersKt__Builders_commonKt.launch$default(this.module.getAppContext().getMainQueue(), null, null, new ModuleHolder$registerContracts$1$1(registerContracts, this, null), 3, null);
        }
    }

    public final <Payload> void post(EventName eventName, Payload payload) {
        s.k(eventName, "eventName");
        EventListener eventListener = this.definition.getEventListeners().get(eventName);
        if (eventListener == null) {
            return;
        }
        EventListenerWithPayload eventListenerWithPayload = eventListener instanceof EventListenerWithPayload ? (EventListenerWithPayload) eventListener : null;
        if (eventListenerWithPayload != null) {
            eventListenerWithPayload.call(payload);
        }
    }

    public final <Sender, Payload> void post(EventName eventName, Sender sender, Payload payload) {
        s.k(eventName, "eventName");
        EventListener eventListener = this.definition.getEventListeners().get(eventName);
        if (eventListener == null) {
            return;
        }
        EventListenerWithSenderAndPayload eventListenerWithSenderAndPayload = eventListener instanceof EventListenerWithSenderAndPayload ? (EventListenerWithSenderAndPayload) eventListener : null;
        if (eventListenerWithSenderAndPayload != null) {
            eventListenerWithSenderAndPayload.call(sender, payload);
        }
    }
}
