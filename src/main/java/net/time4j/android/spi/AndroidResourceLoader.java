package net.time4j.android.spi;

import android.content.Context;
import android.text.format.DateFormat;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import net.time4j.engine.r;
import net.time4j.format.o;
import net.time4j.format.u;
import net.time4j.format.x;
import net.time4j.format.y;
import net.time4j.tz.s;

/* JADX INFO: loaded from: classes9.dex */
public class AndroidResourceLoader extends net.time4j.base.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<Class<?>, Iterable<?>> f93932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<String> f93933g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f93934d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<net.time4j.format.f> f93935e = Collections.EMPTY_LIST;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93936a;

        static {
            int[] iArr = new int[net.time4j.format.e.values().length];
            f93936a = iArr;
            try {
                iArr[net.time4j.format.e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93936a[net.time4j.format.e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93936a[net.time4j.format.e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class b implements dp0.c {
        private b() {
        }

        private dp0.c b() {
            return c.f93938a;
        }

        private String c(String str) {
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            int i11 = 0;
            while (i11 < length) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '\'') {
                    sb2.append(cCharAt);
                    while (true) {
                        i11++;
                        if (i11 >= length) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 == '\'') {
                            sb2.append(cCharAt2);
                            int i12 = i11 + 1;
                            if (i12 >= length || str.charAt(i12) != '\'') {
                                break;
                            }
                            i11 = i12;
                        }
                        sb2.append(cCharAt2);
                    }
                } else if (cCharAt == 'h') {
                    sb2.append('H');
                } else if (cCharAt != 'a') {
                    sb2.append(cCharAt);
                }
                i11++;
            }
            return sb2.toString();
        }

        @Override // net.time4j.format.f
        public String a(net.time4j.format.e eVar, Locale locale) {
            return i(eVar, locale, false);
        }

        @Override // net.time4j.format.f
        public String f(net.time4j.format.e eVar, Locale locale) {
            return b().f(eVar, locale);
        }

        @Override // dp0.c
        public String i(net.time4j.format.e eVar, Locale locale, boolean z11) {
            String strI = b().i(eVar, locale, z11);
            if (Locale.getDefault().equals(locale)) {
                net.time4j.format.e eVar2 = net.time4j.format.e.SHORT;
                boolean z12 = (eVar != eVar2 ? b().a(eVar2, locale) : strI).indexOf(97) == -1;
                boolean zIs24HourFormat = DateFormat.is24HourFormat(AndroidResourceLoader.this.f93934d);
                if (zIs24HourFormat != z12) {
                    if (zIs24HourFormat) {
                        return c(strI).replace("  ", " ").trim();
                    }
                    String str = locale.getLanguage().equals("en") ? "b" : "B";
                    int i11 = a.f93936a[eVar.ordinal()];
                    if (i11 == 1) {
                        return "h:mm:ss " + str + " zzzz";
                    }
                    if (i11 == 2) {
                        return "h:mm:ss " + str + " z";
                    }
                    if (i11 != 3) {
                        return "h:mm " + str;
                    }
                    return "h:mm:ss " + str;
                }
            }
            return strI;
        }

        @Override // net.time4j.format.f
        public String k(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale) {
            return b().k(eVar, eVar2, locale);
        }

        /* synthetic */ b(AndroidResourceLoader androidResourceLoader, a aVar) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final net.time4j.i18n.c f93938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<net.time4j.format.i> f93939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Iterable<y> f93940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Iterable<u> f93941d;

        static {
            net.time4j.i18n.c cVar = new net.time4j.i18n.c();
            f93938a = cVar;
            f93939b = Collections.singleton(net.time4j.i18n.f.f94651d);
            f93940c = Collections.singletonList(new net.time4j.i18n.i());
            f93941d = Collections.unmodifiableList(Arrays.asList(cVar, new net.time4j.calendar.service.b()));
        }
    }

    private static final class d implements Iterable<r> {
        private d() {
        }

        @Override // java.lang.Iterable
        public Iterator<r> iterator() {
            return l.f93943b.iterator();
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e implements Iterable<fp0.c> {
        private e() {
        }

        @Override // java.lang.Iterable
        public Iterator<fp0.c> iterator() {
            return m.f93946c.iterator();
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private static final class f implements Iterable<net.time4j.format.i> {
        private f() {
        }

        @Override // java.lang.Iterable
        public Iterator<net.time4j.format.i> iterator() {
            return c.f93939b.iterator();
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    private static final class g implements Iterable<o> {
        private g() {
        }

        @Override // java.lang.Iterable
        public Iterator<o> iterator() {
            return l.f93942a.iterator();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private static final class h implements Iterable<u> {
        private h() {
        }

        @Override // java.lang.Iterable
        public Iterator<u> iterator() {
            return c.f93941d.iterator();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    private static final class i implements Iterable<y> {
        private i() {
        }

        @Override // java.lang.Iterable
        public Iterator<y> iterator() {
            return c.f93940c.iterator();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    private static final class j implements Iterable<s> {
        private j() {
        }

        @Override // java.lang.Iterable
        public Iterator<s> iterator() {
            return m.f93945b.iterator();
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    private static final class k implements Iterable<net.time4j.tz.r> {
        private k() {
        }

        @Override // java.lang.Iterable
        public Iterator<net.time4j.tz.r> iterator() {
            return m.f93944a.iterator();
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    private static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterable<o> f93942a = Collections.singleton(new net.time4j.i18n.a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<r> f93943b = Arrays.asList(new net.time4j.i18n.b(), new net.time4j.calendar.service.c());
    }

    private static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterable<net.time4j.tz.r> f93944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable<s> f93945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Iterable<fp0.c> f93946c;

        static {
            fp0.c cVar;
            Set setSingleton = Collections.singleton(new gp0.a());
            f93944a = setSingleton;
            f93945b = Collections.singleton(new gp0.b());
            Iterator it = setSingleton.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                net.time4j.tz.r rVar = (net.time4j.tz.r) it.next();
                if (rVar instanceof fp0.c) {
                    cVar = (fp0.c) fp0.c.class.cast(rVar);
                    break;
                }
            }
            if (cVar == null) {
                f93946c = Collections.EMPTY_LIST;
            } else {
                f93946c = Collections.singleton(cVar);
            }
        }
    }

    static {
        HashMap map = new HashMap();
        a aVar = null;
        map.put(u.class, new h(aVar));
        map.put(net.time4j.tz.r.class, new k(aVar));
        map.put(s.class, new j(aVar));
        map.put(fp0.c.class, new e(aVar));
        map.put(r.class, new d(aVar));
        map.put(net.time4j.format.i.class, new f(aVar));
        map.put(o.class, new g(aVar));
        map.put(x.class, Collections.singleton(new net.time4j.i18n.h()));
        map.put(y.class, new i(aVar));
        map.put(fp0.e.class, Collections.singleton(new net.time4j.android.spi.a()));
        f93932f = Collections.unmodifiableMap(map);
        HashSet hashSet = new HashSet();
        hashSet.add("i18n");
        hashSet.add("calendar");
        hashSet.add("olson");
        hashSet.add("tzdata");
        f93933g = Collections.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T i(Object obj) {
        return obj;
    }

    @Override // net.time4j.base.d
    public InputStream e(URI uri, boolean z11) {
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isAbsolute()) {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(uri.toURL().openConnection());
                uRLConnection.setUseCaches(false);
                return uRLConnection.getInputStream();
            }
            Context context = this.f93934d;
            if (context != null) {
                return context.getAssets().open(uri.toString());
            }
            throw new IllegalStateException("'ApplicationStarter.initialize(context)' must be called first at app start.");
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.d
    public URI f(String str, Class<?> cls, String str2) {
        try {
            if (!f93933g.contains(str)) {
                URL resource = cls.getClassLoader().getResource(str2);
                if (resource != null) {
                    return resource.toURI();
                }
                return null;
            }
            return new URI("net/time4j/" + str + '/' + str2);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    @Override // net.time4j.base.d
    public <S> Iterable<S> g(Class<S> cls) {
        Iterable<?> iterable = f93932f.get(cls);
        if (iterable == null) {
            if (cls != net.time4j.format.f.class) {
                return ServiceLoader.load(cls, cls.getClassLoader());
            }
            iterable = this.f93935e;
        }
        return (Iterable) i(iterable);
    }

    public void j(Context context, cp0.a aVar) {
        if (context == null) {
            throw new NullPointerException("Missing Android-context.");
        }
        this.f93934d = context;
        this.f93935e = Collections.singletonList(new b(this, null));
    }
}
