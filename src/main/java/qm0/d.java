package qm0;

import androidx.camera.view.i;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
public enum d implements nr0.c {
    CANCELLED;

    public static void deferredRequest(AtomicReference<nr0.c> atomicReference, AtomicLong atomicLong, long j11) {
        nr0.c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j11);
            return;
        }
        if (validate(j11)) {
            rm0.c.a(atomicLong, j11);
            nr0.c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<nr0.c> atomicReference, AtomicLong atomicLong, nr0.c cVar) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<nr0.c> atomicReference, nr0.c cVar) {
        nr0.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!i.a(atomicReference, cVar2, cVar));
        return true;
    }

    public static void reportMoreProduced(long j11) {
        tm0.a.r(new ProtocolViolationException("More produced than requested: " + j11));
    }

    public static void reportSubscriptionSet() {
        tm0.a.r(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<nr0.c> atomicReference, nr0.c cVar) {
        nr0.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar == null) {
                    return false;
                }
                cVar.cancel();
                return false;
            }
        } while (!i.a(atomicReference, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<nr0.c> atomicReference, nr0.c cVar) {
        Objects.requireNonNull(cVar, "s is null");
        if (i.a(atomicReference, null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(nr0.c cVar, nr0.c cVar2) {
        if (cVar2 == null) {
            tm0.a.r(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // nr0.c
    public void cancel() {
    }

    public static boolean cancel(AtomicReference<nr0.c> atomicReference) {
        nr0.c andSet;
        nr0.c cVar = atomicReference.get();
        d dVar = CANCELLED;
        if (cVar == dVar || (andSet = atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j11) {
        if (j11 > 0) {
            return true;
        }
        tm0.a.r(new IllegalArgumentException("n > 0 required but it was " + j11));
        return false;
    }

    public static boolean setOnce(AtomicReference<nr0.c> atomicReference, nr0.c cVar, long j11) {
        if (!setOnce(atomicReference, cVar)) {
            return false;
        }
        cVar.request(j11);
        return true;
    }

    @Override // nr0.c
    public void request(long j11) {
    }
}
