package expo.modules.kotlin.defaultmodules;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import co0.d;
import co0.q;
import com.facebook.react.z;
import eb.a;
import expo.modules.BuildConfig;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.KModuleEventEmitterWrapperKt;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionBuilderKt;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilder;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.uuidv5.InvalidNamespaceException;
import expo.modules.kotlin.uuidv5.Uuidv5Kt;
import expo.modules.kotlin.views.CallbacksDefinition;
import expo.modules.kotlin.views.ViewManagerDefinition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/defaultmodules/CoreModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoreModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.AppContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.AppContextLost();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder("expoModulesCoreVersion");
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Map.class));
            if (returnType == null) {
                returnType = new ReturnType(o0.b(Map.class));
                returnTypeProvider.getTypes().put(o0.b(Map.class), returnType);
            }
            propertyComponentBuilder.setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$Property$1
                @Override // wn0.l
                public final Object invoke(Object[] it) {
                    s.k(it, "it");
                    List listF1 = t.f1((CharSequence) t.f1(BuildConfig.EXPO_MODULES_CORE_VERSION, new String[]{"-"}, false, 0, 6, null).get(0), new String[]{"."}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList(v.y(listF1, 10));
                    Iterator it2 = listF1.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                    }
                    return v0.m(x.a("version", BuildConfig.EXPO_MODULES_CORE_VERSION), x.a("major", Integer.valueOf(((Number) arrayList.get(0)).intValue())), x.a("minor", Integer.valueOf(((Number) arrayList.get(1)).intValue())), x.a("patch", Integer.valueOf(((Number) arrayList.get(2)).intValue())));
                }
            }));
            moduleDefinitionBuilder.getProperties().put("expoModulesCoreVersion", propertyComponentBuilder);
            PropertyComponentBuilder propertyComponentBuilder2 = new PropertyComponentBuilder("cacheDir");
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnType returnType2 = returnTypeProvider.getTypes().get(o0.b(String.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(o0.b(String.class));
                returnTypeProvider.getTypes().put(o0.b(String.class), returnType2);
            }
            propertyComponentBuilder2.setGetter(new SyncFunctionComponent("get", anyTypeArr2, returnType2, new l<Object[], Object>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$Property$2
                @Override // wn0.l
                public final Object invoke(Object[] it) {
                    s.k(it, "it");
                    return Uri.fromFile(this.this$0.getContext().getCacheDir()) + "/";
                }
            }));
            moduleDefinitionBuilder.getProperties().put("cacheDir", propertyComponentBuilder2);
            PropertyComponentBuilder propertyComponentBuilder3 = new PropertyComponentBuilder("documentsDir");
            AnyType[] anyTypeArr3 = new AnyType[0];
            ReturnType returnType3 = returnTypeProvider.getTypes().get(o0.b(String.class));
            if (returnType3 == null) {
                returnType3 = new ReturnType(o0.b(String.class));
                returnTypeProvider.getTypes().put(o0.b(String.class), returnType3);
            }
            propertyComponentBuilder3.setGetter(new SyncFunctionComponent("get", anyTypeArr3, returnType3, new l<Object[], Object>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$Property$3
                @Override // wn0.l
                public final Object invoke(Object[] it) {
                    s.k(it, "it");
                    return Uri.fromFile(this.this$0.getContext().getFilesDir()) + "/";
                }
            }));
            moduleDefinitionBuilder.getProperties().put("documentsDir", propertyComponentBuilder3);
            AnyType[] anyTypeArr4 = new AnyType[0];
            ReturnType returnType4 = returnTypeProvider.getTypes().get(o0.b(Object.class));
            if (returnType4 == null) {
                returnType4 = new ReturnType(o0.b(Object.class));
                returnTypeProvider.getTypes().put(o0.b(Object.class), returnType4);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("uuidv4", new SyncFunctionComponent("uuidv4", anyTypeArr4, returnType4, new l<Object[], Object>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$FunctionWithoutArgs$1
                @Override // wn0.l
                public final Object invoke(Object[] it) {
                    s.k(it, "it");
                    return UUID.randomUUID().toString();
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$Function$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$Function$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            AnyType[] anyTypeArr5 = {anyType, anyType2};
            ReturnType returnType5 = returnTypeProvider.getTypes().get(o0.b(String.class));
            if (returnType5 == null) {
                returnType5 = new ReturnType(o0.b(String.class));
                returnTypeProvider.getTypes().put(o0.b(String.class), returnType5);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("uuidv5", new SyncFunctionComponent("uuidv5", anyTypeArr5, returnType5, new l<Object[], Object>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$Function$3
                @Override // wn0.l
                public final Object invoke(Object[] objArr) throws InvalidNamespaceException {
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    String str2 = (String) obj;
                    try {
                        UUID uuidFromString = UUID.fromString(str);
                        s.h(uuidFromString);
                        return Uuidv5Kt.uuidv5(uuidFromString, str2).toString();
                    } catch (IllegalArgumentException unused) {
                        throw new InvalidNamespaceException(str);
                    }
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$Function$4
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters2);
            }
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), Boolean.TRUE));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$Function$5
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters2);
            }
            AnyType[] anyTypeArr6 = {anyType3, anyType4};
            ReturnType returnType6 = returnTypeProvider.getTypes().get(o0.b(Map.class));
            if (returnType6 == null) {
                returnType6 = new ReturnType(o0.b(Map.class));
                returnTypeProvider.getTypes().put(o0.b(Map.class), returnType6);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getViewConfig", new SyncFunctionComponent("getViewConfig", anyTypeArr6, returnType6, new l<Object[], Object>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$Function$6
                @Override // wn0.l
                public final Object invoke(Object[] objArr) {
                    String[] names;
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String str = (String) objArr[1];
                    ModuleHolder<?> moduleHolder = this.this$0.getRuntimeContext().getRegistry().getModuleHolder((String) obj);
                    LinkedHashMap linkedHashMap = null;
                    if (moduleHolder == null) {
                        return null;
                    }
                    Map<String, ViewManagerDefinition> viewManagerDefinitions = moduleHolder.getDefinition().getViewManagerDefinitions();
                    if (str == null) {
                        str = ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW;
                    }
                    ViewManagerDefinition viewManagerDefinition = viewManagerDefinitions.get(str);
                    if (viewManagerDefinition == null) {
                        return null;
                    }
                    Set<String> setKeySet = viewManagerDefinition.getProps$expo_modules_core_release().keySet();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(n.f(v0.e(v.y(setKeySet, 10)), 16));
                    for (Object obj2 : setKeySet) {
                        linkedHashMap2.put(obj2, Boolean.TRUE);
                    }
                    CallbacksDefinition callbacksDefinition = viewManagerDefinition.getCallbacksDefinition();
                    if (callbacksDefinition != null && (names = callbacksDefinition.getNames()) != null) {
                        linkedHashMap = new LinkedHashMap(n.f(v0.e(names.length), 16));
                        for (String str2 : names) {
                            Pair pairA = x.a(KModuleEventEmitterWrapperKt.normalizeEventName(str2), v0.f(x.a("registrationName", str2)));
                            linkedHashMap.put(pairA.e(), pairA.f());
                        }
                    }
                    return v0.m(x.a("validAttributes", linkedHashMap2), x.a("directEventTypes", linkedHashMap));
                }
            }));
            if (s.f(String.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("reloadAppAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws Exceptions.MissingActivity {
                        z zVarP;
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        Activity throwingActivity = this.this$0.getAppContext().getThrowingActivity();
                        com.facebook.react.s sVar = throwingActivity instanceof com.facebook.react.s ? (com.facebook.react.s) throwingActivity : null;
                        if (sVar == null || (zVarP = sVar.p()) == null) {
                            return;
                        }
                        zVarP.reload();
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws Exceptions.MissingActivity {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
                if (anyType5 == null) {
                    anyType5 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(String.class);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr7 = {anyType5};
                l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.kotlin.defaultmodules.CoreModule$definition$lambda$12$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) throws Exceptions.MissingActivity {
                        z zVarP;
                        s.k(objArr, "<destruct>");
                        Activity throwingActivity = this.this$0.getAppContext().getThrowingActivity();
                        com.facebook.react.s sVar = throwingActivity instanceof com.facebook.react.s ? (com.facebook.react.s) throwingActivity : null;
                        if (sVar != null && (zVarP = sVar.p()) != null) {
                            zVarP.reload();
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, Integer.TYPE)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, lVar);
                } else if (s.f(h0.class, Boolean.TYPE)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, lVar);
                } else if (s.f(h0.class, Double.TYPE)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, lVar);
                } else if (s.f(h0.class, Float.TYPE)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, lVar) : new UntypedAsyncFunctionComponent("reloadAppAsync", anyTypeArr7, lVar);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("reloadAppAsync", asyncFunctionWithPromiseComponent);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            a.f();
        }
    }
}
