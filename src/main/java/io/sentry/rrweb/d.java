package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.q1;
import io.sentry.util.y;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d extends io.sentry.rrweb.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f81255c;

    public static final class a {
        public boolean a(d dVar, String str, i3 i3Var, ILogger iLogger) {
            if (!str.equals("source")) {
                return false;
            }
            dVar.f81255c = (b) y.c((b) i3Var.v0(iLogger, new b.a()), "");
            return true;
        }
    }

    public enum b implements a2 {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        public static final class a implements q1<b> {
            @Override // io.sentry.q1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(i3 i3Var, ILogger iLogger) {
                return b.values()[i3Var.nextInt()];
            }
        }

        @Override // io.sentry.a2
        public void serialize(j3 j3Var, ILogger iLogger) {
            j3Var.D(ordinal());
        }
    }

    public static final class c {
        public void a(d dVar, j3 j3Var, ILogger iLogger) {
            j3Var.N("source").V(iLogger, dVar.f81255c);
        }
    }

    public d(b bVar) {
        super(io.sentry.rrweb.c.IncrementalSnapshot);
        this.f81255c = bVar;
    }
}
