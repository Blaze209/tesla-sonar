package com.facebook.react.modules.permissions;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.SparseArray;
import co.f;
import co.g;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xn.a;

/* JADX INFO: loaded from: classes3.dex */
@a(name = "PermissionsAndroid")
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/facebook/react/modules/permissions/PermissionsModule;", "Lcom/facebook/fbreact/specs/NativePermissionsAndroidSpec;", "Lco/g;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "permission", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "checkPermission", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "shouldShowRequestPermissionRationale", "requestPermission", "Lcom/facebook/react/bridge/ReadableArray;", "permissions", "requestMultiplePermissions", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "", "requestCode", "", "", "grantResults", "", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)Z", "Landroid/util/SparseArray;", "Lcom/facebook/react/bridge/Callback;", "callbacks", "Landroid/util/SparseArray;", "I", "GRANTED", "Ljava/lang/String;", "DENIED", "NEVER_ASK_AGAIN", "Lco/f;", "getPermissionAwareActivity", "()Lco/f;", "permissionAwareActivity", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionsModule extends NativePermissionsAndroidSpec implements g {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> callbacks;
    private int requestCode;

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002\"\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/facebook/react/modules/permissions/PermissionsModule$b", "Lcom/facebook/react/bridge/Callback;", "", "", "args", "Ljn0/h0;", "invoke", "([Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f22853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WritableNativeMap f22854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PermissionsModule f22855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Promise f22856d;

        b(ArrayList<String> arrayList, WritableNativeMap writableNativeMap, PermissionsModule permissionsModule, Promise promise) {
            this.f22853a = arrayList;
            this.f22854b = writableNativeMap;
            this.f22855c = permissionsModule;
            this.f22856d = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... args) {
            s.k(args, "args");
            Object obj = args[0];
            s.i(obj, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr = (int[]) obj;
            Object obj2 = args[1];
            s.i(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
            f fVar = (f) obj2;
            int size = this.f22853a.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str = this.f22853a.get(i11);
                s.j(str, "get(...)");
                String str2 = str;
                if (iArr.length > i11 && iArr[i11] == 0) {
                    this.f22854b.putString(str2, this.f22855c.GRANTED);
                } else if (fVar.shouldShowRequestPermissionRationale(str2)) {
                    this.f22854b.putString(str2, this.f22855c.DENIED);
                } else {
                    this.f22854b.putString(str2, this.f22855c.NEVER_ASK_AGAIN);
                }
            }
            this.f22856d.resolve(this.f22854b);
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0002\"\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/facebook/react/modules/permissions/PermissionsModule$c", "Lcom/facebook/react/bridge/Callback;", "", "", "args", "Ljn0/h0;", "invoke", "([Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f22857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PermissionsModule f22858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22859c;

        c(Promise promise, PermissionsModule permissionsModule, String str) {
            this.f22857a = promise;
            this.f22858b = permissionsModule;
            this.f22859c = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... args) {
            s.k(args, "args");
            Object obj = args[0];
            s.i(obj, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr = (int[]) obj;
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f22857a.resolve(this.f22858b.GRANTED);
                return;
            }
            Object obj2 = args[1];
            s.i(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
            if (((f) obj2).shouldShowRequestPermissionRationale(this.f22859c)) {
                this.f22857a.resolve(this.f22858b.DENIED);
            } else {
                this.f22857a.resolve(this.f22858b.NEVER_ASK_AGAIN);
            }
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callbacks = new SparseArray<>();
        this.GRANTED = PermissionsResponse.GRANTED_KEY;
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
    }

    private final f getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof f) {
            return (f) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(String permission, Promise promise) {
        s.k(permission, "permission");
        s.k(promise, "promise");
        promise.resolve(Boolean.valueOf(getReactApplicationContext().getBaseContext().checkSelfPermission(permission) == 0));
    }

    @Override // co.g
    public boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        s.k(permissions, "permissions");
        s.k(grantResults, "grantResults");
        try {
            Callback callback = this.callbacks.get(requestCode);
            if (callback != null) {
                callback.invoke(grantResults, getPermissionAwareActivity());
                this.callbacks.remove(requestCode);
            } else {
                qk.a.K("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(requestCode));
            }
            return this.callbacks.size() == 0;
        } catch (IllegalStateException e11) {
            qk.a.p("PermissionsModule", e11, "Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", new Object[0]);
            return false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(ReadableArray permissions, Promise promise) {
        s.k(permissions, "permissions");
        s.k(promise, "promise");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int size = permissions.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            String string = permissions.getString(i12);
            if (string != null) {
                if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, this.GRANTED);
                    i11++;
                } else {
                    arrayList.add(string);
                }
            }
        }
        if (permissions.size() == i11) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            f permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new b(arrayList, writableNativeMap, this, promise));
            permissionAwareActivity.a((String[]) arrayList.toArray(new String[0]), this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e11) {
            promise.reject(ERROR_INVALID_ACTIVITY, e11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(String permission, Promise promise) {
        s.k(permission, "permission");
        s.k(promise, "promise");
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(permission) == 0) {
            promise.resolve(this.GRANTED);
            return;
        }
        try {
            f permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new c(promise, this, permission));
            permissionAwareActivity.a(new String[]{permission}, this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e11) {
            promise.reject(ERROR_INVALID_ACTIVITY, e11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(String permission, Promise promise) {
        s.k(permission, "permission");
        s.k(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(permission)));
        } catch (IllegalStateException e11) {
            promise.reject(ERROR_INVALID_ACTIVITY, e11);
        }
    }
}
