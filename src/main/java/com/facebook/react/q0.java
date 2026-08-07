package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/facebook/react/q0;", "", "<init>", "()V", "Lcom/facebook/react/p0;", "reactPackage", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "", "Lcom/facebook/react/bridge/ModuleHolder;", "a", "(Lcom/facebook/react/p0;Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f22918a = new q0();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/facebook/react/q0$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Iterable<ModuleHolder>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f22919a;

        public a(List list) {
            this.f22919a = list;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new b(this.f22919a);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"com/facebook/react/q0$b", "", "Lcom/facebook/react/bridge/ModuleHolder;", "b", "()Lcom/facebook/react/bridge/ModuleHolder;", "", "hasNext", "()Z", "", "a", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Iterator<ModuleHolder>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int position;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<NativeModule> f22921b;

        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends NativeModule> list) {
            this.f22921b = list;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            List<NativeModule> list = this.f22921b;
            int i11 = this.position;
            this.position = i11 + 1;
            return new ModuleHolder(list.get(i11));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.f22921b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private q0() {
    }

    public final Iterable<ModuleHolder> a(p0 reactPackage, ReactApplicationContext reactApplicationContext) {
        p013kotlin.jvm.internal.s.k(reactPackage, "reactPackage");
        p013kotlin.jvm.internal.s.k(reactApplicationContext, "reactApplicationContext");
        qk.a.b("ReactNative", reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new a(reactPackage.createNativeModules(reactApplicationContext));
    }
}
