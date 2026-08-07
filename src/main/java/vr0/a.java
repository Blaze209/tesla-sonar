package vr0;

import android.os.Build;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jn0.e;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lvr0/a;", "", "<init>", "()V", "a", "b", "c", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ArrayList<c> f119765b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c[] f119766c = new c[0];

    /* JADX INFO: renamed from: vr0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00060\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lvr0/a$a;", "Lvr0/a$c;", "<init>", "()V", "Ljava/lang/StackTraceElement;", "element", "", "n", "(Ljava/lang/StackTraceElement;)Ljava/lang/String;", "", "priority", "tag", "message", "", "t", "Ljn0/h0;", "j", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "kotlin.jvm.PlatformType", "b", "Ljava/util/List;", "fqcnIgnore", "f", "()Ljava/lang/String;", "c", "a", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class C2564a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f119768d = Pattern.compile("(\\$\\d+)+$");

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> fqcnIgnore = v.p(a.class.getName(), Companion.class.getName(), c.class.getName(), C2564a.class.getName());

        @Override // vr0.a.c
        public String f() {
            String strF = super.f();
            if (strF != null) {
                return strF;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            s.j(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                    return n(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // vr0.a.c
        protected void j(int priority, String tag, String message, Throwable t11) {
            int iMin;
            s.k(message, "message");
            if (message.length() < 4000) {
                if (priority == 7) {
                    Log.wtf(tag, message);
                    return;
                } else {
                    Log.println(priority, tag, message);
                    return;
                }
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                String str = message;
                int iU0 = t.u0(str, '\n', i11, false, 4, null);
                if (iU0 == -1) {
                    iU0 = length;
                }
                while (true) {
                    iMin = Math.min(iU0, i11 + 4000);
                    String strSubstring = str.substring(i11, iMin);
                    s.j(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (priority == 7) {
                        Log.wtf(tag, strSubstring);
                    } else {
                        Log.println(priority, tag, strSubstring);
                    }
                    if (iMin >= iU0) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
                message = str;
            }
        }

        protected String n(StackTraceElement element) {
            s.k(element, "element");
            String className = element.getClassName();
            s.j(className, "element.className");
            String strU1 = t.u1(className, CoreConstants.DOT, null, 2, null);
            Matcher matcher = f119768d.matcher(strU1);
            if (matcher.find()) {
                strU1 = matcher.replaceAll("");
                s.j(strU1, "m.replaceAll(\"\")");
            }
            if (strU1.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                return strU1;
            }
            String strSubstring = strU1.substring(0, 23);
            s.j(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }
    }

    /* JADX INFO: renamed from: vr0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\f\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\f\u0010\u000bJ3\u0010\r\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000bJ=\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0012\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0012\u0010\u000bJ3\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lvr0/a$b;", "Lvr0/a$c;", "<init>", "()V", "", "message", "", "", "args", "Ljn0/h0;", "g", "(Ljava/lang/String;[Ljava/lang/Object;)V", "l", "a", "", "t", "b", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "m", "", "priority", "tag", "j", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "o", "(Ljava/lang/String;)Lvr0/a$c;", "tree", "n", "(Lvr0/a$c;)V", "treeArray", "[Lvr0/a$c;", "Ljava/util/ArrayList;", "trees", "Ljava/util/ArrayList;", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion extends c {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // vr0.a.c
        public void a(String message, Object... args) {
            s.k(args, "args");
            for (c cVar : a.f119766c) {
                cVar.a(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // vr0.a.c
        public void b(Throwable t11, String message, Object... args) {
            s.k(args, "args");
            for (c cVar : a.f119766c) {
                cVar.b(t11, message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // vr0.a.c
        public void g(String message, Object... args) {
            s.k(args, "args");
            for (c cVar : a.f119766c) {
                cVar.g(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // vr0.a.c
        protected void j(int priority, String tag, String message, Throwable t11) {
            s.k(message, "message");
            throw new AssertionError();
        }

        @Override // vr0.a.c
        public void l(String message, Object... args) {
            s.k(args, "args");
            for (c cVar : a.f119766c) {
                cVar.l(message, Arrays.copyOf(args, args.length));
            }
        }

        @Override // vr0.a.c
        public void m(String message, Object... args) {
            s.k(args, "args");
            for (c cVar : a.f119766c) {
                cVar.m(message, Arrays.copyOf(args, args.length));
            }
        }

        public final void n(c tree) {
            s.k(tree, "tree");
            if (!(tree != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            synchronized (a.f119765b) {
                a.f119765b.add(tree);
                Object[] array = a.f119765b.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                a.f119766c = (c[]) array;
                h0 h0Var = h0.f84049a;
            }
        }

        public final c o(String tag) {
            s.k(tag, "tag");
            c[] cVarArr = a.f119766c;
            int length = cVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                c cVar = cVarArr[i11];
                i11++;
                cVar.getExplicitTag().set(tag);
            }
            return this;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0011\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0013\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J1\u0010\u0014\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J;\u0010\u0015\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\nH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H$¢\u0006\u0004\b \u0010!R \u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\"8@X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lvr0/a$c;", "", "<init>", "()V", "", "priority", "", "t", "", "message", "", "args", "Ljn0/h0;", "k", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "(Ljava/lang/Throwable;)Ljava/lang/String;", "g", "(Ljava/lang/String;[Ljava/lang/Object;)V", "l", "a", "b", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "m", "", "h", "(I)Z", "tag", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;I)Z", "c", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "j", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/ThreadLocal;", "explicitTag", "f", "()Ljava/lang/String;", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        private final String e(Throwable t11) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            t11.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            s.j(string, "sw.toString()");
            return string;
        }

        private final void k(int priority, Throwable t11, String message, Object... args) {
            String strF = f();
            if (i(strF, priority)) {
                if (message != null && message.length() != 0) {
                    if (!(args.length == 0)) {
                        message = c(message, args);
                    }
                    if (t11 != null) {
                        message = ((Object) message) + '\n' + e(t11);
                    }
                } else if (t11 == null) {
                    return;
                } else {
                    message = e(t11);
                }
                j(priority, strF, message, t11);
            }
        }

        public void a(String message, Object... args) {
            s.k(args, "args");
            k(6, null, message, Arrays.copyOf(args, args.length));
        }

        public void b(Throwable t11, String message, Object... args) {
            s.k(args, "args");
            k(6, t11, message, Arrays.copyOf(args, args.length));
        }

        protected String c(String message, Object[] args) {
            s.k(message, "message");
            s.k(args, "args");
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            s.j(str, "java.lang.String.format(this, *args)");
            return str;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final /* synthetic */ ThreadLocal getExplicitTag() {
            return this.explicitTag;
        }

        public /* synthetic */ String f() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void g(String message, Object... args) {
            s.k(args, "args");
            k(4, null, message, Arrays.copyOf(args, args.length));
        }

        @e
        protected boolean h(int priority) {
            return true;
        }

        protected boolean i(String tag, int priority) {
            return h(priority);
        }

        protected abstract void j(int priority, String tag, String message, Throwable t11);

        public void l(String message, Object... args) {
            s.k(args, "args");
            k(5, null, message, Arrays.copyOf(args, args.length));
        }

        public void m(String message, Object... args) {
            s.k(args, "args");
            k(7, null, message, Arrays.copyOf(args, args.length));
        }
    }

    private a() {
        throw new AssertionError();
    }
}
