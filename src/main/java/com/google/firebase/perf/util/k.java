package com.google.firebase.perf.util;

import ch.qos.logback.core.util.FileSize;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k {
    long numBytes;
    public static final k TERABYTES = new a("TERABYTES", 0, 1099511627776L);
    public static final k GIGABYTES = new k("GIGABYTES", 1, FileSize.GB_COEFFICIENT) { // from class: com.google.firebase.perf.util.k.b
        {
            a aVar = null;
        }

        @Override // com.google.firebase.perf.util.k
        public long convert(long j11, k kVar) {
            return kVar.toGigabytes(j11);
        }
    };
    public static final k MEGABYTES = new k("MEGABYTES", 2, 1048576) { // from class: com.google.firebase.perf.util.k.c
        {
            a aVar = null;
        }

        @Override // com.google.firebase.perf.util.k
        public long convert(long j11, k kVar) {
            return kVar.toMegabytes(j11);
        }
    };
    public static final k KILOBYTES = new k("KILOBYTES", 3, 1024) { // from class: com.google.firebase.perf.util.k.d
        {
            a aVar = null;
        }

        @Override // com.google.firebase.perf.util.k
        public long convert(long j11, k kVar) {
            return kVar.toKilobytes(j11);
        }
    };
    public static final k BYTES = new k("BYTES", 4, 1) { // from class: com.google.firebase.perf.util.k.e
        {
            a aVar = null;
        }

        @Override // com.google.firebase.perf.util.k
        public long convert(long j11, k kVar) {
            return kVar.toBytes(j11);
        }
    };
    private static final /* synthetic */ k[] $VALUES = $values();

    final enum a extends k {
        a(String str, int i11, long j11) {
            super(str, i11, j11, null);
        }

        @Override // com.google.firebase.perf.util.k
        public long convert(long j11, k kVar) {
            return kVar.toTerabytes(j11);
        }
    }

    private static /* synthetic */ k[] $values() {
        return new k[]{TERABYTES, GIGABYTES, MEGABYTES, KILOBYTES, BYTES};
    }

    /* synthetic */ k(String str, int i11, long j11, a aVar) {
        this(str, i11, j11);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public abstract long convert(long j11, k kVar);

    public long toBytes(long j11) {
        return j11 * this.numBytes;
    }

    public long toGigabytes(long j11) {
        return (j11 * this.numBytes) / GIGABYTES.numBytes;
    }

    public long toKilobytes(long j11) {
        return (j11 * this.numBytes) / KILOBYTES.numBytes;
    }

    public long toMegabytes(long j11) {
        return (j11 * this.numBytes) / MEGABYTES.numBytes;
    }

    public long toTerabytes(long j11) {
        return (j11 * this.numBytes) / TERABYTES.numBytes;
    }

    private k(String str, int i11, long j11) {
        super(str, i11);
        this.numBytes = j11;
    }
}
