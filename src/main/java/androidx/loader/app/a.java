package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.y0;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.i0;
import androidx.p003lifecycle.j0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
class a extends LoaderManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f8953c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LifecycleOwner f8954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final c f8955b;

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public static class C0185a<D> extends i0<D> implements androidx.loader.content.c.InterfaceC0188c<D> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bundle f8957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        private final androidx.loader.content.c<D> f8958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private LifecycleOwner f8959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b<D> f8960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.loader.content.c<D> f8961g;

        C0185a(int i11, Bundle bundle, @NonNull androidx.loader.content.c<D> cVar, androidx.loader.content.c<D> cVar2) {
            this.f8956b = i11;
            this.f8957c = bundle;
            this.f8958d = cVar;
            this.f8961g = cVar2;
            cVar.registerListener(i11, this);
        }

        @Override // androidx.loader.content.c.InterfaceC0188c
        public void a(@NonNull androidx.loader.content.c<D> cVar, D d11) {
            if (a.f8953c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d11);
                return;
            }
            if (a.f8953c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d11);
        }

        androidx.loader.content.c<D> b(boolean z11) {
            if (a.f8953c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f8958d.cancelLoad();
            this.f8958d.abandon();
            b<D> bVar = this.f8960f;
            if (bVar != null) {
                removeObserver(bVar);
                if (z11) {
                    bVar.c();
                }
            }
            this.f8958d.unregisterListener(this);
            if ((bVar == null || bVar.b()) && !z11) {
                return this.f8958d;
            }
            this.f8958d.reset();
            return this.f8961g;
        }

        public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f8956b);
            printWriter.print(" mArgs=");
            printWriter.println(this.f8957c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f8958d);
            this.f8958d.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f8960f != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f8960f);
                this.f8960f.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(d().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        @NonNull
        androidx.loader.content.c<D> d() {
            return this.f8958d;
        }

        void e() {
            LifecycleOwner lifecycleOwner = this.f8959e;
            b<D> bVar = this.f8960f;
            if (lifecycleOwner == null || bVar == null) {
                return;
            }
            super.removeObserver(bVar);
            observe(lifecycleOwner, bVar);
        }

        @NonNull
        androidx.loader.content.c<D> f(@NonNull LifecycleOwner lifecycleOwner, @NonNull LoaderManager.a<D> aVar) {
            b<D> bVar = new b<>(this.f8958d, aVar);
            observe(lifecycleOwner, bVar);
            b<D> bVar2 = this.f8960f;
            if (bVar2 != null) {
                removeObserver(bVar2);
            }
            this.f8959e = lifecycleOwner;
            this.f8960f = bVar;
            return this.f8958d;
        }

        @Override // androidx.p003lifecycle.d0
        protected void onActive() {
            if (a.f8953c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f8958d.startLoading();
        }

        @Override // androidx.p003lifecycle.d0
        protected void onInactive() {
            if (a.f8953c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f8958d.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.p003lifecycle.d0
        public void removeObserver(@NonNull j0<? super D> j0Var) {
            super.removeObserver(j0Var);
            this.f8959e = null;
            this.f8960f = null;
        }

        @Override // androidx.p003lifecycle.i0, androidx.p003lifecycle.d0
        public void setValue(D d11) {
            super.setValue(d11);
            androidx.loader.content.c<D> cVar = this.f8961g;
            if (cVar != null) {
                cVar.reset();
                this.f8961g = null;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f8956b);
            sb2.append(" : ");
            u5.a.a(this.f8958d, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    static class b<D> implements j0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final androidx.loader.content.c<D> f8962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final LoaderManager.a<D> f8963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8964c = false;

        b(@NonNull androidx.loader.content.c<D> cVar, @NonNull LoaderManager.a<D> aVar) {
            this.f8962a = cVar;
            this.f8963b = aVar;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f8964c);
        }

        boolean b() {
            return this.f8964c;
        }

        void c() {
            if (this.f8964c) {
                if (a.f8953c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f8962a);
                }
                this.f8963b.onLoaderReset(this.f8962a);
            }
        }

        @Override // androidx.p003lifecycle.j0
        public void onChanged(D d11) {
            if (a.f8953c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f8962a + ": " + this.f8962a.dataToString(d11));
            }
            this.f8963b.onLoadFinished(this.f8962a, d11);
            this.f8964c = true;
        }

        public String toString() {
            return this.f8963b.toString();
        }
    }

    static class c extends c1 {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final ViewModelProvider.Factory f8965u = new C0186a();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private y0<C0185a> f8966s = new y0<>();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f8967t = false;

        /* JADX INFO: renamed from: androidx.loader.app.a$c$a, reason: collision with other inner class name */
        static class C0186a implements ViewModelProvider.Factory {
            C0186a() {
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NonNull
            public <T extends c1> T create(@NonNull Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        @NonNull
        static c g(ViewModelStore viewModelStore) {
            return (c) new ViewModelProvider(viewModelStore, f8965u).b(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f8966s.l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i11 = 0; i11 < this.f8966s.l(); i11++) {
                    C0185a c0185aM = this.f8966s.m(i11);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f8966s.h(i11));
                    printWriter.print(": ");
                    printWriter.println(c0185aM.toString());
                    c0185aM.c(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            this.f8967t = false;
        }

        <D> C0185a<D> h(int i11) {
            return this.f8966s.e(i11);
        }

        boolean i() {
            return this.f8967t;
        }

        void j() {
            int iL = this.f8966s.l();
            for (int i11 = 0; i11 < iL; i11++) {
                this.f8966s.m(i11).e();
            }
        }

        void k(int i11, @NonNull C0185a c0185a) {
            this.f8966s.i(i11, c0185a);
        }

        void l() {
            this.f8967t = true;
        }

        @Override // androidx.p003lifecycle.c1
        protected void onCleared() {
            super.onCleared();
            int iL = this.f8966s.l();
            for (int i11 = 0; i11 < iL; i11++) {
                this.f8966s.m(i11).b(true);
            }
            this.f8966s.b();
        }
    }

    a(@NonNull LifecycleOwner lifecycleOwner, @NonNull ViewModelStore viewModelStore) {
        this.f8954a = lifecycleOwner;
        this.f8955b = c.g(viewModelStore);
    }

    @NonNull
    private <D> androidx.loader.content.c<D> e(int i11, Bundle bundle, @NonNull LoaderManager.a<D> aVar, androidx.loader.content.c<D> cVar) {
        try {
            this.f8955b.l();
            androidx.loader.content.c<D> cVarOnCreateLoader = aVar.onCreateLoader(i11, bundle);
            if (cVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(cVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarOnCreateLoader);
            }
            C0185a c0185a = new C0185a(i11, bundle, cVarOnCreateLoader, cVar);
            if (f8953c) {
                Log.v("LoaderManager", "  Created new loader " + c0185a);
            }
            this.f8955b.k(i11, c0185a);
            this.f8955b.f();
            return c0185a.f(this.f8954a, aVar);
        } catch (Throwable th2) {
            this.f8955b.f();
            throw th2;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f8955b.a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.LoaderManager
    @NonNull
    public <D> androidx.loader.content.c<D> c(int i11, Bundle bundle, @NonNull LoaderManager.a<D> aVar) {
        if (this.f8955b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C0185a<D> c0185aH = this.f8955b.h(i11);
        if (f8953c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (c0185aH == null) {
            return e(i11, bundle, aVar, null);
        }
        if (f8953c) {
            Log.v("LoaderManager", "  Re-using existing loader " + c0185aH);
        }
        return c0185aH.f(this.f8954a, aVar);
    }

    @Override // androidx.loader.app.LoaderManager
    public void d() {
        this.f8955b.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        u5.a.a(this.f8954a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
