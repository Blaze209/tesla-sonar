package com.facebook.react.bridge;

import com.facebook.react.module.model.ReactModuleInfo;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
@in.a
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    private boolean mIsCreating;
    private boolean mIsInitializing;
    private NativeModule mModule;
    private final String mName;
    private Provider<? extends NativeModule> mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider<? extends NativeModule> provider) {
        this.mName = reactModuleInfo.getName();
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.getNeedsEagerInit()) {
            this.mModule = create();
        }
    }

    private NativeModule create() {
        boolean z11 = false;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        ep.b.a(0L, "ModuleHolder.createModule").b("name", this.mName).c();
        al.c.a().a(bl.a.NATIVE_MODULE, "NativeModule init: %s", this.mName);
        try {
            NativeModule nativeModule = (NativeModule) ((Provider) gn.a.c(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                try {
                    this.mModule = nativeModule;
                    if (this.mInitializable && !this.mIsInitializing) {
                        z11 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                doInitialize(nativeModule);
            }
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mName, this.mInstanceKey);
            ep.b.b(0L).c();
            return nativeModule;
        } catch (Throwable th3) {
            try {
                qk.a.p("ReactNative", th3, "Failed to create NativeModule '%s'", this.mName);
                throw th3;
            } catch (Throwable th4) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mName, this.mInstanceKey);
                ep.b.b(0L).c();
                throw th4;
            }
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z11;
        ep.b.a(0L, "ModuleHolder.initialize").b("name", this.mName).c();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.mInitializable || this.mIsInitializing) {
                        z11 = false;
                    } else {
                        z11 = true;
                        this.mIsInitializing = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            ep.b.b(0L).c();
        } catch (Throwable th3) {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            ep.b.b(0L).c();
            throw th3;
        }
    }

    public synchronized void destroy() {
        NativeModule nativeModule = this.mModule;
        if (nativeModule != null) {
            nativeModule.invalidate();
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.getCanOverrideExistingModule();
    }

    public String getClassName() {
        return this.mReactModuleInfo.getClassName();
    }

    @in.a
    public NativeModule getModule() {
        boolean z11;
        NativeModule nativeModule;
        NativeModule nativeModule2;
        synchronized (this) {
            try {
                NativeModule nativeModule3 = this.mModule;
                if (nativeModule3 != null) {
                    return nativeModule3;
                }
                if (this.mIsCreating) {
                    z11 = false;
                } else {
                    z11 = true;
                    this.mIsCreating = true;
                }
                if (z11) {
                    NativeModule nativeModuleCreate = create();
                    synchronized (this) {
                        this.mIsCreating = false;
                        notifyAll();
                    }
                    return nativeModuleCreate;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.mModule;
                        if (nativeModule != null || !this.mIsCreating) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    nativeModule2 = (NativeModule) gn.a.c(nativeModule);
                }
                return nativeModule2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @in.a
    public String getName() {
        return this.mName;
    }

    synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.getIsCxxModule();
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.getIsTurboModule();
    }

    void markInitializable() {
        boolean z11;
        NativeModule nativeModule;
        synchronized (this) {
            z11 = true;
            try {
                this.mInitializable = true;
                if (this.mModule != null) {
                    gn.a.a(!this.mIsInitializing);
                    nativeModule = this.mModule;
                } else {
                    z11 = false;
                    nativeModule = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        String name = nativeModule.getName();
        this.mName = name;
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), ReactModuleInfo.b(nativeModule.getClass()));
        this.mModule = nativeModule;
        al.c.a().a(bl.a.NATIVE_MODULE, "NativeModule init: %s", name);
    }
}
