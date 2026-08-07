package ezvcard.parameter;

/* JADX INFO: loaded from: classes8.dex */
public class ImppType extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<ImppType> f63550b = new d<>(ImppType.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ImppType f63551c = new ImppType("personal");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImppType f63552d = new ImppType("business");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImppType f63553e = new ImppType("home");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImppType f63554f = new ImppType("work");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ImppType f63555g = new ImppType("mobile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ImppType f63556h = new ImppType("pref");

    private ImppType(String str) {
        super(str);
    }

    public static ImppType d(String str) {
        return f63550b.e(str);
    }
}
