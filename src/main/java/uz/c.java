package uz;

import com.nimbusds.jose.shaded.json.parser.ParseException;

/* JADX INFO: loaded from: classes6.dex */
abstract class c extends b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected int f116812y;

    public c(int i11) {
        super(i11);
    }

    @Override // uz.b
    protected void j(boolean[] zArr) {
        int i11 = this.f116797g;
        s(zArr);
        v(i11, this.f116797g);
    }

    @Override // uz.b
    protected Object l(boolean[] zArr) throws ParseException {
        int i11 = this.f116797g;
        f();
        r();
        char c11 = this.f116791a;
        if (c11 != '.' && c11 != 'E' && c11 != 'e') {
            t();
            char c12 = this.f116791a;
            if (c12 < 0 || c12 >= '~' || zArr[c12] || c12 == 26) {
                v(i11, this.f116797g);
                return e(this.f116796f);
            }
            s(zArr);
            v(i11, this.f116797g);
            if (this.f116800j) {
                return this.f116796f;
            }
            throw new ParseException(this.f116797g, 1, this.f116796f);
        }
        if (c11 == '.') {
            f();
            r();
        }
        char c13 = this.f116791a;
        if (c13 != 'E' && c13 != 'e') {
            t();
            char c14 = this.f116791a;
            if (c14 < 0 || c14 >= '~' || zArr[c14] || c14 == 26) {
                v(i11, this.f116797g);
                return c();
            }
            s(zArr);
            v(i11, this.f116797g);
            if (this.f116800j) {
                return this.f116796f;
            }
            throw new ParseException(this.f116797g, 1, this.f116796f);
        }
        this.f116794d.a('E');
        f();
        char c15 = this.f116791a;
        if (c15 != '+' && c15 != '-' && (c15 < '0' || c15 > '9')) {
            s(zArr);
            v(i11, this.f116797g);
            if (!this.f116800j) {
                throw new ParseException(this.f116797g, 1, this.f116796f);
            }
            if (!this.f116798h) {
                b();
            }
            return this.f116796f;
        }
        this.f116794d.a(c15);
        f();
        r();
        t();
        char c16 = this.f116791a;
        if (c16 < 0 || c16 >= '~' || zArr[c16] || c16 == 26) {
            v(i11, this.f116797g);
            return c();
        }
        s(zArr);
        v(i11, this.f116797g);
        if (this.f116800j) {
            return this.f116796f;
        }
        throw new ParseException(this.f116797g, 1, this.f116796f);
    }

    @Override // uz.b
    protected void o() throws ParseException {
        if (!this.f116801k && this.f116791a == '\'') {
            if (!this.f116800j) {
                throw new ParseException(this.f116797g, 0, Character.valueOf(this.f116791a));
            }
            j(b.f116786t);
            return;
        }
        int iW = w(this.f116791a, this.f116797g + 1);
        if (iW == -1) {
            throw new ParseException(this.f116812y, 3, null);
        }
        u(this.f116797g + 1, iW);
        if (this.f116796f.indexOf(92) != -1) {
            this.f116794d.b();
            p();
        } else {
            a();
            this.f116797g = iW;
            f();
        }
    }

    protected abstract void u(int i11, int i12);

    protected abstract void v(int i11, int i12);

    protected abstract int w(char c11, int i11);
}
