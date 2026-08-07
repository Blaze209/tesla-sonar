package ip0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jn0.x;
import okio.c0;
import okio.i0;
import okio.p0;
import okio.r0;
import org.slf4j.Logger;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001=B#\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u0010*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010(J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020+2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020+2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R-\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00110\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lip0/k;", "Lokio/o;", "Ljava/lang/ClassLoader;", "classLoader", "", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLokio/o;)V", "Lokio/i0;", "path", "w0", "(Lokio/i0;)Lokio/i0;", "", "K0", "(Lokio/i0;)Ljava/lang/String;", "", "Lkotlin/Pair;", "D0", "(Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/net/URL;", "G0", "(Ljava/net/URL;)Lkotlin/Pair;", "H0", "dir", "T", "(Lokio/i0;)Ljava/util/List;", Action.FILE_ATTRIBUTE, "Lokio/m;", "e0", "(Lokio/i0;)Lokio/m;", "Lokio/n;", "c0", "(Lokio/i0;)Lokio/n;", "Lokio/r0;", "r0", "(Lokio/i0;)Lokio/r0;", "mustCreate", "Lokio/p0;", "n0", "(Lokio/i0;Z)Lokio/p0;", "mustExist", "n", "Ljn0/h0;", "B", "(Lokio/i0;Z)V", "source", "target", "o", "(Lokio/i0;Lokio/i0;)V", "I", "e", "Ljava/lang/ClassLoader;", "f", "Lokio/o;", "g", "Lkotlin/Lazy;", "y0", "()Ljava/util/List;", "roots", "h", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends okio.o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f81716h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final i0 f81717i = i0.Companion.e(i0.INSTANCE, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ClassLoader classLoader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final okio.o systemFileSystem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy roots;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lip0/k$a;", "", "<init>", "()V", "Lokio/i0;", "path", "", "c", "(Lokio/i0;)Z", "base", DateTokenConverter.CONVERTER_KEY, "(Lokio/i0;Lokio/i0;)Lokio/i0;", Logger.ROOT_LOGGER_NAME, "Lokio/i0;", "b", "()Lokio/i0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(i0 path) {
            return !t.K(path.e(), ".class", true);
        }

        public final i0 b() {
            return k.f81717i;
        }

        public final i0 d(i0 i0Var, i0 base) {
            s.k(i0Var, "<this>");
            s.k(base, "base");
            return b().i(t.U(t.T0(i0Var.toString(), base.toString()), CoreConstants.ESCAPE_CHAR, '/', false, 4, null));
        }

        private a() {
        }
    }

    public /* synthetic */ k(ClassLoader classLoader, boolean z11, okio.o oVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z11, (i11 & 4) != 0 ? okio.o.f97987b : oVar);
    }

    private final List<Pair<okio.o, i0>> D0(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        s.j(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        s.j(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            s.h(url);
            Pair<okio.o, i0> pairG0 = G0(url);
            if (pairG0 != null) {
                arrayList.add(pairG0);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        s.j(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        s.j(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            s.h(url2);
            Pair<okio.o, i0> pairH0 = H0(url2);
            if (pairH0 != null) {
                arrayList2.add(pairH0);
            }
        }
        return v.P0(arrayList, arrayList2);
    }

    private final Pair<okio.o, i0> G0(URL url) {
        if (s.f(url.getProtocol(), Action.FILE_ATTRIBUTE)) {
            return x.a(this.systemFileSystem, i0.Companion.d(i0.INSTANCE, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final Pair<okio.o, i0> H0(URL url) {
        int iC0;
        String string = url.toString();
        s.j(string, "toString(...)");
        if (!t.b0(string, "jar:file:", false, 2, null) || (iC0 = t.C0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        i0.Companion companion = i0.INSTANCE;
        String strSubstring = string.substring(4, iC0);
        s.j(strSubstring, "substring(...)");
        return x.a(q.i(i0.Companion.d(companion, new File(URI.create(strSubstring)), false, 1, null), this.systemFileSystem, new wn0.l() { // from class: ip0.j
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k.J0((l) obj));
            }
        }), f81717i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J0(l entry) {
        s.k(entry, "entry");
        return f81716h.c(entry.getCanonicalPath());
    }

    private final String K0(i0 i0Var) {
        return w0(i0Var).h(f81717i).toString();
    }

    private final i0 w0(i0 path) {
        return f81717i.j(path, true);
    }

    private final List<Pair<okio.o, i0>> y0() {
        return (List) this.roots.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List z0(k kVar) {
        return kVar.D0(kVar.classLoader);
    }

    @Override // okio.o
    public void B(i0 dir, boolean mustCreate) throws IOException {
        s.k(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.o
    public void I(i0 path, boolean mustExist) throws IOException {
        s.k(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.o
    public List<i0> T(i0 dir) throws FileNotFoundException {
        s.k(dir, "dir");
        String strK0 = K0(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z11 = false;
        for (Pair<okio.o, i0> pair : y0()) {
            okio.o oVarA = pair.a();
            i0 i0VarB = pair.b();
            try {
                List<i0> listT = oVarA.T(i0VarB.i(strK0));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listT) {
                    if (f81716h.c((i0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f81716h.d((i0) it.next(), i0VarB));
                }
                v.E(linkedHashSet, arrayList2);
                z11 = true;
            } catch (IOException unused) {
            }
        }
        if (z11) {
            return v.m1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // okio.o
    public okio.n c0(i0 path) {
        s.k(path, "path");
        if (!f81716h.c(path)) {
            return null;
        }
        String strK0 = K0(path);
        for (Pair<okio.o, i0> pair : y0()) {
            okio.n nVarC0 = pair.a().c0(pair.b().i(strK0));
            if (nVarC0 != null) {
                return nVarC0;
            }
        }
        return null;
    }

    @Override // okio.o
    public okio.m e0(i0 file) throws FileNotFoundException {
        s.k(file, "file");
        if (!f81716h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strK0 = K0(file);
        for (Pair<okio.o, i0> pair : y0()) {
            try {
                return pair.a().e0(pair.b().i(strK0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.o
    public p0 n(i0 file, boolean mustExist) throws IOException {
        s.k(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.o
    public p0 n0(i0 file, boolean mustCreate) throws IOException {
        s.k(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.o
    public void o(i0 source, i0 target) throws IOException {
        s.k(source, "source");
        s.k(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.o
    public r0 r0(i0 file) throws IOException {
        s.k(file, "file");
        if (!f81716h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        i0 i0Var = f81717i;
        URL resource = this.classLoader.getResource(i0.k(i0Var, file, false, 2, null).h(i0Var).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        s.j(inputStream, "getInputStream(...)");
        return c0.m(inputStream);
    }

    public k(ClassLoader classLoader, boolean z11, okio.o systemFileSystem) {
        s.k(classLoader, "classLoader");
        s.k(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots = jn0.m.b(new wn0.a() { // from class: ip0.i
            @Override // wn0.a
            public final Object invoke() {
                return k.z0(this.f81715a);
            }
        });
        if (z11) {
            y0().size();
        }
    }
}
