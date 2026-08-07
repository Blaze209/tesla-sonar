package expo.modules.haptics;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import co0.q;
import expo.modules.haptics.arguments.HapticsImpactType;
import expo.modules.haptics.arguments.HapticsNotificationType;
import expo.modules.haptics.arguments.HapticsSelectionTypeKt;
import expo.modules.haptics.arguments.HapticsVibrationType;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.Exceptions;
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
import io.a;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lexpo/modules/haptics/HapticsModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/haptics/arguments/HapticsVibrationType;", "type", "Ljn0/h0;", "vibrate", "(Lexpo/modules/haptics/arguments/HapticsVibrationType;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Vibrator;", "getVibrator", "()Landroid/os/Vibrator;", "vibrator", "expo-haptics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HapticsModule extends Module {
    private final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    private final Vibrator getVibrator() {
        if (Build.VERSION.SDK_INT < 31) {
            Object systemService = getContext().getSystemService("vibrator");
            s.i(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
        Object systemService2 = getContext().getSystemService("vibrator_manager");
        s.i(systemService2, "null cannot be cast to non-null type android.os.VibratorManager");
        Vibrator defaultVibrator = a.a(systemService2).getDefaultVibrator();
        s.h(defaultVibrator);
        return defaultVibrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void vibrate(HapticsVibrationType type) {
        if (Build.VERSION.SDK_INT >= 26) {
            getVibrator().vibrate(VibrationEffect.createWaveform(type.getTimings(), type.getAmplitudes(), -1));
        } else {
            getVibrator().vibrate(type.getOldSDKPattern(), -1);
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent stringAsyncFunctionComponent3;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoHaptics");
            boolean zF = s.f(String.class, Promise.class);
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            if (zF) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("notificationAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        this.this$0.vibrate(HapticsNotificationType.INSTANCE.fromString((String) promise));
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
                moduleDefinitionBuilder = moduleDefinitionBuilder;
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(String.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(String.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        this.this$0.vibrate(HapticsNotificationType.INSTANCE.fromString((String) objArr[0]));
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("notificationAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("notificationAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("notificationAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("notificationAsync", anyTypeArr, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("notificationAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("notificationAsync", anyTypeArr, lVar);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("notificationAsync", asyncFunctionWithPromiseComponent);
            AnyType[] anyTypeArr2 = new AnyType[0];
            l<Object[], h0> lVar2 = new l<Object[], h0>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$4
                @Override // wn0.l
                public final h0 invoke(Object[] it) {
                    s.k(it, "it");
                    this.this$0.vibrate(HapticsSelectionTypeKt.getHapticsSelectionType());
                    return h0.f84049a;
                }
            };
            if (s.f(h0.class, cls)) {
                stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("selectionAsync", anyTypeArr2, lVar2);
            } else if (s.f(h0.class, cls4)) {
                stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("selectionAsync", anyTypeArr2, lVar2);
            } else if (s.f(h0.class, cls3)) {
                stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("selectionAsync", anyTypeArr2, lVar2);
            } else if (s.f(h0.class, cls2)) {
                stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("selectionAsync", anyTypeArr2, lVar2);
            } else {
                stringAsyncFunctionComponent2 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("selectionAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("selectionAsync", anyTypeArr2, lVar2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("selectionAsync", stringAsyncFunctionComponent2);
            if (s.f(String.class, Promise.class)) {
                stringAsyncFunctionComponent3 = new AsyncFunctionWithPromiseComponent("impactAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$5
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        this.this$0.vibrate(HapticsImpactType.INSTANCE.fromString((String) promise));
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(String.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$6
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(String.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr3 = {anyType2};
                l<Object[], h0> lVar3 = new l<Object[], h0>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$7
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        this.this$0.vibrate(HapticsImpactType.INSTANCE.fromString((String) objArr[0]));
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent3 = new IntAsyncFunctionComponent("impactAsync", anyTypeArr3, lVar3);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("impactAsync", anyTypeArr3, lVar3);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("impactAsync", anyTypeArr3, lVar3);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("impactAsync", anyTypeArr3, lVar3);
                } else {
                    stringAsyncFunctionComponent3 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("impactAsync", anyTypeArr3, lVar3) : new UntypedAsyncFunctionComponent("impactAsync", anyTypeArr3, lVar3);
                }
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("impactAsync", stringAsyncFunctionComponent3);
            if (s.f(HapticType.class, Promise.class)) {
                untypedAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent("performHapticsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$8
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        HapticType hapticType = (HapticType) promise;
                        Activity currentActivity = this.this$0.getAppContext().getCurrentActivity();
                        View viewFindViewById = currentActivity != null ? currentActivity.findViewById(android.R.id.content) : null;
                        if (viewFindViewById != null) {
                            viewFindViewById.performHapticFeedback(hapticType.toHapticFeedbackType());
                        }
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType3 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(HapticType.class), Boolean.FALSE));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(o0.b(HapticType.class), false, new wn0.a<q>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$9
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(HapticType.class);
                        }
                    }), converters3);
                }
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("performHapticsAsync", new AnyType[]{anyType3}, new l<Object[], Boolean>() { // from class: expo.modules.haptics.HapticsModule$definition$lambda$4$$inlined$AsyncFunction$10
                    @Override // wn0.l
                    public final Boolean invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        HapticType hapticType = (HapticType) objArr[0];
                        Activity currentActivity = this.this$0.getAppContext().getCurrentActivity();
                        View viewFindViewById = currentActivity != null ? currentActivity.findViewById(android.R.id.content) : null;
                        if (viewFindViewById != null) {
                            return Boolean.valueOf(viewFindViewById.performHapticFeedback(hapticType.toHapticFeedbackType()));
                        }
                        return null;
                    }
                });
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("performHapticsAsync", untypedAsyncFunctionComponent);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
