package com.google.android.libraries.places.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzaej extends IOException {
    zzaej() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzaej(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    zzaej(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
