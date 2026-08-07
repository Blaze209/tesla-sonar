package com.google.common.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class n {
    public static final n EXPLICIT = new a("EXPLICIT", 0);
    public static final n REPLACED = new n("REPLACED", 1) { // from class: com.google.common.cache.n.b
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.n
        boolean wasEvicted() {
            return false;
        }
    };
    public static final n COLLECTED = new n("COLLECTED", 2) { // from class: com.google.common.cache.n.c
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.n
        boolean wasEvicted() {
            return true;
        }
    };
    public static final n EXPIRED = new n("EXPIRED", 3) { // from class: com.google.common.cache.n.d
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.n
        boolean wasEvicted() {
            return true;
        }
    };
    public static final n SIZE = new n("SIZE", 4) { // from class: com.google.common.cache.n.e
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.n
        boolean wasEvicted() {
            return true;
        }
    };
    private static final /* synthetic */ n[] $VALUES = $values();

    final enum a extends n {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.common.cache.n
        boolean wasEvicted() {
            return false;
        }
    }

    private static /* synthetic */ n[] $values() {
        return new n[]{EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE};
    }

    private n(String str, int i11) {
        super(str, i11);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    abstract boolean wasEvicted();

    /* synthetic */ n(String str, int i11, a aVar) {
        this(str, i11);
    }
}
