package la;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.List;
import p011ja.b0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import ro0.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\nB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d¨\u0006 "}, d2 = {"Lla/a;", "T", "", "Lro0/d;", "serializer", "<init>", "(Lro0/d;)V", "", "path", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "", "index", "Lja/b0;", "type", "Lla/a$a;", "e", "(ILja/b0;)Lla/a$a;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "", "c", "(ILjava/lang/String;Lja/b0;Ljava/util/List;)V", "Lro0/d;", "Ljava/lang/String;", "pathArgs", "queryArgs", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d<T> serializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String pathArgs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String queryArgs;

    /* JADX INFO: renamed from: la.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lla/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "PATH", "QUERY", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum EnumC1893a {
        PATH,
        QUERY
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89732a;

        static {
            int[] iArr = new int[EnumC1893a.values().length];
            try {
                iArr[EnumC1893a.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1893a.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f89732a = iArr;
        }
    }

    public a(d<T> serializer) {
        s.k(serializer, "serializer");
        this.pathArgs = "";
        this.queryArgs = "";
        this.serializer = serializer;
        this.path = serializer.getDescriptor().getSerialName();
    }

    private final void a(String path) {
        this.pathArgs += '/' + path;
    }

    private final void b(String name, String value) {
        this.queryArgs += (this.queryArgs.length() == 0 ? CallerData.NA : "&") + name + '=' + value;
    }

    private final EnumC1893a e(int index, b0<Object> type) {
        return ((type instanceof p011ja.c) || this.serializer.getDescriptor().i(index)) ? EnumC1893a.QUERY : EnumC1893a.PATH;
    }

    public final void c(int index, String name, b0<Object> type, List<String> value) {
        s.k(name, "name");
        s.k(type, "type");
        s.k(value, "value");
        int i11 = b.f89732a[e(index, type).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                b(name, (String) it.next());
            }
            return;
        }
        if (value.size() == 1) {
            a((String) v.o0(value));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
    }

    public final String d() {
        return this.path + this.pathArgs + this.queryArgs;
    }
}
