package xo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"Lxo0/s;", "Lxo0/n;", "Lxo0/w;", "writer", "Lwo0/b;", "json", "<init>", "(Lxo0/w;Lwo0/b;)V", "Ljn0/h0;", "b", "()V", "q", "c", DateTokenConverter.CONVERTER_KEY, "p", "Lwo0/b;", "", "I", "level", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wo0.b json;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int level;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w writer, wo0.b json) {
        super(writer);
        p013kotlin.jvm.internal.s.k(writer, "writer");
        p013kotlin.jvm.internal.s.k(json, "json");
        this.json = json;
    }

    @Override // xo0.n
    public void b() {
        o(true);
        this.level++;
    }

    @Override // xo0.n
    public void c() {
        o(false);
        k("\n");
        int i11 = this.level;
        for (int i12 = 0; i12 < i11; i12++) {
            k(this.json.getConfiguration().getPrettyPrintIndent());
        }
    }

    @Override // xo0.n
    public void d() {
        if (getWritingFirst()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // xo0.n
    public void p() {
        f(' ');
    }

    @Override // xo0.n
    public void q() {
        this.level--;
    }
}
