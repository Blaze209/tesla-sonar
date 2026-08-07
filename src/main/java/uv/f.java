package uv;

import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class f implements rv.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f116723f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final rv.b f116724g = rv.b.a(Action.KEY_ATTRIBUTE).b(uv.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final rv.b f116725h = rv.b.a("value").b(uv.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final rv.c<Map.Entry<Object, Object>> f116726i = new rv.c() { // from class: uv.e
        @Override // rv.c
        public final void encode(Object obj, Object obj2) {
            f.a((Map.Entry) obj, (rv.d) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f116727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, rv.c<?>> f116728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, rv.e<?>> f116729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rv.c<Object> f116730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f116731e = new i(this);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f116732a;

        static {
            int[] iArr = new int[d.a.values().length];
            f116732a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116732a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116732a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, rv.c<?>> map, Map<Class<?>, rv.e<?>> map2, rv.c<Object> cVar) {
        this.f116727a = outputStream;
        this.f116728b = map;
        this.f116729c = map2;
        this.f116730d = cVar;
    }

    public static /* synthetic */ void a(Map.Entry entry, rv.d dVar) {
        dVar.add(f116724g, entry.getKey());
        dVar.add(f116725h, entry.getValue());
    }

    private static ByteBuffer k(int i11) {
        return ByteBuffer.allocate(i11).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long l(rv.c<T> cVar, T t11) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f116727a;
            this.f116727a = bVar;
            try {
                cVar.encode(t11, this);
                this.f116727a = outputStream;
                long length = bVar.getLength();
                bVar.close();
                return length;
            } catch (Throwable th2) {
                this.f116727a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private <T> f m(rv.c<T> cVar, rv.b bVar, T t11, boolean z11) throws IOException {
        long jL = l(cVar, t11);
        if (z11 && jL == 0) {
            return this;
        }
        r((q(bVar) << 3) | 2);
        s(jL);
        cVar.encode(t11, this);
        return this;
    }

    private <T> f n(rv.e<T> eVar, rv.b bVar, T t11, boolean z11) {
        this.f116731e.b(bVar, z11);
        eVar.encode(t11, this.f116731e);
        return this;
    }

    private static d p(rv.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int q(rv.b bVar) {
        d dVar = (d) bVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private void r(int i11) throws IOException {
        while ((i11 & RangingPosition.RSSI_UNKNOWN) != 0) {
            this.f116727a.write((i11 & 127) | 128);
            i11 >>>= 7;
        }
        this.f116727a.write(i11 & 127);
    }

    private void s(long j11) throws IOException {
        while (((-128) & j11) != 0) {
            this.f116727a.write((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        this.f116727a.write(((int) j11) & 127);
    }

    rv.d b(@NonNull rv.b bVar, double d11, boolean z11) throws IOException {
        if (z11 && d11 == 0.0d) {
            return this;
        }
        r((q(bVar) << 3) | 1);
        this.f116727a.write(k(8).putDouble(d11).array());
        return this;
    }

    rv.d c(@NonNull rv.b bVar, float f11, boolean z11) throws IOException {
        if (z11 && f11 == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        r((q(bVar) << 3) | 5);
        this.f116727a.write(k(4).putFloat(f11).array());
        return this;
    }

    rv.d d(@NonNull rv.b bVar, Object obj, boolean z11) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z11 || charSequence.length() != 0) {
                    r((q(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f116723f);
                    r(bytes.length);
                    this.f116727a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    d(bVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    m(f116726i, bVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return b(bVar, ((Double) obj).doubleValue(), z11);
                }
                if (obj instanceof Float) {
                    return c(bVar, ((Float) obj).floatValue(), z11);
                }
                if (obj instanceof Number) {
                    return h(bVar, ((Number) obj).longValue(), z11);
                }
                if (obj instanceof Boolean) {
                    return j(bVar, ((Boolean) obj).booleanValue(), z11);
                }
                if (!(obj instanceof byte[])) {
                    rv.c<?> cVar = this.f116728b.get(obj.getClass());
                    if (cVar != null) {
                        return m(cVar, bVar, obj, z11);
                    }
                    rv.e<?> eVar = this.f116729c.get(obj.getClass());
                    if (eVar != null) {
                        return n(eVar, bVar, obj, z11);
                    }
                    if (obj instanceof c) {
                        return add(bVar, ((c) obj).getNumber());
                    }
                    return obj instanceof Enum ? add(bVar, ((Enum) obj).ordinal()) : m(this.f116730d, bVar, obj, z11);
                }
                byte[] bArr = (byte[]) obj;
                if (!z11 || bArr.length != 0) {
                    r((q(bVar) << 3) | 2);
                    r(bArr.length);
                    this.f116727a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // rv.d
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f add(@NonNull rv.b bVar, int i11) {
        return f(bVar, i11, true);
    }

    f f(@NonNull rv.b bVar, int i11, boolean z11) throws IOException {
        if (!z11 || i11 != 0) {
            d dVarP = p(bVar);
            int i12 = a.f116732a[dVarP.intEncoding().ordinal()];
            if (i12 == 1) {
                r(dVarP.tag() << 3);
                r(i11);
                return this;
            }
            if (i12 == 2) {
                r(dVarP.tag() << 3);
                r((i11 << 1) ^ (i11 >> 31));
                return this;
            }
            if (i12 == 3) {
                r((dVarP.tag() << 3) | 5);
                this.f116727a.write(k(4).putInt(i11).array());
                return this;
            }
        }
        return this;
    }

    @Override // rv.d
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f add(@NonNull rv.b bVar, long j11) {
        return h(bVar, j11, true);
    }

    f h(@NonNull rv.b bVar, long j11, boolean z11) throws IOException {
        if (!z11 || j11 != 0) {
            d dVarP = p(bVar);
            int i11 = a.f116732a[dVarP.intEncoding().ordinal()];
            if (i11 == 1) {
                r(dVarP.tag() << 3);
                s(j11);
                return this;
            }
            if (i11 == 2) {
                r(dVarP.tag() << 3);
                s((j11 >> 63) ^ (j11 << 1));
                return this;
            }
            if (i11 == 3) {
                r((dVarP.tag() << 3) | 1);
                this.f116727a.write(k(8).putLong(j11).array());
                return this;
            }
        }
        return this;
    }

    @Override // rv.d
    @NonNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f add(@NonNull rv.b bVar, boolean z11) {
        return j(bVar, z11, true);
    }

    f j(@NonNull rv.b bVar, boolean z11, boolean z12) {
        return f(bVar, z11 ? 1 : 0, z12);
    }

    f o(Object obj) {
        if (obj == null) {
            return this;
        }
        rv.c<?> cVar = this.f116728b.get(obj.getClass());
        if (cVar != null) {
            cVar.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // rv.d
    @NonNull
    public rv.d add(@NonNull rv.b bVar, Object obj) {
        return d(bVar, obj, true);
    }

    @Override // rv.d
    @NonNull
    public rv.d add(@NonNull rv.b bVar, double d11) {
        return b(bVar, d11, true);
    }
}
