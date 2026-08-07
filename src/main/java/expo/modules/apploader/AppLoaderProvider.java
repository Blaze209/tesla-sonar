package expo.modules.apploader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/apploader/AppLoaderProvider;", "", "<init>", "()V", "", "name", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/apploader/HeadlessAppLoader;", "getLoader", "(Ljava/lang/String;Landroid/content/Context;)Lexpo/modules/apploader/HeadlessAppLoader;", "Ljn0/h0;", "createLoader", "(Ljava/lang/String;Landroid/content/Context;)V", "", "loaders", "Ljava/util/Map;", "Callback", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppLoaderProvider {
    public static final AppLoaderProvider INSTANCE = new AppLoaderProvider();
    private static final Map<String, HeadlessAppLoader> loaders = new HashMap();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lexpo/modules/apploader/AppLoaderProvider$Callback;", "", "", "success", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Ljn0/h0;", "onComplete", "(ZLjava/lang/Exception;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Callback {
        void onComplete(boolean success, Exception exception);
    }

    private AppLoaderProvider() {
    }

    private final void createLoader(String name, Context context) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("org.unimodules.core.AppLoader#" + name);
            if (string == null) {
                throw new IllegalStateException("Unable to instantiate AppLoader!");
            }
            Class<?> cls = Class.forName(string);
            s.i(cls, "null cannot be cast to non-null type java.lang.Class<out expo.modules.apploader.HeadlessAppLoader>");
            Map<String, HeadlessAppLoader> map = loaders;
            Object objNewInstance = cls.getDeclaredConstructor(Context.class).newInstance(context);
            s.i(objNewInstance, "null cannot be cast to non-null type expo.modules.apploader.HeadlessAppLoader");
            map.put(name, (HeadlessAppLoader) objNewInstance);
        } catch (PackageManager.NameNotFoundException e11) {
            throw new IllegalStateException("Unable to instantiate AppLoader!", e11);
        }
    }

    public static final HeadlessAppLoader getLoader(String name, Context context) {
        s.k(name, "name");
        s.k(context, "context");
        Map<String, HeadlessAppLoader> map = loaders;
        if (!map.containsKey(name)) {
            try {
                INSTANCE.createLoader(name, context);
            } catch (Exception e11) {
                Log.e("Expo", "Cannot initialize app loader. " + e11.getMessage());
                e11.printStackTrace();
                return null;
            }
        }
        return map.get(name);
    }
}
