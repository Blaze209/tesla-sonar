package androidx.camera.extensions;

import android.content.Context;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.k1;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.z2;
import c0.m;
import c0.n;
import c0.o;
import java.util.Iterator;
import java.util.List;
import u0.h;
import u0.i;
import u0.p;
import u0.q;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f3462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private g f3463b = new g() { // from class: androidx.camera.extensions.c
        @Override // androidx.camera.extensions.g
        public final p a(int i11) {
            return e.f(i11);
        }
    };

    e(@NonNull o oVar) {
        this.f3462a = oVar;
    }

    public static /* synthetic */ b0 a(e eVar, int i11, n1 n1Var, n nVar, Context context) {
        p pVarA = eVar.f3463b.a(i11);
        pVarA.l(nVar);
        b.a aVarG = new b.a().d(i11).h(new i(pVarA)).c(n1Var).i(true).e(pVarA.m()).b(pVarA.f()).g(1);
        z2 z2VarJ = pVarA.j(context);
        if (z2VarJ != null) {
            aVarG.f(z2VarJ);
        }
        return aVarG.a();
    }

    private static String c(int i11) {
        if (i11 == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i11 == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i11 == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i11 == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i11 == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i11 == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }

    private m e(int i11) {
        return new a(c(i11), this.f3463b.a(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static p f(int i11) {
        return h() ? new u0.c(i11) : new u0.e(i11);
    }

    private void g(final int i11) {
        final n1 n1VarA = n1.a(c(i11));
        if (k1.b(n1VarA) == d0.f3152a) {
            k1.a(n1VarA, new d0() { // from class: androidx.camera.extensions.d
                @Override // androidx.camera.core.impl.d0
                public final b0 a(n nVar, Context context) {
                    return e.a(this.f3459b, i11, n1VarA, nVar, context);
                }
            });
        }
    }

    private static boolean h() {
        q qVar = q.f115242b;
        if (u0.g.c(qVar) || h.f(qVar)) {
            return false;
        }
        return h.d();
    }

    @NonNull
    c0.p d(@NonNull c0.p pVar, int i11) {
        if (!i(pVar, i11)) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        Iterator<m> it = pVar.c().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof a) {
                throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        g(i11);
        c0.p.a aVarC = c0.p.a.c(pVar);
        aVarC.a(e(i11));
        return aVarC.b();
    }

    boolean i(@NonNull c0.p pVar, int i11) {
        c0.p.a aVarC = c0.p.a.c(pVar);
        aVarC.a(e(i11));
        return !aVarC.b().b(this.f3462a.a()).isEmpty();
    }

    boolean j(@NonNull c0.p pVar, int i11) {
        List<n> listB = c0.p.a.c(pVar).a(e(i11)).b().b(this.f3462a.a());
        if (listB.isEmpty()) {
            return false;
        }
        n nVar = listB.get(0);
        p pVarA = this.f3463b.a(i11);
        pVarA.l(nVar);
        Size[] sizeArrG = pVarA.g();
        return sizeArrG != null && sizeArrG.length > 0;
    }
}
