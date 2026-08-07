package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
public class a extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<a> f63615b = new d<>(a.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final a f63616c = new a("QUOTED-PRINTABLE", true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final a f63617d = new a("BASE64", true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final a f63618e = new a("8BIT", true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final a f63619f = new a("7BIT", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @xj0.c({VCardVersion.V3_0})
    public static final a f63620g = new a("b");

    private a(String str) {
        super(str);
    }

    public static Collection<a> d() {
        return f63615b.a();
    }

    public static a e(String str) {
        return f63615b.d(str);
    }

    public static a f(String str) {
        return f63615b.e(str);
    }

    private a(String str, boolean z11) {
        super(str, z11);
    }
}
