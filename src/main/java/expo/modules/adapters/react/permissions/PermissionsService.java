package expo.modules.adapters.react.permissions;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import ch.qos.logback.core.CoreConstants;
import co.f;
import co.g;
import com.facebook.react.bridge.BaseJavaModule;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\fJ3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020*0)0(H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J+\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b3\u00104J+\u00105\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b5\u00104J+\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b8\u00109J+\u0010:\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b:\u00109J#\u0010;\u001a\u00020\n2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r\"\u00020\bH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\fJ\u0017\u0010>\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b>\u0010\u0015J'\u0010@\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\r2\u0006\u0010?\u001a\u000206H\u0014¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010?\u001a\u000206H\u0004¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020\u000fH\u0016¢\u0006\u0004\bC\u0010%J\u000f\u0010D\u001a\u00020\u000fH\u0016¢\u0006\u0004\bD\u0010%J\u000f\u0010E\u001a\u00020\u000fH\u0016¢\u0006\u0004\bE\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001e\u0010P\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR,\u0010T\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r\u0012\u0004\u0012\u0002060S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010OR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lexpo/modules/adapters/react/permissions/PermissionsService;", "Lexpo/modules/core/interfaces/InternalModule;", "Lexpo/modules/interfaces/permissions/Permissions;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "permission", "", "didAsk", "(Ljava/lang/String;)Z", "", "permissions", "Ljn0/h0;", "addToAskedPermissionsCache", "([Ljava/lang/String;)V", "isPermissionGranted", "", "getManifestPermission", "(Ljava/lang/String;)I", PermissionsResponse.CAN_ASK_AGAIN_KEY, "permissionsString", "", "grantResults", "", "Lexpo/modules/interfaces/permissions/PermissionsResponse;", "parseNativeResult", "([Ljava/lang/String;[I)Ljava/util/Map;", "result", "getPermissionResponseFromNativeResponse", "(Ljava/lang/String;I)Lexpo/modules/interfaces/permissions/PermissionsResponse;", "Lco/g;", "createListenerWithPendingPermissionsRequest", "()Lco/g;", "askForWriteSettingsPermissionFirst", "()V", "hasWriteSettingsPermission", "()Z", "", "Ljava/lang/Class;", "", "getExportedInterfaces", "()Ljava/util/List;", "Lexpo/modules/core/ModuleRegistry;", "moduleRegistry", "onCreate", "(Lexpo/modules/core/ModuleRegistry;)V", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getPermissionsWithPromise", "(Lexpo/modules/core/Promise;[Ljava/lang/String;)V", "askForPermissionsWithPromise", "Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "responseListener", "getPermissions", "(Lexpo/modules/interfaces/permissions/PermissionsResponseListener;[Ljava/lang/String;)V", "askForPermissions", "hasGrantedPermissions", "([Ljava/lang/String;)Z", "isPermissionPresentInManifest", "getManifestPermissionFromContext", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "askForManifestPermissions", "([Ljava/lang/String;Lexpo/modules/interfaces/permissions/PermissionsResponseListener;)V", "delegateRequestToActivity", "onHostResume", "onHostPause", "onHostDestroy", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lexpo/modules/core/interfaces/ActivityProvider;", "mActivityProvider", "Lexpo/modules/core/interfaces/ActivityProvider;", "mWriteSettingsPermissionBeingAsked", "Z", "mAskAsyncListener", "Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "mAskAsyncRequestedPermissions", "[Ljava/lang/String;", "Ljava/util/Queue;", "Lkotlin/Pair;", "mPendingPermissionCalls", "Ljava/util/Queue;", "mCurrentPermissionListener", "Landroid/content/SharedPreferences;", "mAskedPermissionsCache", "Landroid/content/SharedPreferences;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class PermissionsService implements InternalModule, Permissions, LifecycleEventListener {
    private final Context context;
    private ActivityProvider mActivityProvider;
    private PermissionsResponseListener mAskAsyncListener;
    private String[] mAskAsyncRequestedPermissions;
    private SharedPreferences mAskedPermissionsCache;
    private PermissionsResponseListener mCurrentPermissionListener;
    private final Queue<Pair<String[], PermissionsResponseListener>> mPendingPermissionCalls;
    private boolean mWriteSettingsPermissionBeingAsked;

    public PermissionsService(Context context) {
        s.k(context, "context");
        this.context = context;
        this.mPendingPermissionCalls = new LinkedList();
    }

    private final void addToAskedPermissionsCache(String[] permissions) {
        SharedPreferences sharedPreferences = this.mAskedPermissionsCache;
        if (sharedPreferences == null) {
            s.B("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : permissions) {
            editorEdit.putBoolean(str, true);
        }
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void askForPermissions$lambda$10(PermissionsService permissionsService, PermissionsResponseListener permissionsResponseListener, Map map) {
        int i11 = permissionsService.hasWriteSettingsPermission() ? 0 : -1;
        s.h(map);
        map.put("android.permission.WRITE_SETTINGS", permissionsService.getPermissionResponseFromNativeResponse("android.permission.WRITE_SETTINGS", i11));
        permissionsResponseListener.onResult(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void askForPermissionsWithPromise$lambda$7(PermissionsService permissionsService, Promise promise, String[] strArr, Map map) {
        permissionsService.getPermissionsWithPromise(promise, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private final void askForWriteSettingsPermissionFirst() {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + this.context.getPackageName()));
        intent.addFlags(268435456);
        this.mWriteSettingsPermissionBeingAsked = true;
        this.context.startActivity(intent);
    }

    private final boolean canAskAgain(String permission) {
        Activity currentActivity;
        ActivityProvider activityProvider = this.mActivityProvider;
        return (activityProvider == null || (currentActivity = activityProvider.getCurrentActivity()) == null || !androidx.core.app.b.i(currentActivity, permission)) ? false : true;
    }

    private final g createListenerWithPendingPermissionsRequest() {
        return new g() { // from class: expo.modules.adapters.react.permissions.c
            @Override // co.g
            public final boolean onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
                return PermissionsService.createListenerWithPendingPermissionsRequest$lambda$21(this.f63276a, i11, strArr, iArr);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createListenerWithPendingPermissionsRequest$lambda$21(PermissionsService permissionsService, int i11, String[] receivePermissions, int[] grantResults) {
        s.k(receivePermissions, "receivePermissions");
        s.k(grantResults, "grantResults");
        if (i11 != 13) {
            return false;
        }
        synchronized (permissionsService) {
            try {
                PermissionsResponseListener permissionsResponseListener = permissionsService.mCurrentPermissionListener;
                if (permissionsResponseListener == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                permissionsResponseListener.onResult(permissionsService.parseNativeResult(receivePermissions, grantResults));
                permissionsService.mCurrentPermissionListener = null;
                Pair<String[], PermissionsResponseListener> pairPoll = permissionsService.mPendingPermissionCalls.poll();
                if (pairPoll != null) {
                    ActivityProvider activityProvider = permissionsService.mActivityProvider;
                    Activity currentActivity = activityProvider != null ? activityProvider.getCurrentActivity() : null;
                    f fVar = currentActivity instanceof f ? (f) currentActivity : null;
                    if (fVar != null) {
                        permissionsService.mCurrentPermissionListener = pairPoll.f();
                        fVar.a(pairPoll.e(), 13, permissionsService.createListenerWithPendingPermissionsRequest());
                        return false;
                    }
                    PermissionsResponseListener permissionsResponseListenerF = pairPoll.f();
                    String[] strArrE = pairPoll.e();
                    int length = pairPoll.e().length;
                    int[] iArr = new int[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        iArr[i12] = -1;
                    }
                    permissionsResponseListenerF.onResult(permissionsService.parseNativeResult(strArrE, iArr));
                    Iterator<T> it = permissionsService.mPendingPermissionCalls.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        PermissionsResponseListener permissionsResponseListener2 = (PermissionsResponseListener) pair.f();
                        String[] strArr = (String[]) pair.e();
                        int length2 = ((Object[]) pair.e()).length;
                        int[] iArr2 = new int[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            iArr2[i13] = -1;
                        }
                        permissionsResponseListener2.onResult(permissionsService.parseNativeResult(strArr, iArr2));
                    }
                    permissionsService.mPendingPermissionCalls.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final boolean didAsk(String permission) {
        SharedPreferences sharedPreferences = this.mAskedPermissionsCache;
        if (sharedPreferences == null) {
            s.B("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(permission, false);
    }

    private final int getManifestPermission(String permission) {
        Activity currentActivity;
        ActivityProvider activityProvider = this.mActivityProvider;
        return (activityProvider == null || (currentActivity = activityProvider.getCurrentActivity()) == null || !(currentActivity instanceof f)) ? getManifestPermissionFromContext(permission) : androidx.core.content.b.checkSelfPermission(currentActivity, permission);
    }

    private final PermissionsResponse getPermissionResponseFromNativeResponse(String permission, int result) {
        PermissionsStatus permissionsStatus;
        if (result == 0) {
            permissionsStatus = PermissionsStatus.GRANTED;
        } else {
            permissionsStatus = didAsk(permission) ? PermissionsStatus.DENIED : PermissionsStatus.UNDETERMINED;
        }
        return new PermissionsResponse(permissionsStatus, permissionsStatus == PermissionsStatus.DENIED ? canAskAgain(permission) : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getPermissionsWithPromise$lambda$6(Promise promise, Map permissionsMap) {
        boolean z11;
        boolean z12;
        String status;
        s.k(permissionsMap, "permissionsMap");
        boolean z13 = false;
        if (!permissionsMap.isEmpty()) {
            Iterator it = permissionsMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                } else if (((PermissionsResponse) ((Map.Entry) it.next()).getValue()).getStatus() != PermissionsStatus.GRANTED) {
                    z11 = false;
                    break;
                }
            }
        } else {
            z11 = true;
            break;
        }
        if (permissionsMap.isEmpty()) {
            z12 = false;
        } else {
            if (!permissionsMap.isEmpty()) {
                Iterator it2 = permissionsMap.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((PermissionsResponse) ((Map.Entry) it2.next()).getValue()).getStatus() != PermissionsStatus.DENIED) {
                            z12 = false;
                        }
                    }
                }
            }
            z12 = true;
        }
        if (!permissionsMap.isEmpty()) {
            Iterator it3 = permissionsMap.entrySet().iterator();
            do {
                if (!it3.hasNext()) {
                    z13 = true;
                    break;
                }
            } while (((PermissionsResponse) ((Map.Entry) it3.next()).getValue()).getCanAskAgain());
        } else {
            z13 = true;
            break;
        }
        Bundle bundle = new Bundle();
        bundle.putString(PermissionsResponse.EXPIRES_KEY, PermissionsResponse.PERMISSION_EXPIRES_NEVER);
        if (z11) {
            status = PermissionsStatus.GRANTED.getStatus();
        } else {
            status = z12 ? PermissionsStatus.DENIED.getStatus() : PermissionsStatus.UNDETERMINED.getStatus();
        }
        bundle.putString(PermissionsResponse.STATUS_KEY, status);
        bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, z13);
        bundle.putBoolean(PermissionsResponse.GRANTED_KEY, z11);
        promise.resolve(bundle);
    }

    private final boolean hasWriteSettingsPermission() {
        return Settings.System.canWrite(this.context.getApplicationContext());
    }

    private final boolean isPermissionGranted(String permission) {
        if (s.f(permission, "android.permission.WRITE_SETTINGS")) {
            return hasWriteSettingsPermission();
        }
        return getManifestPermission(permission) == 0;
    }

    private final Map<String, PermissionsResponse> parseNativeResult(String[] permissionsString, int[] grantResults) {
        HashMap map = new HashMap();
        for (Pair pair : n.M1(grantResults, permissionsString)) {
            int iIntValue = ((Number) pair.a()).intValue();
            String str = (String) pair.b();
            map.put(str, getPermissionResponseFromNativeResponse(str, iIntValue));
        }
        return map;
    }

    protected void askForManifestPermissions(String[] permissions, PermissionsResponseListener listener) {
        s.k(permissions, "permissions");
        s.k(listener, "listener");
        delegateRequestToActivity((String[]) Arrays.copyOf(permissions, permissions.length), listener);
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void askForPermissions(final PermissionsResponseListener responseListener, String... permissions) {
        s.k(responseListener, "responseListener");
        s.k(permissions, "permissions");
        if (permissions.length == 0) {
            responseListener.onResult(new LinkedHashMap());
            return;
        }
        if (!n.e0(permissions, "android.permission.WRITE_SETTINGS")) {
            askForManifestPermissions(permissions, responseListener);
            return;
        }
        List listF1 = n.F1(permissions);
        listF1.remove("android.permission.WRITE_SETTINGS");
        String[] strArr = (String[]) listF1.toArray(new String[0]);
        PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.adapters.react.permissions.b
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                PermissionsService.askForPermissions$lambda$10(this.f63274a, responseListener, map);
            }
        };
        if (hasWriteSettingsPermission()) {
            if (strArr.length == 0) {
                permissionsResponseListener.onResult(new LinkedHashMap());
                return;
            } else {
                askForManifestPermissions(strArr, permissionsResponseListener);
                return;
            }
        }
        if (this.mAskAsyncListener != null) {
            throw new IllegalStateException("Another permissions request is in progress. Await the old request and then try again.");
        }
        this.mAskAsyncListener = permissionsResponseListener;
        this.mAskAsyncRequestedPermissions = strArr;
        addToAskedPermissionsCache(new String[]{"android.permission.WRITE_SETTINGS"});
        askForWriteSettingsPermissionFirst();
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void askForPermissionsWithPromise(final Promise promise, final String... permissions) {
        s.k(promise, "promise");
        s.k(permissions, "permissions");
        askForPermissions(new PermissionsResponseListener() { // from class: expo.modules.adapters.react.permissions.a
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                PermissionsService.askForPermissionsWithPromise$lambda$7(this.f63271a, promise, permissions, map);
            }
        }, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    protected final void delegateRequestToActivity(String[] permissions, PermissionsResponseListener listener) {
        s.k(permissions, "permissions");
        s.k(listener, "listener");
        addToAskedPermissionsCache(permissions);
        ActivityProvider activityProvider = this.mActivityProvider;
        ComponentCallbacks2 currentActivity = activityProvider != null ? activityProvider.getCurrentActivity() : null;
        if (!(currentActivity instanceof f)) {
            int length = permissions.length;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = -1;
            }
            listener.onResult(parseNativeResult(permissions, iArr));
            return;
        }
        synchronized (this) {
            try {
                if (this.mCurrentPermissionListener != null) {
                    this.mPendingPermissionCalls.add(x.a(permissions, listener));
                } else {
                    this.mCurrentPermissionListener = listener;
                    ((f) currentActivity).a(permissions, 13, createListenerWithPendingPermissionsRequest());
                    h0 h0Var = h0.f84049a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<? extends Object>> getExportedInterfaces() {
        return v.e(Permissions.class);
    }

    protected int getManifestPermissionFromContext(String permission) {
        s.k(permission, "permission");
        return androidx.core.content.b.checkSelfPermission(this.context, permission);
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void getPermissions(PermissionsResponseListener responseListener, String... permissions) {
        s.k(responseListener, "responseListener");
        s.k(permissions, "permissions");
        ArrayList arrayList = new ArrayList(permissions.length);
        for (String str : permissions) {
            arrayList.add(Integer.valueOf(isPermissionGranted(str) ? 0 : -1));
        }
        responseListener.onResult(parseNativeResult(permissions, v.l1(arrayList)));
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void getPermissionsWithPromise(final Promise promise, String... permissions) {
        s.k(promise, "promise");
        s.k(permissions, "permissions");
        getPermissions(new PermissionsResponseListener() { // from class: expo.modules.adapters.react.permissions.d
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                PermissionsService.getPermissionsWithPromise$lambda$6(promise, map);
            }
        }, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public boolean hasGrantedPermissions(String... permissions) {
        s.k(permissions, "permissions");
        for (String str : permissions) {
            if (!isPermissionGranted(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public boolean isPermissionPresentInManifest(String permission) {
        s.k(permission, "permission");
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 4096);
            if (packageInfo != null) {
                String[] strArr = packageInfo.requestedPermissions;
                s.h(strArr);
                return n.e0(strArr, permission);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.k(moduleRegistry, "moduleRegistry");
        ActivityProvider activityProvider = (ActivityProvider) moduleRegistry.getModule(ActivityProvider.class);
        if (activityProvider == null) {
            throw new IllegalStateException("Couldn't find implementation for ActivityProvider.");
        }
        this.mActivityProvider = activityProvider;
        ((UIManager) moduleRegistry.getModule(UIManager.class)).registerLifecycleEventListener(this);
        this.mAskedPermissionsCache = this.context.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0);
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        if (this.mWriteSettingsPermissionBeingAsked) {
            this.mWriteSettingsPermissionBeingAsked = false;
            PermissionsResponseListener permissionsResponseListener = this.mAskAsyncListener;
            s.h(permissionsResponseListener);
            String[] strArr = this.mAskAsyncRequestedPermissions;
            s.h(strArr);
            this.mAskAsyncListener = null;
            this.mAskAsyncRequestedPermissions = null;
            if (strArr.length == 0) {
                permissionsResponseListener.onResult(new LinkedHashMap());
            } else {
                askForManifestPermissions(strArr, permissionsResponseListener);
            }
        }
    }
}
