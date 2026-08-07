package io.sentry.clientreport;

import io.sentry.a7;
import io.sentry.b7;
import io.sentry.f7;
import io.sentry.k;
import io.sentry.l;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.protocol.a0;
import io.sentry.protocol.e0;
import io.sentry.q7;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f80417a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q7 f80418b;

    public e(q7 q7Var) {
        this.f80418b = q7Var;
    }

    private k f(a7 a7Var) {
        if (a7.Event.equals(a7Var)) {
            return k.Error;
        }
        if (a7.Session.equals(a7Var)) {
            return k.Session;
        }
        if (a7.Transaction.equals(a7Var)) {
            return k.Transaction;
        }
        if (a7.UserFeedback.equals(a7Var)) {
            return k.UserReport;
        }
        if (a7.Feedback.equals(a7Var)) {
            return k.Feedback;
        }
        if (a7.Profile.equals(a7Var)) {
            return k.Profile;
        }
        if (a7.ProfileChunk.equals(a7Var)) {
            return k.ProfileChunkUi;
        }
        if (a7.Attachment.equals(a7Var)) {
            return k.Attachment;
        }
        if (a7.CheckIn.equals(a7Var)) {
            return k.Monitor;
        }
        if (a7.ReplayVideo.equals(a7Var)) {
            return k.Replay;
        }
        if (a7.Log.equals(a7Var)) {
            return k.LogItem;
        }
        if (a7.Span.equals(a7Var)) {
            return k.Span;
        }
        return a7.TraceMetric.equals(a7Var) ? k.TraceMetric : k.Default;
    }

    private void g(f fVar, k kVar, Long l11) {
        this.f80418b.getOnDiscard();
    }

    private void h(String str, String str2, Long l11) {
        this.f80417a.a(new d(str, str2), l11);
    }

    private void j(c cVar) {
        if (cVar == null) {
            return;
        }
        for (g gVar : cVar.a()) {
            h(gVar.c(), gVar.a(), gVar.b());
        }
    }

    @Override // io.sentry.clientreport.h
    public void a(f fVar, k kVar) {
        b(fVar, kVar, 1L);
    }

    @Override // io.sentry.clientreport.h
    public void b(f fVar, k kVar, long j11) {
        try {
            h(fVar.getReason(), kVar.getCategory(), Long.valueOf(j11));
            g(fVar, kVar, Long.valueOf(j11));
        } catch (Throwable th2) {
            this.f80418b.getLogger().b(b7.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void c(f fVar, p6 p6Var) {
        if (p6Var == null) {
            return;
        }
        try {
            a7 a7VarB = p6Var.K().b();
            if (a7.ClientReport.equals(a7VarB)) {
                try {
                    j(p6Var.H(this.f80418b.getSerializer()));
                    return;
                } catch (Exception unused) {
                    this.f80418b.getLogger().c(b7.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            k kVarF = f(a7VarB);
            if (kVarF.equals(k.Transaction)) {
                e0 e0VarM = p6Var.M(this.f80418b.getSerializer());
                if (e0VarM != null) {
                    List<a0> listO0 = e0VarM.o0();
                    String reason = fVar.getReason();
                    k kVar = k.Span;
                    h(reason, kVar.getCategory(), Long.valueOf(((long) listO0.size()) + 1));
                    g(fVar, kVar, Long.valueOf(((long) listO0.size()) + 1));
                }
                h(fVar.getReason(), kVarF.getCategory(), 1L);
                g(fVar, kVarF, 1L);
                return;
            }
            if (!kVarF.equals(k.LogItem)) {
                h(fVar.getReason(), kVarF.getCategory(), 1L);
                g(fVar, kVarF, 1L);
                return;
            }
            f7 f7VarL = p6Var.L(this.f80418b.getSerializer());
            if (f7VarL == null) {
                this.f80418b.getLogger().c(b7.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                return;
            }
            long size = f7VarL.a().size();
            h(fVar.getReason(), kVarF.getCategory(), Long.valueOf(size));
            h(fVar.getReason(), k.LogByte.getCategory(), Long.valueOf(p6Var.I().length));
            g(fVar, kVarF, Long.valueOf(size));
        } catch (Throwable th2) {
            this.f80418b.getLogger().b(b7.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public void d(f fVar, p5 p5Var) {
        if (p5Var == null) {
            return;
        }
        try {
            Iterator<p6> it = p5Var.c().iterator();
            while (it.hasNext()) {
                c(fVar, it.next());
            }
        } catch (Throwable th2) {
            this.f80418b.getLogger().b(b7.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.h
    public p5 e(p5 p5Var) {
        c cVarI = i();
        if (cVarI == null) {
            return p5Var;
        }
        try {
            this.f80418b.getLogger().c(b7.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<p6> it = p5Var.c().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(p6.A(this.f80418b.getSerializer(), cVarI));
            return new p5(p5Var.b(), arrayList);
        } catch (Throwable th2) {
            this.f80418b.getLogger().b(b7.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return p5Var;
        }
    }

    c i() {
        Date dateD = l.d();
        List<g> listB = this.f80417a.b();
        if (listB.isEmpty()) {
            return null;
        }
        return new c(dateD, listB);
    }
}
