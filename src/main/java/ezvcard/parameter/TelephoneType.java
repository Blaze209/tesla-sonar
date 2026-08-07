package ezvcard.parameter;

import ezvcard.VCardVersion;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes8.dex */
public class TelephoneType extends VCardParameter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d<TelephoneType> f63595b = new d<>(TelephoneType.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType f63596c = new TelephoneType("bbs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType f63597d = new TelephoneType("car");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TelephoneType f63598e = new TelephoneType("cell");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TelephoneType f63599f = new TelephoneType("fax");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TelephoneType f63600g = new TelephoneType("home");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType f63601h = new TelephoneType("isdn");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType f63602i = new TelephoneType("modem");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType f63603j = new TelephoneType("msg");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TelephoneType f63604k = new TelephoneType("pager");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @xj0.c({VCardVersion.V3_0})
    public static final TelephoneType f63605l = new TelephoneType("pcs");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @xj0.c({VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType f63606m = new TelephoneType("pref");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @xj0.c({VCardVersion.V4_0})
    public static final TelephoneType f63607n = new TelephoneType("text");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @xj0.c({VCardVersion.V4_0})
    public static final TelephoneType f63608o = new TelephoneType("textphone");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TelephoneType f63609p = new TelephoneType(MediaStreamTrack.VIDEO_TRACK_KIND);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final TelephoneType f63610q = new TelephoneType("voice");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final TelephoneType f63611r = new TelephoneType("work");

    private TelephoneType(String str) {
        super(str);
    }

    public static TelephoneType d(String str) {
        return f63595b.e(str);
    }
}
