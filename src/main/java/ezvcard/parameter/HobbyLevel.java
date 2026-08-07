package ezvcard.parameter;

/* JADX INFO: loaded from: classes8.dex */
public class HobbyLevel extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<HobbyLevel> f63542b = new d<>(HobbyLevel.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HobbyLevel f63543c = new HobbyLevel("low");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HobbyLevel f63544d = new HobbyLevel("medium");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HobbyLevel f63545e = new HobbyLevel("high");

    private HobbyLevel(String str) {
        super(str);
    }

    public static HobbyLevel d(String str) {
        return f63542b.e(str);
    }
}
