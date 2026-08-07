package ep;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.systrace.TraceListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010 \u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001eH\u0007¢\u0006\u0004\b'\u0010(J/\u0010*\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\nH\u0007¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001eH\u0007¢\u0006\u0004\b,\u0010(J/\u0010.\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\nH\u0007¢\u0006\u0004\b.\u0010+J'\u00101\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u001eH\u0007¢\u0006\u0004\b1\u0010(J'\u00102\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001eH\u0007¢\u0006\u0004\b2\u0010(J'\u00103\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001eH\u0007¢\u0006\u0004\b3\u0010(¨\u00064"}, d2 = {"Lep/a;", "", "<init>", "()V", "Lcom/facebook/systrace/TraceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "k", "(Lcom/facebook/systrace/TraceListener;)V", "p", "", "tag", "", "j", "(J)Z", "", "title", "Lep/a$a;", "scope", "n", "(JLjava/lang/String;Lep/a$a;)V", "sectionName", "Ljava/lang/Runnable;", "block", "o", "(JLjava/lang/String;Ljava/lang/Runnable;)V", "c", "(JLjava/lang/String;)V", "", "args", "", "argsLength", DateTokenConverter.CONVERTER_KEY, "(JLjava/lang/String;[Ljava/lang/String;I)V", "e", "([Ljava/lang/String;I)Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "(J)V", "cookie", "a", "(JLjava/lang/String;I)V", "startNanos", "b", "(JLjava/lang/String;IJ)V", "g", "endNanos", "h", "counterName", "counterValue", "m", "l", "f", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f63111a = new a();

    /* JADX INFO: renamed from: ep.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lep/a$a;", "", "", "code", "<init>", "(Ljava/lang/String;IC)V", "C", "getCode", "()C", "THREAD", "PROCESS", "GLOBAL", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum EnumC1295a {
        THREAD('t'),
        PROCESS('p'),
        GLOBAL('g');

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final char code;

        EnumC1295a(char c11) {
            this.code = c11;
        }

        public static EnumEntries<EnumC1295a> getEntries() {
            return $ENTRIES;
        }

        public final char getCode() {
            return this.code;
        }
    }

    private a() {
    }

    public static final void a(long tag, String sectionName, int cookie) {
        s.k(sectionName, "sectionName");
        eb.a.a(sectionName, cookie);
    }

    public static final void b(long tag, String sectionName, int cookie, long startNanos) {
        s.k(sectionName, "sectionName");
        a(tag, sectionName, cookie);
    }

    public static final void c(long tag, String sectionName) {
        s.k(sectionName, "sectionName");
        eb.a.c(sectionName);
    }

    public static final void d(long tag, String sectionName, String[] args, int argsLength) {
        s.k(sectionName, "sectionName");
        s.k(args, "args");
        eb.a.c(sectionName + "|" + f63111a.e(args, argsLength));
    }

    private final String e(String[] args, int argsLength) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 < argsLength; i11 += 2) {
            String str = args[i11 - 1];
            String str2 = args[i11];
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
            if (i11 < argsLength - 1) {
                sb2.append(';');
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public static final void f(long tag, String sectionName, int cookie) {
        s.k(sectionName, "sectionName");
        g(tag, sectionName, cookie);
    }

    public static final void g(long tag, String sectionName, int cookie) {
        s.k(sectionName, "sectionName");
        eb.a.d(sectionName, cookie);
    }

    public static final void h(long tag, String sectionName, int cookie, long endNanos) {
        s.k(sectionName, "sectionName");
        g(tag, sectionName, cookie);
    }

    public static final void i(long tag) {
        eb.a.f();
    }

    public static final boolean j(long tag) {
        return false;
    }

    public static final void l(long tag, String sectionName, int cookie) {
        s.k(sectionName, "sectionName");
        a(tag, sectionName, cookie);
    }

    public static final void m(long tag, String counterName, int counterValue) {
        s.k(counterName, "counterName");
        eb.a.j(counterName, counterValue);
    }

    public static final void o(long tag, String sectionName, Runnable block) {
        s.k(sectionName, "sectionName");
        s.k(block, "block");
        c(tag, sectionName);
        try {
            block.run();
        } finally {
            i(tag);
        }
    }

    public static final void k(TraceListener listener) {
    }

    public static final void p(TraceListener listener) {
    }

    public static final void n(long tag, String title, EnumC1295a scope) {
    }
}
