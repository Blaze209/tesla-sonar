package com.google.gson.internal.bind;

import bx.i0;
import com.adyen.checkout.components.core.Address;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public final class p {
    public static final com.google.gson.x<BigInteger> A;
    public static final com.google.gson.x<bx.a0> B;
    public static final com.google.gson.y C;
    public static final com.google.gson.x<StringBuilder> D;
    public static final com.google.gson.y E;
    public static final com.google.gson.x<StringBuffer> F;
    public static final com.google.gson.y G;
    public static final com.google.gson.x<URL> H;
    public static final com.google.gson.y I;
    public static final com.google.gson.x<URI> J;
    public static final com.google.gson.y K;
    public static final com.google.gson.x<InetAddress> L;
    public static final com.google.gson.y M;
    public static final com.google.gson.x<UUID> N;
    public static final com.google.gson.y O;
    public static final com.google.gson.x<Currency> P;
    public static final com.google.gson.y Q;
    public static final com.google.gson.x<Calendar> R;
    public static final com.google.gson.y S;
    public static final com.google.gson.x<Locale> T;
    public static final com.google.gson.y U;
    public static final com.google.gson.x<com.google.gson.l> V;
    public static final com.google.gson.y W;
    public static final com.google.gson.y X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.gson.x<Class> f44957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.y f44958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.gson.x<BitSet> f44959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.gson.y f44960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.gson.x<Boolean> f44961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.gson.x<Boolean> f44962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.gson.y f44963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.gson.x<Number> f44964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.gson.y f44965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.gson.x<Number> f44966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.gson.y f44967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.gson.x<Number> f44968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.gson.y f44969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.gson.x<AtomicInteger> f44970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.gson.y f44971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.gson.x<AtomicBoolean> f44972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.google.gson.y f44973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.gson.x<AtomicIntegerArray> f44974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.gson.y f44975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.google.gson.x<Number> f44976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final com.google.gson.x<Number> f44977u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.google.gson.x<Number> f44978v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.google.gson.x<Character> f44979w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final com.google.gson.y f44980x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final com.google.gson.x<String> f44981y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final com.google.gson.x<BigDecimal> f44982z;

    class a extends com.google.gson.x<AtomicIntegerArray> {
        a() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(ex.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.f();
            while (aVar.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.nextInt()));
                } catch (NumberFormatException e11) {
                    throw new JsonSyntaxException(e11);
                }
            }
            aVar.e();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i11 = 0; i11 < size; i11++) {
                atomicIntegerArray.set(i11, ((Integer) arrayList.get(i11)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.p();
            int length = atomicIntegerArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                cVar.H0(atomicIntegerArray.get(i11));
            }
            cVar.C();
        }
    }

    class a0 extends com.google.gson.x<Boolean> {
        a0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(ex.a aVar) throws IOException {
            ex.b bVarN0 = aVar.n0();
            if (bVarN0 != ex.b.NULL) {
                return bVarN0 == ex.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.O())) : Boolean.valueOf(aVar.nextBoolean());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Boolean bool) throws IOException {
            cVar.J0(bool);
        }
    }

    class b extends com.google.gson.x<Number> {
        b() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Long.valueOf(aVar.nextLong());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.k0();
            } else {
                cVar.H0(number.longValue());
            }
        }
    }

    class b0 extends com.google.gson.x<Boolean> {
        b0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return Boolean.valueOf(aVar.O());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Boolean bool) throws IOException {
            cVar.O0(bool == null ? Address.ADDRESS_NULL_PLACEHOLDER : bool.toString());
        }
    }

    class c extends com.google.gson.x<Number> {
        c() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.k0();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.K0(number);
        }
    }

    class c0 extends com.google.gson.x<Number> {
        c0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 255 && iNextInt >= -128) {
                    return Byte.valueOf((byte) iNextInt);
                }
                throw new JsonSyntaxException("Lossy conversion from " + iNextInt + " to byte; at path " + aVar.C());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.k0();
            } else {
                cVar.H0(number.byteValue());
            }
        }
    }

    class d extends com.google.gson.x<Number> {
        d() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.k0();
            } else {
                cVar.G0(number.doubleValue());
            }
        }
    }

    class d0 extends com.google.gson.x<Number> {
        d0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                int iNextInt = aVar.nextInt();
                if (iNextInt <= 65535 && iNextInt >= -32768) {
                    return Short.valueOf((short) iNextInt);
                }
                throw new JsonSyntaxException("Lossy conversion from " + iNextInt + " to short; at path " + aVar.C());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.k0();
            } else {
                cVar.H0(number.shortValue());
            }
        }
    }

    class e extends com.google.gson.x<Character> {
        e() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            String strO = aVar.O();
            if (strO.length() == 1) {
                return Character.valueOf(strO.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + strO + "; at " + aVar.C());
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Character ch2) throws IOException {
            cVar.O0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    class e0 extends com.google.gson.x<Number> {
        e0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.nextInt());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.k0();
            } else {
                cVar.H0(number.intValue());
            }
        }
    }

    class f extends com.google.gson.x<String> {
        f() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(ex.a aVar) throws IOException {
            ex.b bVarN0 = aVar.n0();
            if (bVarN0 != ex.b.NULL) {
                return bVarN0 == ex.b.BOOLEAN ? Boolean.toString(aVar.nextBoolean()) : aVar.O();
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, String str) throws IOException {
            cVar.O0(str);
        }
    }

    class f0 extends com.google.gson.x<AtomicInteger> {
        f0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(ex.a aVar) {
            try {
                return new AtomicInteger(aVar.nextInt());
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.H0(atomicInteger.get());
        }
    }

    class g extends com.google.gson.x<BigDecimal> {
        g() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            String strO = aVar.O();
            try {
                return bx.c0.b(strO);
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException("Failed parsing '" + strO + "' as BigDecimal; at path " + aVar.C(), e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.K0(bigDecimal);
        }
    }

    class g0 extends com.google.gson.x<AtomicBoolean> {
        g0() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(ex.a aVar) {
            return new AtomicBoolean(aVar.nextBoolean());
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.P0(atomicBoolean.get());
        }
    }

    class h extends com.google.gson.x<BigInteger> {
        h() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            String strO = aVar.O();
            try {
                return bx.c0.c(strO);
            } catch (NumberFormatException e11) {
                throw new JsonSyntaxException("Failed parsing '" + strO + "' as BigInteger; at path " + aVar.C(), e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, BigInteger bigInteger) throws IOException {
            cVar.K0(bigInteger);
        }
    }

    class i extends com.google.gson.x<bx.a0> {
        i() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public bx.a0 b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return new bx.a0(aVar.O());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, bx.a0 a0Var) throws IOException {
            cVar.K0(a0Var);
        }
    }

    class j extends com.google.gson.x<StringBuilder> {
        j() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return new StringBuilder(aVar.O());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, StringBuilder sb2) throws IOException {
            cVar.O0(sb2 == null ? null : sb2.toString());
        }
    }

    class k extends com.google.gson.x<Class> {
        k() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(ex.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + i0.a("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + i0.a("java-lang-class-unsupported"));
        }
    }

    class l extends com.google.gson.x<StringBuffer> {
        l() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return new StringBuffer(aVar.O());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.O0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends com.google.gson.x<URL> {
        m() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            String strO = aVar.O();
            if (strO.equals(Address.ADDRESS_NULL_PLACEHOLDER)) {
                return null;
            }
            return new URL(strO);
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, URL url) throws IOException {
            cVar.O0(url == null ? null : url.toExternalForm());
        }
    }

    class n extends com.google.gson.x<URI> {
        n() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                String strO = aVar.O();
                if (strO.equals(Address.ADDRESS_NULL_PLACEHOLDER)) {
                    return null;
                }
                return new URI(strO);
            } catch (URISyntaxException e11) {
                throw new JsonIOException(e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, URI uri) throws IOException {
            cVar.O0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends com.google.gson.x<InetAddress> {
        o() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(ex.a aVar) throws IOException {
            if (aVar.n0() != ex.b.NULL) {
                return InetAddress.getByName(aVar.O());
            }
            aVar.c0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, InetAddress inetAddress) throws IOException {
            cVar.O0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.p$p, reason: collision with other inner class name */
    class C0703p extends com.google.gson.x<UUID> {
        C0703p() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            String strO = aVar.O();
            try {
                return UUID.fromString(strO);
            } catch (IllegalArgumentException e11) {
                throw new JsonSyntaxException("Failed parsing '" + strO + "' as UUID; at path " + aVar.C(), e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, UUID uuid) throws IOException {
            cVar.O0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends com.google.gson.x<Currency> {
        q() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(ex.a aVar) throws IOException {
            String strO = aVar.O();
            try {
                return Currency.getInstance(strO);
            } catch (IllegalArgumentException e11) {
                throw new JsonSyntaxException("Failed parsing '" + strO + "' as Currency; at path " + aVar.C(), e11);
            }
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Currency currency) throws IOException {
            cVar.O0(currency.getCurrencyCode());
        }
    }

    class r extends com.google.gson.x<Calendar> {
        r() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            aVar.h();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (aVar.n0() != ex.b.END_OBJECT) {
                String strL = aVar.L();
                int iNextInt = aVar.nextInt();
                strL.getClass();
                switch (strL) {
                    case "dayOfMonth":
                        i13 = iNextInt;
                        break;
                    case "minute":
                        i15 = iNextInt;
                        break;
                    case "second":
                        i16 = iNextInt;
                        break;
                    case "year":
                        i11 = iNextInt;
                        break;
                    case "month":
                        i12 = iNextInt;
                        break;
                    case "hourOfDay":
                        i14 = iNextInt;
                        break;
                }
            }
            aVar.j();
            return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.k0();
                return;
            }
            cVar.t();
            cVar.c0("year");
            cVar.H0(calendar.get(1));
            cVar.c0("month");
            cVar.H0(calendar.get(2));
            cVar.c0("dayOfMonth");
            cVar.H0(calendar.get(5));
            cVar.c0("hourOfDay");
            cVar.H0(calendar.get(11));
            cVar.c0("minute");
            cVar.H0(calendar.get(12));
            cVar.c0("second");
            cVar.H0(calendar.get(13));
            cVar.H();
        }
    }

    class s extends com.google.gson.x<Locale> {
        s() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(ex.a aVar) throws IOException {
            if (aVar.n0() == ex.b.NULL) {
                aVar.c0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.O(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, Locale locale) throws IOException {
            cVar.O0(locale == null ? null : locale.toString());
        }
    }

    class t implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.reflect.a f44983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f44984b;

        t(com.google.gson.reflect.a aVar, com.google.gson.x xVar) {
            this.f44983a = aVar;
            this.f44984b = xVar;
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.equals(this.f44983a)) {
                return this.f44984b;
            }
            return null;
        }
    }

    class u implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f44985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f44986b;

        u(Class cls, com.google.gson.x xVar) {
            this.f44985a = cls;
            this.f44986b = xVar;
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == this.f44985a) {
                return this.f44986b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f44985a.getName() + ",adapter=" + this.f44986b + "]";
        }
    }

    class v extends com.google.gson.x<BitSet> {
        v() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(ex.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.f();
            ex.b bVarN0 = aVar.n0();
            int i11 = 0;
            while (bVarN0 != ex.b.END_ARRAY) {
                int i12 = z.f44997a[bVarN0.ordinal()];
                boolean zNextBoolean = true;
                if (i12 == 1 || i12 == 2) {
                    int iNextInt = aVar.nextInt();
                    if (iNextInt == 0) {
                        zNextBoolean = false;
                    } else if (iNextInt != 1) {
                        throw new JsonSyntaxException("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + aVar.C());
                    }
                } else {
                    if (i12 != 3) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + bVarN0 + "; at path " + aVar.getPath());
                    }
                    zNextBoolean = aVar.nextBoolean();
                }
                if (zNextBoolean) {
                    bitSet.set(i11);
                }
                i11++;
                bVarN0 = aVar.n0();
            }
            aVar.e();
            return bitSet;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ex.c cVar, BitSet bitSet) throws IOException {
            cVar.p();
            int length = bitSet.length();
            for (int i11 = 0; i11 < length; i11++) {
                cVar.H0(bitSet.get(i11) ? 1L : 0L);
            }
            cVar.C();
        }
    }

    class w implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f44987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f44988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f44989c;

        w(Class cls, Class cls2, com.google.gson.x xVar) {
            this.f44987a = cls;
            this.f44988b = cls2;
            this.f44989c = xVar;
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f44987a || rawType == this.f44988b) {
                return this.f44989c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f44988b.getName() + Marker.ANY_NON_NULL_MARKER + this.f44987a.getName() + ",adapter=" + this.f44989c + "]";
        }
    }

    class x implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f44990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f44991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f44992c;

        x(Class cls, Class cls2, com.google.gson.x xVar) {
            this.f44990a = cls;
            this.f44991b = cls2;
            this.f44992c = xVar;
        }

        @Override // com.google.gson.y
        public <T> com.google.gson.x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f44990a || rawType == this.f44991b) {
                return this.f44992c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f44990a.getName() + Marker.ANY_NON_NULL_MARKER + this.f44991b.getName() + ",adapter=" + this.f44992c + "]";
        }
    }

    class y implements com.google.gson.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f44993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.x f44994b;

        /* JADX INFO: Add missing generic type declarations: [T1] */
        class a<T1> extends com.google.gson.x<T1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f44995a;

            a(Class cls) {
                this.f44995a = cls;
            }

            @Override // com.google.gson.x
            public T1 b(ex.a aVar) {
                T1 t11 = (T1) y.this.f44994b.b(aVar);
                if (t11 == null || this.f44995a.isInstance(t11)) {
                    return t11;
                }
                throw new JsonSyntaxException("Expected a " + this.f44995a.getName() + " but was " + t11.getClass().getName() + "; at path " + aVar.C());
            }

            @Override // com.google.gson.x
            public void d(ex.c cVar, T1 t11) {
                y.this.f44994b.d(cVar, t11);
            }
        }

        y(Class cls, com.google.gson.x xVar) {
            this.f44993a = cls;
            this.f44994b = xVar;
        }

        @Override // com.google.gson.y
        public <T2> com.google.gson.x<T2> a(com.google.gson.f fVar, com.google.gson.reflect.a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (this.f44993a.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f44993a.getName() + ",adapter=" + this.f44994b + "]";
        }
    }

    static /* synthetic */ class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44997a;

        static {
            int[] iArr = new int[ex.b.values().length];
            f44997a = iArr;
            try {
                iArr[ex.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44997a[ex.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44997a[ex.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        com.google.gson.x<Class> xVarA = new k().a();
        f44957a = xVarA;
        f44958b = b(Class.class, xVarA);
        com.google.gson.x<BitSet> xVarA2 = new v().a();
        f44959c = xVarA2;
        f44960d = b(BitSet.class, xVarA2);
        a0 a0Var = new a0();
        f44961e = a0Var;
        f44962f = new b0();
        f44963g = c(Boolean.TYPE, Boolean.class, a0Var);
        c0 c0Var = new c0();
        f44964h = c0Var;
        f44965i = c(Byte.TYPE, Byte.class, c0Var);
        d0 d0Var = new d0();
        f44966j = d0Var;
        f44967k = c(Short.TYPE, Short.class, d0Var);
        e0 e0Var = new e0();
        f44968l = e0Var;
        f44969m = c(Integer.TYPE, Integer.class, e0Var);
        com.google.gson.x<AtomicInteger> xVarA3 = new f0().a();
        f44970n = xVarA3;
        f44971o = b(AtomicInteger.class, xVarA3);
        com.google.gson.x<AtomicBoolean> xVarA4 = new g0().a();
        f44972p = xVarA4;
        f44973q = b(AtomicBoolean.class, xVarA4);
        com.google.gson.x<AtomicIntegerArray> xVarA5 = new a().a();
        f44974r = xVarA5;
        f44975s = b(AtomicIntegerArray.class, xVarA5);
        f44976t = new b();
        f44977u = new c();
        f44978v = new d();
        e eVar = new e();
        f44979w = eVar;
        f44980x = c(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f44981y = fVar;
        f44982z = new g();
        A = new h();
        B = new i();
        C = b(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = b(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = b(StringBuffer.class, lVar);
        m mVar = new m();
        H = mVar;
        I = b(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = b(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = e(InetAddress.class, oVar);
        C0703p c0703p = new C0703p();
        N = c0703p;
        O = b(UUID.class, c0703p);
        com.google.gson.x<Currency> xVarA6 = new q().a();
        P = xVarA6;
        Q = b(Currency.class, xVarA6);
        r rVar = new r();
        R = rVar;
        S = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = b(Locale.class, sVar);
        com.google.gson.internal.bind.f fVar2 = com.google.gson.internal.bind.f.f44893a;
        V = fVar2;
        W = e(com.google.gson.l.class, fVar2);
        X = com.google.gson.internal.bind.d.f44885d;
    }

    public static <TT> com.google.gson.y a(com.google.gson.reflect.a<TT> aVar, com.google.gson.x<TT> xVar) {
        return new t(aVar, xVar);
    }

    public static <TT> com.google.gson.y b(Class<TT> cls, com.google.gson.x<TT> xVar) {
        return new u(cls, xVar);
    }

    public static <TT> com.google.gson.y c(Class<TT> cls, Class<TT> cls2, com.google.gson.x<? super TT> xVar) {
        return new w(cls, cls2, xVar);
    }

    public static <TT> com.google.gson.y d(Class<TT> cls, Class<? extends TT> cls2, com.google.gson.x<? super TT> xVar) {
        return new x(cls, cls2, xVar);
    }

    public static <T1> com.google.gson.y e(Class<T1> cls, com.google.gson.x<T1> xVar) {
        return new y(cls, xVar);
    }
}
