package androidx.work;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 02\u00020\u0001:\u0002+0B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\"\u001a\u00020\n\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\t\u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010%J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001f\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Landroidx/work/g;", "", "other", "<init>", "(Landroidx/work/g;)V", "", "", "values", "(Ljava/util/Map;)V", Action.KEY_ATTRIBUTE, "", "defaultValue", "c", "(Ljava/lang/String;Z)Z", "", "f", "(Ljava/lang/String;I)I", "", "h", "(Ljava/lang/String;J)J", "", "e", "(Ljava/lang/String;F)F", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;D)D", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "", "l", "()[B", "T", "Ljava/lang/Class;", "klass", "j", "(Ljava/lang/String;Ljava/lang/Class;)Z", "k", "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "keyValueMap", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f14536c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> values;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00002\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001e¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\"\u0010\bJ\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010$R\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&¨\u0006'"}, d2 = {"Landroidx/work/g$a;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "value", "f", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/g$a;", "", "e", "(Ljava/lang/String;Z)Landroidx/work/g$a;", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;I)Landroidx/work/g$a;", "", "j", "(Ljava/lang/String;J)Landroidx/work/g$a;", "", "h", "(Ljava/lang/String;F)Landroidx/work/g$a;", "", "g", "(Ljava/lang/String;D)Landroidx/work/g$a;", "k", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/g$a;", "Landroidx/work/g;", "data", "c", "(Landroidx/work/g;)Landroidx/work/g$a;", "", "values", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)Landroidx/work/g$a;", "b", "a", "()Landroidx/work/g;", "", "Ljava/util/Map;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Object> values = new LinkedHashMap();

        private final a f(String key, Object value) {
            this.values.put(key, value);
            return this;
        }

        public final g a() {
            g gVar = new g((Map<String, ?>) this.values);
            g.INSTANCE.e(gVar);
            return gVar;
        }

        public final a b(String key, Object value) {
            p013kotlin.jvm.internal.s.k(key, "key");
            Map<String, Object> map = this.values;
            if (value == null) {
                value = null;
            } else {
                co0.d dVarB = p013kotlin.jvm.internal.o0.b(value.getClass());
                if (!p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Boolean.TYPE)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Byte.TYPE)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Integer.TYPE)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Long.TYPE)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Float.TYPE)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Double.TYPE)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(String.class)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Boolean[].class)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Byte[].class)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Integer[].class)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Long[].class)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Float[].class)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Double[].class)) && !p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(String[].class))) {
                    if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(boolean[].class))) {
                        value = h.h((boolean[]) value);
                    } else if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(byte[].class))) {
                        value = h.i((byte[]) value);
                    } else if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(int[].class))) {
                        value = h.l((int[]) value);
                    } else if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(long[].class))) {
                        value = h.m((long[]) value);
                    } else if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(float[].class))) {
                        value = h.k((float[]) value);
                    } else {
                        if (!p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(double[].class))) {
                            throw new IllegalArgumentException("Key " + key + " has invalid type " + dVarB);
                        }
                        value = h.j((double[]) value);
                    }
                }
            }
            map.put(key, value);
            return this;
        }

        public final a c(g data) {
            p013kotlin.jvm.internal.s.k(data, "data");
            d(data.values);
            return this;
        }

        public final a d(Map<String, ? extends Object> values) {
            p013kotlin.jvm.internal.s.k(values, "values");
            for (Map.Entry<String, ? extends Object> entry : values.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final a e(String key, boolean value) {
            p013kotlin.jvm.internal.s.k(key, "key");
            return f(key, Boolean.valueOf(value));
        }

        public final a g(String key, double value) {
            p013kotlin.jvm.internal.s.k(key, "key");
            return f(key, Double.valueOf(value));
        }

        public final a h(String key, float value) {
            p013kotlin.jvm.internal.s.k(key, "key");
            return f(key, Float.valueOf(value));
        }

        public final a i(String key, int value) {
            p013kotlin.jvm.internal.s.k(key, "key");
            return f(key, Integer.valueOf(value));
        }

        public final a j(String key, long value) {
            p013kotlin.jvm.internal.s.k(key, "key");
            return f(key, Long.valueOf(value));
        }

        public final a k(String key, String value) {
            p013kotlin.jvm.internal.s.k(key, "key");
            return f(key, value);
        }
    }

    /* JADX INFO: renamed from: androidx.work.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, d2 = {"Landroidx/work/g$b;", "", "<init>", "()V", "Landroidx/work/g;", "data", "", "e", "(Landroidx/work/g;)[B", "bytes", "a", "([B)Landroidx/work/g;", "EMPTY", "Landroidx/work/g;", "", "MAX_DATA_BYTES", "I", "", "TYPE_NULL", "B", "TYPE_BOOLEAN", "TYPE_BYTE", "TYPE_INTEGER", "TYPE_LONG", "TYPE_FLOAT", "TYPE_DOUBLE", "TYPE_STRING", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE_ARRAY", "TYPE_INTEGER_ARRAY", "TYPE_LONG_ARRAY", "TYPE_FLOAT_ARRAY", "TYPE_DOUBLE_ARRAY", "TYPE_STRING_ARRAY", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", "S", "STREAM_VERSION", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static final boolean b(ByteArrayInputStream byteArrayInputStream) throws IOException {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b11 = (byte) (-21267);
            boolean z11 = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b11) {
                z11 = true;
            }
            byteArrayInputStream.reset();
            return z11;
        }

        private static final void c(DataInputStream dataInputStream) throws IOException {
            short s11 = dataInputStream.readShort();
            if (s11 != -21521) {
                throw new IllegalStateException(("Magic number doesn't match: " + ((int) s11)).toString());
            }
            short s12 = dataInputStream.readShort();
            if (s12 == 1) {
                return;
            }
            throw new IllegalStateException(("Unsupported version number: " + ((int) s12)).toString());
        }

        private static final Object d(DataInputStream dataInputStream, byte b11) throws IOException {
            if (b11 == 0) {
                return null;
            }
            if (b11 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b11 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b11 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b11 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b11 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b11 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b11 == 7) {
                return dataInputStream.readUTF();
            }
            int i11 = 0;
            if (b11 == 8) {
                int i12 = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[i12];
                while (i11 < i12) {
                    boolArr[i11] = Boolean.valueOf(dataInputStream.readBoolean());
                    i11++;
                }
                return boolArr;
            }
            if (b11 == 9) {
                int i13 = dataInputStream.readInt();
                Byte[] bArr = new Byte[i13];
                while (i11 < i13) {
                    bArr[i11] = Byte.valueOf(dataInputStream.readByte());
                    i11++;
                }
                return bArr;
            }
            if (b11 == 10) {
                int i14 = dataInputStream.readInt();
                Integer[] numArr = new Integer[i14];
                while (i11 < i14) {
                    numArr[i11] = Integer.valueOf(dataInputStream.readInt());
                    i11++;
                }
                return numArr;
            }
            if (b11 == 11) {
                int i15 = dataInputStream.readInt();
                Long[] lArr = new Long[i15];
                while (i11 < i15) {
                    lArr[i11] = Long.valueOf(dataInputStream.readLong());
                    i11++;
                }
                return lArr;
            }
            if (b11 == 12) {
                int i16 = dataInputStream.readInt();
                Float[] fArr = new Float[i16];
                while (i11 < i16) {
                    fArr[i11] = Float.valueOf(dataInputStream.readFloat());
                    i11++;
                }
                return fArr;
            }
            if (b11 == 13) {
                int i17 = dataInputStream.readInt();
                Double[] dArr = new Double[i17];
                while (i11 < i17) {
                    dArr[i11] = Double.valueOf(dataInputStream.readDouble());
                    i11++;
                }
                return dArr;
            }
            if (b11 != 14) {
                throw new IllegalStateException("Unsupported type " + ((int) b11));
            }
            int i18 = dataInputStream.readInt();
            String[] strArr = new String[i18];
            while (i11 < i18) {
                String utf = dataInputStream.readUTF();
                if (p013kotlin.jvm.internal.s.f(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                strArr[i11] = utf;
                i11++;
            }
            return strArr;
        }

        private static final void f(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
            int i11;
            co0.d dVarB = p013kotlin.jvm.internal.o0.b(objArr.getClass());
            if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Boolean[].class))) {
                i11 = 8;
            } else if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Byte[].class))) {
                i11 = 9;
            } else if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Integer[].class))) {
                i11 = 10;
            } else if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Long[].class))) {
                i11 = 11;
            } else if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Float[].class))) {
                i11 = 12;
            } else if (p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(Double[].class))) {
                i11 = 13;
            } else {
                if (!p013kotlin.jvm.internal.s.f(dVarB, p013kotlin.jvm.internal.o0.b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + p013kotlin.jvm.internal.o0.b(objArr.getClass()).c());
                }
                i11 = 14;
            }
            dataOutputStream.writeByte(i11);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (i11 == 8) {
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i11 == 9) {
                    Byte b11 = obj instanceof Byte ? (Byte) obj : null;
                    dataOutputStream.writeByte(b11 != null ? b11.byteValue() : (byte) 0);
                } else if (i11 == 10) {
                    Integer num = obj instanceof Integer ? (Integer) obj : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i11 == 11) {
                    Long l11 = obj instanceof Long ? (Long) obj : null;
                    dataOutputStream.writeLong(l11 != null ? l11.longValue() : 0L);
                } else if (i11 == 12) {
                    Float f11 = obj instanceof Float ? (Float) obj : null;
                    dataOutputStream.writeFloat(f11 != null ? f11.floatValue() : BitmapDescriptorFactory.HUE_RED);
                } else if (i11 == 13) {
                    Double d11 = obj instanceof Double ? (Double) obj : null;
                    dataOutputStream.writeDouble(d11 != null ? d11.doubleValue() : 0.0d);
                } else if (i11 == 14) {
                    String str = obj instanceof String ? (String) obj : null;
                    if (str == null) {
                        str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str);
                }
            }
        }

        private static final void g(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + p013kotlin.jvm.internal.o0.b(obj.getClass()).l());
                }
                f(dataOutputStream, (Object[]) obj);
            }
            dataOutputStream.writeUTF(str);
        }

        private static final void h(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        public final g a(byte[] bytes) {
            p013kotlin.jvm.internal.s.k(bytes, "bytes");
            if (bytes.length > 10240) {
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            }
            if (bytes.length == 0) {
                return g.f14536c;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                int i11 = 0;
                if (b(byteArrayInputStream)) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i12 = objectInputStream.readInt();
                        while (i11 < i12) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i11++;
                        }
                        sn0.b.a(objectInputStream, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(objectInputStream, th2);
                            throw th3;
                        }
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        c(dataInputStream);
                        int i13 = dataInputStream.readInt();
                        while (i11 < i13) {
                            linkedHashMap.put(dataInputStream.readUTF(), d(dataInputStream, dataInputStream.readByte()));
                            i11++;
                        }
                        sn0.b.a(dataInputStream, null);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            sn0.b.a(dataInputStream, th4);
                            throw th5;
                        }
                    }
                }
            } catch (IOException e11) {
                z.e().d(h.f14544a, "Error in Data#fromByteArray: ", e11);
            } catch (ClassNotFoundException e12) {
                z.e().d(h.f14544a, "Error in Data#fromByteArray: ", e12);
            }
            return new g(linkedHashMap);
        }

        public final byte[] e(g data) {
            p013kotlin.jvm.internal.s.k(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    h(dataOutputStream);
                    dataOutputStream.writeInt(data.k());
                    for (Map.Entry entry : data.values.entrySet()) {
                        g(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    sn0.b.a(dataOutputStream, null);
                    p013kotlin.jvm.internal.s.h(byteArray);
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(dataOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e11) {
                z.e().d(h.f14544a, "Error in Data#toByteArray: ", e11);
                return new byte[0];
            }
        }

        private Companion() {
        }
    }

    public g(g other) {
        p013kotlin.jvm.internal.s.k(other, "other");
        this.values = new HashMap(other.values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        p013kotlin.jvm.internal.s.k(entry, "<destruct>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            p013kotlin.jvm.internal.s.j(value, "toString(...)");
        }
        sb2.append(value);
        return sb2.toString();
    }

    public final boolean c(String key, boolean defaultValue) {
        p013kotlin.jvm.internal.s.k(key, "key");
        Object objValueOf = Boolean.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    public final double d(String key, double defaultValue) {
        p013kotlin.jvm.internal.s.k(key, "key");
        Object objValueOf = Double.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Double) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).doubleValue();
    }

    public final float e(String key, float defaultValue) {
        p013kotlin.jvm.internal.s.k(key, "key");
        Object objValueOf = Float.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Float) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public boolean equals(Object other) {
        boolean zF;
        if (this == other) {
            return true;
        }
        if (other == null || !p013kotlin.jvm.internal.s.f(g.class, other.getClass())) {
            return false;
        }
        g gVar = (g) other;
        Set<String> setKeySet = this.values.keySet();
        if (!p013kotlin.jvm.internal.s.f(setKeySet, gVar.values.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.values.get(str);
            Object obj2 = gVar.values.get(str);
            if (obj == null || obj2 == null) {
                zF = obj == obj2;
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (obj2 instanceof Object[]) {
                    zF = p013kotlin.collections.n.d(objArr, (Object[]) obj2);
                } else {
                    zF = p013kotlin.jvm.internal.s.f(obj, obj2);
                }
            } else {
                zF = p013kotlin.jvm.internal.s.f(obj, obj2);
            }
            if (!zF) {
                return false;
            }
        }
        return true;
    }

    public final int f(String key, int defaultValue) {
        p013kotlin.jvm.internal.s.k(key, "key");
        Object objValueOf = Integer.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Integer) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).intValue();
    }

    public final Map<String, Object> g() {
        Map<String, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.values);
        p013kotlin.jvm.internal.s.j(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final long h(String key, long defaultValue) {
        p013kotlin.jvm.internal.s.k(key, "key");
        Object objValueOf = Long.valueOf(defaultValue);
        Object obj = this.values.get(key);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    public int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ p013kotlin.collections.n.b((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String i(String key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final <T> boolean j(String key, Class<T> klass) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(klass, "klass");
        Object obj = this.values.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public final int k() {
        return this.values.size();
    }

    public final byte[] l() {
        return INSTANCE.e(this);
    }

    public String toString() {
        return "Data {" + p013kotlin.collections.v.y0(this.values.entrySet(), null, null, null, 0, null, new wn0.l() { // from class: androidx.work.f
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return g.m((Map.Entry) obj);
            }
        }, 31, null) + "}";
    }

    public g(Map<String, ?> values) {
        p013kotlin.jvm.internal.s.k(values, "values");
        this.values = new HashMap(values);
    }
}
