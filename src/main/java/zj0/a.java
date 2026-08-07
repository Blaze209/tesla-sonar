package zj0;

import ak0.s0;
import ezvcard.VCard;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
import yj0.c;
import zj0.a;

/* JADX INFO: loaded from: classes8.dex */
abstract class a<T extends a<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f128395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InputStream f128396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Reader f128397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final File f128398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    s0 f128399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    List<List<yj0.b>> f128400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final T f128401g;

    a(InputStream inputStream) {
        this(null, inputStream, null, null);
    }

    private boolean a() {
        return this.f128396b == null && this.f128397c == null;
    }

    abstract c b();

    public VCard c() throws IOException {
        c cVarB = b();
        s0 s0Var = this.f128399e;
        if (s0Var != null) {
            cVarB.t(s0Var);
        }
        try {
            VCard vCardP = cVarB.p();
            List<List<yj0.b>> list = this.f128400f;
            if (list != null) {
                list.add(cVarB.o());
            }
            return vCardP;
        } finally {
            if (a()) {
                cVarB.close();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(String str, InputStream inputStream, Reader reader, File file) {
        this.f128401g = this;
        this.f128395a = str;
        this.f128396b = inputStream;
        this.f128397c = reader;
        this.f128398d = file;
    }
}
