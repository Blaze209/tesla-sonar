package ji;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0017¨\u0006\u0019"}, d2 = {"Lji/i;", "", "", "statusCode", "", "Lji/d;", "headers", "Lokio/j;", "bodySource", "Lokio/k;", "bodyString", "<init>", "(ILjava/util/List;Lokio/j;Lokio/k;)V", "a", "I", "c", "()I", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lokio/j;", DateTokenConverter.CONVERTER_KEY, "Lokio/k;", "()Lokio/j;", "body", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int statusCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final okio.j bodySource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k bodyString;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001f"}, d2 = {"Lji/i$a;", "", "", "statusCode", "<init>", "(I)V", "Lokio/j;", "bodySource", "b", "(Lokio/j;)Lji/i$a;", "", "Lji/d;", "headers", "a", "(Ljava/util/List;)Lji/i$a;", "Lji/i;", "c", "()Lji/i;", "I", "getStatusCode", "()I", "Lokio/j;", "Lokio/k;", "Lokio/k;", "bodyString", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "", "()Z", "hasBody", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int statusCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private okio.j bodySource;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private k bodyString;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<HttpHeader> headers = new ArrayList();

        public a(int i11) {
            this.statusCode = i11;
        }

        private final boolean d() {
            return (this.bodySource == null && this.bodyString == null) ? false : true;
        }

        public final a a(List<HttpHeader> headers) {
            s.k(headers, "headers");
            this.headers.addAll(headers);
            return this;
        }

        public final a b(okio.j bodySource) {
            s.k(bodySource, "bodySource");
            if (d()) {
                throw new IllegalStateException("body() can only be called once");
            }
            this.bodySource = bodySource;
            return this;
        }

        public final i c() {
            return new i(this.statusCode, this.headers, this.bodySource, this.bodyString, null);
        }
    }

    public /* synthetic */ i(int i11, List list, okio.j jVar, k kVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, list, jVar, kVar);
    }

    public final okio.j a() {
        okio.j jVar = this.bodySource;
        if (jVar != null) {
            return jVar;
        }
        k kVar = this.bodyString;
        if (kVar != null) {
            return new okio.h().A1(kVar);
        }
        return null;
    }

    public final List<HttpHeader> b() {
        return this.headers;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    private i(int i11, List<HttpHeader> list, okio.j jVar, k kVar) {
        this.statusCode = i11;
        this.headers = list;
        this.bodySource = jVar;
        this.bodyString = kVar;
    }
}
