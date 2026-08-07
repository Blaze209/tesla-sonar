package expo.modules.kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.View;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.z0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.core.errors.ContextDestroyedException;
import expo.modules.core.errors.ModuleNotFoundException;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.interfaces.camera.CameraViewInterface;
import expo.modules.interfaces.constants.ConstantsInterface;
import expo.modules.interfaces.filesystem.AppDirectoriesModuleInterface;
import expo.modules.interfaces.filesystem.FilePermissionModuleInterface;
import expo.modules.interfaces.font.FontManagerInterface;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.taskManager.TaskManagerInterface;
import expo.modules.kotlin.activityresult.ActivityResultsManager;
import expo.modules.kotlin.activityresult.DefaultAppContextActivityResultCaller;
import expo.modules.kotlin.defaultmodules.ErrorManagerModule;
import expo.modules.kotlin.defaultmodules.NativeModulesProxyModule;
import expo.modules.kotlin.events.EventEmitter;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.KEventEmitterWrapper;
import expo.modules.kotlin.events.KModuleEventEmitterWrapper;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.providers.CurrentActivityProvider;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import jn0.h0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.android.HandlerDispatcher;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000f\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001f\u0010\rJ1\u0010*\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b(\u0010)J\u0019\u0010.\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b,\u0010-J#\u00102\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00100*\u00020/2\u0006\u00101\u001a\u00020#H\u0007¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u00020\u000b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b04H\u0000¢\u0006\u0004\b6\u00107J\u000f\u0010:\u001a\u00020\u000bH\u0000¢\u0006\u0004\b9\u0010\rJ\u0015\u0010=\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0017\u0010Q\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010U\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bU\u0010R\u001a\u0004\bV\u0010TR\u0017\u0010W\u001a\u00020P8\u0006¢\u0006\f\n\u0004\bW\u0010R\u001a\u0004\bX\u0010TR*\u0010Z\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010d\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0016\u0010k\u001a\u0004\u0018\u00010h8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0011\u0010o\u001a\u00020l8F¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010s\u001a\u0004\u0018\u00010p8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u0010w\u001a\u0004\u0018\u00010t8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0011\u0010{\u001a\u00020x8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0011\u0010}\u001a\u00020x8F¢\u0006\u0006\u001a\u0004\b|\u0010zR\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008a\u00018F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0017\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u008e\u00018F¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0017\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018F¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0017\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0014\u0010\u009c\u0001\u001a\u00020J8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0017\u0010£\u0001\u001a\u0005\u0018\u00010 \u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010¦\u0001\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0014\u0010¨\u0001\u001a\u00020!8F¢\u0006\b\u001a\u0006\b§\u0001\u0010¥\u0001¨\u0006©\u0001"}, d2 = {"Lexpo/modules/kotlin/AppContext;", "Lexpo/modules/kotlin/providers/CurrentActivityProvider;", "Lexpo/modules/kotlin/ModulesProvider;", "modulesProvider", "Lexpo/modules/core/ModuleRegistry;", "legacyModuleRegistry", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "<init>", "(Lexpo/modules/kotlin/ModulesProvider;Lexpo/modules/core/ModuleRegistry;Ljava/lang/ref/WeakReference;)V", "Ljn0/h0;", "onCreate", "()V", "installJSIInterop", "Module", "legacyModule", "()Ljava/lang/Object;", "Lexpo/modules/kotlin/modules/Module;", "module", "Lexpo/modules/kotlin/events/EventEmitter;", "eventEmitter", "(Lexpo/modules/kotlin/modules/Module;)Lexpo/modules/kotlin/events/EventEmitter;", "onDestroy$expo_modules_core_release", "onDestroy", "onHostResume$expo_modules_core_release", "onHostResume", "onHostPause$expo_modules_core_release", "onHostPause", "onUserLeaveHint$expo_modules_core_release", "onUserLeaveHint", "onHostDestroy$expo_modules_core_release", "onHostDestroy", "Landroid/app/Activity;", "activity", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "onActivityResult$expo_modules_core_release", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "onActivityResult", AnalyticsAttribute.Intent, "onNewIntent$expo_modules_core_release", "(Landroid/content/Intent;)V", "onNewIntent", "Landroid/view/View;", "T", "viewTag", "findView", "(I)Landroid/view/View;", "Lkotlin/Function0;", "block", "dispatchOnMainUsingUIManager$expo_modules_core_release", "(Lwn0/a;)V", "dispatchOnMainUsingUIManager", "assertMainThread$expo_modules_core_release", "assertMainThread", "Ljava/lang/Runnable;", "runnable", "executeOnJavaScriptThread", "(Ljava/lang/Runnable;)V", "Lexpo/modules/core/ModuleRegistry;", "getLegacyModuleRegistry", "()Lexpo/modules/core/ModuleRegistry;", "Lexpo/modules/kotlin/RuntimeContext;", "hostingRuntimeContext", "Lexpo/modules/kotlin/RuntimeContext;", "getHostingRuntimeContext", "()Lexpo/modules/kotlin/RuntimeContext;", "Lexpo/modules/kotlin/ReactLifecycleDelegate;", "reactLifecycleDelegate", "Lexpo/modules/kotlin/ReactLifecycleDelegate;", "", "hostWasDestroyed", "Z", "Lkotlinx/coroutines/android/HandlerDispatcher;", "modulesQueueDispatcher", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "backgroundCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getBackgroundCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "modulesQueue", "getModulesQueue", "mainQueue", "getMainQueue", "Lexpo/modules/adapters/react/NativeModulesProxy;", "legacyModulesProxyHolder", "Ljava/lang/ref/WeakReference;", "getLegacyModulesProxyHolder$expo_modules_core_release", "()Ljava/lang/ref/WeakReference;", "setLegacyModulesProxyHolder$expo_modules_core_release", "(Ljava/lang/ref/WeakReference;)V", "Lexpo/modules/kotlin/activityresult/ActivityResultsManager;", "activityResultsManager", "Lexpo/modules/kotlin/activityresult/ActivityResultsManager;", "Lexpo/modules/kotlin/activityresult/DefaultAppContextActivityResultCaller;", "appContextActivityResultCaller", "Lexpo/modules/kotlin/activityresult/DefaultAppContextActivityResultCaller;", "getAppContextActivityResultCaller$expo_modules_core_release", "()Lexpo/modules/kotlin/activityresult/DefaultAppContextActivityResultCaller;", "Lexpo/modules/interfaces/filesystem/AppDirectoriesModuleInterface;", "getAppDirectories", "()Lexpo/modules/interfaces/filesystem/AppDirectoriesModuleInterface;", "appDirectories", "Lexpo/modules/kotlin/ModuleRegistry;", "getRegistry", "()Lexpo/modules/kotlin/ModuleRegistry;", "registry", "Lexpo/modules/interfaces/constants/ConstantsInterface;", "getConstants", "()Lexpo/modules/interfaces/constants/ConstantsInterface;", "constants", "Lexpo/modules/interfaces/filesystem/FilePermissionModuleInterface;", "getFilePermission", "()Lexpo/modules/interfaces/filesystem/FilePermissionModuleInterface;", "filePermission", "Ljava/io/File;", "getPersistentFilesDirectory", "()Ljava/io/File;", "persistentFilesDirectory", "getCacheDirectory", "cacheDirectory", "Lexpo/modules/interfaces/permissions/Permissions;", "getPermissions", "()Lexpo/modules/interfaces/permissions/Permissions;", "permissions", "Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "getImageLoader", "()Lexpo/modules/interfaces/imageloader/ImageLoaderInterface;", "imageLoader", "Lexpo/modules/interfaces/camera/CameraViewInterface;", "getCamera", "()Lexpo/modules/interfaces/camera/CameraViewInterface;", "camera", "Lexpo/modules/interfaces/font/FontManagerInterface;", "getFont", "()Lexpo/modules/interfaces/font/FontManagerInterface;", "font", "Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "getTaskManager", "()Lexpo/modules/interfaces/taskManager/TaskManagerInterface;", "taskManager", "Lexpo/modules/core/interfaces/ActivityProvider;", "getActivityProvider", "()Lexpo/modules/core/interfaces/ActivityProvider;", "activityProvider", "Landroid/content/Context;", "getReactContext", "()Landroid/content/Context;", "reactContext", "getHasActiveReactInstance", "()Z", "hasActiveReactInstance", "getCallbackInvoker$expo_modules_core_release", "()Lexpo/modules/kotlin/events/EventEmitter;", "callbackInvoker", "Lexpo/modules/kotlin/defaultmodules/ErrorManagerModule;", "getErrorManager", "()Lexpo/modules/kotlin/defaultmodules/ErrorManagerModule;", "errorManager", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "getThrowingActivity", "throwingActivity", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppContext implements CurrentActivityProvider {
    private final ActivityResultsManager activityResultsManager;
    private final DefaultAppContextActivityResultCaller appContextActivityResultCaller;
    private final CoroutineScope backgroundCoroutineScope;
    private boolean hostWasDestroyed;
    private final RuntimeContext hostingRuntimeContext;
    private final expo.modules.core.ModuleRegistry legacyModuleRegistry;
    private WeakReference<NativeModulesProxy> legacyModulesProxyHolder;
    private final CoroutineScope mainQueue;
    private final CoroutineScope modulesQueue;
    private final HandlerDispatcher modulesQueueDispatcher;
    private final ReactLifecycleDelegate reactLifecycleDelegate;

    public AppContext(ModulesProvider modulesProvider, expo.modules.core.ModuleRegistry legacyModuleRegistry, WeakReference<ReactApplicationContext> reactContextHolder) {
        s.k(modulesProvider, "modulesProvider");
        s.k(legacyModuleRegistry, "legacyModuleRegistry");
        s.k(reactContextHolder, "reactContextHolder");
        this.legacyModuleRegistry = legacyModuleRegistry;
        RuntimeContext runtimeContext = new RuntimeContext(this, reactContextHolder);
        this.hostingRuntimeContext = runtimeContext;
        ReactLifecycleDelegate reactLifecycleDelegate = new ReactLifecycleDelegate(this);
        this.reactLifecycleDelegate = reactLifecycleDelegate;
        HandlerThread handlerThread = new HandlerThread("expo.modules.AsyncFunctionQueue");
        handlerThread.start();
        HandlerDispatcher handlerDispatcherFrom$default = HandlerDispatcherKt.from$default(new Handler(handlerThread.getLooper()), null, 1, null);
        this.modulesQueueDispatcher = handlerDispatcherFrom$default;
        this.backgroundCoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new CoroutineName("expo.modules.BackgroundCoroutineScope")));
        this.modulesQueue = CoroutineScopeKt.CoroutineScope(handlerDispatcherFrom$default.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new CoroutineName("expo.modules.AsyncFunctionQueue")));
        this.mainQueue = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new CoroutineName("expo.modules.MainQueue")));
        ActivityResultsManager activityResultsManager = new ActivityResultsManager(this);
        this.activityResultsManager = activityResultsManager;
        this.appContextActivityResultCaller = new DefaultAppContextActivityResultCaller(activityResultsManager);
        ReactApplicationContext reactApplicationContext = reactContextHolder.get();
        if (reactApplicationContext == null) {
            throw new IllegalArgumentException("The app context should be created with valid react context.");
        }
        ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
        reactApplicationContext2.addLifecycleEventListener(reactLifecycleDelegate);
        reactApplicationContext2.addActivityEventListener(reactLifecycleDelegate);
        runtimeContext.getRegistry().register(new ErrorManagerModule());
        runtimeContext.getRegistry().register(new NativeModulesProxyModule());
        runtimeContext.getRegistry().register(modulesProvider);
        CoreLoggerKt.getLogger().info("✅ AppContext was initialized");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchOnMainUsingUIManager$lambda$10(wn0.a aVar, t it) {
        s.k(it, "it");
        aVar.invoke();
    }

    private final AppDirectoriesModuleInterface getAppDirectories() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(AppDirectoriesModuleInterface.class);
        } catch (Exception unused) {
            module = null;
        }
        return (AppDirectoriesModuleInterface) module;
    }

    public final void assertMainThread$expo_modules_core_release() throws Exceptions.IncorrectThreadException {
        Utils utils = Utils.INSTANCE;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        String name = Thread.currentThread().getName();
        s.j(name, "getName(...)");
        String name2 = Looper.getMainLooper().getThread().getName();
        s.j(name2, "getName(...)");
        throw new Exceptions.IncorrectThreadException(name, name2);
    }

    public final void dispatchOnMainUsingUIManager$expo_modules_core_release(final wn0.a<h0> block) throws Exceptions.ReactContextLost {
        s.k(block, "block");
        ReactApplicationContext reactApplicationContext = this.hostingRuntimeContext.getReactContextHolder().get();
        if (reactApplicationContext == null) {
            throw new Exceptions.ReactContextLost();
        }
        UIManager uIManagerI = b1.i(reactApplicationContext, 1);
        s.i(uIManagerI, "null cannot be cast to non-null type com.facebook.react.uimanager.UIManagerModule");
        ((UIManagerModule) uIManagerI).addUIBlock(new z0() { // from class: expo.modules.kotlin.a
            @Override // com.facebook.react.uimanager.z0
            public final void execute(t tVar) {
                AppContext.dispatchOnMainUsingUIManager$lambda$10(block, tVar);
            }
        });
    }

    public final EventEmitter eventEmitter(Module module) {
        Object module2;
        s.k(module, "module");
        try {
            module2 = getLegacyModuleRegistry().getModule(expo.modules.core.interfaces.services.EventEmitter.class);
        } catch (Exception unused) {
            module2 = null;
        }
        expo.modules.core.interfaces.services.EventEmitter eventEmitter = (expo.modules.core.interfaces.services.EventEmitter) module2;
        if (eventEmitter == null) {
            return null;
        }
        ModuleHolder moduleHolder = this.hostingRuntimeContext.getRegistry().getModuleHolder(module);
        if (moduleHolder != null) {
            return new KModuleEventEmitterWrapper(moduleHolder, eventEmitter, this.hostingRuntimeContext.getReactContextHolder());
        }
        throw new IllegalArgumentException("Cannot create an event emitter for the module that isn't present in the module registry.");
    }

    public final void executeOnJavaScriptThread(Runnable runnable) {
        s.k(runnable, "runnable");
        ReactApplicationContext reactApplicationContext = this.hostingRuntimeContext.getReactContextHolder().get();
        if (reactApplicationContext != null) {
            reactApplicationContext.runOnJSQueueThread(runnable);
        }
    }

    public final <T extends View> T findView(int viewTag) {
        ReactApplicationContext reactApplicationContext = this.hostingRuntimeContext.getReactContextHolder().get();
        if (reactApplicationContext == null) {
            return null;
        }
        UIManager uIManagerI = b1.i(reactApplicationContext, viewTag);
        T t11 = uIManagerI != null ? (T) uIManagerI.resolveView(viewTag) : null;
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public final ActivityProvider getActivityProvider() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(ActivityProvider.class);
        } catch (Exception unused) {
            module = null;
        }
        return (ActivityProvider) module;
    }

    /* JADX INFO: renamed from: getAppContextActivityResultCaller$expo_modules_core_release, reason: from getter */
    public final DefaultAppContextActivityResultCaller getAppContextActivityResultCaller() {
        return this.appContextActivityResultCaller;
    }

    public final CoroutineScope getBackgroundCoroutineScope() {
        return this.backgroundCoroutineScope;
    }

    public final File getCacheDirectory() throws ModuleNotFoundException {
        File cacheDirectory;
        AppDirectoriesModuleInterface appDirectories = getAppDirectories();
        if (appDirectories == null || (cacheDirectory = appDirectories.getCacheDirectory()) == null) {
            throw new ModuleNotFoundException("expo.modules.interfaces.filesystem.AppDirectories");
        }
        return cacheDirectory;
    }

    public final EventEmitter getCallbackInvoker$expo_modules_core_release() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(expo.modules.core.interfaces.services.EventEmitter.class);
        } catch (Exception unused) {
            module = null;
        }
        expo.modules.core.interfaces.services.EventEmitter eventEmitter = (expo.modules.core.interfaces.services.EventEmitter) module;
        if (eventEmitter == null) {
            return null;
        }
        return new KEventEmitterWrapper(eventEmitter, this.hostingRuntimeContext.getReactContextHolder());
    }

    public final CameraViewInterface getCamera() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(CameraViewInterface.class);
        } catch (Exception unused) {
            module = null;
        }
        return (CameraViewInterface) module;
    }

    public final ConstantsInterface getConstants() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(ConstantsInterface.class);
        } catch (Exception unused) {
            module = null;
        }
        return (ConstantsInterface) module;
    }

    @Override // expo.modules.kotlin.providers.CurrentActivityProvider
    public Activity getCurrentActivity() {
        Activity currentActivity;
        ActivityProvider activityProvider = getActivityProvider();
        if (activityProvider != null && (currentActivity = activityProvider.getCurrentActivity()) != null) {
            return currentActivity;
        }
        Context reactContext = getReactContext();
        ReactApplicationContext reactApplicationContext = reactContext instanceof ReactApplicationContext ? (ReactApplicationContext) reactContext : null;
        if (reactApplicationContext != null) {
            return reactApplicationContext.getCurrentActivity();
        }
        return null;
    }

    public final ErrorManagerModule getErrorManager() {
        Object next;
        Module module;
        Iterator<T> it = this.hostingRuntimeContext.getRegistry().getRegistry().values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            module = ((ModuleHolder) next).getModule();
        } while (!(module != null ? module instanceof ErrorManagerModule : true));
        ModuleHolder moduleHolder = (ModuleHolder) next;
        Module module2 = moduleHolder != null ? moduleHolder.getModule() : null;
        return (ErrorManagerModule) (module2 instanceof ErrorManagerModule ? module2 : null);
    }

    public final FilePermissionModuleInterface getFilePermission() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(FilePermissionModuleInterface.class);
        } catch (Exception unused) {
            module = null;
        }
        return (FilePermissionModuleInterface) module;
    }

    public final FontManagerInterface getFont() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(FontManagerInterface.class);
        } catch (Exception unused) {
            module = null;
        }
        return (FontManagerInterface) module;
    }

    public final boolean getHasActiveReactInstance() {
        ReactApplicationContext reactApplicationContext = this.hostingRuntimeContext.getReactContextHolder().get();
        if (reactApplicationContext != null) {
            return reactApplicationContext.hasActiveReactInstance();
        }
        return false;
    }

    public final RuntimeContext getHostingRuntimeContext() {
        return this.hostingRuntimeContext;
    }

    public final ImageLoaderInterface getImageLoader() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(ImageLoaderInterface.class);
        } catch (Exception unused) {
            module = null;
        }
        return (ImageLoaderInterface) module;
    }

    public final expo.modules.core.ModuleRegistry getLegacyModuleRegistry() {
        return this.legacyModuleRegistry;
    }

    public final WeakReference<NativeModulesProxy> getLegacyModulesProxyHolder$expo_modules_core_release() {
        return this.legacyModulesProxyHolder;
    }

    public final CoroutineScope getMainQueue() {
        return this.mainQueue;
    }

    public final CoroutineScope getModulesQueue() {
        return this.modulesQueue;
    }

    public final Permissions getPermissions() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(Permissions.class);
        } catch (Exception unused) {
            module = null;
        }
        return (Permissions) module;
    }

    public final File getPersistentFilesDirectory() throws ModuleNotFoundException {
        File persistentFilesDirectory;
        AppDirectoriesModuleInterface appDirectories = getAppDirectories();
        if (appDirectories == null || (persistentFilesDirectory = appDirectories.getPersistentFilesDirectory()) == null) {
            throw new ModuleNotFoundException("expo.modules.interfaces.filesystem.AppDirectories");
        }
        return persistentFilesDirectory;
    }

    public final Context getReactContext() {
        return this.hostingRuntimeContext.getReactContextHolder().get();
    }

    public final ModuleRegistry getRegistry() {
        return this.hostingRuntimeContext.getRegistry();
    }

    public final TaskManagerInterface getTaskManager() {
        Object module;
        try {
            module = getLegacyModuleRegistry().getModule(TaskManagerInterface.class);
        } catch (Exception unused) {
            module = null;
        }
        return (TaskManagerInterface) module;
    }

    public final Activity getThrowingActivity() throws Exceptions.MissingActivity {
        Activity currentActivity;
        ActivityProvider activityProvider = getActivityProvider();
        if (activityProvider == null || (currentActivity = activityProvider.getCurrentActivity()) == null) {
            Context reactContext = getReactContext();
            ReactApplicationContext reactApplicationContext = reactContext instanceof ReactApplicationContext ? (ReactApplicationContext) reactContext : null;
            currentActivity = reactApplicationContext != null ? reactApplicationContext.getCurrentActivity() : null;
        }
        if (currentActivity != null) {
            return currentActivity;
        }
        throw new Exceptions.MissingActivity();
    }

    public final void installJSIInterop() {
        this.hostingRuntimeContext.installJSIContext();
    }

    public final /* synthetic */ <Module> Module legacyModule() {
        try {
            expo.modules.core.ModuleRegistry legacyModuleRegistry = getLegacyModuleRegistry();
            s.q(4, "Module");
            return (Module) legacyModuleRegistry.getModule(Object.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onActivityResult$expo_modules_core_release(Activity activity, int requestCode, int resultCode, Intent data) {
        s.k(activity, "activity");
        this.activityResultsManager.onActivityResult(requestCode, resultCode, data);
        this.hostingRuntimeContext.getRegistry().post(EventName.ON_ACTIVITY_RESULT, activity, new OnActivityResultPayload(requestCode, resultCode, data));
    }

    public final void onCreate() {
        eb.a.c("[ExpoModulesCore] AppContext.onCreate");
        try {
            getHostingRuntimeContext().getRegistry().postOnCreate();
            h0 h0Var = h0.f84049a;
        } finally {
            eb.a.f();
        }
    }

    public final void onDestroy$expo_modules_core_release() {
        eb.a.c("[ExpoModulesCore] AppContext.onDestroy");
        try {
            ReactApplicationContext reactApplicationContext = getHostingRuntimeContext().getReactContextHolder().get();
            if (reactApplicationContext != null) {
                reactApplicationContext.removeLifecycleEventListener(this.reactLifecycleDelegate);
            }
            getHostingRuntimeContext().getRegistry().post(EventName.MODULE_DESTROY);
            getHostingRuntimeContext().getRegistry().cleanUp();
            CoroutineScopeKt.cancel(getModulesQueue(), new ContextDestroyedException(null, 1, null));
            CoroutineScopeKt.cancel(getMainQueue(), new ContextDestroyedException(null, 1, null));
            CoroutineScopeKt.cancel(getBackgroundCoroutineScope(), new ContextDestroyedException(null, 1, null));
            getHostingRuntimeContext().deallocate();
            CoreLoggerKt.getLogger().info("✅ AppContext was destroyed");
            h0 h0Var = h0.f84049a;
        } finally {
            eb.a.f();
        }
    }

    public final void onHostDestroy$expo_modules_core_release() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if (!(currentActivity instanceof androidx.appcompat.app.c)) {
                Activity currentActivity2 = getCurrentActivity();
                throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + (currentActivity2 != null ? currentActivity2.getLocalClassName() : null)).toString());
            }
            this.activityResultsManager.onHostDestroy((androidx.appcompat.app.c) currentActivity);
        }
        this.hostingRuntimeContext.getRegistry().post(EventName.ACTIVITY_DESTROYS);
        this.hostWasDestroyed = true;
    }

    public final void onHostPause$expo_modules_core_release() {
        this.hostingRuntimeContext.getRegistry().post(EventName.ACTIVITY_ENTERS_BACKGROUND);
    }

    public final void onHostResume$expo_modules_core_release() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        if (currentActivity instanceof androidx.appcompat.app.c) {
            if (this.hostWasDestroyed) {
                this.hostWasDestroyed = false;
                this.hostingRuntimeContext.getRegistry().registerActivityContracts$expo_modules_core_release();
            }
            this.activityResultsManager.onHostResume((androidx.appcompat.app.c) currentActivity);
            this.hostingRuntimeContext.getRegistry().post(EventName.ACTIVITY_ENTERS_FOREGROUND);
            return;
        }
        Activity currentActivity2 = getCurrentActivity();
        throw new IllegalStateException(("Current Activity is of incorrect class, expected AppCompatActivity, received " + (currentActivity2 != null ? currentActivity2.getLocalClassName() : null)).toString());
    }

    public final void onNewIntent$expo_modules_core_release(Intent intent) {
        this.hostingRuntimeContext.getRegistry().post(EventName.ON_NEW_INTENT, intent);
    }

    public final void onUserLeaveHint$expo_modules_core_release() {
        this.hostingRuntimeContext.getRegistry().post(EventName.ON_USER_LEAVES_ACTIVITY);
    }

    public final void setLegacyModulesProxyHolder$expo_modules_core_release(WeakReference<NativeModulesProxy> weakReference) {
        this.legacyModulesProxyHolder = weakReference;
    }
}
