package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.b7;
import io.sentry.e1;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f81471a = Charset.forName("UTF-8");

    private static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f81472a;

        private b() {
            this.f81472a = 0L;
        }

        private static int n(char c11) {
            if (c11 <= 127) {
                return 1;
            }
            return (c11 > 2047 && !Character.isSurrogate(c11)) ? 3 : 2;
        }

        public long c() {
            return this.f81472a;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i11, int i12) {
            for (int i13 = i11; i13 < i11 + i12; i13++) {
                this.f81472a += (long) n(cArr[i13]);
            }
        }

        @Override // java.io.Writer
        public void write(int i11) {
            this.f81472a += (long) n((char) i11);
        }

        @Override // java.io.Writer
        public void write(String str, int i11, int i12) {
            for (int i13 = i11; i13 < i11 + i12; i13++) {
                this.f81472a += (long) n(str.charAt(i13));
            }
        }
    }

    public static List<Object> a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i11)));
        }
        return arrayList;
    }

    public static long b(e1 e1Var, ILogger iLogger, a2 a2Var) {
        if (a2Var == null) {
            return 0L;
        }
        try {
            b bVar = new b();
            e1Var.a(a2Var, bVar);
            return bVar.c();
        } catch (Throwable th2) {
            iLogger.a(b7.ERROR, "Could not calculate size of serializable", th2);
            return 0L;
        }
    }

    public static byte[] c(e1 e1Var, ILogger iLogger, a2 a2Var) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f81471a));
                try {
                    e1Var.a(a2Var, bufferedWriter);
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
        } catch (Throwable th6) {
            iLogger.a(b7.ERROR, "Could not serialize serializable", th6);
            return null;
        }
    }

    public static Map<String, Object> d(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
