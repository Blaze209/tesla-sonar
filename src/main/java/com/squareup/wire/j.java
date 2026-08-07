package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import okhttp3.internal.http2.Http2Connection;
import okio.t0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\f\u0010\u0003\u001a\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\r\u0010\u0003\u001a\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u0003\u001a\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0003\u001a\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0003\u001a\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0003\u001a\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0003\u001a\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0003\u001a\u0019\u0010\u001a\u001a\f\u0012\b\u0012\u00060\u0018j\u0002`\u00190\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u0003\u001a\u0019\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u001bj\u0002`\u001c0\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u0003\u001a\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0000H\u0000¢\u0006\u0004\b\u001f\u0010\u0003\u001a!\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0002\b\u0003\u0018\u00010 0\u0000H\u0000¢\u0006\u0004\b!\u0010\u0003\u001a\u001b\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\"0\u0000H\u0000¢\u0006\u0004\b#\u0010\u0003\u001a\u0017\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0000H\u0000¢\u0006\u0004\b%\u0010\u0003\u001a\u0017\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u0000H\u0000¢\u0006\u0004\b'\u0010\u0003\u001a7\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0000\"\b\b\u0000\u0010(*\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010*\u001a\u00020\u0014H\u0000¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", "", "a", "()Lcom/squareup/wire/ProtoAdapter;", "", "j", "u", "n", "f", "l", "", "k", "v", "o", "g", "m", "", "h", "", "c", "", "p", "Lokio/k;", "b", "j$/time/Duration", "Lcom/squareup/wire/Duration;", DateTokenConverter.CONVERTER_KEY, "j$/time/Instant", "Lcom/squareup/wire/Instant;", IntegerTokenConverter.CONVERTER_KEY, "Ljn0/h0;", "e", "", "r", "", "q", "", "s", "", "t", "T", "delegate", "typeUrl", "w", "(Lcom/squareup/wire/ProtoAdapter;Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 2, mv = {1, 4, 0})
public final class j {

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/squareup/wire/j$a", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "c", "(Z)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Z)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "(Z)Ljava/lang/Boolean;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class a extends ProtoAdapter<Boolean> {
        a(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean decode(com.squareup.wire.k reader) throws IOException {
            boolean z11;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            int iN = reader.n();
            if (iN != 0) {
                z11 = true;
                if (iN != 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid boolean value 0x");
                    String string = Integer.toString(iN, p013kotlin.text.a.a(16));
                    p013kotlin.jvm.internal.s.j(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                    sb2.append(p013kotlin.text.t.K0(string, 2, '0'));
                    throw new IOException(sb2.toString());
                }
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        public void b(com.squareup.wire.l writer, boolean value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.g(value ? 1 : 0);
        }

        public int c(boolean value) {
            return 1;
        }

        public Boolean d(boolean value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Boolean bool) {
            b(lVar, bool.booleanValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Boolean bool) {
            return c(bool.booleanValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Boolean redact(Boolean bool) {
            return d(bool.booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/squareup/wire/j$b", "Lcom/squareup/wire/ProtoAdapter;", "Lokio/k;", "value", "", "c", "(Lokio/k;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lokio/k;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lokio/k;", DateTokenConverter.CONVERTER_KEY, "(Lokio/k;)Lokio/k;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class b extends ProtoAdapter<okio.k> {
        b(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public okio.k decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return reader.i();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, okio.k value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            writer.a(value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(okio.k value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.D();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public okio.k redact(okio.k value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            throw new UnsupportedOperationException();
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/squareup/wire/j$c", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "c", "(D)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;D)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Double;", DateTokenConverter.CONVERTER_KEY, "(D)Ljava/lang/Double;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class c extends ProtoAdapter<Double> {
        c(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.k kVar = p013kotlin.jvm.internal.k.f86524a;
            return Double.valueOf(Double.longBitsToDouble(reader.k()));
        }

        public void b(com.squareup.wire.l writer, double value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.c(Double.doubleToLongBits(value));
        }

        public int c(double value) {
            return 8;
        }

        public Double d(double value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Double d11) {
            b(lVar, d11.doubleValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Double d11) {
            return c(d11.doubleValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Double redact(Double d11) {
            return d(d11.doubleValue());
        }
    }

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u0013*\u00060\u0002j\u0002`\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u00020\u0005*\u00060\u0002j\u0002`\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0019"}, d2 = {"com/squareup/wire/j$d", "Lcom/squareup/wire/ProtoAdapter;", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "value", "", "c", "(Lj$/time/Duration;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lj$/time/Duration;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lj$/time/Duration;", "f", "(Lj$/time/Duration;)Lj$/time/Duration;", "", "e", "(Lj$/time/Duration;)J", "sameSignSeconds", DateTokenConverter.CONVERTER_KEY, "sameSignNanos", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class d extends ProtoAdapter<Duration> {
        d(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, (co0.d<?>) dVar, str, oVar);
        }

        private final int d(Duration duration) {
            return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }

        private final long e(Duration duration) {
            return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Duration decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            long jLongValue = 0;
            int iIntValue = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    reader.e(jD);
                    Duration durationOfSeconds = Duration.ofSeconds(jLongValue, iIntValue);
                    p013kotlin.jvm.internal.s.j(durationOfSeconds, "Duration.ofSeconds(seconds, nano)");
                    return durationOfSeconds;
                }
                if (iG == 1) {
                    jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, Duration value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            long jE = e(value);
            if (jE != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(jE));
            }
            int iD = d(value);
            if (iD != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(iD));
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Duration value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            long jE = e(value);
            int iEncodedSizeWithTag = jE != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(jE)) : 0;
            int iD = d(value);
            return iD != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(iD)) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Duration redact(Duration value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/squareup/wire/j$e", "Lcom/squareup/wire/ProtoAdapter;", "Ljn0/h0;", "value", "", "c", "(Ljn0/h0;)I", "Lcom/squareup/wire/l;", "writer", "b", "(Lcom/squareup/wire/l;Ljn0/h0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)V", DateTokenConverter.CONVERTER_KEY, "(Ljn0/h0;)V", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class e extends ProtoAdapter<h0> {
        e(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, (co0.d<?>) dVar, str, oVar);
        }

        public void a(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    reader.e(jD);
                    return;
                }
                reader.m(iG);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, h0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(h0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return 0;
        }

        public void d(h0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ h0 decode(com.squareup.wire.k kVar) throws IOException {
            a(kVar);
            return h0.f84049a;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ h0 redact(h0 h0Var) {
            d(h0Var);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/squareup/wire/j$f", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "c", "(I)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;I)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Integer;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class f extends ProtoAdapter<Integer> {
        f(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return Integer.valueOf(reader.j());
        }

        public void b(com.squareup.wire.l writer, int value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.b(value);
        }

        public int c(int value) {
            return 4;
        }

        public Integer d(int value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Integer num) {
            b(lVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
            return c(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Integer redact(Integer num) {
            return d(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/squareup/wire/j$g", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "c", "(J)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;J)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "(J)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class g extends ProtoAdapter<Long> {
        g(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return Long.valueOf(reader.k());
        }

        public void b(com.squareup.wire.l writer, long value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.c(value);
        }

        public int c(long value) {
            return 8;
        }

        public Long d(long value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Long l11) {
            b(lVar, l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Long l11) {
            return c(l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Long redact(Long l11) {
            return d(l11.longValue());
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/squareup/wire/j$h", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "c", "(F)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;F)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Float;", DateTokenConverter.CONVERTER_KEY, "(F)Ljava/lang/Float;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class h extends ProtoAdapter<Float> {
        h(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.l lVar = p013kotlin.jvm.internal.l.f86526a;
            return Float.valueOf(Float.intBitsToFloat(reader.j()));
        }

        public void b(com.squareup.wire.l writer, float value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.b(Float.floatToIntBits(value));
        }

        public int c(float value) {
            return 4;
        }

        public Float d(float value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Float f11) {
            b(lVar, f11.floatValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Float f11) {
            return c(f11.floatValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Float redact(Float f11) {
            return d(f11.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/squareup/wire/j$i", "Lcom/squareup/wire/ProtoAdapter;", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "value", "", "c", "(Lj$/time/Instant;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lj$/time/Instant;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lj$/time/Instant;", DateTokenConverter.CONVERTER_KEY, "(Lj$/time/Instant;)Lj$/time/Instant;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class i extends ProtoAdapter<Instant> {
        i(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, (co0.d<?>) dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Instant decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            long jLongValue = 0;
            int iIntValue = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    reader.e(jD);
                    Instant instantOfEpochSecond = Instant.ofEpochSecond(jLongValue, iIntValue);
                    p013kotlin.jvm.internal.s.j(instantOfEpochSecond, "Instant.ofEpochSecond(epochSecond, nano)");
                    return instantOfEpochSecond;
                }
                if (iG == 1) {
                    jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, Instant value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            long epochSecond = value.getEpochSecond();
            if (epochSecond != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(epochSecond));
            }
            int nano = value.getNano();
            if (nano != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(nano));
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Instant value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            long epochSecond = value.getEpochSecond();
            int iEncodedSizeWithTag = epochSecond != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(epochSecond)) : 0;
            int nano = value.getNano();
            return nano != 0 ? iEncodedSizeWithTag + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(nano)) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Instant redact(Instant value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value;
        }
    }

    /* JADX INFO: renamed from: com.squareup.wire.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/squareup/wire/j$j", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "c", "(I)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;I)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Integer;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class C0784j extends ProtoAdapter<Integer> {
        C0784j(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return Integer.valueOf(reader.n());
        }

        public void b(com.squareup.wire.l writer, int value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.d(value);
        }

        public int c(int value) {
            return com.squareup.wire.l.INSTANCE.f(value);
        }

        public Integer d(int value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Integer num) {
            b(lVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
            return c(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Integer redact(Integer num) {
            return d(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/squareup/wire/j$k", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "c", "(J)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;J)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "(J)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class k extends ProtoAdapter<Long> {
        k(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return Long.valueOf(reader.o());
        }

        public void b(com.squareup.wire.l writer, long value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.h(value);
        }

        public int c(long value) {
            return com.squareup.wire.l.INSTANCE.j(value);
        }

        public Long d(long value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Long l11) {
            b(lVar, l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Long l11) {
            return c(l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Long redact(Long l11) {
            return d(l11.longValue());
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/squareup/wire/j$l", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "c", "(I)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;I)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Integer;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class l extends ProtoAdapter<Integer> {
        l(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return Integer.valueOf(com.squareup.wire.l.INSTANCE.b(reader.n()));
        }

        public void b(com.squareup.wire.l writer, int value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.g(com.squareup.wire.l.INSTANCE.d(value));
        }

        public int c(int value) {
            com.squareup.wire.l.Companion companion = com.squareup.wire.l.INSTANCE;
            return companion.i(companion.d(value));
        }

        public Integer d(int value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Integer num) {
            b(lVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
            return c(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Integer redact(Integer num) {
            return d(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/squareup/wire/j$m", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "c", "(J)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;J)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "(J)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class m extends ProtoAdapter<Long> {
        m(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return Long.valueOf(com.squareup.wire.l.INSTANCE.c(reader.o()));
        }

        public void b(com.squareup.wire.l writer, long value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.h(com.squareup.wire.l.INSTANCE.e(value));
        }

        public int c(long value) {
            com.squareup.wire.l.Companion companion = com.squareup.wire.l.INSTANCE;
            return companion.j(companion.e(value));
        }

        public Long d(long value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Long l11) {
            b(lVar, l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Long l11) {
            return c(l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Long redact(Long l11) {
            return d(l11.longValue());
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/squareup/wire/j$n", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "c", "(Ljava/lang/String;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ljava/lang/String;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class n extends ProtoAdapter<String> {
        n(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return reader.l();
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, String value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            writer.e(value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return (int) t0.b(value, 0, 0, 3, null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String redact(String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            throw new UnsupportedOperationException();
        }
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u00022\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"com/squareup/wire/j$o", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "c", "(Ljava/util/List;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ljava/util/List;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/util/List;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Ljava/util/List;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class o extends ProtoAdapter<List<?>> {
        o(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, (co0.d<?>) dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<?> decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    reader.e(jD);
                    return arrayList;
                }
                if (iG != 1) {
                    reader.p();
                } else {
                    arrayList.add(ProtoAdapter.STRUCT_VALUE.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, List<?> value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            if (value == null) {
                return;
            }
            Iterator<?> it = value.iterator();
            while (it.hasNext()) {
                ProtoAdapter.STRUCT_VALUE.encodeWithTag(writer, 1, it.next());
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(List<?> value) {
            int iEncodedSizeWithTag = 0;
            if (value == null) {
                return 0;
            }
            Iterator<?> it = value.iterator();
            while (it.hasNext()) {
                iEncodedSizeWithTag += ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(1, it.next());
            }
            return iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public List<Object> redact(List<?> value) {
            if (value == null) {
                return null;
            }
            List<?> list = value;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ProtoAdapter.STRUCT_VALUE.redact(it.next()));
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"com/squareup/wire/j$p", "Lcom/squareup/wire/ProtoAdapter;", "", "", "value", "", "c", "(Ljava/util/Map;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ljava/util/Map;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/util/Map;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)Ljava/util/Map;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class p extends ProtoAdapter<Map<String, ?>> {
        p(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, (co0.d<?>) dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, ?> decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    reader.e(jD);
                    return linkedHashMap;
                }
                if (iG != 1) {
                    reader.p();
                } else {
                    long jD2 = reader.d();
                    String strDecode = null;
                    Object objDecode = null;
                    while (true) {
                        int iG2 = reader.g();
                        if (iG2 == -1) {
                            break;
                        }
                        if (iG2 == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iG2 != 2) {
                            reader.m(iG2);
                        } else {
                            objDecode = ProtoAdapter.STRUCT_VALUE.decode(reader);
                        }
                    }
                    reader.e(jD2);
                    if (strDecode != null) {
                        p013kotlin.jvm.internal.s.h(strDecode);
                        linkedHashMap.put(strDecode, objDecode);
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, Map<String, ?> value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            if (value == null) {
                return;
            }
            for (Map.Entry<String, ?> entry : value.entrySet()) {
                String key = entry.getKey();
                Object value2 = entry.getValue();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, key);
                ProtoAdapter<Object> protoAdapter2 = ProtoAdapter.STRUCT_VALUE;
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, value2);
                writer.f(1, com.squareup.wire.b.LENGTH_DELIMITED);
                writer.g(iEncodedSizeWithTag2);
                protoAdapter.encodeWithTag(writer, 1, key);
                protoAdapter2.encodeWithTag(writer, 2, value2);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Map<String, ?> value) {
            int iH = 0;
            if (value == null) {
                return 0;
            }
            for (Map.Entry<String, ?> entry : value.entrySet()) {
                int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, entry.getKey()) + ProtoAdapter.STRUCT_VALUE.encodedSizeWithTag(2, entry.getValue());
                com.squareup.wire.l.Companion companion = com.squareup.wire.l.INSTANCE;
                iH += companion.h(1) + companion.i(iEncodedSizeWithTag) + iEncodedSizeWithTag;
            }
            return iH;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map<String, Object> redact(Map<String, ?> value) {
            if (value == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(value.size()));
            Iterator<T> it = value.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ProtoAdapter.STRUCT_VALUE.redact(entry));
            }
            return linkedHashMap;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"com/squareup/wire/j$q", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Void;)I", "tag", "e", "(ILjava/lang/Void;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ljava/lang/Void;)V", "c", "(Lcom/squareup/wire/l;ILjava/lang/Void;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Void;", "f", "(Ljava/lang/Void;)Ljava/lang/Void;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class q extends ProtoAdapter {
        q(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, (co0.d<?>) dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            int iN = reader.n();
            if (iN == 0) {
                return null;
            }
            throw new IOException("expected 0 but was " + iN);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, Void value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.g(0);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void encodeWithTag(com.squareup.wire.l writer, int tag, Void value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.f(tag, getFieldEncoding());
            encode(writer, value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int encodedSize(Void value) {
            return com.squareup.wire.l.INSTANCE.i(0);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int encodedSizeWithTag(int tag, Void value) {
            int iEncodedSize = encodedSize(value);
            com.squareup.wire.l.Companion companion = com.squareup.wire.l.INSTANCE;
            return companion.h(tag) + companion.i(iEncodedSize);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void redact(Void value) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"com/squareup/wire/j$r", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "encodedSize", "(Ljava/lang/Object;)I", "tag", "encodedSizeWithTag", "(ILjava/lang/Object;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "encode", "(Lcom/squareup/wire/l;Ljava/lang/Object;)V", "encodeWithTag", "(Lcom/squareup/wire/l;ILjava/lang/Object;)V", "Lcom/squareup/wire/k;", "reader", "decode", "(Lcom/squareup/wire/k;)Ljava/lang/Object;", "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class r extends ProtoAdapter<Object> {
        r(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar) {
            super(bVar, (co0.d<?>) dVar, str, oVar);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Object decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Object objDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG != -1) {
                    switch (iG) {
                        case 1:
                            objDecode = ProtoAdapter.STRUCT_NULL.decode(reader);
                            break;
                        case 2:
                            objDecode = ProtoAdapter.DOUBLE.decode(reader);
                            break;
                        case 3:
                            objDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            objDecode = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            objDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                            break;
                        case 6:
                            objDecode = ProtoAdapter.STRUCT_LIST.decode(reader);
                            break;
                        default:
                            reader.p();
                            break;
                    }
                } else {
                    reader.e(jD);
                    return objDecode;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(com.squareup.wire.l writer, Object value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            if (value == null) {
                ProtoAdapter.STRUCT_NULL.encodeWithTag(writer, 1, value);
                return;
            }
            if (value instanceof Number) {
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(((Number) value).doubleValue()));
                return;
            }
            if (value instanceof String) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value);
                return;
            }
            if (value instanceof Boolean) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value);
                return;
            }
            if (value instanceof Map) {
                ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (Map) value);
            } else {
                if (value instanceof List) {
                    ProtoAdapter.STRUCT_LIST.encodeWithTag(writer, 6, value);
                    return;
                }
                throw new IllegalArgumentException("unexpected struct value: " + value);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encodeWithTag(com.squareup.wire.l writer, int tag, Object value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            if (value != null) {
                super.encodeWithTag(writer, tag, value);
                return;
            }
            writer.f(tag, getFieldEncoding());
            writer.g(encodedSize(value));
            encode(writer, value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Object value) {
            if (value == null) {
                return ProtoAdapter.STRUCT_NULL.encodedSizeWithTag(1, value);
            }
            if (value instanceof Number) {
                return ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(((Number) value).doubleValue()));
            }
            if (value instanceof String) {
                return ProtoAdapter.STRING.encodedSizeWithTag(3, value);
            }
            if (value instanceof Boolean) {
                return ProtoAdapter.BOOL.encodedSizeWithTag(4, value);
            }
            if (value instanceof Map) {
                return ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, (Map) value);
            }
            if (value instanceof List) {
                return ProtoAdapter.STRUCT_LIST.encodedSizeWithTag(6, value);
            }
            throw new IllegalArgumentException("unexpected struct value: " + value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSizeWithTag(int tag, Object value) {
            if (value != null) {
                return super.encodedSizeWithTag(tag, value);
            }
            int iEncodedSize = encodedSize(value);
            com.squareup.wire.l.Companion companion = com.squareup.wire.l.INSTANCE;
            return companion.h(tag) + companion.i(iEncodedSize) + iEncodedSize;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Object redact(Object value) {
            if (value == null) {
                return ProtoAdapter.STRUCT_NULL.redact(value);
            }
            if (value instanceof Number) {
                return value;
            }
            if (value instanceof String) {
                return null;
            }
            if (value instanceof Boolean) {
                return value;
            }
            if (value instanceof Map) {
                return ProtoAdapter.STRUCT_MAP.redact((Map) value);
            }
            if (value instanceof List) {
                return ProtoAdapter.STRUCT_LIST.redact(value);
            }
            throw new IllegalArgumentException("unexpected struct value: " + value);
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/squareup/wire/j$s", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "c", "(I)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;I)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Integer;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class s extends ProtoAdapter<Integer> {
        s(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return Integer.valueOf(reader.n());
        }

        public void b(com.squareup.wire.l writer, int value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.g(value);
        }

        public int c(int value) {
            return com.squareup.wire.l.INSTANCE.i(value);
        }

        public Integer d(int value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Integer num) {
            b(lVar, num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Integer num) {
            return c(num.intValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Integer redact(Integer num) {
            return d(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/squareup/wire/j$t", "Lcom/squareup/wire/ProtoAdapter;", "", "value", "", "c", "(J)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;J)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Long;", DateTokenConverter.CONVERTER_KEY, "(J)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class t extends ProtoAdapter<Long> {
        t(com.squareup.wire.b bVar, co0.d dVar, String str, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str, oVar, obj);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            return Long.valueOf(reader.o());
        }

        public void b(com.squareup.wire.l writer, long value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            writer.h(value);
        }

        public int c(long value) {
            return com.squareup.wire.l.INSTANCE.j(value);
        }

        public Long d(long value) {
            throw new UnsupportedOperationException();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ void encode(com.squareup.wire.l lVar, Long l11) {
            b(lVar, l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ int encodedSize(Long l11) {
            return c(l11.longValue());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public /* bridge */ /* synthetic */ Long redact(Long l11) {
            return d(l11.longValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/squareup/wire/j$u", "Lcom/squareup/wire/ProtoAdapter;", "value", "", "encodedSize", "(Ljava/lang/Object;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "encode", "(Lcom/squareup/wire/l;Ljava/lang/Object;)V", "Lcom/squareup/wire/k;", "reader", "decode", "(Lcom/squareup/wire/k;)Ljava/lang/Object;", "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class u<T> extends ProtoAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProtoAdapter f49559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f49560b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(ProtoAdapter protoAdapter, String str, com.squareup.wire.b bVar, co0.d dVar, String str2, com.squareup.wire.o oVar, Object obj) {
            super(bVar, (co0.d<?>) dVar, str2, oVar, obj);
            this.f49559a = protoAdapter;
            this.f49560b = str;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public T decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            T t11 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    reader.e(jD);
                    return t11;
                }
                if (iG != 1) {
                    reader.m(iG);
                } else {
                    t11 = (T) this.f49559a.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(com.squareup.wire.l writer, T value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            if (value != null) {
                this.f49559a.encodeWithTag(writer, 1, value);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(T value) {
            if (value == null) {
                return 0;
            }
            return this.f49559a.encodedSizeWithTag(1, value);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public T redact(T value) {
            if (value == null) {
                return null;
            }
            return (T) this.f49559a.redact(value);
        }
    }

    public static final ProtoAdapter<Boolean> a() {
        return new a(com.squareup.wire.b.VARINT, o0.b(Boolean.TYPE), null, com.squareup.wire.o.PROTO_2, Boolean.FALSE);
    }

    public static final ProtoAdapter<okio.k> b() {
        return new b(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(okio.k.class), null, com.squareup.wire.o.PROTO_2, okio.k.f97943e);
    }

    public static final ProtoAdapter<Double> c() {
        return new c(com.squareup.wire.b.FIXED64, o0.b(Double.TYPE), null, com.squareup.wire.o.PROTO_2, Double.valueOf(0.0d));
    }

    public static final ProtoAdapter<Duration> d() {
        return new d(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(Duration.class), "type.googleapis.com/google.protobuf.Duration", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<h0> e() {
        return new e(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(h0.class), "type.googleapis.com/google.protobuf.Empty", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Integer> f() {
        return new f(com.squareup.wire.b.FIXED32, o0.b(Integer.TYPE), null, com.squareup.wire.o.PROTO_2, 0);
    }

    public static final ProtoAdapter<Long> g() {
        return new g(com.squareup.wire.b.FIXED64, o0.b(Long.TYPE), null, com.squareup.wire.o.PROTO_2, 0L);
    }

    public static final ProtoAdapter<Float> h() {
        return new h(com.squareup.wire.b.FIXED32, o0.b(Float.TYPE), null, com.squareup.wire.o.PROTO_2, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
    }

    public static final ProtoAdapter<Instant> i() {
        return new i(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(Instant.class), "type.googleapis.com/google.protobuf.Timestamp", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Integer> j() {
        return new C0784j(com.squareup.wire.b.VARINT, o0.b(Integer.TYPE), null, com.squareup.wire.o.PROTO_2, 0);
    }

    public static final ProtoAdapter<Long> k() {
        return new k(com.squareup.wire.b.VARINT, o0.b(Long.TYPE), null, com.squareup.wire.o.PROTO_2, 0L);
    }

    public static final ProtoAdapter<Integer> l() {
        return f();
    }

    public static final ProtoAdapter<Long> m() {
        return g();
    }

    public static final ProtoAdapter<Integer> n() {
        return new l(com.squareup.wire.b.VARINT, o0.b(Integer.TYPE), null, com.squareup.wire.o.PROTO_2, 0);
    }

    public static final ProtoAdapter<Long> o() {
        return new m(com.squareup.wire.b.VARINT, o0.b(Long.TYPE), null, com.squareup.wire.o.PROTO_2, 0L);
    }

    public static final ProtoAdapter<String> p() {
        return new n(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(String.class), null, com.squareup.wire.o.PROTO_2, "");
    }

    public static final ProtoAdapter<List<?>> q() {
        return new o(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(Map.class), "type.googleapis.com/google.protobuf.ListValue", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Map<String, ?>> r() {
        return new p(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(Map.class), "type.googleapis.com/google.protobuf.Struct", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter s() {
        return new q(com.squareup.wire.b.VARINT, o0.b(Void.class), "type.googleapis.com/google.protobuf.NullValue", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Object> t() {
        return new r(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(Object.class), "type.googleapis.com/google.protobuf.Value", com.squareup.wire.o.PROTO_3);
    }

    public static final ProtoAdapter<Integer> u() {
        return new s(com.squareup.wire.b.VARINT, o0.b(Integer.TYPE), null, com.squareup.wire.o.PROTO_2, 0);
    }

    public static final ProtoAdapter<Long> v() {
        return new t(com.squareup.wire.b.VARINT, o0.b(Long.TYPE), null, com.squareup.wire.o.PROTO_2, 0L);
    }

    public static final <T> ProtoAdapter<T> w(ProtoAdapter<T> delegate, String typeUrl) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(typeUrl, "typeUrl");
        return new u(delegate, typeUrl, com.squareup.wire.b.LENGTH_DELIMITED, delegate.getType(), typeUrl, com.squareup.wire.o.PROTO_3, null);
    }
}
