package z6;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: loaded from: classes.dex */
class f extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f127024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f127025c;

    f(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f127024b = context;
        this.f127025c = uri;
    }

    @Override // z6.a
    public boolean a() {
        return e.a(this.f127024b, this.f127025c);
    }

    @Override // z6.a
    public boolean b() {
        return e.b(this.f127024b, this.f127025c);
    }

    @Override // z6.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // z6.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // z6.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f127024b.getContentResolver(), this.f127025c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // z6.a
    public boolean f() {
        return e.d(this.f127024b, this.f127025c);
    }

    @Override // z6.a
    public String i() {
        return e.e(this.f127024b, this.f127025c);
    }

    @Override // z6.a
    public Uri j() {
        return this.f127025c;
    }

    @Override // z6.a
    public boolean k() {
        return e.g(this.f127024b, this.f127025c);
    }

    @Override // z6.a
    public boolean l() {
        return e.h(this.f127024b, this.f127025c);
    }

    @Override // z6.a
    public a[] m() {
        throw new UnsupportedOperationException();
    }
}
