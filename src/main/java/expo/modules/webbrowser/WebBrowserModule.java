package expo.modules.webbrowser;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import ch.qos.logback.core.CoreConstants;
import co0.q;
import expo.modules.core.errors.CurrentActivityNotFoundException;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.util.ArrayList;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lexpo/modules/webbrowser/WebBrowserModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lexpo/modules/webbrowser/OpenBrowserOptions;", "options", "Landroidx/browser/customtabs/d;", "createCustomTabsIntent", "(Lexpo/modules/webbrowser/OpenBrowserOptions;)Landroidx/browser/customtabs/d;", "", "packageName", "givenOrPreferredPackageName", "(Ljava/lang/String;)Ljava/lang/String;", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Lexpo/modules/webbrowser/CustomTabsActivitiesHelper;", "customTabsResolver", "Lexpo/modules/webbrowser/CustomTabsActivitiesHelper;", "getCustomTabsResolver$expo_web_browser_release", "()Lexpo/modules/webbrowser/CustomTabsActivitiesHelper;", "setCustomTabsResolver$expo_web_browser_release", "(Lexpo/modules/webbrowser/CustomTabsActivitiesHelper;)V", "Lexpo/modules/webbrowser/CustomTabsConnectionHelper;", "connectionHelper", "Lexpo/modules/webbrowser/CustomTabsConnectionHelper;", "getConnectionHelper$expo_web_browser_release", "()Lexpo/modules/webbrowser/CustomTabsConnectionHelper;", "setConnectionHelper$expo_web_browser_release", "(Lexpo/modules/webbrowser/CustomTabsConnectionHelper;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "expo-web-browser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebBrowserModule extends Module {
    public CustomTabsConnectionHelper connectionHelper;
    public CustomTabsActivitiesHelper customTabsResolver;

    /* JADX INFO: Access modifiers changed from: private */
    public final d createCustomTabsIntent(OpenBrowserOptions options) {
        d.C0067d c0067d = new d.C0067d();
        Integer toolbarColor = options.getToolbarColor();
        if (toolbarColor != null) {
            androidx.browser.customtabs.a aVarA = new androidx.browser.customtabs.a.C0064a().d(toolbarColor.intValue()).a();
            s.j(aVarA, "build(...)");
            c0067d.e(aVarA);
        }
        Integer secondaryToolbarColor = options.getSecondaryToolbarColor();
        if (secondaryToolbarColor != null) {
            androidx.browser.customtabs.a aVarA2 = new androidx.browser.customtabs.a.C0064a().d(secondaryToolbarColor.intValue()).a();
            s.j(aVarA2, "build(...)");
            c0067d.e(aVarA2);
        }
        c0067d.k(options.getShowTitle());
        if (options.getEnableDefaultShareMenuItem()) {
            c0067d.j(1);
        }
        d dVarB = c0067d.b();
        s.j(dVarB, "build(...)");
        dVarB.f2960a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", options.getEnableBarCollapsing());
        String browserPackage = options.getBrowserPackage();
        if (!TextUtils.isEmpty(browserPackage)) {
            dVarB.f2960a.setPackage(browserPackage);
        }
        if (options.getShouldCreateTask()) {
            dVarB.f2960a.addFlags(268435456);
            if (!options.getShowInRecents()) {
                dVarB.f2960a.addFlags(8388608);
                dVarB.f2960a.addFlags(1073741824);
            }
        }
        return dVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x000a  */
    public final String givenOrPreferredPackageName(String packageName) throws NoPreferredPackageFound {
        if (packageName != null) {
            try {
                if (packageName.length() <= 0) {
                    packageName = null;
                }
            } catch (CurrentActivityNotFoundException unused) {
                throw new NoPreferredPackageFound();
            } catch (PackageManagerNotFoundException unused2) {
                throw new NoPreferredPackageFound();
            }
        } else {
            packageName = null;
        }
        if (packageName == null) {
            packageName = getCustomTabsResolver$expo_web_browser_release().getPreferredCustomTabsResolvingActivity(null);
        }
        if (packageName != null) {
            String str = packageName.length() > 0 ? packageName : null;
            if (str != null) {
                return str;
            }
        }
        throw new NoPreferredPackageFound();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent2;
        AsyncFunctionComponent stringAsyncFunctionComponent3;
        AsyncFunctionComponent stringAsyncFunctionComponent4;
        AsyncFunctionComponent stringAsyncFunctionComponent5;
        Class<OpenBrowserOptions> cls = OpenBrowserOptions.class;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoWebBrowser");
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$OnCreate$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    WebBrowserModule webBrowserModule = this.this$0;
                    webBrowserModule.setCustomTabsResolver$expo_web_browser_release(new CustomTabsActivitiesHelper(webBrowserModule.getAppContext()));
                    WebBrowserModule webBrowserModule2 = this.this$0;
                    webBrowserModule2.setConnectionHelper$expo_web_browser_release(new CustomTabsConnectionHelper(webBrowserModule2.getContext()));
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.ACTIVITY_DESTROYS;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new wn0.a<h0>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$OnActivityDestroys$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.getConnectionHelper$expo_web_browser_release().destroy();
                }
            }));
            boolean zF = s.f(String.class, Promise.class);
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Class cls4 = Double.TYPE;
            Class cls5 = Boolean.TYPE;
            if (zF) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("warmUpAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws NoPreferredPackageFound {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        String strGivenOrPreferredPackageName = this.this$0.givenOrPreferredPackageName((String) promise);
                        this.this$0.getConnectionHelper$expo_web_browser_release().warmUp(strGivenOrPreferredPackageName);
                        q5.d.b(x.a("servicePackage", strGivenOrPreferredPackageName));
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws NoPreferredPackageFound {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
                cls = cls;
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(String.class), Boolean.TRUE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.g(String.class);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                l<Object[], Bundle> lVar = new l<Object[], Bundle>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final Bundle invoke(Object[] objArr) throws NoPreferredPackageFound {
                        s.k(objArr, "<destruct>");
                        String strGivenOrPreferredPackageName = this.this$0.givenOrPreferredPackageName((String) objArr[0]);
                        this.this$0.getConnectionHelper$expo_web_browser_release().warmUp(strGivenOrPreferredPackageName);
                        return q5.d.b(x.a("servicePackage", strGivenOrPreferredPackageName));
                    }
                };
                if (s.f(Bundle.class, cls2)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("warmUpAsync", anyTypeArr, lVar);
                } else if (s.f(Bundle.class, cls5)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("warmUpAsync", anyTypeArr, lVar);
                } else if (s.f(Bundle.class, cls4)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("warmUpAsync", anyTypeArr, lVar);
                } else if (s.f(Bundle.class, cls3)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("warmUpAsync", anyTypeArr, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(Bundle.class, String.class) ? new StringAsyncFunctionComponent("warmUpAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("warmUpAsync", anyTypeArr, lVar);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("warmUpAsync", asyncFunctionWithPromiseComponent);
            if (s.f(String.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("coolDownAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$4
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) throws NoPreferredPackageFound {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        String strGivenOrPreferredPackageName = this.this$0.givenOrPreferredPackageName((String) promise);
                        if (this.this$0.getConnectionHelper$expo_web_browser_release().coolDown(strGivenOrPreferredPackageName)) {
                            q5.d.b(x.a("servicePackage", strGivenOrPreferredPackageName));
                        } else {
                            new Bundle();
                        }
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) throws NoPreferredPackageFound {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(String.class), Boolean.TRUE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.g(String.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                l<Object[], Bundle> lVar2 = new l<Object[], Bundle>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$6
                    @Override // wn0.l
                    public final Bundle invoke(Object[] objArr) throws NoPreferredPackageFound {
                        s.k(objArr, "<destruct>");
                        String strGivenOrPreferredPackageName = this.this$0.givenOrPreferredPackageName((String) objArr[0]);
                        return this.this$0.getConnectionHelper$expo_web_browser_release().coolDown(strGivenOrPreferredPackageName) ? q5.d.b(x.a("servicePackage", strGivenOrPreferredPackageName)) : new Bundle();
                    }
                };
                if (s.f(Bundle.class, cls2)) {
                    stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("coolDownAsync", anyTypeArr2, lVar2);
                } else if (s.f(Bundle.class, cls5)) {
                    stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("coolDownAsync", anyTypeArr2, lVar2);
                } else if (s.f(Bundle.class, cls4)) {
                    stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("coolDownAsync", anyTypeArr2, lVar2);
                } else if (s.f(Bundle.class, cls3)) {
                    stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("coolDownAsync", anyTypeArr2, lVar2);
                } else {
                    stringAsyncFunctionComponent2 = s.f(Bundle.class, String.class) ? new StringAsyncFunctionComponent("coolDownAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("coolDownAsync", anyTypeArr2, lVar2);
                }
                asyncFunctionWithPromiseComponent2 = stringAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("coolDownAsync", asyncFunctionWithPromiseComponent2);
            TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            co0.d dVarB = o0.b(String.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$7
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters3);
            }
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), Boolean.TRUE));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(o0.b(String.class), true, new wn0.a<q>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$8
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.g(String.class);
                    }
                }), converters3);
            }
            AnyType[] anyTypeArr3 = {anyType3, anyType4};
            l<Object[], Bundle> lVar3 = new l<Object[], Bundle>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$9
                @Override // wn0.l
                public final Bundle invoke(Object[] objArr) throws NoPreferredPackageFound {
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    String strGivenOrPreferredPackageName = this.this$0.givenOrPreferredPackageName((String) objArr[1]);
                    CustomTabsConnectionHelper connectionHelper$expo_web_browser_release = this.this$0.getConnectionHelper$expo_web_browser_release();
                    Uri uri = Uri.parse((String) obj);
                    s.j(uri, "parse(...)");
                    connectionHelper$expo_web_browser_release.mayInitWithUrl(strGivenOrPreferredPackageName, uri);
                    return q5.d.b(x.a("servicePackage", strGivenOrPreferredPackageName));
                }
            };
            if (s.f(Bundle.class, cls2)) {
                stringAsyncFunctionComponent3 = new IntAsyncFunctionComponent("mayInitWithUrlAsync", anyTypeArr3, lVar3);
            } else if (s.f(Bundle.class, cls5)) {
                stringAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("mayInitWithUrlAsync", anyTypeArr3, lVar3);
            } else if (s.f(Bundle.class, cls4)) {
                stringAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("mayInitWithUrlAsync", anyTypeArr3, lVar3);
            } else if (s.f(Bundle.class, cls3)) {
                stringAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("mayInitWithUrlAsync", anyTypeArr3, lVar3);
            } else {
                stringAsyncFunctionComponent3 = s.f(Bundle.class, String.class) ? new StringAsyncFunctionComponent("mayInitWithUrlAsync", anyTypeArr3, lVar3) : new UntypedAsyncFunctionComponent("mayInitWithUrlAsync", anyTypeArr3, lVar3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("mayInitWithUrlAsync", stringAsyncFunctionComponent3);
            AnyType[] anyTypeArr4 = new AnyType[0];
            l<Object[], Bundle> lVar4 = new l<Object[], Bundle>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$10
                @Override // wn0.l
                public final Bundle invoke(Object[] it) {
                    s.k(it, "it");
                    ArrayList<String> customTabsResolvingActivities = this.this$0.getCustomTabsResolver$expo_web_browser_release().getCustomTabsResolvingActivities();
                    ArrayList<String> customTabsResolvingServices = this.this$0.getCustomTabsResolver$expo_web_browser_release().getCustomTabsResolvingServices();
                    String preferredCustomTabsResolvingActivity = this.this$0.getCustomTabsResolver$expo_web_browser_release().getPreferredCustomTabsResolvingActivity(customTabsResolvingActivities);
                    String defaultCustomTabsResolvingActivity = this.this$0.getCustomTabsResolver$expo_web_browser_release().getDefaultCustomTabsResolvingActivity();
                    if (!v.g0(customTabsResolvingActivities, defaultCustomTabsResolvingActivity)) {
                        defaultCustomTabsResolvingActivity = null;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("browserPackages", customTabsResolvingActivities);
                    bundle.putStringArrayList("servicePackages", customTabsResolvingServices);
                    bundle.putString("preferredBrowserPackage", preferredCustomTabsResolvingActivity);
                    bundle.putString("defaultBrowserPackage", defaultCustomTabsResolvingActivity);
                    return bundle;
                }
            };
            if (s.f(Bundle.class, cls2)) {
                stringAsyncFunctionComponent4 = new IntAsyncFunctionComponent("getCustomTabsSupportingBrowsersAsync", anyTypeArr4, lVar4);
            } else if (s.f(Bundle.class, cls5)) {
                stringAsyncFunctionComponent4 = new BoolAsyncFunctionComponent("getCustomTabsSupportingBrowsersAsync", anyTypeArr4, lVar4);
            } else if (s.f(Bundle.class, cls4)) {
                stringAsyncFunctionComponent4 = new DoubleAsyncFunctionComponent("getCustomTabsSupportingBrowsersAsync", anyTypeArr4, lVar4);
            } else if (s.f(Bundle.class, cls3)) {
                stringAsyncFunctionComponent4 = new FloatAsyncFunctionComponent("getCustomTabsSupportingBrowsersAsync", anyTypeArr4, lVar4);
            } else {
                stringAsyncFunctionComponent4 = s.f(Bundle.class, String.class) ? new StringAsyncFunctionComponent("getCustomTabsSupportingBrowsersAsync", anyTypeArr4, lVar4) : new UntypedAsyncFunctionComponent("getCustomTabsSupportingBrowsersAsync", anyTypeArr4, lVar4);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getCustomTabsSupportingBrowsersAsync", stringAsyncFunctionComponent4);
            TypeConverterProvider converters4 = moduleDefinitionBuilder.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(String.class), bool));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$11
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(String.class);
                    }
                }), converters4);
            }
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(cls), bool));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(o0.b(cls), false, new wn0.a<q>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$12
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(OpenBrowserOptions.class);
                    }
                }), converters4);
            }
            AnyType[] anyTypeArr5 = {anyType5, anyType6};
            l<Object[], Bundle> lVar5 = new l<Object[], Bundle>() { // from class: expo.modules.webbrowser.WebBrowserModule$definition$lambda$10$$inlined$AsyncFunction$13
                @Override // wn0.l
                public final Bundle invoke(Object[] objArr) throws NoMatchingActivityException, NoUrlProvidedException {
                    s.k(objArr, "<destruct>");
                    Object obj = objArr[0];
                    d dVarCreateCustomTabsIntent = this.this$0.createCustomTabsIntent((OpenBrowserOptions) objArr[1]);
                    dVarCreateCustomTabsIntent.f2960a.setData(Uri.parse((String) obj));
                    if (!this.this$0.getCustomTabsResolver$expo_web_browser_release().canResolveIntent(dVarCreateCustomTabsIntent)) {
                        throw new NoMatchingActivityException();
                    }
                    this.this$0.getCustomTabsResolver$expo_web_browser_release().startCustomTabs(dVarCreateCustomTabsIntent);
                    return q5.d.b(x.a("type", "opened"));
                }
            };
            if (s.f(Bundle.class, cls2)) {
                stringAsyncFunctionComponent5 = new IntAsyncFunctionComponent("openBrowserAsync", anyTypeArr5, lVar5);
            } else if (s.f(Bundle.class, cls5)) {
                stringAsyncFunctionComponent5 = new BoolAsyncFunctionComponent("openBrowserAsync", anyTypeArr5, lVar5);
            } else if (s.f(Bundle.class, cls4)) {
                stringAsyncFunctionComponent5 = new DoubleAsyncFunctionComponent("openBrowserAsync", anyTypeArr5, lVar5);
            } else if (s.f(Bundle.class, cls3)) {
                stringAsyncFunctionComponent5 = new FloatAsyncFunctionComponent("openBrowserAsync", anyTypeArr5, lVar5);
            } else {
                stringAsyncFunctionComponent5 = s.f(Bundle.class, String.class) ? new StringAsyncFunctionComponent("openBrowserAsync", anyTypeArr5, lVar5) : new UntypedAsyncFunctionComponent("openBrowserAsync", anyTypeArr5, lVar5);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("openBrowserAsync", stringAsyncFunctionComponent5);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }

    public final CustomTabsConnectionHelper getConnectionHelper$expo_web_browser_release() {
        CustomTabsConnectionHelper customTabsConnectionHelper = this.connectionHelper;
        if (customTabsConnectionHelper != null) {
            return customTabsConnectionHelper;
        }
        s.B("connectionHelper");
        return null;
    }

    public final CustomTabsActivitiesHelper getCustomTabsResolver$expo_web_browser_release() {
        CustomTabsActivitiesHelper customTabsActivitiesHelper = this.customTabsResolver;
        if (customTabsActivitiesHelper != null) {
            return customTabsActivitiesHelper;
        }
        s.B("customTabsResolver");
        return null;
    }

    public final void setConnectionHelper$expo_web_browser_release(CustomTabsConnectionHelper customTabsConnectionHelper) {
        s.k(customTabsConnectionHelper, "<set-?>");
        this.connectionHelper = customTabsConnectionHelper;
    }

    public final void setCustomTabsResolver$expo_web_browser_release(CustomTabsActivitiesHelper customTabsActivitiesHelper) {
        s.k(customTabsActivitiesHelper, "<set-?>");
        this.customTabsResolver = customTabsActivitiesHelper;
    }
}
