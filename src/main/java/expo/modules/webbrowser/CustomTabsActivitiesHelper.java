package expo.modules.webbrowser;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.d;
import expo.modules.kotlin.AppContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR!\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000f0 j\b\u0012\u0004\u0012\u00020\u000f`!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R!\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u000f0 j\b\u0012\u0004\u0012\u00020\u000f`!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0013\u0010)\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lexpo/modules/webbrowser/CustomTabsActivitiesHelper;", "", "Lexpo/modules/kotlin/AppContext;", "appContext", "<init>", "(Lexpo/modules/kotlin/AppContext;)V", "Landroidx/browser/customtabs/d;", "customTabsIntent", "", "Landroid/content/pm/ResolveInfo;", "getResolvingActivities", "(Landroidx/browser/customtabs/d;)Ljava/util/List;", "", "canResolveIntent", "(Landroidx/browser/customtabs/d;)Z", "", "packages", "getPreferredCustomTabsResolvingActivity", "(Ljava/util/List;)Ljava/lang/String;", "tabsIntent", "Ljn0/h0;", "startCustomTabs", "(Landroidx/browser/customtabs/d;)V", "Lexpo/modules/kotlin/AppContext;", "Landroid/content/pm/PackageManager;", "getPackageManager", "()Landroid/content/pm/PackageManager;", "packageManager", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCustomTabsResolvingActivities", "()Ljava/util/ArrayList;", "customTabsResolvingActivities", "getCustomTabsResolvingServices", "customTabsResolvingServices", "getDefaultCustomTabsResolvingActivity", "()Ljava/lang/String;", "defaultCustomTabsResolvingActivity", "expo-web-browser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomTabsActivitiesHelper {
    private final AppContext appContext;

    public CustomTabsActivitiesHelper(AppContext appContext) {
        s.k(appContext, "appContext");
        this.appContext = appContext;
    }

    private final Activity getCurrentActivity() {
        return this.appContext.getThrowingActivity();
    }

    private final PackageManager getPackageManager() throws PackageManagerNotFoundException {
        PackageManager packageManager = getCurrentActivity().getPackageManager();
        if (packageManager != null) {
            return packageManager;
        }
        throw new PackageManagerNotFoundException();
    }

    private final List<ResolveInfo> getResolvingActivities(d customTabsIntent) {
        List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(customTabsIntent.f2960a, 0);
        s.j(listQueryIntentActivities, "queryIntentActivities(...)");
        return listQueryIntentActivities;
    }

    public final boolean canResolveIntent(d customTabsIntent) {
        s.k(customTabsIntent, "customTabsIntent");
        return !getResolvingActivities(customTabsIntent).isEmpty();
    }

    public final ArrayList<String> getCustomTabsResolvingActivities() {
        List<ResolveInfo> resolvingActivities = getResolvingActivities(CustomTabsActivitiesHelperKt.createDefaultCustomTabsIntent());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<ResolveInfo> it = resolvingActivities.iterator();
        while (it.hasNext()) {
            String packageName = it.next().activityInfo.packageName;
            s.j(packageName, "packageName");
            linkedHashSet.add(packageName);
        }
        return new ArrayList<>(linkedHashSet);
    }

    public final ArrayList<String> getCustomTabsResolvingServices() {
        List<ResolveInfo> listQueryIntentServices = getPackageManager().queryIntentServices(CustomTabsActivitiesHelperKt.createDefaultCustomTabsServiceIntent(), 0);
        s.j(listQueryIntentServices, "queryIntentServices(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            String packageName = it.next().serviceInfo.packageName;
            s.j(packageName, "packageName");
            linkedHashSet.add(packageName);
        }
        return new ArrayList<>(linkedHashSet);
    }

    public final String getDefaultCustomTabsResolvingActivity() {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(CustomTabsActivitiesHelperKt.createDefaultCustomTabsIntent().f2960a, 0);
        if (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }

    public final String getPreferredCustomTabsResolvingActivity(List<String> packages) {
        if (packages == null) {
            packages = getCustomTabsResolvingActivities();
        }
        return androidx.browser.customtabs.c.c(getCurrentActivity(), packages);
    }

    public final void startCustomTabs(d tabsIntent) throws NoUrlProvidedException {
        s.k(tabsIntent, "tabsIntent");
        Uri data = tabsIntent.f2960a.getData();
        if (data == null) {
            throw new NoUrlProvidedException();
        }
        tabsIntent.a(getCurrentActivity(), data);
    }
}
