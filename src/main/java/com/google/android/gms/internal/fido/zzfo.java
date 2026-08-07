package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes5.dex */
final class zzfo implements zzfn {
    zzfo() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x002f A[RETURN] */
    @Override // com.google.android.gms.internal.fido.zzfn
    public final StackTraceElement zza(Class cls, int i11) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i12 = 3;
        boolean z11 = false;
        while (i12 < stackTrace.length) {
            if (stackTrace[i12].getClassName().equals(name)) {
                z11 = true;
            } else {
                if (z11) {
                    if (i12 != -1) {
                        return stackTrace[i12];
                    }
                    return null;
                }
                z11 = false;
            }
            i12++;
        }
        i12 = -1;
        if (i12 != -1) {
            return stackTrace[i12];
        }
        return null;
    }
}
