package expo.modules.screenorientation;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import co0.q;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import eb.a;
import expo.modules.core.errors.InvalidArgumentException;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.UIManager;
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
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.screenorientation.enums.Orientation;
import expo.modules.screenorientation.enums.OrientationAttr;
import expo.modules.screenorientation.enums.OrientationLock;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0004R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lexpo/modules/screenorientation/ScreenOrientationModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lexpo/modules/screenorientation/enums/Orientation;", "getScreenOrientation", "(Landroid/app/Activity;)Lexpo/modules/screenorientation/enums/Orientation;", "", "rotation", Snapshot.WIDTH, Snapshot.HEIGHT, "", "isPortraitNaturalOrientation", "(III)Z", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Ljn0/h0;", "onHostResume", "onHostPause", "onHostDestroy", "initialOrientation", "Ljava/lang/Integer;", "getWeakCurrentActivity", "()Landroid/app/Activity;", "weakCurrentActivity", "getCurrentActivity", "currentActivity", "Lexpo/modules/core/interfaces/services/UIManager;", "getUiManager", "()Lexpo/modules/core/interfaces/services/UIManager;", "uiManager", "expo-screen-orientation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenOrientationModule extends Module implements LifecycleEventListener {
    private Integer initialOrientation;

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getCurrentActivity() throws Exceptions.MissingActivity {
        Activity weakCurrentActivity = getWeakCurrentActivity();
        if (weakCurrentActivity != null) {
            return weakCurrentActivity;
        }
        throw new Exceptions.MissingActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Orientation getScreenOrientation(Activity activity) {
        int rotation;
        DisplayMetrics displayMetrics;
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager == null) {
            return Orientation.UNKNOWN;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            Display display = getCurrentActivity().getWindow().getContext().getDisplay();
            if (display == null) {
                return Orientation.UNKNOWN;
            }
            rotation = display.getRotation();
        } else {
            rotation = windowManager.getDefaultDisplay().getRotation();
        }
        if (i11 >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            s.j(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            s.j(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
            displayMetrics = new DisplayMetrics();
            displayMetrics.widthPixels = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.left) - insetsIgnoringVisibility.right;
            displayMetrics.heightPixels = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
        } else {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        if (isPortraitNaturalOrientation(rotation, displayMetrics.widthPixels, displayMetrics.heightPixels)) {
            if (rotation == 0) {
                return Orientation.PORTRAIT_UP;
            }
            if (rotation == 1) {
                return Orientation.LANDSCAPE_RIGHT;
            }
            if (rotation != 2) {
                return rotation != 3 ? Orientation.UNKNOWN : Orientation.LANDSCAPE_LEFT;
            }
            return Orientation.PORTRAIT_DOWN;
        }
        if (rotation == 0) {
            return Orientation.LANDSCAPE_RIGHT;
        }
        if (rotation == 1) {
            return Orientation.PORTRAIT_DOWN;
        }
        if (rotation != 2) {
            return rotation != 3 ? Orientation.UNKNOWN : Orientation.PORTRAIT_UP;
        }
        return Orientation.LANDSCAPE_LEFT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UIManager getUiManager() {
        UIManager uIManager = (UIManager) getAppContext().getLegacyModuleRegistry().getModule(UIManager.class);
        if (uIManager != null) {
            return uIManager;
        }
        throw new IllegalStateException("Could not find implementation for UIManager.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getWeakCurrentActivity() {
        return getAppContext().getCurrentActivity();
    }

    private final boolean isPortraitNaturalOrientation(int rotation, int width, int height) {
        return ((rotation == 0 || rotation == 2) && height > width) || ((rotation == 1 || rotation == 3) && width > height);
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent2;
        AsyncFunctionComponent stringAsyncFunctionComponent3;
        AsyncFunctionComponent stringAsyncFunctionComponent4;
        AsyncFunctionComponent stringAsyncFunctionComponent5;
        AsyncFunctionComponent stringAsyncFunctionComponent6;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent3;
        Class<Integer> cls2 = Integer.class;
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoScreenOrientation");
            moduleDefinitionBuilder.Events("expoDidUpdateDimensions");
            boolean zF = s.f(OrientationLock.class, Promise.class);
            Class cls3 = Integer.TYPE;
            Class cls4 = Float.TYPE;
            Class cls5 = Double.TYPE;
            Class cls6 = Boolean.TYPE;
            if (zF) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("lockAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws InvalidOrientationLockException {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        OrientationLock orientationLock = (OrientationLock) promise;
                        try {
                            this.this$0.getCurrentActivity().setRequestedOrientation(orientationLock.toPlatformInt$expo_screen_orientation_release());
                        } catch (InvalidArgumentException e11) {
                            throw new InvalidOrientationLockException(orientationLock.getValue(), e11);
                        }
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws InvalidOrientationLockException {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
                cls = OrientationLock.class;
                cls2 = cls2;
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(OrientationLock.class), Boolean.FALSE));
                if (anyType == null) {
                    cls = OrientationLock.class;
                    anyType = new AnyType(new LazyKType(o0.b(cls), false, new wn0.a<q>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(OrientationLock.class);
                        }
                    }), converters);
                } else {
                    cls = OrientationLock.class;
                }
                AnyType[] anyTypeArr = {anyType};
                l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) throws InvalidOrientationLockException {
                        s.k(objArr, "<destruct>");
                        OrientationLock orientationLock = (OrientationLock) objArr[0];
                        try {
                            this.this$0.getCurrentActivity().setRequestedOrientation(orientationLock.toPlatformInt$expo_screen_orientation_release());
                            return h0.f84049a;
                        } catch (InvalidArgumentException e11) {
                            throw new InvalidOrientationLockException(orientationLock.getValue(), e11);
                        }
                    }
                };
                if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("lockAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls6)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("lockAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls5)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("lockAsync", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("lockAsync", anyTypeArr, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("lockAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("lockAsync", anyTypeArr, lVar);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("lockAsync", asyncFunctionWithPromiseComponent);
            if (s.f(OrientationAttr.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("lockPlatformAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$4
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        this.this$0.getCurrentActivity().setRequestedOrientation(((OrientationAttr) promise).getValue());
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(OrientationAttr.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(OrientationAttr.class), false, new wn0.a<q>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(OrientationAttr.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                l<Object[], h0> lVar2 = new l<Object[], h0>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$6
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        this.this$0.getCurrentActivity().setRequestedOrientation(((OrientationAttr) objArr[0]).getValue());
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("lockPlatformAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls6)) {
                    stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("lockPlatformAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls5)) {
                    stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("lockPlatformAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("lockPlatformAsync", anyTypeArr2, lVar2);
                } else {
                    stringAsyncFunctionComponent2 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("lockPlatformAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("lockPlatformAsync", anyTypeArr2, lVar2);
                }
                asyncFunctionWithPromiseComponent2 = stringAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("lockPlatformAsync", asyncFunctionWithPromiseComponent2);
            AnyType[] anyTypeArr3 = new AnyType[0];
            l<Object[], Integer> lVar3 = new l<Object[], Integer>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$7
                @Override // wn0.l
                public final Integer invoke(Object[] it) {
                    s.k(it, "it");
                    ScreenOrientationModule screenOrientationModule = this.this$0;
                    return Integer.valueOf(screenOrientationModule.getScreenOrientation(screenOrientationModule.getCurrentActivity()).getValue());
                }
            };
            Class<Integer> cls7 = cls2;
            if (s.f(cls7, cls3)) {
                stringAsyncFunctionComponent3 = new IntAsyncFunctionComponent("getOrientationAsync", anyTypeArr3, lVar3);
            } else if (s.f(cls7, cls6)) {
                stringAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("getOrientationAsync", anyTypeArr3, lVar3);
            } else if (s.f(cls7, cls5)) {
                stringAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("getOrientationAsync", anyTypeArr3, lVar3);
            } else if (s.f(cls7, cls4)) {
                stringAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("getOrientationAsync", anyTypeArr3, lVar3);
            } else {
                stringAsyncFunctionComponent3 = s.f(cls7, String.class) ? new StringAsyncFunctionComponent("getOrientationAsync", anyTypeArr3, lVar3) : new UntypedAsyncFunctionComponent("getOrientationAsync", anyTypeArr3, lVar3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getOrientationAsync", stringAsyncFunctionComponent3);
            AnyType[] anyTypeArr4 = new AnyType[0];
            l<Object[], OrientationLock> lVar4 = new l<Object[], OrientationLock>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$8
                @Override // wn0.l
                public final OrientationLock invoke(Object[] it) throws GetOrientationLockException {
                    s.k(it, "it");
                    try {
                        return OrientationLock.INSTANCE.fromPlatformInt(this.this$0.getCurrentActivity().getRequestedOrientation());
                    } catch (Exception e11) {
                        throw new GetOrientationLockException(e11);
                    }
                }
            };
            Class cls8 = cls;
            if (s.f(cls8, cls3)) {
                stringAsyncFunctionComponent4 = new IntAsyncFunctionComponent("getOrientationLockAsync", anyTypeArr4, lVar4);
            } else if (s.f(cls8, cls6)) {
                stringAsyncFunctionComponent4 = new BoolAsyncFunctionComponent("getOrientationLockAsync", anyTypeArr4, lVar4);
            } else if (s.f(cls8, cls5)) {
                stringAsyncFunctionComponent4 = new DoubleAsyncFunctionComponent("getOrientationLockAsync", anyTypeArr4, lVar4);
            } else if (s.f(cls8, cls4)) {
                stringAsyncFunctionComponent4 = new FloatAsyncFunctionComponent("getOrientationLockAsync", anyTypeArr4, lVar4);
            } else {
                stringAsyncFunctionComponent4 = s.f(cls8, String.class) ? new StringAsyncFunctionComponent("getOrientationLockAsync", anyTypeArr4, lVar4) : new UntypedAsyncFunctionComponent("getOrientationLockAsync", anyTypeArr4, lVar4);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getOrientationLockAsync", stringAsyncFunctionComponent4);
            AnyType[] anyTypeArr5 = new AnyType[0];
            l<Object[], Integer> lVar5 = new l<Object[], Integer>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$9
                @Override // wn0.l
                public final Integer invoke(Object[] it) throws GetPlatformOrientationLockException {
                    s.k(it, "it");
                    try {
                        return Integer.valueOf(this.this$0.getCurrentActivity().getRequestedOrientation());
                    } catch (Exception e11) {
                        throw new GetPlatformOrientationLockException(e11);
                    }
                }
            };
            if (s.f(cls7, cls3)) {
                stringAsyncFunctionComponent5 = new IntAsyncFunctionComponent("getPlatformOrientationLockAsync", anyTypeArr5, lVar5);
            } else if (s.f(cls7, cls6)) {
                stringAsyncFunctionComponent5 = new BoolAsyncFunctionComponent("getPlatformOrientationLockAsync", anyTypeArr5, lVar5);
            } else if (s.f(cls7, cls5)) {
                stringAsyncFunctionComponent5 = new DoubleAsyncFunctionComponent("getPlatformOrientationLockAsync", anyTypeArr5, lVar5);
            } else if (s.f(cls7, cls4)) {
                stringAsyncFunctionComponent5 = new FloatAsyncFunctionComponent("getPlatformOrientationLockAsync", anyTypeArr5, lVar5);
            } else {
                stringAsyncFunctionComponent5 = s.f(cls7, String.class) ? new StringAsyncFunctionComponent("getPlatformOrientationLockAsync", anyTypeArr5, lVar5) : new UntypedAsyncFunctionComponent("getPlatformOrientationLockAsync", anyTypeArr5, lVar5);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getPlatformOrientationLockAsync", stringAsyncFunctionComponent5);
            if (s.f(cls7, Promise.class)) {
                asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("supportsOrientationLockAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$10
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        OrientationLock.INSTANCE.supportsOrientationLock(((Integer) promise).intValue());
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType3 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(cls7), Boolean.FALSE));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(o0.b(cls7), false, new wn0.a<q>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$11
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Integer.TYPE);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr6 = {anyType3};
                l<Object[], Boolean> lVar6 = new l<Object[], Boolean>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$AsyncFunction$12
                    @Override // wn0.l
                    public final Boolean invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        return Boolean.valueOf(OrientationLock.INSTANCE.supportsOrientationLock(((Number) objArr[0]).intValue()));
                    }
                };
                if (s.f(Boolean.class, cls3)) {
                    stringAsyncFunctionComponent6 = new IntAsyncFunctionComponent("supportsOrientationLockAsync", anyTypeArr6, lVar6);
                } else if (s.f(Boolean.class, cls6)) {
                    stringAsyncFunctionComponent6 = new BoolAsyncFunctionComponent("supportsOrientationLockAsync", anyTypeArr6, lVar6);
                } else if (s.f(Boolean.class, cls5)) {
                    stringAsyncFunctionComponent6 = new DoubleAsyncFunctionComponent("supportsOrientationLockAsync", anyTypeArr6, lVar6);
                } else if (s.f(Boolean.class, cls4)) {
                    stringAsyncFunctionComponent6 = new FloatAsyncFunctionComponent("supportsOrientationLockAsync", anyTypeArr6, lVar6);
                } else {
                    stringAsyncFunctionComponent6 = s.f(Boolean.class, String.class) ? new StringAsyncFunctionComponent("supportsOrientationLockAsync", anyTypeArr6, lVar6) : new UntypedAsyncFunctionComponent("supportsOrientationLockAsync", anyTypeArr6, lVar6);
                }
                asyncFunctionWithPromiseComponent3 = stringAsyncFunctionComponent6;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("supportsOrientationLockAsync", asyncFunctionWithPromiseComponent3);
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$OnCreate$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.getUiManager().registerLifecycleEventListener(this.this$0);
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new wn0.a<h0>() { // from class: expo.modules.screenorientation.ScreenOrientationModule$definition$lambda$9$$inlined$OnDestroy$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.getUiManager().unregisterLifecycleEventListener(this.this$0);
                    Integer num = this.this$0.initialOrientation;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Activity weakCurrentActivity = this.this$0.getWeakCurrentActivity();
                        if (weakCurrentActivity != null) {
                            weakCurrentActivity.setRequestedOrientation(iIntValue);
                        }
                    }
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            a.f();
        }
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        Integer numValueOf = this.initialOrientation;
        if (numValueOf == null) {
            Activity weakCurrentActivity = getWeakCurrentActivity();
            numValueOf = weakCurrentActivity != null ? Integer.valueOf(weakCurrentActivity.getRequestedOrientation()) : null;
        }
        this.initialOrientation = numValueOf;
    }
}
