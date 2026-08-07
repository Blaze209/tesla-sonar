package expo.modules.sensors.modules;

import android.hardware.SensorEvent;
import android.os.Build;
import android.os.Bundle;
import co0.q;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.AppContext;
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
import expo.modules.sensors.SensorProxy;
import expo.modules.sensors.SensorProxyKt;
import java.lang.ref.WeakReference;
import jn0.h0;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lexpo/modules/sensors/modules/PedometerModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "stepsAtTheBeginning", "", "Ljava/lang/Integer;", "sensorProxy", "Lexpo/modules/sensors/SensorProxy;", "getSensorProxy", "()Lexpo/modules/sensors/SensorProxy;", "sensorProxy$delegate", "Lkotlin/Lazy;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-sensors_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PedometerModule extends Module {

    /* JADX INFO: renamed from: sensorProxy$delegate, reason: from kotlin metadata */
    private final Lazy sensorProxy = m.b(new wn0.a() { // from class: expo.modules.sensors.modules.i
        @Override // wn0.a
        public final Object invoke() {
            return PedometerModule.sensorProxy_delegate$lambda$2(this.f63431a);
        }
    });
    private Integer stepsAtTheBeginning;

    /* JADX INFO: Access modifiers changed from: private */
    public final SensorProxy getSensorProxy() {
        return (SensorProxy) this.sensorProxy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SensorProxy sensorProxy_delegate$lambda$2(final PedometerModule pedometerModule) {
        AppContext appContext = pedometerModule.getAppContext();
        final WeakReference weakReference = new WeakReference(pedometerModule);
        final String str = "Exponent.pedometerUpdate";
        return new SensorProxy(19, appContext, new l<SensorEvent, h0>() { // from class: expo.modules.sensors.modules.PedometerModule$sensorProxy_delegate$lambda$2$$inlined$createSensorProxy$1
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(SensorEvent sensorEvent) {
                invoke2(sensorEvent);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SensorEvent sensorEvent) {
                s.k(sensorEvent, "sensorEvent");
                Module module = (Module) weakReference.get();
                if (module != null) {
                    String str2 = str;
                    if (pedometerModule.stepsAtTheBeginning == null) {
                        pedometerModule.stepsAtTheBeginning = Integer.valueOf(((int) sensorEvent.values[0]) - 1);
                    }
                    Bundle bundle = new Bundle();
                    float f11 = sensorEvent.values[0];
                    Integer num = pedometerModule.stepsAtTheBeginning;
                    bundle.putDouble("steps", f11 - (num != null ? num.intValue() : ((int) sensorEvent.values[0]) - 1));
                    module.sendEvent(str2, bundle);
                }
            }
        });
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent2;
        AsyncFunctionComponent stringAsyncFunctionComponent3;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExponentPedometer");
            SensorProxyKt.UseSensorProxy(moduleDefinitionBuilder, this, 19, "Exponent.pedometerUpdate", new wn0.a<h0>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$1$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.stepsAtTheBeginning = null;
                }
            }, new wn0.a<SensorProxy>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$1$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final SensorProxy invoke() {
                    return this.this$0.getSensorProxy();
                }
            });
            boolean zF = s.f(Promise.class, Promise.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zF) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$lambda$6$$inlined$AsyncFunction$1
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        if (Build.VERSION.SDK_INT >= 29) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.ACTIVITY_RECOGNITION");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, new String[0]);
                        }
                    }
                });
                moduleDefinitionBuilder = moduleDefinitionBuilder;
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$lambda$6$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$lambda$6$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (Build.VERSION.SDK_INT >= 29) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.ACTIVITY_RECOGNITION");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, new String[0]);
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getPermissionsAsync", asyncFunctionWithPromiseComponent);
            if (s.f(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$lambda$6$$inlined$AsyncFunction$4
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        if (Build.VERSION.SDK_INT >= 29) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.ACTIVITY_RECOGNITION");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, new String[0]);
                        }
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Promise.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$lambda$6$$inlined$AsyncFunction$5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                l<Object[], h0> lVar2 = new l<Object[], h0>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$lambda$6$$inlined$AsyncFunction$6
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (Build.VERSION.SDK_INT >= 29) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.ACTIVITY_RECOGNITION");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, new String[0]);
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                } else {
                    stringAsyncFunctionComponent2 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                }
                asyncFunctionWithPromiseComponent2 = stringAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestPermissionsAsync", asyncFunctionWithPromiseComponent2);
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            co0.d dVarB = o0.b(Integer.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(Integer.class), false, new wn0.a<q>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$lambda$6$$inlined$AsyncFunction$7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Integer.TYPE);
                    }
                }), converters3);
            }
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(Integer.class), bool));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(o0.b(Integer.class), false, new wn0.a<q>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$lambda$6$$inlined$AsyncFunction$8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(Integer.TYPE);
                    }
                }), converters3);
            }
            AnyType[] anyTypeArr3 = {anyType3, anyType4};
            l<Object[], h0> lVar3 = new l<Object[], h0>() { // from class: expo.modules.sensors.modules.PedometerModule$definition$lambda$6$$inlined$AsyncFunction$9
                @Override // wn0.l
                public final h0 invoke(Object[] objArr) throws NotSupportedException {
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    ((Number) objArr[1]).intValue();
                    ((Number) obj).intValue();
                    throw new NotSupportedException("Getting step count for date range is not supported on Android yet");
                }
            };
            if (s.f(h0.class, cls4)) {
                stringAsyncFunctionComponent3 = new IntAsyncFunctionComponent("getStepCountAsync", anyTypeArr3, lVar3);
            } else if (s.f(h0.class, cls3)) {
                stringAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("getStepCountAsync", anyTypeArr3, lVar3);
            } else if (s.f(h0.class, cls2)) {
                stringAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("getStepCountAsync", anyTypeArr3, lVar3);
            } else if (s.f(h0.class, cls)) {
                stringAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("getStepCountAsync", anyTypeArr3, lVar3);
            } else {
                stringAsyncFunctionComponent3 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("getStepCountAsync", anyTypeArr3, lVar3) : new UntypedAsyncFunctionComponent("getStepCountAsync", anyTypeArr3, lVar3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getStepCountAsync", stringAsyncFunctionComponent3);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
