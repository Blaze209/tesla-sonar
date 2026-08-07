package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.t;
import androidx.media3.exoplayer.upstream.Loader;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.location.DeviceOrientationRequest;
import d8.j;
import d8.l;
import d8.o;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import p7.d0;
import p7.m0;
import p7.r0;
import p7.y;
import s7.q0;
import s8.k;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource extends androidx.media3.exoplayer.source.a {
    private androidx.media3.datasource.a A;
    private Loader B;
    private q C;
    private IOException D;
    private Handler E;
    private y.g F;
    private Uri G;
    private Uri H;
    private d8.c I;
    private boolean J;
    private long K;
    private long L;
    private long M;
    private int N;
    private long O;
    private int P;
    private y Q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0192a f9578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.dash.a.InterfaceC0196a f9579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final n8.e f9580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s8.e f9581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final i f9582m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f9583n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c8.b f9584o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f9585p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f9586q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final s.a f9587r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.c.a<? extends d8.c> f9588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final e f9589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Object f9590u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final SparseArray<androidx.media3.exoplayer.dash.c> f9591v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f9592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Runnable f9593x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final androidx.media3.exoplayer.dash.f.b f9594y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final k f9595z;

    public static final class Factory implements t {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f9596l = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.exoplayer.dash.a.InterfaceC0196a f9597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0192a f9598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s8.e.a f9599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private e8.k f9600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private n8.e f9601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f9602h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f9603i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f9604j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.c.a<? extends d8.c> f9605k;

        public Factory(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this(new androidx.media3.exoplayer.dash.d.a(interfaceC0192a), interfaceC0192a);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public DashMediaSource g(y yVar) {
            s7.a.f(yVar.f101682b);
            androidx.media3.exoplayer.upstream.c.a dVar = this.f9605k;
            if (dVar == null) {
                dVar = new d8.d();
            }
            List<m0> list = yVar.f101682b.f101787e;
            androidx.media3.exoplayer.upstream.c.a bVar = !list.isEmpty() ? new l8.b(dVar, list) : dVar;
            s8.e.a aVar = this.f9599e;
            return new DashMediaSource(yVar, null, this.f9598d, bVar, this.f9597c, this.f9601g, aVar == null ? null : aVar.a(yVar), this.f9600f.a(yVar), this.f9602h, this.f9603i, this.f9604j, null);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        @Deprecated
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory b(boolean z11) {
            this.f9597c.b(z11);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory c(int i11) {
            this.f9597c.c(i11);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory e(s8.e.a aVar) {
            this.f9599e = (s8.e.a) s7.a.f(aVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Factory d(e8.k kVar) {
            this.f9600f = (e8.k) s7.a.g(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public Factory f(androidx.media3.exoplayer.upstream.b bVar) {
            this.f9602h = (androidx.media3.exoplayer.upstream.b) s7.a.g(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Factory a(t9.q.a aVar) {
            this.f9597c.a((t9.q.a) s7.a.f(aVar));
            return this;
        }

        public Factory(androidx.media3.exoplayer.dash.a.InterfaceC0196a interfaceC0196a, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this.f9597c = (androidx.media3.exoplayer.dash.a.InterfaceC0196a) s7.a.f(interfaceC0196a);
            this.f9598d = interfaceC0192a;
            this.f9600f = new androidx.media3.exoplayer.drm.g();
            this.f9602h = new androidx.media3.exoplayer.upstream.a();
            this.f9603i = 30000L;
            this.f9604j = 5000000L;
            this.f9601g = new n8.f();
            b(true);
        }
    }

    class a implements t8.c.b {
        a() {
        }

        @Override // t8.c.b
        public void a(IOException iOException) {
            DashMediaSource.this.c0(iOException);
        }

        @Override // t8.c.b
        public void d() {
            DashMediaSource.this.d0(t8.c.i());
        }
    }

    private static final class b extends r0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f9607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f9608f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f9609g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f9610h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f9611i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f9612j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f9613k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final d8.c f9614l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final y f9615m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final y.g f9616n;

        public b(long j11, long j12, long j13, int i11, long j14, long j15, long j16, d8.c cVar, y yVar, y.g gVar) {
            s7.a.h(cVar.f59781d == (gVar != null));
            this.f9607e = j11;
            this.f9608f = j12;
            this.f9609g = j13;
            this.f9610h = i11;
            this.f9611i = j14;
            this.f9612j = j15;
            this.f9613k = j16;
            this.f9614l = cVar;
            this.f9615m = yVar;
            this.f9616n = gVar;
        }

        private long x(long j11) {
            c8.e eVarL;
            long j12 = this.f9613k;
            if (!y(this.f9614l)) {
                return j12;
            }
            if (j11 > 0) {
                j12 += j11;
                if (j12 > this.f9612j) {
                    return -9223372036854775807L;
                }
            }
            long j13 = this.f9611i + j12;
            long jG = this.f9614l.g(0);
            int i11 = 0;
            while (i11 < this.f9614l.e() - 1 && j13 >= jG) {
                j13 -= jG;
                i11++;
                jG = this.f9614l.g(i11);
            }
            d8.g gVarD = this.f9614l.d(i11);
            int iA = gVarD.a(2);
            return (iA == -1 || (eVarL = gVarD.f59816c.get(iA).f59770c.get(0).l()) == null || eVarL.g(jG) == 0) ? j12 : (j12 + eVarL.b(eVarL.f(j13, jG))) - j13;
        }

        private static boolean y(d8.c cVar) {
            return cVar.f59781d && cVar.f59782e != -9223372036854775807L && cVar.f59779b == -9223372036854775807L;
        }

        @Override // p7.r0
        public int f(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f9610h) >= 0 && iIntValue < m()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // p7.r0
        public r0.b k(int i11, r0.b bVar, boolean z11) {
            s7.a.c(i11, 0, m());
            return bVar.u(z11 ? this.f9614l.d(i11).f59814a : null, z11 ? Integer.valueOf(this.f9610h + i11) : null, 0, this.f9614l.g(i11), q0.b1(this.f9614l.d(i11).f59815b - this.f9614l.d(0).f59815b) - this.f9611i);
        }

        @Override // p7.r0
        public int m() {
            return this.f9614l.e();
        }

        @Override // p7.r0
        public Object q(int i11) {
            s7.a.c(i11, 0, m());
            return Integer.valueOf(this.f9610h + i11);
        }

        @Override // p7.r0
        public r0.d s(int i11, r0.d dVar, long j11) {
            s7.a.c(i11, 0, 1);
            long jX = x(j11);
            Object obj = r0.d.f101471q;
            y yVar = this.f9615m;
            d8.c cVar = this.f9614l;
            return dVar.h(obj, yVar, cVar, this.f9607e, this.f9608f, this.f9609g, true, y(cVar), this.f9616n, jX, this.f9612j, 0, m() - 1, this.f9611i);
        }

        @Override // p7.r0
        public int t() {
            return 1;
        }
    }

    private final class c implements androidx.media3.exoplayer.dash.f.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.dash.f.b
        public void a(long j11) {
            DashMediaSource.this.U(j11);
        }

        @Override // androidx.media3.exoplayer.dash.f.b
        public void b() {
            DashMediaSource.this.V();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    static final class d implements androidx.media3.exoplayer.upstream.c.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Pattern f9618a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // androidx.media3.exoplayer.upstream.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = f9618a.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.c("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j11 = Marker.ANY_NON_NULL_MARKER.equals(matcher.group(4)) ? 1L : -1L;
                    long j12 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j11 * (((j12 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e11) {
                throw ParserException.c(null, e11);
            }
        }
    }

    private final class e implements Loader.b<androidx.media3.exoplayer.upstream.c<d8.c>> {
        private e() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void s(androidx.media3.exoplayer.upstream.c<d8.c> cVar, long j11, long j12, boolean z11) {
            DashMediaSource.this.W(cVar, j11, j12);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void v(androidx.media3.exoplayer.upstream.c<d8.c> cVar, long j11, long j12) {
            DashMediaSource.this.X(cVar, j11, j12);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c p(androidx.media3.exoplayer.upstream.c<d8.c> cVar, long j11, long j12, IOException iOException, int i11) {
            return DashMediaSource.this.Y(cVar, j11, j12, iOException, i11);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void q(androidx.media3.exoplayer.upstream.c<d8.c> cVar, long j11, long j12, int i11) {
            DashMediaSource.this.Z(cVar, j11, j12, i11);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    final class f implements k {
        f() {
        }

        private void b() throws IOException {
            if (DashMediaSource.this.D != null) {
                throw DashMediaSource.this.D;
            }
        }

        @Override // s8.k
        public void a() throws IOException {
            DashMediaSource.this.B.a();
            b();
        }
    }

    private final class g implements Loader.b<androidx.media3.exoplayer.upstream.c<Long>> {
        private g() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void s(androidx.media3.exoplayer.upstream.c<Long> cVar, long j11, long j12, boolean z11) {
            DashMediaSource.this.W(cVar, j11, j12);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void v(androidx.media3.exoplayer.upstream.c<Long> cVar, long j11, long j12) {
            DashMediaSource.this.a0(cVar, j11, j12);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c p(androidx.media3.exoplayer.upstream.c<Long> cVar, long j11, long j12, IOException iOException, int i11) {
            return DashMediaSource.this.b0(cVar, j11, j12, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    private static final class h implements androidx.media3.exoplayer.upstream.c.a<Long> {
        private h() {
        }

        @Override // androidx.media3.exoplayer.upstream.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(q0.j1(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        d0.a("media3.exoplayer.dash");
    }

    /* synthetic */ DashMediaSource(y yVar, d8.c cVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, androidx.media3.exoplayer.upstream.c.a aVar, androidx.media3.exoplayer.dash.a.InterfaceC0196a interfaceC0196a, n8.e eVar, s8.e eVar2, i iVar, androidx.media3.exoplayer.upstream.b bVar, long j11, long j12, a aVar2) {
        this(yVar, cVar, interfaceC0192a, aVar, interfaceC0196a, eVar, eVar2, iVar, bVar, j11, j12);
    }

    private static long N(d8.g gVar, long j11, long j12) {
        long jB1 = q0.b1(gVar.f59815b);
        boolean zR = R(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i11 = 0; i11 < gVar.f59816c.size(); i11++) {
            d8.a aVar = gVar.f59816c.get(i11);
            List<j> list = aVar.f59770c;
            int i12 = aVar.f59769b;
            boolean z11 = (i12 == 1 || i12 == 2) ? false : true;
            if ((!zR || !z11) && !list.isEmpty()) {
                c8.e eVarL = list.get(0).l();
                if (eVarL == null) {
                    return jB1 + j11;
                }
                long jK = eVarL.k(j11, j12);
                if (jK == 0) {
                    return jB1;
                }
                long jD = (eVarL.d(j11, j12) + jK) - 1;
                jMin = Math.min(jMin, eVarL.c(jD, j11) + eVarL.b(jD) + jB1);
            }
        }
        return jMin;
    }

    private static long O(d8.g gVar, long j11, long j12) {
        long jB1 = q0.b1(gVar.f59815b);
        boolean zR = R(gVar);
        long jMax = jB1;
        for (int i11 = 0; i11 < gVar.f59816c.size(); i11++) {
            d8.a aVar = gVar.f59816c.get(i11);
            List<j> list = aVar.f59770c;
            int i12 = aVar.f59769b;
            boolean z11 = (i12 == 1 || i12 == 2) ? false : true;
            if ((!zR || !z11) && !list.isEmpty()) {
                c8.e eVarL = list.get(0).l();
                if (eVarL == null || eVarL.k(j11, j12) == 0) {
                    return jB1;
                }
                jMax = Math.max(jMax, eVarL.b(eVarL.d(j11, j12)) + jB1);
            }
        }
        return jMax;
    }

    private static long P(d8.c cVar, long j11) {
        c8.e eVarL;
        int iE = cVar.e() - 1;
        d8.g gVarD = cVar.d(iE);
        long jB1 = q0.b1(gVarD.f59815b);
        long jG = cVar.g(iE);
        long jB2 = q0.b1(j11);
        long jB3 = q0.b1(cVar.f59778a);
        long jB4 = q0.b1(cVar.f59782e);
        if (jB4 == -9223372036854775807L || jB4 >= 5000000) {
            jB4 = 5000000;
        }
        for (int i11 = 0; i11 < gVarD.f59816c.size(); i11++) {
            List<j> list = gVarD.f59816c.get(i11).f59770c;
            if (!list.isEmpty() && (eVarL = list.get(0).l()) != null) {
                long jE = ((jB3 + jB1) + eVarL.e(jG, jB2)) - jB2;
                if (jE > 0 && (jE < jB4 - 100000 || (jE > jB4 && jE < jB4 + 100000))) {
                    jB4 = jE;
                }
            }
        }
        return qu.e.b(jB4, 1000L, RoundingMode.CEILING);
    }

    private long Q() {
        return Math.min((this.N - 1) * 1000, 5000);
    }

    private static boolean R(d8.g gVar) {
        for (int i11 = 0; i11 < gVar.f59816c.size(); i11++) {
            int i12 = gVar.f59816c.get(i11).f59769b;
            if (i12 == 1 || i12 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean S(d8.g gVar) {
        for (int i11 = 0; i11 < gVar.f59816c.size(); i11++) {
            c8.e eVarL = gVar.f59816c.get(i11).f59770c.get(0).l();
            if (eVarL == null || eVarL.j()) {
                return true;
            }
        }
        return false;
    }

    private void T() {
        t8.c.l(this.B, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(IOException iOException) {
        s7.t.e("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.M = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        e0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(long j11) {
        this.M = j11;
        e0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(boolean z11) {
        long j11;
        long j12;
        long j13;
        for (int i11 = 0; i11 < this.f9591v.size(); i11++) {
            int iKeyAt = this.f9591v.keyAt(i11);
            if (iKeyAt >= this.P) {
                this.f9591v.valueAt(i11).P(this.I, iKeyAt - this.P);
            }
        }
        d8.g gVarD = this.I.d(0);
        int iE = this.I.e() - 1;
        d8.g gVarD2 = this.I.d(iE);
        long jG = this.I.g(iE);
        long jB1 = q0.b1(q0.p0(this.M));
        long jO = O(gVarD, this.I.g(0), jB1);
        long jN = N(gVarD2, jG, jB1);
        boolean z12 = this.I.f59781d && !S(gVarD2);
        if (z12) {
            long j14 = this.I.f59783f;
            if (j14 != -9223372036854775807L) {
                jO = Math.max(jO, jN - q0.b1(j14));
            }
        }
        long j15 = jN - jO;
        d8.c cVar = this.I;
        if (cVar.f59781d) {
            s7.a.h(cVar.f59778a != -9223372036854775807L);
            long jB2 = (jB1 - q0.b1(this.I.f59778a)) - jO;
            l0(jB2, j15);
            long jO1 = this.I.f59778a + q0.O1(jO);
            long jB3 = jB2 - q0.b1(this.F.f101765a);
            j11 = 0;
            long jMin = Math.min(this.f9586q, j15 / 2);
            j12 = jO1;
            j13 = jB3 < jMin ? jMin : jB3;
        } else {
            j11 = 0;
            j12 = -9223372036854775807L;
            j13 = 0;
        }
        long jB4 = jO - q0.b1(gVarD.f59815b);
        d8.c cVar2 = this.I;
        F(new b(cVar2.f59778a, j12, this.M, this.P, jB4, j15, j13, cVar2, a(), this.I.f59781d ? this.F : null));
        if (this.f9577h) {
            return;
        }
        this.E.removeCallbacks(this.f9593x);
        if (z12) {
            this.E.postDelayed(this.f9593x, P(this.I, q0.p0(this.M)));
        }
        if (this.J) {
            k0();
            return;
        }
        if (z11) {
            d8.c cVar3 = this.I;
            if (cVar3.f59781d) {
                long j16 = cVar3.f59782e;
                if (j16 != -9223372036854775807L) {
                    if (j16 == j11) {
                        j16 = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
                    }
                    i0(Math.max(j11, (this.K + j16) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void f0(o oVar) {
        String str = oVar.f59868a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            g0(oVar);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            h0(oVar, new d());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            h0(oVar, new h(null));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            T();
        } else {
            c0(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void g0(o oVar) {
        try {
            d0(q0.j1(oVar.f59869b) - this.L);
        } catch (ParserException e11) {
            c0(e11);
        }
    }

    private void h0(o oVar, androidx.media3.exoplayer.upstream.c.a<Long> aVar) {
        j0(new androidx.media3.exoplayer.upstream.c(this.A, Uri.parse(oVar.f59869b), 5, aVar), new g(this, null), 1);
    }

    private void i0(long j11) {
        this.E.postDelayed(this.f9592w, j11);
    }

    private <T> void j0(androidx.media3.exoplayer.upstream.c<T> cVar, Loader.b<androidx.media3.exoplayer.upstream.c<T>> bVar, int i11) {
        this.B.n(cVar, bVar, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0() {
        Uri uri;
        this.E.removeCallbacks(this.f9592w);
        if (this.B.i()) {
            return;
        }
        if (this.B.j()) {
            this.J = true;
            return;
        }
        synchronized (this.f9590u) {
            uri = this.G;
        }
        this.J = false;
        v7.j jVarA = new v7.j.b().i(uri).b(1).a();
        if (this.f9581l != null) {
            s8.f.C2354f c2354fL = new s8.f.C2354f(this.f9581l, DateTokenConverter.CONVERTER_KEY).l("m");
            d8.c cVar = this.I;
            if (cVar != null) {
                c2354fL.i(cVar.f59781d);
            }
            jVarA = c2354fL.a().a(jVarA);
        }
        j0(new androidx.media3.exoplayer.upstream.c(this.A, jVarA, 4, this.f9588s), this.f9589t, this.f9583n.b(4));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    private void l0(long j11, long j12) {
        long j13;
        long jMin;
        long jO1;
        long j14;
        long jS;
        long j15;
        l lVar;
        long j16;
        long j17;
        long j18;
        long jS2;
        float f11;
        float f12;
        l lVar2;
        l lVar3;
        l lVar4;
        d8.c cVar;
        l lVar5;
        long j19;
        y.g gVar = a().f101684d;
        long jO2 = q0.O1(j11);
        long j21 = gVar.f101767c;
        if (j21 == -9223372036854775807L) {
            l lVar6 = this.I.f59787j;
            if (lVar6 != null) {
                long j22 = lVar6.f59861c;
                if (j22 != -9223372036854775807L) {
                    jMin = Math.min(jO2, j22);
                }
                jO1 = q0.O1(j11 - j12);
                if (jO1 < 0 && j13 > 0) {
                    jO1 = 0;
                }
                j14 = this.I.f59780c;
                if (j14 != -9223372036854775807L) {
                    jO1 = Math.min(jO1 + j14, jO2);
                }
                jS = jO1;
                j15 = gVar.f101766b;
                if (j15 != -9223372036854775807L) {
                    jS = q0.s(j15, jS, jO2);
                } else {
                    lVar = this.I.f59787j;
                    if (lVar != null) {
                        j16 = lVar.f59860b;
                        if (j16 != -9223372036854775807L) {
                            jS = q0.s(j16, jS, jO2);
                        }
                    }
                }
                j17 = jS;
                if (j17 > j13) {
                    j18 = j17;
                } else {
                    j18 = j13;
                }
                jS2 = this.F.f101765a;
                if (jS2 == -9223372036854775807L) {
                    cVar = this.I;
                    lVar5 = cVar.f59787j;
                    if (lVar5 != null) {
                        j19 = lVar5.f59859a;
                        if (j19 != -9223372036854775807L) {
                            jS2 = j19;
                        } else {
                            jS2 = cVar.f59784g;
                            if (jS2 == -9223372036854775807L) {
                                jS2 = this.f9585p;
                            }
                        }
                    } else {
                        jS2 = cVar.f59784g;
                        if (jS2 == -9223372036854775807L) {
                            jS2 = this.f9585p;
                        }
                    }
                }
                if (jS2 < j17) {
                    jS2 = j17;
                }
                if (jS2 > j18) {
                    jS2 = q0.s(q0.O1(j11 - Math.min(this.f9586q, j12 / 2)), j17, j18);
                }
                long j23 = j18;
                f11 = gVar.f101768d;
                if (f11 == -3.4028235E38f) {
                    lVar4 = this.I.f59787j;
                    if (lVar4 != null) {
                        f11 = lVar4.f59862d;
                    } else {
                        f11 = -3.4028235E38f;
                    }
                }
                f12 = gVar.f101769e;
                if (f12 == -3.4028235E38f) {
                    lVar3 = this.I.f59787j;
                    if (lVar3 != null) {
                        f12 = lVar3.f59863e;
                    } else {
                        f12 = -3.4028235E38f;
                    }
                }
                if (f11 == -3.4028235E38f && f12 == -3.4028235E38f && ((lVar2 = this.I.f59787j) == null || lVar2.f59859a == -9223372036854775807L)) {
                    f11 = 1.0f;
                    f12 = 1.0f;
                }
                this.F = new y.g.a().k(jS2).i(j17).g(j23).j(f11).h(f12).f();
            }
            j13 = jO2;
            jO1 = q0.O1(j11 - j12);
            if (jO1 < 0) {
                jO1 = 0;
            }
            j14 = this.I.f59780c;
            if (j14 != -9223372036854775807L) {
                jO1 = Math.min(jO1 + j14, jO2);
            }
            jS = jO1;
            j15 = gVar.f101766b;
            if (j15 != -9223372036854775807L) {
                jS = q0.s(j15, jS, jO2);
            } else {
                lVar = this.I.f59787j;
                if (lVar != null) {
                    j16 = lVar.f59860b;
                    if (j16 != -9223372036854775807L) {
                        jS = q0.s(j16, jS, jO2);
                    }
                }
            }
            j17 = jS;
            if (j17 > j13) {
                j18 = j17;
            } else {
                j18 = j13;
            }
            jS2 = this.F.f101765a;
            if (jS2 == -9223372036854775807L) {
                cVar = this.I;
                lVar5 = cVar.f59787j;
                if (lVar5 != null) {
                    j19 = lVar5.f59859a;
                    if (j19 != -9223372036854775807L) {
                        jS2 = j19;
                    } else {
                        jS2 = cVar.f59784g;
                        if (jS2 == -9223372036854775807L) {
                            jS2 = this.f9585p;
                        }
                    }
                } else {
                    jS2 = cVar.f59784g;
                    if (jS2 == -9223372036854775807L) {
                        jS2 = this.f9585p;
                    }
                }
            }
            if (jS2 < j17) {
                jS2 = j17;
            }
            if (jS2 > j18) {
                jS2 = q0.s(q0.O1(j11 - Math.min(this.f9586q, j12 / 2)), j17, j18);
            }
            long j24 = j18;
            f11 = gVar.f101768d;
            if (f11 == -3.4028235E38f) {
                lVar4 = this.I.f59787j;
                if (lVar4 != null) {
                    f11 = lVar4.f59862d;
                } else {
                    f11 = -3.4028235E38f;
                }
            }
            f12 = gVar.f101769e;
            if (f12 == -3.4028235E38f) {
                lVar3 = this.I.f59787j;
                if (lVar3 != null) {
                    f12 = lVar3.f59863e;
                } else {
                    f12 = -3.4028235E38f;
                }
            }
            if (f11 == -3.4028235E38f) {
                f11 = 1.0f;
                f12 = 1.0f;
            }
            this.F = new y.g.a().k(jS2).i(j17).g(j24).j(f11).h(f12).f();
        }
        jMin = Math.min(jO2, j21);
        j13 = jMin;
        jO1 = q0.O1(j11 - j12);
        if (jO1 < 0) {
            jO1 = 0;
        }
        j14 = this.I.f59780c;
        if (j14 != -9223372036854775807L) {
            jO1 = Math.min(jO1 + j14, jO2);
        }
        jS = jO1;
        j15 = gVar.f101766b;
        if (j15 != -9223372036854775807L) {
            jS = q0.s(j15, jS, jO2);
        } else {
            lVar = this.I.f59787j;
            if (lVar != null) {
                j16 = lVar.f59860b;
                if (j16 != -9223372036854775807L) {
                    jS = q0.s(j16, jS, jO2);
                }
            }
        }
        j17 = jS;
        if (j17 > j13) {
            j18 = j17;
        } else {
            j18 = j13;
        }
        jS2 = this.F.f101765a;
        if (jS2 == -9223372036854775807L) {
            cVar = this.I;
            lVar5 = cVar.f59787j;
            if (lVar5 != null) {
                j19 = lVar5.f59859a;
                if (j19 != -9223372036854775807L) {
                    jS2 = j19;
                } else {
                    jS2 = cVar.f59784g;
                    if (jS2 == -9223372036854775807L) {
                        jS2 = this.f9585p;
                    }
                }
            } else {
                jS2 = cVar.f59784g;
                if (jS2 == -9223372036854775807L) {
                    jS2 = this.f9585p;
                }
            }
        }
        if (jS2 < j17) {
            jS2 = j17;
        }
        if (jS2 > j18) {
            jS2 = q0.s(q0.O1(j11 - Math.min(this.f9586q, j12 / 2)), j17, j18);
        }
        long j25 = j18;
        f11 = gVar.f101768d;
        if (f11 == -3.4028235E38f) {
            lVar4 = this.I.f59787j;
            if (lVar4 != null) {
                f11 = lVar4.f59862d;
            } else {
                f11 = -3.4028235E38f;
            }
        }
        f12 = gVar.f101769e;
        if (f12 == -3.4028235E38f) {
            lVar3 = this.I.f59787j;
            if (lVar3 != null) {
                f12 = lVar3.f59863e;
            } else {
                f12 = -3.4028235E38f;
            }
        }
        if (f11 == -3.4028235E38f) {
            f11 = 1.0f;
            f12 = 1.0f;
        }
        this.F = new y.g.a().k(jS2).i(j17).g(j25).j(f11).h(f12).f();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void E(q qVar) {
        this.C = qVar;
        this.f9582m.f(Looper.myLooper(), C());
        this.f9582m.b();
        if (this.f9577h) {
            e0(false);
            return;
        }
        this.A = this.f9578i.a();
        this.B = new Loader("DashMediaSource");
        this.E = q0.C();
        k0();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void G() {
        this.J = false;
        this.A = null;
        Loader loader = this.B;
        if (loader != null) {
            loader.l();
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = -9223372036854775807L;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.f9591v.clear();
        this.f9584o.i();
        this.f9582m.release();
    }

    void U(long j11) {
        long j12 = this.O;
        if (j12 == -9223372036854775807L || j12 < j11) {
            this.O = j11;
        }
    }

    void V() {
        this.E.removeCallbacks(this.f9593x);
        k0();
    }

    void W(androidx.media3.exoplayer.upstream.c<?> cVar, long j11, long j12) {
        n8.i iVar = new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        this.f9583n.a(cVar.f11166a);
        this.f9587r.l(iVar, cVar.f11168c);
    }

    void X(androidx.media3.exoplayer.upstream.c<d8.c> cVar, long j11, long j12) {
        n8.i iVar = new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        this.f9583n.a(cVar.f11166a);
        this.f9587r.o(iVar, cVar.f11168c);
        d8.c cVarE = cVar.e();
        d8.c cVar2 = this.I;
        int iE = cVar2 == null ? 0 : cVar2.e();
        long j13 = cVarE.d(0).f59815b;
        int i11 = 0;
        while (i11 < iE && this.I.d(i11).f59815b < j13) {
            i11++;
        }
        if (cVarE.f59781d) {
            if (iE - i11 > cVarE.e()) {
                s7.t.i("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = this.O;
                if (j14 == -9223372036854775807L || cVarE.f59785h * 1000 > j14) {
                    this.N = 0;
                } else {
                    s7.t.i("DashMediaSource", "Loaded stale dynamic manifest: " + cVarE.f59785h + ", " + this.O);
                }
            }
            int i12 = this.N;
            this.N = i12 + 1;
            if (i12 < this.f9583n.b(cVar.f11168c)) {
                i0(Q());
                return;
            } else {
                this.D = new DashManifestStaleException();
                return;
            }
        }
        this.I = cVarE;
        this.J = cVarE.f59781d & this.J;
        this.K = j11 - j12;
        this.L = j11;
        this.P += i11;
        synchronized (this.f9590u) {
            try {
                if (cVar.f11167b.f118101a.equals(this.G) || (this.f9581l != null && s8.f.b(cVar.f11167b.f118101a).equals(this.G))) {
                    Uri uriB = this.I.f59788k;
                    if (uriB == null) {
                        uriB = s8.f.b(cVar.f());
                    }
                    this.G = uriB;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d8.c cVar3 = this.I;
        if (!cVar3.f59781d || this.M != -9223372036854775807L) {
            e0(true);
            return;
        }
        o oVar = cVar3.f59786i;
        if (oVar != null) {
            f0(oVar);
        } else {
            T();
        }
    }

    Loader.c Y(androidx.media3.exoplayer.upstream.c<d8.c> cVar, long j11, long j12, IOException iOException, int i11) {
        n8.i iVar = new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        long jD = this.f9583n.d(new androidx.media3.exoplayer.upstream.b.c(iVar, new n8.j(cVar.f11168c), iOException, i11));
        Loader.c cVarH = jD == -9223372036854775807L ? Loader.f11138g : Loader.h(false, jD);
        boolean zC = cVarH.c();
        this.f9587r.s(iVar, cVar.f11168c, iOException, !zC);
        if (!zC) {
            this.f9583n.a(cVar.f11166a);
        }
        return cVarH;
    }

    void Z(androidx.media3.exoplayer.upstream.c<d8.c> cVar, long j11, long j12, int i11) {
        this.f9587r.u(i11 == 0 ? new n8.i(cVar.f11166a, cVar.f11167b, j11) : new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c()), cVar.f11168c, i11);
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized y a() {
        return this.Q;
    }

    void a0(androidx.media3.exoplayer.upstream.c<Long> cVar, long j11, long j12) {
        n8.i iVar = new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c());
        this.f9583n.a(cVar.f11166a);
        this.f9587r.o(iVar, cVar.f11168c);
        d0(cVar.e().longValue() - j11);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void b() {
        this.f9595z.a();
    }

    Loader.c b0(androidx.media3.exoplayer.upstream.c<Long> cVar, long j11, long j12, IOException iOException) {
        this.f9587r.s(new n8.i(cVar.f11166a, cVar.f11167b, cVar.f(), cVar.d(), j11, j12, cVar.c()), cVar.f11168c, iOException, true);
        this.f9583n.a(cVar.f11166a);
        c0(iOException);
        return Loader.f11137f;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(androidx.media3.exoplayer.source.q qVar) {
        androidx.media3.exoplayer.dash.c cVar = (androidx.media3.exoplayer.dash.c) qVar;
        cVar.L();
        this.f9591v.remove(cVar.f9622a);
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void i(y yVar) {
        this.Q = yVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean k(y yVar) {
        y yVarA = a();
        y.h hVar = (y.h) s7.a.f(yVarA.f101682b);
        y.h hVar2 = yVar.f101682b;
        return hVar2 != null && hVar2.f101783a.equals(hVar.f101783a) && hVar2.f101787e.equals(hVar.f101787e) && Objects.equals(hVar2.f101785c, hVar.f101785c) && yVarA.f101684d.equals(yVar.f101684d);
    }

    @Override // androidx.media3.exoplayer.source.r
    public androidx.media3.exoplayer.source.q r(r.b bVar, s8.b bVar2, long j11) {
        int iIntValue = ((Integer) bVar.f11103a).intValue() - this.P;
        s.a aVarZ = z(bVar);
        androidx.media3.exoplayer.dash.c cVar = new androidx.media3.exoplayer.dash.c(this.P + iIntValue, this.I, this.f9584o, iIntValue, this.f9579j, this.C, this.f9581l, this.f9582m, x(bVar), this.f9583n, aVarZ, this.M, this.f9595z, bVar2, this.f9580k, this.f9594y, C());
        this.f9591v.put(cVar.f9622a, cVar);
        return cVar;
    }

    private DashMediaSource(y yVar, d8.c cVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, androidx.media3.exoplayer.upstream.c.a<? extends d8.c> aVar, androidx.media3.exoplayer.dash.a.InterfaceC0196a interfaceC0196a, n8.e eVar, s8.e eVar2, i iVar, androidx.media3.exoplayer.upstream.b bVar, long j11, long j12) {
        this.Q = yVar;
        this.F = yVar.f101684d;
        this.G = ((y.h) s7.a.f(yVar.f101682b)).f101783a;
        this.H = yVar.f101682b.f101783a;
        this.I = cVar;
        this.f9578i = interfaceC0192a;
        this.f9588s = aVar;
        this.f9579j = interfaceC0196a;
        this.f9581l = eVar2;
        this.f9582m = iVar;
        this.f9583n = bVar;
        this.f9585p = j11;
        this.f9586q = j12;
        this.f9580k = eVar;
        this.f9584o = new c8.b();
        boolean z11 = cVar != null;
        this.f9577h = z11;
        a aVar2 = null;
        this.f9587r = z(null);
        this.f9590u = new Object();
        this.f9591v = new SparseArray<>();
        this.f9594y = new c(this, aVar2);
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        if (!z11) {
            this.f9589t = new e(this, aVar2);
            this.f9595z = new f();
            this.f9592w = new Runnable() { // from class: c8.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18918a.k0();
                }
            };
            this.f9593x = new Runnable() { // from class: c8.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18919a.e0(false);
                }
            };
            return;
        }
        s7.a.h(true ^ cVar.f59781d);
        this.f9589t = null;
        this.f9592w = null;
        this.f9593x = null;
        this.f9595z = new k.a();
    }
}
