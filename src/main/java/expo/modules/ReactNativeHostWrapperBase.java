package expo.modules;

import android.app.Application;
import com.facebook.react.b0;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.j0;
import com.facebook.react.o0;
import com.facebook.react.p0;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactNativeHostHandler;
import ezvcard.property.Kind;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R%\u0010)\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010'0'0&8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001dR \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lexpo/modules/ReactNativeHostWrapperBase;", "Lcom/facebook/react/defaults/d;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/facebook/react/o0;", "host", "<init>", "(Landroid/app/Application;Lcom/facebook/react/o0;)V", "Lcom/facebook/react/j0;", "reactInstanceManager", "Ljn0/h0;", "injectHostReactInstanceManager", "(Lcom/facebook/react/j0;)V", "createReactInstanceManager", "()Lcom/facebook/react/j0;", "Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "getJavaScriptExecutorFactory", "()Lcom/facebook/react/bridge/JavaScriptExecutorFactory;", "", "getJSMainModuleName", "()Ljava/lang/String;", "getJSBundleFile", "getBundleAssetName", "", "getUseDeveloperSupport", "()Z", "", "Lcom/facebook/react/p0;", "getPackages", "()Ljava/util/List;", "T", "name", "invokeDelegateMethod$expo_release", "(Ljava/lang/String;)Ljava/lang/Object;", "invokeDelegateMethod", "Lcom/facebook/react/o0;", "getHost", "()Lcom/facebook/react/o0;", "", "Lexpo/modules/core/interfaces/ReactNativeHostHandler;", "kotlin.jvm.PlatformType", "reactNativeHostHandlers", "Ljava/util/List;", "getReactNativeHostHandlers", "Landroidx/collection/a;", "Ljava/lang/reflect/Method;", "methodMap", "Landroidx/collection/a;", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ReactNativeHostWrapperBase extends com.facebook.react.defaults.d {
    private final o0 host;
    private final androidx.collection.a<String, Method> methodMap;
    private final List<ReactNativeHostHandler> reactNativeHostHandlers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeHostWrapperBase(Application application, o0 host) {
        super(application);
        s.k(application, "application");
        s.k(host, "host");
        this.host = host;
        List<Package> packageList = ExpoModulesPackage.INSTANCE.getPackageList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = packageList.iterator();
        while (it.hasNext()) {
            List<? extends ReactNativeHostHandler> listCreateReactNativeHostHandlers = ((Package) it.next()).createReactNativeHostHandlers(application);
            s.j(listCreateReactNativeHostHandlers, "createReactNativeHostHandlers(...)");
            v.E(arrayList, listCreateReactNativeHostHandlers);
        }
        this.reactNativeHostHandlers = arrayList;
        this.methodMap = new androidx.collection.a<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBundleAssetName$lambda$5(ReactNativeHostWrapperBase reactNativeHostWrapperBase, ReactNativeHostHandler reactNativeHostHandler) {
        return reactNativeHostHandler.getBundleAssetName(reactNativeHostWrapperBase.getUseDeveloperSupport());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getJSBundleFile$lambda$4(ReactNativeHostWrapperBase reactNativeHostWrapperBase, ReactNativeHostHandler reactNativeHostHandler) {
        return reactNativeHostHandler.getJSBundleFile(reactNativeHostWrapperBase.getUseDeveloperSupport());
    }

    private final void injectHostReactInstanceManager(j0 reactInstanceManager) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = o0.class.getDeclaredField("mReactInstanceManager");
        declaredField.setAccessible(true);
        declaredField.set(this.host, reactInstanceManager);
    }

    @Override // com.facebook.react.o0
    protected j0 createReactInstanceManager() throws IllegalAccessException, NoSuchFieldException {
        final boolean useDeveloperSupport = getUseDeveloperSupport();
        Iterator<T> it = this.reactNativeHostHandlers.iterator();
        while (it.hasNext()) {
            ((ReactNativeHostHandler) it.next()).onWillCreateReactInstance(useDeveloperSupport);
        }
        j0 j0VarCreateReactInstanceManager = super.createReactInstanceManager();
        Iterator<T> it2 = this.reactNativeHostHandlers.iterator();
        while (it2.hasNext()) {
            ((ReactNativeHostHandler) it2.next()).onDidCreateDevSupportManager(j0VarCreateReactInstanceManager.F());
        }
        j0VarCreateReactInstanceManager.s(new b0() { // from class: expo.modules.ReactNativeHostWrapperBase.createReactInstanceManager.3
            @Override // com.facebook.react.b0
            public void onReactContextInitialized(ReactContext context) {
                s.k(context, "context");
                List<ReactNativeHostHandler> reactNativeHostHandlers = ReactNativeHostWrapperBase.this.getReactNativeHostHandlers();
                boolean z11 = useDeveloperSupport;
                Iterator<T> it3 = reactNativeHostHandlers.iterator();
                while (it3.hasNext()) {
                    ((ReactNativeHostHandler) it3.next()).onDidCreateReactInstance(z11, context);
                }
            }
        });
        s.h(j0VarCreateReactInstanceManager);
        injectHostReactInstanceManager(j0VarCreateReactInstanceManager);
        return j0VarCreateReactInstanceManager;
    }

    @Override // com.facebook.react.o0
    public String getBundleAssetName() {
        String str = (String) ho0.l.M(ho0.l.V(v.e0(this.reactNativeHostHandlers), new wn0.l() { // from class: expo.modules.m
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return ReactNativeHostWrapperBase.getBundleAssetName$lambda$5(this.f63408a, (ReactNativeHostHandler) obj);
            }
        }));
        return str == null ? (String) invokeDelegateMethod$expo_release("getBundleAssetName") : str;
    }

    protected final o0 getHost() {
        return this.host;
    }

    @Override // com.facebook.react.o0
    public String getJSBundleFile() {
        String str = (String) ho0.l.M(ho0.l.V(v.e0(this.reactNativeHostHandlers), new wn0.l() { // from class: expo.modules.k
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return ReactNativeHostWrapperBase.getJSBundleFile$lambda$4(this.f63327a, (ReactNativeHostHandler) obj);
            }
        }));
        return str == null ? (String) invokeDelegateMethod$expo_release("getJSBundleFile") : str;
    }

    @Override // com.facebook.react.o0
    public String getJSMainModuleName() {
        return (String) invokeDelegateMethod$expo_release("getJSMainModuleName");
    }

    @Override // com.facebook.react.o0
    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        JavaScriptExecutorFactory javaScriptExecutorFactory = (JavaScriptExecutorFactory) ho0.l.M(ho0.l.V(v.e0(this.reactNativeHostHandlers), new wn0.l() { // from class: expo.modules.l
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return ((ReactNativeHostHandler) obj).getJavaScriptExecutorFactory();
            }
        }));
        return javaScriptExecutorFactory == null ? (JavaScriptExecutorFactory) invokeDelegateMethod$expo_release("getJavaScriptExecutorFactory") : javaScriptExecutorFactory;
    }

    @Override // com.facebook.react.o0
    public List<p0> getPackages() {
        return (List) invokeDelegateMethod$expo_release("getPackages");
    }

    public final List<ReactNativeHostHandler> getReactNativeHostHandlers() {
        return this.reactNativeHostHandlers;
    }

    @Override // com.facebook.react.o0
    public boolean getUseDeveloperSupport() {
        Boolean bool = (Boolean) ho0.l.M(ho0.l.V(v.e0(this.reactNativeHostHandlers), new wn0.l() { // from class: expo.modules.j
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return ((ReactNativeHostHandler) obj).getUseDeveloperSupport();
            }
        }));
        return bool != null ? bool.booleanValue() : this.host.getUseDeveloperSupport();
    }

    public final <T> T invokeDelegateMethod$expo_release(String name) throws NoSuchMethodException {
        s.k(name, "name");
        Method declaredMethod = this.methodMap.get(name);
        if (declaredMethod == null) {
            declaredMethod = o0.class.getDeclaredMethod(name, null);
            declaredMethod.setAccessible(true);
            this.methodMap.put(name, declaredMethod);
        }
        s.h(declaredMethod);
        return (T) declaredMethod.invoke(this.host, null);
    }
}
