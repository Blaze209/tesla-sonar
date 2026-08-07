package expo.modules.medialibrary;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsStatus;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lexpo/modules/medialibrary/MediaLibraryPermissionPromiseWrapper;", "Lexpo/modules/kotlin/Promise;", "", "Lexpo/modules/medialibrary/GranularPermission;", "granularPermissions", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "contextHolder", "<init>", "(Ljava/util/List;Lexpo/modules/kotlin/Promise;Ljava/lang/ref/WeakReference;)V", "Landroid/os/Bundle;", "permissionsBundle", "addOnlySelectedInfoToPermissionsBundle", "(Landroid/os/Bundle;Ljava/util/List;)Landroid/os/Bundle;", "", "value", "Ljn0/h0;", "resolve", "(Ljava/lang/Object;)V", "", "code", "message", "", "cause", "reject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/util/List;", "Lexpo/modules/kotlin/Promise;", "Ljava/lang/ref/WeakReference;", "Companion", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaLibraryPermissionPromiseWrapper implements Promise {
    public static final String ACCESS_PRIVILEGES_PERMISSION_KEY = "accessPrivileges";
    private final WeakReference<Context> contextHolder;
    private final List<GranularPermission> granularPermissions;
    private final Promise promise;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaLibraryPermissionPromiseWrapper(List<? extends GranularPermission> granularPermissions, Promise promise, WeakReference<Context> contextHolder) {
        s.k(granularPermissions, "granularPermissions");
        s.k(promise, "promise");
        s.k(contextHolder, "contextHolder");
        this.granularPermissions = granularPermissions;
        this.promise = promise;
        this.contextHolder = contextHolder;
    }

    private final Bundle addOnlySelectedInfoToPermissionsBundle(Bundle permissionsBundle, List<? extends GranularPermission> granularPermissions) {
        Context context = this.contextHolder.get();
        if (context == null) {
            return permissionsBundle;
        }
        boolean z11 = permissionsBundle.getBoolean(PermissionsResponse.GRANTED_KEY);
        if (Build.VERSION.SDK_INT < 34) {
            permissionsBundle.putString("accessPrivileges", (z11 ? AccessPrivileges.ALL : AccessPrivileges.NONE).getValue());
            return permissionsBundle;
        }
        if (z11) {
            permissionsBundle.putString("accessPrivileges", AccessPrivileges.ALL.getValue());
            return permissionsBundle;
        }
        boolean zContains = granularPermissions.contains(GranularPermission.AUDIO);
        boolean z12 = androidx.core.content.b.checkSelfPermission(context, "android.permission.READ_MEDIA_AUDIO") == 0;
        boolean z13 = androidx.core.content.b.checkSelfPermission(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0;
        if ((zContains && !z12) || !z13) {
            permissionsBundle.putString("accessPrivileges", AccessPrivileges.NONE.getValue());
            return permissionsBundle;
        }
        permissionsBundle.putBoolean(PermissionsResponse.GRANTED_KEY, true);
        permissionsBundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, true);
        permissionsBundle.putString(PermissionsResponse.STATUS_KEY, PermissionsStatus.GRANTED.getStatus());
        permissionsBundle.putString("accessPrivileges", AccessPrivileges.LIMITED.getValue());
        return permissionsBundle;
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(CodedException codedException) {
        Promise.DefaultImpls.reject(this, codedException);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve() {
        Promise.DefaultImpls.resolve(this);
    }

    @Override // expo.modules.kotlin.Promise
    public void reject(String code, String message, Throwable cause) {
        s.k(code, "code");
        this.promise.reject(code, message, cause);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(double d11) {
        Promise.DefaultImpls.resolve(this, d11);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(float f11) {
        Promise.DefaultImpls.resolve((Promise) this, f11);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(int i11) {
        Promise.DefaultImpls.resolve((Promise) this, i11);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(String str) {
        Promise.DefaultImpls.resolve(this, str);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Collection<? extends Object> collection) {
        Promise.DefaultImpls.resolve(this, collection);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Map<String, ? extends Object> map) {
        Promise.DefaultImpls.resolve(this, map);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(boolean z11) {
        Promise.DefaultImpls.resolve(this, z11);
    }

    @Override // expo.modules.kotlin.Promise
    public void resolve(Object value) {
        if (!(value instanceof Bundle)) {
            this.promise.resolve(value);
        } else {
            this.promise.resolve(addOnlySelectedInfoToPermissionsBundle((Bundle) value, this.granularPermissions));
        }
    }
}
