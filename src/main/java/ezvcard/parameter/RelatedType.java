package ezvcard.parameter;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;

/* JADX INFO: loaded from: classes8.dex */
public class RelatedType extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<RelatedType> f63567b = new d<>(RelatedType.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RelatedType f63568c = new RelatedType("acquaintance");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RelatedType f63569d = new RelatedType("agent");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RelatedType f63570e = new RelatedType("child");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final RelatedType f63571f = new RelatedType("co-resident");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final RelatedType f63572g = new RelatedType("co-worker");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RelatedType f63573h = new RelatedType("colleague");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final RelatedType f63574i = new RelatedType("contact");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final RelatedType f63575j = new RelatedType("crush");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final RelatedType f63576k = new RelatedType(InquiryField.DateField.TYPE);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RelatedType f63577l = new RelatedType("emergency");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final RelatedType f63578m = new RelatedType("friend");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RelatedType f63579n = new RelatedType("kin");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final RelatedType f63580o = new RelatedType("me");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final RelatedType f63581p = new RelatedType("met");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final RelatedType f63582q = new RelatedType("muse");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final RelatedType f63583r = new RelatedType("neighbor");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final RelatedType f63584s = new RelatedType("parent");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final RelatedType f63585t = new RelatedType("sibling");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final RelatedType f63586u = new RelatedType("spouse");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final RelatedType f63587v = new RelatedType("sweetheart");

    private RelatedType(String str) {
        super(str);
    }

    public static RelatedType d(String str) {
        return f63567b.e(str);
    }
}
