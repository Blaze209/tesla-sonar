package ezvcard.parameter;

import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
public class Calscale extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<Calscale> f63520b = new d<>(Calscale.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Calscale f63521c = new Calscale("gregorian");

    private Calscale(String str) {
        super(str);
    }

    public static Collection<Calscale> d() {
        return f63520b.a();
    }

    public static Calscale e(String str) {
        return f63520b.d(str);
    }

    public static Calscale f(String str) {
        return f63520b.e(str);
    }
}
