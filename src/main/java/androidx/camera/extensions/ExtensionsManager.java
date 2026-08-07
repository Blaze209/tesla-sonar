package androidx.camera.extensions;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.extensions.impl.InitializerImpl;
import c0.o;
import c0.p;
import c0.y0;
import com.google.common.util.concurrent.s;
import j0.n;
import u0.h;
import u0.q;

/* JADX INFO: loaded from: classes.dex */
public final class ExtensionsManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f3450c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static s<ExtensionsManager> f3451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static s<Void> f3452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ExtensionsManager f3453f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExtensionsAvailability f3454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f3455b;

    /* JADX INFO: renamed from: androidx.camera.extensions.ExtensionsManager$2, reason: invalid class name */
    class AnonymousClass2 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        final /* synthetic */ androidx.concurrent.futures.c.a val$completer;

        AnonymousClass2(androidx.concurrent.futures.c.a aVar) {
            this.val$completer = aVar;
        }

        public void onFailure(int i11) {
            this.val$completer.f(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.c(null);
        }
    }

    enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(@NonNull ExtensionsAvailability extensionsAvailability, @NonNull o oVar) {
        this.f3454a = extensionsAvailability;
        this.f3455b = new e(oVar);
    }

    @NonNull
    public static s<ExtensionsManager> c(@NonNull Context context, @NonNull o oVar) {
        return d(context, oVar, u0.g.a());
    }

    @NonNull
    static s<ExtensionsManager> d(@NonNull final Context context, @NonNull final o oVar, @NonNull final u0.g gVar) {
        synchronized (f3450c) {
            try {
                s<Void> sVar = f3452e;
                if (sVar != null && !sVar.isDone()) {
                    throw new IllegalStateException("Not yet done deinitializing extensions");
                }
                f3452e = null;
                if (h.b() == null) {
                    return n.p(e(ExtensionsAvailability.NONE, oVar));
                }
                q qVar = q.f115241a;
                if (!u0.g.c(qVar) && !h.f(qVar)) {
                    if (f3451d == null) {
                        f3451d = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.extensions.f
                            @Override // androidx.concurrent.futures.c.InterfaceC0146c
                            public final Object a(androidx.concurrent.futures.c.a aVar) {
                                return ExtensionsManager.h(gVar, context, oVar, aVar);
                            }
                        });
                    }
                    return f3451d;
                }
                return n.p(e(ExtensionsAvailability.LIBRARY_AVAILABLE, oVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static ExtensionsManager e(@NonNull ExtensionsAvailability extensionsAvailability, @NonNull o oVar) {
        synchronized (f3450c) {
            try {
                ExtensionsManager extensionsManager = f3453f;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, oVar);
                f3453f = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h(u0.g gVar, Context context, final o oVar, final androidx.concurrent.futures.c.a aVar) {
        try {
            InitializerImpl.init(gVar.e(), h0.f.a(context), new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.1
                public void onFailure(int i11) {
                    y0.c("ExtensionsManager", "Failed to initialize extensions");
                    aVar.c(ExtensionsManager.e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, oVar));
                }

                public void onSuccess() {
                    y0.a("ExtensionsManager", "Successfully initialized extensions");
                    aVar.c(ExtensionsManager.e(ExtensionsAvailability.LIBRARY_AVAILABLE, oVar));
                }
            }, i0.c.b());
            return "Initialize extensions";
        } catch (AbstractMethodError e11) {
            e = e11;
            y0.c("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.c(e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, oVar));
            return "Initialize extensions";
        } catch (NoClassDefFoundError e12) {
            e = e12;
            y0.c("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.c(e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, oVar));
            return "Initialize extensions";
        } catch (NoSuchMethodError e13) {
            e = e13;
            y0.c("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.c(e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, oVar));
            return "Initialize extensions";
        } catch (RuntimeException e14) {
            y0.c("ExtensionsManager", "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e14);
            aVar.c(e(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, oVar));
            return "Initialize extensions";
        }
    }

    @NonNull
    public p b(@NonNull p pVar, int i11) {
        if (i11 == 0) {
            return pVar;
        }
        if (this.f3454a == ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.f3455b.d(pVar, i11);
        }
        throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    public boolean f(@NonNull p pVar, int i11) {
        if (i11 == 0) {
            return true;
        }
        if (this.f3454a != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.f3455b.i(pVar, i11);
    }

    public boolean g(@NonNull p pVar, int i11) {
        if (i11 == 0) {
            return true;
        }
        if (this.f3454a != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.f3455b.j(pVar, i11);
    }
}
