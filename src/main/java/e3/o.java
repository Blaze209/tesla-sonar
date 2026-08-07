package e3;

import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Le3/o;", "", "", "", "contentHints", "<init>", "(Ljava/util/Set;)V", "contentHint", "(Ljava/lang/String;)V", "a", "Ljava/util/Set;", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<String> contentHints;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f61607c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o f61608d = new o("username");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final o f61609e = new o("password");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final o f61610f = new o("emailAddress");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final o f61611g = new o("newUsername");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final o f61612h = new o("newPassword");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final o f61613i = new o("postalAddress");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final o f61614j = new o("postalCode");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final o f61615k = new o("creditCardNumber");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final o f61616l = new o("creditCardSecurityCode");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final o f61617m = new o("creditCardExpirationDate");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final o f61618n = new o("creditCardExpirationMonth");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final o f61619o = new o("creditCardExpirationYear");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final o f61620p = new o("creditCardExpirationDay");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final o f61621q = new o("addressCountry");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final o f61622r = new o("addressRegion");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final o f61623s = new o("addressLocality");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final o f61624t = new o("streetAddress");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final o f61625u = new o("extendedAddress");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final o f61626v = new o("extendedPostalCode");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final o f61627w = new o("personName");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final o f61628x = new o("personGivenName");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final o f61629y = new o("personFamilyName");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final o f61630z = new o("personMiddleName");
    private static final o A = new o("personMiddleInitial");
    private static final o B = new o("personNamePrefix");
    private static final o C = new o("personNameSuffix");
    private static final o D = new o("phoneNumber");
    private static final o E = new o("phoneNumberDevice");
    private static final o F = new o("phoneCountryCode");
    private static final o G = new o("phoneNational");
    private static final o H = new o("gender");
    private static final o I = new o("birthDateFull");
    private static final o J = new o("birthDateDay");
    private static final o K = new o("birthDateMonth");
    private static final o L = new o("birthDateYear");
    private static final o M = new o("smsOTPCode");

    private o(Set<String> set) {
        this.contentHints = set;
    }

    public o(String str) {
        this((Set<String>) d1.c(str));
    }
}
