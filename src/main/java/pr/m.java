package pr;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import hr.y;
import java.util.ArrayList;
import java.util.List;
import ou.u;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f103871d = u.e(CoreConstants.COLON_CHAR);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u f103872e = u.e('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f103873a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f103874b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f103875c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f103877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f103878c;

        public a(int i11, long j11, int i12) {
            this.f103876a = i11;
            this.f103877b = j11;
            this.f103878c = i12;
        }
    }

    private void a(hr.l lVar, y yVar) {
        d0 d0Var = new d0(8);
        lVar.readFully(d0Var.e(), 0, 8);
        this.f103875c = d0Var.u() + 8;
        if (d0Var.q() != 1397048916) {
            yVar.f73403a = 0L;
        } else {
            yVar.f73403a = lVar.getPosition() - ((long) (this.f103875c - 12));
            this.f103874b = 2;
        }
    }

    private static int b(String str) throws ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return NearbyMessagesStatusCodes.BLUETOOTH_OFF;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.a("Invalid SEF name", null);
        }
    }

    private void d(hr.l lVar, y yVar) {
        long length = lVar.getLength();
        int i11 = this.f103875c - 20;
        d0 d0Var = new d0(i11);
        lVar.readFully(d0Var.e(), 0, i11);
        for (int i12 = 0; i12 < i11 / 12; i12++) {
            d0Var.V(2);
            short sW = d0Var.w();
            if (sW == 2192 || sW == 2816 || sW == 2817 || sW == 2819 || sW == 2820) {
                this.f103873a.add(new a(sW, (length - ((long) this.f103875c)) - ((long) d0Var.u()), d0Var.u()));
            } else {
                d0Var.V(8);
            }
        }
        if (this.f103873a.isEmpty()) {
            yVar.f73403a = 0L;
        } else {
            this.f103874b = 3;
            yVar.f73403a = this.f103873a.get(0).f103877b;
        }
    }

    private void e(hr.l lVar, List<ur.a.b> list) throws ParserException {
        long position = lVar.getPosition();
        int length = (int) ((lVar.getLength() - lVar.getPosition()) - ((long) this.f103875c));
        d0 d0Var = new d0(length);
        lVar.readFully(d0Var.e(), 0, length);
        for (int i11 = 0; i11 < this.f103873a.size(); i11++) {
            a aVar = this.f103873a.get(i11);
            d0Var.U((int) (aVar.f103877b - position));
            d0Var.V(4);
            int iU = d0Var.u();
            int iB = b(d0Var.E(iU));
            int i12 = aVar.f103878c - (iU + 8);
            if (iB == 2192) {
                list.add(f(d0Var, i12));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static as.c f(d0 d0Var, int i11) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listG = f103872e.g(d0Var.E(i11));
        for (int i12 = 0; i12 < listG.size(); i12++) {
            List<String> listG2 = f103871d.g(listG.get(i12));
            if (listG2.size() != 3) {
                throw ParserException.a(null, null);
            }
            try {
                arrayList.add(new as.c.b(Long.parseLong(listG2.get(0)), Long.parseLong(listG2.get(1)), 1 << (Integer.parseInt(listG2.get(2)) - 1)));
            } catch (NumberFormatException e11) {
                throw ParserException.a(null, e11);
            }
        }
        return new as.c(arrayList);
    }

    public int c(hr.l lVar, y yVar, List<ur.a.b> list) throws ParserException {
        int i11 = this.f103874b;
        long j11 = 0;
        if (i11 == 0) {
            long length = lVar.getLength();
            if (length != -1 && length >= 8) {
                j11 = length - 8;
            }
            yVar.f73403a = j11;
            this.f103874b = 1;
        } else if (i11 == 1) {
            a(lVar, yVar);
        } else if (i11 == 2) {
            d(lVar, yVar);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            e(lVar, list);
            yVar.f73403a = 0L;
        }
        return 1;
    }

    public void g() {
        this.f103873a.clear();
        this.f103874b = 0;
    }
}
