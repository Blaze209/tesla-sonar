package io.sentry;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes9.dex */
public final class s7 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List<String> f81312u = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Double f81313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Double f81314b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private io.sentry.protocol.r f81325m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<String> f81328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<String> f81329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f81330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<String> f81331s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<String> f81332t;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f81315c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<String> f81316d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f81317e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f81318f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f81319g = a.MEDIUM;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f81320h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f81321i = 30000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f81322j = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f81323k = CoreConstants.MILLIS_IN_ONE_HOUR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f81324l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f81326n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private r4 f81327o = r4.PIXEL_COPY;

    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        a(float f11, int i11, int i12) {
            this.sizeScale = f11;
            this.bitRate = i11;
            this.screenshotQuality = i12;
        }

        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public s7(boolean z11, io.sentry.protocol.r rVar) {
        List<String> list = Collections.EMPTY_LIST;
        this.f81328p = list;
        this.f81329q = list;
        this.f81330r = true;
        List<String> list2 = f81312u;
        this.f81331s = list2;
        this.f81332t = list2;
        if (z11) {
            return;
        }
        C(true);
        B(true);
        this.f81315c.add("android.webkit.WebView");
        this.f81315c.add("android.widget.VideoView");
        this.f81315c.add("androidx.media3.ui.PlayerView");
        this.f81315c.add("com.google.android.exoplayer2.ui.PlayerView");
        this.f81315c.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f81325m = rVar;
    }

    public static List<String> i() {
        return f81312u;
    }

    private static List<String> z(List<String> list, List<String> list2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public void A(boolean z11) {
        this.f81326n = z11;
    }

    public void B(boolean z11) {
        if (z11) {
            a("android.widget.ImageView");
            this.f81316d.remove("android.widget.ImageView");
        } else {
            b("android.widget.ImageView");
            this.f81315c.remove("android.widget.ImageView");
        }
    }

    public void C(boolean z11) {
        if (z11) {
            a("android.widget.TextView");
            this.f81316d.remove("android.widget.TextView");
        } else {
            b("android.widget.TextView");
            this.f81315c.remove("android.widget.TextView");
        }
    }

    public void D(String str) {
        a(str);
        this.f81317e = str;
    }

    public void E(boolean z11) {
        this.f81330r = z11;
    }

    public void F(List<String> list) {
        this.f81328p = Collections.unmodifiableList(new ArrayList(list));
    }

    public void G(List<String> list) {
        this.f81329q = Collections.unmodifiableList(new ArrayList(list));
    }

    public void H(List<String> list) {
        this.f81331s = z(f81312u, list);
    }

    public void I(List<String> list) {
        this.f81332t = z(f81312u, list);
    }

    public void J(Double d11) {
        if (io.sentry.util.c0.f(d11)) {
            this.f81314b = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void K(a aVar) {
        this.f81319g = aVar;
    }

    public void L(r4 r4Var) {
        this.f81327o = r4Var;
    }

    public void M(io.sentry.protocol.r rVar) {
        this.f81325m = rVar;
    }

    public void N(Double d11) {
        if (io.sentry.util.c0.f(d11)) {
            this.f81313a = d11;
            return;
        }
        throw new IllegalArgumentException("The value " + d11 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void O(String str) {
        this.f81318f = str;
    }

    public void a(String str) {
        this.f81315c.add(str);
    }

    public void b(String str) {
        this.f81316d.add(str);
    }

    public long c() {
        return this.f81321i;
    }

    public int d() {
        return this.f81320h;
    }

    public Set<String> e() {
        return this.f81315c;
    }

    public String f() {
        return this.f81317e;
    }

    public List<String> g() {
        return this.f81328p;
    }

    public List<String> h() {
        return this.f81329q;
    }

    public List<String> j() {
        return this.f81331s;
    }

    public List<String> k() {
        return this.f81332t;
    }

    public Double l() {
        return this.f81314b;
    }

    public a m() {
        return this.f81319g;
    }

    public r4 n() {
        return this.f81327o;
    }

    public io.sentry.protocol.r o() {
        return this.f81325m;
    }

    public long p() {
        return this.f81323k;
    }

    public Double q() {
        return this.f81313a;
    }

    public long r() {
        return this.f81322j;
    }

    public Set<String> s() {
        return this.f81316d;
    }

    public String t() {
        return this.f81318f;
    }

    public boolean u() {
        return this.f81326n;
    }

    public boolean v() {
        return this.f81330r;
    }

    public boolean w() {
        return q() != null && q().doubleValue() > 0.0d;
    }

    public boolean x() {
        return l() != null && l().doubleValue() > 0.0d;
    }

    public boolean y() {
        return this.f81324l;
    }
}
