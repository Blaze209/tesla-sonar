package com.fourthline.core.location;

import android.content.Context;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultRegistry;
import com.fourthline.core.location.internal.AuthorizationManagerImpl;
import com.fourthline.core.location.internal.LocationAvailabilityCheckerImpl;
import com.fourthline.core.location.internal.LocationFetcherImpl;
import com.fourthline.core.location.internal.LocationProviderImpl;
import com.fourthline.core.location.internal.VpnConnectivityCheckerImpl;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0007\u0010\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/fourthline/core/location/FourthlineLocationHelper;", "", "<init>", "()V", "Landroidx/appcompat/app/c;", "activity", "Lcom/fourthline/core/location/LocationProvider;", "getLocationProvider", "(Landroidx/appcompat/app/c;)Lcom/fourthline/core/location/LocationProvider;", "Landroidx/activity/ComponentActivity;", "(Landroidx/activity/ComponentActivity;)Lcom/fourthline/core/location/LocationProvider;", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)Lcom/fourthline/core/location/LocationProvider;", "Landroid/content/Context;", "applicationContext", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "(Landroid/content/Context;Landroidx/activity/result/ActivityResultRegistry;)Lcom/fourthline/core/location/LocationProvider;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FourthlineLocationHelper {
    public static final FourthlineLocationHelper INSTANCE = new FourthlineLocationHelper();

    private FourthlineLocationHelper() {
    }

    public static final LocationProvider getLocationProvider(c activity) {
        s.k(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        ActivityResultRegistry activityResultRegistry = activity.getActivityResultRegistry();
        s.j(activityResultRegistry, "<get-activityResultRegistry>(...)");
        return getLocationProvider(applicationContext, activityResultRegistry);
    }

    public static final LocationProvider getLocationProvider(ComponentActivity activity) {
        s.k(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        ActivityResultRegistry activityResultRegistry = activity.getActivityResultRegistry();
        s.j(activityResultRegistry, "<get-activityResultRegistry>(...)");
        return getLocationProvider(applicationContext, activityResultRegistry);
    }

    public static final LocationProvider getLocationProvider(Fragment fragment) {
        s.k(fragment, "fragment");
        u uVarRequireActivity = fragment.requireActivity();
        Context applicationContext = uVarRequireActivity.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        ActivityResultRegistry activityResultRegistry = uVarRequireActivity.getActivityResultRegistry();
        s.j(activityResultRegistry, "<get-activityResultRegistry>(...)");
        return getLocationProvider(applicationContext, activityResultRegistry);
    }

    public static final LocationProvider getLocationProvider(Context applicationContext, ActivityResultRegistry registry) {
        s.k(applicationContext, "applicationContext");
        s.k(registry, "registry");
        return new LocationProviderImpl(new AuthorizationManagerImpl(applicationContext, registry), new LocationAvailabilityCheckerImpl(applicationContext), new LocationFetcherImpl(applicationContext, new VpnConnectivityCheckerImpl(applicationContext)));
    }
}
