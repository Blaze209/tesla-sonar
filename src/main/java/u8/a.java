package u8;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t7.i.e f115850a;

    private boolean a(t7.i.d dVar, boolean z11) {
        t7.i.e eVar;
        t7.i.b bVarB;
        int i11 = dVar.f112793a;
        if (i11 == 2 || i11 == 15) {
            return true;
        }
        if (i11 != 3 || z11) {
            return ((i11 != 6 && i11 != 3) || (eVar = this.f115850a) == null || (bVarB = t7.i.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    private void e(List<t7.i.d> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).f112793a == 1) {
                this.f115850a = t7.i.e.a(list.get(i11));
            }
        }
    }

    public void b(ByteBuffer byteBuffer) {
        e(t7.i.e(byteBuffer));
    }

    public void c() {
        this.f115850a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z11) {
        List<t7.i.d> listE = t7.i.e(byteBuffer);
        e(listE);
        int size = listE.size() - 1;
        int i11 = 0;
        while (size >= 0 && a(listE.get(size), z11)) {
            if (listE.get(size).f112793a == 6 || listE.get(size).f112793a == 3) {
                i11++;
            }
            size--;
        }
        if (i11 > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? listE.get(size).f112794b.limit() : byteBuffer.position();
    }
}
