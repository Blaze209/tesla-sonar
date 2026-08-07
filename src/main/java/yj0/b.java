package yj0;

import ezvcard.io.CannotParseException;

/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f125628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f125629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f125630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f125631d;

    /* JADX INFO: renamed from: yj0.b$b, reason: collision with other inner class name */
    public static class C2731b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f125632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f125633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f125634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f125635d;

        public C2731b(yj0.a aVar) {
            b(aVar.b());
            e(aVar.c());
        }

        public b a() {
            return new b(this.f125632a, this.f125634c, this.f125633b, this.f125635d);
        }

        public C2731b b(Integer num) {
            this.f125632a = num;
            return this;
        }

        public C2731b c(int i11, Object... objArr) {
            this.f125633b = Integer.valueOf(i11);
            this.f125635d = xj0.b.INSTANCE.getParseMessage(i11, objArr);
            return this;
        }

        public C2731b d(CannotParseException cannotParseException) {
            return c(cannotParseException.b().intValue(), cannotParseException.a());
        }

        public C2731b e(String str) {
            this.f125634c = str;
            return this;
        }
    }

    public String toString() {
        int i11;
        String str = this.f125631d;
        if (this.f125628a != null) {
            str = "(" + this.f125628a + ") " + str;
        }
        Integer num = this.f125629b;
        if (num == null && this.f125630c == null) {
            return str;
        }
        if (num != null || this.f125630c == null) {
            i11 = (num == null || this.f125630c != null) ? 36 : 37;
        } else {
            i11 = 35;
        }
        return xj0.b.INSTANCE.getParseMessage(i11, num, this.f125630c, str);
    }

    private b(Integer num, String str, Integer num2, String str2) {
        this.f125629b = num;
        this.f125630c = str;
        this.f125628a = num2;
        this.f125631d = str2;
    }
}
