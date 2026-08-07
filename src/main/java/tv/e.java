package tv;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class e implements rv.d, rv.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f115155a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f115156b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f115157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, rv.c<?>> f115158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, rv.e<?>> f115159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rv.c<Object> f115160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f115161g;

    e(@NonNull Writer writer, @NonNull Map<Class<?>, rv.c<?>> map, @NonNull Map<Class<?>, rv.e<?>> map2, rv.c<Object> cVar, boolean z11) {
        this.f115157c = new JsonWriter(writer);
        this.f115158d = map;
        this.f115159e = map2;
        this.f115160f = cVar;
        this.f115161g = z11;
    }

    private boolean m(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e p(@NonNull String str, Object obj) throws IOException {
        r();
        this.f115157c.name(str);
        if (obj != null) {
            return d(obj, false);
        }
        this.f115157c.nullValue();
        return this;
    }

    private e q(@NonNull String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        r();
        this.f115157c.name(str);
        return d(obj, false);
    }

    private void r() throws IOException {
        if (!this.f115156b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f115155a;
        if (eVar != null) {
            eVar.r();
            this.f115155a.f115156b = false;
            this.f115155a = null;
            this.f115157c.endObject();
        }
    }

    @NonNull
    public e a(double d11) throws IOException {
        r();
        this.f115157c.value(d11);
        return this;
    }

    @NonNull
    public e b(int i11) throws IOException {
        r();
        this.f115157c.value(i11);
        return this;
    }

    @NonNull
    public e c(long j11) throws IOException {
        r();
        this.f115157c.value(j11);
        return this;
    }

    @NonNull
    e d(Object obj, boolean z11) {
        if (z11 && m(obj)) {
            throw new EncodingException(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f115157c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f115157c.value((Number) obj);
            return this;
        }
        int i11 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f115157c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    d(it.next(), false);
                }
                this.f115157c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f115157c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i((String) key, entry.getValue());
                    } catch (ClassCastException e11) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e11);
                    }
                }
                this.f115157c.endObject();
                return this;
            }
            rv.c<?> cVar = this.f115158d.get(obj.getClass());
            if (cVar != null) {
                return o(cVar, obj, z11);
            }
            rv.e<?> eVar = this.f115159e.get(obj.getClass());
            if (eVar != null) {
                eVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return o(this.f115160f, obj, z11);
            }
            if (obj instanceof f) {
                b(((f) obj).getNumber());
                return this;
            }
            add(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return l((byte[]) obj);
        }
        this.f115157c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i11 < length) {
                this.f115157c.value(iArr[i11]);
                i11++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i11 < length2) {
                c(jArr[i11]);
                i11++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i11 < length3) {
                this.f115157c.value(dArr[i11]);
                i11++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i11 < length4) {
                this.f115157c.value(zArr[i11]);
                i11++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                d(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                d(obj2, false);
            }
        }
        this.f115157c.endArray();
        return this;
    }

    @Override // rv.f
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e add(String str) throws IOException {
        r();
        this.f115157c.value(str);
        return this;
    }

    @NonNull
    public e f(@NonNull String str, double d11) throws IOException {
        r();
        this.f115157c.name(str);
        return a(d11);
    }

    @NonNull
    public e g(@NonNull String str, int i11) throws IOException {
        r();
        this.f115157c.name(str);
        return b(i11);
    }

    @NonNull
    public e h(@NonNull String str, long j11) throws IOException {
        r();
        this.f115157c.name(str);
        return c(j11);
    }

    @NonNull
    public e i(@NonNull String str, Object obj) {
        return this.f115161g ? q(str, obj) : p(str, obj);
    }

    @NonNull
    public e j(@NonNull String str, boolean z11) throws IOException {
        r();
        this.f115157c.name(str);
        return add(z11);
    }

    @Override // rv.f
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e add(boolean z11) throws IOException {
        r();
        this.f115157c.value(z11);
        return this;
    }

    @NonNull
    public e l(byte[] bArr) throws IOException {
        r();
        if (bArr == null) {
            this.f115157c.nullValue();
            return this;
        }
        this.f115157c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void n() {
        r();
        this.f115157c.flush();
    }

    e o(rv.c<Object> cVar, Object obj, boolean z11) throws IOException {
        if (!z11) {
            this.f115157c.beginObject();
        }
        cVar.encode(obj, this);
        if (!z11) {
            this.f115157c.endObject();
        }
        return this;
    }

    @Override // rv.d
    @NonNull
    public rv.d add(@NonNull rv.b bVar, Object obj) {
        return i(bVar.b(), obj);
    }

    @Override // rv.d
    @NonNull
    public rv.d add(@NonNull rv.b bVar, double d11) {
        return f(bVar.b(), d11);
    }

    @Override // rv.d
    @NonNull
    public rv.d add(@NonNull rv.b bVar, int i11) {
        return g(bVar.b(), i11);
    }

    @Override // rv.d
    @NonNull
    public rv.d add(@NonNull rv.b bVar, long j11) {
        return h(bVar.b(), j11);
    }

    @Override // rv.d
    @NonNull
    public rv.d add(@NonNull rv.b bVar, boolean z11) {
        return j(bVar.b(), z11);
    }
}
