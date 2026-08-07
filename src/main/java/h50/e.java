package h50;

import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f70892a;

    e(d dVar) {
        this.f70892a = dVar;
    }

    public static i<c.b> b(d dVar) {
        return qj0.f.a(new e(dVar));
    }

    @Override // h50.c.b
    public c a(NoticeSheetState noticeSheetState) {
        return this.f70892a.b(noticeSheetState);
    }
}
