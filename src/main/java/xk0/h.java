package xk0;

import ll0.o;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\b\u000bB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lxk0/h;", "", "", "headers", "", "size", "<init>", "([BLjava/lang/Long;)V", "a", "[B", "()[B", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Lxk0/h$a;", "Lxk0/h$b;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] headers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Long size;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lxk0/h$a;", "Lxk0/h;", "", "headers", "Lkotlin/Function0;", "Lio/ktor/utils/io/g;", "provider", "", "size", "<init>", "([BLwn0/a;Ljava/lang/Long;)V", "c", "Lwn0/a;", "()Lwn0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<io.ktor.utils.io.g> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(byte[] headers, wn0.a<? extends io.ktor.utils.io.g> provider, Long l11) {
            super(headers, l11, null);
            s.k(headers, "headers");
            s.k(provider, "provider");
            this.provider = provider;
        }

        public final wn0.a<io.ktor.utils.io.g> c() {
            return this.provider;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lxk0/h$b;", "Lxk0/h;", "", "headers", "Lkotlin/Function0;", "Lll0/o;", "provider", "", "size", "<init>", "([BLwn0/a;Ljava/lang/Long;)V", "c", "Lwn0/a;", "()Lwn0/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<o> provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(byte[] headers, wn0.a<? extends o> provider, Long l11) {
            super(headers, l11, null);
            s.k(headers, "headers");
            s.k(provider, "provider");
            this.provider = provider;
        }

        public final wn0.a<o> c() {
            return this.provider;
        }
    }

    public /* synthetic */ h(byte[] bArr, Long l11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, l11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    private h(byte[] bArr, Long l11) {
        this.headers = bArr;
        this.size = l11;
    }
}
