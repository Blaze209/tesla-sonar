package com.facebook.react.runtime;

import android.annotation.SuppressLint;
import com.adyen.checkout.components.core.Address;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile T f22975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    T f22976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f22977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f22978d;

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$a, reason: collision with other inner class name */
    interface InterfaceC0454a<T> {
        T get();
    }

    enum b {
        Init,
        Creating,
        Success,
        Failure
    }

    public a(T t11) {
        this.f22975a = t11;
        this.f22976b = t11;
        this.f22977c = b.Init;
        this.f22978d = "";
    }

    public synchronized T a() {
        return (T) gn.a.c(this.f22975a);
    }

    public synchronized T b() {
        T tA;
        tA = a();
        e();
        return tA;
    }

    public synchronized T c() {
        return this.f22975a;
    }

    @SuppressLint({"CatchGeneralException"})
    public T d(InterfaceC0454a<T> interfaceC0454a) {
        boolean z11;
        T tA;
        T tA2;
        synchronized (this) {
            try {
                b bVar = this.f22977c;
                b bVar2 = b.Success;
                if (bVar == bVar2) {
                    return a();
                }
                if (this.f22977c == b.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f22978d);
                }
                b bVar3 = this.f22977c;
                b bVar4 = b.Creating;
                boolean z12 = false;
                if (bVar3 != bVar4) {
                    this.f22977c = bVar4;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    try {
                        this.f22975a = interfaceC0454a.get();
                        synchronized (this) {
                            this.f22977c = bVar2;
                            notifyAll();
                            tA = a();
                        }
                        return tA;
                    } catch (RuntimeException e11) {
                        synchronized (this) {
                            this.f22977c = b.Failure;
                            this.f22978d = Objects.toString(e11.getMessage(), Address.ADDRESS_NULL_PLACEHOLDER);
                            notifyAll();
                            throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e11);
                        }
                    }
                }
                synchronized (this) {
                    while (this.f22977c == b.Creating) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z12 = true;
                        }
                    }
                    if (z12) {
                        Thread.currentThread().interrupt();
                    }
                    if (this.f22977c == b.Failure) {
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f22978d);
                    }
                    tA2 = a();
                }
                return tA2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void e() {
        this.f22975a = this.f22976b;
        this.f22977c = b.Init;
        this.f22978d = "";
    }

    public a() {
        this(null);
    }
}
