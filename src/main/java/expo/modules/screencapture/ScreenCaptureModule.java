package expo.modules.screencapture;

import android.app.Activity;
import android.app.Activity$ScreenCaptureCallback;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import co0.q;
import eb.a;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.Queues;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.util.Map;
import java.util.concurrent.Executor;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lexpo/modules/screencapture/ScreenCaptureModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Ljn0/h0;", "registerCallback", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Landroid/app/Activity$ScreenCaptureCallback;", "screenCaptureCallback", "Landroid/app/Activity$ScreenCaptureCallback;", "Lexpo/modules/screencapture/ScreenshotEventEmitter;", "screenshotEventEmitter", "Lexpo/modules/screencapture/ScreenshotEventEmitter;", "", "isRegistered", "Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "expo-screen-capture_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenCaptureModule extends Module {
    private boolean isRegistered;
    private Activity$ScreenCaptureCallback screenCaptureCallback;
    private ScreenshotEventEmitter screenshotEventEmitter;

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.AppContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.AppContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getCurrentActivity() throws Exceptions.MissingActivity {
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new Exceptions.MissingActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerCallback() throws Exceptions.MissingActivity {
        if (!this.isRegistered && Build.VERSION.SDK_INT >= 34) {
            Activity currentActivity = getCurrentActivity();
            Executor mainExecutor = getCurrentActivity().getMainExecutor();
            Activity$ScreenCaptureCallback activity$ScreenCaptureCallback = this.screenCaptureCallback;
            s.h(activity$ScreenCaptureCallback);
            currentActivity.registerScreenCaptureCallback(mainExecutor, activity$ScreenCaptureCallback);
            this.isRegistered = true;
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent2;
        AsyncFunctionComponent stringAsyncFunctionComponent3;
        AsyncFunctionComponent stringAsyncFunctionComponent4;
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoScreenCapture");
            moduleDefinitionBuilder.Events(ScreenCaptureModuleKt.eventName);
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$OnCreate$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() throws Exceptions.AppContextLost {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws Exceptions.AppContextLost {
                    if (Build.VERSION.SDK_INT >= 34) {
                        final ScreenCaptureModule screenCaptureModule = this.this$0;
                        screenCaptureModule.screenCaptureCallback = new Activity$ScreenCaptureCallback() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$1$1$1
                            public final void onScreenCaptured() {
                                Module.sendEvent$default(screenCaptureModule, ScreenCaptureModuleKt.eventName, (Bundle) null, 2, (Object) null);
                            }
                        };
                    } else {
                        ScreenCaptureModule screenCaptureModule2 = this.this$0;
                        Context context = screenCaptureModule2.getContext();
                        final ScreenCaptureModule screenCaptureModule3 = this.this$0;
                        screenCaptureModule2.screenshotEventEmitter = new ScreenshotEventEmitter(context, new wn0.a<h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$1$1$2
                            @Override // wn0.a
                            public /* bridge */ /* synthetic */ h0 invoke() {
                                invoke2();
                                return h0.f84049a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                Module.sendEvent$default(screenCaptureModule3, ScreenCaptureModuleKt.eventName, (Bundle) null, 2, (Object) null);
                            }
                        });
                    }
                }
            }));
            boolean zF = s.f(Promise.class, Promise.class);
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            if (zF) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$AsyncFunction$1
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        if (Build.VERSION.SDK_INT >= 33) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_MEDIA_IMAGES");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_EXTERNAL_STORAGE");
                        }
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Promise.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (Build.VERSION.SDK_INT >= 33) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_MEDIA_IMAGES");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_EXTERNAL_STORAGE");
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("getPermissionsAsync", anyTypeArr, lVar);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getPermissionsAsync", asyncFunctionWithPromiseComponent);
            if (s.f(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$AsyncFunction$4
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        if (Build.VERSION.SDK_INT >= 33) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_MEDIA_IMAGES");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_EXTERNAL_STORAGE");
                        }
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Promise.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$AsyncFunction$5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                l<Object[], h0> lVar2 = new l<Object[], h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$AsyncFunction$6
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (Build.VERSION.SDK_INT >= 33) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_MEDIA_IMAGES");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.READ_EXTERNAL_STORAGE");
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                } else {
                    stringAsyncFunctionComponent2 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr2, lVar2);
                }
                asyncFunctionWithPromiseComponent2 = stringAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestPermissionsAsync", asyncFunctionWithPromiseComponent2);
            AnyType[] anyTypeArr3 = new AnyType[0];
            l<Object[], h0> lVar3 = new l<Object[], h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$AsyncFunction$7
                @Override // wn0.l
                public final h0 invoke(Object[] it) throws Exceptions.MissingActivity {
                    s.k(it, "it");
                    this.this$0.registerCallback();
                    this.this$0.getCurrentActivity().getWindow().addFlags(PKIFailureInfo.certRevoked);
                    return h0.f84049a;
                }
            };
            if (s.f(h0.class, cls)) {
                stringAsyncFunctionComponent3 = new IntAsyncFunctionComponent("preventScreenCapture", anyTypeArr3, lVar3);
            } else if (s.f(h0.class, cls4)) {
                stringAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("preventScreenCapture", anyTypeArr3, lVar3);
            } else if (s.f(h0.class, cls3)) {
                stringAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("preventScreenCapture", anyTypeArr3, lVar3);
            } else if (s.f(h0.class, cls2)) {
                stringAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("preventScreenCapture", anyTypeArr3, lVar3);
            } else {
                stringAsyncFunctionComponent3 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("preventScreenCapture", anyTypeArr3, lVar3) : new UntypedAsyncFunctionComponent("preventScreenCapture", anyTypeArr3, lVar3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("preventScreenCapture", stringAsyncFunctionComponent3);
            Queues queues = Queues.MAIN;
            stringAsyncFunctionComponent3.runOnQueue(queues);
            AnyType[] anyTypeArr4 = new AnyType[0];
            l<Object[], h0> lVar4 = new l<Object[], h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$AsyncFunction$8
                @Override // wn0.l
                public final h0 invoke(Object[] it) throws Exceptions.MissingActivity {
                    s.k(it, "it");
                    this.this$0.registerCallback();
                    this.this$0.getCurrentActivity().getWindow().clearFlags(PKIFailureInfo.certRevoked);
                    return h0.f84049a;
                }
            };
            if (s.f(h0.class, cls)) {
                stringAsyncFunctionComponent4 = new IntAsyncFunctionComponent("allowScreenCapture", anyTypeArr4, lVar4);
            } else if (s.f(h0.class, cls4)) {
                stringAsyncFunctionComponent4 = new BoolAsyncFunctionComponent("allowScreenCapture", anyTypeArr4, lVar4);
            } else if (s.f(h0.class, cls3)) {
                stringAsyncFunctionComponent4 = new DoubleAsyncFunctionComponent("allowScreenCapture", anyTypeArr4, lVar4);
            } else if (s.f(h0.class, cls2)) {
                stringAsyncFunctionComponent4 = new FloatAsyncFunctionComponent("allowScreenCapture", anyTypeArr4, lVar4);
            } else {
                stringAsyncFunctionComponent4 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("allowScreenCapture", anyTypeArr4, lVar4) : new UntypedAsyncFunctionComponent("allowScreenCapture", anyTypeArr4, lVar4);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("allowScreenCapture", stringAsyncFunctionComponent4);
            stringAsyncFunctionComponent4.runOnQueue(queues);
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.ACTIVITY_ENTERS_FOREGROUND;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new wn0.a<h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$OnActivityEntersForeground$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ScreenshotEventEmitter screenshotEventEmitter = this.this$0.screenshotEventEmitter;
                    if (screenshotEventEmitter != null) {
                        screenshotEventEmitter.onHostResume();
                    }
                }
            }));
            Map<EventName, EventListener> eventListeners3 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName3 = EventName.ACTIVITY_ENTERS_BACKGROUND;
            eventListeners3.put(eventName3, new BasicEventListener(eventName3, new wn0.a<h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$OnActivityEntersBackground$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ScreenshotEventEmitter screenshotEventEmitter = this.this$0.screenshotEventEmitter;
                    if (screenshotEventEmitter != null) {
                        screenshotEventEmitter.onHostPause();
                    }
                }
            }));
            Map<EventName, EventListener> eventListeners4 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName4 = EventName.MODULE_DESTROY;
            eventListeners4.put(eventName4, new BasicEventListener(eventName4, new wn0.a<h0>() { // from class: expo.modules.screencapture.ScreenCaptureModule$definition$lambda$9$$inlined$OnDestroy$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Activity$ScreenCaptureCallback activity$ScreenCaptureCallback;
                    ScreenshotEventEmitter screenshotEventEmitter = this.this$0.screenshotEventEmitter;
                    if (screenshotEventEmitter != null) {
                        screenshotEventEmitter.onHostDestroy();
                    }
                    if (Build.VERSION.SDK_INT < 34 || (activity$ScreenCaptureCallback = this.this$0.screenCaptureCallback) == null) {
                        return;
                    }
                    this.this$0.getCurrentActivity().unregisterScreenCaptureCallback(activity$ScreenCaptureCallback);
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            a.f();
        }
    }
}
