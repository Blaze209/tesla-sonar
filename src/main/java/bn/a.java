package bn;

import android.os.Trace;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbn/a;", "Lbn/b$c;", "<init>", "()V", "", "name", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "b", "", "isTracing", "()Z", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b.c {
    @Override // bn.b.c
    public void a(String name) {
        s.k(name, "name");
        if (isTracing()) {
            Trace.beginSection(name);
        }
    }

    @Override // bn.b.c
    public void b() {
        if (isTracing()) {
            Trace.endSection();
        }
    }

    @Override // bn.b.c
    public boolean isTracing() {
        return false;
    }
}
