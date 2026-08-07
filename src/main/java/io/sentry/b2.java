package io.sentry;

import ch.qos.logback.classic.net.SyslogAppender;
import io.sentry.protocol.DebugImage;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class b2 implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f80284c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f80285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, q1<?>> f80286b;

    public b2(q7 q7Var) {
        this.f80285a = q7Var;
        HashMap map = new HashMap();
        this.f80286b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.protocol.a.C1702a());
        map.put(e.class, new e.a());
        map.put(io.sentry.protocol.b.class, new io.sentry.protocol.b.a());
        map.put(io.sentry.protocol.c.class, new io.sentry.protocol.c.a());
        map.put(DebugImage.class, new DebugImage.a());
        map.put(io.sentry.protocol.d.class, new io.sentry.protocol.d.a());
        map.put(io.sentry.protocol.e.class, new io.sentry.protocol.e.a());
        map.put(io.sentry.protocol.e.b.class, new io.sentry.protocol.e.b.a());
        map.put(io.sentry.protocol.h.class, new io.sentry.protocol.h.a());
        map.put(io.sentry.protocol.j.class, new io.sentry.protocol.j.a());
        map.put(io.sentry.protocol.k.class, new io.sentry.protocol.k.a());
        map.put(io.sentry.protocol.l.class, new io.sentry.protocol.l.a());
        map.put(io.sentry.protocol.m.class, new io.sentry.protocol.m.a());
        map.put(io.sentry.protocol.n.class, new io.sentry.protocol.n.a());
        map.put(q3.class, new q3.b());
        map.put(r3.class, new r3.a());
        map.put(u3.class, new u3.b());
        map.put(v3.class, new v3.a());
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.profilemeasurements.a.C1701a());
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.profilemeasurements.b.a());
        map.put(io.sentry.protocol.o.class, new io.sentry.protocol.o.a());
        map.put(z3.class, new z3.b());
        map.put(io.sentry.rrweb.a.class, new io.sentry.rrweb.a.C1705a());
        map.put(io.sentry.rrweb.c.class, new io.sentry.rrweb.c.a());
        map.put(io.sentry.rrweb.e.class, new io.sentry.rrweb.e.a());
        map.put(io.sentry.rrweb.f.class, new io.sentry.rrweb.f.a());
        map.put(io.sentry.rrweb.g.class, new io.sentry.rrweb.g.a());
        map.put(io.sentry.rrweb.i.class, new io.sentry.rrweb.i.a());
        map.put(io.sentry.rrweb.j.class, new io.sentry.rrweb.j.a());
        map.put(io.sentry.protocol.q.class, new io.sentry.protocol.q.a());
        map.put(io.sentry.protocol.r.class, new io.sentry.protocol.r.a());
        map.put(q5.class, new q5.a());
        map.put(q6.class, new q6.a());
        map.put(r6.class, new r6.a());
        map.put(io.sentry.protocol.s.class, new io.sentry.protocol.s.a());
        map.put(a7.class, new a7.a());
        map.put(b7.class, new b7.a());
        map.put(c7.class, new c7.a());
        map.put(f7.class, new f7.a());
        map.put(io.sentry.protocol.y.class, new io.sentry.protocol.y.a());
        map.put(io.sentry.protocol.z.class, new io.sentry.protocol.z.a());
        map.put(r7.class, new r7.a());
        map.put(io.sentry.protocol.a0.class, new io.sentry.protocol.a0.a());
        map.put(io.sentry.protocol.b0.class, new io.sentry.protocol.b0.a());
        map.put(io.sentry.protocol.c0.class, new io.sentry.protocol.c0.a());
        map.put(g5.class, new g5.a());
        map.put(io.sentry.protocol.d0.class, new io.sentry.protocol.d0.a());
        map.put(io.sentry.protocol.e0.class, new io.sentry.protocol.e0.a());
        map.put(f8.class, new f8.a());
        map.put(k8.class, new k8.a());
        map.put(p8.class, new p8.a());
        map.put(r8.class, new r8.a());
        map.put(io.sentry.protocol.i0.class, new io.sentry.protocol.i0.a());
        map.put(io.sentry.protocol.i.class, new io.sentry.protocol.i.a());
        map.put(d9.class, new d9.a());
        map.put(io.sentry.clientreport.c.class, new io.sentry.clientreport.c.a());
        map.put(io.sentry.protocol.k0.class, new io.sentry.protocol.k0.a());
        map.put(io.sentry.protocol.j0.class, new io.sentry.protocol.j0.a());
    }

    private <T> boolean g(Class<T> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    private String h(Object obj, boolean z11) {
        StringWriter stringWriter = new StringWriter();
        y1 y1Var = new y1(stringWriter, this.f80285a.getMaxDepth());
        if (z11) {
            y1Var.T(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
        }
        y1Var.V(this.f80285a.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.e1
    public <T> void a(T t11, Writer writer) throws IOException {
        io.sentry.util.y.c(t11, "The entity is required.");
        io.sentry.util.y.c(writer, "The Writer object is required.");
        ILogger logger = this.f80285a.getLogger();
        b7 b7Var = b7.DEBUG;
        if (logger.d(b7Var)) {
            this.f80285a.getLogger().c(b7Var, "Serializing object: %s", h(t11, this.f80285a.isEnablePrettySerializationOutput()));
        }
        new y1(writer, this.f80285a.getMaxDepth()).V(this.f80285a.getLogger(), t11);
        writer.flush();
    }

    @Override // io.sentry.e1
    public void b(p5 p5Var, OutputStream outputStream) throws IOException {
        io.sentry.util.y.c(p5Var, "The SentryEnvelope object is required.");
        io.sentry.util.y.c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f80284c));
        try {
            p5Var.b().serialize(new y1(bufferedWriter, this.f80285a.getMaxDepth()), this.f80285a.getLogger());
            bufferedWriter.write("\n");
            for (p6 p6Var : p5Var.c()) {
                try {
                    byte[] bArrI = p6Var.I();
                    p6Var.K().serialize(new y1(bufferedWriter, this.f80285a.getMaxDepth()), this.f80285a.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrI);
                    bufferedWriter.write("\n");
                } catch (Exception e11) {
                    this.f80285a.getLogger().a(b7.ERROR, "Failed to create envelope item. Dropping it.", e11);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th2) {
            bufferedWriter.flush();
            throw th2;
        }
    }

    @Override // io.sentry.e1
    public <T> T c(Reader reader, Class<T> cls) {
        T tCast;
        try {
            w1 w1Var = new w1(reader);
            try {
                q1<?> q1Var = this.f80286b.get(cls);
                if (q1Var != null) {
                    tCast = cls.cast(q1Var.a(w1Var, this.f80285a.getLogger()));
                } else {
                    if (!g(cls)) {
                        w1Var.close();
                        return null;
                    }
                    tCast = (T) w1Var.z3();
                }
                w1Var.close();
                return tCast;
            } catch (Throwable th2) {
                try {
                    w1Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e11) {
            this.f80285a.getLogger().a(b7.ERROR, "Error when deserializing", e11);
            return null;
        }
    }

    @Override // io.sentry.e1
    public <T, R> T d(Reader reader, Class<T> cls, q1<R> q1Var) {
        try {
            w1 w1Var = new w1(reader);
            try {
                T t11 = (!Collection.class.isAssignableFrom(cls) || q1Var == null) ? (T) w1Var.z3() : (T) w1Var.G1(this.f80285a.getLogger(), q1Var);
                w1Var.close();
                return t11;
            } catch (Throwable th2) {
                try {
                    w1Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f80285a.getLogger().a(b7.ERROR, "Error when deserializing", th4);
            return null;
        }
    }

    @Override // io.sentry.e1
    public p5 e(InputStream inputStream) {
        io.sentry.util.y.c(inputStream, "The InputStream object is required.");
        try {
            return this.f80285a.getEnvelopeReader().a(inputStream);
        } catch (IOException e11) {
            this.f80285a.getLogger().a(b7.ERROR, "Error deserializing envelope.", e11);
            return null;
        }
    }

    @Override // io.sentry.e1
    public String f(Map<String, Object> map) {
        return h(map, false);
    }
}
