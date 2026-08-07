package io.sentry;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import io.sentry.exception.SentryEnvelopeException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class p6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f80824d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q6 f80825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable<byte[]> f80826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f80827c;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f80828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callable<byte[]> f80829b;

        public a(Callable<byte[]> callable) {
            this.f80829b = callable;
        }

        private static byte[] b(byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        public byte[] a() {
            Callable<byte[]> callable;
            if (this.f80828a == null && (callable = this.f80829b) != null) {
                this.f80828a = callable.call();
            }
            return b(this.f80828a);
        }
    }

    p6(q6 q6Var, byte[] bArr) {
        this.f80825a = (q6) io.sentry.util.y.c(q6Var, "SentryEnvelopeItemHeader is required.");
        this.f80827c = bArr;
        this.f80826b = null;
    }

    public static p6 A(final e1 e1Var, final io.sentry.clientreport.c cVar) {
        io.sentry.util.y.c(e1Var, "ISerializer is required.");
        io.sentry.util.y.c(cVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.a6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.d(e1Var, cVar);
            }
        });
        return new p6(new q6(a7.resolve(cVar), new Callable() { // from class: io.sentry.b6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.d6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 B(final e1 e1Var, final i5 i5Var) {
        io.sentry.util.y.c(e1Var, "ISerializer is required.");
        io.sentry.util.y.c(i5Var, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.x5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.n(e1Var, i5Var);
            }
        });
        return new p6(new q6(a7.resolve(i5Var), new Callable() { // from class: io.sentry.y5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.z5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 C(final e1 e1Var, final f7 f7Var) {
        io.sentry.util.y.c(e1Var, "ISerializer is required.");
        io.sentry.util.y.c(f7Var, "SentryLogEvents is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.e6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.s(e1Var, f7Var);
            }
        });
        return new p6(new q6(a7.Log, (Callable<Integer>) new Callable() { // from class: io.sentry.f6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(f7Var.a().size())), (Callable<byte[]>) new Callable() { // from class: io.sentry.g6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 D(final q3 q3Var, final e1 e1Var, final w0 w0Var) {
        final File fileQ = q3Var.q();
        final a aVar = new a(new Callable() { // from class: io.sentry.l6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.u(fileQ, q3Var, w0Var, e1Var);
            }
        });
        return new p6(new q6(a7.ProfileChunk, (Callable<Integer>) new Callable() { // from class: io.sentry.m6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileQ.getName(), (String) null, q3Var.p(), (Integer) null), (Callable<byte[]>) new Callable() { // from class: io.sentry.n6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 E(final u3 u3Var, final long j11, final e1 e1Var) {
        final File fileC = u3Var.C();
        final a aVar = new a(new Callable() { // from class: io.sentry.u5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.o(fileC, j11, u3Var, e1Var);
            }
        });
        return new p6(new q6(a7.Profile, new Callable() { // from class: io.sentry.v5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileC.getName()), (Callable<byte[]>) new Callable() { // from class: io.sentry.w5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 F(final e1 e1Var, final ILogger iLogger, final r7 r7Var, final z3 z3Var, final boolean z11) {
        final File fileH0 = r7Var.h0();
        final a aVar = new a(new Callable() { // from class: io.sentry.i6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.c(e1Var, r7Var, z3Var, fileH0, iLogger, z11);
            }
        });
        return new p6(new q6(a7.ReplayVideo, new Callable() { // from class: io.sentry.j6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, null, null), (Callable<byte[]>) new Callable() { // from class: io.sentry.k6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static p6 G(final e1 e1Var, final f8 f8Var) {
        io.sentry.util.y.c(e1Var, "ISerializer is required.");
        io.sentry.util.y.c(f8Var, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.r5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.t(e1Var, f8Var);
            }
        });
        return new p6(new q6(a7.Session, new Callable() { // from class: io.sentry.c6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.h6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    private static byte[] N(Map<String, byte[]> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                byte[] bytes = entry.getKey().getBytes(f80824d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] value = entry.getValue();
                int length2 = value.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(value);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] c(e1 e1Var, r7 r7Var, z3 z3Var, File file, ILogger iLogger, boolean z11) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f80824d));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    e1Var.a(r7Var, bufferedWriter);
                    linkedHashMap.put(a7.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (z3Var != null) {
                        e1Var.a(z3Var, bufferedWriter);
                        linkedHashMap.put(a7.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bArrB = io.sentry.util.i.b(file.getPath(), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                        if (bArrB.length > 0) {
                            linkedHashMap.put(a7.ReplayVideo.getItemType(), bArrB);
                        }
                    }
                    byte[] bArrN = N(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z11) {
                            io.sentry.util.i.a(file.getParentFile());
                            return bArrN;
                        }
                        file.delete();
                    }
                    return bArrN;
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                iLogger.a(b7.ERROR, "Could not serialize replay recording", th6);
                return null;
            } finally {
                if (file != null) {
                    if (z11) {
                        io.sentry.util.i.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static /* synthetic */ byte[] d(e1 e1Var, io.sentry.clientreport.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f80824d));
            try {
                e1Var.a(cVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] n(e1 e1Var, i5 i5Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f80824d));
            try {
                e1Var.a(i5Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] o(File file, long j11, u3 u3Var, e1 e1Var) throws SentryEnvelopeException {
        if (!file.exists()) {
            throw new SentryEnvelopeException(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strF = io.sentry.vendor.a.f(io.sentry.util.i.b(file.getPath(), j11), 3);
        if (strF.isEmpty()) {
            throw new SentryEnvelopeException("Profiling trace file is empty");
        }
        u3Var.F(strF);
        u3Var.E();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f80824d));
                    try {
                        e1Var.a(u3Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th2) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                file.delete();
                throw th6;
            }
        } catch (IOException e11) {
            throw new SentryEnvelopeException(String.format("Failed to serialize profiling trace data\n%s", e11.getMessage()));
        }
    }

    public static /* synthetic */ byte[] s(e1 e1Var, f7 f7Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f80824d));
            try {
                e1Var.a(f7Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] t(e1 e1Var, f8 f8Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f80824d));
            try {
                e1Var.a(f8Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] u(File file, q3 q3Var, w0 w0Var, e1 e1Var) throws SentryEnvelopeException {
        if (!file.exists()) {
            throw new SentryEnvelopeException(String.format("Dropping profile chunk, because the file '%s' doesn't exists", file.getName()));
        }
        if (!"java".equals(q3Var.p())) {
            String strF = io.sentry.vendor.a.f(io.sentry.util.i.b(file.getPath(), 52428800L), 3);
            if (strF.isEmpty()) {
                throw new SentryEnvelopeException("Profiling trace file is empty");
            }
            q3Var.s(strF);
        } else {
            if (n2.b().equals(w0Var)) {
                throw new SentryEnvelopeException("No ProfileConverter available, dropping chunk.");
            }
            try {
                q3Var.t(w0Var.a(file.getAbsolutePath()));
            } catch (Exception e11) {
                throw new SentryEnvelopeException("Profile conversion failed", e11);
            }
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f80824d));
                    try {
                        e1Var.a(q3Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th2) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException e12) {
                throw new SentryEnvelopeException(String.format("Failed to serialize profile chunk\n%s", e12.getMessage()));
            }
        } catch (Throwable th6) {
            file.delete();
            throw th6;
        }
    }

    public static /* synthetic */ byte[] x(b bVar, long j11, e1 e1Var, ILogger iLogger) throws SentryEnvelopeException {
        byte[] bArrCall;
        if (bVar.f() != null) {
            byte[] bArrF = bVar.f();
            y(bArrF.length, j11, bVar.h());
            return bArrF;
        }
        if (bVar.j() != null) {
            byte[] bArrC = io.sentry.util.q.c(e1Var, iLogger, bVar.j());
            if (bArrC != null) {
                y(bArrC.length, j11, bVar.h());
                return bArrC;
            }
        } else {
            if (bVar.i() != null) {
                return io.sentry.util.i.b(bVar.i(), j11);
            }
            if (bVar.e() != null && (bArrCall = bVar.e().call()) != null) {
                y(bArrCall.length, j11, bVar.h());
                return bArrCall;
            }
        }
        throw new SentryEnvelopeException(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable, path or provider is set.", bVar.h()));
    }

    private static void y(long j11, long j12, String str) throws SentryEnvelopeException {
        if (j11 > j12) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j11), Long.valueOf(j12)));
        }
    }

    public static p6 z(final e1 e1Var, final ILogger iLogger, final b bVar, final long j11) {
        final a aVar = new a(new Callable() { // from class: io.sentry.o6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p6.x(bVar, j11, e1Var, iLogger);
            }
        });
        return new p6(new q6(a7.Attachment, new Callable() { // from class: io.sentry.s5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, bVar.g(), bVar.h(), bVar.d()), (Callable<byte[]>) new Callable() { // from class: io.sentry.t5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public io.sentry.clientreport.c H(e1 e1Var) throws IOException {
        q6 q6Var = this.f80825a;
        if (q6Var == null || q6Var.b() != a7.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(I()), f80824d));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) e1Var.c(bufferedReader, io.sentry.clientreport.c.class);
            bufferedReader.close();
            return cVar;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public byte[] I() {
        Callable<byte[]> callable;
        if (this.f80827c == null && (callable = this.f80826b) != null) {
            this.f80827c = callable.call();
        }
        return this.f80827c;
    }

    public r6 J(e1 e1Var) throws IOException {
        q6 q6Var = this.f80825a;
        if (q6Var == null || q6Var.b() != a7.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(I()), f80824d));
        try {
            r6 r6Var = (r6) e1Var.c(bufferedReader, r6.class);
            bufferedReader.close();
            return r6Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public q6 K() {
        return this.f80825a;
    }

    public f7 L(e1 e1Var) throws IOException {
        q6 q6Var = this.f80825a;
        if (q6Var == null || q6Var.b() != a7.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(I()), f80824d));
        try {
            f7 f7Var = (f7) e1Var.c(bufferedReader, f7.class);
            bufferedReader.close();
            return f7Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public io.sentry.protocol.e0 M(e1 e1Var) throws IOException {
        q6 q6Var = this.f80825a;
        if (q6Var == null || q6Var.b() != a7.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(I()), f80824d));
        try {
            io.sentry.protocol.e0 e0Var = (io.sentry.protocol.e0) e1Var.c(bufferedReader, io.sentry.protocol.e0.class);
            bufferedReader.close();
            return e0Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    p6(q6 q6Var, Callable<byte[]> callable) {
        this.f80825a = (q6) io.sentry.util.y.c(q6Var, "SentryEnvelopeItemHeader is required.");
        this.f80826b = (Callable) io.sentry.util.y.c(callable, "DataFactory is required.");
        this.f80827c = null;
    }
}
