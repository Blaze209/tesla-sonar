package com.facebook.react;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\tJ-\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0000\u0012\u00020\u0016\u0012\u0006\b\u0000\u0012\u00020\u00160\u00150\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\tJ\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/a;", "Lcom/facebook/react/p0;", "<init>", "()V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "", "Lcom/facebook/react/bridge/NativeModule;", "createNativeModules", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;", "", "name", "getModule", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;", "", "Lcom/facebook/react/bridge/ModuleHolder;", "getNativeModuleIterator$ReactAndroid_release", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;", "getNativeModuleIterator", "Lcom/facebook/react/bridge/ModuleSpec;", "getViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", "", "createViewManagers", "Lyn/a;", "getReactModuleInfoProvider", "()Lyn/a;", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a implements p0 {

    /* JADX INFO: renamed from: com.facebook.react.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/a$a;", "Ljavax/inject/Provider;", "Lcom/facebook/react/bridge/NativeModule;", "", "name", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/a;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "a", "()Lcom/facebook/react/bridge/NativeModule;", "Ljava/lang/String;", "b", "Lcom/facebook/react/bridge/ReactApplicationContext;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class C0443a implements Provider<NativeModule> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ReactApplicationContext reactContext;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f22102c;

        public C0443a(a aVar, String name, ReactApplicationContext reactContext) {
            p013kotlin.jvm.internal.s.k(name, "name");
            p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
            this.f22102c = aVar;
            this.name = name;
            this.reactContext = reactContext;
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return this.f22102c.getModule(this.name, this.reactContext);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/facebook/react/a$b", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Iterable<ModuleHolder>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f22103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f22104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f22105c;

        public b(Iterator it, a aVar, ReactApplicationContext reactApplicationContext) {
            this.f22103a = it;
            this.f22104b = aVar;
            this.f22105c = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new c(this.f22103a, this.f22104b, this.f22105c);
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/facebook/react/a$c", "", "Lcom/facebook/react/bridge/ModuleHolder;", "Ljn0/h0;", "b", "()V", "", "hasNext", "()Z", DateTokenConverter.CONVERTER_KEY, "()Lcom/facebook/react/bridge/ModuleHolder;", "", "", "Lcom/facebook/react/module/model/ReactModuleInfo;", "a", "Ljava/util/Map$Entry;", "getNextEntry", "()Ljava/util/Map$Entry;", "setNextEntry", "(Ljava/util/Map$Entry;)V", "nextEntry", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Iterator<ModuleHolder>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Map.Entry<String, ReactModuleInfo> nextEntry;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator<Map.Entry<String, ReactModuleInfo>> f22107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f22108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f22109d;

        /* JADX WARN: Multi-variable type inference failed */
        c(Iterator<? extends Map.Entry<String, ReactModuleInfo>> it, a aVar, ReactApplicationContext reactApplicationContext) {
            this.f22107b = it;
            this.f22108c = aVar;
            this.f22109d = reactApplicationContext;
        }

        private final void b() {
            while (this.f22107b.hasNext()) {
                Map.Entry<String, ReactModuleInfo> next = this.f22107b.next();
                ReactModuleInfo value = next.getValue();
                if (!tn.b.r() || !value.getIsTurboModule()) {
                    this.nextEntry = next;
                    return;
                }
            }
            this.nextEntry = null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            if (this.nextEntry == null) {
                b();
            }
            Map.Entry<String, ReactModuleInfo> entry = this.nextEntry;
            if (entry == null) {
                throw new NoSuchElementException("ModuleHolder not found");
            }
            b();
            return new ModuleHolder(entry.getValue(), new C0443a(this.f22108c, entry.getKey(), this.f22109d));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextEntry == null) {
                b();
            }
            return this.nextEntry != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // com.facebook.react.p0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // com.facebook.react.p0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        List<ModuleSpec> viewManagers = getViewManagers(reactContext);
        List<ModuleSpec> list = viewManagers;
        if (list == null || list.isEmpty()) {
            return p013kotlin.collections.v.m();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            NativeModule nativeModule = it.next().getProvider().get();
            p013kotlin.jvm.internal.s.i(nativeModule, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<*, *>");
            arrayList.add((ViewManager) nativeModule);
        }
        return arrayList;
    }

    @Override // com.facebook.react.p0
    public abstract NativeModule getModule(String name, ReactApplicationContext reactContext);

    public final Iterable<ModuleHolder> getNativeModuleIterator$ReactAndroid_release(ReactApplicationContext reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        return new b(getReactModuleInfoProvider().getReactModuleInfos().entrySet().iterator(), this, reactContext);
    }

    public abstract yn.a getReactModuleInfoProvider();

    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        return p013kotlin.collections.v.m();
    }
}
