package w30;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000b\fJ\u001b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lw30/i0;", "ResponseBodyType", "Ljava/io/Closeable;", "Ljava/io/InputStream;", "responseStream", "C0", "(Ljava/io/InputStream;)Ljava/lang/Object;", "Lw30/l0;", "getResponse", "()Lw30/l0;", "response", "a", "b", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface i0<ResponseBodyType> extends Closeable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u0018*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lw30/i0$a;", "ResponseBodyType", "Lw30/i0;", "Ljavax/net/ssl/HttpsURLConnection;", "conn", "<init>", "(Ljavax/net/ssl/HttpsURLConnection;)V", "Ljn0/h0;", "close", "()V", "a", "Ljavax/net/ssl/HttpsURLConnection;", "Ljava/io/InputStream;", "o", "()Ljava/io/InputStream;", "responseStream", "", "n", "()I", "responseCode", "Lw30/l0;", "getResponse", "()Lw30/l0;", "response", "b", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a<ResponseBodyType> implements i0<ResponseBodyType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f120620c = StandardCharsets.UTF_8.name();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final HttpsURLConnection conn;

        /* JADX INFO: renamed from: w30.i0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw30/i0$a$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "CHARSET", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String a() {
                return a.f120620c;
            }

            private Companion() {
            }
        }

        public a(HttpsURLConnection conn) {
            p013kotlin.jvm.internal.s.k(conn, "conn");
            this.conn = conn;
        }

        private final InputStream o() {
            int iN = n();
            return (200 > iN || iN >= 300) ? this.conn.getErrorStream() : this.conn.getInputStream();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStreamO = o();
            if (inputStreamO != null) {
                inputStreamO.close();
            }
            this.conn.disconnect();
        }

        @Override // w30.i0
        public /* synthetic */ l0 getResponse() {
            int iN = n();
            ResponseBodyType responsebodytypeC0 = C0(o());
            Map<String, List<String>> headerFields = this.conn.getHeaderFields();
            p013kotlin.jvm.internal.s.j(headerFields, "getHeaderFields(...)");
            return new l0(iN, responsebodytypeC0, headerFields);
        }

        public /* synthetic */ int n() {
            return this.conn.getResponseCode();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw30/i0$b;", "Lw30/i0$a;", "", "Ljavax/net/ssl/HttpsURLConnection;", "conn", "<init>", "(Ljavax/net/ssl/HttpsURLConnection;)V", "Ljava/io/InputStream;", "responseStream", "p", "(Ljava/io/InputStream;)Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpsURLConnection conn) {
            super(conn);
            p013kotlin.jvm.internal.s.k(conn, "conn");
        }

        @Override // w30.i0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public String C0(InputStream responseStream) {
            if (responseStream == null) {
                return null;
            }
            try {
                Scanner scannerUseDelimiter = new Scanner(responseStream, a.INSTANCE.a()).useDelimiter("\\A");
                String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : null;
                sn0.b.a(responseStream, null);
                return next;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(responseStream, th2);
                    throw th3;
                }
            }
        }
    }

    ResponseBodyType C0(InputStream responseStream);

    l0<ResponseBodyType> getResponse();
}
