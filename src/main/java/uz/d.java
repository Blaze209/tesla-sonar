package uz;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import sz.i;
import wz.f;

/* JADX INFO: loaded from: classes6.dex */
class d extends c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f116813z;

    public d(int i11) {
        super(i11);
    }

    @Override // uz.b
    protected void f() {
        int i11 = this.f116797g + 1;
        this.f116797g = i11;
        if (i11 >= this.f116812y) {
            this.f116791a = (char) 26;
        } else {
            this.f116791a = this.f116813z.charAt(i11);
        }
    }

    @Override // uz.b
    protected void k() throws ParseException {
        int i11 = this.f116797g + 1;
        this.f116797g = i11;
        if (i11 < this.f116812y) {
            this.f116791a = this.f116813z.charAt(i11);
        } else {
            this.f116791a = (char) 26;
            throw new ParseException(this.f116797g - 1, 3, "EOF");
        }
    }

    @Override // uz.b
    protected void n() {
        int i11 = this.f116797g + 1;
        this.f116797g = i11;
        if (i11 >= this.f116812y) {
            this.f116791a = (char) 26;
        } else {
            this.f116791a = this.f116813z.charAt(i11);
        }
    }

    @Override // uz.c
    protected void u(int i11, int i12) {
        this.f116796f = this.f116813z.substring(i11, i12);
    }

    @Override // uz.c
    protected void v(int i11, int i12) {
        while (i11 < i12 - 1 && Character.isWhitespace(this.f116813z.charAt(i11))) {
            i11++;
        }
        while (true) {
            int i13 = i12 - 1;
            if (i13 <= i11 || !Character.isWhitespace(this.f116813z.charAt(i13))) {
                break;
            } else {
                i12--;
            }
        }
        u(i11, i12);
    }

    @Override // uz.c
    protected int w(char c11, int i11) {
        return this.f116813z.indexOf(c11, i11);
    }

    public Object x(String str) {
        return y(str, i.f111947c.f122443b);
    }

    public <T> T y(String str, f<T> fVar) {
        this.f116792b = fVar.f122446a;
        this.f116813z = str;
        this.f116812y = str.length();
        return (T) d(fVar);
    }
}
