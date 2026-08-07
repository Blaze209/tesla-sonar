package ni;

import ii.a0;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import mi.e;
import mi.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0000H\u0016¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lni/a;", "Lmi/g;", "wrappedWriter", "<init>", "(Lmi/g;)V", "", "", "Lii/a0;", "o", "()Ljava/util/Map;", "c", "()Lni/a;", "p", "n", "t", "name", "B", "(Ljava/lang/String;)Lni/a;", "value", "b0", "", "e0", "(Z)Lni/a;", "", "H", "(D)Lni/a;", "", "I", "(I)Lni/a;", "", "J", "(J)Lni/a;", "Lmi/e;", "c0", "(Lmi/e;)Lni/a;", "T", "(Lii/a0;)Lni/a;", "C", "Ljn0/h0;", "close", "()V", "a", "Lmi/g;", "", "b", "Ljava/util/Map;", "uploads", "getPath", "()Ljava/lang/String;", "path", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g wrappedWriter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, a0> uploads;

    public a(g wrappedWriter) {
        s.k(wrappedWriter, "wrappedWriter");
        this.wrappedWriter = wrappedWriter;
        this.uploads = new LinkedHashMap();
    }

    @Override // mi.g
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a N(String name) {
        s.k(name, "name");
        this.wrappedWriter.N(name);
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public a R() {
        this.wrappedWriter.R();
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public a E(double value) {
        this.wrappedWriter.E(value);
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public a S1(int value) {
        this.wrappedWriter.S1(value);
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public a D(long value) {
        this.wrappedWriter.D(value);
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public a v2(a0 value) {
        s.k(value, "value");
        this.uploads.put(this.wrappedWriter.getPath(), value);
        this.wrappedWriter.R();
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public a w(String value) {
        s.k(value, "value");
        this.wrappedWriter.w(value);
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a f() {
        this.wrappedWriter.f();
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public a U1(e value) {
        s.k(value, "value");
        this.wrappedWriter.U1(value);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.wrappedWriter.close();
    }

    @Override // mi.g
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public a K(boolean value) {
        this.wrappedWriter.K(value);
        return this;
    }

    @Override // mi.g
    public String getPath() {
        return this.wrappedWriter.getPath();
    }

    @Override // mi.g
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a h() {
        this.wrappedWriter.h();
        return this;
    }

    public final Map<String, a0> o() {
        return this.uploads;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a e() {
        this.wrappedWriter.e();
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public a j() {
        this.wrappedWriter.j();
        return this;
    }
}
