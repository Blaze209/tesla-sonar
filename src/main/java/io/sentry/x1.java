package io.sentry;

import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes9.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f81605a;

    public x1(int i11) {
        this.f81605a = new z1(i11);
    }

    private void b(j3 j3Var, ILogger iLogger, Collection<?> collection) {
        j3Var.f();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            a(j3Var, iLogger, it.next());
        }
        j3Var.e();
    }

    private void c(j3 j3Var, ILogger iLogger, Date date) {
        try {
            j3Var.w(l.h(date));
        } catch (Exception e11) {
            iLogger.a(b7.ERROR, "Error when serializing Date", e11);
            j3Var.R();
        }
    }

    private void d(j3 j3Var, ILogger iLogger, Map<?, ?> map) {
        j3Var.h();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                j3Var.N((String) obj);
                a(j3Var, iLogger, map.get(obj));
            }
        }
        j3Var.j();
    }

    private void e(j3 j3Var, ILogger iLogger, TimeZone timeZone) {
        try {
            j3Var.w(timeZone.getID());
        } catch (Exception e11) {
            iLogger.a(b7.ERROR, "Error when serializing TimeZone", e11);
            j3Var.R();
        }
    }

    public void a(j3 j3Var, ILogger iLogger, Object obj) {
        if (obj == null) {
            j3Var.R();
            return;
        }
        if (obj instanceof Character) {
            j3Var.w(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            j3Var.w((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            j3Var.K(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            j3Var.U((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            c(j3Var, iLogger, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            e(j3Var, iLogger, (TimeZone) obj);
            return;
        }
        if (obj instanceof a2) {
            ((a2) obj).serialize(j3Var, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(j3Var, iLogger, (Collection) obj);
            return;
        }
        int i11 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i11 < length) {
                arrayList.add(Boolean.valueOf(zArr[i11]));
                i11++;
            }
            b(j3Var, iLogger, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i11 < length2) {
                arrayList2.add(Byte.valueOf(bArr[i11]));
                i11++;
            }
            b(j3Var, iLogger, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i11 < length3) {
                arrayList3.add(Short.valueOf(sArr[i11]));
                i11++;
            }
            b(j3Var, iLogger, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i11 < length4) {
                arrayList4.add(Character.valueOf(cArr[i11]));
                i11++;
            }
            b(j3Var, iLogger, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i11 < length5) {
                arrayList5.add(Integer.valueOf(iArr[i11]));
                i11++;
            }
            b(j3Var, iLogger, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i11 < length6) {
                arrayList6.add(Long.valueOf(jArr[i11]));
                i11++;
            }
            b(j3Var, iLogger, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i11 < length7) {
                arrayList7.add(Float.valueOf(fArr[i11]));
                i11++;
            }
            b(j3Var, iLogger, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i11 < length8) {
                arrayList8.add(Double.valueOf(dArr[i11]));
                i11++;
            }
            b(j3Var, iLogger, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            b(j3Var, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            d(j3Var, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            j3Var.w(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(j3Var, iLogger, io.sentry.util.q.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            j3Var.K(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            j3Var.w(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            j3Var.w(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            j3Var.w(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            j3Var.w(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            d(j3Var, iLogger, io.sentry.util.q.d((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            j3Var.w(obj.toString());
            return;
        }
        try {
            a(j3Var, iLogger, this.f81605a.d(obj, iLogger));
        } catch (Exception e11) {
            iLogger.a(b7.ERROR, "Failed serializing unknown object.", e11);
            j3Var.w("[OBJECT]");
        }
    }
}
