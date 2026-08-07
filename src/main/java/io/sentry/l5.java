package io.sentry;

import io.sentry.exception.SentryEnvelopeException;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class l5 implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f80740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.transport.q f80741c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.logger.c f80743e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f80742d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f80739a = true;

    private static final class b implements Comparator<e> {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(e eVar, e eVar2) {
            return eVar.p().compareTo(eVar2.p());
        }
    }

    public l5(q7 q7Var) {
        this.f80740b = (q7) io.sentry.util.y.c(q7Var, "SentryOptions is required.");
        k1 transportFactory = q7Var.getTransportFactory();
        if (transportFactory instanceof g3) {
            transportFactory = new io.sentry.a();
            q7Var.setTransportFactory(transportFactory);
        }
        this.f80741c = transportFactory.a(q7Var, new b4(q7Var).a());
        if (q7Var.getLogs().b()) {
            this.f80743e = q7Var.getLogs().a().a(q7Var, this);
        } else {
            this.f80743e = io.sentry.logger.h.c();
        }
    }

    private w8 A(x0 x0Var, h0 h0Var, i5 i5Var, String str) {
        if (io.sentry.util.n.h(h0Var, io.sentry.hints.c.class)) {
            if (i5Var != null) {
                return d.c(i5Var, str, this.f80740b).J();
            }
            return null;
        }
        if (x0Var == null) {
            return null;
        }
        i1 i1VarF = x0Var.f();
        return i1VarF != null ? i1VarF.k() : io.sentry.util.j0.g(x0Var, this.f80740b).h();
    }

    private w8 B(x0 x0Var, h0 h0Var, r6 r6Var) {
        return A(x0Var, h0Var, r6Var, r6Var != null ? r6Var.w0() : null);
    }

    private r6 C(r6 r6Var, h0 h0Var, List<c0> list) {
        for (c0 c0Var : list) {
            try {
                boolean z11 = c0Var instanceof c;
                boolean zH = io.sentry.util.n.h(h0Var, io.sentry.hints.c.class);
                if (zH && z11) {
                    r6Var = c0Var.n(r6Var, h0Var);
                } else if (!zH && !z11) {
                    r6Var = c0Var.n(r6Var, h0Var);
                }
            } catch (Throwable th2) {
                this.f80740b.getLogger().b(b7.ERROR, th2, "An exception occurred while processing event by processor: %s", c0Var.getClass().getName());
            }
            if (r6Var == null) {
                this.f80740b.getLogger().c(b7.DEBUG, "Event was dropped by a processor: %s", c0Var.getClass().getName());
                this.f80740b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Error);
                break;
            }
        }
        return r6Var;
    }

    private r7 D(r7 r7Var, h0 h0Var, List<c0> list) {
        for (c0 c0Var : list) {
            try {
                r7Var = c0Var.c(r7Var, h0Var);
            } catch (Throwable th2) {
                this.f80740b.getLogger().b(b7.ERROR, th2, "An exception occurred while processing replay event by processor: %s", c0Var.getClass().getName());
            }
            if (r7Var == null) {
                this.f80740b.getLogger().c(b7.DEBUG, "Replay event was dropped by a processor: %s", c0Var.getClass().getName());
                this.f80740b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Replay);
                break;
            }
        }
        return r7Var;
    }

    private io.sentry.protocol.e0 E(io.sentry.protocol.e0 e0Var, h0 h0Var, List<c0> list) {
        for (c0 c0Var : list) {
            int size = e0Var.o0().size();
            try {
                e0Var = c0Var.o(e0Var, h0Var);
            } catch (Throwable th2) {
                this.f80740b.getLogger().b(b7.ERROR, th2, "An exception occurred while processing transaction by processor: %s", c0Var.getClass().getName());
            }
            int size2 = e0Var == null ? 0 : e0Var.o0().size();
            if (e0Var == null) {
                this.f80740b.getLogger().c(b7.DEBUG, "Transaction was dropped by a processor: %s", c0Var.getClass().getName());
                io.sentry.clientreport.h clientReportRecorder = this.f80740b.getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
                clientReportRecorder.a(fVar, k.Transaction);
                this.f80740b.getClientReportRecorder().b(fVar, k.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i11 = size - size2;
                this.f80740b.getLogger().c(b7.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i11), c0Var.getClass().getName());
                this.f80740b.getClientReportRecorder().b(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Span, i11);
            }
        }
        return e0Var;
    }

    private boolean F() {
        io.sentry.util.b0 b0VarA = this.f80740b.getSampleRate() == null ? null : io.sentry.util.d0.a();
        return this.f80740b.getSampleRate() == null || b0VarA == null || this.f80740b.getSampleRate().doubleValue() >= b0VarA.c();
    }

    private io.sentry.protocol.x G(p5 p5Var, h0 h0Var) {
        q7.b beforeEnvelopeCallback = this.f80740b.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                beforeEnvelopeCallback.c(p5Var, h0Var);
            } catch (Throwable th2) {
                this.f80740b.getLogger().a(b7.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        z6.d().c(this.f80740b.getLogger());
        if (h0Var == null) {
            this.f80741c.x3(p5Var);
        } else {
            this.f80741c.a0(p5Var, h0Var);
        }
        io.sentry.protocol.x xVarA = p5Var.b().a();
        return xVarA != null ? xVarA : io.sentry.protocol.x.f81078b;
    }

    private boolean H(i5 i5Var, h0 h0Var) {
        if (io.sentry.util.n.q(h0Var)) {
            return true;
        }
        this.f80740b.getLogger().c(b7.DEBUG, "Event was cached so not applying scope: %s", i5Var.G());
        return false;
    }

    private boolean I(f8 f8Var, f8 f8Var2) {
        if (f8Var2 == null) {
            return false;
        }
        if (f8Var == null) {
            return true;
        }
        f8.b bVarL = f8Var2.l();
        f8.b bVar = f8.b.Crashed;
        if (bVarL != bVar || f8Var.l() == bVar) {
            return f8Var2.e() > 0 && f8Var.e() <= 0;
        }
        return true;
    }

    private void J(i5 i5Var, Collection<e> collection) {
        List<e> listB = i5Var.B();
        if (listB == null || collection.isEmpty()) {
            return;
        }
        listB.addAll(collection);
        Collections.sort(listB, this.f80742d);
    }

    public static /* synthetic */ void i(f8 f8Var) {
    }

    public static /* synthetic */ void j(l5 l5Var, r6 r6Var, h0 h0Var, f8 f8Var) {
        if (f8Var == null) {
            l5Var.f80740b.getLogger().c(b7.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        l5Var.getClass();
        String strD = null;
        f8.b bVar = r6Var.y0() ? f8.b.Crashed : null;
        boolean z11 = f8.b.Crashed == bVar || r6Var.z0();
        String str = (r6Var.K() == null || r6Var.K().l() == null || !r6Var.K().l().containsKey("user-agent")) ? null : r6Var.K().l().get("user-agent");
        Object objG = io.sentry.util.n.g(h0Var);
        if (objG instanceof io.sentry.hints.a) {
            strD = ((io.sentry.hints.a) objG).d();
            bVar = f8.b.Abnormal;
        }
        if (f8Var.q(bVar, str, z11, strD) && f8Var.m()) {
            f8Var.c();
        }
    }

    private void l(x0 x0Var, h0 h0Var) {
        if (x0Var != null) {
            h0Var.a(x0Var.L());
        }
    }

    private <T extends i5> T m(T t11, x0 x0Var) {
        if (x0Var != null) {
            if (t11.K() == null) {
                t11.a0(x0Var.getRequest());
            }
            if (t11.Q() == null) {
                t11.f0(x0Var.t());
            }
            if (t11.N() == null) {
                t11.e0(new HashMap(x0Var.p()));
            } else {
                for (Map.Entry<String, String> entry : x0Var.p().entrySet()) {
                    if (!t11.N().containsKey(entry.getKey())) {
                        t11.N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t11.B() == null) {
                t11.S(new ArrayList(x0Var.n()));
            } else {
                J(t11, x0Var.n());
            }
            if (t11.H() == null) {
                t11.X(new HashMap(x0Var.getExtras()));
            } else {
                for (Map.Entry<String, Object> entry2 : x0Var.getExtras().entrySet()) {
                    if (!t11.H().containsKey(entry2.getKey())) {
                        t11.H().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVarC = t11.C();
            for (Map.Entry<String, Object> entry3 : new io.sentry.protocol.c(x0Var.r()).b()) {
                if (!cVarC.a(entry3.getKey())) {
                    cVarC.l(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t11;
    }

    private r6 n(r6 r6Var, x0 x0Var, h0 h0Var) {
        io.sentry.protocol.g gVarG;
        if (x0Var == null) {
            return r6Var;
        }
        m(r6Var, x0Var);
        if (r6Var.w0() == null) {
            r6Var.H0(x0Var.I());
        }
        if (r6Var.q0() == null) {
            r6Var.B0(x0Var.H());
        }
        if (x0Var.getLevel() != null) {
            r6Var.C0(x0Var.getLevel());
        }
        g1 g1VarI = x0Var.i();
        if (r6Var.C().j() == null) {
            if (g1VarI == null) {
                r6Var.C().z(z8.x(x0Var.K()));
            } else {
                r6Var.C().z(g1VarI.e());
            }
        }
        if (r6Var.C().f() == null && (gVarG = x0Var.g()) != null) {
            r6Var.C().r(gVarG);
        }
        return C(r6Var, h0Var, x0Var.C());
    }

    private r7 o(r7 r7Var, x0 x0Var) {
        if (x0Var != null) {
            if (r7Var.K() == null) {
                r7Var.a0(x0Var.getRequest());
            }
            if (r7Var.Q() == null) {
                r7Var.f0(x0Var.t());
            }
            if (r7Var.N() == null) {
                r7Var.e0(new HashMap(x0Var.p()));
            } else {
                for (Map.Entry<String, String> entry : x0Var.p().entrySet()) {
                    if (!r7Var.N().containsKey(entry.getKey())) {
                        r7Var.N().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVarC = r7Var.C();
            for (Map.Entry<String, Object> entry2 : new io.sentry.protocol.c(x0Var.r()).b()) {
                if (!cVarC.a(entry2.getKey())) {
                    cVarC.l(entry2.getKey(), entry2.getValue());
                }
            }
            g1 g1VarI = x0Var.i();
            if (r7Var.C().j() == null) {
                if (g1VarI == null) {
                    r7Var.C().z(z8.x(x0Var.K()));
                    return r7Var;
                }
                r7Var.C().z(g1VarI.e());
            }
        }
        return r7Var;
    }

    private p5 p(i5 i5Var, List<io.sentry.b> list, f8 f8Var, w8 w8Var, u3 u3Var) {
        io.sentry.protocol.x xVar;
        ArrayList arrayList = new ArrayList();
        if (i5Var != null) {
            arrayList.add(p6.B(this.f80740b.getSerializer(), i5Var));
            xVar = i5Var.G();
        } else {
            xVar = null;
        }
        if (f8Var != null) {
            arrayList.add(p6.G(this.f80740b.getSerializer(), f8Var));
        }
        if (u3Var != null) {
            arrayList.add(p6.E(u3Var, this.f80740b.getMaxTraceFileSize(), this.f80740b.getSerializer()));
            if (xVar == null) {
                xVar = new io.sentry.protocol.x(u3Var.B());
            }
        }
        if (list != null) {
            Iterator<io.sentry.b> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(p6.z(this.f80740b.getSerializer(), this.f80740b.getLogger(), it.next(), this.f80740b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p5(new q5(xVar, this.f80740b.getSdkVersion(), w8Var), arrayList);
    }

    private p5 s(f7 f7Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p6.C(this.f80740b.getSerializer(), f7Var));
        return new p5(new q5(null, this.f80740b.getSdkVersion(), null), arrayList);
    }

    private p5 t(r7 r7Var, z3 z3Var, w8 w8Var, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p6.F(this.f80740b.getSerializer(), this.f80740b.getLogger(), r7Var, z3Var, z11));
        return new p5(new q5(r7Var.G(), this.f80740b.getSessionReplay().o(), w8Var), arrayList);
    }

    private r6 u(r6 r6Var, h0 h0Var) {
        q7.c beforeSend = this.f80740b.getBeforeSend();
        if (beforeSend == null) {
            return r6Var;
        }
        try {
            return beforeSend.a(r6Var, h0Var);
        } catch (Throwable th2) {
            this.f80740b.getLogger().a(b7.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    private r7 v(r7 r7Var, h0 h0Var) {
        this.f80740b.getBeforeSendReplay();
        return r7Var;
    }

    private io.sentry.protocol.e0 w(io.sentry.protocol.e0 e0Var, h0 h0Var) {
        this.f80740b.getBeforeSendTransaction();
        return e0Var;
    }

    private List<io.sentry.b> x(List<io.sentry.b> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (io.sentry.b bVar : list) {
            if (bVar.k()) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private void y(x0 x0Var, h0 h0Var) {
        i1 i1VarF = x0Var.f();
        if (i1VarF == null || !io.sentry.util.n.h(h0Var, io.sentry.hints.q.class)) {
            return;
        }
        Object objG = io.sentry.util.n.g(h0Var);
        if (!(objG instanceof io.sentry.hints.f)) {
            i1VarF.a(r8.ABORTED, false, null);
        } else {
            ((io.sentry.hints.f) objG).g(i1VarF.i());
            i1VarF.a(r8.ABORTED, false, h0Var);
        }
    }

    private List<io.sentry.b> z(h0 h0Var) {
        List<io.sentry.b> listE = h0Var.e();
        io.sentry.b bVarG = h0Var.g();
        if (bVarG != null) {
            listE.add(bVarG);
        }
        io.sentry.b bVarI = h0Var.i();
        if (bVarI != null) {
            listE.add(bVarI);
        }
        io.sentry.b bVarH = h0Var.h();
        if (bVarH != null) {
            listE.add(bVarH);
        }
        return listE;
    }

    f8 K(final r6 r6Var, final h0 h0Var, x0 x0Var) {
        if (io.sentry.util.n.q(h0Var)) {
            if (x0Var != null) {
                return x0Var.o(new d4.b() { // from class: io.sentry.k5
                    @Override // io.sentry.d4.b
                    public final void a(f8 f8Var) {
                        l5.j(this.f80714a, r6Var, h0Var, f8Var);
                    }
                });
            }
            this.f80740b.getLogger().c(b7.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.b1
    public void a(boolean z11) {
        long shutdownTimeoutMillis;
        this.f80740b.getLogger().c(b7.INFO, "Closing SentryClient.", new Object[0]);
        if (z11) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.f80740b.getShutdownTimeoutMillis();
            } catch (IOException e11) {
                this.f80740b.getLogger().a(b7.WARNING, "Failed to close the connection to the Sentry Server.", e11);
            }
        }
        b(shutdownTimeoutMillis);
        this.f80743e.a(z11);
        this.f80741c.a(z11);
        for (c0 c0Var : this.f80740b.getEventProcessors()) {
            if (c0Var instanceof Closeable) {
                try {
                    ((Closeable) c0Var).close();
                } catch (IOException e12) {
                    this.f80740b.getLogger().c(b7.WARNING, "Failed to close the event processor {}.", c0Var, e12);
                }
            }
        }
        this.f80739a = false;
    }

    @Override // io.sentry.b1
    public void b(long j11) {
        this.f80743e.b(j11);
        this.f80741c.b(j11);
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x c(q3 q3Var, x0 x0Var) {
        io.sentry.util.y.c(q3Var, "profileChunk is required.");
        this.f80740b.getLogger().c(b7.DEBUG, "Capturing profile chunk: %s", q3Var.n());
        io.sentry.protocol.x xVarN = q3Var.n();
        io.sentry.protocol.d dVarC = io.sentry.protocol.d.c(q3Var.o(), this.f80740b);
        if (dVarC != null) {
            q3Var.r(dVarC);
        }
        try {
            return G(new p5(new q5(xVarN, this.f80740b.getSdkVersion(), null), Collections.singletonList(p6.D(q3Var, this.f80740b.getSerializer(), this.f80740b.getProfilerConverter()))), null);
        } catch (SentryEnvelopeException | IOException e11) {
            this.f80740b.getLogger().b(b7.WARNING, e11, "Capturing profile chunk %s failed.", xVarN);
            return io.sentry.protocol.x.f81078b;
        }
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x d(r7 r7Var, x0 x0Var, h0 h0Var) {
        io.sentry.util.y.c(r7Var, "SessionReplay is required.");
        if (h0Var == null) {
            h0Var = new h0();
        }
        if (H(r7Var, h0Var)) {
            o(r7Var, x0Var);
        }
        ILogger logger = this.f80740b.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "Capturing session replay: %s", r7Var.G());
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        io.sentry.protocol.x xVarG = r7Var.G() != null ? r7Var.G() : xVar;
        r7 r7VarD = D(r7Var, h0Var, this.f80740b.getEventProcessors());
        if (r7VarD != null && (r7VarD = v(r7VarD, h0Var)) == null) {
            this.f80740b.getLogger().c(b7Var, "Event was dropped by beforeSendReplay", new Object[0]);
            this.f80740b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, k.Replay);
        }
        if (r7VarD == null) {
            return xVar;
        }
        try {
            p5 p5VarT = t(r7VarD, h0Var.f(), A(x0Var, h0Var, r7VarD, null), io.sentry.util.n.h(h0Var, io.sentry.hints.c.class));
            h0Var.b();
            this.f80741c.a0(p5VarT, h0Var);
            return xVarG;
        } catch (IOException e11) {
            this.f80740b.getLogger().b(b7.WARNING, e11, "Capturing event %s failed.", xVarG);
            return io.sentry.protocol.x.f81078b;
        }
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x e(io.sentry.protocol.e0 e0Var, w8 w8Var, x0 x0Var, h0 h0Var, u3 u3Var) {
        io.sentry.util.y.c(e0Var, "Transaction is required.");
        if (h0Var == null) {
            h0Var = new h0();
        }
        if (H(e0Var, h0Var)) {
            l(x0Var, h0Var);
        }
        ILogger logger = this.f80740b.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "Capturing transaction: %s", e0Var.G());
        if (io.sentry.util.j0.f(this.f80740b.getIgnoredTransactions(), e0Var.p0())) {
            this.f80740b.getLogger().c(b7Var, "Transaction was dropped as transaction name %s is ignored", e0Var.p0());
            io.sentry.clientreport.h clientReportRecorder = this.f80740b.getClientReportRecorder();
            io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
            clientReportRecorder.a(fVar, k.Transaction);
            this.f80740b.getClientReportRecorder().b(fVar, k.Span, e0Var.o0().size() + 1);
            return io.sentry.protocol.x.f81078b;
        }
        io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
        io.sentry.protocol.x xVarG = e0Var.G() != null ? e0Var.G() : xVar;
        if (H(e0Var, h0Var)) {
            e0Var = (io.sentry.protocol.e0) m(e0Var, x0Var);
            if (e0Var != null && x0Var != null) {
                e0Var = E(e0Var, h0Var, x0Var.C());
            }
            if (e0Var == null) {
                this.f80740b.getLogger().c(b7Var, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (e0Var != null) {
            e0Var = E(e0Var, h0Var, this.f80740b.getEventProcessors());
        }
        if (e0Var == null) {
            this.f80740b.getLogger().c(b7Var, "Transaction was dropped by Event processors.", new Object[0]);
            return xVar;
        }
        int size = e0Var.o0().size();
        io.sentry.protocol.e0 e0VarW = w(e0Var, h0Var);
        int size2 = e0VarW == null ? 0 : e0VarW.o0().size();
        if (e0VarW == null) {
            this.f80740b.getLogger().c(b7Var, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.h clientReportRecorder2 = this.f80740b.getClientReportRecorder();
            io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.BEFORE_SEND;
            clientReportRecorder2.a(fVar2, k.Transaction);
            this.f80740b.getClientReportRecorder().b(fVar2, k.Span, size + 1);
            return xVar;
        }
        if (size2 < size) {
            int i11 = size - size2;
            this.f80740b.getLogger().c(b7Var, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i11));
            this.f80740b.getClientReportRecorder().b(io.sentry.clientreport.f.BEFORE_SEND, k.Span, i11);
        }
        try {
            p5 p5VarP = p(e0VarW, x(z(h0Var)), null, w8Var, u3Var);
            h0Var.b();
            return p5VarP != null ? G(p5VarP, h0Var) : xVarG;
        } catch (SentryEnvelopeException | IOException e11) {
            this.f80740b.getLogger().b(b7.WARNING, e11, "Capturing transaction %s failed.", xVarG);
            return io.sentry.protocol.x.f81078b;
        }
    }

    @Override // io.sentry.b1
    public void f(f8 f8Var, h0 h0Var) {
        io.sentry.util.y.c(f8Var, "Session is required.");
        if (f8Var.h() == null || f8Var.h().isEmpty()) {
            this.f80740b.getLogger().c(b7.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            r(p5.a(this.f80740b.getSerializer(), f8Var, this.f80740b.getSdkVersion()), h0Var);
        } catch (IOException e11) {
            this.f80740b.getLogger().a(b7.ERROR, "Failed to capture session.", e11);
        }
    }

    @Override // io.sentry.b1
    public void g(f7 f7Var) {
        try {
            G(s(f7Var), null);
        } catch (IOException e11) {
            this.f80740b.getLogger().b(b7.WARNING, e11, "Capturing log failed.", new Object[0]);
        }
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x h(r6 r6Var, x0 x0Var, h0 h0Var) {
        r6 r6Var2;
        l5 l5Var;
        io.sentry.util.y.c(r6Var, "SentryEvent is required.");
        if (h0Var == null) {
            h0Var = new h0();
        }
        if (H(r6Var, h0Var)) {
            l(x0Var, h0Var);
        }
        ILogger logger = this.f80740b.getLogger();
        b7 b7Var = b7.DEBUG;
        logger.c(b7Var, "Capturing event: %s", r6Var.G());
        Throwable thO = r6Var.O();
        if (thO != null && io.sentry.util.h.b(this.f80740b.getIgnoredExceptionsForType(), thO)) {
            this.f80740b.getLogger().c(b7Var, "Event was dropped as the exception %s is ignored", thO.getClass());
            this.f80740b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Error);
            return io.sentry.protocol.x.f81078b;
        }
        if (io.sentry.util.e.a(this.f80740b.getIgnoredErrors(), r6Var)) {
            this.f80740b.getLogger().c(b7Var, "Event was dropped as it matched a string/pattern in ignoredErrors", r6Var.s0());
            this.f80740b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, k.Error);
            return io.sentry.protocol.x.f81078b;
        }
        boolean z11 = false;
        if (H(r6Var, h0Var) && (r6Var = n(r6Var, x0Var, h0Var)) == null) {
            this.f80740b.getLogger().c(b7Var, "Event was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.x.f81078b;
        }
        r6 r6VarC = C(r6Var, h0Var, this.f80740b.getEventProcessors());
        if (r6VarC != null && (r6VarC = u(r6VarC, h0Var)) == null) {
            this.f80740b.getLogger().c(b7Var, "Event was dropped by beforeSend", new Object[0]);
            this.f80740b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, k.Error);
        }
        if (r6VarC != null) {
            r6VarC = io.sentry.util.g.b(r6VarC, h0Var, this.f80740b);
        }
        if (r6VarC == null) {
            return io.sentry.protocol.x.f81078b;
        }
        f8 f8VarO = x0Var != null ? x0Var.o(new d4.b() { // from class: io.sentry.j5
            @Override // io.sentry.d4.b
            public final void a(f8 f8Var) {
                l5.i(f8Var);
            }
        }) : null;
        f8 f8VarK = (f8VarO == null || !f8VarO.m()) ? K(r6VarC, h0Var, x0Var) : null;
        if (F()) {
            r6Var2 = r6VarC;
        } else {
            this.f80740b.getLogger().c(b7Var, "Event %s was dropped due to sampling decision.", r6VarC.G());
            this.f80740b.getClientReportRecorder().a(io.sentry.clientreport.f.SAMPLE_RATE, k.Error);
            r6Var2 = null;
        }
        boolean zI = I(f8VarO, f8VarK);
        if (r6Var2 == null && !zI) {
            this.f80740b.getLogger().c(b7Var, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.x.f81078b;
        }
        io.sentry.protocol.x xVarG = io.sentry.protocol.x.f81078b;
        if (r6Var2 != null && r6Var2.G() != null) {
            xVarG = r6Var2.G();
        }
        boolean zH = io.sentry.util.n.h(h0Var, io.sentry.hints.c.class);
        if (io.sentry.util.n.h(h0Var, io.sentry.hints.e.class) && !io.sentry.util.n.h(h0Var, io.sentry.hints.b.class)) {
            z11 = true;
        }
        if (r6Var2 != null && !zH && !z11 && (r6Var2.z0() || r6Var2.y0())) {
            this.f80740b.getReplayController().H(Boolean.valueOf(r6Var2.y0()));
        }
        try {
            l5Var = this;
            try {
                p5 p5VarP = l5Var.p(r6Var2, r6Var2 != null ? z(h0Var) : null, f8VarK, B(x0Var, h0Var, r6Var2), null);
                h0Var.b();
                if (p5VarP != null) {
                    xVarG = G(p5VarP, h0Var);
                }
            } catch (SentryEnvelopeException e11) {
                e = e11;
                l5Var.f80740b.getLogger().b(b7.WARNING, e, "Capturing event %s failed.", xVarG);
                xVarG = io.sentry.protocol.x.f81078b;
            } catch (IOException e12) {
                e = e12;
                l5Var.f80740b.getLogger().b(b7.WARNING, e, "Capturing event %s failed.", xVarG);
                xVarG = io.sentry.protocol.x.f81078b;
            }
        } catch (SentryEnvelopeException | IOException e13) {
            e = e13;
            l5Var = this;
        }
        if (x0Var != null) {
            y(x0Var, h0Var);
        }
        return xVarG;
    }

    @Override // io.sentry.b1
    public boolean isEnabled() {
        return this.f80739a;
    }

    @Override // io.sentry.b1
    public boolean k() {
        return this.f80741c.k();
    }

    @Override // io.sentry.b1
    public io.sentry.transport.a0 q() {
        return this.f80741c.q();
    }

    @Override // io.sentry.b1
    public io.sentry.protocol.x r(p5 p5Var, h0 h0Var) {
        io.sentry.util.y.c(p5Var, "SentryEnvelope is required.");
        if (h0Var == null) {
            h0Var = new h0();
        }
        try {
            h0Var.b();
            return G(p5Var, h0Var);
        } catch (IOException e11) {
            this.f80740b.getLogger().a(b7.ERROR, "Failed to capture envelope.", e11);
            return io.sentry.protocol.x.f81078b;
        }
    }
}
