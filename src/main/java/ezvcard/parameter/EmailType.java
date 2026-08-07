package ezvcard.parameter;

import ezvcard.VCardVersion;

/* JADX INFO: loaded from: classes8.dex */
public class EmailType extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<EmailType> f63522b = new d<>(EmailType.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final EmailType f63523c = new EmailType("internet");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final EmailType f63524d = new EmailType("x400");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final EmailType f63525e = new EmailType("pref");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63526f = new EmailType("aol");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63527g = new EmailType("applelink");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63528h = new EmailType("attmail");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63529i = new EmailType("cis");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63530j = new EmailType("eworld");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63531k = new EmailType("ibmmail");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63532l = new EmailType("mcimail");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63533m = new EmailType("powershare");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63534n = new EmailType("prodigy");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1})
    public static final EmailType f63535o = new EmailType("tlx");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @xj0.c({VCardVersion.V4_0})
    public static final EmailType f63536p = new EmailType("home");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @xj0.c({VCardVersion.V4_0})
    public static final EmailType f63537q = new EmailType("work");

    private EmailType(String str) {
        super(str);
    }

    public static EmailType d(String str) {
        return f63522b.e(str);
    }
}
