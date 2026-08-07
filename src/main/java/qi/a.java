package qi;

import java.text.SimpleDateFormat;
import java.util.Locale;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001b\u0010\u0007\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "a", "()J", "Ljava/text/SimpleDateFormat;", "Lkotlin/Lazy;", "getSimpleDateFormat", "()Ljava/text/SimpleDateFormat;", "simpleDateFormat", "apollo-mpp-utils"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f105584a = m.b(C2239a.f105585c);

    /* JADX INFO: renamed from: qi.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "b", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 5, 1})
    static final class C2239a extends u implements wn0.a<SimpleDateFormat> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2239a f105585c = new C2239a();

        C2239a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("HH:mm:ss.SSS", Locale.ROOT);
        }
    }

    public static final long a() {
        return System.currentTimeMillis();
    }
}
