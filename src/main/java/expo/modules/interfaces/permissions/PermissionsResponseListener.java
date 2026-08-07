package expo.modules.interfaces.permissions;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
@FunctionalInterface
public interface PermissionsResponseListener {
    void onResult(Map<String, PermissionsResponse> map);
}
