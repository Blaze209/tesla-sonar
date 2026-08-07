package com.facebook.react.defaults;

import ch.qos.logback.core.CoreConstants;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p0;
import com.facebook.react.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "Lcom/facebook/react/v0;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lcom/facebook/react/p0;", "packages", "", "cxxReactPackages", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;Ljava/util/List;)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "Companion", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultTurboModuleManagerDelegate extends v0 {
    private static final b Companion = new b(null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R,\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;", "Lcom/facebook/react/v0$a;", "<init>", "()V", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "", "provider", "f", "(Lwn0/l;)Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lcom/facebook/react/p0;", "packages", "Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "h", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "", "c", "Ljava/util/List;", "cxxReactPackageProviders", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends v0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<l<ReactApplicationContext, List<Object>>> cxxReactPackageProviders = new ArrayList();

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(l lVar, ReactApplicationContext context) {
            s.k(context, "context");
            return v.e(lVar.invoke(context));
        }

        public final a f(final l<? super ReactApplicationContext, Object> provider) {
            s.k(provider, "provider");
            this.cxxReactPackageProviders.add(new l() { // from class: com.facebook.react.defaults.f
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return DefaultTurboModuleManagerDelegate.a.g(provider, (ReactApplicationContext) obj);
                }
            });
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.v0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public DefaultTurboModuleManagerDelegate b(ReactApplicationContext context, List<? extends p0> packages) {
            s.k(context, "context");
            s.k(packages, "packages");
            List<l<ReactApplicationContext, List<Object>>> list = this.cxxReactPackageProviders;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                v.E(arrayList, (Iterable) ((l) it.next()).invoke(context));
            }
            return new DefaultTurboModuleManagerDelegate(context, packages, arrayList, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$b;", "", "<init>", "()V", "", "cxxReactPackages", "Lcom/facebook/jni/HybridData;", "initHybrid", "(Ljava/util/List;)Lcom/facebook/jni/HybridData;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @in.a
        public final HybridData initHybrid(List<Object> cxxReactPackages) {
            return DefaultTurboModuleManagerDelegate.initHybrid(cxxReactPackages);
        }

        private b() {
        }
    }

    static {
        e.INSTANCE.a();
    }

    public /* synthetic */ DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, list, list2);
    }

    @in.a
    public static final native HybridData initHybrid(List<Object> list);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    protected HybridData initHybrid() {
        throw new UnsupportedOperationException("DefaultTurboModuleManagerDelegate.initHybrid() must never be called!");
    }

    private DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends p0> list, List<Object> list2) {
        super(reactApplicationContext, list, Companion.initHybrid(list2));
    }
}
