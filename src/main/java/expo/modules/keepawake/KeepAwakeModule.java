package expo.modules.keepawake;

import co0.d;
import co0.q;
import expo.modules.core.errors.CurrentActivityNotFoundException;
import expo.modules.core.interfaces.services.KeepAwakeManager;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/keepawake/KeepAwakeModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "keepAwakeManager", "Lexpo/modules/core/interfaces/services/KeepAwakeManager;", "getKeepAwakeManager", "()Lexpo/modules/core/interfaces/services/KeepAwakeManager;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-keep-awake_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeepAwakeModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final KeepAwakeManager getKeepAwakeManager() throws MissingModuleException {
        Object module;
        try {
            module = getAppContext().getLegacyModuleRegistry().getModule(KeepAwakeManager.class);
        } catch (Exception unused) {
            module = null;
        }
        KeepAwakeManager keepAwakeManager = (KeepAwakeManager) module;
        if (keepAwakeManager != null) {
            return keepAwakeManager;
        }
        throw new MissingModuleException("KeepAwakeManager");
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoKeepAwake");
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = o0.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$3$$inlined$AsyncFunctionWithPromise$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("activate", new AsyncFunctionWithPromiseComponent("activate", new AnyType[]{anyType}, new p<Object[], Promise, h0>() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$3$$inlined$AsyncFunctionWithPromise$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    try {
                        this.this$0.getKeepAwakeManager().activate((String) objArr[0], new Runnable() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$1$1$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                promise.resolve();
                            }
                        });
                    } catch (CurrentActivityNotFoundException unused) {
                        promise.reject(new ActivateKeepAwakeException());
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$3$$inlined$AsyncFunctionWithPromise$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("deactivate", new AsyncFunctionWithPromiseComponent("deactivate", new AnyType[]{anyType2}, new p<Object[], Promise, h0>() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$3$$inlined$AsyncFunctionWithPromise$4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, final Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    try {
                        this.this$0.getKeepAwakeManager().deactivate((String) objArr[0], new Runnable() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$1$2$1
                            @Override // java.lang.Runnable
                            public final void run() {
                                promise.resolve();
                            }
                        });
                    } catch (Exception unused) {
                        promise.resolve();
                    }
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            AnyType[] anyTypeArr = new AnyType[0];
            l<Object[], Boolean> lVar = new l<Object[], Boolean>() { // from class: expo.modules.keepawake.KeepAwakeModule$definition$lambda$3$$inlined$AsyncFunction$1
                @Override // wn0.l
                public final Boolean invoke(Object[] it) {
                    s.k(it, "it");
                    return Boolean.valueOf(this.this$0.getKeepAwakeManager().isActivated());
                }
            };
            if (s.f(Boolean.class, Integer.TYPE)) {
                stringAsyncFunctionComponent = new IntAsyncFunctionComponent("isActivated", anyTypeArr, lVar);
            } else if (s.f(Boolean.class, Boolean.TYPE)) {
                stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("isActivated", anyTypeArr, lVar);
            } else if (s.f(Boolean.class, Double.TYPE)) {
                stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("isActivated", anyTypeArr, lVar);
            } else if (s.f(Boolean.class, Float.TYPE)) {
                stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("isActivated", anyTypeArr, lVar);
            } else {
                stringAsyncFunctionComponent = s.f(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isActivated", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("isActivated", anyTypeArr, lVar);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("isActivated", stringAsyncFunctionComponent);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
