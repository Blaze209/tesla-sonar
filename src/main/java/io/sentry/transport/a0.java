package io.sentry.transport;

import io.sentry.b7;
import io.sentry.d1;
import io.sentry.h0;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.q7;
import io.sentry.util.f0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f81356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f81357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<io.sentry.k, Date> f81358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b> f81359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f81360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.util.a f81361f;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a0.this.c0();
        }
    }

    public interface b {
        void I(a0 a0Var);
    }

    public a0(p pVar, q7 q7Var) {
        this.f81358c = new ConcurrentHashMap();
        this.f81359d = new CopyOnWriteArrayList();
        this.f81360e = null;
        this.f81361f = new io.sentry.util.a();
        this.f81356a = pVar;
        this.f81357b = q7Var;
    }

    private void B(io.sentry.k kVar, Date date) {
        Date date2 = this.f81358c.get(kVar);
        if (date2 == null || date.after(date2)) {
            this.f81358c.put(kVar, date);
            c0();
            d1 d1VarA = this.f81361f.a();
            try {
                if (this.f81360e == null) {
                    this.f81360e = new Timer(true);
                }
                this.f81360e.schedule(new a(), date);
                if (d1VarA != null) {
                    d1VarA.close();
                }
            } catch (Throwable th2) {
                if (d1VarA != null) {
                    try {
                        d1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    private List<io.sentry.k> H(String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return Collections.singletonList(io.sentry.k.Attachment);
            case "replay_video":
                return Collections.singletonList(io.sentry.k.Replay);
            case "profile_chunk":
                return Arrays.asList(io.sentry.k.ProfileChunkUi, io.sentry.k.ProfileChunk);
            case "profile":
                return Collections.singletonList(io.sentry.k.Profile);
            case "feedback":
                return Collections.singletonList(io.sentry.k.Feedback);
            case "log":
                return Collections.singletonList(io.sentry.k.LogItem);
            case "span":
                return Collections.singletonList(io.sentry.k.Span);
            case "event":
                return Collections.singletonList(io.sentry.k.Error);
            case "trace_metric":
                return Collections.singletonList(io.sentry.k.TraceMetric);
            case "check_in":
                return Collections.singletonList(io.sentry.k.Monitor);
            case "session":
                return Collections.singletonList(io.sentry.k.Session);
            case "transaction":
                return Collections.singletonList(io.sentry.k.Transaction);
            default:
                return Collections.singletonList(io.sentry.k.Unknown);
        }
    }

    private boolean T(String str) {
        Iterator<io.sentry.k> it = H(str).iterator();
        while (it.hasNext()) {
            if (I(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void b0(h0 h0Var, final boolean z11) {
        io.sentry.util.n.k(h0Var, io.sentry.hints.p.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                ((io.sentry.hints.p) obj).d(false);
            }
        });
        io.sentry.util.n.k(h0Var, io.sentry.hints.k.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.y
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                ((io.sentry.hints.k) obj).e(z11);
            }
        });
        io.sentry.util.n.k(h0Var, io.sentry.hints.f.class, new io.sentry.util.n.a() { // from class: io.sentry.transport.z
            @Override // io.sentry.util.n.a
            public final void accept(Object obj) {
                a0.o(this.f81410a, (io.sentry.hints.f) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        Iterator<b> it = this.f81359d.iterator();
        while (it.hasNext()) {
            it.next().I(this);
        }
    }

    private long e0(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    public static /* synthetic */ void o(a0 a0Var, io.sentry.hints.f fVar) {
        a0Var.getClass();
        fVar.a();
        a0Var.f81357b.getLogger().c(b7.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    }

    public p5 C(p5 p5Var, h0 h0Var) {
        ArrayList arrayList = null;
        for (p6 p6Var : p5Var.c()) {
            if (T(p6Var.K().b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(p6Var);
                this.f81357b.getClientReportRecorder().c(io.sentry.clientreport.f.RATELIMIT_BACKOFF, p6Var);
            }
        }
        if (arrayList == null) {
            return p5Var;
        }
        this.f81357b.getLogger().c(b7.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (p6 p6Var2 : p5Var.c()) {
            if (!arrayList.contains(p6Var2)) {
                arrayList2.add(p6Var2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new p5(p5Var.b(), arrayList2);
        }
        this.f81357b.getLogger().c(b7.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        b0(h0Var, false);
        return null;
    }

    public boolean I(io.sentry.k kVar) {
        Date date;
        Date date2 = new Date(this.f81356a.a());
        Date date3 = this.f81358c.get(io.sentry.k.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (io.sentry.k.Unknown.equals(kVar) || (date = this.f81358c.get(kVar)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean J() {
        Date date = new Date(this.f81356a.a());
        Iterator<io.sentry.k> it = this.f81358c.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = this.f81358c.get(it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d1 d1VarA = this.f81361f.a();
        try {
            Timer timer = this.f81360e;
            if (timer != null) {
                timer.cancel();
                this.f81360e = null;
            }
            if (d1VarA != null) {
                d1VarA.close();
            }
            this.f81359d.clear();
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void k0(b bVar) {
        this.f81359d.remove(bVar);
    }

    public void n0(String str, String str2, int i11) {
        if (str == null) {
            if (i11 == 429) {
                B(io.sentry.k.All, new Date(this.f81356a.a() + e0(str2)));
                return;
            }
            return;
        }
        for (String str3 : str.split(",", -1)) {
            String[] strArrSplit = str3.replace(" ", "").split(":", -1);
            if (strArrSplit.length > 0) {
                long jE0 = e0(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    String str4 = strArrSplit[1];
                    Date date = new Date(this.f81356a.a() + jE0);
                    if (str4 == null || str4.isEmpty()) {
                        B(io.sentry.k.All, date);
                    } else {
                        for (String str5 : str4.split(";", -1)) {
                            io.sentry.k kVarValueOf = io.sentry.k.Unknown;
                            try {
                                String strB = f0.b(str5);
                                if (strB != null) {
                                    kVarValueOf = io.sentry.k.valueOf(strB);
                                } else {
                                    this.f81357b.getLogger().c(b7.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (IllegalArgumentException e11) {
                                this.f81357b.getLogger().b(b7.INFO, e11, "Unknown category: %s", str5);
                            }
                            if (!io.sentry.k.Unknown.equals(kVarValueOf)) {
                                B(kVarValueOf, date);
                            }
                        }
                    }
                }
            }
        }
    }

    public void t(b bVar) {
        this.f81359d.add(bVar);
    }

    public a0(q7 q7Var) {
        this(n.b(), q7Var);
    }
}
