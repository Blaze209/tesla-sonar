package expo.modules.sensors;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Bundle;
import co0.q;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
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
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.lang.ref.WeakReference;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u0014\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0004\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*$\b\u0000\u0010\u0016\"\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00102\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;", "Lexpo/modules/kotlin/modules/Module;", "module", "", "sensorType", "", "eventName", "Lkotlin/Function0;", "Ljn0/h0;", "listenerDecorator", "Lexpo/modules/sensors/SensorProxy;", "sensorProxyGetter", "UseSensorProxy", "(Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;Lexpo/modules/kotlin/modules/Module;ILjava/lang/String;Lwn0/a;Lwn0/a;)V", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lkotlin/Function1;", "Landroid/hardware/SensorEvent;", "Landroid/os/Bundle;", "eventMapper", "createSensorProxy", "(Lexpo/modules/kotlin/modules/Module;Ljava/lang/String;ILexpo/modules/kotlin/AppContext;Lwn0/l;)Lexpo/modules/sensors/SensorProxy;", "OnNewEvent", "expo-sensors_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SensorProxyKt {
    public static final void UseSensorProxy(ModuleDefinitionBuilder moduleDefinitionBuilder, final Module module, final int i11, String eventName, final wn0.a<h0> aVar, final wn0.a<SensorProxy> sensorProxyGetter) {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        s.k(moduleDefinitionBuilder, "<this>");
        s.k(module, "module");
        s.k(eventName, "eventName");
        s.k(sensorProxyGetter, "sensorProxyGetter");
        moduleDefinitionBuilder.Events(eventName);
        moduleDefinitionBuilder.OnStartObserving(new wn0.a() { // from class: expo.modules.sensors.b
            @Override // wn0.a
            public final Object invoke() {
                return SensorProxyKt.UseSensorProxy$lambda$0(aVar, sensorProxyGetter);
            }
        });
        moduleDefinitionBuilder.OnStopObserving(new wn0.a() { // from class: expo.modules.sensors.c
            @Override // wn0.a
            public final Object invoke() {
                return SensorProxyKt.UseSensorProxy$lambda$1(aVar, sensorProxyGetter);
            }
        });
        Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
        EventName eventName2 = EventName.ACTIVITY_ENTERS_FOREGROUND;
        eventListeners.put(eventName2, new BasicEventListener(eventName2, new wn0.a<h0>() { // from class: expo.modules.sensors.SensorProxyKt$UseSensorProxy$$inlined$OnActivityEntersForeground$1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((SensorProxy) sensorProxyGetter.invoke()).onHostResume();
            }
        }));
        Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
        EventName eventName3 = EventName.ACTIVITY_ENTERS_BACKGROUND;
        eventListeners2.put(eventName3, new BasicEventListener(eventName3, new wn0.a<h0>() { // from class: expo.modules.sensors.SensorProxyKt$UseSensorProxy$$inlined$OnActivityEntersBackground$1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((SensorProxy) sensorProxyGetter.invoke()).onHostPause();
            }
        }));
        Map<EventName, EventListener> eventListeners3 = moduleDefinitionBuilder.getEventListeners();
        EventName eventName4 = EventName.ACTIVITY_DESTROYS;
        eventListeners3.put(eventName4, new BasicEventListener(eventName4, new wn0.a<h0>() { // from class: expo.modules.sensors.SensorProxyKt$UseSensorProxy$$inlined$OnActivityDestroys$1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((SensorProxy) sensorProxyGetter.invoke()).onHostDestroy();
            }
        }));
        Map<EventName, EventListener> eventListeners4 = moduleDefinitionBuilder.getEventListeners();
        EventName eventName5 = EventName.MODULE_DESTROY;
        eventListeners4.put(eventName5, new BasicEventListener(eventName5, new wn0.a<h0>() { // from class: expo.modules.sensors.SensorProxyKt$UseSensorProxy$$inlined$OnDestroy$1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((SensorProxy) sensorProxyGetter.invoke()).onHostDestroy();
            }
        }));
        boolean zF = s.f(Integer.class, Promise.class);
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Boolean.TYPE;
        Class cls4 = Integer.TYPE;
        if (zF) {
            asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("setUpdateInterval", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.sensors.SensorProxyKt$UseSensorProxy$$inlined$AsyncFunction$1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<unused var>");
                    s.k(promise, "promise");
                    ((SensorProxy) sensorProxyGetter.invoke()).setUpdateInterval(((Integer) promise).intValue());
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            });
        } else {
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Integer.class), Boolean.FALSE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(Integer.class), false, new wn0.a<q>() { // from class: expo.modules.sensors.SensorProxyKt$UseSensorProxy$$inlined$AsyncFunction$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Integer.TYPE);
                    }
                }), converters);
            }
            AnyType[] anyTypeArr = {anyType};
            l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.sensors.SensorProxyKt$UseSensorProxy$$inlined$AsyncFunction$3
                @Override // wn0.l
                public final h0 invoke(Object[] objArr) {
                    s.k(objArr, "<destruct>");
                    ((SensorProxy) sensorProxyGetter.invoke()).setUpdateInterval(((Number) objArr[0]).intValue());
                    return h0.f84049a;
                }
            };
            if (s.f(h0.class, cls4)) {
                stringAsyncFunctionComponent = new IntAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
            } else if (s.f(h0.class, cls3)) {
                stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
            } else if (s.f(h0.class, cls2)) {
                stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
            } else if (s.f(h0.class, cls)) {
                stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
            } else {
                stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
            }
            asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
        }
        moduleDefinitionBuilder.getAsyncFunctions().put("setUpdateInterval", asyncFunctionWithPromiseComponent);
        AnyType[] anyTypeArr2 = new AnyType[0];
        l<Object[], Boolean> lVar2 = new l<Object[], Boolean>() { // from class: expo.modules.sensors.SensorProxyKt$UseSensorProxy$$inlined$AsyncFunction$4
            @Override // wn0.l
            public final Boolean invoke(Object[] it) {
                s.k(it, "it");
                Context reactContext = module.getAppContext().getReactContext();
                Object systemService = reactContext != null ? reactContext.getSystemService("sensor") : null;
                SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                return Boolean.valueOf((sensorManager != null ? sensorManager.getDefaultSensor(i11) : null) != null);
            }
        };
        if (s.f(Boolean.class, cls4)) {
            stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("isAvailableAsync", anyTypeArr2, lVar2);
        } else if (s.f(Boolean.class, cls3)) {
            stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("isAvailableAsync", anyTypeArr2, lVar2);
        } else if (s.f(Boolean.class, cls2)) {
            stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("isAvailableAsync", anyTypeArr2, lVar2);
        } else if (s.f(Boolean.class, cls)) {
            stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("isAvailableAsync", anyTypeArr2, lVar2);
        } else {
            stringAsyncFunctionComponent2 = s.f(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isAvailableAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("isAvailableAsync", anyTypeArr2, lVar2);
        }
        moduleDefinitionBuilder.getAsyncFunctions().put("isAvailableAsync", stringAsyncFunctionComponent2);
    }

    public static /* synthetic */ void UseSensorProxy$default(ModuleDefinitionBuilder moduleDefinitionBuilder, Module module, int i11, String str, wn0.a aVar, wn0.a aVar2, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            aVar = null;
        }
        UseSensorProxy(moduleDefinitionBuilder, module, i11, str, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 UseSensorProxy$lambda$0(wn0.a aVar, wn0.a aVar2) {
        if (aVar != null) {
            aVar.invoke();
        }
        ((SensorProxy) aVar2.invoke()).startObserving();
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 UseSensorProxy$lambda$1(wn0.a aVar, wn0.a aVar2) {
        if (aVar != null) {
            aVar.invoke();
        }
        ((SensorProxy) aVar2.invoke()).stopObserving();
        return h0.f84049a;
    }

    public static final SensorProxy createSensorProxy(Module module, final String eventName, int i11, AppContext appContext, final l<? super SensorEvent, Bundle> eventMapper) {
        s.k(module, "<this>");
        s.k(eventName, "eventName");
        s.k(appContext, "appContext");
        s.k(eventMapper, "eventMapper");
        final WeakReference weakReference = new WeakReference(module);
        return new SensorProxy(i11, appContext, new l<SensorEvent, h0>() { // from class: expo.modules.sensors.SensorProxyKt$createSensorProxy$onNewEvent$1
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(SensorEvent sensorEvent) {
                invoke2(sensorEvent);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SensorEvent sensorEvent) {
                s.k(sensorEvent, "sensorEvent");
                Module module2 = weakReference.get();
                if (module2 != null) {
                    module2.sendEvent(eventName, eventMapper.invoke(sensorEvent));
                }
            }
        });
    }
}
