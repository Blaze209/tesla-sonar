package io.sentry.opentelemetry;

import io.sentry.b7;
import io.sentry.k7;
import io.sentry.m2;
import io.sentry.q7;
import io.sentry.util.a0;
import io.sentry.util.e0;
import io.sentry.util.u;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static void a(q7 q7Var) {
        if (a0.c()) {
            Iterator<String> it = b(q7Var).iterator();
            while (it.hasNext()) {
                q7Var.addIgnoredSpanOrigin(it.next());
            }
        }
    }

    private static List<String> b(q7 q7Var) {
        k7 openTelemetryMode = q7Var.getOpenTelemetryMode();
        return k7.OFF.equals(openTelemetryMode) ? Collections.EMPTY_LIST : e0.a(openTelemetryMode);
    }

    public static void c(q7 q7Var, u uVar) {
        if (a0.c()) {
            if (k7.AUTO.equals(q7Var.getOpenTelemetryMode())) {
                if (uVar.c("io.sentry.opentelemetry.agent.AgentMarker", m2.e())) {
                    q7Var.getLogger().c(b7.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    q7Var.setOpenTelemetryMode(k7.AGENT);
                } else if (uVar.c("io.sentry.opentelemetry.agent.AgentlessMarker", m2.e())) {
                    q7Var.getLogger().c(b7.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    q7Var.setOpenTelemetryMode(k7.AGENTLESS);
                } else if (uVar.c("io.sentry.opentelemetry.agent.AgentlessSpringMarker", m2.e())) {
                    q7Var.getLogger().c(b7.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    q7Var.setOpenTelemetryMode(k7.AGENTLESS_SPRING);
                }
            }
        }
    }
}
