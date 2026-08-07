package io.sentry;

/* JADX INFO: loaded from: classes9.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f81611a;

    public x8(q7 q7Var) {
        this.f81611a = (q7) io.sentry.util.y.c(q7Var, "options are required");
    }

    private boolean b(Double d11, Double d12) {
        return d11.doubleValue() >= d12.doubleValue();
    }

    public y8 a(c4 c4Var) {
        Double dA;
        Double dA2 = c4Var.a();
        y8 y8VarL = c4Var.b().l();
        if (y8VarL != null) {
            return io.sentry.util.c0.a(y8VarL);
        }
        this.f81611a.getProfilesSampler();
        Double profilesSampleRate = this.f81611a.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && b(profilesSampleRate, dA2));
        if (this.f81611a.getTracesSampler() != null) {
            try {
                dA = this.f81611a.getTracesSampler().a(c4Var);
            } catch (Throwable th2) {
                this.f81611a.getLogger().a(b7.ERROR, "Error in the 'TracesSamplerCallback' callback.", th2);
                dA = null;
            }
            if (dA != null) {
                return new y8(Boolean.valueOf(b(dA, dA2)), dA, dA2, boolValueOf, profilesSampleRate);
            }
        }
        y8 y8VarZ = c4Var.b().z();
        if (y8VarZ != null) {
            return io.sentry.util.c0.a(y8VarZ);
        }
        Double tracesSampleRate = this.f81611a.getTracesSampleRate();
        Double dValueOf = tracesSampleRate != null ? Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.f81611a.getBackpressureMonitor().a())) : null;
        if (dValueOf != null) {
            return new y8(Boolean.valueOf(b(dValueOf, dA2)), dValueOf, dA2, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new y8(bool, null, dA2, bool, null);
    }

    public boolean c(double d11) {
        Double profileSessionSampleRate = this.f81611a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && b(profileSessionSampleRate, Double.valueOf(d11));
    }
}
