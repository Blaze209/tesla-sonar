package zj0;

import ezvcard.VCard;
import java.io.InputStream;
import java.io.Reader;
import yj0.c;
import zj0.b;

/* JADX INFO: loaded from: classes8.dex */
public class b<T extends b<?>> extends a<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f128402h;

    public b(InputStream inputStream) {
        super(inputStream);
        this.f128402h = true;
    }

    private bk0.a d() {
        String str = this.f128395a;
        if (str != null) {
            return new bk0.a(str);
        }
        InputStream inputStream = this.f128396b;
        if (inputStream != null) {
            return new bk0.a(inputStream);
        }
        Reader reader = this.f128397c;
        return reader != null ? new bk0.a(reader) : new bk0.a(this.f128398d);
    }

    @Override // zj0.a
    c b() {
        bk0.a aVarD = d();
        aVarD.J0(this.f128402h);
        return aVarD;
    }

    @Override // zj0.a
    public /* bridge */ /* synthetic */ VCard c() {
        return super.c();
    }
}
