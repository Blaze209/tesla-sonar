package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import j$.time.Duration;
import j$.time.Instant;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import jn0.h0;
import okio.c0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000 `*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002abB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\f\u0010\rB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\f\u0010\u000fB'\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000e\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u0010B/\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000e\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0011B\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\u0012B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u0013B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0014B9\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000e\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\f\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0000H&¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00028\u0000H&¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010\"\u001a\u00020!2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010(J\u0015\u0010\"\u001a\u00020)2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-J\u001d\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u00020.2\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\"\u00100J\u0017\u00103\u001a\u00028\u00002\u0006\u00102\u001a\u000201H&¢\u0006\u0004\b3\u00104J\u0015\u00103\u001a\u00028\u00002\u0006\u00105\u001a\u00020)¢\u0006\u0004\b3\u00106J\u0015\u00103\u001a\u00028\u00002\u0006\u00105\u001a\u00020+¢\u0006\u0004\b3\u00107J\u0015\u00103\u001a\u00028\u00002\u0006\u00109\u001a\u000208¢\u0006\u0004\b3\u0010:J\u0015\u00103\u001a\u00028\u00002\u0006\u0010/\u001a\u00020;¢\u0006\u0004\b3\u0010<J\u0017\u0010=\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b=\u0010>J\u001b\u0010C\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D0\u0000¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D0\u0000¢\u0006\u0004\bG\u0010FR(\u0010H\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010FR(\u0010K\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000D\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010I\u001a\u0004\bL\u0010FR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010OR\u001d\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010V\u001a\u0004\bW\u0010XR\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006c"}, d2 = {"Lcom/squareup/wire/ProtoAdapter;", "E", "", "Lcom/squareup/wire/b;", "fieldEncoding", "Lco0/d;", "type", "", "typeUrl", "Lcom/squareup/wire/o;", "syntax", "identity", "<init>", "(Lcom/squareup/wire/b;Lco0/d;Ljava/lang/String;Lcom/squareup/wire/o;Ljava/lang/Object;)V", "Ljava/lang/Class;", "(Lcom/squareup/wire/b;Ljava/lang/Class;)V", "(Lcom/squareup/wire/b;Ljava/lang/Class;Ljava/lang/String;)V", "(Lcom/squareup/wire/b;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/o;)V", "(Lcom/squareup/wire/b;Lco0/d;)V", "(Lcom/squareup/wire/b;Lco0/d;Ljava/lang/String;)V", "(Lcom/squareup/wire/b;Lco0/d;Ljava/lang/String;Lcom/squareup/wire/o;)V", "(Lcom/squareup/wire/b;Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/o;Ljava/lang/Object;)V", "value", "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "encodedSize", "(Ljava/lang/Object;)I", "tag", "encodedSizeWithTag", "(ILjava/lang/Object;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "encode", "(Lcom/squareup/wire/l;Ljava/lang/Object;)V", "encodeWithTag", "(Lcom/squareup/wire/l;ILjava/lang/Object;)V", "Lokio/i;", "sink", "(Lokio/i;Ljava/lang/Object;)V", "", "(Ljava/lang/Object;)[B", "Lokio/k;", "encodeByteString", "(Ljava/lang/Object;)Lokio/k;", "Ljava/io/OutputStream;", "stream", "(Ljava/io/OutputStream;Ljava/lang/Object;)V", "Lcom/squareup/wire/k;", "reader", "decode", "(Lcom/squareup/wire/k;)Ljava/lang/Object;", "bytes", "([B)Ljava/lang/Object;", "(Lokio/k;)Ljava/lang/Object;", "Lokio/j;", "source", "(Lokio/j;)Ljava/lang/Object;", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/squareup/wire/q$a;", AnnotatedPrivateKey.LABEL, "withLabel$wire_runtime", "(Lcom/squareup/wire/q$a;)Lcom/squareup/wire/ProtoAdapter;", "withLabel", "", "asPacked", "()Lcom/squareup/wire/ProtoAdapter;", "asRepeated", "packedAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getPackedAdapter$wire_runtime", "repeatedAdapter", "getRepeatedAdapter$wire_runtime", "Lcom/squareup/wire/b;", "getFieldEncoding$wire_runtime", "()Lcom/squareup/wire/b;", "Lco0/d;", "getType", "()Lco0/d;", "Ljava/lang/String;", "getTypeUrl", "()Ljava/lang/String;", "Lcom/squareup/wire/o;", "getSyntax", "()Lcom/squareup/wire/o;", "Ljava/lang/Object;", "getIdentity", "()Ljava/lang/Object;", "", "isStruct$wire_runtime", "()Z", "isStruct", "Companion", "a", "EnumConstantNotFoundException", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<Boolean> BOOL_VALUE;
    public static final ProtoAdapter<okio.k> BYTES;
    public static final ProtoAdapter<okio.k> BYTES_VALUE;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<Double> DOUBLE_VALUE;
    public static final ProtoAdapter<Duration> DURATION;
    public static final ProtoAdapter<h0> EMPTY;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<Float> FLOAT_VALUE;
    public static final ProtoAdapter<Instant> INSTANT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<Integer> INT32_VALUE;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<Long> INT64_VALUE;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<String> STRING_VALUE;
    public static final ProtoAdapter<List<?>> STRUCT_LIST;
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;
    public static final ProtoAdapter STRUCT_NULL;
    public static final ProtoAdapter<Object> STRUCT_VALUE;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<Integer> UINT32_VALUE;
    public static final ProtoAdapter<Long> UINT64;
    public static final ProtoAdapter<Long> UINT64_VALUE;
    private final b fieldEncoding;
    private final E identity;
    private final ProtoAdapter<List<E>> packedAdapter;
    private final ProtoAdapter<List<E>> repeatedAdapter;
    private final o syntax;
    private final co0.d<?> type;
    private final String typeUrl;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$EnumConstantNotFoundException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "value", "Lco0/d;", "type", "<init>", "(ILco0/d;)V", "a", "I", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int value;

        public EnumConstantNotFoundException(int i11, co0.d<?> dVar) {
            Class clsB;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown enum tag ");
            sb2.append(i11);
            sb2.append(" for ");
            sb2.append((dVar == null || (clsB = vn0.a.b(dVar)) == null) ? null : clsB.getName());
            super(sb2.toString());
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.squareup.wire.ProtoAdapter$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\u0006\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JW\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J_\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0014\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\f\"\u0014\b\u0002\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\b\b\u0001\u0010\u001d*\u00020\u001c2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0010\b\u0001\u0010\r*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010!\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\"\u0010#J)\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0007¢\u0006\u0004\b$\u0010\u0013J\u001b\u0010&\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010%\u001a\u00020\u0014H\u0007¢\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010*R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010*R\u001e\u00104\u001a\f\u0012\b\u0012\u000602j\u0002`30\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010*R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010*R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010*R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010*R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010*R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010*R\u001e\u0010@\u001a\f\u0012\b\u0012\u00060>j\u0002`?0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010*R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010*R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010*R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010*R\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010*R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010*R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010*R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010*R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010*R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010*R\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010*R \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010K0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010*R&\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0002\b\u0003\u0018\u00010\t0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010*R\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010*R\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010*R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010*R\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010*R\u001a\u0010S\u001a\b\u0012\u0004\u0012\u0002090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010*R\u001c\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010*¨\u0006U"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$a;", "", "<init>", "()V", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "valueAdapter", "", "e", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/f;", Gender.MALE, "Lcom/squareup/wire/f$a;", "B", "Ljava/lang/Class;", "type", "f", "(Ljava/lang/Class;)Lcom/squareup/wire/ProtoAdapter;", "", "typeUrl", "g", "(Ljava/lang/Class;Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/o;", "syntax", "h", "(Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/o;)Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/p;", "E", "Lcom/squareup/wire/a;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;)Lcom/squareup/wire/a;", "message", "a", "(Lcom/squareup/wire/f;)Lcom/squareup/wire/ProtoAdapter;", "b", "adapterString", "c", "(Ljava/lang/String;)Lcom/squareup/wire/ProtoAdapter;", "", "BOOL", "Lcom/squareup/wire/ProtoAdapter;", "BOOL_VALUE", "Lokio/k;", "BYTES", "BYTES_VALUE", "", "DOUBLE", "DOUBLE_VALUE", "j$/time/Duration", "Lcom/squareup/wire/Duration;", "DURATION", "Ljn0/h0;", "EMPTY", "", "FIXED32", "", "FIXED64", "", "FLOAT", "FLOAT_VALUE", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "INSTANT", "INT32", "INT32_VALUE", "INT64", "INT64_VALUE", "SFIXED32", "SFIXED64", "SINT32", "SINT64", "STRING", "STRING_VALUE", "", "STRUCT_LIST", "STRUCT_MAP", "", "STRUCT_NULL", "STRUCT_VALUE", "UINT32", "UINT32_VALUE", "UINT64", "UINT64_VALUE", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.squareup.wire.ProtoAdapter$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/squareup/wire/ProtoAdapter$a$a;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "value", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Void;)Ljava/lang/Void;", "c", "Lcom/squareup/wire/l;", "writer", "b", "(Lcom/squareup/wire/l;Ljava/lang/Void;)Ljava/lang/Void;", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/lang/Void;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
        public static final class C0783a extends ProtoAdapter {
            public C0783a() {
                super(b.LENGTH_DELIMITED, (co0.d<?>) o0.b(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void decode(k reader) {
                s.k(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void encode(l writer, Void value) {
                s.k(writer, "writer");
                s.k(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            public Void c(Void value) {
                s.k(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void redact(Void value) {
                s.k(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) c((Void) obj)).intValue();
            }
        }

        private Companion() {
        }

        public final <M extends f<?, ?>> ProtoAdapter<M> a(M message) {
            s.k(message, "message");
            return b(message.getClass());
        }

        public final <M> ProtoAdapter<M> b(Class<M> type) {
            s.k(type, "type");
            try {
                Object obj = type.getField("ADAPTER").get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M>");
            } catch (IllegalAccessException e11) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e11);
            } catch (NoSuchFieldException e12) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e12);
            }
        }

        public final ProtoAdapter<?> c(String adapterString) {
            s.k(adapterString, "adapterString");
            try {
                int iU0 = t.u0(adapterString, '#', 0, false, 6, null);
                String strSubstring = adapterString.substring(0, iU0);
                s.j(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String strSubstring2 = adapterString.substring(iU0 + 1);
                s.j(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                Object obj = Class.forName(strSubstring).getField(strSubstring2).get(null);
                if (obj != null) {
                    return (ProtoAdapter) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException("failed to access " + adapterString, e11);
            } catch (IllegalAccessException e12) {
                throw new IllegalArgumentException("failed to access " + adapterString, e12);
            } catch (NoSuchFieldException e13) {
                throw new IllegalArgumentException("failed to access " + adapterString, e13);
            }
        }

        public final <E extends p> a<E> d(Class<E> type) {
            s.k(type, "type");
            return new n(type);
        }

        public final <K, V> ProtoAdapter<Map<K, V>> e(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
            s.k(keyAdapter, "keyAdapter");
            s.k(valueAdapter, "valueAdapter");
            return new e(keyAdapter, valueAdapter);
        }

        public final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> f(Class<M> type) {
            s.k(type, "type");
            return x20.j.a(type, null, o.PROTO_2);
        }

        public final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> g(Class<M> type, String typeUrl) {
            s.k(type, "type");
            s.k(typeUrl, "typeUrl");
            return x20.j.a(type, typeUrl, o.PROTO_2);
        }

        public final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> h(Class<M> type, String typeUrl, o syntax) {
            s.k(type, "type");
            s.k(typeUrl, "typeUrl");
            s.k(syntax, "syntax");
            return x20.j.a(type, typeUrl, syntax);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        ProtoAdapter<Duration> c0783a;
        ProtoAdapter<Instant> c0783a2;
        ProtoAdapter<Boolean> protoAdapterA = j.a();
        BOOL = protoAdapterA;
        ProtoAdapter<Integer> protoAdapterJ = j.j();
        INT32 = protoAdapterJ;
        ProtoAdapter<Integer> protoAdapterU = j.u();
        UINT32 = protoAdapterU;
        SINT32 = j.n();
        FIXED32 = j.f();
        SFIXED32 = j.l();
        ProtoAdapter<Long> protoAdapterK = j.k();
        INT64 = protoAdapterK;
        ProtoAdapter<Long> protoAdapterV = j.v();
        UINT64 = protoAdapterV;
        SINT64 = j.o();
        FIXED64 = j.g();
        SFIXED64 = j.m();
        ProtoAdapter<Float> protoAdapterH = j.h();
        FLOAT = protoAdapterH;
        ProtoAdapter<Double> protoAdapterC = j.c();
        DOUBLE = protoAdapterC;
        ProtoAdapter<okio.k> protoAdapterB = j.b();
        BYTES = protoAdapterB;
        ProtoAdapter<String> protoAdapterP = j.p();
        STRING = protoAdapterP;
        EMPTY = j.e();
        STRUCT_MAP = j.r();
        STRUCT_LIST = j.q();
        STRUCT_NULL = j.s();
        STRUCT_VALUE = j.t();
        DOUBLE_VALUE = j.w(protoAdapterC, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = j.w(protoAdapterH, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = j.w(protoAdapterK, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = j.w(protoAdapterV, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = j.w(protoAdapterJ, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = j.w(protoAdapterU, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = j.w(protoAdapterA, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = j.w(protoAdapterP, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = j.w(protoAdapterB, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            c0783a = j.d();
        } catch (NoClassDefFoundError unused) {
            c0783a = new Companion.C0783a();
        }
        DURATION = c0783a;
        try {
            c0783a2 = j.i();
        } catch (NoClassDefFoundError unused2) {
            c0783a2 = new Companion.C0783a();
        }
        INSTANT = c0783a2;
    }

    public /* synthetic */ ProtoAdapter(b bVar, co0.d dVar, String str, o oVar, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (co0.d<?>) dVar, str, oVar, (i11 & 16) != 0 ? null : obj);
    }

    public static final <M extends f<?, ?>> ProtoAdapter<M> get(M m11) {
        return INSTANCE.a(m11);
    }

    public static final <E extends p> a<E> newEnumAdapter(Class<E> cls) {
        return INSTANCE.d(cls);
    }

    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return INSTANCE.e(protoAdapter, protoAdapter2);
    }

    public static final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return INSTANCE.f(cls);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        if (!(this.fieldEncoding != b.LENGTH_DELIMITED)) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.");
        }
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public abstract E decode(k reader);

    public final E decode(InputStream stream) {
        s.k(stream, "stream");
        return decode(c0.d(c0.m(stream)));
    }

    public abstract void encode(l writer, E value);

    public final void encode(OutputStream stream, E value) {
        s.k(stream, "stream");
        okio.i iVarC = c0.c(c0.i(stream));
        encode(iVarC, value);
        iVarC.T1();
    }

    public final okio.k encodeByteString(E value) {
        okio.h hVar = new okio.h();
        encode(hVar, value);
        return hVar.m1();
    }

    public void encodeWithTag(l writer, int tag, E value) {
        s.k(writer, "writer");
        if (value == null) {
            return;
        }
        writer.f(tag, getFieldEncoding());
        if (getFieldEncoding() == b.LENGTH_DELIMITED) {
            writer.g(encodedSize(value));
        }
        encode(writer, value);
    }

    public abstract int encodedSize(E value);

    public int encodedSizeWithTag(int tag, E value) {
        if (value == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(value);
        if (getFieldEncoding() == b.LENGTH_DELIMITED) {
            iEncodedSize += l.INSTANCE.i(iEncodedSize);
        }
        return iEncodedSize + l.INSTANCE.h(tag);
    }

    /* JADX INFO: renamed from: getFieldEncoding$wire_runtime, reason: from getter */
    public final b getFieldEncoding() {
        return this.fieldEncoding;
    }

    public final E getIdentity() {
        return this.identity;
    }

    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    public final o getSyntax() {
        return this.syntax;
    }

    public final co0.d<?> getType() {
        return this.type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return s.f(this, STRUCT_MAP) || s.f(this, STRUCT_LIST) || s.f(this, STRUCT_VALUE) || s.f(this, STRUCT_NULL);
    }

    public abstract E redact(E value);

    public String toString(E value) {
        return String.valueOf(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProtoAdapter<?> withLabel$wire_runtime(q.a label) {
        s.k(label, "label");
        if (label.isRepeated()) {
            return label.isPacked() ? asPacked() : asRepeated();
        }
        return this;
    }

    public ProtoAdapter(b fieldEncoding, co0.d<?> dVar, String str, o syntax, E e11) {
        i iVar;
        b bVar;
        s.k(fieldEncoding, "fieldEncoding");
        s.k(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = dVar;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e11;
        boolean z11 = this instanceof i;
        m mVar = null;
        if (z11 || (this instanceof m) || fieldEncoding == (bVar = b.LENGTH_DELIMITED)) {
            iVar = null;
        } else {
            if (!(getFieldEncoding() != bVar)) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            iVar = new i(this);
        }
        this.packedAdapter = iVar;
        if (!(this instanceof m) && !z11) {
            mVar = new m(this);
        }
        this.repeatedAdapter = mVar;
    }

    public static final <M> ProtoAdapter<M> get(Class<M> cls) {
        return INSTANCE.b(cls);
    }

    public static final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str) {
        return INSTANCE.g(cls, str);
    }

    public final E decode(byte[] bytes) {
        s.k(bytes, "bytes");
        return decode(new okio.h().write(bytes));
    }

    public static final ProtoAdapter<?> get(String str) {
        return INSTANCE.c(str);
    }

    public static final <M extends f<M, B>, B extends f.a<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, o oVar) {
        return INSTANCE.h(cls, str, oVar);
    }

    public final E decode(okio.k bytes) {
        s.k(bytes, "bytes");
        return decode(new okio.h().A1(bytes));
    }

    public final E decode(okio.j source) {
        s.k(source, "source");
        return decode(new k(source));
    }

    public final void encode(okio.i sink, E value) {
        s.k(sink, "sink");
        encode(new l(sink), value);
    }

    public final byte[] encode(E value) {
        okio.h hVar = new okio.h();
        encode(hVar, value);
        return hVar.V0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, Class<?> type) {
        this(fieldEncoding, (co0.d<?>) vn0.a.e(type));
        s.k(fieldEncoding, "fieldEncoding");
        s.k(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, Class<?> type, String str) {
        this(fieldEncoding, (co0.d<?>) vn0.a.e(type), str, o.PROTO_2);
        s.k(fieldEncoding, "fieldEncoding");
        s.k(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, Class<?> type, String str, o syntax) {
        this(fieldEncoding, (co0.d<?>) vn0.a.e(type), str, syntax);
        s.k(fieldEncoding, "fieldEncoding");
        s.k(type, "type");
        s.k(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, co0.d<?> dVar) {
        this(fieldEncoding, dVar, (String) null, o.PROTO_2);
        s.k(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, co0.d<?> dVar, String str) {
        this(fieldEncoding, dVar, str, o.PROTO_2);
        s.k(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, co0.d<?> dVar, String str, o syntax) {
        this(fieldEncoding, dVar, str, syntax, (Object) null);
        s.k(fieldEncoding, "fieldEncoding");
        s.k(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(b fieldEncoding, Class<?> type, String str, o syntax, E e11) {
        this(fieldEncoding, (co0.d<?>) vn0.a.e(type), str, syntax, e11);
        s.k(fieldEncoding, "fieldEncoding");
        s.k(type, "type");
        s.k(syntax, "syntax");
    }
}
