package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {
    public static final c0 LENIENT;
    public static final c0 SMART;
    public static final c0 STRICT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c0[] f82086a;

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f82086a.clone();
    }

    static {
        c0 c0Var = new c0("STRICT", 0);
        STRICT = c0Var;
        c0 c0Var2 = new c0("SMART", 1);
        SMART = c0Var2;
        c0 c0Var3 = new c0("LENIENT", 2);
        LENIENT = c0Var3;
        f82086a = new c0[]{c0Var, c0Var2, c0Var3};
    }
}
