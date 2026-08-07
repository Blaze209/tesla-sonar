package dm0;

import androidx.camera.view.i;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public enum b implements am0.b {
    DISPOSED;

    public static boolean dispose(AtomicReference<am0.b> atomicReference) {
        am0.b andSet;
        am0.b bVar = atomicReference.get();
        b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(am0.b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean replace(AtomicReference<am0.b> atomicReference, am0.b bVar) {
        am0.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!i.a(atomicReference, bVar2, bVar));
        return true;
    }

    public static void reportDisposableSet() {
        tm0.a.r(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<am0.b> atomicReference, am0.b bVar) {
        am0.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!i.a(atomicReference, bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<am0.b> atomicReference, am0.b bVar) {
        Objects.requireNonNull(bVar, "d is null");
        if (i.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<am0.b> atomicReference, am0.b bVar) {
        if (i.a(atomicReference, null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    public static boolean validate(am0.b bVar, am0.b bVar2) {
        if (bVar2 == null) {
            tm0.a.r(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // am0.b
    public boolean isDisposed() {
        return true;
    }

    @Override // am0.b
    public void dispose() {
    }
}
