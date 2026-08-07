package mq0;

import java.util.Stack;

/* JADX INFO: loaded from: classes9.dex */
class c implements jq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f92442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f92443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object[] f92444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    jq0.a.InterfaceC1785a f92445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Stack<Object> f92446e = null;

    static class a implements jq0.a.InterfaceC1785a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f92447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        jq0.b f92448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        kq0.b f92449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f92450d;

        public a(int i11, String str, jq0.b bVar, kq0.b bVar2) {
            this.f92447a = str;
            this.f92448b = bVar;
            this.f92449c = bVar2;
            this.f92450d = i11;
        }

        public String a() {
            return this.f92447a;
        }

        public jq0.b b() {
            return this.f92448b;
        }

        String c(h hVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(hVar.d(a()));
            stringBuffer.append("(");
            stringBuffer.append(((f) b()).k(hVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override // jq0.a.InterfaceC1785a
        public final String toString() {
            return c(h.f92467k);
        }
    }

    public c(jq0.a.InterfaceC1785a interfaceC1785a, Object obj, Object obj2, Object[] objArr) {
        this.f92445d = interfaceC1785a;
        this.f92442a = obj;
        this.f92443b = obj2;
        this.f92444c = objArr;
    }

    @Override // jq0.a
    public Object getTarget() {
        return this.f92443b;
    }

    public final String toString() {
        return this.f92445d.toString();
    }
}
