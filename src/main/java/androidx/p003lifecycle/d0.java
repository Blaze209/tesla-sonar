package androidx.p003lifecycle;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0<T> {
    static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private q.b<j0<? super T>, d0<T>.d> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (d0.this.mDataLock) {
                obj = d0.this.mPendingData;
                d0.this.mPendingData = d0.NOT_SET;
            }
            d0.this.setValue(obj);
        }
    }

    private class b extends d0<T>.d {
        b(j0<? super T> j0Var) {
            super(j0Var);
        }

        @Override // androidx.lifecycle.d0.d
        boolean d() {
            return true;
        }
    }

    class c extends d0<T>.d implements u {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        final LifecycleOwner f8777e;

        c(LifecycleOwner lifecycleOwner, j0<? super T> j0Var) {
            super(j0Var);
            this.f8777e = lifecycleOwner;
        }

        @Override // androidx.lifecycle.d0.d
        void b() {
            this.f8777e.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.d0.d
        boolean c(LifecycleOwner lifecycleOwner) {
            return this.f8777e == lifecycleOwner;
        }

        @Override // androidx.lifecycle.d0.d
        boolean d() {
            return this.f8777e.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.p003lifecycle.u
        public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.a aVar) {
            Lifecycle.State stateB = this.f8777e.getLifecycle().b();
            if (stateB == Lifecycle.State.DESTROYED) {
                d0.this.removeObserver(this.f8779a);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateB) {
                a(d());
                state = stateB;
                stateB = this.f8777e.getLifecycle().b();
            }
        }
    }

    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j0<? super T> f8779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f8780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8781c = -1;

        d(j0<? super T> j0Var) {
            this.f8779a = j0Var;
        }

        void a(boolean z11) {
            if (z11 == this.f8780b) {
                return;
            }
            this.f8780b = z11;
            d0.this.changeActiveCounter(z11 ? 1 : -1);
            if (this.f8780b) {
                d0.this.dispatchingValue(this);
            }
        }

        void b() {
        }

        boolean c(LifecycleOwner lifecycleOwner) {
            return false;
        }

        abstract boolean d();
    }

    public d0(T t11) {
        this.mDataLock = new Object();
        this.mObservers = new q.b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t11;
        this.mVersion = 0;
    }

    static void assertMainThread(String str) {
        if (p.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void considerNotify(d0<T>.d dVar) {
        if (dVar.f8780b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i11 = dVar.f8781c;
            int i12 = this.mVersion;
            if (i11 >= i12) {
                return;
            }
            dVar.f8781c = i12;
            dVar.f8779a.onChanged((Object) this.mData);
        }
    }

    void changeActiveCounter(int i11) {
        int i12 = this.mActiveCount;
        this.mActiveCount = i11 + i12;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i13 = this.mActiveCount;
                if (i12 == i13) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z11 = i12 == 0 && i13 > 0;
                boolean z12 = i12 > 0 && i13 == 0;
                if (z11) {
                    onActive();
                } else if (z12) {
                    onInactive();
                }
                i12 = i13;
            } catch (Throwable th2) {
                this.mChangingActiveState = false;
                throw th2;
            }
        }
    }

    void dispatchingValue(d0<T>.d dVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (dVar != null) {
                considerNotify(dVar);
                dVar = null;
            } else {
                q.b<j0<? super T>, d0<T>.d>.d dVarD = this.mObservers.d();
                while (dVarD.hasNext()) {
                    considerNotify((d) dVarD.next().getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t11 = (T) this.mData;
        if (t11 != NOT_SET) {
            return t11;
        }
        return null;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.size() > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull j0<? super T> j0Var) {
        assertMainThread("observe");
        if (lifecycleOwner.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            return;
        }
        c cVar = new c(lifecycleOwner, j0Var);
        d0<T>.d dVarG = this.mObservers.g(j0Var, cVar);
        if (dVarG != null && !dVarG.c(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarG != null) {
            return;
        }
        lifecycleOwner.getLifecycle().a(cVar);
    }

    public void observeForever(@NonNull j0<? super T> j0Var) {
        assertMainThread("observeForever");
        b bVar = new b(j0Var);
        d0<T>.d dVarG = this.mObservers.g(j0Var, bVar);
        if (dVarG instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarG != null) {
            return;
        }
        bVar.a(true);
    }

    protected void onActive() {
    }

    protected void onInactive() {
    }

    protected void postValue(T t11) {
        boolean z11;
        synchronized (this.mDataLock) {
            z11 = this.mPendingData == NOT_SET;
            this.mPendingData = t11;
        }
        if (z11) {
            p.c.g().c(this.mPostValueRunnable);
        }
    }

    public void removeObserver(@NonNull j0<? super T> j0Var) {
        assertMainThread("removeObserver");
        d0<T>.d dVarH = this.mObservers.h(j0Var);
        if (dVarH == null) {
            return;
        }
        dVarH.b();
        dVarH.a(false);
    }

    public void removeObservers(@NonNull LifecycleOwner lifecycleOwner) {
        assertMainThread("removeObservers");
        for (Map.Entry<j0<? super T>, d0<T>.d> entry : this.mObservers) {
            if (entry.getValue().c(lifecycleOwner)) {
                removeObserver(entry.getKey());
            }
        }
    }

    protected void setValue(T t11) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t11;
        dispatchingValue(null);
    }

    public d0() {
        this.mDataLock = new Object();
        this.mObservers = new q.b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
