package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {
    public static final s DEFAULT = new a("DEFAULT", 0);
    public static final s STRING = new s("STRING", 1) { // from class: com.google.gson.s.b
        {
            a aVar = null;
        }

        @Override // com.google.gson.s
        public l serialize(Long l11) {
            return l11 == null ? m.f45010a : new p(l11.toString());
        }
    };
    private static final /* synthetic */ s[] $VALUES = $values();

    final enum a extends s {
        a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // com.google.gson.s
        public l serialize(Long l11) {
            return l11 == null ? m.f45010a : new p(l11);
        }
    }

    private static /* synthetic */ s[] $values() {
        return new s[]{DEFAULT, STRING};
    }

    private s(String str, int i11) {
        super(str, i11);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public abstract l serialize(Long l11);

    /* synthetic */ s(String str, int i11, a aVar) {
        this(str, i11);
    }
}
