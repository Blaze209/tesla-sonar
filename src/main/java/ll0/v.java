package ll0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.nio.ByteBuffer;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lll0/v;", "Lnl0/g;", "Lml0/a;", "Ljava/nio/ByteBuffer;", "instance", "Lkotlin/Function1;", "Ljn0/h0;", "release", "<init>", "(Ljava/nio/ByteBuffer;Lwn0/l;)V", "p", "()Lml0/a;", "o", "(Lml0/a;)V", "c", "Ljava/nio/ByteBuffer;", "getInstance", "()Ljava/nio/ByteBuffer;", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "getRelease", "()Lwn0/l;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class v extends nl0.g<ml0.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ByteBuffer instance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<ByteBuffer, h0> release;

    /* JADX WARN: Multi-variable type inference failed */
    public v(ByteBuffer instance, wn0.l<? super ByteBuffer, h0> release) {
        p013kotlin.jvm.internal.s.k(instance, "instance");
        p013kotlin.jvm.internal.s.k(release, "release");
        this.instance = instance;
        this.release = release;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nl0.g
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(ml0.a instance) {
        p013kotlin.jvm.internal.s.k(instance, "instance");
        this.release.invoke(this.instance);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nl0.g
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ml0.a n() {
        return g.a(this.instance, this);
    }
}
