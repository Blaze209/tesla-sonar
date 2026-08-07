package io.realm.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes9.dex */
final class NativeObjectReference extends PhantomReference<h> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static b f78973f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f78974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f78975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f78976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private NativeObjectReference f78977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NativeObjectReference f78978e;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        NativeObjectReference f78979a;

        private b() {
        }

        synchronized void a(NativeObjectReference nativeObjectReference) {
            try {
                nativeObjectReference.f78977d = null;
                nativeObjectReference.f78978e = this.f78979a;
                NativeObjectReference nativeObjectReference2 = this.f78979a;
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.f78977d = nativeObjectReference;
                }
                this.f78979a = nativeObjectReference;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        synchronized void b(NativeObjectReference nativeObjectReference) {
            try {
                NativeObjectReference nativeObjectReference2 = nativeObjectReference.f78978e;
                NativeObjectReference nativeObjectReference3 = nativeObjectReference.f78977d;
                nativeObjectReference.f78978e = null;
                nativeObjectReference.f78977d = null;
                if (nativeObjectReference3 != null) {
                    nativeObjectReference3.f78978e = nativeObjectReference2;
                } else {
                    this.f78979a = nativeObjectReference2;
                }
                if (nativeObjectReference2 != null) {
                    nativeObjectReference2.f78977d = nativeObjectReference3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    NativeObjectReference(g gVar, h hVar, ReferenceQueue<? super h> referenceQueue) {
        super(hVar, referenceQueue);
        this.f78974a = hVar.getNativePtr();
        this.f78975b = hVar.getNativeFinalizerPtr();
        this.f78976c = gVar;
        f78973f.a(this);
    }

    static native void nativeCleanUp(long j11, long j12);

    void e() {
        synchronized (this.f78976c) {
            nativeCleanUp(this.f78975b, this.f78974a);
        }
        f78973f.b(this);
    }
}
