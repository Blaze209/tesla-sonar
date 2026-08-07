package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/i;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/p0;", "reactPackage", "Ljn0/h0;", "b", "(Lcom/facebook/react/p0;)V", "Lcom/facebook/react/bridge/NativeModuleRegistry;", "a", "()Lcom/facebook/react/bridge/NativeModuleRegistry;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/util/HashMap;", "", "Lcom/facebook/react/bridge/ModuleHolder;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "modules", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactApplicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, ModuleHolder> modules;

    public i(ReactApplicationContext reactApplicationContext) {
        p013kotlin.jvm.internal.s.k(reactApplicationContext, "reactApplicationContext");
        this.reactApplicationContext = reactApplicationContext;
        this.modules = new HashMap<>();
    }

    public final NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.reactApplicationContext, this.modules);
    }

    public final void b(p0 reactPackage) {
        p013kotlin.jvm.internal.s.k(reactPackage, "reactPackage");
        Iterable<ModuleHolder> iterableA = reactPackage instanceof g ? ((g) reactPackage).a(this.reactApplicationContext) : reactPackage instanceof a ? ((a) reactPackage).getNativeModuleIterator$ReactAndroid_release(this.reactApplicationContext) : q0.f22918a.a(reactPackage, this.reactApplicationContext);
        for (ModuleHolder moduleHolder : iterableA) {
            String name = moduleHolder.getName();
            ModuleHolder moduleHolder2 = this.modules.get(name);
            if (moduleHolder2 != null && !moduleHolder.getCanOverrideExistingModule()) {
                throw new IllegalStateException(("\nNative module " + name + " tried to override " + moduleHolder2.getClassName() + ".\n\nCheck the getPackages() method in MainApplication.java, it might be that module is being created twice. \nIf this was your intention, set canOverrideExistingModule=true. This error may also be present if the \npackage is present only once in getPackages() but is also automatically added later during build time \nby autolinking. Try removing the existing entry and rebuild.\n").toString());
            }
            this.modules.put(name, moduleHolder);
        }
    }
}
