package h20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.HashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ7\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ/\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n \u0019*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR.\u0010!\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b\u001d\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lh20/g;", "", "<init>", "()V", "Ls20/c;", "newLevel", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ls20/c;)V", "", "tag", "msg", "", "args", "h", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "b", "a", "j", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "e", "(Ljava/lang/String;)Ljava/lang/String;", "g", "()Ljava/lang/String;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "c", "I", "level", "Ls20/d;", "delegate", "Ls20/d;", "()Ls20/d;", "f", "(Ls20/d;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static int level;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f70421a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String TAG = g.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static s20.d delegate = new d();

    private g() {
    }

    public static final void a(String tag, String msg, Object... args) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        s.k(args, "args");
        if (level >= 2) {
            g gVar = f70421a;
            String strE = gVar.e(tag);
            String strD = gVar.d(msg, Arrays.copyOf(args, args.length));
            s20.d dVar = delegate;
            if (dVar != null) {
                dVar.b(strE, strD);
            }
        }
    }

    public static final void b(String tag, String msg, Object... args) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        s.k(args, "args");
        if (level >= 1) {
            g gVar = f70421a;
            String strE = gVar.e(tag);
            String strD = gVar.d(msg, Arrays.copyOf(args, args.length));
            s20.d dVar = delegate;
            if (dVar != null) {
                dVar.c(strE, strD);
            }
        }
    }

    private final String d(String msg, Object... args) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g());
        sb2.append('|');
        t0 t0Var = t0.f86535a;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(msg, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        s.j(str, "format(format, *args)");
        sb2.append(str);
        return sb2.toString();
    }

    private final String e(String tag) {
        return "SnowplowTracker->" + tag;
    }

    private final String g() {
        String name = Thread.currentThread().getName();
        s.j(name, "currentThread().name");
        return name;
    }

    public static final void h(String tag, String msg, Object... args) {
        Throwable th2;
        s.k(tag, "tag");
        s.k(msg, "msg");
        s.k(args, "args");
        b(tag, msg, Arrays.copyOf(args, args.length));
        try {
            int length = args.length;
            int i11 = 0;
            while (true) {
                th2 = null;
                if (i11 >= length) {
                    break;
                }
                Object obj = args[i11];
                if (Throwable.class.isInstance(obj)) {
                    if (!(obj instanceof Throwable)) {
                        break;
                    }
                    th2 = (Throwable) obj;
                    break;
                }
                i11++;
            }
            o20.m mVar = new o20.m(tag, f70421a.d(msg, Arrays.copyOf(args, args.length)), th2);
            HashMap map = new HashMap();
            map.put("event", mVar);
            i20.b.b("SnowplowTrackerDiagnostic", map);
        } catch (Exception e11) {
            String TAG2 = TAG;
            s.j(TAG2, "TAG");
            j(TAG2, "Error logger can't report the error: " + e11, new Object[0]);
        }
    }

    public static final void i(s20.c newLevel) {
        s.k(newLevel, "newLevel");
        level = newLevel.getLevel();
    }

    public static final void j(String tag, String msg, Object... args) {
        s.k(tag, "tag");
        s.k(msg, "msg");
        s.k(args, "args");
        if (level >= 3) {
            g gVar = f70421a;
            String strE = gVar.e(tag);
            String strD = gVar.d(msg, Arrays.copyOf(args, args.length));
            s20.d dVar = delegate;
            if (dVar != null) {
                dVar.a(strE, strD);
            }
        }
    }

    public final s20.d c() {
        return delegate;
    }

    public final void f(s20.d dVar) {
        if (dVar == null) {
            dVar = new d();
        }
        delegate = dVar;
    }
}
