package ezvcard.parameter;

/* JADX INFO: loaded from: classes8.dex */
public class ExpertiseLevel extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<ExpertiseLevel> f63538b = new d<>(ExpertiseLevel.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ExpertiseLevel f63539c = new ExpertiseLevel("beginner");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExpertiseLevel f63540d = new ExpertiseLevel("average");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ExpertiseLevel f63541e = new ExpertiseLevel("expert");

    private ExpertiseLevel(String str) {
        super(str);
    }

    public static ExpertiseLevel d(String str) {
        return f63538b.e(str);
    }
}
