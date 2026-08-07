package ezvcard.parameter;

/* JADX INFO: loaded from: classes8.dex */
public class InterestLevel extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<InterestLevel> f63557b = new d<>(InterestLevel.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterestLevel f63558c = new InterestLevel("low");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterestLevel f63559d = new InterestLevel("medium");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterestLevel f63560e = new InterestLevel("high");

    private InterestLevel(String str) {
        super(str);
    }

    public static InterestLevel d(String str) {
        return f63557b.e(str);
    }
}
