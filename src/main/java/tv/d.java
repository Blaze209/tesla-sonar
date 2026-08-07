package tv;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements sv.b<d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final rv.c<Object> f115145e = new rv.c() { // from class: tv.a
        @Override // rv.c
        public final void encode(Object obj, Object obj2) {
            d.b(obj, (rv.d) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final rv.e<String> f115146f = new rv.e() { // from class: tv.b
        @Override // rv.e
        public final void encode(Object obj, Object obj2) {
            ((rv.f) obj2).add((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final rv.e<Boolean> f115147g = new rv.e() { // from class: tv.c
        @Override // rv.e
        public final void encode(Object obj, Object obj2) {
            ((rv.f) obj2).add(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f115148h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, rv.c<?>> f115149a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, rv.e<?>> f115150b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rv.c<Object> f115151c = f115145e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f115152d = false;

    class a implements rv.a {
        a() {
        }

        @Override // rv.a
        public void a(@NonNull Object obj, @NonNull Writer writer) {
            e eVar = new e(writer, d.this.f115149a, d.this.f115150b, d.this.f115151c, d.this.f115152d);
            eVar.d(obj, false);
            eVar.n();
        }

        @Override // rv.a
        public String encode(@NonNull Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements rv.e<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f115154a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f115154a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // rv.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(@NonNull Date date, @NonNull rv.f fVar) {
            fVar.add(f115154a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        l(String.class, f115146f);
        l(Boolean.class, f115147g);
        l(Date.class, f115148h);
    }

    public static /* synthetic */ void b(Object obj, rv.d dVar) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @NonNull
    public rv.a h() {
        return new a();
    }

    @NonNull
    public d i(@NonNull sv.a aVar) {
        aVar.configure(this);
        return this;
    }

    @NonNull
    public d j(boolean z11) {
        this.f115152d = z11;
        return this;
    }

    @Override // sv.b
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public <T> d registerEncoder(@NonNull Class<T> cls, @NonNull rv.c<? super T> cVar) {
        this.f115149a.put(cls, cVar);
        this.f115150b.remove(cls);
        return this;
    }

    @NonNull
    public <T> d l(@NonNull Class<T> cls, @NonNull rv.e<? super T> eVar) {
        this.f115150b.put(cls, eVar);
        this.f115149a.remove(cls);
        return this;
    }
}
