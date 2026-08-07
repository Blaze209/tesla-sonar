package w7;

import v7.j;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f121091a = new b() { // from class: w7.a
        @Override // w7.b
        public final String a(j jVar) {
            return b.b(jVar);
        }
    };

    static /* synthetic */ String b(j jVar) {
        String str = jVar.f118109i;
        return str != null ? str : jVar.f118101a.toString();
    }

    String a(j jVar);
}
