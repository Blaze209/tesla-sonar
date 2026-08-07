package expo.modules.interfaces.permissions;

import androidx.annotation.NonNull;
import expo.modules.core.Promise;
import expo.modules.medialibrary.MediaLibraryConstantsKt;

/* JADX INFO: loaded from: classes8.dex */
public interface Permissions {
    static void askForPermissionsWithPermissionsManager(Permissions permissions, Promise promise, String... strArr) {
        if (permissions == null) {
            promise.reject(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS, "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            permissions.askForPermissionsWithPromise(promise, strArr);
        }
    }

    static void getPermissionsWithPermissionsManager(Permissions permissions, Promise promise, String... strArr) {
        if (permissions == null) {
            promise.reject(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS, "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else {
            permissions.getPermissionsWithPromise(promise, strArr);
        }
    }

    void askForPermissions(PermissionsResponseListener permissionsResponseListener, String... strArr);

    void askForPermissionsWithPromise(Promise promise, String... strArr);

    void getPermissions(PermissionsResponseListener permissionsResponseListener, String... strArr);

    void getPermissionsWithPromise(Promise promise, String... strArr);

    boolean hasGrantedPermissions(String... strArr);

    boolean isPermissionPresentInManifest(String str);

    static void askForPermissionsWithPermissionsManager(Permissions permissions, @NonNull final expo.modules.kotlin.Promise promise, @NonNull String... strArr) {
        askForPermissionsWithPermissionsManager(permissions, new Promise() { // from class: expo.modules.interfaces.permissions.Permissions.2
            @Override // expo.modules.core.Promise
            public void reject(String str, String str2, Throwable th2) {
                promise.reject(str, str2, th2);
            }

            @Override // expo.modules.core.Promise
            public void resolve(Object obj) {
                promise.resolve(obj);
            }
        }, strArr);
    }

    static void getPermissionsWithPermissionsManager(Permissions permissions, @NonNull final expo.modules.kotlin.Promise promise, @NonNull String... strArr) {
        getPermissionsWithPermissionsManager(permissions, new Promise() { // from class: expo.modules.interfaces.permissions.Permissions.1
            @Override // expo.modules.core.Promise
            public void reject(String str, String str2, Throwable th2) {
                promise.reject(str, str2, th2);
            }

            @Override // expo.modules.core.Promise
            public void resolve(Object obj) {
                promise.resolve(obj);
            }
        }, strArr);
    }
}
