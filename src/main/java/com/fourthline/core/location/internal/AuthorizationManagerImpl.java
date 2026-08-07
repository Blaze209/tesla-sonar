package com.fourthline.core.location.internal;

import android.content.Context;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.ActivityResultRegistry;
import androidx.p002activity.result.contract.ActivityResultContracts$RequestMultiplePermissions;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.location.LocationProvider;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\f2\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/fourthline/core/location/internal/AuthorizationManagerImpl;", "Lcom/fourthline/core/location/internal/AuthorizationManager;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/activity/result/ActivityResultRegistry;", "registry", "<init>", "(Landroid/content/Context;Landroidx/activity/result/ActivityResultRegistry;)V", "Lkotlin/Function1;", "", "", "", "Ljn0/h0;", "callback", "requestAuthorization", "(Lwn0/l;)V", "Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "getAuthorizationStatus", "()Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;", "Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "getAuthorizationAccuracy", "()Lcom/fourthline/core/location/LocationProvider$AccuracyAuthorization;", "a", "Landroid/content/Context;", "b", "Landroidx/activity/result/ActivityResultRegistry;", "c", "Z", "isPermissionsRequested", DateTokenConverter.CONVERTER_KEY, "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthorizationManagerImpl implements AuthorizationManager {

    @Deprecated
    public static final String REGISTRY_KEY = "Read Location Permission";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f24141d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultRegistry registry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isPermissionsRequested;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AuthorizationManagerImpl(Context context, ActivityResultRegistry registry) {
        s.k(context, "context");
        s.k(registry, "registry");
        this.context = context;
        this.registry = registry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AuthorizationManagerImpl authorizationManagerImpl, l lVar, Map map) {
        s.h(map);
        if (!map.isEmpty()) {
            authorizationManagerImpl.isPermissionsRequested = true;
        }
        lVar.invoke(map);
    }

    @Override // com.fourthline.core.location.internal.AuthorizationManager
    public LocationProvider.AccuracyAuthorization getAuthorizationAccuracy() {
        return androidx.core.content.f.b(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0 ? LocationProvider.AccuracyAuthorization.FULL : LocationProvider.AccuracyAuthorization.REDUCED;
    }

    @Override // com.fourthline.core.location.internal.AuthorizationManager
    public LocationProvider.AuthorizationStatus getAuthorizationStatus() {
        boolean z11 = (androidx.core.content.f.b(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0) || (androidx.core.content.f.b(this.context, "android.permission.ACCESS_COARSE_LOCATION") == 0);
        if (this.isPermissionsRequested || z11) {
            return z11 ? LocationProvider.AuthorizationStatus.AUTHORIZED : LocationProvider.AuthorizationStatus.DENIED;
        }
        return LocationProvider.AuthorizationStatus.NOT_DETERMINED;
    }

    @Override // com.fourthline.core.location.internal.AuthorizationManager
    public void requestAuthorization(final l<? super Map<String, Boolean>, h0> callback) {
        s.k(callback, "callback");
        ActivityResultLauncher activityResultLauncherL = this.registry.l(REGISTRY_KEY, new ActivityResultContracts$RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.fourthline.core.location.internal.a
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                AuthorizationManagerImpl.a(this.f24161a, callback, (Map) obj);
            }
        });
        s.j(activityResultLauncherL, "register(...)");
        activityResultLauncherL.b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }
}
