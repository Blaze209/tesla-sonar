package net.sf.scuba.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a FEMALE;
    public static final a MALE;
    public static final a UNKNOWN;
    public static final a UNSPECIFIED;

    /* JADX INFO: renamed from: net.sf.scuba.data.a$a, reason: collision with other inner class name */
    static enum C2006a extends a {
        C2006a(String str, int i11) {
            super(str, i11, null);
        }

        @Override // net.sf.scuba.data.a
        public int toInt() {
            return 1;
        }
    }

    static {
        C2006a c2006a = new C2006a("MALE", 0);
        MALE = c2006a;
        a aVar = new a("FEMALE", 1) { // from class: net.sf.scuba.data.a.b
            {
                C2006a c2006a2 = null;
            }

            @Override // net.sf.scuba.data.a
            public int toInt() {
                return 2;
            }
        };
        FEMALE = aVar;
        a aVar2 = new a("UNKNOWN", 2) { // from class: net.sf.scuba.data.a.c
            {
                C2006a c2006a2 = null;
            }

            @Override // net.sf.scuba.data.a
            public int toInt() {
                return 255;
            }
        };
        UNKNOWN = aVar2;
        a aVar3 = new a("UNSPECIFIED", 3) { // from class: net.sf.scuba.data.a.d
            {
                C2006a c2006a2 = null;
            }

            @Override // net.sf.scuba.data.a
            public int toInt() {
                return 0;
            }
        };
        UNSPECIFIED = aVar3;
        $VALUES = new a[]{c2006a, aVar, aVar2, aVar3};
    }

    private a(String str, int i11) {
        super(str, i11);
    }

    public static a getInstance(int i11) {
        for (a aVar : values()) {
            if (aVar.toInt() == i11) {
                return aVar;
            }
        }
        return UNKNOWN;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public abstract int toInt();

    /* synthetic */ a(String str, int i11, C2006a c2006a) {
        this(str, i11);
    }
}
