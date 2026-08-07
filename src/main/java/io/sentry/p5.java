package io.sentry;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q5 f80822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterable<p6> f80823b;

    public p5(q5 q5Var, Iterable<p6> iterable) {
        this.f80822a = (q5) io.sentry.util.y.c(q5Var, "SentryEnvelopeHeader is required.");
        this.f80823b = (Iterable) io.sentry.util.y.c(iterable, "SentryEnvelope items are required.");
    }

    public static p5 a(e1 e1Var, f8 f8Var, io.sentry.protocol.r rVar) {
        io.sentry.util.y.c(e1Var, "Serializer is required.");
        io.sentry.util.y.c(f8Var, "session is required.");
        return new p5(null, rVar, p6.G(e1Var, f8Var));
    }

    public q5 b() {
        return this.f80822a;
    }

    public Iterable<p6> c() {
        return this.f80823b;
    }

    public p5(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar, p6 p6Var) {
        io.sentry.util.y.c(p6Var, "SentryEnvelopeItem is required.");
        this.f80822a = new q5(xVar, rVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(p6Var);
        this.f80823b = arrayList;
    }
}
